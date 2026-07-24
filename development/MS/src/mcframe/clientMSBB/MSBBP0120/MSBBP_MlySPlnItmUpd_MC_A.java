package mcframe.clientMSBB.MSBBP0120;

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
import mcframe.clientMSBB.MSBBP0120.MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Srch01Caller;
import mcframe.clientMSBB.MSBBP0120.MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Sprt01Caller;
import mcframe.clientMSBB.MSBBP0120.MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Sprt02Caller;
import mcframe.clientMSBB.MSBBP0120.MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Upd01Caller;

/**
 * 画面"MSBBP_MlySPlnItmUpd"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_MlySPlnItmUpd_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP0120";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Edit;REF,Refer UPD,訂正する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
	public MCLabel Cnd_spln_ym_fr_Label = null;
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_spln_ym_fr = null;
	public MCLabel Cnd_spln_ym_to_Label = null;
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_spln_ym_to = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
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
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_spln_vers_Label = null;
	/**
	 * Version バージョン.<p>
	 *
	 */
	public MCTextComboBox Cnd_spln_vers = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_f_flg = null;
	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_t_flg = null;
	public MCLabel Cnd_spln_itm_cd_Label = null;
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_spln_itm_cd = null;
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public MCTextField Cnd_spln_itm_nm = null;
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
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCLabel Cnd_itm_grp_lab1;	// [Cnd]の[itm_grp_p.itm_grp_lab1]を[Cnd_itm_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab2;	// [Cnd]の[itm_grp_p.itm_grp_lab2]を[Cnd_itm_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab3;	// [Cnd]の[itm_grp_p.itm_grp_lab3]を[Cnd_itm_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab4;	// [Cnd]の[itm_grp_p.itm_grp_lab4]を[Cnd_itm_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab5;	// [Cnd]の[itm_grp_p.itm_grp_lab5]を[Cnd_itm_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab6;	// [Cnd]の[itm_grp_p.itm_grp_lab6]を[Cnd_itm_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab7;	// [Cnd]の[itm_grp_p.itm_grp_lab7]を[Cnd_itm_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab8;	// [Cnd]の[itm_grp_p.itm_grp_lab8]を[Cnd_itm_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab9;	// [Cnd]の[itm_grp_p.itm_grp_lab9]を[Cnd_itm_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab10;	// [Cnd]の[itm_grp_p.itm_grp_lab10]を[Cnd_itm_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Tab11]ブロック関連のField定義
	public MCPanel Tab11Panel = null;
	// [Tab11]ブロックの項目のField定義
	// [Tab12]ブロック関連のField定義
	public MCPanel Tab12Panel = null;
	// [Tab12]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_ym_Label = null;
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDateField Hdr_ym = null;
	public MCLabel Hdr_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Hdr_dpt_nm = null;
	public MCLabel Hdr_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Hdr_cst_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	public MCLabel Hdr_spln_vers_Label = null;
	/**
	 * Version バージョン.<p>
	 *
	 */
	public MCTextField Hdr_spln_vers = null;
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public MCCheckBox Hdr_edited_flg = null;
	/**
	 * Adopt 採用.<p>
	 *
	 */
	public MCCheckBox Hdr_adopted_flg = null;
	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public MCCheckBox Hdr_locked_flg = null;
	public MCLabel Hdr_usr_cd_Label = null;
	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_usr_cd = null;
	/**
	 * Aggregation PIC 集計担当者.<p>
	 *
	 */
	public MCTextField Hdr_usr_nm = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [DtlDisp]ブロック関連のField定義
	public MCPanel DtlDispPanel = null;
	public MCScrollPane DtlDispScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP0120.DtlDispR> DtlDispTable = null;
	// [DtlDisp]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_check = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_fix_flg = null;
	/**
	 * Plan item 計画品目.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_disp_spln_itm = null;
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_disp_itm = null;
	/**
	 * Details cd. 明細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_row_title_col = null;
	/**
	 * Details 明細.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_row_title_nm = null;
	/**
	 * Details 明細.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_disp_row_title_nm = null;
	/**
	 * Unit cd. (Currency cd.) 単位ＣＤ（通貨ＣＤ）.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_disp_unit_cd = null;
	/**
	 * Unit name (Currency name) 単位名（通貨名）.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_disp_unit_nm = null;
	/**
	 * Enter 入力.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_spln_set_typ_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty01_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty01;// [DtlDisp]の[qty01_p.qty]を[columnDtlDisp_qty01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty02_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty02;// [DtlDisp]の[qty02_p.qty]を[columnDtlDisp_qty02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty03_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty03;// [DtlDisp]の[qty03_p.qty]を[columnDtlDisp_qty03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty04_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty04;// [DtlDisp]の[qty04_p.qty]を[columnDtlDisp_qty04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty05_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty05;// [DtlDisp]の[qty05_p.qty]を[columnDtlDisp_qty05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty06_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty06;// [DtlDisp]の[qty06_p.qty]を[columnDtlDisp_qty06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty07_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty07;// [DtlDisp]の[qty07_p.qty]を[columnDtlDisp_qty07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty08_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty08;// [DtlDisp]の[qty08_p.qty]を[columnDtlDisp_qty08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty09_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty09;// [DtlDisp]の[qty09_p.qty]を[columnDtlDisp_qty09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty10_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty10;// [DtlDisp]の[qty10_p.qty]を[columnDtlDisp_qty10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty11_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty11;// [DtlDisp]の[qty11_p.qty]を[columnDtlDisp_qty11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty12_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty12;// [DtlDisp]の[qty12_p.qty]を[columnDtlDisp_qty12]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty13_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty13;// [DtlDisp]の[qty13_p.qty]を[columnDtlDisp_qty13]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty14_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty14;// [DtlDisp]の[qty14_p.qty]を[columnDtlDisp_qty14]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty15_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty15;// [DtlDisp]の[qty15_p.qty]を[columnDtlDisp_qty15]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty16_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty16;// [DtlDisp]の[qty16_p.qty]を[columnDtlDisp_qty16]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty17_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty17;// [DtlDisp]の[qty17_p.qty]を[columnDtlDisp_qty17]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty18_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty18;// [DtlDisp]の[qty18_p.qty]を[columnDtlDisp_qty18]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty19_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty19;// [DtlDisp]の[qty19_p.qty]を[columnDtlDisp_qty19]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty20_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty20;// [DtlDisp]の[qty20_p.qty]を[columnDtlDisp_qty20]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty21_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty21;// [DtlDisp]の[qty21_p.qty]を[columnDtlDisp_qty21]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty22_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty22;// [DtlDisp]の[qty22_p.qty]を[columnDtlDisp_qty22]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty23_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty23;// [DtlDisp]の[qty23_p.qty]を[columnDtlDisp_qty23]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlDisp_qty24_p_PPanel;
	public MCColumnConfig columnDtlDisp_qty24;// [DtlDisp]の[qty24_p.qty]を[columnDtlDisp_qty24]としてエイリアス定義。
	/**
	 * Possible input month 01 入力可能年月０１.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty01_flg = null;
	/**
	 * Possible input month 02 入力可能年月０２.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty02_flg = null;
	/**
	 * Possible input month 03 入力可能年月０３.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty03_flg = null;
	/**
	 * Possible input month 04 入力可能年月０４.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty04_flg = null;
	/**
	 * Possible input month 05 入力可能年月０５.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty05_flg = null;
	/**
	 * Possible input month 06 入力可能年月０６.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty06_flg = null;
	/**
	 * Possible input month 07 入力可能年月０７.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty07_flg = null;
	/**
	 * Possible input month 08 入力可能年月０８.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty08_flg = null;
	/**
	 * Possible input month 09 入力可能年月０９.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty09_flg = null;
	/**
	 * Possible input month 10 入力可能年月１０.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty10_flg = null;
	/**
	 * Possible input month 11 入力可能年月１１.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty11_flg = null;
	/**
	 * Possible input month 12 入力可能年月１２.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty12_flg = null;
	/**
	 * Possible input month 13 入力可能年月１３.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty13_flg = null;
	/**
	 * Possible input month 14 入力可能年月１４.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty14_flg = null;
	/**
	 * Possible input month 15 入力可能年月１５.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty15_flg = null;
	/**
	 * Possible input month 16 入力可能年月１６.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty16_flg = null;
	/**
	 * Possible input month 17 入力可能年月１７.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty17_flg = null;
	/**
	 * Possible input month 18 入力可能年月１８.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty18_flg = null;
	/**
	 * Possible input month 19 入力可能年月１９.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty19_flg = null;
	/**
	 * Possible input month 20 入力可能年月２０.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty20_flg = null;
	/**
	 * Possible input month 21 入力可能年月２１.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty21_flg = null;
	/**
	 * Possible input month 22 入力可能年月２２.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty22_flg = null;
	/**
	 * Possible input month 23 入力可能年月２３.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty23_flg = null;
	/**
	 * Possible input month 24 入力可能年月２４.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_editable_qty24_flg = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_dec_place = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_amt_dec_place = null;
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_spln_itm_cd = null;
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_spln_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlDisp_itm_p_PPanel;
	public MCColumnConfig columnDtlDisp_itm_cd;// [DtlDisp]の[itm_p.itm_cd]を[columnDtlDisp_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlDisp_itm_sub1;// [DtlDisp]の[itm_p.itm_sub1]を[columnDtlDisp_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlDisp_itm_sub2;// [DtlDisp]の[itm_p.itm_sub2]を[columnDtlDisp_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlDisp_itm_sub3;// [DtlDisp]の[itm_p.itm_sub3]を[columnDtlDisp_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlDisp_itm_nm;// [DtlDisp]の[itm_p.itm_nm]を[columnDtlDisp_itm_nm]としてエイリアス定義。
	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_spln_set_typ = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_cur_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_unit_nm = null;
	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_disp_seq = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_old_fix_flg = null;
	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_grp_peg_no = null;
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_record_id = null;
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDisp_record_grp_id = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Monthly sales plan entry 月次販売計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP0110 = null;
	/**
	 * Quantity amount calculation 数量金額計算.<p>
	 *
	 */
	public MCButton Btn_sprt_calcAmtQty = null;
	/**
	 * Breakdown re-explode 内訳再展開.<p>
	 *
	 */
	public MCButton Btn_sprt_reExpAmtQty = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCLabel Btn_label_select = null;
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
	 * Firm 確定.<p>
	 *
	 */
	public MCLabel Btn_label_fix = null;
	/**
	 * All firm 全確定.<p>
	 *
	 */
	public MCButton Btn_fix_all = null;
	/**
	 * All unfirm 全確定解除.<p>
	 *
	 */
	public MCButton Btn_unfix_all = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UPD, UPD, FIX_U, SRCH, REF};
	
	/** [MS_MSBBL0120_Srch01]のCallerの作成 */
	protected MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Srch01Caller createMS_MSBBL0120_Srch01() {
		MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Srch01Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Srch01Bridge>
		caller = ((MSBBP_MlySPlnItmUpd_MC)this).new MS_MSBBL0120_Srch01Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Srch01Bridge>(
					(MSBBP_MlySPlnItmUpd)this, new MS_MSBBL0120_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL0120_Srch01]の呼び出し */
	protected void callMS_MSBBL0120_Srch01() {
		MCCaller caller = createMS_MSBBL0120_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL0120_Sprt01]のCallerの作成 */
	protected MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Sprt01Caller createMS_MSBBL0120_Sprt01() {
		MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Sprt01Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Sprt01Bridge>
		caller = ((MSBBP_MlySPlnItmUpd_MC)this).new MS_MSBBL0120_Sprt01Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Sprt01Bridge>(
					(MSBBP_MlySPlnItmUpd)this, new MS_MSBBL0120_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBBL0120_Sprt01]の呼び出し */
	protected void callMS_MSBBL0120_Sprt01() {
		MCCaller caller = createMS_MSBBL0120_Sprt01();
		caller.exec();
	}
	/** [MS_MSBBL0120_Sprt02]のCallerの作成 */
	protected MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Sprt02Caller createMS_MSBBL0120_Sprt02() {
		MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Sprt02Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Sprt02Bridge>
		caller = ((MSBBP_MlySPlnItmUpd_MC)this).new MS_MSBBL0120_Sprt02Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Sprt02Bridge>(
					(MSBBP_MlySPlnItmUpd)this, new MS_MSBBL0120_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBBL0120_Sprt02]の呼び出し */
	protected void callMS_MSBBL0120_Sprt02() {
		MCCaller caller = createMS_MSBBL0120_Sprt02();
		caller.exec();
	}
	/** [MS_MSBBL0120_Upd01]のCallerの作成 */
	protected MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Upd01Caller createMS_MSBBL0120_Upd01() {
		MSBBP_MlySPlnItmUpd_MC.MS_MSBBL0120_Upd01Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Upd01Bridge>
		caller = ((MSBBP_MlySPlnItmUpd_MC)this).new MS_MSBBL0120_Upd01Caller<MSBBP_MlySPlnItmUpd, MS_MSBBL0120_Upd01Bridge>(
					(MSBBP_MlySPlnItmUpd)this, new MS_MSBBL0120_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL0120_Upd01]の呼び出し */
	protected void callMS_MSBBL0120_Upd01() {
		MCCaller caller = createMS_MSBBL0120_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0120.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0120.HdrR aHdrR;
	/** [DtlDisp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0120.DtlDispR> aDtlDispL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0120.DtlR> aDtlL;
	/** [SprtAmtQtyCalDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0120.DtlR> aSprtAmtQtyCalDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0120.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP0120.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP0120.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP0120.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP0120.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP0120.HdrR.create();
	}

	/**
	 * コピーによってaDtlDispLを設定します。
	 *
	 * aDtlDispLのインスタンスは変更されません。
	 *
	 * @param dataset DtlDispL
	 */
	public void setDtlDispL(MCList<mcframe.clientMSBB.MSBBP0120.DtlDispR> aList) {
		if (getDtlDispL() != aList) {
			getDtlDispL().setAll(aList);
		}
	}

	/**
	 * [DtlDisp]ブロックのコンテナaDtlDispLを返します。
	 *
	 * @return DtlDispL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0120.DtlDispR> getDtlDispL() {
		return aDtlDispL;
	}

	/**
	 * aDtlDispRを作成します。
	 *
	 * @return DtlDispR
	 */
	public mcframe.clientMSBB.MSBBP0120.DtlDispR createDtlDispR() {
		return mcframe.clientMSBB.MSBBP0120.DtlDispR.create();
	}

	/**
	 * aDtlDispLを作成します。
	 *
	 * @return DtlDispL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0120.DtlDispR> createDtlDispL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.class);
	}

	/**
	 * DtlDispTableを初期化します。
	 */
	protected void createDtlDispTable(){
		if(DtlDispTable == null){
			DtlDispTable = beansFactory.createTable2("DtlDisp.table");
		}
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP0120.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0120.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP0120.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP0120.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0120.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class);
	}

	/**
	 * コピーによってaSprtAmtQtyCalDtlLを設定します。
	 *
	 * aSprtAmtQtyCalDtlLのインスタンスは変更されません。
	 *
	 * @param dataset SprtAmtQtyCalDtlL
	 */
	public void setSprtAmtQtyCalDtlL(MCList<mcframe.clientMSBB.MSBBP0120.DtlR> aList) {
		if (getSprtAmtQtyCalDtlL() != aList) {
			getSprtAmtQtyCalDtlL().setAll(aList);
		}
	}

	/**
	 * [SprtAmtQtyCalDtl]ブロックのコンテナaSprtAmtQtyCalDtlLを返します。
	 *
	 * @return SprtAmtQtyCalDtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0120.DtlR> getSprtAmtQtyCalDtlL() {
		return aSprtAmtQtyCalDtlL;
	}

	/**
	 * aSprtAmtQtyCalDtlRを作成します。
	 *
	 * @return SprtAmtQtyCalDtlR
	 */
	public mcframe.clientMSBB.MSBBP0120.DtlR createSprtAmtQtyCalDtlR() {
		return mcframe.clientMSBB.MSBBP0120.DtlR.create();
	}

	/**
	 * aSprtAmtQtyCalDtlLを作成します。
	 *
	 * @return SprtAmtQtyCalDtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0120.DtlR> createSprtAmtQtyCalDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getDtlDispL())) ret.add(getDtlDispL());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getSprtAmtQtyCalDtlL())) ret.add(getSprtAmtQtyCalDtlL());
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
		if(aCnt == getDtlDispL()) return "DtlDisp";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getSprtAmtQtyCalDtlL()) return "SprtAmtQtyCalDtl";
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
		if(bId.equals("DtlDisp")) return getDtlDispL();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("SprtAmtQtyCalDtl")) return getSprtAmtQtyCalDtlL();
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
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(HdrTabPanel);
		ret.add(Tab11Panel);
		ret.add(Tab12Panel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(DtlDispPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_MlySPlnItmUpd_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlDispL = createDtlDispL();
		aDtlL = createDtlL();
		aSprtAmtQtyCalDtlL = createSprtAmtQtyCalDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_MlySPlnItmUpd_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlDispL = createDtlDispL();
		createDtlDispTable();
		DtlDispTable.setRowName(name);
		aDtlL = createDtlL();
		aSprtAmtQtyCalDtlL = createSprtAmtQtyCalDtlL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_MlySPlnItmUpd_MC.jbCreateScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateTop((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateFold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateTab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateTab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateCnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateCnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateCtrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateHdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateTab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateTab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateHdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateHdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateDtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbCreateBtn((MSBBP_MlySPlnItmUpd)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_MlySPlnItmUpd p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_lab1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab1;
		p.Cnd_itm_grp_lab1.addAliasName("Cnd.itm_grp_lab1", p);
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_lab2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab2;
		p.Cnd_itm_grp_lab2.addAliasName("Cnd.itm_grp_lab2", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_lab3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab3;
		p.Cnd_itm_grp_lab3.addAliasName("Cnd.itm_grp_lab3", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_lab4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab4;
		p.Cnd_itm_grp_lab4.addAliasName("Cnd.itm_grp_lab4", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_lab5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab5;
		p.Cnd_itm_grp_lab5.addAliasName("Cnd.itm_grp_lab5", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_lab6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab6;
		p.Cnd_itm_grp_lab6.addAliasName("Cnd.itm_grp_lab6", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_lab7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab7;
		p.Cnd_itm_grp_lab7.addAliasName("Cnd.itm_grp_lab7", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_lab8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab8;
		p.Cnd_itm_grp_lab8.addAliasName("Cnd.itm_grp_lab8", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_lab9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab9;
		p.Cnd_itm_grp_lab9.addAliasName("Cnd.itm_grp_lab9", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_lab10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab10;
		p.Cnd_itm_grp_lab10.addAliasName("Cnd.itm_grp_lab10", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_MlySPlnItmUpd p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Tab11]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab11(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Tab12]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab12(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_MlySPlnItmUpd p) {
		p.Hdr_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrk_no_p());
		p.Hdr_wrk_no_p_PPanel.setName("Hdr.wrk_no_p");
		p.Hdr_wrk_no = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 * [DtlDisp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlDisp(MSBBP_MlySPlnItmUpd p) {
		p.DtlDisp_qty01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty01_p);
		p.DtlDisp_qty01_p_PPanel.setName("DtlDisp.qty01_p");
		p.columnDtlDisp_qty01 = p.DtlDisp_qty01_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty01.addAliasName("DtlDisp.qty01", p);
		p.DtlDisp_qty02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty02_p);
		p.DtlDisp_qty02_p_PPanel.setName("DtlDisp.qty02_p");
		p.columnDtlDisp_qty02 = p.DtlDisp_qty02_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty02.addAliasName("DtlDisp.qty02", p);
		p.DtlDisp_qty03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty03_p);
		p.DtlDisp_qty03_p_PPanel.setName("DtlDisp.qty03_p");
		p.columnDtlDisp_qty03 = p.DtlDisp_qty03_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty03.addAliasName("DtlDisp.qty03", p);
		p.DtlDisp_qty04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty04_p);
		p.DtlDisp_qty04_p_PPanel.setName("DtlDisp.qty04_p");
		p.columnDtlDisp_qty04 = p.DtlDisp_qty04_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty04.addAliasName("DtlDisp.qty04", p);
		p.DtlDisp_qty05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty05_p);
		p.DtlDisp_qty05_p_PPanel.setName("DtlDisp.qty05_p");
		p.columnDtlDisp_qty05 = p.DtlDisp_qty05_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty05.addAliasName("DtlDisp.qty05", p);
		p.DtlDisp_qty06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty06_p);
		p.DtlDisp_qty06_p_PPanel.setName("DtlDisp.qty06_p");
		p.columnDtlDisp_qty06 = p.DtlDisp_qty06_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty06.addAliasName("DtlDisp.qty06", p);
		p.DtlDisp_qty07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty07_p);
		p.DtlDisp_qty07_p_PPanel.setName("DtlDisp.qty07_p");
		p.columnDtlDisp_qty07 = p.DtlDisp_qty07_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty07.addAliasName("DtlDisp.qty07", p);
		p.DtlDisp_qty08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty08_p);
		p.DtlDisp_qty08_p_PPanel.setName("DtlDisp.qty08_p");
		p.columnDtlDisp_qty08 = p.DtlDisp_qty08_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty08.addAliasName("DtlDisp.qty08", p);
		p.DtlDisp_qty09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty09_p);
		p.DtlDisp_qty09_p_PPanel.setName("DtlDisp.qty09_p");
		p.columnDtlDisp_qty09 = p.DtlDisp_qty09_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty09.addAliasName("DtlDisp.qty09", p);
		p.DtlDisp_qty10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty10_p);
		p.DtlDisp_qty10_p_PPanel.setName("DtlDisp.qty10_p");
		p.columnDtlDisp_qty10 = p.DtlDisp_qty10_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty10.addAliasName("DtlDisp.qty10", p);
		p.DtlDisp_qty11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty11_p);
		p.DtlDisp_qty11_p_PPanel.setName("DtlDisp.qty11_p");
		p.columnDtlDisp_qty11 = p.DtlDisp_qty11_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty11.addAliasName("DtlDisp.qty11", p);
		p.DtlDisp_qty12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty12_p);
		p.DtlDisp_qty12_p_PPanel.setName("DtlDisp.qty12_p");
		p.columnDtlDisp_qty12 = p.DtlDisp_qty12_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty12.addAliasName("DtlDisp.qty12", p);
		p.DtlDisp_qty13_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty13_p);
		p.DtlDisp_qty13_p_PPanel.setName("DtlDisp.qty13_p");
		p.columnDtlDisp_qty13 = p.DtlDisp_qty13_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty13.addAliasName("DtlDisp.qty13", p);
		p.DtlDisp_qty14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty14_p);
		p.DtlDisp_qty14_p_PPanel.setName("DtlDisp.qty14_p");
		p.columnDtlDisp_qty14 = p.DtlDisp_qty14_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty14.addAliasName("DtlDisp.qty14", p);
		p.DtlDisp_qty15_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty15_p);
		p.DtlDisp_qty15_p_PPanel.setName("DtlDisp.qty15_p");
		p.columnDtlDisp_qty15 = p.DtlDisp_qty15_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty15.addAliasName("DtlDisp.qty15", p);
		p.DtlDisp_qty16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty16_p);
		p.DtlDisp_qty16_p_PPanel.setName("DtlDisp.qty16_p");
		p.columnDtlDisp_qty16 = p.DtlDisp_qty16_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty16.addAliasName("DtlDisp.qty16", p);
		p.DtlDisp_qty17_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty17_p);
		p.DtlDisp_qty17_p_PPanel.setName("DtlDisp.qty17_p");
		p.columnDtlDisp_qty17 = p.DtlDisp_qty17_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty17.addAliasName("DtlDisp.qty17", p);
		p.DtlDisp_qty18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty18_p);
		p.DtlDisp_qty18_p_PPanel.setName("DtlDisp.qty18_p");
		p.columnDtlDisp_qty18 = p.DtlDisp_qty18_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty18.addAliasName("DtlDisp.qty18", p);
		p.DtlDisp_qty19_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty19_p);
		p.DtlDisp_qty19_p_PPanel.setName("DtlDisp.qty19_p");
		p.columnDtlDisp_qty19 = p.DtlDisp_qty19_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty19.addAliasName("DtlDisp.qty19", p);
		p.DtlDisp_qty20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty20_p);
		p.DtlDisp_qty20_p_PPanel.setName("DtlDisp.qty20_p");
		p.columnDtlDisp_qty20 = p.DtlDisp_qty20_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty20.addAliasName("DtlDisp.qty20", p);
		p.DtlDisp_qty21_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty21_p);
		p.DtlDisp_qty21_p_PPanel.setName("DtlDisp.qty21_p");
		p.columnDtlDisp_qty21 = p.DtlDisp_qty21_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty21.addAliasName("DtlDisp.qty21", p);
		p.DtlDisp_qty22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty22_p);
		p.DtlDisp_qty22_p_PPanel.setName("DtlDisp.qty22_p");
		p.columnDtlDisp_qty22 = p.DtlDisp_qty22_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty22.addAliasName("DtlDisp.qty22", p);
		p.DtlDisp_qty23_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty23_p);
		p.DtlDisp_qty23_p_PPanel.setName("DtlDisp.qty23_p");
		p.columnDtlDisp_qty23 = p.DtlDisp_qty23_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty23.addAliasName("DtlDisp.qty23", p);
		p.DtlDisp_qty24_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$qty24_p);
		p.DtlDisp_qty24_p_PPanel.setName("DtlDisp.qty24_p");
		p.columnDtlDisp_qty24 = p.DtlDisp_qty24_p_PPanel.columnQty_qty;
		p.columnDtlDisp_qty24.addAliasName("DtlDisp.qty24", p);
		p.DtlDisp_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP0120.DtlDispR.$itm_p);
		p.DtlDisp_itm_p_PPanel.setName("DtlDisp.itm_p");
		p.columnDtlDisp_itm_cd = p.DtlDisp_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlDisp_itm_cd.addAliasName("DtlDisp.itm_cd", p);
		p.columnDtlDisp_itm_sub1 = p.DtlDisp_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlDisp_itm_sub1.addAliasName("DtlDisp.itm_sub1", p);
		p.columnDtlDisp_itm_sub2 = p.DtlDisp_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlDisp_itm_sub2.addAliasName("DtlDisp.itm_sub2", p);
		p.columnDtlDisp_itm_sub3 = p.DtlDisp_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlDisp_itm_sub3.addAliasName("DtlDisp.itm_sub3", p);
		p.columnDtlDisp_itm_nm = p.DtlDisp_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlDisp_itm_nm.addAliasName("DtlDisp.itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_MlySPlnItmUpd p) {
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

	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
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
	
	
	/** [Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の定義 */
	private MCListPutter Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p = null;

	/**
	 * [Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter() {
		if (Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p == null) {
			Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p = createCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(Cnd_wrk_no_p_PPanel.WrkNo_wrk_no, "wrk_no", "wrk_nm");
		}
		return Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_p;
	}
	
	
	/** [Cnd_spln_vers_ListPutter]の定義 */
	private MCListPutter Cnd_spln_vers_p = null;

	/**
	 * [Cnd_spln_vers_ListPutter]の取得
	 */
	protected MCListPutter getCnd_spln_vers_ListPutter() {
		if (Cnd_spln_vers_p == null) {
			Cnd_spln_vers_p = createCnd_spln_vers_ListPutter(Cnd_spln_vers, "spln_vers");

		}
		return Cnd_spln_vers_p;
	}
	
	
	/** [Cnd_spln_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_spln_itm_cd_p = null;

	/**
	 * [Cnd_spln_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_spln_itm_cd_ListPutter() {
		if (Cnd_spln_itm_cd_p == null) {
			Cnd_spln_itm_cd_p = createCnd_spln_itm_cd_ListPutter(Cnd_spln_itm_cd, "spln_itm_cd", "spln_itm_nm");

		}
		return Cnd_spln_itm_cd_p;
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
	
	
	/** [DtlDisp_spln_itm_cd_ListPutter]の定義 */
	private MCListPutter DtlDisp_spln_itm_cd_p = null;

	/**
	 * [DtlDisp_spln_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlDisp_spln_itm_cd_ListPutter() {
		if (DtlDisp_spln_itm_cd_p == null) {
			DtlDisp_spln_itm_cd_p = createDtlDisp_spln_itm_cd_ListPutter(columnDtlDisp_spln_itm_cd, "spln_itm_cd");

		}
		return DtlDisp_spln_itm_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_MlySPlnItmUpd create(){
		MSBBP_MlySPlnItmUpd p = new MSBBP_MlySPlnItmUpd();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_MlySPlnItmUpd create(String name){
		MSBBP_MlySPlnItmUpd p = new MSBBP_MlySPlnItmUpd(name);
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
		MSBBP_MlySPlnItmUpd_MC.jbfInitScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitTop((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitFold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitTab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitTab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitCnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitCnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitCtrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitHdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitTab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitTab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitHdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitHdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitDtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbfInitBtn((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitTop((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitFold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitTab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitTab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitCnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitCnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitCtrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitHdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitTab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitTab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitHdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitHdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitDtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.jbInitBtn((MSBBP_MlySPlnItmUpd)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_MlySPlnItmUpd p) {
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
	protected static void jbfInitTab1(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_spln_ym_fr_Label = p.beansFactory.createLabel("Cnd.spln_ym_fr_Label");
		p.Cnd_spln_ym_fr = p.beansFactory.createDateField("Cnd.spln_ym_fr");
		p.Cnd_spln_ym_fr.setLabel(p.Cnd_spln_ym_fr_Label);
		p.Cnd_spln_ym_to_Label = p.beansFactory.createLabel("Cnd.spln_ym_to_Label");
		p.Cnd_spln_ym_to = p.beansFactory.createDateField("Cnd.spln_ym_to");
		p.Cnd_spln_ym_to.setLabel(p.Cnd_spln_ym_to_Label);
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_spln_vers_Label = p.beansFactory.createLabel("Cnd.spln_vers_Label");
		p.Cnd_spln_vers = p.beansFactory.createTextComboBox("Cnd.spln_vers");
		p.Cnd_spln_vers.setLabel(p.Cnd_spln_vers_Label);
		p.Cnd_fix_f_flg = p.beansFactory.createCheckBox("Cnd.fix_f_flg");
		p.Cnd_fix_t_flg = p.beansFactory.createCheckBox("Cnd.fix_t_flg");
		p.Cnd_spln_itm_cd_Label = p.beansFactory.createLabel("Cnd.spln_itm_cd_Label");
		p.Cnd_spln_itm_cd = p.beansFactory.createTextField("Cnd.spln_itm_cd");
		p.Cnd_spln_itm_cd.setLabel(p.Cnd_spln_itm_cd_Label);
		p.Cnd_spln_itm_nm = p.beansFactory.createTextField("Cnd.spln_itm_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab11]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab11(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab11Panel = p.beansFactory.createPanel("Tab11");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab12]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab12(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab12Panel = p.beansFactory.createPanel("Tab12");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_ym_Label = p.beansFactory.createLabel("Hdr.ym_Label");
		p.Hdr_ym = p.beansFactory.createDateField("Hdr.ym");
		p.Hdr_ym.setLabel(p.Hdr_ym_Label);
		p.Hdr_dpt_cd_Label = p.beansFactory.createLabel("Hdr.dpt_cd_Label");
		p.Hdr_dpt_cd = p.beansFactory.createTextField("Hdr.dpt_cd");
		p.Hdr_dpt_cd.setLabel(p.Hdr_dpt_cd_Label);
		p.Hdr_dpt_nm = p.beansFactory.createTextField("Hdr.dpt_nm");
		p.Hdr_cst_cd_Label = p.beansFactory.createLabel("Hdr.cst_cd_Label");
		p.Hdr_cst_cd = p.beansFactory.createTextField("Hdr.cst_cd");
		p.Hdr_cst_cd.setLabel(p.Hdr_cst_cd_Label);
		p.Hdr_cst_nm = p.beansFactory.createTextField("Hdr.cst_nm");
		p.Hdr_spln_vers_Label = p.beansFactory.createLabel("Hdr.spln_vers_Label");
		p.Hdr_spln_vers = p.beansFactory.createTextField("Hdr.spln_vers");
		p.Hdr_spln_vers.setLabel(p.Hdr_spln_vers_Label);
		p.Hdr_edited_flg = p.beansFactory.createCheckBox("Hdr.edited_flg");
		p.Hdr_adopted_flg = p.beansFactory.createCheckBox("Hdr.adopted_flg");
		p.Hdr_locked_flg = p.beansFactory.createCheckBox("Hdr.locked_flg");
		p.Hdr_usr_cd_Label = p.beansFactory.createLabel("Hdr.usr_cd_Label");
		p.Hdr_usr_cd = p.beansFactory.createTextField("Hdr.usr_cd");
		p.Hdr_usr_cd.setLabel(p.Hdr_usr_cd_Label);
		p.Hdr_usr_nm = p.beansFactory.createTextField("Hdr.usr_nm");
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlDisp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlDisp(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.DtlDispPanel = p.beansFactory.createPanel("DtlDisp");
		p.DtlDispScrollPane = p.beansFactory.createScrollPane("DtlDisp.scroll");
		p.createDtlDispTable();
		// ブロックの項目の初期化
		p.columnDtlDisp_check = p.beansFactory.createTableColumn("DtlDisp.check", MCColumnType.CHECK);
		p.columnDtlDisp_fix_flg = p.beansFactory.createTableColumn("DtlDisp.fix_flg", MCColumnType.CHECK);
		p.columnDtlDisp_disp_spln_itm = p.beansFactory.createTableColumn("DtlDisp.disp_spln_itm", MCColumnType.TEXT);
		p.columnDtlDisp_disp_itm = p.beansFactory.createTableColumn("DtlDisp.disp_itm", MCColumnType.TEXT);
		p.columnDtlDisp_row_title_col = p.beansFactory.createTableColumn("DtlDisp.row_title_col", MCColumnType.TEXT);
		p.columnDtlDisp_row_title_nm = p.beansFactory.createTableColumn("DtlDisp.row_title_nm", MCColumnType.TEXT);
		p.columnDtlDisp_disp_row_title_nm = p.beansFactory.createTableColumn("DtlDisp.disp_row_title_nm", MCColumnType.TEXT);
		p.columnDtlDisp_disp_unit_cd = p.beansFactory.createTableColumn("DtlDisp.disp_unit_cd", MCColumnType.TEXT);
		p.columnDtlDisp_disp_unit_nm = p.beansFactory.createTableColumn("DtlDisp.disp_unit_nm", MCColumnType.TEXT);
		p.columnDtlDisp_spln_set_typ_flg = p.beansFactory.createTableColumn("DtlDisp.spln_set_typ_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty01_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty01_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty02_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty02_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty03_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty03_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty04_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty04_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty05_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty05_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty06_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty06_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty07_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty07_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty08_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty08_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty09_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty09_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty10_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty10_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty11_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty11_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty12_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty12_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty13_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty13_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty14_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty14_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty15_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty15_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty16_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty16_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty17_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty17_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty18_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty18_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty19_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty19_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty20_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty20_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty21_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty21_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty22_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty22_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty23_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty23_flg", MCColumnType.CHECK);
		p.columnDtlDisp_editable_qty24_flg = p.beansFactory.createTableColumn("DtlDisp.editable_qty24_flg", MCColumnType.CHECK);
		p.columnDtlDisp_dec_place = p.beansFactory.createTableColumn("DtlDisp.dec_place", MCColumnType.NUMBER);
		p.columnDtlDisp_amt_dec_place = p.beansFactory.createTableColumn("DtlDisp.amt_dec_place", MCColumnType.NUMBER);
		p.columnDtlDisp_spln_itm_cd = p.beansFactory.createTableColumn("DtlDisp.spln_itm_cd", MCColumnType.TEXT);
		p.columnDtlDisp_spln_itm_nm = p.beansFactory.createTableColumn("DtlDisp.spln_itm_nm", MCColumnType.TEXT);
		p.columnDtlDisp_spln_set_typ = p.beansFactory.createTableColumn("DtlDisp.spln_set_typ", MCColumnType.TEXT);
		p.columnDtlDisp_cur_cd = p.beansFactory.createTableColumn("DtlDisp.cur_cd", MCColumnType.TEXT);
		p.columnDtlDisp_cur_nm = p.beansFactory.createTableColumn("DtlDisp.cur_nm", MCColumnType.TEXT);
		p.columnDtlDisp_unit_cd = p.beansFactory.createTableColumn("DtlDisp.unit_cd", MCColumnType.TEXT);
		p.columnDtlDisp_unit_nm = p.beansFactory.createTableColumn("DtlDisp.unit_nm", MCColumnType.TEXT);
		p.columnDtlDisp_disp_seq = p.beansFactory.createTableColumn("DtlDisp.disp_seq", MCColumnType.NUMBER);
		p.columnDtlDisp_old_fix_flg = p.beansFactory.createTableColumn("DtlDisp.old_fix_flg", MCColumnType.CHECK);
		p.columnDtlDisp_grp_peg_no = p.beansFactory.createTableColumn("DtlDisp.grp_peg_no", MCColumnType.NUMBER);
		p.columnDtlDisp_record_id = p.beansFactory.createTableColumn("DtlDisp.record_id", MCColumnType.NUMBER);
		p.columnDtlDisp_record_grp_id = p.beansFactory.createTableColumn("DtlDisp.record_grp_id", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP0110 = p.beansFactory.createButton("Btn.open_MSBBP0110", "open");
		p.Btn_sprt_calcAmtQty = p.beansFactory.createButton("Btn.sprt_calcAmtQty");
		p.Btn_sprt_reExpAmtQty = p.beansFactory.createButton("Btn.sprt_reExpAmtQty");
		p.Btn_label_select = p.beansFactory.createLabel("Btn.label_select");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_label_fix = p.beansFactory.createLabel("Btn.label_fix");
		p.Btn_fix_all = p.beansFactory.createButton("Btn.fix_all", "no_border");
		p.Btn_unfix_all = p.beansFactory.createButton("Btn.unfix_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_MlySPlnItmUpd p) {
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
	protected static void jbInitTop(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.HdrTabPanel);
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
	protected static void jbInitFold(MSBBP_MlySPlnItmUpd p) {
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
	protected static void jbInitTab1(MSBBP_MlySPlnItmUpd p) {
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
	protected static void jbInitTab2(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_MlySPlnItmUpd p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.CndPanel.setLastBeans(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_spln_ym_fr);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_spln_ym_fr_Label);
		p.CndPanel.add(p.Cnd_spln_ym_fr);
		p.Cnd_spln_ym_fr.setNextBeans(p.Cnd_spln_ym_to);
		p.Cnd_spln_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.spln_ym_fr_META);
		p.Cnd_spln_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_spln_ym_to_Label);
		p.CndPanel.add(p.Cnd_spln_ym_to);
		p.Cnd_spln_ym_to.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_spln_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.spln_ym_to_META);
		p.Cnd_spln_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.dpt_nm_META);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.cst_nm_META);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_spln_vers);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.Cnd_wrk_nm);
		p.Cnd_spln_vers.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_spln_vers_Label);
		p.CndPanel.add(p.Cnd_spln_vers);
		p.Cnd_spln_vers.setNextBeans(p.Cnd_fix_f_flg);
		p.Cnd_spln_vers.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.spln_vers_META);
		p.CndPanel.add(p.Cnd_fix_f_flg);
		p.Cnd_fix_f_flg.setNextBeans(p.Cnd_fix_t_flg);
		p.Cnd_fix_f_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.fix_f_flg_META);
		p.CndPanel.add(p.Cnd_fix_t_flg);
		p.Cnd_fix_t_flg.setNextBeans(p.Cnd_spln_itm_cd);
		p.Cnd_fix_t_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.fix_t_flg_META);
		p.CndPanel.add(p.Cnd_spln_itm_cd_Label);
		p.CndPanel.add(p.Cnd_spln_itm_cd);
		p.Cnd_spln_itm_cd.setNextBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.spln_itm_cd_META);
		p.Cnd_spln_itm_cd.addLinkBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_spln_itm_cd, true);
		p.CndPanel.add(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_spln_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.spln_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_spln_itm_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0120.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlDispPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.Tab11Panel, "HdrTab.tab11");
		p.HdrTabTab.setLastBeans(p.Tab11Panel);
		p.Tab11Panel.setNextBeans(p.Tab12Panel);
		p.HdrTabTab.add(p.Tab12Panel, "HdrTab.tab12");
	}

	/**
	 * [Tab11]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab11(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab11Panel.setNextBeans(p.Tab12Panel);
		p.Tab11Panel.setValueCheck(false);
		p.Tab11Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab11Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab11Panel.add(p.HdrPanel, null);
		p.Tab11Panel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Tab12]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab12(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Tab12Panel.setValueCheck(false);
		p.Tab12Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab12Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab12Panel.add(p.Hdr2Panel, null);
		p.Tab12Panel.setLastBeans(p.Hdr2Panel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_ym_Label);
		p.HdrPanel.add(p.Hdr_ym);
		p.HdrPanel.setLastBeans(p.Hdr_ym);
		p.Hdr_ym.setNextBeans(p.Hdr_dpt_cd);
		p.Hdr_ym.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.ym_META);
		p.Hdr_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_dpt_cd);
		p.Hdr_dpt_cd.setNextBeans(p.Hdr_dpt_nm);
		p.Hdr_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.dpt_cd_META);
		p.HdrPanel.add(p.Hdr_dpt_nm);
		p.Hdr_dpt_nm.setNextBeans(p.Hdr_cst_cd);
		p.Hdr_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.dpt_nm_META);
		p.HdrPanel.add(p.Hdr_cst_cd_Label);
		p.HdrPanel.add(p.Hdr_cst_cd);
		p.Hdr_cst_cd.setNextBeans(p.Hdr_cst_nm);
		p.Hdr_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.cst_cd_META);
		p.HdrPanel.add(p.Hdr_cst_nm);
		p.Hdr_cst_nm.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_cst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.cst_nm_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_spln_vers);
		p.HdrPanel.add(p.Hdr_spln_vers_Label);
		p.HdrPanel.add(p.Hdr_spln_vers);
		p.Hdr_spln_vers.setNextBeans(p.Hdr_edited_flg);
		p.Hdr_spln_vers.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.spln_vers_META);
		p.HdrPanel.add(p.Hdr_edited_flg);
		p.Hdr_edited_flg.setNextBeans(p.Hdr_adopted_flg);
		p.Hdr_edited_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.edited_flg_META);
		p.HdrPanel.add(p.Hdr_adopted_flg);
		p.Hdr_adopted_flg.setNextBeans(p.Hdr_locked_flg);
		p.Hdr_adopted_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.adopted_flg_META);
		p.HdrPanel.add(p.Hdr_locked_flg);
		p.Hdr_locked_flg.setNextBeans(p.Hdr_usr_cd);
		p.Hdr_locked_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.locked_flg_META);
		p.HdrPanel.add(p.Hdr_usr_cd_Label);
		p.HdrPanel.add(p.Hdr_usr_cd);
		p.Hdr_usr_cd.setNextBeans(p.Hdr_usr_nm);
		p.Hdr_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.usr_cd_META);
		p.HdrPanel.add(p.Hdr_usr_nm);
		p.Hdr_usr_nm.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.usr_nm_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP0120.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlDisp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlDisp(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.add(p.DtlDispPanel);
		p.DtlDispPanel.setNextBeans(p.BtnPanel);
		p.DtlDispPanel.add(p.DtlDispScrollPane);
		p.DtlDispPanel.setLastBeans(p.DtlDispTable);
		p.DtlDispScrollPane.setViewportView(p.DtlDispTable);
		p.DtlDispTable.setList(p.getDtlDispL());
		p.DtlDispTable.setStatusColumnVisible(false);
		p.DtlDispPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_MlySPlnItmUpd p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP0110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP0110);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP0110);
		p.Btn_open_MSBBP0110.setNextBeans(p.Btn_sprt_calcAmtQty);
		p.Btn_sprt_calcAmtQty.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_sprt_calcAmtQty);
		p.Btn_sprt_calcAmtQty.setNextBeans(p.Btn_sprt_reExpAmtQty);
		p.Btn_sprt_reExpAmtQty.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_sprt_reExpAmtQty);
		p.Btn_sprt_reExpAmtQty.setNextBeans(p.Btn_select_all);
		p.BtnPanel.add(p.Btn_label_select);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_fix_all);
		p.BtnPanel.add(p.Btn_label_fix);
		p.Btn_fix_all.setIcon("SELECT_ALL");
		p.Btn_fix_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_fix_all);
		p.Btn_fix_all.setNextBeans(p.Btn_unfix_all);
		p.Btn_unfix_all.setIcon("DESELECT_ALL");
		p.Btn_unfix_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_unfix_all);
		p.Btn_unfix_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MSBBP_MlySPlnItmUpd_MC.mcInitScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitTop((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitFold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitTab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitTab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitCnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitCnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitCtrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitHdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitTab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitTab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitHdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitHdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitDtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.mcInitBtn((MSBBP_MlySPlnItmUpd)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_ScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Top((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Fold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Tab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Tab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Cnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Cnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Ctrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_HdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Tab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Tab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Hdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Hdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_DtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Btn((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_Dtl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH__UPD_SprtAmtQtyCalDtl((MSBBP_MlySPlnItmUpd)this);

		// [UPD]ステータスのモードの設定
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_ScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Top((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Fold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Tab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Tab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Cnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Cnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Ctrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_HdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Tab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Tab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Hdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Hdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_DtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Btn((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_Dtl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitUPD_SprtAmtQtyCalDtl((MSBBP_MlySPlnItmUpd)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_ScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Top((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Fold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Tab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Tab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Cnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Cnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Ctrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_HdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Tab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Tab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Hdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Hdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_DtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Btn((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_Dtl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitFIX__U_SprtAmtQtyCalDtl((MSBBP_MlySPlnItmUpd)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_ScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Top((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Fold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Tab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Tab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Cnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Cnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Ctrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_HdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Tab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Tab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Hdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Hdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_DtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Btn((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_Dtl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitSRCH_SprtAmtQtyCalDtl((MSBBP_MlySPlnItmUpd)this);

		// [REF]ステータスのモードの設定
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_ScreenOpe((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Top((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Fold((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Tab1((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Tab2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Cnd((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Cnd2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Ctrl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_HdrTab((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Tab11((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Tab12((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Hdr((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Hdr2((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_DtlDisp((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Btn((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_Dtl((MSBBP_MlySPlnItmUpd)this);
		MSBBP_MlySPlnItmUpd_MC.statusInitREF_SprtAmtQtyCalDtl((MSBBP_MlySPlnItmUpd)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_MlySPlnItmUpd p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_MlySPlnItmUpd p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_spln_ym_fr.setListListener(p);
		p.Cnd_spln_ym_fr.addAllListener(p);
		p.Cnd_spln_ym_to.setListListener(p);
		p.Cnd_spln_ym_to.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_spln_vers.setListListener(p);
		p.Cnd_spln_vers.addAllListener(p);
		p.Cnd_fix_f_flg.addAllListener(p);
		p.Cnd_fix_t_flg.addAllListener(p);
		p.Cnd_spln_itm_cd.setListListener(p);
		p.Cnd_spln_itm_cd.addAllListener(p);
		p.Cnd_spln_itm_nm.setListListener(p);
		p.Cnd_spln_itm_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_MlySPlnItmUpd p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBBP_MlySPlnItmUpd p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Tab11]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab11(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Tab12]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab12(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_MlySPlnItmUpd p) {
		p.Hdr_ym.setListListener(p);
		p.Hdr_ym.addAllListener(p);
		p.Hdr_dpt_cd.setListListener(p);
		p.Hdr_dpt_cd.addAllListener(p);
		p.Hdr_dpt_nm.setListListener(p);
		p.Hdr_dpt_nm.addAllListener(p);
		p.Hdr_cst_cd.setListListener(p);
		p.Hdr_cst_cd.addAllListener(p);
		p.Hdr_cst_nm.setListListener(p);
		p.Hdr_cst_nm.addAllListener(p);
		p.Hdr_spln_vers.setListListener(p);
		p.Hdr_spln_vers.addAllListener(p);
		p.Hdr_edited_flg.addAllListener(p);
		p.Hdr_adopted_flg.addAllListener(p);
		p.Hdr_locked_flg.addAllListener(p);
		p.Hdr_usr_cd.setListListener(p);
		p.Hdr_usr_cd.addAllListener(p);
		p.Hdr_usr_nm.setListListener(p);
		p.Hdr_usr_nm.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBBP_MlySPlnItmUpd p) {
	}

	/**
	 *  [DtlDisp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlDisp(MSBBP_MlySPlnItmUpd p) {
		p.DtlDispTable.addAllListener(p);
		p.columnDtlDisp_check.addAllListener(p);
		p.columnDtlDisp_fix_flg.addAllListener(p);
		p.columnDtlDisp_disp_spln_itm.addAllListener(p);
		p.columnDtlDisp_disp_spln_itm.setListListener(p);
		p.columnDtlDisp_disp_itm.addAllListener(p);
		p.columnDtlDisp_disp_itm.setListListener(p);
		p.columnDtlDisp_row_title_col.addAllListener(p);
		p.columnDtlDisp_row_title_col.setListListener(p);
		p.columnDtlDisp_row_title_nm.addAllListener(p);
		p.columnDtlDisp_row_title_nm.setListListener(p);
		p.columnDtlDisp_disp_row_title_nm.addAllListener(p);
		p.columnDtlDisp_disp_row_title_nm.setListListener(p);
		p.columnDtlDisp_disp_unit_cd.addAllListener(p);
		p.columnDtlDisp_disp_unit_cd.setListListener(p);
		p.columnDtlDisp_disp_unit_nm.addAllListener(p);
		p.columnDtlDisp_disp_unit_nm.setListListener(p);
		p.columnDtlDisp_spln_set_typ_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty01_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty02_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty03_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty04_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty05_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty06_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty07_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty08_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty09_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty10_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty11_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty12_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty13_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty14_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty15_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty16_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty17_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty18_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty19_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty20_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty21_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty22_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty23_flg.addAllListener(p);
		p.columnDtlDisp_editable_qty24_flg.addAllListener(p);
		p.columnDtlDisp_dec_place.addAllListener(p);
		p.columnDtlDisp_dec_place.setListListener(p);
		p.columnDtlDisp_amt_dec_place.addAllListener(p);
		p.columnDtlDisp_amt_dec_place.setListListener(p);
		p.columnDtlDisp_spln_itm_cd.addAllListener(p);
		p.columnDtlDisp_spln_itm_cd.setListListener(p);
		p.columnDtlDisp_spln_itm_nm.addAllListener(p);
		p.columnDtlDisp_spln_itm_nm.setListListener(p);
		p.columnDtlDisp_spln_set_typ.addAllListener(p);
		p.columnDtlDisp_spln_set_typ.setListListener(p);
		p.columnDtlDisp_cur_cd.addAllListener(p);
		p.columnDtlDisp_cur_cd.setListListener(p);
		p.columnDtlDisp_cur_nm.addAllListener(p);
		p.columnDtlDisp_cur_nm.setListListener(p);
		p.columnDtlDisp_unit_cd.addAllListener(p);
		p.columnDtlDisp_unit_cd.setListListener(p);
		p.columnDtlDisp_unit_nm.addAllListener(p);
		p.columnDtlDisp_unit_nm.setListListener(p);
		p.columnDtlDisp_disp_seq.addAllListener(p);
		p.columnDtlDisp_disp_seq.setListListener(p);
		p.columnDtlDisp_old_fix_flg.addAllListener(p);
		p.columnDtlDisp_grp_peg_no.addAllListener(p);
		p.columnDtlDisp_grp_peg_no.setListListener(p);
		p.columnDtlDisp_record_id.addAllListener(p);
		p.columnDtlDisp_record_id.setListListener(p);
		p.columnDtlDisp_record_grp_id.addAllListener(p);
		p.columnDtlDisp_record_grp_id.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_MlySPlnItmUpd p) {
		p.Btn_open_MSBBP0110.addAllListener(p);
		p.Btn_open_MSBBP0110.setAPMethodName("doBtn_open_MSBBP0110");
		p.Btn_sprt_calcAmtQty.addAllListener(p);
		p.Btn_sprt_calcAmtQty.setAPMethodName("doBtn_sprt_calcAmtQty");
		p.Btn_sprt_reExpAmtQty.addAllListener(p);
		p.Btn_sprt_reExpAmtQty.setAPMethodName("doBtn_sprt_reExpAmtQty");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_fix_all.addAllListener(p);
		p.Btn_fix_all.setAPMethodName("doBtn_fix_all");
		p.Btn_unfix_all.addAllListener(p);
		p.Btn_unfix_all.setAPMethodName("doBtn_unfix_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBBP_MlySPlnItmUpd p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_spln_ym_fr.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_spln_ym_to.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_FREE);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_spln_vers.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_spln_itm_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_HdrTab(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab11]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab11(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab12]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab12(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Hdr(MSBBP_MlySPlnItmUpd p){
		p.Hdr_ym.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_spln_vers.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_edited_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_adopted_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_locked_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Hdr2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DtlDisp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DtlDisp(MSBBP_MlySPlnItmUpd p){
		p.columnDtlDisp_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_fix_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_spln_itm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_itm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_row_title_col.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_row_title_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_row_title_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_spln_set_typ_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.DtlDisp_qty01_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty02_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty03_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty04_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty05_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty06_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty07_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty08_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty09_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty10_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty11_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty12_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty13_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty14_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty15_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty16_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty17_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty18_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty19_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty20_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty21_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty22_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty23_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty24_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlDisp_editable_qty01_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty02_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty03_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty04_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty05_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty06_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty07_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty08_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty09_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty10_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty11_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty12_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty13_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty14_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty15_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty16_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty17_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty18_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty19_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty20_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty21_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty22_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty23_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty24_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.DtlDisp_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtlDisp_spln_set_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_seq.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_old_fix_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_grp_peg_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_record_id.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_record_grp_id.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBBP_MlySPlnItmUpd p){
		p.Btn_open_MSBBP0110.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_sprt_calcAmtQty.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_sprt_reExpAmtQty.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SprtAmtQtyCalDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SprtAmtQtyCalDtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_MlySPlnItmUpd p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_spln_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_spln_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_FREE);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_spln_vers.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_spln_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Tab11]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab11(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Tab12]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab12(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBBP_MlySPlnItmUpd p){
		p.Hdr_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_spln_vers.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_edited_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_adopted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_locked_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[DtlDisp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlDisp(MSBBP_MlySPlnItmUpd p){
		p.columnDtlDisp_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlDisp_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlDisp_disp_spln_itm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_itm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_row_title_col.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_row_title_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_row_title_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDisp_spln_set_typ_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlDisp_qty01_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty02_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty03_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty04_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty05_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty06_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty07_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty08_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty09_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty10_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty11_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty12_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty13_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty14_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty15_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty16_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty17_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty18_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty19_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty20_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty21_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty22_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty23_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DtlDisp_qty24_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlDisp_editable_qty01_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty02_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty03_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty04_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty05_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty06_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty07_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty08_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty09_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty10_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty11_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty12_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty13_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty14_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty15_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty16_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty17_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty18_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty19_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty20_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty21_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty22_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty23_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty24_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlDisp_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtlDisp_spln_set_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_old_fix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_grp_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_record_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDisp_record_grp_id.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_MlySPlnItmUpd p){
		p.Btn_open_MSBBP0110.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_sprt_calcAmtQty.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_sprt_reExpAmtQty.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_fix_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_unfix_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [UPD]ステータスの[SprtAmtQtyCalDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SprtAmtQtyCalDtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_MlySPlnItmUpd p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_spln_ym_fr.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_spln_ym_to.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_FREE);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_spln_vers.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_spln_itm_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Tab11]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab11(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Tab12]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab12(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBBP_MlySPlnItmUpd p){
		p.Hdr_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_spln_vers.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edited_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_adopted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_locked_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[DtlDisp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlDisp(MSBBP_MlySPlnItmUpd p){
		p.columnDtlDisp_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_spln_itm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_itm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_row_title_col.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_row_title_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_row_title_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlDisp_spln_set_typ_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlDisp_qty01_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty02_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty03_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty04_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty05_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty06_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty07_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty08_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty09_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty10_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty11_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty12_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty13_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty14_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty15_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty16_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty17_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty18_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty19_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty20_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty21_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty22_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty23_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty24_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlDisp_editable_qty01_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty02_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty03_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty04_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty05_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty06_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty07_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty08_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty09_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty10_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty11_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty12_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty13_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty14_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty15_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty16_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty17_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty18_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty19_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty20_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty21_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty22_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty23_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty24_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlDisp_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtlDisp_spln_set_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_old_fix_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_grp_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_record_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlDisp_record_grp_id.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_MlySPlnItmUpd p){
		p.Btn_open_MSBBP0110.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_sprt_calcAmtQty.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_reExpAmtQty.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [FIX_U]ステータスの[SprtAmtQtyCalDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SprtAmtQtyCalDtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_MlySPlnItmUpd p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_spln_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_spln_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_FREE);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_spln_vers.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_spln_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Tab11]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab11(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Tab12]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab12(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBBP_MlySPlnItmUpd p){
		p.Hdr_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_spln_vers.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edited_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adopted_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_locked_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[DtlDisp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlDisp(MSBBP_MlySPlnItmUpd p){
		p.columnDtlDisp_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_spln_itm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_itm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_row_title_col.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_row_title_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_row_title_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlDisp_spln_set_typ_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlDisp_qty01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty12_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty13_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty14_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty15_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty16_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty17_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty18_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty19_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty20_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty21_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty22_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty23_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty24_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlDisp_editable_qty01_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty02_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty03_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty04_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty05_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty06_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty07_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty08_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty09_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty10_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty11_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty12_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty13_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty14_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty15_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty16_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty17_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty18_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty19_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty20_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty21_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty22_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty23_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty24_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlDisp_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtlDisp_spln_set_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_old_fix_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_grp_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_record_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlDisp_record_grp_id.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_MlySPlnItmUpd p){
		p.Btn_open_MSBBP0110.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_calcAmtQty.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_reExpAmtQty.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [SRCH]ステータスの[SprtAmtQtyCalDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SprtAmtQtyCalDtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_MlySPlnItmUpd p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_spln_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_spln_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_FREE);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_spln_vers.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_spln_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Tab11]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab11(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Tab12]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab12(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBBP_MlySPlnItmUpd p){
		p.Hdr_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_spln_vers.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edited_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_adopted_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_locked_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[DtlDisp]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlDisp(MSBBP_MlySPlnItmUpd p){
		p.columnDtlDisp_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_spln_itm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_itm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_row_title_col.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_row_title_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_row_title_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_disp_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDisp_spln_set_typ_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlDisp_qty01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty13_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty15_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty17_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty19_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty21_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty23_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlDisp_qty24_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlDisp_editable_qty01_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty02_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty03_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty04_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty05_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty06_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty07_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty08_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty09_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty10_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty11_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty12_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty13_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty14_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty15_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty16_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty17_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty18_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty19_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty20_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty21_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty22_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty23_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_editable_qty24_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_spln_itm_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlDisp_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtlDisp_spln_set_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_cur_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_unit_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_disp_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_old_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_grp_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_record_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDisp_record_grp_id.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_MlySPlnItmUpd p){
		p.Btn_open_MSBBP0110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt_calcAmtQty.putMode(p, REF, MCMode.DISABLE);
		p.Btn_sprt_reExpAmtQty.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_fix_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_unfix_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * [REF]ステータスの[SprtAmtQtyCalDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_SprtAmtQtyCalDtl(MSBBP_MlySPlnItmUpd p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_MlySPlnItmUpd_MC.setTableConfigDtlDisp((MSBBP_MlySPlnItmUpd)this);
	}

	/**
	 * [DtlDisp]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlDisp(MSBBP_MlySPlnItmUpd p) {
		p.columnDtlDisp_check.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.check_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_check);
		p.columnDtlDisp_fix_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.fix_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_fix_flg);
		p.columnDtlDisp_disp_spln_itm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.disp_spln_itm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_disp_spln_itm);
		p.columnDtlDisp_disp_itm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.disp_itm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_disp_itm);
		p.columnDtlDisp_row_title_col.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.row_title_col_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_row_title_col);
		p.columnDtlDisp_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.row_title_nm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_row_title_nm);
		p.columnDtlDisp_disp_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.disp_row_title_nm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_disp_row_title_nm);
		p.columnDtlDisp_disp_unit_cd.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.disp_unit_cd_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_disp_unit_cd);
		p.columnDtlDisp_disp_unit_nm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.disp_unit_nm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_disp_unit_nm);
		p.columnDtlDisp_spln_set_typ_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.spln_set_typ_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_spln_set_typ_flg);
		p.DtlDispTable.addTable(p.DtlDisp_qty01_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty02_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty03_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty04_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty05_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty06_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty07_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty08_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty09_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty10_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty11_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty12_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty13_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty14_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty15_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty16_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty17_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty18_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty19_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty20_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty21_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty22_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty23_p_PPanel.QtyTable);
		p.DtlDispTable.addTable(p.DtlDisp_qty24_p_PPanel.QtyTable);
		p.columnDtlDisp_editable_qty01_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty01_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty01_flg);
		p.columnDtlDisp_editable_qty02_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty02_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty02_flg);
		p.columnDtlDisp_editable_qty03_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty03_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty03_flg);
		p.columnDtlDisp_editable_qty04_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty04_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty04_flg);
		p.columnDtlDisp_editable_qty05_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty05_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty05_flg);
		p.columnDtlDisp_editable_qty06_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty06_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty06_flg);
		p.columnDtlDisp_editable_qty07_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty07_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty07_flg);
		p.columnDtlDisp_editable_qty08_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty08_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty08_flg);
		p.columnDtlDisp_editable_qty09_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty09_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty09_flg);
		p.columnDtlDisp_editable_qty10_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty10_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty10_flg);
		p.columnDtlDisp_editable_qty11_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty11_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty11_flg);
		p.columnDtlDisp_editable_qty12_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty12_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty12_flg);
		p.columnDtlDisp_editable_qty13_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty13_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty13_flg);
		p.columnDtlDisp_editable_qty14_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty14_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty14_flg);
		p.columnDtlDisp_editable_qty15_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty15_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty15_flg);
		p.columnDtlDisp_editable_qty16_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty16_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty16_flg);
		p.columnDtlDisp_editable_qty17_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty17_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty17_flg);
		p.columnDtlDisp_editable_qty18_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty18_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty18_flg);
		p.columnDtlDisp_editable_qty19_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty19_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty19_flg);
		p.columnDtlDisp_editable_qty20_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty20_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty20_flg);
		p.columnDtlDisp_editable_qty21_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty21_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty21_flg);
		p.columnDtlDisp_editable_qty22_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty22_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty22_flg);
		p.columnDtlDisp_editable_qty23_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty23_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty23_flg);
		p.columnDtlDisp_editable_qty24_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.editable_qty24_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_editable_qty24_flg);
		p.columnDtlDisp_dec_place.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.dec_place_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_dec_place);
		p.columnDtlDisp_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.amt_dec_place_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_amt_dec_place);
		p.columnDtlDisp_spln_itm_cd.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.spln_itm_cd_META);
		p.columnDtlDisp_spln_itm_cd.setListType(MCListType.STRICT);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_spln_itm_cd);
		p.columnDtlDisp_spln_itm_nm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.spln_itm_nm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_spln_itm_nm);
		p.DtlDispTable.addTable(p.DtlDisp_itm_p_PPanel.ItmTable);
		p.columnDtlDisp_spln_set_typ.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.spln_set_typ_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_spln_set_typ);
		p.columnDtlDisp_cur_cd.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.cur_cd_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_cur_cd);
		p.columnDtlDisp_cur_nm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.cur_nm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_cur_nm);
		p.columnDtlDisp_unit_cd.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.unit_cd_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_unit_cd);
		p.columnDtlDisp_unit_nm.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.unit_nm_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_unit_nm);
		p.columnDtlDisp_disp_seq.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.disp_seq_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_disp_seq);
		p.columnDtlDisp_old_fix_flg.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.old_fix_flg_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_old_fix_flg);
		p.columnDtlDisp_grp_peg_no.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.grp_peg_no_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_grp_peg_no);
		p.columnDtlDisp_record_id.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.record_id_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_record_id);
		p.columnDtlDisp_record_grp_id.setMeta(mcframe.clientMSBB.MSBBP0120.DtlDispR.record_grp_id_META);
		p.DtlDispTable.addColumnConfig(p.columnDtlDisp_record_grp_id);
		// スクロール固定カラムの指定
		p.DtlDispTable.setUnscrollColumn(p.columnDtlDisp_fix_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter());
		Cnd_spln_vers.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_spln_vers.getListConfig().setPutter(getCnd_spln_vers_ListPutter());
		Cnd_spln_itm_cd.getListConfig().setPutter(getCnd_spln_itm_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		columnDtlDisp_spln_itm_cd.getListConfig().setPutter(getDtlDisp_spln_itm_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
		setAllStatus(status);
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
		if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.WrkNo");
		return lp;
	}

	/**
	 * [Cnd_spln_vers_ListPutter]の作成
	 */
	protected MCListPutter createCnd_spln_vers_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SplnVers");
		return lp;
	}
	 
	/**
	 * [Cnd_spln_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_spln_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SplnItm");
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
	 * [DtlDisp_spln_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlDisp_spln_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_wrk_no_p_PPanel.WrkNo_wrk_no) return getCnd_wrk_no_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == Cnd_spln_vers) return getCnd_spln_vers(row, info);
		if(combo == Cnd_spln_itm_cd) return getCnd_spln_itm_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == columnDtlDisp_spln_itm_cd) return getDtlDisp_spln_itm_cd(row, info);
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
		else if (ap == Btn_sprt_calcAmtQty) doBtn_sprt_calcAmtQty(info);
		else if (ap == Btn_sprt_reExpAmtQty) doBtn_sprt_reExpAmtQty(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_fix_all) doBtn_fix_all(info);
		else if (ap == Btn_unfix_all) doBtn_unfix_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
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
	 * [Btn]パネルの[sprt_calcAmtQty]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_calcAmtQty(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_reExpAmtQty]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_reExpAmtQty(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[fix_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_fix_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[unfix_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_unfix_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == DtlDispTable) return doDtlDisp_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_spln_ym_fr) return doCnd_spln_ym_fr_VC(info);
		if (vc == Cnd_spln_ym_to) return doCnd_spln_ym_to_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_spln_vers) return doCnd_spln_vers_VC(info);
		if (vc == Cnd_fix_f_flg) return doCnd_fix_f_flg_VC(info);
		if (vc == Cnd_fix_t_flg) return doCnd_fix_t_flg_VC(info);
		if (vc == Cnd_spln_itm_cd) return doCnd_spln_itm_cd_VC(info);
		if (vc == Cnd_spln_itm_nm) return doCnd_spln_itm_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Hdr_ym) return doHdr_ym_VC(info);
		if (vc == Hdr_dpt_cd) return doHdr_dpt_cd_VC(info);
		if (vc == Hdr_dpt_nm) return doHdr_dpt_nm_VC(info);
		if (vc == Hdr_cst_cd) return doHdr_cst_cd_VC(info);
		if (vc == Hdr_cst_nm) return doHdr_cst_nm_VC(info);
		if (vc == Hdr_spln_vers) return doHdr_spln_vers_VC(info);
		if (vc == Hdr_edited_flg) return doHdr_edited_flg_VC(info);
		if (vc == Hdr_adopted_flg) return doHdr_adopted_flg_VC(info);
		if (vc == Hdr_locked_flg) return doHdr_locked_flg_VC(info);
		if (vc == Hdr_usr_cd) return doHdr_usr_cd_VC(info);
		if (vc == Hdr_usr_nm) return doHdr_usr_nm_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == columnDtlDisp_check) return doDtlDisp_check_VC(info);
		if (vc == columnDtlDisp_fix_flg) return doDtlDisp_fix_flg_VC(info);
		if (vc == columnDtlDisp_disp_spln_itm) return doDtlDisp_disp_spln_itm_VC(info);
		if (vc == columnDtlDisp_disp_itm) return doDtlDisp_disp_itm_VC(info);
		if (vc == columnDtlDisp_row_title_col) return doDtlDisp_row_title_col_VC(info);
		if (vc == columnDtlDisp_row_title_nm) return doDtlDisp_row_title_nm_VC(info);
		if (vc == columnDtlDisp_disp_row_title_nm) return doDtlDisp_disp_row_title_nm_VC(info);
		if (vc == columnDtlDisp_disp_unit_cd) return doDtlDisp_disp_unit_cd_VC(info);
		if (vc == columnDtlDisp_disp_unit_nm) return doDtlDisp_disp_unit_nm_VC(info);
		if (vc == columnDtlDisp_spln_set_typ_flg) return doDtlDisp_spln_set_typ_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty01_flg) return doDtlDisp_editable_qty01_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty02_flg) return doDtlDisp_editable_qty02_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty03_flg) return doDtlDisp_editable_qty03_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty04_flg) return doDtlDisp_editable_qty04_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty05_flg) return doDtlDisp_editable_qty05_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty06_flg) return doDtlDisp_editable_qty06_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty07_flg) return doDtlDisp_editable_qty07_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty08_flg) return doDtlDisp_editable_qty08_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty09_flg) return doDtlDisp_editable_qty09_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty10_flg) return doDtlDisp_editable_qty10_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty11_flg) return doDtlDisp_editable_qty11_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty12_flg) return doDtlDisp_editable_qty12_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty13_flg) return doDtlDisp_editable_qty13_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty14_flg) return doDtlDisp_editable_qty14_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty15_flg) return doDtlDisp_editable_qty15_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty16_flg) return doDtlDisp_editable_qty16_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty17_flg) return doDtlDisp_editable_qty17_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty18_flg) return doDtlDisp_editable_qty18_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty19_flg) return doDtlDisp_editable_qty19_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty20_flg) return doDtlDisp_editable_qty20_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty21_flg) return doDtlDisp_editable_qty21_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty22_flg) return doDtlDisp_editable_qty22_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty23_flg) return doDtlDisp_editable_qty23_flg_VC(info);
		if (vc == columnDtlDisp_editable_qty24_flg) return doDtlDisp_editable_qty24_flg_VC(info);
		if (vc == columnDtlDisp_dec_place) return doDtlDisp_dec_place_VC(info);
		if (vc == columnDtlDisp_amt_dec_place) return doDtlDisp_amt_dec_place_VC(info);
		if (vc == columnDtlDisp_spln_itm_cd) return doDtlDisp_spln_itm_cd_VC(info);
		if (vc == columnDtlDisp_spln_itm_nm) return doDtlDisp_spln_itm_nm_VC(info);
		if (vc == columnDtlDisp_spln_set_typ) return doDtlDisp_spln_set_typ_VC(info);
		if (vc == columnDtlDisp_cur_cd) return doDtlDisp_cur_cd_VC(info);
		if (vc == columnDtlDisp_cur_nm) return doDtlDisp_cur_nm_VC(info);
		if (vc == columnDtlDisp_unit_cd) return doDtlDisp_unit_cd_VC(info);
		if (vc == columnDtlDisp_unit_nm) return doDtlDisp_unit_nm_VC(info);
		if (vc == columnDtlDisp_disp_seq) return doDtlDisp_disp_seq_VC(info);
		if (vc == columnDtlDisp_old_fix_flg) return doDtlDisp_old_fix_flg_VC(info);
		if (vc == columnDtlDisp_grp_peg_no) return doDtlDisp_grp_peg_no_VC(info);
		if (vc == columnDtlDisp_record_id) return doDtlDisp_record_id_VC(info);
		if (vc == columnDtlDisp_record_grp_id) return doDtlDisp_record_grp_id_VC(info);
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
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spln_itm_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edited_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edited_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adopted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adopted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[locked_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_locked_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[disp_spln_itm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_disp_spln_itm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[disp_itm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_disp_itm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[row_title_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_row_title_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[disp_row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_disp_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_disp_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_disp_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_spln_set_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty01_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty01_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty02_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty02_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty03_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty03_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty04_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty04_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty05_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty05_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty06_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty06_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty07_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty07_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty08_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty08_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty09_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty09_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty10_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty10_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty11_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty11_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty12_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty12_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty13_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty13_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty14_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty14_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty15_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty15_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty16_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty16_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty17_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty17_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty18_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty18_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty19_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty19_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty20_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty20_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty21_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty21_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty22_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty22_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty23_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty23_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[editable_qty24_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_editable_qty24_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_spln_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_spln_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[old_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_old_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[grp_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_grp_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[record_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_record_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDisp]パネルの[record_grp_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDisp_record_grp_id_VC(MCEventInfo info){
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
		else if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlDispTable) doDtlDisp_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_spln_ym_fr) doCnd_spln_ym_fr_NC(info);
		else if (nc == Cnd_spln_ym_to) doCnd_spln_ym_to_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_spln_vers) doCnd_spln_vers_NC(info);
		else if (nc == Cnd_fix_f_flg) doCnd_fix_f_flg_NC(info);
		else if (nc == Cnd_fix_t_flg) doCnd_fix_t_flg_NC(info);
		else if (nc == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NC(info);
		else if (nc == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Hdr_ym) doHdr_ym_NC(info);
		else if (nc == Hdr_dpt_cd) doHdr_dpt_cd_NC(info);
		else if (nc == Hdr_dpt_nm) doHdr_dpt_nm_NC(info);
		else if (nc == Hdr_cst_cd) doHdr_cst_cd_NC(info);
		else if (nc == Hdr_cst_nm) doHdr_cst_nm_NC(info);
		else if (nc == Hdr_spln_vers) doHdr_spln_vers_NC(info);
		else if (nc == Hdr_edited_flg) doHdr_edited_flg_NC(info);
		else if (nc == Hdr_adopted_flg) doHdr_adopted_flg_NC(info);
		else if (nc == Hdr_locked_flg) doHdr_locked_flg_NC(info);
		else if (nc == Hdr_usr_cd) doHdr_usr_cd_NC(info);
		else if (nc == Hdr_usr_nm) doHdr_usr_nm_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == columnDtlDisp_check) doDtlDisp_check_NC(info);
		else if (nc == columnDtlDisp_fix_flg) doDtlDisp_fix_flg_NC(info);
		else if (nc == columnDtlDisp_disp_spln_itm) doDtlDisp_disp_spln_itm_NC(info);
		else if (nc == columnDtlDisp_disp_itm) doDtlDisp_disp_itm_NC(info);
		else if (nc == columnDtlDisp_row_title_col) doDtlDisp_row_title_col_NC(info);
		else if (nc == columnDtlDisp_row_title_nm) doDtlDisp_row_title_nm_NC(info);
		else if (nc == columnDtlDisp_disp_row_title_nm) doDtlDisp_disp_row_title_nm_NC(info);
		else if (nc == columnDtlDisp_disp_unit_cd) doDtlDisp_disp_unit_cd_NC(info);
		else if (nc == columnDtlDisp_disp_unit_nm) doDtlDisp_disp_unit_nm_NC(info);
		else if (nc == columnDtlDisp_spln_set_typ_flg) doDtlDisp_spln_set_typ_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty01_flg) doDtlDisp_editable_qty01_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty02_flg) doDtlDisp_editable_qty02_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty03_flg) doDtlDisp_editable_qty03_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty04_flg) doDtlDisp_editable_qty04_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty05_flg) doDtlDisp_editable_qty05_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty06_flg) doDtlDisp_editable_qty06_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty07_flg) doDtlDisp_editable_qty07_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty08_flg) doDtlDisp_editable_qty08_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty09_flg) doDtlDisp_editable_qty09_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty10_flg) doDtlDisp_editable_qty10_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty11_flg) doDtlDisp_editable_qty11_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty12_flg) doDtlDisp_editable_qty12_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty13_flg) doDtlDisp_editable_qty13_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty14_flg) doDtlDisp_editable_qty14_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty15_flg) doDtlDisp_editable_qty15_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty16_flg) doDtlDisp_editable_qty16_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty17_flg) doDtlDisp_editable_qty17_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty18_flg) doDtlDisp_editable_qty18_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty19_flg) doDtlDisp_editable_qty19_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty20_flg) doDtlDisp_editable_qty20_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty21_flg) doDtlDisp_editable_qty21_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty22_flg) doDtlDisp_editable_qty22_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty23_flg) doDtlDisp_editable_qty23_flg_NC(info);
		else if (nc == columnDtlDisp_editable_qty24_flg) doDtlDisp_editable_qty24_flg_NC(info);
		else if (nc == columnDtlDisp_dec_place) doDtlDisp_dec_place_NC(info);
		else if (nc == columnDtlDisp_amt_dec_place) doDtlDisp_amt_dec_place_NC(info);
		else if (nc == columnDtlDisp_spln_itm_cd) doDtlDisp_spln_itm_cd_NC(info);
		else if (nc == columnDtlDisp_spln_itm_nm) doDtlDisp_spln_itm_nm_NC(info);
		else if (nc == columnDtlDisp_spln_set_typ) doDtlDisp_spln_set_typ_NC(info);
		else if (nc == columnDtlDisp_cur_cd) doDtlDisp_cur_cd_NC(info);
		else if (nc == columnDtlDisp_cur_nm) doDtlDisp_cur_nm_NC(info);
		else if (nc == columnDtlDisp_unit_cd) doDtlDisp_unit_cd_NC(info);
		else if (nc == columnDtlDisp_unit_nm) doDtlDisp_unit_nm_NC(info);
		else if (nc == columnDtlDisp_disp_seq) doDtlDisp_disp_seq_NC(info);
		else if (nc == columnDtlDisp_old_fix_flg) doDtlDisp_old_fix_flg_NC(info);
		else if (nc == columnDtlDisp_grp_peg_no) doDtlDisp_grp_peg_no_NC(info);
		else if (nc == columnDtlDisp_record_id) doDtlDisp_record_id_NC(info);
		else if (nc == columnDtlDisp_record_grp_id) doDtlDisp_record_grp_id_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edited_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edited_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adopted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adopted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[locked_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_locked_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_spln_itm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_spln_itm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_itm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_itm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_col_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty01_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty01_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty02_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty02_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty03_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty03_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty04_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty04_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty05_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty05_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty06_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty06_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty07_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty07_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty08_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty08_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty09_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty09_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty10_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty10_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty11_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty11_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty12_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty12_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty13_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty13_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty14_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty14_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty15_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty15_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty16_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty16_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty17_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty17_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty18_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty18_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty19_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty19_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty20_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty20_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty21_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty21_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty22_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty22_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty23_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty23_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty24_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty24_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[old_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_old_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[grp_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_grp_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_grp_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_grp_id_NC(MCEventInfo info){
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
		else if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlDispTable) doDtlDisp_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_spln_ym_fr) doCnd_spln_ym_fr_NE(info);
		else if (ne == Cnd_spln_ym_to) doCnd_spln_ym_to_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_spln_vers) doCnd_spln_vers_NE(info);
		else if (ne == Cnd_fix_f_flg) doCnd_fix_f_flg_NE(info);
		else if (ne == Cnd_fix_t_flg) doCnd_fix_t_flg_NE(info);
		else if (ne == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NE(info);
		else if (ne == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Hdr_ym) doHdr_ym_NE(info);
		else if (ne == Hdr_dpt_cd) doHdr_dpt_cd_NE(info);
		else if (ne == Hdr_dpt_nm) doHdr_dpt_nm_NE(info);
		else if (ne == Hdr_cst_cd) doHdr_cst_cd_NE(info);
		else if (ne == Hdr_cst_nm) doHdr_cst_nm_NE(info);
		else if (ne == Hdr_spln_vers) doHdr_spln_vers_NE(info);
		else if (ne == Hdr_edited_flg) doHdr_edited_flg_NE(info);
		else if (ne == Hdr_adopted_flg) doHdr_adopted_flg_NE(info);
		else if (ne == Hdr_locked_flg) doHdr_locked_flg_NE(info);
		else if (ne == Hdr_usr_cd) doHdr_usr_cd_NE(info);
		else if (ne == Hdr_usr_nm) doHdr_usr_nm_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == columnDtlDisp_check) doDtlDisp_check_NE(info);
		else if (ne == columnDtlDisp_fix_flg) doDtlDisp_fix_flg_NE(info);
		else if (ne == columnDtlDisp_disp_spln_itm) doDtlDisp_disp_spln_itm_NE(info);
		else if (ne == columnDtlDisp_disp_itm) doDtlDisp_disp_itm_NE(info);
		else if (ne == columnDtlDisp_row_title_col) doDtlDisp_row_title_col_NE(info);
		else if (ne == columnDtlDisp_row_title_nm) doDtlDisp_row_title_nm_NE(info);
		else if (ne == columnDtlDisp_disp_row_title_nm) doDtlDisp_disp_row_title_nm_NE(info);
		else if (ne == columnDtlDisp_disp_unit_cd) doDtlDisp_disp_unit_cd_NE(info);
		else if (ne == columnDtlDisp_disp_unit_nm) doDtlDisp_disp_unit_nm_NE(info);
		else if (ne == columnDtlDisp_spln_set_typ_flg) doDtlDisp_spln_set_typ_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty01_flg) doDtlDisp_editable_qty01_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty02_flg) doDtlDisp_editable_qty02_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty03_flg) doDtlDisp_editable_qty03_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty04_flg) doDtlDisp_editable_qty04_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty05_flg) doDtlDisp_editable_qty05_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty06_flg) doDtlDisp_editable_qty06_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty07_flg) doDtlDisp_editable_qty07_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty08_flg) doDtlDisp_editable_qty08_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty09_flg) doDtlDisp_editable_qty09_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty10_flg) doDtlDisp_editable_qty10_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty11_flg) doDtlDisp_editable_qty11_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty12_flg) doDtlDisp_editable_qty12_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty13_flg) doDtlDisp_editable_qty13_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty14_flg) doDtlDisp_editable_qty14_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty15_flg) doDtlDisp_editable_qty15_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty16_flg) doDtlDisp_editable_qty16_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty17_flg) doDtlDisp_editable_qty17_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty18_flg) doDtlDisp_editable_qty18_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty19_flg) doDtlDisp_editable_qty19_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty20_flg) doDtlDisp_editable_qty20_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty21_flg) doDtlDisp_editable_qty21_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty22_flg) doDtlDisp_editable_qty22_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty23_flg) doDtlDisp_editable_qty23_flg_NE(info);
		else if (ne == columnDtlDisp_editable_qty24_flg) doDtlDisp_editable_qty24_flg_NE(info);
		else if (ne == columnDtlDisp_dec_place) doDtlDisp_dec_place_NE(info);
		else if (ne == columnDtlDisp_amt_dec_place) doDtlDisp_amt_dec_place_NE(info);
		else if (ne == columnDtlDisp_spln_itm_cd) doDtlDisp_spln_itm_cd_NE(info);
		else if (ne == columnDtlDisp_spln_itm_nm) doDtlDisp_spln_itm_nm_NE(info);
		else if (ne == columnDtlDisp_spln_set_typ) doDtlDisp_spln_set_typ_NE(info);
		else if (ne == columnDtlDisp_cur_cd) doDtlDisp_cur_cd_NE(info);
		else if (ne == columnDtlDisp_cur_nm) doDtlDisp_cur_nm_NE(info);
		else if (ne == columnDtlDisp_unit_cd) doDtlDisp_unit_cd_NE(info);
		else if (ne == columnDtlDisp_unit_nm) doDtlDisp_unit_nm_NE(info);
		else if (ne == columnDtlDisp_disp_seq) doDtlDisp_disp_seq_NE(info);
		else if (ne == columnDtlDisp_old_fix_flg) doDtlDisp_old_fix_flg_NE(info);
		else if (ne == columnDtlDisp_grp_peg_no) doDtlDisp_grp_peg_no_NE(info);
		else if (ne == columnDtlDisp_record_id) doDtlDisp_record_id_NE(info);
		else if (ne == columnDtlDisp_record_grp_id) doDtlDisp_record_grp_id_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edited_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edited_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adopted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adopted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[locked_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_locked_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_spln_itm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_spln_itm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_itm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_itm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_col_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty01_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty01_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty02_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty02_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty03_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty03_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty04_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty04_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty05_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty05_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty06_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty06_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty07_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty07_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty08_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty08_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty09_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty09_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty10_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty10_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty11_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty11_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty12_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty12_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty13_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty13_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty14_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty14_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty15_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty15_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty16_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty16_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty17_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty17_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty18_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty18_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty19_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty19_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty20_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty20_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty21_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty21_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty22_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty22_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty23_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty23_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty24_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty24_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[old_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_old_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[grp_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_grp_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_grp_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_grp_id_NE(MCEventInfo info){
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
		else if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlDispTable) doDtlDisp_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_spln_ym_fr) doCnd_spln_ym_fr_NX(info);
		else if (nx == Cnd_spln_ym_to) doCnd_spln_ym_to_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_spln_vers) doCnd_spln_vers_NX(info);
		else if (nx == Cnd_fix_f_flg) doCnd_fix_f_flg_NX(info);
		else if (nx == Cnd_fix_t_flg) doCnd_fix_t_flg_NX(info);
		else if (nx == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NX(info);
		else if (nx == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Hdr_ym) doHdr_ym_NX(info);
		else if (nx == Hdr_dpt_cd) doHdr_dpt_cd_NX(info);
		else if (nx == Hdr_dpt_nm) doHdr_dpt_nm_NX(info);
		else if (nx == Hdr_cst_cd) doHdr_cst_cd_NX(info);
		else if (nx == Hdr_cst_nm) doHdr_cst_nm_NX(info);
		else if (nx == Hdr_spln_vers) doHdr_spln_vers_NX(info);
		else if (nx == Hdr_edited_flg) doHdr_edited_flg_NX(info);
		else if (nx == Hdr_adopted_flg) doHdr_adopted_flg_NX(info);
		else if (nx == Hdr_locked_flg) doHdr_locked_flg_NX(info);
		else if (nx == Hdr_usr_cd) doHdr_usr_cd_NX(info);
		else if (nx == Hdr_usr_nm) doHdr_usr_nm_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == columnDtlDisp_check) doDtlDisp_check_NX(info);
		else if (nx == columnDtlDisp_fix_flg) doDtlDisp_fix_flg_NX(info);
		else if (nx == columnDtlDisp_disp_spln_itm) doDtlDisp_disp_spln_itm_NX(info);
		else if (nx == columnDtlDisp_disp_itm) doDtlDisp_disp_itm_NX(info);
		else if (nx == columnDtlDisp_row_title_col) doDtlDisp_row_title_col_NX(info);
		else if (nx == columnDtlDisp_row_title_nm) doDtlDisp_row_title_nm_NX(info);
		else if (nx == columnDtlDisp_disp_row_title_nm) doDtlDisp_disp_row_title_nm_NX(info);
		else if (nx == columnDtlDisp_disp_unit_cd) doDtlDisp_disp_unit_cd_NX(info);
		else if (nx == columnDtlDisp_disp_unit_nm) doDtlDisp_disp_unit_nm_NX(info);
		else if (nx == columnDtlDisp_spln_set_typ_flg) doDtlDisp_spln_set_typ_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty01_flg) doDtlDisp_editable_qty01_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty02_flg) doDtlDisp_editable_qty02_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty03_flg) doDtlDisp_editable_qty03_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty04_flg) doDtlDisp_editable_qty04_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty05_flg) doDtlDisp_editable_qty05_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty06_flg) doDtlDisp_editable_qty06_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty07_flg) doDtlDisp_editable_qty07_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty08_flg) doDtlDisp_editable_qty08_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty09_flg) doDtlDisp_editable_qty09_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty10_flg) doDtlDisp_editable_qty10_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty11_flg) doDtlDisp_editable_qty11_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty12_flg) doDtlDisp_editable_qty12_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty13_flg) doDtlDisp_editable_qty13_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty14_flg) doDtlDisp_editable_qty14_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty15_flg) doDtlDisp_editable_qty15_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty16_flg) doDtlDisp_editable_qty16_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty17_flg) doDtlDisp_editable_qty17_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty18_flg) doDtlDisp_editable_qty18_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty19_flg) doDtlDisp_editable_qty19_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty20_flg) doDtlDisp_editable_qty20_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty21_flg) doDtlDisp_editable_qty21_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty22_flg) doDtlDisp_editable_qty22_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty23_flg) doDtlDisp_editable_qty23_flg_NX(info);
		else if (nx == columnDtlDisp_editable_qty24_flg) doDtlDisp_editable_qty24_flg_NX(info);
		else if (nx == columnDtlDisp_dec_place) doDtlDisp_dec_place_NX(info);
		else if (nx == columnDtlDisp_amt_dec_place) doDtlDisp_amt_dec_place_NX(info);
		else if (nx == columnDtlDisp_spln_itm_cd) doDtlDisp_spln_itm_cd_NX(info);
		else if (nx == columnDtlDisp_spln_itm_nm) doDtlDisp_spln_itm_nm_NX(info);
		else if (nx == columnDtlDisp_spln_set_typ) doDtlDisp_spln_set_typ_NX(info);
		else if (nx == columnDtlDisp_cur_cd) doDtlDisp_cur_cd_NX(info);
		else if (nx == columnDtlDisp_cur_nm) doDtlDisp_cur_nm_NX(info);
		else if (nx == columnDtlDisp_unit_cd) doDtlDisp_unit_cd_NX(info);
		else if (nx == columnDtlDisp_unit_nm) doDtlDisp_unit_nm_NX(info);
		else if (nx == columnDtlDisp_disp_seq) doDtlDisp_disp_seq_NX(info);
		else if (nx == columnDtlDisp_old_fix_flg) doDtlDisp_old_fix_flg_NX(info);
		else if (nx == columnDtlDisp_grp_peg_no) doDtlDisp_grp_peg_no_NX(info);
		else if (nx == columnDtlDisp_record_id) doDtlDisp_record_id_NX(info);
		else if (nx == columnDtlDisp_record_grp_id) doDtlDisp_record_grp_id_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edited_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edited_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adopted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adopted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[locked_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_locked_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_spln_itm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_spln_itm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_itm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_itm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_col_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty01_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty01_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty02_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty02_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty03_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty03_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty04_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty04_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty05_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty05_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty06_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty06_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty07_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty07_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty08_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty08_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty09_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty09_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty10_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty10_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty11_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty11_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty12_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty12_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty13_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty13_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty14_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty14_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty15_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty15_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty16_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty16_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty17_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty17_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty18_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty18_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty19_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty19_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty20_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty20_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty21_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty21_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty22_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty22_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty23_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty23_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[editable_qty24_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_editable_qty24_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[old_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_old_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[grp_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_grp_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_grp_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_grp_id_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_spln_ym_fr) doCnd_spln_ym_fr_LC(info);
		else if (lc == Cnd_spln_ym_to) doCnd_spln_ym_to_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_spln_vers) doCnd_spln_vers_LC(info);
		else if (lc == Cnd_spln_itm_cd) doCnd_spln_itm_cd_LC(info);
		else if (lc == Cnd_spln_itm_nm) doCnd_spln_itm_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Hdr_ym) doHdr_ym_LC(info);
		else if (lc == Hdr_dpt_cd) doHdr_dpt_cd_LC(info);
		else if (lc == Hdr_dpt_nm) doHdr_dpt_nm_LC(info);
		else if (lc == Hdr_cst_cd) doHdr_cst_cd_LC(info);
		else if (lc == Hdr_cst_nm) doHdr_cst_nm_LC(info);
		else if (lc == Hdr_spln_vers) doHdr_spln_vers_LC(info);
		else if (lc == Hdr_usr_cd) doHdr_usr_cd_LC(info);
		else if (lc == Hdr_usr_nm) doHdr_usr_nm_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == columnDtlDisp_disp_spln_itm) doDtlDisp_disp_spln_itm_LC(info);
		else if (lc == columnDtlDisp_disp_itm) doDtlDisp_disp_itm_LC(info);
		else if (lc == columnDtlDisp_row_title_col) doDtlDisp_row_title_col_LC(info);
		else if (lc == columnDtlDisp_row_title_nm) doDtlDisp_row_title_nm_LC(info);
		else if (lc == columnDtlDisp_disp_row_title_nm) doDtlDisp_disp_row_title_nm_LC(info);
		else if (lc == columnDtlDisp_disp_unit_cd) doDtlDisp_disp_unit_cd_LC(info);
		else if (lc == columnDtlDisp_disp_unit_nm) doDtlDisp_disp_unit_nm_LC(info);
		else if (lc == columnDtlDisp_dec_place) doDtlDisp_dec_place_LC(info);
		else if (lc == columnDtlDisp_amt_dec_place) doDtlDisp_amt_dec_place_LC(info);
		else if (lc == columnDtlDisp_spln_itm_cd) doDtlDisp_spln_itm_cd_LC(info);
		else if (lc == columnDtlDisp_spln_itm_nm) doDtlDisp_spln_itm_nm_LC(info);
		else if (lc == columnDtlDisp_spln_set_typ) doDtlDisp_spln_set_typ_LC(info);
		else if (lc == columnDtlDisp_cur_cd) doDtlDisp_cur_cd_LC(info);
		else if (lc == columnDtlDisp_cur_nm) doDtlDisp_cur_nm_LC(info);
		else if (lc == columnDtlDisp_unit_cd) doDtlDisp_unit_cd_LC(info);
		else if (lc == columnDtlDisp_unit_nm) doDtlDisp_unit_nm_LC(info);
		else if (lc == columnDtlDisp_disp_seq) doDtlDisp_disp_seq_LC(info);
		else if (lc == columnDtlDisp_grp_peg_no) doDtlDisp_grp_peg_no_LC(info);
		else if (lc == columnDtlDisp_record_id) doDtlDisp_record_id_LC(info);
		else if (lc == columnDtlDisp_record_grp_id) doDtlDisp_record_grp_id_LC(info);
	}

	/**
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_itm_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_spln_itm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_spln_itm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_itm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_itm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_col_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[spln_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_spln_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[grp_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_grp_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlDisp]パネルの[record_grp_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDisp_record_grp_id_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wrk_no_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getCnd_wrk_no_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_spln_vers]の作成メソッド
	 */
	public MCList getCnd_spln_vers(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSplnVers(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_spln_itm_cd]の作成メソッド
	 */
	public MCList getCnd_spln_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSplnItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlDisp_spln_itm_cd]の作成メソッド
	 */
	public MCList getDtlDisp_spln_itm_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL0120.Srch01")) {
			return new MS_MSBBL0120_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL0120.Sprt01")) {
			return new MS_MSBBL0120_Sprt01Bridge();
		}
		if (id.equals("MS.MSBBL0120.Sprt02")) {
			return new MS_MSBBL0120_Sprt02Bridge();
		}
		if (id.equals("MS.MSBBL0120.Upd01")) {
			return new MS_MSBBL0120_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0120_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL0120_Srch01Bridge() {
			p_MS_MSBBL0120_Srch01 = new MCParam(PDef.MS_MSBBL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0120.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP0120.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));

			p_MS_MSBBL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0120.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0120.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP0120.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP0120.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0120_Srch01.addDownBlock(mcframe.clientMSBB.MSBBP0120.HdrR.create());
			p_MS_MSBBL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0120_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP0120.HdrR)p_MS_MSBBL0120_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)p_MS_MSBBL0120_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0120_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0120_Sprt01;

		/** コンストラクタ */
		protected MS_MSBBL0120_Sprt01Bridge() {
			p_MS_MSBBL0120_Sprt01 = new MCParam(PDef.MS_MSBBL0120_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0120_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0120.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));

			p_MS_MSBBL0120_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0120_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0120_Sprt01.addUpBlock(getHdrR());
			p_MS_MSBBL0120_Sprt01.addUpBlock(getSprtAmtQtyCalDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0120_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0120_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0120.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0120.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0120_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0120_Sprt01;
		}

		protected void show() {
			setSprtAmtQtyCalDtlL((MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)p_MS_MSBBL0120_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getSprtAmtQtyCalDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getSprtAmtQtyCalDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSprtAmtQtyCalDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0120_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0120_Sprt02;

		/** コンストラクタ */
		protected MS_MSBBL0120_Sprt02Bridge() {
			p_MS_MSBBL0120_Sprt02 = new MCParam(PDef.MS_MSBBL0120_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0120_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0120.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));

			p_MS_MSBBL0120_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0120_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0120_Sprt02.addUpBlock(getHdrR());
			p_MS_MSBBL0120_Sprt02.addUpBlock(getSprtAmtQtyCalDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0120_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0120_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0120.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0120.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0120_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0120_Sprt02;
		}

		protected void show() {
			setSprtAmtQtyCalDtlL((MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)p_MS_MSBBL0120_Sprt02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getSprtAmtQtyCalDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getSprtAmtQtyCalDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSprtAmtQtyCalDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL0120_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0120_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL0120_Upd01Bridge() {
			p_MS_MSBBL0120_Upd01 = new MCParam(PDef.MS_MSBBL0120_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0120_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0120.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));

			p_MS_MSBBL0120_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0120_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0120_Upd01.addUpBlock(getHdrR());
			p_MS_MSBBL0120_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0120_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0120_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0120.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP0120.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0120.DtlR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0120_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0120.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0120_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBB.MSBBP0120.DtlR>)p_MS_MSBBL0120_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
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