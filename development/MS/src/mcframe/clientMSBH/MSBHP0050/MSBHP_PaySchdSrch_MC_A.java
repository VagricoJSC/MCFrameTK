package mcframe.clientMSBH.MSBHP0050;

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
import mcframe.clientMSBH.MSBHP0050.MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Srch01Caller;
import mcframe.clientMSBH.MSBHP0050.MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Srch02Caller;
import mcframe.clientMSBH.MSBHP0050.MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Prnt01Caller;

/**
 * 画面"MSBHP_PaySchdSrch"パネルクラスです。<p>
 *
 * 未消込の支払予定管理金を明細単位の一覧形式で照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_PaySchdSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0050";

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
	// [DispUnit]ブロック関連のField定義
	public MCPanel DispUnitPanel = null;
	public MCTitledBorder DispUnitTitledBorder = null;
	// [DispUnit]ブロックの項目のField定義
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
	// [AprvSts]ブロック関連のField定義
	public MCPanel AprvStsPanel = null;
	public MCTitledBorder AprvStsTitledBorder = null;
	// [AprvSts]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Bsppl]ブロック関連のField定義
	public MCPanel BspplPanel = null;
	// [Bsppl]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Psppl]ブロック関連のField定義
	public MCPanel PspplPanel = null;
	// [Psppl]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * PRNT,Issue report;REF,View; PRNT,帳票発行;REF,参照する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * DTL,Details,0;HDR,Header,1 DTL,明細,0;HDR,ヘッダ,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_mode_Group = null;
	public MCRadioButton Cnd_mode_DTL = null;
	public MCRadioButton Cnd_mode_HDR = null;
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_acpt_flg = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCCheckBox Cnd_rjct_flg = null;
	/**
	 * Denied 否認.<p>
	 *
	 */
	public MCCheckBox Cnd_last_rjct_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_excld_flg = null;
	public MCLabel Cnd_pay_schd_act_dt_fr_Label = null;
	/**
	 * Scheduled/Actual payment date FROM 支払予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_act_dt_fr = null;
	public MCLabel Cnd_pay_schd_act_dt_to_Label = null;
	/**
	 * Scheduled/Actual payment date TO 支払予定日／実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_act_dt_to = null;
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
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	public MCLabel Cnd_pay_chk_no_Label = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_chk_no = null;
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
	public MCLabel Cnd_pay_schd_print_rmrks_Label = null;
	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public MCTextField Cnd_pay_schd_print_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
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
	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public MCCheckBox Cnd_dtl_flg = null;
	/**
	 * Include paid 支払済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_appl_flg = null;
	/**
	 * Include fee 手数料含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_com_paid_flg = null;
	public MCLabel Cnd_rfrnc_dt_Label = null;
	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public MCDateField Cnd_rfrnc_dt = null;
	/**
	 * Dept. in charge of scheduled payee 支払予定管理先担当部門.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_dpt_cd_flg = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_dpt_nm_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_cd_flg = null;
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_cd_flg = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_typ_flg = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_schd_dt_flg = null;
	/**
	 * AP settlement method 債務決済方法.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_sttl_cd_flg = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_sttl_typ_flg = null;
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_cl_ym_flg = null;
	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_cl_day_flg = null;
	/**
	 * Transaction currency 取引通貨.<p>
	 *
	 */
	public MCCheckBox Cnd_trd_cur_cd_flg = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_chk_no_flg = null;
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_schd_no_flg = null;
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_wrk_no_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCCheckBox Cnd_psppl_cd_flg = null;
	/**
	 * Payment dept. 支払部門.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_dpt_cd_flg = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_dpt_nm_flg = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCCheckBox Cnd_asppl_cd_flg = null;
	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_sts_typ_flg = null;
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_dpt_cd_flg = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_dpt_nm_flg = null;
	/**
	 * Payee account 支払先口座.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_bank_ac_cd_flg = null;
	/**
	 * Bank account 口座.<p>
	 *
	 */
	public MCCheckBox Cnd_bank_ac_cd_flg = null;
	/**
	 * Offset info. 相殺情報.<p>
	 *
	 */
	public MCCheckBox Cnd_setoff_info_flg = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCCheckBox Cnd_xrate_flg = null;
	/**
	 * Fee tax 手数料税.<p>
	 *
	 */
	public MCCheckBox Cnd_com_paid_tax_cd_flg = null;
	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_rcv_bill_no_flg = null;
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_adv_pay_act_no_flg = null;
	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public MCCheckBox Cnd_note_info_flg = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCCheckBox Cnd_rmrks_flg = null;
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
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox LPnl_key_flg = null;
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
	public MCTable2<mcframe.clientMSBH.MSBHP0050.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt = null;
	/**
	 * Scheduled/Actual payment date 支払予定日／実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_act_dt = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_pay_schd_amt_p_PPanel;
	public MCColumnConfig columnRslt_pay_schd_amt;// [Rslt]の[pay_schd_amt_p.amt]を[columnRslt_pay_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_pay_act_amt_p_PPanel;
	public MCColumnConfig columnRslt_pay_act_amt;// [Rslt]の[pay_act_amt_p.amt]を[columnRslt_pay_act_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_not_appl_bal_p_PPanel;
	public MCColumnConfig columnRslt_not_appl_bal;// [Rslt]の[not_appl_bal_p.amt]を[columnRslt_not_appl_bal]としてエイリアス定義。
	/**
	 * Delay 遅延.<p>
	 *
	 */
	public MCColumnConfig columnRslt_delay = null;
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_ym = null;
	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_day = null;
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
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_xrate = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_no = null;
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_no = null;
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
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_nm = null;
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
	 * Transferred 振替済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_flg = null;
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
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_tax_cd = null;
	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_tax_nm = null;
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_tax_rate = null;
	/**
	 * Fee tax amount 手数料税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_com_paid_tax_amt = null;
	/**
	 * Fee amount without tax 手数料税抜額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_exc_com_paid = null;
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
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_dt = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_due_dt = null;
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_days = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_drawer_nm = null;
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
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_ntc_d_print_rmrks = null;
	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_print_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
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
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_no = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_sts_typ_nm = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_flg = null;
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
	 * Payment schedule entry 支払予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0030 = null;
	/**
	 * Payment result entry 支払実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0090 = null;
	/**
	 * Incomplete AP details list 未消込買掛明細一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0010 = null;
	/**
	 * Payment schedule table 支払予定表.<p>
	 *
	 */
	public MCButton Btn_prnt_paySchdLst = null;
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
	/** [SRCH_REF_HDR]モードを表す定数 */
	public static final String SRCH_REF_HDR = "SRCH_REF_HDR";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";
	/** [SRCH_REF_DTL]モードを表す定数 */
	public static final String SRCH_REF_DTL = "SRCH_REF_DTL";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_REF_HDR, REF_HDR, SRCH_REF_DTL, REF_DTL, SRCH_PRNT, PRNT};
	
	/** [MS_MSBHL0050_Srch01]のCallerの作成 */
	protected MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Srch01Caller createMS_MSBHL0050_Srch01() {
		MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Srch01Caller<MSBHP_PaySchdSrch, MS_MSBHL0050_Srch01Bridge>
		caller = ((MSBHP_PaySchdSrch_MC)this).new MS_MSBHL0050_Srch01Caller<MSBHP_PaySchdSrch, MS_MSBHL0050_Srch01Bridge>(
					(MSBHP_PaySchdSrch)this, new MS_MSBHL0050_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0050_Srch01]の呼び出し */
	protected void callMS_MSBHL0050_Srch01() {
		MCCaller caller = createMS_MSBHL0050_Srch01();
		caller.exec();
	}
	/** [MS_MSBHL0050_Srch02]のCallerの作成 */
	protected MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Srch02Caller createMS_MSBHL0050_Srch02() {
		MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Srch02Caller<MSBHP_PaySchdSrch, MS_MSBHL0050_Srch02Bridge>
		caller = ((MSBHP_PaySchdSrch_MC)this).new MS_MSBHL0050_Srch02Caller<MSBHP_PaySchdSrch, MS_MSBHL0050_Srch02Bridge>(
					(MSBHP_PaySchdSrch)this, new MS_MSBHL0050_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBHL0050_Srch02]の呼び出し */
	protected void callMS_MSBHL0050_Srch02() {
		MCCaller caller = createMS_MSBHL0050_Srch02();
		caller.exec();
	}
	/** [MS_MSBHL0050_Prnt01]のCallerの作成 */
	protected MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Prnt01Caller createMS_MSBHL0050_Prnt01() {
		MSBHP_PaySchdSrch_MC.MS_MSBHL0050_Prnt01Caller<MSBHP_PaySchdSrch, MS_MSBHL0050_Prnt01Bridge>
		caller = ((MSBHP_PaySchdSrch_MC)this).new MS_MSBHL0050_Prnt01Caller<MSBHP_PaySchdSrch, MS_MSBHL0050_Prnt01Bridge>(
					(MSBHP_PaySchdSrch)this, new MS_MSBHL0050_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBHL0050_Prnt01]の呼び出し */
	protected void callMS_MSBHL0050_Prnt01() {
		MCCaller caller = createMS_MSBHL0050_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0050.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0050.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0050.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0050.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0050.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0050.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0050.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMSBH.MSBHP0050.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBH.MSBHP0050.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBH.MSBHP0050.LPnlR createLPnlR() {
		return mcframe.clientMSBH.MSBHP0050.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0050.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0050.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0050.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0050.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0050.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0050.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(ScreenOpePanel);
		ret.add(DispUnitPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(AprvStsPanel);
		ret.add(Tab2Panel);
		ret.add(BspplPanel);
		ret.add(Tab3Panel);
		ret.add(PspplPanel);
		ret.add(Tab4Panel);
		ret.add(Cnd2Panel);
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
	public MSBHP_PaySchdSrch_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_PaySchdSrch_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_PaySchdSrch_MC.jbCreateScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateDispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateTop((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateFold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateTab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateAprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateTab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateBsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateTab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreatePsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateTab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateCnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateCnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateLPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateCtrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateRPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateRslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbCreateBtn((MSBHP_PaySchdSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [AprvSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvSts(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Bsppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBsppl(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Psppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePsppl(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_PaySchdSrch p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_PaySchdSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBHP_PaySchdSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_PaySchdSrch p) {
		p.Rslt_pay_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0050.RsltR.$pay_schd_amt_p);
		p.Rslt_pay_schd_amt_p_PPanel.setName("Rslt.pay_schd_amt_p");
		p.columnRslt_pay_schd_amt = p.Rslt_pay_schd_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_pay_schd_amt.addAliasName("Rslt.pay_schd_amt", p);
		p.Rslt_pay_act_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0050.RsltR.$pay_act_amt_p);
		p.Rslt_pay_act_amt_p_PPanel.setName("Rslt.pay_act_amt_p");
		p.columnRslt_pay_act_amt = p.Rslt_pay_act_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_pay_act_amt.addAliasName("Rslt.pay_act_amt", p);
		p.Rslt_not_appl_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0050.RsltR.$not_appl_bal_p);
		p.Rslt_not_appl_bal_p_PPanel.setName("Rslt.not_appl_bal_p");
		p.columnRslt_not_appl_bal = p.Rslt_not_appl_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_not_appl_bal.addAliasName("Rslt.not_appl_bal", p);
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0050.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0050.RsltR.$bsppl_grp_p);
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
		p.Rslt_psppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0050.RsltR.$psppl_grp_p);
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
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBHP_PaySchdSrch p) {
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PaySchdSrch create(){
		MSBHP_PaySchdSrch p = new MSBHP_PaySchdSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PaySchdSrch create(String name){
		MSBHP_PaySchdSrch p = new MSBHP_PaySchdSrch(name);
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
		MSBHP_PaySchdSrch_MC.jbfInitScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitDispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitTop((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitFold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitTab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitAprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitTab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitBsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitTab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitPsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitTab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitCnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitCnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitLPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitCtrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitRPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitRslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbfInitBtn((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitDispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitTop((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitFold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitTab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitAprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitTab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitBsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitTab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitPsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitTab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitCnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitCnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitLPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitCtrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitRPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitRslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.jbInitBtn((MSBHP_PaySchdSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_PaySchdSrch p) {
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
	protected static void jbfInitTab1(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvSts(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.AprvStsPanel = p.beansFactory.createPanel("AprvSts");
		p.AprvStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBsppl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.BspplPanel = p.beansFactory.createPanel("Bsppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPsppl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.PspplPanel = p.beansFactory.createPanel("Psppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_mode_Group = p.beansFactory.createButtonGroup("Cnd.mode");
		p.Cnd_mode_DTL = p.beansFactory.createRadioButton("Cnd.mode_DTL");
		p.Cnd_mode_HDR = p.beansFactory.createRadioButton("Cnd.mode_HDR");
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_acpt_flg = p.beansFactory.createCheckBox("Cnd.acpt_flg");
		p.Cnd_rjct_flg = p.beansFactory.createCheckBox("Cnd.rjct_flg");
		p.Cnd_last_rjct_flg = p.beansFactory.createCheckBox("Cnd.last_rjct_flg");
		p.Cnd_excld_flg = p.beansFactory.createCheckBox("Cnd.excld_flg");
		p.Cnd_pay_schd_act_dt_fr_Label = p.beansFactory.createLabel("Cnd.pay_schd_act_dt_fr_Label");
		p.Cnd_pay_schd_act_dt_fr = p.beansFactory.createDateField("Cnd.pay_schd_act_dt_fr");
		p.Cnd_pay_schd_act_dt_fr.setLabel(p.Cnd_pay_schd_act_dt_fr_Label);
		p.Cnd_pay_schd_act_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_schd_act_dt_to_Label");
		p.Cnd_pay_schd_act_dt_to = p.beansFactory.createDateField("Cnd.pay_schd_act_dt_to");
		p.Cnd_pay_schd_act_dt_to.setLabel(p.Cnd_pay_schd_act_dt_to_Label);
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_pay_chk_no_Label = p.beansFactory.createLabel("Cnd.pay_chk_no_Label");
		p.Cnd_pay_chk_no = p.beansFactory.createTextField("Cnd.pay_chk_no");
		p.Cnd_pay_chk_no.setLabel(p.Cnd_pay_chk_no_Label);
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_mng_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_mng_no_Label");
		p.Cnd_rcpt_iv_mng_no = p.beansFactory.createTextField("Cnd.rcpt_iv_mng_no");
		p.Cnd_rcpt_iv_mng_no.setLabel(p.Cnd_rcpt_iv_mng_no_Label);
		p.Cnd_purc_act_no_Label = p.beansFactory.createLabel("Cnd.purc_act_no_Label");
		p.Cnd_purc_act_no = p.beansFactory.createTextField("Cnd.purc_act_no");
		p.Cnd_purc_act_no.setLabel(p.Cnd_purc_act_no_Label);
		p.Cnd_ap_typ_Label = p.beansFactory.createLabel("Cnd.ap_typ_Label");
		p.Cnd_ap_typ = p.beansFactory.createTextComboBox("Cnd.ap_typ");
		p.Cnd_ap_typ.setLabel(p.Cnd_ap_typ_Label);
		p.Cnd_ap_typ_nm = p.beansFactory.createTextField("Cnd.ap_typ_nm");
		p.Cnd_psppl_cd_Label = p.beansFactory.createLabel("Cnd.psppl_cd_Label");
		p.Cnd_psppl_cd = p.beansFactory.createTextField("Cnd.psppl_cd");
		p.Cnd_psppl_cd.setLabel(p.Cnd_psppl_cd_Label);
		p.Cnd_psppl_nm = p.beansFactory.createTextField("Cnd.psppl_nm");
		p.Cnd_pay_schd_print_rmrks_Label = p.beansFactory.createLabel("Cnd.pay_schd_print_rmrks_Label");
		p.Cnd_pay_schd_print_rmrks = p.beansFactory.createTextField("Cnd.pay_schd_print_rmrks");
		p.Cnd_pay_schd_print_rmrks.setLabel(p.Cnd_pay_schd_print_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_dtl_flg = p.beansFactory.createCheckBox("Cnd.dtl_flg");
		p.Cnd_inc_appl_flg = p.beansFactory.createCheckBox("Cnd.inc_appl_flg");
		p.Cnd_inc_com_paid_flg = p.beansFactory.createCheckBox("Cnd.inc_com_paid_flg");
		p.Cnd_rfrnc_dt_Label = p.beansFactory.createLabel("Cnd.rfrnc_dt_Label");
		p.Cnd_rfrnc_dt = p.beansFactory.createDateField("Cnd.rfrnc_dt");
		p.Cnd_rfrnc_dt.setLabel(p.Cnd_rfrnc_dt_Label);
		p.Cnd_bsppl_dpt_cd_flg = p.beansFactory.createCheckBox("Cnd.bsppl_dpt_cd_flg");
		p.Cnd_bsppl_dpt_nm_flg = p.beansFactory.createCheckBox("Cnd.bsppl_dpt_nm_flg");
		p.Cnd_wg_cd_flg = p.beansFactory.createCheckBox("Cnd.wg_cd_flg");
		p.Cnd_bsppl_cd_flg = p.beansFactory.createCheckBox("Cnd.bsppl_cd_flg");
		p.Cnd_ap_typ_flg = p.beansFactory.createCheckBox("Cnd.ap_typ_flg");
		p.Cnd_pay_schd_dt_flg = p.beansFactory.createCheckBox("Cnd.pay_schd_dt_flg");
		p.Cnd_ap_sttl_cd_flg = p.beansFactory.createCheckBox("Cnd.ap_sttl_cd_flg");
		p.Cnd_ap_sttl_typ_flg = p.beansFactory.createCheckBox("Cnd.ap_sttl_typ_flg");
		p.Cnd_bsppl_cl_ym_flg = p.beansFactory.createCheckBox("Cnd.bsppl_cl_ym_flg");
		p.Cnd_bsppl_cl_day_flg = p.beansFactory.createCheckBox("Cnd.bsppl_cl_day_flg");
		p.Cnd_trd_cur_cd_flg = p.beansFactory.createCheckBox("Cnd.trd_cur_cd_flg");
		p.Cnd_pay_chk_no_flg = p.beansFactory.createCheckBox("Cnd.pay_chk_no_flg");
		p.Cnd_pay_schd_no_flg = p.beansFactory.createCheckBox("Cnd.pay_schd_no_flg");
		p.Cnd_rcpt_iv_no_flg = p.beansFactory.createCheckBox("Cnd.rcpt_iv_no_flg");
		p.Cnd_rcpt_iv_mng_no_flg = p.beansFactory.createCheckBox("Cnd.rcpt_iv_mng_no_flg");
		p.Cnd_purc_act_no_flg = p.beansFactory.createCheckBox("Cnd.purc_act_no_flg");
		p.Cnd_wrk_no_flg = p.beansFactory.createCheckBox("Cnd.wrk_no_flg");
		p.Cnd_psppl_cd_flg = p.beansFactory.createCheckBox("Cnd.psppl_cd_flg");
		p.Cnd_pay_dpt_cd_flg = p.beansFactory.createCheckBox("Cnd.pay_dpt_cd_flg");
		p.Cnd_pay_dpt_nm_flg = p.beansFactory.createCheckBox("Cnd.pay_dpt_nm_flg");
		p.Cnd_asppl_cd_flg = p.beansFactory.createCheckBox("Cnd.asppl_cd_flg");
		p.Cnd_pay_sts_typ_flg = p.beansFactory.createCheckBox("Cnd.pay_sts_typ_flg");
		p.Cnd_ap_dpt_cd_flg = p.beansFactory.createCheckBox("Cnd.ap_dpt_cd_flg");
		p.Cnd_ap_dpt_nm_flg = p.beansFactory.createCheckBox("Cnd.ap_dpt_nm_flg");
		p.Cnd_pay_bank_ac_cd_flg = p.beansFactory.createCheckBox("Cnd.pay_bank_ac_cd_flg");
		p.Cnd_bank_ac_cd_flg = p.beansFactory.createCheckBox("Cnd.bank_ac_cd_flg");
		p.Cnd_setoff_info_flg = p.beansFactory.createCheckBox("Cnd.setoff_info_flg");
		p.Cnd_xrate_flg = p.beansFactory.createCheckBox("Cnd.xrate_flg");
		p.Cnd_com_paid_tax_cd_flg = p.beansFactory.createCheckBox("Cnd.com_paid_tax_cd_flg");
		p.Cnd_rcv_bill_no_flg = p.beansFactory.createCheckBox("Cnd.rcv_bill_no_flg");
		p.Cnd_adv_pay_act_no_flg = p.beansFactory.createCheckBox("Cnd.adv_pay_act_no_flg");
		p.Cnd_note_info_flg = p.beansFactory.createCheckBox("Cnd.note_info_flg");
		p.Cnd_rmrks_flg = p.beansFactory.createCheckBox("Cnd.rmrks_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_key_flg = p.beansFactory.createCheckBox("LPnl.key_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_typ = p.beansFactory.createTableColumn("Rslt.ap_typ", MCColumnType.TEXT);
		p.columnRslt_ap_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_typ_nm", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt = p.beansFactory.createTableColumn("Rslt.pay_schd_dt", MCColumnType.DATE);
		p.columnRslt_pay_schd_act_dt = p.beansFactory.createTableColumn("Rslt.pay_schd_act_dt", MCColumnType.DATE);
		p.columnRslt_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_delay = p.beansFactory.createTableColumn("Rslt.delay", MCColumnType.TEXT);
		p.columnRslt_bsppl_cl_ym = p.beansFactory.createTableColumn("Rslt.bsppl_cl_ym", MCColumnType.DATE);
		p.columnRslt_bsppl_cl_day = p.beansFactory.createTableColumn("Rslt.bsppl_cl_day", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_pay_xrate = p.beansFactory.createTableColumn("Rslt.pay_xrate", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_pay_chk_no = p.beansFactory.createTableColumn("Rslt.pay_chk_no", MCColumnType.TEXT);
		p.columnRslt_pay_schd_no = p.beansFactory.createTableColumn("Rslt.pay_schd_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_purc_act_no = p.beansFactory.createTableColumn("Rslt.purc_act_no", MCColumnType.TEXT);
		p.columnRslt_psppl_cd = p.beansFactory.createTableColumn("Rslt.psppl_cd", MCColumnType.TEXT);
		p.columnRslt_psppl_nm = p.beansFactory.createTableColumn("Rslt.psppl_nm", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_cd = p.beansFactory.createTableColumn("Rslt.pay_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_nm = p.beansFactory.createTableColumn("Rslt.pay_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_pay_sts_typ = p.beansFactory.createTableColumn("Rslt.pay_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pay_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pay_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sw_flg = p.beansFactory.createTableColumn("Rslt.sw_flg", MCColumnType.CHECK);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_ap_setoff_typ = p.beansFactory.createTableColumn("Rslt.ap_setoff_typ", MCColumnType.TEXT);
		p.columnRslt_ap_setoff_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_setoff_typ_nm", MCColumnType.TEXT);
		p.columnRslt_setoff_cd = p.beansFactory.createTableColumn("Rslt.setoff_cd", MCColumnType.TEXT);
		p.columnRslt_setoff_nm = p.beansFactory.createTableColumn("Rslt.setoff_nm", MCColumnType.TEXT);
		p.columnRslt_so_dpt_cd = p.beansFactory.createTableColumn("Rslt.so_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_so_dpt_nm = p.beansFactory.createTableColumn("Rslt.so_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_com_paid_tax_cd = p.beansFactory.createTableColumn("Rslt.com_paid_tax_cd", MCColumnType.TEXT);
		p.columnRslt_com_paid_tax_nm = p.beansFactory.createTableColumn("Rslt.com_paid_tax_nm", MCColumnType.TEXT);
		p.columnRslt_com_paid_tax_rate = p.beansFactory.createTableColumn("Rslt.com_paid_tax_rate", MCColumnType.NUMBER);
		p.columnRslt_com_paid_tax_amt = p.beansFactory.createTableColumn("Rslt.com_paid_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_exc_com_paid = p.beansFactory.createTableColumn("Rslt.exc_com_paid", MCColumnType.NUMBER);
		p.columnRslt_rcv_bill_no = p.beansFactory.createTableColumn("Rslt.rcv_bill_no", MCColumnType.TEXT);
		p.columnRslt_adv_pay_act_no = p.beansFactory.createTableColumn("Rslt.adv_pay_act_no", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_note_typ = p.beansFactory.createTableColumn("Rslt.note_typ", MCColumnType.TEXT);
		p.columnRslt_note_typ_nm = p.beansFactory.createTableColumn("Rslt.note_typ_nm", MCColumnType.TEXT);
		p.columnRslt_note_rsn_cd = p.beansFactory.createTableColumn("Rslt.note_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_note_rsn_nm = p.beansFactory.createTableColumn("Rslt.note_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_draw_dt = p.beansFactory.createTableColumn("Rslt.draw_dt", MCColumnType.DATE);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_note_days = p.beansFactory.createTableColumn("Rslt.note_days", MCColumnType.NUMBER);
		p.columnRslt_drawer_nm = p.beansFactory.createTableColumn("Rslt.drawer_nm", MCColumnType.TEXT);
		p.columnRslt_draw_bank_cd = p.beansFactory.createTableColumn("Rslt.draw_bank_cd", MCColumnType.TEXT);
		p.columnRslt_draw_bank_nm = p.beansFactory.createTableColumn("Rslt.draw_bank_nm", MCColumnType.TEXT);
		p.columnRslt_draw_branch_cd = p.beansFactory.createTableColumn("Rslt.draw_branch_cd", MCColumnType.TEXT);
		p.columnRslt_draw_branch_nm = p.beansFactory.createTableColumn("Rslt.draw_branch_nm", MCColumnType.TEXT);
		p.columnRslt_endrsr = p.beansFactory.createTableColumn("Rslt.endrsr", MCColumnType.TEXT);
		p.columnRslt_accptr = p.beansFactory.createTableColumn("Rslt.accptr", MCColumnType.TEXT);
		p.columnRslt_pay_ntc_d_print_rmrks = p.beansFactory.createTableColumn("Rslt.pay_ntc_d_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_pay_schd_print_rmrks = p.beansFactory.createTableColumn("Rslt.pay_schd_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_aprv_no = p.beansFactory.createTableColumn("Rslt.aprv_no", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_flg = p.beansFactory.createTableColumn("Rslt.aprv_flg", MCColumnType.CHECK);
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
	protected static void jbfInitBtn(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0030 = p.beansFactory.createButton("Btn.open_MSBHP0030", "open");
		p.Btn_open_MSBHP0090 = p.beansFactory.createButton("Btn.open_MSBHP0090", "open");
		p.Btn_open_MSBHP0010 = p.beansFactory.createButton("Btn.open_MSBHP0010", "open");
		p.Btn_prnt_paySchdLst = p.beansFactory.createButton("Btn.prnt_paySchdLst", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.DispUnitPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.TopPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBHP_PaySchdSrch p) {
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
	protected static void jbInitFold(MSBHP_PaySchdSrch p) {
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
	protected static void jbInitTab1(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.AprvStsPanel, null);
		p.Tab1Panel.setLastBeans(p.AprvStsPanel);
		p.AprvStsPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [AprvSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvSts(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.AprvStsPanel.setBorder(p.AprvStsTitledBorder);
		p.AprvStsPanel.setValueCheck(false);
		p.AprvStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AprvStsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.BspplPanel, null);
		p.Tab2Panel.setLastBeans(p.BspplPanel);
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBsppl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.BspplPanel.setValueCheck(false);
		p.BspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.PspplPanel, null);
		p.Tab3Panel.setLastBeans(p.PspplPanel);
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPsppl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.PspplPanel.setValueCheck(false);
		p.PspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.Cnd2Panel, null);
		p.Tab4Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_mode_Group);
		p.Cnd_mode_Group.setFirstBeans(p.Cnd_mode_DTL);
		p.Cnd_mode_DTL.setActionCommand("0");
		p.Cnd_mode_Group.add(p.Cnd_mode_DTL);
		p.DispUnitPanel.add(p.Cnd_mode_DTL);
		p.Cnd_mode_DTL.setNextBeans(p.Cnd_mode_HDR);
		p.Cnd_mode_HDR.setActionCommand("1");
		p.Cnd_mode_Group.add(p.Cnd_mode_HDR);
		p.DispUnitPanel.add(p.Cnd_mode_HDR);
		p.Cnd_mode_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.mode_META);
		p.AprvStsPanel.add(p.Cnd_opn_flg);
		p.AprvStsPanel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.opn_flg_META);
		p.AprvStsPanel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_acpt_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.fix_flg_META);
		p.AprvStsPanel.add(p.Cnd_acpt_flg);
		p.Cnd_acpt_flg.setNextBeans(p.Cnd_rjct_flg);
		p.Cnd_acpt_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.acpt_flg_META);
		p.AprvStsPanel.add(p.Cnd_rjct_flg);
		p.Cnd_rjct_flg.setNextBeans(p.Cnd_last_rjct_flg);
		p.Cnd_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rjct_flg_META);
		p.AprvStsPanel.add(p.Cnd_last_rjct_flg);
		p.Cnd_last_rjct_flg.setNextBeans(p.Cnd_excld_flg);
		p.Cnd_last_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.last_rjct_flg_META);
		p.AprvStsPanel.add(p.Cnd_excld_flg);
		p.Cnd_excld_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.excld_flg_META);
		p.CndPanel.add(p.Cnd_pay_schd_act_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pay_schd_act_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_pay_schd_act_dt_fr);
		p.Cnd_pay_schd_act_dt_fr.setNextBeans(p.Cnd_pay_schd_act_dt_to);
		p.Cnd_pay_schd_act_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_schd_act_dt_fr_META);
		p.Cnd_pay_schd_act_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_schd_act_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_schd_act_dt_to);
		p.Cnd_pay_schd_act_dt_to.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_pay_schd_act_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_schd_act_dt_to_META);
		p.Cnd_pay_schd_act_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_pay_chk_no);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_pay_chk_no_Label);
		p.CndPanel.add(p.Cnd_pay_chk_no);
		p.Cnd_pay_chk_no.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_pay_chk_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_chk_no_META);
		p.setPluralValueEnable(p.Cnd_pay_chk_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rcpt_iv_mng_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_mng_no, true);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_ap_typ);
		p.Cnd_ap_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_typ, true);
		p.Cnd_ap_typ.setLinkBeans(p.Cnd_ap_typ_nm);
		p.CndPanel.add(p.Cnd_ap_typ_Label);
		p.CndPanel.add(p.Cnd_ap_typ);
		p.Cnd_ap_typ.setNextBeans(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_typ_META);
		p.CndPanel.add(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ_nm.setNextBeans(p.Cnd_psppl_cd);
		p.Cnd_ap_typ_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_typ_nm_META);
		p.CndPanel.add(p.Cnd_psppl_cd_Label);
		p.CndPanel.add(p.Cnd_psppl_cd);
		p.Cnd_psppl_cd.setNextBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.psppl_cd_META);
		p.Cnd_psppl_cd.addLinkBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_psppl_cd, true);
		p.CndPanel.add(p.Cnd_psppl_nm);
		p.Cnd_psppl_nm.setNextBeans(p.Cnd_pay_schd_print_rmrks);
		p.Cnd_psppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.psppl_nm_META);
		p.setPluralValueEnable(p.Cnd_psppl_nm, true);
		p.CndPanel.add(p.Cnd_pay_schd_print_rmrks_Label);
		p.CndPanel.add(p.Cnd_pay_schd_print_rmrks);
		p.Cnd_pay_schd_print_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_pay_schd_print_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_schd_print_rmrks_META);
		p.setPluralValueEnable(p.Cnd_pay_schd_print_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_flg);
		p.Cnd_dtl_flg.setNextBeans(p.Cnd_inc_appl_flg);
		p.Cnd_dtl_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.dtl_flg_META);
		p.CndPanel.add(p.Cnd_inc_appl_flg);
		p.Cnd_inc_appl_flg.setNextBeans(p.Cnd_inc_com_paid_flg);
		p.Cnd_inc_appl_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.inc_appl_flg_META);
		p.CndPanel.add(p.Cnd_inc_com_paid_flg);
		p.Cnd_inc_com_paid_flg.setNextBeans(p.Cnd_rfrnc_dt);
		p.Cnd_inc_com_paid_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.inc_com_paid_flg_META);
		p.CndPanel.add(p.Cnd_rfrnc_dt_Label);
		p.CndPanel.add(p.Cnd_rfrnc_dt);
		p.Cnd_rfrnc_dt.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rfrnc_dt_META);
		p.Cnd_rfrnc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_bsppl_dpt_cd_flg);
		p.Cnd2Panel.setLastBeans(p.Cnd_bsppl_dpt_cd_flg);
		p.Cnd_bsppl_dpt_cd_flg.setNextBeans(p.Cnd_bsppl_dpt_nm_flg);
		p.Cnd_bsppl_dpt_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_dpt_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_bsppl_dpt_nm_flg);
		p.Cnd_bsppl_dpt_nm_flg.setNextBeans(p.Cnd_wg_cd_flg);
		p.Cnd_bsppl_dpt_nm_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_dpt_nm_flg_META);
		p.Cnd2Panel.add(p.Cnd_wg_cd_flg);
		p.Cnd_wg_cd_flg.setNextBeans(p.Cnd_bsppl_cd_flg);
		p.Cnd_wg_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.wg_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_bsppl_cd_flg);
		p.Cnd_bsppl_cd_flg.setNextBeans(p.Cnd_ap_typ_flg);
		p.Cnd_bsppl_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_ap_typ_flg);
		p.Cnd_ap_typ_flg.setNextBeans(p.Cnd_pay_schd_dt_flg);
		p.Cnd_ap_typ_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_typ_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_schd_dt_flg);
		p.Cnd_pay_schd_dt_flg.setNextBeans(p.Cnd_ap_sttl_cd_flg);
		p.Cnd_pay_schd_dt_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_schd_dt_flg_META);
		p.Cnd2Panel.add(p.Cnd_ap_sttl_cd_flg);
		p.Cnd_ap_sttl_cd_flg.setNextBeans(p.Cnd_ap_sttl_typ_flg);
		p.Cnd_ap_sttl_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_sttl_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_ap_sttl_typ_flg);
		p.Cnd_ap_sttl_typ_flg.setNextBeans(p.Cnd_bsppl_cl_ym_flg);
		p.Cnd_ap_sttl_typ_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_sttl_typ_flg_META);
		p.Cnd2Panel.add(p.Cnd_bsppl_cl_ym_flg);
		p.Cnd_bsppl_cl_ym_flg.setNextBeans(p.Cnd_bsppl_cl_day_flg);
		p.Cnd_bsppl_cl_ym_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_cl_ym_flg_META);
		p.Cnd2Panel.add(p.Cnd_bsppl_cl_day_flg);
		p.Cnd_bsppl_cl_day_flg.setNextBeans(p.Cnd_trd_cur_cd_flg);
		p.Cnd_bsppl_cl_day_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bsppl_cl_day_flg_META);
		p.Cnd2Panel.add(p.Cnd_trd_cur_cd_flg);
		p.Cnd_trd_cur_cd_flg.setNextBeans(p.Cnd_pay_chk_no_flg);
		p.Cnd_trd_cur_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.trd_cur_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_chk_no_flg);
		p.Cnd_pay_chk_no_flg.setNextBeans(p.Cnd_pay_schd_no_flg);
		p.Cnd_pay_chk_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_chk_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_schd_no_flg);
		p.Cnd_pay_schd_no_flg.setNextBeans(p.Cnd_rcpt_iv_no_flg);
		p.Cnd_pay_schd_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_schd_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_rcpt_iv_no_flg);
		p.Cnd_rcpt_iv_no_flg.setNextBeans(p.Cnd_rcpt_iv_mng_no_flg);
		p.Cnd_rcpt_iv_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rcpt_iv_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_rcpt_iv_mng_no_flg);
		p.Cnd_rcpt_iv_mng_no_flg.setNextBeans(p.Cnd_purc_act_no_flg);
		p.Cnd_rcpt_iv_mng_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rcpt_iv_mng_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_purc_act_no_flg);
		p.Cnd_purc_act_no_flg.setNextBeans(p.Cnd_wrk_no_flg);
		p.Cnd_purc_act_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.purc_act_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_wrk_no_flg);
		p.Cnd_wrk_no_flg.setNextBeans(p.Cnd_psppl_cd_flg);
		p.Cnd_wrk_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.wrk_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_psppl_cd_flg);
		p.Cnd_psppl_cd_flg.setNextBeans(p.Cnd_pay_dpt_cd_flg);
		p.Cnd_psppl_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.psppl_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_dpt_cd_flg);
		p.Cnd_pay_dpt_cd_flg.setNextBeans(p.Cnd_pay_dpt_nm_flg);
		p.Cnd_pay_dpt_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_dpt_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_dpt_nm_flg);
		p.Cnd_pay_dpt_nm_flg.setNextBeans(p.Cnd_asppl_cd_flg);
		p.Cnd_pay_dpt_nm_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_dpt_nm_flg_META);
		p.Cnd2Panel.add(p.Cnd_asppl_cd_flg);
		p.Cnd_asppl_cd_flg.setNextBeans(p.Cnd_pay_sts_typ_flg);
		p.Cnd_asppl_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.asppl_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_sts_typ_flg);
		p.Cnd_pay_sts_typ_flg.setNextBeans(p.Cnd_ap_dpt_cd_flg);
		p.Cnd_pay_sts_typ_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_sts_typ_flg_META);
		p.Cnd2Panel.add(p.Cnd_ap_dpt_cd_flg);
		p.Cnd_ap_dpt_cd_flg.setNextBeans(p.Cnd_ap_dpt_nm_flg);
		p.Cnd_ap_dpt_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_dpt_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_ap_dpt_nm_flg);
		p.Cnd_ap_dpt_nm_flg.setNextBeans(p.Cnd_pay_bank_ac_cd_flg);
		p.Cnd_ap_dpt_nm_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.ap_dpt_nm_flg_META);
		p.Cnd2Panel.add(p.Cnd_pay_bank_ac_cd_flg);
		p.Cnd_pay_bank_ac_cd_flg.setNextBeans(p.Cnd_bank_ac_cd_flg);
		p.Cnd_pay_bank_ac_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.pay_bank_ac_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_bank_ac_cd_flg);
		p.Cnd_bank_ac_cd_flg.setNextBeans(p.Cnd_setoff_info_flg);
		p.Cnd_bank_ac_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.bank_ac_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_setoff_info_flg);
		p.Cnd_setoff_info_flg.setNextBeans(p.Cnd_xrate_flg);
		p.Cnd_setoff_info_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.setoff_info_flg_META);
		p.Cnd2Panel.add(p.Cnd_xrate_flg);
		p.Cnd_xrate_flg.setNextBeans(p.Cnd_com_paid_tax_cd_flg);
		p.Cnd_xrate_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.xrate_flg_META);
		p.Cnd2Panel.add(p.Cnd_com_paid_tax_cd_flg);
		p.Cnd_com_paid_tax_cd_flg.setNextBeans(p.Cnd_rcv_bill_no_flg);
		p.Cnd_com_paid_tax_cd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.com_paid_tax_cd_flg_META);
		p.Cnd2Panel.add(p.Cnd_rcv_bill_no_flg);
		p.Cnd_rcv_bill_no_flg.setNextBeans(p.Cnd_adv_pay_act_no_flg);
		p.Cnd_rcv_bill_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rcv_bill_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_adv_pay_act_no_flg);
		p.Cnd_adv_pay_act_no_flg.setNextBeans(p.Cnd_note_info_flg);
		p.Cnd_adv_pay_act_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.adv_pay_act_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_note_info_flg);
		p.Cnd_note_info_flg.setNextBeans(p.Cnd_rmrks_flg);
		p.Cnd_note_info_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.note_info_flg_META);
		p.Cnd2Panel.add(p.Cnd_rmrks_flg);
		p.Cnd_rmrks_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_rmrks_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0050.CndR.rmrks_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd2Panel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd2Panel.add(p.Cnd_deselect_all);
		p.BspplPanel.add(p.Cnd_bsppl_grp_p_PPanel);
		p.BspplPanel.setLastBeans(p.Cnd_bsppl_grp_p_PPanel);
		p.PspplPanel.add(p.Cnd_psppl_grp_p_PPanel);
		p.PspplPanel.setLastBeans(p.Cnd_psppl_grp_p_PPanel);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_key_flg);
		p.LPnlPanel.setLastBeans(p.LPnl_key_flg);
		p.LPnl_key_flg.setRow(p.getLPnlR(), mcframe.clientMSBH.MSBHP0050.LPnlR.key_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_PaySchdSrch p) {
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
	protected static void jbInitRPnl(MSBHP_PaySchdSrch p) {
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
	protected static void jbInitRslt(MSBHP_PaySchdSrch p) {
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
	protected static void jbInitBtn(MSBHP_PaySchdSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0030);
		p.Btn_open_MSBHP0030.setNextBeans(p.Btn_open_MSBHP0090);
		p.Btn_open_MSBHP0090.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBHP0090);
		p.Btn_open_MSBHP0090.setNextBeans(p.Btn_open_MSBHP0010);
		p.Btn_open_MSBHP0010.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBHP0010);
		p.Btn_open_MSBHP0010.setNextBeans(p.Btn_prnt_paySchdLst);
		p.Btn_prnt_paySchdLst.setIcon("PRINT");
		p.Btn_prnt_paySchdLst.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt_paySchdLst);
		p.Btn_prnt_paySchdLst.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
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
		MSBHP_PaySchdSrch_MC.mcInitScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitDispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitTop((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitFold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitTab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitAprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitTab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitBsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitTab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitPsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitTab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitCnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitCnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitLPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitCtrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitRPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitRslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.mcInitBtn((MSBHP_PaySchdSrch)this);

		// [SRCH_REF_HDR]ステータスのモードの設定
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_ScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_DispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Top((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Fold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Tab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_AprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Tab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Bsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Tab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Psppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Tab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Cnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Cnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_LPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Ctrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_RPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Rslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__HDR_Btn((MSBHP_PaySchdSrch)this);

		// [REF_HDR]ステータスのモードの設定
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_ScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_DispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Top((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Fold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Tab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_AprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Tab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Bsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Tab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Psppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Tab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Cnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Cnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_LPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Ctrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_RPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Rslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__HDR_Btn((MSBHP_PaySchdSrch)this);

		// [SRCH_REF_DTL]ステータスのモードの設定
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_ScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_DispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Top((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Fold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Tab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_AprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Tab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Bsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Tab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Psppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Tab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Cnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Cnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_LPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Ctrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_RPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Rslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__REF__DTL_Btn((MSBHP_PaySchdSrch)this);

		// [REF_DTL]ステータスのモードの設定
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_ScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_DispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Top((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Fold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Tab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_AprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Tab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Bsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Tab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Psppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Tab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Cnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Cnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_LPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Ctrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_RPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Rslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitREF__DTL_Btn((MSBHP_PaySchdSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_DispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Top((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Fold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Tab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_AprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Tab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Bsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Tab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Psppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Tab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Cnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Cnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_LPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_RPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Rslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitSRCH__PRNT_Btn((MSBHP_PaySchdSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBHP_PaySchdSrch_MC.statusInitPRNT_ScreenOpe((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_DispUnit((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Top((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Fold((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Tab1((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_AprvSts((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Tab2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Bsppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Tab3((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Psppl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Tab4((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Cnd2((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Cnd((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_LPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Ctrl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_RPnl((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Rslt((MSBHP_PaySchdSrch)this);
		MSBHP_PaySchdSrch_MC.statusInitPRNT_Btn((MSBHP_PaySchdSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_PaySchdSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [AprvSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvSts(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Bsppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBsppl(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Psppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPsppl(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBHP_PaySchdSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_PaySchdSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_mode_Group.addAllListener(p);
		p.Cnd_mode_DTL.addAllListener(p);
		p.Cnd_mode_HDR.addAllListener(p);
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_acpt_flg.addAllListener(p);
		p.Cnd_rjct_flg.addAllListener(p);
		p.Cnd_last_rjct_flg.addAllListener(p);
		p.Cnd_excld_flg.addAllListener(p);
		p.Cnd_pay_schd_act_dt_fr.setListListener(p);
		p.Cnd_pay_schd_act_dt_fr.addAllListener(p);
		p.Cnd_pay_schd_act_dt_to.setListListener(p);
		p.Cnd_pay_schd_act_dt_to.addAllListener(p);
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_pay_chk_no.setListListener(p);
		p.Cnd_pay_chk_no.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_ap_typ.setListListener(p);
		p.Cnd_ap_typ.addAllListener(p);
		p.Cnd_ap_typ_nm.setListListener(p);
		p.Cnd_ap_typ_nm.addAllListener(p);
		p.Cnd_psppl_cd.setListListener(p);
		p.Cnd_psppl_cd.addAllListener(p);
		p.Cnd_psppl_nm.setListListener(p);
		p.Cnd_psppl_nm.addAllListener(p);
		p.Cnd_pay_schd_print_rmrks.setListListener(p);
		p.Cnd_pay_schd_print_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_dtl_flg.addAllListener(p);
		p.Cnd_inc_appl_flg.addAllListener(p);
		p.Cnd_inc_com_paid_flg.addAllListener(p);
		p.Cnd_rfrnc_dt.setListListener(p);
		p.Cnd_rfrnc_dt.addAllListener(p);
		p.Cnd_bsppl_dpt_cd_flg.addAllListener(p);
		p.Cnd_bsppl_dpt_nm_flg.addAllListener(p);
		p.Cnd_wg_cd_flg.addAllListener(p);
		p.Cnd_bsppl_cd_flg.addAllListener(p);
		p.Cnd_ap_typ_flg.addAllListener(p);
		p.Cnd_pay_schd_dt_flg.addAllListener(p);
		p.Cnd_ap_sttl_cd_flg.addAllListener(p);
		p.Cnd_ap_sttl_typ_flg.addAllListener(p);
		p.Cnd_bsppl_cl_ym_flg.addAllListener(p);
		p.Cnd_bsppl_cl_day_flg.addAllListener(p);
		p.Cnd_trd_cur_cd_flg.addAllListener(p);
		p.Cnd_pay_chk_no_flg.addAllListener(p);
		p.Cnd_pay_schd_no_flg.addAllListener(p);
		p.Cnd_rcpt_iv_no_flg.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no_flg.addAllListener(p);
		p.Cnd_purc_act_no_flg.addAllListener(p);
		p.Cnd_wrk_no_flg.addAllListener(p);
		p.Cnd_psppl_cd_flg.addAllListener(p);
		p.Cnd_pay_dpt_cd_flg.addAllListener(p);
		p.Cnd_pay_dpt_nm_flg.addAllListener(p);
		p.Cnd_asppl_cd_flg.addAllListener(p);
		p.Cnd_pay_sts_typ_flg.addAllListener(p);
		p.Cnd_ap_dpt_cd_flg.addAllListener(p);
		p.Cnd_ap_dpt_nm_flg.addAllListener(p);
		p.Cnd_pay_bank_ac_cd_flg.addAllListener(p);
		p.Cnd_bank_ac_cd_flg.addAllListener(p);
		p.Cnd_setoff_info_flg.addAllListener(p);
		p.Cnd_xrate_flg.addAllListener(p);
		p.Cnd_com_paid_tax_cd_flg.addAllListener(p);
		p.Cnd_rcv_bill_no_flg.addAllListener(p);
		p.Cnd_adv_pay_act_no_flg.addAllListener(p);
		p.Cnd_note_info_flg.addAllListener(p);
		p.Cnd_rmrks_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBHP_PaySchdSrch p) {
		p.LPnl_key_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_PaySchdSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBHP_PaySchdSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_PaySchdSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.columnRslt_ap_typ.addAllListener(p);
		p.columnRslt_ap_typ.setListListener(p);
		p.columnRslt_ap_typ_nm.addAllListener(p);
		p.columnRslt_ap_typ_nm.setListListener(p);
		p.columnRslt_pay_schd_dt.addAllListener(p);
		p.columnRslt_pay_schd_dt.setListListener(p);
		p.columnRslt_pay_schd_act_dt.addAllListener(p);
		p.columnRslt_pay_schd_act_dt.setListListener(p);
		p.columnRslt_ap_sttl_cd.addAllListener(p);
		p.columnRslt_ap_sttl_cd.setListListener(p);
		p.columnRslt_ap_sttl_nm.addAllListener(p);
		p.columnRslt_ap_sttl_nm.setListListener(p);
		p.columnRslt_ap_sttl_typ.addAllListener(p);
		p.columnRslt_ap_sttl_typ.setListListener(p);
		p.columnRslt_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_delay.addAllListener(p);
		p.columnRslt_delay.setListListener(p);
		p.columnRslt_bsppl_cl_ym.addAllListener(p);
		p.columnRslt_bsppl_cl_ym.setListListener(p);
		p.columnRslt_bsppl_cl_day.addAllListener(p);
		p.columnRslt_bsppl_cl_day.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_pay_xrate.addAllListener(p);
		p.columnRslt_pay_xrate.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_pay_chk_no.addAllListener(p);
		p.columnRslt_pay_chk_no.setListListener(p);
		p.columnRslt_pay_schd_no.addAllListener(p);
		p.columnRslt_pay_schd_no.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_rcpt_iv_mng_no.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.setListListener(p);
		p.columnRslt_purc_act_no.addAllListener(p);
		p.columnRslt_purc_act_no.setListListener(p);
		p.columnRslt_psppl_cd.addAllListener(p);
		p.columnRslt_psppl_cd.setListListener(p);
		p.columnRslt_psppl_nm.addAllListener(p);
		p.columnRslt_psppl_nm.setListListener(p);
		p.columnRslt_pay_dpt_cd.addAllListener(p);
		p.columnRslt_pay_dpt_cd.setListListener(p);
		p.columnRslt_pay_dpt_nm.addAllListener(p);
		p.columnRslt_pay_dpt_nm.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_pay_sts_typ.addAllListener(p);
		p.columnRslt_pay_sts_typ.setListListener(p);
		p.columnRslt_pay_sts_typ_nm.addAllListener(p);
		p.columnRslt_pay_sts_typ_nm.setListListener(p);
		p.columnRslt_sw_flg.addAllListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_pay_bank_ac_cd.addAllListener(p);
		p.columnRslt_pay_bank_ac_cd.setListListener(p);
		p.columnRslt_pay_bank_ac_nm.addAllListener(p);
		p.columnRslt_pay_bank_ac_nm.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
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
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_com_paid_tax_cd.addAllListener(p);
		p.columnRslt_com_paid_tax_cd.setListListener(p);
		p.columnRslt_com_paid_tax_nm.addAllListener(p);
		p.columnRslt_com_paid_tax_nm.setListListener(p);
		p.columnRslt_com_paid_tax_rate.addAllListener(p);
		p.columnRslt_com_paid_tax_rate.setListListener(p);
		p.columnRslt_com_paid_tax_amt.addAllListener(p);
		p.columnRslt_com_paid_tax_amt.setListListener(p);
		p.columnRslt_exc_com_paid.addAllListener(p);
		p.columnRslt_exc_com_paid.setListListener(p);
		p.columnRslt_rcv_bill_no.addAllListener(p);
		p.columnRslt_rcv_bill_no.setListListener(p);
		p.columnRslt_adv_pay_act_no.addAllListener(p);
		p.columnRslt_adv_pay_act_no.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_note_typ.addAllListener(p);
		p.columnRslt_note_typ.setListListener(p);
		p.columnRslt_note_typ_nm.addAllListener(p);
		p.columnRslt_note_typ_nm.setListListener(p);
		p.columnRslt_note_rsn_cd.addAllListener(p);
		p.columnRslt_note_rsn_cd.setListListener(p);
		p.columnRslt_note_rsn_nm.addAllListener(p);
		p.columnRslt_note_rsn_nm.setListListener(p);
		p.columnRslt_draw_dt.addAllListener(p);
		p.columnRslt_draw_dt.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.columnRslt_note_days.addAllListener(p);
		p.columnRslt_note_days.setListListener(p);
		p.columnRslt_drawer_nm.addAllListener(p);
		p.columnRslt_drawer_nm.setListListener(p);
		p.columnRslt_draw_bank_cd.addAllListener(p);
		p.columnRslt_draw_bank_cd.setListListener(p);
		p.columnRslt_draw_bank_nm.addAllListener(p);
		p.columnRslt_draw_bank_nm.setListListener(p);
		p.columnRslt_draw_branch_cd.addAllListener(p);
		p.columnRslt_draw_branch_cd.setListListener(p);
		p.columnRslt_draw_branch_nm.addAllListener(p);
		p.columnRslt_draw_branch_nm.setListListener(p);
		p.columnRslt_endrsr.addAllListener(p);
		p.columnRslt_endrsr.setListListener(p);
		p.columnRslt_accptr.addAllListener(p);
		p.columnRslt_accptr.setListListener(p);
		p.columnRslt_pay_ntc_d_print_rmrks.addAllListener(p);
		p.columnRslt_pay_ntc_d_print_rmrks.setListListener(p);
		p.columnRslt_pay_schd_print_rmrks.addAllListener(p);
		p.columnRslt_pay_schd_print_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_aprv_no.addAllListener(p);
		p.columnRslt_aprv_no.setListListener(p);
		p.columnRslt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_aprv_sts_typ.setListListener(p);
		p.columnRslt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_flg.addAllListener(p);
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
	protected static void mcInitBtn(MSBHP_PaySchdSrch p) {
		p.Btn_open_MSBHP0030.addAllListener(p);
		p.Btn_open_MSBHP0030.setAPMethodName("doBtn_open_MSBHP0030");
		p.Btn_open_MSBHP0090.addAllListener(p);
		p.Btn_open_MSBHP0090.setAPMethodName("doBtn_open_MSBHP0090");
		p.Btn_open_MSBHP0010.addAllListener(p);
		p.Btn_open_MSBHP0010.setAPMethodName("doBtn_open_MSBHP0010");
		p.Btn_prnt_paySchdLst.addAllListener(p);
		p.Btn_prnt_paySchdLst.setAPMethodName("doBtn_prnt_paySchdLst");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [SRCH_REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_ScreenOpe(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_DispUnit(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Top(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Fold(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab1(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_AprvSts(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Bsppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab3(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Psppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Tab4(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Cnd2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Cnd(MSBHP_PaySchdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_acpt_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_rjct_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_last_rjct_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_excld_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_schd_act_dt_fr.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_pay_schd_act_dt_to.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_pay_schd_print_rmrks.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_inc_appl_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_inc_com_paid_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_rfrnc_dt.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_dpt_nm_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_wg_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_typ_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_sttl_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_sttl_typ_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_ym_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_day_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_chk_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_schd_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_purc_act_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_wrk_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_psppl_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_dpt_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_dpt_nm_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_asppl_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_sts_typ_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_dpt_nm_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_bank_ac_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_bank_ac_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_setoff_info_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_com_paid_tax_cd_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_rcv_bill_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_adv_pay_act_no_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_note_info_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_rmrks_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_LPnl(MSBHP_PaySchdSrch p){
		p.LPnl_key_flg.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Ctrl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_RPnl(MSBHP_PaySchdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Rslt(MSBHP_PaySchdSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF_HDR, MCMode.REQUIRED);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_act_dt.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_pay_act_amt_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_delay.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_xrate.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_setoff_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_setoff_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_setoff_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_so_dpt_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_so_dpt_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_rate.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_amt.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_exc_com_paid.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcv_bill_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_typ.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_dt.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_due_dt.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_days.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_drawer_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_endrsr.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_accptr.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_print_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_REF_HDR, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__HDR_Btn(MSBHP_PaySchdSrch p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_open_MSBHP0090.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_open_MSBHP0010.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_prnt_paySchdLst.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ScreenOpe(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DispUnit(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_AprvSts(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Bsppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Psppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab4(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBHP_PaySchdSrch p){
		p.Cnd_ope_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_acpt_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rjct_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_last_rjct_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_excld_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_schd_act_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_pay_schd_act_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_pay_schd_print_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_inc_appl_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_inc_com_paid_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rfrnc_dt.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_dpt_nm_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_wg_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_typ_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_sttl_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_sttl_typ_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_ym_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_day_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_chk_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_schd_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_purc_act_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_wrk_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_psppl_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_dpt_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_dpt_nm_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_asppl_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_sts_typ_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_ap_dpt_nm_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_pay_bank_ac_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_bank_ac_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_setoff_info_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_com_paid_tax_cd_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rcv_bill_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_adv_pay_act_no_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_note_info_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_rmrks_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_LPnl(MSBHP_PaySchdSrch p){
		p.LPnl_key_flg.putMode(p, REF_HDR, MCMode.REQUIRED);

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBHP_PaySchdSrch p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Rslt(MSBHP_PaySchdSrch p){
		p.columnRslt_check.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_act_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_pay_act_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_delay.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_xrate.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_bank_ac_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_bank_ac_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bank_ac_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_bank_ac_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_setoff_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_setoff_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_setoff_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_so_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_so_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_com_paid_tax_amt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_exc_com_paid.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcv_bill_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_adv_pay_act_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_due_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_note_days.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_drawer_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_bank_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_bank_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_branch_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_draw_branch_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_endrsr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_accptr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_print_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBHP_PaySchdSrch p){
		p.Btn_open_MSBHP0030.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBHP0090.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBHP0010.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_prnt_paySchdLst.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_ScreenOpe(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_DispUnit(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Top(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Fold(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab1(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_AprvSts(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Bsppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab3(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Psppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Tab4(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Cnd2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Cnd(MSBHP_PaySchdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_acpt_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_rjct_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_last_rjct_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_excld_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_schd_act_dt_fr.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_pay_schd_act_dt_to.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_pay_schd_print_rmrks.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_inc_appl_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_inc_com_paid_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_rfrnc_dt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_dpt_nm_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_wg_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_typ_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_sttl_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_sttl_typ_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_ym_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_day_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_chk_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_schd_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_purc_act_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_wrk_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_psppl_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_dpt_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_dpt_nm_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_asppl_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_sts_typ_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_dpt_nm_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_bank_ac_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_bank_ac_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_setoff_info_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_com_paid_tax_cd_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_rcv_bill_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_adv_pay_act_no_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_note_info_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_rmrks_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_LPnl(MSBHP_PaySchdSrch p){
		p.LPnl_key_flg.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Ctrl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_RPnl(MSBHP_PaySchdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Rslt(MSBHP_PaySchdSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF_DTL, MCMode.REQUIRED);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_act_dt.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_pay_act_amt_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_delay.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_xrate.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_rate.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_amt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_exc_com_paid.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_print_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF__DTL_Btn(MSBHP_PaySchdSrch p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_open_MSBHP0090.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_open_MSBHP0010.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_prnt_paySchdLst.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ScreenOpe(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DispUnit(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_AprvSts(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Bsppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Psppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab4(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBHP_PaySchdSrch p){
		p.Cnd_ope_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_acpt_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rjct_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_last_rjct_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_excld_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_schd_act_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_pay_schd_act_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_pay_schd_print_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_inc_appl_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_inc_com_paid_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rfrnc_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_dpt_nm_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_wg_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_typ_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_sttl_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_sttl_typ_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_ym_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_day_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_chk_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_schd_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_purc_act_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_wrk_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_psppl_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_dpt_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_dpt_nm_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_asppl_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_sts_typ_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_ap_dpt_nm_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_pay_bank_ac_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_bank_ac_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_setoff_info_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_com_paid_tax_cd_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rcv_bill_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_adv_pay_act_no_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_note_info_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_rmrks_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_LPnl(MSBHP_PaySchdSrch p){
		p.LPnl_key_flg.putMode(p, REF_DTL, MCMode.REQUIRED);

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBHP_PaySchdSrch p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Rslt(MSBHP_PaySchdSrch p){
		p.columnRslt_check.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_act_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ap_sttl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_pay_act_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_delay.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_bsppl_cl_ym.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_xrate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_amt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_exc_com_paid.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_print_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Btn(MSBHP_PaySchdSrch p){
		p.Btn_open_MSBHP0030.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBHP0090.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBHP0010.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_prnt_paySchdLst.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_DispUnit(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_AprvSts(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Bsppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Psppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab4(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBHP_PaySchdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_opn_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_fix_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_last_rjct_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_excld_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_schd_act_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pay_schd_act_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pay_schd_print_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_dtl_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_inc_appl_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_inc_com_paid_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rfrnc_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_dpt_nm_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_wg_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ap_typ_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ap_sttl_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ap_sttl_typ_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_ym_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_day_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_chk_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_schd_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_purc_act_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_wrk_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_psppl_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_dpt_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_dpt_nm_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_asppl_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_sts_typ_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_ap_dpt_nm_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_bank_ac_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_bank_ac_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_setoff_info_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_com_paid_tax_cd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_bill_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_adv_pay_act_no_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_note_info_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_rmrks_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_LPnl(MSBHP_PaySchdSrch p){
		p.LPnl_key_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBHP_PaySchdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBHP_PaySchdSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_act_dt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_pay_act_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_delay.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_xrate.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_rate.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_amt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_exc_com_paid.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_print_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__PRNT_Btn(MSBHP_PaySchdSrch p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBHP0090.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBHP0010.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_paySchdLst.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_DispUnit(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[AprvSts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_AprvSts(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Bsppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Psppl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBHP_PaySchdSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_opn_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_fix_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_acpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_rjct_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_last_rjct_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_excld_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_schd_act_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_schd_act_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_schd_print_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dtl_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_inc_appl_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_inc_com_paid_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rfrnc_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_dpt_nm_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_wg_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ap_typ_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ap_sttl_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ap_sttl_typ_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_ym_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_bsppl_cl_day_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_chk_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_schd_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_purc_act_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_wrk_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_psppl_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_dpt_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_dpt_nm_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_asppl_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_sts_typ_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_ap_dpt_nm_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_bank_ac_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_bank_ac_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_setoff_info_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_com_paid_tax_cd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rcv_bill_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_adv_pay_act_no_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_note_info_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_rmrks_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_LPnl(MSBHP_PaySchdSrch p){
		p.LPnl_key_flg.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBHP_PaySchdSrch p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBHP_PaySchdSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBHP_PaySchdSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_bsppl_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_act_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_sttl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_pay_act_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_delay.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_cl_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_xrate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_rate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_com_paid_tax_amt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_exc_com_paid.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_print_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitPRNT_Btn(MSBHP_PaySchdSrch p){
		p.Btn_open_MSBHP0030.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBHP0090.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBHP0010.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt_paySchdLst.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_REF_DTL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBHP_PaySchdSrch_MC.setTableConfigRslt((MSBHP_PaySchdSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_PaySchdSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_cd);
		p.columnRslt_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.columnRslt_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ);
		p.columnRslt_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ_nm);
		p.columnRslt_pay_schd_dt.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_schd_dt_META);
		p.columnRslt_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt);
		p.columnRslt_pay_schd_act_dt.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_schd_act_dt_META);
		p.columnRslt_pay_schd_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_act_dt);
		p.columnRslt_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_cd);
		p.columnRslt_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_nm);
		p.columnRslt_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ);
		p.columnRslt_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ_nm);
		p.RsltTable.addTable(p.Rslt_pay_schd_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_pay_act_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_not_appl_bal_p_PPanel.AmtTable);
		p.columnRslt_delay.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.delay_META);
		p.RsltTable.addColumnConfig(p.columnRslt_delay);
		p.columnRslt_bsppl_cl_ym.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bsppl_cl_ym_META);
		p.columnRslt_bsppl_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_ym);
		p.columnRslt_bsppl_cl_day.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bsppl_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_day);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_pay_xrate.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_xrate);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.columnRslt_pay_chk_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_chk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_no);
		p.columnRslt_pay_schd_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.columnRslt_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_no);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_psppl_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.psppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_cd);
		p.columnRslt_psppl_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.psppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_nm);
		p.columnRslt_pay_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_cd);
		p.columnRslt_pay_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_nm);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_pay_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ);
		p.columnRslt_pay_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ_nm);
		p.columnRslt_sw_flg.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.sw_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_flg);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_pay_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_cd);
		p.columnRslt_pay_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_nm);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_ap_setoff_typ.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_setoff_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_setoff_typ);
		p.columnRslt_ap_setoff_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ap_setoff_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_setoff_typ_nm);
		p.columnRslt_setoff_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.setoff_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_cd);
		p.columnRslt_setoff_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.setoff_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_nm);
		p.columnRslt_so_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.so_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_so_dpt_cd);
		p.columnRslt_so_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.so_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_so_dpt_nm);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_com_paid_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.com_paid_tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_tax_cd);
		p.columnRslt_com_paid_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.com_paid_tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_tax_nm);
		p.columnRslt_com_paid_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.com_paid_tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_tax_rate);
		p.columnRslt_com_paid_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.com_paid_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_com_paid_tax_amt);
		p.columnRslt_exc_com_paid.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.exc_com_paid_META);
		p.RsltTable.addColumnConfig(p.columnRslt_exc_com_paid);
		p.columnRslt_rcv_bill_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.rcv_bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_bill_no);
		p.columnRslt_adv_pay_act_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.adv_pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_pay_act_no);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_note_typ.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.note_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ);
		p.columnRslt_note_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.note_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ_nm);
		p.columnRslt_note_rsn_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.note_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_cd);
		p.columnRslt_note_rsn_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.note_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_nm);
		p.columnRslt_draw_dt.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.draw_dt_META);
		p.columnRslt_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_dt);
		p.columnRslt_due_dt.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.columnRslt_note_days.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.note_days_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_days);
		p.columnRslt_drawer_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.drawer_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_drawer_nm);
		p.columnRslt_draw_bank_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.draw_bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_cd);
		p.columnRslt_draw_bank_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.draw_bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_nm);
		p.columnRslt_draw_branch_cd.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.draw_branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_cd);
		p.columnRslt_draw_branch_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.draw_branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_nm);
		p.columnRslt_endrsr.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.endrsr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr);
		p.columnRslt_accptr.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.accptr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accptr);
		p.columnRslt_pay_ntc_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_ntc_d_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_ntc_d_print_rmrks);
		p.columnRslt_pay_schd_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.pay_schd_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_print_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_aprv_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.aprv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_no);
		p.columnRslt_aprv_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ);
		p.columnRslt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ_nm);
		p.columnRslt_aprv_flg.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_flg);
		p.RsltTable.addTable(p.Rslt_bsppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_psppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0050.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_ap_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_typ.getListConfig().setPutter(getCnd_ap_typ_ListPutter());
		Cnd_psppl_cd.getListConfig().setPutter(getCnd_psppl_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_REF_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF_HDRStatus() {
		status = SRCH_REF_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_HDRStatus() {
		status = REF_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF_DTLStatus() {
		status = SRCH_REF_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DTLStatus() {
		status = REF_DTL;
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
		if (SRCH_REF_HDR.equals(status)) {
			setSRCH_REF_HDRStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
		else if (SRCH_REF_DTL.equals(status)) {
			setSRCH_REF_DTLStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
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
	 * [Cnd_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_psppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_psppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_ap_typ) return getCnd_ap_typ(row, info);
		if(combo == Cnd_psppl_cd) return getCnd_psppl_cd(row, info);
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
		else if (ap == Btn_open_MSBHP0030) doBtn_open_MSBHP0030(info);
		else if (ap == Btn_open_MSBHP0090) doBtn_open_MSBHP0090(info);
		else if (ap == Btn_open_MSBHP0010) doBtn_open_MSBHP0010(info);
		else if (ap == Btn_prnt_paySchdLst) doBtn_prnt_paySchdLst(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
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
	 * [Btn]パネルの[open_MSBHP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBHP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0090(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBHP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0010(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_paySchdLst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_paySchdLst(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_opn_flg) return doCnd_opn_flg_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_acpt_flg) return doCnd_acpt_flg_VC(info);
		if (vc == Cnd_rjct_flg) return doCnd_rjct_flg_VC(info);
		if (vc == Cnd_last_rjct_flg) return doCnd_last_rjct_flg_VC(info);
		if (vc == Cnd_excld_flg) return doCnd_excld_flg_VC(info);
		if (vc == Cnd_pay_schd_act_dt_fr) return doCnd_pay_schd_act_dt_fr_VC(info);
		if (vc == Cnd_pay_schd_act_dt_to) return doCnd_pay_schd_act_dt_to_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_pay_chk_no) return doCnd_pay_chk_no_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_ap_typ) return doCnd_ap_typ_VC(info);
		if (vc == Cnd_ap_typ_nm) return doCnd_ap_typ_nm_VC(info);
		if (vc == Cnd_psppl_cd) return doCnd_psppl_cd_VC(info);
		if (vc == Cnd_psppl_nm) return doCnd_psppl_nm_VC(info);
		if (vc == Cnd_pay_schd_print_rmrks) return doCnd_pay_schd_print_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dtl_flg) return doCnd_dtl_flg_VC(info);
		if (vc == Cnd_inc_appl_flg) return doCnd_inc_appl_flg_VC(info);
		if (vc == Cnd_inc_com_paid_flg) return doCnd_inc_com_paid_flg_VC(info);
		if (vc == Cnd_rfrnc_dt) return doCnd_rfrnc_dt_VC(info);
		if (vc == Cnd_bsppl_dpt_cd_flg) return doCnd_bsppl_dpt_cd_flg_VC(info);
		if (vc == Cnd_bsppl_dpt_nm_flg) return doCnd_bsppl_dpt_nm_flg_VC(info);
		if (vc == Cnd_wg_cd_flg) return doCnd_wg_cd_flg_VC(info);
		if (vc == Cnd_bsppl_cd_flg) return doCnd_bsppl_cd_flg_VC(info);
		if (vc == Cnd_ap_typ_flg) return doCnd_ap_typ_flg_VC(info);
		if (vc == Cnd_pay_schd_dt_flg) return doCnd_pay_schd_dt_flg_VC(info);
		if (vc == Cnd_ap_sttl_cd_flg) return doCnd_ap_sttl_cd_flg_VC(info);
		if (vc == Cnd_ap_sttl_typ_flg) return doCnd_ap_sttl_typ_flg_VC(info);
		if (vc == Cnd_bsppl_cl_ym_flg) return doCnd_bsppl_cl_ym_flg_VC(info);
		if (vc == Cnd_bsppl_cl_day_flg) return doCnd_bsppl_cl_day_flg_VC(info);
		if (vc == Cnd_trd_cur_cd_flg) return doCnd_trd_cur_cd_flg_VC(info);
		if (vc == Cnd_pay_chk_no_flg) return doCnd_pay_chk_no_flg_VC(info);
		if (vc == Cnd_pay_schd_no_flg) return doCnd_pay_schd_no_flg_VC(info);
		if (vc == Cnd_rcpt_iv_no_flg) return doCnd_rcpt_iv_no_flg_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no_flg) return doCnd_rcpt_iv_mng_no_flg_VC(info);
		if (vc == Cnd_purc_act_no_flg) return doCnd_purc_act_no_flg_VC(info);
		if (vc == Cnd_wrk_no_flg) return doCnd_wrk_no_flg_VC(info);
		if (vc == Cnd_psppl_cd_flg) return doCnd_psppl_cd_flg_VC(info);
		if (vc == Cnd_pay_dpt_cd_flg) return doCnd_pay_dpt_cd_flg_VC(info);
		if (vc == Cnd_pay_dpt_nm_flg) return doCnd_pay_dpt_nm_flg_VC(info);
		if (vc == Cnd_asppl_cd_flg) return doCnd_asppl_cd_flg_VC(info);
		if (vc == Cnd_pay_sts_typ_flg) return doCnd_pay_sts_typ_flg_VC(info);
		if (vc == Cnd_ap_dpt_cd_flg) return doCnd_ap_dpt_cd_flg_VC(info);
		if (vc == Cnd_ap_dpt_nm_flg) return doCnd_ap_dpt_nm_flg_VC(info);
		if (vc == Cnd_pay_bank_ac_cd_flg) return doCnd_pay_bank_ac_cd_flg_VC(info);
		if (vc == Cnd_bank_ac_cd_flg) return doCnd_bank_ac_cd_flg_VC(info);
		if (vc == Cnd_setoff_info_flg) return doCnd_setoff_info_flg_VC(info);
		if (vc == Cnd_xrate_flg) return doCnd_xrate_flg_VC(info);
		if (vc == Cnd_com_paid_tax_cd_flg) return doCnd_com_paid_tax_cd_flg_VC(info);
		if (vc == Cnd_rcv_bill_no_flg) return doCnd_rcv_bill_no_flg_VC(info);
		if (vc == Cnd_adv_pay_act_no_flg) return doCnd_adv_pay_act_no_flg_VC(info);
		if (vc == Cnd_note_info_flg) return doCnd_note_info_flg_VC(info);
		if (vc == Cnd_rmrks_flg) return doCnd_rmrks_flg_VC(info);
		if (vc == LPnl_key_flg) return doLPnl_key_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_bsppl_dpt_cd) return doRslt_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_bsppl_dpt_nm) return doRslt_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_ap_typ) return doRslt_ap_typ_VC(info);
		if (vc == columnRslt_ap_typ_nm) return doRslt_ap_typ_nm_VC(info);
		if (vc == columnRslt_pay_schd_dt) return doRslt_pay_schd_dt_VC(info);
		if (vc == columnRslt_pay_schd_act_dt) return doRslt_pay_schd_act_dt_VC(info);
		if (vc == columnRslt_ap_sttl_cd) return doRslt_ap_sttl_cd_VC(info);
		if (vc == columnRslt_ap_sttl_nm) return doRslt_ap_sttl_nm_VC(info);
		if (vc == columnRslt_ap_sttl_typ) return doRslt_ap_sttl_typ_VC(info);
		if (vc == columnRslt_ap_sttl_typ_nm) return doRslt_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_delay) return doRslt_delay_VC(info);
		if (vc == columnRslt_bsppl_cl_ym) return doRslt_bsppl_cl_ym_VC(info);
		if (vc == columnRslt_bsppl_cl_day) return doRslt_bsppl_cl_day_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_pay_xrate) return doRslt_pay_xrate_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_pay_chk_no) return doRslt_pay_chk_no_VC(info);
		if (vc == columnRslt_pay_schd_no) return doRslt_pay_schd_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_purc_act_no) return doRslt_purc_act_no_VC(info);
		if (vc == columnRslt_psppl_cd) return doRslt_psppl_cd_VC(info);
		if (vc == columnRslt_psppl_nm) return doRslt_psppl_nm_VC(info);
		if (vc == columnRslt_pay_dpt_cd) return doRslt_pay_dpt_cd_VC(info);
		if (vc == columnRslt_pay_dpt_nm) return doRslt_pay_dpt_nm_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_pay_sts_typ) return doRslt_pay_sts_typ_VC(info);
		if (vc == columnRslt_pay_sts_typ_nm) return doRslt_pay_sts_typ_nm_VC(info);
		if (vc == columnRslt_sw_flg) return doRslt_sw_flg_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_pay_bank_ac_cd) return doRslt_pay_bank_ac_cd_VC(info);
		if (vc == columnRslt_pay_bank_ac_nm) return doRslt_pay_bank_ac_nm_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_ap_setoff_typ) return doRslt_ap_setoff_typ_VC(info);
		if (vc == columnRslt_ap_setoff_typ_nm) return doRslt_ap_setoff_typ_nm_VC(info);
		if (vc == columnRslt_setoff_cd) return doRslt_setoff_cd_VC(info);
		if (vc == columnRslt_setoff_nm) return doRslt_setoff_nm_VC(info);
		if (vc == columnRslt_so_dpt_cd) return doRslt_so_dpt_cd_VC(info);
		if (vc == columnRslt_so_dpt_nm) return doRslt_so_dpt_nm_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_com_paid_tax_cd) return doRslt_com_paid_tax_cd_VC(info);
		if (vc == columnRslt_com_paid_tax_nm) return doRslt_com_paid_tax_nm_VC(info);
		if (vc == columnRslt_com_paid_tax_rate) return doRslt_com_paid_tax_rate_VC(info);
		if (vc == columnRslt_com_paid_tax_amt) return doRslt_com_paid_tax_amt_VC(info);
		if (vc == columnRslt_exc_com_paid) return doRslt_exc_com_paid_VC(info);
		if (vc == columnRslt_rcv_bill_no) return doRslt_rcv_bill_no_VC(info);
		if (vc == columnRslt_adv_pay_act_no) return doRslt_adv_pay_act_no_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_note_typ) return doRslt_note_typ_VC(info);
		if (vc == columnRslt_note_typ_nm) return doRslt_note_typ_nm_VC(info);
		if (vc == columnRslt_note_rsn_cd) return doRslt_note_rsn_cd_VC(info);
		if (vc == columnRslt_note_rsn_nm) return doRslt_note_rsn_nm_VC(info);
		if (vc == columnRslt_draw_dt) return doRslt_draw_dt_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_note_days) return doRslt_note_days_VC(info);
		if (vc == columnRslt_drawer_nm) return doRslt_drawer_nm_VC(info);
		if (vc == columnRslt_draw_bank_cd) return doRslt_draw_bank_cd_VC(info);
		if (vc == columnRslt_draw_bank_nm) return doRslt_draw_bank_nm_VC(info);
		if (vc == columnRslt_draw_branch_cd) return doRslt_draw_branch_cd_VC(info);
		if (vc == columnRslt_draw_branch_nm) return doRslt_draw_branch_nm_VC(info);
		if (vc == columnRslt_endrsr) return doRslt_endrsr_VC(info);
		if (vc == columnRslt_accptr) return doRslt_accptr_VC(info);
		if (vc == columnRslt_pay_ntc_d_print_rmrks) return doRslt_pay_ntc_d_print_rmrks_VC(info);
		if (vc == columnRslt_pay_schd_print_rmrks) return doRslt_pay_schd_print_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_aprv_no) return doRslt_aprv_no_VC(info);
		if (vc == columnRslt_aprv_sts_typ) return doRslt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_aprv_sts_typ_nm) return doRslt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_flg) return doRslt_aprv_flg_VC(info);
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
	 * [Cnd]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_last_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[excld_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_excld_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_act_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_act_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_chk_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_print_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_com_paid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_com_paid_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_dpt_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_nm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_ym_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cl_ym_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_day_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cl_day_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_chk_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_chk_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_no_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wrk_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_nm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_sts_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_nm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_bank_ac_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_bank_ac_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bank_ac_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[setoff_info_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_setoff_info_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[com_paid_tax_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_com_paid_tax_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_bill_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_bill_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adv_pay_act_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_info_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_info_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_key_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_act_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[delay]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_delay_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_xrate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sw_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_com_paid_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[exc_com_paid]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_exc_com_paid_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_days_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_ntc_d_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_print_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_mode_Group) doCnd_mode_NC(info);
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_acpt_flg) doCnd_acpt_flg_NC(info);
		else if (nc == Cnd_rjct_flg) doCnd_rjct_flg_NC(info);
		else if (nc == Cnd_last_rjct_flg) doCnd_last_rjct_flg_NC(info);
		else if (nc == Cnd_excld_flg) doCnd_excld_flg_NC(info);
		else if (nc == Cnd_pay_schd_act_dt_fr) doCnd_pay_schd_act_dt_fr_NC(info);
		else if (nc == Cnd_pay_schd_act_dt_to) doCnd_pay_schd_act_dt_to_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_pay_chk_no) doCnd_pay_chk_no_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_ap_typ) doCnd_ap_typ_NC(info);
		else if (nc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NC(info);
		else if (nc == Cnd_psppl_cd) doCnd_psppl_cd_NC(info);
		else if (nc == Cnd_psppl_nm) doCnd_psppl_nm_NC(info);
		else if (nc == Cnd_pay_schd_print_rmrks) doCnd_pay_schd_print_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dtl_flg) doCnd_dtl_flg_NC(info);
		else if (nc == Cnd_inc_appl_flg) doCnd_inc_appl_flg_NC(info);
		else if (nc == Cnd_inc_com_paid_flg) doCnd_inc_com_paid_flg_NC(info);
		else if (nc == Cnd_rfrnc_dt) doCnd_rfrnc_dt_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd_flg) doCnd_bsppl_dpt_cd_flg_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm_flg) doCnd_bsppl_dpt_nm_flg_NC(info);
		else if (nc == Cnd_wg_cd_flg) doCnd_wg_cd_flg_NC(info);
		else if (nc == Cnd_bsppl_cd_flg) doCnd_bsppl_cd_flg_NC(info);
		else if (nc == Cnd_ap_typ_flg) doCnd_ap_typ_flg_NC(info);
		else if (nc == Cnd_pay_schd_dt_flg) doCnd_pay_schd_dt_flg_NC(info);
		else if (nc == Cnd_ap_sttl_cd_flg) doCnd_ap_sttl_cd_flg_NC(info);
		else if (nc == Cnd_ap_sttl_typ_flg) doCnd_ap_sttl_typ_flg_NC(info);
		else if (nc == Cnd_bsppl_cl_ym_flg) doCnd_bsppl_cl_ym_flg_NC(info);
		else if (nc == Cnd_bsppl_cl_day_flg) doCnd_bsppl_cl_day_flg_NC(info);
		else if (nc == Cnd_trd_cur_cd_flg) doCnd_trd_cur_cd_flg_NC(info);
		else if (nc == Cnd_pay_chk_no_flg) doCnd_pay_chk_no_flg_NC(info);
		else if (nc == Cnd_pay_schd_no_flg) doCnd_pay_schd_no_flg_NC(info);
		else if (nc == Cnd_rcpt_iv_no_flg) doCnd_rcpt_iv_no_flg_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no_flg) doCnd_rcpt_iv_mng_no_flg_NC(info);
		else if (nc == Cnd_purc_act_no_flg) doCnd_purc_act_no_flg_NC(info);
		else if (nc == Cnd_wrk_no_flg) doCnd_wrk_no_flg_NC(info);
		else if (nc == Cnd_psppl_cd_flg) doCnd_psppl_cd_flg_NC(info);
		else if (nc == Cnd_pay_dpt_cd_flg) doCnd_pay_dpt_cd_flg_NC(info);
		else if (nc == Cnd_pay_dpt_nm_flg) doCnd_pay_dpt_nm_flg_NC(info);
		else if (nc == Cnd_asppl_cd_flg) doCnd_asppl_cd_flg_NC(info);
		else if (nc == Cnd_pay_sts_typ_flg) doCnd_pay_sts_typ_flg_NC(info);
		else if (nc == Cnd_ap_dpt_cd_flg) doCnd_ap_dpt_cd_flg_NC(info);
		else if (nc == Cnd_ap_dpt_nm_flg) doCnd_ap_dpt_nm_flg_NC(info);
		else if (nc == Cnd_pay_bank_ac_cd_flg) doCnd_pay_bank_ac_cd_flg_NC(info);
		else if (nc == Cnd_bank_ac_cd_flg) doCnd_bank_ac_cd_flg_NC(info);
		else if (nc == Cnd_setoff_info_flg) doCnd_setoff_info_flg_NC(info);
		else if (nc == Cnd_xrate_flg) doCnd_xrate_flg_NC(info);
		else if (nc == Cnd_com_paid_tax_cd_flg) doCnd_com_paid_tax_cd_flg_NC(info);
		else if (nc == Cnd_rcv_bill_no_flg) doCnd_rcv_bill_no_flg_NC(info);
		else if (nc == Cnd_adv_pay_act_no_flg) doCnd_adv_pay_act_no_flg_NC(info);
		else if (nc == Cnd_note_info_flg) doCnd_note_info_flg_NC(info);
		else if (nc == Cnd_rmrks_flg) doCnd_rmrks_flg_NC(info);
		else if (nc == LPnl_key_flg) doLPnl_key_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_ap_typ) doRslt_ap_typ_NC(info);
		else if (nc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NC(info);
		else if (nc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NC(info);
		else if (nc == columnRslt_pay_schd_act_dt) doRslt_pay_schd_act_dt_NC(info);
		else if (nc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_delay) doRslt_delay_NC(info);
		else if (nc == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NC(info);
		else if (nc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_pay_xrate) doRslt_pay_xrate_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_pay_chk_no) doRslt_pay_chk_no_NC(info);
		else if (nc == columnRslt_pay_schd_no) doRslt_pay_schd_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_purc_act_no) doRslt_purc_act_no_NC(info);
		else if (nc == columnRslt_psppl_cd) doRslt_psppl_cd_NC(info);
		else if (nc == columnRslt_psppl_nm) doRslt_psppl_nm_NC(info);
		else if (nc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NC(info);
		else if (nc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NC(info);
		else if (nc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NC(info);
		else if (nc == columnRslt_sw_flg) doRslt_sw_flg_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NC(info);
		else if (nc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_NC(info);
		else if (nc == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_NC(info);
		else if (nc == columnRslt_setoff_cd) doRslt_setoff_cd_NC(info);
		else if (nc == columnRslt_setoff_nm) doRslt_setoff_nm_NC(info);
		else if (nc == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NC(info);
		else if (nc == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_com_paid_tax_cd) doRslt_com_paid_tax_cd_NC(info);
		else if (nc == columnRslt_com_paid_tax_nm) doRslt_com_paid_tax_nm_NC(info);
		else if (nc == columnRslt_com_paid_tax_rate) doRslt_com_paid_tax_rate_NC(info);
		else if (nc == columnRslt_com_paid_tax_amt) doRslt_com_paid_tax_amt_NC(info);
		else if (nc == columnRslt_exc_com_paid) doRslt_exc_com_paid_NC(info);
		else if (nc == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NC(info);
		else if (nc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_note_typ) doRslt_note_typ_NC(info);
		else if (nc == columnRslt_note_typ_nm) doRslt_note_typ_nm_NC(info);
		else if (nc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NC(info);
		else if (nc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NC(info);
		else if (nc == columnRslt_draw_dt) doRslt_draw_dt_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_note_days) doRslt_note_days_NC(info);
		else if (nc == columnRslt_drawer_nm) doRslt_drawer_nm_NC(info);
		else if (nc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NC(info);
		else if (nc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NC(info);
		else if (nc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NC(info);
		else if (nc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NC(info);
		else if (nc == columnRslt_endrsr) doRslt_endrsr_NC(info);
		else if (nc == columnRslt_accptr) doRslt_accptr_NC(info);
		else if (nc == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_NC(info);
		else if (nc == columnRslt_pay_schd_print_rmrks) doRslt_pay_schd_print_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_aprv_no) doRslt_aprv_no_NC(info);
		else if (nc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_flg) doRslt_aprv_flg_NC(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excld_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excld_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_com_paid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_com_paid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_ym_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_ym_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_day_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_day_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[wrk_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_bank_ac_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_bank_ac_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_info_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_info_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[com_paid_tax_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_com_paid_tax_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_bill_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_bill_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_info_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_info_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_flg_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_key_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_act_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[delay]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sw_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exc_com_paid]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exc_com_paid_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_mode_Group) doCnd_mode_NE(info);
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_acpt_flg) doCnd_acpt_flg_NE(info);
		else if (ne == Cnd_rjct_flg) doCnd_rjct_flg_NE(info);
		else if (ne == Cnd_last_rjct_flg) doCnd_last_rjct_flg_NE(info);
		else if (ne == Cnd_excld_flg) doCnd_excld_flg_NE(info);
		else if (ne == Cnd_pay_schd_act_dt_fr) doCnd_pay_schd_act_dt_fr_NE(info);
		else if (ne == Cnd_pay_schd_act_dt_to) doCnd_pay_schd_act_dt_to_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_pay_chk_no) doCnd_pay_chk_no_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_ap_typ) doCnd_ap_typ_NE(info);
		else if (ne == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NE(info);
		else if (ne == Cnd_psppl_cd) doCnd_psppl_cd_NE(info);
		else if (ne == Cnd_psppl_nm) doCnd_psppl_nm_NE(info);
		else if (ne == Cnd_pay_schd_print_rmrks) doCnd_pay_schd_print_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dtl_flg) doCnd_dtl_flg_NE(info);
		else if (ne == Cnd_inc_appl_flg) doCnd_inc_appl_flg_NE(info);
		else if (ne == Cnd_inc_com_paid_flg) doCnd_inc_com_paid_flg_NE(info);
		else if (ne == Cnd_rfrnc_dt) doCnd_rfrnc_dt_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd_flg) doCnd_bsppl_dpt_cd_flg_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm_flg) doCnd_bsppl_dpt_nm_flg_NE(info);
		else if (ne == Cnd_wg_cd_flg) doCnd_wg_cd_flg_NE(info);
		else if (ne == Cnd_bsppl_cd_flg) doCnd_bsppl_cd_flg_NE(info);
		else if (ne == Cnd_ap_typ_flg) doCnd_ap_typ_flg_NE(info);
		else if (ne == Cnd_pay_schd_dt_flg) doCnd_pay_schd_dt_flg_NE(info);
		else if (ne == Cnd_ap_sttl_cd_flg) doCnd_ap_sttl_cd_flg_NE(info);
		else if (ne == Cnd_ap_sttl_typ_flg) doCnd_ap_sttl_typ_flg_NE(info);
		else if (ne == Cnd_bsppl_cl_ym_flg) doCnd_bsppl_cl_ym_flg_NE(info);
		else if (ne == Cnd_bsppl_cl_day_flg) doCnd_bsppl_cl_day_flg_NE(info);
		else if (ne == Cnd_trd_cur_cd_flg) doCnd_trd_cur_cd_flg_NE(info);
		else if (ne == Cnd_pay_chk_no_flg) doCnd_pay_chk_no_flg_NE(info);
		else if (ne == Cnd_pay_schd_no_flg) doCnd_pay_schd_no_flg_NE(info);
		else if (ne == Cnd_rcpt_iv_no_flg) doCnd_rcpt_iv_no_flg_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no_flg) doCnd_rcpt_iv_mng_no_flg_NE(info);
		else if (ne == Cnd_purc_act_no_flg) doCnd_purc_act_no_flg_NE(info);
		else if (ne == Cnd_wrk_no_flg) doCnd_wrk_no_flg_NE(info);
		else if (ne == Cnd_psppl_cd_flg) doCnd_psppl_cd_flg_NE(info);
		else if (ne == Cnd_pay_dpt_cd_flg) doCnd_pay_dpt_cd_flg_NE(info);
		else if (ne == Cnd_pay_dpt_nm_flg) doCnd_pay_dpt_nm_flg_NE(info);
		else if (ne == Cnd_asppl_cd_flg) doCnd_asppl_cd_flg_NE(info);
		else if (ne == Cnd_pay_sts_typ_flg) doCnd_pay_sts_typ_flg_NE(info);
		else if (ne == Cnd_ap_dpt_cd_flg) doCnd_ap_dpt_cd_flg_NE(info);
		else if (ne == Cnd_ap_dpt_nm_flg) doCnd_ap_dpt_nm_flg_NE(info);
		else if (ne == Cnd_pay_bank_ac_cd_flg) doCnd_pay_bank_ac_cd_flg_NE(info);
		else if (ne == Cnd_bank_ac_cd_flg) doCnd_bank_ac_cd_flg_NE(info);
		else if (ne == Cnd_setoff_info_flg) doCnd_setoff_info_flg_NE(info);
		else if (ne == Cnd_xrate_flg) doCnd_xrate_flg_NE(info);
		else if (ne == Cnd_com_paid_tax_cd_flg) doCnd_com_paid_tax_cd_flg_NE(info);
		else if (ne == Cnd_rcv_bill_no_flg) doCnd_rcv_bill_no_flg_NE(info);
		else if (ne == Cnd_adv_pay_act_no_flg) doCnd_adv_pay_act_no_flg_NE(info);
		else if (ne == Cnd_note_info_flg) doCnd_note_info_flg_NE(info);
		else if (ne == Cnd_rmrks_flg) doCnd_rmrks_flg_NE(info);
		else if (ne == LPnl_key_flg) doLPnl_key_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_ap_typ) doRslt_ap_typ_NE(info);
		else if (ne == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NE(info);
		else if (ne == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NE(info);
		else if (ne == columnRslt_pay_schd_act_dt) doRslt_pay_schd_act_dt_NE(info);
		else if (ne == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_delay) doRslt_delay_NE(info);
		else if (ne == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NE(info);
		else if (ne == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_pay_xrate) doRslt_pay_xrate_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_pay_chk_no) doRslt_pay_chk_no_NE(info);
		else if (ne == columnRslt_pay_schd_no) doRslt_pay_schd_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_purc_act_no) doRslt_purc_act_no_NE(info);
		else if (ne == columnRslt_psppl_cd) doRslt_psppl_cd_NE(info);
		else if (ne == columnRslt_psppl_nm) doRslt_psppl_nm_NE(info);
		else if (ne == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NE(info);
		else if (ne == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NE(info);
		else if (ne == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NE(info);
		else if (ne == columnRslt_sw_flg) doRslt_sw_flg_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NE(info);
		else if (ne == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_NE(info);
		else if (ne == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_NE(info);
		else if (ne == columnRslt_setoff_cd) doRslt_setoff_cd_NE(info);
		else if (ne == columnRslt_setoff_nm) doRslt_setoff_nm_NE(info);
		else if (ne == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NE(info);
		else if (ne == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_com_paid_tax_cd) doRslt_com_paid_tax_cd_NE(info);
		else if (ne == columnRslt_com_paid_tax_nm) doRslt_com_paid_tax_nm_NE(info);
		else if (ne == columnRslt_com_paid_tax_rate) doRslt_com_paid_tax_rate_NE(info);
		else if (ne == columnRslt_com_paid_tax_amt) doRslt_com_paid_tax_amt_NE(info);
		else if (ne == columnRslt_exc_com_paid) doRslt_exc_com_paid_NE(info);
		else if (ne == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NE(info);
		else if (ne == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_note_typ) doRslt_note_typ_NE(info);
		else if (ne == columnRslt_note_typ_nm) doRslt_note_typ_nm_NE(info);
		else if (ne == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NE(info);
		else if (ne == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NE(info);
		else if (ne == columnRslt_draw_dt) doRslt_draw_dt_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_note_days) doRslt_note_days_NE(info);
		else if (ne == columnRslt_drawer_nm) doRslt_drawer_nm_NE(info);
		else if (ne == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NE(info);
		else if (ne == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NE(info);
		else if (ne == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NE(info);
		else if (ne == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NE(info);
		else if (ne == columnRslt_endrsr) doRslt_endrsr_NE(info);
		else if (ne == columnRslt_accptr) doRslt_accptr_NE(info);
		else if (ne == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_NE(info);
		else if (ne == columnRslt_pay_schd_print_rmrks) doRslt_pay_schd_print_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_aprv_no) doRslt_aprv_no_NE(info);
		else if (ne == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_flg) doRslt_aprv_flg_NE(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excld_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excld_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_com_paid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_com_paid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_ym_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_ym_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_day_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_day_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[wrk_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_bank_ac_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_bank_ac_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_info_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_info_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[com_paid_tax_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_com_paid_tax_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_bill_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_bill_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_info_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_info_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_flg_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_key_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_act_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[delay]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sw_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exc_com_paid]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exc_com_paid_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_mode_Group) doCnd_mode_NX(info);
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_acpt_flg) doCnd_acpt_flg_NX(info);
		else if (nx == Cnd_rjct_flg) doCnd_rjct_flg_NX(info);
		else if (nx == Cnd_last_rjct_flg) doCnd_last_rjct_flg_NX(info);
		else if (nx == Cnd_excld_flg) doCnd_excld_flg_NX(info);
		else if (nx == Cnd_pay_schd_act_dt_fr) doCnd_pay_schd_act_dt_fr_NX(info);
		else if (nx == Cnd_pay_schd_act_dt_to) doCnd_pay_schd_act_dt_to_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_pay_chk_no) doCnd_pay_chk_no_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_ap_typ) doCnd_ap_typ_NX(info);
		else if (nx == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NX(info);
		else if (nx == Cnd_psppl_cd) doCnd_psppl_cd_NX(info);
		else if (nx == Cnd_psppl_nm) doCnd_psppl_nm_NX(info);
		else if (nx == Cnd_pay_schd_print_rmrks) doCnd_pay_schd_print_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dtl_flg) doCnd_dtl_flg_NX(info);
		else if (nx == Cnd_inc_appl_flg) doCnd_inc_appl_flg_NX(info);
		else if (nx == Cnd_inc_com_paid_flg) doCnd_inc_com_paid_flg_NX(info);
		else if (nx == Cnd_rfrnc_dt) doCnd_rfrnc_dt_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd_flg) doCnd_bsppl_dpt_cd_flg_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm_flg) doCnd_bsppl_dpt_nm_flg_NX(info);
		else if (nx == Cnd_wg_cd_flg) doCnd_wg_cd_flg_NX(info);
		else if (nx == Cnd_bsppl_cd_flg) doCnd_bsppl_cd_flg_NX(info);
		else if (nx == Cnd_ap_typ_flg) doCnd_ap_typ_flg_NX(info);
		else if (nx == Cnd_pay_schd_dt_flg) doCnd_pay_schd_dt_flg_NX(info);
		else if (nx == Cnd_ap_sttl_cd_flg) doCnd_ap_sttl_cd_flg_NX(info);
		else if (nx == Cnd_ap_sttl_typ_flg) doCnd_ap_sttl_typ_flg_NX(info);
		else if (nx == Cnd_bsppl_cl_ym_flg) doCnd_bsppl_cl_ym_flg_NX(info);
		else if (nx == Cnd_bsppl_cl_day_flg) doCnd_bsppl_cl_day_flg_NX(info);
		else if (nx == Cnd_trd_cur_cd_flg) doCnd_trd_cur_cd_flg_NX(info);
		else if (nx == Cnd_pay_chk_no_flg) doCnd_pay_chk_no_flg_NX(info);
		else if (nx == Cnd_pay_schd_no_flg) doCnd_pay_schd_no_flg_NX(info);
		else if (nx == Cnd_rcpt_iv_no_flg) doCnd_rcpt_iv_no_flg_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no_flg) doCnd_rcpt_iv_mng_no_flg_NX(info);
		else if (nx == Cnd_purc_act_no_flg) doCnd_purc_act_no_flg_NX(info);
		else if (nx == Cnd_wrk_no_flg) doCnd_wrk_no_flg_NX(info);
		else if (nx == Cnd_psppl_cd_flg) doCnd_psppl_cd_flg_NX(info);
		else if (nx == Cnd_pay_dpt_cd_flg) doCnd_pay_dpt_cd_flg_NX(info);
		else if (nx == Cnd_pay_dpt_nm_flg) doCnd_pay_dpt_nm_flg_NX(info);
		else if (nx == Cnd_asppl_cd_flg) doCnd_asppl_cd_flg_NX(info);
		else if (nx == Cnd_pay_sts_typ_flg) doCnd_pay_sts_typ_flg_NX(info);
		else if (nx == Cnd_ap_dpt_cd_flg) doCnd_ap_dpt_cd_flg_NX(info);
		else if (nx == Cnd_ap_dpt_nm_flg) doCnd_ap_dpt_nm_flg_NX(info);
		else if (nx == Cnd_pay_bank_ac_cd_flg) doCnd_pay_bank_ac_cd_flg_NX(info);
		else if (nx == Cnd_bank_ac_cd_flg) doCnd_bank_ac_cd_flg_NX(info);
		else if (nx == Cnd_setoff_info_flg) doCnd_setoff_info_flg_NX(info);
		else if (nx == Cnd_xrate_flg) doCnd_xrate_flg_NX(info);
		else if (nx == Cnd_com_paid_tax_cd_flg) doCnd_com_paid_tax_cd_flg_NX(info);
		else if (nx == Cnd_rcv_bill_no_flg) doCnd_rcv_bill_no_flg_NX(info);
		else if (nx == Cnd_adv_pay_act_no_flg) doCnd_adv_pay_act_no_flg_NX(info);
		else if (nx == Cnd_note_info_flg) doCnd_note_info_flg_NX(info);
		else if (nx == Cnd_rmrks_flg) doCnd_rmrks_flg_NX(info);
		else if (nx == LPnl_key_flg) doLPnl_key_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_ap_typ) doRslt_ap_typ_NX(info);
		else if (nx == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NX(info);
		else if (nx == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NX(info);
		else if (nx == columnRslt_pay_schd_act_dt) doRslt_pay_schd_act_dt_NX(info);
		else if (nx == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_delay) doRslt_delay_NX(info);
		else if (nx == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NX(info);
		else if (nx == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_pay_xrate) doRslt_pay_xrate_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_pay_chk_no) doRslt_pay_chk_no_NX(info);
		else if (nx == columnRslt_pay_schd_no) doRslt_pay_schd_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_purc_act_no) doRslt_purc_act_no_NX(info);
		else if (nx == columnRslt_psppl_cd) doRslt_psppl_cd_NX(info);
		else if (nx == columnRslt_psppl_nm) doRslt_psppl_nm_NX(info);
		else if (nx == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NX(info);
		else if (nx == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NX(info);
		else if (nx == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NX(info);
		else if (nx == columnRslt_sw_flg) doRslt_sw_flg_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NX(info);
		else if (nx == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_NX(info);
		else if (nx == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_NX(info);
		else if (nx == columnRslt_setoff_cd) doRslt_setoff_cd_NX(info);
		else if (nx == columnRslt_setoff_nm) doRslt_setoff_nm_NX(info);
		else if (nx == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NX(info);
		else if (nx == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_com_paid_tax_cd) doRslt_com_paid_tax_cd_NX(info);
		else if (nx == columnRslt_com_paid_tax_nm) doRslt_com_paid_tax_nm_NX(info);
		else if (nx == columnRslt_com_paid_tax_rate) doRslt_com_paid_tax_rate_NX(info);
		else if (nx == columnRslt_com_paid_tax_amt) doRslt_com_paid_tax_amt_NX(info);
		else if (nx == columnRslt_exc_com_paid) doRslt_exc_com_paid_NX(info);
		else if (nx == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NX(info);
		else if (nx == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_note_typ) doRslt_note_typ_NX(info);
		else if (nx == columnRslt_note_typ_nm) doRslt_note_typ_nm_NX(info);
		else if (nx == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NX(info);
		else if (nx == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NX(info);
		else if (nx == columnRslt_draw_dt) doRslt_draw_dt_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_note_days) doRslt_note_days_NX(info);
		else if (nx == columnRslt_drawer_nm) doRslt_drawer_nm_NX(info);
		else if (nx == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NX(info);
		else if (nx == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NX(info);
		else if (nx == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NX(info);
		else if (nx == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NX(info);
		else if (nx == columnRslt_endrsr) doRslt_endrsr_NX(info);
		else if (nx == columnRslt_accptr) doRslt_accptr_NX(info);
		else if (nx == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_NX(info);
		else if (nx == columnRslt_pay_schd_print_rmrks) doRslt_pay_schd_print_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_aprv_no) doRslt_aprv_no_NX(info);
		else if (nx == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_flg) doRslt_aprv_flg_NX(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[last_rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_last_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excld_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excld_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_com_paid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_com_paid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_ym_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_ym_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_day_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_day_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[wrk_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_sts_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_sts_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_bank_ac_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_bank_ac_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bank_ac_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bank_ac_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_info_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_info_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[com_paid_tax_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_com_paid_tax_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_bill_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_bill_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adv_pay_act_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adv_pay_act_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_info_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_info_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_flg_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_key_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_act_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[delay]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sw_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exc_com_paid]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exc_com_paid_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_pay_schd_act_dt_fr) doCnd_pay_schd_act_dt_fr_LC(info);
		else if (lc == Cnd_pay_schd_act_dt_to) doCnd_pay_schd_act_dt_to_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_pay_chk_no) doCnd_pay_chk_no_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Cnd_ap_typ) doCnd_ap_typ_LC(info);
		else if (lc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_LC(info);
		else if (lc == Cnd_psppl_cd) doCnd_psppl_cd_LC(info);
		else if (lc == Cnd_psppl_nm) doCnd_psppl_nm_LC(info);
		else if (lc == Cnd_pay_schd_print_rmrks) doCnd_pay_schd_print_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_rfrnc_dt) doCnd_rfrnc_dt_LC(info);
		else if (lc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_ap_typ) doRslt_ap_typ_LC(info);
		else if (lc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_LC(info);
		else if (lc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_LC(info);
		else if (lc == columnRslt_pay_schd_act_dt) doRslt_pay_schd_act_dt_LC(info);
		else if (lc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_delay) doRslt_delay_LC(info);
		else if (lc == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_LC(info);
		else if (lc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_pay_xrate) doRslt_pay_xrate_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_pay_chk_no) doRslt_pay_chk_no_LC(info);
		else if (lc == columnRslt_pay_schd_no) doRslt_pay_schd_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_purc_act_no) doRslt_purc_act_no_LC(info);
		else if (lc == columnRslt_psppl_cd) doRslt_psppl_cd_LC(info);
		else if (lc == columnRslt_psppl_nm) doRslt_psppl_nm_LC(info);
		else if (lc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_LC(info);
		else if (lc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_LC(info);
		else if (lc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_LC(info);
		else if (lc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_LC(info);
		else if (lc == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_LC(info);
		else if (lc == columnRslt_setoff_cd) doRslt_setoff_cd_LC(info);
		else if (lc == columnRslt_setoff_nm) doRslt_setoff_nm_LC(info);
		else if (lc == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_LC(info);
		else if (lc == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_com_paid_tax_cd) doRslt_com_paid_tax_cd_LC(info);
		else if (lc == columnRslt_com_paid_tax_nm) doRslt_com_paid_tax_nm_LC(info);
		else if (lc == columnRslt_com_paid_tax_rate) doRslt_com_paid_tax_rate_LC(info);
		else if (lc == columnRslt_com_paid_tax_amt) doRslt_com_paid_tax_amt_LC(info);
		else if (lc == columnRslt_exc_com_paid) doRslt_exc_com_paid_LC(info);
		else if (lc == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_LC(info);
		else if (lc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_note_typ) doRslt_note_typ_LC(info);
		else if (lc == columnRslt_note_typ_nm) doRslt_note_typ_nm_LC(info);
		else if (lc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_LC(info);
		else if (lc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_LC(info);
		else if (lc == columnRslt_draw_dt) doRslt_draw_dt_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_note_days) doRslt_note_days_LC(info);
		else if (lc == columnRslt_drawer_nm) doRslt_drawer_nm_LC(info);
		else if (lc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_LC(info);
		else if (lc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_LC(info);
		else if (lc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_LC(info);
		else if (lc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_LC(info);
		else if (lc == columnRslt_endrsr) doRslt_endrsr_LC(info);
		else if (lc == columnRslt_accptr) doRslt_accptr_LC(info);
		else if (lc == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_LC(info);
		else if (lc == columnRslt_pay_schd_print_rmrks) doRslt_pay_schd_print_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_aprv_no) doRslt_aprv_no_LC(info);
		else if (lc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_LC(info);
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
	 * [Cnd]パネルの[pay_schd_act_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_act_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_act_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rfrnc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_act_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[delay]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[com_paid_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_com_paid_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exc_com_paid]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exc_com_paid_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_psppl_cd]の作成メソッド
	 */
	public MCList getCnd_psppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0050.Srch01")) {
			return new MS_MSBHL0050_Srch01Bridge();
		}
		if (id.equals("MS.MSBHL0050.Srch02")) {
			return new MS_MSBHL0050_Srch02Bridge();
		}
		if (id.equals("MS.MSBHL0050.Prnt01")) {
			return new MS_MSBHL0050_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0050_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0050_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0050_Srch01Bridge() {
			p_MS_MSBHL0050_Srch01 = new MCParam(PDef.MS_MSBHL0050_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0050_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0050.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0050.RsltR.class));

			p_MS_MSBHL0050_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0050_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0050_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0050_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0050_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0050.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0050.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0050_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0050_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0050.RsltR>)p_MS_MSBHL0050_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBHL0050_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0050_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0050_Srch02;

		/** コンストラクタ */
		protected MS_MSBHL0050_Srch02Bridge() {
			p_MS_MSBHL0050_Srch02 = new MCParam(PDef.MS_MSBHL0050_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0050_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0050.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0050.RsltR.class));

			p_MS_MSBHL0050_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0050_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0050_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0050_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0050_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0050.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0050.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0050_Srch02.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0050_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0050.RsltR>)p_MS_MSBHL0050_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBHL0050_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0050_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0050_Prnt01;

		/** コンストラクタ */
		protected MS_MSBHL0050_Prnt01Bridge() {
			p_MS_MSBHL0050_Prnt01 = new MCParam(PDef.MS_MSBHL0050_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0050_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0050.RsltR.class));
			// Down

			p_MS_MSBHL0050_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0050_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0050_Prnt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0050_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0050_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0050.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBHL0050_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}