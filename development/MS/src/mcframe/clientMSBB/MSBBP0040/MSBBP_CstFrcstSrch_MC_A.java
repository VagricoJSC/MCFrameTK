package mcframe.clientMSBB.MSBBP0040;

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
import mcframe.clientMSBB.MSBBP0040.MSBBP_CstFrcstSrch_MC.MS_MSBBL0040_Srch01Caller;

/**
 * 画面"MSBBP_CstFrcstSrch"パネルクラスです。<p>
 *
 * 顧客期間内示を一覧で照会する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_CstFrcstSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Sts]ブロック関連のField定義
	public MCPanel StsPanel = null;
	public MCTitledBorder StsTitledBorder = null;
	// [Sts]ブロックの項目のField定義
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
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_f_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_t_flg = null;
	/**
	 * DTL,Details;HDR,Header; DTL,明細;HDR,ヘッダ;.<p>
	 *
	 */
	public MCButtonGroup Cnd_mode_Group = null;
	public MCRadioButton Cnd_mode_DTL = null;
	public MCRadioButton Cnd_mode_HDR = null;
	public MCLabel Cnd_cst_frcst_prnt_dt_fr_Label = null;
	/**
	 * Customer forecast list issued date FROM 得意先内示書発行日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_cst_frcst_prnt_dt_fr = null;
	public MCLabel Cnd_cst_frcst_prnt_dt_to_Label = null;
	/**
	 * Customer forecast list issued date TO 得意先内示書発行日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_cst_frcst_prnt_dt_to = null;
	public MCLabel Cnd_rcpt_dt_fr_Label = null;
	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcpt_dt_fr = null;
	public MCLabel Cnd_rcpt_dt_to_Label = null;
	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcpt_dt_to = null;
	public MCLabel Cnd_frcst_st_dt_fr_Label = null;
	/**
	 * Start date of forecast period FROM 内示期間開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_frcst_st_dt_fr = null;
	public MCLabel Cnd_frcst_st_dt_to_Label = null;
	/**
	 * Start date of forecast period TO 内示期間開始日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_frcst_st_dt_to = null;
	public MCLabel Cnd_frcst_end_dt_fr_Label = null;
	/**
	 * End date of forecast period FROM 内示期間終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_frcst_end_dt_fr = null;
	public MCLabel Cnd_frcst_end_dt_to_Label = null;
	/**
	 * End date of forecast period TO 内示期間終了日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_frcst_end_dt_to = null;
	public MCLabel Cnd_frcst_dt_fr_Label = null;
	/**
	 * Forecast period FROM 内示期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_frcst_dt_fr = null;
	public MCLabel Cnd_frcst_dt_to_Label = null;
	/**
	 * Forecast period TO 内示期間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_frcst_dt_to = null;
	public MCLabel Cnd_frcst_period_typ_Label = null;
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_frcst_period_typ = null;
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public MCTextField Cnd_frcst_period_typ_nm = null;
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
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	public MCLabel Cnd_frcst_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_frcst_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_frcst_usr_nm = null;
	public MCLabel Cnd_frcst_dpt_cd_Label = null;
	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_frcst_dpt_cd = null;
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public MCTextField Cnd_frcst_dpt_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_cst_frcst_no_Label = null;
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_frcst_no = null;
	public MCLabel Cnd_cst_frcst_d_no_Label = null;
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_frcst_d_no = null;
	public MCLabel Cnd_cst_frcst_slip_no_Label = null;
	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_frcst_slip_no = null;
	public MCLabel Cnd_cst_frcst_slip_d_no_Label = null;
	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_frcst_slip_d_no = null;
	/**
	 * Latest only 最新のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Except lower priority 下位優先除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_frcst_stop_flg = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_cst_itm_cd_Label = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_can_rsn_cd_Label = null;
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_can_rsn_cd = null;
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public MCTextField Cnd_can_rsn_nm = null;
	public MCLabel Cnd_can_rmrks_Label = null;
	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public MCTextField Cnd_can_rmrks = null;
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
	public MCLabel Cnd_dtl_intr_rmrks_Label = null;
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public MCTextField Cnd_dtl_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_dlv_grp_p_PPanel;
	public MCLabel Cnd_dlv_grp_lab1;	// [Cnd]の[dlv_grp_p.bp_grp_lab1]を[Cnd_dlv_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg1;	// [Cnd]の[dlv_grp_p.bp_grp_flg1]を[Cnd_dlv_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd1;	// [Cnd]の[dlv_grp_p.bp_grp_cd1]を[Cnd_dlv_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm1;	// [Cnd]の[dlv_grp_p.bp_grp_nm1]を[Cnd_dlv_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab2;	// [Cnd]の[dlv_grp_p.bp_grp_lab2]を[Cnd_dlv_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg2;	// [Cnd]の[dlv_grp_p.bp_grp_flg2]を[Cnd_dlv_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd2;	// [Cnd]の[dlv_grp_p.bp_grp_cd2]を[Cnd_dlv_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm2;	// [Cnd]の[dlv_grp_p.bp_grp_nm2]を[Cnd_dlv_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab3;	// [Cnd]の[dlv_grp_p.bp_grp_lab3]を[Cnd_dlv_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg3;	// [Cnd]の[dlv_grp_p.bp_grp_flg3]を[Cnd_dlv_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd3;	// [Cnd]の[dlv_grp_p.bp_grp_cd3]を[Cnd_dlv_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm3;	// [Cnd]の[dlv_grp_p.bp_grp_nm3]を[Cnd_dlv_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab4;	// [Cnd]の[dlv_grp_p.bp_grp_lab4]を[Cnd_dlv_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg4;	// [Cnd]の[dlv_grp_p.bp_grp_flg4]を[Cnd_dlv_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd4;	// [Cnd]の[dlv_grp_p.bp_grp_cd4]を[Cnd_dlv_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm4;	// [Cnd]の[dlv_grp_p.bp_grp_nm4]を[Cnd_dlv_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab5;	// [Cnd]の[dlv_grp_p.bp_grp_lab5]を[Cnd_dlv_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg5;	// [Cnd]の[dlv_grp_p.bp_grp_flg5]を[Cnd_dlv_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd5;	// [Cnd]の[dlv_grp_p.bp_grp_cd5]を[Cnd_dlv_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm5;	// [Cnd]の[dlv_grp_p.bp_grp_nm5]を[Cnd_dlv_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab6;	// [Cnd]の[dlv_grp_p.bp_grp_lab6]を[Cnd_dlv_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg6;	// [Cnd]の[dlv_grp_p.bp_grp_flg6]を[Cnd_dlv_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd6;	// [Cnd]の[dlv_grp_p.bp_grp_cd6]を[Cnd_dlv_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm6;	// [Cnd]の[dlv_grp_p.bp_grp_nm6]を[Cnd_dlv_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab7;	// [Cnd]の[dlv_grp_p.bp_grp_lab7]を[Cnd_dlv_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg7;	// [Cnd]の[dlv_grp_p.bp_grp_flg7]を[Cnd_dlv_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd7;	// [Cnd]の[dlv_grp_p.bp_grp_cd7]を[Cnd_dlv_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm7;	// [Cnd]の[dlv_grp_p.bp_grp_nm7]を[Cnd_dlv_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab8;	// [Cnd]の[dlv_grp_p.bp_grp_lab8]を[Cnd_dlv_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg8;	// [Cnd]の[dlv_grp_p.bp_grp_flg8]を[Cnd_dlv_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd8;	// [Cnd]の[dlv_grp_p.bp_grp_cd8]を[Cnd_dlv_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm8;	// [Cnd]の[dlv_grp_p.bp_grp_nm8]を[Cnd_dlv_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab9;	// [Cnd]の[dlv_grp_p.bp_grp_lab9]を[Cnd_dlv_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg9;	// [Cnd]の[dlv_grp_p.bp_grp_flg9]を[Cnd_dlv_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd9;	// [Cnd]の[dlv_grp_p.bp_grp_cd9]を[Cnd_dlv_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm9;	// [Cnd]の[dlv_grp_p.bp_grp_nm9]を[Cnd_dlv_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab10;	// [Cnd]の[dlv_grp_p.bp_grp_lab10]を[Cnd_dlv_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg10;	// [Cnd]の[dlv_grp_p.bp_grp_flg10]を[Cnd_dlv_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd10;	// [Cnd]の[dlv_grp_p.bp_grp_cd10]を[Cnd_dlv_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm10;	// [Cnd]の[dlv_grp_p.bp_grp_nm10]を[Cnd_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_cst_grp_p_PPanel;
	public MCLabel Cnd_cst_grp_lab1;	// [Cnd]の[cst_grp_p.bp_grp_lab1]を[Cnd_cst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg1;	// [Cnd]の[cst_grp_p.bp_grp_flg1]を[Cnd_cst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd1;	// [Cnd]の[cst_grp_p.bp_grp_cd1]を[Cnd_cst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm1;	// [Cnd]の[cst_grp_p.bp_grp_nm1]を[Cnd_cst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab2;	// [Cnd]の[cst_grp_p.bp_grp_lab2]を[Cnd_cst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg2;	// [Cnd]の[cst_grp_p.bp_grp_flg2]を[Cnd_cst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd2;	// [Cnd]の[cst_grp_p.bp_grp_cd2]を[Cnd_cst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm2;	// [Cnd]の[cst_grp_p.bp_grp_nm2]を[Cnd_cst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab3;	// [Cnd]の[cst_grp_p.bp_grp_lab3]を[Cnd_cst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg3;	// [Cnd]の[cst_grp_p.bp_grp_flg3]を[Cnd_cst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd3;	// [Cnd]の[cst_grp_p.bp_grp_cd3]を[Cnd_cst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm3;	// [Cnd]の[cst_grp_p.bp_grp_nm3]を[Cnd_cst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab4;	// [Cnd]の[cst_grp_p.bp_grp_lab4]を[Cnd_cst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg4;	// [Cnd]の[cst_grp_p.bp_grp_flg4]を[Cnd_cst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd4;	// [Cnd]の[cst_grp_p.bp_grp_cd4]を[Cnd_cst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm4;	// [Cnd]の[cst_grp_p.bp_grp_nm4]を[Cnd_cst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab5;	// [Cnd]の[cst_grp_p.bp_grp_lab5]を[Cnd_cst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg5;	// [Cnd]の[cst_grp_p.bp_grp_flg5]を[Cnd_cst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd5;	// [Cnd]の[cst_grp_p.bp_grp_cd5]を[Cnd_cst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm5;	// [Cnd]の[cst_grp_p.bp_grp_nm5]を[Cnd_cst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab6;	// [Cnd]の[cst_grp_p.bp_grp_lab6]を[Cnd_cst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg6;	// [Cnd]の[cst_grp_p.bp_grp_flg6]を[Cnd_cst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd6;	// [Cnd]の[cst_grp_p.bp_grp_cd6]を[Cnd_cst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm6;	// [Cnd]の[cst_grp_p.bp_grp_nm6]を[Cnd_cst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab7;	// [Cnd]の[cst_grp_p.bp_grp_lab7]を[Cnd_cst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg7;	// [Cnd]の[cst_grp_p.bp_grp_flg7]を[Cnd_cst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd7;	// [Cnd]の[cst_grp_p.bp_grp_cd7]を[Cnd_cst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm7;	// [Cnd]の[cst_grp_p.bp_grp_nm7]を[Cnd_cst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab8;	// [Cnd]の[cst_grp_p.bp_grp_lab8]を[Cnd_cst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg8;	// [Cnd]の[cst_grp_p.bp_grp_flg8]を[Cnd_cst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd8;	// [Cnd]の[cst_grp_p.bp_grp_cd8]を[Cnd_cst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm8;	// [Cnd]の[cst_grp_p.bp_grp_nm8]を[Cnd_cst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab9;	// [Cnd]の[cst_grp_p.bp_grp_lab9]を[Cnd_cst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg9;	// [Cnd]の[cst_grp_p.bp_grp_flg9]を[Cnd_cst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd9;	// [Cnd]の[cst_grp_p.bp_grp_cd9]を[Cnd_cst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm9;	// [Cnd]の[cst_grp_p.bp_grp_nm9]を[Cnd_cst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab10;	// [Cnd]の[cst_grp_p.bp_grp_lab10]を[Cnd_cst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg10;	// [Cnd]の[cst_grp_p.bp_grp_flg10]を[Cnd_cst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd10;	// [Cnd]の[cst_grp_p.bp_grp_cd10]を[Cnd_cst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm10;	// [Cnd]の[cst_grp_p.bp_grp_nm10]を[Cnd_cst_grp_nm10]としてエイリアス定義。
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
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [CstCnd]ブロック関連のField定義
	public MCPanel CstCndPanel = null;
	// [CstCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBB.MSBBP0040.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_no = null;
	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_prnt_dt = null;
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
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_dpt_cd = null;
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_dpt_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_usr_nm = null;
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
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_dt = null;
	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_slip_no = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_rsn_cd = null;
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_rsn_nm = null;
	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_rmrks = null;
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
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_period_typ = null;
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_period_typ_nm = null;
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_st_dt = null;
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_end_dt = null;
	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_qty_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_qty_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_last_qty_p_PPanel;
	public MCColumnConfig columnRslt_last_qty;// [Rslt]の[last_qty_p.qty]を[columnRslt_last_qty]としてエイリアス定義。
	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_cst_frcst_prnt_dt = null;
	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_rcpt_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_spln_qty_p_PPanel;
	public MCColumnConfig columnRslt_spln_qty;// [Rslt]の[spln_qty_p.qty]を[columnRslt_spln_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_slo_qty_p_PPanel;
	public MCColumnConfig columnRslt_slo_qty;// [Rslt]の[slo_qty_p.qty]を[columnRslt_slo_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_mly_net_frcst_qty_p_PPanel;
	public MCColumnConfig columnRslt_mly_net_frcst_qty;// [Rslt]の[mly_net_frcst_qty_p.qty]を[columnRslt_mly_net_frcst_qty]としてエイリアス定義。
	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_loc_cd = null;
	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_loc_nm = null;
	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_slip_d_no = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_prms_qty_p_PPanel;
	public MCColumnConfig columnRslt_prms_qty;// [Rslt]の[prms_qty_p.qty]を[columnRslt_prms_qty]としてエイリアス定義。
	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_frcst_stop_flg = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_intr_rmrks = null;
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
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_d_no = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_dlv_grp_p_PPanel;
	public MCColumnConfig columnRslt_dlv_grp_cd1;// [Rslt]の[dlv_grp_p.bp_grp_cd1]を[columnRslt_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm1;// [Rslt]の[dlv_grp_p.bp_grp_nm1]を[columnRslt_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd2;// [Rslt]の[dlv_grp_p.bp_grp_cd2]を[columnRslt_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm2;// [Rslt]の[dlv_grp_p.bp_grp_nm2]を[columnRslt_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd3;// [Rslt]の[dlv_grp_p.bp_grp_cd3]を[columnRslt_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm3;// [Rslt]の[dlv_grp_p.bp_grp_nm3]を[columnRslt_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd4;// [Rslt]の[dlv_grp_p.bp_grp_cd4]を[columnRslt_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm4;// [Rslt]の[dlv_grp_p.bp_grp_nm4]を[columnRslt_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd5;// [Rslt]の[dlv_grp_p.bp_grp_cd5]を[columnRslt_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm5;// [Rslt]の[dlv_grp_p.bp_grp_nm5]を[columnRslt_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd6;// [Rslt]の[dlv_grp_p.bp_grp_cd6]を[columnRslt_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm6;// [Rslt]の[dlv_grp_p.bp_grp_nm6]を[columnRslt_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd7;// [Rslt]の[dlv_grp_p.bp_grp_cd7]を[columnRslt_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm7;// [Rslt]の[dlv_grp_p.bp_grp_nm7]を[columnRslt_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd8;// [Rslt]の[dlv_grp_p.bp_grp_cd8]を[columnRslt_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm8;// [Rslt]の[dlv_grp_p.bp_grp_nm8]を[columnRslt_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd9;// [Rslt]の[dlv_grp_p.bp_grp_cd9]を[columnRslt_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm9;// [Rslt]の[dlv_grp_p.bp_grp_nm9]を[columnRslt_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd10;// [Rslt]の[dlv_grp_p.bp_grp_cd10]を[columnRslt_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm10;// [Rslt]の[dlv_grp_p.bp_grp_nm10]を[columnRslt_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_cst_grp_p_PPanel;
	public MCColumnConfig columnRslt_cst_grp_cd1;// [Rslt]の[cst_grp_p.bp_grp_cd1]を[columnRslt_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm1;// [Rslt]の[cst_grp_p.bp_grp_nm1]を[columnRslt_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd2;// [Rslt]の[cst_grp_p.bp_grp_cd2]を[columnRslt_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm2;// [Rslt]の[cst_grp_p.bp_grp_nm2]を[columnRslt_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd3;// [Rslt]の[cst_grp_p.bp_grp_cd3]を[columnRslt_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm3;// [Rslt]の[cst_grp_p.bp_grp_nm3]を[columnRslt_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd4;// [Rslt]の[cst_grp_p.bp_grp_cd4]を[columnRslt_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm4;// [Rslt]の[cst_grp_p.bp_grp_nm4]を[columnRslt_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd5;// [Rslt]の[cst_grp_p.bp_grp_cd5]を[columnRslt_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm5;// [Rslt]の[cst_grp_p.bp_grp_nm5]を[columnRslt_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd6;// [Rslt]の[cst_grp_p.bp_grp_cd6]を[columnRslt_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm6;// [Rslt]の[cst_grp_p.bp_grp_nm6]を[columnRslt_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd7;// [Rslt]の[cst_grp_p.bp_grp_cd7]を[columnRslt_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm7;// [Rslt]の[cst_grp_p.bp_grp_nm7]を[columnRslt_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd8;// [Rslt]の[cst_grp_p.bp_grp_cd8]を[columnRslt_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm8;// [Rslt]の[cst_grp_p.bp_grp_nm8]を[columnRslt_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd9;// [Rslt]の[cst_grp_p.bp_grp_cd9]を[columnRslt_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm9;// [Rslt]の[cst_grp_p.bp_grp_nm9]を[columnRslt_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd10;// [Rslt]の[cst_grp_p.bp_grp_cd10]を[columnRslt_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm10;// [Rslt]の[cst_grp_p.bp_grp_nm10]を[columnRslt_cst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_itm_grp_cd1;// [Rslt]の[itm_grp_p.itm_grp_cd1]を[columnRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm1;// [Rslt]の[itm_grp_p.itm_grp_nm1]を[columnRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd2;// [Rslt]の[itm_grp_p.itm_grp_cd2]を[columnRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm2;// [Rslt]の[itm_grp_p.itm_grp_nm2]を[columnRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd3;// [Rslt]の[itm_grp_p.itm_grp_cd3]を[columnRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm3;// [Rslt]の[itm_grp_p.itm_grp_nm3]を[columnRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd4;// [Rslt]の[itm_grp_p.itm_grp_cd4]を[columnRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm4;// [Rslt]の[itm_grp_p.itm_grp_nm4]を[columnRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd5;// [Rslt]の[itm_grp_p.itm_grp_cd5]を[columnRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm5;// [Rslt]の[itm_grp_p.itm_grp_nm5]を[columnRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd6;// [Rslt]の[itm_grp_p.itm_grp_cd6]を[columnRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm6;// [Rslt]の[itm_grp_p.itm_grp_nm6]を[columnRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd7;// [Rslt]の[itm_grp_p.itm_grp_cd7]を[columnRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm7;// [Rslt]の[itm_grp_p.itm_grp_nm7]を[columnRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd8;// [Rslt]の[itm_grp_p.itm_grp_cd8]を[columnRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm8;// [Rslt]の[itm_grp_p.itm_grp_nm8]を[columnRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd9;// [Rslt]の[itm_grp_p.itm_grp_cd9]を[columnRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm9;// [Rslt]の[itm_grp_p.itm_grp_nm9]を[columnRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd10;// [Rslt]の[itm_grp_p.itm_grp_cd10]を[columnRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm10;// [Rslt]の[itm_grp_p.itm_grp_nm10]を[columnRslt_itm_grp_nm10]としてエイリアス定義。
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
	 * Sales forecast entry 顧客期間内示登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP0010 = null;
	/**
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
	/** [SRCH_DTL]モードを表す定数 */
	public static final String SRCH_DTL = "SRCH_DTL";
	/** [SRCH_HDR]モードを表す定数 */
	public static final String SRCH_HDR = "SRCH_HDR";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_DTL, SRCH_HDR, REF_DTL, REF_HDR};
	
	/** [MS_MSBBL0040_Srch01]のCallerの作成 */
	protected MSBBP_CstFrcstSrch_MC.MS_MSBBL0040_Srch01Caller createMS_MSBBL0040_Srch01() {
		MSBBP_CstFrcstSrch_MC.MS_MSBBL0040_Srch01Caller<MSBBP_CstFrcstSrch, MS_MSBBL0040_Srch01Bridge>
		caller = ((MSBBP_CstFrcstSrch_MC)this).new MS_MSBBL0040_Srch01Caller<MSBBP_CstFrcstSrch, MS_MSBBL0040_Srch01Bridge>(
					(MSBBP_CstFrcstSrch)this, new MS_MSBBL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL0040_Srch01]の呼び出し */
	protected void callMS_MSBBL0040_Srch01() {
		MCCaller caller = createMS_MSBBL0040_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP0040.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP0040.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP0040.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP0040.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP0040.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0040.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP0040.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP0040.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP0040.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP0040.RsltR.class);
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
		ret.add(StsPanel);
		ret.add(DispUnitPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(CndPanel);
		ret.add(DlvCndPanel);
		ret.add(CstCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_CstFrcstSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_CstFrcstSrch_MC_A(String name) {
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
		MSBBP_CstFrcstSrch_MC.jbCreateSts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateDispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateTop((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateFold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateTab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateTab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateTab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateTab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateDlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateCstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateCtrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateRPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateRslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbCreateBtn((MSBBP_CstFrcstSrch)this);
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_CstFrcstSrch p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().dlv_grp_p());
		p.Cnd_dlv_grp_p_PPanel.setName("Cnd.dlv_grp_p");
		p.Cnd_dlv_grp_lab1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_dlv_grp_lab1.addAliasName("Cnd.dlv_grp_lab1", p);
		p.Cnd_dlv_grp_flg1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_dlv_grp_flg1.addAliasName("Cnd.dlv_grp_flg1", p);
		p.Cnd_dlv_grp_cd1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_dlv_grp_cd1.addAliasName("Cnd.dlv_grp_cd1", p);
		p.Cnd_dlv_grp_nm1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_dlv_grp_nm1.addAliasName("Cnd.dlv_grp_nm1", p);
		p.Cnd_dlv_grp_lab2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_dlv_grp_lab2.addAliasName("Cnd.dlv_grp_lab2", p);
		p.Cnd_dlv_grp_flg2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_dlv_grp_flg2.addAliasName("Cnd.dlv_grp_flg2", p);
		p.Cnd_dlv_grp_cd2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_dlv_grp_cd2.addAliasName("Cnd.dlv_grp_cd2", p);
		p.Cnd_dlv_grp_nm2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_dlv_grp_nm2.addAliasName("Cnd.dlv_grp_nm2", p);
		p.Cnd_dlv_grp_lab3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_dlv_grp_lab3.addAliasName("Cnd.dlv_grp_lab3", p);
		p.Cnd_dlv_grp_flg3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_dlv_grp_flg3.addAliasName("Cnd.dlv_grp_flg3", p);
		p.Cnd_dlv_grp_cd3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_dlv_grp_cd3.addAliasName("Cnd.dlv_grp_cd3", p);
		p.Cnd_dlv_grp_nm3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_dlv_grp_nm3.addAliasName("Cnd.dlv_grp_nm3", p);
		p.Cnd_dlv_grp_lab4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_dlv_grp_lab4.addAliasName("Cnd.dlv_grp_lab4", p);
		p.Cnd_dlv_grp_flg4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_dlv_grp_flg4.addAliasName("Cnd.dlv_grp_flg4", p);
		p.Cnd_dlv_grp_cd4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_dlv_grp_cd4.addAliasName("Cnd.dlv_grp_cd4", p);
		p.Cnd_dlv_grp_nm4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_dlv_grp_nm4.addAliasName("Cnd.dlv_grp_nm4", p);
		p.Cnd_dlv_grp_lab5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_dlv_grp_lab5.addAliasName("Cnd.dlv_grp_lab5", p);
		p.Cnd_dlv_grp_flg5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_dlv_grp_flg5.addAliasName("Cnd.dlv_grp_flg5", p);
		p.Cnd_dlv_grp_cd5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_dlv_grp_cd5.addAliasName("Cnd.dlv_grp_cd5", p);
		p.Cnd_dlv_grp_nm5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_dlv_grp_nm5.addAliasName("Cnd.dlv_grp_nm5", p);
		p.Cnd_dlv_grp_lab6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_dlv_grp_lab6.addAliasName("Cnd.dlv_grp_lab6", p);
		p.Cnd_dlv_grp_flg6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_dlv_grp_flg6.addAliasName("Cnd.dlv_grp_flg6", p);
		p.Cnd_dlv_grp_cd6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_dlv_grp_cd6.addAliasName("Cnd.dlv_grp_cd6", p);
		p.Cnd_dlv_grp_nm6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_dlv_grp_nm6.addAliasName("Cnd.dlv_grp_nm6", p);
		p.Cnd_dlv_grp_lab7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_dlv_grp_lab7.addAliasName("Cnd.dlv_grp_lab7", p);
		p.Cnd_dlv_grp_flg7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_dlv_grp_flg7.addAliasName("Cnd.dlv_grp_flg7", p);
		p.Cnd_dlv_grp_cd7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_dlv_grp_cd7.addAliasName("Cnd.dlv_grp_cd7", p);
		p.Cnd_dlv_grp_nm7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_dlv_grp_nm7.addAliasName("Cnd.dlv_grp_nm7", p);
		p.Cnd_dlv_grp_lab8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_dlv_grp_lab8.addAliasName("Cnd.dlv_grp_lab8", p);
		p.Cnd_dlv_grp_flg8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_dlv_grp_flg8.addAliasName("Cnd.dlv_grp_flg8", p);
		p.Cnd_dlv_grp_cd8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_dlv_grp_cd8.addAliasName("Cnd.dlv_grp_cd8", p);
		p.Cnd_dlv_grp_nm8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_dlv_grp_nm8.addAliasName("Cnd.dlv_grp_nm8", p);
		p.Cnd_dlv_grp_lab9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_dlv_grp_lab9.addAliasName("Cnd.dlv_grp_lab9", p);
		p.Cnd_dlv_grp_flg9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_dlv_grp_flg9.addAliasName("Cnd.dlv_grp_flg9", p);
		p.Cnd_dlv_grp_cd9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_dlv_grp_cd9.addAliasName("Cnd.dlv_grp_cd9", p);
		p.Cnd_dlv_grp_nm9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_dlv_grp_nm9.addAliasName("Cnd.dlv_grp_nm9", p);
		p.Cnd_dlv_grp_lab10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_dlv_grp_lab10.addAliasName("Cnd.dlv_grp_lab10", p);
		p.Cnd_dlv_grp_flg10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_dlv_grp_flg10.addAliasName("Cnd.dlv_grp_flg10", p);
		p.Cnd_dlv_grp_cd10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_dlv_grp_cd10.addAliasName("Cnd.dlv_grp_cd10", p);
		p.Cnd_dlv_grp_nm10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_dlv_grp_nm10.addAliasName("Cnd.dlv_grp_nm10", p);
		p.Cnd_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().cst_grp_p());
		p.Cnd_cst_grp_p_PPanel.setName("Cnd.cst_grp_p");
		p.Cnd_cst_grp_lab1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_cst_grp_lab1.addAliasName("Cnd.cst_grp_lab1", p);
		p.Cnd_cst_grp_flg1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_cst_grp_flg1.addAliasName("Cnd.cst_grp_flg1", p);
		p.Cnd_cst_grp_cd1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_cst_grp_cd1.addAliasName("Cnd.cst_grp_cd1", p);
		p.Cnd_cst_grp_nm1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_cst_grp_nm1.addAliasName("Cnd.cst_grp_nm1", p);
		p.Cnd_cst_grp_lab2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_cst_grp_lab2.addAliasName("Cnd.cst_grp_lab2", p);
		p.Cnd_cst_grp_flg2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_cst_grp_flg2.addAliasName("Cnd.cst_grp_flg2", p);
		p.Cnd_cst_grp_cd2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_cst_grp_cd2.addAliasName("Cnd.cst_grp_cd2", p);
		p.Cnd_cst_grp_nm2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_cst_grp_nm2.addAliasName("Cnd.cst_grp_nm2", p);
		p.Cnd_cst_grp_lab3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_cst_grp_lab3.addAliasName("Cnd.cst_grp_lab3", p);
		p.Cnd_cst_grp_flg3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_cst_grp_flg3.addAliasName("Cnd.cst_grp_flg3", p);
		p.Cnd_cst_grp_cd3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_cst_grp_cd3.addAliasName("Cnd.cst_grp_cd3", p);
		p.Cnd_cst_grp_nm3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_cst_grp_nm3.addAliasName("Cnd.cst_grp_nm3", p);
		p.Cnd_cst_grp_lab4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_cst_grp_lab4.addAliasName("Cnd.cst_grp_lab4", p);
		p.Cnd_cst_grp_flg4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_cst_grp_flg4.addAliasName("Cnd.cst_grp_flg4", p);
		p.Cnd_cst_grp_cd4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_cst_grp_cd4.addAliasName("Cnd.cst_grp_cd4", p);
		p.Cnd_cst_grp_nm4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_cst_grp_nm4.addAliasName("Cnd.cst_grp_nm4", p);
		p.Cnd_cst_grp_lab5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_cst_grp_lab5.addAliasName("Cnd.cst_grp_lab5", p);
		p.Cnd_cst_grp_flg5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_cst_grp_flg5.addAliasName("Cnd.cst_grp_flg5", p);
		p.Cnd_cst_grp_cd5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_cst_grp_cd5.addAliasName("Cnd.cst_grp_cd5", p);
		p.Cnd_cst_grp_nm5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_cst_grp_nm5.addAliasName("Cnd.cst_grp_nm5", p);
		p.Cnd_cst_grp_lab6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_cst_grp_lab6.addAliasName("Cnd.cst_grp_lab6", p);
		p.Cnd_cst_grp_flg6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_cst_grp_flg6.addAliasName("Cnd.cst_grp_flg6", p);
		p.Cnd_cst_grp_cd6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_cst_grp_cd6.addAliasName("Cnd.cst_grp_cd6", p);
		p.Cnd_cst_grp_nm6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_cst_grp_nm6.addAliasName("Cnd.cst_grp_nm6", p);
		p.Cnd_cst_grp_lab7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_cst_grp_lab7.addAliasName("Cnd.cst_grp_lab7", p);
		p.Cnd_cst_grp_flg7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_cst_grp_flg7.addAliasName("Cnd.cst_grp_flg7", p);
		p.Cnd_cst_grp_cd7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_cst_grp_cd7.addAliasName("Cnd.cst_grp_cd7", p);
		p.Cnd_cst_grp_nm7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_cst_grp_nm7.addAliasName("Cnd.cst_grp_nm7", p);
		p.Cnd_cst_grp_lab8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_cst_grp_lab8.addAliasName("Cnd.cst_grp_lab8", p);
		p.Cnd_cst_grp_flg8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_cst_grp_flg8.addAliasName("Cnd.cst_grp_flg8", p);
		p.Cnd_cst_grp_cd8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_cst_grp_cd8.addAliasName("Cnd.cst_grp_cd8", p);
		p.Cnd_cst_grp_nm8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_cst_grp_nm8.addAliasName("Cnd.cst_grp_nm8", p);
		p.Cnd_cst_grp_lab9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_cst_grp_lab9.addAliasName("Cnd.cst_grp_lab9", p);
		p.Cnd_cst_grp_flg9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_cst_grp_flg9.addAliasName("Cnd.cst_grp_flg9", p);
		p.Cnd_cst_grp_cd9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_cst_grp_cd9.addAliasName("Cnd.cst_grp_cd9", p);
		p.Cnd_cst_grp_nm9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_cst_grp_nm9.addAliasName("Cnd.cst_grp_nm9", p);
		p.Cnd_cst_grp_lab10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_cst_grp_lab10.addAliasName("Cnd.cst_grp_lab10", p);
		p.Cnd_cst_grp_flg10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_cst_grp_flg10.addAliasName("Cnd.cst_grp_flg10", p);
		p.Cnd_cst_grp_cd10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_cst_grp_cd10.addAliasName("Cnd.cst_grp_cd10", p);
		p.Cnd_cst_grp_nm10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_cst_grp_nm10.addAliasName("Cnd.cst_grp_nm10", p);
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
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_CstFrcstSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_CstFrcstSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_CstFrcstSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$itm_p);
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
		p.Rslt_trd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$trd_qty_p);
		p.Rslt_trd_qty_p_PPanel.setName("Rslt.trd_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$base_qty_p);
		p.Rslt_base_qty_p_PPanel.setName("Rslt.base_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_last_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$last_qty_p);
		p.Rslt_last_qty_p_PPanel.setName("Rslt.last_qty_p");
		p.columnRslt_last_qty = p.Rslt_last_qty_p_PPanel.columnQty_qty;
		p.columnRslt_last_qty.addAliasName("Rslt.last_qty", p);
		p.Rslt_spln_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$spln_qty_p);
		p.Rslt_spln_qty_p_PPanel.setName("Rslt.spln_qty_p");
		p.columnRslt_spln_qty = p.Rslt_spln_qty_p_PPanel.columnQty_qty;
		p.columnRslt_spln_qty.addAliasName("Rslt.spln_qty", p);
		p.Rslt_slo_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$slo_qty_p);
		p.Rslt_slo_qty_p_PPanel.setName("Rslt.slo_qty_p");
		p.columnRslt_slo_qty = p.Rslt_slo_qty_p_PPanel.columnQty_qty;
		p.columnRslt_slo_qty.addAliasName("Rslt.slo_qty", p);
		p.Rslt_mly_net_frcst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$mly_net_frcst_qty_p);
		p.Rslt_mly_net_frcst_qty_p_PPanel.setName("Rslt.mly_net_frcst_qty_p");
		p.columnRslt_mly_net_frcst_qty = p.Rslt_mly_net_frcst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_mly_net_frcst_qty.addAliasName("Rslt.mly_net_frcst_qty", p);
		p.Rslt_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$prms_qty_p);
		p.Rslt_prms_qty_p_PPanel.setName("Rslt.prms_qty_p");
		p.columnRslt_prms_qty = p.Rslt_prms_qty_p_PPanel.columnQty_qty;
		p.columnRslt_prms_qty.addAliasName("Rslt.prms_qty", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$dlv_grp_p);
		p.Rslt_dlv_grp_p_PPanel.setName("Rslt.dlv_grp_p");
		p.columnRslt_dlv_grp_cd1 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_dlv_grp_cd1.addAliasName("Rslt.dlv_grp_cd1", p);
		p.columnRslt_dlv_grp_nm1 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_dlv_grp_nm1.addAliasName("Rslt.dlv_grp_nm1", p);
		p.columnRslt_dlv_grp_cd2 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_dlv_grp_cd2.addAliasName("Rslt.dlv_grp_cd2", p);
		p.columnRslt_dlv_grp_nm2 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_dlv_grp_nm2.addAliasName("Rslt.dlv_grp_nm2", p);
		p.columnRslt_dlv_grp_cd3 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_dlv_grp_cd3.addAliasName("Rslt.dlv_grp_cd3", p);
		p.columnRslt_dlv_grp_nm3 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_dlv_grp_nm3.addAliasName("Rslt.dlv_grp_nm3", p);
		p.columnRslt_dlv_grp_cd4 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_dlv_grp_cd4.addAliasName("Rslt.dlv_grp_cd4", p);
		p.columnRslt_dlv_grp_nm4 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_dlv_grp_nm4.addAliasName("Rslt.dlv_grp_nm4", p);
		p.columnRslt_dlv_grp_cd5 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_dlv_grp_cd5.addAliasName("Rslt.dlv_grp_cd5", p);
		p.columnRslt_dlv_grp_nm5 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_dlv_grp_nm5.addAliasName("Rslt.dlv_grp_nm5", p);
		p.columnRslt_dlv_grp_cd6 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_dlv_grp_cd6.addAliasName("Rslt.dlv_grp_cd6", p);
		p.columnRslt_dlv_grp_nm6 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_dlv_grp_nm6.addAliasName("Rslt.dlv_grp_nm6", p);
		p.columnRslt_dlv_grp_cd7 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_dlv_grp_cd7.addAliasName("Rslt.dlv_grp_cd7", p);
		p.columnRslt_dlv_grp_nm7 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_dlv_grp_nm7.addAliasName("Rslt.dlv_grp_nm7", p);
		p.columnRslt_dlv_grp_cd8 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_dlv_grp_cd8.addAliasName("Rslt.dlv_grp_cd8", p);
		p.columnRslt_dlv_grp_nm8 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_dlv_grp_nm8.addAliasName("Rslt.dlv_grp_nm8", p);
		p.columnRslt_dlv_grp_cd9 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_dlv_grp_cd9.addAliasName("Rslt.dlv_grp_cd9", p);
		p.columnRslt_dlv_grp_nm9 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_dlv_grp_nm9.addAliasName("Rslt.dlv_grp_nm9", p);
		p.columnRslt_dlv_grp_cd10 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_dlv_grp_cd10.addAliasName("Rslt.dlv_grp_cd10", p);
		p.columnRslt_dlv_grp_nm10 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_dlv_grp_nm10.addAliasName("Rslt.dlv_grp_nm10", p);
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$cst_grp_p);
		p.Rslt_cst_grp_p_PPanel.setName("Rslt.cst_grp_p");
		p.columnRslt_cst_grp_cd1 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_cst_grp_cd1.addAliasName("Rslt.cst_grp_cd1", p);
		p.columnRslt_cst_grp_nm1 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_cst_grp_nm1.addAliasName("Rslt.cst_grp_nm1", p);
		p.columnRslt_cst_grp_cd2 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_cst_grp_cd2.addAliasName("Rslt.cst_grp_cd2", p);
		p.columnRslt_cst_grp_nm2 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_cst_grp_nm2.addAliasName("Rslt.cst_grp_nm2", p);
		p.columnRslt_cst_grp_cd3 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_cst_grp_cd3.addAliasName("Rslt.cst_grp_cd3", p);
		p.columnRslt_cst_grp_nm3 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_cst_grp_nm3.addAliasName("Rslt.cst_grp_nm3", p);
		p.columnRslt_cst_grp_cd4 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_cst_grp_cd4.addAliasName("Rslt.cst_grp_cd4", p);
		p.columnRslt_cst_grp_nm4 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_cst_grp_nm4.addAliasName("Rslt.cst_grp_nm4", p);
		p.columnRslt_cst_grp_cd5 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_cst_grp_cd5.addAliasName("Rslt.cst_grp_cd5", p);
		p.columnRslt_cst_grp_nm5 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_cst_grp_nm5.addAliasName("Rslt.cst_grp_nm5", p);
		p.columnRslt_cst_grp_cd6 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_cst_grp_cd6.addAliasName("Rslt.cst_grp_cd6", p);
		p.columnRslt_cst_grp_nm6 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_cst_grp_nm6.addAliasName("Rslt.cst_grp_nm6", p);
		p.columnRslt_cst_grp_cd7 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_cst_grp_cd7.addAliasName("Rslt.cst_grp_cd7", p);
		p.columnRslt_cst_grp_nm7 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_cst_grp_nm7.addAliasName("Rslt.cst_grp_nm7", p);
		p.columnRslt_cst_grp_cd8 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_cst_grp_cd8.addAliasName("Rslt.cst_grp_cd8", p);
		p.columnRslt_cst_grp_nm8 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_cst_grp_nm8.addAliasName("Rslt.cst_grp_nm8", p);
		p.columnRslt_cst_grp_cd9 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_cst_grp_cd9.addAliasName("Rslt.cst_grp_cd9", p);
		p.columnRslt_cst_grp_nm9 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_cst_grp_nm9.addAliasName("Rslt.cst_grp_nm9", p);
		p.columnRslt_cst_grp_cd10 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_cst_grp_cd10.addAliasName("Rslt.cst_grp_cd10", p);
		p.columnRslt_cst_grp_nm10 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_cst_grp_nm10.addAliasName("Rslt.cst_grp_nm10", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBB.MSBBP0040.RsltR.$itm_grp_p);
		p.Rslt_itm_grp_p_PPanel.setName("Rslt.itm_grp_p");
		p.columnRslt_itm_grp_cd1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_itm_grp_cd1.addAliasName("Rslt.itm_grp_cd1", p);
		p.columnRslt_itm_grp_nm1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_itm_grp_nm1.addAliasName("Rslt.itm_grp_nm1", p);
		p.columnRslt_itm_grp_cd2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_itm_grp_cd2.addAliasName("Rslt.itm_grp_cd2", p);
		p.columnRslt_itm_grp_nm2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_itm_grp_nm2.addAliasName("Rslt.itm_grp_nm2", p);
		p.columnRslt_itm_grp_cd3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_itm_grp_cd3.addAliasName("Rslt.itm_grp_cd3", p);
		p.columnRslt_itm_grp_nm3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_itm_grp_nm3.addAliasName("Rslt.itm_grp_nm3", p);
		p.columnRslt_itm_grp_cd4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_itm_grp_cd4.addAliasName("Rslt.itm_grp_cd4", p);
		p.columnRslt_itm_grp_nm4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_itm_grp_nm4.addAliasName("Rslt.itm_grp_nm4", p);
		p.columnRslt_itm_grp_cd5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_itm_grp_cd5.addAliasName("Rslt.itm_grp_cd5", p);
		p.columnRslt_itm_grp_nm5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_itm_grp_nm5.addAliasName("Rslt.itm_grp_nm5", p);
		p.columnRslt_itm_grp_cd6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_itm_grp_cd6.addAliasName("Rslt.itm_grp_cd6", p);
		p.columnRslt_itm_grp_nm6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_itm_grp_nm6.addAliasName("Rslt.itm_grp_nm6", p);
		p.columnRslt_itm_grp_cd7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_itm_grp_cd7.addAliasName("Rslt.itm_grp_cd7", p);
		p.columnRslt_itm_grp_nm7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_itm_grp_nm7.addAliasName("Rslt.itm_grp_nm7", p);
		p.columnRslt_itm_grp_cd8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_itm_grp_cd8.addAliasName("Rslt.itm_grp_cd8", p);
		p.columnRslt_itm_grp_nm8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_itm_grp_nm8.addAliasName("Rslt.itm_grp_nm8", p);
		p.columnRslt_itm_grp_cd9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_itm_grp_cd9.addAliasName("Rslt.itm_grp_cd9", p);
		p.columnRslt_itm_grp_nm9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_itm_grp_nm9.addAliasName("Rslt.itm_grp_nm9", p);
		p.columnRslt_itm_grp_cd10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_itm_grp_cd10.addAliasName("Rslt.itm_grp_cd10", p);
		p.columnRslt_itm_grp_nm10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_itm_grp_nm10.addAliasName("Rslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_CstFrcstSrch p) {
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

	
	/** [Cnd_frcst_period_typ_ListPutter]の定義 */
	private MCListPutter Cnd_frcst_period_typ_p = null;

	/**
	 * [Cnd_frcst_period_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_frcst_period_typ_ListPutter() {
		if (Cnd_frcst_period_typ_p == null) {
			Cnd_frcst_period_typ_p = createCnd_frcst_period_typ_ListPutter(Cnd_frcst_period_typ, "frcst_period_typ", "frcst_period_typ_nm");

		}
		return Cnd_frcst_period_typ_p;
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
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
	}
	
	
	/** [Cnd_frcst_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_frcst_usr_cd_p = null;

	/**
	 * [Cnd_frcst_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_frcst_usr_cd_ListPutter() {
		if (Cnd_frcst_usr_cd_p == null) {
			Cnd_frcst_usr_cd_p = createCnd_frcst_usr_cd_ListPutter(Cnd_frcst_usr_cd, "frcst_usr_cd", "frcst_usr_nm");

		}
		return Cnd_frcst_usr_cd_p;
	}
	
	
	/** [Cnd_frcst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_frcst_dpt_cd_p = null;

	/**
	 * [Cnd_frcst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_frcst_dpt_cd_ListPutter() {
		if (Cnd_frcst_dpt_cd_p == null) {
			Cnd_frcst_dpt_cd_p = createCnd_frcst_dpt_cd_ListPutter(Cnd_frcst_dpt_cd, "frcst_dpt_cd", "frcst_dpt_nm");

		}
		return Cnd_frcst_dpt_cd_p;
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
	
	
	/** [Cnd_cst_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_itm_cd_p = null;

	/**
	 * [Cnd_cst_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_itm_cd_ListPutter() {
		if (Cnd_cst_itm_cd_p == null) {
			Cnd_cst_itm_cd_p = createCnd_cst_itm_cd_ListPutter(Cnd_cst_itm_cd, "cst_itm_cd", "cst_itm_nm");

		}
		return Cnd_cst_itm_cd_p;
	}
	
	
	/** [Cnd_can_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_can_rsn_cd_p = null;

	/**
	 * [Cnd_can_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_can_rsn_cd_ListPutter() {
		if (Cnd_can_rsn_cd_p == null) {
			Cnd_can_rsn_cd_p = createCnd_can_rsn_cd_ListPutter(Cnd_can_rsn_cd, "can_rsn_cd", "can_rsn_nm");

		}
		return Cnd_can_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_CstFrcstSrch create(){
		MSBBP_CstFrcstSrch p = new MSBBP_CstFrcstSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_CstFrcstSrch create(String name){
		MSBBP_CstFrcstSrch p = new MSBBP_CstFrcstSrch(name);
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
		MSBBP_CstFrcstSrch_MC.jbfInitSts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitDispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitTop((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitFold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitTab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitTab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitTab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitTab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitDlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitCstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitCtrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitRPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitRslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbfInitBtn((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitSts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitDispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitTop((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitFold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitTab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitTab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitTab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitTab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitDlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitCstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitCtrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitRPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitRslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.jbInitBtn((MSBBP_CstFrcstSrch)this);
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_CstFrcstSrch p) {
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
	protected static void jbfInitTab1(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_fix_f_flg = p.beansFactory.createCheckBox("Cnd.fix_f_flg");
		p.Cnd_fix_t_flg = p.beansFactory.createCheckBox("Cnd.fix_t_flg");
		p.Cnd_mode_Group = p.beansFactory.createButtonGroup("Cnd.mode");
		p.Cnd_mode_DTL = p.beansFactory.createRadioButton("Cnd.mode_DTL");
		p.Cnd_mode_HDR = p.beansFactory.createRadioButton("Cnd.mode_HDR");
		p.Cnd_cst_frcst_prnt_dt_fr_Label = p.beansFactory.createLabel("Cnd.cst_frcst_prnt_dt_fr_Label");
		p.Cnd_cst_frcst_prnt_dt_fr = p.beansFactory.createDateField("Cnd.cst_frcst_prnt_dt_fr");
		p.Cnd_cst_frcst_prnt_dt_fr.setLabel(p.Cnd_cst_frcst_prnt_dt_fr_Label);
		p.Cnd_cst_frcst_prnt_dt_to_Label = p.beansFactory.createLabel("Cnd.cst_frcst_prnt_dt_to_Label");
		p.Cnd_cst_frcst_prnt_dt_to = p.beansFactory.createDateField("Cnd.cst_frcst_prnt_dt_to");
		p.Cnd_cst_frcst_prnt_dt_to.setLabel(p.Cnd_cst_frcst_prnt_dt_to_Label);
		p.Cnd_rcpt_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcpt_dt_fr_Label");
		p.Cnd_rcpt_dt_fr = p.beansFactory.createDateField("Cnd.rcpt_dt_fr");
		p.Cnd_rcpt_dt_fr.setLabel(p.Cnd_rcpt_dt_fr_Label);
		p.Cnd_rcpt_dt_to_Label = p.beansFactory.createLabel("Cnd.rcpt_dt_to_Label");
		p.Cnd_rcpt_dt_to = p.beansFactory.createDateField("Cnd.rcpt_dt_to");
		p.Cnd_rcpt_dt_to.setLabel(p.Cnd_rcpt_dt_to_Label);
		p.Cnd_frcst_st_dt_fr_Label = p.beansFactory.createLabel("Cnd.frcst_st_dt_fr_Label");
		p.Cnd_frcst_st_dt_fr = p.beansFactory.createDateField("Cnd.frcst_st_dt_fr");
		p.Cnd_frcst_st_dt_fr.setLabel(p.Cnd_frcst_st_dt_fr_Label);
		p.Cnd_frcst_st_dt_to_Label = p.beansFactory.createLabel("Cnd.frcst_st_dt_to_Label");
		p.Cnd_frcst_st_dt_to = p.beansFactory.createDateField("Cnd.frcst_st_dt_to");
		p.Cnd_frcst_st_dt_to.setLabel(p.Cnd_frcst_st_dt_to_Label);
		p.Cnd_frcst_end_dt_fr_Label = p.beansFactory.createLabel("Cnd.frcst_end_dt_fr_Label");
		p.Cnd_frcst_end_dt_fr = p.beansFactory.createDateField("Cnd.frcst_end_dt_fr");
		p.Cnd_frcst_end_dt_fr.setLabel(p.Cnd_frcst_end_dt_fr_Label);
		p.Cnd_frcst_end_dt_to_Label = p.beansFactory.createLabel("Cnd.frcst_end_dt_to_Label");
		p.Cnd_frcst_end_dt_to = p.beansFactory.createDateField("Cnd.frcst_end_dt_to");
		p.Cnd_frcst_end_dt_to.setLabel(p.Cnd_frcst_end_dt_to_Label);
		p.Cnd_frcst_dt_fr_Label = p.beansFactory.createLabel("Cnd.frcst_dt_fr_Label");
		p.Cnd_frcst_dt_fr = p.beansFactory.createDateField("Cnd.frcst_dt_fr");
		p.Cnd_frcst_dt_fr.setLabel(p.Cnd_frcst_dt_fr_Label);
		p.Cnd_frcst_dt_to_Label = p.beansFactory.createLabel("Cnd.frcst_dt_to_Label");
		p.Cnd_frcst_dt_to = p.beansFactory.createDateField("Cnd.frcst_dt_to");
		p.Cnd_frcst_dt_to.setLabel(p.Cnd_frcst_dt_to_Label);
		p.Cnd_frcst_period_typ_Label = p.beansFactory.createLabel("Cnd.frcst_period_typ_Label");
		p.Cnd_frcst_period_typ = p.beansFactory.createTextComboBox("Cnd.frcst_period_typ");
		p.Cnd_frcst_period_typ.setLabel(p.Cnd_frcst_period_typ_Label);
		p.Cnd_frcst_period_typ_nm = p.beansFactory.createTextField("Cnd.frcst_period_typ_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_frcst_usr_cd_Label = p.beansFactory.createLabel("Cnd.frcst_usr_cd_Label");
		p.Cnd_frcst_usr_cd = p.beansFactory.createTextField("Cnd.frcst_usr_cd");
		p.Cnd_frcst_usr_cd.setLabel(p.Cnd_frcst_usr_cd_Label);
		p.Cnd_frcst_usr_nm = p.beansFactory.createTextField("Cnd.frcst_usr_nm");
		p.Cnd_frcst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.frcst_dpt_cd_Label");
		p.Cnd_frcst_dpt_cd = p.beansFactory.createTextField("Cnd.frcst_dpt_cd");
		p.Cnd_frcst_dpt_cd.setLabel(p.Cnd_frcst_dpt_cd_Label);
		p.Cnd_frcst_dpt_nm = p.beansFactory.createTextField("Cnd.frcst_dpt_nm");
		p.Cnd_cst_frcst_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_no_Label");
		p.Cnd_cst_frcst_no = p.beansFactory.createTextField("Cnd.cst_frcst_no");
		p.Cnd_cst_frcst_no.setLabel(p.Cnd_cst_frcst_no_Label);
		p.Cnd_cst_frcst_d_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_d_no_Label");
		p.Cnd_cst_frcst_d_no = p.beansFactory.createTextField("Cnd.cst_frcst_d_no");
		p.Cnd_cst_frcst_d_no.setLabel(p.Cnd_cst_frcst_d_no_Label);
		p.Cnd_cst_frcst_slip_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_slip_no_Label");
		p.Cnd_cst_frcst_slip_no = p.beansFactory.createTextField("Cnd.cst_frcst_slip_no");
		p.Cnd_cst_frcst_slip_no.setLabel(p.Cnd_cst_frcst_slip_no_Label);
		p.Cnd_cst_frcst_slip_d_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_slip_d_no_Label");
		p.Cnd_cst_frcst_slip_d_no = p.beansFactory.createTextField("Cnd.cst_frcst_slip_d_no");
		p.Cnd_cst_frcst_slip_d_no.setLabel(p.Cnd_cst_frcst_slip_d_no_Label);
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_except_frcst_stop_flg = p.beansFactory.createCheckBox("Cnd.except_frcst_stop_flg");
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_can_rsn_cd_Label = p.beansFactory.createLabel("Cnd.can_rsn_cd_Label");
		p.Cnd_can_rsn_cd = p.beansFactory.createTextComboBox("Cnd.can_rsn_cd");
		p.Cnd_can_rsn_cd.setLabel(p.Cnd_can_rsn_cd_Label);
		p.Cnd_can_rsn_nm = p.beansFactory.createTextField("Cnd.can_rsn_nm");
		p.Cnd_can_rmrks_Label = p.beansFactory.createLabel("Cnd.can_rmrks_Label");
		p.Cnd_can_rmrks = p.beansFactory.createTextField("Cnd.can_rmrks");
		p.Cnd_can_rmrks.setLabel(p.Cnd_can_rmrks_Label);
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
		p.Cnd_dtl_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.dtl_intr_rmrks_Label");
		p.Cnd_dtl_intr_rmrks = p.beansFactory.createTextField("Cnd.dtl_intr_rmrks");
		p.Cnd_dtl_intr_rmrks.setLabel(p.Cnd_dtl_intr_rmrks_Label);
		p.Cnd_dtl_sub_char1_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char1_Label");
		p.Cnd_dtl_sub_char1 = p.beansFactory.createTextField("Cnd.dtl_sub_char1");
		p.Cnd_dtl_sub_char1.setLabel(p.Cnd_dtl_sub_char1_Label);
		p.Cnd_dtl_sub_char2_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char2_Label");
		p.Cnd_dtl_sub_char2 = p.beansFactory.createTextField("Cnd.dtl_sub_char2");
		p.Cnd_dtl_sub_char2.setLabel(p.Cnd_dtl_sub_char2_Label);
		p.Cnd_dtl_sub_char3_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char3_Label");
		p.Cnd_dtl_sub_char3 = p.beansFactory.createTextField("Cnd.dtl_sub_char3");
		p.Cnd_dtl_sub_char3.setLabel(p.Cnd_dtl_sub_char3_Label);
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_cst_frcst_no = p.beansFactory.createTableColumn("Rslt.cst_frcst_no", MCColumnType.TEXT);
		p.columnRslt_cst_frcst_prnt_dt = p.beansFactory.createTableColumn("Rslt.cst_frcst_prnt_dt", MCColumnType.DATE);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_nm = p.beansFactory.createTableColumn("Rslt.dlv_nm", MCColumnType.TEXT);
		p.columnRslt_frcst_dpt_cd = p.beansFactory.createTableColumn("Rslt.frcst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_frcst_dpt_nm = p.beansFactory.createTableColumn("Rslt.frcst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_frcst_usr_cd = p.beansFactory.createTableColumn("Rslt.frcst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_frcst_usr_nm = p.beansFactory.createTableColumn("Rslt.frcst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_wrk_nm = p.beansFactory.createTableColumn("Rslt.wrk_nm", MCColumnType.TEXT);
		p.columnRslt_rcpt_dt = p.beansFactory.createTableColumn("Rslt.rcpt_dt", MCColumnType.DATE);
		p.columnRslt_cst_frcst_slip_no = p.beansFactory.createTableColumn("Rslt.cst_frcst_slip_no", MCColumnType.TEXT);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_can_rsn_cd = p.beansFactory.createTableColumn("Rslt.can_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_can_rsn_nm = p.beansFactory.createTableColumn("Rslt.can_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_can_rmrks = p.beansFactory.createTableColumn("Rslt.can_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_frcst_period_typ = p.beansFactory.createTableColumn("Rslt.frcst_period_typ", MCColumnType.TEXT);
		p.columnRslt_frcst_period_typ_nm = p.beansFactory.createTableColumn("Rslt.frcst_period_typ_nm", MCColumnType.TEXT);
		p.columnRslt_frcst_st_dt = p.beansFactory.createTableColumn("Rslt.frcst_st_dt", MCColumnType.DATE);
		p.columnRslt_frcst_end_dt = p.beansFactory.createTableColumn("Rslt.frcst_end_dt", MCColumnType.DATE);
		p.columnRslt_frcst_dt = p.beansFactory.createTableColumn("Rslt.frcst_dt", MCColumnType.DATE);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_qty_dec_place = p.beansFactory.createTableColumn("Rslt.qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_qty_dec_place = p.beansFactory.createTableColumn("Rslt.base_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_last_cst_frcst_prnt_dt = p.beansFactory.createTableColumn("Rslt.last_cst_frcst_prnt_dt", MCColumnType.DATE);
		p.columnRslt_last_rcpt_dt = p.beansFactory.createTableColumn("Rslt.last_rcpt_dt", MCColumnType.DATE);
		p.columnRslt_gi_loc_cd = p.beansFactory.createTableColumn("Rslt.gi_loc_cd", MCColumnType.TEXT);
		p.columnRslt_gi_loc_nm = p.beansFactory.createTableColumn("Rslt.gi_loc_nm", MCColumnType.TEXT);
		p.columnRslt_cst_frcst_slip_d_no = p.beansFactory.createTableColumn("Rslt.cst_frcst_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_frcst_stop_flg = p.beansFactory.createTableColumn("Rslt.frcst_stop_flg", MCColumnType.CHECK);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_dtl_intr_rmrks = p.beansFactory.createTableColumn("Rslt.dtl_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char1 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char1", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char2 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char2", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char3 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char3", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_cst_frcst_d_no = p.beansFactory.createTableColumn("Rslt.cst_frcst_d_no", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP0010 = p.beansFactory.createButton("Btn.open_MSBBP0010", "open");
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.setLastBeans(p.StsPanel);
		p.StsPanel.setNextBeans(p.DispUnitPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit(MSBBP_CstFrcstSrch p) {
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
	protected static void jbInitTop(MSBBP_CstFrcstSrch p) {
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBBP_CstFrcstSrch p) {
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
	protected static void jbInitTab1(MSBBP_CstFrcstSrch p) {
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
	protected static void jbInitTab2(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.DlvCndPanel, null);
		p.Tab2Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.CstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.CstCndPanel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.StsPanel.add(p.Cnd_fix_f_flg);
		p.StsPanel.setLastBeans(p.Cnd_fix_f_flg);
		p.Cnd_fix_f_flg.setNextBeans(p.Cnd_fix_t_flg);
		p.Cnd_fix_f_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.fix_f_flg_META);
		p.StsPanel.add(p.Cnd_fix_t_flg);
		p.Cnd_fix_t_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.fix_t_flg_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_mode_Group);
		p.Cnd_mode_Group.setFirstBeans(p.Cnd_mode_DTL);
		p.Cnd_mode_DTL.setActionCommand("0");
		p.Cnd_mode_Group.add(p.Cnd_mode_DTL);
		p.DispUnitPanel.add(p.Cnd_mode_DTL);
		p.Cnd_mode_DTL.setNextBeans(p.Cnd_mode_HDR);
		p.Cnd_mode_HDR.setActionCommand("1");
		p.Cnd_mode_Group.add(p.Cnd_mode_HDR);
		p.DispUnitPanel.add(p.Cnd_mode_HDR);
		p.Cnd_mode_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.mode_META);
		p.CndPanel.add(p.Cnd_cst_frcst_prnt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_prnt_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_cst_frcst_prnt_dt_fr);
		p.Cnd_cst_frcst_prnt_dt_fr.setNextBeans(p.Cnd_cst_frcst_prnt_dt_to);
		p.Cnd_cst_frcst_prnt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_frcst_prnt_dt_fr_META);
		p.Cnd_cst_frcst_prnt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_cst_frcst_prnt_dt_to_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_prnt_dt_to);
		p.Cnd_cst_frcst_prnt_dt_to.setNextBeans(p.Cnd_rcpt_dt_fr);
		p.Cnd_cst_frcst_prnt_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_frcst_prnt_dt_to_META);
		p.Cnd_cst_frcst_prnt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcpt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcpt_dt_fr);
		p.Cnd_rcpt_dt_fr.setNextBeans(p.Cnd_rcpt_dt_to);
		p.Cnd_rcpt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.rcpt_dt_fr_META);
		p.Cnd_rcpt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcpt_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcpt_dt_to);
		p.Cnd_rcpt_dt_to.setNextBeans(p.Cnd_frcst_st_dt_fr);
		p.Cnd_rcpt_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.rcpt_dt_to_META);
		p.Cnd_rcpt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_frcst_st_dt_fr_Label);
		p.CndPanel.add(p.Cnd_frcst_st_dt_fr);
		p.Cnd_frcst_st_dt_fr.setNextBeans(p.Cnd_frcst_st_dt_to);
		p.Cnd_frcst_st_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_st_dt_fr_META);
		p.Cnd_frcst_st_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_frcst_st_dt_to_Label);
		p.CndPanel.add(p.Cnd_frcst_st_dt_to);
		p.Cnd_frcst_st_dt_to.setNextBeans(p.Cnd_frcst_end_dt_fr);
		p.Cnd_frcst_st_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_st_dt_to_META);
		p.Cnd_frcst_st_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_frcst_end_dt_fr_Label);
		p.CndPanel.add(p.Cnd_frcst_end_dt_fr);
		p.Cnd_frcst_end_dt_fr.setNextBeans(p.Cnd_frcst_end_dt_to);
		p.Cnd_frcst_end_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_end_dt_fr_META);
		p.Cnd_frcst_end_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_frcst_end_dt_to_Label);
		p.CndPanel.add(p.Cnd_frcst_end_dt_to);
		p.Cnd_frcst_end_dt_to.setNextBeans(p.Cnd_frcst_dt_fr);
		p.Cnd_frcst_end_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_end_dt_to_META);
		p.Cnd_frcst_end_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_frcst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_frcst_dt_fr);
		p.Cnd_frcst_dt_fr.setNextBeans(p.Cnd_frcst_dt_to);
		p.Cnd_frcst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_dt_fr_META);
		p.Cnd_frcst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_frcst_dt_to_Label);
		p.CndPanel.add(p.Cnd_frcst_dt_to);
		p.Cnd_frcst_dt_to.setNextBeans(p.Cnd_frcst_period_typ);
		p.Cnd_frcst_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_dt_to_META);
		p.Cnd_frcst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_frcst_period_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_frcst_period_typ, true);
		p.Cnd_frcst_period_typ.setLinkBeans(p.Cnd_frcst_period_typ_nm);
		p.CndPanel.add(p.Cnd_frcst_period_typ_Label);
		p.CndPanel.add(p.Cnd_frcst_period_typ);
		p.Cnd_frcst_period_typ.setNextBeans(p.Cnd_frcst_period_typ_nm);
		p.Cnd_frcst_period_typ.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_period_typ_META);
		p.CndPanel.add(p.Cnd_frcst_period_typ_nm);
		p.Cnd_frcst_period_typ_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_frcst_period_typ_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_period_typ_nm_META);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_frcst_usr_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_frcst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_frcst_usr_cd);
		p.Cnd_frcst_usr_cd.setNextBeans(p.Cnd_frcst_usr_nm);
		p.Cnd_frcst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_usr_cd_META);
		p.Cnd_frcst_usr_cd.addLinkBeans(p.Cnd_frcst_usr_nm);
		p.Cnd_frcst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_frcst_usr_cd, true);
		p.CndPanel.add(p.Cnd_frcst_usr_nm);
		p.Cnd_frcst_usr_nm.setNextBeans(p.Cnd_frcst_dpt_cd);
		p.Cnd_frcst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_frcst_usr_nm, true);
		p.CndPanel.add(p.Cnd_frcst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_frcst_dpt_cd);
		p.Cnd_frcst_dpt_cd.setNextBeans(p.Cnd_frcst_dpt_nm);
		p.Cnd_frcst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_dpt_cd_META);
		p.Cnd_frcst_dpt_cd.addLinkBeans(p.Cnd_frcst_dpt_nm);
		p.Cnd_frcst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_frcst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_frcst_dpt_nm);
		p.Cnd_frcst_dpt_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_frcst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.frcst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_frcst_dpt_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_cst_frcst_no);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no, true);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setLinkBeans(p.Cnd_wrk_nm);
		p.setPluralValueEnable(p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_cst_frcst_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_no);
		p.Cnd_cst_frcst_no.setNextBeans(p.Cnd_cst_frcst_d_no);
		p.Cnd_cst_frcst_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_frcst_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_no, true);
		p.CndPanel.add(p.Cnd_cst_frcst_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_d_no);
		p.Cnd_cst_frcst_d_no.setNextBeans(p.Cnd_cst_frcst_slip_no);
		p.Cnd_cst_frcst_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_frcst_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_d_no, true);
		p.CndPanel.add(p.Cnd_cst_frcst_slip_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_slip_no);
		p.Cnd_cst_frcst_slip_no.setNextBeans(p.Cnd_cst_frcst_slip_d_no);
		p.Cnd_cst_frcst_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_frcst_slip_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_slip_no, true);
		p.CndPanel.add(p.Cnd_cst_frcst_slip_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_slip_d_no);
		p.Cnd_cst_frcst_slip_d_no.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_cst_frcst_slip_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_frcst_slip_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_slip_d_no, true);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_except_frcst_stop_flg);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.latest_flg_META);
		p.CndPanel.add(p.Cnd_except_frcst_stop_flg);
		p.Cnd_except_frcst_stop_flg.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_except_frcst_stop_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.except_frcst_stop_flg_META);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.inc_can_flg_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_can_rsn_cd);
		p.Cnd_can_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_can_rsn_cd, true);
		p.Cnd_can_rsn_cd.setLinkBeans(p.Cnd_can_rsn_nm);
		p.CndPanel.add(p.Cnd_can_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_can_rsn_cd);
		p.Cnd_can_rsn_cd.setNextBeans(p.Cnd_can_rsn_nm);
		p.Cnd_can_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.can_rsn_cd_META);
		p.CndPanel.add(p.Cnd_can_rsn_nm);
		p.Cnd_can_rsn_nm.setNextBeans(p.Cnd_can_rmrks);
		p.Cnd_can_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.can_rsn_nm_META);
		p.CndPanel.add(p.Cnd_can_rmrks_Label);
		p.CndPanel.add(p.Cnd_can_rmrks);
		p.Cnd_can_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_can_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.can_rmrks_META);
		p.setPluralValueEnable(p.Cnd_can_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_intr_rmrks);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dtl_intr_rmrks.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.dtl_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dtl_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP0040.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.CstCndPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstCndPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_CstFrcstSrch p) {
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
	protected static void jbInitRPnl(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
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
	protected static void jbInitRslt(MSBBP_CstFrcstSrch p) {
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
	protected static void jbInitBtn(MSBBP_CstFrcstSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP0010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP0010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP0010);
		p.Btn_open_MSBBP0010.setNextBeans(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBBP1210);
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
		MSBBP_CstFrcstSrch_MC.mcInitSts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitDispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitTop((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitFold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitTab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitTab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitTab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitTab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitDlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitCstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitCtrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitRPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitRslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.mcInitBtn((MSBBP_CstFrcstSrch)this);

		// [SRCH_DTL]ステータスのモードの設定
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Sts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_DispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Top((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Fold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Tab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Tab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Tab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Tab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Cnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_DlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_CstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_ItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Ctrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_RPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Rslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__DTL_Btn((MSBBP_CstFrcstSrch)this);

		// [SRCH_HDR]ステータスのモードの設定
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Sts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_DispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Top((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Fold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Tab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Tab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Tab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Tab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Cnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_DlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_CstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_ItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Ctrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_RPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Rslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitSRCH__HDR_Btn((MSBBP_CstFrcstSrch)this);

		// [REF_DTL]ステータスのモードの設定
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Sts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_DispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Top((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Fold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Tab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Tab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Tab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Tab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Cnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_DlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_CstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_ItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Ctrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_RPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Rslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__DTL_Btn((MSBBP_CstFrcstSrch)this);

		// [REF_HDR]ステータスのモードの設定
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Sts((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_DispUnit((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Top((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Fold((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Tab1((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Tab2((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Tab3((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Tab4((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Cnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_DlvCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_CstCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_ItmCnd((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Ctrl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_RPnl((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Rslt((MSBBP_CstFrcstSrch)this);
		MSBBP_CstFrcstSrch_MC.statusInitREF__HDR_Btn((MSBBP_CstFrcstSrch)this);

	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_CstFrcstSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_CstFrcstSrch p) {
		p.Cnd_fix_f_flg.addAllListener(p);
		p.Cnd_fix_t_flg.addAllListener(p);
		p.Cnd_mode_Group.addAllListener(p);
		p.Cnd_mode_DTL.addAllListener(p);
		p.Cnd_mode_HDR.addAllListener(p);
		p.Cnd_cst_frcst_prnt_dt_fr.setListListener(p);
		p.Cnd_cst_frcst_prnt_dt_fr.addAllListener(p);
		p.Cnd_cst_frcst_prnt_dt_to.setListListener(p);
		p.Cnd_cst_frcst_prnt_dt_to.addAllListener(p);
		p.Cnd_rcpt_dt_fr.setListListener(p);
		p.Cnd_rcpt_dt_fr.addAllListener(p);
		p.Cnd_rcpt_dt_to.setListListener(p);
		p.Cnd_rcpt_dt_to.addAllListener(p);
		p.Cnd_frcst_st_dt_fr.setListListener(p);
		p.Cnd_frcst_st_dt_fr.addAllListener(p);
		p.Cnd_frcst_st_dt_to.setListListener(p);
		p.Cnd_frcst_st_dt_to.addAllListener(p);
		p.Cnd_frcst_end_dt_fr.setListListener(p);
		p.Cnd_frcst_end_dt_fr.addAllListener(p);
		p.Cnd_frcst_end_dt_to.setListListener(p);
		p.Cnd_frcst_end_dt_to.addAllListener(p);
		p.Cnd_frcst_dt_fr.setListListener(p);
		p.Cnd_frcst_dt_fr.addAllListener(p);
		p.Cnd_frcst_dt_to.setListListener(p);
		p.Cnd_frcst_dt_to.addAllListener(p);
		p.Cnd_frcst_period_typ.setListListener(p);
		p.Cnd_frcst_period_typ.addAllListener(p);
		p.Cnd_frcst_period_typ_nm.setListListener(p);
		p.Cnd_frcst_period_typ_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_frcst_usr_cd.setListListener(p);
		p.Cnd_frcst_usr_cd.addAllListener(p);
		p.Cnd_frcst_usr_nm.setListListener(p);
		p.Cnd_frcst_usr_nm.addAllListener(p);
		p.Cnd_frcst_dpt_cd.setListListener(p);
		p.Cnd_frcst_dpt_cd.addAllListener(p);
		p.Cnd_frcst_dpt_nm.setListListener(p);
		p.Cnd_frcst_dpt_nm.addAllListener(p);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_frcst_no.setListListener(p);
		p.Cnd_cst_frcst_no.addAllListener(p);
		p.Cnd_cst_frcst_d_no.setListListener(p);
		p.Cnd_cst_frcst_d_no.addAllListener(p);
		p.Cnd_cst_frcst_slip_no.setListListener(p);
		p.Cnd_cst_frcst_slip_no.addAllListener(p);
		p.Cnd_cst_frcst_slip_d_no.setListListener(p);
		p.Cnd_cst_frcst_slip_d_no.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_except_frcst_stop_flg.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_can_rsn_cd.setListListener(p);
		p.Cnd_can_rsn_cd.addAllListener(p);
		p.Cnd_can_rsn_nm.setListListener(p);
		p.Cnd_can_rsn_nm.addAllListener(p);
		p.Cnd_can_rmrks.setListListener(p);
		p.Cnd_can_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_dtl_intr_rmrks.setListListener(p);
		p.Cnd_dtl_intr_rmrks.addAllListener(p);
		p.Cnd_dtl_sub_char1.setListListener(p);
		p.Cnd_dtl_sub_char1.addAllListener(p);
		p.Cnd_dtl_sub_char2.setListListener(p);
		p.Cnd_dtl_sub_char2.addAllListener(p);
		p.Cnd_dtl_sub_char3.setListListener(p);
		p.Cnd_dtl_sub_char3.addAllListener(p);
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBBP_CstFrcstSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_CstFrcstSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_CstFrcstSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_CstFrcstSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_cst_frcst_no.addAllListener(p);
		p.columnRslt_cst_frcst_no.setListListener(p);
		p.columnRslt_cst_frcst_prnt_dt.addAllListener(p);
		p.columnRslt_cst_frcst_prnt_dt.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dlv_nm.addAllListener(p);
		p.columnRslt_dlv_nm.setListListener(p);
		p.columnRslt_frcst_dpt_cd.addAllListener(p);
		p.columnRslt_frcst_dpt_cd.setListListener(p);
		p.columnRslt_frcst_dpt_nm.addAllListener(p);
		p.columnRslt_frcst_dpt_nm.setListListener(p);
		p.columnRslt_frcst_usr_cd.addAllListener(p);
		p.columnRslt_frcst_usr_cd.setListListener(p);
		p.columnRslt_frcst_usr_nm.addAllListener(p);
		p.columnRslt_frcst_usr_nm.setListListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_wrk_nm.addAllListener(p);
		p.columnRslt_wrk_nm.setListListener(p);
		p.columnRslt_rcpt_dt.addAllListener(p);
		p.columnRslt_rcpt_dt.setListListener(p);
		p.columnRslt_cst_frcst_slip_no.addAllListener(p);
		p.columnRslt_cst_frcst_slip_no.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_can_rsn_cd.addAllListener(p);
		p.columnRslt_can_rsn_cd.setListListener(p);
		p.columnRslt_can_rsn_nm.addAllListener(p);
		p.columnRslt_can_rsn_nm.setListListener(p);
		p.columnRslt_can_rmrks.addAllListener(p);
		p.columnRslt_can_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_frcst_period_typ.addAllListener(p);
		p.columnRslt_frcst_period_typ.setListListener(p);
		p.columnRslt_frcst_period_typ_nm.addAllListener(p);
		p.columnRslt_frcst_period_typ_nm.setListListener(p);
		p.columnRslt_frcst_st_dt.addAllListener(p);
		p.columnRslt_frcst_st_dt.setListListener(p);
		p.columnRslt_frcst_end_dt.addAllListener(p);
		p.columnRslt_frcst_end_dt.setListListener(p);
		p.columnRslt_frcst_dt.addAllListener(p);
		p.columnRslt_frcst_dt.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_qty_dec_place.addAllListener(p);
		p.columnRslt_qty_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_qty_dec_place.addAllListener(p);
		p.columnRslt_base_qty_dec_place.setListListener(p);
		p.columnRslt_last_cst_frcst_prnt_dt.addAllListener(p);
		p.columnRslt_last_cst_frcst_prnt_dt.setListListener(p);
		p.columnRslt_last_rcpt_dt.addAllListener(p);
		p.columnRslt_last_rcpt_dt.setListListener(p);
		p.columnRslt_gi_loc_cd.addAllListener(p);
		p.columnRslt_gi_loc_cd.setListListener(p);
		p.columnRslt_gi_loc_nm.addAllListener(p);
		p.columnRslt_gi_loc_nm.setListListener(p);
		p.columnRslt_cst_frcst_slip_d_no.addAllListener(p);
		p.columnRslt_cst_frcst_slip_d_no.setListListener(p);
		p.columnRslt_frcst_stop_flg.addAllListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_dtl_intr_rmrks.addAllListener(p);
		p.columnRslt_dtl_intr_rmrks.setListListener(p);
		p.columnRslt_dtl_sub_char1.addAllListener(p);
		p.columnRslt_dtl_sub_char1.setListListener(p);
		p.columnRslt_dtl_sub_char2.addAllListener(p);
		p.columnRslt_dtl_sub_char2.setListListener(p);
		p.columnRslt_dtl_sub_char3.addAllListener(p);
		p.columnRslt_dtl_sub_char3.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_cst_frcst_d_no.addAllListener(p);
		p.columnRslt_cst_frcst_d_no.setListListener(p);
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
	protected static void mcInitBtn(MSBBP_CstFrcstSrch p) {
		p.Btn_open_MSBBP0010.addAllListener(p);
		p.Btn_open_MSBBP0010.setAPMethodName("doBtn_open_MSBBP0010");
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
	}

	/**
	 * [SRCH_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Sts(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_DispUnit(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Top(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fold(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab1(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab2(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab3(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab4(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Cnd(MSBBP_CstFrcstSrch p){
		p.Cnd_fix_f_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_fix_t_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_mode_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_cst_frcst_prnt_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_prnt_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_st_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_st_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_end_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_end_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_period_typ.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_period_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_usr_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_usr_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dpt_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dpt_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_cst_frcst_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_slip_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_slip_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_except_frcst_stop_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_can_rsn_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_can_rsn_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_can_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_DlvCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_CstCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ItmCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Ctrl(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_RPnl(MSBBP_CstFrcstSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Rslt(MSBBP_CstFrcstSrch p){
		p.columnRslt_cst_frcst_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_prnt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_slip_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_frcst_period_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_period_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_st_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_end_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_qty_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_last_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_last_cst_frcst_prnt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_last_rcpt_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_spln_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_slo_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_mly_net_frcst_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_slip_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_prms_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_frcst_stop_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Btn(MSBBP_CstFrcstSrch p){
		p.Btn_open_MSBBP0010.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH_DTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Sts(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DispUnit(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Top(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab1(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab2(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab3(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab4(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Cnd(MSBBP_CstFrcstSrch p){
		p.Cnd_fix_f_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_fix_t_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_cst_frcst_prnt_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_frcst_prnt_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_frcst_st_dt_fr.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_st_dt_to.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_end_dt_fr.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_end_dt_to.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_dt_fr.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_dt_to.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_period_typ.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_period_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_frcst_usr_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_frcst_usr_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_frcst_dpt_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_frcst_dpt_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_cst_frcst_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_frcst_slip_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_cst_frcst_slip_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_except_frcst_stop_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_can_rsn_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_can_rsn_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_can_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DlvCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_CstCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ItmCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Ctrl(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_RPnl(MSBBP_CstFrcstSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Rslt(MSBBP_CstFrcstSrch p){
		p.columnRslt_cst_frcst_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_prnt_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_slip_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_frcst_period_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_period_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_st_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_end_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_qty_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_last_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_last_cst_frcst_prnt_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_last_rcpt_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_spln_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_slo_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_mly_net_frcst_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_gi_loc_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_gi_loc_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_slip_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_prms_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_frcst_stop_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Btn(MSBBP_CstFrcstSrch p){
		p.Btn_open_MSBBP0010.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Sts(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DispUnit(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab4(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBBP_CstFrcstSrch p){
		p.Cnd_fix_f_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_fix_t_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_mode_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_cst_frcst_prnt_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_prnt_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_st_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_st_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_end_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_end_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_period_typ.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_period_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_usr_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_usr_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_frcst_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_cst_frcst_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_slip_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_frcst_slip_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_except_frcst_stop_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_can_rsn_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_can_rsn_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_can_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DlvCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_CstCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBBP_CstFrcstSrch p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Rslt(MSBBP_CstFrcstSrch p){
		p.columnRslt_cst_frcst_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_prnt_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_frcst_period_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_period_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_st_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_end_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_frcst_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_qty_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.columnQty_qty.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_last_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_last_cst_frcst_prnt_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_last_rcpt_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_spln_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_slo_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_mly_net_frcst_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_prms_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_frcst_stop_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitREF__DTL_Btn(MSBBP_CstFrcstSrch p){
		p.Btn_open_MSBBP0010.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Sts(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DispUnit(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab4(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBBP_CstFrcstSrch p){
		p.Cnd_fix_f_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_fix_t_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_cst_frcst_prnt_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_frcst_prnt_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_frcst_st_dt_fr.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_st_dt_to.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_end_dt_fr.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_end_dt_to.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_dt_fr.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_dt_to.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_period_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_frcst_period_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_frcst_usr_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_frcst_usr_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_frcst_dpt_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_frcst_dpt_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_cst_frcst_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_frcst_slip_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_cst_frcst_slip_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_except_frcst_stop_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_can_rsn_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_can_rsn_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_can_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DlvCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_CstCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmCnd(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBBP_CstFrcstSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBBP_CstFrcstSrch p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Rslt(MSBBP_CstFrcstSrch p){
		p.columnRslt_cst_frcst_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_prnt_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_frcst_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_wrk_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_slip_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_rsn_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_frcst_period_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_period_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_st_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_end_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_frcst_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_qty_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_last_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_last_cst_frcst_prnt_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_last_rcpt_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_spln_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_slo_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_mly_net_frcst_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_gi_loc_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_gi_loc_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_slip_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_prms_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_frcst_stop_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_intr_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBBP_CstFrcstSrch p){
		p.Btn_open_MSBBP0010.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_DTL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_CstFrcstSrch_MC.setTableConfigRslt((MSBBP_CstFrcstSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_CstFrcstSrch p) {
		p.columnRslt_cst_frcst_no.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_frcst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_no);
		p.columnRslt_cst_frcst_prnt_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_frcst_prnt_dt_META);
		p.columnRslt_cst_frcst_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_prnt_dt);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dlv_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_nm);
		p.columnRslt_frcst_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_dpt_cd);
		p.columnRslt_frcst_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_dpt_nm);
		p.columnRslt_frcst_usr_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_usr_cd);
		p.columnRslt_frcst_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_usr_nm);
		p.columnRslt_wrk_no.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_wrk_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.wrk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_nm);
		p.columnRslt_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.rcpt_dt_META);
		p.columnRslt_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_dt);
		p.columnRslt_cst_frcst_slip_no.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_frcst_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_slip_no);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_can_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.can_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_rsn_cd);
		p.columnRslt_can_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.can_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_rsn_nm);
		p.columnRslt_can_rmrks.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.can_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_fix_flg.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_frcst_period_typ.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_period_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_period_typ);
		p.columnRslt_frcst_period_typ_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_period_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_period_typ_nm);
		p.columnRslt_frcst_st_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_st_dt_META);
		p.columnRslt_frcst_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_st_dt);
		p.columnRslt_frcst_end_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_end_dt_META);
		p.columnRslt_frcst_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_end_dt);
		p.columnRslt_frcst_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_dt_META);
		p.columnRslt_frcst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_dt);
		p.RsltTable.addTable(p.Rslt_trd_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_qty_dec_place.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_qty_dec_place);
		p.RsltTable.addTable(p.Rslt_base_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_qty_dec_place.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.base_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_qty_dec_place);
		p.RsltTable.addTable(p.Rslt_last_qty_p_PPanel.QtyTable);
		p.columnRslt_last_cst_frcst_prnt_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.last_cst_frcst_prnt_dt_META);
		p.columnRslt_last_cst_frcst_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_last_cst_frcst_prnt_dt);
		p.columnRslt_last_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.last_rcpt_dt_META);
		p.columnRslt_last_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_last_rcpt_dt);
		p.RsltTable.addTable(p.Rslt_spln_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_slo_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_mly_net_frcst_qty_p_PPanel.QtyTable);
		p.columnRslt_gi_loc_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.gi_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_loc_cd);
		p.columnRslt_gi_loc_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.gi_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_loc_nm);
		p.columnRslt_cst_frcst_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_frcst_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_slip_d_no);
		p.RsltTable.addTable(p.Rslt_prms_qty_p_PPanel.QtyTable);
		p.columnRslt_frcst_stop_flg.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.frcst_stop_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_frcst_stop_flg);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_dtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.dtl_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_intr_rmrks);
		p.columnRslt_dtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.dtl_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char1);
		p.columnRslt_dtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.dtl_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char2);
		p.columnRslt_dtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.dtl_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_cst_frcst_d_no.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.cst_frcst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_d_no);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP0040.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_frcst_period_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_frcst_period_typ.getListConfig().setPutter(getCnd_frcst_period_typ_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_frcst_usr_cd.getListConfig().setPutter(getCnd_frcst_usr_cd_ListPutter());
		Cnd_frcst_dpt_cd.getListConfig().setPutter(getCnd_frcst_dpt_cd_ListPutter());
		Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.getListConfig().setPutter(getCnd_wrk_no_p_PPanel_WrkNo_wrk_no_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_can_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_can_rsn_cd.getListConfig().setPutter(getCnd_can_rsn_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DTLStatus() {
		status = SRCH_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_HDRStatus() {
		status = SRCH_HDR;
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
	 * この画面を[REF_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_HDRStatus() {
		status = REF_HDR;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_DTL.equals(status)) {
			setSRCH_DTLStatus();
		}
		else if (SRCH_HDR.equals(status)) {
			setSRCH_HDRStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
	}

	/**
	 * [Cnd_frcst_period_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_frcst_period_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PeriodTyp");
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
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_frcst_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_frcst_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_frcst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_frcst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	 
	/**
	 * [Cnd_can_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_can_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloCanRsn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_frcst_period_typ) return getCnd_frcst_period_typ(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_frcst_usr_cd) return getCnd_frcst_usr_cd(row, info);
		if(combo == Cnd_frcst_dpt_cd) return getCnd_frcst_dpt_cd(row, info);
		if(combo == Cnd_wrk_no_p_PPanel.WrkNo_wrk_no) return getCnd_wrk_no_p_PPanel_WrkNo_wrk_no(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_can_rsn_cd) return getCnd_can_rsn_cd(row, info);
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
		else if (ap == Btn_open_MSBBP0010) doBtn_open_MSBBP0010(info);
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
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
	 * [Btn]パネルの[open_MSBBP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP0010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

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
		if (vc == Cnd_fix_f_flg) return doCnd_fix_f_flg_VC(info);
		if (vc == Cnd_fix_t_flg) return doCnd_fix_t_flg_VC(info);
		if (vc == Cnd_mode_Group) return doCnd_mode_VC(info);
		if (vc == Cnd_cst_frcst_prnt_dt_fr) return doCnd_cst_frcst_prnt_dt_fr_VC(info);
		if (vc == Cnd_cst_frcst_prnt_dt_to) return doCnd_cst_frcst_prnt_dt_to_VC(info);
		if (vc == Cnd_rcpt_dt_fr) return doCnd_rcpt_dt_fr_VC(info);
		if (vc == Cnd_rcpt_dt_to) return doCnd_rcpt_dt_to_VC(info);
		if (vc == Cnd_frcst_st_dt_fr) return doCnd_frcst_st_dt_fr_VC(info);
		if (vc == Cnd_frcst_st_dt_to) return doCnd_frcst_st_dt_to_VC(info);
		if (vc == Cnd_frcst_end_dt_fr) return doCnd_frcst_end_dt_fr_VC(info);
		if (vc == Cnd_frcst_end_dt_to) return doCnd_frcst_end_dt_to_VC(info);
		if (vc == Cnd_frcst_dt_fr) return doCnd_frcst_dt_fr_VC(info);
		if (vc == Cnd_frcst_dt_to) return doCnd_frcst_dt_to_VC(info);
		if (vc == Cnd_frcst_period_typ) return doCnd_frcst_period_typ_VC(info);
		if (vc == Cnd_frcst_period_typ_nm) return doCnd_frcst_period_typ_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_frcst_usr_cd) return doCnd_frcst_usr_cd_VC(info);
		if (vc == Cnd_frcst_usr_nm) return doCnd_frcst_usr_nm_VC(info);
		if (vc == Cnd_frcst_dpt_cd) return doCnd_frcst_dpt_cd_VC(info);
		if (vc == Cnd_frcst_dpt_nm) return doCnd_frcst_dpt_nm_VC(info);
		if (vc == Cnd_cst_frcst_no) return doCnd_cst_frcst_no_VC(info);
		if (vc == Cnd_cst_frcst_d_no) return doCnd_cst_frcst_d_no_VC(info);
		if (vc == Cnd_cst_frcst_slip_no) return doCnd_cst_frcst_slip_no_VC(info);
		if (vc == Cnd_cst_frcst_slip_d_no) return doCnd_cst_frcst_slip_d_no_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Cnd_except_frcst_stop_flg) return doCnd_except_frcst_stop_flg_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_can_rsn_cd) return doCnd_can_rsn_cd_VC(info);
		if (vc == Cnd_can_rsn_nm) return doCnd_can_rsn_nm_VC(info);
		if (vc == Cnd_can_rmrks) return doCnd_can_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dtl_intr_rmrks) return doCnd_dtl_intr_rmrks_VC(info);
		if (vc == Cnd_dtl_sub_char1) return doCnd_dtl_sub_char1_VC(info);
		if (vc == Cnd_dtl_sub_char2) return doCnd_dtl_sub_char2_VC(info);
		if (vc == Cnd_dtl_sub_char3) return doCnd_dtl_sub_char3_VC(info);
		if (vc == columnRslt_cst_frcst_no) return doRslt_cst_frcst_no_VC(info);
		if (vc == columnRslt_cst_frcst_prnt_dt) return doRslt_cst_frcst_prnt_dt_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dlv_nm) return doRslt_dlv_nm_VC(info);
		if (vc == columnRslt_frcst_dpt_cd) return doRslt_frcst_dpt_cd_VC(info);
		if (vc == columnRslt_frcst_dpt_nm) return doRslt_frcst_dpt_nm_VC(info);
		if (vc == columnRslt_frcst_usr_cd) return doRslt_frcst_usr_cd_VC(info);
		if (vc == columnRslt_frcst_usr_nm) return doRslt_frcst_usr_nm_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_wrk_nm) return doRslt_wrk_nm_VC(info);
		if (vc == columnRslt_rcpt_dt) return doRslt_rcpt_dt_VC(info);
		if (vc == columnRslt_cst_frcst_slip_no) return doRslt_cst_frcst_slip_no_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_can_rsn_cd) return doRslt_can_rsn_cd_VC(info);
		if (vc == columnRslt_can_rsn_nm) return doRslt_can_rsn_nm_VC(info);
		if (vc == columnRslt_can_rmrks) return doRslt_can_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_frcst_period_typ) return doRslt_frcst_period_typ_VC(info);
		if (vc == columnRslt_frcst_period_typ_nm) return doRslt_frcst_period_typ_nm_VC(info);
		if (vc == columnRslt_frcst_st_dt) return doRslt_frcst_st_dt_VC(info);
		if (vc == columnRslt_frcst_end_dt) return doRslt_frcst_end_dt_VC(info);
		if (vc == columnRslt_frcst_dt) return doRslt_frcst_dt_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_qty_dec_place) return doRslt_qty_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_qty_dec_place) return doRslt_base_qty_dec_place_VC(info);
		if (vc == columnRslt_last_cst_frcst_prnt_dt) return doRslt_last_cst_frcst_prnt_dt_VC(info);
		if (vc == columnRslt_last_rcpt_dt) return doRslt_last_rcpt_dt_VC(info);
		if (vc == columnRslt_gi_loc_cd) return doRslt_gi_loc_cd_VC(info);
		if (vc == columnRslt_gi_loc_nm) return doRslt_gi_loc_nm_VC(info);
		if (vc == columnRslt_cst_frcst_slip_d_no) return doRslt_cst_frcst_slip_d_no_VC(info);
		if (vc == columnRslt_frcst_stop_flg) return doRslt_frcst_stop_flg_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_dtl_intr_rmrks) return doRslt_dtl_intr_rmrks_VC(info);
		if (vc == columnRslt_dtl_sub_char1) return doRslt_dtl_sub_char1_VC(info);
		if (vc == columnRslt_dtl_sub_char2) return doRslt_dtl_sub_char2_VC(info);
		if (vc == columnRslt_dtl_sub_char3) return doRslt_dtl_sub_char3_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_cst_frcst_d_no) return doRslt_cst_frcst_d_no_VC(info);
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
	 * [Cnd]パネルの[mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_prnt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_prnt_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_st_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_st_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_end_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_end_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_period_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_frcst_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[except_frcst_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_except_frcst_stop_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[can_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_can_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[can_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_can_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[can_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_can_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_frcst_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_frcst_prnt_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[frcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_frcst_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[can_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[can_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[can_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_qty_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_qty_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_cst_frcst_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_cst_frcst_prnt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_frcst_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[frcst_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_frcst_stop_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dtl_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_frcst_d_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_fix_f_flg) doCnd_fix_f_flg_NC(info);
		else if (nc == Cnd_fix_t_flg) doCnd_fix_t_flg_NC(info);
		else if (nc == Cnd_mode_Group) doCnd_mode_NC(info);
		else if (nc == Cnd_cst_frcst_prnt_dt_fr) doCnd_cst_frcst_prnt_dt_fr_NC(info);
		else if (nc == Cnd_cst_frcst_prnt_dt_to) doCnd_cst_frcst_prnt_dt_to_NC(info);
		else if (nc == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NC(info);
		else if (nc == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NC(info);
		else if (nc == Cnd_frcst_st_dt_fr) doCnd_frcst_st_dt_fr_NC(info);
		else if (nc == Cnd_frcst_st_dt_to) doCnd_frcst_st_dt_to_NC(info);
		else if (nc == Cnd_frcst_end_dt_fr) doCnd_frcst_end_dt_fr_NC(info);
		else if (nc == Cnd_frcst_end_dt_to) doCnd_frcst_end_dt_to_NC(info);
		else if (nc == Cnd_frcst_dt_fr) doCnd_frcst_dt_fr_NC(info);
		else if (nc == Cnd_frcst_dt_to) doCnd_frcst_dt_to_NC(info);
		else if (nc == Cnd_frcst_period_typ) doCnd_frcst_period_typ_NC(info);
		else if (nc == Cnd_frcst_period_typ_nm) doCnd_frcst_period_typ_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_frcst_usr_cd) doCnd_frcst_usr_cd_NC(info);
		else if (nc == Cnd_frcst_usr_nm) doCnd_frcst_usr_nm_NC(info);
		else if (nc == Cnd_frcst_dpt_cd) doCnd_frcst_dpt_cd_NC(info);
		else if (nc == Cnd_frcst_dpt_nm) doCnd_frcst_dpt_nm_NC(info);
		else if (nc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NC(info);
		else if (nc == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NC(info);
		else if (nc == Cnd_cst_frcst_slip_no) doCnd_cst_frcst_slip_no_NC(info);
		else if (nc == Cnd_cst_frcst_slip_d_no) doCnd_cst_frcst_slip_d_no_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Cnd_except_frcst_stop_flg) doCnd_except_frcst_stop_flg_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_can_rsn_cd) doCnd_can_rsn_cd_NC(info);
		else if (nc == Cnd_can_rsn_nm) doCnd_can_rsn_nm_NC(info);
		else if (nc == Cnd_can_rmrks) doCnd_can_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NC(info);
		else if (nc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NC(info);
		else if (nc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NC(info);
		else if (nc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NC(info);
		else if (nc == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_NC(info);
		else if (nc == columnRslt_cst_frcst_prnt_dt) doRslt_cst_frcst_prnt_dt_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dlv_nm) doRslt_dlv_nm_NC(info);
		else if (nc == columnRslt_frcst_dpt_cd) doRslt_frcst_dpt_cd_NC(info);
		else if (nc == columnRslt_frcst_dpt_nm) doRslt_frcst_dpt_nm_NC(info);
		else if (nc == columnRslt_frcst_usr_cd) doRslt_frcst_usr_cd_NC(info);
		else if (nc == columnRslt_frcst_usr_nm) doRslt_frcst_usr_nm_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_wrk_nm) doRslt_wrk_nm_NC(info);
		else if (nc == columnRslt_rcpt_dt) doRslt_rcpt_dt_NC(info);
		else if (nc == columnRslt_cst_frcst_slip_no) doRslt_cst_frcst_slip_no_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_can_rsn_cd) doRslt_can_rsn_cd_NC(info);
		else if (nc == columnRslt_can_rsn_nm) doRslt_can_rsn_nm_NC(info);
		else if (nc == columnRslt_can_rmrks) doRslt_can_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_frcst_period_typ) doRslt_frcst_period_typ_NC(info);
		else if (nc == columnRslt_frcst_period_typ_nm) doRslt_frcst_period_typ_nm_NC(info);
		else if (nc == columnRslt_frcst_st_dt) doRslt_frcst_st_dt_NC(info);
		else if (nc == columnRslt_frcst_end_dt) doRslt_frcst_end_dt_NC(info);
		else if (nc == columnRslt_frcst_dt) doRslt_frcst_dt_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_qty_dec_place) doRslt_qty_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NC(info);
		else if (nc == columnRslt_last_cst_frcst_prnt_dt) doRslt_last_cst_frcst_prnt_dt_NC(info);
		else if (nc == columnRslt_last_rcpt_dt) doRslt_last_rcpt_dt_NC(info);
		else if (nc == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_NC(info);
		else if (nc == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_NC(info);
		else if (nc == columnRslt_cst_frcst_slip_d_no) doRslt_cst_frcst_slip_d_no_NC(info);
		else if (nc == columnRslt_frcst_stop_flg) doRslt_frcst_stop_flg_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NC(info);
		else if (nc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NC(info);
		else if (nc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NC(info);
		else if (nc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_NC(info);
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
	 * [Cnd]パネルの[mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_frcst_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_frcst_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_prnt_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[frcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_cst_frcst_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_cst_frcst_prnt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_fix_f_flg) doCnd_fix_f_flg_NE(info);
		else if (ne == Cnd_fix_t_flg) doCnd_fix_t_flg_NE(info);
		else if (ne == Cnd_mode_Group) doCnd_mode_NE(info);
		else if (ne == Cnd_cst_frcst_prnt_dt_fr) doCnd_cst_frcst_prnt_dt_fr_NE(info);
		else if (ne == Cnd_cst_frcst_prnt_dt_to) doCnd_cst_frcst_prnt_dt_to_NE(info);
		else if (ne == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NE(info);
		else if (ne == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NE(info);
		else if (ne == Cnd_frcst_st_dt_fr) doCnd_frcst_st_dt_fr_NE(info);
		else if (ne == Cnd_frcst_st_dt_to) doCnd_frcst_st_dt_to_NE(info);
		else if (ne == Cnd_frcst_end_dt_fr) doCnd_frcst_end_dt_fr_NE(info);
		else if (ne == Cnd_frcst_end_dt_to) doCnd_frcst_end_dt_to_NE(info);
		else if (ne == Cnd_frcst_dt_fr) doCnd_frcst_dt_fr_NE(info);
		else if (ne == Cnd_frcst_dt_to) doCnd_frcst_dt_to_NE(info);
		else if (ne == Cnd_frcst_period_typ) doCnd_frcst_period_typ_NE(info);
		else if (ne == Cnd_frcst_period_typ_nm) doCnd_frcst_period_typ_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_frcst_usr_cd) doCnd_frcst_usr_cd_NE(info);
		else if (ne == Cnd_frcst_usr_nm) doCnd_frcst_usr_nm_NE(info);
		else if (ne == Cnd_frcst_dpt_cd) doCnd_frcst_dpt_cd_NE(info);
		else if (ne == Cnd_frcst_dpt_nm) doCnd_frcst_dpt_nm_NE(info);
		else if (ne == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NE(info);
		else if (ne == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NE(info);
		else if (ne == Cnd_cst_frcst_slip_no) doCnd_cst_frcst_slip_no_NE(info);
		else if (ne == Cnd_cst_frcst_slip_d_no) doCnd_cst_frcst_slip_d_no_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Cnd_except_frcst_stop_flg) doCnd_except_frcst_stop_flg_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_can_rsn_cd) doCnd_can_rsn_cd_NE(info);
		else if (ne == Cnd_can_rsn_nm) doCnd_can_rsn_nm_NE(info);
		else if (ne == Cnd_can_rmrks) doCnd_can_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NE(info);
		else if (ne == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NE(info);
		else if (ne == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NE(info);
		else if (ne == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NE(info);
		else if (ne == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_NE(info);
		else if (ne == columnRslt_cst_frcst_prnt_dt) doRslt_cst_frcst_prnt_dt_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dlv_nm) doRslt_dlv_nm_NE(info);
		else if (ne == columnRslt_frcst_dpt_cd) doRslt_frcst_dpt_cd_NE(info);
		else if (ne == columnRslt_frcst_dpt_nm) doRslt_frcst_dpt_nm_NE(info);
		else if (ne == columnRslt_frcst_usr_cd) doRslt_frcst_usr_cd_NE(info);
		else if (ne == columnRslt_frcst_usr_nm) doRslt_frcst_usr_nm_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_wrk_nm) doRslt_wrk_nm_NE(info);
		else if (ne == columnRslt_rcpt_dt) doRslt_rcpt_dt_NE(info);
		else if (ne == columnRslt_cst_frcst_slip_no) doRslt_cst_frcst_slip_no_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_can_rsn_cd) doRslt_can_rsn_cd_NE(info);
		else if (ne == columnRslt_can_rsn_nm) doRslt_can_rsn_nm_NE(info);
		else if (ne == columnRslt_can_rmrks) doRslt_can_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_frcst_period_typ) doRslt_frcst_period_typ_NE(info);
		else if (ne == columnRslt_frcst_period_typ_nm) doRslt_frcst_period_typ_nm_NE(info);
		else if (ne == columnRslt_frcst_st_dt) doRslt_frcst_st_dt_NE(info);
		else if (ne == columnRslt_frcst_end_dt) doRslt_frcst_end_dt_NE(info);
		else if (ne == columnRslt_frcst_dt) doRslt_frcst_dt_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_qty_dec_place) doRslt_qty_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NE(info);
		else if (ne == columnRslt_last_cst_frcst_prnt_dt) doRslt_last_cst_frcst_prnt_dt_NE(info);
		else if (ne == columnRslt_last_rcpt_dt) doRslt_last_rcpt_dt_NE(info);
		else if (ne == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_NE(info);
		else if (ne == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_NE(info);
		else if (ne == columnRslt_cst_frcst_slip_d_no) doRslt_cst_frcst_slip_d_no_NE(info);
		else if (ne == columnRslt_frcst_stop_flg) doRslt_frcst_stop_flg_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NE(info);
		else if (ne == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NE(info);
		else if (ne == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NE(info);
		else if (ne == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_NE(info);
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
	 * [Cnd]パネルの[mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_frcst_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_frcst_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_prnt_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[frcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_cst_frcst_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_cst_frcst_prnt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_fix_f_flg) doCnd_fix_f_flg_NX(info);
		else if (nx == Cnd_fix_t_flg) doCnd_fix_t_flg_NX(info);
		else if (nx == Cnd_mode_Group) doCnd_mode_NX(info);
		else if (nx == Cnd_cst_frcst_prnt_dt_fr) doCnd_cst_frcst_prnt_dt_fr_NX(info);
		else if (nx == Cnd_cst_frcst_prnt_dt_to) doCnd_cst_frcst_prnt_dt_to_NX(info);
		else if (nx == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NX(info);
		else if (nx == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NX(info);
		else if (nx == Cnd_frcst_st_dt_fr) doCnd_frcst_st_dt_fr_NX(info);
		else if (nx == Cnd_frcst_st_dt_to) doCnd_frcst_st_dt_to_NX(info);
		else if (nx == Cnd_frcst_end_dt_fr) doCnd_frcst_end_dt_fr_NX(info);
		else if (nx == Cnd_frcst_end_dt_to) doCnd_frcst_end_dt_to_NX(info);
		else if (nx == Cnd_frcst_dt_fr) doCnd_frcst_dt_fr_NX(info);
		else if (nx == Cnd_frcst_dt_to) doCnd_frcst_dt_to_NX(info);
		else if (nx == Cnd_frcst_period_typ) doCnd_frcst_period_typ_NX(info);
		else if (nx == Cnd_frcst_period_typ_nm) doCnd_frcst_period_typ_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_frcst_usr_cd) doCnd_frcst_usr_cd_NX(info);
		else if (nx == Cnd_frcst_usr_nm) doCnd_frcst_usr_nm_NX(info);
		else if (nx == Cnd_frcst_dpt_cd) doCnd_frcst_dpt_cd_NX(info);
		else if (nx == Cnd_frcst_dpt_nm) doCnd_frcst_dpt_nm_NX(info);
		else if (nx == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NX(info);
		else if (nx == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NX(info);
		else if (nx == Cnd_cst_frcst_slip_no) doCnd_cst_frcst_slip_no_NX(info);
		else if (nx == Cnd_cst_frcst_slip_d_no) doCnd_cst_frcst_slip_d_no_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Cnd_except_frcst_stop_flg) doCnd_except_frcst_stop_flg_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_can_rsn_cd) doCnd_can_rsn_cd_NX(info);
		else if (nx == Cnd_can_rsn_nm) doCnd_can_rsn_nm_NX(info);
		else if (nx == Cnd_can_rmrks) doCnd_can_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NX(info);
		else if (nx == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NX(info);
		else if (nx == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NX(info);
		else if (nx == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NX(info);
		else if (nx == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_NX(info);
		else if (nx == columnRslt_cst_frcst_prnt_dt) doRslt_cst_frcst_prnt_dt_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dlv_nm) doRslt_dlv_nm_NX(info);
		else if (nx == columnRslt_frcst_dpt_cd) doRslt_frcst_dpt_cd_NX(info);
		else if (nx == columnRslt_frcst_dpt_nm) doRslt_frcst_dpt_nm_NX(info);
		else if (nx == columnRslt_frcst_usr_cd) doRslt_frcst_usr_cd_NX(info);
		else if (nx == columnRslt_frcst_usr_nm) doRslt_frcst_usr_nm_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_wrk_nm) doRslt_wrk_nm_NX(info);
		else if (nx == columnRslt_rcpt_dt) doRslt_rcpt_dt_NX(info);
		else if (nx == columnRslt_cst_frcst_slip_no) doRslt_cst_frcst_slip_no_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_can_rsn_cd) doRslt_can_rsn_cd_NX(info);
		else if (nx == columnRslt_can_rsn_nm) doRslt_can_rsn_nm_NX(info);
		else if (nx == columnRslt_can_rmrks) doRslt_can_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_frcst_period_typ) doRslt_frcst_period_typ_NX(info);
		else if (nx == columnRslt_frcst_period_typ_nm) doRslt_frcst_period_typ_nm_NX(info);
		else if (nx == columnRslt_frcst_st_dt) doRslt_frcst_st_dt_NX(info);
		else if (nx == columnRslt_frcst_end_dt) doRslt_frcst_end_dt_NX(info);
		else if (nx == columnRslt_frcst_dt) doRslt_frcst_dt_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_qty_dec_place) doRslt_qty_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NX(info);
		else if (nx == columnRslt_last_cst_frcst_prnt_dt) doRslt_last_cst_frcst_prnt_dt_NX(info);
		else if (nx == columnRslt_last_rcpt_dt) doRslt_last_rcpt_dt_NX(info);
		else if (nx == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_NX(info);
		else if (nx == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_NX(info);
		else if (nx == columnRslt_cst_frcst_slip_d_no) doRslt_cst_frcst_slip_d_no_NX(info);
		else if (nx == columnRslt_frcst_stop_flg) doRslt_frcst_stop_flg_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_NX(info);
		else if (nx == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NX(info);
		else if (nx == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NX(info);
		else if (nx == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_NX(info);
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
	 * [Cnd]パネルの[mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_frcst_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_frcst_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_prnt_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[frcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_cst_frcst_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_cst_frcst_prnt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_NX(MCEventInfo info){
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
		if (lc == Cnd_cst_frcst_prnt_dt_fr) doCnd_cst_frcst_prnt_dt_fr_LC(info);
		else if (lc == Cnd_cst_frcst_prnt_dt_to) doCnd_cst_frcst_prnt_dt_to_LC(info);
		else if (lc == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_LC(info);
		else if (lc == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_LC(info);
		else if (lc == Cnd_frcst_st_dt_fr) doCnd_frcst_st_dt_fr_LC(info);
		else if (lc == Cnd_frcst_st_dt_to) doCnd_frcst_st_dt_to_LC(info);
		else if (lc == Cnd_frcst_end_dt_fr) doCnd_frcst_end_dt_fr_LC(info);
		else if (lc == Cnd_frcst_end_dt_to) doCnd_frcst_end_dt_to_LC(info);
		else if (lc == Cnd_frcst_dt_fr) doCnd_frcst_dt_fr_LC(info);
		else if (lc == Cnd_frcst_dt_to) doCnd_frcst_dt_to_LC(info);
		else if (lc == Cnd_frcst_period_typ) doCnd_frcst_period_typ_LC(info);
		else if (lc == Cnd_frcst_period_typ_nm) doCnd_frcst_period_typ_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_frcst_usr_cd) doCnd_frcst_usr_cd_LC(info);
		else if (lc == Cnd_frcst_usr_nm) doCnd_frcst_usr_nm_LC(info);
		else if (lc == Cnd_frcst_dpt_cd) doCnd_frcst_dpt_cd_LC(info);
		else if (lc == Cnd_frcst_dpt_nm) doCnd_frcst_dpt_nm_LC(info);
		else if (lc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_LC(info);
		else if (lc == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_LC(info);
		else if (lc == Cnd_cst_frcst_slip_no) doCnd_cst_frcst_slip_no_LC(info);
		else if (lc == Cnd_cst_frcst_slip_d_no) doCnd_cst_frcst_slip_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_can_rsn_cd) doCnd_can_rsn_cd_LC(info);
		else if (lc == Cnd_can_rsn_nm) doCnd_can_rsn_nm_LC(info);
		else if (lc == Cnd_can_rmrks) doCnd_can_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_LC(info);
		else if (lc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_LC(info);
		else if (lc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_LC(info);
		else if (lc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_LC(info);
		else if (lc == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_LC(info);
		else if (lc == columnRslt_cst_frcst_prnt_dt) doRslt_cst_frcst_prnt_dt_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dlv_nm) doRslt_dlv_nm_LC(info);
		else if (lc == columnRslt_frcst_dpt_cd) doRslt_frcst_dpt_cd_LC(info);
		else if (lc == columnRslt_frcst_dpt_nm) doRslt_frcst_dpt_nm_LC(info);
		else if (lc == columnRslt_frcst_usr_cd) doRslt_frcst_usr_cd_LC(info);
		else if (lc == columnRslt_frcst_usr_nm) doRslt_frcst_usr_nm_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_wrk_nm) doRslt_wrk_nm_LC(info);
		else if (lc == columnRslt_rcpt_dt) doRslt_rcpt_dt_LC(info);
		else if (lc == columnRslt_cst_frcst_slip_no) doRslt_cst_frcst_slip_no_LC(info);
		else if (lc == columnRslt_can_rsn_cd) doRslt_can_rsn_cd_LC(info);
		else if (lc == columnRslt_can_rsn_nm) doRslt_can_rsn_nm_LC(info);
		else if (lc == columnRslt_can_rmrks) doRslt_can_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_frcst_period_typ) doRslt_frcst_period_typ_LC(info);
		else if (lc == columnRslt_frcst_period_typ_nm) doRslt_frcst_period_typ_nm_LC(info);
		else if (lc == columnRslt_frcst_st_dt) doRslt_frcst_st_dt_LC(info);
		else if (lc == columnRslt_frcst_end_dt) doRslt_frcst_end_dt_LC(info);
		else if (lc == columnRslt_frcst_dt) doRslt_frcst_dt_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_qty_dec_place) doRslt_qty_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_LC(info);
		else if (lc == columnRslt_last_cst_frcst_prnt_dt) doRslt_last_cst_frcst_prnt_dt_LC(info);
		else if (lc == columnRslt_last_rcpt_dt) doRslt_last_rcpt_dt_LC(info);
		else if (lc == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_LC(info);
		else if (lc == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_LC(info);
		else if (lc == columnRslt_cst_frcst_slip_d_no) doRslt_cst_frcst_slip_d_no_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_dtl_intr_rmrks) doRslt_dtl_intr_rmrks_LC(info);
		else if (lc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_LC(info);
		else if (lc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_LC(info);
		else if (lc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_LC(info);
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
	 * [Cnd]パネルの[cst_frcst_prnt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_prnt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_prnt_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_st_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_st_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_end_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_end_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_period_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_frcst_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_frcst_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[can_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_can_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_prnt_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[frcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_usr_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[frcst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_frcst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_qty_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_cst_frcst_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_cst_frcst_prnt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_frcst_period_typ]の作成メソッド
	 */
	public MCList getCnd_frcst_period_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPeriodTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_frcst_usr_cd]の作成メソッド
	 */
	public MCList getCnd_frcst_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_frcst_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_frcst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wrk_no_p_PPanel_WrkNo_wrk_no]の作成メソッド
	 */
	public MCList getCnd_wrk_no_p_PPanel_WrkNo_wrk_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getWrkNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_can_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_can_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloCanRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL0040.Srch01")) {
			return new MS_MSBBL0040_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL0040_Srch01Bridge() {
			p_MS_MSBBL0040_Srch01 = new MCParam(PDef.MS_MSBBL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0040.RsltR.class));

			p_MS_MSBBL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP0040.CndR up0() {
			return (mcframe.clientMSBB.MSBBP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP0040.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP0040.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP0040.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL0040_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP0040.RsltR>)p_MS_MSBBL0040_Srch01.getContainerParam().getDownBlock(0));
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