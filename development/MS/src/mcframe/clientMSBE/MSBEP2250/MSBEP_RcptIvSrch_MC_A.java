package mcframe.clientMSBE.MSBEP2250;

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
import mcframe.clientMSBE.MSBEP2250.MSBEP_RcptIvSrch_MC.MS_MSBEL2250_Srch01Caller;
import mcframe.clientMSBE.MSBEP2250.MSBEP_RcptIvSrch_MC.MS_MSBEL2250_Srch02Caller;

/**
 * 画面"MSBEP_RcptIvSrch"パネルクラスです。<p>
 *
 * 受領インボイス情報単位に集約した仕入予定情報を検索する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_RcptIvSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP2250";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Fix]ブロック関連のField定義
	public MCPanel FixPanel = null;
	public MCTitledBorder FixTitledBorder = null;
	// [Fix]ブロックの項目のField定義
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
	// [SpplBpCnd]ブロック関連のField定義
	public MCPanel SpplBpCndPanel = null;
	// [SpplBpCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_not_fix_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public MCCheckBox Cnd_im_not_comp_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_im_comp_flg = null;
	/**
	 * Hdr,Header,0;Dtl,Details,1 Hdr,ヘッダ,0;Dtl,明細,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_hdr_dtl_Group = null;
	public MCRadioButton Cnd_hdr_dtl_Hdr = null;
	public MCRadioButton Cnd_hdr_dtl_Dtl = null;
	public MCLabel Cnd_purc_schd_dt_fr_Label = null;
	/**
	 * Scheduled purchase date FROM 仕入予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_schd_dt_fr = null;
	public MCLabel Cnd_purc_schd_dt_to_Label = null;
	/**
	 * Scheduled purchase date TO 仕入予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_schd_dt_to = null;
	public MCLabel Cnd_purc_dt_fr_Label = null;
	/**
	 * Purchase date FROM 仕入日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_dt_fr = null;
	public MCLabel Cnd_purc_dt_to_Label = null;
	/**
	 * Purchase date TO 仕入日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_dt_to = null;
	public MCLabel Cnd_iv_dt_fr_Label = null;
	/**
	 * I/V date FROM Ｉ／Ｖ日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_iv_dt_fr = null;
	public MCLabel Cnd_iv_dt_to_Label = null;
	/**
	 * I/V date TO Ｉ／Ｖ日付ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_iv_dt_to = null;
	public MCLabel Cnd_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_no = null;
	public MCLabel Cnd_rcpt_iv_d_no_Label = null;
	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_d_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_d_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_in_to_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_id_typ = null;
	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_id_typ_nm = null;
	public MCLabel Cnd_in_to_id_cd_Label = null;
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_id_cd = null;
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_id_nm = null;
	public MCLabel Cnd_purc_usr_cd_Label = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_nm = null;
	public MCLabel Cnd_purc_dpt_cd_Label = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	public MCLabel Cnd_rcpt_iv_rmrks_Label = null;
	/**
	 * Purchase invoice remarks 受領インボイス備考.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_rmrks = null;
	public MCLabel Cnd_rcpt_iv_d_rmrks_Label = null;
	/**
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_d_rmrks = null;
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
	public MCLabel Cnd_sub_d_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_d_char1 = null;
	public MCLabel Cnd_sub_d_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_d_char2 = null;
	public MCLabel Cnd_sub_d_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_d_char3 = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_past_flg = null;
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
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMSBE.MSBEP2250.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_cmpl_flg = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_mng_no = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_rev = null;
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_dt = null;
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dt = null;
	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_dt = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_typ = null;
	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_typ_nm = null;
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_cd = null;
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_nm = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Rslt_in_to_id_p_PPanel;
	public MCColumnConfig columnRslt_in_to_id_show_dtl;// [Rslt]の[in_to_id_p.show_dtl]を[columnRslt_in_to_id_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_cntct_dpt;// [Rslt]の[in_to_id_p.cntct_dpt]を[columnRslt_in_to_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_cntct_psn;// [Rslt]の[in_to_id_p.cntct_psn]を[columnRslt_in_to_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_zip_cd;// [Rslt]の[in_to_id_p.zip_cd]を[columnRslt_in_to_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_addr1;// [Rslt]の[in_to_id_p.addr1]を[columnRslt_in_to_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_addr2;// [Rslt]の[in_to_id_p.addr2]を[columnRslt_in_to_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_addr3;// [Rslt]の[in_to_id_p.addr3]を[columnRslt_in_to_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_addr4;// [Rslt]の[in_to_id_p.addr4]を[columnRslt_in_to_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_tel;// [Rslt]の[in_to_id_p.tel]を[columnRslt_in_to_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_fax;// [Rslt]の[in_to_id_p.fax]を[columnRslt_in_to_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_cntry_cd;// [Rslt]の[in_to_id_p.cntry_cd]を[columnRslt_in_to_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_in_to_cntry_nm;// [Rslt]の[in_to_id_p.cntry_nm]を[columnRslt_in_to_cntry_nm]としてエイリアス定義。
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_cd = null;
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_nm = null;
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vssl_flght = null;
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_cd = null;
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_nm = null;
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_etd_dt = null;
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_cd = null;
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_nm = null;
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_eta_dt = null;
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_cd = null;
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_nm = null;
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_schd_dt = null;
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd1 = null;
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm1 = null;
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks1 = null;
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd2 = null;
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm2 = null;
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks2 = null;
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd3 = null;
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm3 = null;
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks3 = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt = null;
	/**
	 * Purchase invoice remarks 受領インボイス備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_d_no = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_d_no = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Unit rounding type 単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_upri_dec_place = null;
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
	public MCColumnConfig columnRslt_trd_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_upri_dec_place = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_trd_cur_amt;// [Rslt]の[ttl_trd_cur_amt_p.amt]を[columnRslt_ttl_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ttl_trd_cur_inc_tax_amt;// [Rslt]の[ttl_trd_cur_inc_tax_amt_p.amt]を[columnRslt_ttl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnRslt_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_upri;// [Rslt]の[trd_cur_proc_upri_p.upri]を[columnRslt_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_upri;// [Rslt]の[trd_cur_onr_prov_upri_p.upri]を[columnRslt_trd_cur_onr_prov_upri]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_cur_dscnt_amt_p.amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_rsn_cd = null;
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_amt;// [Rslt]の[trd_cur_proc_amt_p.amt]を[columnRslt_trd_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_amt;// [Rslt]の[trd_cur_onr_prov_amt_p.amt]を[columnRslt_trd_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_cur_inc_tax_amt_p.amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_fix_flg = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_tax_amt_p.amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_upri;// [Rslt]の[base_cur_proc_upri_p.upri]を[columnRslt_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_upri;// [Rslt]の[base_cur_onr_prov_upri_p.upri]を[columnRslt_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_inc_ctax_amt;// [Rslt]の[base_cur_inc_ctax_amt_p.amt]を[columnRslt_base_cur_inc_ctax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_amt;// [Rslt]の[base_cur_proc_amt_p.amt]を[columnRslt_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_amt;// [Rslt]の[base_cur_onr_prov_amt_p.amt]を[columnRslt_base_cur_onr_prov_amt]としてエイリアス定義。
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_upri_dec_place = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_upri;// [Rslt]の[ptax_cur_upri_p.upri]を[columnRslt_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_proc_upri;// [Rslt]の[ptax_cur_proc_upri_p.upri]を[columnRslt_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_onr_prov_upri;// [Rslt]の[ptax_cur_onr_prov_upri_p.upri]を[columnRslt_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_dscnt_amt;// [Rslt]の[ptax_cur_dscnt_amt_p.amt]を[columnRslt_ptax_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_amt;// [Rslt]の[ptax_cur_amt_p.amt]を[columnRslt_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_inc_ctax_amt;// [Rslt]の[ptax_cur_inc_ctax_amt_p.amt]を[columnRslt_ptax_cur_inc_ctax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_tax_amt;// [Rslt]の[ptax_cur_tax_amt_p.amt]を[columnRslt_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_proc_amt;// [Rslt]の[ptax_cur_proc_amt_p.amt]を[columnRslt_ptax_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_onr_prov_amt;// [Rslt]の[ptax_cur_onr_prov_amt_p.amt]を[columnRslt_ptax_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_nm = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_nm = null;
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
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_id_typ_nm = null;
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_rsn_nm = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_nm = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_nm = null;
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
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_d_rmrks = null;
	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public MCColumnConfig columnRslt_manual_add_flg = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Rslt_bditm_p_PPanel;
	public MCColumnConfig columnRslt_bd_dpt_cd;// [Rslt]の[bditm_p.bd_dpt_cd]を[columnRslt_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_dpt_nm;// [Rslt]の[bditm_p.bd_dpt_nm]を[columnRslt_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_cd;// [Rslt]の[bditm_p.bd_itm_cd]を[columnRslt_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub1;// [Rslt]の[bditm_p.bd_itm_sub1]を[columnRslt_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub2;// [Rslt]の[bditm_p.bd_itm_sub2]を[columnRslt_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub3;// [Rslt]の[bditm_p.bd_itm_sub3]を[columnRslt_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_nm;// [Rslt]の[bditm_p.bd_itm_nm]を[columnRslt_bd_itm_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_lot_no;// [Rslt]の[bditm_p.bd_lot_no]を[columnRslt_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sublot_no;// [Rslt]の[bditm_p.bd_sublot_no]を[columnRslt_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno1;// [Rslt]の[bditm_p.bd_sno1]を[columnRslt_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno2;// [Rslt]の[bditm_p.bd_sno2]を[columnRslt_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno3;// [Rslt]の[bditm_p.bd_sno3]を[columnRslt_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno4;// [Rslt]の[bditm_p.bd_sno4]を[columnRslt_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_bp_cd;// [Rslt]の[bditm_p.bd_bp_cd]を[columnRslt_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_bp_nm;// [Rslt]の[bditm_p.bd_bp_nm]を[columnRslt_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_loc_cd;// [Rslt]の[bditm_p.bd_loc_cd]を[columnRslt_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_loc_nm;// [Rslt]の[bditm_p.bd_loc_nm]を[columnRslt_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_ctg_cd;// [Rslt]の[bditm_p.bd_ctg_cd]を[columnRslt_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_ctg_nm;// [Rslt]の[bditm_p.bd_ctg_nm]を[columnRslt_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_oper_cd;// [Rslt]の[bditm_p.bd_oper_cd]を[columnRslt_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_oper_nm;// [Rslt]の[bditm_p.bd_oper_nm]を[columnRslt_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_iv_no;// [Rslt]の[bditm_p.bd_iv_no]を[columnRslt_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_slo_no;// [Rslt]の[bditm_p.bd_slo_no]を[columnRslt_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_po_no;// [Rslt]の[bditm_p.bd_po_no]を[columnRslt_bd_po_no]としてエイリアス定義。
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
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
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_reg_flg = null;
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_cd = null;
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_nm = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_purc_qty_p_PPanel;
	public MCColumnConfig columnRslt_purc_qty;// [Rslt]の[purc_qty_p.qty]を[columnRslt_purc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_arr_qty_p_PPanel;
	public MCColumnConfig columnRslt_arr_qty;// [Rslt]の[arr_qty_p.qty]を[columnRslt_arr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_accpt_dfct_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_accpt_dfct_qty;// [Rslt]の[base_unit_accpt_dfct_qty_p.qty]を[columnRslt_base_unit_accpt_dfct_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_abort_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_abort_qty;// [Rslt]の[base_unit_abort_qty_p.qty]を[columnRslt_base_unit_abort_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_abort_qty_p_PPanel;
	public MCColumnConfig columnRslt_abort_qty;// [Rslt]の[abort_qty_p.qty]を[columnRslt_abort_qty]としてエイリアス定義。
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_sub_char1 = null;
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_sub_char2 = null;
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_sub_char3 = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_d_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_d_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_d_sub_char3 = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bp_grp_p_PPanel;
	public MCColumnConfig columnRslt_bp_grp_cd1;// [Rslt]の[bp_grp_p.bp_grp_cd1]を[columnRslt_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm1;// [Rslt]の[bp_grp_p.bp_grp_nm1]を[columnRslt_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd2;// [Rslt]の[bp_grp_p.bp_grp_cd2]を[columnRslt_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm2;// [Rslt]の[bp_grp_p.bp_grp_nm2]を[columnRslt_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd3;// [Rslt]の[bp_grp_p.bp_grp_cd3]を[columnRslt_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm3;// [Rslt]の[bp_grp_p.bp_grp_nm3]を[columnRslt_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd4;// [Rslt]の[bp_grp_p.bp_grp_cd4]を[columnRslt_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm4;// [Rslt]の[bp_grp_p.bp_grp_nm4]を[columnRslt_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd5;// [Rslt]の[bp_grp_p.bp_grp_cd5]を[columnRslt_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm5;// [Rslt]の[bp_grp_p.bp_grp_nm5]を[columnRslt_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd6;// [Rslt]の[bp_grp_p.bp_grp_cd6]を[columnRslt_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm6;// [Rslt]の[bp_grp_p.bp_grp_nm6]を[columnRslt_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd7;// [Rslt]の[bp_grp_p.bp_grp_cd7]を[columnRslt_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm7;// [Rslt]の[bp_grp_p.bp_grp_nm7]を[columnRslt_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd8;// [Rslt]の[bp_grp_p.bp_grp_cd8]を[columnRslt_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm8;// [Rslt]の[bp_grp_p.bp_grp_nm8]を[columnRslt_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd9;// [Rslt]の[bp_grp_p.bp_grp_cd9]を[columnRslt_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm9;// [Rslt]の[bp_grp_p.bp_grp_nm9]を[columnRslt_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd10;// [Rslt]の[bp_grp_p.bp_grp_cd10]を[columnRslt_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm10;// [Rslt]の[bp_grp_p.bp_grp_nm10]を[columnRslt_bp_grp_nm10]としてエイリアス定義。
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
	 * Purchase invoice entry 受領インボイス登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2210 = null;
	/**
	 * Print sales invoice インボイス登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1730 = null;
	/** [SRCH_HDR]モードを表す定数 */
	public static final String SRCH_HDR = "SRCH_HDR";
	/** [SRCH_DTL]モードを表す定数 */
	public static final String SRCH_DTL = "SRCH_DTL";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_HDR, SRCH_DTL, REF_HDR, REF_DTL};
	
	/** [MS_MSBEL2250_Srch01]のCallerの作成 */
	protected MSBEP_RcptIvSrch_MC.MS_MSBEL2250_Srch01Caller createMS_MSBEL2250_Srch01() {
		MSBEP_RcptIvSrch_MC.MS_MSBEL2250_Srch01Caller<MSBEP_RcptIvSrch, MS_MSBEL2250_Srch01Bridge>
		caller = ((MSBEP_RcptIvSrch_MC)this).new MS_MSBEL2250_Srch01Caller<MSBEP_RcptIvSrch, MS_MSBEL2250_Srch01Bridge>(
					(MSBEP_RcptIvSrch)this, new MS_MSBEL2250_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2250_Srch01]の呼び出し */
	protected void callMS_MSBEL2250_Srch01() {
		MCCaller caller = createMS_MSBEL2250_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL2250_Srch02]のCallerの作成 */
	protected MSBEP_RcptIvSrch_MC.MS_MSBEL2250_Srch02Caller createMS_MSBEL2250_Srch02() {
		MSBEP_RcptIvSrch_MC.MS_MSBEL2250_Srch02Caller<MSBEP_RcptIvSrch, MS_MSBEL2250_Srch02Bridge>
		caller = ((MSBEP_RcptIvSrch_MC)this).new MS_MSBEL2250_Srch02Caller<MSBEP_RcptIvSrch, MS_MSBEL2250_Srch02Bridge>(
					(MSBEP_RcptIvSrch)this, new MS_MSBEL2250_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL2250_Srch02]の呼び出し */
	protected void callMS_MSBEL2250_Srch02() {
		MCCaller caller = createMS_MSBEL2250_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2250.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2250.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2250.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2250.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2250.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2250.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2250.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2250.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2250.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2250.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2250.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2250.RsltR.class);
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
		ret.add(FixPanel);
		ret.add(StsPanel);
		ret.add(DispUnitPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(SpplBpCndPanel);
		ret.add(ItmCndPanel);
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
	public MSBEP_RcptIvSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_RcptIvSrch_MC_A(String name) {
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
		MSBEP_RcptIvSrch_MC.jbCreateFix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateSts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateDispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateTop((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateFold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateTab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateTab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateTab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateSpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateCtrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateRPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateRslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbCreateBtn((MSBEP_RcptIvSrch)this);
	}

	/**
	 * [Fix]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFix(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [SpplBpCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplBpCnd(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_RcptIvSrch p) {
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
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_RcptIvSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_RcptIvSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_RcptIvSrch p) {
		p.Rslt_in_to_id_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$in_to_id_p);
		p.Rslt_in_to_id_p_PPanel.setName("Rslt.in_to_id_p");
		p.columnRslt_in_to_id_show_dtl = p.Rslt_in_to_id_p_PPanel.columnAddr_show_dtl;
		p.columnRslt_in_to_id_show_dtl.addAliasName("Rslt.in_to_id_show_dtl", p);
		p.columnRslt_in_to_cntct_dpt = p.Rslt_in_to_id_p_PPanel.columnAddr_cntct_dpt;
		p.columnRslt_in_to_cntct_dpt.addAliasName("Rslt.in_to_cntct_dpt", p);
		p.columnRslt_in_to_cntct_psn = p.Rslt_in_to_id_p_PPanel.columnAddr_cntct_psn;
		p.columnRslt_in_to_cntct_psn.addAliasName("Rslt.in_to_cntct_psn", p);
		p.columnRslt_in_to_zip_cd = p.Rslt_in_to_id_p_PPanel.columnAddr_zip_cd;
		p.columnRslt_in_to_zip_cd.addAliasName("Rslt.in_to_zip_cd", p);
		p.columnRslt_in_to_addr1 = p.Rslt_in_to_id_p_PPanel.columnAddr_addr1;
		p.columnRslt_in_to_addr1.addAliasName("Rslt.in_to_addr1", p);
		p.columnRslt_in_to_addr2 = p.Rslt_in_to_id_p_PPanel.columnAddr_addr2;
		p.columnRslt_in_to_addr2.addAliasName("Rslt.in_to_addr2", p);
		p.columnRslt_in_to_addr3 = p.Rslt_in_to_id_p_PPanel.columnAddr_addr3;
		p.columnRslt_in_to_addr3.addAliasName("Rslt.in_to_addr3", p);
		p.columnRslt_in_to_addr4 = p.Rslt_in_to_id_p_PPanel.columnAddr_addr4;
		p.columnRslt_in_to_addr4.addAliasName("Rslt.in_to_addr4", p);
		p.columnRslt_in_to_tel = p.Rslt_in_to_id_p_PPanel.columnAddr_tel;
		p.columnRslt_in_to_tel.addAliasName("Rslt.in_to_tel", p);
		p.columnRslt_in_to_fax = p.Rslt_in_to_id_p_PPanel.columnAddr_fax;
		p.columnRslt_in_to_fax.addAliasName("Rslt.in_to_fax", p);
		p.columnRslt_in_to_cntry_cd = p.Rslt_in_to_id_p_PPanel.columnAddr_cntry_cd;
		p.columnRslt_in_to_cntry_cd.addAliasName("Rslt.in_to_cntry_cd", p);
		p.columnRslt_in_to_cntry_nm = p.Rslt_in_to_id_p_PPanel.columnAddr_cntry_nm;
		p.columnRslt_in_to_cntry_nm.addAliasName("Rslt.in_to_cntry_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$itm_p);
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
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_ttl_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ttl_trd_cur_amt_p);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.setName("Rslt.ttl_trd_cur_amt_p");
		p.columnRslt_ttl_trd_cur_amt = p.Rslt_ttl_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_trd_cur_amt.addAliasName("Rslt.ttl_trd_cur_amt", p);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ttl_trd_cur_inc_tax_amt_p);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.ttl_trd_cur_inc_tax_amt_p");
		p.columnRslt_ttl_trd_cur_inc_tax_amt = p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ttl_trd_cur_inc_tax_amt.addAliasName("Rslt.ttl_trd_cur_inc_tax_amt", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_proc_upri_p);
		p.Rslt_trd_cur_proc_upri_p_PPanel.setName("Rslt.trd_cur_proc_upri_p");
		p.columnRslt_trd_cur_proc_upri = p.Rslt_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_proc_upri.addAliasName("Rslt.trd_cur_proc_upri", p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_onr_prov_upri_p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.setName("Rslt.trd_cur_onr_prov_upri_p");
		p.columnRslt_trd_cur_onr_prov_upri = p.Rslt_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_onr_prov_upri.addAliasName("Rslt.trd_cur_onr_prov_upri", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_proc_amt_p);
		p.Rslt_trd_cur_proc_amt_p_PPanel.setName("Rslt.trd_cur_proc_amt_p");
		p.columnRslt_trd_cur_proc_amt = p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_proc_amt.addAliasName("Rslt.trd_cur_proc_amt", p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_onr_prov_amt_p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.setName("Rslt.trd_cur_onr_prov_amt_p");
		p.columnRslt_trd_cur_onr_prov_amt = p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_onr_prov_amt.addAliasName("Rslt.trd_cur_onr_prov_amt", p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_inc_tax_amt_p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_inc_tax_amt_p");
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_proc_upri_p);
		p.Rslt_base_cur_proc_upri_p_PPanel.setName("Rslt.base_cur_proc_upri_p");
		p.columnRslt_base_cur_proc_upri = p.Rslt_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_proc_upri.addAliasName("Rslt.base_cur_proc_upri", p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_onr_prov_upri_p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.setName("Rslt.base_cur_onr_prov_upri_p");
		p.columnRslt_base_cur_onr_prov_upri = p.Rslt_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_onr_prov_upri.addAliasName("Rslt.base_cur_onr_prov_upri", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_inc_ctax_amt_p);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.setName("Rslt.base_cur_inc_ctax_amt_p");
		p.columnRslt_base_cur_inc_ctax_amt = p.Rslt_base_cur_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_inc_ctax_amt.addAliasName("Rslt.base_cur_inc_ctax_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_proc_amt_p);
		p.Rslt_base_cur_proc_amt_p_PPanel.setName("Rslt.base_cur_proc_amt_p");
		p.columnRslt_base_cur_proc_amt = p.Rslt_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_proc_amt.addAliasName("Rslt.base_cur_proc_amt", p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_cur_onr_prov_amt_p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.setName("Rslt.base_cur_onr_prov_amt_p");
		p.columnRslt_base_cur_onr_prov_amt = p.Rslt_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_onr_prov_amt.addAliasName("Rslt.base_cur_onr_prov_amt", p);
		p.Rslt_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_upri_p);
		p.Rslt_ptax_cur_upri_p_PPanel.setName("Rslt.ptax_cur_upri_p");
		p.columnRslt_ptax_cur_upri = p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_upri.addAliasName("Rslt.ptax_cur_upri", p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_proc_upri_p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.setName("Rslt.ptax_cur_proc_upri_p");
		p.columnRslt_ptax_cur_proc_upri = p.Rslt_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_proc_upri.addAliasName("Rslt.ptax_cur_proc_upri", p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_onr_prov_upri_p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.setName("Rslt.ptax_cur_onr_prov_upri_p");
		p.columnRslt_ptax_cur_onr_prov_upri = p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_onr_prov_upri.addAliasName("Rslt.ptax_cur_onr_prov_upri", p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_dscnt_amt_p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.setName("Rslt.ptax_cur_dscnt_amt_p");
		p.columnRslt_ptax_cur_dscnt_amt = p.Rslt_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_dscnt_amt.addAliasName("Rslt.ptax_cur_dscnt_amt", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_inc_ctax_amt_p);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.setName("Rslt.ptax_cur_inc_ctax_amt_p");
		p.columnRslt_ptax_cur_inc_ctax_amt = p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_inc_ctax_amt.addAliasName("Rslt.ptax_cur_inc_ctax_amt", p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_tax_amt_p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.setName("Rslt.ptax_cur_tax_amt_p");
		p.columnRslt_ptax_cur_tax_amt = p.Rslt_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_tax_amt.addAliasName("Rslt.ptax_cur_tax_amt", p);
		p.Rslt_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_proc_amt_p);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.setName("Rslt.ptax_cur_proc_amt_p");
		p.columnRslt_ptax_cur_proc_amt = p.Rslt_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_proc_amt.addAliasName("Rslt.ptax_cur_proc_amt", p);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$ptax_cur_onr_prov_amt_p);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.setName("Rslt.ptax_cur_onr_prov_amt_p");
		p.columnRslt_ptax_cur_onr_prov_amt = p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_onr_prov_amt.addAliasName("Rslt.ptax_cur_onr_prov_amt", p);
		p.Rslt_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$bditm_p);
		p.Rslt_bditm_p_PPanel.setName("Rslt.bditm_p");
		p.columnRslt_bd_dpt_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnRslt_bd_dpt_cd.addAliasName("Rslt.bd_dpt_cd", p);
		p.columnRslt_bd_dpt_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnRslt_bd_dpt_nm.addAliasName("Rslt.bd_dpt_nm", p);
		p.columnRslt_bd_itm_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnRslt_bd_itm_cd.addAliasName("Rslt.bd_itm_cd", p);
		p.columnRslt_bd_itm_sub1 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnRslt_bd_itm_sub1.addAliasName("Rslt.bd_itm_sub1", p);
		p.columnRslt_bd_itm_sub2 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnRslt_bd_itm_sub2.addAliasName("Rslt.bd_itm_sub2", p);
		p.columnRslt_bd_itm_sub3 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnRslt_bd_itm_sub3.addAliasName("Rslt.bd_itm_sub3", p);
		p.columnRslt_bd_itm_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnRslt_bd_itm_nm.addAliasName("Rslt.bd_itm_nm", p);
		p.columnRslt_bd_lot_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnRslt_bd_lot_no.addAliasName("Rslt.bd_lot_no", p);
		p.columnRslt_bd_sublot_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnRslt_bd_sublot_no.addAliasName("Rslt.bd_sublot_no", p);
		p.columnRslt_bd_sno1 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnRslt_bd_sno1.addAliasName("Rslt.bd_sno1", p);
		p.columnRslt_bd_sno2 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnRslt_bd_sno2.addAliasName("Rslt.bd_sno2", p);
		p.columnRslt_bd_sno3 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnRslt_bd_sno3.addAliasName("Rslt.bd_sno3", p);
		p.columnRslt_bd_sno4 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnRslt_bd_sno4.addAliasName("Rslt.bd_sno4", p);
		p.columnRslt_bd_bp_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnRslt_bd_bp_cd.addAliasName("Rslt.bd_bp_cd", p);
		p.columnRslt_bd_bp_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnRslt_bd_bp_nm.addAliasName("Rslt.bd_bp_nm", p);
		p.columnRslt_bd_loc_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnRslt_bd_loc_cd.addAliasName("Rslt.bd_loc_cd", p);
		p.columnRslt_bd_loc_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnRslt_bd_loc_nm.addAliasName("Rslt.bd_loc_nm", p);
		p.columnRslt_bd_ctg_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnRslt_bd_ctg_cd.addAliasName("Rslt.bd_ctg_cd", p);
		p.columnRslt_bd_ctg_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnRslt_bd_ctg_nm.addAliasName("Rslt.bd_ctg_nm", p);
		p.columnRslt_bd_oper_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnRslt_bd_oper_cd.addAliasName("Rslt.bd_oper_cd", p);
		p.columnRslt_bd_oper_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnRslt_bd_oper_nm.addAliasName("Rslt.bd_oper_nm", p);
		p.columnRslt_bd_iv_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnRslt_bd_iv_no.addAliasName("Rslt.bd_iv_no", p);
		p.columnRslt_bd_slo_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnRslt_bd_slo_no.addAliasName("Rslt.bd_slo_no", p);
		p.columnRslt_bd_po_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnRslt_bd_po_no.addAliasName("Rslt.bd_po_no", p);
		p.Rslt_purc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$purc_qty_p);
		p.Rslt_purc_qty_p_PPanel.setName("Rslt.purc_qty_p");
		p.columnRslt_purc_qty = p.Rslt_purc_qty_p_PPanel.columnQty_qty;
		p.columnRslt_purc_qty.addAliasName("Rslt.purc_qty", p);
		p.Rslt_arr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$arr_qty_p);
		p.Rslt_arr_qty_p_PPanel.setName("Rslt.arr_qty_p");
		p.columnRslt_arr_qty = p.Rslt_arr_qty_p_PPanel.columnQty_qty;
		p.columnRslt_arr_qty.addAliasName("Rslt.arr_qty", p);
		p.Rslt_base_unit_accpt_dfct_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_unit_accpt_dfct_qty_p);
		p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.setName("Rslt.base_unit_accpt_dfct_qty_p");
		p.columnRslt_base_unit_accpt_dfct_qty = p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_accpt_dfct_qty.addAliasName("Rslt.base_unit_accpt_dfct_qty", p);
		p.Rslt_base_unit_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$base_unit_abort_qty_p);
		p.Rslt_base_unit_abort_qty_p_PPanel.setName("Rslt.base_unit_abort_qty_p");
		p.columnRslt_base_unit_abort_qty = p.Rslt_base_unit_abort_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_abort_qty.addAliasName("Rslt.base_unit_abort_qty", p);
		p.Rslt_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$abort_qty_p);
		p.Rslt_abort_qty_p_PPanel.setName("Rslt.abort_qty_p");
		p.columnRslt_abort_qty = p.Rslt_abort_qty_p_PPanel.columnQty_qty;
		p.columnRslt_abort_qty.addAliasName("Rslt.abort_qty", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$itm_grp_p);
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
		p.Rslt_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP2250.RsltR.$bp_grp_p);
		p.Rslt_bp_grp_p_PPanel.setName("Rslt.bp_grp_p");
		p.columnRslt_bp_grp_cd1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bp_grp_cd1.addAliasName("Rslt.bp_grp_cd1", p);
		p.columnRslt_bp_grp_nm1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bp_grp_nm1.addAliasName("Rslt.bp_grp_nm1", p);
		p.columnRslt_bp_grp_cd2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bp_grp_cd2.addAliasName("Rslt.bp_grp_cd2", p);
		p.columnRslt_bp_grp_nm2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bp_grp_nm2.addAliasName("Rslt.bp_grp_nm2", p);
		p.columnRslt_bp_grp_cd3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bp_grp_cd3.addAliasName("Rslt.bp_grp_cd3", p);
		p.columnRslt_bp_grp_nm3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bp_grp_nm3.addAliasName("Rslt.bp_grp_nm3", p);
		p.columnRslt_bp_grp_cd4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bp_grp_cd4.addAliasName("Rslt.bp_grp_cd4", p);
		p.columnRslt_bp_grp_nm4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bp_grp_nm4.addAliasName("Rslt.bp_grp_nm4", p);
		p.columnRslt_bp_grp_cd5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bp_grp_cd5.addAliasName("Rslt.bp_grp_cd5", p);
		p.columnRslt_bp_grp_nm5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bp_grp_nm5.addAliasName("Rslt.bp_grp_nm5", p);
		p.columnRslt_bp_grp_cd6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bp_grp_cd6.addAliasName("Rslt.bp_grp_cd6", p);
		p.columnRslt_bp_grp_nm6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bp_grp_nm6.addAliasName("Rslt.bp_grp_nm6", p);
		p.columnRslt_bp_grp_cd7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bp_grp_cd7.addAliasName("Rslt.bp_grp_cd7", p);
		p.columnRslt_bp_grp_nm7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bp_grp_nm7.addAliasName("Rslt.bp_grp_nm7", p);
		p.columnRslt_bp_grp_cd8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bp_grp_cd8.addAliasName("Rslt.bp_grp_cd8", p);
		p.columnRslt_bp_grp_nm8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bp_grp_nm8.addAliasName("Rslt.bp_grp_nm8", p);
		p.columnRslt_bp_grp_cd9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bp_grp_cd9.addAliasName("Rslt.bp_grp_cd9", p);
		p.columnRslt_bp_grp_nm9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bp_grp_nm9.addAliasName("Rslt.bp_grp_nm9", p);
		p.columnRslt_bp_grp_cd10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bp_grp_cd10.addAliasName("Rslt.bp_grp_cd10", p);
		p.columnRslt_bp_grp_nm10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bp_grp_nm10.addAliasName("Rslt.bp_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_RcptIvSrch p) {
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

	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_in_to_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_id_typ_p = null;

	/**
	 * [Cnd_in_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_id_typ_ListPutter() {
		if (Cnd_in_to_id_typ_p == null) {
			Cnd_in_to_id_typ_p = createCnd_in_to_id_typ_ListPutter(Cnd_in_to_id_typ, "in_to_id_typ", "in_to_id_typ_nm");

		}
		return Cnd_in_to_id_typ_p;
	}
	
	
	/** [Cnd_in_to_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_id_cd_p = null;

	/**
	 * [Cnd_in_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_id_cd_ListPutter() {
		if (Cnd_in_to_id_cd_p == null) {
			Cnd_in_to_id_cd_p = createCnd_in_to_id_cd_ListPutter(Cnd_in_to_id_cd, "in_to_id_cd", "in_to_id_nm");

		}
		return Cnd_in_to_id_cd_p;
	}
	
	
	/** [Cnd_purc_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_usr_cd_p = null;

	/**
	 * [Cnd_purc_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_usr_cd_ListPutter() {
		if (Cnd_purc_usr_cd_p == null) {
			Cnd_purc_usr_cd_p = createCnd_purc_usr_cd_ListPutter(Cnd_purc_usr_cd, "purc_usr_cd", "purc_usr_nm");

		}
		return Cnd_purc_usr_cd_p;
	}
	
	
	/** [Cnd_purc_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_dpt_cd_p = null;

	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_dpt_cd_ListPutter() {
		if (Cnd_purc_dpt_cd_p == null) {
			Cnd_purc_dpt_cd_p = createCnd_purc_dpt_cd_ListPutter(Cnd_purc_dpt_cd, "purc_dpt_cd", "purc_dpt_nm");

		}
		return Cnd_purc_dpt_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
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
	
	
	/** [Rslt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dscnt_rsn_cd_p = null;

	/**
	 * [Rslt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dscnt_rsn_cd_ListPutter() {
		if (Rslt_dscnt_rsn_cd_p == null) {
			Rslt_dscnt_rsn_cd_p = createRslt_dscnt_rsn_cd_ListPutter(columnRslt_dscnt_rsn_cd, "dscnt_rsn_cd");

		}
		return Rslt_dscnt_rsn_cd_p;
	}
	
	
	/** [Rslt_purc_id_typ_ListPutter]の定義 */
	private MCListPutter Rslt_purc_id_typ_p = null;

	/**
	 * [Rslt_purc_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_purc_id_typ_ListPutter() {
		if (Rslt_purc_id_typ_p == null) {
			Rslt_purc_id_typ_p = createRslt_purc_id_typ_ListPutter(columnRslt_purc_id_typ, "purc_id_typ");

		}
		return Rslt_purc_id_typ_p;
	}
	
	
	/** [Rslt_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_purc_rsn_cd_p = null;

	/**
	 * [Rslt_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_purc_rsn_cd_ListPutter() {
		if (Rslt_purc_rsn_cd_p == null) {
			Rslt_purc_rsn_cd_p = createRslt_purc_rsn_cd_ListPutter(columnRslt_purc_rsn_cd, "purc_rsn_cd");

		}
		return Rslt_purc_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvSrch create(){
		MSBEP_RcptIvSrch p = new MSBEP_RcptIvSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvSrch create(String name){
		MSBEP_RcptIvSrch p = new MSBEP_RcptIvSrch(name);
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
		MSBEP_RcptIvSrch_MC.jbfInitFix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitSts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitDispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitTop((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitFold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitTab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitTab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitTab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitSpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitCtrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitRPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitRslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbfInitBtn((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitFix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitSts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitDispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitTop((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitFold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitTab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitTab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitTab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitSpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitCtrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitRPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitRslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.jbInitBtn((MSBEP_RcptIvSrch)this);
	}

	/**
	 * [Fix]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFix(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.FixPanel = p.beansFactory.createPanel("Fix");
		p.FixTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_RcptIvSrch p) {
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
	protected static void jbfInitTab1(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplBpCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplBpCnd(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.SpplBpCndPanel = p.beansFactory.createPanel("SpplBpCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_not_fix_flg = p.beansFactory.createCheckBox("Cnd.not_fix_flg");
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_im_not_comp_flg = p.beansFactory.createCheckBox("Cnd.im_not_comp_flg");
		p.Cnd_im_comp_flg = p.beansFactory.createCheckBox("Cnd.im_comp_flg");
		p.Cnd_hdr_dtl_Group = p.beansFactory.createButtonGroup("Cnd.hdr_dtl");
		p.Cnd_hdr_dtl_Hdr = p.beansFactory.createRadioButton("Cnd.hdr_dtl_Hdr");
		p.Cnd_hdr_dtl_Dtl = p.beansFactory.createRadioButton("Cnd.hdr_dtl_Dtl");
		p.Cnd_purc_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_fr_Label");
		p.Cnd_purc_schd_dt_fr = p.beansFactory.createDateField("Cnd.purc_schd_dt_fr");
		p.Cnd_purc_schd_dt_fr.setLabel(p.Cnd_purc_schd_dt_fr_Label);
		p.Cnd_purc_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_to_Label");
		p.Cnd_purc_schd_dt_to = p.beansFactory.createDateField("Cnd.purc_schd_dt_to");
		p.Cnd_purc_schd_dt_to.setLabel(p.Cnd_purc_schd_dt_to_Label);
		p.Cnd_purc_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_dt_fr_Label");
		p.Cnd_purc_dt_fr = p.beansFactory.createDateField("Cnd.purc_dt_fr");
		p.Cnd_purc_dt_fr.setLabel(p.Cnd_purc_dt_fr_Label);
		p.Cnd_purc_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_dt_to_Label");
		p.Cnd_purc_dt_to = p.beansFactory.createDateField("Cnd.purc_dt_to");
		p.Cnd_purc_dt_to.setLabel(p.Cnd_purc_dt_to_Label);
		p.Cnd_iv_dt_fr_Label = p.beansFactory.createLabel("Cnd.iv_dt_fr_Label");
		p.Cnd_iv_dt_fr = p.beansFactory.createDateField("Cnd.iv_dt_fr");
		p.Cnd_iv_dt_fr.setLabel(p.Cnd_iv_dt_fr_Label);
		p.Cnd_iv_dt_to_Label = p.beansFactory.createLabel("Cnd.iv_dt_to_Label");
		p.Cnd_iv_dt_to = p.beansFactory.createDateField("Cnd.iv_dt_to");
		p.Cnd_iv_dt_to.setLabel(p.Cnd_iv_dt_to_Label);
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_d_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_d_no_Label");
		p.Cnd_rcpt_iv_d_no = p.beansFactory.createTextField("Cnd.rcpt_iv_d_no");
		p.Cnd_rcpt_iv_d_no.setLabel(p.Cnd_rcpt_iv_d_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_in_to_id_typ_Label = p.beansFactory.createLabel("Cnd.in_to_id_typ_Label");
		p.Cnd_in_to_id_typ = p.beansFactory.createTextComboBox("Cnd.in_to_id_typ");
		p.Cnd_in_to_id_typ.setLabel(p.Cnd_in_to_id_typ_Label);
		p.Cnd_in_to_id_typ_nm = p.beansFactory.createTextField("Cnd.in_to_id_typ_nm");
		p.Cnd_in_to_id_cd_Label = p.beansFactory.createLabel("Cnd.in_to_id_cd_Label");
		p.Cnd_in_to_id_cd = p.beansFactory.createTextComboBox("Cnd.in_to_id_cd");
		p.Cnd_in_to_id_cd.setLabel(p.Cnd_in_to_id_cd_Label);
		p.Cnd_in_to_id_nm = p.beansFactory.createTextField("Cnd.in_to_id_nm");
		p.Cnd_purc_usr_cd_Label = p.beansFactory.createLabel("Cnd.purc_usr_cd_Label");
		p.Cnd_purc_usr_cd = p.beansFactory.createTextField("Cnd.purc_usr_cd");
		p.Cnd_purc_usr_cd.setLabel(p.Cnd_purc_usr_cd_Label);
		p.Cnd_purc_usr_nm = p.beansFactory.createTextField("Cnd.purc_usr_nm");
		p.Cnd_purc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.purc_dpt_cd_Label");
		p.Cnd_purc_dpt_cd = p.beansFactory.createTextField("Cnd.purc_dpt_cd");
		p.Cnd_purc_dpt_cd.setLabel(p.Cnd_purc_dpt_cd_Label);
		p.Cnd_purc_dpt_nm = p.beansFactory.createTextField("Cnd.purc_dpt_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_rcpt_iv_rmrks_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_rmrks_Label");
		p.Cnd_rcpt_iv_rmrks = p.beansFactory.createTextField("Cnd.rcpt_iv_rmrks");
		p.Cnd_rcpt_iv_rmrks.setLabel(p.Cnd_rcpt_iv_rmrks_Label);
		p.Cnd_rcpt_iv_d_rmrks_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_d_rmrks_Label");
		p.Cnd_rcpt_iv_d_rmrks = p.beansFactory.createTextField("Cnd.rcpt_iv_d_rmrks");
		p.Cnd_rcpt_iv_d_rmrks.setLabel(p.Cnd_rcpt_iv_d_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_sub_d_char1_Label = p.beansFactory.createLabel("Cnd.sub_d_char1_Label");
		p.Cnd_sub_d_char1 = p.beansFactory.createTextField("Cnd.sub_d_char1");
		p.Cnd_sub_d_char1.setLabel(p.Cnd_sub_d_char1_Label);
		p.Cnd_sub_d_char2_Label = p.beansFactory.createLabel("Cnd.sub_d_char2_Label");
		p.Cnd_sub_d_char2 = p.beansFactory.createTextField("Cnd.sub_d_char2");
		p.Cnd_sub_d_char2.setLabel(p.Cnd_sub_d_char2_Label);
		p.Cnd_sub_d_char3_Label = p.beansFactory.createLabel("Cnd.sub_d_char3_Label");
		p.Cnd_sub_d_char3 = p.beansFactory.createTextField("Cnd.sub_d_char3");
		p.Cnd_sub_d_char3.setLabel(p.Cnd_sub_d_char3_Label);
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
		p.Cnd_inc_past_flg = p.beansFactory.createCheckBox("Cnd.inc_past_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_purc_cmpl_flg = p.beansFactory.createTableColumn("Rslt.purc_cmpl_flg", MCColumnType.CHECK);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_rev = p.beansFactory.createTableColumn("Rslt.rcpt_iv_rev", MCColumnType.NUMBER);
		p.columnRslt_purc_schd_dt = p.beansFactory.createTableColumn("Rslt.purc_schd_dt", MCColumnType.DATE);
		p.columnRslt_purc_dt = p.beansFactory.createTableColumn("Rslt.purc_dt", MCColumnType.DATE);
		p.columnRslt_iv_dt = p.beansFactory.createTableColumn("Rslt.iv_dt", MCColumnType.DATE);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_in_to_id_typ = p.beansFactory.createTableColumn("Rslt.in_to_id_typ", MCColumnType.TEXT);
		p.columnRslt_in_to_id_typ_nm = p.beansFactory.createTableColumn("Rslt.in_to_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_in_to_id_cd = p.beansFactory.createTableColumn("Rslt.in_to_id_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_id_nm = p.beansFactory.createTableColumn("Rslt.in_to_id_nm", MCColumnType.TEXT);
		p.columnRslt_trnspt_cd = p.beansFactory.createTableColumn("Rslt.trnspt_cd", MCColumnType.TEXT);
		p.columnRslt_trnspt_nm = p.beansFactory.createTableColumn("Rslt.trnspt_nm", MCColumnType.TEXT);
		p.columnRslt_vssl_flght = p.beansFactory.createTableColumn("Rslt.vssl_flght", MCColumnType.TEXT);
		p.columnRslt_load_port_cd = p.beansFactory.createTableColumn("Rslt.load_port_cd", MCColumnType.TEXT);
		p.columnRslt_load_port_nm = p.beansFactory.createTableColumn("Rslt.load_port_nm", MCColumnType.TEXT);
		p.columnRslt_etd_dt = p.beansFactory.createTableColumn("Rslt.etd_dt", MCColumnType.DATE);
		p.columnRslt_dschrg_port_cd = p.beansFactory.createTableColumn("Rslt.dschrg_port_cd", MCColumnType.TEXT);
		p.columnRslt_dschrg_port_nm = p.beansFactory.createTableColumn("Rslt.dschrg_port_nm", MCColumnType.TEXT);
		p.columnRslt_eta_dt = p.beansFactory.createTableColumn("Rslt.eta_dt", MCColumnType.DATE);
		p.columnRslt_via_port_cd = p.beansFactory.createTableColumn("Rslt.via_port_cd", MCColumnType.TEXT);
		p.columnRslt_via_port_nm = p.beansFactory.createTableColumn("Rslt.via_port_nm", MCColumnType.TEXT);
		p.columnRslt_via_schd_dt = p.beansFactory.createTableColumn("Rslt.via_schd_dt", MCColumnType.DATE);
		p.columnRslt_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt = p.beansFactory.createTableColumn("Rslt.pay_schd_dt", MCColumnType.DATE);
		p.columnRslt_rcpt_iv_rmrks = p.beansFactory.createTableColumn("Rslt.rcpt_iv_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_rcpt_iv_d_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_no = p.beansFactory.createTableColumn("Rslt.purc_schd_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_base_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_repurc_obli_flg = p.beansFactory.createTableColumn("Rslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_dscnt_rsn_cd = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_dscnt_rsn_nm = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_tax_fix_flg = p.beansFactory.createTableColumn("Rslt.tax_fix_flg", MCColumnType.CHECK);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_cd = p.beansFactory.createTableColumn("Rslt.sppl_itm_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_nm = p.beansFactory.createTableColumn("Rslt.sppl_itm_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_purc_id_typ = p.beansFactory.createTableColumn("Rslt.purc_id_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_purc_id_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_purc_rsn_cd = p.beansFactory.createTableColumn("Rslt.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_purc_rsn_nm = p.beansFactory.createTableColumn("Rslt.purc_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_purc_usr_cd = p.beansFactory.createTableColumn("Rslt.purc_usr_cd", MCColumnType.TEXT);
		p.columnRslt_purc_usr_nm = p.beansFactory.createTableColumn("Rslt.purc_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_d_rmrks = p.beansFactory.createTableColumn("Rslt.rcpt_iv_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_manual_add_flg = p.beansFactory.createTableColumn("Rslt.manual_add_flg", MCColumnType.CHECK);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_iv_reg_flg = p.beansFactory.createTableColumn("Rslt.iv_reg_flg", MCColumnType.CHECK);
		p.columnRslt_cntry_org_cd = p.beansFactory.createTableColumn("Rslt.cntry_org_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_org_nm = p.beansFactory.createTableColumn("Rslt.cntry_org_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_sub_char1 = p.beansFactory.createTableColumn("Rslt.rcpt_iv_sub_char1", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_sub_char2 = p.beansFactory.createTableColumn("Rslt.rcpt_iv_sub_char2", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_sub_char3 = p.beansFactory.createTableColumn("Rslt.rcpt_iv_sub_char3", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.rcpt_iv_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.rcpt_iv_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.rcpt_iv_d_sub_char3", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2210 = p.beansFactory.createButton("Btn.open_MSBEP2210", "open");
		p.Btn_open_MSBEP1730 = p.beansFactory.createButton("Btn.open_MSBEP1730", "open");
	}

	/**
	 * [Fix]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFix(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.FixPanel.setBorder(p.FixTitledBorder);
		p.add(p.FixPanel);
		p.setLastBeans(p.FixPanel);
		p.FixPanel.setNextBeans(p.StsPanel);
		p.FixPanel.setValueCheck(false);
		p.FixPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FixPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.StsPanel.setNextBeans(p.DispUnitPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.TopPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_RcptIvSrch p) {
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
	protected static void jbInitFold(MSBEP_RcptIvSrch p) {
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
	protected static void jbInitTab1(MSBEP_RcptIvSrch p) {
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
	protected static void jbInitTab2(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SpplBpCndPanel, null);
		p.Tab2Panel.setLastBeans(p.SpplBpCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.ItmCndPanel, null);
		p.Tab3Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [SpplBpCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplBpCnd(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.SpplBpCndPanel.setValueCheck(false);
		p.SpplBpCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplBpCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FixPanel.add(p.Cnd_not_fix_flg);
		p.FixPanel.setLastBeans(p.Cnd_not_fix_flg);
		p.Cnd_not_fix_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_not_fix_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.not_fix_flg_META);
		p.FixPanel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.fix_flg_META);
		p.StsPanel.add(p.Cnd_im_not_comp_flg);
		p.StsPanel.setLastBeans(p.Cnd_im_not_comp_flg);
		p.Cnd_im_not_comp_flg.setNextBeans(p.Cnd_im_comp_flg);
		p.Cnd_im_not_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.im_not_comp_flg_META);
		p.StsPanel.add(p.Cnd_im_comp_flg);
		p.Cnd_im_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.im_comp_flg_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_hdr_dtl_Group);
		p.Cnd_hdr_dtl_Group.setFirstBeans(p.Cnd_hdr_dtl_Hdr);
		p.Cnd_hdr_dtl_Hdr.setActionCommand("0");
		p.Cnd_hdr_dtl_Group.add(p.Cnd_hdr_dtl_Hdr);
		p.DispUnitPanel.add(p.Cnd_hdr_dtl_Hdr);
		p.Cnd_hdr_dtl_Hdr.setNextBeans(p.Cnd_hdr_dtl_Dtl);
		p.Cnd_hdr_dtl_Dtl.setActionCommand("1");
		p.Cnd_hdr_dtl_Group.add(p.Cnd_hdr_dtl_Dtl);
		p.DispUnitPanel.add(p.Cnd_hdr_dtl_Dtl);
		p.Cnd_hdr_dtl_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.hdr_dtl_META);
		p.CndPanel.add(p.Cnd_purc_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_purc_schd_dt_fr);
		p.Cnd_purc_schd_dt_fr.setNextBeans(p.Cnd_purc_schd_dt_to);
		p.Cnd_purc_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_schd_dt_fr_META);
		p.Cnd_purc_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt_to);
		p.Cnd_purc_schd_dt_to.setNextBeans(p.Cnd_purc_dt_fr);
		p.Cnd_purc_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_schd_dt_to_META);
		p.Cnd_purc_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_dt_fr);
		p.Cnd_purc_dt_fr.setNextBeans(p.Cnd_purc_dt_to);
		p.Cnd_purc_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_dt_fr_META);
		p.Cnd_purc_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_dt_to);
		p.Cnd_purc_dt_to.setNextBeans(p.Cnd_iv_dt_fr);
		p.Cnd_purc_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_dt_to_META);
		p.Cnd_purc_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_iv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_iv_dt_fr);
		p.Cnd_iv_dt_fr.setNextBeans(p.Cnd_iv_dt_to);
		p.Cnd_iv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.iv_dt_fr_META);
		p.Cnd_iv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_iv_dt_to_Label);
		p.CndPanel.add(p.Cnd_iv_dt_to);
		p.Cnd_iv_dt_to.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_iv_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.iv_dt_to_META);
		p.Cnd_iv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_d_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_d_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_d_no);
		p.Cnd_rcpt_iv_d_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_rcpt_iv_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.rcpt_iv_d_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_d_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_in_to_id_typ);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sppl_nm_META);
		p.Cnd_in_to_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_id_typ, true);
		p.Cnd_in_to_id_typ.setLinkBeans(p.Cnd_in_to_id_typ_nm);
		p.CndPanel.add(p.Cnd_in_to_id_typ_Label);
		p.CndPanel.add(p.Cnd_in_to_id_typ);
		p.Cnd_in_to_id_typ.setNextBeans(p.Cnd_in_to_id_typ_nm);
		p.Cnd_in_to_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.in_to_id_typ_META);
		p.CndPanel.add(p.Cnd_in_to_id_typ_nm);
		p.Cnd_in_to_id_typ_nm.setNextBeans(p.Cnd_in_to_id_cd);
		p.Cnd_in_to_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.in_to_id_typ_nm_META);
		p.Cnd_in_to_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_id_cd, true);
		p.Cnd_in_to_id_cd.setLinkBeans(p.Cnd_in_to_id_nm);
		p.CndPanel.add(p.Cnd_in_to_id_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_id_cd);
		p.Cnd_in_to_id_cd.setNextBeans(p.Cnd_in_to_id_nm);
		p.Cnd_in_to_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.in_to_id_cd_META);
		p.CndPanel.add(p.Cnd_in_to_id_nm);
		p.Cnd_in_to_id_nm.setNextBeans(p.Cnd_purc_usr_cd);
		p.Cnd_in_to_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.in_to_id_nm_META);
		p.CndPanel.add(p.Cnd_purc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_purc_usr_cd);
		p.Cnd_purc_usr_cd.setNextBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_usr_cd_META);
		p.Cnd_purc_usr_cd.addLinkBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_usr_cd, true);
		p.CndPanel.add(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_nm.setNextBeans(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_usr_nm_META);
		p.CndPanel.add(p.Cnd_purc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_dpt_cd.setNextBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_dpt_cd_META);
		p.Cnd_purc_dpt_cd.addLinkBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_cd, true);
		p.CndPanel.add(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.purc_dpt_nm_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_rcpt_iv_rmrks);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.cst_itm_nm_META);
		p.CndPanel.add(p.Cnd_rcpt_iv_rmrks_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_rmrks);
		p.Cnd_rcpt_iv_rmrks.setNextBeans(p.Cnd_rcpt_iv_d_rmrks);
		p.Cnd_rcpt_iv_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.rcpt_iv_rmrks_META);
		p.CndPanel.add(p.Cnd_rcpt_iv_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_d_rmrks);
		p.Cnd_rcpt_iv_d_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rcpt_iv_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.rcpt_iv_d_rmrks_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_sub_d_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sub_char3_META);
		p.CndPanel.add(p.Cnd_sub_d_char1_Label);
		p.CndPanel.add(p.Cnd_sub_d_char1);
		p.Cnd_sub_d_char1.setNextBeans(p.Cnd_sub_d_char2);
		p.Cnd_sub_d_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sub_d_char1_META);
		p.CndPanel.add(p.Cnd_sub_d_char2_Label);
		p.CndPanel.add(p.Cnd_sub_d_char2);
		p.Cnd_sub_d_char2.setNextBeans(p.Cnd_sub_d_char3);
		p.Cnd_sub_d_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sub_d_char2_META);
		p.CndPanel.add(p.Cnd_sub_d_char3_Label);
		p.CndPanel.add(p.Cnd_sub_d_char3);
		p.Cnd_sub_d_char3.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_sub_d_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.sub_d_char3_META);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setNextBeans(p.Cnd_inc_past_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.inc_can_flg_META);
		p.CndPanel.add(p.Cnd_inc_past_flg);
		p.Cnd_inc_past_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2250.CndR.inc_past_flg_META);
		p.SpplBpCndPanel.add(p.Cnd_bp_grp_p_PPanel);
		p.SpplBpCndPanel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_RcptIvSrch p) {
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
	protected static void jbInitRPnl(MSBEP_RcptIvSrch p) {
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
	protected static void jbInitRslt(MSBEP_RcptIvSrch p) {
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
	protected static void jbInitBtn(MSBEP_RcptIvSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP2210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP2210);
		p.Btn_open_MSBEP2210.setNextBeans(p.Btn_open_MSBEP1730);
		p.Btn_open_MSBEP1730.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP1730);
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
		MSBEP_RcptIvSrch_MC.mcInitFix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitSts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitDispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitTop((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitFold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitTab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitTab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitTab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitSpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitCtrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitRPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitRslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.mcInitBtn((MSBEP_RcptIvSrch)this);

		// [SRCH_HDR]ステータスのモードの設定
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Fix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Sts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_DispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Top((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Fold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Tab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Tab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Tab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_SpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_ItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Cnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Ctrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_RPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Rslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__HDR_Btn((MSBEP_RcptIvSrch)this);

		// [SRCH_DTL]ステータスのモードの設定
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Fix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Sts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_DispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Top((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Fold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Tab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Tab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Tab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_SpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_ItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Cnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Ctrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_RPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Rslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitSRCH__DTL_Btn((MSBEP_RcptIvSrch)this);

		// [REF_HDR]ステータスのモードの設定
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Fix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Sts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_DispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Top((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Fold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Tab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Tab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Tab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_SpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_ItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Cnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Ctrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_RPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Rslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__HDR_Btn((MSBEP_RcptIvSrch)this);

		// [REF_DTL]ステータスのモードの設定
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Fix((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Sts((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_DispUnit((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Top((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Fold((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Tab1((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Tab2((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Tab3((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_SpplBpCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_ItmCnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Cnd((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Ctrl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_RPnl((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Rslt((MSBEP_RcptIvSrch)this);
		MSBEP_RcptIvSrch_MC.statusInitREF__DTL_Btn((MSBEP_RcptIvSrch)this);

	}

	/**
	 *  [Fix]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFix(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_RcptIvSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [SpplBpCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplBpCnd(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_RcptIvSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_RcptIvSrch p) {
		p.Cnd_not_fix_flg.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_im_not_comp_flg.addAllListener(p);
		p.Cnd_im_comp_flg.addAllListener(p);
		p.Cnd_hdr_dtl_Group.addAllListener(p);
		p.Cnd_hdr_dtl_Hdr.addAllListener(p);
		p.Cnd_hdr_dtl_Dtl.addAllListener(p);
		p.Cnd_purc_schd_dt_fr.setListListener(p);
		p.Cnd_purc_schd_dt_fr.addAllListener(p);
		p.Cnd_purc_schd_dt_to.setListListener(p);
		p.Cnd_purc_schd_dt_to.addAllListener(p);
		p.Cnd_purc_dt_fr.setListListener(p);
		p.Cnd_purc_dt_fr.addAllListener(p);
		p.Cnd_purc_dt_to.setListListener(p);
		p.Cnd_purc_dt_to.addAllListener(p);
		p.Cnd_iv_dt_fr.setListListener(p);
		p.Cnd_iv_dt_fr.addAllListener(p);
		p.Cnd_iv_dt_to.setListListener(p);
		p.Cnd_iv_dt_to.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_d_no.setListListener(p);
		p.Cnd_rcpt_iv_d_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_in_to_id_typ.setListListener(p);
		p.Cnd_in_to_id_typ.addAllListener(p);
		p.Cnd_in_to_id_typ_nm.setListListener(p);
		p.Cnd_in_to_id_typ_nm.addAllListener(p);
		p.Cnd_in_to_id_cd.setListListener(p);
		p.Cnd_in_to_id_cd.addAllListener(p);
		p.Cnd_in_to_id_nm.setListListener(p);
		p.Cnd_in_to_id_nm.addAllListener(p);
		p.Cnd_purc_usr_cd.setListListener(p);
		p.Cnd_purc_usr_cd.addAllListener(p);
		p.Cnd_purc_usr_nm.setListListener(p);
		p.Cnd_purc_usr_nm.addAllListener(p);
		p.Cnd_purc_dpt_cd.setListListener(p);
		p.Cnd_purc_dpt_cd.addAllListener(p);
		p.Cnd_purc_dpt_nm.setListListener(p);
		p.Cnd_purc_dpt_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_rcpt_iv_rmrks.setListListener(p);
		p.Cnd_rcpt_iv_rmrks.addAllListener(p);
		p.Cnd_rcpt_iv_d_rmrks.setListListener(p);
		p.Cnd_rcpt_iv_d_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_sub_d_char1.setListListener(p);
		p.Cnd_sub_d_char1.addAllListener(p);
		p.Cnd_sub_d_char2.setListListener(p);
		p.Cnd_sub_d_char2.addAllListener(p);
		p.Cnd_sub_d_char3.setListListener(p);
		p.Cnd_sub_d_char3.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
		p.Cnd_inc_past_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_RcptIvSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_RcptIvSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_RcptIvSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_purc_cmpl_flg.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_rcpt_iv_rev.addAllListener(p);
		p.columnRslt_rcpt_iv_rev.setListListener(p);
		p.columnRslt_purc_schd_dt.addAllListener(p);
		p.columnRslt_purc_schd_dt.setListListener(p);
		p.columnRslt_purc_dt.addAllListener(p);
		p.columnRslt_purc_dt.setListListener(p);
		p.columnRslt_iv_dt.addAllListener(p);
		p.columnRslt_iv_dt.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_in_to_id_typ.addAllListener(p);
		p.columnRslt_in_to_id_typ.setListListener(p);
		p.columnRslt_in_to_id_typ_nm.addAllListener(p);
		p.columnRslt_in_to_id_typ_nm.setListListener(p);
		p.columnRslt_in_to_id_cd.addAllListener(p);
		p.columnRslt_in_to_id_cd.setListListener(p);
		p.columnRslt_in_to_id_nm.addAllListener(p);
		p.columnRslt_in_to_id_nm.setListListener(p);
		p.columnRslt_trnspt_cd.addAllListener(p);
		p.columnRslt_trnspt_cd.setListListener(p);
		p.columnRslt_trnspt_nm.addAllListener(p);
		p.columnRslt_trnspt_nm.setListListener(p);
		p.columnRslt_vssl_flght.addAllListener(p);
		p.columnRslt_vssl_flght.setListListener(p);
		p.columnRslt_load_port_cd.addAllListener(p);
		p.columnRslt_load_port_cd.setListListener(p);
		p.columnRslt_load_port_nm.addAllListener(p);
		p.columnRslt_load_port_nm.setListListener(p);
		p.columnRslt_etd_dt.addAllListener(p);
		p.columnRslt_etd_dt.setListListener(p);
		p.columnRslt_dschrg_port_cd.addAllListener(p);
		p.columnRslt_dschrg_port_cd.setListListener(p);
		p.columnRslt_dschrg_port_nm.addAllListener(p);
		p.columnRslt_dschrg_port_nm.setListListener(p);
		p.columnRslt_eta_dt.addAllListener(p);
		p.columnRslt_eta_dt.setListListener(p);
		p.columnRslt_via_port_cd.addAllListener(p);
		p.columnRslt_via_port_cd.setListListener(p);
		p.columnRslt_via_port_nm.addAllListener(p);
		p.columnRslt_via_port_nm.setListListener(p);
		p.columnRslt_via_schd_dt.addAllListener(p);
		p.columnRslt_via_schd_dt.setListListener(p);
		p.columnRslt_tterm_cd1.addAllListener(p);
		p.columnRslt_tterm_cd1.setListListener(p);
		p.columnRslt_tterm_nm1.addAllListener(p);
		p.columnRslt_tterm_nm1.setListListener(p);
		p.columnRslt_tterm_rmrks1.addAllListener(p);
		p.columnRslt_tterm_rmrks1.setListListener(p);
		p.columnRslt_tterm_cd2.addAllListener(p);
		p.columnRslt_tterm_cd2.setListListener(p);
		p.columnRslt_tterm_nm2.addAllListener(p);
		p.columnRslt_tterm_nm2.setListListener(p);
		p.columnRslt_tterm_rmrks2.addAllListener(p);
		p.columnRslt_tterm_rmrks2.setListListener(p);
		p.columnRslt_tterm_cd3.addAllListener(p);
		p.columnRslt_tterm_cd3.setListListener(p);
		p.columnRslt_tterm_nm3.addAllListener(p);
		p.columnRslt_tterm_nm3.setListListener(p);
		p.columnRslt_tterm_rmrks3.addAllListener(p);
		p.columnRslt_tterm_rmrks3.setListListener(p);
		p.columnRslt_pay_schd_dt.addAllListener(p);
		p.columnRslt_pay_schd_dt.setListListener(p);
		p.columnRslt_rcpt_iv_rmrks.addAllListener(p);
		p.columnRslt_rcpt_iv_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_rcpt_iv_d_no.addAllListener(p);
		p.columnRslt_rcpt_iv_d_no.setListListener(p);
		p.columnRslt_purc_schd_no.addAllListener(p);
		p.columnRslt_purc_schd_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_base_amt_dec_place.addAllListener(p);
		p.columnRslt_base_amt_dec_place.setListListener(p);
		p.columnRslt_base_upri_dec_place.addAllListener(p);
		p.columnRslt_base_upri_dec_place.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_amt_dec_place.setListListener(p);
		p.columnRslt_trd_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_upri_dec_place.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_repurc_obli_flg.addAllListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.setListListener(p);
		p.columnRslt_dscnt_rsn_nm.addAllListener(p);
		p.columnRslt_dscnt_rsn_nm.setListListener(p);
		p.columnRslt_tax_fix_flg.addAllListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_tax_rate.addAllListener(p);
		p.columnRslt_tax_rate.setListListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_ptax_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_upri_dec_place.addAllListener(p);
		p.columnRslt_ptax_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_sppl_itm_cd.addAllListener(p);
		p.columnRslt_sppl_itm_cd.setListListener(p);
		p.columnRslt_sppl_itm_nm.addAllListener(p);
		p.columnRslt_sppl_itm_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_purc_id_typ.addAllListener(p);
		p.columnRslt_purc_id_typ.setListListener(p);
		p.columnRslt_purc_id_typ_nm.addAllListener(p);
		p.columnRslt_purc_id_typ_nm.setListListener(p);
		p.columnRslt_purc_rsn_cd.addAllListener(p);
		p.columnRslt_purc_rsn_cd.setListListener(p);
		p.columnRslt_purc_rsn_nm.addAllListener(p);
		p.columnRslt_purc_rsn_nm.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_purc_usr_cd.addAllListener(p);
		p.columnRslt_purc_usr_cd.setListListener(p);
		p.columnRslt_purc_usr_nm.addAllListener(p);
		p.columnRslt_purc_usr_nm.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_rcpt_iv_d_rmrks.addAllListener(p);
		p.columnRslt_rcpt_iv_d_rmrks.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_manual_add_flg.addAllListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_iv_reg_flg.addAllListener(p);
		p.columnRslt_cntry_org_cd.addAllListener(p);
		p.columnRslt_cntry_org_cd.setListListener(p);
		p.columnRslt_cntry_org_nm.addAllListener(p);
		p.columnRslt_cntry_org_nm.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_rcpt_iv_sub_char1.addAllListener(p);
		p.columnRslt_rcpt_iv_sub_char1.setListListener(p);
		p.columnRslt_rcpt_iv_sub_char2.addAllListener(p);
		p.columnRslt_rcpt_iv_sub_char2.setListListener(p);
		p.columnRslt_rcpt_iv_sub_char3.addAllListener(p);
		p.columnRslt_rcpt_iv_sub_char3.setListListener(p);
		p.columnRslt_rcpt_iv_d_sub_char1.addAllListener(p);
		p.columnRslt_rcpt_iv_d_sub_char1.setListListener(p);
		p.columnRslt_rcpt_iv_d_sub_char2.addAllListener(p);
		p.columnRslt_rcpt_iv_d_sub_char2.setListListener(p);
		p.columnRslt_rcpt_iv_d_sub_char3.addAllListener(p);
		p.columnRslt_rcpt_iv_d_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBEP_RcptIvSrch p) {
		p.Btn_open_MSBEP2210.addAllListener(p);
		p.Btn_open_MSBEP2210.setAPMethodName("doBtn_open_MSBEP2210");
		p.Btn_open_MSBEP1730.addAllListener(p);
		p.Btn_open_MSBEP1730.setAPMethodName("doBtn_open_MSBEP1730");
	}

	/**
	 * [SRCH_HDR]ステータスの[Fix]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fix(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Sts(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DispUnit(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Top(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab1(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab2(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab3(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_SpplBpCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ItmCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Cnd(MSBEP_RcptIvSrch p){
		p.Cnd_not_fix_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_im_not_comp_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_im_comp_flg.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_hdr_dtl_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_d_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_d_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_d_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Ctrl(MSBEP_RcptIvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_HDR, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_RPnl(MSBEP_RcptIvSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Rslt(MSBEP_RcptIvSrch p){
		p.columnRslt_fix_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_cmpl_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rev.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Rslt_in_to_id_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_rsn_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_rsn_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_manual_add_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_purc_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_abort_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_abort_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rcpt_iv_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_d_sub_char2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_d_sub_char3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__HDR_Btn(MSBEP_RcptIvSrch p){
		p.Btn_open_MSBEP2210.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_open_MSBEP1730.putMode(p, SRCH_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Fix]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fix(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Sts(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_DispUnit(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Top(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fold(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab1(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab2(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab3(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_SpplBpCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ItmCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Cnd(MSBEP_RcptIvSrch p){
		p.Cnd_not_fix_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_im_not_comp_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_im_comp_flg.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_hdr_dtl_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_d_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_d_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_d_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Ctrl(MSBEP_RcptIvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DTL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_RPnl(MSBEP_RcptIvSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Rslt(MSBEP_RcptIvSrch p){
		p.columnRslt_fix_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_cmpl_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rev.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_in_to_id_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_manual_add_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_bditm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_purc_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_abort_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__DTL_Btn(MSBEP_RcptIvSrch p){
		p.Btn_open_MSBEP2210.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_open_MSBEP1730.putMode(p, SRCH_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Fix]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fix(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Sts(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DispUnit(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Top(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab2(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab3(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SpplBpCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBEP_RcptIvSrch p){
		p.Cnd_not_fix_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_im_not_comp_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_im_comp_flg.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_hdr_dtl_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_purc_schd_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_d_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_d_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_d_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBEP_RcptIvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF_HDR, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBEP_RcptIvSrch p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Rslt(MSBEP_RcptIvSrch p){
		p.columnRslt_fix_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_cmpl_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Rslt_in_to_id_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_usr_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_usr_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_manual_add_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_reg_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_purc_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_abort_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_abort_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rcpt_iv_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_d_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_d_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF__HDR_Btn(MSBEP_RcptIvSrch p){
		p.Btn_open_MSBEP2210.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_open_MSBEP1730.putMode(p, REF_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Fix]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fix(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Sts(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DispUnit(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Top(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab2(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab3(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SpplBpCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmCnd(MSBEP_RcptIvSrch p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBEP_RcptIvSrch p){
		p.Cnd_not_fix_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_im_not_comp_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_im_comp_flg.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_hdr_dtl_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_purc_schd_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_dt_fr.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_d_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_d_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_d_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBEP_RcptIvSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF_DTL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBEP_RcptIvSrch p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Rslt(MSBEP_RcptIvSrch p){
		p.columnRslt_fix_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_cmpl_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_in_to_id_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ttl_trd_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_manual_add_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_bditm_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_purc_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_abort_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_abort_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_d_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF__DTL_Btn(MSBEP_RcptIvSrch p){
		p.Btn_open_MSBEP2210.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_open_MSBEP1730.putMode(p, REF_DTL, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_HDR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_RcptIvSrch_MC.setTableConfigRslt((MSBEP_RcptIvSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_RcptIvSrch p) {
		p.columnRslt_fix_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.columnRslt_purc_cmpl_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_cmpl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_cmpl_flg);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_rcpt_iv_rev.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_rev);
		p.columnRslt_purc_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_schd_dt_META);
		p.columnRslt_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_dt);
		p.columnRslt_purc_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_dt_META);
		p.columnRslt_purc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dt);
		p.columnRslt_iv_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.iv_dt_META);
		p.columnRslt_iv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_dt);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_in_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.in_to_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_typ);
		p.columnRslt_in_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.in_to_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_typ_nm);
		p.columnRslt_in_to_id_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.in_to_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_cd);
		p.columnRslt_in_to_id_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.in_to_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_nm);
		p.RsltTable.addTable(p.Rslt_in_to_id_p_PPanel.AddrTable);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_vssl_flght.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.vssl_flght_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vssl_flght);
		p.columnRslt_load_port_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.load_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_cd);
		p.columnRslt_load_port_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.load_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_nm);
		p.columnRslt_etd_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.etd_dt_META);
		p.columnRslt_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_etd_dt);
		p.columnRslt_dschrg_port_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.dschrg_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_cd);
		p.columnRslt_dschrg_port_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.dschrg_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_nm);
		p.columnRslt_eta_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.eta_dt_META);
		p.columnRslt_eta_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_eta_dt);
		p.columnRslt_via_port_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.via_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_cd);
		p.columnRslt_via_port_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.via_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_nm);
		p.columnRslt_via_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.via_schd_dt_META);
		p.columnRslt_via_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_via_schd_dt);
		p.columnRslt_tterm_cd1.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd1);
		p.columnRslt_tterm_nm1.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm1);
		p.columnRslt_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks1);
		p.columnRslt_tterm_cd2.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd2);
		p.columnRslt_tterm_nm2.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm2);
		p.columnRslt_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks2);
		p.columnRslt_tterm_cd3.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd3);
		p.columnRslt_tterm_nm3.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm3);
		p.columnRslt_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks3);
		p.columnRslt_pay_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.pay_schd_dt_META);
		p.columnRslt_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt);
		p.columnRslt_rcpt_iv_rmrks.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_rcpt_iv_d_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_d_no);
		p.columnRslt_purc_schd_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_base_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.base_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_amt_dec_place);
		p.columnRslt_base_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.base_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_upri_dec_place);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_amt_dec_place);
		p.columnRslt_trd_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.trd_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_upri_dec_place);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.RsltTable.addTable(p.Rslt_ttl_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.columnRslt_repurc_obli_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.repurc_obli_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_repurc_obli_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_dscnt_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.dscnt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_cd);
		p.columnRslt_dscnt_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.dscnt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_tax_fix_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tax_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_fix_flg);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_inc_ctax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_ptax_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ptax_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_amt_dec_place);
		p.columnRslt_ptax_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ptax_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_upri_dec_place);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.RsltTable.addTable(p.Rslt_ptax_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_sppl_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.sppl_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_cd);
		p.columnRslt_sppl_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.sppl_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_nm);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_purc_id_typ.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_id_typ);
		p.columnRslt_purc_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_id_typ_nm);
		p.columnRslt_purc_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_rsn_cd);
		p.columnRslt_purc_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_rsn_nm);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.columnRslt_purc_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_cd);
		p.columnRslt_purc_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.purc_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_nm);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_rcpt_iv_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_d_rmrks);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_manual_add_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.manual_add_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_manual_add_flg);
		p.RsltTable.addTable(p.Rslt_bditm_p_PPanel.BdItemTable);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_iv_reg_flg.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.iv_reg_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_reg_flg);
		p.columnRslt_cntry_org_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.cntry_org_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_cd);
		p.columnRslt_cntry_org_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.cntry_org_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_nm);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_purc_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_arr_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_accpt_dfct_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_abort_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_abort_qty_p_PPanel.QtyTable);
		p.columnRslt_rcpt_iv_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_sub_char1);
		p.columnRslt_rcpt_iv_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_sub_char2);
		p.columnRslt_rcpt_iv_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_sub_char3);
		p.columnRslt_rcpt_iv_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_d_sub_char1);
		p.columnRslt_rcpt_iv_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_d_sub_char2);
		p.columnRslt_rcpt_iv_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.rcpt_iv_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_d_sub_char3);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_bp_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP2250.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_in_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_id_typ.getListConfig().setPutter(getCnd_in_to_id_typ_ListPutter());
		Cnd_in_to_id_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_id_cd.getListConfig().setPutter(getCnd_in_to_id_cd_ListPutter());
		Cnd_purc_usr_cd.getListConfig().setPutter(getCnd_purc_usr_cd_ListPutter());
		Cnd_purc_dpt_cd.getListConfig().setPutter(getCnd_purc_dpt_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		columnRslt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dscnt_rsn_cd.getListConfig().setPutter(getRslt_dscnt_rsn_cd_ListPutter());
		columnRslt_purc_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_purc_id_typ.getListConfig().setPutter(getRslt_purc_id_typ_ListPutter());
		columnRslt_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_purc_rsn_cd.getListConfig().setPutter(getRslt_purc_rsn_cd_ListPutter());
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
	 * この画面を[SRCH_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DTLStatus() {
		status = SRCH_DTL;
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
	 * この画面を[REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DTLStatus() {
		status = REF_DTL;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_HDR.equals(status)) {
			setSRCH_HDRStatus();
		}
		else if (SRCH_DTL.equals(status)) {
			setSRCH_DTLStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
	}

	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_in_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InToIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_in_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.InToId");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
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
	 * [Rslt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_in_to_id_typ) return getCnd_in_to_id_typ(row, info);
		if(combo == Cnd_in_to_id_cd) return getCnd_in_to_id_cd(row, info);
		if(combo == Cnd_purc_usr_cd) return getCnd_purc_usr_cd(row, info);
		if(combo == Cnd_purc_dpt_cd) return getCnd_purc_dpt_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == columnRslt_dscnt_rsn_cd) return getRslt_dscnt_rsn_cd(row, info);
		if(combo == columnRslt_purc_id_typ) return getRslt_purc_id_typ(row, info);
		if(combo == columnRslt_purc_rsn_cd) return getRslt_purc_rsn_cd(row, info);
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
		else if (ap == Btn_open_MSBEP2210) doBtn_open_MSBEP2210(info);
		else if (ap == Btn_open_MSBEP1730) doBtn_open_MSBEP1730(info);
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
	 * [Btn]パネルの[open_MSBEP2210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1730]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1730(MCEventInfo info);

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
		if (vc == Cnd_not_fix_flg) return doCnd_not_fix_flg_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_im_not_comp_flg) return doCnd_im_not_comp_flg_VC(info);
		if (vc == Cnd_im_comp_flg) return doCnd_im_comp_flg_VC(info);
		if (vc == Cnd_hdr_dtl_Group) return doCnd_hdr_dtl_VC(info);
		if (vc == Cnd_purc_schd_dt_fr) return doCnd_purc_schd_dt_fr_VC(info);
		if (vc == Cnd_purc_schd_dt_to) return doCnd_purc_schd_dt_to_VC(info);
		if (vc == Cnd_purc_dt_fr) return doCnd_purc_dt_fr_VC(info);
		if (vc == Cnd_purc_dt_to) return doCnd_purc_dt_to_VC(info);
		if (vc == Cnd_iv_dt_fr) return doCnd_iv_dt_fr_VC(info);
		if (vc == Cnd_iv_dt_to) return doCnd_iv_dt_to_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_d_no) return doCnd_rcpt_iv_d_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_in_to_id_typ) return doCnd_in_to_id_typ_VC(info);
		if (vc == Cnd_in_to_id_typ_nm) return doCnd_in_to_id_typ_nm_VC(info);
		if (vc == Cnd_in_to_id_cd) return doCnd_in_to_id_cd_VC(info);
		if (vc == Cnd_in_to_id_nm) return doCnd_in_to_id_nm_VC(info);
		if (vc == Cnd_purc_usr_cd) return doCnd_purc_usr_cd_VC(info);
		if (vc == Cnd_purc_usr_nm) return doCnd_purc_usr_nm_VC(info);
		if (vc == Cnd_purc_dpt_cd) return doCnd_purc_dpt_cd_VC(info);
		if (vc == Cnd_purc_dpt_nm) return doCnd_purc_dpt_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_rcpt_iv_rmrks) return doCnd_rcpt_iv_rmrks_VC(info);
		if (vc == Cnd_rcpt_iv_d_rmrks) return doCnd_rcpt_iv_d_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_sub_d_char1) return doCnd_sub_d_char1_VC(info);
		if (vc == Cnd_sub_d_char2) return doCnd_sub_d_char2_VC(info);
		if (vc == Cnd_sub_d_char3) return doCnd_sub_d_char3_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == Cnd_inc_past_flg) return doCnd_inc_past_flg_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_purc_cmpl_flg) return doRslt_purc_cmpl_flg_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_rcpt_iv_rev) return doRslt_rcpt_iv_rev_VC(info);
		if (vc == columnRslt_purc_schd_dt) return doRslt_purc_schd_dt_VC(info);
		if (vc == columnRslt_purc_dt) return doRslt_purc_dt_VC(info);
		if (vc == columnRslt_iv_dt) return doRslt_iv_dt_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_in_to_id_typ) return doRslt_in_to_id_typ_VC(info);
		if (vc == columnRslt_in_to_id_typ_nm) return doRslt_in_to_id_typ_nm_VC(info);
		if (vc == columnRslt_in_to_id_cd) return doRslt_in_to_id_cd_VC(info);
		if (vc == columnRslt_in_to_id_nm) return doRslt_in_to_id_nm_VC(info);
		if (vc == columnRslt_trnspt_cd) return doRslt_trnspt_cd_VC(info);
		if (vc == columnRslt_trnspt_nm) return doRslt_trnspt_nm_VC(info);
		if (vc == columnRslt_vssl_flght) return doRslt_vssl_flght_VC(info);
		if (vc == columnRslt_load_port_cd) return doRslt_load_port_cd_VC(info);
		if (vc == columnRslt_load_port_nm) return doRslt_load_port_nm_VC(info);
		if (vc == columnRslt_etd_dt) return doRslt_etd_dt_VC(info);
		if (vc == columnRslt_dschrg_port_cd) return doRslt_dschrg_port_cd_VC(info);
		if (vc == columnRslt_dschrg_port_nm) return doRslt_dschrg_port_nm_VC(info);
		if (vc == columnRslt_eta_dt) return doRslt_eta_dt_VC(info);
		if (vc == columnRslt_via_port_cd) return doRslt_via_port_cd_VC(info);
		if (vc == columnRslt_via_port_nm) return doRslt_via_port_nm_VC(info);
		if (vc == columnRslt_via_schd_dt) return doRslt_via_schd_dt_VC(info);
		if (vc == columnRslt_tterm_cd1) return doRslt_tterm_cd1_VC(info);
		if (vc == columnRslt_tterm_nm1) return doRslt_tterm_nm1_VC(info);
		if (vc == columnRslt_tterm_rmrks1) return doRslt_tterm_rmrks1_VC(info);
		if (vc == columnRslt_tterm_cd2) return doRslt_tterm_cd2_VC(info);
		if (vc == columnRslt_tterm_nm2) return doRslt_tterm_nm2_VC(info);
		if (vc == columnRslt_tterm_rmrks2) return doRslt_tterm_rmrks2_VC(info);
		if (vc == columnRslt_tterm_cd3) return doRslt_tterm_cd3_VC(info);
		if (vc == columnRslt_tterm_nm3) return doRslt_tterm_nm3_VC(info);
		if (vc == columnRslt_tterm_rmrks3) return doRslt_tterm_rmrks3_VC(info);
		if (vc == columnRslt_pay_schd_dt) return doRslt_pay_schd_dt_VC(info);
		if (vc == columnRslt_rcpt_iv_rmrks) return doRslt_rcpt_iv_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_rcpt_iv_d_no) return doRslt_rcpt_iv_d_no_VC(info);
		if (vc == columnRslt_purc_schd_no) return doRslt_purc_schd_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_base_amt_dec_place) return doRslt_base_amt_dec_place_VC(info);
		if (vc == columnRslt_base_upri_dec_place) return doRslt_base_upri_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_amt_dec_place) return doRslt_trd_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_upri_dec_place) return doRslt_trd_upri_dec_place_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_repurc_obli_flg) return doRslt_repurc_obli_flg_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_dscnt_rsn_cd) return doRslt_dscnt_rsn_cd_VC(info);
		if (vc == columnRslt_dscnt_rsn_nm) return doRslt_dscnt_rsn_nm_VC(info);
		if (vc == columnRslt_tax_fix_flg) return doRslt_tax_fix_flg_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_ptax_amt_dec_place) return doRslt_ptax_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_upri_dec_place) return doRslt_ptax_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_sppl_itm_cd) return doRslt_sppl_itm_cd_VC(info);
		if (vc == columnRslt_sppl_itm_nm) return doRslt_sppl_itm_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_purc_id_typ) return doRslt_purc_id_typ_VC(info);
		if (vc == columnRslt_purc_id_typ_nm) return doRslt_purc_id_typ_nm_VC(info);
		if (vc == columnRslt_purc_rsn_cd) return doRslt_purc_rsn_cd_VC(info);
		if (vc == columnRslt_purc_rsn_nm) return doRslt_purc_rsn_nm_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_purc_usr_cd) return doRslt_purc_usr_cd_VC(info);
		if (vc == columnRslt_purc_usr_nm) return doRslt_purc_usr_nm_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_rcpt_iv_d_rmrks) return doRslt_rcpt_iv_d_rmrks_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_manual_add_flg) return doRslt_manual_add_flg_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_iv_reg_flg) return doRslt_iv_reg_flg_VC(info);
		if (vc == columnRslt_cntry_org_cd) return doRslt_cntry_org_cd_VC(info);
		if (vc == columnRslt_cntry_org_nm) return doRslt_cntry_org_nm_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_rcpt_iv_sub_char1) return doRslt_rcpt_iv_sub_char1_VC(info);
		if (vc == columnRslt_rcpt_iv_sub_char2) return doRslt_rcpt_iv_sub_char2_VC(info);
		if (vc == columnRslt_rcpt_iv_sub_char3) return doRslt_rcpt_iv_sub_char3_VC(info);
		if (vc == columnRslt_rcpt_iv_d_sub_char1) return doRslt_rcpt_iv_d_sub_char1_VC(info);
		if (vc == columnRslt_rcpt_iv_d_sub_char2) return doRslt_rcpt_iv_d_sub_char2_VC(info);
		if (vc == columnRslt_rcpt_iv_d_sub_char3) return doRslt_rcpt_iv_d_sub_char3_VC(info);
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
	 * [Cnd]パネルの[not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_fix_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[im_not_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_im_not_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[im_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_im_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[hdr_dtl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_hdr_dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_d_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_d_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_d_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_d_char3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_past_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_past_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_cmpl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vssl_flght_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[etd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_etd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[eta_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_eta_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_upri_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_upri_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[manual_add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_manual_add_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_d_sub_char3_VC(MCEventInfo info){
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
		else if (nc == Cnd_not_fix_flg) doCnd_not_fix_flg_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_im_not_comp_flg) doCnd_im_not_comp_flg_NC(info);
		else if (nc == Cnd_im_comp_flg) doCnd_im_comp_flg_NC(info);
		else if (nc == Cnd_hdr_dtl_Group) doCnd_hdr_dtl_NC(info);
		else if (nc == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NC(info);
		else if (nc == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NC(info);
		else if (nc == Cnd_purc_dt_fr) doCnd_purc_dt_fr_NC(info);
		else if (nc == Cnd_purc_dt_to) doCnd_purc_dt_to_NC(info);
		else if (nc == Cnd_iv_dt_fr) doCnd_iv_dt_fr_NC(info);
		else if (nc == Cnd_iv_dt_to) doCnd_iv_dt_to_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_in_to_id_typ) doCnd_in_to_id_typ_NC(info);
		else if (nc == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_NC(info);
		else if (nc == Cnd_in_to_id_cd) doCnd_in_to_id_cd_NC(info);
		else if (nc == Cnd_in_to_id_nm) doCnd_in_to_id_nm_NC(info);
		else if (nc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NC(info);
		else if (nc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NC(info);
		else if (nc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NC(info);
		else if (nc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_rcpt_iv_rmrks) doCnd_rcpt_iv_rmrks_NC(info);
		else if (nc == Cnd_rcpt_iv_d_rmrks) doCnd_rcpt_iv_d_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_sub_d_char1) doCnd_sub_d_char1_NC(info);
		else if (nc == Cnd_sub_d_char2) doCnd_sub_d_char2_NC(info);
		else if (nc == Cnd_sub_d_char3) doCnd_sub_d_char3_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == Cnd_inc_past_flg) doCnd_inc_past_flg_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_purc_cmpl_flg) doRslt_purc_cmpl_flg_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_rev) doRslt_rcpt_iv_rev_NC(info);
		else if (nc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NC(info);
		else if (nc == columnRslt_purc_dt) doRslt_purc_dt_NC(info);
		else if (nc == columnRslt_iv_dt) doRslt_iv_dt_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_NC(info);
		else if (nc == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_NC(info);
		else if (nc == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_NC(info);
		else if (nc == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_NC(info);
		else if (nc == columnRslt_trnspt_cd) doRslt_trnspt_cd_NC(info);
		else if (nc == columnRslt_trnspt_nm) doRslt_trnspt_nm_NC(info);
		else if (nc == columnRslt_vssl_flght) doRslt_vssl_flght_NC(info);
		else if (nc == columnRslt_load_port_cd) doRslt_load_port_cd_NC(info);
		else if (nc == columnRslt_load_port_nm) doRslt_load_port_nm_NC(info);
		else if (nc == columnRslt_etd_dt) doRslt_etd_dt_NC(info);
		else if (nc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NC(info);
		else if (nc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NC(info);
		else if (nc == columnRslt_eta_dt) doRslt_eta_dt_NC(info);
		else if (nc == columnRslt_via_port_cd) doRslt_via_port_cd_NC(info);
		else if (nc == columnRslt_via_port_nm) doRslt_via_port_nm_NC(info);
		else if (nc == columnRslt_via_schd_dt) doRslt_via_schd_dt_NC(info);
		else if (nc == columnRslt_tterm_cd1) doRslt_tterm_cd1_NC(info);
		else if (nc == columnRslt_tterm_nm1) doRslt_tterm_nm1_NC(info);
		else if (nc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_tterm_cd2) doRslt_tterm_cd2_NC(info);
		else if (nc == columnRslt_tterm_nm2) doRslt_tterm_nm2_NC(info);
		else if (nc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_tterm_cd3) doRslt_tterm_cd3_NC(info);
		else if (nc == columnRslt_tterm_nm3) doRslt_tterm_nm3_NC(info);
		else if (nc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NC(info);
		else if (nc == columnRslt_rcpt_iv_rmrks) doRslt_rcpt_iv_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_rcpt_iv_d_no) doRslt_rcpt_iv_d_no_NC(info);
		else if (nc == columnRslt_purc_schd_no) doRslt_purc_schd_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NC(info);
		else if (nc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NC(info);
		else if (nc == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NC(info);
		else if (nc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_purc_id_typ) doRslt_purc_id_typ_NC(info);
		else if (nc == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NC(info);
		else if (nc == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_NC(info);
		else if (nc == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NC(info);
		else if (nc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_rcpt_iv_d_rmrks) doRslt_rcpt_iv_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_manual_add_flg) doRslt_manual_add_flg_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NC(info);
		else if (nc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NC(info);
		else if (nc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_rcpt_iv_sub_char1) doRslt_rcpt_iv_sub_char1_NC(info);
		else if (nc == columnRslt_rcpt_iv_sub_char2) doRslt_rcpt_iv_sub_char2_NC(info);
		else if (nc == columnRslt_rcpt_iv_sub_char3) doRslt_rcpt_iv_sub_char3_NC(info);
		else if (nc == columnRslt_rcpt_iv_d_sub_char1) doRslt_rcpt_iv_d_sub_char1_NC(info);
		else if (nc == columnRslt_rcpt_iv_d_sub_char2) doRslt_rcpt_iv_d_sub_char2_NC(info);
		else if (nc == columnRslt_rcpt_iv_d_sub_char3) doRslt_rcpt_iv_d_sub_char3_NC(info);
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
	 * [Cnd]パネルの[not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[im_not_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_im_not_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[im_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_im_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_dtl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_dtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_d_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[manual_add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_add_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char3_NC(MCEventInfo info){
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
		else if (ne == Cnd_not_fix_flg) doCnd_not_fix_flg_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_im_not_comp_flg) doCnd_im_not_comp_flg_NE(info);
		else if (ne == Cnd_im_comp_flg) doCnd_im_comp_flg_NE(info);
		else if (ne == Cnd_hdr_dtl_Group) doCnd_hdr_dtl_NE(info);
		else if (ne == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NE(info);
		else if (ne == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NE(info);
		else if (ne == Cnd_purc_dt_fr) doCnd_purc_dt_fr_NE(info);
		else if (ne == Cnd_purc_dt_to) doCnd_purc_dt_to_NE(info);
		else if (ne == Cnd_iv_dt_fr) doCnd_iv_dt_fr_NE(info);
		else if (ne == Cnd_iv_dt_to) doCnd_iv_dt_to_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_in_to_id_typ) doCnd_in_to_id_typ_NE(info);
		else if (ne == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_NE(info);
		else if (ne == Cnd_in_to_id_cd) doCnd_in_to_id_cd_NE(info);
		else if (ne == Cnd_in_to_id_nm) doCnd_in_to_id_nm_NE(info);
		else if (ne == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NE(info);
		else if (ne == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NE(info);
		else if (ne == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NE(info);
		else if (ne == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_rcpt_iv_rmrks) doCnd_rcpt_iv_rmrks_NE(info);
		else if (ne == Cnd_rcpt_iv_d_rmrks) doCnd_rcpt_iv_d_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_sub_d_char1) doCnd_sub_d_char1_NE(info);
		else if (ne == Cnd_sub_d_char2) doCnd_sub_d_char2_NE(info);
		else if (ne == Cnd_sub_d_char3) doCnd_sub_d_char3_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == Cnd_inc_past_flg) doCnd_inc_past_flg_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_purc_cmpl_flg) doRslt_purc_cmpl_flg_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_rev) doRslt_rcpt_iv_rev_NE(info);
		else if (ne == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NE(info);
		else if (ne == columnRslt_purc_dt) doRslt_purc_dt_NE(info);
		else if (ne == columnRslt_iv_dt) doRslt_iv_dt_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_NE(info);
		else if (ne == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_NE(info);
		else if (ne == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_NE(info);
		else if (ne == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_NE(info);
		else if (ne == columnRslt_trnspt_cd) doRslt_trnspt_cd_NE(info);
		else if (ne == columnRslt_trnspt_nm) doRslt_trnspt_nm_NE(info);
		else if (ne == columnRslt_vssl_flght) doRslt_vssl_flght_NE(info);
		else if (ne == columnRslt_load_port_cd) doRslt_load_port_cd_NE(info);
		else if (ne == columnRslt_load_port_nm) doRslt_load_port_nm_NE(info);
		else if (ne == columnRslt_etd_dt) doRslt_etd_dt_NE(info);
		else if (ne == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NE(info);
		else if (ne == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NE(info);
		else if (ne == columnRslt_eta_dt) doRslt_eta_dt_NE(info);
		else if (ne == columnRslt_via_port_cd) doRslt_via_port_cd_NE(info);
		else if (ne == columnRslt_via_port_nm) doRslt_via_port_nm_NE(info);
		else if (ne == columnRslt_via_schd_dt) doRslt_via_schd_dt_NE(info);
		else if (ne == columnRslt_tterm_cd1) doRslt_tterm_cd1_NE(info);
		else if (ne == columnRslt_tterm_nm1) doRslt_tterm_nm1_NE(info);
		else if (ne == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_tterm_cd2) doRslt_tterm_cd2_NE(info);
		else if (ne == columnRslt_tterm_nm2) doRslt_tterm_nm2_NE(info);
		else if (ne == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_tterm_cd3) doRslt_tterm_cd3_NE(info);
		else if (ne == columnRslt_tterm_nm3) doRslt_tterm_nm3_NE(info);
		else if (ne == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NE(info);
		else if (ne == columnRslt_rcpt_iv_rmrks) doRslt_rcpt_iv_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_rcpt_iv_d_no) doRslt_rcpt_iv_d_no_NE(info);
		else if (ne == columnRslt_purc_schd_no) doRslt_purc_schd_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NE(info);
		else if (ne == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NE(info);
		else if (ne == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NE(info);
		else if (ne == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_purc_id_typ) doRslt_purc_id_typ_NE(info);
		else if (ne == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NE(info);
		else if (ne == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_NE(info);
		else if (ne == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NE(info);
		else if (ne == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_rcpt_iv_d_rmrks) doRslt_rcpt_iv_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_manual_add_flg) doRslt_manual_add_flg_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NE(info);
		else if (ne == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NE(info);
		else if (ne == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_rcpt_iv_sub_char1) doRslt_rcpt_iv_sub_char1_NE(info);
		else if (ne == columnRslt_rcpt_iv_sub_char2) doRslt_rcpt_iv_sub_char2_NE(info);
		else if (ne == columnRslt_rcpt_iv_sub_char3) doRslt_rcpt_iv_sub_char3_NE(info);
		else if (ne == columnRslt_rcpt_iv_d_sub_char1) doRslt_rcpt_iv_d_sub_char1_NE(info);
		else if (ne == columnRslt_rcpt_iv_d_sub_char2) doRslt_rcpt_iv_d_sub_char2_NE(info);
		else if (ne == columnRslt_rcpt_iv_d_sub_char3) doRslt_rcpt_iv_d_sub_char3_NE(info);
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
	 * [Cnd]パネルの[not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[im_not_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_im_not_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[im_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_im_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_dtl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_dtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_d_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[manual_add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_add_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char3_NE(MCEventInfo info){
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
		else if (nx == Cnd_not_fix_flg) doCnd_not_fix_flg_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_im_not_comp_flg) doCnd_im_not_comp_flg_NX(info);
		else if (nx == Cnd_im_comp_flg) doCnd_im_comp_flg_NX(info);
		else if (nx == Cnd_hdr_dtl_Group) doCnd_hdr_dtl_NX(info);
		else if (nx == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NX(info);
		else if (nx == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NX(info);
		else if (nx == Cnd_purc_dt_fr) doCnd_purc_dt_fr_NX(info);
		else if (nx == Cnd_purc_dt_to) doCnd_purc_dt_to_NX(info);
		else if (nx == Cnd_iv_dt_fr) doCnd_iv_dt_fr_NX(info);
		else if (nx == Cnd_iv_dt_to) doCnd_iv_dt_to_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_in_to_id_typ) doCnd_in_to_id_typ_NX(info);
		else if (nx == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_NX(info);
		else if (nx == Cnd_in_to_id_cd) doCnd_in_to_id_cd_NX(info);
		else if (nx == Cnd_in_to_id_nm) doCnd_in_to_id_nm_NX(info);
		else if (nx == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NX(info);
		else if (nx == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NX(info);
		else if (nx == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NX(info);
		else if (nx == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_rcpt_iv_rmrks) doCnd_rcpt_iv_rmrks_NX(info);
		else if (nx == Cnd_rcpt_iv_d_rmrks) doCnd_rcpt_iv_d_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_sub_d_char1) doCnd_sub_d_char1_NX(info);
		else if (nx == Cnd_sub_d_char2) doCnd_sub_d_char2_NX(info);
		else if (nx == Cnd_sub_d_char3) doCnd_sub_d_char3_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == Cnd_inc_past_flg) doCnd_inc_past_flg_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_purc_cmpl_flg) doRslt_purc_cmpl_flg_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_rev) doRslt_rcpt_iv_rev_NX(info);
		else if (nx == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NX(info);
		else if (nx == columnRslt_purc_dt) doRslt_purc_dt_NX(info);
		else if (nx == columnRslt_iv_dt) doRslt_iv_dt_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_NX(info);
		else if (nx == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_NX(info);
		else if (nx == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_NX(info);
		else if (nx == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_NX(info);
		else if (nx == columnRslt_trnspt_cd) doRslt_trnspt_cd_NX(info);
		else if (nx == columnRslt_trnspt_nm) doRslt_trnspt_nm_NX(info);
		else if (nx == columnRslt_vssl_flght) doRslt_vssl_flght_NX(info);
		else if (nx == columnRslt_load_port_cd) doRslt_load_port_cd_NX(info);
		else if (nx == columnRslt_load_port_nm) doRslt_load_port_nm_NX(info);
		else if (nx == columnRslt_etd_dt) doRslt_etd_dt_NX(info);
		else if (nx == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NX(info);
		else if (nx == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NX(info);
		else if (nx == columnRslt_eta_dt) doRslt_eta_dt_NX(info);
		else if (nx == columnRslt_via_port_cd) doRslt_via_port_cd_NX(info);
		else if (nx == columnRslt_via_port_nm) doRslt_via_port_nm_NX(info);
		else if (nx == columnRslt_via_schd_dt) doRslt_via_schd_dt_NX(info);
		else if (nx == columnRslt_tterm_cd1) doRslt_tterm_cd1_NX(info);
		else if (nx == columnRslt_tterm_nm1) doRslt_tterm_nm1_NX(info);
		else if (nx == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_tterm_cd2) doRslt_tterm_cd2_NX(info);
		else if (nx == columnRslt_tterm_nm2) doRslt_tterm_nm2_NX(info);
		else if (nx == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_tterm_cd3) doRslt_tterm_cd3_NX(info);
		else if (nx == columnRslt_tterm_nm3) doRslt_tterm_nm3_NX(info);
		else if (nx == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NX(info);
		else if (nx == columnRslt_rcpt_iv_rmrks) doRslt_rcpt_iv_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_rcpt_iv_d_no) doRslt_rcpt_iv_d_no_NX(info);
		else if (nx == columnRslt_purc_schd_no) doRslt_purc_schd_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NX(info);
		else if (nx == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NX(info);
		else if (nx == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NX(info);
		else if (nx == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_purc_id_typ) doRslt_purc_id_typ_NX(info);
		else if (nx == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NX(info);
		else if (nx == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_NX(info);
		else if (nx == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NX(info);
		else if (nx == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_rcpt_iv_d_rmrks) doRslt_rcpt_iv_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_manual_add_flg) doRslt_manual_add_flg_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NX(info);
		else if (nx == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NX(info);
		else if (nx == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_rcpt_iv_sub_char1) doRslt_rcpt_iv_sub_char1_NX(info);
		else if (nx == columnRslt_rcpt_iv_sub_char2) doRslt_rcpt_iv_sub_char2_NX(info);
		else if (nx == columnRslt_rcpt_iv_sub_char3) doRslt_rcpt_iv_sub_char3_NX(info);
		else if (nx == columnRslt_rcpt_iv_d_sub_char1) doRslt_rcpt_iv_d_sub_char1_NX(info);
		else if (nx == columnRslt_rcpt_iv_d_sub_char2) doRslt_rcpt_iv_d_sub_char2_NX(info);
		else if (nx == columnRslt_rcpt_iv_d_sub_char3) doRslt_rcpt_iv_d_sub_char3_NX(info);
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
	 * [Cnd]パネルの[not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[im_not_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_im_not_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[im_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_im_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[hdr_dtl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_hdr_dtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_d_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[manual_add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_manual_add_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char3_NX(MCEventInfo info){
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
		if (lc == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_LC(info);
		else if (lc == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_LC(info);
		else if (lc == Cnd_purc_dt_fr) doCnd_purc_dt_fr_LC(info);
		else if (lc == Cnd_purc_dt_to) doCnd_purc_dt_to_LC(info);
		else if (lc == Cnd_iv_dt_fr) doCnd_iv_dt_fr_LC(info);
		else if (lc == Cnd_iv_dt_to) doCnd_iv_dt_to_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_in_to_id_typ) doCnd_in_to_id_typ_LC(info);
		else if (lc == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_LC(info);
		else if (lc == Cnd_in_to_id_cd) doCnd_in_to_id_cd_LC(info);
		else if (lc == Cnd_in_to_id_nm) doCnd_in_to_id_nm_LC(info);
		else if (lc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_LC(info);
		else if (lc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_LC(info);
		else if (lc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_LC(info);
		else if (lc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_rcpt_iv_rmrks) doCnd_rcpt_iv_rmrks_LC(info);
		else if (lc == Cnd_rcpt_iv_d_rmrks) doCnd_rcpt_iv_d_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_sub_d_char1) doCnd_sub_d_char1_LC(info);
		else if (lc == Cnd_sub_d_char2) doCnd_sub_d_char2_LC(info);
		else if (lc == Cnd_sub_d_char3) doCnd_sub_d_char3_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_rev) doRslt_rcpt_iv_rev_LC(info);
		else if (lc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_LC(info);
		else if (lc == columnRslt_purc_dt) doRslt_purc_dt_LC(info);
		else if (lc == columnRslt_iv_dt) doRslt_iv_dt_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_LC(info);
		else if (lc == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_LC(info);
		else if (lc == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_LC(info);
		else if (lc == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_LC(info);
		else if (lc == columnRslt_trnspt_cd) doRslt_trnspt_cd_LC(info);
		else if (lc == columnRslt_trnspt_nm) doRslt_trnspt_nm_LC(info);
		else if (lc == columnRslt_vssl_flght) doRslt_vssl_flght_LC(info);
		else if (lc == columnRslt_load_port_cd) doRslt_load_port_cd_LC(info);
		else if (lc == columnRslt_load_port_nm) doRslt_load_port_nm_LC(info);
		else if (lc == columnRslt_etd_dt) doRslt_etd_dt_LC(info);
		else if (lc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_LC(info);
		else if (lc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_LC(info);
		else if (lc == columnRslt_eta_dt) doRslt_eta_dt_LC(info);
		else if (lc == columnRslt_via_port_cd) doRslt_via_port_cd_LC(info);
		else if (lc == columnRslt_via_port_nm) doRslt_via_port_nm_LC(info);
		else if (lc == columnRslt_via_schd_dt) doRslt_via_schd_dt_LC(info);
		else if (lc == columnRslt_tterm_cd1) doRslt_tterm_cd1_LC(info);
		else if (lc == columnRslt_tterm_nm1) doRslt_tterm_nm1_LC(info);
		else if (lc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_tterm_cd2) doRslt_tterm_cd2_LC(info);
		else if (lc == columnRslt_tterm_nm2) doRslt_tterm_nm2_LC(info);
		else if (lc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_tterm_cd3) doRslt_tterm_cd3_LC(info);
		else if (lc == columnRslt_tterm_nm3) doRslt_tterm_nm3_LC(info);
		else if (lc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_LC(info);
		else if (lc == columnRslt_rcpt_iv_rmrks) doRslt_rcpt_iv_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_rcpt_iv_d_no) doRslt_rcpt_iv_d_no_LC(info);
		else if (lc == columnRslt_purc_schd_no) doRslt_purc_schd_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_LC(info);
		else if (lc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_tax_rate) doRslt_tax_rate_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_LC(info);
		else if (lc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_purc_id_typ) doRslt_purc_id_typ_LC(info);
		else if (lc == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_LC(info);
		else if (lc == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_LC(info);
		else if (lc == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_LC(info);
		else if (lc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_rcpt_iv_d_rmrks) doRslt_rcpt_iv_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_LC(info);
		else if (lc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_rcpt_iv_sub_char1) doRslt_rcpt_iv_sub_char1_LC(info);
		else if (lc == columnRslt_rcpt_iv_sub_char2) doRslt_rcpt_iv_sub_char2_LC(info);
		else if (lc == columnRslt_rcpt_iv_sub_char3) doRslt_rcpt_iv_sub_char3_LC(info);
		else if (lc == columnRslt_rcpt_iv_d_sub_char1) doRslt_rcpt_iv_d_sub_char1_LC(info);
		else if (lc == columnRslt_rcpt_iv_d_sub_char2) doRslt_rcpt_iv_d_sub_char2_LC(info);
		else if (lc == columnRslt_rcpt_iv_d_sub_char3) doRslt_rcpt_iv_d_sub_char3_LC(info);
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
	 * [Cnd]パネルの[purc_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_d_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cntry_org_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_d_sub_char3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_id_typ]の作成メソッド
	 */
	public MCList getCnd_in_to_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInToIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_id_cd]の作成メソッド
	 */
	public MCList getCnd_in_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getInToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_usr_cd]の作成メソッド
	 */
	public MCList getCnd_purc_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_purc_id_typ]の作成メソッド
	 */
	public MCList getRslt_purc_id_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_purc_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_purc_rsn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2250.Srch01")) {
			return new MS_MSBEL2250_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL2250.Srch02")) {
			return new MS_MSBEL2250_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2250_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2250_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2250_Srch01Bridge() {
			p_MS_MSBEL2250_Srch01 = new MCParam(PDef.MS_MSBEL2250_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2250_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2250.RsltR.class));

			p_MS_MSBEL2250_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2250_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2250_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2250_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2250_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2250.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2250.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2250.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2250.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2250_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2250.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2250_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2250.RsltR>)p_MS_MSBEL2250_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2250_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2250_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2250_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL2250_Srch02Bridge() {
			p_MS_MSBEL2250_Srch02 = new MCParam(PDef.MS_MSBEL2250_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2250_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2250.RsltR.class));

			p_MS_MSBEL2250_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2250_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2250_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2250_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2250_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2250.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2250.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2250.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2250.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2250_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2250.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2250_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2250.RsltR>)p_MS_MSBEL2250_Srch02.getContainerParam().getDownBlock(0));
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