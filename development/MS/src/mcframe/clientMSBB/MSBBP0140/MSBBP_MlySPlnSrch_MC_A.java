package mcframe.clientMSBB.MSBBP0140;

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
import mcframe.clientMSBB.MSBBP0140.MSBBP_MlySPlnSrch_MC.MS_MSBBL0140_Srch01Caller;
import mcframe.clientMSBB.MSBBP0140.MSBBP_MlySPlnSrch_MC.MS_MSBBL0140_Srch02Caller;

/**
 * 画面"MSBBP_MlySPlnSrch"パネルクラスです。<p>
 *
 * 入力別／集計別販売計画バージョンを参照する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_MlySPlnSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBP0140";

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
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_USR = null;
	public MCRadioButton Cnd_ope_SUM = null;
	public MCLabel Cnd_usr_ym_fr_Label = null;
	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_usr_ym_fr = null;
	public MCLabel Cnd_usr_ym_to_Label = null;
	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_usr_ym_to = null;
	public MCLabel Cnd_usr_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_usr_nm = null;
	/**
	 * By dept. 部門別.<p>
	 *
	 */
	public MCCheckBox Cnd_usr_dpt_flg = null;
	/**
	 * By customer 得意先別.<p>
	 *
	 */
	public MCCheckBox Cnd_usr_cst_flg = null;
	/**
	 * By sales project No. 案件ＮＯ別.<p>
	 *
	 */
	public MCCheckBox Cnd_usr_wrk_flg = null;
	/**
	 * Editing 編集中.<p>
	 *
	 */
	public MCCheckBox Cnd_usr_edited_f_flg = null;
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public MCCheckBox Cnd_usr_edited_t_flg = null;
	public MCLabel Cnd_usr_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_usr_dpt_nm = null;
	public MCLabel Cnd_usr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_usr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_usr_wg_nm = null;
	public MCLabel Cnd_usr_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_usr_cst_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_usr_wrk_no_p_PPanel;
	public MCTextField Cnd_usr_wrk_no;	// [Cnd]の[usr_wrk_no_p.wrk_no]を[Cnd_usr_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_usr_wrk_nm;	// [Cnd]の[usr_wrk_no_p.wrk_nm]を[Cnd_usr_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_usr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_usr_intr_rmrks = null;
	public MCLabel Cnd_usr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_usr_sub_char1 = null;
	public MCLabel Cnd_usr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_usr_sub_char2 = null;
	public MCLabel Cnd_usr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_usr_sub_char3 = null;
	public MCLabel Cnd_sum_ym_fr_Label = null;
	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sum_ym_fr = null;
	public MCLabel Cnd_sum_ym_to_Label = null;
	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sum_ym_to = null;
	public MCLabel Cnd_sum_spln_vers_Label = null;
	/**
	 * Version バージョン.<p>
	 *
	 */
	public MCTextField Cnd_sum_spln_vers = null;
	/**
	 * Editing 編集中.<p>
	 *
	 */
	public MCCheckBox Cnd_sum_edited_f_flg = null;
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public MCCheckBox Cnd_sum_edited_t_flg = null;
	/**
	 * Adopt 採用.<p>
	 *
	 */
	public MCCheckBox Cnd_sum_adopted_t_flg = null;
	/**
	 * Not adopted 不採用.<p>
	 *
	 */
	public MCCheckBox Cnd_sum_adopted_f_flg = null;
	public MCLabel Cnd_sum_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sum_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_sum_dpt_nm = null;
	public MCLabel Cnd_sum_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sum_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_sum_wg_nm = null;
	public MCLabel Cnd_sum_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sum_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_sum_cst_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_sum_wrk_no_p_PPanel;
	public MCTextField Cnd_sum_wrk_no;	// [Cnd]の[sum_wrk_no_p.wrk_no]を[Cnd_sum_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_sum_wrk_nm;	// [Cnd]の[sum_wrk_no_p.wrk_nm]を[Cnd_sum_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_sum_usr_cd_Label = null;
	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sum_usr_cd = null;
	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sum_usr_nm = null;
	public MCLabel Cnd_sum_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_sum_intr_rmrks = null;
	public MCLabel Cnd_sum_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sum_sub_char1 = null;
	public MCLabel Cnd_sum_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sum_sub_char2 = null;
	public MCLabel Cnd_sum_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sum_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[bp_grp_p.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[bp_grp_p.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[bp_grp_p.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[bp_grp_p.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[bp_grp_p.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[bp_grp_p.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[bp_grp_p.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[bp_grp_p.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[bp_grp_p.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[bp_grp_p.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP0140.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Version バージョン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_vers = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_nm = null;
	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_st_ym = null;
	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_end_ym = null;
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edited_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	/**
	 * Adopt 採用.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adopted_flg = null;
	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_locked_flg = null;
	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_vers = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_sub_char3 = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sum_sub_char3 = null;
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
	 * Monthly sales plan entry 月次販売計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP0110 = null;
	/** [SRCH_USR]モードを表す定数 */
	public static final String SRCH_USR = "SRCH_USR";
	/** [REF_USR]モードを表す定数 */
	public static final String REF_USR = "REF_USR";
	/** [SRCH_SUM]モードを表す定数 */
	public static final String SRCH_SUM = "SRCH_SUM";
	/** [REF_SUM]モードを表す定数 */
	public static final String REF_SUM = "REF_SUM";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_USR, REF_USR, SRCH_SUM, REF_SUM};
	
	/** [MS_MSBBL0140_Srch01]のCallerの作成 */
	protected MSBBP_MlySPlnSrch_MC.MS_MSBBL0140_Srch01Caller createMS_MSBBL0140_Srch01() {
		MSBBP_MlySPlnSrch_MC.MS_MSBBL0140_Srch01Caller<MSBBP_MlySPlnSrch, MS_MSBBL0140_Srch01Bridge>
		caller = ((MSBBP_MlySPlnSrch_MC)this).new MS_MSBBL0140_Srch01Caller<MSBBP_MlySPlnSrch, MS_MSBBL0140_Srch01Bridge>(
					(MSBBP_MlySPlnSrch)this, new MS_MSBBL0140_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL0140_Srch01]の呼び出し */
	protected void callMS_MSBBL0140_Srch01() {
		MCCaller caller = createMS_MSBBL0140_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL0140_Srch02]のCallerの作成 */
	protected MSBBP_MlySPlnSrch_MC.MS_MSBBL0140_Srch02Caller createMS_MSBBL0140_Srch02() {
		MSBBP_MlySPlnSrch_MC.MS_MSBBL0140_Srch02Caller<MSBBP_MlySPlnSrch, MS_MSBBL0140_Srch02Bridge>
		caller = ((MSBBP_MlySPlnSrch_MC)this).new MS_MSBBL0140_Srch02Caller<MSBBP_MlySPlnSrch, MS_MSBBL0140_Srch02Bridge>(
					(MSBBP_MlySPlnSrch)this, new MS_MSBBL0140_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL0140_Srch02]の呼び出し */
	protected void callMS_MSBBL0140_Srch02() {
		MCCaller caller = createMS_MSBBL0140_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0140.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0140.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0140.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP0140.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP0140.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0140.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP0140.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP0140.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0140.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0140.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_MlySPlnSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_MlySPlnSrch_MC_A(String name) {
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
		MSBBP_MlySPlnSrch_MC.jbCreateScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateTop((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateFold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateTab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateTab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateTab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateCnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateCnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateCnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateCtrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateRslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbCreateBtn((MSBBP_MlySPlnSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_MlySPlnSrch p) {
		p.Cnd_usr_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().usr_wrk_no_p());
		p.Cnd_usr_wrk_no_p_PPanel.setName("Cnd.usr_wrk_no_p");
		p.Cnd_usr_wrk_no = p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_usr_wrk_no.addAliasName("Cnd.usr_wrk_no", p);
		p.Cnd_usr_wrk_nm = p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_usr_wrk_nm.addAliasName("Cnd.usr_wrk_nm", p);
		p.Cnd_sum_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().sum_wrk_no_p());
		p.Cnd_sum_wrk_no_p_PPanel.setName("Cnd.sum_wrk_no_p");
		p.Cnd_sum_wrk_no = p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_sum_wrk_no.addAliasName("Cnd.sum_wrk_no", p);
		p.Cnd_sum_wrk_nm = p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_sum_wrk_nm.addAliasName("Cnd.sum_wrk_nm", p);
		p.Cnd_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp_p());
		p.Cnd_bp_grp_p_PPanel.setName("Cnd.bp_grp_p");
		p.Cnd_bp_grp_lab1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_MlySPlnSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_MlySPlnSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_MlySPlnSrch p) {
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

	
	/** [Cnd_usr_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_usr_cd_p = null;

	/**
	 * [Cnd_usr_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_usr_cd_ListPutter() {
		if (Cnd_usr_usr_cd_p == null) {
			Cnd_usr_usr_cd_p = createCnd_usr_usr_cd_ListPutter(Cnd_usr_usr_cd, "usr_usr_cd", "usr_usr_nm");

		}
		return Cnd_usr_usr_cd_p;
	}
	
	
	/** [Cnd_usr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_dpt_cd_p = null;

	/**
	 * [Cnd_usr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_dpt_cd_ListPutter() {
		if (Cnd_usr_dpt_cd_p == null) {
			Cnd_usr_dpt_cd_p = createCnd_usr_dpt_cd_ListPutter(Cnd_usr_dpt_cd, "usr_dpt_cd", "usr_dpt_nm");

		}
		return Cnd_usr_dpt_cd_p;
	}
	
	
	/** [Cnd_usr_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_wg_cd_p = null;

	/**
	 * [Cnd_usr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_wg_cd_ListPutter() {
		if (Cnd_usr_wg_cd_p == null) {
			Cnd_usr_wg_cd_p = createCnd_usr_wg_cd_ListPutter(Cnd_usr_wg_cd, "usr_wg_cd", "usr_wg_nm");

		}
		return Cnd_usr_wg_cd_p;
	}
	
	
	/** [Cnd_usr_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_cst_cd_p = null;

	/**
	 * [Cnd_usr_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_cst_cd_ListPutter() {
		if (Cnd_usr_cst_cd_p == null) {
			Cnd_usr_cst_cd_p = createCnd_usr_cst_cd_ListPutter(Cnd_usr_cst_cd, "usr_cst_cd", "usr_cst_nm");

		}
		return Cnd_usr_cst_cd_p;
	}
	
	
	/** [Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_p = null;

	/**
	 * [Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter() {
		if (Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_p == null) {
			Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_p = createCnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no, "usr_wrk_no", "usr_wrk_nm");
		}
		return Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_p;
	}
	
	
	/** [Cnd_sum_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sum_dpt_cd_p = null;

	/**
	 * [Cnd_sum_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sum_dpt_cd_ListPutter() {
		if (Cnd_sum_dpt_cd_p == null) {
			Cnd_sum_dpt_cd_p = createCnd_sum_dpt_cd_ListPutter(Cnd_sum_dpt_cd, "sum_dpt_cd", "sum_dpt_nm");

		}
		return Cnd_sum_dpt_cd_p;
	}
	
	
	/** [Cnd_sum_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sum_wg_cd_p = null;

	/**
	 * [Cnd_sum_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sum_wg_cd_ListPutter() {
		if (Cnd_sum_wg_cd_p == null) {
			Cnd_sum_wg_cd_p = createCnd_sum_wg_cd_ListPutter(Cnd_sum_wg_cd, "sum_wg_cd", "sum_wg_nm");

		}
		return Cnd_sum_wg_cd_p;
	}
	
	
	/** [Cnd_sum_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sum_cst_cd_p = null;

	/**
	 * [Cnd_sum_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sum_cst_cd_ListPutter() {
		if (Cnd_sum_cst_cd_p == null) {
			Cnd_sum_cst_cd_p = createCnd_sum_cst_cd_ListPutter(Cnd_sum_cst_cd, "sum_cst_cd", "sum_cst_nm");

		}
		return Cnd_sum_cst_cd_p;
	}
	
	
	/** [Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_p = null;

	/**
	 * [Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter() {
		if (Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_p == null) {
			Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_p = createCnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no, "sum_wrk_no", "sum_wrk_nm");
		}
		return Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_p;
	}
	
	
	/** [Cnd_sum_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sum_usr_cd_p = null;

	/**
	 * [Cnd_sum_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sum_usr_cd_ListPutter() {
		if (Cnd_sum_usr_cd_p == null) {
			Cnd_sum_usr_cd_p = createCnd_sum_usr_cd_ListPutter(Cnd_sum_usr_cd, "sum_usr_cd", "sum_usr_nm");

		}
		return Cnd_sum_usr_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_MlySPlnSrch create(){
		MSBBP_MlySPlnSrch p = new MSBBP_MlySPlnSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_MlySPlnSrch create(String name){
		MSBBP_MlySPlnSrch p = new MSBBP_MlySPlnSrch(name);
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
		MSBBP_MlySPlnSrch_MC.jbfInitScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitTop((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitFold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitTab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitTab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitTab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitCnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitCnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitCnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitCtrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitRslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbfInitBtn((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitTop((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitFold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitTab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitTab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitTab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitCnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitCnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitCnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitCtrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitRslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.jbInitBtn((MSBBP_MlySPlnSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_MlySPlnSrch p) {
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
	protected static void jbfInitTab1(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_USR = p.beansFactory.createRadioButton("Cnd.ope_USR");
		p.Cnd_ope_SUM = p.beansFactory.createRadioButton("Cnd.ope_SUM");
		p.Cnd_usr_ym_fr_Label = p.beansFactory.createLabel("Cnd.usr_ym_fr_Label");
		p.Cnd_usr_ym_fr = p.beansFactory.createDateField("Cnd.usr_ym_fr");
		p.Cnd_usr_ym_fr.setLabel(p.Cnd_usr_ym_fr_Label);
		p.Cnd_usr_ym_to_Label = p.beansFactory.createLabel("Cnd.usr_ym_to_Label");
		p.Cnd_usr_ym_to = p.beansFactory.createDateField("Cnd.usr_ym_to");
		p.Cnd_usr_ym_to.setLabel(p.Cnd_usr_ym_to_Label);
		p.Cnd_usr_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_usr_cd_Label");
		p.Cnd_usr_usr_cd = p.beansFactory.createTextField("Cnd.usr_usr_cd");
		p.Cnd_usr_usr_cd.setLabel(p.Cnd_usr_usr_cd_Label);
		p.Cnd_usr_usr_nm = p.beansFactory.createTextField("Cnd.usr_usr_nm");
		p.Cnd_usr_dpt_flg = p.beansFactory.createCheckBox("Cnd.usr_dpt_flg");
		p.Cnd_usr_cst_flg = p.beansFactory.createCheckBox("Cnd.usr_cst_flg");
		p.Cnd_usr_wrk_flg = p.beansFactory.createCheckBox("Cnd.usr_wrk_flg");
		p.Cnd_usr_edited_f_flg = p.beansFactory.createCheckBox("Cnd.usr_edited_f_flg");
		p.Cnd_usr_edited_t_flg = p.beansFactory.createCheckBox("Cnd.usr_edited_t_flg");
		p.Cnd_usr_dpt_cd_Label = p.beansFactory.createLabel("Cnd.usr_dpt_cd_Label");
		p.Cnd_usr_dpt_cd = p.beansFactory.createTextField("Cnd.usr_dpt_cd");
		p.Cnd_usr_dpt_cd.setLabel(p.Cnd_usr_dpt_cd_Label);
		p.Cnd_usr_dpt_nm = p.beansFactory.createTextField("Cnd.usr_dpt_nm");
		p.Cnd_usr_wg_cd_Label = p.beansFactory.createLabel("Cnd.usr_wg_cd_Label");
		p.Cnd_usr_wg_cd = p.beansFactory.createTextComboBox("Cnd.usr_wg_cd");
		p.Cnd_usr_wg_cd.setLabel(p.Cnd_usr_wg_cd_Label);
		p.Cnd_usr_wg_nm = p.beansFactory.createTextField("Cnd.usr_wg_nm");
		p.Cnd_usr_cst_cd_Label = p.beansFactory.createLabel("Cnd.usr_cst_cd_Label");
		p.Cnd_usr_cst_cd = p.beansFactory.createTextField("Cnd.usr_cst_cd");
		p.Cnd_usr_cst_cd.setLabel(p.Cnd_usr_cst_cd_Label);
		p.Cnd_usr_cst_nm = p.beansFactory.createTextField("Cnd.usr_cst_nm");
		p.Cnd_usr_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.usr_intr_rmrks_Label");
		p.Cnd_usr_intr_rmrks = p.beansFactory.createTextField("Cnd.usr_intr_rmrks");
		p.Cnd_usr_intr_rmrks.setLabel(p.Cnd_usr_intr_rmrks_Label);
		p.Cnd_usr_sub_char1_Label = p.beansFactory.createLabel("Cnd.usr_sub_char1_Label");
		p.Cnd_usr_sub_char1 = p.beansFactory.createTextField("Cnd.usr_sub_char1");
		p.Cnd_usr_sub_char1.setLabel(p.Cnd_usr_sub_char1_Label);
		p.Cnd_usr_sub_char2_Label = p.beansFactory.createLabel("Cnd.usr_sub_char2_Label");
		p.Cnd_usr_sub_char2 = p.beansFactory.createTextField("Cnd.usr_sub_char2");
		p.Cnd_usr_sub_char2.setLabel(p.Cnd_usr_sub_char2_Label);
		p.Cnd_usr_sub_char3_Label = p.beansFactory.createLabel("Cnd.usr_sub_char3_Label");
		p.Cnd_usr_sub_char3 = p.beansFactory.createTextField("Cnd.usr_sub_char3");
		p.Cnd_usr_sub_char3.setLabel(p.Cnd_usr_sub_char3_Label);
		p.Cnd_sum_ym_fr_Label = p.beansFactory.createLabel("Cnd.sum_ym_fr_Label");
		p.Cnd_sum_ym_fr = p.beansFactory.createDateField("Cnd.sum_ym_fr");
		p.Cnd_sum_ym_fr.setLabel(p.Cnd_sum_ym_fr_Label);
		p.Cnd_sum_ym_to_Label = p.beansFactory.createLabel("Cnd.sum_ym_to_Label");
		p.Cnd_sum_ym_to = p.beansFactory.createDateField("Cnd.sum_ym_to");
		p.Cnd_sum_ym_to.setLabel(p.Cnd_sum_ym_to_Label);
		p.Cnd_sum_spln_vers_Label = p.beansFactory.createLabel("Cnd.sum_spln_vers_Label");
		p.Cnd_sum_spln_vers = p.beansFactory.createTextField("Cnd.sum_spln_vers");
		p.Cnd_sum_spln_vers.setLabel(p.Cnd_sum_spln_vers_Label);
		p.Cnd_sum_edited_f_flg = p.beansFactory.createCheckBox("Cnd.sum_edited_f_flg");
		p.Cnd_sum_edited_t_flg = p.beansFactory.createCheckBox("Cnd.sum_edited_t_flg");
		p.Cnd_sum_adopted_t_flg = p.beansFactory.createCheckBox("Cnd.sum_adopted_t_flg");
		p.Cnd_sum_adopted_f_flg = p.beansFactory.createCheckBox("Cnd.sum_adopted_f_flg");
		p.Cnd_sum_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sum_dpt_cd_Label");
		p.Cnd_sum_dpt_cd = p.beansFactory.createTextField("Cnd.sum_dpt_cd");
		p.Cnd_sum_dpt_cd.setLabel(p.Cnd_sum_dpt_cd_Label);
		p.Cnd_sum_dpt_nm = p.beansFactory.createTextField("Cnd.sum_dpt_nm");
		p.Cnd_sum_wg_cd_Label = p.beansFactory.createLabel("Cnd.sum_wg_cd_Label");
		p.Cnd_sum_wg_cd = p.beansFactory.createTextComboBox("Cnd.sum_wg_cd");
		p.Cnd_sum_wg_cd.setLabel(p.Cnd_sum_wg_cd_Label);
		p.Cnd_sum_wg_nm = p.beansFactory.createTextField("Cnd.sum_wg_nm");
		p.Cnd_sum_cst_cd_Label = p.beansFactory.createLabel("Cnd.sum_cst_cd_Label");
		p.Cnd_sum_cst_cd = p.beansFactory.createTextField("Cnd.sum_cst_cd");
		p.Cnd_sum_cst_cd.setLabel(p.Cnd_sum_cst_cd_Label);
		p.Cnd_sum_cst_nm = p.beansFactory.createTextField("Cnd.sum_cst_nm");
		p.Cnd_sum_usr_cd_Label = p.beansFactory.createLabel("Cnd.sum_usr_cd_Label");
		p.Cnd_sum_usr_cd = p.beansFactory.createTextField("Cnd.sum_usr_cd");
		p.Cnd_sum_usr_cd.setLabel(p.Cnd_sum_usr_cd_Label);
		p.Cnd_sum_usr_nm = p.beansFactory.createTextField("Cnd.sum_usr_nm");
		p.Cnd_sum_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.sum_intr_rmrks_Label");
		p.Cnd_sum_intr_rmrks = p.beansFactory.createTextField("Cnd.sum_intr_rmrks");
		p.Cnd_sum_intr_rmrks.setLabel(p.Cnd_sum_intr_rmrks_Label);
		p.Cnd_sum_sub_char1_Label = p.beansFactory.createLabel("Cnd.sum_sub_char1_Label");
		p.Cnd_sum_sub_char1 = p.beansFactory.createTextField("Cnd.sum_sub_char1");
		p.Cnd_sum_sub_char1.setLabel(p.Cnd_sum_sub_char1_Label);
		p.Cnd_sum_sub_char2_Label = p.beansFactory.createLabel("Cnd.sum_sub_char2_Label");
		p.Cnd_sum_sub_char2 = p.beansFactory.createTextField("Cnd.sum_sub_char2");
		p.Cnd_sum_sub_char2.setLabel(p.Cnd_sum_sub_char2_Label);
		p.Cnd_sum_sub_char3_Label = p.beansFactory.createLabel("Cnd.sum_sub_char3_Label");
		p.Cnd_sum_sub_char3 = p.beansFactory.createTextField("Cnd.sum_sub_char3");
		p.Cnd_sum_sub_char3.setLabel(p.Cnd_sum_sub_char3_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_spln_vers = p.beansFactory.createTableColumn("Rslt.spln_vers", MCColumnType.TEXT);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_wrk_nm = p.beansFactory.createTableColumn("Rslt.wrk_nm", MCColumnType.TEXT);
		p.columnRslt_spln_st_ym = p.beansFactory.createTableColumn("Rslt.spln_st_ym", MCColumnType.DATE);
		p.columnRslt_spln_end_ym = p.beansFactory.createTableColumn("Rslt.spln_end_ym", MCColumnType.DATE);
		p.columnRslt_edited_flg = p.beansFactory.createTableColumn("Rslt.edited_flg", MCColumnType.CHECK);
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_adopted_flg = p.beansFactory.createTableColumn("Rslt.adopted_flg", MCColumnType.CHECK);
		p.columnRslt_locked_flg = p.beansFactory.createTableColumn("Rslt.locked_flg", MCColumnType.CHECK);
		p.columnRslt_ref_vers = p.beansFactory.createTableColumn("Rslt.ref_vers", MCColumnType.TEXT);
		p.columnRslt_usr_intr_rmrks = p.beansFactory.createTableColumn("Rslt.usr_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_usr_sub_char1 = p.beansFactory.createTableColumn("Rslt.usr_sub_char1", MCColumnType.TEXT);
		p.columnRslt_usr_sub_char2 = p.beansFactory.createTableColumn("Rslt.usr_sub_char2", MCColumnType.TEXT);
		p.columnRslt_usr_sub_char3 = p.beansFactory.createTableColumn("Rslt.usr_sub_char3", MCColumnType.TEXT);
		p.columnRslt_sum_intr_rmrks = p.beansFactory.createTableColumn("Rslt.sum_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sum_sub_char1 = p.beansFactory.createTableColumn("Rslt.sum_sub_char1", MCColumnType.TEXT);
		p.columnRslt_sum_sub_char2 = p.beansFactory.createTableColumn("Rslt.sum_sub_char2", MCColumnType.TEXT);
		p.columnRslt_sum_sub_char3 = p.beansFactory.createTableColumn("Rslt.sum_sub_char3", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP0110 = p.beansFactory.createButton("Btn.open_MSBBP0110", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_MlySPlnSrch p) {
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
	protected static void jbInitTop(MSBBP_MlySPlnSrch p) {
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
	protected static void jbInitFold(MSBBP_MlySPlnSrch p) {
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
	protected static void jbInitTab1(MSBBP_MlySPlnSrch p) {
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
	protected static void jbInitTab2(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_USR);
		p.Cnd_ope_USR.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_USR);
		p.ScreenOpePanel.add(p.Cnd_ope_USR);
		p.Cnd_ope_USR.setNextBeans(p.Cnd_ope_SUM);
		p.Cnd_ope_SUM.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_SUM);
		p.ScreenOpePanel.add(p.Cnd_ope_SUM);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.ope_META);
		p.CndPanel.add(p.Cnd_usr_ym_fr_Label);
		p.CndPanel.add(p.Cnd_usr_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_usr_ym_fr);
		p.Cnd_usr_ym_fr.setNextBeans(p.Cnd_usr_ym_to);
		p.Cnd_usr_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_ym_fr_META);
		p.Cnd_usr_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_usr_ym_to_Label);
		p.CndPanel.add(p.Cnd_usr_ym_to);
		p.Cnd_usr_ym_to.setNextBeans(p.Cnd_usr_usr_cd);
		p.Cnd_usr_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_ym_to_META);
		p.Cnd_usr_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_usr_usr_cd_Label);
		p.CndPanel.add(p.Cnd_usr_usr_cd);
		p.Cnd_usr_usr_cd.setNextBeans(p.Cnd_usr_usr_nm);
		p.Cnd_usr_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_usr_cd_META);
		p.Cnd_usr_usr_cd.addLinkBeans(p.Cnd_usr_usr_nm);
		p.Cnd_usr_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_usr_nm);
		p.Cnd_usr_usr_nm.setNextBeans(p.Cnd_usr_dpt_flg);
		p.Cnd_usr_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_usr_nm, true);
		p.CndPanel.add(p.Cnd_usr_dpt_flg);
		p.Cnd_usr_dpt_flg.setNextBeans(p.Cnd_usr_cst_flg);
		p.Cnd_usr_dpt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_dpt_flg_META);
		p.CndPanel.add(p.Cnd_usr_cst_flg);
		p.Cnd_usr_cst_flg.setNextBeans(p.Cnd_usr_wrk_flg);
		p.Cnd_usr_cst_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_cst_flg_META);
		p.CndPanel.add(p.Cnd_usr_wrk_flg);
		p.Cnd_usr_wrk_flg.setNextBeans(p.Cnd_usr_edited_f_flg);
		p.Cnd_usr_wrk_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_wrk_flg_META);
		p.CndPanel.add(p.Cnd_usr_edited_f_flg);
		p.Cnd_usr_edited_f_flg.setNextBeans(p.Cnd_usr_edited_t_flg);
		p.Cnd_usr_edited_f_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_edited_f_flg_META);
		p.CndPanel.add(p.Cnd_usr_edited_t_flg);
		p.Cnd_usr_edited_t_flg.setNextBeans(p.Cnd_usr_dpt_cd);
		p.Cnd_usr_edited_t_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_edited_t_flg_META);
		p.CndPanel.add(p.Cnd_usr_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_usr_dpt_cd);
		p.Cnd_usr_dpt_cd.setNextBeans(p.Cnd_usr_dpt_nm);
		p.Cnd_usr_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_dpt_cd_META);
		p.Cnd_usr_dpt_cd.addLinkBeans(p.Cnd_usr_dpt_nm);
		p.Cnd_usr_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_dpt_cd, true);
		p.CndPanel.add(p.Cnd_usr_dpt_nm);
		p.Cnd_usr_dpt_nm.setNextBeans(p.Cnd_usr_wg_cd);
		p.Cnd_usr_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_dpt_nm, true);
		p.Cnd_usr_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_wg_cd, true);
		p.Cnd_usr_wg_cd.setLinkBeans(p.Cnd_usr_wg_nm);
		p.CndPanel.add(p.Cnd_usr_wg_cd_Label);
		p.CndPanel.add(p.Cnd_usr_wg_cd);
		p.Cnd_usr_wg_cd.setNextBeans(p.Cnd_usr_wg_nm);
		p.Cnd_usr_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_wg_cd_META);
		p.CndPanel.add(p.Cnd_usr_wg_nm);
		p.Cnd_usr_wg_nm.setNextBeans(p.Cnd_usr_cst_cd);
		p.Cnd_usr_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_wg_nm, true);
		p.CndPanel.add(p.Cnd_usr_cst_cd_Label);
		p.CndPanel.add(p.Cnd_usr_cst_cd);
		p.Cnd_usr_cst_cd.setNextBeans(p.Cnd_usr_cst_nm);
		p.Cnd_usr_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_cst_cd_META);
		p.Cnd_usr_cst_cd.addLinkBeans(p.Cnd_usr_cst_nm);
		p.Cnd_usr_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cst_cd, true);
		p.CndPanel.add(p.Cnd_usr_cst_nm);
		p.Cnd_usr_cst_nm.setNextBeans(p.Cnd_usr_wrk_no_p_PPanel);
		p.Cnd_usr_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_cst_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_cst_nm, true);
		p.CndPanel.add(p.Cnd_usr_wrk_no_p_PPanel);
		p.Cnd_usr_wrk_no_p_PPanel.setNextBeans(p.Cnd_usr_intr_rmrks);
		p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no, true);
		p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.Cnd_usr_wrk_nm);
		p.setPluralValueEnable(p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_usr_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_usr_intr_rmrks);
		p.Cnd_usr_intr_rmrks.setNextBeans(p.Cnd_usr_sub_char1);
		p.Cnd_usr_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_usr_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_usr_sub_char1_Label);
		p.CndPanel.add(p.Cnd_usr_sub_char1);
		p.Cnd_usr_sub_char1.setNextBeans(p.Cnd_usr_sub_char2);
		p.Cnd_usr_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_usr_sub_char1, true);
		p.CndPanel.add(p.Cnd_usr_sub_char2_Label);
		p.CndPanel.add(p.Cnd_usr_sub_char2);
		p.Cnd_usr_sub_char2.setNextBeans(p.Cnd_usr_sub_char3);
		p.Cnd_usr_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_usr_sub_char2, true);
		p.CndPanel.add(p.Cnd_usr_sub_char3_Label);
		p.CndPanel.add(p.Cnd_usr_sub_char3);
		p.Cnd_usr_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.usr_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_usr_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_sum_ym_fr_Label);
		p.Cnd2Panel.add(p.Cnd_sum_ym_fr);
		p.Cnd2Panel.setLastBeans(p.Cnd_sum_ym_fr);
		p.Cnd_sum_ym_fr.setNextBeans(p.Cnd_sum_ym_to);
		p.Cnd_sum_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_ym_fr_META);
		p.Cnd_sum_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_sum_ym_to_Label);
		p.Cnd2Panel.add(p.Cnd_sum_ym_to);
		p.Cnd_sum_ym_to.setNextBeans(p.Cnd_sum_spln_vers);
		p.Cnd_sum_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_ym_to_META);
		p.Cnd_sum_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_sum_spln_vers_Label);
		p.Cnd2Panel.add(p.Cnd_sum_spln_vers);
		p.Cnd_sum_spln_vers.setNextBeans(p.Cnd_sum_edited_f_flg);
		p.Cnd_sum_spln_vers.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_spln_vers_META);
		p.setPluralValueEnable(p.Cnd_sum_spln_vers, true);
		p.Cnd2Panel.add(p.Cnd_sum_edited_f_flg);
		p.Cnd_sum_edited_f_flg.setNextBeans(p.Cnd_sum_edited_t_flg);
		p.Cnd_sum_edited_f_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_edited_f_flg_META);
		p.Cnd2Panel.add(p.Cnd_sum_edited_t_flg);
		p.Cnd_sum_edited_t_flg.setNextBeans(p.Cnd_sum_adopted_t_flg);
		p.Cnd_sum_edited_t_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_edited_t_flg_META);
		p.Cnd2Panel.add(p.Cnd_sum_adopted_t_flg);
		p.Cnd_sum_adopted_t_flg.setNextBeans(p.Cnd_sum_adopted_f_flg);
		p.Cnd_sum_adopted_t_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_adopted_t_flg_META);
		p.Cnd2Panel.add(p.Cnd_sum_adopted_f_flg);
		p.Cnd_sum_adopted_f_flg.setNextBeans(p.Cnd_sum_dpt_cd);
		p.Cnd_sum_adopted_f_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_adopted_f_flg_META);
		p.Cnd2Panel.add(p.Cnd_sum_dpt_cd_Label);
		p.Cnd2Panel.add(p.Cnd_sum_dpt_cd);
		p.Cnd_sum_dpt_cd.setNextBeans(p.Cnd_sum_dpt_nm);
		p.Cnd_sum_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_dpt_cd_META);
		p.Cnd_sum_dpt_cd.addLinkBeans(p.Cnd_sum_dpt_nm);
		p.Cnd_sum_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sum_dpt_cd, true);
		p.Cnd2Panel.add(p.Cnd_sum_dpt_nm);
		p.Cnd_sum_dpt_nm.setNextBeans(p.Cnd_sum_wg_cd);
		p.Cnd_sum_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sum_dpt_nm, true);
		p.Cnd_sum_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sum_wg_cd, true);
		p.Cnd_sum_wg_cd.setLinkBeans(p.Cnd_sum_wg_nm);
		p.Cnd2Panel.add(p.Cnd_sum_wg_cd_Label);
		p.Cnd2Panel.add(p.Cnd_sum_wg_cd);
		p.Cnd_sum_wg_cd.setNextBeans(p.Cnd_sum_wg_nm);
		p.Cnd_sum_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_wg_cd_META);
		p.Cnd2Panel.add(p.Cnd_sum_wg_nm);
		p.Cnd_sum_wg_nm.setNextBeans(p.Cnd_sum_cst_cd);
		p.Cnd_sum_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_sum_wg_nm, true);
		p.Cnd2Panel.add(p.Cnd_sum_cst_cd_Label);
		p.Cnd2Panel.add(p.Cnd_sum_cst_cd);
		p.Cnd_sum_cst_cd.setNextBeans(p.Cnd_sum_cst_nm);
		p.Cnd_sum_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_cst_cd_META);
		p.Cnd_sum_cst_cd.addLinkBeans(p.Cnd_sum_cst_nm);
		p.Cnd_sum_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sum_cst_cd, true);
		p.Cnd2Panel.add(p.Cnd_sum_cst_nm);
		p.Cnd_sum_cst_nm.setNextBeans(p.Cnd_sum_wrk_no_p_PPanel);
		p.Cnd_sum_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_cst_nm_META);
		p.setPluralValueEnable(p.Cnd_sum_cst_nm, true);
		p.Cnd2Panel.add(p.Cnd_sum_wrk_no_p_PPanel);
		p.Cnd_sum_wrk_no_p_PPanel.setNextBeans(p.Cnd_sum_usr_cd);
		p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no, true);
		p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.Cnd_sum_wrk_nm);
		p.setPluralValueEnable(p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_nm, true);
		p.Cnd2Panel.add(p.Cnd_sum_usr_cd_Label);
		p.Cnd2Panel.add(p.Cnd_sum_usr_cd);
		p.Cnd_sum_usr_cd.setNextBeans(p.Cnd_sum_usr_nm);
		p.Cnd_sum_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_usr_cd_META);
		p.Cnd_sum_usr_cd.addLinkBeans(p.Cnd_sum_usr_nm);
		p.Cnd_sum_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sum_usr_cd, true);
		p.Cnd2Panel.add(p.Cnd_sum_usr_nm);
		p.Cnd_sum_usr_nm.setNextBeans(p.Cnd_sum_intr_rmrks);
		p.Cnd_sum_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sum_usr_nm, true);
		p.Cnd2Panel.add(p.Cnd_sum_intr_rmrks_Label);
		p.Cnd2Panel.add(p.Cnd_sum_intr_rmrks);
		p.Cnd_sum_intr_rmrks.setNextBeans(p.Cnd_sum_sub_char1);
		p.Cnd_sum_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_sum_intr_rmrks, true);
		p.Cnd2Panel.add(p.Cnd_sum_sub_char1_Label);
		p.Cnd2Panel.add(p.Cnd_sum_sub_char1);
		p.Cnd_sum_sub_char1.setNextBeans(p.Cnd_sum_sub_char2);
		p.Cnd_sum_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sum_sub_char1, true);
		p.Cnd2Panel.add(p.Cnd_sum_sub_char2_Label);
		p.Cnd2Panel.add(p.Cnd_sum_sub_char2);
		p.Cnd_sum_sub_char2.setNextBeans(p.Cnd_sum_sub_char3);
		p.Cnd_sum_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sum_sub_char2, true);
		p.Cnd2Panel.add(p.Cnd_sum_sub_char3_Label);
		p.Cnd2Panel.add(p.Cnd_sum_sub_char3);
		p.Cnd_sum_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0140.CndR.sum_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sum_sub_char3, true);
		p.Cnd3Panel.add(p.Cnd_bp_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_MlySPlnSrch p) {
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
	protected static void jbInitRslt(MSBBP_MlySPlnSrch p) {
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
	protected static void jbInitBtn(MSBBP_MlySPlnSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP0110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP0110);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP0110);
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
		MSBBP_MlySPlnSrch_MC.mcInitScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitTop((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitFold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitTab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitTab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitTab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitCnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitCnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitCnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitCtrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitRslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.mcInitBtn((MSBBP_MlySPlnSrch)this);

		// [SRCH_USR]ステータスのモードの設定
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_ScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Top((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Fold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Tab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Tab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Tab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Cnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Cnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Cnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Ctrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Rslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__USR_Btn((MSBBP_MlySPlnSrch)this);

		// [REF_USR]ステータスのモードの設定
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_ScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Top((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Fold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Tab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Tab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Tab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Cnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Cnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Cnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Ctrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Rslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__USR_Btn((MSBBP_MlySPlnSrch)this);

		// [SRCH_SUM]ステータスのモードの設定
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_ScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Top((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Fold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Tab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Tab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Tab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Cnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Cnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Cnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Ctrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Rslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitSRCH__SUM_Btn((MSBBP_MlySPlnSrch)this);

		// [REF_SUM]ステータスのモードの設定
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_ScreenOpe((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Top((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Fold((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Tab1((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Tab2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Tab3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Cnd((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Cnd2((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Cnd3((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Ctrl((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Rslt((MSBBP_MlySPlnSrch)this);
		MSBBP_MlySPlnSrch_MC.statusInitREF__SUM_Btn((MSBBP_MlySPlnSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_MlySPlnSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_MlySPlnSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_USR.addAllListener(p);
		p.Cnd_ope_SUM.addAllListener(p);
		p.Cnd_usr_ym_fr.setListListener(p);
		p.Cnd_usr_ym_fr.addAllListener(p);
		p.Cnd_usr_ym_to.setListListener(p);
		p.Cnd_usr_ym_to.addAllListener(p);
		p.Cnd_usr_usr_cd.setListListener(p);
		p.Cnd_usr_usr_cd.addAllListener(p);
		p.Cnd_usr_usr_nm.setListListener(p);
		p.Cnd_usr_usr_nm.addAllListener(p);
		p.Cnd_usr_dpt_flg.addAllListener(p);
		p.Cnd_usr_cst_flg.addAllListener(p);
		p.Cnd_usr_wrk_flg.addAllListener(p);
		p.Cnd_usr_edited_f_flg.addAllListener(p);
		p.Cnd_usr_edited_t_flg.addAllListener(p);
		p.Cnd_usr_dpt_cd.setListListener(p);
		p.Cnd_usr_dpt_cd.addAllListener(p);
		p.Cnd_usr_dpt_nm.setListListener(p);
		p.Cnd_usr_dpt_nm.addAllListener(p);
		p.Cnd_usr_wg_cd.setListListener(p);
		p.Cnd_usr_wg_cd.addAllListener(p);
		p.Cnd_usr_wg_nm.setListListener(p);
		p.Cnd_usr_wg_nm.addAllListener(p);
		p.Cnd_usr_cst_cd.setListListener(p);
		p.Cnd_usr_cst_cd.addAllListener(p);
		p.Cnd_usr_cst_nm.setListListener(p);
		p.Cnd_usr_cst_nm.addAllListener(p);
		p.Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_usr_intr_rmrks.setListListener(p);
		p.Cnd_usr_intr_rmrks.addAllListener(p);
		p.Cnd_usr_sub_char1.setListListener(p);
		p.Cnd_usr_sub_char1.addAllListener(p);
		p.Cnd_usr_sub_char2.setListListener(p);
		p.Cnd_usr_sub_char2.addAllListener(p);
		p.Cnd_usr_sub_char3.setListListener(p);
		p.Cnd_usr_sub_char3.addAllListener(p);
		p.Cnd_sum_ym_fr.setListListener(p);
		p.Cnd_sum_ym_fr.addAllListener(p);
		p.Cnd_sum_ym_to.setListListener(p);
		p.Cnd_sum_ym_to.addAllListener(p);
		p.Cnd_sum_spln_vers.setListListener(p);
		p.Cnd_sum_spln_vers.addAllListener(p);
		p.Cnd_sum_edited_f_flg.addAllListener(p);
		p.Cnd_sum_edited_t_flg.addAllListener(p);
		p.Cnd_sum_adopted_t_flg.addAllListener(p);
		p.Cnd_sum_adopted_f_flg.addAllListener(p);
		p.Cnd_sum_dpt_cd.setListListener(p);
		p.Cnd_sum_dpt_cd.addAllListener(p);
		p.Cnd_sum_dpt_nm.setListListener(p);
		p.Cnd_sum_dpt_nm.addAllListener(p);
		p.Cnd_sum_wg_cd.setListListener(p);
		p.Cnd_sum_wg_cd.addAllListener(p);
		p.Cnd_sum_wg_nm.setListListener(p);
		p.Cnd_sum_wg_nm.addAllListener(p);
		p.Cnd_sum_cst_cd.setListListener(p);
		p.Cnd_sum_cst_cd.addAllListener(p);
		p.Cnd_sum_cst_nm.setListListener(p);
		p.Cnd_sum_cst_nm.addAllListener(p);
		p.Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_sum_usr_cd.setListListener(p);
		p.Cnd_sum_usr_cd.addAllListener(p);
		p.Cnd_sum_usr_nm.setListListener(p);
		p.Cnd_sum_usr_nm.addAllListener(p);
		p.Cnd_sum_intr_rmrks.setListListener(p);
		p.Cnd_sum_intr_rmrks.addAllListener(p);
		p.Cnd_sum_sub_char1.setListListener(p);
		p.Cnd_sum_sub_char1.addAllListener(p);
		p.Cnd_sum_sub_char2.setListListener(p);
		p.Cnd_sum_sub_char2.addAllListener(p);
		p.Cnd_sum_sub_char3.setListListener(p);
		p.Cnd_sum_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBBP_MlySPlnSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_MlySPlnSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_MlySPlnSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_spln_vers.addAllListener(p);
		p.columnRslt_spln_vers.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_wrk_nm.addAllListener(p);
		p.columnRslt_wrk_nm.setListListener(p);
		p.columnRslt_spln_st_ym.addAllListener(p);
		p.columnRslt_spln_st_ym.setListListener(p);
		p.columnRslt_spln_end_ym.addAllListener(p);
		p.columnRslt_spln_end_ym.setListListener(p);
		p.columnRslt_edited_flg.addAllListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_adopted_flg.addAllListener(p);
		p.columnRslt_locked_flg.addAllListener(p);
		p.columnRslt_ref_vers.addAllListener(p);
		p.columnRslt_ref_vers.setListListener(p);
		p.columnRslt_usr_intr_rmrks.addAllListener(p);
		p.columnRslt_usr_intr_rmrks.setListListener(p);
		p.columnRslt_usr_sub_char1.addAllListener(p);
		p.columnRslt_usr_sub_char1.setListListener(p);
		p.columnRslt_usr_sub_char2.addAllListener(p);
		p.columnRslt_usr_sub_char2.setListListener(p);
		p.columnRslt_usr_sub_char3.addAllListener(p);
		p.columnRslt_usr_sub_char3.setListListener(p);
		p.columnRslt_sum_intr_rmrks.addAllListener(p);
		p.columnRslt_sum_intr_rmrks.setListListener(p);
		p.columnRslt_sum_sub_char1.addAllListener(p);
		p.columnRslt_sum_sub_char1.setListListener(p);
		p.columnRslt_sum_sub_char2.addAllListener(p);
		p.columnRslt_sum_sub_char2.setListListener(p);
		p.columnRslt_sum_sub_char3.addAllListener(p);
		p.columnRslt_sum_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBBP_MlySPlnSrch p) {
		p.Btn_open_MSBBP0110.addAllListener(p);
		p.Btn_open_MSBBP0110.setAPMethodName("doBtn_open_MSBBP0110");
	}

	/**
	 * [SRCH_USR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_ScreenOpe(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Top(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Fold(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Tab1(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Tab2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Tab3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Cnd(MSBBP_MlySPlnSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_USR, MCMode.REQUIRED);
		p.Cnd_usr_ym_fr.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_ym_to.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_usr_cd.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_usr_nm.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_dpt_flg.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_cst_flg.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_wrk_flg.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_edited_f_flg.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_edited_t_flg.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_dpt_cd.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_wg_cd.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_wg_nm.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_cst_cd.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_cst_nm.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_wrk_no_p_PPanel.putStatus(SRCH_USR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_usr_intr_rmrks.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_sub_char1.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_sub_char2.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_usr_sub_char3.putMode(p, SRCH_USR, MCMode.ENABLE);
		p.Cnd_sum_ym_fr.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_ym_to.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_spln_vers.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_edited_f_flg.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_edited_t_flg.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_adopted_t_flg.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_adopted_f_flg.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_dpt_cd.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_dpt_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_wg_cd.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_wg_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_cst_cd.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_cst_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_wrk_no_p_PPanel.putStatus(SRCH_USR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Cnd_sum_usr_cd.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_usr_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_intr_rmrks.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_sub_char1.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_sub_char2.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_sum_sub_char3.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_USR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_USR]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Cnd2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Cnd3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Ctrl(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_USR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Rslt(MSBBP_MlySPlnSrch p){
		p.columnRslt_ym.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_usr_cd.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_dpt_nm.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_wrk_no.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_wrk_nm.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_spln_st_ym.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_edited_flg.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_adopted_flg.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_locked_flg.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_ref_vers.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_usr_intr_rmrks.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_sub_char1.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_sub_char2.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_sub_char3.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_sum_intr_rmrks.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_sum_sub_char1.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_sum_sub_char2.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_sum_sub_char3.putMode(p, SRCH_USR, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_USR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_USR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__USR_Btn(MSBBP_MlySPlnSrch p){
		p.Btn_open_MSBBP0110.putMode(p, SRCH_USR, MCMode.DISABLE);

	}

	/**
	 * [REF_USR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_ScreenOpe(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Top(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Fold(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Tab1(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Tab2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Tab3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Cnd(MSBBP_MlySPlnSrch p){
		p.Cnd_ope_Group.putMode(p, REF_USR, MCMode.REQUIRED);
		p.Cnd_usr_ym_fr.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_ym_to.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_usr_cd.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_usr_nm.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_dpt_flg.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_cst_flg.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_wrk_flg.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_edited_f_flg.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_edited_t_flg.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_dpt_cd.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_wg_cd.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_wg_nm.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_cst_cd.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_cst_nm.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_wrk_no_p_PPanel.putStatus(REF_USR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_usr_intr_rmrks.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_sub_char1.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_sub_char2.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_usr_sub_char3.putMode(p, REF_USR, MCMode.ENABLE);
		p.Cnd_sum_ym_fr.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_ym_to.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_spln_vers.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_edited_f_flg.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_edited_t_flg.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_adopted_t_flg.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_adopted_f_flg.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_dpt_cd.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_dpt_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_wg_cd.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_wg_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_cst_cd.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_cst_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_wrk_no_p_PPanel.putStatus(REF_USR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Cnd_sum_usr_cd.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_usr_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_intr_rmrks.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_sub_char1.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_sub_char2.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_sum_sub_char3.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_USR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_USR]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Cnd2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Cnd3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Ctrl(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_USR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Rslt(MSBBP_MlySPlnSrch p){
		p.columnRslt_ym.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_usr_cd.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_dpt_nm.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_wrk_no.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_wrk_nm.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_spln_st_ym.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_edited_flg.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_adopted_flg.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_locked_flg.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_ref_vers.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_usr_intr_rmrks.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_sub_char1.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_sub_char2.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_usr_sub_char3.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_sum_intr_rmrks.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_sum_sub_char1.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_sum_sub_char2.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_sum_sub_char3.putMode(p, REF_USR, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_USR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_USR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_USR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__USR_Btn(MSBBP_MlySPlnSrch p){
		p.Btn_open_MSBBP0110.putMode(p, REF_USR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SUM]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_ScreenOpe(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Top(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Fold(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Tab1(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Tab2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Tab3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Cnd(MSBBP_MlySPlnSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SUM, MCMode.REQUIRED);
		p.Cnd_usr_ym_fr.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_ym_to.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_usr_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_usr_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_cst_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wrk_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_edited_f_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_edited_t_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wg_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wg_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_cst_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_cst_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wrk_no_p_PPanel.putStatus(SRCH_SUM, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Cnd_usr_intr_rmrks.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_sub_char1.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_sub_char2.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_sub_char3.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.Cnd_sum_ym_fr.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_ym_to.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_spln_vers.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_edited_f_flg.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_edited_t_flg.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_adopted_t_flg.putMode(p, SRCH_SUM, MCMode.REQUIRED);
		p.Cnd_sum_adopted_f_flg.putMode(p, SRCH_SUM, MCMode.REQUIRED);
		p.Cnd_sum_dpt_cd.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_dpt_nm.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_wg_cd.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_wg_nm.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_cst_cd.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_cst_nm.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_wrk_no_p_PPanel.putStatus(SRCH_SUM, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_sum_usr_cd.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_usr_nm.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_intr_rmrks.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_sub_char1.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_sub_char2.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_sum_sub_char3.putMode(p, SRCH_SUM, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_SUM, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SUM]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Cnd2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Cnd3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Ctrl(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [SRCH_SUM]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Rslt(MSBBP_MlySPlnSrch p){
		p.columnRslt_ym.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_spln_st_ym.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_edited_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_adopted_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_locked_flg.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_ref_vers.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_usr_intr_rmrks.putMode(p, SRCH_SUM, MCMode.INVISIBLE);
		p.columnRslt_usr_sub_char1.putMode(p, SRCH_SUM, MCMode.INVISIBLE);
		p.columnRslt_usr_sub_char2.putMode(p, SRCH_SUM, MCMode.INVISIBLE);
		p.columnRslt_usr_sub_char3.putMode(p, SRCH_SUM, MCMode.INVISIBLE);
		p.columnRslt_sum_intr_rmrks.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_sum_sub_char1.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_sum_sub_char2.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_sum_sub_char3.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SUM, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SUM]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SUM_Btn(MSBBP_MlySPlnSrch p){
		p.Btn_open_MSBBP0110.putMode(p, SRCH_SUM, MCMode.DISABLE);

	}

	/**
	 * [REF_SUM]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_ScreenOpe(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Top(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Fold(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Tab1(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Tab2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Tab3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Cnd(MSBBP_MlySPlnSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SUM, MCMode.REQUIRED);
		p.Cnd_usr_ym_fr.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_ym_to.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_usr_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_usr_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_cst_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wrk_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_edited_f_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_edited_t_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wg_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wg_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_cst_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_cst_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_wrk_no_p_PPanel.putStatus(REF_SUM, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Cnd_usr_intr_rmrks.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_sub_char1.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_sub_char2.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_usr_sub_char3.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.Cnd_sum_ym_fr.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_ym_to.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_spln_vers.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_edited_f_flg.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_edited_t_flg.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_adopted_t_flg.putMode(p, REF_SUM, MCMode.REQUIRED);
		p.Cnd_sum_adopted_f_flg.putMode(p, REF_SUM, MCMode.REQUIRED);
		p.Cnd_sum_dpt_cd.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_dpt_nm.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_wg_cd.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_wg_nm.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_cst_cd.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_cst_nm.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_wrk_no_p_PPanel.putStatus(REF_SUM, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_sum_usr_cd.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_usr_nm.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_intr_rmrks.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_sub_char1.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_sub_char2.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_sum_sub_char3.putMode(p, REF_SUM, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_SUM, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_SUM]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Cnd2(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Cnd3(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Ctrl(MSBBP_MlySPlnSrch p){

	}

	/**
	 * [REF_SUM]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Rslt(MSBBP_MlySPlnSrch p){
		p.columnRslt_ym.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_spln_st_ym.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_spln_end_ym.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_edited_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_adopted_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_locked_flg.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_ref_vers.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_usr_intr_rmrks.putMode(p, REF_SUM, MCMode.INVISIBLE);
		p.columnRslt_usr_sub_char1.putMode(p, REF_SUM, MCMode.INVISIBLE);
		p.columnRslt_usr_sub_char2.putMode(p, REF_SUM, MCMode.INVISIBLE);
		p.columnRslt_usr_sub_char3.putMode(p, REF_SUM, MCMode.INVISIBLE);
		p.columnRslt_sum_intr_rmrks.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_sum_sub_char1.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_sum_sub_char2.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_sum_sub_char3.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SUM, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SUM, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SUM]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SUM_Btn(MSBBP_MlySPlnSrch p){
		p.Btn_open_MSBBP0110.putMode(p, REF_SUM, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_USR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_MlySPlnSrch_MC.setTableConfigRslt((MSBBP_MlySPlnSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_MlySPlnSrch p) {
		p.columnRslt_ym.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_spln_vers.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.spln_vers_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_vers);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_wrk_no.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_wrk_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.wrk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_nm);
		p.columnRslt_spln_st_ym.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.spln_st_ym_META);
		p.columnRslt_spln_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_st_ym);
		p.columnRslt_spln_end_ym.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.spln_end_ym_META);
		p.columnRslt_spln_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_end_ym);
		p.columnRslt_edited_flg.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.edited_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edited_flg);
		p.columnRslt_fix_flg.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.columnRslt_adopted_flg.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.adopted_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adopted_flg);
		p.columnRslt_locked_flg.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.locked_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_locked_flg);
		p.columnRslt_ref_vers.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ref_vers_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_vers);
		p.columnRslt_usr_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.usr_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_intr_rmrks);
		p.columnRslt_usr_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.usr_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_sub_char1);
		p.columnRslt_usr_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.usr_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_sub_char2);
		p.columnRslt_usr_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.usr_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_sub_char3);
		p.columnRslt_sum_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.sum_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum_intr_rmrks);
		p.columnRslt_sum_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.sum_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum_sub_char1);
		p.columnRslt_sum_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.sum_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum_sub_char2);
		p.columnRslt_sum_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.sum_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sum_sub_char3);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP0140.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_usr_usr_cd.getListConfig().setPutter(getCnd_usr_usr_cd_ListPutter());
		Cnd_usr_dpt_cd.getListConfig().setPutter(getCnd_usr_dpt_cd_ListPutter());
		Cnd_usr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_usr_wg_cd.getListConfig().setPutter(getCnd_usr_wg_cd_ListPutter());
		Cnd_usr_cst_cd.getListConfig().setPutter(getCnd_usr_cst_cd_ListPutter());
		Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getCnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter());
		Cnd_sum_dpt_cd.getListConfig().setPutter(getCnd_sum_dpt_cd_ListPutter());
		Cnd_sum_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sum_wg_cd.getListConfig().setPutter(getCnd_sum_wg_cd_ListPutter());
		Cnd_sum_cst_cd.getListConfig().setPutter(getCnd_sum_cst_cd_ListPutter());
		Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getCnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter());
		Cnd_sum_usr_cd.getListConfig().setPutter(getCnd_sum_usr_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_USR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_USRStatus() {
		status = SRCH_USR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_USR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_USRStatus() {
		status = REF_USR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SUM]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SUMStatus() {
		status = SRCH_SUM;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SUM]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SUMStatus() {
		status = REF_SUM;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_USR.equals(status)) {
			setSRCH_USRStatus();
		}
		else if (REF_USR.equals(status)) {
			setREF_USRStatus();
		}
		else if (SRCH_SUM.equals(status)) {
			setSRCH_SUMStatus();
		}
		else if (REF_SUM.equals(status)) {
			setREF_SUMStatus();
		}
	}

	/**
	 * [Cnd_usr_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [Cnd_sum_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sum_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_sum_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sum_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 
	/**
	 * [Cnd_sum_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sum_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [Cnd_sum_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sum_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_usr_usr_cd) return getCnd_usr_usr_cd(row, info);
		if(combo == Cnd_usr_dpt_cd) return getCnd_usr_dpt_cd(row, info);
		if(combo == Cnd_usr_wg_cd) return getCnd_usr_wg_cd(row, info);
		if(combo == Cnd_usr_cst_cd) return getCnd_usr_cst_cd(row, info);
		if(combo == Cnd_usr_wrk_no_p_PPanel.WrkNo_wrk_no) return getCnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == Cnd_sum_dpt_cd) return getCnd_sum_dpt_cd(row, info);
		if(combo == Cnd_sum_wg_cd) return getCnd_sum_wg_cd(row, info);
		if(combo == Cnd_sum_cst_cd) return getCnd_sum_cst_cd(row, info);
		if(combo == Cnd_sum_wrk_no_p_PPanel.WrkNo_wrk_no) return getCnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == Cnd_sum_usr_cd) return getCnd_sum_usr_cd(row, info);
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
		else if (ap == Btn_open_MSBBP0110) doBtn_open_MSBBP0110(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP0110(MCEventInfo info);

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
		if (vc == Cnd_usr_ym_fr) return doCnd_usr_ym_fr_VC(info);
		if (vc == Cnd_usr_ym_to) return doCnd_usr_ym_to_VC(info);
		if (vc == Cnd_usr_usr_cd) return doCnd_usr_usr_cd_VC(info);
		if (vc == Cnd_usr_usr_nm) return doCnd_usr_usr_nm_VC(info);
		if (vc == Cnd_usr_dpt_flg) return doCnd_usr_dpt_flg_VC(info);
		if (vc == Cnd_usr_cst_flg) return doCnd_usr_cst_flg_VC(info);
		if (vc == Cnd_usr_wrk_flg) return doCnd_usr_wrk_flg_VC(info);
		if (vc == Cnd_usr_edited_f_flg) return doCnd_usr_edited_f_flg_VC(info);
		if (vc == Cnd_usr_edited_t_flg) return doCnd_usr_edited_t_flg_VC(info);
		if (vc == Cnd_usr_dpt_cd) return doCnd_usr_dpt_cd_VC(info);
		if (vc == Cnd_usr_dpt_nm) return doCnd_usr_dpt_nm_VC(info);
		if (vc == Cnd_usr_wg_cd) return doCnd_usr_wg_cd_VC(info);
		if (vc == Cnd_usr_wg_nm) return doCnd_usr_wg_nm_VC(info);
		if (vc == Cnd_usr_cst_cd) return doCnd_usr_cst_cd_VC(info);
		if (vc == Cnd_usr_cst_nm) return doCnd_usr_cst_nm_VC(info);
		if (vc == Cnd_usr_intr_rmrks) return doCnd_usr_intr_rmrks_VC(info);
		if (vc == Cnd_usr_sub_char1) return doCnd_usr_sub_char1_VC(info);
		if (vc == Cnd_usr_sub_char2) return doCnd_usr_sub_char2_VC(info);
		if (vc == Cnd_usr_sub_char3) return doCnd_usr_sub_char3_VC(info);
		if (vc == Cnd_sum_ym_fr) return doCnd_sum_ym_fr_VC(info);
		if (vc == Cnd_sum_ym_to) return doCnd_sum_ym_to_VC(info);
		if (vc == Cnd_sum_spln_vers) return doCnd_sum_spln_vers_VC(info);
		if (vc == Cnd_sum_edited_f_flg) return doCnd_sum_edited_f_flg_VC(info);
		if (vc == Cnd_sum_edited_t_flg) return doCnd_sum_edited_t_flg_VC(info);
		if (vc == Cnd_sum_adopted_t_flg) return doCnd_sum_adopted_t_flg_VC(info);
		if (vc == Cnd_sum_adopted_f_flg) return doCnd_sum_adopted_f_flg_VC(info);
		if (vc == Cnd_sum_dpt_cd) return doCnd_sum_dpt_cd_VC(info);
		if (vc == Cnd_sum_dpt_nm) return doCnd_sum_dpt_nm_VC(info);
		if (vc == Cnd_sum_wg_cd) return doCnd_sum_wg_cd_VC(info);
		if (vc == Cnd_sum_wg_nm) return doCnd_sum_wg_nm_VC(info);
		if (vc == Cnd_sum_cst_cd) return doCnd_sum_cst_cd_VC(info);
		if (vc == Cnd_sum_cst_nm) return doCnd_sum_cst_nm_VC(info);
		if (vc == Cnd_sum_usr_cd) return doCnd_sum_usr_cd_VC(info);
		if (vc == Cnd_sum_usr_nm) return doCnd_sum_usr_nm_VC(info);
		if (vc == Cnd_sum_intr_rmrks) return doCnd_sum_intr_rmrks_VC(info);
		if (vc == Cnd_sum_sub_char1) return doCnd_sum_sub_char1_VC(info);
		if (vc == Cnd_sum_sub_char2) return doCnd_sum_sub_char2_VC(info);
		if (vc == Cnd_sum_sub_char3) return doCnd_sum_sub_char3_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_spln_vers) return doRslt_spln_vers_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_wrk_nm) return doRslt_wrk_nm_VC(info);
		if (vc == columnRslt_spln_st_ym) return doRslt_spln_st_ym_VC(info);
		if (vc == columnRslt_spln_end_ym) return doRslt_spln_end_ym_VC(info);
		if (vc == columnRslt_edited_flg) return doRslt_edited_flg_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_adopted_flg) return doRslt_adopted_flg_VC(info);
		if (vc == columnRslt_locked_flg) return doRslt_locked_flg_VC(info);
		if (vc == columnRslt_ref_vers) return doRslt_ref_vers_VC(info);
		if (vc == columnRslt_usr_intr_rmrks) return doRslt_usr_intr_rmrks_VC(info);
		if (vc == columnRslt_usr_sub_char1) return doRslt_usr_sub_char1_VC(info);
		if (vc == columnRslt_usr_sub_char2) return doRslt_usr_sub_char2_VC(info);
		if (vc == columnRslt_usr_sub_char3) return doRslt_usr_sub_char3_VC(info);
		if (vc == columnRslt_sum_intr_rmrks) return doRslt_sum_intr_rmrks_VC(info);
		if (vc == columnRslt_sum_sub_char1) return doRslt_sum_sub_char1_VC(info);
		if (vc == columnRslt_sum_sub_char2) return doRslt_sum_sub_char2_VC(info);
		if (vc == columnRslt_sum_sub_char3) return doRslt_sum_sub_char3_VC(info);
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
	 * [Cnd]パネルの[usr_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_wrk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_wrk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_edited_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_edited_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_edited_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_edited_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_edited_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_edited_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_edited_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_edited_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_adopted_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_adopted_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_adopted_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_adopted_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edited_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edited_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adopted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adopted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[locked_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_locked_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sum_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sum_sub_char3_VC(MCEventInfo info){
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
		else if (nc == Cnd_usr_ym_fr) doCnd_usr_ym_fr_NC(info);
		else if (nc == Cnd_usr_ym_to) doCnd_usr_ym_to_NC(info);
		else if (nc == Cnd_usr_usr_cd) doCnd_usr_usr_cd_NC(info);
		else if (nc == Cnd_usr_usr_nm) doCnd_usr_usr_nm_NC(info);
		else if (nc == Cnd_usr_dpt_flg) doCnd_usr_dpt_flg_NC(info);
		else if (nc == Cnd_usr_cst_flg) doCnd_usr_cst_flg_NC(info);
		else if (nc == Cnd_usr_wrk_flg) doCnd_usr_wrk_flg_NC(info);
		else if (nc == Cnd_usr_edited_f_flg) doCnd_usr_edited_f_flg_NC(info);
		else if (nc == Cnd_usr_edited_t_flg) doCnd_usr_edited_t_flg_NC(info);
		else if (nc == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_NC(info);
		else if (nc == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_NC(info);
		else if (nc == Cnd_usr_wg_cd) doCnd_usr_wg_cd_NC(info);
		else if (nc == Cnd_usr_wg_nm) doCnd_usr_wg_nm_NC(info);
		else if (nc == Cnd_usr_cst_cd) doCnd_usr_cst_cd_NC(info);
		else if (nc == Cnd_usr_cst_nm) doCnd_usr_cst_nm_NC(info);
		else if (nc == Cnd_usr_intr_rmrks) doCnd_usr_intr_rmrks_NC(info);
		else if (nc == Cnd_usr_sub_char1) doCnd_usr_sub_char1_NC(info);
		else if (nc == Cnd_usr_sub_char2) doCnd_usr_sub_char2_NC(info);
		else if (nc == Cnd_usr_sub_char3) doCnd_usr_sub_char3_NC(info);
		else if (nc == Cnd_sum_ym_fr) doCnd_sum_ym_fr_NC(info);
		else if (nc == Cnd_sum_ym_to) doCnd_sum_ym_to_NC(info);
		else if (nc == Cnd_sum_spln_vers) doCnd_sum_spln_vers_NC(info);
		else if (nc == Cnd_sum_edited_f_flg) doCnd_sum_edited_f_flg_NC(info);
		else if (nc == Cnd_sum_edited_t_flg) doCnd_sum_edited_t_flg_NC(info);
		else if (nc == Cnd_sum_adopted_t_flg) doCnd_sum_adopted_t_flg_NC(info);
		else if (nc == Cnd_sum_adopted_f_flg) doCnd_sum_adopted_f_flg_NC(info);
		else if (nc == Cnd_sum_dpt_cd) doCnd_sum_dpt_cd_NC(info);
		else if (nc == Cnd_sum_dpt_nm) doCnd_sum_dpt_nm_NC(info);
		else if (nc == Cnd_sum_wg_cd) doCnd_sum_wg_cd_NC(info);
		else if (nc == Cnd_sum_wg_nm) doCnd_sum_wg_nm_NC(info);
		else if (nc == Cnd_sum_cst_cd) doCnd_sum_cst_cd_NC(info);
		else if (nc == Cnd_sum_cst_nm) doCnd_sum_cst_nm_NC(info);
		else if (nc == Cnd_sum_usr_cd) doCnd_sum_usr_cd_NC(info);
		else if (nc == Cnd_sum_usr_nm) doCnd_sum_usr_nm_NC(info);
		else if (nc == Cnd_sum_intr_rmrks) doCnd_sum_intr_rmrks_NC(info);
		else if (nc == Cnd_sum_sub_char1) doCnd_sum_sub_char1_NC(info);
		else if (nc == Cnd_sum_sub_char2) doCnd_sum_sub_char2_NC(info);
		else if (nc == Cnd_sum_sub_char3) doCnd_sum_sub_char3_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_spln_vers) doRslt_spln_vers_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_wrk_nm) doRslt_wrk_nm_NC(info);
		else if (nc == columnRslt_spln_st_ym) doRslt_spln_st_ym_NC(info);
		else if (nc == columnRslt_spln_end_ym) doRslt_spln_end_ym_NC(info);
		else if (nc == columnRslt_edited_flg) doRslt_edited_flg_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_adopted_flg) doRslt_adopted_flg_NC(info);
		else if (nc == columnRslt_locked_flg) doRslt_locked_flg_NC(info);
		else if (nc == columnRslt_ref_vers) doRslt_ref_vers_NC(info);
		else if (nc == columnRslt_usr_intr_rmrks) doRslt_usr_intr_rmrks_NC(info);
		else if (nc == columnRslt_usr_sub_char1) doRslt_usr_sub_char1_NC(info);
		else if (nc == columnRslt_usr_sub_char2) doRslt_usr_sub_char2_NC(info);
		else if (nc == columnRslt_usr_sub_char3) doRslt_usr_sub_char3_NC(info);
		else if (nc == columnRslt_sum_intr_rmrks) doRslt_sum_intr_rmrks_NC(info);
		else if (nc == columnRslt_sum_sub_char1) doRslt_sum_sub_char1_NC(info);
		else if (nc == columnRslt_sum_sub_char2) doRslt_sum_sub_char2_NC(info);
		else if (nc == columnRslt_sum_sub_char3) doRslt_sum_sub_char3_NC(info);
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
	 * [Cnd]パネルの[usr_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wrk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wrk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_edited_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_edited_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_edited_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_edited_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_edited_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_edited_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_edited_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_edited_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_adopted_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_adopted_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_adopted_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_adopted_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edited_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edited_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adopted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adopted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[locked_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_locked_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_vers_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char3_NC(MCEventInfo info){
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
		else if (ne == Cnd_usr_ym_fr) doCnd_usr_ym_fr_NE(info);
		else if (ne == Cnd_usr_ym_to) doCnd_usr_ym_to_NE(info);
		else if (ne == Cnd_usr_usr_cd) doCnd_usr_usr_cd_NE(info);
		else if (ne == Cnd_usr_usr_nm) doCnd_usr_usr_nm_NE(info);
		else if (ne == Cnd_usr_dpt_flg) doCnd_usr_dpt_flg_NE(info);
		else if (ne == Cnd_usr_cst_flg) doCnd_usr_cst_flg_NE(info);
		else if (ne == Cnd_usr_wrk_flg) doCnd_usr_wrk_flg_NE(info);
		else if (ne == Cnd_usr_edited_f_flg) doCnd_usr_edited_f_flg_NE(info);
		else if (ne == Cnd_usr_edited_t_flg) doCnd_usr_edited_t_flg_NE(info);
		else if (ne == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_NE(info);
		else if (ne == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_NE(info);
		else if (ne == Cnd_usr_wg_cd) doCnd_usr_wg_cd_NE(info);
		else if (ne == Cnd_usr_wg_nm) doCnd_usr_wg_nm_NE(info);
		else if (ne == Cnd_usr_cst_cd) doCnd_usr_cst_cd_NE(info);
		else if (ne == Cnd_usr_cst_nm) doCnd_usr_cst_nm_NE(info);
		else if (ne == Cnd_usr_intr_rmrks) doCnd_usr_intr_rmrks_NE(info);
		else if (ne == Cnd_usr_sub_char1) doCnd_usr_sub_char1_NE(info);
		else if (ne == Cnd_usr_sub_char2) doCnd_usr_sub_char2_NE(info);
		else if (ne == Cnd_usr_sub_char3) doCnd_usr_sub_char3_NE(info);
		else if (ne == Cnd_sum_ym_fr) doCnd_sum_ym_fr_NE(info);
		else if (ne == Cnd_sum_ym_to) doCnd_sum_ym_to_NE(info);
		else if (ne == Cnd_sum_spln_vers) doCnd_sum_spln_vers_NE(info);
		else if (ne == Cnd_sum_edited_f_flg) doCnd_sum_edited_f_flg_NE(info);
		else if (ne == Cnd_sum_edited_t_flg) doCnd_sum_edited_t_flg_NE(info);
		else if (ne == Cnd_sum_adopted_t_flg) doCnd_sum_adopted_t_flg_NE(info);
		else if (ne == Cnd_sum_adopted_f_flg) doCnd_sum_adopted_f_flg_NE(info);
		else if (ne == Cnd_sum_dpt_cd) doCnd_sum_dpt_cd_NE(info);
		else if (ne == Cnd_sum_dpt_nm) doCnd_sum_dpt_nm_NE(info);
		else if (ne == Cnd_sum_wg_cd) doCnd_sum_wg_cd_NE(info);
		else if (ne == Cnd_sum_wg_nm) doCnd_sum_wg_nm_NE(info);
		else if (ne == Cnd_sum_cst_cd) doCnd_sum_cst_cd_NE(info);
		else if (ne == Cnd_sum_cst_nm) doCnd_sum_cst_nm_NE(info);
		else if (ne == Cnd_sum_usr_cd) doCnd_sum_usr_cd_NE(info);
		else if (ne == Cnd_sum_usr_nm) doCnd_sum_usr_nm_NE(info);
		else if (ne == Cnd_sum_intr_rmrks) doCnd_sum_intr_rmrks_NE(info);
		else if (ne == Cnd_sum_sub_char1) doCnd_sum_sub_char1_NE(info);
		else if (ne == Cnd_sum_sub_char2) doCnd_sum_sub_char2_NE(info);
		else if (ne == Cnd_sum_sub_char3) doCnd_sum_sub_char3_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_spln_vers) doRslt_spln_vers_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_wrk_nm) doRslt_wrk_nm_NE(info);
		else if (ne == columnRslt_spln_st_ym) doRslt_spln_st_ym_NE(info);
		else if (ne == columnRslt_spln_end_ym) doRslt_spln_end_ym_NE(info);
		else if (ne == columnRslt_edited_flg) doRslt_edited_flg_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_adopted_flg) doRslt_adopted_flg_NE(info);
		else if (ne == columnRslt_locked_flg) doRslt_locked_flg_NE(info);
		else if (ne == columnRslt_ref_vers) doRslt_ref_vers_NE(info);
		else if (ne == columnRslt_usr_intr_rmrks) doRslt_usr_intr_rmrks_NE(info);
		else if (ne == columnRslt_usr_sub_char1) doRslt_usr_sub_char1_NE(info);
		else if (ne == columnRslt_usr_sub_char2) doRslt_usr_sub_char2_NE(info);
		else if (ne == columnRslt_usr_sub_char3) doRslt_usr_sub_char3_NE(info);
		else if (ne == columnRslt_sum_intr_rmrks) doRslt_sum_intr_rmrks_NE(info);
		else if (ne == columnRslt_sum_sub_char1) doRslt_sum_sub_char1_NE(info);
		else if (ne == columnRslt_sum_sub_char2) doRslt_sum_sub_char2_NE(info);
		else if (ne == columnRslt_sum_sub_char3) doRslt_sum_sub_char3_NE(info);
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
	 * [Cnd]パネルの[usr_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wrk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wrk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_edited_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_edited_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_edited_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_edited_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_edited_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_edited_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_edited_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_edited_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_adopted_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_adopted_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_adopted_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_adopted_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edited_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edited_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adopted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adopted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[locked_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_locked_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_vers_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char3_NE(MCEventInfo info){
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
		else if (nx == Cnd_usr_ym_fr) doCnd_usr_ym_fr_NX(info);
		else if (nx == Cnd_usr_ym_to) doCnd_usr_ym_to_NX(info);
		else if (nx == Cnd_usr_usr_cd) doCnd_usr_usr_cd_NX(info);
		else if (nx == Cnd_usr_usr_nm) doCnd_usr_usr_nm_NX(info);
		else if (nx == Cnd_usr_dpt_flg) doCnd_usr_dpt_flg_NX(info);
		else if (nx == Cnd_usr_cst_flg) doCnd_usr_cst_flg_NX(info);
		else if (nx == Cnd_usr_wrk_flg) doCnd_usr_wrk_flg_NX(info);
		else if (nx == Cnd_usr_edited_f_flg) doCnd_usr_edited_f_flg_NX(info);
		else if (nx == Cnd_usr_edited_t_flg) doCnd_usr_edited_t_flg_NX(info);
		else if (nx == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_NX(info);
		else if (nx == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_NX(info);
		else if (nx == Cnd_usr_wg_cd) doCnd_usr_wg_cd_NX(info);
		else if (nx == Cnd_usr_wg_nm) doCnd_usr_wg_nm_NX(info);
		else if (nx == Cnd_usr_cst_cd) doCnd_usr_cst_cd_NX(info);
		else if (nx == Cnd_usr_cst_nm) doCnd_usr_cst_nm_NX(info);
		else if (nx == Cnd_usr_intr_rmrks) doCnd_usr_intr_rmrks_NX(info);
		else if (nx == Cnd_usr_sub_char1) doCnd_usr_sub_char1_NX(info);
		else if (nx == Cnd_usr_sub_char2) doCnd_usr_sub_char2_NX(info);
		else if (nx == Cnd_usr_sub_char3) doCnd_usr_sub_char3_NX(info);
		else if (nx == Cnd_sum_ym_fr) doCnd_sum_ym_fr_NX(info);
		else if (nx == Cnd_sum_ym_to) doCnd_sum_ym_to_NX(info);
		else if (nx == Cnd_sum_spln_vers) doCnd_sum_spln_vers_NX(info);
		else if (nx == Cnd_sum_edited_f_flg) doCnd_sum_edited_f_flg_NX(info);
		else if (nx == Cnd_sum_edited_t_flg) doCnd_sum_edited_t_flg_NX(info);
		else if (nx == Cnd_sum_adopted_t_flg) doCnd_sum_adopted_t_flg_NX(info);
		else if (nx == Cnd_sum_adopted_f_flg) doCnd_sum_adopted_f_flg_NX(info);
		else if (nx == Cnd_sum_dpt_cd) doCnd_sum_dpt_cd_NX(info);
		else if (nx == Cnd_sum_dpt_nm) doCnd_sum_dpt_nm_NX(info);
		else if (nx == Cnd_sum_wg_cd) doCnd_sum_wg_cd_NX(info);
		else if (nx == Cnd_sum_wg_nm) doCnd_sum_wg_nm_NX(info);
		else if (nx == Cnd_sum_cst_cd) doCnd_sum_cst_cd_NX(info);
		else if (nx == Cnd_sum_cst_nm) doCnd_sum_cst_nm_NX(info);
		else if (nx == Cnd_sum_usr_cd) doCnd_sum_usr_cd_NX(info);
		else if (nx == Cnd_sum_usr_nm) doCnd_sum_usr_nm_NX(info);
		else if (nx == Cnd_sum_intr_rmrks) doCnd_sum_intr_rmrks_NX(info);
		else if (nx == Cnd_sum_sub_char1) doCnd_sum_sub_char1_NX(info);
		else if (nx == Cnd_sum_sub_char2) doCnd_sum_sub_char2_NX(info);
		else if (nx == Cnd_sum_sub_char3) doCnd_sum_sub_char3_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_spln_vers) doRslt_spln_vers_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_wrk_nm) doRslt_wrk_nm_NX(info);
		else if (nx == columnRslt_spln_st_ym) doRslt_spln_st_ym_NX(info);
		else if (nx == columnRslt_spln_end_ym) doRslt_spln_end_ym_NX(info);
		else if (nx == columnRslt_edited_flg) doRslt_edited_flg_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_adopted_flg) doRslt_adopted_flg_NX(info);
		else if (nx == columnRslt_locked_flg) doRslt_locked_flg_NX(info);
		else if (nx == columnRslt_ref_vers) doRslt_ref_vers_NX(info);
		else if (nx == columnRslt_usr_intr_rmrks) doRslt_usr_intr_rmrks_NX(info);
		else if (nx == columnRslt_usr_sub_char1) doRslt_usr_sub_char1_NX(info);
		else if (nx == columnRslt_usr_sub_char2) doRslt_usr_sub_char2_NX(info);
		else if (nx == columnRslt_usr_sub_char3) doRslt_usr_sub_char3_NX(info);
		else if (nx == columnRslt_sum_intr_rmrks) doRslt_sum_intr_rmrks_NX(info);
		else if (nx == columnRslt_sum_sub_char1) doRslt_sum_sub_char1_NX(info);
		else if (nx == columnRslt_sum_sub_char2) doRslt_sum_sub_char2_NX(info);
		else if (nx == columnRslt_sum_sub_char3) doRslt_sum_sub_char3_NX(info);
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
	 * [Cnd]パネルの[usr_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wrk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wrk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_edited_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_edited_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_edited_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_edited_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_edited_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_edited_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_edited_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_edited_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_adopted_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_adopted_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_adopted_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_adopted_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edited_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edited_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adopted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adopted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[locked_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_locked_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_vers_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char3_NX(MCEventInfo info){
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
		if (lc == Cnd_usr_ym_fr) doCnd_usr_ym_fr_LC(info);
		else if (lc == Cnd_usr_ym_to) doCnd_usr_ym_to_LC(info);
		else if (lc == Cnd_usr_usr_cd) doCnd_usr_usr_cd_LC(info);
		else if (lc == Cnd_usr_usr_nm) doCnd_usr_usr_nm_LC(info);
		else if (lc == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_LC(info);
		else if (lc == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_LC(info);
		else if (lc == Cnd_usr_wg_cd) doCnd_usr_wg_cd_LC(info);
		else if (lc == Cnd_usr_wg_nm) doCnd_usr_wg_nm_LC(info);
		else if (lc == Cnd_usr_cst_cd) doCnd_usr_cst_cd_LC(info);
		else if (lc == Cnd_usr_cst_nm) doCnd_usr_cst_nm_LC(info);
		else if (lc == Cnd_usr_intr_rmrks) doCnd_usr_intr_rmrks_LC(info);
		else if (lc == Cnd_usr_sub_char1) doCnd_usr_sub_char1_LC(info);
		else if (lc == Cnd_usr_sub_char2) doCnd_usr_sub_char2_LC(info);
		else if (lc == Cnd_usr_sub_char3) doCnd_usr_sub_char3_LC(info);
		else if (lc == Cnd_sum_ym_fr) doCnd_sum_ym_fr_LC(info);
		else if (lc == Cnd_sum_ym_to) doCnd_sum_ym_to_LC(info);
		else if (lc == Cnd_sum_spln_vers) doCnd_sum_spln_vers_LC(info);
		else if (lc == Cnd_sum_dpt_cd) doCnd_sum_dpt_cd_LC(info);
		else if (lc == Cnd_sum_dpt_nm) doCnd_sum_dpt_nm_LC(info);
		else if (lc == Cnd_sum_wg_cd) doCnd_sum_wg_cd_LC(info);
		else if (lc == Cnd_sum_wg_nm) doCnd_sum_wg_nm_LC(info);
		else if (lc == Cnd_sum_cst_cd) doCnd_sum_cst_cd_LC(info);
		else if (lc == Cnd_sum_cst_nm) doCnd_sum_cst_nm_LC(info);
		else if (lc == Cnd_sum_usr_cd) doCnd_sum_usr_cd_LC(info);
		else if (lc == Cnd_sum_usr_nm) doCnd_sum_usr_nm_LC(info);
		else if (lc == Cnd_sum_intr_rmrks) doCnd_sum_intr_rmrks_LC(info);
		else if (lc == Cnd_sum_sub_char1) doCnd_sum_sub_char1_LC(info);
		else if (lc == Cnd_sum_sub_char2) doCnd_sum_sub_char2_LC(info);
		else if (lc == Cnd_sum_sub_char3) doCnd_sum_sub_char3_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_spln_vers) doRslt_spln_vers_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_wrk_nm) doRslt_wrk_nm_LC(info);
		else if (lc == columnRslt_spln_st_ym) doRslt_spln_st_ym_LC(info);
		else if (lc == columnRslt_spln_end_ym) doRslt_spln_end_ym_LC(info);
		else if (lc == columnRslt_ref_vers) doRslt_ref_vers_LC(info);
		else if (lc == columnRslt_usr_intr_rmrks) doRslt_usr_intr_rmrks_LC(info);
		else if (lc == columnRslt_usr_sub_char1) doRslt_usr_sub_char1_LC(info);
		else if (lc == columnRslt_usr_sub_char2) doRslt_usr_sub_char2_LC(info);
		else if (lc == columnRslt_usr_sub_char3) doRslt_usr_sub_char3_LC(info);
		else if (lc == columnRslt_sum_intr_rmrks) doRslt_sum_intr_rmrks_LC(info);
		else if (lc == columnRslt_sum_sub_char1) doRslt_sum_sub_char1_LC(info);
		else if (lc == columnRslt_sum_sub_char2) doRslt_sum_sub_char2_LC(info);
		else if (lc == columnRslt_sum_sub_char3) doRslt_sum_sub_char3_LC(info);
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
	 * [Cnd]パネルの[usr_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_vers_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sum_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sum_sub_char3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_usr_usr_cd]の作成メソッド
	 */
	public MCList getCnd_usr_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_usr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_wg_cd]の作成メソッド
	 */
	public MCList getCnd_usr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_cst_cd]の作成メソッド
	 */
	public MCList getCnd_usr_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getCnd_usr_wrk_no_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sum_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sum_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sum_wg_cd]の作成メソッド
	 */
	public MCList getCnd_sum_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sum_cst_cd]の作成メソッド
	 */
	public MCList getCnd_sum_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getCnd_sum_wrk_no_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sum_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sum_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL0140.Srch01")) {
			return new MS_MSBBL0140_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL0140.Srch02")) {
			return new MS_MSBBL0140_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0140_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0140_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL0140_Srch01Bridge() {
			p_MS_MSBBL0140_Srch01 = new MCParam(PDef.MS_MSBBL0140_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0140_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0140.RsltR.class));

			p_MS_MSBBL0140_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0140_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0140_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0140_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0140_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0140.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0140.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0140.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0140_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0140.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0140_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0140.RsltR>)p_MS_MSBBL0140_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL0140_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0140_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0140_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL0140_Srch02Bridge() {
			p_MS_MSBBL0140_Srch02 = new MCParam(PDef.MS_MSBBL0140_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0140_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0140.RsltR.class));

			p_MS_MSBBL0140_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0140_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0140_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0140_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0140_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0140.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0140.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0140.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0140_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0140.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0140_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0140.RsltR>)p_MS_MSBBL0140_Srch02.getContainerParam().getDownBlock(0));
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