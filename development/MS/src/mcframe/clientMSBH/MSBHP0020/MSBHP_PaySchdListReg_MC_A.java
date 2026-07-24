package mcframe.clientMSBH.MSBHP0020;

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
import mcframe.clientMSBH.MSBHP0020.MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Srch01Caller;
import mcframe.clientMSBH.MSBHP0020.MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Ins01Caller;
import mcframe.clientMSBH.MSBHP0020.MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Del01Caller;
import mcframe.clientMSBH.MSBHP0020.MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Prnt01Caller;

/**
 * 画面"MSBHP_PaySchdListReg"パネルクラスです。<p>
 *
 * 支払予定を一覧形式で登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_PaySchdListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0020";

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
	// [Sts]ブロック関連のField定義
	public MCPanel StsPanel = null;
	public MCTitledBorder StsTitledBorder = null;
	// [Sts]ブロックの項目のField定義
	// [Aprv]ブロック関連のField定義
	public MCPanel AprvPanel = null;
	public MCTitledBorder AprvTitledBorder = null;
	// [Aprv]ブロックの項目のField定義
	// [CndPrnt]ブロック関連のField定義
	public MCPanel CndPrntPanel = null;
	public MCTitledBorder CndPrntTitledBorder = null;
	// [CndPrnt]ブロックの項目のField定義
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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create;DEL,Cancel;PRT,Issue report;REF,View; INS,登録する;DEL,取り消す;PRT,帳票発行;REF,参照する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_PRT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public MCCheckBox Cnd_unchk_flg = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCCheckBox Cnd_schd_flg = null;
	/**
	 * Paid 支払済.<p>
	 *
	 */
	public MCCheckBox Cnd_act_flg = null;
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public MCCheckBox Cnd_aprv_opn_flg = null;
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_aprv_fix_flg = null;
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public MCCheckBox Cnd_aprv_acpt_flg = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCCheckBox Cnd_aprv_rjct_flg = null;
	/**
	 * Denied 否認.<p>
	 *
	 */
	public MCCheckBox Cnd_aprv_last_rjct_flg = null;
	/**
	 * Non-target/Uncollated 対象外・未照合.<p>
	 *
	 */
	public MCCheckBox Cnd_aprv_none_flg = null;
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
	public MCLabel Cnd_reg_dt_fr_Label = null;
	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_reg_dt_fr = null;
	public MCLabel Cnd_reg_dt_to_Label = null;
	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_reg_dt_to = null;
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
	public MCLabel Cnd_pay_chk_no_Label = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_chk_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	/**
	 * Include not for payment 支払対象外含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_no_pay_flg = null;
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_interim_flg = null;
	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public MCCheckBox Cnd_manual_flg = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox Cnd_pay_spot_flg = null;
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public MCCheckBox Cnd_batch_pay_schd_cl_flg = null;
	/**
	 * Display latest only 最新のみ表示.<p>
	 *
	 */
	public MCCheckBox Cnd_new_flg = null;
	public MCLabel Cnd_pay_schd_d_print_rmrks_Label = null;
	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public MCTextField Cnd_pay_schd_d_print_rmrks = null;
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
	public MCLabel BulkSet_reg_dt_Label = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDateField BulkSet_reg_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_bsppl_usr_dpt_p_PPanel;
	public MCTextField BulkSet_bsppl_usr_cd;	// [BulkSet]の[bsppl_usr_dpt_p.usr_cd]を[BulkSet_bsppl_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_bsppl_usr_nm;	// [BulkSet]の[bsppl_usr_dpt_p.usr_nm]を[BulkSet_bsppl_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_bsppl_dpt_cd;	// [BulkSet]の[bsppl_usr_dpt_p.dpt_cd]を[BulkSet_bsppl_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_bsppl_dpt_nm;	// [BulkSet]の[bsppl_usr_dpt_p.dpt_nm]を[BulkSet_bsppl_dpt_nm]としてエイリアス定義。
	public MCLabel BulkSet_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField BulkSet_wg_nm = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_flg = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_reg_dt = null;
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
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_nm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_bsppl_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_bsppl_usr_cd;// [Rslt]の[bsppl_usr_dpt_p.usr_cd]を[columnRslt_bsppl_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_usr_nm;// [Rslt]の[bsppl_usr_dpt_p.usr_nm]を[columnRslt_bsppl_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_dpt_cd;// [Rslt]の[bsppl_usr_dpt_p.dpt_cd]を[columnRslt_bsppl_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_dpt_nm;// [Rslt]の[bsppl_usr_dpt_p.dpt_nm]を[columnRslt_bsppl_dpt_nm]としてエイリアス定義。
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
	 * Closing year and month 締年月日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_dt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_amt_p_PPanel;
	public MCColumnConfig columnRslt_amt;// [Rslt]の[amt_p.amt]を[columnRslt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_com_paid_p_PPanel;
	public MCColumnConfig columnRslt_com_paid;// [Rslt]の[com_paid_p.amt]を[columnRslt_com_paid]としてエイリアス定義。
	public MCColumnConfig columnRslt_com_paid_tax_amt;// [Rslt]の[com_paid_p.tax_amt]を[columnRslt_com_paid_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_last_pay_schd_amt_p_PPanel;
	public MCColumnConfig columnRslt_last_pay_schd_amt;// [Rslt]の[last_pay_schd_amt_p.amt]を[columnRslt_last_pay_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_account_amt_p_PPanel;
	public MCColumnConfig columnRslt_account_amt;// [Rslt]の[account_amt_p.amt]を[columnRslt_account_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_cash_amt_p_PPanel;
	public MCColumnConfig columnRslt_cash_amt;// [Rslt]の[cash_amt_p.amt]を[columnRslt_cash_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_note_amt_p_PPanel;
	public MCColumnConfig columnRslt_note_amt;// [Rslt]の[note_amt_p.amt]を[columnRslt_note_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_sw_amt_p_PPanel;
	public MCColumnConfig columnRslt_sw_amt;// [Rslt]の[sw_amt_p.amt]を[columnRslt_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_bfw_amt_p_PPanel;
	public MCColumnConfig columnRslt_bfw_amt;// [Rslt]の[bfw_amt_p.amt]を[columnRslt_bfw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_purc_amt_p_PPanel;
	public MCColumnConfig columnRslt_purc_amt;// [Rslt]の[purc_amt_p.amt]を[columnRslt_purc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_purc_ret_amt_p_PPanel;
	public MCColumnConfig columnRslt_purc_ret_amt;// [Rslt]の[purc_ret_amt_p.amt]を[columnRslt_purc_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_purc_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_purc_dscnt_amt;// [Rslt]の[purc_dscnt_amt_p.amt]を[columnRslt_purc_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_setoff_amt_p_PPanel;
	public MCColumnConfig columnRslt_setoff_amt;// [Rslt]の[setoff_amt_p.amt]を[columnRslt_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_setoff_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_setoff_tax_amt;// [Rslt]の[setoff_tax_amt_p.amt]を[columnRslt_setoff_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_tax_amt;// [Rslt]の[tax_amt_p.amt]を[columnRslt_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_sw_to_amt_p_PPanel;
	public MCColumnConfig columnRslt_sw_to_amt;// [Rslt]の[sw_to_amt_p.amt]を[columnRslt_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_schd_pay_amt_p_PPanel;
	public MCColumnConfig columnRslt_schd_pay_amt;// [Rslt]の[schd_pay_amt_p.amt]を[columnRslt_schd_pay_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_adv_pay_bal_p_PPanel;
	public MCColumnConfig columnRslt_adv_pay_bal;// [Rslt]の[adv_pay_bal_p.amt]を[columnRslt_adv_pay_bal]としてエイリアス定義。
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
	 * Base unit transaction currency cd. 基準単位取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_pay_xrate_p_PPanel;
	public MCColumnConfig columnRslt_pay_xrate;// [Rslt]の[pay_xrate_p.xrate]を[columnRslt_pay_xrate]としてエイリアス定義。
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_xrate_p_PPanel;
	public MCColumnConfig columnRslt_xrate;// [Rslt]の[xrate_p.xrate]を[columnRslt_xrate]としてエイリアス定義。
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inc_interim_flg = null;
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_interim_cl_flg = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_no = null;
	/**
	 * Notice rev. number 通知書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_ntc_rev = null;
	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unchk_flg = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_flg = null;
	/**
	 * Paid 支払済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_flg = null;
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
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_rvrs_flg = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_flg = null;
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_upd_flg = null;
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_can_flg = null;
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
	 * Payment unit tax 支払単位税.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_on_pay_flg = null;
	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public MCColumnConfig columnRslt_manual_flg = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_spot_flg = null;
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public MCColumnConfig columnRslt_batch_pay_schd_cl_flg = null;
	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_d_print_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	/**
	 * Exchange rate base date 為替レート基準日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_base_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Payment schedule entry 支払予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0030 = null;
	/**
	 * Correction of purchase details 仕入明細訂正登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0190 = null;
	/**
	 * Payment notice 支払通知書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_out_flg = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_INS, INS, SRCH_DEL, DEL, SRCH, REF, SRCH_PRNT, PRNT};
	
	/** [MS_MSBHL0020_Srch01]のCallerの作成 */
	protected MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Srch01Caller createMS_MSBHL0020_Srch01() {
		MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Srch01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Srch01Bridge>
		caller = ((MSBHP_PaySchdListReg_MC)this).new MS_MSBHL0020_Srch01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Srch01Bridge>(
					(MSBHP_PaySchdListReg)this, new MS_MSBHL0020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0020_Srch01]の呼び出し */
	protected void callMS_MSBHL0020_Srch01() {
		MCCaller caller = createMS_MSBHL0020_Srch01();
		caller.exec();
	}
	/** [MS_MSBHL0020_Ins01]のCallerの作成 */
	protected MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Ins01Caller createMS_MSBHL0020_Ins01() {
		MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Ins01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Ins01Bridge>
		caller = ((MSBHP_PaySchdListReg_MC)this).new MS_MSBHL0020_Ins01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Ins01Bridge>(
					(MSBHP_PaySchdListReg)this, new MS_MSBHL0020_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBHL0020_Ins01]の呼び出し */
	protected void callMS_MSBHL0020_Ins01() {
		MCCaller caller = createMS_MSBHL0020_Ins01();
		caller.exec();
	}
	/** [MS_MSBHL0020_Del01]のCallerの作成 */
	protected MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Del01Caller createMS_MSBHL0020_Del01() {
		MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Del01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Del01Bridge>
		caller = ((MSBHP_PaySchdListReg_MC)this).new MS_MSBHL0020_Del01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Del01Bridge>(
					(MSBHP_PaySchdListReg)this, new MS_MSBHL0020_Del01Bridge());
		return caller;
	}
	/** [MS_MSBHL0020_Del01]の呼び出し */
	protected void callMS_MSBHL0020_Del01() {
		MCCaller caller = createMS_MSBHL0020_Del01();
		caller.exec();
	}
	/** [MS_MSBHL0020_Prnt01]のCallerの作成 */
	protected MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Prnt01Caller createMS_MSBHL0020_Prnt01() {
		MSBHP_PaySchdListReg_MC.MS_MSBHL0020_Prnt01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Prnt01Bridge>
		caller = ((MSBHP_PaySchdListReg_MC)this).new MS_MSBHL0020_Prnt01Caller<MSBHP_PaySchdListReg, MS_MSBHL0020_Prnt01Bridge>(
					(MSBHP_PaySchdListReg)this, new MS_MSBHL0020_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBHL0020_Prnt01]の呼び出し */
	protected void callMS_MSBHL0020_Prnt01() {
		MCCaller caller = createMS_MSBHL0020_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0020.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0020.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0020.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0020.BtnR aBtnR;
	/** [Apd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0020.ApdR> aApdL;
	/** [PayAct]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0020.PayActR> aPayActL;
	/** [AdvPayAct]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR> aAdvPayActL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0020.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0020.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBH.MSBHP0020.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBH.MSBHP0020.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBH.MSBHP0020.BulkSetR createBulkSetR() {
		return mcframe.clientMSBH.MSBHP0020.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0020.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBH.MSBHP0020.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBH.MSBHP0020.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBH.MSBHP0020.BtnR createBtnR() {
		return mcframe.clientMSBH.MSBHP0020.BtnR.create();
	}

	/**
	 * コピーによってaApdLを設定します。
	 *
	 * aApdLのインスタンスは変更されません。
	 *
	 * @param dataset ApdL
	 */
	public void setApdL(MCList<mcframe.clientMSBH.MSBHP0020.ApdR> aList) {
		if (getApdL() != aList) {
			getApdL().setAll(aList);
		}
	}

	/**
	 * [Apd]ブロックのコンテナaApdLを返します。
	 *
	 * @return ApdL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.ApdR> getApdL() {
		return aApdL;
	}

	/**
	 * aApdRを作成します。
	 *
	 * @return ApdR
	 */
	public mcframe.clientMSBH.MSBHP0020.ApdR createApdR() {
		return mcframe.clientMSBH.MSBHP0020.ApdR.create();
	}

	/**
	 * aApdLを作成します。
	 *
	 * @return ApdL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.ApdR> createApdL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0020.ApdR.class);
	}

	/**
	 * コピーによってaPayActLを設定します。
	 *
	 * aPayActLのインスタンスは変更されません。
	 *
	 * @param dataset PayActL
	 */
	public void setPayActL(MCList<mcframe.clientMSBH.MSBHP0020.PayActR> aList) {
		if (getPayActL() != aList) {
			getPayActL().setAll(aList);
		}
	}

	/**
	 * [PayAct]ブロックのコンテナaPayActLを返します。
	 *
	 * @return PayActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.PayActR> getPayActL() {
		return aPayActL;
	}

	/**
	 * aPayActRを作成します。
	 *
	 * @return PayActR
	 */
	public mcframe.clientMSBH.MSBHP0020.PayActR createPayActR() {
		return mcframe.clientMSBH.MSBHP0020.PayActR.create();
	}

	/**
	 * aPayActLを作成します。
	 *
	 * @return PayActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.PayActR> createPayActL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0020.PayActR.class);
	}

	/**
	 * コピーによってaAdvPayActLを設定します。
	 *
	 * aAdvPayActLのインスタンスは変更されません。
	 *
	 * @param dataset AdvPayActL
	 */
	public void setAdvPayActL(MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR> aList) {
		if (getAdvPayActL() != aList) {
			getAdvPayActL().setAll(aList);
		}
	}

	/**
	 * [AdvPayAct]ブロックのコンテナaAdvPayActLを返します。
	 *
	 * @return AdvPayActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR> getAdvPayActL() {
		return aAdvPayActL;
	}

	/**
	 * aAdvPayActRを作成します。
	 *
	 * @return AdvPayActR
	 */
	public mcframe.clientMSBH.MSBHP0020.AdvPayActR createAdvPayActR() {
		return mcframe.clientMSBH.MSBHP0020.AdvPayActR.create();
	}

	/**
	 * aAdvPayActLを作成します。
	 *
	 * @return AdvPayActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR> createAdvPayActL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0020.AdvPayActR.class);
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
		if(!MCCollectionUtil.contains(ret, getApdL())) ret.add(getApdL());
		if(!MCCollectionUtil.contains(ret, getPayActL())) ret.add(getPayActL());
		if(!MCCollectionUtil.contains(ret, getAdvPayActL())) ret.add(getAdvPayActL());
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
		if(aCnt == getApdL()) return "Apd";
		if(aCnt == getPayActL()) return "PayAct";
		if(aCnt == getAdvPayActL()) return "AdvPayAct";
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
		if(bId.equals("Apd")) return getApdL();
		if(bId.equals("PayAct")) return getPayActL();
		if(bId.equals("AdvPayAct")) return getAdvPayActL();
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
		ret.add(StsPanel);
		ret.add(AprvPanel);
		ret.add(CndPrntPanel);
		ret.add(Tab2Panel);
		ret.add(BspplPanel);
		ret.add(Tab3Panel);
		ret.add(PspplPanel);
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
	public MSBHP_PaySchdListReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();
		aApdL = createApdL();
		aPayActL = createPayActL();
		aAdvPayActL = createAdvPayActL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_PaySchdListReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
		aApdL = createApdL();
		aPayActL = createPayActL();
		aAdvPayActL = createAdvPayActL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_PaySchdListReg_MC.jbCreateScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateTop((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateFold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateTab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateSts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateAprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateCndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateTab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateBsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateTab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreatePsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateCnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateCtrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateRPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateBulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateRslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbCreateEastBtn((MSBHP_PaySchdListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Aprv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprv(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [CndPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndPrnt(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Bsppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBsppl(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Psppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePsppl(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_PaySchdListReg p) {
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_PaySchdListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBHP_PaySchdListReg p) {
		p.BulkSet_bsppl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().bsppl_usr_dpt_p());
		p.BulkSet_bsppl_usr_dpt_p_PPanel.setName("BulkSet.bsppl_usr_dpt_p");
		p.BulkSet_bsppl_usr_cd = p.BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_bsppl_usr_cd.addAliasName("BulkSet.bsppl_usr_cd", p);
		p.BulkSet_bsppl_usr_nm = p.BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_bsppl_usr_nm.addAliasName("BulkSet.bsppl_usr_nm", p);
		p.BulkSet_bsppl_dpt_cd = p.BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_bsppl_dpt_cd.addAliasName("BulkSet.bsppl_dpt_cd", p);
		p.BulkSet_bsppl_dpt_nm = p.BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_bsppl_dpt_nm.addAliasName("BulkSet.bsppl_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_PaySchdListReg p) {
		p.Rslt_bsppl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$bsppl_usr_dpt_p);
		p.Rslt_bsppl_usr_dpt_p_PPanel.setName("Rslt.bsppl_usr_dpt_p");
		p.columnRslt_bsppl_usr_cd = p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_bsppl_usr_cd.addAliasName("Rslt.bsppl_usr_cd", p);
		p.columnRslt_bsppl_usr_nm = p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_bsppl_usr_nm.addAliasName("Rslt.bsppl_usr_nm", p);
		p.columnRslt_bsppl_dpt_cd = p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_bsppl_dpt_cd.addAliasName("Rslt.bsppl_dpt_cd", p);
		p.columnRslt_bsppl_dpt_nm = p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_bsppl_dpt_nm.addAliasName("Rslt.bsppl_dpt_nm", p);
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$amt_p);
		p.Rslt_amt_p_PPanel.setName("Rslt.amt_p");
		p.columnRslt_amt = p.Rslt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_amt.addAliasName("Rslt.amt", p);
		p.Rslt_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$com_paid_p);
		p.Rslt_com_paid_p_PPanel.setName("Rslt.com_paid_p");
		p.columnRslt_com_paid = p.Rslt_com_paid_p_PPanel.columnAmt_amt;
		p.columnRslt_com_paid.addAliasName("Rslt.com_paid", p);
		p.columnRslt_com_paid_tax_amt = p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt;
		p.columnRslt_com_paid_tax_amt.addAliasName("Rslt.com_paid_tax_amt", p);
		p.Rslt_last_pay_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$last_pay_schd_amt_p);
		p.Rslt_last_pay_schd_amt_p_PPanel.setName("Rslt.last_pay_schd_amt_p");
		p.columnRslt_last_pay_schd_amt = p.Rslt_last_pay_schd_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_last_pay_schd_amt.addAliasName("Rslt.last_pay_schd_amt", p);
		p.Rslt_account_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$account_amt_p);
		p.Rslt_account_amt_p_PPanel.setName("Rslt.account_amt_p");
		p.columnRslt_account_amt = p.Rslt_account_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_account_amt.addAliasName("Rslt.account_amt", p);
		p.Rslt_cash_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$cash_amt_p);
		p.Rslt_cash_amt_p_PPanel.setName("Rslt.cash_amt_p");
		p.columnRslt_cash_amt = p.Rslt_cash_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_cash_amt.addAliasName("Rslt.cash_amt", p);
		p.Rslt_note_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$note_amt_p);
		p.Rslt_note_amt_p_PPanel.setName("Rslt.note_amt_p");
		p.columnRslt_note_amt = p.Rslt_note_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_note_amt.addAliasName("Rslt.note_amt", p);
		p.Rslt_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$sw_amt_p);
		p.Rslt_sw_amt_p_PPanel.setName("Rslt.sw_amt_p");
		p.columnRslt_sw_amt = p.Rslt_sw_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_sw_amt.addAliasName("Rslt.sw_amt", p);
		p.Rslt_bfw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$bfw_amt_p);
		p.Rslt_bfw_amt_p_PPanel.setName("Rslt.bfw_amt_p");
		p.columnRslt_bfw_amt = p.Rslt_bfw_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_bfw_amt.addAliasName("Rslt.bfw_amt", p);
		p.Rslt_purc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$purc_amt_p);
		p.Rslt_purc_amt_p_PPanel.setName("Rslt.purc_amt_p");
		p.columnRslt_purc_amt = p.Rslt_purc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_purc_amt.addAliasName("Rslt.purc_amt", p);
		p.Rslt_purc_ret_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$purc_ret_amt_p);
		p.Rslt_purc_ret_amt_p_PPanel.setName("Rslt.purc_ret_amt_p");
		p.columnRslt_purc_ret_amt = p.Rslt_purc_ret_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_purc_ret_amt.addAliasName("Rslt.purc_ret_amt", p);
		p.Rslt_purc_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$purc_dscnt_amt_p);
		p.Rslt_purc_dscnt_amt_p_PPanel.setName("Rslt.purc_dscnt_amt_p");
		p.columnRslt_purc_dscnt_amt = p.Rslt_purc_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_purc_dscnt_amt.addAliasName("Rslt.purc_dscnt_amt", p);
		p.Rslt_setoff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$setoff_amt_p);
		p.Rslt_setoff_amt_p_PPanel.setName("Rslt.setoff_amt_p");
		p.columnRslt_setoff_amt = p.Rslt_setoff_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_setoff_amt.addAliasName("Rslt.setoff_amt", p);
		p.Rslt_setoff_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$setoff_tax_amt_p);
		p.Rslt_setoff_tax_amt_p_PPanel.setName("Rslt.setoff_tax_amt_p");
		p.columnRslt_setoff_tax_amt = p.Rslt_setoff_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_setoff_tax_amt.addAliasName("Rslt.setoff_tax_amt", p);
		p.Rslt_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$tax_amt_p);
		p.Rslt_tax_amt_p_PPanel.setName("Rslt.tax_amt_p");
		p.columnRslt_tax_amt = p.Rslt_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_tax_amt.addAliasName("Rslt.tax_amt", p);
		p.Rslt_sw_to_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$sw_to_amt_p);
		p.Rslt_sw_to_amt_p_PPanel.setName("Rslt.sw_to_amt_p");
		p.columnRslt_sw_to_amt = p.Rslt_sw_to_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_sw_to_amt.addAliasName("Rslt.sw_to_amt", p);
		p.Rslt_schd_pay_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$schd_pay_amt_p);
		p.Rslt_schd_pay_amt_p_PPanel.setName("Rslt.schd_pay_amt_p");
		p.columnRslt_schd_pay_amt = p.Rslt_schd_pay_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_schd_pay_amt.addAliasName("Rslt.schd_pay_amt", p);
		p.Rslt_adv_pay_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$adv_pay_bal_p);
		p.Rslt_adv_pay_bal_p_PPanel.setName("Rslt.adv_pay_bal_p");
		p.columnRslt_adv_pay_bal = p.Rslt_adv_pay_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_adv_pay_bal.addAliasName("Rslt.adv_pay_bal", p);
		p.Rslt_pay_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$pay_xrate_p);
		p.Rslt_pay_xrate_p_PPanel.setName("Rslt.pay_xrate_p");
		p.columnRslt_pay_xrate = p.Rslt_pay_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_pay_xrate.addAliasName("Rslt.pay_xrate", p);
		p.Rslt_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$xrate_p);
		p.Rslt_xrate_p_PPanel.setName("Rslt.xrate_p");
		p.columnRslt_xrate = p.Rslt_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_xrate.addAliasName("Rslt.xrate", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$bsppl_grp_p);
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
		p.Rslt_psppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0020.RsltR.$psppl_grp_p);
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
	protected static void jbCreateBtn(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBHP_PaySchdListReg p) {
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
	
	
	/** [BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm","wg_cd");
		}
		return BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [BulkSet_wg_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_wg_cd_p = null;

	/**
	 * [BulkSet_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_wg_cd_ListPutter() {
		if (BulkSet_wg_cd_p == null) {
			BulkSet_wg_cd_p = createBulkSet_wg_cd_ListPutter(BulkSet_wg_cd, "wg_cd", "wg_nm");

		}
		return BulkSet_wg_cd_p;
	}
	
	
	/** [Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm","wg_cd");
		}
		return Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wg_cd_p = null;

	/**
	 * [Rslt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wg_cd_ListPutter() {
		if (Rslt_wg_cd_p == null) {
			Rslt_wg_cd_p = createRslt_wg_cd_ListPutter(columnRslt_wg_cd, "wg_cd", "wg_nm");

		}
		return Rslt_wg_cd_p;
	}
	
	
	/** [Rslt_bsppl_cl_day_ListPutter]の定義 */
	private MCListPutter Rslt_bsppl_cl_day_p = null;

	/**
	 * [Rslt_bsppl_cl_day_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bsppl_cl_day_ListPutter() {
		if (Rslt_bsppl_cl_day_p == null) {
			Rslt_bsppl_cl_day_p = createRslt_bsppl_cl_day_ListPutter(columnRslt_bsppl_cl_day, "bsppl_cl_day");

		}
		return Rslt_bsppl_cl_day_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PaySchdListReg create(){
		MSBHP_PaySchdListReg p = new MSBHP_PaySchdListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PaySchdListReg create(String name){
		MSBHP_PaySchdListReg p = new MSBHP_PaySchdListReg(name);
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
		MSBHP_PaySchdListReg_MC.jbfInitScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitTop((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitFold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitTab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitSts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitAprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitCndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitTab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitBsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitTab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitPsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitCnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitCtrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitRPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitBulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitRslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbfInitEastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitTop((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitFold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitTab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitSts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitAprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitCndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitTab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitBsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitTab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitPsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitCnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitCtrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitRPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitBulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitRslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.jbInitEastBtn((MSBHP_PaySchdListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_PaySchdListReg p) {
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
	protected static void jbfInitTab1(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Aprv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprv(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.AprvPanel = p.beansFactory.createPanel("Aprv");
		p.AprvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [CndPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndPrnt(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.CndPrntPanel = p.beansFactory.createPanel("CndPrnt");
		p.CndPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBsppl(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.BspplPanel = p.beansFactory.createPanel("Bsppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPsppl(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.PspplPanel = p.beansFactory.createPanel("Psppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_PRT = p.beansFactory.createRadioButton("Cnd.ope_PRT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_unchk_flg = p.beansFactory.createCheckBox("Cnd.unchk_flg");
		p.Cnd_schd_flg = p.beansFactory.createCheckBox("Cnd.schd_flg");
		p.Cnd_act_flg = p.beansFactory.createCheckBox("Cnd.act_flg");
		p.Cnd_aprv_opn_flg = p.beansFactory.createCheckBox("Cnd.aprv_opn_flg");
		p.Cnd_aprv_fix_flg = p.beansFactory.createCheckBox("Cnd.aprv_fix_flg");
		p.Cnd_aprv_acpt_flg = p.beansFactory.createCheckBox("Cnd.aprv_acpt_flg");
		p.Cnd_aprv_rjct_flg = p.beansFactory.createCheckBox("Cnd.aprv_rjct_flg");
		p.Cnd_aprv_last_rjct_flg = p.beansFactory.createCheckBox("Cnd.aprv_last_rjct_flg");
		p.Cnd_aprv_none_flg = p.beansFactory.createCheckBox("Cnd.aprv_none_flg");
		p.Cnd_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_prnt_flg");
		p.Cnd_prnt_flg = p.beansFactory.createCheckBox("Cnd.prnt_flg");
		p.Cnd_reg_dt_fr_Label = p.beansFactory.createLabel("Cnd.reg_dt_fr_Label");
		p.Cnd_reg_dt_fr = p.beansFactory.createDateField("Cnd.reg_dt_fr");
		p.Cnd_reg_dt_fr.setLabel(p.Cnd_reg_dt_fr_Label);
		p.Cnd_reg_dt_to_Label = p.beansFactory.createLabel("Cnd.reg_dt_to_Label");
		p.Cnd_reg_dt_to = p.beansFactory.createDateField("Cnd.reg_dt_to");
		p.Cnd_reg_dt_to.setLabel(p.Cnd_reg_dt_to_Label);
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
		p.Cnd_inc_no_pay_flg = p.beansFactory.createCheckBox("Cnd.inc_no_pay_flg");
		p.Cnd_inc_interim_flg = p.beansFactory.createCheckBox("Cnd.inc_interim_flg");
		p.Cnd_manual_flg = p.beansFactory.createCheckBox("Cnd.manual_flg");
		p.Cnd_pay_spot_flg = p.beansFactory.createCheckBox("Cnd.pay_spot_flg");
		p.Cnd_batch_pay_schd_cl_flg = p.beansFactory.createCheckBox("Cnd.batch_pay_schd_cl_flg");
		p.Cnd_new_flg = p.beansFactory.createCheckBox("Cnd.new_flg");
		p.Cnd_pay_schd_d_print_rmrks_Label = p.beansFactory.createLabel("Cnd.pay_schd_d_print_rmrks_Label");
		p.Cnd_pay_schd_d_print_rmrks = p.beansFactory.createTextField("Cnd.pay_schd_d_print_rmrks");
		p.Cnd_pay_schd_d_print_rmrks.setLabel(p.Cnd_pay_schd_d_print_rmrks_Label);
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
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_reg_dt_Label = p.beansFactory.createLabel("BulkSet.reg_dt_Label");
		p.BulkSet_reg_dt = p.beansFactory.createDateField("BulkSet.reg_dt");
		p.BulkSet_reg_dt.setLabel(p.BulkSet_reg_dt_Label);
		p.BulkSet_wg_cd_Label = p.beansFactory.createLabel("BulkSet.wg_cd_Label");
		p.BulkSet_wg_cd = p.beansFactory.createTextField("BulkSet.wg_cd");
		p.BulkSet_wg_cd.setLabel(p.BulkSet_wg_cd_Label);
		p.BulkSet_wg_nm = p.beansFactory.createTextField("BulkSet.wg_nm");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_prnt_flg = p.beansFactory.createTableColumn("Rslt.prnt_flg", MCColumnType.CHECK);
		p.columnRslt_reg_dt = p.beansFactory.createTableColumn("Rslt.reg_dt", MCColumnType.DATE);
		p.columnRslt_psppl_cd = p.beansFactory.createTableColumn("Rslt.psppl_cd", MCColumnType.TEXT);
		p.columnRslt_psppl_nm = p.beansFactory.createTableColumn("Rslt.psppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_purc_act_no = p.beansFactory.createTableColumn("Rslt.purc_act_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_bsppl_cl_ym = p.beansFactory.createTableColumn("Rslt.bsppl_cl_ym", MCColumnType.DATE);
		p.columnRslt_bsppl_cl_day = p.beansFactory.createTableColumn("Rslt.bsppl_cl_day", MCColumnType.NUMBER_COMBO);
		p.columnRslt_bsppl_cl_dt = p.beansFactory.createTableColumn("Rslt.bsppl_cl_dt", MCColumnType.DATE);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_pay_xrate_cd = p.beansFactory.createTableColumn("Rslt.pay_xrate_cd", MCColumnType.TEXT);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT);
		p.columnRslt_inc_interim_flg = p.beansFactory.createTableColumn("Rslt.inc_interim_flg", MCColumnType.CHECK);
		p.columnRslt_purc_interim_cl_flg = p.beansFactory.createTableColumn("Rslt.purc_interim_cl_flg", MCColumnType.CHECK);
		p.columnRslt_pay_chk_no = p.beansFactory.createTableColumn("Rslt.pay_chk_no", MCColumnType.TEXT);
		p.columnRslt_pay_ntc_rev = p.beansFactory.createTableColumn("Rslt.pay_ntc_rev", MCColumnType.NUMBER);
		p.columnRslt_unchk_flg = p.beansFactory.createTableColumn("Rslt.unchk_flg", MCColumnType.CHECK);
		p.columnRslt_schd_flg = p.beansFactory.createTableColumn("Rslt.schd_flg", MCColumnType.CHECK);
		p.columnRslt_act_flg = p.beansFactory.createTableColumn("Rslt.act_flg", MCColumnType.CHECK);
		p.columnRslt_aprv_no = p.beansFactory.createTableColumn("Rslt.aprv_no", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_rvrs_flg = p.beansFactory.createTableColumn("Rslt.aprv_rvrs_flg", MCColumnType.CHECK);
		p.columnRslt_aprv_flg = p.beansFactory.createTableColumn("Rslt.aprv_flg", MCColumnType.CHECK);
		p.columnRslt_aprv_upd_flg = p.beansFactory.createTableColumn("Rslt.aprv_upd_flg", MCColumnType.CHECK);
		p.columnRslt_aprv_can_flg = p.beansFactory.createTableColumn("Rslt.aprv_can_flg", MCColumnType.CHECK);
		p.columnRslt_pay_sts_typ = p.beansFactory.createTableColumn("Rslt.pay_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pay_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pay_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_tax_on_pay_flg = p.beansFactory.createTableColumn("Rslt.tax_on_pay_flg", MCColumnType.CHECK);
		p.columnRslt_manual_flg = p.beansFactory.createTableColumn("Rslt.manual_flg", MCColumnType.CHECK);
		p.columnRslt_pay_spot_flg = p.beansFactory.createTableColumn("Rslt.pay_spot_flg", MCColumnType.CHECK);
		p.columnRslt_batch_pay_schd_cl_flg = p.beansFactory.createTableColumn("Rslt.batch_pay_schd_cl_flg", MCColumnType.CHECK);
		p.columnRslt_pay_schd_d_print_rmrks = p.beansFactory.createTableColumn("Rslt.pay_schd_d_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
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
		p.columnRslt_xrate_base_dt = p.beansFactory.createTableColumn("Rslt.xrate_base_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0030 = p.beansFactory.createButton("Btn.open_MSBHP0030", "open");
		p.Btn_open_MSBDP0190 = p.beansFactory.createButton("Btn.open_MSBDP0190", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_prnt_out_flg = p.beansFactory.createCheckBox("Btn.prnt_out_flg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitTop(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitFold(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitTab1(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.StsPanel, null);
		p.Tab1Panel.setLastBeans(p.StsPanel);
		p.StsPanel.setNextBeans(p.AprvPanel);
		p.Tab1Panel.add(p.AprvPanel, null);
		p.AprvPanel.setNextBeans(p.CndPrntPanel);
		p.Tab1Panel.add(p.CndPrntPanel, null);
		p.CndPrntPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Aprv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprv(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.AprvPanel.setBorder(p.AprvTitledBorder);
		p.AprvPanel.setValueCheck(false);
		p.AprvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AprvPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [CndPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndPrnt(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.CndPrntPanel.setBorder(p.CndPrntTitledBorder);
		p.CndPrntPanel.setValueCheck(false);
		p.CndPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPrntPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitBsppl(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.BspplPanel.setValueCheck(false);
		p.BspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
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
	protected static void jbInitPsppl(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.PspplPanel.setValueCheck(false);
		p.PspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_PaySchdListReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_PRT);
		p.Cnd_ope_PRT.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRT);
		p.Cnd_ope_PRT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.ope_META);
		p.StsPanel.add(p.Cnd_unchk_flg);
		p.StsPanel.setLastBeans(p.Cnd_unchk_flg);
		p.Cnd_unchk_flg.setNextBeans(p.Cnd_schd_flg);
		p.Cnd_unchk_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.unchk_flg_META);
		p.StsPanel.add(p.Cnd_schd_flg);
		p.Cnd_schd_flg.setNextBeans(p.Cnd_act_flg);
		p.Cnd_schd_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.schd_flg_META);
		p.StsPanel.add(p.Cnd_act_flg);
		p.Cnd_act_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.act_flg_META);
		p.AprvPanel.add(p.Cnd_aprv_opn_flg);
		p.AprvPanel.setLastBeans(p.Cnd_aprv_opn_flg);
		p.Cnd_aprv_opn_flg.setNextBeans(p.Cnd_aprv_fix_flg);
		p.Cnd_aprv_opn_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.aprv_opn_flg_META);
		p.AprvPanel.add(p.Cnd_aprv_fix_flg);
		p.Cnd_aprv_fix_flg.setNextBeans(p.Cnd_aprv_acpt_flg);
		p.Cnd_aprv_fix_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.aprv_fix_flg_META);
		p.AprvPanel.add(p.Cnd_aprv_acpt_flg);
		p.Cnd_aprv_acpt_flg.setNextBeans(p.Cnd_aprv_rjct_flg);
		p.Cnd_aprv_acpt_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.aprv_acpt_flg_META);
		p.AprvPanel.add(p.Cnd_aprv_rjct_flg);
		p.Cnd_aprv_rjct_flg.setNextBeans(p.Cnd_aprv_last_rjct_flg);
		p.Cnd_aprv_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.aprv_rjct_flg_META);
		p.AprvPanel.add(p.Cnd_aprv_last_rjct_flg);
		p.Cnd_aprv_last_rjct_flg.setNextBeans(p.Cnd_aprv_none_flg);
		p.Cnd_aprv_last_rjct_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.aprv_last_rjct_flg_META);
		p.AprvPanel.add(p.Cnd_aprv_none_flg);
		p.Cnd_aprv_none_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.aprv_none_flg_META);
		p.CndPrntPanel.add(p.Cnd_not_prnt_flg);
		p.CndPrntPanel.setLastBeans(p.Cnd_not_prnt_flg);
		p.Cnd_not_prnt_flg.setNextBeans(p.Cnd_prnt_flg);
		p.Cnd_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.not_prnt_flg_META);
		p.CndPrntPanel.add(p.Cnd_prnt_flg);
		p.Cnd_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.prnt_flg_META);
		p.CndPanel.add(p.Cnd_reg_dt_fr_Label);
		p.CndPanel.add(p.Cnd_reg_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_reg_dt_fr);
		p.Cnd_reg_dt_fr.setNextBeans(p.Cnd_reg_dt_to);
		p.Cnd_reg_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.reg_dt_fr_META);
		p.Cnd_reg_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_reg_dt_to_Label);
		p.CndPanel.add(p.Cnd_reg_dt_to);
		p.Cnd_reg_dt_to.setNextBeans(p.Cnd_bsppl_cl_dt_fr);
		p.Cnd_reg_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.reg_dt_to_META);
		p.Cnd_reg_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_fr_Label);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_fr);
		p.Cnd_bsppl_cl_dt_fr.setNextBeans(p.Cnd_bsppl_cl_dt_to);
		p.Cnd_bsppl_cl_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.bsppl_cl_dt_fr_META);
		p.Cnd_bsppl_cl_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_to_Label);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_to);
		p.Cnd_bsppl_cl_dt_to.setNextBeans(p.Cnd_psppl_cd);
		p.Cnd_bsppl_cl_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.bsppl_cl_dt_to_META);
		p.Cnd_bsppl_cl_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_psppl_cd_Label);
		p.CndPanel.add(p.Cnd_psppl_cd);
		p.Cnd_psppl_cd.setNextBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.psppl_cd_META);
		p.Cnd_psppl_cd.addLinkBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_psppl_cd, true);
		p.CndPanel.add(p.Cnd_psppl_nm);
		p.Cnd_psppl_nm.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_psppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.psppl_nm_META);
		p.setPluralValueEnable(p.Cnd_psppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_pay_chk_no);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.rcpt_iv_mng_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_mng_no, true);
		p.CndPanel.add(p.Cnd_pay_chk_no_Label);
		p.CndPanel.add(p.Cnd_pay_chk_no);
		p.Cnd_pay_chk_no.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_pay_chk_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.pay_chk_no_META);
		p.setPluralValueEnable(p.Cnd_pay_chk_no, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_inc_no_pay_flg);
		p.setPluralValueEnable(p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_inc_no_pay_flg);
		p.Cnd_inc_no_pay_flg.setNextBeans(p.Cnd_inc_interim_flg);
		p.Cnd_inc_no_pay_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.inc_no_pay_flg_META);
		p.CndPanel.add(p.Cnd_inc_interim_flg);
		p.Cnd_inc_interim_flg.setNextBeans(p.Cnd_manual_flg);
		p.Cnd_inc_interim_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.inc_interim_flg_META);
		p.CndPanel.add(p.Cnd_manual_flg);
		p.Cnd_manual_flg.setNextBeans(p.Cnd_pay_spot_flg);
		p.Cnd_manual_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.manual_flg_META);
		p.CndPanel.add(p.Cnd_pay_spot_flg);
		p.Cnd_pay_spot_flg.setNextBeans(p.Cnd_batch_pay_schd_cl_flg);
		p.Cnd_pay_spot_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.pay_spot_flg_META);
		p.CndPanel.add(p.Cnd_batch_pay_schd_cl_flg);
		p.Cnd_batch_pay_schd_cl_flg.setNextBeans(p.Cnd_new_flg);
		p.Cnd_batch_pay_schd_cl_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.batch_pay_schd_cl_flg_META);
		p.CndPanel.add(p.Cnd_new_flg);
		p.Cnd_new_flg.setNextBeans(p.Cnd_pay_schd_d_print_rmrks);
		p.Cnd_new_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.new_flg_META);
		p.CndPanel.add(p.Cnd_pay_schd_d_print_rmrks_Label);
		p.CndPanel.add(p.Cnd_pay_schd_d_print_rmrks);
		p.Cnd_pay_schd_d_print_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_pay_schd_d_print_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.pay_schd_d_print_rmrks_META);
		p.setPluralValueEnable(p.Cnd_pay_schd_d_print_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0020.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.BspplPanel.add(p.Cnd_bsppl_grp_p_PPanel);
		p.BspplPanel.setLastBeans(p.Cnd_bsppl_grp_p_PPanel);
		p.PspplPanel.add(p.Cnd_psppl_grp_p_PPanel);
		p.PspplPanel.setLastBeans(p.Cnd_psppl_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitRPnl(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitBulkSet(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_reg_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_reg_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_reg_dt);
		p.BulkSet_reg_dt.setNextBeans(p.BulkSet_bsppl_usr_dpt_p_PPanel);
		p.BulkSet_reg_dt.setRow(p.getBulkSetR(), mcframe.clientMSBH.MSBHP0020.BulkSetR.reg_dt_META);
		p.BulkSet_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_bsppl_usr_dpt_p_PPanel);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_wg_cd);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_bsppl_dpt_nm,p.BulkSet_wg_cd);
		p.BulkSetPanel.add(p.BulkSet_wg_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_wg_cd);
		p.BulkSet_wg_cd.setNextBeans(p.BulkSet_wg_nm);
		p.BulkSet_wg_cd.setRow(p.getBulkSetR(), mcframe.clientMSBH.MSBHP0020.BulkSetR.wg_cd_META);
		p.BulkSet_wg_cd.addLinkBeans(p.BulkSet_wg_nm);
		p.BulkSet_wg_cd.setListType(MCListType.FREE);
		p.BulkSetPanel.add(p.BulkSet_wg_nm);
		p.BulkSet_wg_nm.setRow(p.getBulkSetR(), mcframe.clientMSBH.MSBHP0020.BulkSetR.wg_nm_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBHP_PaySchdListReg p) {
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
	protected static void jbInitBtn(MSBHP_PaySchdListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0030);
		p.Btn_open_MSBHP0030.setNextBeans(p.Btn_open_MSBDP0190);
		p.Btn_open_MSBDP0190.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBDP0190);
		p.Btn_open_MSBDP0190.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_prnt_out_flg);
		p.BtnPanel.add(p.Btn_prnt_out_flg);
		p.Btn_prnt_out_flg.setNextBeans(p.Btn_indiv_prnt_flg);
		p.Btn_prnt_out_flg.setRow(p.getBtnR(), mcframe.clientMSBH.MSBHP0020.BtnR.prnt_out_flg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setNextBeans(p.Btn_select_all);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBH.MSBHP0020.BtnR.indiv_prnt_flg_META);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F13);
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
	protected static void jbInitEastBtn(MSBHP_PaySchdListReg p) {
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
		MSBHP_PaySchdListReg_MC.mcInitScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitTop((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitFold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitTab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitSts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitAprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitCndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitTab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitBsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitTab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitPsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitCnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitCtrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitRPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitBulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitRslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.mcInitEastBtn((MSBHP_PaySchdListReg)this);

		// [SRCH_INS]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__INS_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [INS]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitINS_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitINS_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__DEL_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [DEL]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitDEL_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitDEL_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitSRCH_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [REF]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitREF_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitREF_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitSRCH__PRNT_AdvPayAct((MSBHP_PaySchdListReg)this);

		// [PRNT]ステータスのモードの設定
		MSBHP_PaySchdListReg_MC.statusInitPRNT_ScreenOpe((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Top((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Fold((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Tab1((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Sts((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Aprv((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_CndPrnt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Tab2((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Bsppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Tab3((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Psppl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Cnd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Ctrl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_RPnl((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_BulkSet((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Rslt((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Btn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_EastBtn((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_Apd((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_PayAct((MSBHP_PaySchdListReg)this);
		MSBHP_PaySchdListReg_MC.statusInitPRNT_AdvPayAct((MSBHP_PaySchdListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_PaySchdListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Aprv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprv(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [CndPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndPrnt(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Bsppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBsppl(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Psppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPsppl(MSBHP_PaySchdListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_PaySchdListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_PRT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_unchk_flg.addAllListener(p);
		p.Cnd_schd_flg.addAllListener(p);
		p.Cnd_act_flg.addAllListener(p);
		p.Cnd_aprv_opn_flg.addAllListener(p);
		p.Cnd_aprv_fix_flg.addAllListener(p);
		p.Cnd_aprv_acpt_flg.addAllListener(p);
		p.Cnd_aprv_rjct_flg.addAllListener(p);
		p.Cnd_aprv_last_rjct_flg.addAllListener(p);
		p.Cnd_aprv_none_flg.addAllListener(p);
		p.Cnd_not_prnt_flg.addAllListener(p);
		p.Cnd_prnt_flg.addAllListener(p);
		p.Cnd_reg_dt_fr.setListListener(p);
		p.Cnd_reg_dt_fr.addAllListener(p);
		p.Cnd_reg_dt_to.setListListener(p);
		p.Cnd_reg_dt_to.addAllListener(p);
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
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_pay_chk_no.setListListener(p);
		p.Cnd_pay_chk_no.addAllListener(p);
		p.Cnd_inc_no_pay_flg.addAllListener(p);
		p.Cnd_inc_interim_flg.addAllListener(p);
		p.Cnd_manual_flg.addAllListener(p);
		p.Cnd_pay_spot_flg.addAllListener(p);
		p.Cnd_batch_pay_schd_cl_flg.addAllListener(p);
		p.Cnd_new_flg.addAllListener(p);
		p.Cnd_pay_schd_d_print_rmrks.setListListener(p);
		p.Cnd_pay_schd_d_print_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_PaySchdListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBHP_PaySchdListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBHP_PaySchdListReg p) {
		p.BulkSet_reg_dt.setListListener(p);
		p.BulkSet_reg_dt.addAllListener(p);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_wg_cd.setListListener(p);
		p.BulkSet_wg_cd.addAllListener(p);
		p.BulkSet_wg_nm.setListListener(p);
		p.BulkSet_wg_nm.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_PaySchdListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_prnt_flg.addAllListener(p);
		p.columnRslt_reg_dt.addAllListener(p);
		p.columnRslt_reg_dt.setListListener(p);
		p.columnRslt_psppl_cd.addAllListener(p);
		p.columnRslt_psppl_cd.setListListener(p);
		p.columnRslt_psppl_nm.addAllListener(p);
		p.columnRslt_psppl_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
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
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_pay_xrate_cd.addAllListener(p);
		p.columnRslt_pay_xrate_cd.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_inc_interim_flg.addAllListener(p);
		p.columnRslt_purc_interim_cl_flg.addAllListener(p);
		p.columnRslt_pay_chk_no.addAllListener(p);
		p.columnRslt_pay_chk_no.setListListener(p);
		p.columnRslt_pay_ntc_rev.addAllListener(p);
		p.columnRslt_pay_ntc_rev.setListListener(p);
		p.columnRslt_unchk_flg.addAllListener(p);
		p.columnRslt_schd_flg.addAllListener(p);
		p.columnRslt_act_flg.addAllListener(p);
		p.columnRslt_aprv_no.addAllListener(p);
		p.columnRslt_aprv_no.setListListener(p);
		p.columnRslt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_aprv_sts_typ.setListListener(p);
		p.columnRslt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_rvrs_flg.addAllListener(p);
		p.columnRslt_aprv_flg.addAllListener(p);
		p.columnRslt_aprv_upd_flg.addAllListener(p);
		p.columnRslt_aprv_can_flg.addAllListener(p);
		p.columnRslt_pay_sts_typ.addAllListener(p);
		p.columnRslt_pay_sts_typ.setListListener(p);
		p.columnRslt_pay_sts_typ_nm.addAllListener(p);
		p.columnRslt_pay_sts_typ_nm.setListListener(p);
		p.columnRslt_tax_on_pay_flg.addAllListener(p);
		p.columnRslt_manual_flg.addAllListener(p);
		p.columnRslt_pay_spot_flg.addAllListener(p);
		p.columnRslt_batch_pay_schd_cl_flg.addAllListener(p);
		p.columnRslt_pay_schd_d_print_rmrks.addAllListener(p);
		p.columnRslt_pay_schd_d_print_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
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
		p.columnRslt_xrate_base_dt.addAllListener(p);
		p.columnRslt_xrate_base_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBHP_PaySchdListReg p) {
		p.Btn_open_MSBHP0030.addAllListener(p);
		p.Btn_open_MSBHP0030.setAPMethodName("doBtn_open_MSBHP0030");
		p.Btn_open_MSBDP0190.addAllListener(p);
		p.Btn_open_MSBDP0190.setAPMethodName("doBtn_open_MSBDP0190");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_prnt_out_flg.addAllListener(p);
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
	protected static void mcInitEastBtn(MSBHP_PaySchdListReg p) {
	}

	/**
	 * [SRCH_INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_schd_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_act_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_aprv_opn_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_aprv_fix_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_aprv_acpt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_aprv_rjct_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_aprv_last_rjct_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_aprv_none_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_prnt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_reg_dt_to.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_manual_flg.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_INS, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_wg_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_reg_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_inc_interim_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_purc_interim_cl_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_unchk_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, SRCH_INS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_open_MSBDP0190.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_INS, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitINS_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitINS_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitINS_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_schd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_act_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_aprv_opn_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_aprv_fix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_aprv_acpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_aprv_rjct_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_aprv_last_rjct_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_aprv_none_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_not_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_reg_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_reg_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_manual_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_reg_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_psppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.REQUIRED);
		p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_bsppl_cl_day.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_bsppl_cl_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_inc_interim_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_interim_cl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_unchk_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MSBDP0190.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitINS_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [INS]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitINS_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_schd_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_act_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_aprv_opn_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_aprv_fix_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_aprv_acpt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_aprv_rjct_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_aprv_last_rjct_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_aprv_none_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_manual_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_reg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnRslt_inc_interim_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_purc_interim_cl_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_unchk_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBDP0190.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_schd_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_act_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_aprv_opn_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_aprv_fix_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_aprv_acpt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_aprv_rjct_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_aprv_last_rjct_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_aprv_none_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_reg_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_manual_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnRslt_inc_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_purc_interim_cl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_unchk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, DEL, MCMode.ENABLE);
		p.columnRslt_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBDP0190.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [DEL]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_schd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_act_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_opn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_fix_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_acpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_rjct_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_last_rjct_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_none_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_reg_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_manual_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_reg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnRslt_inc_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_interim_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unchk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBDP0190.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitREF_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_schd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_act_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_opn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_acpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_rjct_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_last_rjct_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_none_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_reg_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_manual_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnRslt_inc_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_interim_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unchk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBDP0190.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitREF_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [REF]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitREF_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_act_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_opn_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_fix_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_acpt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_rjct_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_last_rjct_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_none_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_manual_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_wg_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_reg_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnRslt_inc_interim_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_interim_cl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_unchk_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBDP0190.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt_out_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_PRNT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_AdvPayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Sts(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Aprv(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CndPrnt(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Bsppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Psppl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBHP_PaySchdListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_unchk_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_act_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_opn_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_fix_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_acpt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_rjct_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_last_rjct_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_aprv_none_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_reg_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_chk_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_inc_no_pay_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_inc_interim_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_manual_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_spot_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_batch_pay_schd_cl_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_pay_schd_d_print_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_psppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBHP_PaySchdListReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBHP_PaySchdListReg p){
		p.BulkSet_reg_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.BulkSet_bsppl_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_wg_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.BulkSet_wg_nm.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBHP_PaySchdListReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_reg_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_bsppl_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_com_paid_p_PPanel.columnAmt_tax_amt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_last_pay_schd_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfw_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_ret_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_dscnt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_schd_pay_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_adv_pay_bal_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_xrate_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_pay_xrate_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.INVISIBLE);
		p.columnRslt_inc_interim_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_interim_cl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_unchk_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_rvrs_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_upd_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_aprv_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tax_on_pay_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_manual_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_spot_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_batch_pay_schd_cl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_d_print_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_xrate_base_dt.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBHP_PaySchdListReg p){
		p.Btn_open_MSBHP0030.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_open_MSBDP0190.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt_out_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_ins.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[Apd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Apd(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[PayAct]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_PayAct(MSBHP_PaySchdListReg p){

	}

	/**
	 * [PRNT]ステータスの[AdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_AdvPayAct(MSBHP_PaySchdListReg p){

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
		MSBHP_PaySchdListReg_MC.setTableConfigRslt((MSBHP_PaySchdListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_PaySchdListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_prnt_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_flg);
		p.columnRslt_reg_dt.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.reg_dt_META);
		p.columnRslt_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_reg_dt);
		p.columnRslt_psppl_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.psppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_cd);
		p.columnRslt_psppl_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.psppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.RsltTable.addTable(p.Rslt_bsppl_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_bsppl_dpt_nm, p.columnRslt_wg_cd);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.wg_cd_META);
		p.columnRslt_wg_cd.addLinkBeans(p.columnRslt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_bsppl_cl_ym.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.bsppl_cl_ym_META);
		p.columnRslt_bsppl_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_ym);
		p.columnRslt_bsppl_cl_day.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.bsppl_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_day);
		p.columnRslt_bsppl_cl_dt.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.bsppl_cl_dt_META);
		p.columnRslt_bsppl_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_dt);
		p.RsltTable.addTable(p.Rslt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_com_paid_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_last_pay_schd_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_account_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_cash_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_note_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_sw_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_bfw_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_purc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_purc_ret_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_purc_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_setoff_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_setoff_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_sw_to_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_schd_pay_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_adv_pay_bal_p_PPanel.AmtTable);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_pay_xrate_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_xrate_cd);
		p.RsltTable.addTable(p.Rslt_pay_xrate_p_PPanel.XrateTable);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.RsltTable.addTable(p.Rslt_xrate_p_PPanel.XrateTable);
		p.columnRslt_inc_interim_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.inc_interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inc_interim_flg);
		p.columnRslt_purc_interim_cl_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.purc_interim_cl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_interim_cl_flg);
		p.columnRslt_pay_chk_no.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_chk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_no);
		p.columnRslt_pay_ntc_rev.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_ntc_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_ntc_rev);
		p.columnRslt_unchk_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.unchk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unchk_flg);
		p.columnRslt_schd_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.schd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_flg);
		p.columnRslt_act_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.act_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_flg);
		p.columnRslt_aprv_no.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_no);
		p.columnRslt_aprv_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ);
		p.columnRslt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ_nm);
		p.columnRslt_aprv_rvrs_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_rvrs_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_rvrs_flg);
		p.columnRslt_aprv_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_flg);
		p.columnRslt_aprv_upd_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_upd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_upd_flg);
		p.columnRslt_aprv_can_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.aprv_can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_can_flg);
		p.columnRslt_pay_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ);
		p.columnRslt_pay_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ_nm);
		p.columnRslt_tax_on_pay_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.tax_on_pay_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_on_pay_flg);
		p.columnRslt_manual_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.manual_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_manual_flg);
		p.columnRslt_pay_spot_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_spot_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_spot_flg);
		p.columnRslt_batch_pay_schd_cl_flg.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.batch_pay_schd_cl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_batch_pay_schd_cl_flg);
		p.columnRslt_pay_schd_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.pay_schd_d_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_d_print_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_bsppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_psppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_xrate_base_dt.setMeta(mcframe.clientMSBH.MSBHP0020.RsltR.xrate_base_dt_META);
		p.columnRslt_xrate_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_base_dt);
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
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		BulkSet_wg_cd.getListConfig().setPutter(getBulkSet_wg_cd_ListPutter());
		Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_wg_cd.getListConfig().setPutter(getRslt_wg_cd_ListPutter());
		columnRslt_bsppl_cl_day.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_bsppl_cl_day.getListConfig().setPutter(getRslt_bsppl_cl_day_ListPutter());
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
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
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
	 * [BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [BulkSet_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Rslt_bsppl_cl_day_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bsppl_cl_day_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0090.Bsppl_PaySchdClDay");
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
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == BulkSet_bsppl_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == BulkSet_wg_cd) return getBulkSet_wg_cd(row, info);
		if(combo == Rslt_bsppl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_wg_cd) return getRslt_wg_cd(row, info);
		if(combo == columnRslt_bsppl_cl_day) return getRslt_bsppl_cl_day(row, info);
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
		else if (ap == Btn_open_MSBHP0030) doBtn_open_MSBHP0030(info);
		else if (ap == Btn_open_MSBDP0190) doBtn_open_MSBDP0190(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
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
	 * [Btn]パネルの[open_MSBHP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0190]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0190(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == Cnd_unchk_flg) return doCnd_unchk_flg_VC(info);
		if (vc == Cnd_schd_flg) return doCnd_schd_flg_VC(info);
		if (vc == Cnd_act_flg) return doCnd_act_flg_VC(info);
		if (vc == Cnd_aprv_opn_flg) return doCnd_aprv_opn_flg_VC(info);
		if (vc == Cnd_aprv_fix_flg) return doCnd_aprv_fix_flg_VC(info);
		if (vc == Cnd_aprv_acpt_flg) return doCnd_aprv_acpt_flg_VC(info);
		if (vc == Cnd_aprv_rjct_flg) return doCnd_aprv_rjct_flg_VC(info);
		if (vc == Cnd_aprv_last_rjct_flg) return doCnd_aprv_last_rjct_flg_VC(info);
		if (vc == Cnd_aprv_none_flg) return doCnd_aprv_none_flg_VC(info);
		if (vc == Cnd_not_prnt_flg) return doCnd_not_prnt_flg_VC(info);
		if (vc == Cnd_prnt_flg) return doCnd_prnt_flg_VC(info);
		if (vc == Cnd_reg_dt_fr) return doCnd_reg_dt_fr_VC(info);
		if (vc == Cnd_reg_dt_to) return doCnd_reg_dt_to_VC(info);
		if (vc == Cnd_bsppl_cl_dt_fr) return doCnd_bsppl_cl_dt_fr_VC(info);
		if (vc == Cnd_bsppl_cl_dt_to) return doCnd_bsppl_cl_dt_to_VC(info);
		if (vc == Cnd_psppl_cd) return doCnd_psppl_cd_VC(info);
		if (vc == Cnd_psppl_nm) return doCnd_psppl_nm_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Cnd_pay_chk_no) return doCnd_pay_chk_no_VC(info);
		if (vc == Cnd_inc_no_pay_flg) return doCnd_inc_no_pay_flg_VC(info);
		if (vc == Cnd_inc_interim_flg) return doCnd_inc_interim_flg_VC(info);
		if (vc == Cnd_manual_flg) return doCnd_manual_flg_VC(info);
		if (vc == Cnd_pay_spot_flg) return doCnd_pay_spot_flg_VC(info);
		if (vc == Cnd_batch_pay_schd_cl_flg) return doCnd_batch_pay_schd_cl_flg_VC(info);
		if (vc == Cnd_new_flg) return doCnd_new_flg_VC(info);
		if (vc == Cnd_pay_schd_d_print_rmrks) return doCnd_pay_schd_d_print_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == BulkSet_reg_dt) return doBulkSet_reg_dt_VC(info);
		if (vc == BulkSet_wg_cd) return doBulkSet_wg_cd_VC(info);
		if (vc == BulkSet_wg_nm) return doBulkSet_wg_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_prnt_flg) return doRslt_prnt_flg_VC(info);
		if (vc == columnRslt_reg_dt) return doRslt_reg_dt_VC(info);
		if (vc == columnRslt_psppl_cd) return doRslt_psppl_cd_VC(info);
		if (vc == columnRslt_psppl_nm) return doRslt_psppl_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_purc_act_no) return doRslt_purc_act_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_bsppl_cl_ym) return doRslt_bsppl_cl_ym_VC(info);
		if (vc == columnRslt_bsppl_cl_day) return doRslt_bsppl_cl_day_VC(info);
		if (vc == columnRslt_bsppl_cl_dt) return doRslt_bsppl_cl_dt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_pay_xrate_cd) return doRslt_pay_xrate_cd_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_inc_interim_flg) return doRslt_inc_interim_flg_VC(info);
		if (vc == columnRslt_purc_interim_cl_flg) return doRslt_purc_interim_cl_flg_VC(info);
		if (vc == columnRslt_pay_chk_no) return doRslt_pay_chk_no_VC(info);
		if (vc == columnRslt_pay_ntc_rev) return doRslt_pay_ntc_rev_VC(info);
		if (vc == columnRslt_unchk_flg) return doRslt_unchk_flg_VC(info);
		if (vc == columnRslt_schd_flg) return doRslt_schd_flg_VC(info);
		if (vc == columnRslt_act_flg) return doRslt_act_flg_VC(info);
		if (vc == columnRslt_aprv_no) return doRslt_aprv_no_VC(info);
		if (vc == columnRslt_aprv_sts_typ) return doRslt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_aprv_sts_typ_nm) return doRslt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_rvrs_flg) return doRslt_aprv_rvrs_flg_VC(info);
		if (vc == columnRslt_aprv_flg) return doRslt_aprv_flg_VC(info);
		if (vc == columnRslt_aprv_upd_flg) return doRslt_aprv_upd_flg_VC(info);
		if (vc == columnRslt_aprv_can_flg) return doRslt_aprv_can_flg_VC(info);
		if (vc == columnRslt_pay_sts_typ) return doRslt_pay_sts_typ_VC(info);
		if (vc == columnRslt_pay_sts_typ_nm) return doRslt_pay_sts_typ_nm_VC(info);
		if (vc == columnRslt_tax_on_pay_flg) return doRslt_tax_on_pay_flg_VC(info);
		if (vc == columnRslt_manual_flg) return doRslt_manual_flg_VC(info);
		if (vc == columnRslt_pay_spot_flg) return doRslt_pay_spot_flg_VC(info);
		if (vc == columnRslt_batch_pay_schd_cl_flg) return doRslt_batch_pay_schd_cl_flg_VC(info);
		if (vc == columnRslt_pay_schd_d_print_rmrks) return doRslt_pay_schd_d_print_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
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
		if (vc == columnRslt_xrate_base_dt) return doRslt_xrate_base_dt_VC(info);
		if (vc == Btn_prnt_out_flg) return doBtn_prnt_out_flg_VC(info);
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
	 * [Cnd]パネルの[unchk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unchk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_acpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_acpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_last_rjct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_last_rjct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_none_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_reg_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_reg_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_no_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[manual_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_manual_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[batch_pay_schd_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_batch_pay_schd_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_d_print_rmrks_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_wg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_reg_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_xrate_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inc_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inc_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_interim_cl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_ntc_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unchk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unchk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_rvrs_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_rvrs_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_can_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_on_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_on_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[manual_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_manual_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[batch_pay_schd_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_batch_pay_schd_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_d_print_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_prnt_out_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_unchk_flg) doCnd_unchk_flg_NC(info);
		else if (nc == Cnd_schd_flg) doCnd_schd_flg_NC(info);
		else if (nc == Cnd_act_flg) doCnd_act_flg_NC(info);
		else if (nc == Cnd_aprv_opn_flg) doCnd_aprv_opn_flg_NC(info);
		else if (nc == Cnd_aprv_fix_flg) doCnd_aprv_fix_flg_NC(info);
		else if (nc == Cnd_aprv_acpt_flg) doCnd_aprv_acpt_flg_NC(info);
		else if (nc == Cnd_aprv_rjct_flg) doCnd_aprv_rjct_flg_NC(info);
		else if (nc == Cnd_aprv_last_rjct_flg) doCnd_aprv_last_rjct_flg_NC(info);
		else if (nc == Cnd_aprv_none_flg) doCnd_aprv_none_flg_NC(info);
		else if (nc == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NC(info);
		else if (nc == Cnd_prnt_flg) doCnd_prnt_flg_NC(info);
		else if (nc == Cnd_reg_dt_fr) doCnd_reg_dt_fr_NC(info);
		else if (nc == Cnd_reg_dt_to) doCnd_reg_dt_to_NC(info);
		else if (nc == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NC(info);
		else if (nc == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NC(info);
		else if (nc == Cnd_psppl_cd) doCnd_psppl_cd_NC(info);
		else if (nc == Cnd_psppl_nm) doCnd_psppl_nm_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Cnd_pay_chk_no) doCnd_pay_chk_no_NC(info);
		else if (nc == Cnd_inc_no_pay_flg) doCnd_inc_no_pay_flg_NC(info);
		else if (nc == Cnd_inc_interim_flg) doCnd_inc_interim_flg_NC(info);
		else if (nc == Cnd_manual_flg) doCnd_manual_flg_NC(info);
		else if (nc == Cnd_pay_spot_flg) doCnd_pay_spot_flg_NC(info);
		else if (nc == Cnd_batch_pay_schd_cl_flg) doCnd_batch_pay_schd_cl_flg_NC(info);
		else if (nc == Cnd_new_flg) doCnd_new_flg_NC(info);
		else if (nc == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == BulkSet_reg_dt) doBulkSet_reg_dt_NC(info);
		else if (nc == BulkSet_wg_cd) doBulkSet_wg_cd_NC(info);
		else if (nc == BulkSet_wg_nm) doBulkSet_wg_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_prnt_flg) doRslt_prnt_flg_NC(info);
		else if (nc == columnRslt_reg_dt) doRslt_reg_dt_NC(info);
		else if (nc == columnRslt_psppl_cd) doRslt_psppl_cd_NC(info);
		else if (nc == columnRslt_psppl_nm) doRslt_psppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_purc_act_no) doRslt_purc_act_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NC(info);
		else if (nc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NC(info);
		else if (nc == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_pay_xrate_cd) doRslt_pay_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_inc_interim_flg) doRslt_inc_interim_flg_NC(info);
		else if (nc == columnRslt_purc_interim_cl_flg) doRslt_purc_interim_cl_flg_NC(info);
		else if (nc == columnRslt_pay_chk_no) doRslt_pay_chk_no_NC(info);
		else if (nc == columnRslt_pay_ntc_rev) doRslt_pay_ntc_rev_NC(info);
		else if (nc == columnRslt_unchk_flg) doRslt_unchk_flg_NC(info);
		else if (nc == columnRslt_schd_flg) doRslt_schd_flg_NC(info);
		else if (nc == columnRslt_act_flg) doRslt_act_flg_NC(info);
		else if (nc == columnRslt_aprv_no) doRslt_aprv_no_NC(info);
		else if (nc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_rvrs_flg) doRslt_aprv_rvrs_flg_NC(info);
		else if (nc == columnRslt_aprv_flg) doRslt_aprv_flg_NC(info);
		else if (nc == columnRslt_aprv_upd_flg) doRslt_aprv_upd_flg_NC(info);
		else if (nc == columnRslt_aprv_can_flg) doRslt_aprv_can_flg_NC(info);
		else if (nc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NC(info);
		else if (nc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NC(info);
		else if (nc == columnRslt_tax_on_pay_flg) doRslt_tax_on_pay_flg_NC(info);
		else if (nc == columnRslt_manual_flg) doRslt_manual_flg_NC(info);
		else if (nc == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NC(info);
		else if (nc == columnRslt_batch_pay_schd_cl_flg) doRslt_batch_pay_schd_cl_flg_NC(info);
		else if (nc == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
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
		else if (nc == columnRslt_xrate_base_dt) doRslt_xrate_base_dt_NC(info);
		else if (nc == Btn_prnt_out_flg) doBtn_prnt_out_flg_NC(info);
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
	 * [Cnd]パネルの[unchk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unchk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_acpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_acpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_last_rjct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_last_rjct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_none_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_no_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[manual_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_manual_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_pay_schd_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_pay_schd_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_reg_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inc_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inc_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unchk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unchk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_rvrs_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rvrs_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_can_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_on_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_on_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[manual_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_pay_schd_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_pay_schd_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_out_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_unchk_flg) doCnd_unchk_flg_NE(info);
		else if (ne == Cnd_schd_flg) doCnd_schd_flg_NE(info);
		else if (ne == Cnd_act_flg) doCnd_act_flg_NE(info);
		else if (ne == Cnd_aprv_opn_flg) doCnd_aprv_opn_flg_NE(info);
		else if (ne == Cnd_aprv_fix_flg) doCnd_aprv_fix_flg_NE(info);
		else if (ne == Cnd_aprv_acpt_flg) doCnd_aprv_acpt_flg_NE(info);
		else if (ne == Cnd_aprv_rjct_flg) doCnd_aprv_rjct_flg_NE(info);
		else if (ne == Cnd_aprv_last_rjct_flg) doCnd_aprv_last_rjct_flg_NE(info);
		else if (ne == Cnd_aprv_none_flg) doCnd_aprv_none_flg_NE(info);
		else if (ne == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NE(info);
		else if (ne == Cnd_prnt_flg) doCnd_prnt_flg_NE(info);
		else if (ne == Cnd_reg_dt_fr) doCnd_reg_dt_fr_NE(info);
		else if (ne == Cnd_reg_dt_to) doCnd_reg_dt_to_NE(info);
		else if (ne == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NE(info);
		else if (ne == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NE(info);
		else if (ne == Cnd_psppl_cd) doCnd_psppl_cd_NE(info);
		else if (ne == Cnd_psppl_nm) doCnd_psppl_nm_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Cnd_pay_chk_no) doCnd_pay_chk_no_NE(info);
		else if (ne == Cnd_inc_no_pay_flg) doCnd_inc_no_pay_flg_NE(info);
		else if (ne == Cnd_inc_interim_flg) doCnd_inc_interim_flg_NE(info);
		else if (ne == Cnd_manual_flg) doCnd_manual_flg_NE(info);
		else if (ne == Cnd_pay_spot_flg) doCnd_pay_spot_flg_NE(info);
		else if (ne == Cnd_batch_pay_schd_cl_flg) doCnd_batch_pay_schd_cl_flg_NE(info);
		else if (ne == Cnd_new_flg) doCnd_new_flg_NE(info);
		else if (ne == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == BulkSet_reg_dt) doBulkSet_reg_dt_NE(info);
		else if (ne == BulkSet_wg_cd) doBulkSet_wg_cd_NE(info);
		else if (ne == BulkSet_wg_nm) doBulkSet_wg_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_prnt_flg) doRslt_prnt_flg_NE(info);
		else if (ne == columnRslt_reg_dt) doRslt_reg_dt_NE(info);
		else if (ne == columnRslt_psppl_cd) doRslt_psppl_cd_NE(info);
		else if (ne == columnRslt_psppl_nm) doRslt_psppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_purc_act_no) doRslt_purc_act_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NE(info);
		else if (ne == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NE(info);
		else if (ne == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_pay_xrate_cd) doRslt_pay_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_inc_interim_flg) doRslt_inc_interim_flg_NE(info);
		else if (ne == columnRslt_purc_interim_cl_flg) doRslt_purc_interim_cl_flg_NE(info);
		else if (ne == columnRslt_pay_chk_no) doRslt_pay_chk_no_NE(info);
		else if (ne == columnRslt_pay_ntc_rev) doRslt_pay_ntc_rev_NE(info);
		else if (ne == columnRslt_unchk_flg) doRslt_unchk_flg_NE(info);
		else if (ne == columnRslt_schd_flg) doRslt_schd_flg_NE(info);
		else if (ne == columnRslt_act_flg) doRslt_act_flg_NE(info);
		else if (ne == columnRslt_aprv_no) doRslt_aprv_no_NE(info);
		else if (ne == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_rvrs_flg) doRslt_aprv_rvrs_flg_NE(info);
		else if (ne == columnRslt_aprv_flg) doRslt_aprv_flg_NE(info);
		else if (ne == columnRslt_aprv_upd_flg) doRslt_aprv_upd_flg_NE(info);
		else if (ne == columnRslt_aprv_can_flg) doRslt_aprv_can_flg_NE(info);
		else if (ne == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NE(info);
		else if (ne == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NE(info);
		else if (ne == columnRslt_tax_on_pay_flg) doRslt_tax_on_pay_flg_NE(info);
		else if (ne == columnRslt_manual_flg) doRslt_manual_flg_NE(info);
		else if (ne == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NE(info);
		else if (ne == columnRslt_batch_pay_schd_cl_flg) doRslt_batch_pay_schd_cl_flg_NE(info);
		else if (ne == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
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
		else if (ne == columnRslt_xrate_base_dt) doRslt_xrate_base_dt_NE(info);
		else if (ne == Btn_prnt_out_flg) doBtn_prnt_out_flg_NE(info);
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
	 * [Cnd]パネルの[unchk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unchk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_acpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_acpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_last_rjct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_last_rjct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_none_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_no_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[manual_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_manual_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_pay_schd_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_pay_schd_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_reg_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inc_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inc_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unchk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unchk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_rvrs_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rvrs_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_can_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_on_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_on_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[manual_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_pay_schd_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_pay_schd_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_out_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_unchk_flg) doCnd_unchk_flg_NX(info);
		else if (nx == Cnd_schd_flg) doCnd_schd_flg_NX(info);
		else if (nx == Cnd_act_flg) doCnd_act_flg_NX(info);
		else if (nx == Cnd_aprv_opn_flg) doCnd_aprv_opn_flg_NX(info);
		else if (nx == Cnd_aprv_fix_flg) doCnd_aprv_fix_flg_NX(info);
		else if (nx == Cnd_aprv_acpt_flg) doCnd_aprv_acpt_flg_NX(info);
		else if (nx == Cnd_aprv_rjct_flg) doCnd_aprv_rjct_flg_NX(info);
		else if (nx == Cnd_aprv_last_rjct_flg) doCnd_aprv_last_rjct_flg_NX(info);
		else if (nx == Cnd_aprv_none_flg) doCnd_aprv_none_flg_NX(info);
		else if (nx == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NX(info);
		else if (nx == Cnd_prnt_flg) doCnd_prnt_flg_NX(info);
		else if (nx == Cnd_reg_dt_fr) doCnd_reg_dt_fr_NX(info);
		else if (nx == Cnd_reg_dt_to) doCnd_reg_dt_to_NX(info);
		else if (nx == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NX(info);
		else if (nx == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NX(info);
		else if (nx == Cnd_psppl_cd) doCnd_psppl_cd_NX(info);
		else if (nx == Cnd_psppl_nm) doCnd_psppl_nm_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Cnd_pay_chk_no) doCnd_pay_chk_no_NX(info);
		else if (nx == Cnd_inc_no_pay_flg) doCnd_inc_no_pay_flg_NX(info);
		else if (nx == Cnd_inc_interim_flg) doCnd_inc_interim_flg_NX(info);
		else if (nx == Cnd_manual_flg) doCnd_manual_flg_NX(info);
		else if (nx == Cnd_pay_spot_flg) doCnd_pay_spot_flg_NX(info);
		else if (nx == Cnd_batch_pay_schd_cl_flg) doCnd_batch_pay_schd_cl_flg_NX(info);
		else if (nx == Cnd_new_flg) doCnd_new_flg_NX(info);
		else if (nx == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == BulkSet_reg_dt) doBulkSet_reg_dt_NX(info);
		else if (nx == BulkSet_wg_cd) doBulkSet_wg_cd_NX(info);
		else if (nx == BulkSet_wg_nm) doBulkSet_wg_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_prnt_flg) doRslt_prnt_flg_NX(info);
		else if (nx == columnRslt_reg_dt) doRslt_reg_dt_NX(info);
		else if (nx == columnRslt_psppl_cd) doRslt_psppl_cd_NX(info);
		else if (nx == columnRslt_psppl_nm) doRslt_psppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_purc_act_no) doRslt_purc_act_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NX(info);
		else if (nx == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NX(info);
		else if (nx == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_pay_xrate_cd) doRslt_pay_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_inc_interim_flg) doRslt_inc_interim_flg_NX(info);
		else if (nx == columnRslt_purc_interim_cl_flg) doRslt_purc_interim_cl_flg_NX(info);
		else if (nx == columnRslt_pay_chk_no) doRslt_pay_chk_no_NX(info);
		else if (nx == columnRslt_pay_ntc_rev) doRslt_pay_ntc_rev_NX(info);
		else if (nx == columnRslt_unchk_flg) doRslt_unchk_flg_NX(info);
		else if (nx == columnRslt_schd_flg) doRslt_schd_flg_NX(info);
		else if (nx == columnRslt_act_flg) doRslt_act_flg_NX(info);
		else if (nx == columnRslt_aprv_no) doRslt_aprv_no_NX(info);
		else if (nx == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_rvrs_flg) doRslt_aprv_rvrs_flg_NX(info);
		else if (nx == columnRslt_aprv_flg) doRslt_aprv_flg_NX(info);
		else if (nx == columnRslt_aprv_upd_flg) doRslt_aprv_upd_flg_NX(info);
		else if (nx == columnRslt_aprv_can_flg) doRslt_aprv_can_flg_NX(info);
		else if (nx == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NX(info);
		else if (nx == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NX(info);
		else if (nx == columnRslt_tax_on_pay_flg) doRslt_tax_on_pay_flg_NX(info);
		else if (nx == columnRslt_manual_flg) doRslt_manual_flg_NX(info);
		else if (nx == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NX(info);
		else if (nx == columnRslt_batch_pay_schd_cl_flg) doRslt_batch_pay_schd_cl_flg_NX(info);
		else if (nx == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
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
		else if (nx == columnRslt_xrate_base_dt) doRslt_xrate_base_dt_NX(info);
		else if (nx == Btn_prnt_out_flg) doBtn_prnt_out_flg_NX(info);
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
	 * [Cnd]パネルの[unchk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unchk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_acpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_acpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_last_rjct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_last_rjct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_none_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_no_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[manual_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_manual_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_pay_schd_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_pay_schd_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_reg_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inc_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inc_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unchk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unchk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_rvrs_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rvrs_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_can_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[tax_on_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_on_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[manual_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_pay_schd_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_pay_schd_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_out_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_reg_dt_fr) doCnd_reg_dt_fr_LC(info);
		else if (lc == Cnd_reg_dt_to) doCnd_reg_dt_to_LC(info);
		else if (lc == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_LC(info);
		else if (lc == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_LC(info);
		else if (lc == Cnd_psppl_cd) doCnd_psppl_cd_LC(info);
		else if (lc == Cnd_psppl_nm) doCnd_psppl_nm_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Cnd_pay_chk_no) doCnd_pay_chk_no_LC(info);
		else if (lc == Cnd_pay_schd_d_print_rmrks) doCnd_pay_schd_d_print_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_reg_dt) doBulkSet_reg_dt_LC(info);
		else if (lc == BulkSet_wg_cd) doBulkSet_wg_cd_LC(info);
		else if (lc == BulkSet_wg_nm) doBulkSet_wg_nm_LC(info);
		else if (lc == columnRslt_reg_dt) doRslt_reg_dt_LC(info);
		else if (lc == columnRslt_psppl_cd) doRslt_psppl_cd_LC(info);
		else if (lc == columnRslt_psppl_nm) doRslt_psppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_purc_act_no) doRslt_purc_act_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_LC(info);
		else if (lc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_LC(info);
		else if (lc == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_pay_xrate_cd) doRslt_pay_xrate_cd_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_pay_chk_no) doRslt_pay_chk_no_LC(info);
		else if (lc == columnRslt_pay_ntc_rev) doRslt_pay_ntc_rev_LC(info);
		else if (lc == columnRslt_aprv_no) doRslt_aprv_no_LC(info);
		else if (lc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_LC(info);
		else if (lc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_LC(info);
		else if (lc == columnRslt_pay_schd_d_print_rmrks) doRslt_pay_schd_d_print_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
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
		else if (lc == columnRslt_xrate_base_dt) doRslt_xrate_base_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[reg_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_schd_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_d_print_rmrks_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_reg_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_ntc_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_rev_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_schd_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_d_print_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_base_dt_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[BulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_bsppl_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_wg_cd]の作成メソッド
	 */
	public MCList getBulkSet_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wg_cd]の作成メソッド
	 */
	public MCList getRslt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bsppl_cl_day]の作成メソッド
	 */
	public MCList getRslt_bsppl_cl_day(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0090.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0090.MSUAP_List", this)).getBsppl_PaySchdClDay(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0020.Srch01")) {
			return new MS_MSBHL0020_Srch01Bridge();
		}
		if (id.equals("MS.MSBHL0020.Ins01")) {
			return new MS_MSBHL0020_Ins01Bridge();
		}
		if (id.equals("MS.MSBHL0020.Del01")) {
			return new MS_MSBHL0020_Del01Bridge();
		}
		if (id.equals("MS.MSBHL0020.Prnt01")) {
			return new MS_MSBHL0020_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0020_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0020_Srch01Bridge() {
			p_MS_MSBHL0020_Srch01 = new MCParam(PDef.MS_MSBHL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.ApdR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.PayActR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.AdvPayActR.class));

			p_MS_MSBHL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0020.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0020.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0020.ApdR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.ApdR>)down(1);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0020.PayActR> down2() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.PayActR>)down(2);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR> down3() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR>)down(3);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
			p_MS_MSBHL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.ApdR.class));
			p_MS_MSBHL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.PayActR.class));
			p_MS_MSBHL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.AdvPayActR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0020_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)p_MS_MSBHL0020_Srch01.getContainerParam().getDownBlock(0));
			setApdL((MCList<mcframe.clientMSBH.MSBHP0020.ApdR>)p_MS_MSBHL0020_Srch01.getContainerParam().getDownBlock(1));
			setPayActL((MCList<mcframe.clientMSBH.MSBHP0020.PayActR>)p_MS_MSBHL0020_Srch01.getContainerParam().getDownBlock(2));
			setAdvPayActL((MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR>)p_MS_MSBHL0020_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getRsltL().clear();
			getApdL().clear();
			getPayActL().clear();
			getAdvPayActL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getApdL());
			result.add(getPayActL());
			result.add(getAdvPayActL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0020_Ins01;

		/** コンストラクタ */
		protected MS_MSBHL0020_Ins01Bridge() {
			p_MS_MSBHL0020_Ins01 = new MCParam(PDef.MS_MSBHL0020_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0020_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.ApdR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.PayActR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.AdvPayActR.class));
			param.addUpBlock(mcframe.clientMSBH.MSBHP0020.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));

			p_MS_MSBHL0020_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0020_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0020_Ins01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBHL0020_Ins01.addUpBlock(getApdL().shallowClone());
			p_MS_MSBHL0020_Ins01.addUpBlock(getPayActL().shallowClone());
			p_MS_MSBHL0020_Ins01.addUpBlock(getAdvPayActL().shallowClone());
			p_MS_MSBHL0020_Ins01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0020_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0020_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0020.ApdR> up1() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.ApdR>)up(1);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0020.PayActR> up2() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.PayActR>)up(2);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR> up3() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.AdvPayActR>)up(3);
		}
		protected mcframe.clientMSBH.MSBHP0020.BtnR up4() {
			return (mcframe.clientMSBH.MSBHP0020.BtnR)up(4);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0020_Ins01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0020_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)p_MS_MSBHL0020_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getApdL());
			result.add(getPayActL());
			result.add(getAdvPayActL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0020_Del01;

		/** コンストラクタ */
		protected MS_MSBHL0020_Del01Bridge() {
			p_MS_MSBHL0020_Del01 = new MCParam(PDef.MS_MSBHL0020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));

			p_MS_MSBHL0020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0020_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0020_Del01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0020_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)p_MS_MSBHL0020_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBHL0020_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0020_Prnt01;

		/** コンストラクタ */
		protected MS_MSBHL0020_Prnt01Bridge() {
			p_MS_MSBHL0020_Prnt01 = new MCParam(PDef.MS_MSBHL0020_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0020_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
			param.addUpBlock(mcframe.clientMSBH.MSBHP0020.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));

			p_MS_MSBHL0020_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0020_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0020_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBHL0020_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0020_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0020_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)up(0);
		}
		protected mcframe.clientMSBH.MSBHP0020.BtnR up1() {
			return (mcframe.clientMSBH.MSBHP0020.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0020_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0020_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0020.RsltR>)p_MS_MSBHL0020_Prnt01.getContainerParam().getDownBlock(0));
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