package mcframe.clientMSBA.MSBAP0040;

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
import mcframe.clientMSBA.MSBAP0040.MSBAP_DmndRecStsSrch_MC.MS_MSBAL0040_Srch01Caller;
import mcframe.clientMSBA.MSBAP0040.MSBAP_DmndRecStsSrch_MC.MS_MSBAL0040_Srch02Caller;

/**
 * 画面"MSBAP_DmndRecStsSrch"パネルクラスです。<p>
 *
 * 需要情報作成時に受注等によって消し込みが行われた状況を照会する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAP_DmndRecStsSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBAP0040";

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
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * REF1,View;REF2,View matching status list REF1,参照する;REF2,消込状況を一覧表示する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF1 = null;
	public MCRadioButton Cnd_ope_REF2 = null;
	public MCLabel Cnd_dmnd_dt_fr_Label = null;
	/**
	 * Demand date FROM 需要日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dmnd_dt_fr = null;
	public MCLabel Cnd_dmnd_dt_to_Label = null;
	/**
	 * Demand date TO 需要日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dmnd_dt_to = null;
	public MCLabel Cnd_dmnd_period_typ_Label = null;
	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dmnd_period_typ = null;
	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public MCTextField Cnd_dmnd_period_typ_nm = null;
	public MCLabel Cnd_dmnd_typ_Label = null;
	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dmnd_typ = null;
	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public MCTextField Cnd_dmnd_typ_nm = null;
	public MCLabel Cnd_dmnd_loc_cd_Label = null;
	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dmnd_loc_cd = null;
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public MCTextField Cnd_dmnd_loc_nm = null;
	public MCLabel Cnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_site_nm = null;
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
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
	public MCLabel Cnd_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_grp_nm = null;
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_cd = null;
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
	public MCTextComboBox Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_nm = null;
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
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
	public MCLabel Cnd_spln_vers_Label = null;
	/**
	 * Sales plan version 販売計画バージョン.<p>
	 *
	 */
	public MCTextComboBox Cnd_spln_vers = null;
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
	public MCLabel Cnd_dmnd_no_Label = null;
	/**
	 * Matching destination demand No. 消込先需要ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dmnd_no = null;
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
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_d_no = null;
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Cnd4]ブロック関連のField定義
	public MCPanel Cnd4Panel = null;
	// [Cnd4]ブロックの項目のField定義
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
	// [Rslt1Panel]ブロック関連のField定義
	public MCPanel Rslt1PanelPanel = null;
	// [Rslt1Panel]ブロックの項目のField定義
	// [Rslt1]ブロック関連のField定義
	public MCPanel Rslt1Panel = null;
	public MCTitledBorder Rslt1TitledBorder = null;
	public MCScrollPane Rslt1ScrollPane = null;
	public MCTable2<mcframe.clientMSBA.MSBAP0040.Rslt1R> Rslt1Table = null;
	// [Rslt1]ブロックの項目のField定義
	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_no = null;
	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_dt = null;
	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_st_dt = null;
	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_end_dt = null;
	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dlv_schd_st_dt = null;
	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dlv_schd_end_dt = null;
	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_period_typ = null;
	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_period_typ_nm = null;
	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_typ = null;
	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt1_itm_p_PPanel;
	public MCColumnConfig columnRslt1_itm_cd;// [Rslt1]の[itm_p.itm_cd]を[columnRslt1_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_sub1;// [Rslt1]の[itm_p.itm_sub1]を[columnRslt1_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_sub2;// [Rslt1]の[itm_p.itm_sub2]を[columnRslt1_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_sub3;// [Rslt1]の[itm_p.itm_sub3]を[columnRslt1_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_nm;// [Rslt1]の[itm_p.itm_nm]を[columnRslt1_itm_nm]としてエイリアス定義。
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sno4_mng_typ = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_input_qty_p_PPanel;
	public MCColumnConfig columnRslt1_input_qty;// [Rslt1]の[input_qty_p.qty]を[columnRslt1_input_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_dmnd_qty_p_PPanel;
	public MCColumnConfig columnRslt1_dmnd_qty;// [Rslt1]の[dmnd_qty_p.qty]を[columnRslt1_dmnd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_rec_qty_p_PPanel;
	public MCColumnConfig columnRslt1_rec_qty;// [Rslt1]の[rec_qty_p.qty]を[columnRslt1_rec_qty]としてエイリアス定義。
	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_loc_cd = null;
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_loc_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_loc_grp_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_lg_grp_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dmnd_site_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt1_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt1_sno1;// [Rslt1]の[sno_wrk_no_p.sno1]を[columnRslt1_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno2;// [Rslt1]の[sno_wrk_no_p.sno2]を[columnRslt1_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno3;// [Rslt1]の[sno_wrk_no_p.sno3]を[columnRslt1_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno4;// [Rslt1]の[sno_wrk_no_p.sno4]を[columnRslt1_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_wrk_no;// [Rslt1]の[sno_wrk_no_p.wrk_no]を[columnRslt1_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_wrk_nm;// [Rslt1]の[sno_wrk_no_p.wrk_nm]を[columnRslt1_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt1_dmnd_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt1_dmnd_usr_cd;// [Rslt1]の[dmnd_usr_dpt_p.usr_cd]を[columnRslt1_dmnd_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dmnd_usr_nm;// [Rslt1]の[dmnd_usr_dpt_p.usr_nm]を[columnRslt1_dmnd_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dmnd_dpt_cd;// [Rslt1]の[dmnd_usr_dpt_p.dpt_cd]を[columnRslt1_dmnd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dmnd_dpt_nm;// [Rslt1]の[dmnd_usr_dpt_p.dpt_nm]を[columnRslt1_dmnd_dpt_nm]としてエイリアス定義。
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dlv_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_cst_nm = null;
	/**
	 * Plan month 計画月度.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ym = null;
	/**
	 * Sales plan version 販売計画バージョン.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_spln_vers = null;
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_spln_itm_cd = null;
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_spln_itm_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_cur_nm = null;
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_cst_frcst_no = null;
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_cst_frcst_d_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_slo_d_no = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sub_char3 = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt1_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt1_itm_grp_cd1;// [Rslt1]の[itm_grp_p.itm_grp_cd1]を[columnRslt1_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm1;// [Rslt1]の[itm_grp_p.itm_grp_nm1]を[columnRslt1_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd2;// [Rslt1]の[itm_grp_p.itm_grp_cd2]を[columnRslt1_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm2;// [Rslt1]の[itm_grp_p.itm_grp_nm2]を[columnRslt1_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd3;// [Rslt1]の[itm_grp_p.itm_grp_cd3]を[columnRslt1_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm3;// [Rslt1]の[itm_grp_p.itm_grp_nm3]を[columnRslt1_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd4;// [Rslt1]の[itm_grp_p.itm_grp_cd4]を[columnRslt1_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm4;// [Rslt1]の[itm_grp_p.itm_grp_nm4]を[columnRslt1_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd5;// [Rslt1]の[itm_grp_p.itm_grp_cd5]を[columnRslt1_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm5;// [Rslt1]の[itm_grp_p.itm_grp_nm5]を[columnRslt1_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd6;// [Rslt1]の[itm_grp_p.itm_grp_cd6]を[columnRslt1_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm6;// [Rslt1]の[itm_grp_p.itm_grp_nm6]を[columnRslt1_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd7;// [Rslt1]の[itm_grp_p.itm_grp_cd7]を[columnRslt1_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm7;// [Rslt1]の[itm_grp_p.itm_grp_nm7]を[columnRslt1_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd8;// [Rslt1]の[itm_grp_p.itm_grp_cd8]を[columnRslt1_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm8;// [Rslt1]の[itm_grp_p.itm_grp_nm8]を[columnRslt1_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd9;// [Rslt1]の[itm_grp_p.itm_grp_cd9]を[columnRslt1_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm9;// [Rslt1]の[itm_grp_p.itm_grp_nm9]を[columnRslt1_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_cd10;// [Rslt1]の[itm_grp_p.itm_grp_cd10]を[columnRslt1_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_grp_nm10;// [Rslt1]の[itm_grp_p.itm_grp_nm10]を[columnRslt1_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt1_dlv_grp_p_PPanel;
	public MCColumnConfig columnRslt1_dlv_grp_cd1;// [Rslt1]の[dlv_grp_p.bp_grp_cd1]を[columnRslt1_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm1;// [Rslt1]の[dlv_grp_p.bp_grp_nm1]を[columnRslt1_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd2;// [Rslt1]の[dlv_grp_p.bp_grp_cd2]を[columnRslt1_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm2;// [Rslt1]の[dlv_grp_p.bp_grp_nm2]を[columnRslt1_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd3;// [Rslt1]の[dlv_grp_p.bp_grp_cd3]を[columnRslt1_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm3;// [Rslt1]の[dlv_grp_p.bp_grp_nm3]を[columnRslt1_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd4;// [Rslt1]の[dlv_grp_p.bp_grp_cd4]を[columnRslt1_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm4;// [Rslt1]の[dlv_grp_p.bp_grp_nm4]を[columnRslt1_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd5;// [Rslt1]の[dlv_grp_p.bp_grp_cd5]を[columnRslt1_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm5;// [Rslt1]の[dlv_grp_p.bp_grp_nm5]を[columnRslt1_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd6;// [Rslt1]の[dlv_grp_p.bp_grp_cd6]を[columnRslt1_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm6;// [Rslt1]の[dlv_grp_p.bp_grp_nm6]を[columnRslt1_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd7;// [Rslt1]の[dlv_grp_p.bp_grp_cd7]を[columnRslt1_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm7;// [Rslt1]の[dlv_grp_p.bp_grp_nm7]を[columnRslt1_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd8;// [Rslt1]の[dlv_grp_p.bp_grp_cd8]を[columnRslt1_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm8;// [Rslt1]の[dlv_grp_p.bp_grp_nm8]を[columnRslt1_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd9;// [Rslt1]の[dlv_grp_p.bp_grp_cd9]を[columnRslt1_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm9;// [Rslt1]の[dlv_grp_p.bp_grp_nm9]を[columnRslt1_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_cd10;// [Rslt1]の[dlv_grp_p.bp_grp_cd10]を[columnRslt1_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_grp_nm10;// [Rslt1]の[dlv_grp_p.bp_grp_nm10]を[columnRslt1_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt1_cst_grp_p_PPanel;
	public MCColumnConfig columnRslt1_cst_grp_cd1;// [Rslt1]の[cst_grp_p.bp_grp_cd1]を[columnRslt1_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm1;// [Rslt1]の[cst_grp_p.bp_grp_nm1]を[columnRslt1_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd2;// [Rslt1]の[cst_grp_p.bp_grp_cd2]を[columnRslt1_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm2;// [Rslt1]の[cst_grp_p.bp_grp_nm2]を[columnRslt1_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd3;// [Rslt1]の[cst_grp_p.bp_grp_cd3]を[columnRslt1_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm3;// [Rslt1]の[cst_grp_p.bp_grp_nm3]を[columnRslt1_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd4;// [Rslt1]の[cst_grp_p.bp_grp_cd4]を[columnRslt1_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm4;// [Rslt1]の[cst_grp_p.bp_grp_nm4]を[columnRslt1_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd5;// [Rslt1]の[cst_grp_p.bp_grp_cd5]を[columnRslt1_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm5;// [Rslt1]の[cst_grp_p.bp_grp_nm5]を[columnRslt1_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd6;// [Rslt1]の[cst_grp_p.bp_grp_cd6]を[columnRslt1_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm6;// [Rslt1]の[cst_grp_p.bp_grp_nm6]を[columnRslt1_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd7;// [Rslt1]の[cst_grp_p.bp_grp_cd7]を[columnRslt1_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm7;// [Rslt1]の[cst_grp_p.bp_grp_nm7]を[columnRslt1_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd8;// [Rslt1]の[cst_grp_p.bp_grp_cd8]を[columnRslt1_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm8;// [Rslt1]の[cst_grp_p.bp_grp_nm8]を[columnRslt1_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd9;// [Rslt1]の[cst_grp_p.bp_grp_cd9]を[columnRslt1_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm9;// [Rslt1]の[cst_grp_p.bp_grp_nm9]を[columnRslt1_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_cd10;// [Rslt1]の[cst_grp_p.bp_grp_cd10]を[columnRslt1_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt1_cst_grp_nm10;// [Rslt1]の[cst_grp_p.bp_grp_nm10]を[columnRslt1_cst_grp_nm10]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_upd_srv_req_no = null;
	// [Rslt2Panel]ブロック関連のField定義
	public MCPanel Rslt2PanelPanel = null;
	// [Rslt2Panel]ブロックの項目のField定義
	// [Rslt2]ブロック関連のField定義
	public MCPanel Rslt2Panel = null;
	public MCTitledBorder Rslt2TitledBorder = null;
	public MCScrollPane Rslt2ScrollPane = null;
	public MCTable2<mcframe.clientMSBA.MSBAP0040.Rslt2R> Rslt2Table = null;
	// [Rslt2]ブロックの項目のField定義
	/**
	 * Demand No. (Matching destination) 需要ＮＯ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_no = null;
	/**
	 * Demand date (Matching destination) 需要日(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_dt = null;
	/**
	 * Demand period start date (Matching destination) 需要期間開始日(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_st_dt = null;
	/**
	 * Demand period end date (Matching destination) 需要期間終了日(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_end_dt = null;
	/**
	 * Delivery schedule period start date (Matching destination) 納品予定期間開始日(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dlv_schd_st_dt = null;
	/**
	 * Delivery schedule period end date (Matching destination) 納品予定期間終了日(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dlv_schd_end_dt = null;
	/**
	 * Demand period type (Matching destination) 需要期間区分(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_period_typ = null;
	/**
	 * Demand period type name (Matching destination) 需要期間区分名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_period_typ_nm = null;
	/**
	 * Demand type (Matching destination) 需要区分(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_typ = null;
	/**
	 * Demand type name (Matching destination) 需要区分名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dmnd_typ_nm = null;
	/**
	 * Demand No. (Matching source) 需要ＮＯ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_no = null;
	/**
	 * Demand date (Matching source) 需要日(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_dt = null;
	/**
	 * Demand period start date (Matching source) 需要期間開始日(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_st_dt = null;
	/**
	 * Demand period end date (Matching source) 需要期間終了日(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_end_dt = null;
	/**
	 * Delivery schedule period start date (Matching source) 納品予定期間開始日(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dlv_schd_st_dt = null;
	/**
	 * Delivery schedule period end date (Matching source) 納品予定期間終了日(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dlv_schd_end_dt = null;
	/**
	 * Demand period type (Matching source) 需要期間区分(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_period_typ = null;
	/**
	 * Demand period type name (Matching source) 需要期間区分名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_period_typ_nm = null;
	/**
	 * Demand type (Matching source) 需要区分(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_typ = null;
	/**
	 * Demand type name (Matching source) 需要区分名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dmnd_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt2_itm_p_PPanel;
	public MCColumnConfig columnRslt2_itm_cd;// [Rslt2]の[itm_p.itm_cd]を[columnRslt2_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_sub1;// [Rslt2]の[itm_p.itm_sub1]を[columnRslt2_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_sub2;// [Rslt2]の[itm_p.itm_sub2]を[columnRslt2_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_sub3;// [Rslt2]の[itm_p.itm_sub3]を[columnRslt2_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_nm;// [Rslt2]の[itm_p.itm_nm]を[columnRslt2_itm_nm]としてエイリアス定義。
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_sno4_mng_typ = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_to_input_qty_p_PPanel;
	public MCColumnConfig columnRslt2_to_input_qty;// [Rslt2]の[to_input_qty_p.qty]を[columnRslt2_to_input_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_to_dmnd_qty_p_PPanel;
	public MCColumnConfig columnRslt2_to_dmnd_qty;// [Rslt2]の[to_dmnd_qty_p.qty]を[columnRslt2_to_dmnd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_to_rec_qty_p_PPanel;
	public MCColumnConfig columnRslt2_to_rec_qty;// [Rslt2]の[to_rec_qty_p.qty]を[columnRslt2_to_rec_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_fr_input_qty_p_PPanel;
	public MCColumnConfig columnRslt2_fr_input_qty;// [Rslt2]の[fr_input_qty_p.qty]を[columnRslt2_fr_input_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_fr_dmnd_qty_p_PPanel;
	public MCColumnConfig columnRslt2_fr_dmnd_qty;// [Rslt2]の[fr_dmnd_qty_p.qty]を[columnRslt2_fr_dmnd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_fr_rec_qty_p_PPanel;
	public MCColumnConfig columnRslt2_fr_rec_qty;// [Rslt2]の[fr_rec_qty_p.qty]を[columnRslt2_fr_rec_qty]としてエイリアス定義。
	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_loc_cd = null;
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_loc_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_loc_grp_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_lg_grp_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_dmnd_site_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt2_to_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt2_to_sno1;// [Rslt2]の[to_sno_wrk_no_p.sno1]を[columnRslt2_to_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_sno2;// [Rslt2]の[to_sno_wrk_no_p.sno2]を[columnRslt2_to_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_sno3;// [Rslt2]の[to_sno_wrk_no_p.sno3]を[columnRslt2_to_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_sno4;// [Rslt2]の[to_sno_wrk_no_p.sno4]を[columnRslt2_to_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_wrk_no;// [Rslt2]の[to_sno_wrk_no_p.wrk_no]を[columnRslt2_to_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_wrk_nm;// [Rslt2]の[to_sno_wrk_no_p.wrk_nm]を[columnRslt2_to_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt2_fr_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt2_fr_sno1;// [Rslt2]の[fr_sno_wrk_no_p.sno1]を[columnRslt2_fr_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_sno2;// [Rslt2]の[fr_sno_wrk_no_p.sno2]を[columnRslt2_fr_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_sno3;// [Rslt2]の[fr_sno_wrk_no_p.sno3]を[columnRslt2_fr_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_sno4;// [Rslt2]の[fr_sno_wrk_no_p.sno4]を[columnRslt2_fr_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_wrk_no;// [Rslt2]の[fr_sno_wrk_no_p.wrk_no]を[columnRslt2_fr_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_wrk_nm;// [Rslt2]の[fr_sno_wrk_no_p.wrk_nm]を[columnRslt2_fr_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt2_to_dmnd_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt2_to_dmnd_usr_cd;// [Rslt2]の[to_dmnd_usr_dpt_p.usr_cd]を[columnRslt2_to_dmnd_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dmnd_usr_nm;// [Rslt2]の[to_dmnd_usr_dpt_p.usr_nm]を[columnRslt2_to_dmnd_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dmnd_dpt_cd;// [Rslt2]の[to_dmnd_usr_dpt_p.dpt_cd]を[columnRslt2_to_dmnd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dmnd_dpt_nm;// [Rslt2]の[to_dmnd_usr_dpt_p.dpt_nm]を[columnRslt2_to_dmnd_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt2_fr_dmnd_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt2_fr_dmnd_usr_cd;// [Rslt2]の[fr_dmnd_usr_dpt_p.usr_cd]を[columnRslt2_fr_dmnd_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dmnd_usr_nm;// [Rslt2]の[fr_dmnd_usr_dpt_p.usr_nm]を[columnRslt2_fr_dmnd_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dmnd_dpt_cd;// [Rslt2]の[fr_dmnd_usr_dpt_p.dpt_cd]を[columnRslt2_fr_dmnd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dmnd_dpt_nm;// [Rslt2]の[fr_dmnd_usr_dpt_p.dpt_nm]を[columnRslt2_fr_dmnd_dpt_nm]としてエイリアス定義。
	/**
	 * Delivery destination cd. (Matching destination) 納品先ＣＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dlv_cd = null;
	/**
	 * Delivery destination name (Matching destination) 納品先名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_dlv_nm = null;
	/**
	 * Customer cd. (Matching destination) 得意先ＣＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_cst_cd = null;
	/**
	 * Customer name (Matching destination) 得意先名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_cst_nm = null;
	/**
	 * Delivery destination cd. (Matching source) 納品先ＣＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dlv_cd = null;
	/**
	 * Delivery destination name (Matching source) 納品先名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_dlv_nm = null;
	/**
	 * Customer cd. (Matching source) 得意先ＣＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_cst_cd = null;
	/**
	 * Customer name (Matching source) 得意先名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_cst_nm = null;
	/**
	 * Plan monthly (Matching destination) 計画月度(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_ym = null;
	/**
	 * Sales plan version (Matching destination) 販売計画バージョン(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_spln_vers = null;
	/**
	 * Plan item cd. (Matching destination) 計画品目ＣＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_spln_itm_cd = null;
	/**
	 * Plan item name (Matching destination) 計画品名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_spln_itm_nm = null;
	/**
	 * Currency cd. (Matching destination) 通貨ＣＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_cur_cd = null;
	/**
	 * Currency name (Matching destination) 通貨名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_cur_nm = null;
	/**
	 * Sales forecast No. (Matching destination) 顧客期間内示ＮＯ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_cst_frcst_no = null;
	/**
	 * Sales forecast details No. (Matching destination) 顧客期間内示明細ＮＯ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_cst_frcst_d_no = null;
	/**
	 * Sales order No. (Matching destination) 受注ＮＯ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_slo_no = null;
	/**
	 * Sales order details No. (Matching destination) 受注明細ＮＯ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_slo_d_no = null;
	/**
	 * Plan monthly (Matching source) 計画月度(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_ym = null;
	/**
	 * Sales plan version (Matching source) 販売計画バージョン(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_spln_vers = null;
	/**
	 * Plan item cd. (Matching source) 計画品目ＣＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_spln_itm_cd = null;
	/**
	 * Plan item name (Matching source) 計画品名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_spln_itm_nm = null;
	/**
	 * Currency cd. (Matching source) 通貨ＣＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_cur_cd = null;
	/**
	 * Currency name (Matching source) 通貨名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_cur_nm = null;
	/**
	 * Sales forecast No. (Matching source) 顧客期間内示ＮＯ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_cst_frcst_no = null;
	/**
	 * Sales forecast details No. (Matching source) 顧客期間内示明細ＮＯ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_cst_frcst_d_no = null;
	/**
	 * Sales order No. (Matching source) 受注ＮＯ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_slo_no = null;
	/**
	 * Sales order details No. (Matching source) 受注明細ＮＯ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_slo_d_no = null;
	/**
	 * Internal remarks (Matching destination) 内部備考(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_intr_rmrks = null;
	/**
	 * Spare 1 (Matching destination) 予備１(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_sub_char1 = null;
	/**
	 * Spare 2 (Matching destination) 予備２(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_sub_char2 = null;
	/**
	 * Spare 3 (Matching destination) 予備３(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_sub_char3 = null;
	/**
	 * Internal remarks (Matching source) 内部備考(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_intr_rmrks = null;
	/**
	 * Spare 1 (Matching source) 予備１(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_sub_char1 = null;
	/**
	 * Spare 2 (Matching source) 予備２(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_sub_char2 = null;
	/**
	 * Spare 3 (Matching source) 予備３(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_sub_char3 = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt2_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt2_itm_grp_cd1;// [Rslt2]の[itm_grp_p.itm_grp_cd1]を[columnRslt2_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm1;// [Rslt2]の[itm_grp_p.itm_grp_nm1]を[columnRslt2_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd2;// [Rslt2]の[itm_grp_p.itm_grp_cd2]を[columnRslt2_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm2;// [Rslt2]の[itm_grp_p.itm_grp_nm2]を[columnRslt2_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd3;// [Rslt2]の[itm_grp_p.itm_grp_cd3]を[columnRslt2_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm3;// [Rslt2]の[itm_grp_p.itm_grp_nm3]を[columnRslt2_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd4;// [Rslt2]の[itm_grp_p.itm_grp_cd4]を[columnRslt2_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm4;// [Rslt2]の[itm_grp_p.itm_grp_nm4]を[columnRslt2_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd5;// [Rslt2]の[itm_grp_p.itm_grp_cd5]を[columnRslt2_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm5;// [Rslt2]の[itm_grp_p.itm_grp_nm5]を[columnRslt2_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd6;// [Rslt2]の[itm_grp_p.itm_grp_cd6]を[columnRslt2_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm6;// [Rslt2]の[itm_grp_p.itm_grp_nm6]を[columnRslt2_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd7;// [Rslt2]の[itm_grp_p.itm_grp_cd7]を[columnRslt2_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm7;// [Rslt2]の[itm_grp_p.itm_grp_nm7]を[columnRslt2_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd8;// [Rslt2]の[itm_grp_p.itm_grp_cd8]を[columnRslt2_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm8;// [Rslt2]の[itm_grp_p.itm_grp_nm8]を[columnRslt2_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd9;// [Rslt2]の[itm_grp_p.itm_grp_cd9]を[columnRslt2_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm9;// [Rslt2]の[itm_grp_p.itm_grp_nm9]を[columnRslt2_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_cd10;// [Rslt2]の[itm_grp_p.itm_grp_cd10]を[columnRslt2_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt2_itm_grp_nm10;// [Rslt2]の[itm_grp_p.itm_grp_nm10]を[columnRslt2_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt2_to_dlv_grp_p_PPanel;
	public MCColumnConfig columnRslt2_to_dlv_grp_cd1;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd1]を[columnRslt2_to_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm1;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm1]を[columnRslt2_to_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd2;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd2]を[columnRslt2_to_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm2;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm2]を[columnRslt2_to_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd3;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd3]を[columnRslt2_to_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm3;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm3]を[columnRslt2_to_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd4;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd4]を[columnRslt2_to_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm4;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm4]を[columnRslt2_to_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd5;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd5]を[columnRslt2_to_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm5;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm5]を[columnRslt2_to_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd6;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd6]を[columnRslt2_to_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm6;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm6]を[columnRslt2_to_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd7;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd7]を[columnRslt2_to_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm7;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm7]を[columnRslt2_to_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd8;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd8]を[columnRslt2_to_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm8;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm8]を[columnRslt2_to_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd9;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd9]を[columnRslt2_to_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm9;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm9]を[columnRslt2_to_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_cd10;// [Rslt2]の[to_dlv_grp_p.bp_grp_cd10]を[columnRslt2_to_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_dlv_grp_nm10;// [Rslt2]の[to_dlv_grp_p.bp_grp_nm10]を[columnRslt2_to_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt2_fr_dlv_grp_p_PPanel;
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd1;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd1]を[columnRslt2_fr_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm1;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm1]を[columnRslt2_fr_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd2;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd2]を[columnRslt2_fr_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm2;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm2]を[columnRslt2_fr_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd3;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd3]を[columnRslt2_fr_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm3;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm3]を[columnRslt2_fr_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd4;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd4]を[columnRslt2_fr_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm4;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm4]を[columnRslt2_fr_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd5;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd5]を[columnRslt2_fr_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm5;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm5]を[columnRslt2_fr_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd6;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd6]を[columnRslt2_fr_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm6;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm6]を[columnRslt2_fr_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd7;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd7]を[columnRslt2_fr_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm7;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm7]を[columnRslt2_fr_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd8;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd8]を[columnRslt2_fr_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm8;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm8]を[columnRslt2_fr_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd9;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd9]を[columnRslt2_fr_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm9;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm9]を[columnRslt2_fr_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_cd10;// [Rslt2]の[fr_dlv_grp_p.bp_grp_cd10]を[columnRslt2_fr_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_dlv_grp_nm10;// [Rslt2]の[fr_dlv_grp_p.bp_grp_nm10]を[columnRslt2_fr_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt2_to_cst_grp_p_PPanel;
	public MCColumnConfig columnRslt2_to_cst_grp_cd1;// [Rslt2]の[to_cst_grp_p.bp_grp_cd1]を[columnRslt2_to_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm1;// [Rslt2]の[to_cst_grp_p.bp_grp_nm1]を[columnRslt2_to_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd2;// [Rslt2]の[to_cst_grp_p.bp_grp_cd2]を[columnRslt2_to_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm2;// [Rslt2]の[to_cst_grp_p.bp_grp_nm2]を[columnRslt2_to_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd3;// [Rslt2]の[to_cst_grp_p.bp_grp_cd3]を[columnRslt2_to_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm3;// [Rslt2]の[to_cst_grp_p.bp_grp_nm3]を[columnRslt2_to_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd4;// [Rslt2]の[to_cst_grp_p.bp_grp_cd4]を[columnRslt2_to_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm4;// [Rslt2]の[to_cst_grp_p.bp_grp_nm4]を[columnRslt2_to_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd5;// [Rslt2]の[to_cst_grp_p.bp_grp_cd5]を[columnRslt2_to_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm5;// [Rslt2]の[to_cst_grp_p.bp_grp_nm5]を[columnRslt2_to_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd6;// [Rslt2]の[to_cst_grp_p.bp_grp_cd6]を[columnRslt2_to_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm6;// [Rslt2]の[to_cst_grp_p.bp_grp_nm6]を[columnRslt2_to_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd7;// [Rslt2]の[to_cst_grp_p.bp_grp_cd7]を[columnRslt2_to_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm7;// [Rslt2]の[to_cst_grp_p.bp_grp_nm7]を[columnRslt2_to_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd8;// [Rslt2]の[to_cst_grp_p.bp_grp_cd8]を[columnRslt2_to_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm8;// [Rslt2]の[to_cst_grp_p.bp_grp_nm8]を[columnRslt2_to_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd9;// [Rslt2]の[to_cst_grp_p.bp_grp_cd9]を[columnRslt2_to_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm9;// [Rslt2]の[to_cst_grp_p.bp_grp_nm9]を[columnRslt2_to_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_cd10;// [Rslt2]の[to_cst_grp_p.bp_grp_cd10]を[columnRslt2_to_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt2_to_cst_grp_nm10;// [Rslt2]の[to_cst_grp_p.bp_grp_nm10]を[columnRslt2_to_cst_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt2_fr_cst_grp_p_PPanel;
	public MCColumnConfig columnRslt2_fr_cst_grp_cd1;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd1]を[columnRslt2_fr_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm1;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm1]を[columnRslt2_fr_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd2;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd2]を[columnRslt2_fr_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm2;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm2]を[columnRslt2_fr_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd3;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd3]を[columnRslt2_fr_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm3;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm3]を[columnRslt2_fr_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd4;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd4]を[columnRslt2_fr_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm4;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm4]を[columnRslt2_fr_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd5;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd5]を[columnRslt2_fr_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm5;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm5]を[columnRslt2_fr_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd6;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd6]を[columnRslt2_fr_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm6;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm6]を[columnRslt2_fr_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd7;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd7]を[columnRslt2_fr_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm7;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm7]を[columnRslt2_fr_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd8;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd8]を[columnRslt2_fr_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm8;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm8]を[columnRslt2_fr_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd9;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd9]を[columnRslt2_fr_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm9;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm9]を[columnRslt2_fr_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_cd10;// [Rslt2]の[fr_cst_grp_p.bp_grp_cd10]を[columnRslt2_fr_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt2_fr_cst_grp_nm10;// [Rslt2]の[fr_cst_grp_p.bp_grp_nm10]を[columnRslt2_fr_cst_grp_nm10]としてエイリアス定義。
	/**
	 * Entry user ID (Matching destination) 登録ユーザＩＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_ins_usr_id = null;
	/**
	 * Entry user name (Matching destination) 登録ユーザ名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_ins_usr_nm = null;
	/**
	 * Entry function ID (Matching destination) 登録機能ＩＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_ins_func_id = null;
	/**
	 * Entry function name (Matching destination) 登録機能名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_ins_func_nm = null;
	/**
	 * Entry date and time (Matching destination) 登録日時(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_ins_ts = null;
	/**
	 * Update user ID (Matching destination) 更新ユーザＩＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_upd_usr_id = null;
	/**
	 * Update user name (Matching destination) 更新ユーザ名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_upd_usr_nm = null;
	/**
	 * Update function ID (Matching destination) 更新機能ＩＤ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_upd_func_id = null;
	/**
	 * Update function name (Matching destination) 更新機能名(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_upd_func_nm = null;
	/**
	 * Update date and time (Matching destination) 更新日時(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_upd_ts = null;
	/**
	 * Update request No. (Matching destination) 更新リクエストＮＯ(消込先).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_to_upd_srv_req_no = null;
	/**
	 * Entry user ID (Matching source) 登録ユーザＩＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_ins_usr_id = null;
	/**
	 * Entry user name (Matching source) 登録ユーザ名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_ins_usr_nm = null;
	/**
	 * Entry function ID (Matching source) 登録機能ＩＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_ins_func_id = null;
	/**
	 * Entry function name (Matching source) 登録機能名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_ins_func_nm = null;
	/**
	 * Entry date and time (Matching source) 登録日時(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_ins_ts = null;
	/**
	 * Update user ID (Matching source) 更新ユーザＩＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_upd_usr_id = null;
	/**
	 * Update user name (Matching source) 更新ユーザ名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_upd_usr_nm = null;
	/**
	 * Update function ID (Matching source) 更新機能ＩＤ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_upd_func_id = null;
	/**
	 * Update function name (Matching source) 更新機能名(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_upd_func_nm = null;
	/**
	 * Update date and time (Matching source) 更新日時(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_upd_ts = null;
	/**
	 * Update request No. (Matching source) 更新リクエストＮＯ(消込元).<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fr_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Breakdown of details 詳細.<p>
	 *
	 */
	public MCButton Btn_open_DTL = null;
	/** [SRCH_REF1]モードを表す定数 */
	public static final String SRCH_REF1 = "SRCH_REF1";
	/** [REF1]モードを表す定数 */
	public static final String REF1 = "REF1";
	/** [SRCH_REF2]モードを表す定数 */
	public static final String SRCH_REF2 = "SRCH_REF2";
	/** [REF2]モードを表す定数 */
	public static final String REF2 = "REF2";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_REF1, REF1, SRCH_REF2, REF2};
	
	/** [MS_MSBAL0040_Srch01]のCallerの作成 */
	protected MSBAP_DmndRecStsSrch_MC.MS_MSBAL0040_Srch01Caller createMS_MSBAL0040_Srch01() {
		MSBAP_DmndRecStsSrch_MC.MS_MSBAL0040_Srch01Caller<MSBAP_DmndRecStsSrch, MS_MSBAL0040_Srch01Bridge>
		caller = ((MSBAP_DmndRecStsSrch_MC)this).new MS_MSBAL0040_Srch01Caller<MSBAP_DmndRecStsSrch, MS_MSBAL0040_Srch01Bridge>(
					(MSBAP_DmndRecStsSrch)this, new MS_MSBAL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBAL0040_Srch01]の呼び出し */
	protected void callMS_MSBAL0040_Srch01() {
		MCCaller caller = createMS_MSBAL0040_Srch01();
		caller.exec();
	}
	/** [MS_MSBAL0040_Srch02]のCallerの作成 */
	protected MSBAP_DmndRecStsSrch_MC.MS_MSBAL0040_Srch02Caller createMS_MSBAL0040_Srch02() {
		MSBAP_DmndRecStsSrch_MC.MS_MSBAL0040_Srch02Caller<MSBAP_DmndRecStsSrch, MS_MSBAL0040_Srch02Bridge>
		caller = ((MSBAP_DmndRecStsSrch_MC)this).new MS_MSBAL0040_Srch02Caller<MSBAP_DmndRecStsSrch, MS_MSBAL0040_Srch02Bridge>(
					(MSBAP_DmndRecStsSrch)this, new MS_MSBAL0040_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBAL0040_Srch02]の呼び出し */
	protected void callMS_MSBAL0040_Srch02() {
		MCCaller caller = createMS_MSBAL0040_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBA.MSBAP0040.CndR aCndR;
	/** [Rslt1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R> aRslt1L;
	/** [Rslt2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R> aRslt2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBA.MSBAP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBA.MSBAP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBA.MSBAP0040.CndR createCndR() {
		return mcframe.clientMSBA.MSBAP0040.CndR.create();
	}

	/**
	 * コピーによってaRslt1Lを設定します。
	 *
	 * aRslt1Lのインスタンスは変更されません。
	 *
	 * @param dataset Rslt1L
	 */
	public void setRslt1L(MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R> aList) {
		if (getRslt1L() != aList) {
			getRslt1L().setAll(aList);
		}
	}

	/**
	 * [Rslt1]ブロックのコンテナaRslt1Lを返します。
	 *
	 * @return Rslt1L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R> getRslt1L() {
		return aRslt1L;
	}

	/**
	 * aRslt1Rを作成します。
	 *
	 * @return Rslt1R
	 */
	public mcframe.clientMSBA.MSBAP0040.Rslt1R createRslt1R() {
		return mcframe.clientMSBA.MSBAP0040.Rslt1R.create();
	}

	/**
	 * aRslt1Lを作成します。
	 *
	 * @return Rslt1L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R> createRslt1L() {
		return MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.class);
	}

	/**
	 * Rslt1Tableを初期化します。
	 */
	protected void createRslt1Table(){
		if(Rslt1Table == null){
			Rslt1Table = beansFactory.createTable2("Rslt1.table");
		}
	}

	/**
	 * コピーによってaRslt2Lを設定します。
	 *
	 * aRslt2Lのインスタンスは変更されません。
	 *
	 * @param dataset Rslt2L
	 */
	public void setRslt2L(MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R> aList) {
		if (getRslt2L() != aList) {
			getRslt2L().setAll(aList);
		}
	}

	/**
	 * [Rslt2]ブロックのコンテナaRslt2Lを返します。
	 *
	 * @return Rslt2L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R> getRslt2L() {
		return aRslt2L;
	}

	/**
	 * aRslt2Rを作成します。
	 *
	 * @return Rslt2R
	 */
	public mcframe.clientMSBA.MSBAP0040.Rslt2R createRslt2R() {
		return mcframe.clientMSBA.MSBAP0040.Rslt2R.create();
	}

	/**
	 * aRslt2Lを作成します。
	 *
	 * @return Rslt2L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R> createRslt2L() {
		return MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.class);
	}

	/**
	 * Rslt2Tableを初期化します。
	 */
	protected void createRslt2Table(){
		if(Rslt2Table == null){
			Rslt2Table = beansFactory.createTable2("Rslt2.table");
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
		if(!MCCollectionUtil.contains(ret, getRslt1L())) ret.add(getRslt1L());
		if(!MCCollectionUtil.contains(ret, getRslt2L())) ret.add(getRslt2L());
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
		if(aCnt == getRslt1L()) return "Rslt1";
		if(aCnt == getRslt2L()) return "Rslt2";
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
		if(bId.equals("Rslt1")) return getRslt1L();
		if(bId.equals("Rslt2")) return getRslt2L();
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
		ret.add(Tab4Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(Cnd4Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(Rslt1PanelPanel);
		ret.add(Rslt1Panel);
		ret.add(Rslt2PanelPanel);
		ret.add(Rslt2Panel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_DmndRecStsSrch_MC_A() {
		aCndR = createCndR();
		aRslt1L = createRslt1L();
		aRslt2L = createRslt2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBAP_DmndRecStsSrch_MC_A(String name) {
		aCndR = createCndR();
		aRslt1L = createRslt1L();
		createRslt1Table();
		Rslt1Table.setRowName(name);
		aRslt2L = createRslt2L();
		createRslt2Table();
		Rslt2Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBAP_DmndRecStsSrch_MC.jbCreateScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateTop((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateFold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateTab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateTab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateTab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateTab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateCnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateCnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateCnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateCnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateCtrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateRPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateRslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateRslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateRslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateRslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbCreateBtn((MSBAP_DmndRecStsSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBAP_DmndRecStsSrch p) {
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
		p.Cnd_sno_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBAP_DmndRecStsSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Rslt1Panel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt1Panel(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Rslt1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt1(MSBAP_DmndRecStsSrch p) {
		p.Rslt1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$itm_p);
		p.Rslt1_itm_p_PPanel.setName("Rslt1.itm_p");
		p.columnRslt1_itm_cd = p.Rslt1_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt1_itm_cd.addAliasName("Rslt1.itm_cd", p);
		p.columnRslt1_itm_sub1 = p.Rslt1_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt1_itm_sub1.addAliasName("Rslt1.itm_sub1", p);
		p.columnRslt1_itm_sub2 = p.Rslt1_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt1_itm_sub2.addAliasName("Rslt1.itm_sub2", p);
		p.columnRslt1_itm_sub3 = p.Rslt1_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt1_itm_sub3.addAliasName("Rslt1.itm_sub3", p);
		p.columnRslt1_itm_nm = p.Rslt1_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt1_itm_nm.addAliasName("Rslt1.itm_nm", p);
		p.Rslt1_input_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$input_qty_p);
		p.Rslt1_input_qty_p_PPanel.setName("Rslt1.input_qty_p");
		p.columnRslt1_input_qty = p.Rslt1_input_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_input_qty.addAliasName("Rslt1.input_qty", p);
		p.Rslt1_dmnd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$dmnd_qty_p);
		p.Rslt1_dmnd_qty_p_PPanel.setName("Rslt1.dmnd_qty_p");
		p.columnRslt1_dmnd_qty = p.Rslt1_dmnd_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_dmnd_qty.addAliasName("Rslt1.dmnd_qty", p);
		p.Rslt1_rec_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$rec_qty_p);
		p.Rslt1_rec_qty_p_PPanel.setName("Rslt1.rec_qty_p");
		p.columnRslt1_rec_qty = p.Rslt1_rec_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_rec_qty.addAliasName("Rslt1.rec_qty", p);
		p.Rslt1_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$sno_wrk_no_p);
		p.Rslt1_sno_wrk_no_p_PPanel.setName("Rslt1.sno_wrk_no_p");
		p.columnRslt1_sno1 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt1_sno1.addAliasName("Rslt1.sno1", p);
		p.columnRslt1_sno2 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt1_sno2.addAliasName("Rslt1.sno2", p);
		p.columnRslt1_sno3 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt1_sno3.addAliasName("Rslt1.sno3", p);
		p.columnRslt1_sno4 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt1_sno4.addAliasName("Rslt1.sno4", p);
		p.columnRslt1_wrk_no = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt1_wrk_no.addAliasName("Rslt1.wrk_no", p);
		p.columnRslt1_wrk_nm = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt1_wrk_nm.addAliasName("Rslt1.wrk_nm", p);
		p.Rslt1_dmnd_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$dmnd_usr_dpt_p);
		p.Rslt1_dmnd_usr_dpt_p_PPanel.setName("Rslt1.dmnd_usr_dpt_p");
		p.columnRslt1_dmnd_usr_cd = p.Rslt1_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt1_dmnd_usr_cd.addAliasName("Rslt1.dmnd_usr_cd", p);
		p.columnRslt1_dmnd_usr_nm = p.Rslt1_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt1_dmnd_usr_nm.addAliasName("Rslt1.dmnd_usr_nm", p);
		p.columnRslt1_dmnd_dpt_cd = p.Rslt1_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt1_dmnd_dpt_cd.addAliasName("Rslt1.dmnd_dpt_cd", p);
		p.columnRslt1_dmnd_dpt_nm = p.Rslt1_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt1_dmnd_dpt_nm.addAliasName("Rslt1.dmnd_dpt_nm", p);
		p.Rslt1_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$itm_grp_p);
		p.Rslt1_itm_grp_p_PPanel.setName("Rslt1.itm_grp_p");
		p.columnRslt1_itm_grp_cd1 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt1_itm_grp_cd1.addAliasName("Rslt1.itm_grp_cd1", p);
		p.columnRslt1_itm_grp_nm1 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt1_itm_grp_nm1.addAliasName("Rslt1.itm_grp_nm1", p);
		p.columnRslt1_itm_grp_cd2 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt1_itm_grp_cd2.addAliasName("Rslt1.itm_grp_cd2", p);
		p.columnRslt1_itm_grp_nm2 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt1_itm_grp_nm2.addAliasName("Rslt1.itm_grp_nm2", p);
		p.columnRslt1_itm_grp_cd3 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt1_itm_grp_cd3.addAliasName("Rslt1.itm_grp_cd3", p);
		p.columnRslt1_itm_grp_nm3 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt1_itm_grp_nm3.addAliasName("Rslt1.itm_grp_nm3", p);
		p.columnRslt1_itm_grp_cd4 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt1_itm_grp_cd4.addAliasName("Rslt1.itm_grp_cd4", p);
		p.columnRslt1_itm_grp_nm4 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt1_itm_grp_nm4.addAliasName("Rslt1.itm_grp_nm4", p);
		p.columnRslt1_itm_grp_cd5 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt1_itm_grp_cd5.addAliasName("Rslt1.itm_grp_cd5", p);
		p.columnRslt1_itm_grp_nm5 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt1_itm_grp_nm5.addAliasName("Rslt1.itm_grp_nm5", p);
		p.columnRslt1_itm_grp_cd6 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt1_itm_grp_cd6.addAliasName("Rslt1.itm_grp_cd6", p);
		p.columnRslt1_itm_grp_nm6 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt1_itm_grp_nm6.addAliasName("Rslt1.itm_grp_nm6", p);
		p.columnRslt1_itm_grp_cd7 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt1_itm_grp_cd7.addAliasName("Rslt1.itm_grp_cd7", p);
		p.columnRslt1_itm_grp_nm7 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt1_itm_grp_nm7.addAliasName("Rslt1.itm_grp_nm7", p);
		p.columnRslt1_itm_grp_cd8 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt1_itm_grp_cd8.addAliasName("Rslt1.itm_grp_cd8", p);
		p.columnRslt1_itm_grp_nm8 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt1_itm_grp_nm8.addAliasName("Rslt1.itm_grp_nm8", p);
		p.columnRslt1_itm_grp_cd9 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt1_itm_grp_cd9.addAliasName("Rslt1.itm_grp_cd9", p);
		p.columnRslt1_itm_grp_nm9 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt1_itm_grp_nm9.addAliasName("Rslt1.itm_grp_nm9", p);
		p.columnRslt1_itm_grp_cd10 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt1_itm_grp_cd10.addAliasName("Rslt1.itm_grp_cd10", p);
		p.columnRslt1_itm_grp_nm10 = p.Rslt1_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt1_itm_grp_nm10.addAliasName("Rslt1.itm_grp_nm10", p);
		p.Rslt1_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$dlv_grp_p);
		p.Rslt1_dlv_grp_p_PPanel.setName("Rslt1.dlv_grp_p");
		p.columnRslt1_dlv_grp_cd1 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt1_dlv_grp_cd1.addAliasName("Rslt1.dlv_grp_cd1", p);
		p.columnRslt1_dlv_grp_nm1 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt1_dlv_grp_nm1.addAliasName("Rslt1.dlv_grp_nm1", p);
		p.columnRslt1_dlv_grp_cd2 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt1_dlv_grp_cd2.addAliasName("Rslt1.dlv_grp_cd2", p);
		p.columnRslt1_dlv_grp_nm2 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt1_dlv_grp_nm2.addAliasName("Rslt1.dlv_grp_nm2", p);
		p.columnRslt1_dlv_grp_cd3 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt1_dlv_grp_cd3.addAliasName("Rslt1.dlv_grp_cd3", p);
		p.columnRslt1_dlv_grp_nm3 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt1_dlv_grp_nm3.addAliasName("Rslt1.dlv_grp_nm3", p);
		p.columnRslt1_dlv_grp_cd4 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt1_dlv_grp_cd4.addAliasName("Rslt1.dlv_grp_cd4", p);
		p.columnRslt1_dlv_grp_nm4 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt1_dlv_grp_nm4.addAliasName("Rslt1.dlv_grp_nm4", p);
		p.columnRslt1_dlv_grp_cd5 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt1_dlv_grp_cd5.addAliasName("Rslt1.dlv_grp_cd5", p);
		p.columnRslt1_dlv_grp_nm5 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt1_dlv_grp_nm5.addAliasName("Rslt1.dlv_grp_nm5", p);
		p.columnRslt1_dlv_grp_cd6 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt1_dlv_grp_cd6.addAliasName("Rslt1.dlv_grp_cd6", p);
		p.columnRslt1_dlv_grp_nm6 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt1_dlv_grp_nm6.addAliasName("Rslt1.dlv_grp_nm6", p);
		p.columnRslt1_dlv_grp_cd7 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt1_dlv_grp_cd7.addAliasName("Rslt1.dlv_grp_cd7", p);
		p.columnRslt1_dlv_grp_nm7 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt1_dlv_grp_nm7.addAliasName("Rslt1.dlv_grp_nm7", p);
		p.columnRslt1_dlv_grp_cd8 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt1_dlv_grp_cd8.addAliasName("Rslt1.dlv_grp_cd8", p);
		p.columnRslt1_dlv_grp_nm8 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt1_dlv_grp_nm8.addAliasName("Rslt1.dlv_grp_nm8", p);
		p.columnRslt1_dlv_grp_cd9 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt1_dlv_grp_cd9.addAliasName("Rslt1.dlv_grp_cd9", p);
		p.columnRslt1_dlv_grp_nm9 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt1_dlv_grp_nm9.addAliasName("Rslt1.dlv_grp_nm9", p);
		p.columnRslt1_dlv_grp_cd10 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt1_dlv_grp_cd10.addAliasName("Rslt1.dlv_grp_cd10", p);
		p.columnRslt1_dlv_grp_nm10 = p.Rslt1_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt1_dlv_grp_nm10.addAliasName("Rslt1.dlv_grp_nm10", p);
		p.Rslt1_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.$cst_grp_p);
		p.Rslt1_cst_grp_p_PPanel.setName("Rslt1.cst_grp_p");
		p.columnRslt1_cst_grp_cd1 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt1_cst_grp_cd1.addAliasName("Rslt1.cst_grp_cd1", p);
		p.columnRslt1_cst_grp_nm1 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt1_cst_grp_nm1.addAliasName("Rslt1.cst_grp_nm1", p);
		p.columnRslt1_cst_grp_cd2 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt1_cst_grp_cd2.addAliasName("Rslt1.cst_grp_cd2", p);
		p.columnRslt1_cst_grp_nm2 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt1_cst_grp_nm2.addAliasName("Rslt1.cst_grp_nm2", p);
		p.columnRslt1_cst_grp_cd3 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt1_cst_grp_cd3.addAliasName("Rslt1.cst_grp_cd3", p);
		p.columnRslt1_cst_grp_nm3 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt1_cst_grp_nm3.addAliasName("Rslt1.cst_grp_nm3", p);
		p.columnRslt1_cst_grp_cd4 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt1_cst_grp_cd4.addAliasName("Rslt1.cst_grp_cd4", p);
		p.columnRslt1_cst_grp_nm4 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt1_cst_grp_nm4.addAliasName("Rslt1.cst_grp_nm4", p);
		p.columnRslt1_cst_grp_cd5 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt1_cst_grp_cd5.addAliasName("Rslt1.cst_grp_cd5", p);
		p.columnRslt1_cst_grp_nm5 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt1_cst_grp_nm5.addAliasName("Rslt1.cst_grp_nm5", p);
		p.columnRslt1_cst_grp_cd6 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt1_cst_grp_cd6.addAliasName("Rslt1.cst_grp_cd6", p);
		p.columnRslt1_cst_grp_nm6 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt1_cst_grp_nm6.addAliasName("Rslt1.cst_grp_nm6", p);
		p.columnRslt1_cst_grp_cd7 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt1_cst_grp_cd7.addAliasName("Rslt1.cst_grp_cd7", p);
		p.columnRslt1_cst_grp_nm7 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt1_cst_grp_nm7.addAliasName("Rslt1.cst_grp_nm7", p);
		p.columnRslt1_cst_grp_cd8 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt1_cst_grp_cd8.addAliasName("Rslt1.cst_grp_cd8", p);
		p.columnRslt1_cst_grp_nm8 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt1_cst_grp_nm8.addAliasName("Rslt1.cst_grp_nm8", p);
		p.columnRslt1_cst_grp_cd9 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt1_cst_grp_cd9.addAliasName("Rslt1.cst_grp_cd9", p);
		p.columnRslt1_cst_grp_nm9 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt1_cst_grp_nm9.addAliasName("Rslt1.cst_grp_nm9", p);
		p.columnRslt1_cst_grp_cd10 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt1_cst_grp_cd10.addAliasName("Rslt1.cst_grp_cd10", p);
		p.columnRslt1_cst_grp_nm10 = p.Rslt1_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt1_cst_grp_nm10.addAliasName("Rslt1.cst_grp_nm10", p);
	}

	/**
	 * [Rslt2Panel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt2Panel(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 * [Rslt2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt2(MSBAP_DmndRecStsSrch p) {
		p.Rslt2_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$itm_p);
		p.Rslt2_itm_p_PPanel.setName("Rslt2.itm_p");
		p.columnRslt2_itm_cd = p.Rslt2_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt2_itm_cd.addAliasName("Rslt2.itm_cd", p);
		p.columnRslt2_itm_sub1 = p.Rslt2_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt2_itm_sub1.addAliasName("Rslt2.itm_sub1", p);
		p.columnRslt2_itm_sub2 = p.Rslt2_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt2_itm_sub2.addAliasName("Rslt2.itm_sub2", p);
		p.columnRslt2_itm_sub3 = p.Rslt2_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt2_itm_sub3.addAliasName("Rslt2.itm_sub3", p);
		p.columnRslt2_itm_nm = p.Rslt2_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt2_itm_nm.addAliasName("Rslt2.itm_nm", p);
		p.Rslt2_to_input_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_input_qty_p);
		p.Rslt2_to_input_qty_p_PPanel.setName("Rslt2.to_input_qty_p");
		p.columnRslt2_to_input_qty = p.Rslt2_to_input_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_to_input_qty.addAliasName("Rslt2.to_input_qty", p);
		p.Rslt2_to_dmnd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_dmnd_qty_p);
		p.Rslt2_to_dmnd_qty_p_PPanel.setName("Rslt2.to_dmnd_qty_p");
		p.columnRslt2_to_dmnd_qty = p.Rslt2_to_dmnd_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_to_dmnd_qty.addAliasName("Rslt2.to_dmnd_qty", p);
		p.Rslt2_to_rec_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_rec_qty_p);
		p.Rslt2_to_rec_qty_p_PPanel.setName("Rslt2.to_rec_qty_p");
		p.columnRslt2_to_rec_qty = p.Rslt2_to_rec_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_to_rec_qty.addAliasName("Rslt2.to_rec_qty", p);
		p.Rslt2_fr_input_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_input_qty_p);
		p.Rslt2_fr_input_qty_p_PPanel.setName("Rslt2.fr_input_qty_p");
		p.columnRslt2_fr_input_qty = p.Rslt2_fr_input_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_fr_input_qty.addAliasName("Rslt2.fr_input_qty", p);
		p.Rslt2_fr_dmnd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_dmnd_qty_p);
		p.Rslt2_fr_dmnd_qty_p_PPanel.setName("Rslt2.fr_dmnd_qty_p");
		p.columnRslt2_fr_dmnd_qty = p.Rslt2_fr_dmnd_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_fr_dmnd_qty.addAliasName("Rslt2.fr_dmnd_qty", p);
		p.Rslt2_fr_rec_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_rec_qty_p);
		p.Rslt2_fr_rec_qty_p_PPanel.setName("Rslt2.fr_rec_qty_p");
		p.columnRslt2_fr_rec_qty = p.Rslt2_fr_rec_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_fr_rec_qty.addAliasName("Rslt2.fr_rec_qty", p);
		p.Rslt2_to_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_sno_wrk_no_p);
		p.Rslt2_to_sno_wrk_no_p_PPanel.setName("Rslt2.to_sno_wrk_no_p");
		p.columnRslt2_to_sno1 = p.Rslt2_to_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt2_to_sno1.addAliasName("Rslt2.to_sno1", p);
		p.columnRslt2_to_sno2 = p.Rslt2_to_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt2_to_sno2.addAliasName("Rslt2.to_sno2", p);
		p.columnRslt2_to_sno3 = p.Rslt2_to_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt2_to_sno3.addAliasName("Rslt2.to_sno3", p);
		p.columnRslt2_to_sno4 = p.Rslt2_to_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt2_to_sno4.addAliasName("Rslt2.to_sno4", p);
		p.columnRslt2_to_wrk_no = p.Rslt2_to_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt2_to_wrk_no.addAliasName("Rslt2.to_wrk_no", p);
		p.columnRslt2_to_wrk_nm = p.Rslt2_to_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt2_to_wrk_nm.addAliasName("Rslt2.to_wrk_nm", p);
		p.Rslt2_fr_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_sno_wrk_no_p);
		p.Rslt2_fr_sno_wrk_no_p_PPanel.setName("Rslt2.fr_sno_wrk_no_p");
		p.columnRslt2_fr_sno1 = p.Rslt2_fr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt2_fr_sno1.addAliasName("Rslt2.fr_sno1", p);
		p.columnRslt2_fr_sno2 = p.Rslt2_fr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt2_fr_sno2.addAliasName("Rslt2.fr_sno2", p);
		p.columnRslt2_fr_sno3 = p.Rslt2_fr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt2_fr_sno3.addAliasName("Rslt2.fr_sno3", p);
		p.columnRslt2_fr_sno4 = p.Rslt2_fr_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt2_fr_sno4.addAliasName("Rslt2.fr_sno4", p);
		p.columnRslt2_fr_wrk_no = p.Rslt2_fr_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt2_fr_wrk_no.addAliasName("Rslt2.fr_wrk_no", p);
		p.columnRslt2_fr_wrk_nm = p.Rslt2_fr_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt2_fr_wrk_nm.addAliasName("Rslt2.fr_wrk_nm", p);
		p.Rslt2_to_dmnd_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_dmnd_usr_dpt_p);
		p.Rslt2_to_dmnd_usr_dpt_p_PPanel.setName("Rslt2.to_dmnd_usr_dpt_p");
		p.columnRslt2_to_dmnd_usr_cd = p.Rslt2_to_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt2_to_dmnd_usr_cd.addAliasName("Rslt2.to_dmnd_usr_cd", p);
		p.columnRslt2_to_dmnd_usr_nm = p.Rslt2_to_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt2_to_dmnd_usr_nm.addAliasName("Rslt2.to_dmnd_usr_nm", p);
		p.columnRslt2_to_dmnd_dpt_cd = p.Rslt2_to_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt2_to_dmnd_dpt_cd.addAliasName("Rslt2.to_dmnd_dpt_cd", p);
		p.columnRslt2_to_dmnd_dpt_nm = p.Rslt2_to_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt2_to_dmnd_dpt_nm.addAliasName("Rslt2.to_dmnd_dpt_nm", p);
		p.Rslt2_fr_dmnd_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_dmnd_usr_dpt_p);
		p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.setName("Rslt2.fr_dmnd_usr_dpt_p");
		p.columnRslt2_fr_dmnd_usr_cd = p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt2_fr_dmnd_usr_cd.addAliasName("Rslt2.fr_dmnd_usr_cd", p);
		p.columnRslt2_fr_dmnd_usr_nm = p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt2_fr_dmnd_usr_nm.addAliasName("Rslt2.fr_dmnd_usr_nm", p);
		p.columnRslt2_fr_dmnd_dpt_cd = p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt2_fr_dmnd_dpt_cd.addAliasName("Rslt2.fr_dmnd_dpt_cd", p);
		p.columnRslt2_fr_dmnd_dpt_nm = p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt2_fr_dmnd_dpt_nm.addAliasName("Rslt2.fr_dmnd_dpt_nm", p);
		p.Rslt2_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$itm_grp_p);
		p.Rslt2_itm_grp_p_PPanel.setName("Rslt2.itm_grp_p");
		p.columnRslt2_itm_grp_cd1 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt2_itm_grp_cd1.addAliasName("Rslt2.itm_grp_cd1", p);
		p.columnRslt2_itm_grp_nm1 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt2_itm_grp_nm1.addAliasName("Rslt2.itm_grp_nm1", p);
		p.columnRslt2_itm_grp_cd2 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt2_itm_grp_cd2.addAliasName("Rslt2.itm_grp_cd2", p);
		p.columnRslt2_itm_grp_nm2 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt2_itm_grp_nm2.addAliasName("Rslt2.itm_grp_nm2", p);
		p.columnRslt2_itm_grp_cd3 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt2_itm_grp_cd3.addAliasName("Rslt2.itm_grp_cd3", p);
		p.columnRslt2_itm_grp_nm3 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt2_itm_grp_nm3.addAliasName("Rslt2.itm_grp_nm3", p);
		p.columnRslt2_itm_grp_cd4 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt2_itm_grp_cd4.addAliasName("Rslt2.itm_grp_cd4", p);
		p.columnRslt2_itm_grp_nm4 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt2_itm_grp_nm4.addAliasName("Rslt2.itm_grp_nm4", p);
		p.columnRslt2_itm_grp_cd5 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt2_itm_grp_cd5.addAliasName("Rslt2.itm_grp_cd5", p);
		p.columnRslt2_itm_grp_nm5 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt2_itm_grp_nm5.addAliasName("Rslt2.itm_grp_nm5", p);
		p.columnRslt2_itm_grp_cd6 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt2_itm_grp_cd6.addAliasName("Rslt2.itm_grp_cd6", p);
		p.columnRslt2_itm_grp_nm6 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt2_itm_grp_nm6.addAliasName("Rslt2.itm_grp_nm6", p);
		p.columnRslt2_itm_grp_cd7 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt2_itm_grp_cd7.addAliasName("Rslt2.itm_grp_cd7", p);
		p.columnRslt2_itm_grp_nm7 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt2_itm_grp_nm7.addAliasName("Rslt2.itm_grp_nm7", p);
		p.columnRslt2_itm_grp_cd8 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt2_itm_grp_cd8.addAliasName("Rslt2.itm_grp_cd8", p);
		p.columnRslt2_itm_grp_nm8 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt2_itm_grp_nm8.addAliasName("Rslt2.itm_grp_nm8", p);
		p.columnRslt2_itm_grp_cd9 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt2_itm_grp_cd9.addAliasName("Rslt2.itm_grp_cd9", p);
		p.columnRslt2_itm_grp_nm9 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt2_itm_grp_nm9.addAliasName("Rslt2.itm_grp_nm9", p);
		p.columnRslt2_itm_grp_cd10 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt2_itm_grp_cd10.addAliasName("Rslt2.itm_grp_cd10", p);
		p.columnRslt2_itm_grp_nm10 = p.Rslt2_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt2_itm_grp_nm10.addAliasName("Rslt2.itm_grp_nm10", p);
		p.Rslt2_to_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_dlv_grp_p);
		p.Rslt2_to_dlv_grp_p_PPanel.setName("Rslt2.to_dlv_grp_p");
		p.columnRslt2_to_dlv_grp_cd1 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt2_to_dlv_grp_cd1.addAliasName("Rslt2.to_dlv_grp_cd1", p);
		p.columnRslt2_to_dlv_grp_nm1 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt2_to_dlv_grp_nm1.addAliasName("Rslt2.to_dlv_grp_nm1", p);
		p.columnRslt2_to_dlv_grp_cd2 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt2_to_dlv_grp_cd2.addAliasName("Rslt2.to_dlv_grp_cd2", p);
		p.columnRslt2_to_dlv_grp_nm2 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt2_to_dlv_grp_nm2.addAliasName("Rslt2.to_dlv_grp_nm2", p);
		p.columnRslt2_to_dlv_grp_cd3 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt2_to_dlv_grp_cd3.addAliasName("Rslt2.to_dlv_grp_cd3", p);
		p.columnRslt2_to_dlv_grp_nm3 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt2_to_dlv_grp_nm3.addAliasName("Rslt2.to_dlv_grp_nm3", p);
		p.columnRslt2_to_dlv_grp_cd4 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt2_to_dlv_grp_cd4.addAliasName("Rslt2.to_dlv_grp_cd4", p);
		p.columnRslt2_to_dlv_grp_nm4 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt2_to_dlv_grp_nm4.addAliasName("Rslt2.to_dlv_grp_nm4", p);
		p.columnRslt2_to_dlv_grp_cd5 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt2_to_dlv_grp_cd5.addAliasName("Rslt2.to_dlv_grp_cd5", p);
		p.columnRslt2_to_dlv_grp_nm5 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt2_to_dlv_grp_nm5.addAliasName("Rslt2.to_dlv_grp_nm5", p);
		p.columnRslt2_to_dlv_grp_cd6 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt2_to_dlv_grp_cd6.addAliasName("Rslt2.to_dlv_grp_cd6", p);
		p.columnRslt2_to_dlv_grp_nm6 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt2_to_dlv_grp_nm6.addAliasName("Rslt2.to_dlv_grp_nm6", p);
		p.columnRslt2_to_dlv_grp_cd7 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt2_to_dlv_grp_cd7.addAliasName("Rslt2.to_dlv_grp_cd7", p);
		p.columnRslt2_to_dlv_grp_nm7 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt2_to_dlv_grp_nm7.addAliasName("Rslt2.to_dlv_grp_nm7", p);
		p.columnRslt2_to_dlv_grp_cd8 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt2_to_dlv_grp_cd8.addAliasName("Rslt2.to_dlv_grp_cd8", p);
		p.columnRslt2_to_dlv_grp_nm8 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt2_to_dlv_grp_nm8.addAliasName("Rslt2.to_dlv_grp_nm8", p);
		p.columnRslt2_to_dlv_grp_cd9 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt2_to_dlv_grp_cd9.addAliasName("Rslt2.to_dlv_grp_cd9", p);
		p.columnRslt2_to_dlv_grp_nm9 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt2_to_dlv_grp_nm9.addAliasName("Rslt2.to_dlv_grp_nm9", p);
		p.columnRslt2_to_dlv_grp_cd10 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt2_to_dlv_grp_cd10.addAliasName("Rslt2.to_dlv_grp_cd10", p);
		p.columnRslt2_to_dlv_grp_nm10 = p.Rslt2_to_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt2_to_dlv_grp_nm10.addAliasName("Rslt2.to_dlv_grp_nm10", p);
		p.Rslt2_fr_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_dlv_grp_p);
		p.Rslt2_fr_dlv_grp_p_PPanel.setName("Rslt2.fr_dlv_grp_p");
		p.columnRslt2_fr_dlv_grp_cd1 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt2_fr_dlv_grp_cd1.addAliasName("Rslt2.fr_dlv_grp_cd1", p);
		p.columnRslt2_fr_dlv_grp_nm1 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt2_fr_dlv_grp_nm1.addAliasName("Rslt2.fr_dlv_grp_nm1", p);
		p.columnRslt2_fr_dlv_grp_cd2 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt2_fr_dlv_grp_cd2.addAliasName("Rslt2.fr_dlv_grp_cd2", p);
		p.columnRslt2_fr_dlv_grp_nm2 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt2_fr_dlv_grp_nm2.addAliasName("Rslt2.fr_dlv_grp_nm2", p);
		p.columnRslt2_fr_dlv_grp_cd3 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt2_fr_dlv_grp_cd3.addAliasName("Rslt2.fr_dlv_grp_cd3", p);
		p.columnRslt2_fr_dlv_grp_nm3 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt2_fr_dlv_grp_nm3.addAliasName("Rslt2.fr_dlv_grp_nm3", p);
		p.columnRslt2_fr_dlv_grp_cd4 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt2_fr_dlv_grp_cd4.addAliasName("Rslt2.fr_dlv_grp_cd4", p);
		p.columnRslt2_fr_dlv_grp_nm4 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt2_fr_dlv_grp_nm4.addAliasName("Rslt2.fr_dlv_grp_nm4", p);
		p.columnRslt2_fr_dlv_grp_cd5 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt2_fr_dlv_grp_cd5.addAliasName("Rslt2.fr_dlv_grp_cd5", p);
		p.columnRslt2_fr_dlv_grp_nm5 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt2_fr_dlv_grp_nm5.addAliasName("Rslt2.fr_dlv_grp_nm5", p);
		p.columnRslt2_fr_dlv_grp_cd6 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt2_fr_dlv_grp_cd6.addAliasName("Rslt2.fr_dlv_grp_cd6", p);
		p.columnRslt2_fr_dlv_grp_nm6 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt2_fr_dlv_grp_nm6.addAliasName("Rslt2.fr_dlv_grp_nm6", p);
		p.columnRslt2_fr_dlv_grp_cd7 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt2_fr_dlv_grp_cd7.addAliasName("Rslt2.fr_dlv_grp_cd7", p);
		p.columnRslt2_fr_dlv_grp_nm7 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt2_fr_dlv_grp_nm7.addAliasName("Rslt2.fr_dlv_grp_nm7", p);
		p.columnRslt2_fr_dlv_grp_cd8 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt2_fr_dlv_grp_cd8.addAliasName("Rslt2.fr_dlv_grp_cd8", p);
		p.columnRslt2_fr_dlv_grp_nm8 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt2_fr_dlv_grp_nm8.addAliasName("Rslt2.fr_dlv_grp_nm8", p);
		p.columnRslt2_fr_dlv_grp_cd9 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt2_fr_dlv_grp_cd9.addAliasName("Rslt2.fr_dlv_grp_cd9", p);
		p.columnRslt2_fr_dlv_grp_nm9 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt2_fr_dlv_grp_nm9.addAliasName("Rslt2.fr_dlv_grp_nm9", p);
		p.columnRslt2_fr_dlv_grp_cd10 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt2_fr_dlv_grp_cd10.addAliasName("Rslt2.fr_dlv_grp_cd10", p);
		p.columnRslt2_fr_dlv_grp_nm10 = p.Rslt2_fr_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt2_fr_dlv_grp_nm10.addAliasName("Rslt2.fr_dlv_grp_nm10", p);
		p.Rslt2_to_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$to_cst_grp_p);
		p.Rslt2_to_cst_grp_p_PPanel.setName("Rslt2.to_cst_grp_p");
		p.columnRslt2_to_cst_grp_cd1 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt2_to_cst_grp_cd1.addAliasName("Rslt2.to_cst_grp_cd1", p);
		p.columnRslt2_to_cst_grp_nm1 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt2_to_cst_grp_nm1.addAliasName("Rslt2.to_cst_grp_nm1", p);
		p.columnRslt2_to_cst_grp_cd2 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt2_to_cst_grp_cd2.addAliasName("Rslt2.to_cst_grp_cd2", p);
		p.columnRslt2_to_cst_grp_nm2 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt2_to_cst_grp_nm2.addAliasName("Rslt2.to_cst_grp_nm2", p);
		p.columnRslt2_to_cst_grp_cd3 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt2_to_cst_grp_cd3.addAliasName("Rslt2.to_cst_grp_cd3", p);
		p.columnRslt2_to_cst_grp_nm3 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt2_to_cst_grp_nm3.addAliasName("Rslt2.to_cst_grp_nm3", p);
		p.columnRslt2_to_cst_grp_cd4 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt2_to_cst_grp_cd4.addAliasName("Rslt2.to_cst_grp_cd4", p);
		p.columnRslt2_to_cst_grp_nm4 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt2_to_cst_grp_nm4.addAliasName("Rslt2.to_cst_grp_nm4", p);
		p.columnRslt2_to_cst_grp_cd5 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt2_to_cst_grp_cd5.addAliasName("Rslt2.to_cst_grp_cd5", p);
		p.columnRslt2_to_cst_grp_nm5 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt2_to_cst_grp_nm5.addAliasName("Rslt2.to_cst_grp_nm5", p);
		p.columnRslt2_to_cst_grp_cd6 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt2_to_cst_grp_cd6.addAliasName("Rslt2.to_cst_grp_cd6", p);
		p.columnRslt2_to_cst_grp_nm6 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt2_to_cst_grp_nm6.addAliasName("Rslt2.to_cst_grp_nm6", p);
		p.columnRslt2_to_cst_grp_cd7 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt2_to_cst_grp_cd7.addAliasName("Rslt2.to_cst_grp_cd7", p);
		p.columnRslt2_to_cst_grp_nm7 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt2_to_cst_grp_nm7.addAliasName("Rslt2.to_cst_grp_nm7", p);
		p.columnRslt2_to_cst_grp_cd8 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt2_to_cst_grp_cd8.addAliasName("Rslt2.to_cst_grp_cd8", p);
		p.columnRslt2_to_cst_grp_nm8 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt2_to_cst_grp_nm8.addAliasName("Rslt2.to_cst_grp_nm8", p);
		p.columnRslt2_to_cst_grp_cd9 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt2_to_cst_grp_cd9.addAliasName("Rslt2.to_cst_grp_cd9", p);
		p.columnRslt2_to_cst_grp_nm9 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt2_to_cst_grp_nm9.addAliasName("Rslt2.to_cst_grp_nm9", p);
		p.columnRslt2_to_cst_grp_cd10 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt2_to_cst_grp_cd10.addAliasName("Rslt2.to_cst_grp_cd10", p);
		p.columnRslt2_to_cst_grp_nm10 = p.Rslt2_to_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt2_to_cst_grp_nm10.addAliasName("Rslt2.to_cst_grp_nm10", p);
		p.Rslt2_fr_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.$fr_cst_grp_p);
		p.Rslt2_fr_cst_grp_p_PPanel.setName("Rslt2.fr_cst_grp_p");
		p.columnRslt2_fr_cst_grp_cd1 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt2_fr_cst_grp_cd1.addAliasName("Rslt2.fr_cst_grp_cd1", p);
		p.columnRslt2_fr_cst_grp_nm1 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt2_fr_cst_grp_nm1.addAliasName("Rslt2.fr_cst_grp_nm1", p);
		p.columnRslt2_fr_cst_grp_cd2 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt2_fr_cst_grp_cd2.addAliasName("Rslt2.fr_cst_grp_cd2", p);
		p.columnRslt2_fr_cst_grp_nm2 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt2_fr_cst_grp_nm2.addAliasName("Rslt2.fr_cst_grp_nm2", p);
		p.columnRslt2_fr_cst_grp_cd3 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt2_fr_cst_grp_cd3.addAliasName("Rslt2.fr_cst_grp_cd3", p);
		p.columnRslt2_fr_cst_grp_nm3 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt2_fr_cst_grp_nm3.addAliasName("Rslt2.fr_cst_grp_nm3", p);
		p.columnRslt2_fr_cst_grp_cd4 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt2_fr_cst_grp_cd4.addAliasName("Rslt2.fr_cst_grp_cd4", p);
		p.columnRslt2_fr_cst_grp_nm4 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt2_fr_cst_grp_nm4.addAliasName("Rslt2.fr_cst_grp_nm4", p);
		p.columnRslt2_fr_cst_grp_cd5 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt2_fr_cst_grp_cd5.addAliasName("Rslt2.fr_cst_grp_cd5", p);
		p.columnRslt2_fr_cst_grp_nm5 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt2_fr_cst_grp_nm5.addAliasName("Rslt2.fr_cst_grp_nm5", p);
		p.columnRslt2_fr_cst_grp_cd6 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt2_fr_cst_grp_cd6.addAliasName("Rslt2.fr_cst_grp_cd6", p);
		p.columnRslt2_fr_cst_grp_nm6 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt2_fr_cst_grp_nm6.addAliasName("Rslt2.fr_cst_grp_nm6", p);
		p.columnRslt2_fr_cst_grp_cd7 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt2_fr_cst_grp_cd7.addAliasName("Rslt2.fr_cst_grp_cd7", p);
		p.columnRslt2_fr_cst_grp_nm7 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt2_fr_cst_grp_nm7.addAliasName("Rslt2.fr_cst_grp_nm7", p);
		p.columnRslt2_fr_cst_grp_cd8 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt2_fr_cst_grp_cd8.addAliasName("Rslt2.fr_cst_grp_cd8", p);
		p.columnRslt2_fr_cst_grp_nm8 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt2_fr_cst_grp_nm8.addAliasName("Rslt2.fr_cst_grp_nm8", p);
		p.columnRslt2_fr_cst_grp_cd9 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt2_fr_cst_grp_cd9.addAliasName("Rslt2.fr_cst_grp_cd9", p);
		p.columnRslt2_fr_cst_grp_nm9 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt2_fr_cst_grp_nm9.addAliasName("Rslt2.fr_cst_grp_nm9", p);
		p.columnRslt2_fr_cst_grp_cd10 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt2_fr_cst_grp_cd10.addAliasName("Rslt2.fr_cst_grp_cd10", p);
		p.columnRslt2_fr_cst_grp_nm10 = p.Rslt2_fr_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt2_fr_cst_grp_nm10.addAliasName("Rslt2.fr_cst_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBAP_DmndRecStsSrch p) {
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

	
	/** [Cnd_dmnd_period_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dmnd_period_typ_p = null;

	/**
	 * [Cnd_dmnd_period_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dmnd_period_typ_ListPutter() {
		if (Cnd_dmnd_period_typ_p == null) {
			Cnd_dmnd_period_typ_p = createCnd_dmnd_period_typ_ListPutter(Cnd_dmnd_period_typ, "dmnd_period_typ", "dmnd_period_typ_nm");

		}
		return Cnd_dmnd_period_typ_p;
	}
	
	
	/** [Cnd_dmnd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dmnd_typ_p = null;

	/**
	 * [Cnd_dmnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dmnd_typ_ListPutter() {
		if (Cnd_dmnd_typ_p == null) {
			Cnd_dmnd_typ_p = createCnd_dmnd_typ_ListPutter(Cnd_dmnd_typ, "dmnd_typ", "dmnd_typ_nm");

		}
		return Cnd_dmnd_typ_p;
	}
	
	
	/** [Cnd_dmnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dmnd_loc_cd_p = null;

	/**
	 * [Cnd_dmnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dmnd_loc_cd_ListPutter() {
		if (Cnd_dmnd_loc_cd_p == null) {
			Cnd_dmnd_loc_cd_p = createCnd_dmnd_loc_cd_ListPutter(Cnd_dmnd_loc_cd, "dmnd_loc_cd", "dmnd_loc_nm");

		}
		return Cnd_dmnd_loc_cd_p;
	}
	
	
	/** [Cnd_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_site_cd_p = null;

	/**
	 * [Cnd_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_site_cd_ListPutter() {
		if (Cnd_site_cd_p == null) {
			Cnd_site_cd_p = createCnd_site_cd_ListPutter(Cnd_site_cd, "site_cd", "site_nm");

		}
		return Cnd_site_cd_p;
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
	
	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
	}
	
	
	/** [Cnd_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_grp_cd_p = null;

	/**
	 * [Cnd_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_grp_cd_ListPutter() {
		if (Cnd_loc_grp_cd_p == null) {
			Cnd_loc_grp_cd_p = createCnd_loc_grp_cd_ListPutter(Cnd_loc_grp_cd, "loc_grp_cd", "loc_grp_nm");

		}
		return Cnd_loc_grp_cd_p;
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
	
	
	/** [Cnd_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_cd_p = null;

	/**
	 * [Cnd_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_cd_ListPutter() {
		if (Cnd_usr_cd_p == null) {
			Cnd_usr_cd_p = createCnd_usr_cd_ListPutter(Cnd_usr_cd, "usr_cd", "usr_nm");

		}
		return Cnd_usr_cd_p;
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
	
	
	/** [Rslt1_dmnd_period_typ_ListPutter]の定義 */
	private MCListPutter Rslt1_dmnd_period_typ_p = null;

	/**
	 * [Rslt1_dmnd_period_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_dmnd_period_typ_ListPutter() {
		if (Rslt1_dmnd_period_typ_p == null) {
			Rslt1_dmnd_period_typ_p = createRslt1_dmnd_period_typ_ListPutter(columnRslt1_dmnd_period_typ, "dmnd_period_typ");

		}
		return Rslt1_dmnd_period_typ_p;
	}
	
	
	/** [Rslt1_dmnd_typ_ListPutter]の定義 */
	private MCListPutter Rslt1_dmnd_typ_p = null;

	/**
	 * [Rslt1_dmnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_dmnd_typ_ListPutter() {
		if (Rslt1_dmnd_typ_p == null) {
			Rslt1_dmnd_typ_p = createRslt1_dmnd_typ_ListPutter(columnRslt1_dmnd_typ, "dmnd_typ");

		}
		return Rslt1_dmnd_typ_p;
	}
	
	
	/** [Rslt1_dmnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_dmnd_loc_cd_p = null;

	/**
	 * [Rslt1_dmnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_dmnd_loc_cd_ListPutter() {
		if (Rslt1_dmnd_loc_cd_p == null) {
			Rslt1_dmnd_loc_cd_p = createRslt1_dmnd_loc_cd_ListPutter(columnRslt1_dmnd_loc_cd, "dmnd_loc_cd");

		}
		return Rslt1_dmnd_loc_cd_p;
	}
	
	
	/** [Rslt1_dlv_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_dlv_cd_p = null;

	/**
	 * [Rslt1_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_dlv_cd_ListPutter() {
		if (Rslt1_dlv_cd_p == null) {
			Rslt1_dlv_cd_p = createRslt1_dlv_cd_ListPutter(columnRslt1_dlv_cd, "dlv_cd");

		}
		return Rslt1_dlv_cd_p;
	}
	
	
	/** [Rslt1_cst_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_cst_cd_p = null;

	/**
	 * [Rslt1_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_cst_cd_ListPutter() {
		if (Rslt1_cst_cd_p == null) {
			Rslt1_cst_cd_p = createRslt1_cst_cd_ListPutter(columnRslt1_cst_cd, "cst_cd");

		}
		return Rslt1_cst_cd_p;
	}
	
	
	/** [Rslt2_fr_dmnd_period_typ_ListPutter]の定義 */
	private MCListPutter Rslt2_fr_dmnd_period_typ_p = null;

	/**
	 * [Rslt2_fr_dmnd_period_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_fr_dmnd_period_typ_ListPutter() {
		if (Rslt2_fr_dmnd_period_typ_p == null) {
			Rslt2_fr_dmnd_period_typ_p = createRslt2_fr_dmnd_period_typ_ListPutter(columnRslt2_fr_dmnd_period_typ, "fr_dmnd_period_typ");

		}
		return Rslt2_fr_dmnd_period_typ_p;
	}
	
	
	/** [Rslt2_fr_dmnd_typ_ListPutter]の定義 */
	private MCListPutter Rslt2_fr_dmnd_typ_p = null;

	/**
	 * [Rslt2_fr_dmnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_fr_dmnd_typ_ListPutter() {
		if (Rslt2_fr_dmnd_typ_p == null) {
			Rslt2_fr_dmnd_typ_p = createRslt2_fr_dmnd_typ_ListPutter(columnRslt2_fr_dmnd_typ, "fr_dmnd_typ");

		}
		return Rslt2_fr_dmnd_typ_p;
	}
	
	
	/** [Rslt2_dmnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_dmnd_loc_cd_p = null;

	/**
	 * [Rslt2_dmnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_dmnd_loc_cd_ListPutter() {
		if (Rslt2_dmnd_loc_cd_p == null) {
			Rslt2_dmnd_loc_cd_p = createRslt2_dmnd_loc_cd_ListPutter(columnRslt2_dmnd_loc_cd, "dmnd_loc_cd");

		}
		return Rslt2_dmnd_loc_cd_p;
	}
	
	
	/** [Rslt2_to_dlv_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_to_dlv_cd_p = null;

	/**
	 * [Rslt2_to_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_to_dlv_cd_ListPutter() {
		if (Rslt2_to_dlv_cd_p == null) {
			Rslt2_to_dlv_cd_p = createRslt2_to_dlv_cd_ListPutter(columnRslt2_to_dlv_cd, "to_dlv_cd");

		}
		return Rslt2_to_dlv_cd_p;
	}
	
	
	/** [Rslt2_to_cst_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_to_cst_cd_p = null;

	/**
	 * [Rslt2_to_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_to_cst_cd_ListPutter() {
		if (Rslt2_to_cst_cd_p == null) {
			Rslt2_to_cst_cd_p = createRslt2_to_cst_cd_ListPutter(columnRslt2_to_cst_cd, "to_cst_cd");

		}
		return Rslt2_to_cst_cd_p;
	}
	
	
	/** [Rslt2_fr_dlv_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_fr_dlv_cd_p = null;

	/**
	 * [Rslt2_fr_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_fr_dlv_cd_ListPutter() {
		if (Rslt2_fr_dlv_cd_p == null) {
			Rslt2_fr_dlv_cd_p = createRslt2_fr_dlv_cd_ListPutter(columnRslt2_fr_dlv_cd, "fr_dlv_cd");

		}
		return Rslt2_fr_dlv_cd_p;
	}
	
	
	/** [Rslt2_fr_cst_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_fr_cst_cd_p = null;

	/**
	 * [Rslt2_fr_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_fr_cst_cd_ListPutter() {
		if (Rslt2_fr_cst_cd_p == null) {
			Rslt2_fr_cst_cd_p = createRslt2_fr_cst_cd_ListPutter(columnRslt2_fr_cst_cd, "fr_cst_cd");

		}
		return Rslt2_fr_cst_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBAP_DmndRecStsSrch create(){
		MSBAP_DmndRecStsSrch p = new MSBAP_DmndRecStsSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBAP_DmndRecStsSrch create(String name){
		MSBAP_DmndRecStsSrch p = new MSBAP_DmndRecStsSrch(name);
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
		MSBAP_DmndRecStsSrch_MC.jbfInitScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitTop((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitFold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitTab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitTab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitTab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitTab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitCnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitCnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitCnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitCnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitCtrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitRPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitRslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitRslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitRslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitRslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbfInitBtn((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitTop((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitFold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitTab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitTab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitTab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitTab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitCnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitCnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitCnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitCnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitCtrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitRPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitRslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitRslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitRslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitRslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.jbInitBtn((MSBAP_DmndRecStsSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBAP_DmndRecStsSrch p) {
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
	protected static void jbfInitTab1(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF1 = p.beansFactory.createRadioButton("Cnd.ope_REF1");
		p.Cnd_ope_REF2 = p.beansFactory.createRadioButton("Cnd.ope_REF2");
		p.Cnd_dmnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dmnd_dt_fr_Label");
		p.Cnd_dmnd_dt_fr = p.beansFactory.createDateField("Cnd.dmnd_dt_fr");
		p.Cnd_dmnd_dt_fr.setLabel(p.Cnd_dmnd_dt_fr_Label);
		p.Cnd_dmnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dmnd_dt_to_Label");
		p.Cnd_dmnd_dt_to = p.beansFactory.createDateField("Cnd.dmnd_dt_to");
		p.Cnd_dmnd_dt_to.setLabel(p.Cnd_dmnd_dt_to_Label);
		p.Cnd_dmnd_period_typ_Label = p.beansFactory.createLabel("Cnd.dmnd_period_typ_Label");
		p.Cnd_dmnd_period_typ = p.beansFactory.createTextComboBox("Cnd.dmnd_period_typ");
		p.Cnd_dmnd_period_typ.setLabel(p.Cnd_dmnd_period_typ_Label);
		p.Cnd_dmnd_period_typ_nm = p.beansFactory.createTextField("Cnd.dmnd_period_typ_nm");
		p.Cnd_dmnd_typ_Label = p.beansFactory.createLabel("Cnd.dmnd_typ_Label");
		p.Cnd_dmnd_typ = p.beansFactory.createTextComboBox("Cnd.dmnd_typ");
		p.Cnd_dmnd_typ.setLabel(p.Cnd_dmnd_typ_Label);
		p.Cnd_dmnd_typ_nm = p.beansFactory.createTextField("Cnd.dmnd_typ_nm");
		p.Cnd_dmnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.dmnd_loc_cd_Label");
		p.Cnd_dmnd_loc_cd = p.beansFactory.createTextField("Cnd.dmnd_loc_cd");
		p.Cnd_dmnd_loc_cd.setLabel(p.Cnd_dmnd_loc_cd_Label);
		p.Cnd_dmnd_loc_nm = p.beansFactory.createTextField("Cnd.dmnd_loc_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextComboBox("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextComboBox("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_spln_vers_Label = p.beansFactory.createLabel("Cnd.spln_vers_Label");
		p.Cnd_spln_vers = p.beansFactory.createTextComboBox("Cnd.spln_vers");
		p.Cnd_spln_vers.setLabel(p.Cnd_spln_vers_Label);
		p.Cnd_spln_itm_cd_Label = p.beansFactory.createLabel("Cnd.spln_itm_cd_Label");
		p.Cnd_spln_itm_cd = p.beansFactory.createTextField("Cnd.spln_itm_cd");
		p.Cnd_spln_itm_cd.setLabel(p.Cnd_spln_itm_cd_Label);
		p.Cnd_spln_itm_nm = p.beansFactory.createTextField("Cnd.spln_itm_nm");
		p.Cnd_dmnd_no_Label = p.beansFactory.createLabel("Cnd.dmnd_no_Label");
		p.Cnd_dmnd_no = p.beansFactory.createTextField("Cnd.dmnd_no");
		p.Cnd_dmnd_no.setLabel(p.Cnd_dmnd_no_Label);
		p.Cnd_cst_frcst_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_no_Label");
		p.Cnd_cst_frcst_no = p.beansFactory.createTextField("Cnd.cst_frcst_no");
		p.Cnd_cst_frcst_no.setLabel(p.Cnd_cst_frcst_no_Label);
		p.Cnd_cst_frcst_d_no_Label = p.beansFactory.createLabel("Cnd.cst_frcst_d_no_Label");
		p.Cnd_cst_frcst_d_no = p.beansFactory.createTextField("Cnd.cst_frcst_d_no");
		p.Cnd_cst_frcst_d_no.setLabel(p.Cnd_cst_frcst_d_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
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
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt1Panel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt1Panel(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Rslt1PanelPanel = p.beansFactory.createPanel("Rslt1Panel");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt1(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Rslt1Panel = p.beansFactory.createPanel("Rslt1");
		p.Rslt1TitledBorder = p.beansFactory.createTitledBorder();
		p.Rslt1ScrollPane = p.beansFactory.createScrollPane("Rslt1.scroll");
		p.createRslt1Table();
		// ブロックの項目の初期化
		p.columnRslt1_dmnd_no = p.beansFactory.createTableColumn("Rslt1.dmnd_no", MCColumnType.TEXT);
		p.columnRslt1_dmnd_dt = p.beansFactory.createTableColumn("Rslt1.dmnd_dt", MCColumnType.DATE);
		p.columnRslt1_dmnd_st_dt = p.beansFactory.createTableColumn("Rslt1.dmnd_st_dt", MCColumnType.DATE);
		p.columnRslt1_dmnd_end_dt = p.beansFactory.createTableColumn("Rslt1.dmnd_end_dt", MCColumnType.DATE);
		p.columnRslt1_dlv_schd_st_dt = p.beansFactory.createTableColumn("Rslt1.dlv_schd_st_dt", MCColumnType.DATE);
		p.columnRslt1_dlv_schd_end_dt = p.beansFactory.createTableColumn("Rslt1.dlv_schd_end_dt", MCColumnType.DATE);
		p.columnRslt1_dmnd_period_typ = p.beansFactory.createTableColumn("Rslt1.dmnd_period_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt1_dmnd_period_typ_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_period_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_dmnd_typ = p.beansFactory.createTableColumn("Rslt1.dmnd_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt1_dmnd_typ_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_base_unit_cd = p.beansFactory.createTableColumn("Rslt1.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt1_base_unit_nm = p.beansFactory.createTableColumn("Rslt1.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt1_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt1.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt1_dmnd_loc_cd = p.beansFactory.createTableColumn("Rslt1.dmnd_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_dmnd_loc_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_loc_nm", MCColumnType.TEXT);
		p.columnRslt1_dmnd_loc_grp_cd = p.beansFactory.createTableColumn("Rslt1.dmnd_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt1_dmnd_loc_grp_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt1_dmnd_lg_grp_cd = p.beansFactory.createTableColumn("Rslt1.dmnd_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt1_dmnd_lg_grp_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt1_dmnd_wg_cd = p.beansFactory.createTableColumn("Rslt1.dmnd_wg_cd", MCColumnType.TEXT);
		p.columnRslt1_dmnd_wg_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_wg_nm", MCColumnType.TEXT);
		p.columnRslt1_dmnd_site_cd = p.beansFactory.createTableColumn("Rslt1.dmnd_site_cd", MCColumnType.TEXT);
		p.columnRslt1_dmnd_site_nm = p.beansFactory.createTableColumn("Rslt1.dmnd_site_nm", MCColumnType.TEXT);
		p.columnRslt1_dlv_cd = p.beansFactory.createTableColumn("Rslt1.dlv_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_dlv_nm = p.beansFactory.createTableColumn("Rslt1.dlv_nm", MCColumnType.TEXT);
		p.columnRslt1_cst_cd = p.beansFactory.createTableColumn("Rslt1.cst_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_cst_nm = p.beansFactory.createTableColumn("Rslt1.cst_nm", MCColumnType.TEXT);
		p.columnRslt1_ym = p.beansFactory.createTableColumn("Rslt1.ym", MCColumnType.DATE);
		p.columnRslt1_spln_vers = p.beansFactory.createTableColumn("Rslt1.spln_vers", MCColumnType.TEXT);
		p.columnRslt1_spln_itm_cd = p.beansFactory.createTableColumn("Rslt1.spln_itm_cd", MCColumnType.TEXT);
		p.columnRslt1_spln_itm_nm = p.beansFactory.createTableColumn("Rslt1.spln_itm_nm", MCColumnType.TEXT);
		p.columnRslt1_cur_cd = p.beansFactory.createTableColumn("Rslt1.cur_cd", MCColumnType.TEXT);
		p.columnRslt1_cur_nm = p.beansFactory.createTableColumn("Rslt1.cur_nm", MCColumnType.TEXT);
		p.columnRslt1_cst_frcst_no = p.beansFactory.createTableColumn("Rslt1.cst_frcst_no", MCColumnType.TEXT);
		p.columnRslt1_cst_frcst_d_no = p.beansFactory.createTableColumn("Rslt1.cst_frcst_d_no", MCColumnType.TEXT);
		p.columnRslt1_slo_no = p.beansFactory.createTableColumn("Rslt1.slo_no", MCColumnType.TEXT);
		p.columnRslt1_slo_d_no = p.beansFactory.createTableColumn("Rslt1.slo_d_no", MCColumnType.TEXT);
		p.columnRslt1_intr_rmrks = p.beansFactory.createTableColumn("Rslt1.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt1_sub_char1 = p.beansFactory.createTableColumn("Rslt1.sub_char1", MCColumnType.TEXT);
		p.columnRslt1_sub_char2 = p.beansFactory.createTableColumn("Rslt1.sub_char2", MCColumnType.TEXT);
		p.columnRslt1_sub_char3 = p.beansFactory.createTableColumn("Rslt1.sub_char3", MCColumnType.TEXT);
		p.columnRslt1_itm_typ = p.beansFactory.createTableColumn("Rslt1.itm_typ", MCColumnType.TEXT);
		p.columnRslt1_itm_typ_nm = p.beansFactory.createTableColumn("Rslt1.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt1.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt1_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt1.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt1_ins_usr_id = p.beansFactory.createTableColumn("Rslt1.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt1_ins_usr_nm = p.beansFactory.createTableColumn("Rslt1.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt1_ins_func_id = p.beansFactory.createTableColumn("Rslt1.ins_func_id", MCColumnType.TEXT);
		p.columnRslt1_ins_func_nm = p.beansFactory.createTableColumn("Rslt1.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt1_ins_ts = p.beansFactory.createTableColumn("Rslt1.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt1_upd_usr_id = p.beansFactory.createTableColumn("Rslt1.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt1_upd_usr_nm = p.beansFactory.createTableColumn("Rslt1.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt1_upd_func_id = p.beansFactory.createTableColumn("Rslt1.upd_func_id", MCColumnType.TEXT);
		p.columnRslt1_upd_func_nm = p.beansFactory.createTableColumn("Rslt1.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt1_upd_ts = p.beansFactory.createTableColumn("Rslt1.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt1_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt1.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Rslt2Panel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt2Panel(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Rslt2PanelPanel = p.beansFactory.createPanel("Rslt2Panel");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt2(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Rslt2Panel = p.beansFactory.createPanel("Rslt2");
		p.Rslt2TitledBorder = p.beansFactory.createTitledBorder();
		p.Rslt2ScrollPane = p.beansFactory.createScrollPane("Rslt2.scroll");
		p.createRslt2Table();
		// ブロックの項目の初期化
		p.columnRslt2_to_dmnd_no = p.beansFactory.createTableColumn("Rslt2.to_dmnd_no", MCColumnType.TEXT);
		p.columnRslt2_to_dmnd_dt = p.beansFactory.createTableColumn("Rslt2.to_dmnd_dt", MCColumnType.DATE);
		p.columnRslt2_to_dmnd_st_dt = p.beansFactory.createTableColumn("Rslt2.to_dmnd_st_dt", MCColumnType.DATE);
		p.columnRslt2_to_dmnd_end_dt = p.beansFactory.createTableColumn("Rslt2.to_dmnd_end_dt", MCColumnType.DATE);
		p.columnRslt2_to_dlv_schd_st_dt = p.beansFactory.createTableColumn("Rslt2.to_dlv_schd_st_dt", MCColumnType.DATE);
		p.columnRslt2_to_dlv_schd_end_dt = p.beansFactory.createTableColumn("Rslt2.to_dlv_schd_end_dt", MCColumnType.DATE);
		p.columnRslt2_to_dmnd_period_typ = p.beansFactory.createTableColumn("Rslt2.to_dmnd_period_typ", MCColumnType.TEXT);
		p.columnRslt2_to_dmnd_period_typ_nm = p.beansFactory.createTableColumn("Rslt2.to_dmnd_period_typ_nm", MCColumnType.TEXT);
		p.columnRslt2_to_dmnd_typ = p.beansFactory.createTableColumn("Rslt2.to_dmnd_typ", MCColumnType.TEXT);
		p.columnRslt2_to_dmnd_typ_nm = p.beansFactory.createTableColumn("Rslt2.to_dmnd_typ_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_dmnd_no = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_no", MCColumnType.TEXT);
		p.columnRslt2_fr_dmnd_dt = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_dt", MCColumnType.DATE);
		p.columnRslt2_fr_dmnd_st_dt = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_st_dt", MCColumnType.DATE);
		p.columnRslt2_fr_dmnd_end_dt = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_end_dt", MCColumnType.DATE);
		p.columnRslt2_fr_dlv_schd_st_dt = p.beansFactory.createTableColumn("Rslt2.fr_dlv_schd_st_dt", MCColumnType.DATE);
		p.columnRslt2_fr_dlv_schd_end_dt = p.beansFactory.createTableColumn("Rslt2.fr_dlv_schd_end_dt", MCColumnType.DATE);
		p.columnRslt2_fr_dmnd_period_typ = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_period_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt2_fr_dmnd_period_typ_nm = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_period_typ_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_dmnd_typ = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt2_fr_dmnd_typ_nm = p.beansFactory.createTableColumn("Rslt2.fr_dmnd_typ_nm", MCColumnType.TEXT);
		p.columnRslt2_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt2.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt2_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt2.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt2_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt2.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt2_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt2.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt2_base_unit_cd = p.beansFactory.createTableColumn("Rslt2.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt2_base_unit_nm = p.beansFactory.createTableColumn("Rslt2.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt2_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt2.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt2_dmnd_loc_cd = p.beansFactory.createTableColumn("Rslt2.dmnd_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_dmnd_loc_nm = p.beansFactory.createTableColumn("Rslt2.dmnd_loc_nm", MCColumnType.TEXT);
		p.columnRslt2_dmnd_loc_grp_cd = p.beansFactory.createTableColumn("Rslt2.dmnd_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt2_dmnd_loc_grp_nm = p.beansFactory.createTableColumn("Rslt2.dmnd_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt2_dmnd_lg_grp_cd = p.beansFactory.createTableColumn("Rslt2.dmnd_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt2_dmnd_lg_grp_nm = p.beansFactory.createTableColumn("Rslt2.dmnd_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt2_dmnd_wg_cd = p.beansFactory.createTableColumn("Rslt2.dmnd_wg_cd", MCColumnType.TEXT);
		p.columnRslt2_dmnd_wg_nm = p.beansFactory.createTableColumn("Rslt2.dmnd_wg_nm", MCColumnType.TEXT);
		p.columnRslt2_dmnd_site_cd = p.beansFactory.createTableColumn("Rslt2.dmnd_site_cd", MCColumnType.TEXT);
		p.columnRslt2_dmnd_site_nm = p.beansFactory.createTableColumn("Rslt2.dmnd_site_nm", MCColumnType.TEXT);
		p.columnRslt2_to_dlv_cd = p.beansFactory.createTableColumn("Rslt2.to_dlv_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_to_dlv_nm = p.beansFactory.createTableColumn("Rslt2.to_dlv_nm", MCColumnType.TEXT);
		p.columnRslt2_to_cst_cd = p.beansFactory.createTableColumn("Rslt2.to_cst_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_to_cst_nm = p.beansFactory.createTableColumn("Rslt2.to_cst_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_dlv_cd = p.beansFactory.createTableColumn("Rslt2.fr_dlv_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_fr_dlv_nm = p.beansFactory.createTableColumn("Rslt2.fr_dlv_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_cst_cd = p.beansFactory.createTableColumn("Rslt2.fr_cst_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_fr_cst_nm = p.beansFactory.createTableColumn("Rslt2.fr_cst_nm", MCColumnType.TEXT);
		p.columnRslt2_to_ym = p.beansFactory.createTableColumn("Rslt2.to_ym", MCColumnType.DATE);
		p.columnRslt2_to_spln_vers = p.beansFactory.createTableColumn("Rslt2.to_spln_vers", MCColumnType.TEXT);
		p.columnRslt2_to_spln_itm_cd = p.beansFactory.createTableColumn("Rslt2.to_spln_itm_cd", MCColumnType.TEXT);
		p.columnRslt2_to_spln_itm_nm = p.beansFactory.createTableColumn("Rslt2.to_spln_itm_nm", MCColumnType.TEXT);
		p.columnRslt2_to_cur_cd = p.beansFactory.createTableColumn("Rslt2.to_cur_cd", MCColumnType.TEXT);
		p.columnRslt2_to_cur_nm = p.beansFactory.createTableColumn("Rslt2.to_cur_nm", MCColumnType.TEXT);
		p.columnRslt2_to_cst_frcst_no = p.beansFactory.createTableColumn("Rslt2.to_cst_frcst_no", MCColumnType.TEXT);
		p.columnRslt2_to_cst_frcst_d_no = p.beansFactory.createTableColumn("Rslt2.to_cst_frcst_d_no", MCColumnType.TEXT);
		p.columnRslt2_to_slo_no = p.beansFactory.createTableColumn("Rslt2.to_slo_no", MCColumnType.TEXT);
		p.columnRslt2_to_slo_d_no = p.beansFactory.createTableColumn("Rslt2.to_slo_d_no", MCColumnType.TEXT);
		p.columnRslt2_fr_ym = p.beansFactory.createTableColumn("Rslt2.fr_ym", MCColumnType.DATE);
		p.columnRslt2_fr_spln_vers = p.beansFactory.createTableColumn("Rslt2.fr_spln_vers", MCColumnType.TEXT);
		p.columnRslt2_fr_spln_itm_cd = p.beansFactory.createTableColumn("Rslt2.fr_spln_itm_cd", MCColumnType.TEXT);
		p.columnRslt2_fr_spln_itm_nm = p.beansFactory.createTableColumn("Rslt2.fr_spln_itm_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_cur_cd = p.beansFactory.createTableColumn("Rslt2.fr_cur_cd", MCColumnType.TEXT);
		p.columnRslt2_fr_cur_nm = p.beansFactory.createTableColumn("Rslt2.fr_cur_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_cst_frcst_no = p.beansFactory.createTableColumn("Rslt2.fr_cst_frcst_no", MCColumnType.TEXT);
		p.columnRslt2_fr_cst_frcst_d_no = p.beansFactory.createTableColumn("Rslt2.fr_cst_frcst_d_no", MCColumnType.TEXT);
		p.columnRslt2_fr_slo_no = p.beansFactory.createTableColumn("Rslt2.fr_slo_no", MCColumnType.TEXT);
		p.columnRslt2_fr_slo_d_no = p.beansFactory.createTableColumn("Rslt2.fr_slo_d_no", MCColumnType.TEXT);
		p.columnRslt2_to_intr_rmrks = p.beansFactory.createTableColumn("Rslt2.to_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt2_to_sub_char1 = p.beansFactory.createTableColumn("Rslt2.to_sub_char1", MCColumnType.TEXT);
		p.columnRslt2_to_sub_char2 = p.beansFactory.createTableColumn("Rslt2.to_sub_char2", MCColumnType.TEXT);
		p.columnRslt2_to_sub_char3 = p.beansFactory.createTableColumn("Rslt2.to_sub_char3", MCColumnType.TEXT);
		p.columnRslt2_fr_intr_rmrks = p.beansFactory.createTableColumn("Rslt2.fr_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt2_fr_sub_char1 = p.beansFactory.createTableColumn("Rslt2.fr_sub_char1", MCColumnType.TEXT);
		p.columnRslt2_fr_sub_char2 = p.beansFactory.createTableColumn("Rslt2.fr_sub_char2", MCColumnType.TEXT);
		p.columnRslt2_fr_sub_char3 = p.beansFactory.createTableColumn("Rslt2.fr_sub_char3", MCColumnType.TEXT);
		p.columnRslt2_itm_typ = p.beansFactory.createTableColumn("Rslt2.itm_typ", MCColumnType.TEXT);
		p.columnRslt2_itm_typ_nm = p.beansFactory.createTableColumn("Rslt2.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt2_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt2.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt2_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt2.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt2_to_ins_usr_id = p.beansFactory.createTableColumn("Rslt2.to_ins_usr_id", MCColumnType.TEXT);
		p.columnRslt2_to_ins_usr_nm = p.beansFactory.createTableColumn("Rslt2.to_ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt2_to_ins_func_id = p.beansFactory.createTableColumn("Rslt2.to_ins_func_id", MCColumnType.TEXT);
		p.columnRslt2_to_ins_func_nm = p.beansFactory.createTableColumn("Rslt2.to_ins_func_nm", MCColumnType.TEXT);
		p.columnRslt2_to_ins_ts = p.beansFactory.createTableColumn("Rslt2.to_ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt2_to_upd_usr_id = p.beansFactory.createTableColumn("Rslt2.to_upd_usr_id", MCColumnType.TEXT);
		p.columnRslt2_to_upd_usr_nm = p.beansFactory.createTableColumn("Rslt2.to_upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt2_to_upd_func_id = p.beansFactory.createTableColumn("Rslt2.to_upd_func_id", MCColumnType.TEXT);
		p.columnRslt2_to_upd_func_nm = p.beansFactory.createTableColumn("Rslt2.to_upd_func_nm", MCColumnType.TEXT);
		p.columnRslt2_to_upd_ts = p.beansFactory.createTableColumn("Rslt2.to_upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt2_to_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt2.to_upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt2_fr_ins_usr_id = p.beansFactory.createTableColumn("Rslt2.fr_ins_usr_id", MCColumnType.TEXT);
		p.columnRslt2_fr_ins_usr_nm = p.beansFactory.createTableColumn("Rslt2.fr_ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_ins_func_id = p.beansFactory.createTableColumn("Rslt2.fr_ins_func_id", MCColumnType.TEXT);
		p.columnRslt2_fr_ins_func_nm = p.beansFactory.createTableColumn("Rslt2.fr_ins_func_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_ins_ts = p.beansFactory.createTableColumn("Rslt2.fr_ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt2_fr_upd_usr_id = p.beansFactory.createTableColumn("Rslt2.fr_upd_usr_id", MCColumnType.TEXT);
		p.columnRslt2_fr_upd_usr_nm = p.beansFactory.createTableColumn("Rslt2.fr_upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_upd_func_id = p.beansFactory.createTableColumn("Rslt2.fr_upd_func_id", MCColumnType.TEXT);
		p.columnRslt2_fr_upd_func_nm = p.beansFactory.createTableColumn("Rslt2.fr_upd_func_nm", MCColumnType.TEXT);
		p.columnRslt2_fr_upd_ts = p.beansFactory.createTableColumn("Rslt2.fr_upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt2_fr_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt2.fr_upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_DTL = p.beansFactory.createButton("Btn.open_DTL", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBAP_DmndRecStsSrch p) {
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
	protected static void jbInitTop(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.Rslt1PanelPanel);
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
	protected static void jbInitFold(MSBAP_DmndRecStsSrch p) {
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
	protected static void jbInitTab1(MSBAP_DmndRecStsSrch p) {
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
	protected static void jbInitTab2(MSBAP_DmndRecStsSrch p) {
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
	protected static void jbInitTab3(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.Cnd4Panel, null);
		p.Tab4Panel.setLastBeans(p.Cnd4Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF1);
		p.Cnd_ope_REF1.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF1);
		p.ScreenOpePanel.add(p.Cnd_ope_REF1);
		p.Cnd_ope_REF1.setNextBeans(p.Cnd_ope_REF2);
		p.Cnd_ope_REF2.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF2);
		p.ScreenOpePanel.add(p.Cnd_ope_REF2);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_dmnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dmnd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dmnd_dt_fr);
		p.Cnd_dmnd_dt_fr.setNextBeans(p.Cnd_dmnd_dt_to);
		p.Cnd_dmnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_dt_fr_META);
		p.Cnd_dmnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dmnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dmnd_dt_to);
		p.Cnd_dmnd_dt_to.setNextBeans(p.Cnd_dmnd_period_typ);
		p.Cnd_dmnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_dt_to_META);
		p.Cnd_dmnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_dmnd_period_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dmnd_period_typ, true);
		p.Cnd_dmnd_period_typ.setLinkBeans(p.Cnd_dmnd_period_typ_nm);
		p.CndPanel.add(p.Cnd_dmnd_period_typ_Label);
		p.CndPanel.add(p.Cnd_dmnd_period_typ);
		p.Cnd_dmnd_period_typ.setNextBeans(p.Cnd_dmnd_period_typ_nm);
		p.Cnd_dmnd_period_typ.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_period_typ_META);
		p.CndPanel.add(p.Cnd_dmnd_period_typ_nm);
		p.Cnd_dmnd_period_typ_nm.setNextBeans(p.Cnd_dmnd_typ);
		p.Cnd_dmnd_period_typ_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_period_typ_nm_META);
		p.Cnd_dmnd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dmnd_typ, true);
		p.Cnd_dmnd_typ.setLinkBeans(p.Cnd_dmnd_typ_nm);
		p.CndPanel.add(p.Cnd_dmnd_typ_Label);
		p.CndPanel.add(p.Cnd_dmnd_typ);
		p.Cnd_dmnd_typ.setNextBeans(p.Cnd_dmnd_typ_nm);
		p.Cnd_dmnd_typ.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_typ_META);
		p.CndPanel.add(p.Cnd_dmnd_typ_nm);
		p.Cnd_dmnd_typ_nm.setNextBeans(p.Cnd_dmnd_loc_cd);
		p.Cnd_dmnd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_typ_nm_META);
		p.CndPanel.add(p.Cnd_dmnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_dmnd_loc_cd);
		p.Cnd_dmnd_loc_cd.setNextBeans(p.Cnd_dmnd_loc_nm);
		p.Cnd_dmnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_loc_cd_META);
		p.Cnd_dmnd_loc_cd.addLinkBeans(p.Cnd_dmnd_loc_nm);
		p.Cnd_dmnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dmnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_dmnd_loc_nm);
		p.Cnd_dmnd_loc_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_dmnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_dmnd_loc_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.Cnd_cst_cd.setLinkBeans(p.Cnd_cst_nm);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.cst_cd_META);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.Cnd_dlv_cd.setLinkBeans(p.Cnd_dlv_nm);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dlv_cd_META);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
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
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_usr_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_usr_cd_Label);
		p.CndPanel.add(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_ym);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_spln_vers);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_spln_vers.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_spln_vers_Label);
		p.CndPanel.add(p.Cnd_spln_vers);
		p.Cnd_spln_vers.setNextBeans(p.Cnd_spln_itm_cd);
		p.Cnd_spln_vers.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.spln_vers_META);
		p.CndPanel.add(p.Cnd_spln_itm_cd_Label);
		p.CndPanel.add(p.Cnd_spln_itm_cd);
		p.Cnd_spln_itm_cd.setNextBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.spln_itm_cd_META);
		p.Cnd_spln_itm_cd.addLinkBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_spln_itm_cd, true);
		p.CndPanel.add(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_nm.setNextBeans(p.Cnd_dmnd_no);
		p.Cnd_spln_itm_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.spln_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_spln_itm_nm, true);
		p.CndPanel.add(p.Cnd_dmnd_no_Label);
		p.CndPanel.add(p.Cnd_dmnd_no);
		p.Cnd_dmnd_no.setNextBeans(p.Cnd_cst_frcst_no);
		p.Cnd_dmnd_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.dmnd_no_META);
		p.setPluralValueEnable(p.Cnd_dmnd_no, true);
		p.CndPanel.add(p.Cnd_cst_frcst_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_no);
		p.Cnd_cst_frcst_no.setNextBeans(p.Cnd_cst_frcst_d_no);
		p.Cnd_cst_frcst_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.cst_frcst_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_no, true);
		p.CndPanel.add(p.Cnd_cst_frcst_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_d_no);
		p.Cnd_cst_frcst_d_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_cst_frcst_d_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.cst_frcst_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_d_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0040.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.Cnd3Panel.add(p.Cnd_cst_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_p_PPanel);
		p.Cnd4Panel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBAP_DmndRecStsSrch p) {
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
	protected static void jbInitRPnl(MSBAP_DmndRecStsSrch p) {
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
	 * [Rslt1Panel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt1Panel(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.add(p.Rslt1PanelPanel);
		p.Rslt1PanelPanel.setNextBeans(p.Rslt2PanelPanel);
		p.Rslt1PanelPanel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.Rslt1PanelPanel.add(p.Rslt1Panel, null);
		p.Rslt1PanelPanel.setLastBeans(p.Rslt1Panel);
	}

	/**
	 * [Rslt1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt1(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Rslt1Panel.setBorder(p.Rslt1TitledBorder);
		p.Rslt1Panel.add(p.Rslt1ScrollPane);
		p.Rslt1Panel.setLastBeans(p.Rslt1Table);
		p.Rslt1ScrollPane.setViewportView(p.Rslt1Table);
		p.Rslt1Table.setList(p.getRslt1L());
		p.Rslt1Table.setStatusColumnVisible(false);
		p.Rslt1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt2Panel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt2Panel(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.add(p.Rslt2PanelPanel);
		p.Rslt2PanelPanel.setNextBeans(p.BtnPanel);
		p.Rslt2PanelPanel.setLayoutPosition("CBCBCTC+");
		// ブロックの項目の初期化
		p.Rslt2PanelPanel.add(p.Rslt2Panel, null);
		p.Rslt2PanelPanel.setLastBeans(p.Rslt2Panel);
	}

	/**
	 * [Rslt2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt2(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.Rslt2Panel.setBorder(p.Rslt2TitledBorder);
		p.Rslt2Panel.add(p.Rslt2ScrollPane);
		p.Rslt2Panel.setLastBeans(p.Rslt2Table);
		p.Rslt2ScrollPane.setViewportView(p.Rslt2Table);
		p.Rslt2Table.setList(p.getRslt2L());
		p.Rslt2Table.setStatusColumnVisible(false);
		p.Rslt2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBAP_DmndRecStsSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_DTL.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_open_DTL);
		p.BtnPanel.setLastBeans(p.Btn_open_DTL);
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
		MSBAP_DmndRecStsSrch_MC.mcInitScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitTop((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitFold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitTab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitTab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitTab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitTab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitCnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitCnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitCnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitCnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitCtrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitRPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitRslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitRslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitRslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitRslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.mcInitBtn((MSBAP_DmndRecStsSrch)this);

		// [SRCH_REF1]ステータスのモードの設定
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_ScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Top((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Fold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Tab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Tab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Tab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Tab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Cnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Cnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Cnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Cnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Ctrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_RPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Rslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Rslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Rslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Rslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF1_Btn((MSBAP_DmndRecStsSrch)this);

		// [REF1]ステータスのモードの設定
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_ScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Top((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Fold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Tab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Tab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Tab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Tab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Cnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Cnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Cnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Cnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Ctrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_RPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Rslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Rslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Rslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Rslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF1_Btn((MSBAP_DmndRecStsSrch)this);

		// [SRCH_REF2]ステータスのモードの設定
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_ScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Top((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Fold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Tab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Tab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Tab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Tab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Cnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Cnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Cnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Cnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Ctrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_RPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Rslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Rslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Rslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Rslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitSRCH__REF2_Btn((MSBAP_DmndRecStsSrch)this);

		// [REF2]ステータスのモードの設定
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_ScreenOpe((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Top((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Fold((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Tab1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Tab2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Tab3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Tab4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Cnd((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Cnd2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Cnd3((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Cnd4((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Ctrl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_RPnl((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Rslt1Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Rslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Rslt2Panel((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Rslt2((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.statusInitREF2_Btn((MSBAP_DmndRecStsSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBAP_DmndRecStsSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBAP_DmndRecStsSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF1.addAllListener(p);
		p.Cnd_ope_REF2.addAllListener(p);
		p.Cnd_dmnd_dt_fr.setListListener(p);
		p.Cnd_dmnd_dt_fr.addAllListener(p);
		p.Cnd_dmnd_dt_to.setListListener(p);
		p.Cnd_dmnd_dt_to.addAllListener(p);
		p.Cnd_dmnd_period_typ.setListListener(p);
		p.Cnd_dmnd_period_typ.addAllListener(p);
		p.Cnd_dmnd_period_typ_nm.setListListener(p);
		p.Cnd_dmnd_period_typ_nm.addAllListener(p);
		p.Cnd_dmnd_typ.setListListener(p);
		p.Cnd_dmnd_typ.addAllListener(p);
		p.Cnd_dmnd_typ_nm.setListListener(p);
		p.Cnd_dmnd_typ_nm.addAllListener(p);
		p.Cnd_dmnd_loc_cd.setListListener(p);
		p.Cnd_dmnd_loc_cd.addAllListener(p);
		p.Cnd_dmnd_loc_nm.setListListener(p);
		p.Cnd_dmnd_loc_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_spln_vers.setListListener(p);
		p.Cnd_spln_vers.addAllListener(p);
		p.Cnd_spln_itm_cd.setListListener(p);
		p.Cnd_spln_itm_cd.addAllListener(p);
		p.Cnd_spln_itm_nm.setListListener(p);
		p.Cnd_spln_itm_nm.addAllListener(p);
		p.Cnd_dmnd_no.setListListener(p);
		p.Cnd_dmnd_no.addAllListener(p);
		p.Cnd_cst_frcst_no.setListListener(p);
		p.Cnd_cst_frcst_no.addAllListener(p);
		p.Cnd_cst_frcst_d_no.setListListener(p);
		p.Cnd_cst_frcst_d_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
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
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBAP_DmndRecStsSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBAP_DmndRecStsSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt1Panel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt1Panel(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Rslt1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt1(MSBAP_DmndRecStsSrch p) {
		p.Rslt1Table.addAllListener(p);
		p.columnRslt1_dmnd_no.addAllListener(p);
		p.columnRslt1_dmnd_no.setListListener(p);
		p.columnRslt1_dmnd_dt.addAllListener(p);
		p.columnRslt1_dmnd_dt.setListListener(p);
		p.columnRslt1_dmnd_st_dt.addAllListener(p);
		p.columnRslt1_dmnd_st_dt.setListListener(p);
		p.columnRslt1_dmnd_end_dt.addAllListener(p);
		p.columnRslt1_dmnd_end_dt.setListListener(p);
		p.columnRslt1_dlv_schd_st_dt.addAllListener(p);
		p.columnRslt1_dlv_schd_st_dt.setListListener(p);
		p.columnRslt1_dlv_schd_end_dt.addAllListener(p);
		p.columnRslt1_dlv_schd_end_dt.setListListener(p);
		p.columnRslt1_dmnd_period_typ.addAllListener(p);
		p.columnRslt1_dmnd_period_typ.setListListener(p);
		p.columnRslt1_dmnd_period_typ_nm.addAllListener(p);
		p.columnRslt1_dmnd_period_typ_nm.setListListener(p);
		p.columnRslt1_dmnd_typ.addAllListener(p);
		p.columnRslt1_dmnd_typ.setListListener(p);
		p.columnRslt1_dmnd_typ_nm.addAllListener(p);
		p.columnRslt1_dmnd_typ_nm.setListListener(p);
		p.columnRslt1_sno1_mng_typ.addAllListener(p);
		p.columnRslt1_sno1_mng_typ.setListListener(p);
		p.columnRslt1_sno2_mng_typ.addAllListener(p);
		p.columnRslt1_sno2_mng_typ.setListListener(p);
		p.columnRslt1_sno3_mng_typ.addAllListener(p);
		p.columnRslt1_sno3_mng_typ.setListListener(p);
		p.columnRslt1_sno4_mng_typ.addAllListener(p);
		p.columnRslt1_sno4_mng_typ.setListListener(p);
		p.columnRslt1_base_unit_cd.addAllListener(p);
		p.columnRslt1_base_unit_cd.setListListener(p);
		p.columnRslt1_base_unit_nm.addAllListener(p);
		p.columnRslt1_base_unit_nm.setListListener(p);
		p.columnRslt1_base_unit_dec_place.addAllListener(p);
		p.columnRslt1_base_unit_dec_place.setListListener(p);
		p.columnRslt1_dmnd_loc_cd.addAllListener(p);
		p.columnRslt1_dmnd_loc_cd.setListListener(p);
		p.columnRslt1_dmnd_loc_nm.addAllListener(p);
		p.columnRslt1_dmnd_loc_nm.setListListener(p);
		p.columnRslt1_dmnd_loc_grp_cd.addAllListener(p);
		p.columnRslt1_dmnd_loc_grp_cd.setListListener(p);
		p.columnRslt1_dmnd_loc_grp_nm.addAllListener(p);
		p.columnRslt1_dmnd_loc_grp_nm.setListListener(p);
		p.columnRslt1_dmnd_lg_grp_cd.addAllListener(p);
		p.columnRslt1_dmnd_lg_grp_cd.setListListener(p);
		p.columnRslt1_dmnd_lg_grp_nm.addAllListener(p);
		p.columnRslt1_dmnd_lg_grp_nm.setListListener(p);
		p.columnRslt1_dmnd_wg_cd.addAllListener(p);
		p.columnRslt1_dmnd_wg_cd.setListListener(p);
		p.columnRslt1_dmnd_wg_nm.addAllListener(p);
		p.columnRslt1_dmnd_wg_nm.setListListener(p);
		p.columnRslt1_dmnd_site_cd.addAllListener(p);
		p.columnRslt1_dmnd_site_cd.setListListener(p);
		p.columnRslt1_dmnd_site_nm.addAllListener(p);
		p.columnRslt1_dmnd_site_nm.setListListener(p);
		p.columnRslt1_dlv_cd.addAllListener(p);
		p.columnRslt1_dlv_cd.setListListener(p);
		p.columnRslt1_dlv_nm.addAllListener(p);
		p.columnRslt1_dlv_nm.setListListener(p);
		p.columnRslt1_cst_cd.addAllListener(p);
		p.columnRslt1_cst_cd.setListListener(p);
		p.columnRslt1_cst_nm.addAllListener(p);
		p.columnRslt1_cst_nm.setListListener(p);
		p.columnRslt1_ym.addAllListener(p);
		p.columnRslt1_ym.setListListener(p);
		p.columnRslt1_spln_vers.addAllListener(p);
		p.columnRslt1_spln_vers.setListListener(p);
		p.columnRslt1_spln_itm_cd.addAllListener(p);
		p.columnRslt1_spln_itm_cd.setListListener(p);
		p.columnRslt1_spln_itm_nm.addAllListener(p);
		p.columnRslt1_spln_itm_nm.setListListener(p);
		p.columnRslt1_cur_cd.addAllListener(p);
		p.columnRslt1_cur_cd.setListListener(p);
		p.columnRslt1_cur_nm.addAllListener(p);
		p.columnRslt1_cur_nm.setListListener(p);
		p.columnRslt1_cst_frcst_no.addAllListener(p);
		p.columnRslt1_cst_frcst_no.setListListener(p);
		p.columnRslt1_cst_frcst_d_no.addAllListener(p);
		p.columnRslt1_cst_frcst_d_no.setListListener(p);
		p.columnRslt1_slo_no.addAllListener(p);
		p.columnRslt1_slo_no.setListListener(p);
		p.columnRslt1_slo_d_no.addAllListener(p);
		p.columnRslt1_slo_d_no.setListListener(p);
		p.columnRslt1_intr_rmrks.addAllListener(p);
		p.columnRslt1_intr_rmrks.setListListener(p);
		p.columnRslt1_sub_char1.addAllListener(p);
		p.columnRslt1_sub_char1.setListListener(p);
		p.columnRslt1_sub_char2.addAllListener(p);
		p.columnRslt1_sub_char2.setListListener(p);
		p.columnRslt1_sub_char3.addAllListener(p);
		p.columnRslt1_sub_char3.setListListener(p);
		p.columnRslt1_itm_typ.addAllListener(p);
		p.columnRslt1_itm_typ.setListListener(p);
		p.columnRslt1_itm_typ_nm.addAllListener(p);
		p.columnRslt1_itm_typ_nm.setListListener(p);
		p.columnRslt1_itm_typ_d_cd.addAllListener(p);
		p.columnRslt1_itm_typ_d_cd.setListListener(p);
		p.columnRslt1_itm_typ_d_nm.addAllListener(p);
		p.columnRslt1_itm_typ_d_nm.setListListener(p);
		p.columnRslt1_ins_usr_id.addAllListener(p);
		p.columnRslt1_ins_usr_id.setListListener(p);
		p.columnRslt1_ins_usr_nm.addAllListener(p);
		p.columnRslt1_ins_usr_nm.setListListener(p);
		p.columnRslt1_ins_func_id.addAllListener(p);
		p.columnRslt1_ins_func_id.setListListener(p);
		p.columnRslt1_ins_func_nm.addAllListener(p);
		p.columnRslt1_ins_func_nm.setListListener(p);
		p.columnRslt1_ins_ts.addAllListener(p);
		p.columnRslt1_ins_ts.setListListener(p);
		p.columnRslt1_upd_usr_id.addAllListener(p);
		p.columnRslt1_upd_usr_id.setListListener(p);
		p.columnRslt1_upd_usr_nm.addAllListener(p);
		p.columnRslt1_upd_usr_nm.setListListener(p);
		p.columnRslt1_upd_func_id.addAllListener(p);
		p.columnRslt1_upd_func_id.setListListener(p);
		p.columnRslt1_upd_func_nm.addAllListener(p);
		p.columnRslt1_upd_func_nm.setListListener(p);
		p.columnRslt1_upd_ts.addAllListener(p);
		p.columnRslt1_upd_ts.setListListener(p);
		p.columnRslt1_upd_srv_req_no.addAllListener(p);
		p.columnRslt1_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Rslt2Panel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt2Panel(MSBAP_DmndRecStsSrch p) {
	}

	/**
	 *  [Rslt2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt2(MSBAP_DmndRecStsSrch p) {
		p.Rslt2Table.addAllListener(p);
		p.columnRslt2_to_dmnd_no.addAllListener(p);
		p.columnRslt2_to_dmnd_no.setListListener(p);
		p.columnRslt2_to_dmnd_dt.addAllListener(p);
		p.columnRslt2_to_dmnd_dt.setListListener(p);
		p.columnRslt2_to_dmnd_st_dt.addAllListener(p);
		p.columnRslt2_to_dmnd_st_dt.setListListener(p);
		p.columnRslt2_to_dmnd_end_dt.addAllListener(p);
		p.columnRslt2_to_dmnd_end_dt.setListListener(p);
		p.columnRslt2_to_dlv_schd_st_dt.addAllListener(p);
		p.columnRslt2_to_dlv_schd_st_dt.setListListener(p);
		p.columnRslt2_to_dlv_schd_end_dt.addAllListener(p);
		p.columnRslt2_to_dlv_schd_end_dt.setListListener(p);
		p.columnRslt2_to_dmnd_period_typ.addAllListener(p);
		p.columnRslt2_to_dmnd_period_typ.setListListener(p);
		p.columnRslt2_to_dmnd_period_typ_nm.addAllListener(p);
		p.columnRslt2_to_dmnd_period_typ_nm.setListListener(p);
		p.columnRslt2_to_dmnd_typ.addAllListener(p);
		p.columnRslt2_to_dmnd_typ.setListListener(p);
		p.columnRslt2_to_dmnd_typ_nm.addAllListener(p);
		p.columnRslt2_to_dmnd_typ_nm.setListListener(p);
		p.columnRslt2_fr_dmnd_no.addAllListener(p);
		p.columnRslt2_fr_dmnd_no.setListListener(p);
		p.columnRslt2_fr_dmnd_dt.addAllListener(p);
		p.columnRslt2_fr_dmnd_dt.setListListener(p);
		p.columnRslt2_fr_dmnd_st_dt.addAllListener(p);
		p.columnRslt2_fr_dmnd_st_dt.setListListener(p);
		p.columnRslt2_fr_dmnd_end_dt.addAllListener(p);
		p.columnRslt2_fr_dmnd_end_dt.setListListener(p);
		p.columnRslt2_fr_dlv_schd_st_dt.addAllListener(p);
		p.columnRslt2_fr_dlv_schd_st_dt.setListListener(p);
		p.columnRslt2_fr_dlv_schd_end_dt.addAllListener(p);
		p.columnRslt2_fr_dlv_schd_end_dt.setListListener(p);
		p.columnRslt2_fr_dmnd_period_typ.addAllListener(p);
		p.columnRslt2_fr_dmnd_period_typ.setListListener(p);
		p.columnRslt2_fr_dmnd_period_typ_nm.addAllListener(p);
		p.columnRslt2_fr_dmnd_period_typ_nm.setListListener(p);
		p.columnRslt2_fr_dmnd_typ.addAllListener(p);
		p.columnRslt2_fr_dmnd_typ.setListListener(p);
		p.columnRslt2_fr_dmnd_typ_nm.addAllListener(p);
		p.columnRslt2_fr_dmnd_typ_nm.setListListener(p);
		p.columnRslt2_sno1_mng_typ.addAllListener(p);
		p.columnRslt2_sno1_mng_typ.setListListener(p);
		p.columnRslt2_sno2_mng_typ.addAllListener(p);
		p.columnRslt2_sno2_mng_typ.setListListener(p);
		p.columnRslt2_sno3_mng_typ.addAllListener(p);
		p.columnRslt2_sno3_mng_typ.setListListener(p);
		p.columnRslt2_sno4_mng_typ.addAllListener(p);
		p.columnRslt2_sno4_mng_typ.setListListener(p);
		p.columnRslt2_base_unit_cd.addAllListener(p);
		p.columnRslt2_base_unit_cd.setListListener(p);
		p.columnRslt2_base_unit_nm.addAllListener(p);
		p.columnRslt2_base_unit_nm.setListListener(p);
		p.columnRslt2_base_unit_dec_place.addAllListener(p);
		p.columnRslt2_base_unit_dec_place.setListListener(p);
		p.columnRslt2_dmnd_loc_cd.addAllListener(p);
		p.columnRslt2_dmnd_loc_cd.setListListener(p);
		p.columnRslt2_dmnd_loc_nm.addAllListener(p);
		p.columnRslt2_dmnd_loc_nm.setListListener(p);
		p.columnRslt2_dmnd_loc_grp_cd.addAllListener(p);
		p.columnRslt2_dmnd_loc_grp_cd.setListListener(p);
		p.columnRslt2_dmnd_loc_grp_nm.addAllListener(p);
		p.columnRslt2_dmnd_loc_grp_nm.setListListener(p);
		p.columnRslt2_dmnd_lg_grp_cd.addAllListener(p);
		p.columnRslt2_dmnd_lg_grp_cd.setListListener(p);
		p.columnRslt2_dmnd_lg_grp_nm.addAllListener(p);
		p.columnRslt2_dmnd_lg_grp_nm.setListListener(p);
		p.columnRslt2_dmnd_wg_cd.addAllListener(p);
		p.columnRslt2_dmnd_wg_cd.setListListener(p);
		p.columnRslt2_dmnd_wg_nm.addAllListener(p);
		p.columnRslt2_dmnd_wg_nm.setListListener(p);
		p.columnRslt2_dmnd_site_cd.addAllListener(p);
		p.columnRslt2_dmnd_site_cd.setListListener(p);
		p.columnRslt2_dmnd_site_nm.addAllListener(p);
		p.columnRslt2_dmnd_site_nm.setListListener(p);
		p.columnRslt2_to_dlv_cd.addAllListener(p);
		p.columnRslt2_to_dlv_cd.setListListener(p);
		p.columnRslt2_to_dlv_nm.addAllListener(p);
		p.columnRslt2_to_dlv_nm.setListListener(p);
		p.columnRslt2_to_cst_cd.addAllListener(p);
		p.columnRslt2_to_cst_cd.setListListener(p);
		p.columnRslt2_to_cst_nm.addAllListener(p);
		p.columnRslt2_to_cst_nm.setListListener(p);
		p.columnRslt2_fr_dlv_cd.addAllListener(p);
		p.columnRslt2_fr_dlv_cd.setListListener(p);
		p.columnRslt2_fr_dlv_nm.addAllListener(p);
		p.columnRslt2_fr_dlv_nm.setListListener(p);
		p.columnRslt2_fr_cst_cd.addAllListener(p);
		p.columnRslt2_fr_cst_cd.setListListener(p);
		p.columnRslt2_fr_cst_nm.addAllListener(p);
		p.columnRslt2_fr_cst_nm.setListListener(p);
		p.columnRslt2_to_ym.addAllListener(p);
		p.columnRslt2_to_ym.setListListener(p);
		p.columnRslt2_to_spln_vers.addAllListener(p);
		p.columnRslt2_to_spln_vers.setListListener(p);
		p.columnRslt2_to_spln_itm_cd.addAllListener(p);
		p.columnRslt2_to_spln_itm_cd.setListListener(p);
		p.columnRslt2_to_spln_itm_nm.addAllListener(p);
		p.columnRslt2_to_spln_itm_nm.setListListener(p);
		p.columnRslt2_to_cur_cd.addAllListener(p);
		p.columnRslt2_to_cur_cd.setListListener(p);
		p.columnRslt2_to_cur_nm.addAllListener(p);
		p.columnRslt2_to_cur_nm.setListListener(p);
		p.columnRslt2_to_cst_frcst_no.addAllListener(p);
		p.columnRslt2_to_cst_frcst_no.setListListener(p);
		p.columnRslt2_to_cst_frcst_d_no.addAllListener(p);
		p.columnRslt2_to_cst_frcst_d_no.setListListener(p);
		p.columnRslt2_to_slo_no.addAllListener(p);
		p.columnRslt2_to_slo_no.setListListener(p);
		p.columnRslt2_to_slo_d_no.addAllListener(p);
		p.columnRslt2_to_slo_d_no.setListListener(p);
		p.columnRslt2_fr_ym.addAllListener(p);
		p.columnRslt2_fr_ym.setListListener(p);
		p.columnRslt2_fr_spln_vers.addAllListener(p);
		p.columnRslt2_fr_spln_vers.setListListener(p);
		p.columnRslt2_fr_spln_itm_cd.addAllListener(p);
		p.columnRslt2_fr_spln_itm_cd.setListListener(p);
		p.columnRslt2_fr_spln_itm_nm.addAllListener(p);
		p.columnRslt2_fr_spln_itm_nm.setListListener(p);
		p.columnRslt2_fr_cur_cd.addAllListener(p);
		p.columnRslt2_fr_cur_cd.setListListener(p);
		p.columnRslt2_fr_cur_nm.addAllListener(p);
		p.columnRslt2_fr_cur_nm.setListListener(p);
		p.columnRslt2_fr_cst_frcst_no.addAllListener(p);
		p.columnRslt2_fr_cst_frcst_no.setListListener(p);
		p.columnRslt2_fr_cst_frcst_d_no.addAllListener(p);
		p.columnRslt2_fr_cst_frcst_d_no.setListListener(p);
		p.columnRslt2_fr_slo_no.addAllListener(p);
		p.columnRslt2_fr_slo_no.setListListener(p);
		p.columnRslt2_fr_slo_d_no.addAllListener(p);
		p.columnRslt2_fr_slo_d_no.setListListener(p);
		p.columnRslt2_to_intr_rmrks.addAllListener(p);
		p.columnRslt2_to_intr_rmrks.setListListener(p);
		p.columnRslt2_to_sub_char1.addAllListener(p);
		p.columnRslt2_to_sub_char1.setListListener(p);
		p.columnRslt2_to_sub_char2.addAllListener(p);
		p.columnRslt2_to_sub_char2.setListListener(p);
		p.columnRslt2_to_sub_char3.addAllListener(p);
		p.columnRslt2_to_sub_char3.setListListener(p);
		p.columnRslt2_fr_intr_rmrks.addAllListener(p);
		p.columnRslt2_fr_intr_rmrks.setListListener(p);
		p.columnRslt2_fr_sub_char1.addAllListener(p);
		p.columnRslt2_fr_sub_char1.setListListener(p);
		p.columnRslt2_fr_sub_char2.addAllListener(p);
		p.columnRslt2_fr_sub_char2.setListListener(p);
		p.columnRslt2_fr_sub_char3.addAllListener(p);
		p.columnRslt2_fr_sub_char3.setListListener(p);
		p.columnRslt2_itm_typ.addAllListener(p);
		p.columnRslt2_itm_typ.setListListener(p);
		p.columnRslt2_itm_typ_nm.addAllListener(p);
		p.columnRslt2_itm_typ_nm.setListListener(p);
		p.columnRslt2_itm_typ_d_cd.addAllListener(p);
		p.columnRslt2_itm_typ_d_cd.setListListener(p);
		p.columnRslt2_itm_typ_d_nm.addAllListener(p);
		p.columnRslt2_itm_typ_d_nm.setListListener(p);
		p.columnRslt2_to_ins_usr_id.addAllListener(p);
		p.columnRslt2_to_ins_usr_id.setListListener(p);
		p.columnRslt2_to_ins_usr_nm.addAllListener(p);
		p.columnRslt2_to_ins_usr_nm.setListListener(p);
		p.columnRslt2_to_ins_func_id.addAllListener(p);
		p.columnRslt2_to_ins_func_id.setListListener(p);
		p.columnRslt2_to_ins_func_nm.addAllListener(p);
		p.columnRslt2_to_ins_func_nm.setListListener(p);
		p.columnRslt2_to_ins_ts.addAllListener(p);
		p.columnRslt2_to_ins_ts.setListListener(p);
		p.columnRslt2_to_upd_usr_id.addAllListener(p);
		p.columnRslt2_to_upd_usr_id.setListListener(p);
		p.columnRslt2_to_upd_usr_nm.addAllListener(p);
		p.columnRslt2_to_upd_usr_nm.setListListener(p);
		p.columnRslt2_to_upd_func_id.addAllListener(p);
		p.columnRslt2_to_upd_func_id.setListListener(p);
		p.columnRslt2_to_upd_func_nm.addAllListener(p);
		p.columnRslt2_to_upd_func_nm.setListListener(p);
		p.columnRslt2_to_upd_ts.addAllListener(p);
		p.columnRslt2_to_upd_ts.setListListener(p);
		p.columnRslt2_to_upd_srv_req_no.addAllListener(p);
		p.columnRslt2_to_upd_srv_req_no.setListListener(p);
		p.columnRslt2_fr_ins_usr_id.addAllListener(p);
		p.columnRslt2_fr_ins_usr_id.setListListener(p);
		p.columnRslt2_fr_ins_usr_nm.addAllListener(p);
		p.columnRslt2_fr_ins_usr_nm.setListListener(p);
		p.columnRslt2_fr_ins_func_id.addAllListener(p);
		p.columnRslt2_fr_ins_func_id.setListListener(p);
		p.columnRslt2_fr_ins_func_nm.addAllListener(p);
		p.columnRslt2_fr_ins_func_nm.setListListener(p);
		p.columnRslt2_fr_ins_ts.addAllListener(p);
		p.columnRslt2_fr_ins_ts.setListListener(p);
		p.columnRslt2_fr_upd_usr_id.addAllListener(p);
		p.columnRslt2_fr_upd_usr_id.setListListener(p);
		p.columnRslt2_fr_upd_usr_nm.addAllListener(p);
		p.columnRslt2_fr_upd_usr_nm.setListListener(p);
		p.columnRslt2_fr_upd_func_id.addAllListener(p);
		p.columnRslt2_fr_upd_func_id.setListListener(p);
		p.columnRslt2_fr_upd_func_nm.addAllListener(p);
		p.columnRslt2_fr_upd_func_nm.setListListener(p);
		p.columnRslt2_fr_upd_ts.addAllListener(p);
		p.columnRslt2_fr_upd_ts.setListListener(p);
		p.columnRslt2_fr_upd_srv_req_no.addAllListener(p);
		p.columnRslt2_fr_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBAP_DmndRecStsSrch p) {
		p.Btn_open_DTL.addAllListener(p);
		p.Btn_open_DTL.setAPMethodName("doBtn_open_DTL");
	}

	/**
	 * [SRCH_REF1]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_ScreenOpe(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Top(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Fold(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Tab1(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Tab2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Tab3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Tab4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Cnd(MSBAP_DmndRecStsSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF1, MCMode.REQUIRED);
		p.Cnd_dmnd_dt_fr.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_dmnd_no.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF1, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF1]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Cnd2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Cnd3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Cnd4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Ctrl(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_RPnl(MSBAP_DmndRecStsSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF1, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF1]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Rslt1Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Rslt1(MSBAP_DmndRecStsSrch p){
		p.columnRslt1_dmnd_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_st_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_end_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_st_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_end_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_sno1_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.Rslt1_input_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_dmnd_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_rec_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_dmnd_loc_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt1_dlv_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_dlv_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_ym.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_spln_vers.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_cur_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_cur_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_d_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_slo_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_intr_rmrks.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_cst_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF1]ステータスの[Rslt2Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Rslt2Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF1]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Rslt2(MSBAP_DmndRecStsSrch p){
		p.columnRslt2_to_dmnd_no.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_dt.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_st_dt.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_end_dt.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dlv_schd_st_dt.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dlv_schd_end_dt.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_period_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_period_typ_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_typ_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_dmnd_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_st_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_end_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_st_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_end_dt.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Rslt2_itm_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt2_sno1_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_sno2_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_sno3_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_sno4_mng_typ.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_dec_place.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.Rslt2_to_input_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt2_to_dmnd_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt2_to_rec_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt2_fr_input_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_dmnd_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_rec_qty_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_dmnd_loc_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_loc_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_loc_grp_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_loc_grp_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_lg_grp_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_lg_grp_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_wg_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_wg_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_site_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_site_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.Rslt2_to_sno_wrk_no_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt2_fr_sno_wrk_no_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt2_to_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt2_to_dlv_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dlv_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_dlv_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_to_ym.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_spln_vers.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_spln_itm_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_spln_itm_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cur_cd.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cur_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_frcst_no.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_frcst_d_no.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_slo_no.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_slo_d_no.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_ym.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_vers.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_d_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_d_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_to_intr_rmrks.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_sub_char1.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_sub_char2.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_sub_char3.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_intr_rmrks.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char1.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char2.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char3.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_cd.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.Rslt2_itm_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt2_to_dlv_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt2_fr_dlv_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_to_cst_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt2_fr_cst_grp_p_PPanel.putStatus(SRCH_REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt2_to_ins_usr_id.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_usr_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_func_id.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_func_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_ts.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_usr_id.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_usr_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_func_id.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_func_nm.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_ts.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_srv_req_no.putMode(p, SRCH_REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_ins_usr_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_usr_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_ts.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_id.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_nm.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_ts.putMode(p, SRCH_REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_srv_req_no.putMode(p, SRCH_REF1, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF1]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF1_Btn(MSBAP_DmndRecStsSrch p){
		p.Btn_open_DTL.putMode(p, SRCH_REF1, MCMode.DISABLE);

	}

	/**
	 * [REF1]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF1_ScreenOpe(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Top(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Fold(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Tab1(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Tab2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Tab3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Tab4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Cnd(MSBAP_DmndRecStsSrch p){
		p.Cnd_ope_Group.putMode(p, REF1, MCMode.REQUIRED);
		p.Cnd_dmnd_dt_fr.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF1, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_dmnd_no.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF1, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF1]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Cnd2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Cnd3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Cnd4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Ctrl(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF1_RPnl(MSBAP_DmndRecStsSrch p){
		p.RPnl_dwnld.putMode(p, REF1, MCMode.DISABLE);

	}

	/**
	 * [REF1]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Rslt1Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Rslt1(MSBAP_DmndRecStsSrch p){
		p.columnRslt1_dmnd_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_st_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_end_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_st_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_end_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_sno1_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, REF1, MCMode.INVISIBLE);
		p.Rslt1_input_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_dmnd_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_rec_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_dmnd_loc_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(REF1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_dmnd_usr_dpt_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt1_dlv_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_dlv_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_ym.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_spln_vers.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_cur_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_cur_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_d_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_slo_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_intr_rmrks.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_cst_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, REF1, MCMode.READ_ONLY);

	}

	/**
	 * [REF1]ステータスの[Rslt2Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Rslt2Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF1]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Rslt2(MSBAP_DmndRecStsSrch p){
		p.columnRslt2_to_dmnd_no.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_dt.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_st_dt.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_end_dt.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dlv_schd_st_dt.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dlv_schd_end_dt.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_period_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_period_typ_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dmnd_typ_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_dmnd_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_st_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_end_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_st_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_end_dt.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Rslt2_itm_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt2_sno1_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_sno2_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_sno3_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_sno4_mng_typ.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_dec_place.putMode(p, REF1, MCMode.INVISIBLE);
		p.Rslt2_to_input_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt2_to_dmnd_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt2_to_rec_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt2_fr_input_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_dmnd_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_rec_qty_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_dmnd_loc_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_loc_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_loc_grp_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_loc_grp_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_lg_grp_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_lg_grp_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_wg_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_wg_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_site_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_dmnd_site_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.Rslt2_to_sno_wrk_no_p_PPanel.putStatus(REF1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt2_fr_sno_wrk_no_p_PPanel.putStatus(REF1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt2_to_dmnd_usr_dpt_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.INVISIBLE);
		p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt2_to_dlv_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_dlv_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_dlv_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_to_ym.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_spln_vers.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_spln_itm_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_spln_itm_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cur_cd.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cur_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_frcst_no.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_cst_frcst_d_no.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_slo_no.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_slo_d_no.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_ym.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_vers.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_d_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_d_no.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_to_intr_rmrks.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_sub_char1.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_sub_char2.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_sub_char3.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_intr_rmrks.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char1.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char2.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char3.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_cd.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.Rslt2_itm_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt2_to_dlv_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt2_fr_dlv_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_to_cst_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt2_fr_cst_grp_p_PPanel.putStatus(REF1, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt2_to_ins_usr_id.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_usr_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_func_id.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_func_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_ins_ts.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_usr_id.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_usr_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_func_id.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_func_nm.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_ts.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_to_upd_srv_req_no.putMode(p, REF1, MCMode.INVISIBLE);
		p.columnRslt2_fr_ins_usr_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_usr_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_ts.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_id.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_nm.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_ts.putMode(p, REF1, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_srv_req_no.putMode(p, REF1, MCMode.READ_ONLY);

	}

	/**
	 * [REF1]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF1_Btn(MSBAP_DmndRecStsSrch p){
		p.Btn_open_DTL.putMode(p, REF1, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF2]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_ScreenOpe(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Top(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Fold(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Tab1(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Tab2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Tab3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Tab4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Cnd(MSBAP_DmndRecStsSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF2, MCMode.REQUIRED);
		p.Cnd_dmnd_dt_fr.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_dmnd_no.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF2, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF2]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Cnd2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Cnd3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Cnd4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Ctrl(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_RPnl(MSBAP_DmndRecStsSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF2, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF2]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Rslt1Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Rslt1(MSBAP_DmndRecStsSrch p){
		p.columnRslt1_dmnd_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_st_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_end_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_st_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_end_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_sno1_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.Rslt1_input_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_dmnd_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_rec_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_dmnd_loc_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt1_dlv_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_dlv_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_ym.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_spln_vers.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_cur_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_cur_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_d_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_slo_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_intr_rmrks.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_cst_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF2]ステータスの[Rslt2Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Rslt2Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [SRCH_REF2]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Rslt2(MSBAP_DmndRecStsSrch p){
		p.columnRslt2_to_dmnd_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_st_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_end_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dlv_schd_st_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dlv_schd_end_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_period_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_period_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_st_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_end_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_st_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_end_dt.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Rslt2_itm_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt2_sno1_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt2_sno2_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt2_sno3_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt2_sno4_mng_typ.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_cd.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_nm.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_dec_place.putMode(p, SRCH_REF2, MCMode.INVISIBLE);
		p.Rslt2_to_input_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_to_dmnd_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_to_rec_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_input_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_dmnd_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_rec_qty_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_dmnd_loc_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_loc_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_loc_grp_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_loc_grp_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_lg_grp_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_lg_grp_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_wg_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_wg_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_site_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_site_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Rslt2_to_sno_wrk_no_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt2_fr_sno_wrk_no_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt2_to_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt2_to_dlv_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dlv_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ym.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_spln_vers.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_spln_itm_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_spln_itm_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cur_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cur_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_frcst_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_frcst_d_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_slo_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_slo_d_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ym.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_vers.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_d_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_d_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_intr_rmrks.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_sub_char1.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_sub_char2.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_sub_char3.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_intr_rmrks.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char1.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char2.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char3.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_cd.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.Rslt2_itm_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt2_to_dlv_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_fr_dlv_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_to_cst_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_fr_cst_grp_p_PPanel.putStatus(SRCH_REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt2_to_ins_usr_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_usr_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_func_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_func_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_ts.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_usr_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_usr_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_func_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_func_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_ts.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_srv_req_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_usr_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_usr_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_ts.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_id.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_nm.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_ts.putMode(p, SRCH_REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_srv_req_no.putMode(p, SRCH_REF2, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF2]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF2_Btn(MSBAP_DmndRecStsSrch p){
		p.Btn_open_DTL.putMode(p, SRCH_REF2, MCMode.DISABLE);

	}

	/**
	 * [REF2]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF2_ScreenOpe(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Top(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Fold(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Tab1(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Tab2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Tab3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Tab4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Cnd(MSBAP_DmndRecStsSrch p){
		p.Cnd_ope_Group.putMode(p, REF2, MCMode.REQUIRED);
		p.Cnd_dmnd_dt_fr.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF2, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_dmnd_no.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF2, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF2]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Cnd2(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Cnd3(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Cnd4(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Ctrl(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF2_RPnl(MSBAP_DmndRecStsSrch p){
		p.RPnl_dwnld.putMode(p, REF2, MCMode.ENABLE);

	}

	/**
	 * [REF2]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Rslt1Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Rslt1(MSBAP_DmndRecStsSrch p){
		p.columnRslt1_dmnd_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_st_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_end_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_st_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dlv_schd_end_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_period_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_sno1_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, REF2, MCMode.INVISIBLE);
		p.Rslt1_input_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_dmnd_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_rec_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_dmnd_loc_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_loc_grp_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_lg_grp_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_wg_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dmnd_site_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(REF2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_dmnd_usr_dpt_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt1_dlv_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_dlv_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_ym.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_spln_vers.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_spln_itm_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_cur_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_cur_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_cst_frcst_d_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_slo_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_intr_rmrks.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_cst_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, REF2, MCMode.READ_ONLY);

	}

	/**
	 * [REF2]ステータスの[Rslt2Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Rslt2Panel(MSBAP_DmndRecStsSrch p){

	}

	/**
	 * [REF2]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Rslt2(MSBAP_DmndRecStsSrch p){
		p.columnRslt2_to_dmnd_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_st_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_end_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dlv_schd_st_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dlv_schd_end_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_period_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_period_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dmnd_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_st_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_end_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_st_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_schd_end_dt.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_period_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dmnd_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Rslt2_itm_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt2_sno1_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt2_sno2_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt2_sno3_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt2_sno4_mng_typ.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_cd.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_nm.putMode(p, REF2, MCMode.INVISIBLE);
		p.columnRslt2_base_unit_dec_place.putMode(p, REF2, MCMode.INVISIBLE);
		p.Rslt2_to_input_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_to_dmnd_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_to_rec_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_input_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_dmnd_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt2_fr_rec_qty_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_dmnd_loc_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_loc_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_loc_grp_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_loc_grp_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_lg_grp_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_lg_grp_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_wg_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_wg_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_site_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_dmnd_site_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Rslt2_to_sno_wrk_no_p_PPanel.putStatus(REF2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt2_fr_sno_wrk_no_p_PPanel.putStatus(REF2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt2_to_dmnd_usr_dpt_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt2_to_dlv_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_dlv_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_dlv_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ym.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_spln_vers.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_spln_itm_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_spln_itm_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cur_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cur_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_frcst_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_cst_frcst_d_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_slo_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_slo_d_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ym.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_vers.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_spln_itm_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cur_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_cst_frcst_d_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_slo_d_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_intr_rmrks.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_sub_char1.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_sub_char2.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_sub_char3.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_intr_rmrks.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char1.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char2.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_sub_char3.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_cd.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_itm_typ_d_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.Rslt2_itm_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt2_to_dlv_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_fr_dlv_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_to_cst_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt2_fr_cst_grp_p_PPanel.putStatus(REF2, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt2_to_ins_usr_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_usr_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_func_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_func_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_ins_ts.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_usr_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_usr_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_func_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_func_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_ts.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_to_upd_srv_req_no.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_usr_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_usr_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_func_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_ins_ts.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_usr_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_id.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_func_nm.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_ts.putMode(p, REF2, MCMode.READ_ONLY);
		p.columnRslt2_fr_upd_srv_req_no.putMode(p, REF2, MCMode.READ_ONLY);

	}

	/**
	 * [REF2]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF2_Btn(MSBAP_DmndRecStsSrch p){
		p.Btn_open_DTL.putMode(p, REF2, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_REF1;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBAP_DmndRecStsSrch_MC.setTableConfigRslt1((MSBAP_DmndRecStsSrch)this);
		MSBAP_DmndRecStsSrch_MC.setTableConfigRslt2((MSBAP_DmndRecStsSrch)this);
	}

	/**
	 * [Rslt1]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt1(MSBAP_DmndRecStsSrch p) {
		p.columnRslt1_dmnd_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_no);
		p.columnRslt1_dmnd_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_dt_META);
		p.columnRslt1_dmnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_dt);
		p.columnRslt1_dmnd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_st_dt_META);
		p.columnRslt1_dmnd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_st_dt);
		p.columnRslt1_dmnd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_end_dt_META);
		p.columnRslt1_dmnd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_end_dt);
		p.columnRslt1_dlv_schd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dlv_schd_st_dt_META);
		p.columnRslt1_dlv_schd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dlv_schd_st_dt);
		p.columnRslt1_dlv_schd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dlv_schd_end_dt_META);
		p.columnRslt1_dlv_schd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dlv_schd_end_dt);
		p.columnRslt1_dmnd_period_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_period_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_period_typ);
		p.columnRslt1_dmnd_period_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_period_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_period_typ_nm);
		p.columnRslt1_dmnd_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_typ);
		p.columnRslt1_dmnd_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_typ_nm);
		p.Rslt1Table.addTable(p.Rslt1_itm_p_PPanel.ItmTable);
		p.columnRslt1_sno1_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sno1_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno1_mng_typ);
		p.columnRslt1_sno2_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sno2_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno2_mng_typ);
		p.columnRslt1_sno3_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sno3_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno3_mng_typ);
		p.columnRslt1_sno4_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sno4_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno4_mng_typ);
		p.columnRslt1_base_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.base_unit_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_cd);
		p.columnRslt1_base_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.base_unit_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_nm);
		p.columnRslt1_base_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.base_unit_dec_place_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_dec_place);
		p.Rslt1Table.addTable(p.Rslt1_input_qty_p_PPanel.QtyTable);
		p.Rslt1Table.addTable(p.Rslt1_dmnd_qty_p_PPanel.QtyTable);
		p.Rslt1Table.addTable(p.Rslt1_rec_qty_p_PPanel.QtyTable);
		p.columnRslt1_dmnd_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_loc_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_loc_cd);
		p.columnRslt1_dmnd_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_loc_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_loc_nm);
		p.columnRslt1_dmnd_loc_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_loc_grp_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_loc_grp_cd);
		p.columnRslt1_dmnd_loc_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_loc_grp_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_loc_grp_nm);
		p.columnRslt1_dmnd_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_lg_grp_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_lg_grp_cd);
		p.columnRslt1_dmnd_lg_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_lg_grp_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_lg_grp_nm);
		p.columnRslt1_dmnd_wg_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_wg_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_wg_cd);
		p.columnRslt1_dmnd_wg_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_wg_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_wg_nm);
		p.columnRslt1_dmnd_site_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_site_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_site_cd);
		p.columnRslt1_dmnd_site_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dmnd_site_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dmnd_site_nm);
		p.Rslt1Table.addTable(p.Rslt1_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.Rslt1Table.addTable(p.Rslt1_dmnd_usr_dpt_p_PPanel.UsrDptTable);
		p.columnRslt1_dlv_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dlv_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dlv_cd);
		p.columnRslt1_dlv_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.dlv_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dlv_nm);
		p.columnRslt1_cst_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.cst_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_cst_cd);
		p.columnRslt1_cst_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.cst_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_cst_nm);
		p.columnRslt1_ym.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.ym_META);
		p.columnRslt1_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ym);
		p.columnRslt1_spln_vers.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.spln_vers_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_spln_vers);
		p.columnRslt1_spln_itm_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.spln_itm_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_spln_itm_cd);
		p.columnRslt1_spln_itm_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.spln_itm_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_spln_itm_nm);
		p.columnRslt1_cur_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.cur_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_cur_cd);
		p.columnRslt1_cur_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.cur_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_cur_nm);
		p.columnRslt1_cst_frcst_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.cst_frcst_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_cst_frcst_no);
		p.columnRslt1_cst_frcst_d_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.cst_frcst_d_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_cst_frcst_d_no);
		p.columnRslt1_slo_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.slo_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_slo_no);
		p.columnRslt1_slo_d_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.slo_d_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_slo_d_no);
		p.columnRslt1_intr_rmrks.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.intr_rmrks_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_intr_rmrks);
		p.columnRslt1_sub_char1.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sub_char1_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sub_char1);
		p.columnRslt1_sub_char2.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sub_char2_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sub_char2);
		p.columnRslt1_sub_char3.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.sub_char3_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sub_char3);
		p.columnRslt1_itm_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.itm_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ);
		p.columnRslt1_itm_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.itm_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ_nm);
		p.columnRslt1_itm_typ_d_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.itm_typ_d_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ_d_cd);
		p.columnRslt1_itm_typ_d_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.itm_typ_d_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ_d_nm);
		p.Rslt1Table.addTable(p.Rslt1_itm_grp_p_PPanel.ItmGrpTable);
		p.Rslt1Table.addTable(p.Rslt1_dlv_grp_p_PPanel.BpGrpTable);
		p.Rslt1Table.addTable(p.Rslt1_cst_grp_p_PPanel.BpGrpTable);
		p.columnRslt1_ins_usr_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.ins_usr_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_usr_id);
		p.columnRslt1_ins_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.ins_usr_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_usr_nm);
		p.columnRslt1_ins_func_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.ins_func_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_func_id);
		p.columnRslt1_ins_func_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.ins_func_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_func_nm);
		p.columnRslt1_ins_ts.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.ins_ts_META);
		p.columnRslt1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_ts);
		p.columnRslt1_upd_usr_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.upd_usr_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_usr_id);
		p.columnRslt1_upd_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.upd_usr_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_usr_nm);
		p.columnRslt1_upd_func_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.upd_func_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_func_id);
		p.columnRslt1_upd_func_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.upd_func_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_func_nm);
		p.columnRslt1_upd_ts.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.upd_ts_META);
		p.columnRslt1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_ts);
		p.columnRslt1_upd_srv_req_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt1R.upd_srv_req_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_srv_req_no);
	}

	/**
	 * [Rslt2]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt2(MSBAP_DmndRecStsSrch p) {
		p.columnRslt2_to_dmnd_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_no);
		p.columnRslt2_to_dmnd_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_dt_META);
		p.columnRslt2_to_dmnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_dt);
		p.columnRslt2_to_dmnd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_st_dt_META);
		p.columnRslt2_to_dmnd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_st_dt);
		p.columnRslt2_to_dmnd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_end_dt_META);
		p.columnRslt2_to_dmnd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_end_dt);
		p.columnRslt2_to_dlv_schd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dlv_schd_st_dt_META);
		p.columnRslt2_to_dlv_schd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dlv_schd_st_dt);
		p.columnRslt2_to_dlv_schd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dlv_schd_end_dt_META);
		p.columnRslt2_to_dlv_schd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dlv_schd_end_dt);
		p.columnRslt2_to_dmnd_period_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_period_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_period_typ);
		p.columnRslt2_to_dmnd_period_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_period_typ_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_period_typ_nm);
		p.columnRslt2_to_dmnd_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_typ);
		p.columnRslt2_to_dmnd_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dmnd_typ_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dmnd_typ_nm);
		p.columnRslt2_fr_dmnd_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_no);
		p.columnRslt2_fr_dmnd_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_dt_META);
		p.columnRslt2_fr_dmnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_dt);
		p.columnRslt2_fr_dmnd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_st_dt_META);
		p.columnRslt2_fr_dmnd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_st_dt);
		p.columnRslt2_fr_dmnd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_end_dt_META);
		p.columnRslt2_fr_dmnd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_end_dt);
		p.columnRslt2_fr_dlv_schd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dlv_schd_st_dt_META);
		p.columnRslt2_fr_dlv_schd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dlv_schd_st_dt);
		p.columnRslt2_fr_dlv_schd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dlv_schd_end_dt_META);
		p.columnRslt2_fr_dlv_schd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dlv_schd_end_dt);
		p.columnRslt2_fr_dmnd_period_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_period_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_period_typ);
		p.columnRslt2_fr_dmnd_period_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_period_typ_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_period_typ_nm);
		p.columnRslt2_fr_dmnd_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_typ);
		p.columnRslt2_fr_dmnd_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dmnd_typ_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dmnd_typ_nm);
		p.Rslt2Table.addTable(p.Rslt2_itm_p_PPanel.ItmTable);
		p.columnRslt2_sno1_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.sno1_mng_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_sno1_mng_typ);
		p.columnRslt2_sno2_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.sno2_mng_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_sno2_mng_typ);
		p.columnRslt2_sno3_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.sno3_mng_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_sno3_mng_typ);
		p.columnRslt2_sno4_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.sno4_mng_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_sno4_mng_typ);
		p.columnRslt2_base_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.base_unit_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_base_unit_cd);
		p.columnRslt2_base_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.base_unit_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_base_unit_nm);
		p.columnRslt2_base_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.base_unit_dec_place_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_base_unit_dec_place);
		p.Rslt2Table.addTable(p.Rslt2_to_input_qty_p_PPanel.QtyTable);
		p.Rslt2Table.addTable(p.Rslt2_to_dmnd_qty_p_PPanel.QtyTable);
		p.Rslt2Table.addTable(p.Rslt2_to_rec_qty_p_PPanel.QtyTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_input_qty_p_PPanel.QtyTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_dmnd_qty_p_PPanel.QtyTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_rec_qty_p_PPanel.QtyTable);
		p.columnRslt2_dmnd_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_loc_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_loc_cd);
		p.columnRslt2_dmnd_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_loc_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_loc_nm);
		p.columnRslt2_dmnd_loc_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_loc_grp_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_loc_grp_cd);
		p.columnRslt2_dmnd_loc_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_loc_grp_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_loc_grp_nm);
		p.columnRslt2_dmnd_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_lg_grp_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_lg_grp_cd);
		p.columnRslt2_dmnd_lg_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_lg_grp_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_lg_grp_nm);
		p.columnRslt2_dmnd_wg_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_wg_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_wg_cd);
		p.columnRslt2_dmnd_wg_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_wg_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_wg_nm);
		p.columnRslt2_dmnd_site_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_site_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_site_cd);
		p.columnRslt2_dmnd_site_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.dmnd_site_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_dmnd_site_nm);
		p.Rslt2Table.addTable(p.Rslt2_to_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.Rslt2Table.addTable(p.Rslt2_to_dmnd_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_dmnd_usr_dpt_p_PPanel.UsrDptTable);
		p.columnRslt2_to_dlv_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dlv_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dlv_cd);
		p.columnRslt2_to_dlv_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_dlv_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_dlv_nm);
		p.columnRslt2_to_cst_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_cst_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_cst_cd);
		p.columnRslt2_to_cst_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_cst_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_cst_nm);
		p.columnRslt2_fr_dlv_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dlv_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dlv_cd);
		p.columnRslt2_fr_dlv_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_dlv_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_dlv_nm);
		p.columnRslt2_fr_cst_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_cst_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_cst_cd);
		p.columnRslt2_fr_cst_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_cst_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_cst_nm);
		p.columnRslt2_to_ym.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_ym_META);
		p.columnRslt2_to_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_ym);
		p.columnRslt2_to_spln_vers.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_spln_vers_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_spln_vers);
		p.columnRslt2_to_spln_itm_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_spln_itm_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_spln_itm_cd);
		p.columnRslt2_to_spln_itm_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_spln_itm_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_spln_itm_nm);
		p.columnRslt2_to_cur_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_cur_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_cur_cd);
		p.columnRslt2_to_cur_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_cur_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_cur_nm);
		p.columnRslt2_to_cst_frcst_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_cst_frcst_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_cst_frcst_no);
		p.columnRslt2_to_cst_frcst_d_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_cst_frcst_d_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_cst_frcst_d_no);
		p.columnRslt2_to_slo_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_slo_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_slo_no);
		p.columnRslt2_to_slo_d_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_slo_d_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_slo_d_no);
		p.columnRslt2_fr_ym.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_ym_META);
		p.columnRslt2_fr_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_ym);
		p.columnRslt2_fr_spln_vers.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_spln_vers_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_spln_vers);
		p.columnRslt2_fr_spln_itm_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_spln_itm_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_spln_itm_cd);
		p.columnRslt2_fr_spln_itm_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_spln_itm_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_spln_itm_nm);
		p.columnRslt2_fr_cur_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_cur_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_cur_cd);
		p.columnRslt2_fr_cur_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_cur_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_cur_nm);
		p.columnRslt2_fr_cst_frcst_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_cst_frcst_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_cst_frcst_no);
		p.columnRslt2_fr_cst_frcst_d_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_cst_frcst_d_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_cst_frcst_d_no);
		p.columnRslt2_fr_slo_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_slo_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_slo_no);
		p.columnRslt2_fr_slo_d_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_slo_d_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_slo_d_no);
		p.columnRslt2_to_intr_rmrks.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_intr_rmrks_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_intr_rmrks);
		p.columnRslt2_to_sub_char1.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_sub_char1_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_sub_char1);
		p.columnRslt2_to_sub_char2.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_sub_char2_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_sub_char2);
		p.columnRslt2_to_sub_char3.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_sub_char3_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_sub_char3);
		p.columnRslt2_fr_intr_rmrks.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_intr_rmrks_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_intr_rmrks);
		p.columnRslt2_fr_sub_char1.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_sub_char1_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_sub_char1);
		p.columnRslt2_fr_sub_char2.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_sub_char2_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_sub_char2);
		p.columnRslt2_fr_sub_char3.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_sub_char3_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_sub_char3);
		p.columnRslt2_itm_typ.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.itm_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_itm_typ);
		p.columnRslt2_itm_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.itm_typ_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_itm_typ_nm);
		p.columnRslt2_itm_typ_d_cd.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.itm_typ_d_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_itm_typ_d_cd);
		p.columnRslt2_itm_typ_d_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.itm_typ_d_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_itm_typ_d_nm);
		p.Rslt2Table.addTable(p.Rslt2_itm_grp_p_PPanel.ItmGrpTable);
		p.Rslt2Table.addTable(p.Rslt2_to_dlv_grp_p_PPanel.BpGrpTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_dlv_grp_p_PPanel.BpGrpTable);
		p.Rslt2Table.addTable(p.Rslt2_to_cst_grp_p_PPanel.BpGrpTable);
		p.Rslt2Table.addTable(p.Rslt2_fr_cst_grp_p_PPanel.BpGrpTable);
		p.columnRslt2_to_ins_usr_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_ins_usr_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_ins_usr_id);
		p.columnRslt2_to_ins_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_ins_usr_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_ins_usr_nm);
		p.columnRslt2_to_ins_func_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_ins_func_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_ins_func_id);
		p.columnRslt2_to_ins_func_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_ins_func_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_ins_func_nm);
		p.columnRslt2_to_ins_ts.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_ins_ts_META);
		p.columnRslt2_to_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_ins_ts);
		p.columnRslt2_to_upd_usr_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_upd_usr_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_upd_usr_id);
		p.columnRslt2_to_upd_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_upd_usr_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_upd_usr_nm);
		p.columnRslt2_to_upd_func_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_upd_func_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_upd_func_id);
		p.columnRslt2_to_upd_func_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_upd_func_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_upd_func_nm);
		p.columnRslt2_to_upd_ts.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_upd_ts_META);
		p.columnRslt2_to_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_upd_ts);
		p.columnRslt2_to_upd_srv_req_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.to_upd_srv_req_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_to_upd_srv_req_no);
		p.columnRslt2_fr_ins_usr_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_ins_usr_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_ins_usr_id);
		p.columnRslt2_fr_ins_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_ins_usr_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_ins_usr_nm);
		p.columnRslt2_fr_ins_func_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_ins_func_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_ins_func_id);
		p.columnRslt2_fr_ins_func_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_ins_func_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_ins_func_nm);
		p.columnRslt2_fr_ins_ts.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_ins_ts_META);
		p.columnRslt2_fr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_ins_ts);
		p.columnRslt2_fr_upd_usr_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_upd_usr_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_upd_usr_id);
		p.columnRslt2_fr_upd_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_upd_usr_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_upd_usr_nm);
		p.columnRslt2_fr_upd_func_id.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_upd_func_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_upd_func_id);
		p.columnRslt2_fr_upd_func_nm.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_upd_func_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_upd_func_nm);
		p.columnRslt2_fr_upd_ts.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_upd_ts_META);
		p.columnRslt2_fr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_upd_ts);
		p.columnRslt2_fr_upd_srv_req_no.setMeta(mcframe.clientMSBA.MSBAP0040.Rslt2R.fr_upd_srv_req_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fr_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_dmnd_period_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dmnd_period_typ.getListConfig().setPutter(getCnd_dmnd_period_typ_ListPutter());
		Cnd_dmnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dmnd_typ.getListConfig().setPutter(getCnd_dmnd_typ_ListPutter());
		Cnd_dmnd_loc_cd.getListConfig().setPutter(getCnd_dmnd_loc_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_usr_cd.getListConfig().setPutter(getCnd_usr_cd_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_spln_vers.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_spln_vers.getListConfig().setPutter(getCnd_spln_vers_ListPutter());
		Cnd_spln_itm_cd.getListConfig().setPutter(getCnd_spln_itm_cd_ListPutter());
		columnRslt1_dmnd_period_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_dmnd_period_typ.getListConfig().setPutter(getRslt1_dmnd_period_typ_ListPutter());
		columnRslt1_dmnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_dmnd_typ.getListConfig().setPutter(getRslt1_dmnd_typ_ListPutter());
		columnRslt1_dmnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_dmnd_loc_cd.getListConfig().setPutter(getRslt1_dmnd_loc_cd_ListPutter());
		columnRslt1_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_dlv_cd.getListConfig().setPutter(getRslt1_dlv_cd_ListPutter());
		columnRslt1_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_cst_cd.getListConfig().setPutter(getRslt1_cst_cd_ListPutter());
		columnRslt2_fr_dmnd_period_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_fr_dmnd_period_typ.getListConfig().setPutter(getRslt2_fr_dmnd_period_typ_ListPutter());
		columnRslt2_fr_dmnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_fr_dmnd_typ.getListConfig().setPutter(getRslt2_fr_dmnd_typ_ListPutter());
		columnRslt2_dmnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_dmnd_loc_cd.getListConfig().setPutter(getRslt2_dmnd_loc_cd_ListPutter());
		columnRslt2_to_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_to_dlv_cd.getListConfig().setPutter(getRslt2_to_dlv_cd_ListPutter());
		columnRslt2_to_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_to_cst_cd.getListConfig().setPutter(getRslt2_to_cst_cd_ListPutter());
		columnRslt2_fr_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_fr_dlv_cd.getListConfig().setPutter(getRslt2_fr_dlv_cd_ListPutter());
		columnRslt2_fr_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_fr_cst_cd.getListConfig().setPutter(getRslt2_fr_cst_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_REF1]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF1Status() {
		status = SRCH_REF1;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF1]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF1Status() {
		status = REF1;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF2]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REF2Status() {
		status = SRCH_REF2;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF2]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF2Status() {
		status = REF2;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_REF1.equals(status)) {
			setSRCH_REF1Status();
		}
		else if (REF1.equals(status)) {
			setREF1Status();
		}
		else if (SRCH_REF2.equals(status)) {
			setSRCH_REF2Status();
		}
		else if (REF2.equals(status)) {
			setREF2Status();
		}
	}

	/**
	 * [Cnd_dmnd_period_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dmnd_period_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PeriodTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_dmnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dmnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DmndTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_dmnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dmnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
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
	 * [Cnd_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
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
	 * [Rslt1_dmnd_period_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_dmnd_period_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_dmnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_dmnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_dmnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_dmnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_fr_dmnd_period_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_fr_dmnd_period_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_fr_dmnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_fr_dmnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_dmnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_dmnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_to_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_to_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_to_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_to_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_fr_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_fr_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_fr_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_fr_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_dmnd_period_typ) return getCnd_dmnd_period_typ(row, info);
		if(combo == Cnd_dmnd_typ) return getCnd_dmnd_typ(row, info);
		if(combo == Cnd_dmnd_loc_cd) return getCnd_dmnd_loc_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_usr_cd) return getCnd_usr_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_spln_vers) return getCnd_spln_vers(row, info);
		if(combo == Cnd_spln_itm_cd) return getCnd_spln_itm_cd(row, info);
		if(combo == columnRslt1_dmnd_period_typ) return getRslt1_dmnd_period_typ(row, info);
		if(combo == columnRslt1_dmnd_typ) return getRslt1_dmnd_typ(row, info);
		if(combo == columnRslt1_dmnd_loc_cd) return getRslt1_dmnd_loc_cd(row, info);
		if(combo == columnRslt1_dlv_cd) return getRslt1_dlv_cd(row, info);
		if(combo == columnRslt1_cst_cd) return getRslt1_cst_cd(row, info);
		if(combo == columnRslt2_fr_dmnd_period_typ) return getRslt2_fr_dmnd_period_typ(row, info);
		if(combo == columnRslt2_fr_dmnd_typ) return getRslt2_fr_dmnd_typ(row, info);
		if(combo == columnRslt2_dmnd_loc_cd) return getRslt2_dmnd_loc_cd(row, info);
		if(combo == columnRslt2_to_dlv_cd) return getRslt2_to_dlv_cd(row, info);
		if(combo == columnRslt2_to_cst_cd) return getRslt2_to_cst_cd(row, info);
		if(combo == columnRslt2_fr_dlv_cd) return getRslt2_fr_dlv_cd(row, info);
		if(combo == columnRslt2_fr_cst_cd) return getRslt2_fr_cst_cd(row, info);
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
		else if (ap == Btn_open_DTL) doBtn_open_DTL(info);
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
	 * [Btn]パネルの[open_DTL]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_DTL(MCEventInfo info);

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
		if (vc == Rslt1Table) return doRslt1_VC(info);
		if (vc == Rslt2Table) return doRslt2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_dmnd_dt_fr) return doCnd_dmnd_dt_fr_VC(info);
		if (vc == Cnd_dmnd_dt_to) return doCnd_dmnd_dt_to_VC(info);
		if (vc == Cnd_dmnd_period_typ) return doCnd_dmnd_period_typ_VC(info);
		if (vc == Cnd_dmnd_period_typ_nm) return doCnd_dmnd_period_typ_nm_VC(info);
		if (vc == Cnd_dmnd_typ) return doCnd_dmnd_typ_VC(info);
		if (vc == Cnd_dmnd_typ_nm) return doCnd_dmnd_typ_nm_VC(info);
		if (vc == Cnd_dmnd_loc_cd) return doCnd_dmnd_loc_cd_VC(info);
		if (vc == Cnd_dmnd_loc_nm) return doCnd_dmnd_loc_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_spln_vers) return doCnd_spln_vers_VC(info);
		if (vc == Cnd_spln_itm_cd) return doCnd_spln_itm_cd_VC(info);
		if (vc == Cnd_spln_itm_nm) return doCnd_spln_itm_nm_VC(info);
		if (vc == Cnd_dmnd_no) return doCnd_dmnd_no_VC(info);
		if (vc == Cnd_cst_frcst_no) return doCnd_cst_frcst_no_VC(info);
		if (vc == Cnd_cst_frcst_d_no) return doCnd_cst_frcst_d_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt1_dmnd_no) return doRslt1_dmnd_no_VC(info);
		if (vc == columnRslt1_dmnd_dt) return doRslt1_dmnd_dt_VC(info);
		if (vc == columnRslt1_dmnd_st_dt) return doRslt1_dmnd_st_dt_VC(info);
		if (vc == columnRslt1_dmnd_end_dt) return doRslt1_dmnd_end_dt_VC(info);
		if (vc == columnRslt1_dlv_schd_st_dt) return doRslt1_dlv_schd_st_dt_VC(info);
		if (vc == columnRslt1_dlv_schd_end_dt) return doRslt1_dlv_schd_end_dt_VC(info);
		if (vc == columnRslt1_dmnd_period_typ) return doRslt1_dmnd_period_typ_VC(info);
		if (vc == columnRslt1_dmnd_period_typ_nm) return doRslt1_dmnd_period_typ_nm_VC(info);
		if (vc == columnRslt1_dmnd_typ) return doRslt1_dmnd_typ_VC(info);
		if (vc == columnRslt1_dmnd_typ_nm) return doRslt1_dmnd_typ_nm_VC(info);
		if (vc == columnRslt1_sno1_mng_typ) return doRslt1_sno1_mng_typ_VC(info);
		if (vc == columnRslt1_sno2_mng_typ) return doRslt1_sno2_mng_typ_VC(info);
		if (vc == columnRslt1_sno3_mng_typ) return doRslt1_sno3_mng_typ_VC(info);
		if (vc == columnRslt1_sno4_mng_typ) return doRslt1_sno4_mng_typ_VC(info);
		if (vc == columnRslt1_base_unit_cd) return doRslt1_base_unit_cd_VC(info);
		if (vc == columnRslt1_base_unit_nm) return doRslt1_base_unit_nm_VC(info);
		if (vc == columnRslt1_base_unit_dec_place) return doRslt1_base_unit_dec_place_VC(info);
		if (vc == columnRslt1_dmnd_loc_cd) return doRslt1_dmnd_loc_cd_VC(info);
		if (vc == columnRslt1_dmnd_loc_nm) return doRslt1_dmnd_loc_nm_VC(info);
		if (vc == columnRslt1_dmnd_loc_grp_cd) return doRslt1_dmnd_loc_grp_cd_VC(info);
		if (vc == columnRslt1_dmnd_loc_grp_nm) return doRslt1_dmnd_loc_grp_nm_VC(info);
		if (vc == columnRslt1_dmnd_lg_grp_cd) return doRslt1_dmnd_lg_grp_cd_VC(info);
		if (vc == columnRslt1_dmnd_lg_grp_nm) return doRslt1_dmnd_lg_grp_nm_VC(info);
		if (vc == columnRslt1_dmnd_wg_cd) return doRslt1_dmnd_wg_cd_VC(info);
		if (vc == columnRslt1_dmnd_wg_nm) return doRslt1_dmnd_wg_nm_VC(info);
		if (vc == columnRslt1_dmnd_site_cd) return doRslt1_dmnd_site_cd_VC(info);
		if (vc == columnRslt1_dmnd_site_nm) return doRslt1_dmnd_site_nm_VC(info);
		if (vc == columnRslt1_dlv_cd) return doRslt1_dlv_cd_VC(info);
		if (vc == columnRslt1_dlv_nm) return doRslt1_dlv_nm_VC(info);
		if (vc == columnRslt1_cst_cd) return doRslt1_cst_cd_VC(info);
		if (vc == columnRslt1_cst_nm) return doRslt1_cst_nm_VC(info);
		if (vc == columnRslt1_ym) return doRslt1_ym_VC(info);
		if (vc == columnRslt1_spln_vers) return doRslt1_spln_vers_VC(info);
		if (vc == columnRslt1_spln_itm_cd) return doRslt1_spln_itm_cd_VC(info);
		if (vc == columnRslt1_spln_itm_nm) return doRslt1_spln_itm_nm_VC(info);
		if (vc == columnRslt1_cur_cd) return doRslt1_cur_cd_VC(info);
		if (vc == columnRslt1_cur_nm) return doRslt1_cur_nm_VC(info);
		if (vc == columnRslt1_cst_frcst_no) return doRslt1_cst_frcst_no_VC(info);
		if (vc == columnRslt1_cst_frcst_d_no) return doRslt1_cst_frcst_d_no_VC(info);
		if (vc == columnRslt1_slo_no) return doRslt1_slo_no_VC(info);
		if (vc == columnRslt1_slo_d_no) return doRslt1_slo_d_no_VC(info);
		if (vc == columnRslt1_intr_rmrks) return doRslt1_intr_rmrks_VC(info);
		if (vc == columnRslt1_sub_char1) return doRslt1_sub_char1_VC(info);
		if (vc == columnRslt1_sub_char2) return doRslt1_sub_char2_VC(info);
		if (vc == columnRslt1_sub_char3) return doRslt1_sub_char3_VC(info);
		if (vc == columnRslt1_itm_typ) return doRslt1_itm_typ_VC(info);
		if (vc == columnRslt1_itm_typ_nm) return doRslt1_itm_typ_nm_VC(info);
		if (vc == columnRslt1_itm_typ_d_cd) return doRslt1_itm_typ_d_cd_VC(info);
		if (vc == columnRslt1_itm_typ_d_nm) return doRslt1_itm_typ_d_nm_VC(info);
		if (vc == columnRslt1_ins_usr_id) return doRslt1_ins_usr_id_VC(info);
		if (vc == columnRslt1_ins_usr_nm) return doRslt1_ins_usr_nm_VC(info);
		if (vc == columnRslt1_ins_func_id) return doRslt1_ins_func_id_VC(info);
		if (vc == columnRslt1_ins_func_nm) return doRslt1_ins_func_nm_VC(info);
		if (vc == columnRslt1_ins_ts) return doRslt1_ins_ts_VC(info);
		if (vc == columnRslt1_upd_usr_id) return doRslt1_upd_usr_id_VC(info);
		if (vc == columnRslt1_upd_usr_nm) return doRslt1_upd_usr_nm_VC(info);
		if (vc == columnRslt1_upd_func_id) return doRslt1_upd_func_id_VC(info);
		if (vc == columnRslt1_upd_func_nm) return doRslt1_upd_func_nm_VC(info);
		if (vc == columnRslt1_upd_ts) return doRslt1_upd_ts_VC(info);
		if (vc == columnRslt1_upd_srv_req_no) return doRslt1_upd_srv_req_no_VC(info);
		if (vc == columnRslt2_to_dmnd_no) return doRslt2_to_dmnd_no_VC(info);
		if (vc == columnRslt2_to_dmnd_dt) return doRslt2_to_dmnd_dt_VC(info);
		if (vc == columnRslt2_to_dmnd_st_dt) return doRslt2_to_dmnd_st_dt_VC(info);
		if (vc == columnRslt2_to_dmnd_end_dt) return doRslt2_to_dmnd_end_dt_VC(info);
		if (vc == columnRslt2_to_dlv_schd_st_dt) return doRslt2_to_dlv_schd_st_dt_VC(info);
		if (vc == columnRslt2_to_dlv_schd_end_dt) return doRslt2_to_dlv_schd_end_dt_VC(info);
		if (vc == columnRslt2_to_dmnd_period_typ) return doRslt2_to_dmnd_period_typ_VC(info);
		if (vc == columnRslt2_to_dmnd_period_typ_nm) return doRslt2_to_dmnd_period_typ_nm_VC(info);
		if (vc == columnRslt2_to_dmnd_typ) return doRslt2_to_dmnd_typ_VC(info);
		if (vc == columnRslt2_to_dmnd_typ_nm) return doRslt2_to_dmnd_typ_nm_VC(info);
		if (vc == columnRslt2_fr_dmnd_no) return doRslt2_fr_dmnd_no_VC(info);
		if (vc == columnRslt2_fr_dmnd_dt) return doRslt2_fr_dmnd_dt_VC(info);
		if (vc == columnRslt2_fr_dmnd_st_dt) return doRslt2_fr_dmnd_st_dt_VC(info);
		if (vc == columnRslt2_fr_dmnd_end_dt) return doRslt2_fr_dmnd_end_dt_VC(info);
		if (vc == columnRslt2_fr_dlv_schd_st_dt) return doRslt2_fr_dlv_schd_st_dt_VC(info);
		if (vc == columnRslt2_fr_dlv_schd_end_dt) return doRslt2_fr_dlv_schd_end_dt_VC(info);
		if (vc == columnRslt2_fr_dmnd_period_typ) return doRslt2_fr_dmnd_period_typ_VC(info);
		if (vc == columnRslt2_fr_dmnd_period_typ_nm) return doRslt2_fr_dmnd_period_typ_nm_VC(info);
		if (vc == columnRslt2_fr_dmnd_typ) return doRslt2_fr_dmnd_typ_VC(info);
		if (vc == columnRslt2_fr_dmnd_typ_nm) return doRslt2_fr_dmnd_typ_nm_VC(info);
		if (vc == columnRslt2_sno1_mng_typ) return doRslt2_sno1_mng_typ_VC(info);
		if (vc == columnRslt2_sno2_mng_typ) return doRslt2_sno2_mng_typ_VC(info);
		if (vc == columnRslt2_sno3_mng_typ) return doRslt2_sno3_mng_typ_VC(info);
		if (vc == columnRslt2_sno4_mng_typ) return doRslt2_sno4_mng_typ_VC(info);
		if (vc == columnRslt2_base_unit_cd) return doRslt2_base_unit_cd_VC(info);
		if (vc == columnRslt2_base_unit_nm) return doRslt2_base_unit_nm_VC(info);
		if (vc == columnRslt2_base_unit_dec_place) return doRslt2_base_unit_dec_place_VC(info);
		if (vc == columnRslt2_dmnd_loc_cd) return doRslt2_dmnd_loc_cd_VC(info);
		if (vc == columnRslt2_dmnd_loc_nm) return doRslt2_dmnd_loc_nm_VC(info);
		if (vc == columnRslt2_dmnd_loc_grp_cd) return doRslt2_dmnd_loc_grp_cd_VC(info);
		if (vc == columnRslt2_dmnd_loc_grp_nm) return doRslt2_dmnd_loc_grp_nm_VC(info);
		if (vc == columnRslt2_dmnd_lg_grp_cd) return doRslt2_dmnd_lg_grp_cd_VC(info);
		if (vc == columnRslt2_dmnd_lg_grp_nm) return doRslt2_dmnd_lg_grp_nm_VC(info);
		if (vc == columnRslt2_dmnd_wg_cd) return doRslt2_dmnd_wg_cd_VC(info);
		if (vc == columnRslt2_dmnd_wg_nm) return doRslt2_dmnd_wg_nm_VC(info);
		if (vc == columnRslt2_dmnd_site_cd) return doRslt2_dmnd_site_cd_VC(info);
		if (vc == columnRslt2_dmnd_site_nm) return doRslt2_dmnd_site_nm_VC(info);
		if (vc == columnRslt2_to_dlv_cd) return doRslt2_to_dlv_cd_VC(info);
		if (vc == columnRslt2_to_dlv_nm) return doRslt2_to_dlv_nm_VC(info);
		if (vc == columnRslt2_to_cst_cd) return doRslt2_to_cst_cd_VC(info);
		if (vc == columnRslt2_to_cst_nm) return doRslt2_to_cst_nm_VC(info);
		if (vc == columnRslt2_fr_dlv_cd) return doRslt2_fr_dlv_cd_VC(info);
		if (vc == columnRslt2_fr_dlv_nm) return doRslt2_fr_dlv_nm_VC(info);
		if (vc == columnRslt2_fr_cst_cd) return doRslt2_fr_cst_cd_VC(info);
		if (vc == columnRslt2_fr_cst_nm) return doRslt2_fr_cst_nm_VC(info);
		if (vc == columnRslt2_to_ym) return doRslt2_to_ym_VC(info);
		if (vc == columnRslt2_to_spln_vers) return doRslt2_to_spln_vers_VC(info);
		if (vc == columnRslt2_to_spln_itm_cd) return doRslt2_to_spln_itm_cd_VC(info);
		if (vc == columnRslt2_to_spln_itm_nm) return doRslt2_to_spln_itm_nm_VC(info);
		if (vc == columnRslt2_to_cur_cd) return doRslt2_to_cur_cd_VC(info);
		if (vc == columnRslt2_to_cur_nm) return doRslt2_to_cur_nm_VC(info);
		if (vc == columnRslt2_to_cst_frcst_no) return doRslt2_to_cst_frcst_no_VC(info);
		if (vc == columnRslt2_to_cst_frcst_d_no) return doRslt2_to_cst_frcst_d_no_VC(info);
		if (vc == columnRslt2_to_slo_no) return doRslt2_to_slo_no_VC(info);
		if (vc == columnRslt2_to_slo_d_no) return doRslt2_to_slo_d_no_VC(info);
		if (vc == columnRslt2_fr_ym) return doRslt2_fr_ym_VC(info);
		if (vc == columnRslt2_fr_spln_vers) return doRslt2_fr_spln_vers_VC(info);
		if (vc == columnRslt2_fr_spln_itm_cd) return doRslt2_fr_spln_itm_cd_VC(info);
		if (vc == columnRslt2_fr_spln_itm_nm) return doRslt2_fr_spln_itm_nm_VC(info);
		if (vc == columnRslt2_fr_cur_cd) return doRslt2_fr_cur_cd_VC(info);
		if (vc == columnRslt2_fr_cur_nm) return doRslt2_fr_cur_nm_VC(info);
		if (vc == columnRslt2_fr_cst_frcst_no) return doRslt2_fr_cst_frcst_no_VC(info);
		if (vc == columnRslt2_fr_cst_frcst_d_no) return doRslt2_fr_cst_frcst_d_no_VC(info);
		if (vc == columnRslt2_fr_slo_no) return doRslt2_fr_slo_no_VC(info);
		if (vc == columnRslt2_fr_slo_d_no) return doRslt2_fr_slo_d_no_VC(info);
		if (vc == columnRslt2_to_intr_rmrks) return doRslt2_to_intr_rmrks_VC(info);
		if (vc == columnRslt2_to_sub_char1) return doRslt2_to_sub_char1_VC(info);
		if (vc == columnRslt2_to_sub_char2) return doRslt2_to_sub_char2_VC(info);
		if (vc == columnRslt2_to_sub_char3) return doRslt2_to_sub_char3_VC(info);
		if (vc == columnRslt2_fr_intr_rmrks) return doRslt2_fr_intr_rmrks_VC(info);
		if (vc == columnRslt2_fr_sub_char1) return doRslt2_fr_sub_char1_VC(info);
		if (vc == columnRslt2_fr_sub_char2) return doRslt2_fr_sub_char2_VC(info);
		if (vc == columnRslt2_fr_sub_char3) return doRslt2_fr_sub_char3_VC(info);
		if (vc == columnRslt2_itm_typ) return doRslt2_itm_typ_VC(info);
		if (vc == columnRslt2_itm_typ_nm) return doRslt2_itm_typ_nm_VC(info);
		if (vc == columnRslt2_itm_typ_d_cd) return doRslt2_itm_typ_d_cd_VC(info);
		if (vc == columnRslt2_itm_typ_d_nm) return doRslt2_itm_typ_d_nm_VC(info);
		if (vc == columnRslt2_to_ins_usr_id) return doRslt2_to_ins_usr_id_VC(info);
		if (vc == columnRslt2_to_ins_usr_nm) return doRslt2_to_ins_usr_nm_VC(info);
		if (vc == columnRslt2_to_ins_func_id) return doRslt2_to_ins_func_id_VC(info);
		if (vc == columnRslt2_to_ins_func_nm) return doRslt2_to_ins_func_nm_VC(info);
		if (vc == columnRslt2_to_ins_ts) return doRslt2_to_ins_ts_VC(info);
		if (vc == columnRslt2_to_upd_usr_id) return doRslt2_to_upd_usr_id_VC(info);
		if (vc == columnRslt2_to_upd_usr_nm) return doRslt2_to_upd_usr_nm_VC(info);
		if (vc == columnRslt2_to_upd_func_id) return doRslt2_to_upd_func_id_VC(info);
		if (vc == columnRslt2_to_upd_func_nm) return doRslt2_to_upd_func_nm_VC(info);
		if (vc == columnRslt2_to_upd_ts) return doRslt2_to_upd_ts_VC(info);
		if (vc == columnRslt2_to_upd_srv_req_no) return doRslt2_to_upd_srv_req_no_VC(info);
		if (vc == columnRslt2_fr_ins_usr_id) return doRslt2_fr_ins_usr_id_VC(info);
		if (vc == columnRslt2_fr_ins_usr_nm) return doRslt2_fr_ins_usr_nm_VC(info);
		if (vc == columnRslt2_fr_ins_func_id) return doRslt2_fr_ins_func_id_VC(info);
		if (vc == columnRslt2_fr_ins_func_nm) return doRslt2_fr_ins_func_nm_VC(info);
		if (vc == columnRslt2_fr_ins_ts) return doRslt2_fr_ins_ts_VC(info);
		if (vc == columnRslt2_fr_upd_usr_id) return doRslt2_fr_upd_usr_id_VC(info);
		if (vc == columnRslt2_fr_upd_usr_nm) return doRslt2_fr_upd_usr_nm_VC(info);
		if (vc == columnRslt2_fr_upd_func_id) return doRslt2_fr_upd_func_id_VC(info);
		if (vc == columnRslt2_fr_upd_func_nm) return doRslt2_fr_upd_func_nm_VC(info);
		if (vc == columnRslt2_fr_upd_ts) return doRslt2_fr_upd_ts_VC(info);
		if (vc == columnRslt2_fr_upd_srv_req_no) return doRslt2_fr_upd_srv_req_no_VC(info);
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
	 * [Rslt1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dmnd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dmnd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmnd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_d_no_VC(MCEventInfo info){
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
	 * [Rslt1]パネルの[dmnd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dlv_schd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dlv_schd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dmnd_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_spln_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_cst_frcst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dlv_schd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dlv_schd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dmnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dlv_schd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dlv_schd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dmnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_dmnd_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_spln_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_cst_frcst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_spln_vers]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_spln_vers_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_spln_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_cst_frcst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_cst_frcst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[to_upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_to_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fr_upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fr_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == Rslt1Table) doRslt1_NC(info);
		else if (nc == Rslt2Table) doRslt2_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_dmnd_dt_fr) doCnd_dmnd_dt_fr_NC(info);
		else if (nc == Cnd_dmnd_dt_to) doCnd_dmnd_dt_to_NC(info);
		else if (nc == Cnd_dmnd_period_typ) doCnd_dmnd_period_typ_NC(info);
		else if (nc == Cnd_dmnd_period_typ_nm) doCnd_dmnd_period_typ_nm_NC(info);
		else if (nc == Cnd_dmnd_typ) doCnd_dmnd_typ_NC(info);
		else if (nc == Cnd_dmnd_typ_nm) doCnd_dmnd_typ_nm_NC(info);
		else if (nc == Cnd_dmnd_loc_cd) doCnd_dmnd_loc_cd_NC(info);
		else if (nc == Cnd_dmnd_loc_nm) doCnd_dmnd_loc_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_spln_vers) doCnd_spln_vers_NC(info);
		else if (nc == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NC(info);
		else if (nc == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NC(info);
		else if (nc == Cnd_dmnd_no) doCnd_dmnd_no_NC(info);
		else if (nc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NC(info);
		else if (nc == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt1_dmnd_no) doRslt1_dmnd_no_NC(info);
		else if (nc == columnRslt1_dmnd_dt) doRslt1_dmnd_dt_NC(info);
		else if (nc == columnRslt1_dmnd_st_dt) doRslt1_dmnd_st_dt_NC(info);
		else if (nc == columnRslt1_dmnd_end_dt) doRslt1_dmnd_end_dt_NC(info);
		else if (nc == columnRslt1_dlv_schd_st_dt) doRslt1_dlv_schd_st_dt_NC(info);
		else if (nc == columnRslt1_dlv_schd_end_dt) doRslt1_dlv_schd_end_dt_NC(info);
		else if (nc == columnRslt1_dmnd_period_typ) doRslt1_dmnd_period_typ_NC(info);
		else if (nc == columnRslt1_dmnd_period_typ_nm) doRslt1_dmnd_period_typ_nm_NC(info);
		else if (nc == columnRslt1_dmnd_typ) doRslt1_dmnd_typ_NC(info);
		else if (nc == columnRslt1_dmnd_typ_nm) doRslt1_dmnd_typ_nm_NC(info);
		else if (nc == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_NC(info);
		else if (nc == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_NC(info);
		else if (nc == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_NC(info);
		else if (nc == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_NC(info);
		else if (nc == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_NC(info);
		else if (nc == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_NC(info);
		else if (nc == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_NC(info);
		else if (nc == columnRslt1_dmnd_loc_cd) doRslt1_dmnd_loc_cd_NC(info);
		else if (nc == columnRslt1_dmnd_loc_nm) doRslt1_dmnd_loc_nm_NC(info);
		else if (nc == columnRslt1_dmnd_loc_grp_cd) doRslt1_dmnd_loc_grp_cd_NC(info);
		else if (nc == columnRslt1_dmnd_loc_grp_nm) doRslt1_dmnd_loc_grp_nm_NC(info);
		else if (nc == columnRslt1_dmnd_lg_grp_cd) doRslt1_dmnd_lg_grp_cd_NC(info);
		else if (nc == columnRslt1_dmnd_lg_grp_nm) doRslt1_dmnd_lg_grp_nm_NC(info);
		else if (nc == columnRslt1_dmnd_wg_cd) doRslt1_dmnd_wg_cd_NC(info);
		else if (nc == columnRslt1_dmnd_wg_nm) doRslt1_dmnd_wg_nm_NC(info);
		else if (nc == columnRslt1_dmnd_site_cd) doRslt1_dmnd_site_cd_NC(info);
		else if (nc == columnRslt1_dmnd_site_nm) doRslt1_dmnd_site_nm_NC(info);
		else if (nc == columnRslt1_dlv_cd) doRslt1_dlv_cd_NC(info);
		else if (nc == columnRslt1_dlv_nm) doRslt1_dlv_nm_NC(info);
		else if (nc == columnRslt1_cst_cd) doRslt1_cst_cd_NC(info);
		else if (nc == columnRslt1_cst_nm) doRslt1_cst_nm_NC(info);
		else if (nc == columnRslt1_ym) doRslt1_ym_NC(info);
		else if (nc == columnRslt1_spln_vers) doRslt1_spln_vers_NC(info);
		else if (nc == columnRslt1_spln_itm_cd) doRslt1_spln_itm_cd_NC(info);
		else if (nc == columnRslt1_spln_itm_nm) doRslt1_spln_itm_nm_NC(info);
		else if (nc == columnRslt1_cur_cd) doRslt1_cur_cd_NC(info);
		else if (nc == columnRslt1_cur_nm) doRslt1_cur_nm_NC(info);
		else if (nc == columnRslt1_cst_frcst_no) doRslt1_cst_frcst_no_NC(info);
		else if (nc == columnRslt1_cst_frcst_d_no) doRslt1_cst_frcst_d_no_NC(info);
		else if (nc == columnRslt1_slo_no) doRslt1_slo_no_NC(info);
		else if (nc == columnRslt1_slo_d_no) doRslt1_slo_d_no_NC(info);
		else if (nc == columnRslt1_intr_rmrks) doRslt1_intr_rmrks_NC(info);
		else if (nc == columnRslt1_sub_char1) doRslt1_sub_char1_NC(info);
		else if (nc == columnRslt1_sub_char2) doRslt1_sub_char2_NC(info);
		else if (nc == columnRslt1_sub_char3) doRslt1_sub_char3_NC(info);
		else if (nc == columnRslt1_itm_typ) doRslt1_itm_typ_NC(info);
		else if (nc == columnRslt1_itm_typ_nm) doRslt1_itm_typ_nm_NC(info);
		else if (nc == columnRslt1_itm_typ_d_cd) doRslt1_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt1_itm_typ_d_nm) doRslt1_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt1_ins_usr_id) doRslt1_ins_usr_id_NC(info);
		else if (nc == columnRslt1_ins_usr_nm) doRslt1_ins_usr_nm_NC(info);
		else if (nc == columnRslt1_ins_func_id) doRslt1_ins_func_id_NC(info);
		else if (nc == columnRslt1_ins_func_nm) doRslt1_ins_func_nm_NC(info);
		else if (nc == columnRslt1_ins_ts) doRslt1_ins_ts_NC(info);
		else if (nc == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_NC(info);
		else if (nc == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_NC(info);
		else if (nc == columnRslt1_upd_func_id) doRslt1_upd_func_id_NC(info);
		else if (nc == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_NC(info);
		else if (nc == columnRslt1_upd_ts) doRslt1_upd_ts_NC(info);
		else if (nc == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_NC(info);
		else if (nc == columnRslt2_to_dmnd_no) doRslt2_to_dmnd_no_NC(info);
		else if (nc == columnRslt2_to_dmnd_dt) doRslt2_to_dmnd_dt_NC(info);
		else if (nc == columnRslt2_to_dmnd_st_dt) doRslt2_to_dmnd_st_dt_NC(info);
		else if (nc == columnRslt2_to_dmnd_end_dt) doRslt2_to_dmnd_end_dt_NC(info);
		else if (nc == columnRslt2_to_dlv_schd_st_dt) doRslt2_to_dlv_schd_st_dt_NC(info);
		else if (nc == columnRslt2_to_dlv_schd_end_dt) doRslt2_to_dlv_schd_end_dt_NC(info);
		else if (nc == columnRslt2_to_dmnd_period_typ) doRslt2_to_dmnd_period_typ_NC(info);
		else if (nc == columnRslt2_to_dmnd_period_typ_nm) doRslt2_to_dmnd_period_typ_nm_NC(info);
		else if (nc == columnRslt2_to_dmnd_typ) doRslt2_to_dmnd_typ_NC(info);
		else if (nc == columnRslt2_to_dmnd_typ_nm) doRslt2_to_dmnd_typ_nm_NC(info);
		else if (nc == columnRslt2_fr_dmnd_no) doRslt2_fr_dmnd_no_NC(info);
		else if (nc == columnRslt2_fr_dmnd_dt) doRslt2_fr_dmnd_dt_NC(info);
		else if (nc == columnRslt2_fr_dmnd_st_dt) doRslt2_fr_dmnd_st_dt_NC(info);
		else if (nc == columnRslt2_fr_dmnd_end_dt) doRslt2_fr_dmnd_end_dt_NC(info);
		else if (nc == columnRslt2_fr_dlv_schd_st_dt) doRslt2_fr_dlv_schd_st_dt_NC(info);
		else if (nc == columnRslt2_fr_dlv_schd_end_dt) doRslt2_fr_dlv_schd_end_dt_NC(info);
		else if (nc == columnRslt2_fr_dmnd_period_typ) doRslt2_fr_dmnd_period_typ_NC(info);
		else if (nc == columnRslt2_fr_dmnd_period_typ_nm) doRslt2_fr_dmnd_period_typ_nm_NC(info);
		else if (nc == columnRslt2_fr_dmnd_typ) doRslt2_fr_dmnd_typ_NC(info);
		else if (nc == columnRslt2_fr_dmnd_typ_nm) doRslt2_fr_dmnd_typ_nm_NC(info);
		else if (nc == columnRslt2_sno1_mng_typ) doRslt2_sno1_mng_typ_NC(info);
		else if (nc == columnRslt2_sno2_mng_typ) doRslt2_sno2_mng_typ_NC(info);
		else if (nc == columnRslt2_sno3_mng_typ) doRslt2_sno3_mng_typ_NC(info);
		else if (nc == columnRslt2_sno4_mng_typ) doRslt2_sno4_mng_typ_NC(info);
		else if (nc == columnRslt2_base_unit_cd) doRslt2_base_unit_cd_NC(info);
		else if (nc == columnRslt2_base_unit_nm) doRslt2_base_unit_nm_NC(info);
		else if (nc == columnRslt2_base_unit_dec_place) doRslt2_base_unit_dec_place_NC(info);
		else if (nc == columnRslt2_dmnd_loc_cd) doRslt2_dmnd_loc_cd_NC(info);
		else if (nc == columnRslt2_dmnd_loc_nm) doRslt2_dmnd_loc_nm_NC(info);
		else if (nc == columnRslt2_dmnd_loc_grp_cd) doRslt2_dmnd_loc_grp_cd_NC(info);
		else if (nc == columnRslt2_dmnd_loc_grp_nm) doRslt2_dmnd_loc_grp_nm_NC(info);
		else if (nc == columnRslt2_dmnd_lg_grp_cd) doRslt2_dmnd_lg_grp_cd_NC(info);
		else if (nc == columnRslt2_dmnd_lg_grp_nm) doRslt2_dmnd_lg_grp_nm_NC(info);
		else if (nc == columnRslt2_dmnd_wg_cd) doRslt2_dmnd_wg_cd_NC(info);
		else if (nc == columnRslt2_dmnd_wg_nm) doRslt2_dmnd_wg_nm_NC(info);
		else if (nc == columnRslt2_dmnd_site_cd) doRslt2_dmnd_site_cd_NC(info);
		else if (nc == columnRslt2_dmnd_site_nm) doRslt2_dmnd_site_nm_NC(info);
		else if (nc == columnRslt2_to_dlv_cd) doRslt2_to_dlv_cd_NC(info);
		else if (nc == columnRslt2_to_dlv_nm) doRslt2_to_dlv_nm_NC(info);
		else if (nc == columnRslt2_to_cst_cd) doRslt2_to_cst_cd_NC(info);
		else if (nc == columnRslt2_to_cst_nm) doRslt2_to_cst_nm_NC(info);
		else if (nc == columnRslt2_fr_dlv_cd) doRslt2_fr_dlv_cd_NC(info);
		else if (nc == columnRslt2_fr_dlv_nm) doRslt2_fr_dlv_nm_NC(info);
		else if (nc == columnRslt2_fr_cst_cd) doRslt2_fr_cst_cd_NC(info);
		else if (nc == columnRslt2_fr_cst_nm) doRslt2_fr_cst_nm_NC(info);
		else if (nc == columnRslt2_to_ym) doRslt2_to_ym_NC(info);
		else if (nc == columnRslt2_to_spln_vers) doRslt2_to_spln_vers_NC(info);
		else if (nc == columnRslt2_to_spln_itm_cd) doRslt2_to_spln_itm_cd_NC(info);
		else if (nc == columnRslt2_to_spln_itm_nm) doRslt2_to_spln_itm_nm_NC(info);
		else if (nc == columnRslt2_to_cur_cd) doRslt2_to_cur_cd_NC(info);
		else if (nc == columnRslt2_to_cur_nm) doRslt2_to_cur_nm_NC(info);
		else if (nc == columnRslt2_to_cst_frcst_no) doRslt2_to_cst_frcst_no_NC(info);
		else if (nc == columnRslt2_to_cst_frcst_d_no) doRslt2_to_cst_frcst_d_no_NC(info);
		else if (nc == columnRslt2_to_slo_no) doRslt2_to_slo_no_NC(info);
		else if (nc == columnRslt2_to_slo_d_no) doRslt2_to_slo_d_no_NC(info);
		else if (nc == columnRslt2_fr_ym) doRslt2_fr_ym_NC(info);
		else if (nc == columnRslt2_fr_spln_vers) doRslt2_fr_spln_vers_NC(info);
		else if (nc == columnRslt2_fr_spln_itm_cd) doRslt2_fr_spln_itm_cd_NC(info);
		else if (nc == columnRslt2_fr_spln_itm_nm) doRslt2_fr_spln_itm_nm_NC(info);
		else if (nc == columnRslt2_fr_cur_cd) doRslt2_fr_cur_cd_NC(info);
		else if (nc == columnRslt2_fr_cur_nm) doRslt2_fr_cur_nm_NC(info);
		else if (nc == columnRslt2_fr_cst_frcst_no) doRslt2_fr_cst_frcst_no_NC(info);
		else if (nc == columnRslt2_fr_cst_frcst_d_no) doRslt2_fr_cst_frcst_d_no_NC(info);
		else if (nc == columnRslt2_fr_slo_no) doRslt2_fr_slo_no_NC(info);
		else if (nc == columnRslt2_fr_slo_d_no) doRslt2_fr_slo_d_no_NC(info);
		else if (nc == columnRslt2_to_intr_rmrks) doRslt2_to_intr_rmrks_NC(info);
		else if (nc == columnRslt2_to_sub_char1) doRslt2_to_sub_char1_NC(info);
		else if (nc == columnRslt2_to_sub_char2) doRslt2_to_sub_char2_NC(info);
		else if (nc == columnRslt2_to_sub_char3) doRslt2_to_sub_char3_NC(info);
		else if (nc == columnRslt2_fr_intr_rmrks) doRslt2_fr_intr_rmrks_NC(info);
		else if (nc == columnRslt2_fr_sub_char1) doRslt2_fr_sub_char1_NC(info);
		else if (nc == columnRslt2_fr_sub_char2) doRslt2_fr_sub_char2_NC(info);
		else if (nc == columnRslt2_fr_sub_char3) doRslt2_fr_sub_char3_NC(info);
		else if (nc == columnRslt2_itm_typ) doRslt2_itm_typ_NC(info);
		else if (nc == columnRslt2_itm_typ_nm) doRslt2_itm_typ_nm_NC(info);
		else if (nc == columnRslt2_itm_typ_d_cd) doRslt2_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt2_itm_typ_d_nm) doRslt2_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt2_to_ins_usr_id) doRslt2_to_ins_usr_id_NC(info);
		else if (nc == columnRslt2_to_ins_usr_nm) doRslt2_to_ins_usr_nm_NC(info);
		else if (nc == columnRslt2_to_ins_func_id) doRslt2_to_ins_func_id_NC(info);
		else if (nc == columnRslt2_to_ins_func_nm) doRslt2_to_ins_func_nm_NC(info);
		else if (nc == columnRslt2_to_ins_ts) doRslt2_to_ins_ts_NC(info);
		else if (nc == columnRslt2_to_upd_usr_id) doRslt2_to_upd_usr_id_NC(info);
		else if (nc == columnRslt2_to_upd_usr_nm) doRslt2_to_upd_usr_nm_NC(info);
		else if (nc == columnRslt2_to_upd_func_id) doRslt2_to_upd_func_id_NC(info);
		else if (nc == columnRslt2_to_upd_func_nm) doRslt2_to_upd_func_nm_NC(info);
		else if (nc == columnRslt2_to_upd_ts) doRslt2_to_upd_ts_NC(info);
		else if (nc == columnRslt2_to_upd_srv_req_no) doRslt2_to_upd_srv_req_no_NC(info);
		else if (nc == columnRslt2_fr_ins_usr_id) doRslt2_fr_ins_usr_id_NC(info);
		else if (nc == columnRslt2_fr_ins_usr_nm) doRslt2_fr_ins_usr_nm_NC(info);
		else if (nc == columnRslt2_fr_ins_func_id) doRslt2_fr_ins_func_id_NC(info);
		else if (nc == columnRslt2_fr_ins_func_nm) doRslt2_fr_ins_func_nm_NC(info);
		else if (nc == columnRslt2_fr_ins_ts) doRslt2_fr_ins_ts_NC(info);
		else if (nc == columnRslt2_fr_upd_usr_id) doRslt2_fr_upd_usr_id_NC(info);
		else if (nc == columnRslt2_fr_upd_usr_nm) doRslt2_fr_upd_usr_nm_NC(info);
		else if (nc == columnRslt2_fr_upd_func_id) doRslt2_fr_upd_func_id_NC(info);
		else if (nc == columnRslt2_fr_upd_func_nm) doRslt2_fr_upd_func_nm_NC(info);
		else if (nc == columnRslt2_fr_upd_ts) doRslt2_fr_upd_ts_NC(info);
		else if (nc == columnRslt2_fr_upd_srv_req_no) doRslt2_fr_upd_srv_req_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dmnd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NC(MCEventInfo info){
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
	 * [Rslt1]パネルの[dmnd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_vers]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_vers_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == Rslt1Table) doRslt1_NE(info);
		else if (ne == Rslt2Table) doRslt2_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_dmnd_dt_fr) doCnd_dmnd_dt_fr_NE(info);
		else if (ne == Cnd_dmnd_dt_to) doCnd_dmnd_dt_to_NE(info);
		else if (ne == Cnd_dmnd_period_typ) doCnd_dmnd_period_typ_NE(info);
		else if (ne == Cnd_dmnd_period_typ_nm) doCnd_dmnd_period_typ_nm_NE(info);
		else if (ne == Cnd_dmnd_typ) doCnd_dmnd_typ_NE(info);
		else if (ne == Cnd_dmnd_typ_nm) doCnd_dmnd_typ_nm_NE(info);
		else if (ne == Cnd_dmnd_loc_cd) doCnd_dmnd_loc_cd_NE(info);
		else if (ne == Cnd_dmnd_loc_nm) doCnd_dmnd_loc_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_spln_vers) doCnd_spln_vers_NE(info);
		else if (ne == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NE(info);
		else if (ne == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NE(info);
		else if (ne == Cnd_dmnd_no) doCnd_dmnd_no_NE(info);
		else if (ne == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NE(info);
		else if (ne == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt1_dmnd_no) doRslt1_dmnd_no_NE(info);
		else if (ne == columnRslt1_dmnd_dt) doRslt1_dmnd_dt_NE(info);
		else if (ne == columnRslt1_dmnd_st_dt) doRslt1_dmnd_st_dt_NE(info);
		else if (ne == columnRslt1_dmnd_end_dt) doRslt1_dmnd_end_dt_NE(info);
		else if (ne == columnRslt1_dlv_schd_st_dt) doRslt1_dlv_schd_st_dt_NE(info);
		else if (ne == columnRslt1_dlv_schd_end_dt) doRslt1_dlv_schd_end_dt_NE(info);
		else if (ne == columnRslt1_dmnd_period_typ) doRslt1_dmnd_period_typ_NE(info);
		else if (ne == columnRslt1_dmnd_period_typ_nm) doRslt1_dmnd_period_typ_nm_NE(info);
		else if (ne == columnRslt1_dmnd_typ) doRslt1_dmnd_typ_NE(info);
		else if (ne == columnRslt1_dmnd_typ_nm) doRslt1_dmnd_typ_nm_NE(info);
		else if (ne == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_NE(info);
		else if (ne == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_NE(info);
		else if (ne == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_NE(info);
		else if (ne == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_NE(info);
		else if (ne == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_NE(info);
		else if (ne == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_NE(info);
		else if (ne == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_NE(info);
		else if (ne == columnRslt1_dmnd_loc_cd) doRslt1_dmnd_loc_cd_NE(info);
		else if (ne == columnRslt1_dmnd_loc_nm) doRslt1_dmnd_loc_nm_NE(info);
		else if (ne == columnRslt1_dmnd_loc_grp_cd) doRslt1_dmnd_loc_grp_cd_NE(info);
		else if (ne == columnRslt1_dmnd_loc_grp_nm) doRslt1_dmnd_loc_grp_nm_NE(info);
		else if (ne == columnRslt1_dmnd_lg_grp_cd) doRslt1_dmnd_lg_grp_cd_NE(info);
		else if (ne == columnRslt1_dmnd_lg_grp_nm) doRslt1_dmnd_lg_grp_nm_NE(info);
		else if (ne == columnRslt1_dmnd_wg_cd) doRslt1_dmnd_wg_cd_NE(info);
		else if (ne == columnRslt1_dmnd_wg_nm) doRslt1_dmnd_wg_nm_NE(info);
		else if (ne == columnRslt1_dmnd_site_cd) doRslt1_dmnd_site_cd_NE(info);
		else if (ne == columnRslt1_dmnd_site_nm) doRslt1_dmnd_site_nm_NE(info);
		else if (ne == columnRslt1_dlv_cd) doRslt1_dlv_cd_NE(info);
		else if (ne == columnRslt1_dlv_nm) doRslt1_dlv_nm_NE(info);
		else if (ne == columnRslt1_cst_cd) doRslt1_cst_cd_NE(info);
		else if (ne == columnRslt1_cst_nm) doRslt1_cst_nm_NE(info);
		else if (ne == columnRslt1_ym) doRslt1_ym_NE(info);
		else if (ne == columnRslt1_spln_vers) doRslt1_spln_vers_NE(info);
		else if (ne == columnRslt1_spln_itm_cd) doRslt1_spln_itm_cd_NE(info);
		else if (ne == columnRslt1_spln_itm_nm) doRslt1_spln_itm_nm_NE(info);
		else if (ne == columnRslt1_cur_cd) doRslt1_cur_cd_NE(info);
		else if (ne == columnRslt1_cur_nm) doRslt1_cur_nm_NE(info);
		else if (ne == columnRslt1_cst_frcst_no) doRslt1_cst_frcst_no_NE(info);
		else if (ne == columnRslt1_cst_frcst_d_no) doRslt1_cst_frcst_d_no_NE(info);
		else if (ne == columnRslt1_slo_no) doRslt1_slo_no_NE(info);
		else if (ne == columnRslt1_slo_d_no) doRslt1_slo_d_no_NE(info);
		else if (ne == columnRslt1_intr_rmrks) doRslt1_intr_rmrks_NE(info);
		else if (ne == columnRslt1_sub_char1) doRslt1_sub_char1_NE(info);
		else if (ne == columnRslt1_sub_char2) doRslt1_sub_char2_NE(info);
		else if (ne == columnRslt1_sub_char3) doRslt1_sub_char3_NE(info);
		else if (ne == columnRslt1_itm_typ) doRslt1_itm_typ_NE(info);
		else if (ne == columnRslt1_itm_typ_nm) doRslt1_itm_typ_nm_NE(info);
		else if (ne == columnRslt1_itm_typ_d_cd) doRslt1_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt1_itm_typ_d_nm) doRslt1_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt1_ins_usr_id) doRslt1_ins_usr_id_NE(info);
		else if (ne == columnRslt1_ins_usr_nm) doRslt1_ins_usr_nm_NE(info);
		else if (ne == columnRslt1_ins_func_id) doRslt1_ins_func_id_NE(info);
		else if (ne == columnRslt1_ins_func_nm) doRslt1_ins_func_nm_NE(info);
		else if (ne == columnRslt1_ins_ts) doRslt1_ins_ts_NE(info);
		else if (ne == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_NE(info);
		else if (ne == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_NE(info);
		else if (ne == columnRslt1_upd_func_id) doRslt1_upd_func_id_NE(info);
		else if (ne == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_NE(info);
		else if (ne == columnRslt1_upd_ts) doRslt1_upd_ts_NE(info);
		else if (ne == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_NE(info);
		else if (ne == columnRslt2_to_dmnd_no) doRslt2_to_dmnd_no_NE(info);
		else if (ne == columnRslt2_to_dmnd_dt) doRslt2_to_dmnd_dt_NE(info);
		else if (ne == columnRslt2_to_dmnd_st_dt) doRslt2_to_dmnd_st_dt_NE(info);
		else if (ne == columnRslt2_to_dmnd_end_dt) doRslt2_to_dmnd_end_dt_NE(info);
		else if (ne == columnRslt2_to_dlv_schd_st_dt) doRslt2_to_dlv_schd_st_dt_NE(info);
		else if (ne == columnRslt2_to_dlv_schd_end_dt) doRslt2_to_dlv_schd_end_dt_NE(info);
		else if (ne == columnRslt2_to_dmnd_period_typ) doRslt2_to_dmnd_period_typ_NE(info);
		else if (ne == columnRslt2_to_dmnd_period_typ_nm) doRslt2_to_dmnd_period_typ_nm_NE(info);
		else if (ne == columnRslt2_to_dmnd_typ) doRslt2_to_dmnd_typ_NE(info);
		else if (ne == columnRslt2_to_dmnd_typ_nm) doRslt2_to_dmnd_typ_nm_NE(info);
		else if (ne == columnRslt2_fr_dmnd_no) doRslt2_fr_dmnd_no_NE(info);
		else if (ne == columnRslt2_fr_dmnd_dt) doRslt2_fr_dmnd_dt_NE(info);
		else if (ne == columnRslt2_fr_dmnd_st_dt) doRslt2_fr_dmnd_st_dt_NE(info);
		else if (ne == columnRslt2_fr_dmnd_end_dt) doRslt2_fr_dmnd_end_dt_NE(info);
		else if (ne == columnRslt2_fr_dlv_schd_st_dt) doRslt2_fr_dlv_schd_st_dt_NE(info);
		else if (ne == columnRslt2_fr_dlv_schd_end_dt) doRslt2_fr_dlv_schd_end_dt_NE(info);
		else if (ne == columnRslt2_fr_dmnd_period_typ) doRslt2_fr_dmnd_period_typ_NE(info);
		else if (ne == columnRslt2_fr_dmnd_period_typ_nm) doRslt2_fr_dmnd_period_typ_nm_NE(info);
		else if (ne == columnRslt2_fr_dmnd_typ) doRslt2_fr_dmnd_typ_NE(info);
		else if (ne == columnRslt2_fr_dmnd_typ_nm) doRslt2_fr_dmnd_typ_nm_NE(info);
		else if (ne == columnRslt2_sno1_mng_typ) doRslt2_sno1_mng_typ_NE(info);
		else if (ne == columnRslt2_sno2_mng_typ) doRslt2_sno2_mng_typ_NE(info);
		else if (ne == columnRslt2_sno3_mng_typ) doRslt2_sno3_mng_typ_NE(info);
		else if (ne == columnRslt2_sno4_mng_typ) doRslt2_sno4_mng_typ_NE(info);
		else if (ne == columnRslt2_base_unit_cd) doRslt2_base_unit_cd_NE(info);
		else if (ne == columnRslt2_base_unit_nm) doRslt2_base_unit_nm_NE(info);
		else if (ne == columnRslt2_base_unit_dec_place) doRslt2_base_unit_dec_place_NE(info);
		else if (ne == columnRslt2_dmnd_loc_cd) doRslt2_dmnd_loc_cd_NE(info);
		else if (ne == columnRslt2_dmnd_loc_nm) doRslt2_dmnd_loc_nm_NE(info);
		else if (ne == columnRslt2_dmnd_loc_grp_cd) doRslt2_dmnd_loc_grp_cd_NE(info);
		else if (ne == columnRslt2_dmnd_loc_grp_nm) doRslt2_dmnd_loc_grp_nm_NE(info);
		else if (ne == columnRslt2_dmnd_lg_grp_cd) doRslt2_dmnd_lg_grp_cd_NE(info);
		else if (ne == columnRslt2_dmnd_lg_grp_nm) doRslt2_dmnd_lg_grp_nm_NE(info);
		else if (ne == columnRslt2_dmnd_wg_cd) doRslt2_dmnd_wg_cd_NE(info);
		else if (ne == columnRslt2_dmnd_wg_nm) doRslt2_dmnd_wg_nm_NE(info);
		else if (ne == columnRslt2_dmnd_site_cd) doRslt2_dmnd_site_cd_NE(info);
		else if (ne == columnRslt2_dmnd_site_nm) doRslt2_dmnd_site_nm_NE(info);
		else if (ne == columnRslt2_to_dlv_cd) doRslt2_to_dlv_cd_NE(info);
		else if (ne == columnRslt2_to_dlv_nm) doRslt2_to_dlv_nm_NE(info);
		else if (ne == columnRslt2_to_cst_cd) doRslt2_to_cst_cd_NE(info);
		else if (ne == columnRslt2_to_cst_nm) doRslt2_to_cst_nm_NE(info);
		else if (ne == columnRslt2_fr_dlv_cd) doRslt2_fr_dlv_cd_NE(info);
		else if (ne == columnRslt2_fr_dlv_nm) doRslt2_fr_dlv_nm_NE(info);
		else if (ne == columnRslt2_fr_cst_cd) doRslt2_fr_cst_cd_NE(info);
		else if (ne == columnRslt2_fr_cst_nm) doRslt2_fr_cst_nm_NE(info);
		else if (ne == columnRslt2_to_ym) doRslt2_to_ym_NE(info);
		else if (ne == columnRslt2_to_spln_vers) doRslt2_to_spln_vers_NE(info);
		else if (ne == columnRslt2_to_spln_itm_cd) doRslt2_to_spln_itm_cd_NE(info);
		else if (ne == columnRslt2_to_spln_itm_nm) doRslt2_to_spln_itm_nm_NE(info);
		else if (ne == columnRslt2_to_cur_cd) doRslt2_to_cur_cd_NE(info);
		else if (ne == columnRslt2_to_cur_nm) doRslt2_to_cur_nm_NE(info);
		else if (ne == columnRslt2_to_cst_frcst_no) doRslt2_to_cst_frcst_no_NE(info);
		else if (ne == columnRslt2_to_cst_frcst_d_no) doRslt2_to_cst_frcst_d_no_NE(info);
		else if (ne == columnRslt2_to_slo_no) doRslt2_to_slo_no_NE(info);
		else if (ne == columnRslt2_to_slo_d_no) doRslt2_to_slo_d_no_NE(info);
		else if (ne == columnRslt2_fr_ym) doRslt2_fr_ym_NE(info);
		else if (ne == columnRslt2_fr_spln_vers) doRslt2_fr_spln_vers_NE(info);
		else if (ne == columnRslt2_fr_spln_itm_cd) doRslt2_fr_spln_itm_cd_NE(info);
		else if (ne == columnRslt2_fr_spln_itm_nm) doRslt2_fr_spln_itm_nm_NE(info);
		else if (ne == columnRslt2_fr_cur_cd) doRslt2_fr_cur_cd_NE(info);
		else if (ne == columnRslt2_fr_cur_nm) doRslt2_fr_cur_nm_NE(info);
		else if (ne == columnRslt2_fr_cst_frcst_no) doRslt2_fr_cst_frcst_no_NE(info);
		else if (ne == columnRslt2_fr_cst_frcst_d_no) doRslt2_fr_cst_frcst_d_no_NE(info);
		else if (ne == columnRslt2_fr_slo_no) doRslt2_fr_slo_no_NE(info);
		else if (ne == columnRslt2_fr_slo_d_no) doRslt2_fr_slo_d_no_NE(info);
		else if (ne == columnRslt2_to_intr_rmrks) doRslt2_to_intr_rmrks_NE(info);
		else if (ne == columnRslt2_to_sub_char1) doRslt2_to_sub_char1_NE(info);
		else if (ne == columnRslt2_to_sub_char2) doRslt2_to_sub_char2_NE(info);
		else if (ne == columnRslt2_to_sub_char3) doRslt2_to_sub_char3_NE(info);
		else if (ne == columnRslt2_fr_intr_rmrks) doRslt2_fr_intr_rmrks_NE(info);
		else if (ne == columnRslt2_fr_sub_char1) doRslt2_fr_sub_char1_NE(info);
		else if (ne == columnRslt2_fr_sub_char2) doRslt2_fr_sub_char2_NE(info);
		else if (ne == columnRslt2_fr_sub_char3) doRslt2_fr_sub_char3_NE(info);
		else if (ne == columnRslt2_itm_typ) doRslt2_itm_typ_NE(info);
		else if (ne == columnRslt2_itm_typ_nm) doRslt2_itm_typ_nm_NE(info);
		else if (ne == columnRslt2_itm_typ_d_cd) doRslt2_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt2_itm_typ_d_nm) doRslt2_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt2_to_ins_usr_id) doRslt2_to_ins_usr_id_NE(info);
		else if (ne == columnRslt2_to_ins_usr_nm) doRslt2_to_ins_usr_nm_NE(info);
		else if (ne == columnRslt2_to_ins_func_id) doRslt2_to_ins_func_id_NE(info);
		else if (ne == columnRslt2_to_ins_func_nm) doRslt2_to_ins_func_nm_NE(info);
		else if (ne == columnRslt2_to_ins_ts) doRslt2_to_ins_ts_NE(info);
		else if (ne == columnRslt2_to_upd_usr_id) doRslt2_to_upd_usr_id_NE(info);
		else if (ne == columnRslt2_to_upd_usr_nm) doRslt2_to_upd_usr_nm_NE(info);
		else if (ne == columnRslt2_to_upd_func_id) doRslt2_to_upd_func_id_NE(info);
		else if (ne == columnRslt2_to_upd_func_nm) doRslt2_to_upd_func_nm_NE(info);
		else if (ne == columnRslt2_to_upd_ts) doRslt2_to_upd_ts_NE(info);
		else if (ne == columnRslt2_to_upd_srv_req_no) doRslt2_to_upd_srv_req_no_NE(info);
		else if (ne == columnRslt2_fr_ins_usr_id) doRslt2_fr_ins_usr_id_NE(info);
		else if (ne == columnRslt2_fr_ins_usr_nm) doRslt2_fr_ins_usr_nm_NE(info);
		else if (ne == columnRslt2_fr_ins_func_id) doRslt2_fr_ins_func_id_NE(info);
		else if (ne == columnRslt2_fr_ins_func_nm) doRslt2_fr_ins_func_nm_NE(info);
		else if (ne == columnRslt2_fr_ins_ts) doRslt2_fr_ins_ts_NE(info);
		else if (ne == columnRslt2_fr_upd_usr_id) doRslt2_fr_upd_usr_id_NE(info);
		else if (ne == columnRslt2_fr_upd_usr_nm) doRslt2_fr_upd_usr_nm_NE(info);
		else if (ne == columnRslt2_fr_upd_func_id) doRslt2_fr_upd_func_id_NE(info);
		else if (ne == columnRslt2_fr_upd_func_nm) doRslt2_fr_upd_func_nm_NE(info);
		else if (ne == columnRslt2_fr_upd_ts) doRslt2_fr_upd_ts_NE(info);
		else if (ne == columnRslt2_fr_upd_srv_req_no) doRslt2_fr_upd_srv_req_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dmnd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NE(MCEventInfo info){
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
	 * [Rslt1]パネルの[dmnd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_vers]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_vers_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == Rslt1Table) doRslt1_NX(info);
		else if (nx == Rslt2Table) doRslt2_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_dmnd_dt_fr) doCnd_dmnd_dt_fr_NX(info);
		else if (nx == Cnd_dmnd_dt_to) doCnd_dmnd_dt_to_NX(info);
		else if (nx == Cnd_dmnd_period_typ) doCnd_dmnd_period_typ_NX(info);
		else if (nx == Cnd_dmnd_period_typ_nm) doCnd_dmnd_period_typ_nm_NX(info);
		else if (nx == Cnd_dmnd_typ) doCnd_dmnd_typ_NX(info);
		else if (nx == Cnd_dmnd_typ_nm) doCnd_dmnd_typ_nm_NX(info);
		else if (nx == Cnd_dmnd_loc_cd) doCnd_dmnd_loc_cd_NX(info);
		else if (nx == Cnd_dmnd_loc_nm) doCnd_dmnd_loc_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_spln_vers) doCnd_spln_vers_NX(info);
		else if (nx == Cnd_spln_itm_cd) doCnd_spln_itm_cd_NX(info);
		else if (nx == Cnd_spln_itm_nm) doCnd_spln_itm_nm_NX(info);
		else if (nx == Cnd_dmnd_no) doCnd_dmnd_no_NX(info);
		else if (nx == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NX(info);
		else if (nx == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt1_dmnd_no) doRslt1_dmnd_no_NX(info);
		else if (nx == columnRslt1_dmnd_dt) doRslt1_dmnd_dt_NX(info);
		else if (nx == columnRslt1_dmnd_st_dt) doRslt1_dmnd_st_dt_NX(info);
		else if (nx == columnRslt1_dmnd_end_dt) doRslt1_dmnd_end_dt_NX(info);
		else if (nx == columnRslt1_dlv_schd_st_dt) doRslt1_dlv_schd_st_dt_NX(info);
		else if (nx == columnRslt1_dlv_schd_end_dt) doRslt1_dlv_schd_end_dt_NX(info);
		else if (nx == columnRslt1_dmnd_period_typ) doRslt1_dmnd_period_typ_NX(info);
		else if (nx == columnRslt1_dmnd_period_typ_nm) doRslt1_dmnd_period_typ_nm_NX(info);
		else if (nx == columnRslt1_dmnd_typ) doRslt1_dmnd_typ_NX(info);
		else if (nx == columnRslt1_dmnd_typ_nm) doRslt1_dmnd_typ_nm_NX(info);
		else if (nx == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_NX(info);
		else if (nx == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_NX(info);
		else if (nx == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_NX(info);
		else if (nx == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_NX(info);
		else if (nx == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_NX(info);
		else if (nx == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_NX(info);
		else if (nx == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_NX(info);
		else if (nx == columnRslt1_dmnd_loc_cd) doRslt1_dmnd_loc_cd_NX(info);
		else if (nx == columnRslt1_dmnd_loc_nm) doRslt1_dmnd_loc_nm_NX(info);
		else if (nx == columnRslt1_dmnd_loc_grp_cd) doRslt1_dmnd_loc_grp_cd_NX(info);
		else if (nx == columnRslt1_dmnd_loc_grp_nm) doRslt1_dmnd_loc_grp_nm_NX(info);
		else if (nx == columnRslt1_dmnd_lg_grp_cd) doRslt1_dmnd_lg_grp_cd_NX(info);
		else if (nx == columnRslt1_dmnd_lg_grp_nm) doRslt1_dmnd_lg_grp_nm_NX(info);
		else if (nx == columnRslt1_dmnd_wg_cd) doRslt1_dmnd_wg_cd_NX(info);
		else if (nx == columnRslt1_dmnd_wg_nm) doRslt1_dmnd_wg_nm_NX(info);
		else if (nx == columnRslt1_dmnd_site_cd) doRslt1_dmnd_site_cd_NX(info);
		else if (nx == columnRslt1_dmnd_site_nm) doRslt1_dmnd_site_nm_NX(info);
		else if (nx == columnRslt1_dlv_cd) doRslt1_dlv_cd_NX(info);
		else if (nx == columnRslt1_dlv_nm) doRslt1_dlv_nm_NX(info);
		else if (nx == columnRslt1_cst_cd) doRslt1_cst_cd_NX(info);
		else if (nx == columnRslt1_cst_nm) doRslt1_cst_nm_NX(info);
		else if (nx == columnRslt1_ym) doRslt1_ym_NX(info);
		else if (nx == columnRslt1_spln_vers) doRslt1_spln_vers_NX(info);
		else if (nx == columnRslt1_spln_itm_cd) doRslt1_spln_itm_cd_NX(info);
		else if (nx == columnRslt1_spln_itm_nm) doRslt1_spln_itm_nm_NX(info);
		else if (nx == columnRslt1_cur_cd) doRslt1_cur_cd_NX(info);
		else if (nx == columnRslt1_cur_nm) doRslt1_cur_nm_NX(info);
		else if (nx == columnRslt1_cst_frcst_no) doRslt1_cst_frcst_no_NX(info);
		else if (nx == columnRslt1_cst_frcst_d_no) doRslt1_cst_frcst_d_no_NX(info);
		else if (nx == columnRslt1_slo_no) doRslt1_slo_no_NX(info);
		else if (nx == columnRslt1_slo_d_no) doRslt1_slo_d_no_NX(info);
		else if (nx == columnRslt1_intr_rmrks) doRslt1_intr_rmrks_NX(info);
		else if (nx == columnRslt1_sub_char1) doRslt1_sub_char1_NX(info);
		else if (nx == columnRslt1_sub_char2) doRslt1_sub_char2_NX(info);
		else if (nx == columnRslt1_sub_char3) doRslt1_sub_char3_NX(info);
		else if (nx == columnRslt1_itm_typ) doRslt1_itm_typ_NX(info);
		else if (nx == columnRslt1_itm_typ_nm) doRslt1_itm_typ_nm_NX(info);
		else if (nx == columnRslt1_itm_typ_d_cd) doRslt1_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt1_itm_typ_d_nm) doRslt1_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt1_ins_usr_id) doRslt1_ins_usr_id_NX(info);
		else if (nx == columnRslt1_ins_usr_nm) doRslt1_ins_usr_nm_NX(info);
		else if (nx == columnRslt1_ins_func_id) doRslt1_ins_func_id_NX(info);
		else if (nx == columnRslt1_ins_func_nm) doRslt1_ins_func_nm_NX(info);
		else if (nx == columnRslt1_ins_ts) doRslt1_ins_ts_NX(info);
		else if (nx == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_NX(info);
		else if (nx == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_NX(info);
		else if (nx == columnRslt1_upd_func_id) doRslt1_upd_func_id_NX(info);
		else if (nx == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_NX(info);
		else if (nx == columnRslt1_upd_ts) doRslt1_upd_ts_NX(info);
		else if (nx == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_NX(info);
		else if (nx == columnRslt2_to_dmnd_no) doRslt2_to_dmnd_no_NX(info);
		else if (nx == columnRslt2_to_dmnd_dt) doRslt2_to_dmnd_dt_NX(info);
		else if (nx == columnRslt2_to_dmnd_st_dt) doRslt2_to_dmnd_st_dt_NX(info);
		else if (nx == columnRslt2_to_dmnd_end_dt) doRslt2_to_dmnd_end_dt_NX(info);
		else if (nx == columnRslt2_to_dlv_schd_st_dt) doRslt2_to_dlv_schd_st_dt_NX(info);
		else if (nx == columnRslt2_to_dlv_schd_end_dt) doRslt2_to_dlv_schd_end_dt_NX(info);
		else if (nx == columnRslt2_to_dmnd_period_typ) doRslt2_to_dmnd_period_typ_NX(info);
		else if (nx == columnRslt2_to_dmnd_period_typ_nm) doRslt2_to_dmnd_period_typ_nm_NX(info);
		else if (nx == columnRslt2_to_dmnd_typ) doRslt2_to_dmnd_typ_NX(info);
		else if (nx == columnRslt2_to_dmnd_typ_nm) doRslt2_to_dmnd_typ_nm_NX(info);
		else if (nx == columnRslt2_fr_dmnd_no) doRslt2_fr_dmnd_no_NX(info);
		else if (nx == columnRslt2_fr_dmnd_dt) doRslt2_fr_dmnd_dt_NX(info);
		else if (nx == columnRslt2_fr_dmnd_st_dt) doRslt2_fr_dmnd_st_dt_NX(info);
		else if (nx == columnRslt2_fr_dmnd_end_dt) doRslt2_fr_dmnd_end_dt_NX(info);
		else if (nx == columnRslt2_fr_dlv_schd_st_dt) doRslt2_fr_dlv_schd_st_dt_NX(info);
		else if (nx == columnRslt2_fr_dlv_schd_end_dt) doRslt2_fr_dlv_schd_end_dt_NX(info);
		else if (nx == columnRslt2_fr_dmnd_period_typ) doRslt2_fr_dmnd_period_typ_NX(info);
		else if (nx == columnRslt2_fr_dmnd_period_typ_nm) doRslt2_fr_dmnd_period_typ_nm_NX(info);
		else if (nx == columnRslt2_fr_dmnd_typ) doRslt2_fr_dmnd_typ_NX(info);
		else if (nx == columnRslt2_fr_dmnd_typ_nm) doRslt2_fr_dmnd_typ_nm_NX(info);
		else if (nx == columnRslt2_sno1_mng_typ) doRslt2_sno1_mng_typ_NX(info);
		else if (nx == columnRslt2_sno2_mng_typ) doRslt2_sno2_mng_typ_NX(info);
		else if (nx == columnRslt2_sno3_mng_typ) doRslt2_sno3_mng_typ_NX(info);
		else if (nx == columnRslt2_sno4_mng_typ) doRslt2_sno4_mng_typ_NX(info);
		else if (nx == columnRslt2_base_unit_cd) doRslt2_base_unit_cd_NX(info);
		else if (nx == columnRslt2_base_unit_nm) doRslt2_base_unit_nm_NX(info);
		else if (nx == columnRslt2_base_unit_dec_place) doRslt2_base_unit_dec_place_NX(info);
		else if (nx == columnRslt2_dmnd_loc_cd) doRslt2_dmnd_loc_cd_NX(info);
		else if (nx == columnRslt2_dmnd_loc_nm) doRslt2_dmnd_loc_nm_NX(info);
		else if (nx == columnRslt2_dmnd_loc_grp_cd) doRslt2_dmnd_loc_grp_cd_NX(info);
		else if (nx == columnRslt2_dmnd_loc_grp_nm) doRslt2_dmnd_loc_grp_nm_NX(info);
		else if (nx == columnRslt2_dmnd_lg_grp_cd) doRslt2_dmnd_lg_grp_cd_NX(info);
		else if (nx == columnRslt2_dmnd_lg_grp_nm) doRslt2_dmnd_lg_grp_nm_NX(info);
		else if (nx == columnRslt2_dmnd_wg_cd) doRslt2_dmnd_wg_cd_NX(info);
		else if (nx == columnRslt2_dmnd_wg_nm) doRslt2_dmnd_wg_nm_NX(info);
		else if (nx == columnRslt2_dmnd_site_cd) doRslt2_dmnd_site_cd_NX(info);
		else if (nx == columnRslt2_dmnd_site_nm) doRslt2_dmnd_site_nm_NX(info);
		else if (nx == columnRslt2_to_dlv_cd) doRslt2_to_dlv_cd_NX(info);
		else if (nx == columnRslt2_to_dlv_nm) doRslt2_to_dlv_nm_NX(info);
		else if (nx == columnRslt2_to_cst_cd) doRslt2_to_cst_cd_NX(info);
		else if (nx == columnRslt2_to_cst_nm) doRslt2_to_cst_nm_NX(info);
		else if (nx == columnRslt2_fr_dlv_cd) doRslt2_fr_dlv_cd_NX(info);
		else if (nx == columnRslt2_fr_dlv_nm) doRslt2_fr_dlv_nm_NX(info);
		else if (nx == columnRslt2_fr_cst_cd) doRslt2_fr_cst_cd_NX(info);
		else if (nx == columnRslt2_fr_cst_nm) doRslt2_fr_cst_nm_NX(info);
		else if (nx == columnRslt2_to_ym) doRslt2_to_ym_NX(info);
		else if (nx == columnRslt2_to_spln_vers) doRslt2_to_spln_vers_NX(info);
		else if (nx == columnRslt2_to_spln_itm_cd) doRslt2_to_spln_itm_cd_NX(info);
		else if (nx == columnRslt2_to_spln_itm_nm) doRslt2_to_spln_itm_nm_NX(info);
		else if (nx == columnRslt2_to_cur_cd) doRslt2_to_cur_cd_NX(info);
		else if (nx == columnRslt2_to_cur_nm) doRslt2_to_cur_nm_NX(info);
		else if (nx == columnRslt2_to_cst_frcst_no) doRslt2_to_cst_frcst_no_NX(info);
		else if (nx == columnRslt2_to_cst_frcst_d_no) doRslt2_to_cst_frcst_d_no_NX(info);
		else if (nx == columnRslt2_to_slo_no) doRslt2_to_slo_no_NX(info);
		else if (nx == columnRslt2_to_slo_d_no) doRslt2_to_slo_d_no_NX(info);
		else if (nx == columnRslt2_fr_ym) doRslt2_fr_ym_NX(info);
		else if (nx == columnRslt2_fr_spln_vers) doRslt2_fr_spln_vers_NX(info);
		else if (nx == columnRslt2_fr_spln_itm_cd) doRslt2_fr_spln_itm_cd_NX(info);
		else if (nx == columnRslt2_fr_spln_itm_nm) doRslt2_fr_spln_itm_nm_NX(info);
		else if (nx == columnRslt2_fr_cur_cd) doRslt2_fr_cur_cd_NX(info);
		else if (nx == columnRslt2_fr_cur_nm) doRslt2_fr_cur_nm_NX(info);
		else if (nx == columnRslt2_fr_cst_frcst_no) doRslt2_fr_cst_frcst_no_NX(info);
		else if (nx == columnRslt2_fr_cst_frcst_d_no) doRslt2_fr_cst_frcst_d_no_NX(info);
		else if (nx == columnRslt2_fr_slo_no) doRslt2_fr_slo_no_NX(info);
		else if (nx == columnRslt2_fr_slo_d_no) doRslt2_fr_slo_d_no_NX(info);
		else if (nx == columnRslt2_to_intr_rmrks) doRslt2_to_intr_rmrks_NX(info);
		else if (nx == columnRslt2_to_sub_char1) doRslt2_to_sub_char1_NX(info);
		else if (nx == columnRslt2_to_sub_char2) doRslt2_to_sub_char2_NX(info);
		else if (nx == columnRslt2_to_sub_char3) doRslt2_to_sub_char3_NX(info);
		else if (nx == columnRslt2_fr_intr_rmrks) doRslt2_fr_intr_rmrks_NX(info);
		else if (nx == columnRslt2_fr_sub_char1) doRslt2_fr_sub_char1_NX(info);
		else if (nx == columnRslt2_fr_sub_char2) doRslt2_fr_sub_char2_NX(info);
		else if (nx == columnRslt2_fr_sub_char3) doRslt2_fr_sub_char3_NX(info);
		else if (nx == columnRslt2_itm_typ) doRslt2_itm_typ_NX(info);
		else if (nx == columnRslt2_itm_typ_nm) doRslt2_itm_typ_nm_NX(info);
		else if (nx == columnRslt2_itm_typ_d_cd) doRslt2_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt2_itm_typ_d_nm) doRslt2_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt2_to_ins_usr_id) doRslt2_to_ins_usr_id_NX(info);
		else if (nx == columnRslt2_to_ins_usr_nm) doRslt2_to_ins_usr_nm_NX(info);
		else if (nx == columnRslt2_to_ins_func_id) doRslt2_to_ins_func_id_NX(info);
		else if (nx == columnRslt2_to_ins_func_nm) doRslt2_to_ins_func_nm_NX(info);
		else if (nx == columnRslt2_to_ins_ts) doRslt2_to_ins_ts_NX(info);
		else if (nx == columnRslt2_to_upd_usr_id) doRslt2_to_upd_usr_id_NX(info);
		else if (nx == columnRslt2_to_upd_usr_nm) doRslt2_to_upd_usr_nm_NX(info);
		else if (nx == columnRslt2_to_upd_func_id) doRslt2_to_upd_func_id_NX(info);
		else if (nx == columnRslt2_to_upd_func_nm) doRslt2_to_upd_func_nm_NX(info);
		else if (nx == columnRslt2_to_upd_ts) doRslt2_to_upd_ts_NX(info);
		else if (nx == columnRslt2_to_upd_srv_req_no) doRslt2_to_upd_srv_req_no_NX(info);
		else if (nx == columnRslt2_fr_ins_usr_id) doRslt2_fr_ins_usr_id_NX(info);
		else if (nx == columnRslt2_fr_ins_usr_nm) doRslt2_fr_ins_usr_nm_NX(info);
		else if (nx == columnRslt2_fr_ins_func_id) doRslt2_fr_ins_func_id_NX(info);
		else if (nx == columnRslt2_fr_ins_func_nm) doRslt2_fr_ins_func_nm_NX(info);
		else if (nx == columnRslt2_fr_ins_ts) doRslt2_fr_ins_ts_NX(info);
		else if (nx == columnRslt2_fr_upd_usr_id) doRslt2_fr_upd_usr_id_NX(info);
		else if (nx == columnRslt2_fr_upd_usr_nm) doRslt2_fr_upd_usr_nm_NX(info);
		else if (nx == columnRslt2_fr_upd_func_id) doRslt2_fr_upd_func_id_NX(info);
		else if (nx == columnRslt2_fr_upd_func_nm) doRslt2_fr_upd_func_nm_NX(info);
		else if (nx == columnRslt2_fr_upd_ts) doRslt2_fr_upd_ts_NX(info);
		else if (nx == columnRslt2_fr_upd_srv_req_no) doRslt2_fr_upd_srv_req_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spln_vers_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dmnd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NX(MCEventInfo info){
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
	 * [Rslt1]パネルの[dmnd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_vers]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_vers_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dmnd_dt_fr) doCnd_dmnd_dt_fr_LC(info);
		else if (lc == Cnd_dmnd_dt_to) doCnd_dmnd_dt_to_LC(info);
		else if (lc == Cnd_dmnd_period_typ) doCnd_dmnd_period_typ_LC(info);
		else if (lc == Cnd_dmnd_period_typ_nm) doCnd_dmnd_period_typ_nm_LC(info);
		else if (lc == Cnd_dmnd_typ) doCnd_dmnd_typ_LC(info);
		else if (lc == Cnd_dmnd_typ_nm) doCnd_dmnd_typ_nm_LC(info);
		else if (lc == Cnd_dmnd_loc_cd) doCnd_dmnd_loc_cd_LC(info);
		else if (lc == Cnd_dmnd_loc_nm) doCnd_dmnd_loc_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_spln_vers) doCnd_spln_vers_LC(info);
		else if (lc == Cnd_spln_itm_cd) doCnd_spln_itm_cd_LC(info);
		else if (lc == Cnd_spln_itm_nm) doCnd_spln_itm_nm_LC(info);
		else if (lc == Cnd_dmnd_no) doCnd_dmnd_no_LC(info);
		else if (lc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_LC(info);
		else if (lc == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt1_dmnd_no) doRslt1_dmnd_no_LC(info);
		else if (lc == columnRslt1_dmnd_dt) doRslt1_dmnd_dt_LC(info);
		else if (lc == columnRslt1_dmnd_st_dt) doRslt1_dmnd_st_dt_LC(info);
		else if (lc == columnRslt1_dmnd_end_dt) doRslt1_dmnd_end_dt_LC(info);
		else if (lc == columnRslt1_dlv_schd_st_dt) doRslt1_dlv_schd_st_dt_LC(info);
		else if (lc == columnRslt1_dlv_schd_end_dt) doRslt1_dlv_schd_end_dt_LC(info);
		else if (lc == columnRslt1_dmnd_period_typ) doRslt1_dmnd_period_typ_LC(info);
		else if (lc == columnRslt1_dmnd_period_typ_nm) doRslt1_dmnd_period_typ_nm_LC(info);
		else if (lc == columnRslt1_dmnd_typ) doRslt1_dmnd_typ_LC(info);
		else if (lc == columnRslt1_dmnd_typ_nm) doRslt1_dmnd_typ_nm_LC(info);
		else if (lc == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_LC(info);
		else if (lc == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_LC(info);
		else if (lc == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_LC(info);
		else if (lc == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_LC(info);
		else if (lc == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_LC(info);
		else if (lc == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_LC(info);
		else if (lc == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_LC(info);
		else if (lc == columnRslt1_dmnd_loc_cd) doRslt1_dmnd_loc_cd_LC(info);
		else if (lc == columnRslt1_dmnd_loc_nm) doRslt1_dmnd_loc_nm_LC(info);
		else if (lc == columnRslt1_dmnd_loc_grp_cd) doRslt1_dmnd_loc_grp_cd_LC(info);
		else if (lc == columnRslt1_dmnd_loc_grp_nm) doRslt1_dmnd_loc_grp_nm_LC(info);
		else if (lc == columnRslt1_dmnd_lg_grp_cd) doRslt1_dmnd_lg_grp_cd_LC(info);
		else if (lc == columnRslt1_dmnd_lg_grp_nm) doRslt1_dmnd_lg_grp_nm_LC(info);
		else if (lc == columnRslt1_dmnd_wg_cd) doRslt1_dmnd_wg_cd_LC(info);
		else if (lc == columnRslt1_dmnd_wg_nm) doRslt1_dmnd_wg_nm_LC(info);
		else if (lc == columnRslt1_dmnd_site_cd) doRslt1_dmnd_site_cd_LC(info);
		else if (lc == columnRslt1_dmnd_site_nm) doRslt1_dmnd_site_nm_LC(info);
		else if (lc == columnRslt1_dlv_cd) doRslt1_dlv_cd_LC(info);
		else if (lc == columnRslt1_dlv_nm) doRslt1_dlv_nm_LC(info);
		else if (lc == columnRslt1_cst_cd) doRslt1_cst_cd_LC(info);
		else if (lc == columnRslt1_cst_nm) doRslt1_cst_nm_LC(info);
		else if (lc == columnRslt1_ym) doRslt1_ym_LC(info);
		else if (lc == columnRslt1_spln_vers) doRslt1_spln_vers_LC(info);
		else if (lc == columnRslt1_spln_itm_cd) doRslt1_spln_itm_cd_LC(info);
		else if (lc == columnRslt1_spln_itm_nm) doRslt1_spln_itm_nm_LC(info);
		else if (lc == columnRslt1_cur_cd) doRslt1_cur_cd_LC(info);
		else if (lc == columnRslt1_cur_nm) doRslt1_cur_nm_LC(info);
		else if (lc == columnRslt1_cst_frcst_no) doRslt1_cst_frcst_no_LC(info);
		else if (lc == columnRslt1_cst_frcst_d_no) doRslt1_cst_frcst_d_no_LC(info);
		else if (lc == columnRslt1_slo_no) doRslt1_slo_no_LC(info);
		else if (lc == columnRslt1_slo_d_no) doRslt1_slo_d_no_LC(info);
		else if (lc == columnRslt1_intr_rmrks) doRslt1_intr_rmrks_LC(info);
		else if (lc == columnRslt1_sub_char1) doRslt1_sub_char1_LC(info);
		else if (lc == columnRslt1_sub_char2) doRslt1_sub_char2_LC(info);
		else if (lc == columnRslt1_sub_char3) doRslt1_sub_char3_LC(info);
		else if (lc == columnRslt1_itm_typ) doRslt1_itm_typ_LC(info);
		else if (lc == columnRslt1_itm_typ_nm) doRslt1_itm_typ_nm_LC(info);
		else if (lc == columnRslt1_itm_typ_d_cd) doRslt1_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt1_itm_typ_d_nm) doRslt1_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt1_ins_usr_id) doRslt1_ins_usr_id_LC(info);
		else if (lc == columnRslt1_ins_usr_nm) doRslt1_ins_usr_nm_LC(info);
		else if (lc == columnRslt1_ins_func_id) doRslt1_ins_func_id_LC(info);
		else if (lc == columnRslt1_ins_func_nm) doRslt1_ins_func_nm_LC(info);
		else if (lc == columnRslt1_ins_ts) doRslt1_ins_ts_LC(info);
		else if (lc == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_LC(info);
		else if (lc == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_LC(info);
		else if (lc == columnRslt1_upd_func_id) doRslt1_upd_func_id_LC(info);
		else if (lc == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_LC(info);
		else if (lc == columnRslt1_upd_ts) doRslt1_upd_ts_LC(info);
		else if (lc == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_LC(info);
		else if (lc == columnRslt2_to_dmnd_no) doRslt2_to_dmnd_no_LC(info);
		else if (lc == columnRslt2_to_dmnd_dt) doRslt2_to_dmnd_dt_LC(info);
		else if (lc == columnRslt2_to_dmnd_st_dt) doRslt2_to_dmnd_st_dt_LC(info);
		else if (lc == columnRslt2_to_dmnd_end_dt) doRslt2_to_dmnd_end_dt_LC(info);
		else if (lc == columnRslt2_to_dlv_schd_st_dt) doRslt2_to_dlv_schd_st_dt_LC(info);
		else if (lc == columnRslt2_to_dlv_schd_end_dt) doRslt2_to_dlv_schd_end_dt_LC(info);
		else if (lc == columnRslt2_to_dmnd_period_typ) doRslt2_to_dmnd_period_typ_LC(info);
		else if (lc == columnRslt2_to_dmnd_period_typ_nm) doRslt2_to_dmnd_period_typ_nm_LC(info);
		else if (lc == columnRslt2_to_dmnd_typ) doRslt2_to_dmnd_typ_LC(info);
		else if (lc == columnRslt2_to_dmnd_typ_nm) doRslt2_to_dmnd_typ_nm_LC(info);
		else if (lc == columnRslt2_fr_dmnd_no) doRslt2_fr_dmnd_no_LC(info);
		else if (lc == columnRslt2_fr_dmnd_dt) doRslt2_fr_dmnd_dt_LC(info);
		else if (lc == columnRslt2_fr_dmnd_st_dt) doRslt2_fr_dmnd_st_dt_LC(info);
		else if (lc == columnRslt2_fr_dmnd_end_dt) doRslt2_fr_dmnd_end_dt_LC(info);
		else if (lc == columnRslt2_fr_dlv_schd_st_dt) doRslt2_fr_dlv_schd_st_dt_LC(info);
		else if (lc == columnRslt2_fr_dlv_schd_end_dt) doRslt2_fr_dlv_schd_end_dt_LC(info);
		else if (lc == columnRslt2_fr_dmnd_period_typ) doRslt2_fr_dmnd_period_typ_LC(info);
		else if (lc == columnRslt2_fr_dmnd_period_typ_nm) doRslt2_fr_dmnd_period_typ_nm_LC(info);
		else if (lc == columnRslt2_fr_dmnd_typ) doRslt2_fr_dmnd_typ_LC(info);
		else if (lc == columnRslt2_fr_dmnd_typ_nm) doRslt2_fr_dmnd_typ_nm_LC(info);
		else if (lc == columnRslt2_sno1_mng_typ) doRslt2_sno1_mng_typ_LC(info);
		else if (lc == columnRslt2_sno2_mng_typ) doRslt2_sno2_mng_typ_LC(info);
		else if (lc == columnRslt2_sno3_mng_typ) doRslt2_sno3_mng_typ_LC(info);
		else if (lc == columnRslt2_sno4_mng_typ) doRslt2_sno4_mng_typ_LC(info);
		else if (lc == columnRslt2_base_unit_cd) doRslt2_base_unit_cd_LC(info);
		else if (lc == columnRslt2_base_unit_nm) doRslt2_base_unit_nm_LC(info);
		else if (lc == columnRslt2_base_unit_dec_place) doRslt2_base_unit_dec_place_LC(info);
		else if (lc == columnRslt2_dmnd_loc_cd) doRslt2_dmnd_loc_cd_LC(info);
		else if (lc == columnRslt2_dmnd_loc_nm) doRslt2_dmnd_loc_nm_LC(info);
		else if (lc == columnRslt2_dmnd_loc_grp_cd) doRslt2_dmnd_loc_grp_cd_LC(info);
		else if (lc == columnRslt2_dmnd_loc_grp_nm) doRslt2_dmnd_loc_grp_nm_LC(info);
		else if (lc == columnRslt2_dmnd_lg_grp_cd) doRslt2_dmnd_lg_grp_cd_LC(info);
		else if (lc == columnRslt2_dmnd_lg_grp_nm) doRslt2_dmnd_lg_grp_nm_LC(info);
		else if (lc == columnRslt2_dmnd_wg_cd) doRslt2_dmnd_wg_cd_LC(info);
		else if (lc == columnRslt2_dmnd_wg_nm) doRslt2_dmnd_wg_nm_LC(info);
		else if (lc == columnRslt2_dmnd_site_cd) doRslt2_dmnd_site_cd_LC(info);
		else if (lc == columnRslt2_dmnd_site_nm) doRslt2_dmnd_site_nm_LC(info);
		else if (lc == columnRslt2_to_dlv_cd) doRslt2_to_dlv_cd_LC(info);
		else if (lc == columnRslt2_to_dlv_nm) doRslt2_to_dlv_nm_LC(info);
		else if (lc == columnRslt2_to_cst_cd) doRslt2_to_cst_cd_LC(info);
		else if (lc == columnRslt2_to_cst_nm) doRslt2_to_cst_nm_LC(info);
		else if (lc == columnRslt2_fr_dlv_cd) doRslt2_fr_dlv_cd_LC(info);
		else if (lc == columnRslt2_fr_dlv_nm) doRslt2_fr_dlv_nm_LC(info);
		else if (lc == columnRslt2_fr_cst_cd) doRslt2_fr_cst_cd_LC(info);
		else if (lc == columnRslt2_fr_cst_nm) doRslt2_fr_cst_nm_LC(info);
		else if (lc == columnRslt2_to_ym) doRslt2_to_ym_LC(info);
		else if (lc == columnRslt2_to_spln_vers) doRslt2_to_spln_vers_LC(info);
		else if (lc == columnRslt2_to_spln_itm_cd) doRslt2_to_spln_itm_cd_LC(info);
		else if (lc == columnRslt2_to_spln_itm_nm) doRslt2_to_spln_itm_nm_LC(info);
		else if (lc == columnRslt2_to_cur_cd) doRslt2_to_cur_cd_LC(info);
		else if (lc == columnRslt2_to_cur_nm) doRslt2_to_cur_nm_LC(info);
		else if (lc == columnRslt2_to_cst_frcst_no) doRslt2_to_cst_frcst_no_LC(info);
		else if (lc == columnRslt2_to_cst_frcst_d_no) doRslt2_to_cst_frcst_d_no_LC(info);
		else if (lc == columnRslt2_to_slo_no) doRslt2_to_slo_no_LC(info);
		else if (lc == columnRslt2_to_slo_d_no) doRslt2_to_slo_d_no_LC(info);
		else if (lc == columnRslt2_fr_ym) doRslt2_fr_ym_LC(info);
		else if (lc == columnRslt2_fr_spln_vers) doRslt2_fr_spln_vers_LC(info);
		else if (lc == columnRslt2_fr_spln_itm_cd) doRslt2_fr_spln_itm_cd_LC(info);
		else if (lc == columnRslt2_fr_spln_itm_nm) doRslt2_fr_spln_itm_nm_LC(info);
		else if (lc == columnRslt2_fr_cur_cd) doRslt2_fr_cur_cd_LC(info);
		else if (lc == columnRslt2_fr_cur_nm) doRslt2_fr_cur_nm_LC(info);
		else if (lc == columnRslt2_fr_cst_frcst_no) doRslt2_fr_cst_frcst_no_LC(info);
		else if (lc == columnRslt2_fr_cst_frcst_d_no) doRslt2_fr_cst_frcst_d_no_LC(info);
		else if (lc == columnRslt2_fr_slo_no) doRslt2_fr_slo_no_LC(info);
		else if (lc == columnRslt2_fr_slo_d_no) doRslt2_fr_slo_d_no_LC(info);
		else if (lc == columnRslt2_to_intr_rmrks) doRslt2_to_intr_rmrks_LC(info);
		else if (lc == columnRslt2_to_sub_char1) doRslt2_to_sub_char1_LC(info);
		else if (lc == columnRslt2_to_sub_char2) doRslt2_to_sub_char2_LC(info);
		else if (lc == columnRslt2_to_sub_char3) doRslt2_to_sub_char3_LC(info);
		else if (lc == columnRslt2_fr_intr_rmrks) doRslt2_fr_intr_rmrks_LC(info);
		else if (lc == columnRslt2_fr_sub_char1) doRslt2_fr_sub_char1_LC(info);
		else if (lc == columnRslt2_fr_sub_char2) doRslt2_fr_sub_char2_LC(info);
		else if (lc == columnRslt2_fr_sub_char3) doRslt2_fr_sub_char3_LC(info);
		else if (lc == columnRslt2_itm_typ) doRslt2_itm_typ_LC(info);
		else if (lc == columnRslt2_itm_typ_nm) doRslt2_itm_typ_nm_LC(info);
		else if (lc == columnRslt2_itm_typ_d_cd) doRslt2_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt2_itm_typ_d_nm) doRslt2_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt2_to_ins_usr_id) doRslt2_to_ins_usr_id_LC(info);
		else if (lc == columnRslt2_to_ins_usr_nm) doRslt2_to_ins_usr_nm_LC(info);
		else if (lc == columnRslt2_to_ins_func_id) doRslt2_to_ins_func_id_LC(info);
		else if (lc == columnRslt2_to_ins_func_nm) doRslt2_to_ins_func_nm_LC(info);
		else if (lc == columnRslt2_to_ins_ts) doRslt2_to_ins_ts_LC(info);
		else if (lc == columnRslt2_to_upd_usr_id) doRslt2_to_upd_usr_id_LC(info);
		else if (lc == columnRslt2_to_upd_usr_nm) doRslt2_to_upd_usr_nm_LC(info);
		else if (lc == columnRslt2_to_upd_func_id) doRslt2_to_upd_func_id_LC(info);
		else if (lc == columnRslt2_to_upd_func_nm) doRslt2_to_upd_func_nm_LC(info);
		else if (lc == columnRslt2_to_upd_ts) doRslt2_to_upd_ts_LC(info);
		else if (lc == columnRslt2_to_upd_srv_req_no) doRslt2_to_upd_srv_req_no_LC(info);
		else if (lc == columnRslt2_fr_ins_usr_id) doRslt2_fr_ins_usr_id_LC(info);
		else if (lc == columnRslt2_fr_ins_usr_nm) doRslt2_fr_ins_usr_nm_LC(info);
		else if (lc == columnRslt2_fr_ins_func_id) doRslt2_fr_ins_func_id_LC(info);
		else if (lc == columnRslt2_fr_ins_func_nm) doRslt2_fr_ins_func_nm_LC(info);
		else if (lc == columnRslt2_fr_ins_ts) doRslt2_fr_ins_ts_LC(info);
		else if (lc == columnRslt2_fr_upd_usr_id) doRslt2_fr_upd_usr_id_LC(info);
		else if (lc == columnRslt2_fr_upd_usr_nm) doRslt2_fr_upd_usr_nm_LC(info);
		else if (lc == columnRslt2_fr_upd_func_id) doRslt2_fr_upd_func_id_LC(info);
		else if (lc == columnRslt2_fr_upd_func_nm) doRslt2_fr_upd_func_nm_LC(info);
		else if (lc == columnRslt2_fr_upd_ts) doRslt2_fr_upd_ts_LC(info);
		else if (lc == columnRslt2_fr_upd_srv_req_no) doRslt2_fr_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmnd_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dmnd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmnd_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_LC(MCEventInfo info){
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
	 * [Rslt1]パネルの[dmnd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_schd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_schd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dmnd_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dmnd_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spln_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_cst_frcst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_schd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_schd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dmnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dmnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_schd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_schd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dmnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dmnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[dmnd_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_dmnd_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_spln_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_cst_frcst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_vers]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_vers_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_spln_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_cst_frcst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[to_upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_to_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fr_upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_dmnd_period_typ]の作成メソッド
	 */
	public MCList getCnd_dmnd_period_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPeriodTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dmnd_typ]の作成メソッド
	 */
	public MCList getCnd_dmnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDmndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dmnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_dmnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
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
	 * コンボ／リストのリスト[Cnd_usr_cd]の作成メソッド
	 */
	public MCList getCnd_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
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
	 * コンボ／リストのリスト[columnRslt1_dmnd_period_typ]の作成メソッド
	 */
	public MCList getRslt1_dmnd_period_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_dmnd_typ]の作成メソッド
	 */
	public MCList getRslt1_dmnd_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_dmnd_loc_cd]の作成メソッド
	 */
	public MCList getRslt1_dmnd_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_dlv_cd]の作成メソッド
	 */
	public MCList getRslt1_dlv_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_cst_cd]の作成メソッド
	 */
	public MCList getRslt1_cst_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_fr_dmnd_period_typ]の作成メソッド
	 */
	public MCList getRslt2_fr_dmnd_period_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_fr_dmnd_typ]の作成メソッド
	 */
	public MCList getRslt2_fr_dmnd_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_dmnd_loc_cd]の作成メソッド
	 */
	public MCList getRslt2_dmnd_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_to_dlv_cd]の作成メソッド
	 */
	public MCList getRslt2_to_dlv_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_to_cst_cd]の作成メソッド
	 */
	public MCList getRslt2_to_cst_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_fr_dlv_cd]の作成メソッド
	 */
	public MCList getRslt2_fr_dlv_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_fr_cst_cd]の作成メソッド
	 */
	public MCList getRslt2_fr_cst_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBAL0040.Srch01")) {
			return new MS_MSBAL0040_Srch01Bridge();
		}
		if (id.equals("MS.MSBAL0040.Srch02")) {
			return new MS_MSBAL0040_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBAL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBAL0040_Srch01Bridge() {
			p_MS_MSBAL0040_Srch01 = new MCParam(PDef.MS_MSBAL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBA.MSBAP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.class));

			p_MS_MSBAL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBA.MSBAP0040.CndR up0() {
			return (mcframe.clientMSBA.MSBAP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R>)down(0);
		}
		protected MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R> down1() {
			return (MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt1R.class));
			p_MS_MSBAL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0040_Srch01;
		}

		protected void show() {
			setRslt1L((MCList<mcframe.clientMSBA.MSBAP0040.Rslt1R>)p_MS_MSBAL0040_Srch01.getContainerParam().getDownBlock(0));
			setRslt2L((MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R>)p_MS_MSBAL0040_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRslt1L().clear();
			getRslt2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			result.add(getRslt2L());
			return result;
		}
	}
	/**
	 * [MS_MSBAL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0040_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0040_Srch02;

		/** コンストラクタ */
		protected MS_MSBAL0040_Srch02Bridge() {
			p_MS_MSBAL0040_Srch02 = new MCParam(PDef.MS_MSBAL0040_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0040_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBA.MSBAP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.class));

			p_MS_MSBAL0040_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0040_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0040_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0040_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0040_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBA.MSBAP0040.CndR up0() {
			return (mcframe.clientMSBA.MSBAP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0040.Rslt2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0040_Srch02;
		}

		protected void show() {
			setRslt2L((MCList<mcframe.clientMSBA.MSBAP0040.Rslt2R>)p_MS_MSBAL0040_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRslt2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt2L());
			return result;
		}
	}
}