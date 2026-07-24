package mcframe.clientMSBB.MSBBP1390;

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
import mcframe.clientMSBB.MSBBP1390.MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Srch01Caller;
import mcframe.clientMSBB.MSBBP1390.MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Upd01Caller;
import mcframe.clientMSBB.MSBBP1390.MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Del01Caller;
import mcframe.clientMSBB.MSBBP1390.MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Imp01Caller;

/**
 * 画面"MSBBP_SlsBdgListReg"パネルクラスです。<p>
 *
 * 販売予算情報の検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SlsBdgListReg_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1390";

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
	// [NotSum]ブロック関連のField定義
	public MCPanel NotSumPanel = null;
	public MCTitledBorder NotSumTitledBorder = null;
	// [NotSum]ブロックの項目のField定義
	// [SlsItmGrpNotSum]ブロック関連のField定義
	public MCPanel SlsItmGrpNotSumPanel = null;
	public MCTitledBorder SlsItmGrpNotSumTitledBorder = null;
	// [SlsItmGrpNotSum]ブロックの項目のField定義
	// [Mesh]ブロック関連のField定義
	public MCPanel MeshPanel = null;
	public MCTitledBorder MeshTitledBorder = null;
	// [Mesh]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [BpGrp]ブロック関連のField定義
	public MCPanel BpGrpPanel = null;
	// [BpGrp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify;DEL,Delete;REF,View UPD,登録・訂正する;DEL,削除する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_sum_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_sum_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_itm_grp_sum_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_itm_grp_not_sum_flg = null;
	/**
	 * Extraction 抽出.<p>
	 *
	 */
	public MCCheckBox Cnd_mesh_srch_flg = null;
	/**
	 * Sales dept. 売上部門.<p>
	 *
	 */
	public MCCheckBox Cnd_mesh_sls_dpt_flg = null;
	/**
	 * Item system 品目体系.<p>
	 *
	 */
	public MCCheckBox Cnd_mesh_sls_itm_grp_flg = null;
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCCheckBox Cnd_mesh_cst_flg = null;
	/**
	 * Sales PIC 売上担当者.<p>
	 *
	 */
	public MCCheckBox Cnd_mesh_sls_usr_flg = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_mesh_wrk_no_flg = null;
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ym_to = null;
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
	public MCLabel Cnd_sls_itm_grp_cd_Label = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_itm_grp_cd = null;
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public MCTextField Cnd_sls_itm_grp_nm = null;
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_WrkNo_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[WrkNo_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[WrkNo_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
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
	public MCLabel Cnd_sls_bdg_grp_Label = null;
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_bdg_grp = null;
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
	// [Cmmn]ブロック関連のField定義
	public MCPanel CmmnPanel = null;
	// [Cmmn]ブロックの項目のField定義
	public MCLabel Cmmn_big_num_rnd_typ_Label = null;
	/**
	 * Amount unit 金額単位.<p>
	 *
	 */
	public MCTextField Cmmn_big_num_rnd_typ = null;
	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public MCTextField Cmmn_big_num_rnd_typ_nm = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1390.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ym = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_sls_usr_cd;// [Dtl]の[usr_dpt_p.usr_cd]を[columnDtl_sls_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_usr_nm;// [Dtl]の[usr_dpt_p.usr_nm]を[columnDtl_sls_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_dpt_cd;// [Dtl]の[usr_dpt_p.dpt_cd]を[columnDtl_sls_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_dpt_nm;// [Dtl]の[usr_dpt_p.dpt_nm]を[columnDtl_sls_dpt_nm]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_cd = null;
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl_WrkNo_p_PPanel;
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[WrkNo_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[WrkNo_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_dec_place = null;
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_bdg_grp = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_SlsAmt_p_PPanel;
	public MCColumnConfig columnDtl_bdg_sls_amt;// [Dtl]の[SlsAmt_p.amt]を[columnDtl_bdg_sls_amt]としてエイリアス定義。
	/**
	 * Budget gross profit ratio 予算粗利率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bdg_sls_prof_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_SlsProfAmt_p_PPanel;
	public MCColumnConfig columnDtl_bdg_sls_prof_amt;// [Dtl]の[SlsProfAmt_p.amt]を[columnDtl_bdg_sls_prof_amt]としてエイリアス定義。
	/**
	 * Not for aggregation 集計対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_sum_flg = null;
	/**
	 * Not for item system aggregation 品目体系集計対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_not_sum_flg = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_BpGrp_p_PPanel;
	public MCColumnConfig columnDtl_bp_grp_cd1;// [Dtl]の[BpGrp_p.bp_grp_cd1]を[columnDtl_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm1;// [Dtl]の[BpGrp_p.bp_grp_nm1]を[columnDtl_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd2;// [Dtl]の[BpGrp_p.bp_grp_cd2]を[columnDtl_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm2;// [Dtl]の[BpGrp_p.bp_grp_nm2]を[columnDtl_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd3;// [Dtl]の[BpGrp_p.bp_grp_cd3]を[columnDtl_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm3;// [Dtl]の[BpGrp_p.bp_grp_nm3]を[columnDtl_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd4;// [Dtl]の[BpGrp_p.bp_grp_cd4]を[columnDtl_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm4;// [Dtl]の[BpGrp_p.bp_grp_nm4]を[columnDtl_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd5;// [Dtl]の[BpGrp_p.bp_grp_cd5]を[columnDtl_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm5;// [Dtl]の[BpGrp_p.bp_grp_nm5]を[columnDtl_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd6;// [Dtl]の[BpGrp_p.bp_grp_cd6]を[columnDtl_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm6;// [Dtl]の[BpGrp_p.bp_grp_nm6]を[columnDtl_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd7;// [Dtl]の[BpGrp_p.bp_grp_cd7]を[columnDtl_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm7;// [Dtl]の[BpGrp_p.bp_grp_nm7]を[columnDtl_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd8;// [Dtl]の[BpGrp_p.bp_grp_cd8]を[columnDtl_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm8;// [Dtl]の[BpGrp_p.bp_grp_nm8]を[columnDtl_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd9;// [Dtl]の[BpGrp_p.bp_grp_cd9]を[columnDtl_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm9;// [Dtl]の[BpGrp_p.bp_grp_nm9]を[columnDtl_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd10;// [Dtl]の[BpGrp_p.bp_grp_cd10]を[columnDtl_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm10;// [Dtl]の[BpGrp_p.bp_grp_nm10]を[columnDtl_bp_grp_nm10]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH_DEL, DEL, SRCH, REF};
	
	/** [MS_MSBBL1390_Srch01]のCallerの作成 */
	protected MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Srch01Caller createMS_MSBBL1390_Srch01() {
		MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Srch01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Srch01Bridge>
		caller = ((MSBBP_SlsBdgListReg_MC)this).new MS_MSBBL1390_Srch01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Srch01Bridge>(
					(MSBBP_SlsBdgListReg)this, new MS_MSBBL1390_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1390_Srch01]の呼び出し */
	protected void callMS_MSBBL1390_Srch01() {
		MCCaller caller = createMS_MSBBL1390_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1390_Upd01]のCallerの作成 */
	protected MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Upd01Caller createMS_MSBBL1390_Upd01() {
		MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Upd01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Upd01Bridge>
		caller = ((MSBBP_SlsBdgListReg_MC)this).new MS_MSBBL1390_Upd01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Upd01Bridge>(
					(MSBBP_SlsBdgListReg)this, new MS_MSBBL1390_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1390_Upd01]の呼び出し */
	protected void callMS_MSBBL1390_Upd01() {
		MCCaller caller = createMS_MSBBL1390_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1390_Del01]のCallerの作成 */
	protected MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Del01Caller createMS_MSBBL1390_Del01() {
		MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Del01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Del01Bridge>
		caller = ((MSBBP_SlsBdgListReg_MC)this).new MS_MSBBL1390_Del01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Del01Bridge>(
					(MSBBP_SlsBdgListReg)this, new MS_MSBBL1390_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1390_Del01]の呼び出し */
	protected void callMS_MSBBL1390_Del01() {
		MCCaller caller = createMS_MSBBL1390_Del01();
		caller.exec();
	}
	/** [MS_MSBBL1390_Imp01]のCallerの作成 */
	protected MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Imp01Caller createMS_MSBBL1390_Imp01() {
		MSBBP_SlsBdgListReg_MC.MS_MSBBL1390_Imp01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Imp01Bridge>
		caller = ((MSBBP_SlsBdgListReg_MC)this).new MS_MSBBL1390_Imp01Caller<MSBBP_SlsBdgListReg, MS_MSBBL1390_Imp01Bridge>(
					(MSBBP_SlsBdgListReg)this, new MS_MSBBL1390_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBBL1390_Imp01]の呼び出し */
	protected void callMS_MSBBL1390_Imp01() {
		MCCaller caller = createMS_MSBBL1390_Imp01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1390.CndR aCndR;
	/** [Cmmn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1390.CmmnR aCmmnR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1390.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1390.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1390.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1390.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1390.CndR.create();
	}

	/**
	 * 項目コピーによってaCmmnRを設定します。
	 *
	 * aCmmnRのインスタンスは変更されません。
	 *
	 * @param row CmmnR
	 */
	public void setCmmnR(mcframe.clientMSBB.MSBBP1390.CmmnR row) {
		if (row != null) {
			MCRow.copyall(getCmmnR(), row);
		}
	}

	/**
	 * [Cmmn]ブロックのコンテナaCmmnRを返します。
	 *
	 * @return CmmnR
	 */
	public mcframe.clientMSBB.MSBBP1390.CmmnR getCmmnR() {
		return aCmmnR;
	}

	/**
	 * aCmmnRを作成します。
	 *
	 * @return CmmnR
	 */
	public mcframe.clientMSBB.MSBBP1390.CmmnR createCmmnR() {
		return mcframe.clientMSBB.MSBBP1390.CmmnR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP1390.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1390.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP1390.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP1390.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1390.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
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
		if(!MCCollectionUtil.contains(ret, getCmmnR())) ret.add(getCmmnR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getCmmnR()) return "Cmmn";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Cmmn")) return getCmmnR();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(NotSumPanel);
		ret.add(SlsItmGrpNotSumPanel);
		ret.add(MeshPanel);
		ret.add(Tab2Panel);
		ret.add(BpGrpPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(CmmnPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsBdgListReg_MC_A() {
		aCndR = createCndR();
		aCmmnR = createCmmnR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SlsBdgListReg_MC_A(String name) {
		aCndR = createCndR();
		aCmmnR = createCmmnR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_SlsBdgListReg_MC.jbCreateScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateTop((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateFold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateTab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateSlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateMesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateTab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateBpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateCnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateCtrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateRPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateCmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateDtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateBtn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbCreateEastBtn((MSBBP_SlsBdgListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [NotSum]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNotSum(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [SlsItmGrpNotSum]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlsItmGrpNotSum(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Mesh]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMesh(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [BpGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBpGrp(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SlsBdgListReg p) {
		p.Cnd_WrkNo_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().WrkNo_p());
		p.Cnd_WrkNo_p_PPanel.setName("Cnd.WrkNo_p");
		p.Cnd_wrk_no = p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_SlsBdgListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Cmmn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCmmn(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_SlsBdgListReg p) {
		p.Dtl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBB.MSBBP1390.DtlR.$usr_dpt_p);
		p.Dtl_usr_dpt_p_PPanel.setName("Dtl.usr_dpt_p");
		p.columnDtl_sls_usr_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_sls_usr_cd.addAliasName("Dtl.sls_usr_cd", p);
		p.columnDtl_sls_usr_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_sls_usr_nm.addAliasName("Dtl.sls_usr_nm", p);
		p.columnDtl_sls_dpt_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_sls_dpt_cd.addAliasName("Dtl.sls_dpt_cd", p);
		p.columnDtl_sls_dpt_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_sls_dpt_nm.addAliasName("Dtl.sls_dpt_nm", p);
		p.Dtl_WrkNo_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBB.MSBBP1390.DtlR.$WrkNo_p);
		p.Dtl_WrkNo_p_PPanel.setName("Dtl.WrkNo_p");
		p.columnDtl_wrk_no = p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_SlsAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1390.DtlR.$SlsAmt_p);
		p.Dtl_SlsAmt_p_PPanel.setName("Dtl.SlsAmt_p");
		p.columnDtl_bdg_sls_amt = p.Dtl_SlsAmt_p_PPanel.columnAmt_amt;
		p.columnDtl_bdg_sls_amt.addAliasName("Dtl.bdg_sls_amt", p);
		p.Dtl_SlsProfAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1390.DtlR.$SlsProfAmt_p);
		p.Dtl_SlsProfAmt_p_PPanel.setName("Dtl.SlsProfAmt_p");
		p.columnDtl_bdg_sls_prof_amt = p.Dtl_SlsProfAmt_p_PPanel.columnAmt_amt;
		p.columnDtl_bdg_sls_prof_amt.addAliasName("Dtl.bdg_sls_prof_amt", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBB.MSBBP1390.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
		p.Dtl_BpGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1390.DtlR.$BpGrp_p);
		p.Dtl_BpGrp_p_PPanel.setName("Dtl.BpGrp_p");
		p.columnDtl_bp_grp_cd1 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_bp_grp_cd1.addAliasName("Dtl.bp_grp_cd1", p);
		p.columnDtl_bp_grp_nm1 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_bp_grp_nm1.addAliasName("Dtl.bp_grp_nm1", p);
		p.columnDtl_bp_grp_cd2 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_bp_grp_cd2.addAliasName("Dtl.bp_grp_cd2", p);
		p.columnDtl_bp_grp_nm2 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_bp_grp_nm2.addAliasName("Dtl.bp_grp_nm2", p);
		p.columnDtl_bp_grp_cd3 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_bp_grp_cd3.addAliasName("Dtl.bp_grp_cd3", p);
		p.columnDtl_bp_grp_nm3 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_bp_grp_nm3.addAliasName("Dtl.bp_grp_nm3", p);
		p.columnDtl_bp_grp_cd4 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_bp_grp_cd4.addAliasName("Dtl.bp_grp_cd4", p);
		p.columnDtl_bp_grp_nm4 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_bp_grp_nm4.addAliasName("Dtl.bp_grp_nm4", p);
		p.columnDtl_bp_grp_cd5 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_bp_grp_cd5.addAliasName("Dtl.bp_grp_cd5", p);
		p.columnDtl_bp_grp_nm5 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_bp_grp_nm5.addAliasName("Dtl.bp_grp_nm5", p);
		p.columnDtl_bp_grp_cd6 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_bp_grp_cd6.addAliasName("Dtl.bp_grp_cd6", p);
		p.columnDtl_bp_grp_nm6 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_bp_grp_nm6.addAliasName("Dtl.bp_grp_nm6", p);
		p.columnDtl_bp_grp_cd7 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_bp_grp_cd7.addAliasName("Dtl.bp_grp_cd7", p);
		p.columnDtl_bp_grp_nm7 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_bp_grp_nm7.addAliasName("Dtl.bp_grp_nm7", p);
		p.columnDtl_bp_grp_cd8 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_bp_grp_cd8.addAliasName("Dtl.bp_grp_cd8", p);
		p.columnDtl_bp_grp_nm8 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_bp_grp_nm8.addAliasName("Dtl.bp_grp_nm8", p);
		p.columnDtl_bp_grp_cd9 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_bp_grp_cd9.addAliasName("Dtl.bp_grp_cd9", p);
		p.columnDtl_bp_grp_nm9 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_bp_grp_nm9.addAliasName("Dtl.bp_grp_nm9", p);
		p.columnDtl_bp_grp_cd10 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_bp_grp_cd10.addAliasName("Dtl.bp_grp_cd10", p);
		p.columnDtl_bp_grp_nm10 = p.Dtl_BpGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_bp_grp_nm10.addAliasName("Dtl.bp_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_SlsBdgListReg p) {
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
	
	
	/** [Cnd_sls_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_itm_grp_cd_p = null;

	/**
	 * [Cnd_sls_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_itm_grp_cd_ListPutter() {
		if (Cnd_sls_itm_grp_cd_p == null) {
			Cnd_sls_itm_grp_cd_p = createCnd_sls_itm_grp_cd_ListPutter(Cnd_sls_itm_grp_cd, "sls_itm_grp_cd", "sls_itm_grp_nm");

		}
		return Cnd_sls_itm_grp_cd_p;
	}
	
	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_p = null;

	/**
	 * [Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter() {
		if (Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_p == null) {
			Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_p = createCnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter(Cnd_WrkNo_p_PPanel.WrkNo_wrk_no, "wrk_no", "wrk_nm");
		}
		return Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_p;
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
	
	
	/** [Cnd_sls_bdg_grp_ListPutter]の定義 */
	private MCListPutter Cnd_sls_bdg_grp_p = null;

	/**
	 * [Cnd_sls_bdg_grp_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_bdg_grp_ListPutter() {
		if (Cnd_sls_bdg_grp_p == null) {
			Cnd_sls_bdg_grp_p = createCnd_sls_bdg_grp_ListPutter(Cnd_sls_bdg_grp, "sls_bdg_grp");

		}
		return Cnd_sls_bdg_grp_p;
	}
	
	
	/** [Cmmn_big_num_rnd_typ_ListPutter]の定義 */
	private MCListPutter Cmmn_big_num_rnd_typ_p = null;

	/**
	 * [Cmmn_big_num_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCmmn_big_num_rnd_typ_ListPutter() {
		if (Cmmn_big_num_rnd_typ_p == null) {
			Cmmn_big_num_rnd_typ_p = createCmmn_big_num_rnd_typ_ListPutter(Cmmn_big_num_rnd_typ, "big_num_rnd_typ", "big_num_rnd_typ_nm");

		}
		return Cmmn_big_num_rnd_typ_p;
	}
	
	
	/** [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "sls_dpt_cd", "sls_dpt_nm","wg_cd");
		}
		return Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_sls_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_itm_grp_cd_p = null;

	/**
	 * [Dtl_sls_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_itm_grp_cd_ListPutter() {
		if (Dtl_sls_itm_grp_cd_p == null) {
			Dtl_sls_itm_grp_cd_p = createDtl_sls_itm_grp_cd_ListPutter(columnDtl_sls_itm_grp_cd, "sls_itm_grp_cd", "sls_itm_grp_nm");

		}
		return Dtl_sls_itm_grp_cd_p;
	}
	
	
	/** [Dtl_cst_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_cd_p = null;

	/**
	 * [Dtl_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_cd_ListPutter() {
		if (Dtl_cst_cd_p == null) {
			Dtl_cst_cd_p = createDtl_cst_cd_ListPutter(columnDtl_cst_cd, "cst_cd", "cst_nm");

		}
		return Dtl_cst_cd_p;
	}
	
	
	/** [Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_p = null;

	/**
	 * [Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter() {
		if (Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_p == null) {
			Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_p = createDtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter(Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no, "wrk_no", "wrk_nm");
		}
		return Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_p;
	}
	
	
	/** [Dtl_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_cd_p = null;

	/**
	 * [Dtl_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_cd_ListPutter() {
		if (Dtl_trd_cur_cd_p == null) {
			Dtl_trd_cur_cd_p = createDtl_trd_cur_cd_ListPutter(columnDtl_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","amt_dec_place");

		}
		return Dtl_trd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsBdgListReg create(){
		MSBBP_SlsBdgListReg p = new MSBBP_SlsBdgListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsBdgListReg create(String name){
		MSBBP_SlsBdgListReg p = new MSBBP_SlsBdgListReg(name);
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
		MSBBP_SlsBdgListReg_MC.jbfInitScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitTop((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitFold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitTab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitSlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitMesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitTab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitBpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitCnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitCtrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitRPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitCmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitDtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitBtn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbfInitEastBtn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitTop((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitFold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitTab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitSlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitMesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitTab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitBpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitCnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitCtrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitRPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitCmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitDtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitBtn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.jbInitEastBtn((MSBBP_SlsBdgListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_SlsBdgListReg p) {
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
	protected static void jbfInitTab1(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [NotSum]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNotSum(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.NotSumPanel = p.beansFactory.createPanel("NotSum");
		p.NotSumTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SlsItmGrpNotSum]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlsItmGrpNotSum(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.SlsItmGrpNotSumPanel = p.beansFactory.createPanel("SlsItmGrpNotSum");
		p.SlsItmGrpNotSumTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mesh]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMesh(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.MeshPanel = p.beansFactory.createPanel("Mesh");
		p.MeshTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [BpGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBpGrp(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.BpGrpPanel = p.beansFactory.createPanel("BpGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_sum_flg = p.beansFactory.createCheckBox("Cnd.sum_flg");
		p.Cnd_not_sum_flg = p.beansFactory.createCheckBox("Cnd.not_sum_flg");
		p.Cnd_sls_itm_grp_sum_flg = p.beansFactory.createCheckBox("Cnd.sls_itm_grp_sum_flg");
		p.Cnd_sls_itm_grp_not_sum_flg = p.beansFactory.createCheckBox("Cnd.sls_itm_grp_not_sum_flg");
		p.Cnd_mesh_srch_flg = p.beansFactory.createCheckBox("Cnd.mesh_srch_flg");
		p.Cnd_mesh_sls_dpt_flg = p.beansFactory.createCheckBox("Cnd.mesh_sls_dpt_flg");
		p.Cnd_mesh_sls_itm_grp_flg = p.beansFactory.createCheckBox("Cnd.mesh_sls_itm_grp_flg");
		p.Cnd_mesh_cst_flg = p.beansFactory.createCheckBox("Cnd.mesh_cst_flg");
		p.Cnd_mesh_sls_usr_flg = p.beansFactory.createCheckBox("Cnd.mesh_sls_usr_flg");
		p.Cnd_mesh_wrk_no_flg = p.beansFactory.createCheckBox("Cnd.mesh_wrk_no_flg");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextField("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_sls_itm_grp_cd_Label = p.beansFactory.createLabel("Cnd.sls_itm_grp_cd_Label");
		p.Cnd_sls_itm_grp_cd = p.beansFactory.createTextComboBox("Cnd.sls_itm_grp_cd");
		p.Cnd_sls_itm_grp_cd.setLabel(p.Cnd_sls_itm_grp_cd_Label);
		p.Cnd_sls_itm_grp_nm = p.beansFactory.createTextField("Cnd.sls_itm_grp_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_sls_bdg_grp_Label = p.beansFactory.createLabel("Cnd.sls_bdg_grp_Label");
		p.Cnd_sls_bdg_grp = p.beansFactory.createTextComboBox("Cnd.sls_bdg_grp");
		p.Cnd_sls_bdg_grp.setLabel(p.Cnd_sls_bdg_grp_Label);
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
	protected static void jbfInitCtrl(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Cmmn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCmmn(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.CmmnPanel = p.beansFactory.createPanel("Cmmn");
		// ブロックの項目の初期化
		p.Cmmn_big_num_rnd_typ_Label = p.beansFactory.createLabel("Cmmn.big_num_rnd_typ_Label");
		p.Cmmn_big_num_rnd_typ = p.beansFactory.createTextField("Cmmn.big_num_rnd_typ");
		p.Cmmn_big_num_rnd_typ.setLabel(p.Cmmn_big_num_rnd_typ_Label);
		p.Cmmn_big_num_rnd_typ_nm = p.beansFactory.createTextField("Cmmn.big_num_rnd_typ_nm");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_ym = p.beansFactory.createTableColumn("Dtl.ym", MCColumnType.DATE);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_sls_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_nm", MCColumnType.TEXT);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_amt_dec_place = p.beansFactory.createTableColumn("Dtl.amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_sls_bdg_grp = p.beansFactory.createTableColumn("Dtl.sls_bdg_grp", MCColumnType.TEXT);
		p.columnDtl_bdg_sls_prof_rate = p.beansFactory.createTableColumn("Dtl.bdg_sls_prof_rate", MCColumnType.NUMBER);
		p.columnDtl_not_sum_flg = p.beansFactory.createTableColumn("Dtl.not_sum_flg", MCColumnType.CHECK);
		p.columnDtl_sls_itm_grp_not_sum_flg = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_not_sum_flg", MCColumnType.CHECK);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CmmnPanel);
		p.TopPanel.setValueCheck(false);
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
	protected static void jbInitFold(MSBBP_SlsBdgListReg p) {
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
	protected static void jbInitTab1(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.NotSumPanel, null);
		p.Tab1Panel.setLastBeans(p.NotSumPanel);
		p.NotSumPanel.setNextBeans(p.SlsItmGrpNotSumPanel);
		p.Tab1Panel.add(p.SlsItmGrpNotSumPanel, null);
		p.SlsItmGrpNotSumPanel.setNextBeans(p.MeshPanel);
		p.Tab1Panel.add(p.MeshPanel, null);
		p.MeshPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [NotSum]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNotSum(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.NotSumPanel.setBorder(p.NotSumTitledBorder);
		p.NotSumPanel.setValueCheck(false);
		p.NotSumPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.NotSumPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SlsItmGrpNotSum]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlsItmGrpNotSum(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.SlsItmGrpNotSumPanel.setBorder(p.SlsItmGrpNotSumTitledBorder);
		p.SlsItmGrpNotSumPanel.setValueCheck(false);
		p.SlsItmGrpNotSumPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SlsItmGrpNotSumPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Mesh]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMesh(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.MeshPanel.setBorder(p.MeshTitledBorder);
		p.MeshPanel.setValueCheck(false);
		p.MeshPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.MeshPanel.setLayoutPosition("NWXCX");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.BpGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.BpGrpPanel);
	}

	/**
	 * [BpGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBpGrp(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.BpGrpPanel.setValueCheck(false);
		p.BpGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.ope_META);
		p.NotSumPanel.add(p.Cnd_sum_flg);
		p.NotSumPanel.setLastBeans(p.Cnd_sum_flg);
		p.Cnd_sum_flg.setNextBeans(p.Cnd_not_sum_flg);
		p.Cnd_sum_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sum_flg_META);
		p.NotSumPanel.add(p.Cnd_not_sum_flg);
		p.Cnd_not_sum_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.not_sum_flg_META);
		p.SlsItmGrpNotSumPanel.add(p.Cnd_sls_itm_grp_sum_flg);
		p.SlsItmGrpNotSumPanel.setLastBeans(p.Cnd_sls_itm_grp_sum_flg);
		p.Cnd_sls_itm_grp_sum_flg.setNextBeans(p.Cnd_sls_itm_grp_not_sum_flg);
		p.Cnd_sls_itm_grp_sum_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_itm_grp_sum_flg_META);
		p.SlsItmGrpNotSumPanel.add(p.Cnd_sls_itm_grp_not_sum_flg);
		p.Cnd_sls_itm_grp_not_sum_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_itm_grp_not_sum_flg_META);
		p.MeshPanel.add(p.Cnd_mesh_srch_flg);
		p.MeshPanel.setLastBeans(p.Cnd_mesh_srch_flg);
		p.Cnd_mesh_srch_flg.setNextBeans(p.Cnd_mesh_sls_dpt_flg);
		p.Cnd_mesh_srch_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.mesh_srch_flg_META);
		p.MeshPanel.add(p.Cnd_mesh_sls_dpt_flg);
		p.Cnd_mesh_sls_dpt_flg.setNextBeans(p.Cnd_mesh_sls_itm_grp_flg);
		p.Cnd_mesh_sls_dpt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.mesh_sls_dpt_flg_META);
		p.MeshPanel.add(p.Cnd_mesh_sls_itm_grp_flg);
		p.Cnd_mesh_sls_itm_grp_flg.setNextBeans(p.Cnd_mesh_cst_flg);
		p.Cnd_mesh_sls_itm_grp_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.mesh_sls_itm_grp_flg_META);
		p.MeshPanel.add(p.Cnd_mesh_cst_flg);
		p.Cnd_mesh_cst_flg.setNextBeans(p.Cnd_mesh_sls_usr_flg);
		p.Cnd_mesh_cst_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.mesh_cst_flg_META);
		p.MeshPanel.add(p.Cnd_mesh_sls_usr_flg);
		p.Cnd_mesh_sls_usr_flg.setNextBeans(p.Cnd_mesh_wrk_no_flg);
		p.Cnd_mesh_sls_usr_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.mesh_sls_usr_flg_META);
		p.MeshPanel.add(p.Cnd_mesh_wrk_no_flg);
		p.Cnd_mesh_wrk_no_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.mesh_wrk_no_flg_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_sls_itm_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_sls_itm_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_itm_grp_cd, true);
		p.Cnd_sls_itm_grp_cd.setLinkBeans(p.Cnd_sls_itm_grp_nm);
		p.CndPanel.add(p.Cnd_sls_itm_grp_cd_Label);
		p.CndPanel.add(p.Cnd_sls_itm_grp_cd);
		p.Cnd_sls_itm_grp_cd.setNextBeans(p.Cnd_sls_itm_grp_nm);
		p.Cnd_sls_itm_grp_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_itm_grp_cd_META);
		p.CndPanel.add(p.Cnd_sls_itm_grp_nm);
		p.Cnd_sls_itm_grp_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_sls_itm_grp_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_itm_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_itm_grp_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_WrkNo_p_PPanel);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_WrkNo_p_PPanel);
		p.Cnd_WrkNo_p_PPanel.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_no, true);
		p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.Cnd_wrk_nm);
		p.setPluralValueEnable(p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_sls_bdg_grp);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.Cnd_sls_bdg_grp.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_bdg_grp, true);
		p.CndPanel.add(p.Cnd_sls_bdg_grp_Label);
		p.CndPanel.add(p.Cnd_sls_bdg_grp);
		p.Cnd_sls_bdg_grp.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_sls_bdg_grp.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sls_bdg_grp_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1390.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.BpGrpPanel.add(p.Cnd_bp_grp_p_PPanel);
		p.BpGrpPanel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_SlsBdgListReg p) {
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
	protected static void jbInitRPnl(MSBBP_SlsBdgListReg p) {
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
	 * [Cmmn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCmmn(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.add(p.CmmnPanel);
		p.CmmnPanel.setNextBeans(p.DtlPanel);
		p.CmmnPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.CmmnPanel.add(p.Cmmn_big_num_rnd_typ_Label);
		p.CmmnPanel.add(p.Cmmn_big_num_rnd_typ);
		p.CmmnPanel.setLastBeans(p.Cmmn_big_num_rnd_typ);
		p.Cmmn_big_num_rnd_typ.setNextBeans(p.Cmmn_big_num_rnd_typ_nm);
		p.Cmmn_big_num_rnd_typ.setRow(p.getCmmnR(), mcframe.clientMSBB.MSBBP1390.CmmnR.big_num_rnd_typ_META);
		p.Cmmn_big_num_rnd_typ.addLinkBeans(p.Cmmn_big_num_rnd_typ_nm);
		p.Cmmn_big_num_rnd_typ.setListType(MCListType.STRICT);
		p.CmmnPanel.add(p.Cmmn_big_num_rnd_typ_nm);
		p.Cmmn_big_num_rnd_typ_nm.setRow(p.getCmmnR(), mcframe.clientMSBB.MSBBP1390.CmmnR.big_num_rnd_typ_nm_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_SlsBdgListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_SlsBdgListReg p) {
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
		MSBBP_SlsBdgListReg_MC.mcInitScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitTop((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitFold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitTab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitSlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitMesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitTab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitBpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitCnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitCtrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitRPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitCmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitDtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitBtn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.mcInitEastBtn((MSBBP_SlsBdgListReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_SlsBdgListReg_MC.statusInitUPD_ScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Top((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Fold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Tab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_NotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_SlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Mesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Tab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_BpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Cnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Ctrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_RPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Cmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Dtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_Btn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitUPD_EastBtn((MSBBP_SlsBdgListReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Top((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Fold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Tab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_NotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_SlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Mesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Tab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_BpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Cnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Ctrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_RPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Cmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Dtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_Btn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitFIX__U_EastBtn((MSBBP_SlsBdgListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Top((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Fold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Tab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_NotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_SlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Mesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Tab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_BpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Cnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Ctrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_RPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Cmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Dtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_Btn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH__DEL_EastBtn((MSBBP_SlsBdgListReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_SlsBdgListReg_MC.statusInitDEL_ScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Top((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Fold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Tab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_NotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_SlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Mesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Tab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_BpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Cnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Ctrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_RPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Cmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Dtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_Btn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitDEL_EastBtn((MSBBP_SlsBdgListReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_ScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Top((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Fold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Tab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_NotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_SlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Mesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Tab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_BpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Cnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Ctrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_RPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Cmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Dtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_Btn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitSRCH_EastBtn((MSBBP_SlsBdgListReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_SlsBdgListReg_MC.statusInitREF_ScreenOpe((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Top((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Fold((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Tab1((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_NotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_SlsItmGrpNotSum((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Mesh((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Tab2((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_BpGrp((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Cnd((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Ctrl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_RPnl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Cmmn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Dtl((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_Btn((MSBBP_SlsBdgListReg)this);
		MSBBP_SlsBdgListReg_MC.statusInitREF_EastBtn((MSBBP_SlsBdgListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_SlsBdgListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [NotSum]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNotSum(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [SlsItmGrpNotSum]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlsItmGrpNotSum(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [Mesh]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMesh(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [BpGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBpGrp(MSBBP_SlsBdgListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SlsBdgListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_sum_flg.addAllListener(p);
		p.Cnd_not_sum_flg.addAllListener(p);
		p.Cnd_sls_itm_grp_sum_flg.addAllListener(p);
		p.Cnd_sls_itm_grp_not_sum_flg.addAllListener(p);
		p.Cnd_mesh_srch_flg.addAllListener(p);
		p.Cnd_mesh_sls_dpt_flg.addAllListener(p);
		p.Cnd_mesh_sls_itm_grp_flg.addAllListener(p);
		p.Cnd_mesh_cst_flg.addAllListener(p);
		p.Cnd_mesh_sls_usr_flg.addAllListener(p);
		p.Cnd_mesh_wrk_no_flg.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_sls_itm_grp_cd.setListListener(p);
		p.Cnd_sls_itm_grp_cd.addAllListener(p);
		p.Cnd_sls_itm_grp_nm.setListListener(p);
		p.Cnd_sls_itm_grp_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_WrkNo_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_sls_bdg_grp.setListListener(p);
		p.Cnd_sls_bdg_grp.addAllListener(p);
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
	protected static void mcInitCtrl(MSBBP_SlsBdgListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_SlsBdgListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Cmmn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCmmn(MSBBP_SlsBdgListReg p) {
		p.Cmmn_big_num_rnd_typ.setListListener(p);
		p.Cmmn_big_num_rnd_typ.addAllListener(p);
		p.Cmmn_big_num_rnd_typ_nm.setListListener(p);
		p.Cmmn_big_num_rnd_typ_nm.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_SlsBdgListReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_ym.addAllListener(p);
		p.columnDtl_ym.setListListener(p);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_sls_itm_grp_cd.addAllListener(p);
		p.columnDtl_sls_itm_grp_cd.setListListener(p);
		p.columnDtl_sls_itm_grp_nm.addAllListener(p);
		p.columnDtl_sls_itm_grp_nm.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_trd_cur_cd.addAllListener(p);
		p.columnDtl_trd_cur_cd.setListListener(p);
		p.columnDtl_trd_cur_nm.addAllListener(p);
		p.columnDtl_trd_cur_nm.setListListener(p);
		p.columnDtl_amt_dec_place.addAllListener(p);
		p.columnDtl_amt_dec_place.setListListener(p);
		p.columnDtl_sls_bdg_grp.addAllListener(p);
		p.columnDtl_sls_bdg_grp.setListListener(p);
		p.columnDtl_bdg_sls_prof_rate.addAllListener(p);
		p.columnDtl_bdg_sls_prof_rate.setListListener(p);
		p.columnDtl_not_sum_flg.addAllListener(p);
		p.columnDtl_sls_itm_grp_not_sum_flg.addAllListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_SlsBdgListReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_SlsBdgListReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[NotSum]ブロックのモードの設定
	 */
	protected static void statusInitUPD_NotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[SlsItmGrpNotSum]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SlsItmGrpNotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[Mesh]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mesh(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BpGrp(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_SlsBdgListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sum_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_sum_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_sum_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_not_sum_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mesh_srch_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mesh_sls_dpt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mesh_sls_itm_grp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mesh_cst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mesh_sls_usr_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mesh_wrk_no_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_WrkNo_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBBP_SlsBdgListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cmmn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cmmn(MSBBP_SlsBdgListReg p){
		p.Cmmn_big_num_rnd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cmmn_big_num_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_SlsBdgListReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.ENABLE);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_bdg_grp.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_SlsAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.columnDtl_bdg_sls_prof_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_SlsProfAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.columnDtl_not_sum_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_itm_grp_not_sum_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_BpGrp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_SlsBdgListReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[NotSum]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_NotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[SlsItmGrpNotSum]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SlsItmGrpNotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Mesh]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Mesh(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BpGrp(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_SlsBdgListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sum_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_not_sum_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_sum_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_not_sum_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mesh_srch_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mesh_sls_dpt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mesh_sls_itm_grp_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mesh_cst_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mesh_sls_usr_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mesh_wrk_no_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_WrkNo_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_trd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBBP_SlsBdgListReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cmmn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cmmn(MSBBP_SlsBdgListReg p){
		p.Cmmn_big_num_rnd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cmmn_big_num_rnd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_SlsBdgListReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_bdg_grp.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_SlsAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bdg_sls_prof_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_SlsProfAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_not_sum_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_not_sum_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_BpGrp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_SlsBdgListReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[NotSum]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_NotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SlsItmGrpNotSum]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SlsItmGrpNotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Mesh]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Mesh(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BpGrp(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBBP_SlsBdgListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_sum_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_sum_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_sum_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_not_sum_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mesh_srch_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mesh_sls_dpt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mesh_sls_itm_grp_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mesh_cst_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mesh_sls_usr_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mesh_wrk_no_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_WrkNo_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBBP_SlsBdgListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cmmn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cmmn(MSBBP_SlsBdgListReg p){
		p.Cmmn_big_num_rnd_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cmmn_big_num_rnd_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Dtl(MSBBP_SlsBdgListReg p){
		p.columnDtl_check.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_bdg_grp.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_SlsAmt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bdg_sls_prof_rate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_SlsProfAmt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_not_sum_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_not_sum_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_BpGrp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBBP_SlsBdgListReg p){
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[NotSum]ブロックのモードの設定
	 */
	protected static void statusInitDEL_NotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[SlsItmGrpNotSum]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SlsItmGrpNotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[Mesh]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mesh(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BpGrp(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_SlsBdgListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sum_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_sum_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_sum_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_not_sum_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mesh_srch_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mesh_sls_dpt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mesh_sls_itm_grp_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mesh_cst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mesh_sls_usr_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mesh_wrk_no_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_WrkNo_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_trd_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBBP_SlsBdgListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cmmn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cmmn(MSBBP_SlsBdgListReg p){
		p.Cmmn_big_num_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cmmn_big_num_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBBP_SlsBdgListReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_bdg_grp.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_SlsAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bdg_sls_prof_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_SlsProfAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_not_sum_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_not_sum_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_BpGrp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_SlsBdgListReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[NotSum]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_NotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[SlsItmGrpNotSum]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SlsItmGrpNotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[Mesh]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mesh(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BpGrp(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_SlsBdgListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sum_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_sum_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_sum_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_not_sum_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mesh_srch_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mesh_sls_dpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mesh_sls_itm_grp_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mesh_cst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mesh_sls_usr_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mesh_wrk_no_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_WrkNo_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBBP_SlsBdgListReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cmmn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cmmn(MSBBP_SlsBdgListReg p){
		p.Cmmn_big_num_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cmmn_big_num_rnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_SlsBdgListReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_bdg_grp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_SlsAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bdg_sls_prof_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_SlsProfAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_not_sum_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_not_sum_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_BpGrp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_SlsBdgListReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[NotSum]ブロックのモードの設定
	 */
	protected static void statusInitREF_NotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[SlsItmGrpNotSum]ブロックのモードの設定
	 */
	protected static void statusInitREF_SlsItmGrpNotSum(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[Mesh]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mesh(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[BpGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_BpGrp(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_SlsBdgListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sum_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_sum_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_sum_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_not_sum_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mesh_srch_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mesh_sls_dpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mesh_sls_itm_grp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mesh_cst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mesh_sls_usr_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mesh_wrk_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_WrkNo_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBBP_SlsBdgListReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBBP_SlsBdgListReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cmmn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cmmn(MSBBP_SlsBdgListReg p){
		p.Cmmn_big_num_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cmmn_big_num_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBBP_SlsBdgListReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_bdg_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_SlsAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bdg_sls_prof_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_SlsProfAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_not_sum_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_not_sum_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_BpGrp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_SlsBdgListReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_SlsBdgListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_SlsBdgListReg_MC.setTableConfigDtl((MSBBP_SlsBdgListReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_SlsBdgListReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_ym.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.ym_META);
		p.columnDtl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ym);
		p.DtlTable.addTable(p.Dtl_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_sls_dpt_nm, p.columnDtl_wg_cd);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_sls_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sls_itm_grp_cd_META);
		p.columnDtl_sls_itm_grp_cd.addLinkBeans(p.columnDtl_sls_itm_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_cd);
		p.columnDtl_sls_itm_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sls_itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_nm);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.cst_cd_META);
		p.columnDtl_cst_cd.setListType(MCListType.STRICT);
		p.columnDtl_cst_cd.addLinkBeans(p.columnDtl_cst_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.DtlTable.addTable(p.Dtl_WrkNo_p_PPanel.WrkNoTable);
		p.Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.setLinkBeans(p.columnDtl_wrk_nm);
		p.columnDtl_trd_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.trd_cur_cd_META);
		p.columnDtl_trd_cur_cd.addLinkBeans(p.columnDtl_trd_cur_nm,p.columnDtl_amt_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_cd);
		p.columnDtl_trd_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_nm);
		p.columnDtl_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_dec_place);
		p.columnDtl_sls_bdg_grp.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sls_bdg_grp_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_bdg_grp);
		p.DtlTable.addTable(p.Dtl_SlsAmt_p_PPanel.AmtTable);
		p.Dtl_SlsAmt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl_bdg_sls_prof_rate.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.bdg_sls_prof_rate_META);
		p.columnDtl_bdg_sls_prof_rate.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_bdg_sls_prof_rate);
		p.DtlTable.addTable(p.Dtl_SlsProfAmt_p_PPanel.AmtTable);
		p.Dtl_SlsProfAmt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl_not_sum_flg.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.not_sum_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_sum_flg);
		p.columnDtl_sls_itm_grp_not_sum_flg.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sls_itm_grp_not_sum_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_not_sum_flg);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.DtlTable.addTable(p.Dtl_BpGrp_p_PPanel.BpGrpTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1390.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_sls_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_itm_grp_cd.getListConfig().setPutter(getCnd_sls_itm_grp_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_WrkNo_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getCnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_sls_bdg_grp.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_bdg_grp.getListConfig().setPutter(getCnd_sls_bdg_grp_ListPutter());
		Cmmn_big_num_rnd_typ.getListConfig().setPutter(getCmmn_big_num_rnd_typ_ListPutter());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_sls_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_itm_grp_cd.getListConfig().setPutter(getDtl_sls_itm_grp_cd_ListPutter());
		columnDtl_cst_cd.getListConfig().setPutter(getDtl_cst_cd_ListPutter());
		Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no.getListConfig().setPutter(getDtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter());
		columnDtl_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cur_cd.getListConfig().setPutter(getDtl_trd_cur_cd_ListPutter());
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsItmGrpBtm");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_WrkNo_p_PPanel_WrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
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
	 * [Cnd_sls_bdg_grp_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_bdg_grp_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SlsBdgGrp");
		return lp;
	}
	 
	/**
	 * [Cmmn_big_num_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCmmn_big_num_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BigNumRndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsItmGrpBtm");
		return lp;
	}
	 
	/**
	 * [Dtl_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_WrkNo_p_PPanel_columnWrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [Dtl_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_sls_itm_grp_cd) return getCnd_sls_itm_grp_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_WrkNo_p_PPanel.WrkNo_wrk_no) return getCnd_WrkNo_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_sls_bdg_grp) return getCnd_sls_bdg_grp(row, info);
		if(combo == Cmmn_big_num_rnd_typ) return getCmmn_big_num_rnd_typ(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_sls_itm_grp_cd) return getDtl_sls_itm_grp_cd(row, info);
		if(combo == columnDtl_cst_cd) return getDtl_cst_cd(row, info);
		if(combo == Dtl_WrkNo_p_PPanel.columnWrkNo_wrk_no) return getDtl_WrkNo_p_PPanel_columnWrkNo_wrk_no(row, info);
		if(combo == columnDtl_trd_cur_cd) return getDtl_trd_cur_cd(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
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
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_sum_flg) return doCnd_sum_flg_VC(info);
		if (vc == Cnd_not_sum_flg) return doCnd_not_sum_flg_VC(info);
		if (vc == Cnd_sls_itm_grp_sum_flg) return doCnd_sls_itm_grp_sum_flg_VC(info);
		if (vc == Cnd_sls_itm_grp_not_sum_flg) return doCnd_sls_itm_grp_not_sum_flg_VC(info);
		if (vc == Cnd_mesh_srch_flg) return doCnd_mesh_srch_flg_VC(info);
		if (vc == Cnd_mesh_sls_dpt_flg) return doCnd_mesh_sls_dpt_flg_VC(info);
		if (vc == Cnd_mesh_sls_itm_grp_flg) return doCnd_mesh_sls_itm_grp_flg_VC(info);
		if (vc == Cnd_mesh_cst_flg) return doCnd_mesh_cst_flg_VC(info);
		if (vc == Cnd_mesh_sls_usr_flg) return doCnd_mesh_sls_usr_flg_VC(info);
		if (vc == Cnd_mesh_wrk_no_flg) return doCnd_mesh_wrk_no_flg_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_sls_itm_grp_cd) return doCnd_sls_itm_grp_cd_VC(info);
		if (vc == Cnd_sls_itm_grp_nm) return doCnd_sls_itm_grp_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_sls_bdg_grp) return doCnd_sls_bdg_grp_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cmmn_big_num_rnd_typ) return doCmmn_big_num_rnd_typ_VC(info);
		if (vc == Cmmn_big_num_rnd_typ_nm) return doCmmn_big_num_rnd_typ_nm_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_ym) return doDtl_ym_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_sls_itm_grp_cd) return doDtl_sls_itm_grp_cd_VC(info);
		if (vc == columnDtl_sls_itm_grp_nm) return doDtl_sls_itm_grp_nm_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_trd_cur_cd) return doDtl_trd_cur_cd_VC(info);
		if (vc == columnDtl_trd_cur_nm) return doDtl_trd_cur_nm_VC(info);
		if (vc == columnDtl_amt_dec_place) return doDtl_amt_dec_place_VC(info);
		if (vc == columnDtl_sls_bdg_grp) return doDtl_sls_bdg_grp_VC(info);
		if (vc == columnDtl_bdg_sls_prof_rate) return doDtl_bdg_sls_prof_rate_VC(info);
		if (vc == columnDtl_not_sum_flg) return doDtl_not_sum_flg_VC(info);
		if (vc == columnDtl_sls_itm_grp_not_sum_flg) return doDtl_sls_itm_grp_not_sum_flg_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_not_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_not_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mesh_srch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mesh_srch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mesh_sls_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mesh_sls_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mesh_sls_itm_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mesh_sls_itm_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mesh_cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mesh_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mesh_sls_usr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mesh_sls_usr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mesh_wrk_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mesh_wrk_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_bdg_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_bdg_grp_VC(MCEventInfo info){
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
	 * [Cmmn]パネルの[big_num_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCmmn_big_num_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cmmn]パネルの[big_num_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCmmn_big_num_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_bdg_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_bdg_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bdg_sls_prof_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bdg_sls_prof_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_not_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_not_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_sum_flg) doCnd_sum_flg_NC(info);
		else if (nc == Cnd_not_sum_flg) doCnd_not_sum_flg_NC(info);
		else if (nc == Cnd_sls_itm_grp_sum_flg) doCnd_sls_itm_grp_sum_flg_NC(info);
		else if (nc == Cnd_sls_itm_grp_not_sum_flg) doCnd_sls_itm_grp_not_sum_flg_NC(info);
		else if (nc == Cnd_mesh_srch_flg) doCnd_mesh_srch_flg_NC(info);
		else if (nc == Cnd_mesh_sls_dpt_flg) doCnd_mesh_sls_dpt_flg_NC(info);
		else if (nc == Cnd_mesh_sls_itm_grp_flg) doCnd_mesh_sls_itm_grp_flg_NC(info);
		else if (nc == Cnd_mesh_cst_flg) doCnd_mesh_cst_flg_NC(info);
		else if (nc == Cnd_mesh_sls_usr_flg) doCnd_mesh_sls_usr_flg_NC(info);
		else if (nc == Cnd_mesh_wrk_no_flg) doCnd_mesh_wrk_no_flg_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_NC(info);
		else if (nc == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_sls_bdg_grp) doCnd_sls_bdg_grp_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cmmn_big_num_rnd_typ) doCmmn_big_num_rnd_typ_NC(info);
		else if (nc == Cmmn_big_num_rnd_typ_nm) doCmmn_big_num_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_ym) doDtl_ym_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NC(info);
		else if (nc == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NC(info);
		else if (nc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NC(info);
		else if (nc == columnDtl_amt_dec_place) doDtl_amt_dec_place_NC(info);
		else if (nc == columnDtl_sls_bdg_grp) doDtl_sls_bdg_grp_NC(info);
		else if (nc == columnDtl_bdg_sls_prof_rate) doDtl_bdg_sls_prof_rate_NC(info);
		else if (nc == columnDtl_not_sum_flg) doDtl_not_sum_flg_NC(info);
		else if (nc == columnDtl_sls_itm_grp_not_sum_flg) doDtl_sls_itm_grp_not_sum_flg_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_not_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_not_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_srch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_srch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_itm_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_itm_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_usr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_usr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_wrk_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_wrk_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_bdg_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_NC(MCEventInfo info){
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
	 * [Cmmn]パネルの[big_num_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cmmn]パネルの[big_num_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdg_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdg_grp_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bdg_sls_prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bdg_sls_prof_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_not_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_not_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_sum_flg) doCnd_sum_flg_NE(info);
		else if (ne == Cnd_not_sum_flg) doCnd_not_sum_flg_NE(info);
		else if (ne == Cnd_sls_itm_grp_sum_flg) doCnd_sls_itm_grp_sum_flg_NE(info);
		else if (ne == Cnd_sls_itm_grp_not_sum_flg) doCnd_sls_itm_grp_not_sum_flg_NE(info);
		else if (ne == Cnd_mesh_srch_flg) doCnd_mesh_srch_flg_NE(info);
		else if (ne == Cnd_mesh_sls_dpt_flg) doCnd_mesh_sls_dpt_flg_NE(info);
		else if (ne == Cnd_mesh_sls_itm_grp_flg) doCnd_mesh_sls_itm_grp_flg_NE(info);
		else if (ne == Cnd_mesh_cst_flg) doCnd_mesh_cst_flg_NE(info);
		else if (ne == Cnd_mesh_sls_usr_flg) doCnd_mesh_sls_usr_flg_NE(info);
		else if (ne == Cnd_mesh_wrk_no_flg) doCnd_mesh_wrk_no_flg_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_NE(info);
		else if (ne == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_sls_bdg_grp) doCnd_sls_bdg_grp_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cmmn_big_num_rnd_typ) doCmmn_big_num_rnd_typ_NE(info);
		else if (ne == Cmmn_big_num_rnd_typ_nm) doCmmn_big_num_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_ym) doDtl_ym_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NE(info);
		else if (ne == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NE(info);
		else if (ne == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NE(info);
		else if (ne == columnDtl_amt_dec_place) doDtl_amt_dec_place_NE(info);
		else if (ne == columnDtl_sls_bdg_grp) doDtl_sls_bdg_grp_NE(info);
		else if (ne == columnDtl_bdg_sls_prof_rate) doDtl_bdg_sls_prof_rate_NE(info);
		else if (ne == columnDtl_not_sum_flg) doDtl_not_sum_flg_NE(info);
		else if (ne == columnDtl_sls_itm_grp_not_sum_flg) doDtl_sls_itm_grp_not_sum_flg_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_not_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_not_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_srch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_srch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_itm_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_itm_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_usr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_usr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_wrk_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_wrk_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_bdg_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_NE(MCEventInfo info){
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
	 * [Cmmn]パネルの[big_num_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cmmn]パネルの[big_num_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdg_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdg_grp_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bdg_sls_prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bdg_sls_prof_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_not_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_not_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_sum_flg) doCnd_sum_flg_NX(info);
		else if (nx == Cnd_not_sum_flg) doCnd_not_sum_flg_NX(info);
		else if (nx == Cnd_sls_itm_grp_sum_flg) doCnd_sls_itm_grp_sum_flg_NX(info);
		else if (nx == Cnd_sls_itm_grp_not_sum_flg) doCnd_sls_itm_grp_not_sum_flg_NX(info);
		else if (nx == Cnd_mesh_srch_flg) doCnd_mesh_srch_flg_NX(info);
		else if (nx == Cnd_mesh_sls_dpt_flg) doCnd_mesh_sls_dpt_flg_NX(info);
		else if (nx == Cnd_mesh_sls_itm_grp_flg) doCnd_mesh_sls_itm_grp_flg_NX(info);
		else if (nx == Cnd_mesh_cst_flg) doCnd_mesh_cst_flg_NX(info);
		else if (nx == Cnd_mesh_sls_usr_flg) doCnd_mesh_sls_usr_flg_NX(info);
		else if (nx == Cnd_mesh_wrk_no_flg) doCnd_mesh_wrk_no_flg_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_NX(info);
		else if (nx == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_sls_bdg_grp) doCnd_sls_bdg_grp_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cmmn_big_num_rnd_typ) doCmmn_big_num_rnd_typ_NX(info);
		else if (nx == Cmmn_big_num_rnd_typ_nm) doCmmn_big_num_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_ym) doDtl_ym_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NX(info);
		else if (nx == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NX(info);
		else if (nx == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NX(info);
		else if (nx == columnDtl_amt_dec_place) doDtl_amt_dec_place_NX(info);
		else if (nx == columnDtl_sls_bdg_grp) doDtl_sls_bdg_grp_NX(info);
		else if (nx == columnDtl_bdg_sls_prof_rate) doDtl_bdg_sls_prof_rate_NX(info);
		else if (nx == columnDtl_not_sum_flg) doDtl_not_sum_flg_NX(info);
		else if (nx == columnDtl_sls_itm_grp_not_sum_flg) doDtl_sls_itm_grp_not_sum_flg_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_not_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_not_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_srch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_srch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_itm_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_itm_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_sls_usr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_sls_usr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mesh_wrk_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mesh_wrk_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_bdg_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_NX(MCEventInfo info){
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
	 * [Cmmn]パネルの[big_num_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cmmn]パネルの[big_num_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdg_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdg_grp_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bdg_sls_prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bdg_sls_prof_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_not_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_not_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_sls_itm_grp_cd) doCnd_sls_itm_grp_cd_LC(info);
		else if (lc == Cnd_sls_itm_grp_nm) doCnd_sls_itm_grp_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_sls_bdg_grp) doCnd_sls_bdg_grp_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cmmn_big_num_rnd_typ) doCmmn_big_num_rnd_typ_LC(info);
		else if (lc == Cmmn_big_num_rnd_typ_nm) doCmmn_big_num_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_ym) doDtl_ym_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_LC(info);
		else if (lc == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_LC(info);
		else if (lc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_LC(info);
		else if (lc == columnDtl_amt_dec_place) doDtl_amt_dec_place_LC(info);
		else if (lc == columnDtl_sls_bdg_grp) doDtl_sls_bdg_grp_LC(info);
		else if (lc == columnDtl_bdg_sls_prof_rate) doDtl_bdg_sls_prof_rate_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_bdg_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_LC(MCEventInfo info){
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
	 * [Cmmn]パネルの[big_num_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cmmn]パネルの[big_num_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCmmn_big_num_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdg_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdg_grp_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bdg_sls_prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bdg_sls_prof_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_itm_grp_cd]の作成メソッド
	 */
	public MCList getCnd_sls_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsItmGrpBtm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_WrkNo_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getCnd_WrkNo_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_bdg_grp]の作成メソッド
	 */
	public MCList getCnd_sls_bdg_grp(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSlsBdgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cmmn_big_num_rnd_typ]の作成メソッド
	 */
	public MCList getCmmn_big_num_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBigNumRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_itm_grp_cd]の作成メソッド
	 */
	public MCList getDtl_sls_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsItmGrpBtm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_cd]の作成メソッド
	 */
	public MCList getDtl_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_WrkNo_p_PPanel_columnWrkNo_wrk_no]の作成メソッド
	 */
	public MCList getDtl_WrkNo_p_PPanel_columnWrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cur_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1390.Srch01")) {
			return new MS_MSBBL1390_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1390.Upd01")) {
			return new MS_MSBBL1390_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1390.Del01")) {
			return new MS_MSBBL1390_Del01Bridge();
		}
		if (id.equals("MS.MSBBL1390.Imp01")) {
			return new MS_MSBBL1390_Imp01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1390_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1390_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1390_Srch01Bridge() {
			p_MS_MSBBL1390_Srch01 = new MCParam(PDef.MS_MSBBL1390_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1390_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1390.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));

			p_MS_MSBBL1390_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1390_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1390_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1390_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1390_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1390.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1390.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1390_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1390_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)p_MS_MSBBL1390_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1390_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1390_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1390_Upd01Bridge() {
			p_MS_MSBBL1390_Upd01 = new MCParam(PDef.MS_MSBBL1390_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1390_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));

			p_MS_MSBBL1390_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1390_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1390_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1390_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1390_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1390_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1390_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)p_MS_MSBBL1390_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1390_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1390_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1390_Del01Bridge() {
			p_MS_MSBBL1390_Del01 = new MCParam(PDef.MS_MSBBL1390_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1390_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));

			p_MS_MSBBL1390_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1390_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1390_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1390_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1390_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1390_Del01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1390_Del01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)p_MS_MSBBL1390_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1390_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1390_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1390_Imp01;

		/** コンストラクタ */
		protected MS_MSBBL1390_Imp01Bridge() {
			p_MS_MSBBL1390_Imp01 = new MCParam(PDef.MS_MSBBL1390_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1390_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));

			p_MS_MSBBL1390_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1390_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1390_Imp01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1390_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1390_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1390.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1390_Imp01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1390.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1390_Imp01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1390.DtlR>)p_MS_MSBBL1390_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}