package mcframe.clientMSBA.MSBAP0030;

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
import mcframe.clientMSBA.MSBAP0030.MSBAP_DmndListReg_MC.MS_MSBAL0030_Srch01Caller;
import mcframe.clientMSBA.MSBAP0030.MSBAP_DmndListReg_MC.MS_MSBAL0030_Srch02Caller;
import mcframe.clientMSBA.MSBAP0030.MSBAP_DmndListReg_MC.MS_MSBAL0030_Imp01Caller;
import mcframe.clientMSBA.MSBAP0030.MSBAP_DmndListReg_MC.MS_MSBAL0030_Upd01Caller;
import mcframe.clientMSBA.MSBAP0030.MSBAP_DmndListReg_MC.MS_MSBAL0030_Del01Caller;
import mcframe.clientMSBA.MSBAP0030.MSBAP_DmndListReg_MC.MS_MSBAL0030_Upd02Caller;

/**
 * 画面"MSBAP_DmndListReg"パネルクラスです。<p>
 *
 * 需要情報を一覧形式で登録する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAP_DmndListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBAP0030";

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
	// [DmndTyp]ブロック関連のField定義
	public MCPanel DmndTypPanel = null;
	public MCTitledBorder DmndTypTitledBorder = null;
	// [DmndTyp]ブロックの項目のField定義
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
	 * UPD,Create/Modify;DEL,Cancel;REF,View;INST,Create daily demand UPD,登録・訂正する;DEL,取り消す;REF,参照する;INST,日次需要を作成する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_INST = null;
	/**
	 * Other demand その他需要.<p>
	 *
	 */
	public MCCheckBox Cnd_misc = null;
	/**
	 * Other それ以外.<p>
	 *
	 */
	public MCCheckBox Cnd_othr = null;
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
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBA.MSBAP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dly_div_flg = null;
	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_no = null;
	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_st_dt = null;
	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_end_dt = null;
	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_dt = null;
	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_schd_st_dt = null;
	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_schd_end_dt = null;
	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_period_typ = null;
	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_period_typ_nm = null;
	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_typ = null;
	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_mng_typ = null;
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
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_input_qty_p_PPanel;
	public MCColumnConfig columnRslt_input_qty;// [Rslt]の[input_qty_p.qty]を[columnRslt_input_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_dmnd_qty_p_PPanel;
	public MCColumnConfig columnRslt_dmnd_qty;// [Rslt]の[dmnd_qty_p.qty]を[columnRslt_dmnd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rec_qty_p_PPanel;
	public MCColumnConfig columnRslt_rec_qty;// [Rslt]の[rec_qty_p.qty]を[columnRslt_rec_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_dmnd_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_dmnd_usr_cd;// [Rslt]の[dmnd_usr_dpt_p.usr_cd]を[columnRslt_dmnd_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dmnd_usr_nm;// [Rslt]の[dmnd_usr_dpt_p.usr_nm]を[columnRslt_dmnd_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dmnd_dpt_cd;// [Rslt]の[dmnd_usr_dpt_p.dpt_cd]を[columnRslt_dmnd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dmnd_dpt_nm;// [Rslt]の[dmnd_usr_dpt_p.dpt_nm]を[columnRslt_dmnd_dpt_nm]としてエイリアス定義。
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
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_loc_cd = null;
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_loc_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_loc_grp_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_lg_grp_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_site_nm = null;
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_to_lg_grp_cd = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_term_cd = null;
	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_ship_lt = null;
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_lt = null;
	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_dmnd_lt_flg = null;
	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_lt = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_date_div_mons = null;
	/**
	 * Plan month 計画月度.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Sales plan version 販売計画バージョン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_vers = null;
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_itm_cd = null;
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_spln_itm_nm = null;
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
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_no = null;
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_frcst_d_no = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dmnd_upd_cntr = null;
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
	 * Breakdown of details 詳細.<p>
	 *
	 */
	public MCButton Btn_open_DTL = null;
	/**
	 * Demand matching status list 需要消込状況照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBAP0040 = null;
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
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd02 = null;
	/**
	 * Cancel 取り消す.<p>
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
	/** [SRCH_INST]モードを表す定数 */
	public static final String SRCH_INST = "SRCH_INST";
	/** [INST]モードを表す定数 */
	public static final String INST = "INST";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH_DEL, DEL, SRCH, REF, SRCH_INST, INST};
	
	/** [MS_MSBAL0030_Srch01]のCallerの作成 */
	protected MSBAP_DmndListReg_MC.MS_MSBAL0030_Srch01Caller createMS_MSBAL0030_Srch01() {
		MSBAP_DmndListReg_MC.MS_MSBAL0030_Srch01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Srch01Bridge>
		caller = ((MSBAP_DmndListReg_MC)this).new MS_MSBAL0030_Srch01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Srch01Bridge>(
					(MSBAP_DmndListReg)this, new MS_MSBAL0030_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBAL0030_Srch01]の呼び出し */
	protected void callMS_MSBAL0030_Srch01() {
		MCCaller caller = createMS_MSBAL0030_Srch01();
		caller.exec();
	}
	/** [MS_MSBAL0030_Srch02]のCallerの作成 */
	protected MSBAP_DmndListReg_MC.MS_MSBAL0030_Srch02Caller createMS_MSBAL0030_Srch02() {
		MSBAP_DmndListReg_MC.MS_MSBAL0030_Srch02Caller<MSBAP_DmndListReg, MS_MSBAL0030_Srch02Bridge>
		caller = ((MSBAP_DmndListReg_MC)this).new MS_MSBAL0030_Srch02Caller<MSBAP_DmndListReg, MS_MSBAL0030_Srch02Bridge>(
					(MSBAP_DmndListReg)this, new MS_MSBAL0030_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBAL0030_Srch02]の呼び出し */
	protected void callMS_MSBAL0030_Srch02() {
		MCCaller caller = createMS_MSBAL0030_Srch02();
		caller.exec();
	}
	/** [MS_MSBAL0030_Imp01]のCallerの作成 */
	protected MSBAP_DmndListReg_MC.MS_MSBAL0030_Imp01Caller createMS_MSBAL0030_Imp01() {
		MSBAP_DmndListReg_MC.MS_MSBAL0030_Imp01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Imp01Bridge>
		caller = ((MSBAP_DmndListReg_MC)this).new MS_MSBAL0030_Imp01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Imp01Bridge>(
					(MSBAP_DmndListReg)this, new MS_MSBAL0030_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBAL0030_Imp01]の呼び出し */
	protected void callMS_MSBAL0030_Imp01() {
		MCCaller caller = createMS_MSBAL0030_Imp01();
		caller.exec();
	}
	/** [MS_MSBAL0030_Upd01]のCallerの作成 */
	protected MSBAP_DmndListReg_MC.MS_MSBAL0030_Upd01Caller createMS_MSBAL0030_Upd01() {
		MSBAP_DmndListReg_MC.MS_MSBAL0030_Upd01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Upd01Bridge>
		caller = ((MSBAP_DmndListReg_MC)this).new MS_MSBAL0030_Upd01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Upd01Bridge>(
					(MSBAP_DmndListReg)this, new MS_MSBAL0030_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBAL0030_Upd01]の呼び出し */
	protected void callMS_MSBAL0030_Upd01() {
		MCCaller caller = createMS_MSBAL0030_Upd01();
		caller.exec();
	}
	/** [MS_MSBAL0030_Del01]のCallerの作成 */
	protected MSBAP_DmndListReg_MC.MS_MSBAL0030_Del01Caller createMS_MSBAL0030_Del01() {
		MSBAP_DmndListReg_MC.MS_MSBAL0030_Del01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Del01Bridge>
		caller = ((MSBAP_DmndListReg_MC)this).new MS_MSBAL0030_Del01Caller<MSBAP_DmndListReg, MS_MSBAL0030_Del01Bridge>(
					(MSBAP_DmndListReg)this, new MS_MSBAL0030_Del01Bridge());
		return caller;
	}
	/** [MS_MSBAL0030_Del01]の呼び出し */
	protected void callMS_MSBAL0030_Del01() {
		MCCaller caller = createMS_MSBAL0030_Del01();
		caller.exec();
	}
	/** [MS_MSBAL0030_Upd02]のCallerの作成 */
	protected MSBAP_DmndListReg_MC.MS_MSBAL0030_Upd02Caller createMS_MSBAL0030_Upd02() {
		MSBAP_DmndListReg_MC.MS_MSBAL0030_Upd02Caller<MSBAP_DmndListReg, MS_MSBAL0030_Upd02Bridge>
		caller = ((MSBAP_DmndListReg_MC)this).new MS_MSBAL0030_Upd02Caller<MSBAP_DmndListReg, MS_MSBAL0030_Upd02Bridge>(
					(MSBAP_DmndListReg)this, new MS_MSBAL0030_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBAL0030_Upd02]の呼び出し */
	protected void callMS_MSBAL0030_Upd02() {
		MCCaller caller = createMS_MSBAL0030_Upd02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBA.MSBAP0030.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBA.MSBAP0030.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBA.MSBAP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBA.MSBAP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBA.MSBAP0030.CndR createCndR() {
		return mcframe.clientMSBA.MSBAP0030.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBA.MSBAP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBA.MSBAP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBA.MSBAP0030.RsltR createRsltR() {
		return mcframe.clientMSBA.MSBAP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBA.MSBAP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class);
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
		ret.add(DmndTypPanel);
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
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_DmndListReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBAP_DmndListReg_MC_A(String name) {
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
		MSBAP_DmndListReg_MC.jbCreateScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateDmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateTop((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateFold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateTab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateTab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateTab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateTab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateCnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateCnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateCnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateCnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateCtrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateRPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateRslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateBtn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbCreateEastBtn((MSBAP_DmndListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBAP_DmndListReg p) {
	}

	/**
	 * [DmndTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDmndTyp(MSBAP_DmndListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBAP_DmndListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBAP_DmndListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBAP_DmndListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBAP_DmndListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBAP_DmndListReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBAP_DmndListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBAP_DmndListReg p) {
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
	protected static void jbCreateCnd2(MSBAP_DmndListReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBAP_DmndListReg p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MSBAP_DmndListReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBAP_DmndListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBAP_DmndListReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBAP_DmndListReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$itm_p);
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
		p.Rslt_input_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$input_qty_p);
		p.Rslt_input_qty_p_PPanel.setName("Rslt.input_qty_p");
		p.columnRslt_input_qty = p.Rslt_input_qty_p_PPanel.columnQty_qty;
		p.columnRslt_input_qty.addAliasName("Rslt.input_qty", p);
		p.Rslt_dmnd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$dmnd_qty_p);
		p.Rslt_dmnd_qty_p_PPanel.setName("Rslt.dmnd_qty_p");
		p.columnRslt_dmnd_qty = p.Rslt_dmnd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_dmnd_qty.addAliasName("Rslt.dmnd_qty", p);
		p.Rslt_rec_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$rec_qty_p);
		p.Rslt_rec_qty_p_PPanel.setName("Rslt.rec_qty_p");
		p.columnRslt_rec_qty = p.Rslt_rec_qty_p_PPanel.columnQty_qty;
		p.columnRslt_rec_qty.addAliasName("Rslt.rec_qty", p);
		p.Rslt_dmnd_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$dmnd_usr_dpt_p);
		p.Rslt_dmnd_usr_dpt_p_PPanel.setName("Rslt.dmnd_usr_dpt_p");
		p.columnRslt_dmnd_usr_cd = p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_dmnd_usr_cd.addAliasName("Rslt.dmnd_usr_cd", p);
		p.columnRslt_dmnd_usr_nm = p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_dmnd_usr_nm.addAliasName("Rslt.dmnd_usr_nm", p);
		p.columnRslt_dmnd_dpt_cd = p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_dmnd_dpt_cd.addAliasName("Rslt.dmnd_dpt_cd", p);
		p.columnRslt_dmnd_dpt_nm = p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_dmnd_dpt_nm.addAliasName("Rslt.dmnd_dpt_nm", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$sno_wrk_no_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$itm_grp_p);
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
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$dlv_grp_p);
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
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0030.RsltR.$cst_grp_p);
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
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBAP_DmndListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBAP_DmndListReg p) {
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
	
	
	/** [Rslt_dmnd_period_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dmnd_period_typ_p = null;

	/**
	 * [Rslt_dmnd_period_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dmnd_period_typ_ListPutter() {
		if (Rslt_dmnd_period_typ_p == null) {
			Rslt_dmnd_period_typ_p = createRslt_dmnd_period_typ_ListPutter(columnRslt_dmnd_period_typ, "dmnd_period_typ", "dmnd_period_typ_nm");

		}
		return Rslt_dmnd_period_typ_p;
	}
	
	
	/** [Rslt_dmnd_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dmnd_typ_p = null;

	/**
	 * [Rslt_dmnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dmnd_typ_ListPutter() {
		if (Rslt_dmnd_typ_p == null) {
			Rslt_dmnd_typ_p = createRslt_dmnd_typ_ListPutter(columnRslt_dmnd_typ, "dmnd_typ", "dmnd_typ_nm");

		}
		return Rslt_dmnd_typ_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","ship_term_cd");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","ship_term_cd");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","ship_term_cd");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","ship_term_cd");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "dmnd_dpt_cd", "dmnd_dpt_nm");
		}
		return Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_dlv_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dlv_cd_p = null;

	/**
	 * [Rslt_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dlv_cd_ListPutter() {
		if (Rslt_dlv_cd_p == null) {
			Rslt_dlv_cd_p = createRslt_dlv_cd_ListPutter(columnRslt_dlv_cd, "dlv_cd", "dlv_nm","to_lg_grp_cd");

		}
		return Rslt_dlv_cd_p;
	}
	
	
	/** [Rslt_cst_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cst_cd_p = null;

	/**
	 * [Rslt_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cst_cd_ListPutter() {
		if (Rslt_cst_cd_p == null) {
			Rslt_cst_cd_p = createRslt_cst_cd_ListPutter(columnRslt_cst_cd, "cst_cd", "cst_nm","bp_ship_lt");

		}
		return Rslt_cst_cd_p;
	}
	
	
	/** [Rslt_dmnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dmnd_loc_cd_p = null;

	/**
	 * [Rslt_dmnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dmnd_loc_cd_ListPutter() {
		if (Rslt_dmnd_loc_cd_p == null) {
			Rslt_dmnd_loc_cd_p = createRslt_dmnd_loc_cd_ListPutter(columnRslt_dmnd_loc_cd, "dmnd_loc_cd", "dmnd_loc_nm","dmnd_wg_cd","dmnd_wg_nm","dmnd_site_cd","dmnd_site_nm","dmnd_loc_grp_cd","dmnd_loc_grp_nm","dmnd_lg_grp_cd","dmnd_lg_grp_nm","dmnd_site_cd","dmnd_site_nm");

		}
		return Rslt_dmnd_loc_cd_p;
	}
	
	
	/** [Rslt_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_term_cd_p = null;

	/**
	 * [Rslt_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_term_cd_ListPutter() {
		if (Rslt_ship_term_cd_p == null) {
			Rslt_ship_term_cd_p = createRslt_ship_term_cd_ListPutter(columnRslt_ship_term_cd, "ship_term_cd");

		}
		return Rslt_ship_term_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBAP_DmndListReg create(){
		MSBAP_DmndListReg p = new MSBAP_DmndListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBAP_DmndListReg create(String name){
		MSBAP_DmndListReg p = new MSBAP_DmndListReg(name);
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
		MSBAP_DmndListReg_MC.jbfInitScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitDmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitTop((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitFold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitTab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitTab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitTab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitTab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitCnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitCnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitCnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitCnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitCtrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitRPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitRslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitBtn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbfInitEastBtn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitDmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitTop((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitFold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitTab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitTab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitTab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitTab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitCnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitCnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitCnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitCnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitCtrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitRPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitRslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitBtn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.jbInitEastBtn((MSBAP_DmndListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DmndTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDmndTyp(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.DmndTypPanel = p.beansFactory.createPanel("DmndTyp");
		p.DmndTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBAP_DmndListReg p) {
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
	protected static void jbfInitTab1(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_INST = p.beansFactory.createRadioButton("Cnd.ope_INST");
		p.Cnd_misc = p.beansFactory.createCheckBox("Cnd.misc");
		p.Cnd_othr = p.beansFactory.createCheckBox("Cnd.othr");
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
	protected static void jbfInitCnd2(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_dly_div_flg = p.beansFactory.createTableColumn("Rslt.dly_div_flg", MCColumnType.CHECK);
		p.columnRslt_dmnd_no = p.beansFactory.createTableColumn("Rslt.dmnd_no", MCColumnType.TEXT);
		p.columnRslt_dmnd_st_dt = p.beansFactory.createTableColumn("Rslt.dmnd_st_dt", MCColumnType.DATE);
		p.columnRslt_dmnd_end_dt = p.beansFactory.createTableColumn("Rslt.dmnd_end_dt", MCColumnType.DATE);
		p.columnRslt_dmnd_dt = p.beansFactory.createTableColumn("Rslt.dmnd_dt", MCColumnType.DATE);
		p.columnRslt_dlv_schd_st_dt = p.beansFactory.createTableColumn("Rslt.dlv_schd_st_dt", MCColumnType.DATE);
		p.columnRslt_dlv_schd_end_dt = p.beansFactory.createTableColumn("Rslt.dlv_schd_end_dt", MCColumnType.DATE);
		p.columnRslt_dmnd_period_typ = p.beansFactory.createTableColumn("Rslt.dmnd_period_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_dmnd_period_typ_nm = p.beansFactory.createTableColumn("Rslt.dmnd_period_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dmnd_typ = p.beansFactory.createTableColumn("Rslt.dmnd_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_dmnd_typ_nm = p.beansFactory.createTableColumn("Rslt.dmnd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_nm = p.beansFactory.createTableColumn("Rslt.dlv_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_dmnd_loc_cd = p.beansFactory.createTableColumn("Rslt.dmnd_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_dmnd_loc_nm = p.beansFactory.createTableColumn("Rslt.dmnd_loc_nm", MCColumnType.TEXT);
		p.columnRslt_dmnd_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.dmnd_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_dmnd_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.dmnd_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_dmnd_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.dmnd_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_dmnd_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.dmnd_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_dmnd_wg_cd = p.beansFactory.createTableColumn("Rslt.dmnd_wg_cd", MCColumnType.TEXT);
		p.columnRslt_dmnd_wg_nm = p.beansFactory.createTableColumn("Rslt.dmnd_wg_nm", MCColumnType.TEXT);
		p.columnRslt_dmnd_site_cd = p.beansFactory.createTableColumn("Rslt.dmnd_site_cd", MCColumnType.TEXT);
		p.columnRslt_dmnd_site_nm = p.beansFactory.createTableColumn("Rslt.dmnd_site_nm", MCColumnType.TEXT);
		p.columnRslt_to_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.to_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_term_cd = p.beansFactory.createTableColumn("Rslt.ship_term_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_bp_ship_lt = p.beansFactory.createTableColumn("Rslt.bp_ship_lt", MCColumnType.NUMBER);
		p.columnRslt_xfr_lt = p.beansFactory.createTableColumn("Rslt.xfr_lt", MCColumnType.NUMBER);
		p.columnRslt_non_dmnd_lt_flg = p.beansFactory.createTableColumn("Rslt.non_dmnd_lt_flg", MCColumnType.CHECK);
		p.columnRslt_ship_lt = p.beansFactory.createTableColumn("Rslt.ship_lt", MCColumnType.NUMBER);
		p.columnRslt_dmnd_date_div_mons = p.beansFactory.createTableColumn("Rslt.dmnd_date_div_mons", MCColumnType.NUMBER);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_spln_vers = p.beansFactory.createTableColumn("Rslt.spln_vers", MCColumnType.TEXT);
		p.columnRslt_spln_itm_cd = p.beansFactory.createTableColumn("Rslt.spln_itm_cd", MCColumnType.TEXT);
		p.columnRslt_spln_itm_nm = p.beansFactory.createTableColumn("Rslt.spln_itm_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_cst_frcst_no = p.beansFactory.createTableColumn("Rslt.cst_frcst_no", MCColumnType.TEXT);
		p.columnRslt_cst_frcst_d_no = p.beansFactory.createTableColumn("Rslt.cst_frcst_d_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_dmnd_upd_cntr = p.beansFactory.createTableColumn("Rslt.dmnd_upd_cntr", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_DTL = p.beansFactory.createButton("Btn.open_DTL", "open");
		p.Btn_open_MSBAP0040 = p.beansFactory.createButton("Btn.open_MSBAP0040", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd02 = p.beansFactory.createButton("Btn.upd02", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.DmndTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DmndTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDmndTyp(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.DmndTypPanel.setBorder(p.DmndTypTitledBorder);
		p.add(p.DmndTypPanel);
		p.DmndTypPanel.setNextBeans(p.TopPanel);
		p.DmndTypPanel.setValueCheck(false);
		p.DmndTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DmndTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBAP_DmndListReg p) {
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
	protected static void jbInitFold(MSBAP_DmndListReg p) {
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
	protected static void jbInitTab1(MSBAP_DmndListReg p) {
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
	protected static void jbInitTab2(MSBAP_DmndListReg p) {
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
	protected static void jbInitTab3(MSBAP_DmndListReg p) {
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
	protected static void jbInitTab4(MSBAP_DmndListReg p) {
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
	protected static void jbInitCnd(MSBAP_DmndListReg p) {
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
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_INST);
		p.Cnd_ope_INST.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_INST);
		p.ScreenOpePanel.add(p.Cnd_ope_INST);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.ope_META);
		p.DmndTypPanel.add(p.Cnd_misc);
		p.DmndTypPanel.setLastBeans(p.Cnd_misc);
		p.Cnd_misc.setNextBeans(p.Cnd_othr);
		p.Cnd_misc.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.misc_META);
		p.DmndTypPanel.add(p.Cnd_othr);
		p.Cnd_othr.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.othr_META);
		p.CndPanel.add(p.Cnd_dmnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dmnd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dmnd_dt_fr);
		p.Cnd_dmnd_dt_fr.setNextBeans(p.Cnd_dmnd_dt_to);
		p.Cnd_dmnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_dt_fr_META);
		p.Cnd_dmnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dmnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dmnd_dt_to);
		p.Cnd_dmnd_dt_to.setNextBeans(p.Cnd_dmnd_period_typ);
		p.Cnd_dmnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_dt_to_META);
		p.Cnd_dmnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_dmnd_period_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dmnd_period_typ, true);
		p.Cnd_dmnd_period_typ.setLinkBeans(p.Cnd_dmnd_period_typ_nm);
		p.CndPanel.add(p.Cnd_dmnd_period_typ_Label);
		p.CndPanel.add(p.Cnd_dmnd_period_typ);
		p.Cnd_dmnd_period_typ.setNextBeans(p.Cnd_dmnd_period_typ_nm);
		p.Cnd_dmnd_period_typ.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_period_typ_META);
		p.CndPanel.add(p.Cnd_dmnd_period_typ_nm);
		p.Cnd_dmnd_period_typ_nm.setNextBeans(p.Cnd_dmnd_typ);
		p.Cnd_dmnd_period_typ_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_period_typ_nm_META);
		p.Cnd_dmnd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dmnd_typ, true);
		p.Cnd_dmnd_typ.setLinkBeans(p.Cnd_dmnd_typ_nm);
		p.CndPanel.add(p.Cnd_dmnd_typ_Label);
		p.CndPanel.add(p.Cnd_dmnd_typ);
		p.Cnd_dmnd_typ.setNextBeans(p.Cnd_dmnd_typ_nm);
		p.Cnd_dmnd_typ.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_typ_META);
		p.CndPanel.add(p.Cnd_dmnd_typ_nm);
		p.Cnd_dmnd_typ_nm.setNextBeans(p.Cnd_dmnd_loc_cd);
		p.Cnd_dmnd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_typ_nm_META);
		p.CndPanel.add(p.Cnd_dmnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_dmnd_loc_cd);
		p.Cnd_dmnd_loc_cd.setNextBeans(p.Cnd_dmnd_loc_nm);
		p.Cnd_dmnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_loc_cd_META);
		p.Cnd_dmnd_loc_cd.addLinkBeans(p.Cnd_dmnd_loc_nm);
		p.Cnd_dmnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dmnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_dmnd_loc_nm);
		p.Cnd_dmnd_loc_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_dmnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dmnd_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_dmnd_loc_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.Cnd_cst_cd.setLinkBeans(p.Cnd_cst_nm);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.cst_cd_META);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.Cnd_dlv_cd.setLinkBeans(p.Cnd_dlv_nm);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dlv_cd_META);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dlv_nm_META);
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
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_ym);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_spln_vers);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_spln_vers.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_spln_vers, true);
		p.CndPanel.add(p.Cnd_spln_vers_Label);
		p.CndPanel.add(p.Cnd_spln_vers);
		p.Cnd_spln_vers.setNextBeans(p.Cnd_spln_itm_cd);
		p.Cnd_spln_vers.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.spln_vers_META);
		p.CndPanel.add(p.Cnd_spln_itm_cd_Label);
		p.CndPanel.add(p.Cnd_spln_itm_cd);
		p.Cnd_spln_itm_cd.setNextBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.spln_itm_cd_META);
		p.Cnd_spln_itm_cd.addLinkBeans(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_spln_itm_cd, true);
		p.CndPanel.add(p.Cnd_spln_itm_nm);
		p.Cnd_spln_itm_nm.setNextBeans(p.Cnd_cst_frcst_no);
		p.Cnd_spln_itm_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.spln_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_spln_itm_nm, true);
		p.CndPanel.add(p.Cnd_cst_frcst_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_no);
		p.Cnd_cst_frcst_no.setNextBeans(p.Cnd_cst_frcst_d_no);
		p.Cnd_cst_frcst_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.cst_frcst_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_no, true);
		p.CndPanel.add(p.Cnd_cst_frcst_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_frcst_d_no);
		p.Cnd_cst_frcst_d_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_cst_frcst_d_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.cst_frcst_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_frcst_d_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0030.CndR.sub_char3_META);
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
	protected static void jbInitCnd2(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBAP_DmndListReg p) {
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
	protected static void jbInitRPnl(MSBAP_DmndListReg p) {
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
	protected static void jbInitRslt(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBAP_DmndListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_DTL.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_DTL);
		p.BtnPanel.setLastBeans(p.Btn_open_DTL);
		p.Btn_open_DTL.setNextBeans(p.Btn_open_MSBAP0040);
		p.Btn_open_MSBAP0040.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBAP0040);
		p.Btn_open_MSBAP0040.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
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
		p.Btn_upd.setNextBeans(p.Btn_upd02);
		p.Btn_upd02.setIcon("REGISTER");
		p.Btn_upd02.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd02);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBAP_DmndListReg p) {
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
		MSBAP_DmndListReg_MC.mcInitScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitDmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitTop((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitFold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitTab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitTab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitTab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitTab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitCnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitCnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitCnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitCnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitCtrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitRPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitRslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitBtn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.mcInitEastBtn((MSBAP_DmndListReg)this);

		// [UPD]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitUPD_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitUPD_EastBtn((MSBAP_DmndListReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitFIX__U_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitFIX__U_EastBtn((MSBAP_DmndListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__DEL_EastBtn((MSBAP_DmndListReg)this);

		// [DEL]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitDEL_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitDEL_EastBtn((MSBAP_DmndListReg)this);

		// [SRCH]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitSRCH_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH_EastBtn((MSBAP_DmndListReg)this);

		// [REF]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitREF_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitREF_EastBtn((MSBAP_DmndListReg)this);

		// [SRCH_INST]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitSRCH__INST_EastBtn((MSBAP_DmndListReg)this);

		// [INST]ステータスのモードの設定
		MSBAP_DmndListReg_MC.statusInitINST_ScreenOpe((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_DmndTyp((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Top((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Fold((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Tab1((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Tab2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Tab3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Tab4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Cnd((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Cnd2((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Cnd3((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Cnd4((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Ctrl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_RPnl((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Rslt((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_Btn((MSBAP_DmndListReg)this);
		MSBAP_DmndListReg_MC.statusInitINST_EastBtn((MSBAP_DmndListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBAP_DmndListReg p) {
	}

	/**
	 *  [DmndTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDmndTyp(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBAP_DmndListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBAP_DmndListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_INST.addAllListener(p);
		p.Cnd_misc.addAllListener(p);
		p.Cnd_othr.addAllListener(p);
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
	protected static void mcInitCnd2(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MSBAP_DmndListReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBAP_DmndListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBAP_DmndListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBAP_DmndListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_dly_div_flg.addAllListener(p);
		p.columnRslt_dmnd_no.addAllListener(p);
		p.columnRslt_dmnd_no.setListListener(p);
		p.columnRslt_dmnd_st_dt.addAllListener(p);
		p.columnRslt_dmnd_st_dt.setListListener(p);
		p.columnRslt_dmnd_end_dt.addAllListener(p);
		p.columnRslt_dmnd_end_dt.setListListener(p);
		p.columnRslt_dmnd_dt.addAllListener(p);
		p.columnRslt_dmnd_dt.setListListener(p);
		p.columnRslt_dlv_schd_st_dt.addAllListener(p);
		p.columnRslt_dlv_schd_st_dt.setListListener(p);
		p.columnRslt_dlv_schd_end_dt.addAllListener(p);
		p.columnRslt_dlv_schd_end_dt.setListListener(p);
		p.columnRslt_dmnd_period_typ.addAllListener(p);
		p.columnRslt_dmnd_period_typ.setListListener(p);
		p.columnRslt_dmnd_period_typ_nm.addAllListener(p);
		p.columnRslt_dmnd_period_typ_nm.setListListener(p);
		p.columnRslt_dmnd_typ.addAllListener(p);
		p.columnRslt_dmnd_typ.setListListener(p);
		p.columnRslt_dmnd_typ_nm.addAllListener(p);
		p.columnRslt_dmnd_typ_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dlv_nm.addAllListener(p);
		p.columnRslt_dlv_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_dmnd_loc_cd.addAllListener(p);
		p.columnRslt_dmnd_loc_cd.setListListener(p);
		p.columnRslt_dmnd_loc_nm.addAllListener(p);
		p.columnRslt_dmnd_loc_nm.setListListener(p);
		p.columnRslt_dmnd_loc_grp_cd.addAllListener(p);
		p.columnRslt_dmnd_loc_grp_cd.setListListener(p);
		p.columnRslt_dmnd_loc_grp_nm.addAllListener(p);
		p.columnRslt_dmnd_loc_grp_nm.setListListener(p);
		p.columnRslt_dmnd_lg_grp_cd.addAllListener(p);
		p.columnRslt_dmnd_lg_grp_cd.setListListener(p);
		p.columnRslt_dmnd_lg_grp_nm.addAllListener(p);
		p.columnRslt_dmnd_lg_grp_nm.setListListener(p);
		p.columnRslt_dmnd_wg_cd.addAllListener(p);
		p.columnRslt_dmnd_wg_cd.setListListener(p);
		p.columnRslt_dmnd_wg_nm.addAllListener(p);
		p.columnRslt_dmnd_wg_nm.setListListener(p);
		p.columnRslt_dmnd_site_cd.addAllListener(p);
		p.columnRslt_dmnd_site_cd.setListListener(p);
		p.columnRslt_dmnd_site_nm.addAllListener(p);
		p.columnRslt_dmnd_site_nm.setListListener(p);
		p.columnRslt_to_lg_grp_cd.addAllListener(p);
		p.columnRslt_to_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_term_cd.addAllListener(p);
		p.columnRslt_ship_term_cd.setListListener(p);
		p.columnRslt_bp_ship_lt.addAllListener(p);
		p.columnRslt_bp_ship_lt.setListListener(p);
		p.columnRslt_xfr_lt.addAllListener(p);
		p.columnRslt_xfr_lt.setListListener(p);
		p.columnRslt_non_dmnd_lt_flg.addAllListener(p);
		p.columnRslt_ship_lt.addAllListener(p);
		p.columnRslt_ship_lt.setListListener(p);
		p.columnRslt_dmnd_date_div_mons.addAllListener(p);
		p.columnRslt_dmnd_date_div_mons.setListListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_spln_vers.addAllListener(p);
		p.columnRslt_spln_vers.setListListener(p);
		p.columnRslt_spln_itm_cd.addAllListener(p);
		p.columnRslt_spln_itm_cd.setListListener(p);
		p.columnRslt_spln_itm_nm.addAllListener(p);
		p.columnRslt_spln_itm_nm.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_cst_frcst_no.addAllListener(p);
		p.columnRslt_cst_frcst_no.setListListener(p);
		p.columnRslt_cst_frcst_d_no.addAllListener(p);
		p.columnRslt_cst_frcst_d_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
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
		p.columnRslt_dmnd_upd_cntr.addAllListener(p);
		p.columnRslt_dmnd_upd_cntr.setListListener(p);
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
	protected static void mcInitBtn(MSBAP_DmndListReg p) {
		p.Btn_open_DTL.addAllListener(p);
		p.Btn_open_DTL.setAPMethodName("doBtn_open_DTL");
		p.Btn_open_MSBAP0040.addAllListener(p);
		p.Btn_open_MSBAP0040.setAPMethodName("doBtn_open_MSBAP0040");
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
		p.Btn_upd02.addAllListener(p);
		p.Btn_upd02.setAPMethodName("doBtn_upd02");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBAP_DmndListReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dmnd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dly_div_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_st_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dmnd_end_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dlv_schd_st_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_end_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rec_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dmnd_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_to_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRslt_dmnd_date_div_mons.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dmnd_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBAP0040.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd02.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dmnd_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dly_div_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rec_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_to_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_dmnd_date_div_mons.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dmnd_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBAP0040.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dmnd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dly_div_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_st_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_end_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_st_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_end_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rec_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_to_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_dmnd_date_div_mons.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MSBAP0040.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dmnd_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_dly_div_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rec_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_to_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_dmnd_date_div_mons.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dmnd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBAP0040.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dmnd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dly_div_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rec_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_to_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_dmnd_date_div_mons.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dmnd_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBAP0040.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dmnd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dly_div_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_schd_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rec_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_to_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_dmnd_date_div_mons.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_vers.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_spln_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_frcst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dmnd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBAP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd02.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dmnd_dt_fr.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_INST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.columnRslt_dly_div_flg.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.columnRslt_dmnd_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_st_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_end_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_st_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_end_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_period_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_typ_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_rec_qty_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_wg_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_wg_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_site_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_site_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_to_lg_grp_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_dmnd_date_div_mons.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.columnRslt_ym.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_spln_vers.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_spln_itm_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_spln_itm_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_cur_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_d_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_upd_cntr.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_open_MSBAP0040.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Btn_upd02.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_INST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_EastBtn(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINST_ScreenOpe(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[DmndTyp]ブロックのモードの設定
	 */
	protected static void statusInitINST_DmndTyp(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINST_Top(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINST_Fold(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINST_Tab1(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINST_Tab2(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINST_Tab3(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitINST_Tab4(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINST_Cnd(MSBAP_DmndListReg p){
		p.Cnd_ope_Group.putMode(p, INST, MCMode.REQUIRED);
		p.Cnd_misc.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_othr.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dmnd_dt_fr.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dmnd_dt_to.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dmnd_period_typ_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.Cnd_dmnd_typ.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dmnd_typ_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.Cnd_dmnd_loc_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dmnd_loc_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_usr_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_spln_vers.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_spln_itm_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_spln_itm_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_cst_frcst_no.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_cst_frcst_d_no.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [INST]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINST_Cnd2(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitINST_Cnd3(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitINST_Cnd4(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINST_Ctrl(MSBAP_DmndListReg p){

	}

	/**
	 * [INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINST_RPnl(MSBAP_DmndListReg p){
		p.RPnl_dwnld.putMode(p, INST, MCMode.DISABLE);

	}

	/**
	 * [INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINST_Rslt(MSBAP_DmndListReg p){
		p.columnRslt_check.putMode(p, INST, MCMode.REQUIRED);
		p.columnRslt_dly_div_flg.putMode(p, INST, MCMode.REQUIRED);
		p.columnRslt_dmnd_no.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_st_dt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_end_dt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_dt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_st_dt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_end_dt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_period_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_period_typ_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_typ_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, INST, MCMode.INVISIBLE);
		p.Rslt_input_qty_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_dmnd_qty_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_rec_qty_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_dmnd_usr_dpt_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_cst_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_cst_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_grp_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_loc_grp_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_lg_grp_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_lg_grp_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_wg_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_wg_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_site_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_site_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_to_lg_grp_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_bp_ship_lt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_xfr_lt.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_non_dmnd_lt_flg.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_ship_lt.putMode(p, INST, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_dmnd_date_div_mons.putMode(p, INST, MCMode.REQUIRED);
		p.columnRslt_ym.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_spln_vers.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_spln_itm_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_spln_itm_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_cur_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_no.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_cst_frcst_d_no.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_slo_d_no.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_dmnd_upd_cntr.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, INST, MCMode.INVISIBLE);

	}

	/**
	 * [INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINST_Btn(MSBAP_DmndListReg p){
		p.Btn_open_DTL.putMode(p, INST, MCMode.DISABLE);
		p.Btn_open_MSBAP0040.putMode(p, INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INST, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INST, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INST, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INST, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INST, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INST, MCMode.INVISIBLE);
		p.Btn_upd02.putMode(p, INST, MCMode.ENABLE);
		p.Btn_del.putMode(p, INST, MCMode.DISABLE);

	}

	/**
	 * [INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINST_EastBtn(MSBAP_DmndListReg p){

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
		MSBAP_DmndListReg_MC.setTableConfigRslt((MSBAP_DmndListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBAP_DmndListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_dly_div_flg.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dly_div_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dly_div_flg);
		p.columnRslt_dmnd_no.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_no);
		p.columnRslt_dmnd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_st_dt_META);
		p.columnRslt_dmnd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_st_dt);
		p.columnRslt_dmnd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_end_dt_META);
		p.columnRslt_dmnd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_end_dt);
		p.columnRslt_dmnd_dt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_dt_META);
		p.columnRslt_dmnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_dt);
		p.columnRslt_dlv_schd_st_dt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dlv_schd_st_dt_META);
		p.columnRslt_dlv_schd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_schd_st_dt);
		p.columnRslt_dlv_schd_end_dt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dlv_schd_end_dt_META);
		p.columnRslt_dlv_schd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_schd_end_dt);
		p.columnRslt_dmnd_period_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_period_typ_META);
		p.columnRslt_dmnd_period_typ.addLinkBeans(p.columnRslt_dmnd_period_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_period_typ);
		p.columnRslt_dmnd_period_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_period_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_period_typ_nm);
		p.columnRslt_dmnd_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_typ_META);
		p.columnRslt_dmnd_typ.addLinkBeans(p.columnRslt_dmnd_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_typ);
		p.columnRslt_dmnd_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_ship_term_cd);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_ship_term_cd);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_ship_term_cd);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_ship_term_cd);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_input_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_dmnd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_rec_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_dmnd_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_dmnd_dpt_nm);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dlv_cd_META);
		p.columnRslt_dlv_cd.setListType(MCListType.STRICT);
		p.columnRslt_dlv_cd.addLinkBeans(p.columnRslt_dlv_nm,p.columnRslt_to_lg_grp_cd);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dlv_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.cst_cd_META);
		p.columnRslt_cst_cd.setListType(MCListType.STRICT);
		p.columnRslt_cst_cd.addLinkBeans(p.columnRslt_cst_nm,p.columnRslt_bp_ship_lt);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_dmnd_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_loc_cd_META);
		p.columnRslt_dmnd_loc_cd.addLinkBeans(p.columnRslt_dmnd_loc_nm,p.columnRslt_dmnd_wg_cd,p.columnRslt_dmnd_wg_nm,p.columnRslt_dmnd_site_cd,p.columnRslt_dmnd_site_nm,p.columnRslt_dmnd_loc_grp_cd,p.columnRslt_dmnd_loc_grp_nm,p.columnRslt_dmnd_lg_grp_cd,p.columnRslt_dmnd_lg_grp_nm,p.columnRslt_dmnd_site_cd,p.columnRslt_dmnd_site_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_loc_cd);
		p.columnRslt_dmnd_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_loc_nm);
		p.columnRslt_dmnd_loc_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_loc_grp_cd);
		p.columnRslt_dmnd_loc_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_loc_grp_nm);
		p.columnRslt_dmnd_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_lg_grp_cd);
		p.columnRslt_dmnd_lg_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_lg_grp_nm);
		p.columnRslt_dmnd_wg_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_wg_cd);
		p.columnRslt_dmnd_wg_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_wg_nm);
		p.columnRslt_dmnd_site_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_site_cd);
		p.columnRslt_dmnd_site_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_site_nm);
		p.columnRslt_to_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.to_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_to_lg_grp_cd);
		p.columnRslt_ship_term_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ship_term_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_cd);
		p.columnRslt_bp_ship_lt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.bp_ship_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_ship_lt);
		p.columnRslt_xfr_lt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.xfr_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_lt);
		p.columnRslt_non_dmnd_lt_flg.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.non_dmnd_lt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_dmnd_lt_flg);
		p.columnRslt_ship_lt.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ship_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_lt);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_dmnd_date_div_mons.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_date_div_mons_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_date_div_mons);
		p.columnRslt_ym.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_spln_vers.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.spln_vers_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_vers);
		p.columnRslt_spln_itm_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.spln_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_itm_cd);
		p.columnRslt_spln_itm_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.spln_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_spln_itm_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_cst_frcst_no.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.cst_frcst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_no);
		p.columnRslt_cst_frcst_d_no.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.cst_frcst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_frcst_d_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_dmnd_upd_cntr.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.dmnd_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dmnd_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBA.MSBAP0030.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
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
		columnRslt_dmnd_period_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dmnd_period_typ.getListConfig().setPutter(getRslt_dmnd_period_typ_ListPutter());
		columnRslt_dmnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dmnd_typ.getListConfig().setPutter(getRslt_dmnd_typ_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_dlv_cd.getListConfig().setPutter(getRslt_dlv_cd_ListPutter());
		columnRslt_cst_cd.getListConfig().setPutter(getRslt_cst_cd_ListPutter());
		columnRslt_dmnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dmnd_loc_cd.getListConfig().setPutter(getRslt_dmnd_loc_cd_ListPutter());
		columnRslt_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_term_cd.getListConfig().setPutter(getRslt_ship_term_cd_ListPutter());
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
	 * この画面を[SRCH_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSTStatus() {
		status = SRCH_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSTStatus() {
		status = INST;
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
		else if (SRCH_INST.equals(status)) {
			setSRCH_INSTStatus();
		}
		else if (INST.equals(status)) {
			setINSTStatus();
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
	 * [Rslt_dmnd_period_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dmnd_period_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PeriodTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dmnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dmnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DmndTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_dmnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dmnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.DmndLoc");
		return lp;
	}
	 
	/**
	 * [Rslt_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
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
		if(combo == columnRslt_dmnd_period_typ) return getRslt_dmnd_period_typ(row, info);
		if(combo == columnRslt_dmnd_typ) return getRslt_dmnd_typ(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Rslt_dmnd_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_dlv_cd) return getRslt_dlv_cd(row, info);
		if(combo == columnRslt_cst_cd) return getRslt_cst_cd(row, info);
		if(combo == columnRslt_dmnd_loc_cd) return getRslt_dmnd_loc_cd(row, info);
		if(combo == columnRslt_ship_term_cd) return getRslt_ship_term_cd(row, info);
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
		else if (ap == Btn_open_MSBAP0040) doBtn_open_MSBAP0040(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd02) doBtn_upd02(info);
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
	 * [Btn]パネルの[open_DTL]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_DTL(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBAP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBAP0040(MCEventInfo info);

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
	 * [Btn]パネルの[upd02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd02(MCEventInfo info);

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
		if (vc == Cnd_misc) return doCnd_misc_VC(info);
		if (vc == Cnd_othr) return doCnd_othr_VC(info);
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
		if (vc == Cnd_cst_frcst_no) return doCnd_cst_frcst_no_VC(info);
		if (vc == Cnd_cst_frcst_d_no) return doCnd_cst_frcst_d_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_dly_div_flg) return doRslt_dly_div_flg_VC(info);
		if (vc == columnRslt_dmnd_no) return doRslt_dmnd_no_VC(info);
		if (vc == columnRslt_dmnd_st_dt) return doRslt_dmnd_st_dt_VC(info);
		if (vc == columnRslt_dmnd_end_dt) return doRslt_dmnd_end_dt_VC(info);
		if (vc == columnRslt_dmnd_dt) return doRslt_dmnd_dt_VC(info);
		if (vc == columnRslt_dlv_schd_st_dt) return doRslt_dlv_schd_st_dt_VC(info);
		if (vc == columnRslt_dlv_schd_end_dt) return doRslt_dlv_schd_end_dt_VC(info);
		if (vc == columnRslt_dmnd_period_typ) return doRslt_dmnd_period_typ_VC(info);
		if (vc == columnRslt_dmnd_period_typ_nm) return doRslt_dmnd_period_typ_nm_VC(info);
		if (vc == columnRslt_dmnd_typ) return doRslt_dmnd_typ_VC(info);
		if (vc == columnRslt_dmnd_typ_nm) return doRslt_dmnd_typ_nm_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dlv_nm) return doRslt_dlv_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_dmnd_loc_cd) return doRslt_dmnd_loc_cd_VC(info);
		if (vc == columnRslt_dmnd_loc_nm) return doRslt_dmnd_loc_nm_VC(info);
		if (vc == columnRslt_dmnd_loc_grp_cd) return doRslt_dmnd_loc_grp_cd_VC(info);
		if (vc == columnRslt_dmnd_loc_grp_nm) return doRslt_dmnd_loc_grp_nm_VC(info);
		if (vc == columnRslt_dmnd_lg_grp_cd) return doRslt_dmnd_lg_grp_cd_VC(info);
		if (vc == columnRslt_dmnd_lg_grp_nm) return doRslt_dmnd_lg_grp_nm_VC(info);
		if (vc == columnRslt_dmnd_wg_cd) return doRslt_dmnd_wg_cd_VC(info);
		if (vc == columnRslt_dmnd_wg_nm) return doRslt_dmnd_wg_nm_VC(info);
		if (vc == columnRslt_dmnd_site_cd) return doRslt_dmnd_site_cd_VC(info);
		if (vc == columnRslt_dmnd_site_nm) return doRslt_dmnd_site_nm_VC(info);
		if (vc == columnRslt_to_lg_grp_cd) return doRslt_to_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_term_cd) return doRslt_ship_term_cd_VC(info);
		if (vc == columnRslt_bp_ship_lt) return doRslt_bp_ship_lt_VC(info);
		if (vc == columnRslt_xfr_lt) return doRslt_xfr_lt_VC(info);
		if (vc == columnRslt_non_dmnd_lt_flg) return doRslt_non_dmnd_lt_flg_VC(info);
		if (vc == columnRslt_ship_lt) return doRslt_ship_lt_VC(info);
		if (vc == columnRslt_dmnd_date_div_mons) return doRslt_dmnd_date_div_mons_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_spln_vers) return doRslt_spln_vers_VC(info);
		if (vc == columnRslt_spln_itm_cd) return doRslt_spln_itm_cd_VC(info);
		if (vc == columnRslt_spln_itm_nm) return doRslt_spln_itm_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_cst_frcst_no) return doRslt_cst_frcst_no_VC(info);
		if (vc == columnRslt_cst_frcst_d_no) return doRslt_cst_frcst_d_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_dmnd_upd_cntr) return doRslt_dmnd_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[misc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_misc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[othr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_othr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dly_div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dly_div_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_schd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_schd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_schd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_schd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_period_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_period_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_ship_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_ship_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[non_dmnd_lt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_non_dmnd_lt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dmnd_date_div_mons]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_date_div_mons_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_spln_itm_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_frcst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dmnd_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_misc) doCnd_misc_NC(info);
		else if (nc == Cnd_othr) doCnd_othr_NC(info);
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
		else if (nc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NC(info);
		else if (nc == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_dly_div_flg) doRslt_dly_div_flg_NC(info);
		else if (nc == columnRslt_dmnd_no) doRslt_dmnd_no_NC(info);
		else if (nc == columnRslt_dmnd_st_dt) doRslt_dmnd_st_dt_NC(info);
		else if (nc == columnRslt_dmnd_end_dt) doRslt_dmnd_end_dt_NC(info);
		else if (nc == columnRslt_dmnd_dt) doRslt_dmnd_dt_NC(info);
		else if (nc == columnRslt_dlv_schd_st_dt) doRslt_dlv_schd_st_dt_NC(info);
		else if (nc == columnRslt_dlv_schd_end_dt) doRslt_dlv_schd_end_dt_NC(info);
		else if (nc == columnRslt_dmnd_period_typ) doRslt_dmnd_period_typ_NC(info);
		else if (nc == columnRslt_dmnd_period_typ_nm) doRslt_dmnd_period_typ_nm_NC(info);
		else if (nc == columnRslt_dmnd_typ) doRslt_dmnd_typ_NC(info);
		else if (nc == columnRslt_dmnd_typ_nm) doRslt_dmnd_typ_nm_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dlv_nm) doRslt_dlv_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_dmnd_loc_cd) doRslt_dmnd_loc_cd_NC(info);
		else if (nc == columnRslt_dmnd_loc_nm) doRslt_dmnd_loc_nm_NC(info);
		else if (nc == columnRslt_dmnd_loc_grp_cd) doRslt_dmnd_loc_grp_cd_NC(info);
		else if (nc == columnRslt_dmnd_loc_grp_nm) doRslt_dmnd_loc_grp_nm_NC(info);
		else if (nc == columnRslt_dmnd_lg_grp_cd) doRslt_dmnd_lg_grp_cd_NC(info);
		else if (nc == columnRslt_dmnd_lg_grp_nm) doRslt_dmnd_lg_grp_nm_NC(info);
		else if (nc == columnRslt_dmnd_wg_cd) doRslt_dmnd_wg_cd_NC(info);
		else if (nc == columnRslt_dmnd_wg_nm) doRslt_dmnd_wg_nm_NC(info);
		else if (nc == columnRslt_dmnd_site_cd) doRslt_dmnd_site_cd_NC(info);
		else if (nc == columnRslt_dmnd_site_nm) doRslt_dmnd_site_nm_NC(info);
		else if (nc == columnRslt_to_lg_grp_cd) doRslt_to_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_term_cd) doRslt_ship_term_cd_NC(info);
		else if (nc == columnRslt_bp_ship_lt) doRslt_bp_ship_lt_NC(info);
		else if (nc == columnRslt_xfr_lt) doRslt_xfr_lt_NC(info);
		else if (nc == columnRslt_non_dmnd_lt_flg) doRslt_non_dmnd_lt_flg_NC(info);
		else if (nc == columnRslt_ship_lt) doRslt_ship_lt_NC(info);
		else if (nc == columnRslt_dmnd_date_div_mons) doRslt_dmnd_date_div_mons_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_spln_vers) doRslt_spln_vers_NC(info);
		else if (nc == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_NC(info);
		else if (nc == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_NC(info);
		else if (nc == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_dmnd_upd_cntr) doRslt_dmnd_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[misc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_misc_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[othr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_othr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dly_div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dly_div_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_ship_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_ship_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dmnd_lt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dmnd_lt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_date_div_mons]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_date_div_mons_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_misc) doCnd_misc_NE(info);
		else if (ne == Cnd_othr) doCnd_othr_NE(info);
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
		else if (ne == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NE(info);
		else if (ne == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_dly_div_flg) doRslt_dly_div_flg_NE(info);
		else if (ne == columnRslt_dmnd_no) doRslt_dmnd_no_NE(info);
		else if (ne == columnRslt_dmnd_st_dt) doRslt_dmnd_st_dt_NE(info);
		else if (ne == columnRslt_dmnd_end_dt) doRslt_dmnd_end_dt_NE(info);
		else if (ne == columnRslt_dmnd_dt) doRslt_dmnd_dt_NE(info);
		else if (ne == columnRslt_dlv_schd_st_dt) doRslt_dlv_schd_st_dt_NE(info);
		else if (ne == columnRslt_dlv_schd_end_dt) doRslt_dlv_schd_end_dt_NE(info);
		else if (ne == columnRslt_dmnd_period_typ) doRslt_dmnd_period_typ_NE(info);
		else if (ne == columnRslt_dmnd_period_typ_nm) doRslt_dmnd_period_typ_nm_NE(info);
		else if (ne == columnRslt_dmnd_typ) doRslt_dmnd_typ_NE(info);
		else if (ne == columnRslt_dmnd_typ_nm) doRslt_dmnd_typ_nm_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dlv_nm) doRslt_dlv_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_dmnd_loc_cd) doRslt_dmnd_loc_cd_NE(info);
		else if (ne == columnRslt_dmnd_loc_nm) doRslt_dmnd_loc_nm_NE(info);
		else if (ne == columnRslt_dmnd_loc_grp_cd) doRslt_dmnd_loc_grp_cd_NE(info);
		else if (ne == columnRslt_dmnd_loc_grp_nm) doRslt_dmnd_loc_grp_nm_NE(info);
		else if (ne == columnRslt_dmnd_lg_grp_cd) doRslt_dmnd_lg_grp_cd_NE(info);
		else if (ne == columnRslt_dmnd_lg_grp_nm) doRslt_dmnd_lg_grp_nm_NE(info);
		else if (ne == columnRslt_dmnd_wg_cd) doRslt_dmnd_wg_cd_NE(info);
		else if (ne == columnRslt_dmnd_wg_nm) doRslt_dmnd_wg_nm_NE(info);
		else if (ne == columnRslt_dmnd_site_cd) doRslt_dmnd_site_cd_NE(info);
		else if (ne == columnRslt_dmnd_site_nm) doRslt_dmnd_site_nm_NE(info);
		else if (ne == columnRslt_to_lg_grp_cd) doRslt_to_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_term_cd) doRslt_ship_term_cd_NE(info);
		else if (ne == columnRslt_bp_ship_lt) doRslt_bp_ship_lt_NE(info);
		else if (ne == columnRslt_xfr_lt) doRslt_xfr_lt_NE(info);
		else if (ne == columnRslt_non_dmnd_lt_flg) doRslt_non_dmnd_lt_flg_NE(info);
		else if (ne == columnRslt_ship_lt) doRslt_ship_lt_NE(info);
		else if (ne == columnRslt_dmnd_date_div_mons) doRslt_dmnd_date_div_mons_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_spln_vers) doRslt_spln_vers_NE(info);
		else if (ne == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_NE(info);
		else if (ne == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_NE(info);
		else if (ne == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_dmnd_upd_cntr) doRslt_dmnd_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[misc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_misc_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[othr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_othr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dly_div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dly_div_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_ship_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_ship_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dmnd_lt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dmnd_lt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_date_div_mons]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_date_div_mons_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_misc) doCnd_misc_NX(info);
		else if (nx == Cnd_othr) doCnd_othr_NX(info);
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
		else if (nx == Cnd_cst_frcst_no) doCnd_cst_frcst_no_NX(info);
		else if (nx == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_dly_div_flg) doRslt_dly_div_flg_NX(info);
		else if (nx == columnRslt_dmnd_no) doRslt_dmnd_no_NX(info);
		else if (nx == columnRslt_dmnd_st_dt) doRslt_dmnd_st_dt_NX(info);
		else if (nx == columnRslt_dmnd_end_dt) doRslt_dmnd_end_dt_NX(info);
		else if (nx == columnRslt_dmnd_dt) doRslt_dmnd_dt_NX(info);
		else if (nx == columnRslt_dlv_schd_st_dt) doRslt_dlv_schd_st_dt_NX(info);
		else if (nx == columnRslt_dlv_schd_end_dt) doRslt_dlv_schd_end_dt_NX(info);
		else if (nx == columnRslt_dmnd_period_typ) doRslt_dmnd_period_typ_NX(info);
		else if (nx == columnRslt_dmnd_period_typ_nm) doRslt_dmnd_period_typ_nm_NX(info);
		else if (nx == columnRslt_dmnd_typ) doRslt_dmnd_typ_NX(info);
		else if (nx == columnRslt_dmnd_typ_nm) doRslt_dmnd_typ_nm_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dlv_nm) doRslt_dlv_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_dmnd_loc_cd) doRslt_dmnd_loc_cd_NX(info);
		else if (nx == columnRslt_dmnd_loc_nm) doRslt_dmnd_loc_nm_NX(info);
		else if (nx == columnRslt_dmnd_loc_grp_cd) doRslt_dmnd_loc_grp_cd_NX(info);
		else if (nx == columnRslt_dmnd_loc_grp_nm) doRslt_dmnd_loc_grp_nm_NX(info);
		else if (nx == columnRslt_dmnd_lg_grp_cd) doRslt_dmnd_lg_grp_cd_NX(info);
		else if (nx == columnRslt_dmnd_lg_grp_nm) doRslt_dmnd_lg_grp_nm_NX(info);
		else if (nx == columnRslt_dmnd_wg_cd) doRslt_dmnd_wg_cd_NX(info);
		else if (nx == columnRslt_dmnd_wg_nm) doRslt_dmnd_wg_nm_NX(info);
		else if (nx == columnRslt_dmnd_site_cd) doRslt_dmnd_site_cd_NX(info);
		else if (nx == columnRslt_dmnd_site_nm) doRslt_dmnd_site_nm_NX(info);
		else if (nx == columnRslt_to_lg_grp_cd) doRslt_to_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_term_cd) doRslt_ship_term_cd_NX(info);
		else if (nx == columnRslt_bp_ship_lt) doRslt_bp_ship_lt_NX(info);
		else if (nx == columnRslt_xfr_lt) doRslt_xfr_lt_NX(info);
		else if (nx == columnRslt_non_dmnd_lt_flg) doRslt_non_dmnd_lt_flg_NX(info);
		else if (nx == columnRslt_ship_lt) doRslt_ship_lt_NX(info);
		else if (nx == columnRslt_dmnd_date_div_mons) doRslt_dmnd_date_div_mons_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_spln_vers) doRslt_spln_vers_NX(info);
		else if (nx == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_NX(info);
		else if (nx == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_NX(info);
		else if (nx == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_dmnd_upd_cntr) doRslt_dmnd_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[misc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_misc_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[othr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_othr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dly_div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dly_div_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_ship_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_ship_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[non_dmnd_lt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_dmnd_lt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_date_div_mons]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_date_div_mons_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_upd_cntr_NX(MCEventInfo info){
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
		else if (lc == Cnd_cst_frcst_no) doCnd_cst_frcst_no_LC(info);
		else if (lc == Cnd_cst_frcst_d_no) doCnd_cst_frcst_d_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_dmnd_no) doRslt_dmnd_no_LC(info);
		else if (lc == columnRslt_dmnd_st_dt) doRslt_dmnd_st_dt_LC(info);
		else if (lc == columnRslt_dmnd_end_dt) doRslt_dmnd_end_dt_LC(info);
		else if (lc == columnRslt_dmnd_dt) doRslt_dmnd_dt_LC(info);
		else if (lc == columnRslt_dlv_schd_st_dt) doRslt_dlv_schd_st_dt_LC(info);
		else if (lc == columnRslt_dlv_schd_end_dt) doRslt_dlv_schd_end_dt_LC(info);
		else if (lc == columnRslt_dmnd_period_typ) doRslt_dmnd_period_typ_LC(info);
		else if (lc == columnRslt_dmnd_period_typ_nm) doRslt_dmnd_period_typ_nm_LC(info);
		else if (lc == columnRslt_dmnd_typ) doRslt_dmnd_typ_LC(info);
		else if (lc == columnRslt_dmnd_typ_nm) doRslt_dmnd_typ_nm_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dlv_nm) doRslt_dlv_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_dmnd_loc_cd) doRslt_dmnd_loc_cd_LC(info);
		else if (lc == columnRslt_dmnd_loc_nm) doRslt_dmnd_loc_nm_LC(info);
		else if (lc == columnRslt_dmnd_loc_grp_cd) doRslt_dmnd_loc_grp_cd_LC(info);
		else if (lc == columnRslt_dmnd_loc_grp_nm) doRslt_dmnd_loc_grp_nm_LC(info);
		else if (lc == columnRslt_dmnd_lg_grp_cd) doRslt_dmnd_lg_grp_cd_LC(info);
		else if (lc == columnRslt_dmnd_lg_grp_nm) doRslt_dmnd_lg_grp_nm_LC(info);
		else if (lc == columnRslt_dmnd_wg_cd) doRslt_dmnd_wg_cd_LC(info);
		else if (lc == columnRslt_dmnd_wg_nm) doRslt_dmnd_wg_nm_LC(info);
		else if (lc == columnRslt_dmnd_site_cd) doRslt_dmnd_site_cd_LC(info);
		else if (lc == columnRslt_dmnd_site_nm) doRslt_dmnd_site_nm_LC(info);
		else if (lc == columnRslt_to_lg_grp_cd) doRslt_to_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_term_cd) doRslt_ship_term_cd_LC(info);
		else if (lc == columnRslt_bp_ship_lt) doRslt_bp_ship_lt_LC(info);
		else if (lc == columnRslt_xfr_lt) doRslt_xfr_lt_LC(info);
		else if (lc == columnRslt_ship_lt) doRslt_ship_lt_LC(info);
		else if (lc == columnRslt_dmnd_date_div_mons) doRslt_dmnd_date_div_mons_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_spln_vers) doRslt_spln_vers_LC(info);
		else if (lc == columnRslt_spln_itm_cd) doRslt_spln_itm_cd_LC(info);
		else if (lc == columnRslt_spln_itm_nm) doRslt_spln_itm_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_cst_frcst_no) doRslt_cst_frcst_no_LC(info);
		else if (lc == columnRslt_cst_frcst_d_no) doRslt_cst_frcst_d_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_dmnd_upd_cntr) doRslt_dmnd_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
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
	 * [Rslt]パネルの[dmnd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_period_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_period_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_ship_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_ship_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dmnd_date_div_mons]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_date_div_mons_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_spln_itm_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_frcst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_frcst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_frcst_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dmnd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dmnd_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[columnRslt_dmnd_period_typ]の作成メソッド
	 */
	public MCList getRslt_dmnd_period_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPeriodTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dmnd_typ]の作成メソッド
	 */
	public MCList getRslt_dmnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDmndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_dmnd_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dlv_cd]の作成メソッド
	 */
	public MCList getRslt_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_cst_cd]の作成メソッド
	 */
	public MCList getRslt_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dmnd_loc_cd]の作成メソッド
	 */
	public MCList getRslt_dmnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getDmndLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_term_cd]の作成メソッド
	 */
	public MCList getRslt_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBAL0030.Srch01")) {
			return new MS_MSBAL0030_Srch01Bridge();
		}
		if (id.equals("MS.MSBAL0030.Srch02")) {
			return new MS_MSBAL0030_Srch02Bridge();
		}
		if (id.equals("MS.MSBAL0030.Imp01")) {
			return new MS_MSBAL0030_Imp01Bridge();
		}
		if (id.equals("MS.MSBAL0030.Upd01")) {
			return new MS_MSBAL0030_Upd01Bridge();
		}
		if (id.equals("MS.MSBAL0030.Del01")) {
			return new MS_MSBAL0030_Del01Bridge();
		}
		if (id.equals("MS.MSBAL0030.Upd02")) {
			return new MS_MSBAL0030_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBAL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0030_Srch01;

		/** コンストラクタ */
		protected MS_MSBAL0030_Srch01Bridge() {
			p_MS_MSBAL0030_Srch01 = new MCParam(PDef.MS_MSBAL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBA.MSBAP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));

			p_MS_MSBAL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBA.MSBAP0030.CndR up0() {
			return (mcframe.clientMSBA.MSBAP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)p_MS_MSBAL0030_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBAL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0030_Srch02;

		/** コンストラクタ */
		protected MS_MSBAL0030_Srch02Bridge() {
			p_MS_MSBAL0030_Srch02 = new MCParam(PDef.MS_MSBAL0030_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0030_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBA.MSBAP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));

			p_MS_MSBAL0030_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0030_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0030_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0030_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0030_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBA.MSBAP0030.CndR up0() {
			return (mcframe.clientMSBA.MSBAP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0030_Srch02.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0030_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)p_MS_MSBAL0030_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBAL0030_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0030_Imp01;

		/** コンストラクタ */
		protected MS_MSBAL0030_Imp01Bridge() {
			p_MS_MSBAL0030_Imp01 = new MCParam(PDef.MS_MSBAL0030_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0030_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));

			p_MS_MSBAL0030_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0030_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0030_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0030_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0030_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0030_Imp01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0030_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)p_MS_MSBAL0030_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBAL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0030_Upd01;

		/** コンストラクタ */
		protected MS_MSBAL0030_Upd01Bridge() {
			p_MS_MSBAL0030_Upd01 = new MCParam(PDef.MS_MSBAL0030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));

			p_MS_MSBAL0030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0030_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0030_Upd01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0030_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)p_MS_MSBAL0030_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBAL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0030_Del01;

		/** コンストラクタ */
		protected MS_MSBAL0030_Del01Bridge() {
			p_MS_MSBAL0030_Del01 = new MCParam(PDef.MS_MSBAL0030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));

			p_MS_MSBAL0030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0030_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0030_Del01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0030_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)p_MS_MSBAL0030_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBAL0030_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0030_Upd02;

		/** コンストラクタ */
		protected MS_MSBAL0030_Upd02Bridge() {
			p_MS_MSBAL0030_Upd02 = new MCParam(PDef.MS_MSBAL0030_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0030_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0030.RsltR.class));
			// Down

			p_MS_MSBAL0030_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0030_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0030_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0030_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0030_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0030.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBAL0030_Upd02;
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