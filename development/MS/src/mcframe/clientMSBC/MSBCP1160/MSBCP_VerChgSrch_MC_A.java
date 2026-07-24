package mcframe.clientMSBC.MSBCP1160;

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
import mcframe.clientMSBC.MSBCP1160.MSBCP_VerChgSrch_MC.MS_MSBCL1160_Srch01Caller;

/**
 * 画面"MSBCP_VerChgSrch"パネルクラスです。<p>
 *
 * 投入の版切替予定・実績の一覧照会画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_VerChgSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP1160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [CmplFlg]ブロック関連のField定義
	public MCPanel CmplFlgPanel = null;
	public MCTitledBorder CmplFlgTitledBorder = null;
	// [CmplFlg]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [TabSrch]ブロック関連のField定義
	public MCPanel TabSrchPanel = null;
	// [TabSrch]ブロックの項目のField定義
	// [TabChdGrp]ブロック関連のField定義
	public MCPanel TabChdGrpPanel = null;
	// [TabChdGrp]ブロックの項目のField定義
	// [TabParGrp]ブロック関連のField定義
	public MCPanel TabParGrpPanel = null;
	// [TabParGrp]ブロックの項目のField定義
	// [CndChd2]ブロック関連のField定義
	public MCPanel CndChd2Panel = null;
	// [CndChd2]ブロックの項目のField定義
	// [CndPar2]ブロック関連のField定義
	public MCPanel CndPar2Panel = null;
	// [CndPar2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public MCCheckBox Cnd_uncmpl_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_first_inst_st_p_PPanel;
	public MCDateField Cnd_first_inst_st_dt_fr;	// [Cnd]の[first_inst_st_p.ymd_fr]を[Cnd_first_inst_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_first_inst_st_hm_fr;	// [Cnd]の[first_inst_st_p.hm_fr]を[Cnd_first_inst_st_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_first_inst_st_dt_to;	// [Cnd]の[first_inst_st_p.ymd_to]を[Cnd_first_inst_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_first_inst_st_hm_to;	// [Cnd]の[first_inst_st_p.hm_to]を[Cnd_first_inst_st_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_first_act_st_p_PPanel;
	public MCDateField Cnd_first_act_st_dt_fr;	// [Cnd]の[first_act_st_p.ymd_fr]を[Cnd_first_act_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_first_act_st_hm_fr;	// [Cnd]の[first_act_st_p.hm_fr]を[Cnd_first_act_st_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_first_act_st_dt_to;	// [Cnd]の[first_act_st_p.ymd_to]を[Cnd_first_act_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_first_act_st_hm_to;	// [Cnd]の[first_act_st_p.hm_to]を[Cnd_first_act_st_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_last_act_st_p_PPanel;
	public MCDateField Cnd_last_act_st_dt_fr;	// [Cnd]の[last_act_st_p.ymd_fr]を[Cnd_last_act_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_last_act_st_hm_fr;	// [Cnd]の[last_act_st_p.hm_fr]を[Cnd_last_act_st_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_last_act_st_dt_to;	// [Cnd]の[last_act_st_p.ymd_to]を[Cnd_last_act_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_last_act_st_hm_to;	// [Cnd]の[last_act_st_p.hm_to]を[Cnd_last_act_st_hm_to]としてエイリアス定義。
	public MCLabel Cnd_purc_st_dt_fr_Label = null;
	/**
	 * Purchase application start date FROM 購買適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_st_dt_fr = null;
	public MCLabel Cnd_purc_st_dt_to_Label = null;
	/**
	 * Purchase application start date TO 購買適用開始日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_st_dt_to = null;
	public MCLabel Cnd_ver_chg_sts_typ_Label = null;
	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ver_chg_sts_typ = null;
	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_ver_chg_sts_typ_nm = null;
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
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_chd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_chd_itm_typ;	// [Cnd]の[chd_itm_typ_p.itm_typ]を[Cnd_chd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_typ_d_cd;	// [Cnd]の[chd_itm_typ_p.itm_typ_d_cd]を[Cnd_chd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_typ_d_nm;	// [Cnd]の[chd_itm_typ_p.itm_typ_d_nm]を[Cnd_chd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_chd_itm_p_PPanel;
	public MCTextField Cnd_chd_itm_cd;	// [Cnd]の[chd_itm_p.itm_cd]を[Cnd_chd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub1;	// [Cnd]の[chd_itm_p.itm_sub1]を[Cnd_chd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub2;	// [Cnd]の[chd_itm_p.itm_sub2]を[Cnd_chd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub3;	// [Cnd]の[chd_itm_p.itm_sub3]を[Cnd_chd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_nm;	// [Cnd]の[chd_itm_p.itm_nm]を[Cnd_chd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_par_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_par_itm_typ;	// [Cnd]の[par_itm_typ_p.itm_typ]を[Cnd_par_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_typ_d_cd;	// [Cnd]の[par_itm_typ_p.itm_typ_d_cd]を[Cnd_par_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_d_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_d_nm]を[Cnd_par_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_chd_itm_grp_p_PPanel;
	public MCLabel Cnd_chd_itm_grp_lab1;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab1]を[Cnd_chd_itm_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg1;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg1]を[Cnd_chd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd1;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd1]を[Cnd_chd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm1;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm1]を[Cnd_chd_itm_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab2;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab2]を[Cnd_chd_itm_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg2;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg2]を[Cnd_chd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd2;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd2]を[Cnd_chd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm2;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm2]を[Cnd_chd_itm_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab3;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab3]を[Cnd_chd_itm_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg3;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg3]を[Cnd_chd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd3;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd3]を[Cnd_chd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm3;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm3]を[Cnd_chd_itm_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab4;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab4]を[Cnd_chd_itm_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg4;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg4]を[Cnd_chd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd4;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd4]を[Cnd_chd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm4;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm4]を[Cnd_chd_itm_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab5;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab5]を[Cnd_chd_itm_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg5;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg5]を[Cnd_chd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd5;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd5]を[Cnd_chd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm5;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm5]を[Cnd_chd_itm_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab6;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab6]を[Cnd_chd_itm_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg6;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg6]を[Cnd_chd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd6;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd6]を[Cnd_chd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm6;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm6]を[Cnd_chd_itm_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab7;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab7]を[Cnd_chd_itm_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg7;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg7]を[Cnd_chd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd7;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd7]を[Cnd_chd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm7;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm7]を[Cnd_chd_itm_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab8;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab8]を[Cnd_chd_itm_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg8;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg8]を[Cnd_chd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd8;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd8]を[Cnd_chd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm8;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm8]を[Cnd_chd_itm_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab9;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab9]を[Cnd_chd_itm_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg9;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg9]を[Cnd_chd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd9;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd9]を[Cnd_chd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm9;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm9]を[Cnd_chd_itm_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_chd_itm_grp_lab10;	// [Cnd]の[chd_itm_grp_p.itm_grp_lab10]を[Cnd_chd_itm_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_chd_itm_grp_flg10;	// [Cnd]の[chd_itm_grp_p.itm_grp_flg10]を[Cnd_chd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_grp_cd10;	// [Cnd]の[chd_itm_grp_p.itm_grp_cd10]を[Cnd_chd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_grp_nm10;	// [Cnd]の[chd_itm_grp_p.itm_grp_nm10]を[Cnd_chd_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_par_itm_grp_p_PPanel;
	public MCLabel Cnd_par_itm_grp_lab1;	// [Cnd]の[par_itm_grp_p.itm_grp_lab1]を[Cnd_par_itm_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg1;	// [Cnd]の[par_itm_grp_p.itm_grp_flg1]を[Cnd_par_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd1;	// [Cnd]の[par_itm_grp_p.itm_grp_cd1]を[Cnd_par_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm1;	// [Cnd]の[par_itm_grp_p.itm_grp_nm1]を[Cnd_par_itm_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab2;	// [Cnd]の[par_itm_grp_p.itm_grp_lab2]を[Cnd_par_itm_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg2;	// [Cnd]の[par_itm_grp_p.itm_grp_flg2]を[Cnd_par_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd2;	// [Cnd]の[par_itm_grp_p.itm_grp_cd2]を[Cnd_par_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm2;	// [Cnd]の[par_itm_grp_p.itm_grp_nm2]を[Cnd_par_itm_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab3;	// [Cnd]の[par_itm_grp_p.itm_grp_lab3]を[Cnd_par_itm_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg3;	// [Cnd]の[par_itm_grp_p.itm_grp_flg3]を[Cnd_par_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd3;	// [Cnd]の[par_itm_grp_p.itm_grp_cd3]を[Cnd_par_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm3;	// [Cnd]の[par_itm_grp_p.itm_grp_nm3]を[Cnd_par_itm_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab4;	// [Cnd]の[par_itm_grp_p.itm_grp_lab4]を[Cnd_par_itm_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg4;	// [Cnd]の[par_itm_grp_p.itm_grp_flg4]を[Cnd_par_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd4;	// [Cnd]の[par_itm_grp_p.itm_grp_cd4]を[Cnd_par_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm4;	// [Cnd]の[par_itm_grp_p.itm_grp_nm4]を[Cnd_par_itm_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab5;	// [Cnd]の[par_itm_grp_p.itm_grp_lab5]を[Cnd_par_itm_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg5;	// [Cnd]の[par_itm_grp_p.itm_grp_flg5]を[Cnd_par_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd5;	// [Cnd]の[par_itm_grp_p.itm_grp_cd5]を[Cnd_par_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm5;	// [Cnd]の[par_itm_grp_p.itm_grp_nm5]を[Cnd_par_itm_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab6;	// [Cnd]の[par_itm_grp_p.itm_grp_lab6]を[Cnd_par_itm_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg6;	// [Cnd]の[par_itm_grp_p.itm_grp_flg6]を[Cnd_par_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd6;	// [Cnd]の[par_itm_grp_p.itm_grp_cd6]を[Cnd_par_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm6;	// [Cnd]の[par_itm_grp_p.itm_grp_nm6]を[Cnd_par_itm_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab7;	// [Cnd]の[par_itm_grp_p.itm_grp_lab7]を[Cnd_par_itm_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg7;	// [Cnd]の[par_itm_grp_p.itm_grp_flg7]を[Cnd_par_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd7;	// [Cnd]の[par_itm_grp_p.itm_grp_cd7]を[Cnd_par_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm7;	// [Cnd]の[par_itm_grp_p.itm_grp_nm7]を[Cnd_par_itm_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab8;	// [Cnd]の[par_itm_grp_p.itm_grp_lab8]を[Cnd_par_itm_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg8;	// [Cnd]の[par_itm_grp_p.itm_grp_flg8]を[Cnd_par_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd8;	// [Cnd]の[par_itm_grp_p.itm_grp_cd8]を[Cnd_par_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm8;	// [Cnd]の[par_itm_grp_p.itm_grp_nm8]を[Cnd_par_itm_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab9;	// [Cnd]の[par_itm_grp_p.itm_grp_lab9]を[Cnd_par_itm_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg9;	// [Cnd]の[par_itm_grp_p.itm_grp_flg9]を[Cnd_par_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd9;	// [Cnd]の[par_itm_grp_p.itm_grp_cd9]を[Cnd_par_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm9;	// [Cnd]の[par_itm_grp_p.itm_grp_nm9]を[Cnd_par_itm_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_par_itm_grp_lab10;	// [Cnd]の[par_itm_grp_p.itm_grp_lab10]を[Cnd_par_itm_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_par_itm_grp_flg10;	// [Cnd]の[par_itm_grp_p.itm_grp_flg10]を[Cnd_par_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_grp_cd10;	// [Cnd]の[par_itm_grp_p.itm_grp_cd10]を[Cnd_par_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_par_itm_grp_nm10;	// [Cnd]の[par_itm_grp_p.itm_grp_nm10]を[Cnd_par_itm_grp_nm10]としてエイリアス定義。
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP1160.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_chd_itm_p_PPanel;
	public MCColumnConfig columnDtl_chd_itm_cd;// [Dtl]の[chd_itm_p.itm_cd]を[columnDtl_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub1;// [Dtl]の[chd_itm_p.itm_sub1]を[columnDtl_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub2;// [Dtl]の[chd_itm_p.itm_sub2]を[columnDtl_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub3;// [Dtl]の[chd_itm_p.itm_sub3]を[columnDtl_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_nm;// [Dtl]の[chd_itm_p.itm_nm]を[columnDtl_chd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_par_itm_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_cd;// [Dtl]の[par_itm_p.itm_cd]を[columnDtl_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub1;// [Dtl]の[par_itm_p.itm_sub1]を[columnDtl_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub2;// [Dtl]の[par_itm_p.itm_sub2]を[columnDtl_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub3;// [Dtl]の[par_itm_p.itm_sub3]を[columnDtl_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_nm;// [Dtl]の[par_itm_p.itm_nm]を[columnDtl_par_itm_nm]としてエイリアス定義。
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_chg_sts_typ = null;
	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_chg_sts_typ_nm = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cmpl_flg = null;
	/**
	 * Application start date (Order) 適用開始日（指図）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_inst_st_dt = null;
	/**
	 * Application start time (Order) 適用開始時刻（指図）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_inst_st_hm = null;
	/**
	 * Start lot No. (Order) 開始ロットＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_inst_lot_no = null;
	/**
	 * Start sublot No. (Order) 開始サブロットＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_inst_sublot_no = null;
	/**
	 * Application start date (Result) 適用開始日（実績）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_act_st_dt = null;
	/**
	 * Application start time (Result) 適用開始時刻（実績）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_act_st_hm = null;
	/**
	 * Start lot No. (Result) 開始ロットＮＯ（実績）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_act_lot_no = null;
	/**
	 * Starting sublot No. (Result) 開始サブロットＮＯ（実績）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_act_sublot_no = null;
	/**
	 * Last start date 最終着手日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_act_st_dt = null;
	/**
	 * Last start time 最終着手時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_act_st_hm = null;
	/**
	 * Last lot No. 最終ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_act_lot_no = null;
	/**
	 * Last sublot No. 最終サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_act_sublot_no = null;
	/**
	 * Change remarks 切替備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_master_rmrks = null;
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
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_nm = null;
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
	 * Purchase application start date 購買適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_st_dt = null;
	/**
	 * Start mfg. order No. (Order) 開始製造指図ＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_mfg_inst_no = null;
	/**
	 * Start mfg. order No. (Result) 開始製造指図ＮＯ（実績）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_act_mfg_inst_no = null;
	/**
	 * First mfg. result No. 開始製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_first_mfg_act_no = null;
	/**
	 * Last mfg. order No. 最終製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_mfg_inst_no = null;
	/**
	 * Last mfg. result No. 最終製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_mfg_act_no = null;
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_nm = null;
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ = null;
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_nm = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_d_cd = null;
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Dtl_chd_itm_grp_p_PPanel;
	public MCColumnConfig columnDtl_chd_itm_grp_cd1;// [Dtl]の[chd_itm_grp_p.itm_grp_cd1]を[columnDtl_chd_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm1;// [Dtl]の[chd_itm_grp_p.itm_grp_nm1]を[columnDtl_chd_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd2;// [Dtl]の[chd_itm_grp_p.itm_grp_cd2]を[columnDtl_chd_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm2;// [Dtl]の[chd_itm_grp_p.itm_grp_nm2]を[columnDtl_chd_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd3;// [Dtl]の[chd_itm_grp_p.itm_grp_cd3]を[columnDtl_chd_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm3;// [Dtl]の[chd_itm_grp_p.itm_grp_nm3]を[columnDtl_chd_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd4;// [Dtl]の[chd_itm_grp_p.itm_grp_cd4]を[columnDtl_chd_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm4;// [Dtl]の[chd_itm_grp_p.itm_grp_nm4]を[columnDtl_chd_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd5;// [Dtl]の[chd_itm_grp_p.itm_grp_cd5]を[columnDtl_chd_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm5;// [Dtl]の[chd_itm_grp_p.itm_grp_nm5]を[columnDtl_chd_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd6;// [Dtl]の[chd_itm_grp_p.itm_grp_cd6]を[columnDtl_chd_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm6;// [Dtl]の[chd_itm_grp_p.itm_grp_nm6]を[columnDtl_chd_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd7;// [Dtl]の[chd_itm_grp_p.itm_grp_cd7]を[columnDtl_chd_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm7;// [Dtl]の[chd_itm_grp_p.itm_grp_nm7]を[columnDtl_chd_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd8;// [Dtl]の[chd_itm_grp_p.itm_grp_cd8]を[columnDtl_chd_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm8;// [Dtl]の[chd_itm_grp_p.itm_grp_nm8]を[columnDtl_chd_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd9;// [Dtl]の[chd_itm_grp_p.itm_grp_cd9]を[columnDtl_chd_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm9;// [Dtl]の[chd_itm_grp_p.itm_grp_nm9]を[columnDtl_chd_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_cd10;// [Dtl]の[chd_itm_grp_p.itm_grp_cd10]を[columnDtl_chd_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_grp_nm10;// [Dtl]の[chd_itm_grp_p.itm_grp_nm10]を[columnDtl_chd_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Dtl_par_itm_grp_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_grp_cd1;// [Dtl]の[par_itm_grp_p.itm_grp_cd1]を[columnDtl_par_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm1;// [Dtl]の[par_itm_grp_p.itm_grp_nm1]を[columnDtl_par_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd2;// [Dtl]の[par_itm_grp_p.itm_grp_cd2]を[columnDtl_par_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm2;// [Dtl]の[par_itm_grp_p.itm_grp_nm2]を[columnDtl_par_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd3;// [Dtl]の[par_itm_grp_p.itm_grp_cd3]を[columnDtl_par_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm3;// [Dtl]の[par_itm_grp_p.itm_grp_nm3]を[columnDtl_par_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd4;// [Dtl]の[par_itm_grp_p.itm_grp_cd4]を[columnDtl_par_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm4;// [Dtl]の[par_itm_grp_p.itm_grp_nm4]を[columnDtl_par_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd5;// [Dtl]の[par_itm_grp_p.itm_grp_cd5]を[columnDtl_par_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm5;// [Dtl]の[par_itm_grp_p.itm_grp_nm5]を[columnDtl_par_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd6;// [Dtl]の[par_itm_grp_p.itm_grp_cd6]を[columnDtl_par_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm6;// [Dtl]の[par_itm_grp_p.itm_grp_nm6]を[columnDtl_par_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd7;// [Dtl]の[par_itm_grp_p.itm_grp_cd7]を[columnDtl_par_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm7;// [Dtl]の[par_itm_grp_p.itm_grp_nm7]を[columnDtl_par_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd8;// [Dtl]の[par_itm_grp_p.itm_grp_cd8]を[columnDtl_par_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm8;// [Dtl]の[par_itm_grp_p.itm_grp_nm8]を[columnDtl_par_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd9;// [Dtl]の[par_itm_grp_p.itm_grp_cd9]を[columnDtl_par_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm9;// [Dtl]の[par_itm_grp_p.itm_grp_nm9]を[columnDtl_par_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_cd10;// [Dtl]の[par_itm_grp_p.itm_grp_cd10]を[columnDtl_par_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_grp_nm10;// [Dtl]の[par_itm_grp_p.itm_grp_nm10]を[columnDtl_par_itm_grp_nm10]としてエイリアス定義。
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MS_MSBCL1160_Srch01]のCallerの作成 */
	protected MSBCP_VerChgSrch_MC.MS_MSBCL1160_Srch01Caller createMS_MSBCL1160_Srch01() {
		MSBCP_VerChgSrch_MC.MS_MSBCL1160_Srch01Caller<MSBCP_VerChgSrch, MS_MSBCL1160_Srch01Bridge>
		caller = ((MSBCP_VerChgSrch_MC)this).new MS_MSBCL1160_Srch01Caller<MSBCP_VerChgSrch, MS_MSBCL1160_Srch01Bridge>(
					(MSBCP_VerChgSrch)this, new MS_MSBCL1160_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL1160_Srch01]の呼び出し */
	protected void callMS_MSBCL1160_Srch01() {
		MCCaller caller = createMS_MSBCL1160_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP1160.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP1160.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP1160.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1160.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1160.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP1160.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBC.MSBCP1160.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1160.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBC.MSBCP1160.DtlR createDtlR() {
		return mcframe.clientMSBC.MSBCP1160.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1160.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBC.MSBCP1160.DtlR.class);
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
		ret.add(CmplFlgPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(TabSrchPanel);
		ret.add(TabChdGrpPanel);
		ret.add(TabParGrpPanel);
		ret.add(CndChd2Panel);
		ret.add(CndPar2Panel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(DtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_VerChgSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_VerChgSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_VerChgSrch_MC.jbCreateCmplFlg((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateTop((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateFold((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateTabSrch((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateTabChdGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateTabParGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateCndChd2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateCndPar2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateCnd((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateCtrl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateRPnl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbCreateDtl((MSBCP_VerChgSrch)this);
	}

	/**
	 * [CmplFlg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCmplFlg(MSBCP_VerChgSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_VerChgSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_VerChgSrch p) {
	}

	/**
	 * [TabSrch]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTabSrch(MSBCP_VerChgSrch p) {
	}

	/**
	 * [TabChdGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTabChdGrp(MSBCP_VerChgSrch p) {
	}

	/**
	 * [TabParGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTabParGrp(MSBCP_VerChgSrch p) {
	}

	/**
	 * [CndChd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndChd2(MSBCP_VerChgSrch p) {
	}

	/**
	 * [CndPar2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndPar2(MSBCP_VerChgSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_VerChgSrch p) {
		p.Cnd_first_inst_st_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().first_inst_st_p());
		p.Cnd_first_inst_st_p_PPanel.setName("Cnd.first_inst_st_p");
		p.Cnd_first_inst_st_dt_fr = p.Cnd_first_inst_st_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_first_inst_st_dt_fr.addAliasName("Cnd.first_inst_st_dt_fr", p);
		p.Cnd_first_inst_st_hm_fr = p.Cnd_first_inst_st_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_first_inst_st_hm_fr.addAliasName("Cnd.first_inst_st_hm_fr", p);
		p.Cnd_first_inst_st_dt_to = p.Cnd_first_inst_st_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_first_inst_st_dt_to.addAliasName("Cnd.first_inst_st_dt_to", p);
		p.Cnd_first_inst_st_hm_to = p.Cnd_first_inst_st_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_first_inst_st_hm_to.addAliasName("Cnd.first_inst_st_hm_to", p);
		p.Cnd_first_act_st_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().first_act_st_p());
		p.Cnd_first_act_st_p_PPanel.setName("Cnd.first_act_st_p");
		p.Cnd_first_act_st_dt_fr = p.Cnd_first_act_st_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_first_act_st_dt_fr.addAliasName("Cnd.first_act_st_dt_fr", p);
		p.Cnd_first_act_st_hm_fr = p.Cnd_first_act_st_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_first_act_st_hm_fr.addAliasName("Cnd.first_act_st_hm_fr", p);
		p.Cnd_first_act_st_dt_to = p.Cnd_first_act_st_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_first_act_st_dt_to.addAliasName("Cnd.first_act_st_dt_to", p);
		p.Cnd_first_act_st_hm_to = p.Cnd_first_act_st_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_first_act_st_hm_to.addAliasName("Cnd.first_act_st_hm_to", p);
		p.Cnd_last_act_st_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().last_act_st_p());
		p.Cnd_last_act_st_p_PPanel.setName("Cnd.last_act_st_p");
		p.Cnd_last_act_st_dt_fr = p.Cnd_last_act_st_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_last_act_st_dt_fr.addAliasName("Cnd.last_act_st_dt_fr", p);
		p.Cnd_last_act_st_hm_fr = p.Cnd_last_act_st_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_last_act_st_hm_fr.addAliasName("Cnd.last_act_st_hm_fr", p);
		p.Cnd_last_act_st_dt_to = p.Cnd_last_act_st_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_last_act_st_dt_to.addAliasName("Cnd.last_act_st_dt_to", p);
		p.Cnd_last_act_st_hm_to = p.Cnd_last_act_st_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_last_act_st_hm_to.addAliasName("Cnd.last_act_st_hm_to", p);
		p.Cnd_chd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().chd_itm_typ_p());
		p.Cnd_chd_itm_typ_p_PPanel.setName("Cnd.chd_itm_typ_p");
		p.Cnd_chd_itm_typ = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_chd_itm_typ.addAliasName("Cnd.chd_itm_typ", p);
		p.Cnd_chd_itm_typ_d_cd = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_chd_itm_typ_d_cd.addAliasName("Cnd.chd_itm_typ_d_cd", p);
		p.Cnd_chd_itm_typ_d_nm = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_chd_itm_typ_d_nm.addAliasName("Cnd.chd_itm_typ_d_nm", p);
		p.Cnd_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().chd_itm_p());
		p.Cnd_chd_itm_p_PPanel.setName("Cnd.chd_itm_p");
		p.Cnd_chd_itm_cd = p.Cnd_chd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_chd_itm_cd.addAliasName("Cnd.chd_itm_cd", p);
		p.Cnd_chd_itm_sub1 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_chd_itm_sub1.addAliasName("Cnd.chd_itm_sub1", p);
		p.Cnd_chd_itm_sub2 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_chd_itm_sub2.addAliasName("Cnd.chd_itm_sub2", p);
		p.Cnd_chd_itm_sub3 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_chd_itm_sub3.addAliasName("Cnd.chd_itm_sub3", p);
		p.Cnd_chd_itm_nm = p.Cnd_chd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_chd_itm_nm.addAliasName("Cnd.chd_itm_nm", p);
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
		p.Cnd_par_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().par_itm_typ_p());
		p.Cnd_par_itm_typ_p_PPanel.setName("Cnd.par_itm_typ_p");
		p.Cnd_par_itm_typ = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_par_itm_typ.addAliasName("Cnd.par_itm_typ", p);
		p.Cnd_par_itm_typ_d_cd = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_par_itm_typ_d_cd.addAliasName("Cnd.par_itm_typ_d_cd", p);
		p.Cnd_par_itm_typ_d_nm = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_par_itm_typ_d_nm.addAliasName("Cnd.par_itm_typ_d_nm", p);
		p.Cnd_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().par_itm_p());
		p.Cnd_par_itm_p_PPanel.setName("Cnd.par_itm_p");
		p.Cnd_par_itm_cd = p.Cnd_par_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_par_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
		p.Cnd_sno_p_PPanel = mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.Sno_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.Sno_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.Sno_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.Sno_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_chd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().chd_itm_grp_p());
		p.Cnd_chd_itm_grp_p_PPanel.setName("Cnd.chd_itm_grp_p");
		p.Cnd_chd_itm_grp_lab1 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab1;
		p.Cnd_chd_itm_grp_lab1.addAliasName("Cnd.chd_itm_grp_lab1", p);
		p.Cnd_chd_itm_grp_flg1 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_chd_itm_grp_flg1.addAliasName("Cnd.chd_itm_grp_flg1", p);
		p.Cnd_chd_itm_grp_cd1 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_chd_itm_grp_cd1.addAliasName("Cnd.chd_itm_grp_cd1", p);
		p.Cnd_chd_itm_grp_nm1 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_chd_itm_grp_nm1.addAliasName("Cnd.chd_itm_grp_nm1", p);
		p.Cnd_chd_itm_grp_lab2 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab2;
		p.Cnd_chd_itm_grp_lab2.addAliasName("Cnd.chd_itm_grp_lab2", p);
		p.Cnd_chd_itm_grp_flg2 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_chd_itm_grp_flg2.addAliasName("Cnd.chd_itm_grp_flg2", p);
		p.Cnd_chd_itm_grp_cd2 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_chd_itm_grp_cd2.addAliasName("Cnd.chd_itm_grp_cd2", p);
		p.Cnd_chd_itm_grp_nm2 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_chd_itm_grp_nm2.addAliasName("Cnd.chd_itm_grp_nm2", p);
		p.Cnd_chd_itm_grp_lab3 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab3;
		p.Cnd_chd_itm_grp_lab3.addAliasName("Cnd.chd_itm_grp_lab3", p);
		p.Cnd_chd_itm_grp_flg3 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_chd_itm_grp_flg3.addAliasName("Cnd.chd_itm_grp_flg3", p);
		p.Cnd_chd_itm_grp_cd3 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_chd_itm_grp_cd3.addAliasName("Cnd.chd_itm_grp_cd3", p);
		p.Cnd_chd_itm_grp_nm3 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_chd_itm_grp_nm3.addAliasName("Cnd.chd_itm_grp_nm3", p);
		p.Cnd_chd_itm_grp_lab4 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab4;
		p.Cnd_chd_itm_grp_lab4.addAliasName("Cnd.chd_itm_grp_lab4", p);
		p.Cnd_chd_itm_grp_flg4 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_chd_itm_grp_flg4.addAliasName("Cnd.chd_itm_grp_flg4", p);
		p.Cnd_chd_itm_grp_cd4 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_chd_itm_grp_cd4.addAliasName("Cnd.chd_itm_grp_cd4", p);
		p.Cnd_chd_itm_grp_nm4 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_chd_itm_grp_nm4.addAliasName("Cnd.chd_itm_grp_nm4", p);
		p.Cnd_chd_itm_grp_lab5 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab5;
		p.Cnd_chd_itm_grp_lab5.addAliasName("Cnd.chd_itm_grp_lab5", p);
		p.Cnd_chd_itm_grp_flg5 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_chd_itm_grp_flg5.addAliasName("Cnd.chd_itm_grp_flg5", p);
		p.Cnd_chd_itm_grp_cd5 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_chd_itm_grp_cd5.addAliasName("Cnd.chd_itm_grp_cd5", p);
		p.Cnd_chd_itm_grp_nm5 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_chd_itm_grp_nm5.addAliasName("Cnd.chd_itm_grp_nm5", p);
		p.Cnd_chd_itm_grp_lab6 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab6;
		p.Cnd_chd_itm_grp_lab6.addAliasName("Cnd.chd_itm_grp_lab6", p);
		p.Cnd_chd_itm_grp_flg6 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_chd_itm_grp_flg6.addAliasName("Cnd.chd_itm_grp_flg6", p);
		p.Cnd_chd_itm_grp_cd6 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_chd_itm_grp_cd6.addAliasName("Cnd.chd_itm_grp_cd6", p);
		p.Cnd_chd_itm_grp_nm6 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_chd_itm_grp_nm6.addAliasName("Cnd.chd_itm_grp_nm6", p);
		p.Cnd_chd_itm_grp_lab7 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab7;
		p.Cnd_chd_itm_grp_lab7.addAliasName("Cnd.chd_itm_grp_lab7", p);
		p.Cnd_chd_itm_grp_flg7 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_chd_itm_grp_flg7.addAliasName("Cnd.chd_itm_grp_flg7", p);
		p.Cnd_chd_itm_grp_cd7 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_chd_itm_grp_cd7.addAliasName("Cnd.chd_itm_grp_cd7", p);
		p.Cnd_chd_itm_grp_nm7 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_chd_itm_grp_nm7.addAliasName("Cnd.chd_itm_grp_nm7", p);
		p.Cnd_chd_itm_grp_lab8 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab8;
		p.Cnd_chd_itm_grp_lab8.addAliasName("Cnd.chd_itm_grp_lab8", p);
		p.Cnd_chd_itm_grp_flg8 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_chd_itm_grp_flg8.addAliasName("Cnd.chd_itm_grp_flg8", p);
		p.Cnd_chd_itm_grp_cd8 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_chd_itm_grp_cd8.addAliasName("Cnd.chd_itm_grp_cd8", p);
		p.Cnd_chd_itm_grp_nm8 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_chd_itm_grp_nm8.addAliasName("Cnd.chd_itm_grp_nm8", p);
		p.Cnd_chd_itm_grp_lab9 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab9;
		p.Cnd_chd_itm_grp_lab9.addAliasName("Cnd.chd_itm_grp_lab9", p);
		p.Cnd_chd_itm_grp_flg9 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_chd_itm_grp_flg9.addAliasName("Cnd.chd_itm_grp_flg9", p);
		p.Cnd_chd_itm_grp_cd9 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_chd_itm_grp_cd9.addAliasName("Cnd.chd_itm_grp_cd9", p);
		p.Cnd_chd_itm_grp_nm9 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_chd_itm_grp_nm9.addAliasName("Cnd.chd_itm_grp_nm9", p);
		p.Cnd_chd_itm_grp_lab10 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab10;
		p.Cnd_chd_itm_grp_lab10.addAliasName("Cnd.chd_itm_grp_lab10", p);
		p.Cnd_chd_itm_grp_flg10 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_chd_itm_grp_flg10.addAliasName("Cnd.chd_itm_grp_flg10", p);
		p.Cnd_chd_itm_grp_cd10 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_chd_itm_grp_cd10.addAliasName("Cnd.chd_itm_grp_cd10", p);
		p.Cnd_chd_itm_grp_nm10 = p.Cnd_chd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_chd_itm_grp_nm10.addAliasName("Cnd.chd_itm_grp_nm10", p);
		p.Cnd_par_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().par_itm_grp_p());
		p.Cnd_par_itm_grp_p_PPanel.setName("Cnd.par_itm_grp_p");
		p.Cnd_par_itm_grp_lab1 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab1;
		p.Cnd_par_itm_grp_lab1.addAliasName("Cnd.par_itm_grp_lab1", p);
		p.Cnd_par_itm_grp_flg1 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_par_itm_grp_flg1.addAliasName("Cnd.par_itm_grp_flg1", p);
		p.Cnd_par_itm_grp_cd1 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_par_itm_grp_cd1.addAliasName("Cnd.par_itm_grp_cd1", p);
		p.Cnd_par_itm_grp_nm1 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_par_itm_grp_nm1.addAliasName("Cnd.par_itm_grp_nm1", p);
		p.Cnd_par_itm_grp_lab2 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab2;
		p.Cnd_par_itm_grp_lab2.addAliasName("Cnd.par_itm_grp_lab2", p);
		p.Cnd_par_itm_grp_flg2 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_par_itm_grp_flg2.addAliasName("Cnd.par_itm_grp_flg2", p);
		p.Cnd_par_itm_grp_cd2 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_par_itm_grp_cd2.addAliasName("Cnd.par_itm_grp_cd2", p);
		p.Cnd_par_itm_grp_nm2 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_par_itm_grp_nm2.addAliasName("Cnd.par_itm_grp_nm2", p);
		p.Cnd_par_itm_grp_lab3 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab3;
		p.Cnd_par_itm_grp_lab3.addAliasName("Cnd.par_itm_grp_lab3", p);
		p.Cnd_par_itm_grp_flg3 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_par_itm_grp_flg3.addAliasName("Cnd.par_itm_grp_flg3", p);
		p.Cnd_par_itm_grp_cd3 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_par_itm_grp_cd3.addAliasName("Cnd.par_itm_grp_cd3", p);
		p.Cnd_par_itm_grp_nm3 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_par_itm_grp_nm3.addAliasName("Cnd.par_itm_grp_nm3", p);
		p.Cnd_par_itm_grp_lab4 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab4;
		p.Cnd_par_itm_grp_lab4.addAliasName("Cnd.par_itm_grp_lab4", p);
		p.Cnd_par_itm_grp_flg4 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_par_itm_grp_flg4.addAliasName("Cnd.par_itm_grp_flg4", p);
		p.Cnd_par_itm_grp_cd4 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_par_itm_grp_cd4.addAliasName("Cnd.par_itm_grp_cd4", p);
		p.Cnd_par_itm_grp_nm4 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_par_itm_grp_nm4.addAliasName("Cnd.par_itm_grp_nm4", p);
		p.Cnd_par_itm_grp_lab5 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab5;
		p.Cnd_par_itm_grp_lab5.addAliasName("Cnd.par_itm_grp_lab5", p);
		p.Cnd_par_itm_grp_flg5 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_par_itm_grp_flg5.addAliasName("Cnd.par_itm_grp_flg5", p);
		p.Cnd_par_itm_grp_cd5 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_par_itm_grp_cd5.addAliasName("Cnd.par_itm_grp_cd5", p);
		p.Cnd_par_itm_grp_nm5 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_par_itm_grp_nm5.addAliasName("Cnd.par_itm_grp_nm5", p);
		p.Cnd_par_itm_grp_lab6 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab6;
		p.Cnd_par_itm_grp_lab6.addAliasName("Cnd.par_itm_grp_lab6", p);
		p.Cnd_par_itm_grp_flg6 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_par_itm_grp_flg6.addAliasName("Cnd.par_itm_grp_flg6", p);
		p.Cnd_par_itm_grp_cd6 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_par_itm_grp_cd6.addAliasName("Cnd.par_itm_grp_cd6", p);
		p.Cnd_par_itm_grp_nm6 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_par_itm_grp_nm6.addAliasName("Cnd.par_itm_grp_nm6", p);
		p.Cnd_par_itm_grp_lab7 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab7;
		p.Cnd_par_itm_grp_lab7.addAliasName("Cnd.par_itm_grp_lab7", p);
		p.Cnd_par_itm_grp_flg7 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_par_itm_grp_flg7.addAliasName("Cnd.par_itm_grp_flg7", p);
		p.Cnd_par_itm_grp_cd7 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_par_itm_grp_cd7.addAliasName("Cnd.par_itm_grp_cd7", p);
		p.Cnd_par_itm_grp_nm7 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_par_itm_grp_nm7.addAliasName("Cnd.par_itm_grp_nm7", p);
		p.Cnd_par_itm_grp_lab8 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab8;
		p.Cnd_par_itm_grp_lab8.addAliasName("Cnd.par_itm_grp_lab8", p);
		p.Cnd_par_itm_grp_flg8 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_par_itm_grp_flg8.addAliasName("Cnd.par_itm_grp_flg8", p);
		p.Cnd_par_itm_grp_cd8 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_par_itm_grp_cd8.addAliasName("Cnd.par_itm_grp_cd8", p);
		p.Cnd_par_itm_grp_nm8 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_par_itm_grp_nm8.addAliasName("Cnd.par_itm_grp_nm8", p);
		p.Cnd_par_itm_grp_lab9 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab9;
		p.Cnd_par_itm_grp_lab9.addAliasName("Cnd.par_itm_grp_lab9", p);
		p.Cnd_par_itm_grp_flg9 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_par_itm_grp_flg9.addAliasName("Cnd.par_itm_grp_flg9", p);
		p.Cnd_par_itm_grp_cd9 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_par_itm_grp_cd9.addAliasName("Cnd.par_itm_grp_cd9", p);
		p.Cnd_par_itm_grp_nm9 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_par_itm_grp_nm9.addAliasName("Cnd.par_itm_grp_nm9", p);
		p.Cnd_par_itm_grp_lab10 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_lab10;
		p.Cnd_par_itm_grp_lab10.addAliasName("Cnd.par_itm_grp_lab10", p);
		p.Cnd_par_itm_grp_flg10 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_par_itm_grp_flg10.addAliasName("Cnd.par_itm_grp_flg10", p);
		p.Cnd_par_itm_grp_cd10 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_par_itm_grp_cd10.addAliasName("Cnd.par_itm_grp_cd10", p);
		p.Cnd_par_itm_grp_nm10 = p.Cnd_par_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_par_itm_grp_nm10.addAliasName("Cnd.par_itm_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_VerChgSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_VerChgSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBCP_VerChgSrch p) {
		p.Dtl_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP1160.DtlR.$chd_itm_p);
		p.Dtl_chd_itm_p_PPanel.setName("Dtl.chd_itm_p");
		p.columnDtl_chd_itm_cd = p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_chd_itm_cd.addAliasName("Dtl.chd_itm_cd", p);
		p.columnDtl_chd_itm_sub1 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_chd_itm_sub1.addAliasName("Dtl.chd_itm_sub1", p);
		p.columnDtl_chd_itm_sub2 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_chd_itm_sub2.addAliasName("Dtl.chd_itm_sub2", p);
		p.columnDtl_chd_itm_sub3 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_chd_itm_sub3.addAliasName("Dtl.chd_itm_sub3", p);
		p.columnDtl_chd_itm_nm = p.Dtl_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_chd_itm_nm.addAliasName("Dtl.chd_itm_nm", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBC.MSBCP1160.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP1160.DtlR.$par_itm_p);
		p.Dtl_par_itm_p_PPanel.setName("Dtl.par_itm_p");
		p.columnDtl_par_itm_cd = p.Dtl_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_par_itm_cd.addAliasName("Dtl.par_itm_cd", p);
		p.columnDtl_par_itm_sub1 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_par_itm_sub1.addAliasName("Dtl.par_itm_sub1", p);
		p.columnDtl_par_itm_sub2 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_par_itm_sub2.addAliasName("Dtl.par_itm_sub2", p);
		p.columnDtl_par_itm_sub3 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_par_itm_sub3.addAliasName("Dtl.par_itm_sub3", p);
		p.columnDtl_par_itm_nm = p.Dtl_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_par_itm_nm.addAliasName("Dtl.par_itm_nm", p);
		p.Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBC.MSBCP1160.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.Dtl_chd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP1160.DtlR.$chd_itm_grp_p);
		p.Dtl_chd_itm_grp_p_PPanel.setName("Dtl.chd_itm_grp_p");
		p.columnDtl_chd_itm_grp_cd1 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnDtl_chd_itm_grp_cd1.addAliasName("Dtl.chd_itm_grp_cd1", p);
		p.columnDtl_chd_itm_grp_nm1 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnDtl_chd_itm_grp_nm1.addAliasName("Dtl.chd_itm_grp_nm1", p);
		p.columnDtl_chd_itm_grp_cd2 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnDtl_chd_itm_grp_cd2.addAliasName("Dtl.chd_itm_grp_cd2", p);
		p.columnDtl_chd_itm_grp_nm2 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnDtl_chd_itm_grp_nm2.addAliasName("Dtl.chd_itm_grp_nm2", p);
		p.columnDtl_chd_itm_grp_cd3 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnDtl_chd_itm_grp_cd3.addAliasName("Dtl.chd_itm_grp_cd3", p);
		p.columnDtl_chd_itm_grp_nm3 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnDtl_chd_itm_grp_nm3.addAliasName("Dtl.chd_itm_grp_nm3", p);
		p.columnDtl_chd_itm_grp_cd4 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnDtl_chd_itm_grp_cd4.addAliasName("Dtl.chd_itm_grp_cd4", p);
		p.columnDtl_chd_itm_grp_nm4 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnDtl_chd_itm_grp_nm4.addAliasName("Dtl.chd_itm_grp_nm4", p);
		p.columnDtl_chd_itm_grp_cd5 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnDtl_chd_itm_grp_cd5.addAliasName("Dtl.chd_itm_grp_cd5", p);
		p.columnDtl_chd_itm_grp_nm5 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnDtl_chd_itm_grp_nm5.addAliasName("Dtl.chd_itm_grp_nm5", p);
		p.columnDtl_chd_itm_grp_cd6 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnDtl_chd_itm_grp_cd6.addAliasName("Dtl.chd_itm_grp_cd6", p);
		p.columnDtl_chd_itm_grp_nm6 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnDtl_chd_itm_grp_nm6.addAliasName("Dtl.chd_itm_grp_nm6", p);
		p.columnDtl_chd_itm_grp_cd7 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnDtl_chd_itm_grp_cd7.addAliasName("Dtl.chd_itm_grp_cd7", p);
		p.columnDtl_chd_itm_grp_nm7 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnDtl_chd_itm_grp_nm7.addAliasName("Dtl.chd_itm_grp_nm7", p);
		p.columnDtl_chd_itm_grp_cd8 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnDtl_chd_itm_grp_cd8.addAliasName("Dtl.chd_itm_grp_cd8", p);
		p.columnDtl_chd_itm_grp_nm8 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnDtl_chd_itm_grp_nm8.addAliasName("Dtl.chd_itm_grp_nm8", p);
		p.columnDtl_chd_itm_grp_cd9 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnDtl_chd_itm_grp_cd9.addAliasName("Dtl.chd_itm_grp_cd9", p);
		p.columnDtl_chd_itm_grp_nm9 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnDtl_chd_itm_grp_nm9.addAliasName("Dtl.chd_itm_grp_nm9", p);
		p.columnDtl_chd_itm_grp_cd10 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnDtl_chd_itm_grp_cd10.addAliasName("Dtl.chd_itm_grp_cd10", p);
		p.columnDtl_chd_itm_grp_nm10 = p.Dtl_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnDtl_chd_itm_grp_nm10.addAliasName("Dtl.chd_itm_grp_nm10", p);
		p.Dtl_par_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP1160.DtlR.$par_itm_grp_p);
		p.Dtl_par_itm_grp_p_PPanel.setName("Dtl.par_itm_grp_p");
		p.columnDtl_par_itm_grp_cd1 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnDtl_par_itm_grp_cd1.addAliasName("Dtl.par_itm_grp_cd1", p);
		p.columnDtl_par_itm_grp_nm1 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnDtl_par_itm_grp_nm1.addAliasName("Dtl.par_itm_grp_nm1", p);
		p.columnDtl_par_itm_grp_cd2 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnDtl_par_itm_grp_cd2.addAliasName("Dtl.par_itm_grp_cd2", p);
		p.columnDtl_par_itm_grp_nm2 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnDtl_par_itm_grp_nm2.addAliasName("Dtl.par_itm_grp_nm2", p);
		p.columnDtl_par_itm_grp_cd3 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnDtl_par_itm_grp_cd3.addAliasName("Dtl.par_itm_grp_cd3", p);
		p.columnDtl_par_itm_grp_nm3 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnDtl_par_itm_grp_nm3.addAliasName("Dtl.par_itm_grp_nm3", p);
		p.columnDtl_par_itm_grp_cd4 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnDtl_par_itm_grp_cd4.addAliasName("Dtl.par_itm_grp_cd4", p);
		p.columnDtl_par_itm_grp_nm4 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnDtl_par_itm_grp_nm4.addAliasName("Dtl.par_itm_grp_nm4", p);
		p.columnDtl_par_itm_grp_cd5 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnDtl_par_itm_grp_cd5.addAliasName("Dtl.par_itm_grp_cd5", p);
		p.columnDtl_par_itm_grp_nm5 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnDtl_par_itm_grp_nm5.addAliasName("Dtl.par_itm_grp_nm5", p);
		p.columnDtl_par_itm_grp_cd6 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnDtl_par_itm_grp_cd6.addAliasName("Dtl.par_itm_grp_cd6", p);
		p.columnDtl_par_itm_grp_nm6 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnDtl_par_itm_grp_nm6.addAliasName("Dtl.par_itm_grp_nm6", p);
		p.columnDtl_par_itm_grp_cd7 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnDtl_par_itm_grp_cd7.addAliasName("Dtl.par_itm_grp_cd7", p);
		p.columnDtl_par_itm_grp_nm7 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnDtl_par_itm_grp_nm7.addAliasName("Dtl.par_itm_grp_nm7", p);
		p.columnDtl_par_itm_grp_cd8 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnDtl_par_itm_grp_cd8.addAliasName("Dtl.par_itm_grp_cd8", p);
		p.columnDtl_par_itm_grp_nm8 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnDtl_par_itm_grp_nm8.addAliasName("Dtl.par_itm_grp_nm8", p);
		p.columnDtl_par_itm_grp_cd9 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnDtl_par_itm_grp_cd9.addAliasName("Dtl.par_itm_grp_cd9", p);
		p.columnDtl_par_itm_grp_nm9 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnDtl_par_itm_grp_nm9.addAliasName("Dtl.par_itm_grp_nm9", p);
		p.columnDtl_par_itm_grp_cd10 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnDtl_par_itm_grp_cd10.addAliasName("Dtl.par_itm_grp_cd10", p);
		p.columnDtl_par_itm_grp_nm10 = p.Dtl_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnDtl_par_itm_grp_nm10.addAliasName("Dtl.par_itm_grp_nm10", p);
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

	
	/** [Cnd_ver_chg_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ver_chg_sts_typ_p = null;

	/**
	 * [Cnd_ver_chg_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ver_chg_sts_typ_ListPutter() {
		if (Cnd_ver_chg_sts_typ_p == null) {
			Cnd_ver_chg_sts_typ_p = createCnd_ver_chg_sts_typ_ListPutter(Cnd_ver_chg_sts_typ, "ver_chg_sts_typ", "ver_chg_sts_typ_nm");

		}
		return Cnd_ver_chg_sts_typ_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_VerChgSrch create(){
		MSBCP_VerChgSrch p = new MSBCP_VerChgSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_VerChgSrch create(String name){
		MSBCP_VerChgSrch p = new MSBCP_VerChgSrch(name);
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
		MSBCP_VerChgSrch_MC.jbfInitCmplFlg((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitTop((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitFold((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitTabSrch((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitTabChdGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitTabParGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitCndChd2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitCndPar2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitCnd((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitCtrl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitRPnl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbfInitDtl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitCmplFlg((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitTop((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitFold((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitTabSrch((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitTabChdGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitTabParGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitCndChd2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitCndPar2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitCnd((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitCtrl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitRPnl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.jbInitDtl((MSBCP_VerChgSrch)this);
	}

	/**
	 * [CmplFlg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCmplFlg(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CmplFlgPanel = p.beansFactory.createPanel("CmplFlg");
		p.CmplFlgTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [TabSrch]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTabSrch(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TabSrchPanel = p.beansFactory.createPanel("TabSrch");
		// ブロックの項目の初期化
	}

	/**
	 * [TabChdGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTabChdGrp(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TabChdGrpPanel = p.beansFactory.createPanel("TabChdGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [TabParGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTabParGrp(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TabParGrpPanel = p.beansFactory.createPanel("TabParGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [CndChd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndChd2(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CndChd2Panel = p.beansFactory.createPanel("CndChd2");
		// ブロックの項目の初期化
	}

	/**
	 * [CndPar2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndPar2(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CndPar2Panel = p.beansFactory.createPanel("CndPar2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_uncmpl_flg = p.beansFactory.createCheckBox("Cnd.uncmpl_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_purc_st_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_st_dt_fr_Label");
		p.Cnd_purc_st_dt_fr = p.beansFactory.createDateField("Cnd.purc_st_dt_fr");
		p.Cnd_purc_st_dt_fr.setLabel(p.Cnd_purc_st_dt_fr_Label);
		p.Cnd_purc_st_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_st_dt_to_Label");
		p.Cnd_purc_st_dt_to = p.beansFactory.createDateField("Cnd.purc_st_dt_to");
		p.Cnd_purc_st_dt_to.setLabel(p.Cnd_purc_st_dt_to_Label);
		p.Cnd_ver_chg_sts_typ_Label = p.beansFactory.createLabel("Cnd.ver_chg_sts_typ_Label");
		p.Cnd_ver_chg_sts_typ = p.beansFactory.createTextComboBox("Cnd.ver_chg_sts_typ");
		p.Cnd_ver_chg_sts_typ.setLabel(p.Cnd_ver_chg_sts_typ_Label);
		p.Cnd_ver_chg_sts_typ_nm = p.beansFactory.createTextField("Cnd.ver_chg_sts_typ_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
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
	protected static void jbfInitCtrl(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_ver_chg_sts_typ = p.beansFactory.createTableColumn("Dtl.ver_chg_sts_typ", MCColumnType.TEXT);
		p.columnDtl_ver_chg_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.ver_chg_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cmpl_flg = p.beansFactory.createTableColumn("Dtl.cmpl_flg", MCColumnType.CHECK);
		p.columnDtl_first_inst_st_dt = p.beansFactory.createTableColumn("Dtl.first_inst_st_dt", MCColumnType.DATE);
		p.columnDtl_first_inst_st_hm = p.beansFactory.createTableColumn("Dtl.first_inst_st_hm", MCColumnType.DATE);
		p.columnDtl_first_inst_lot_no = p.beansFactory.createTableColumn("Dtl.first_inst_lot_no", MCColumnType.TEXT);
		p.columnDtl_first_inst_sublot_no = p.beansFactory.createTableColumn("Dtl.first_inst_sublot_no", MCColumnType.TEXT);
		p.columnDtl_first_act_st_dt = p.beansFactory.createTableColumn("Dtl.first_act_st_dt", MCColumnType.DATE);
		p.columnDtl_first_act_st_hm = p.beansFactory.createTableColumn("Dtl.first_act_st_hm", MCColumnType.DATE);
		p.columnDtl_first_act_lot_no = p.beansFactory.createTableColumn("Dtl.first_act_lot_no", MCColumnType.TEXT);
		p.columnDtl_first_act_sublot_no = p.beansFactory.createTableColumn("Dtl.first_act_sublot_no", MCColumnType.TEXT);
		p.columnDtl_last_act_st_dt = p.beansFactory.createTableColumn("Dtl.last_act_st_dt", MCColumnType.DATE);
		p.columnDtl_last_act_st_hm = p.beansFactory.createTableColumn("Dtl.last_act_st_hm", MCColumnType.DATE);
		p.columnDtl_last_act_lot_no = p.beansFactory.createTableColumn("Dtl.last_act_lot_no", MCColumnType.TEXT);
		p.columnDtl_last_act_sublot_no = p.beansFactory.createTableColumn("Dtl.last_act_sublot_no", MCColumnType.TEXT);
		p.columnDtl_master_rmrks = p.beansFactory.createTableColumn("Dtl.master_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT);
		p.columnDtl_site_nm = p.beansFactory.createTableColumn("Dtl.site_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_purc_st_dt = p.beansFactory.createTableColumn("Dtl.purc_st_dt", MCColumnType.DATE);
		p.columnDtl_first_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.first_mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_first_act_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.first_act_mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_first_mfg_act_no = p.beansFactory.createTableColumn("Dtl.first_mfg_act_no", MCColumnType.TEXT);
		p.columnDtl_last_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.last_mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_last_mfg_act_no = p.beansFactory.createTableColumn("Dtl.last_mfg_act_no", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ = p.beansFactory.createTableColumn("Dtl.chd_itm_typ", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ = p.beansFactory.createTableColumn("Dtl.par_itm_typ", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [CmplFlg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCmplFlg(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CmplFlgPanel.setBorder(p.CmplFlgTitledBorder);
		p.add(p.CmplFlgPanel);
		p.setLastBeans(p.CmplFlgPanel);
		p.CmplFlgPanel.setNextBeans(p.TopPanel);
		p.CmplFlgPanel.setValueCheck(false);
		p.CmplFlgPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CmplFlgPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
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
	protected static void jbInitFold(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.TabSrchPanel, "Fold.Tab1");
		p.FoldTab.setLastBeans(p.TabSrchPanel);
		p.TabSrchPanel.setNextBeans(p.TabChdGrpPanel);
		p.FoldTab.add(p.TabChdGrpPanel, "Fold.Tab2");
		p.TabChdGrpPanel.setNextBeans(p.TabParGrpPanel);
		p.FoldTab.add(p.TabParGrpPanel, "Fold.Tab3");
	}

	/**
	 * [TabSrch]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTabSrch(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TabSrchPanel.setNextBeans(p.TabChdGrpPanel);
		p.TabSrchPanel.setValueCheck(false);
		p.TabSrchPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.TabSrchPanel.add(p.CndPanel, null);
		p.TabSrchPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [TabChdGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTabChdGrp(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TabChdGrpPanel.setNextBeans(p.TabParGrpPanel);
		p.TabChdGrpPanel.setValueCheck(false);
		p.TabChdGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.TabChdGrpPanel.add(p.CndChd2Panel, null);
		p.TabChdGrpPanel.setLastBeans(p.CndChd2Panel);
	}

	/**
	 * [TabParGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTabParGrp(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.TabParGrpPanel.setValueCheck(false);
		p.TabParGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.TabParGrpPanel.add(p.CndPar2Panel, null);
		p.TabParGrpPanel.setLastBeans(p.CndPar2Panel);
	}

	/**
	 * [CndChd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndChd2(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CndChd2Panel.setValueCheck(false);
		p.CndChd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [CndPar2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndPar2(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CndPar2Panel.setValueCheck(false);
		p.CndPar2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
		p.CmplFlgPanel.add(p.Cnd_uncmpl_flg);
		p.CmplFlgPanel.setLastBeans(p.Cnd_uncmpl_flg);
		p.Cnd_uncmpl_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_uncmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.uncmpl_flg_META);
		p.CmplFlgPanel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.cmpl_flg_META);
		p.CndPanel.add(p.Cnd_first_inst_st_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_first_inst_st_p_PPanel);
		p.Cnd_first_inst_st_p_PPanel.setNextBeans(p.Cnd_first_act_st_p_PPanel);
		p.CndPanel.add(p.Cnd_first_act_st_p_PPanel);
		p.Cnd_first_act_st_p_PPanel.setNextBeans(p.Cnd_last_act_st_p_PPanel);
		p.CndPanel.add(p.Cnd_last_act_st_p_PPanel);
		p.Cnd_last_act_st_p_PPanel.setNextBeans(p.Cnd_purc_st_dt_fr);
		p.CndPanel.add(p.Cnd_purc_st_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_st_dt_fr);
		p.Cnd_purc_st_dt_fr.setNextBeans(p.Cnd_purc_st_dt_to);
		p.Cnd_purc_st_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.purc_st_dt_fr_META);
		p.Cnd_purc_st_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_st_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_st_dt_to);
		p.Cnd_purc_st_dt_to.setNextBeans(p.Cnd_ver_chg_sts_typ);
		p.Cnd_purc_st_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.purc_st_dt_to_META);
		p.Cnd_purc_st_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_ver_chg_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ver_chg_sts_typ, true);
		p.Cnd_ver_chg_sts_typ.setLinkBeans(p.Cnd_ver_chg_sts_typ_nm);
		p.CndPanel.add(p.Cnd_ver_chg_sts_typ_Label);
		p.CndPanel.add(p.Cnd_ver_chg_sts_typ);
		p.Cnd_ver_chg_sts_typ.setNextBeans(p.Cnd_ver_chg_sts_typ_nm);
		p.Cnd_ver_chg_sts_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.ver_chg_sts_typ_META);
		p.CndPanel.add(p.Cnd_ver_chg_sts_typ_nm);
		p.Cnd_ver_chg_sts_typ_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_ver_chg_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.ver_chg_sts_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_ver_chg_sts_typ_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_chd_itm_typ_p_PPanel.setNextBeans(p.Cnd_chd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_chd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.CndPanel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_sub_char1);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1160.CndR.sub_char3_META);
		p.CndChd2Panel.add(p.Cnd_chd_itm_grp_p_PPanel);
		p.CndChd2Panel.setLastBeans(p.Cnd_chd_itm_grp_p_PPanel);
		p.CndPar2Panel.add(p.Cnd_par_itm_grp_p_PPanel);
		p.CndPar2Panel.setLastBeans(p.Cnd_par_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_VerChgSrch p) {
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
	protected static void jbInitRPnl(MSBCP_VerChgSrch p) {
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
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBCP_VerChgSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
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
		MSBCP_VerChgSrch_MC.mcInitCmplFlg((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitTop((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitFold((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitTabSrch((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitTabChdGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitTabParGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitCndChd2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitCndPar2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitCnd((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitCtrl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitRPnl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.mcInitDtl((MSBCP_VerChgSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_VerChgSrch_MC.statusInitSRCH_CmplFlg((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_Top((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_Fold((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_TabSrch((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_TabChdGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_TabParGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_CndChd2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_CndPar2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_Cnd((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_Ctrl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_RPnl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitSRCH_Dtl((MSBCP_VerChgSrch)this);

		// [REF]ステータスのモードの設定
		MSBCP_VerChgSrch_MC.statusInitREF_CmplFlg((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_Top((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_Fold((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_TabSrch((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_TabChdGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_TabParGrp((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_CndChd2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_CndPar2((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_Cnd((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_Ctrl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_RPnl((MSBCP_VerChgSrch)this);
		MSBCP_VerChgSrch_MC.statusInitREF_Dtl((MSBCP_VerChgSrch)this);

	}

	/**
	 *  [CmplFlg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCmplFlg(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_VerChgSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [TabSrch]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTabSrch(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [TabChdGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTabChdGrp(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [TabParGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTabParGrp(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [CndChd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndChd2(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [CndPar2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndPar2(MSBCP_VerChgSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_VerChgSrch p) {
		p.Cnd_uncmpl_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_purc_st_dt_fr.setListListener(p);
		p.Cnd_purc_st_dt_fr.addAllListener(p);
		p.Cnd_purc_st_dt_to.setListListener(p);
		p.Cnd_purc_st_dt_to.addAllListener(p);
		p.Cnd_ver_chg_sts_typ.setListListener(p);
		p.Cnd_ver_chg_sts_typ.addAllListener(p);
		p.Cnd_ver_chg_sts_typ_nm.setListListener(p);
		p.Cnd_ver_chg_sts_typ_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MSBCP_VerChgSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_VerChgSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBCP_VerChgSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_ver_chg_sts_typ.addAllListener(p);
		p.columnDtl_ver_chg_sts_typ.setListListener(p);
		p.columnDtl_ver_chg_sts_typ_nm.addAllListener(p);
		p.columnDtl_ver_chg_sts_typ_nm.setListListener(p);
		p.columnDtl_cmpl_flg.addAllListener(p);
		p.columnDtl_first_inst_st_dt.addAllListener(p);
		p.columnDtl_first_inst_st_dt.setListListener(p);
		p.columnDtl_first_inst_st_hm.addAllListener(p);
		p.columnDtl_first_inst_st_hm.setListListener(p);
		p.columnDtl_first_inst_lot_no.addAllListener(p);
		p.columnDtl_first_inst_lot_no.setListListener(p);
		p.columnDtl_first_inst_sublot_no.addAllListener(p);
		p.columnDtl_first_inst_sublot_no.setListListener(p);
		p.columnDtl_first_act_st_dt.addAllListener(p);
		p.columnDtl_first_act_st_dt.setListListener(p);
		p.columnDtl_first_act_st_hm.addAllListener(p);
		p.columnDtl_first_act_st_hm.setListListener(p);
		p.columnDtl_first_act_lot_no.addAllListener(p);
		p.columnDtl_first_act_lot_no.setListListener(p);
		p.columnDtl_first_act_sublot_no.addAllListener(p);
		p.columnDtl_first_act_sublot_no.setListListener(p);
		p.columnDtl_last_act_st_dt.addAllListener(p);
		p.columnDtl_last_act_st_dt.setListListener(p);
		p.columnDtl_last_act_st_hm.addAllListener(p);
		p.columnDtl_last_act_st_hm.setListListener(p);
		p.columnDtl_last_act_lot_no.addAllListener(p);
		p.columnDtl_last_act_lot_no.setListListener(p);
		p.columnDtl_last_act_sublot_no.addAllListener(p);
		p.columnDtl_last_act_sublot_no.setListListener(p);
		p.columnDtl_master_rmrks.addAllListener(p);
		p.columnDtl_master_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_site_nm.addAllListener(p);
		p.columnDtl_site_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_purc_st_dt.addAllListener(p);
		p.columnDtl_purc_st_dt.setListListener(p);
		p.columnDtl_first_mfg_inst_no.addAllListener(p);
		p.columnDtl_first_mfg_inst_no.setListListener(p);
		p.columnDtl_first_act_mfg_inst_no.addAllListener(p);
		p.columnDtl_first_act_mfg_inst_no.setListListener(p);
		p.columnDtl_first_mfg_act_no.addAllListener(p);
		p.columnDtl_first_mfg_act_no.setListListener(p);
		p.columnDtl_last_mfg_inst_no.addAllListener(p);
		p.columnDtl_last_mfg_inst_no.setListListener(p);
		p.columnDtl_last_mfg_act_no.addAllListener(p);
		p.columnDtl_last_mfg_act_no.setListListener(p);
		p.columnDtl_chd_itm_typ.addAllListener(p);
		p.columnDtl_chd_itm_typ.setListListener(p);
		p.columnDtl_chd_itm_typ_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_nm.setListListener(p);
		p.columnDtl_chd_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_cd.setListListener(p);
		p.columnDtl_chd_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_nm.setListListener(p);
		p.columnDtl_par_itm_typ.addAllListener(p);
		p.columnDtl_par_itm_typ.setListListener(p);
		p.columnDtl_par_itm_typ_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_nm.setListListener(p);
		p.columnDtl_par_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_par_itm_typ_d_cd.setListListener(p);
		p.columnDtl_par_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_d_nm.setListListener(p);
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
	 * [SRCH]ステータスの[CmplFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CmplFlg(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TabSrch(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[TabChdGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TabChdGrp(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[TabParGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TabParGrp(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[CndChd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CndChd2(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[CndPar2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CndPar2(MSBCP_VerChgSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_VerChgSrch p){
		p.Cnd_uncmpl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_first_inst_st_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_first_act_st_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_last_act_st_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_st_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_st_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ver_chg_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ver_chg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_VerChgSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBCP_VerChgSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBCP_VerChgSrch p){
		p.Dtl_chd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_ver_chg_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ver_chg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_inst_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_inst_st_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_inst_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_inst_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_act_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_act_st_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_act_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_act_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_act_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_act_st_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_act_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_act_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_master_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_act_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_first_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_chd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_par_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[CmplFlg]ブロックのモードの設定
	 */
	protected static void statusInitREF_CmplFlg(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF_TabSrch(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[TabChdGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_TabChdGrp(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[TabParGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_TabParGrp(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[CndChd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndChd2(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[CndPar2]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndPar2(MSBCP_VerChgSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_VerChgSrch p){
		p.Cnd_uncmpl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_first_inst_st_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_first_act_st_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_last_act_st_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_st_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_st_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ver_chg_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ver_chg_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_VerChgSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBCP_VerChgSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBCP_VerChgSrch p){
		p.Dtl_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_ver_chg_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ver_chg_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_inst_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_inst_st_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_inst_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_inst_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_act_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_act_st_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_act_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_act_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_act_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_act_st_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_act_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_act_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_master_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_act_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_first_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_chd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_par_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_VerChgSrch_MC.setTableConfigDtl((MSBCP_VerChgSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBCP_VerChgSrch p) {
		p.DtlTable.addTable(p.Dtl_chd_itm_p_PPanel.ItmTable);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoTable);
		p.columnDtl_ver_chg_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ver_chg_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_chg_sts_typ);
		p.columnDtl_ver_chg_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ver_chg_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_chg_sts_typ_nm);
		p.columnDtl_cmpl_flg.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.cmpl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cmpl_flg);
		p.columnDtl_first_inst_st_dt.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_inst_st_dt_META);
		p.columnDtl_first_inst_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_first_inst_st_dt);
		p.columnDtl_first_inst_st_hm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_inst_st_hm_META);
		p.columnDtl_first_inst_st_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_first_inst_st_hm);
		p.columnDtl_first_inst_lot_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_inst_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_inst_lot_no);
		p.columnDtl_first_inst_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_inst_sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_inst_sublot_no);
		p.columnDtl_first_act_st_dt.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_act_st_dt_META);
		p.columnDtl_first_act_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_first_act_st_dt);
		p.columnDtl_first_act_st_hm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_act_st_hm_META);
		p.columnDtl_first_act_st_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_first_act_st_hm);
		p.columnDtl_first_act_lot_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_act_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_act_lot_no);
		p.columnDtl_first_act_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_act_sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_act_sublot_no);
		p.columnDtl_last_act_st_dt.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.last_act_st_dt_META);
		p.columnDtl_last_act_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_last_act_st_dt);
		p.columnDtl_last_act_st_hm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.last_act_st_hm_META);
		p.columnDtl_last_act_st_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_last_act_st_hm);
		p.columnDtl_last_act_lot_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.last_act_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_act_lot_no);
		p.columnDtl_last_act_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.last_act_sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_act_sublot_no);
		p.columnDtl_master_rmrks.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.master_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_master_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_site_cd.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_site_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.site_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_purc_st_dt.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.purc_st_dt_META);
		p.columnDtl_purc_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_st_dt);
		p.columnDtl_first_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_mfg_inst_no);
		p.columnDtl_first_act_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_act_mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_act_mfg_inst_no);
		p.columnDtl_first_mfg_act_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.first_mfg_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_first_mfg_act_no);
		p.columnDtl_last_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.last_mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_mfg_inst_no);
		p.columnDtl_last_mfg_act_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.last_mfg_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_mfg_act_no);
		p.columnDtl_chd_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.chd_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ);
		p.columnDtl_chd_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.chd_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_nm);
		p.columnDtl_chd_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.chd_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_cd);
		p.columnDtl_chd_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.chd_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_nm);
		p.columnDtl_par_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.par_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ);
		p.columnDtl_par_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.par_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_nm);
		p.columnDtl_par_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.par_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_cd);
		p.columnDtl_par_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.par_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_nm);
		p.DtlTable.addTable(p.Dtl_chd_itm_grp_p_PPanel.ItmGrpTable);
		p.DtlTable.addTable(p.Dtl_par_itm_grp_p_PPanel.ItmGrpTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP1160.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ver_chg_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ver_chg_sts_typ.getListConfig().setPutter(getCnd_ver_chg_sts_typ_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_ver_chg_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ver_chg_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.VerChgStsTyp");
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
		lp.setListLogicId("MA.MAUAP0010.MfgWg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ver_chg_sts_typ) return getCnd_ver_chg_sts_typ(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
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
		if (vc == Cnd_uncmpl_flg) return doCnd_uncmpl_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_purc_st_dt_fr) return doCnd_purc_st_dt_fr_VC(info);
		if (vc == Cnd_purc_st_dt_to) return doCnd_purc_st_dt_to_VC(info);
		if (vc == Cnd_ver_chg_sts_typ) return doCnd_ver_chg_sts_typ_VC(info);
		if (vc == Cnd_ver_chg_sts_typ_nm) return doCnd_ver_chg_sts_typ_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_ver_chg_sts_typ) return doDtl_ver_chg_sts_typ_VC(info);
		if (vc == columnDtl_ver_chg_sts_typ_nm) return doDtl_ver_chg_sts_typ_nm_VC(info);
		if (vc == columnDtl_cmpl_flg) return doDtl_cmpl_flg_VC(info);
		if (vc == columnDtl_first_inst_st_dt) return doDtl_first_inst_st_dt_VC(info);
		if (vc == columnDtl_first_inst_st_hm) return doDtl_first_inst_st_hm_VC(info);
		if (vc == columnDtl_first_inst_lot_no) return doDtl_first_inst_lot_no_VC(info);
		if (vc == columnDtl_first_inst_sublot_no) return doDtl_first_inst_sublot_no_VC(info);
		if (vc == columnDtl_first_act_st_dt) return doDtl_first_act_st_dt_VC(info);
		if (vc == columnDtl_first_act_st_hm) return doDtl_first_act_st_hm_VC(info);
		if (vc == columnDtl_first_act_lot_no) return doDtl_first_act_lot_no_VC(info);
		if (vc == columnDtl_first_act_sublot_no) return doDtl_first_act_sublot_no_VC(info);
		if (vc == columnDtl_last_act_st_dt) return doDtl_last_act_st_dt_VC(info);
		if (vc == columnDtl_last_act_st_hm) return doDtl_last_act_st_hm_VC(info);
		if (vc == columnDtl_last_act_lot_no) return doDtl_last_act_lot_no_VC(info);
		if (vc == columnDtl_last_act_sublot_no) return doDtl_last_act_sublot_no_VC(info);
		if (vc == columnDtl_master_rmrks) return doDtl_master_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_site_nm) return doDtl_site_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_purc_st_dt) return doDtl_purc_st_dt_VC(info);
		if (vc == columnDtl_first_mfg_inst_no) return doDtl_first_mfg_inst_no_VC(info);
		if (vc == columnDtl_first_act_mfg_inst_no) return doDtl_first_act_mfg_inst_no_VC(info);
		if (vc == columnDtl_first_mfg_act_no) return doDtl_first_mfg_act_no_VC(info);
		if (vc == columnDtl_last_mfg_inst_no) return doDtl_last_mfg_inst_no_VC(info);
		if (vc == columnDtl_last_mfg_act_no) return doDtl_last_mfg_act_no_VC(info);
		if (vc == columnDtl_chd_itm_typ) return doDtl_chd_itm_typ_VC(info);
		if (vc == columnDtl_chd_itm_typ_nm) return doDtl_chd_itm_typ_nm_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_cd) return doDtl_chd_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_nm) return doDtl_chd_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_par_itm_typ) return doDtl_par_itm_typ_VC(info);
		if (vc == columnDtl_par_itm_typ_nm) return doDtl_par_itm_typ_nm_VC(info);
		if (vc == columnDtl_par_itm_typ_d_cd) return doDtl_par_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_par_itm_typ_d_nm) return doDtl_par_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
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
	 * [Cnd]パネルの[uncmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_uncmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_st_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_st_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ver_chg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ver_chg_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_chg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_chg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_inst_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_inst_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_inst_st_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_inst_st_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_inst_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_inst_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_inst_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_inst_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_act_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_act_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_act_st_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_act_st_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_act_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_act_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_act_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_act_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_act_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_act_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_act_st_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_act_st_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_act_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_act_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_act_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_act_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[master_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_master_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_act_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_act_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[first_mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_first_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_d_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_uncmpl_flg) doCnd_uncmpl_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_purc_st_dt_fr) doCnd_purc_st_dt_fr_NC(info);
		else if (nc == Cnd_purc_st_dt_to) doCnd_purc_st_dt_to_NC(info);
		else if (nc == Cnd_ver_chg_sts_typ) doCnd_ver_chg_sts_typ_NC(info);
		else if (nc == Cnd_ver_chg_sts_typ_nm) doCnd_ver_chg_sts_typ_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_ver_chg_sts_typ) doDtl_ver_chg_sts_typ_NC(info);
		else if (nc == columnDtl_ver_chg_sts_typ_nm) doDtl_ver_chg_sts_typ_nm_NC(info);
		else if (nc == columnDtl_cmpl_flg) doDtl_cmpl_flg_NC(info);
		else if (nc == columnDtl_first_inst_st_dt) doDtl_first_inst_st_dt_NC(info);
		else if (nc == columnDtl_first_inst_st_hm) doDtl_first_inst_st_hm_NC(info);
		else if (nc == columnDtl_first_inst_lot_no) doDtl_first_inst_lot_no_NC(info);
		else if (nc == columnDtl_first_inst_sublot_no) doDtl_first_inst_sublot_no_NC(info);
		else if (nc == columnDtl_first_act_st_dt) doDtl_first_act_st_dt_NC(info);
		else if (nc == columnDtl_first_act_st_hm) doDtl_first_act_st_hm_NC(info);
		else if (nc == columnDtl_first_act_lot_no) doDtl_first_act_lot_no_NC(info);
		else if (nc == columnDtl_first_act_sublot_no) doDtl_first_act_sublot_no_NC(info);
		else if (nc == columnDtl_last_act_st_dt) doDtl_last_act_st_dt_NC(info);
		else if (nc == columnDtl_last_act_st_hm) doDtl_last_act_st_hm_NC(info);
		else if (nc == columnDtl_last_act_lot_no) doDtl_last_act_lot_no_NC(info);
		else if (nc == columnDtl_last_act_sublot_no) doDtl_last_act_sublot_no_NC(info);
		else if (nc == columnDtl_master_rmrks) doDtl_master_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_site_nm) doDtl_site_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_purc_st_dt) doDtl_purc_st_dt_NC(info);
		else if (nc == columnDtl_first_mfg_inst_no) doDtl_first_mfg_inst_no_NC(info);
		else if (nc == columnDtl_first_act_mfg_inst_no) doDtl_first_act_mfg_inst_no_NC(info);
		else if (nc == columnDtl_first_mfg_act_no) doDtl_first_mfg_act_no_NC(info);
		else if (nc == columnDtl_last_mfg_inst_no) doDtl_last_mfg_inst_no_NC(info);
		else if (nc == columnDtl_last_mfg_act_no) doDtl_last_mfg_act_no_NC(info);
		else if (nc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NC(info);
		else if (nc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ) doDtl_par_itm_typ_NC(info);
		else if (nc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
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
	 * [Cnd]パネルの[uncmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_uncmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_hm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_hm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_hm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[master_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_master_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_uncmpl_flg) doCnd_uncmpl_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_purc_st_dt_fr) doCnd_purc_st_dt_fr_NE(info);
		else if (ne == Cnd_purc_st_dt_to) doCnd_purc_st_dt_to_NE(info);
		else if (ne == Cnd_ver_chg_sts_typ) doCnd_ver_chg_sts_typ_NE(info);
		else if (ne == Cnd_ver_chg_sts_typ_nm) doCnd_ver_chg_sts_typ_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_ver_chg_sts_typ) doDtl_ver_chg_sts_typ_NE(info);
		else if (ne == columnDtl_ver_chg_sts_typ_nm) doDtl_ver_chg_sts_typ_nm_NE(info);
		else if (ne == columnDtl_cmpl_flg) doDtl_cmpl_flg_NE(info);
		else if (ne == columnDtl_first_inst_st_dt) doDtl_first_inst_st_dt_NE(info);
		else if (ne == columnDtl_first_inst_st_hm) doDtl_first_inst_st_hm_NE(info);
		else if (ne == columnDtl_first_inst_lot_no) doDtl_first_inst_lot_no_NE(info);
		else if (ne == columnDtl_first_inst_sublot_no) doDtl_first_inst_sublot_no_NE(info);
		else if (ne == columnDtl_first_act_st_dt) doDtl_first_act_st_dt_NE(info);
		else if (ne == columnDtl_first_act_st_hm) doDtl_first_act_st_hm_NE(info);
		else if (ne == columnDtl_first_act_lot_no) doDtl_first_act_lot_no_NE(info);
		else if (ne == columnDtl_first_act_sublot_no) doDtl_first_act_sublot_no_NE(info);
		else if (ne == columnDtl_last_act_st_dt) doDtl_last_act_st_dt_NE(info);
		else if (ne == columnDtl_last_act_st_hm) doDtl_last_act_st_hm_NE(info);
		else if (ne == columnDtl_last_act_lot_no) doDtl_last_act_lot_no_NE(info);
		else if (ne == columnDtl_last_act_sublot_no) doDtl_last_act_sublot_no_NE(info);
		else if (ne == columnDtl_master_rmrks) doDtl_master_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_site_nm) doDtl_site_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_purc_st_dt) doDtl_purc_st_dt_NE(info);
		else if (ne == columnDtl_first_mfg_inst_no) doDtl_first_mfg_inst_no_NE(info);
		else if (ne == columnDtl_first_act_mfg_inst_no) doDtl_first_act_mfg_inst_no_NE(info);
		else if (ne == columnDtl_first_mfg_act_no) doDtl_first_mfg_act_no_NE(info);
		else if (ne == columnDtl_last_mfg_inst_no) doDtl_last_mfg_inst_no_NE(info);
		else if (ne == columnDtl_last_mfg_act_no) doDtl_last_mfg_act_no_NE(info);
		else if (ne == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NE(info);
		else if (ne == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ) doDtl_par_itm_typ_NE(info);
		else if (ne == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
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
	 * [Cnd]パネルの[uncmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_uncmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_hm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_hm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_hm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[master_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_master_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_uncmpl_flg) doCnd_uncmpl_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_purc_st_dt_fr) doCnd_purc_st_dt_fr_NX(info);
		else if (nx == Cnd_purc_st_dt_to) doCnd_purc_st_dt_to_NX(info);
		else if (nx == Cnd_ver_chg_sts_typ) doCnd_ver_chg_sts_typ_NX(info);
		else if (nx == Cnd_ver_chg_sts_typ_nm) doCnd_ver_chg_sts_typ_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_ver_chg_sts_typ) doDtl_ver_chg_sts_typ_NX(info);
		else if (nx == columnDtl_ver_chg_sts_typ_nm) doDtl_ver_chg_sts_typ_nm_NX(info);
		else if (nx == columnDtl_cmpl_flg) doDtl_cmpl_flg_NX(info);
		else if (nx == columnDtl_first_inst_st_dt) doDtl_first_inst_st_dt_NX(info);
		else if (nx == columnDtl_first_inst_st_hm) doDtl_first_inst_st_hm_NX(info);
		else if (nx == columnDtl_first_inst_lot_no) doDtl_first_inst_lot_no_NX(info);
		else if (nx == columnDtl_first_inst_sublot_no) doDtl_first_inst_sublot_no_NX(info);
		else if (nx == columnDtl_first_act_st_dt) doDtl_first_act_st_dt_NX(info);
		else if (nx == columnDtl_first_act_st_hm) doDtl_first_act_st_hm_NX(info);
		else if (nx == columnDtl_first_act_lot_no) doDtl_first_act_lot_no_NX(info);
		else if (nx == columnDtl_first_act_sublot_no) doDtl_first_act_sublot_no_NX(info);
		else if (nx == columnDtl_last_act_st_dt) doDtl_last_act_st_dt_NX(info);
		else if (nx == columnDtl_last_act_st_hm) doDtl_last_act_st_hm_NX(info);
		else if (nx == columnDtl_last_act_lot_no) doDtl_last_act_lot_no_NX(info);
		else if (nx == columnDtl_last_act_sublot_no) doDtl_last_act_sublot_no_NX(info);
		else if (nx == columnDtl_master_rmrks) doDtl_master_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_site_nm) doDtl_site_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_purc_st_dt) doDtl_purc_st_dt_NX(info);
		else if (nx == columnDtl_first_mfg_inst_no) doDtl_first_mfg_inst_no_NX(info);
		else if (nx == columnDtl_first_act_mfg_inst_no) doDtl_first_act_mfg_inst_no_NX(info);
		else if (nx == columnDtl_first_mfg_act_no) doDtl_first_mfg_act_no_NX(info);
		else if (nx == columnDtl_last_mfg_inst_no) doDtl_last_mfg_inst_no_NX(info);
		else if (nx == columnDtl_last_mfg_act_no) doDtl_last_mfg_act_no_NX(info);
		else if (nx == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NX(info);
		else if (nx == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ) doDtl_par_itm_typ_NX(info);
		else if (nx == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
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
	 * [Cnd]パネルの[uncmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_uncmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_hm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_hm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_hm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[master_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_master_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NX(MCEventInfo info){
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
		if (lc == Cnd_purc_st_dt_fr) doCnd_purc_st_dt_fr_LC(info);
		else if (lc == Cnd_purc_st_dt_to) doCnd_purc_st_dt_to_LC(info);
		else if (lc == Cnd_ver_chg_sts_typ) doCnd_ver_chg_sts_typ_LC(info);
		else if (lc == Cnd_ver_chg_sts_typ_nm) doCnd_ver_chg_sts_typ_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_ver_chg_sts_typ) doDtl_ver_chg_sts_typ_LC(info);
		else if (lc == columnDtl_ver_chg_sts_typ_nm) doDtl_ver_chg_sts_typ_nm_LC(info);
		else if (lc == columnDtl_first_inst_st_dt) doDtl_first_inst_st_dt_LC(info);
		else if (lc == columnDtl_first_inst_st_hm) doDtl_first_inst_st_hm_LC(info);
		else if (lc == columnDtl_first_inst_lot_no) doDtl_first_inst_lot_no_LC(info);
		else if (lc == columnDtl_first_inst_sublot_no) doDtl_first_inst_sublot_no_LC(info);
		else if (lc == columnDtl_first_act_st_dt) doDtl_first_act_st_dt_LC(info);
		else if (lc == columnDtl_first_act_st_hm) doDtl_first_act_st_hm_LC(info);
		else if (lc == columnDtl_first_act_lot_no) doDtl_first_act_lot_no_LC(info);
		else if (lc == columnDtl_first_act_sublot_no) doDtl_first_act_sublot_no_LC(info);
		else if (lc == columnDtl_last_act_st_dt) doDtl_last_act_st_dt_LC(info);
		else if (lc == columnDtl_last_act_st_hm) doDtl_last_act_st_hm_LC(info);
		else if (lc == columnDtl_last_act_lot_no) doDtl_last_act_lot_no_LC(info);
		else if (lc == columnDtl_last_act_sublot_no) doDtl_last_act_sublot_no_LC(info);
		else if (lc == columnDtl_master_rmrks) doDtl_master_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_site_nm) doDtl_site_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_purc_st_dt) doDtl_purc_st_dt_LC(info);
		else if (lc == columnDtl_first_mfg_inst_no) doDtl_first_mfg_inst_no_LC(info);
		else if (lc == columnDtl_first_act_mfg_inst_no) doDtl_first_act_mfg_inst_no_LC(info);
		else if (lc == columnDtl_first_mfg_act_no) doDtl_first_mfg_act_no_LC(info);
		else if (lc == columnDtl_last_mfg_inst_no) doDtl_last_mfg_inst_no_LC(info);
		else if (lc == columnDtl_last_mfg_act_no) doDtl_last_mfg_act_no_LC(info);
		else if (lc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_LC(info);
		else if (lc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ) doDtl_par_itm_typ_LC(info);
		else if (lc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_st_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_st_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_chg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_chg_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_chg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_chg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_st_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_st_hm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_inst_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_inst_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_st_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_st_hm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_st_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_st_hm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_act_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_act_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[master_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_master_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_act_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_act_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[first_mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_first_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_ver_chg_sts_typ]の作成メソッド
	 */
	public MCList getCnd_ver_chg_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getVerChgStsTyp(row, info);
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgWg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL1160.Srch01")) {
			return new MS_MSBCL1160_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL1160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1160_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1160_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL1160_Srch01Bridge() {
			p_MS_MSBCL1160_Srch01 = new MCParam(PDef.MS_MSBCL1160_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1160_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP1160.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1160.DtlR.class));

			p_MS_MSBCL1160_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1160_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1160_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1160_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1160_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP1160.CndR up0() {
			return (mcframe.clientMSBC.MSBCP1160.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1160.DtlR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1160.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1160_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1160.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1160_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBC.MSBCP1160.DtlR>)p_MS_MSBCL1160_Srch01.getContainerParam().getDownBlock(0));
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
}