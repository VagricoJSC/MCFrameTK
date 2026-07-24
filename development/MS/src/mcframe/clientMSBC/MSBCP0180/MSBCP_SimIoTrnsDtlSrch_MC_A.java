package mcframe.clientMSBC.MSBCP0180;

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
import mcframe.clientMSBC.MSBCP0180.MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch01Caller;
import mcframe.clientMSBC.MSBCP0180.MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch02Caller;
import mcframe.clientMSBC.MSBCP0180.MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch03Caller;

/**
 * 画面"MSBCP_SimIoTrnsDtlSrch"パネルクラスです。<p>
 *
 * シミュレーションオーダを加味した在庫推移明細を照会する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_SimIoTrnsDtlSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0180";

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
	// [Sts_In]ブロック関連のField定義
	public MCPanel Sts_InPanel = null;
	public MCTitledBorder Sts_InTitledBorder = null;
	// [Sts_In]ブロックの項目のField定義
	// [Sts_Out]ブロック関連のField定義
	public MCPanel Sts_OutPanel = null;
	public MCTitledBorder Sts_OutTitledBorder = null;
	// [Sts_Out]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Disp]ブロック関連のField定義
	public MCPanel DispPanel = null;
	// [Disp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SRCH_STK,Inventory generation base,1;SRCH_ASST,Asset generation base,2;SRCH_USE,Available date base,3; SRCH_STK,在庫発生基準,1;SRCH_ASST,資産発生基準,2;SRCH_USE,使用可能日基準,3;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SRCH_STK = null;
	public MCRadioButton Cnd_ope_SRCH_ASST = null;
	public MCRadioButton Cnd_ope_SRCH_USE = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_prcd_flg = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_opn_grp_flg = null;
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_ordsav_grp_flg = null;
	/**
	 * Request 依頼.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_fix_grp_flg = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_schd_grp_flg = null;
	/**
	 * Order 指図.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_sts_ord_grp_flg = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCCheckBox Cnd_gr_act_flg = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_prcd_flg = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_opn_grp_flg = null;
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_ordsav_grp_flg = null;
	/**
	 * Request 依頼.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_fix_grp_flg = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_schd_grp_flg = null;
	/**
	 * Order 指図.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_sts_ord_grp_flg = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_act_flg = null;
	public MCLabel Cnd_dt_fr_Label = null;
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dt_fr = null;
	public MCLabel Cnd_dt_to_Label = null;
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dt_to = null;
	/**
	 * With missing goods only 欠品ありのみ.<p>
	 *
	 */
	public MCCheckBox Cnd_missing_flg = null;
	public MCLabel Cnd_sim_mrp_no_Label = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_no = null;
	/**
	 * Only with simulation シミュレーションありのみ.<p>
	 *
	 */
	public MCCheckBox Cnd_sim_flg = null;
	public MCLabel Cnd_purc_dt_fr_Label = null;
	/**
	 * Scheduled purchase change date FROM 購買切替予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_dt_fr = null;
	public MCLabel Cnd_purc_dt_to_Label = null;
	/**
	 * Scheduled purchase change date TO 購買切替予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_dt_to = null;
	/**
	 * For version control only 版管理対象のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_tgt_ver_flg = null;
	/**
	 * Incomplete version only 未完了版のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_non_cmpl_ver_flg = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
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
	public MCLabel Cnd_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_grp_nm = null;
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
	public MCLabel Cnd_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField Cnd_quality_typ_nm = null;
	public MCLabel Cnd_gd_cd_Label = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCTextField Cnd_gd_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	public MCLabel Cnd_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField Cnd_master_dt = null;
	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_gi_flg = null;
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
	/**
	 * 0,Location;1,Factory/Distribution warehouse;2,WG;3,Distribution G;4,Gross allocation location G;5,Mfg. location G; 0,場所;1,工場・物流倉庫;2,ＷＧ;3,物流Ｇ;4,総量引当場所Ｇ;5,製造場所Ｇ;.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_typ_Group = null;
	public MCRadioButton Cnd_disp_typ_0 = null;
	public MCRadioButton Cnd_disp_typ_1 = null;
	public MCRadioButton Cnd_disp_typ_2 = null;
	public MCRadioButton Cnd_disp_typ_3 = null;
	public MCRadioButton Cnd_disp_typ_4 = null;
	public MCRadioButton Cnd_disp_typ_5 = null;
	public mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H Cnd_sno_flg_p_PPanel;
	public MCCheckBox Cnd_sno1_flg;	// [Cnd]の[sno_flg_p.sno1_flg]を[Cnd_sno1_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno2_flg;	// [Cnd]の[sno_flg_p.sno2_flg]を[Cnd_sno2_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno3_flg;	// [Cnd]の[sno_flg_p.sno3_flg]を[Cnd_sno3_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno4_flg;	// [Cnd]の[sno_flg_p.sno4_flg]を[Cnd_sno4_flg]としてエイリアス定義。
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_key_flg = null;
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBC.MSBCP0180.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_sno_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_no = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_grp_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_nm = null;
	/**
	 * GR/GI date 入出庫日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_stk_qty_p_PPanel;
	public MCColumnConfig columnDtl_stk_qty;// [Dtl]の[stk_qty_p.qty]を[columnDtl_stk_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_in_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_in_schd_qty;// [Dtl]の[in_schd_qty_p.qty]を[columnDtl_in_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_out_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_out_schd_qty;// [Dtl]の[out_schd_qty_p.qty]を[columnDtl_out_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_in_act_qty_p_PPanel;
	public MCColumnConfig columnDtl_in_act_qty;// [Dtl]の[in_act_qty_p.qty]を[columnDtl_in_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_out_act_qty_p_PPanel;
	public MCColumnConfig columnDtl_out_act_qty;// [Dtl]の[out_act_qty_p.qty]を[columnDtl_out_act_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_schd_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ_nm = null;
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trn_typ = null;
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trn_typ_nm = null;
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_act_typ = null;
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_act_typ_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_d_no = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_inst_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_par_itm_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_cd;// [Dtl]の[par_itm_p.itm_cd]を[columnDtl_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub1;// [Dtl]の[par_itm_p.itm_sub1]を[columnDtl_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub2;// [Dtl]の[par_itm_p.itm_sub2]を[columnDtl_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub3;// [Dtl]の[par_itm_p.itm_sub3]を[columnDtl_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_nm;// [Dtl]の[par_itm_p.itm_nm]を[columnDtl_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_lot_no = null;
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_par_sno_p_PPanel;
	public MCColumnConfig columnDtl_par_sno1;// [Dtl]の[par_sno_p.sno1]を[columnDtl_par_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_sno2;// [Dtl]の[par_sno_p.sno2]を[columnDtl_par_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_sno3;// [Dtl]の[par_sno_p.sno3]を[columnDtl_par_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_sno4;// [Dtl]の[par_sno_p.sno4]を[columnDtl_par_sno4]としてエイリアス定義。
	/**
	 * Parent item order No. 親品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_ord_no = null;
	/**
	 * Parent operation order No. 親工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_oper_ord_no = null;
	/**
	 * Scheduled parent start date 親着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_dt_fr = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_act_no = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_act_no = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd_none_flg = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prcd_flg = null;
	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sim_flg = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Dtl_itm_grp_p_PPanel;
	public MCColumnConfig columnDtl_itm_grp_cd1;// [Dtl]の[itm_grp_p.itm_grp_cd1]を[columnDtl_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm1;// [Dtl]の[itm_grp_p.itm_grp_nm1]を[columnDtl_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd2;// [Dtl]の[itm_grp_p.itm_grp_cd2]を[columnDtl_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm2;// [Dtl]の[itm_grp_p.itm_grp_nm2]を[columnDtl_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd3;// [Dtl]の[itm_grp_p.itm_grp_cd3]を[columnDtl_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm3;// [Dtl]の[itm_grp_p.itm_grp_nm3]を[columnDtl_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd4;// [Dtl]の[itm_grp_p.itm_grp_cd4]を[columnDtl_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm4;// [Dtl]の[itm_grp_p.itm_grp_nm4]を[columnDtl_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd5;// [Dtl]の[itm_grp_p.itm_grp_cd5]を[columnDtl_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm5;// [Dtl]の[itm_grp_p.itm_grp_nm5]を[columnDtl_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd6;// [Dtl]の[itm_grp_p.itm_grp_cd6]を[columnDtl_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm6;// [Dtl]の[itm_grp_p.itm_grp_nm6]を[columnDtl_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd7;// [Dtl]の[itm_grp_p.itm_grp_cd7]を[columnDtl_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm7;// [Dtl]の[itm_grp_p.itm_grp_nm7]を[columnDtl_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd8;// [Dtl]の[itm_grp_p.itm_grp_cd8]を[columnDtl_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm8;// [Dtl]の[itm_grp_p.itm_grp_nm8]を[columnDtl_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd9;// [Dtl]の[itm_grp_p.itm_grp_cd9]を[columnDtl_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm9;// [Dtl]の[itm_grp_p.itm_grp_nm9]を[columnDtl_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd10;// [Dtl]の[itm_grp_p.itm_grp_cd10]を[columnDtl_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm10;// [Dtl]の[itm_grp_p.itm_grp_nm10]を[columnDtl_itm_grp_nm10]としてエイリアス定義。
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_typ = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Order status update オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0050 = null;
	/**
	 * Long LT order status update 先行手配オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0130 = null;
	/**
	 * Order status update for simulation シミュレーション用オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0160 = null;
	/**
	 * Inventory forecasting list for simulation シミュ用在庫推移照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0170 = null;
	/**
	 * Version master entry 版マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0770 = null;
	/**
	 * Version change status 版切替状況一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1160 = null;
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
	
	/** [MS_MSBCL0180_Srch01]のCallerの作成 */
	protected MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch01Caller createMS_MSBCL0180_Srch01() {
		MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch01Caller<MSBCP_SimIoTrnsDtlSrch, MS_MSBCL0180_Srch01Bridge>
		caller = ((MSBCP_SimIoTrnsDtlSrch_MC)this).new MS_MSBCL0180_Srch01Caller<MSBCP_SimIoTrnsDtlSrch, MS_MSBCL0180_Srch01Bridge>(
					(MSBCP_SimIoTrnsDtlSrch)this, new MS_MSBCL0180_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0180_Srch01]の呼び出し */
	protected void callMS_MSBCL0180_Srch01() {
		MCCaller caller = createMS_MSBCL0180_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0180_Srch02]のCallerの作成 */
	protected MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch02Caller createMS_MSBCL0180_Srch02() {
		MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch02Caller<MSBCP_SimIoTrnsDtlSrch, MS_MSBCL0180_Srch02Bridge>
		caller = ((MSBCP_SimIoTrnsDtlSrch_MC)this).new MS_MSBCL0180_Srch02Caller<MSBCP_SimIoTrnsDtlSrch, MS_MSBCL0180_Srch02Bridge>(
					(MSBCP_SimIoTrnsDtlSrch)this, new MS_MSBCL0180_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBCL0180_Srch02]の呼び出し */
	protected void callMS_MSBCL0180_Srch02() {
		MCCaller caller = createMS_MSBCL0180_Srch02();
		caller.exec();
	}
	/** [MS_MSBCL0180_Srch03]のCallerの作成 */
	protected MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch03Caller createMS_MSBCL0180_Srch03() {
		MSBCP_SimIoTrnsDtlSrch_MC.MS_MSBCL0180_Srch03Caller<MSBCP_SimIoTrnsDtlSrch, MS_MSBCL0180_Srch03Bridge>
		caller = ((MSBCP_SimIoTrnsDtlSrch_MC)this).new MS_MSBCL0180_Srch03Caller<MSBCP_SimIoTrnsDtlSrch, MS_MSBCL0180_Srch03Bridge>(
					(MSBCP_SimIoTrnsDtlSrch)this, new MS_MSBCL0180_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBCL0180_Srch03]の呼び出し */
	protected void callMS_MSBCL0180_Srch03() {
		MCCaller caller = createMS_MSBCL0180_Srch03();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0180.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0180.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0180.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0180.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0180.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0180.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBC.MSBCP0180.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0180.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBC.MSBCP0180.DtlR createDtlR() {
		return mcframe.clientMSBC.MSBCP0180.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0180.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Sts_InPanel);
		ret.add(Sts_OutPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(DispPanel);
		ret.add(CndPanel);
		ret.add(ItmCndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_SimIoTrnsDtlSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_SimIoTrnsDtlSrch_MC_A(String name) {
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
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateScreenOpe((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateTop((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateFold((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateTab1((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateSts_In((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateSts_Out((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateTab2((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateTab3((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateDisp((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateItmCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateLPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateCtrl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateRPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateDtl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbCreateBtn((MSBCP_SimIoTrnsDtlSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Sts_In]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts_In(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Sts_Out]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts_Out(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Disp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDisp(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_SimIoTrnsDtlSrch p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
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
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
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
		p.Cnd_sno_flg_p_PPanel = mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.create(p.getCndR().sno_flg_p());
		p.Cnd_sno_flg_p_PPanel.setName("Cnd.sno_flg_p");
		p.Cnd_sno1_flg = p.Cnd_sno_flg_p_PPanel.SnoFlg_sno1_flg;
		p.Cnd_sno1_flg.addAliasName("Cnd.sno1_flg", p);
		p.Cnd_sno2_flg = p.Cnd_sno_flg_p_PPanel.SnoFlg_sno2_flg;
		p.Cnd_sno2_flg.addAliasName("Cnd.sno2_flg", p);
		p.Cnd_sno3_flg = p.Cnd_sno_flg_p_PPanel.SnoFlg_sno3_flg;
		p.Cnd_sno3_flg.addAliasName("Cnd.sno3_flg", p);
		p.Cnd_sno4_flg = p.Cnd_sno_flg_p_PPanel.SnoFlg_sno4_flg;
		p.Cnd_sno4_flg.addAliasName("Cnd.sno4_flg", p);
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_SimIoTrnsDtlSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBCP_SimIoTrnsDtlSrch p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_sno_no_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$sno_no_p);
		p.Dtl_sno_no_p_PPanel.setName("Dtl.sno_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_no_p_PPanel.columnSno_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_no_p_PPanel.columnSno_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_no_p_PPanel.columnSno_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_no_p_PPanel.columnSno_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.Dtl_stk_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$stk_qty_p);
		p.Dtl_stk_qty_p_PPanel.setName("Dtl.stk_qty_p");
		p.columnDtl_stk_qty = p.Dtl_stk_qty_p_PPanel.columnQty_qty;
		p.columnDtl_stk_qty.addAliasName("Dtl.stk_qty", p);
		p.Dtl_in_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$in_schd_qty_p);
		p.Dtl_in_schd_qty_p_PPanel.setName("Dtl.in_schd_qty_p");
		p.columnDtl_in_schd_qty = p.Dtl_in_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_in_schd_qty.addAliasName("Dtl.in_schd_qty", p);
		p.Dtl_out_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$out_schd_qty_p);
		p.Dtl_out_schd_qty_p_PPanel.setName("Dtl.out_schd_qty_p");
		p.columnDtl_out_schd_qty = p.Dtl_out_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_out_schd_qty.addAliasName("Dtl.out_schd_qty", p);
		p.Dtl_in_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$in_act_qty_p);
		p.Dtl_in_act_qty_p_PPanel.setName("Dtl.in_act_qty_p");
		p.columnDtl_in_act_qty = p.Dtl_in_act_qty_p_PPanel.columnQty_qty;
		p.columnDtl_in_act_qty.addAliasName("Dtl.in_act_qty", p);
		p.Dtl_out_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$out_act_qty_p);
		p.Dtl_out_act_qty_p_PPanel.setName("Dtl.out_act_qty_p");
		p.columnDtl_out_act_qty = p.Dtl_out_act_qty_p_PPanel.columnQty_qty;
		p.columnDtl_out_act_qty.addAliasName("Dtl.out_act_qty", p);
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$par_itm_p);
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
		p.Dtl_par_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$par_sno_p);
		p.Dtl_par_sno_p_PPanel.setName("Dtl.par_sno_p");
		p.columnDtl_par_sno1 = p.Dtl_par_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_par_sno1.addAliasName("Dtl.par_sno1", p);
		p.columnDtl_par_sno2 = p.Dtl_par_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_par_sno2.addAliasName("Dtl.par_sno2", p);
		p.columnDtl_par_sno3 = p.Dtl_par_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_par_sno3.addAliasName("Dtl.par_sno3", p);
		p.columnDtl_par_sno4 = p.Dtl_par_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_par_sno4.addAliasName("Dtl.par_sno4", p);
		p.Dtl_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0180.DtlR.$itm_grp_p);
		p.Dtl_itm_grp_p_PPanel.setName("Dtl.itm_grp_p");
		p.columnDtl_itm_grp_cd1 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnDtl_itm_grp_cd1.addAliasName("Dtl.itm_grp_cd1", p);
		p.columnDtl_itm_grp_nm1 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnDtl_itm_grp_nm1.addAliasName("Dtl.itm_grp_nm1", p);
		p.columnDtl_itm_grp_cd2 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnDtl_itm_grp_cd2.addAliasName("Dtl.itm_grp_cd2", p);
		p.columnDtl_itm_grp_nm2 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnDtl_itm_grp_nm2.addAliasName("Dtl.itm_grp_nm2", p);
		p.columnDtl_itm_grp_cd3 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnDtl_itm_grp_cd3.addAliasName("Dtl.itm_grp_cd3", p);
		p.columnDtl_itm_grp_nm3 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnDtl_itm_grp_nm3.addAliasName("Dtl.itm_grp_nm3", p);
		p.columnDtl_itm_grp_cd4 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnDtl_itm_grp_cd4.addAliasName("Dtl.itm_grp_cd4", p);
		p.columnDtl_itm_grp_nm4 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnDtl_itm_grp_nm4.addAliasName("Dtl.itm_grp_nm4", p);
		p.columnDtl_itm_grp_cd5 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnDtl_itm_grp_cd5.addAliasName("Dtl.itm_grp_cd5", p);
		p.columnDtl_itm_grp_nm5 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnDtl_itm_grp_nm5.addAliasName("Dtl.itm_grp_nm5", p);
		p.columnDtl_itm_grp_cd6 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnDtl_itm_grp_cd6.addAliasName("Dtl.itm_grp_cd6", p);
		p.columnDtl_itm_grp_nm6 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnDtl_itm_grp_nm6.addAliasName("Dtl.itm_grp_nm6", p);
		p.columnDtl_itm_grp_cd7 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnDtl_itm_grp_cd7.addAliasName("Dtl.itm_grp_cd7", p);
		p.columnDtl_itm_grp_nm7 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnDtl_itm_grp_nm7.addAliasName("Dtl.itm_grp_nm7", p);
		p.columnDtl_itm_grp_cd8 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnDtl_itm_grp_cd8.addAliasName("Dtl.itm_grp_cd8", p);
		p.columnDtl_itm_grp_nm8 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnDtl_itm_grp_nm8.addAliasName("Dtl.itm_grp_nm8", p);
		p.columnDtl_itm_grp_cd9 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnDtl_itm_grp_cd9.addAliasName("Dtl.itm_grp_cd9", p);
		p.columnDtl_itm_grp_nm9 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnDtl_itm_grp_nm9.addAliasName("Dtl.itm_grp_nm9", p);
		p.columnDtl_itm_grp_cd10 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnDtl_itm_grp_cd10.addAliasName("Dtl.itm_grp_cd10", p);
		p.columnDtl_itm_grp_nm10 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnDtl_itm_grp_nm10.addAliasName("Dtl.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_SimIoTrnsDtlSrch p) {
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

	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
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
	
	
	/** [Cnd_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_grp_cd_p = null;

	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_grp_cd_ListPutter() {
		if (Cnd_alloc_grp_cd_p == null) {
			Cnd_alloc_grp_cd_p = createCnd_alloc_grp_cd_ListPutter(Cnd_alloc_grp_cd, "alloc_grp_cd", "alloc_grp_nm");

		}
		return Cnd_alloc_grp_cd_p;
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
	
	
	/** [Cnd_quality_typ_ListPutter]の定義 */
	private MCListPutter Cnd_quality_typ_p = null;

	/**
	 * [Cnd_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_quality_typ_ListPutter() {
		if (Cnd_quality_typ_p == null) {
			Cnd_quality_typ_p = createCnd_quality_typ_ListPutter(Cnd_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Cnd_quality_typ_p;
	}
	
	
	/** [Cnd_gd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gd_cd_p = null;

	/**
	 * [Cnd_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gd_cd_ListPutter() {
		if (Cnd_gd_cd_p == null) {
			Cnd_gd_cd_p = createCnd_gd_cd_ListPutter(Cnd_gd_cd, "gd_cd", "gd_nm");

		}
		return Cnd_gd_cd_p;
	}
	
	
	/** [Cnd_bom_ptn_ListPutter]の定義 */
	private MCListPutter Cnd_bom_ptn_p = null;

	/**
	 * [Cnd_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_ptn_ListPutter() {
		if (Cnd_bom_ptn_p == null) {
			Cnd_bom_ptn_p = createCnd_bom_ptn_ListPutter(Cnd_bom_ptn, "bom_ptn");

		}
		return Cnd_bom_ptn_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_SimIoTrnsDtlSrch create(){
		MSBCP_SimIoTrnsDtlSrch p = new MSBCP_SimIoTrnsDtlSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_SimIoTrnsDtlSrch create(String name){
		MSBCP_SimIoTrnsDtlSrch p = new MSBCP_SimIoTrnsDtlSrch(name);
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
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitScreenOpe((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitTop((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitFold((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitTab1((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitSts_In((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitSts_Out((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitTab2((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitTab3((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitDisp((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitItmCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitLPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitCtrl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitRPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitDtl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbfInitBtn((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitScreenOpe((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitTop((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitFold((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitTab1((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitSts_In((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitSts_Out((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitTab2((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitTab3((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitDisp((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitItmCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitLPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitCtrl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitRPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitDtl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.jbInitBtn((MSBCP_SimIoTrnsDtlSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_SimIoTrnsDtlSrch p) {
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
	protected static void jbfInitTab1(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts_In]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts_In(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Sts_InPanel = p.beansFactory.createPanel("Sts_In");
		p.Sts_InTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts_Out]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts_Out(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Sts_OutPanel = p.beansFactory.createPanel("Sts_Out");
		p.Sts_OutTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDisp(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.DispPanel = p.beansFactory.createPanel("Disp");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SRCH_STK = p.beansFactory.createRadioButton("Cnd.ope_SRCH_STK");
		p.Cnd_ope_SRCH_ASST = p.beansFactory.createRadioButton("Cnd.ope_SRCH_ASST");
		p.Cnd_ope_SRCH_USE = p.beansFactory.createRadioButton("Cnd.ope_SRCH_USE");
		p.Cnd_gr_prcd_flg = p.beansFactory.createCheckBox("Cnd.gr_prcd_flg");
		p.Cnd_gr_sts_opn_grp_flg = p.beansFactory.createCheckBox("Cnd.gr_sts_opn_grp_flg");
		p.Cnd_gr_sts_ordsav_grp_flg = p.beansFactory.createCheckBox("Cnd.gr_sts_ordsav_grp_flg");
		p.Cnd_gr_sts_fix_grp_flg = p.beansFactory.createCheckBox("Cnd.gr_sts_fix_grp_flg");
		p.Cnd_gr_sts_schd_grp_flg = p.beansFactory.createCheckBox("Cnd.gr_sts_schd_grp_flg");
		p.Cnd_gr_sts_ord_grp_flg = p.beansFactory.createCheckBox("Cnd.gr_sts_ord_grp_flg");
		p.Cnd_gr_act_flg = p.beansFactory.createCheckBox("Cnd.gr_act_flg");
		p.Cnd_gi_prcd_flg = p.beansFactory.createCheckBox("Cnd.gi_prcd_flg");
		p.Cnd_gi_sts_opn_grp_flg = p.beansFactory.createCheckBox("Cnd.gi_sts_opn_grp_flg");
		p.Cnd_gi_sts_ordsav_grp_flg = p.beansFactory.createCheckBox("Cnd.gi_sts_ordsav_grp_flg");
		p.Cnd_gi_sts_fix_grp_flg = p.beansFactory.createCheckBox("Cnd.gi_sts_fix_grp_flg");
		p.Cnd_gi_sts_schd_grp_flg = p.beansFactory.createCheckBox("Cnd.gi_sts_schd_grp_flg");
		p.Cnd_gi_sts_ord_grp_flg = p.beansFactory.createCheckBox("Cnd.gi_sts_ord_grp_flg");
		p.Cnd_gi_act_flg = p.beansFactory.createCheckBox("Cnd.gi_act_flg");
		p.Cnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dt_fr_Label");
		p.Cnd_dt_fr = p.beansFactory.createDateField("Cnd.dt_fr");
		p.Cnd_dt_fr.setLabel(p.Cnd_dt_fr_Label);
		p.Cnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dt_to_Label");
		p.Cnd_dt_to = p.beansFactory.createDateField("Cnd.dt_to");
		p.Cnd_dt_to.setLabel(p.Cnd_dt_to_Label);
		p.Cnd_missing_flg = p.beansFactory.createCheckBox("Cnd.missing_flg");
		p.Cnd_sim_mrp_no_Label = p.beansFactory.createLabel("Cnd.sim_mrp_no_Label");
		p.Cnd_sim_mrp_no = p.beansFactory.createTextField("Cnd.sim_mrp_no");
		p.Cnd_sim_mrp_no.setLabel(p.Cnd_sim_mrp_no_Label);
		p.Cnd_sim_flg = p.beansFactory.createCheckBox("Cnd.sim_flg");
		p.Cnd_purc_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_dt_fr_Label");
		p.Cnd_purc_dt_fr = p.beansFactory.createDateField("Cnd.purc_dt_fr");
		p.Cnd_purc_dt_fr.setLabel(p.Cnd_purc_dt_fr_Label);
		p.Cnd_purc_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_dt_to_Label");
		p.Cnd_purc_dt_to = p.beansFactory.createDateField("Cnd.purc_dt_to");
		p.Cnd_purc_dt_to.setLabel(p.Cnd_purc_dt_to_Label);
		p.Cnd_tgt_ver_flg = p.beansFactory.createCheckBox("Cnd.tgt_ver_flg");
		p.Cnd_non_cmpl_ver_flg = p.beansFactory.createCheckBox("Cnd.non_cmpl_ver_flg");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
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
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_quality_typ_Label = p.beansFactory.createLabel("Cnd.quality_typ_Label");
		p.Cnd_quality_typ = p.beansFactory.createTextComboBox("Cnd.quality_typ");
		p.Cnd_quality_typ.setLabel(p.Cnd_quality_typ_Label);
		p.Cnd_quality_typ_nm = p.beansFactory.createTextField("Cnd.quality_typ_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_master_dt_Label = p.beansFactory.createLabel("Cnd.master_dt_Label");
		p.Cnd_master_dt = p.beansFactory.createDateField("Cnd.master_dt");
		p.Cnd_master_dt.setLabel(p.Cnd_master_dt_Label);
		p.Cnd_alloc_gi_flg = p.beansFactory.createCheckBox("Cnd.alloc_gi_flg");
		p.Cnd_disp_typ_Group = p.beansFactory.createButtonGroup("Cnd.disp_typ");
		p.Cnd_disp_typ_0 = p.beansFactory.createRadioButton("Cnd.disp_typ_0");
		p.Cnd_disp_typ_1 = p.beansFactory.createRadioButton("Cnd.disp_typ_1");
		p.Cnd_disp_typ_2 = p.beansFactory.createRadioButton("Cnd.disp_typ_2");
		p.Cnd_disp_typ_3 = p.beansFactory.createRadioButton("Cnd.disp_typ_3");
		p.Cnd_disp_typ_4 = p.beansFactory.createRadioButton("Cnd.disp_typ_4");
		p.Cnd_disp_typ_5 = p.beansFactory.createRadioButton("Cnd.disp_typ_5");
		p.Cnd_key_flg = p.beansFactory.createCheckBox("Cnd.key_flg");
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_ver_no = p.beansFactory.createTableColumn("Dtl.ver_no", MCColumnType.TEXT);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT);
		p.columnDtl_site_nm = p.beansFactory.createTableColumn("Dtl.site_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_alloc_grp_cd = p.beansFactory.createTableColumn("Dtl.alloc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_alloc_grp_nm = p.beansFactory.createTableColumn("Dtl.alloc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_loc_grp_nm = p.beansFactory.createTableColumn("Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_dt = p.beansFactory.createTableColumn("Dtl.dt", MCColumnType.DATE);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_io_schd_typ = p.beansFactory.createTableColumn("Dtl.io_schd_typ", MCColumnType.TEXT);
		p.columnDtl_io_schd_typ_nm = p.beansFactory.createTableColumn("Dtl.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_io_schd_sts_typ = p.beansFactory.createTableColumn("Dtl.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnDtl_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ_nm = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trn_typ = p.beansFactory.createTableColumn("Dtl.trn_typ", MCColumnType.TEXT);
		p.columnDtl_trn_typ_nm = p.beansFactory.createTableColumn("Dtl.trn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_io_act_typ = p.beansFactory.createTableColumn("Dtl.io_act_typ", MCColumnType.TEXT);
		p.columnDtl_io_act_typ_nm = p.beansFactory.createTableColumn("Dtl.io_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_oper_inst_no = p.beansFactory.createTableColumn("Dtl.oper_inst_no", MCColumnType.TEXT);
		p.columnDtl_par_lot_no = p.beansFactory.createTableColumn("Dtl.par_lot_no", MCColumnType.TEXT);
		p.columnDtl_par_sublot_no = p.beansFactory.createTableColumn("Dtl.par_sublot_no", MCColumnType.TEXT);
		p.columnDtl_par_itm_ord_no = p.beansFactory.createTableColumn("Dtl.par_itm_ord_no", MCColumnType.TEXT);
		p.columnDtl_par_oper_ord_no = p.beansFactory.createTableColumn("Dtl.par_oper_ord_no", MCColumnType.TEXT);
		p.columnDtl_par_dt_fr = p.beansFactory.createTableColumn("Dtl.par_dt_fr", MCColumnType.DATE);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_mfg_act_no = p.beansFactory.createTableColumn("Dtl.mfg_act_no", MCColumnType.TEXT);
		p.columnDtl_oper_act_no = p.beansFactory.createTableColumn("Dtl.oper_act_no", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd = p.beansFactory.createTableColumn("Dtl.str_ln_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_nm = p.beansFactory.createTableColumn("Dtl.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Dtl.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnDtl_prcd_flg = p.beansFactory.createTableColumn("Dtl.prcd_flg", MCColumnType.CHECK);
		p.columnDtl_sim_flg = p.beansFactory.createTableColumn("Dtl.sim_flg", MCColumnType.CHECK);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_io_typ = p.beansFactory.createTableColumn("Dtl.io_typ", MCColumnType.TEXT);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0050 = p.beansFactory.createButton("Btn.open_MSBCP0050", "open");
		p.Btn_open_MSBCP0130 = p.beansFactory.createButton("Btn.open_MSBCP0130", "open");
		p.Btn_open_MSBCP0160 = p.beansFactory.createButton("Btn.open_MSBCP0160", "open");
		p.Btn_open_MSBCP0170 = p.beansFactory.createButton("Btn.open_MSBCP0170", "open");
		p.Btn_open_MABSP0770 = p.beansFactory.createButton("Btn.open_MABSP0770", "open");
		p.Btn_open_MSBCP1160 = p.beansFactory.createButton("Btn.open_MSBCP1160", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_SimIoTrnsDtlSrch p) {
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
	protected static void jbInitTop(MSBCP_SimIoTrnsDtlSrch p) {
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
	protected static void jbInitFold(MSBCP_SimIoTrnsDtlSrch p) {
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
	protected static void jbInitTab1(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.Sts_InPanel, null);
		p.Tab1Panel.setLastBeans(p.Sts_InPanel);
		p.Sts_InPanel.setNextBeans(p.Sts_OutPanel);
		p.Tab1Panel.add(p.Sts_OutPanel, null);
		p.Sts_OutPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Sts_In]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts_In(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Sts_InPanel.setBorder(p.Sts_InTitledBorder);
		p.Sts_InPanel.setValueCheck(false);
		p.Sts_InPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Sts_InPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts_Out]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts_Out(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Sts_OutPanel.setBorder(p.Sts_OutTitledBorder);
		p.Sts_OutPanel.setValueCheck(false);
		p.Sts_OutPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Sts_OutPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ItmCndPanel, null);
		p.Tab2Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DispPanel, null);
		p.Tab3Panel.setLastBeans(p.DispPanel);
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDisp(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.DispPanel.setValueCheck(false);
		p.DispPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SRCH_STK);
		p.Cnd_ope_SRCH_STK.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_STK);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_STK);
		p.Cnd_ope_SRCH_STK.setNextBeans(p.Cnd_ope_SRCH_ASST);
		p.Cnd_ope_SRCH_ASST.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_ASST);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_ASST);
		p.Cnd_ope_SRCH_ASST.setNextBeans(p.Cnd_ope_SRCH_USE);
		p.Cnd_ope_SRCH_USE.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_USE);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_USE);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.ope_META);
		p.Sts_InPanel.add(p.Cnd_gr_prcd_flg);
		p.Sts_InPanel.setLastBeans(p.Cnd_gr_prcd_flg);
		p.Cnd_gr_prcd_flg.setNextBeans(p.Cnd_gr_sts_opn_grp_flg);
		p.Cnd_gr_prcd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_prcd_flg_META);
		p.Sts_InPanel.add(p.Cnd_gr_sts_opn_grp_flg);
		p.Cnd_gr_sts_opn_grp_flg.setNextBeans(p.Cnd_gr_sts_ordsav_grp_flg);
		p.Cnd_gr_sts_opn_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_sts_opn_grp_flg_META);
		p.Sts_InPanel.add(p.Cnd_gr_sts_ordsav_grp_flg);
		p.Cnd_gr_sts_ordsav_grp_flg.setNextBeans(p.Cnd_gr_sts_fix_grp_flg);
		p.Cnd_gr_sts_ordsav_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_sts_ordsav_grp_flg_META);
		p.Sts_InPanel.add(p.Cnd_gr_sts_fix_grp_flg);
		p.Cnd_gr_sts_fix_grp_flg.setNextBeans(p.Cnd_gr_sts_schd_grp_flg);
		p.Cnd_gr_sts_fix_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_sts_fix_grp_flg_META);
		p.Sts_InPanel.add(p.Cnd_gr_sts_schd_grp_flg);
		p.Cnd_gr_sts_schd_grp_flg.setNextBeans(p.Cnd_gr_sts_ord_grp_flg);
		p.Cnd_gr_sts_schd_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_sts_schd_grp_flg_META);
		p.Sts_InPanel.add(p.Cnd_gr_sts_ord_grp_flg);
		p.Cnd_gr_sts_ord_grp_flg.setNextBeans(p.Cnd_gr_act_flg);
		p.Cnd_gr_sts_ord_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_sts_ord_grp_flg_META);
		p.Sts_InPanel.add(p.Cnd_gr_act_flg);
		p.Cnd_gr_act_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gr_act_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_prcd_flg);
		p.Sts_OutPanel.setLastBeans(p.Cnd_gi_prcd_flg);
		p.Cnd_gi_prcd_flg.setNextBeans(p.Cnd_gi_sts_opn_grp_flg);
		p.Cnd_gi_prcd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_prcd_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_sts_opn_grp_flg);
		p.Cnd_gi_sts_opn_grp_flg.setNextBeans(p.Cnd_gi_sts_ordsav_grp_flg);
		p.Cnd_gi_sts_opn_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_sts_opn_grp_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_sts_ordsav_grp_flg);
		p.Cnd_gi_sts_ordsav_grp_flg.setNextBeans(p.Cnd_gi_sts_fix_grp_flg);
		p.Cnd_gi_sts_ordsav_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_sts_ordsav_grp_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_sts_fix_grp_flg);
		p.Cnd_gi_sts_fix_grp_flg.setNextBeans(p.Cnd_gi_sts_schd_grp_flg);
		p.Cnd_gi_sts_fix_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_sts_fix_grp_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_sts_schd_grp_flg);
		p.Cnd_gi_sts_schd_grp_flg.setNextBeans(p.Cnd_gi_sts_ord_grp_flg);
		p.Cnd_gi_sts_schd_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_sts_schd_grp_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_sts_ord_grp_flg);
		p.Cnd_gi_sts_ord_grp_flg.setNextBeans(p.Cnd_gi_act_flg);
		p.Cnd_gi_sts_ord_grp_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_sts_ord_grp_flg_META);
		p.Sts_OutPanel.add(p.Cnd_gi_act_flg);
		p.Cnd_gi_act_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gi_act_flg_META);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_missing_flg);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_missing_flg);
		p.Cnd_missing_flg.setNextBeans(p.Cnd_sim_mrp_no);
		p.Cnd_missing_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.missing_flg_META);
		p.CndPanel.add(p.Cnd_sim_mrp_no_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_no);
		p.Cnd_sim_mrp_no.setNextBeans(p.Cnd_sim_flg);
		p.Cnd_sim_mrp_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.sim_mrp_no_META);
		p.CndPanel.add(p.Cnd_sim_flg);
		p.Cnd_sim_flg.setNextBeans(p.Cnd_purc_dt_fr);
		p.Cnd_sim_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.sim_flg_META);
		p.CndPanel.add(p.Cnd_purc_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_dt_fr);
		p.Cnd_purc_dt_fr.setNextBeans(p.Cnd_purc_dt_to);
		p.Cnd_purc_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.purc_dt_fr_META);
		p.Cnd_purc_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_dt_to);
		p.Cnd_purc_dt_to.setNextBeans(p.Cnd_tgt_ver_flg);
		p.Cnd_purc_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.purc_dt_to_META);
		p.Cnd_purc_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_tgt_ver_flg);
		p.Cnd_tgt_ver_flg.setNextBeans(p.Cnd_non_cmpl_ver_flg);
		p.Cnd_tgt_ver_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.tgt_ver_flg_META);
		p.CndPanel.add(p.Cnd_non_cmpl_ver_flg);
		p.Cnd_non_cmpl_ver_flg.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_non_cmpl_ver_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.non_cmpl_ver_flg_META);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.CndPanel.add(p.Cnd_quality_typ_Label);
		p.CndPanel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.quality_typ_META);
		p.CndPanel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.quality_typ_nm_META);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_master_dt);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.bom_ptn_META);
		p.CndPanel.add(p.Cnd_master_dt_Label);
		p.CndPanel.add(p.Cnd_master_dt);
		p.Cnd_master_dt.setNextBeans(p.Cnd_alloc_gi_flg);
		p.Cnd_master_dt.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.master_dt_META);
		p.Cnd_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_alloc_gi_flg);
		p.Cnd_alloc_gi_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.alloc_gi_flg_META);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.DispPanel.setLastBeans(p.Cnd_disp_typ_Group);
		p.Cnd_disp_typ_Group.setFirstBeans(p.Cnd_disp_typ_0);
		p.Cnd_disp_typ_0.setActionCommand("0");
		p.Cnd_disp_typ_Group.add(p.Cnd_disp_typ_0);
		p.DispPanel.add(p.Cnd_disp_typ_0);
		p.Cnd_disp_typ_0.setNextBeans(p.Cnd_disp_typ_1);
		p.Cnd_disp_typ_1.setActionCommand("1");
		p.Cnd_disp_typ_Group.add(p.Cnd_disp_typ_1);
		p.DispPanel.add(p.Cnd_disp_typ_1);
		p.Cnd_disp_typ_1.setNextBeans(p.Cnd_disp_typ_2);
		p.Cnd_disp_typ_2.setActionCommand("2");
		p.Cnd_disp_typ_Group.add(p.Cnd_disp_typ_2);
		p.DispPanel.add(p.Cnd_disp_typ_2);
		p.Cnd_disp_typ_2.setNextBeans(p.Cnd_disp_typ_3);
		p.Cnd_disp_typ_3.setActionCommand("3");
		p.Cnd_disp_typ_Group.add(p.Cnd_disp_typ_3);
		p.DispPanel.add(p.Cnd_disp_typ_3);
		p.Cnd_disp_typ_3.setNextBeans(p.Cnd_disp_typ_4);
		p.Cnd_disp_typ_4.setActionCommand("4");
		p.Cnd_disp_typ_Group.add(p.Cnd_disp_typ_4);
		p.DispPanel.add(p.Cnd_disp_typ_4);
		p.Cnd_disp_typ_4.setNextBeans(p.Cnd_disp_typ_5);
		p.Cnd_disp_typ_5.setActionCommand("5");
		p.Cnd_disp_typ_Group.add(p.Cnd_disp_typ_5);
		p.DispPanel.add(p.Cnd_disp_typ_5);
		p.Cnd_disp_typ_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.disp_typ_META);
		p.Cnd_disp_typ_Group.setNextBeans(p.Cnd_sno_flg_p_PPanel);
		p.DispPanel.add(p.Cnd_sno_flg_p_PPanel);
		p.LPnlPanel.add(p.Cnd_key_flg);
		p.LPnlPanel.setLastBeans(p.Cnd_key_flg);
		p.Cnd_key_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0180.CndR.key_flg_META);
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_SimIoTrnsDtlSrch p) {
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
	protected static void jbInitRPnl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_SimIoTrnsDtlSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0050.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP0050);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP0050);
		p.Btn_open_MSBCP0050.setNextBeans(p.Btn_open_MSBCP0130);
		p.Btn_open_MSBCP0130.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP0130);
		p.Btn_open_MSBCP0130.setNextBeans(p.Btn_open_MSBCP0160);
		p.Btn_open_MSBCP0160.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBCP0160);
		p.Btn_open_MSBCP0160.setNextBeans(p.Btn_open_MSBCP0170);
		p.Btn_open_MSBCP0170.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBCP0170);
		p.Btn_open_MSBCP0170.setNextBeans(p.Btn_open_MABSP0770);
		p.Btn_open_MABSP0770.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_open_MABSP0770);
		p.Btn_open_MABSP0770.setNextBeans(p.Btn_open_MSBCP1160);
		p.Btn_open_MSBCP1160.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_open_MSBCP1160);
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
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitScreenOpe((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitTop((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitFold((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitTab1((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitSts_In((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitSts_Out((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitTab2((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitTab3((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitDisp((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitItmCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitLPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitCtrl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitRPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitDtl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.mcInitBtn((MSBCP_SimIoTrnsDtlSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_ScreenOpe((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Top((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Fold((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Tab1((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Sts__In((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Sts__Out((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Tab2((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Tab3((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Disp((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Cnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_ItmCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_LPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Ctrl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_RPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Dtl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitSRCH_Btn((MSBCP_SimIoTrnsDtlSrch)this);

		// [REF]ステータスのモードの設定
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_ScreenOpe((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Top((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Fold((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Tab1((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Sts__In((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Sts__Out((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Tab2((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Tab3((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Disp((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Cnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_ItmCnd((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_LPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Ctrl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_RPnl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Dtl((MSBCP_SimIoTrnsDtlSrch)this);
		MSBCP_SimIoTrnsDtlSrch_MC.statusInitREF_Btn((MSBCP_SimIoTrnsDtlSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_SimIoTrnsDtlSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Sts_In]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts_In(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Sts_Out]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts_Out(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Disp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDisp(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_SimIoTrnsDtlSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SRCH_STK.addAllListener(p);
		p.Cnd_ope_SRCH_ASST.addAllListener(p);
		p.Cnd_ope_SRCH_USE.addAllListener(p);
		p.Cnd_gr_prcd_flg.addAllListener(p);
		p.Cnd_gr_sts_opn_grp_flg.addAllListener(p);
		p.Cnd_gr_sts_ordsav_grp_flg.addAllListener(p);
		p.Cnd_gr_sts_fix_grp_flg.addAllListener(p);
		p.Cnd_gr_sts_schd_grp_flg.addAllListener(p);
		p.Cnd_gr_sts_ord_grp_flg.addAllListener(p);
		p.Cnd_gr_act_flg.addAllListener(p);
		p.Cnd_gi_prcd_flg.addAllListener(p);
		p.Cnd_gi_sts_opn_grp_flg.addAllListener(p);
		p.Cnd_gi_sts_ordsav_grp_flg.addAllListener(p);
		p.Cnd_gi_sts_fix_grp_flg.addAllListener(p);
		p.Cnd_gi_sts_schd_grp_flg.addAllListener(p);
		p.Cnd_gi_sts_ord_grp_flg.addAllListener(p);
		p.Cnd_gi_act_flg.addAllListener(p);
		p.Cnd_dt_fr.setListListener(p);
		p.Cnd_dt_fr.addAllListener(p);
		p.Cnd_dt_to.setListListener(p);
		p.Cnd_dt_to.addAllListener(p);
		p.Cnd_missing_flg.addAllListener(p);
		p.Cnd_sim_mrp_no.setListListener(p);
		p.Cnd_sim_mrp_no.addAllListener(p);
		p.Cnd_sim_flg.addAllListener(p);
		p.Cnd_purc_dt_fr.setListListener(p);
		p.Cnd_purc_dt_fr.addAllListener(p);
		p.Cnd_purc_dt_to.setListListener(p);
		p.Cnd_purc_dt_to.addAllListener(p);
		p.Cnd_tgt_ver_flg.addAllListener(p);
		p.Cnd_non_cmpl_ver_flg.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
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
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_quality_typ.setListListener(p);
		p.Cnd_quality_typ.addAllListener(p);
		p.Cnd_quality_typ_nm.setListListener(p);
		p.Cnd_quality_typ_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_master_dt.setListListener(p);
		p.Cnd_master_dt.addAllListener(p);
		p.Cnd_alloc_gi_flg.addAllListener(p);
		p.Cnd_disp_typ_Group.addAllListener(p);
		p.Cnd_disp_typ_0.addAllListener(p);
		p.Cnd_disp_typ_1.addAllListener(p);
		p.Cnd_disp_typ_2.addAllListener(p);
		p.Cnd_disp_typ_3.addAllListener(p);
		p.Cnd_disp_typ_4.addAllListener(p);
		p.Cnd_disp_typ_5.addAllListener(p);
		p.Cnd_key_flg.addAllListener(p);
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBCP_SimIoTrnsDtlSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_SimIoTrnsDtlSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_SimIoTrnsDtlSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBCP_SimIoTrnsDtlSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_ver_no.addAllListener(p);
		p.columnDtl_ver_no.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_site_nm.addAllListener(p);
		p.columnDtl_site_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_lg_grp_cd.addAllListener(p);
		p.columnDtl_lg_grp_cd.setListListener(p);
		p.columnDtl_lg_grp_nm.addAllListener(p);
		p.columnDtl_lg_grp_nm.setListListener(p);
		p.columnDtl_alloc_grp_cd.addAllListener(p);
		p.columnDtl_alloc_grp_cd.setListListener(p);
		p.columnDtl_alloc_grp_nm.addAllListener(p);
		p.columnDtl_alloc_grp_nm.setListListener(p);
		p.columnDtl_loc_grp_cd.addAllListener(p);
		p.columnDtl_loc_grp_cd.setListListener(p);
		p.columnDtl_loc_grp_nm.addAllListener(p);
		p.columnDtl_loc_grp_nm.setListListener(p);
		p.columnDtl_dt.addAllListener(p);
		p.columnDtl_dt.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_io_schd_typ.addAllListener(p);
		p.columnDtl_io_schd_typ.setListListener(p);
		p.columnDtl_io_schd_typ_nm.addAllListener(p);
		p.columnDtl_io_schd_typ_nm.setListListener(p);
		p.columnDtl_io_schd_sts_typ.addAllListener(p);
		p.columnDtl_io_schd_sts_typ.setListListener(p);
		p.columnDtl_io_schd_sts_typ_nm.addAllListener(p);
		p.columnDtl_io_schd_sts_typ_nm.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_trd_ptn_typ_nm.addAllListener(p);
		p.columnDtl_trd_ptn_typ_nm.setListListener(p);
		p.columnDtl_trn_typ.addAllListener(p);
		p.columnDtl_trn_typ.setListListener(p);
		p.columnDtl_trn_typ_nm.addAllListener(p);
		p.columnDtl_trn_typ_nm.setListListener(p);
		p.columnDtl_io_act_typ.addAllListener(p);
		p.columnDtl_io_act_typ.setListListener(p);
		p.columnDtl_io_act_typ_nm.addAllListener(p);
		p.columnDtl_io_act_typ_nm.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_oper_inst_no.addAllListener(p);
		p.columnDtl_oper_inst_no.setListListener(p);
		p.columnDtl_par_lot_no.addAllListener(p);
		p.columnDtl_par_lot_no.setListListener(p);
		p.columnDtl_par_sublot_no.addAllListener(p);
		p.columnDtl_par_sublot_no.setListListener(p);
		p.columnDtl_par_itm_ord_no.addAllListener(p);
		p.columnDtl_par_itm_ord_no.setListListener(p);
		p.columnDtl_par_oper_ord_no.addAllListener(p);
		p.columnDtl_par_oper_ord_no.setListListener(p);
		p.columnDtl_par_dt_fr.addAllListener(p);
		p.columnDtl_par_dt_fr.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_mfg_act_no.addAllListener(p);
		p.columnDtl_mfg_act_no.setListListener(p);
		p.columnDtl_oper_act_no.addAllListener(p);
		p.columnDtl_oper_act_no.setListListener(p);
		p.columnDtl_str_ln_cd.addAllListener(p);
		p.columnDtl_str_ln_cd.setListListener(p);
		p.columnDtl_str_ln_nm.addAllListener(p);
		p.columnDtl_str_ln_nm.setListListener(p);
		p.columnDtl_str_ln_cd_none_flg.addAllListener(p);
		p.columnDtl_prcd_flg.addAllListener(p);
		p.columnDtl_sim_flg.addAllListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_io_typ.addAllListener(p);
		p.columnDtl_io_typ.setListListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_SimIoTrnsDtlSrch p) {
		p.Btn_open_MSBCP0050.addAllListener(p);
		p.Btn_open_MSBCP0050.setAPMethodName("doBtn_open_MSBCP0050");
		p.Btn_open_MSBCP0130.addAllListener(p);
		p.Btn_open_MSBCP0130.setAPMethodName("doBtn_open_MSBCP0130");
		p.Btn_open_MSBCP0160.addAllListener(p);
		p.Btn_open_MSBCP0160.setAPMethodName("doBtn_open_MSBCP0160");
		p.Btn_open_MSBCP0170.addAllListener(p);
		p.Btn_open_MSBCP0170.setAPMethodName("doBtn_open_MSBCP0170");
		p.Btn_open_MABSP0770.addAllListener(p);
		p.Btn_open_MABSP0770.setAPMethodName("doBtn_open_MABSP0770");
		p.Btn_open_MSBCP1160.addAllListener(p);
		p.Btn_open_MSBCP1160.setAPMethodName("doBtn_open_MSBCP1160");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Sts_In]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sts__In(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Sts_Out]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sts__Out(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Disp(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_SimIoTrnsDtlSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_prcd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_act_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_prcd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_act_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_missing_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sim_mrp_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sim_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_purc_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tgt_ver_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_non_cmpl_ver_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_master_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alloc_gi_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno_flg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_key_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmCnd(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBCP_SimIoTrnsDtlSrch p){
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_sno_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_in_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_out_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_in_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_out_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_io_schd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_io_schd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_io_schd_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_io_schd_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_par_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_par_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_oper_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_dt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prcd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_SimIoTrnsDtlSrch p){
		p.Btn_open_MSBCP0050.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0160.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0170.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABSP0770.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP1160.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Sts_In]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sts__In(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Sts_Out]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sts__Out(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitREF_Disp(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_SimIoTrnsDtlSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_prcd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_sts_opn_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_sts_ordsav_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_sts_fix_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_sts_schd_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_sts_ord_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gr_act_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_prcd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_sts_opn_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_sts_ordsav_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_sts_fix_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_sts_schd_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_sts_ord_grp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_act_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_missing_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sim_mrp_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sim_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tgt_ver_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_non_cmpl_ver_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_master_dt.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_gi_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_typ_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno_flg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_key_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmCnd(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBCP_SimIoTrnsDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBCP_SimIoTrnsDtlSrch p){
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_sno_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_ver_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_stk_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_in_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_out_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_in_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_out_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_io_schd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_schd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_schd_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_schd_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_par_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_oper_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prcd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sim_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_SimIoTrnsDtlSrch p){
		p.Btn_open_MSBCP0050.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0130.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0160.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0170.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABSP0770.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP1160.putMode(p, REF, MCMode.ENABLE);

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
		MSBCP_SimIoTrnsDtlSrch_MC.setTableConfigDtl((MSBCP_SimIoTrnsDtlSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBCP_SimIoTrnsDtlSrch p) {
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.DtlTable.addTable(p.Dtl_sno_no_p_PPanel.SnoTable);
		p.columnDtl_ver_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.ver_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_no);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_site_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_site_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.site_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_lg_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_cd);
		p.columnDtl_lg_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_nm);
		p.columnDtl_alloc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.alloc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_grp_cd);
		p.columnDtl_alloc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.alloc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_grp_nm);
		p.columnDtl_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.loc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_cd);
		p.columnDtl_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.loc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_nm);
		p.columnDtl_dt.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.dt_META);
		p.columnDtl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dt);
		p.DtlTable.addTable(p.Dtl_stk_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_in_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_out_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_in_act_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_out_act_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_io_schd_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_schd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_schd_typ);
		p.columnDtl_io_schd_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_schd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_schd_typ_nm);
		p.columnDtl_io_schd_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_schd_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_schd_sts_typ);
		p.columnDtl_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_schd_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_schd_sts_typ_nm);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_trd_ptn_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.trd_ptn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ_nm);
		p.columnDtl_trn_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.trn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trn_typ);
		p.columnDtl_trn_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.trn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trn_typ_nm);
		p.columnDtl_io_act_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_act_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_act_typ);
		p.columnDtl_io_act_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_act_typ_nm);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_oper_inst_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.oper_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_inst_no);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.columnDtl_par_lot_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.par_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_lot_no);
		p.columnDtl_par_sublot_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.par_sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sublot_no);
		p.DtlTable.addTable(p.Dtl_par_sno_p_PPanel.SnoTable);
		p.columnDtl_par_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.par_itm_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_ord_no);
		p.columnDtl_par_oper_ord_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.par_oper_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_oper_ord_no);
		p.columnDtl_par_dt_fr.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.par_dt_fr_META);
		p.columnDtl_par_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_par_dt_fr);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_mfg_act_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.mfg_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_act_no);
		p.columnDtl_oper_act_no.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.oper_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_act_no);
		p.columnDtl_str_ln_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.str_ln_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd);
		p.columnDtl_str_ln_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.str_ln_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_nm);
		p.columnDtl_str_ln_cd_none_flg.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.str_ln_cd_none_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd_none_flg);
		p.columnDtl_prcd_flg.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.prcd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prcd_flg);
		p.columnDtl_sim_flg.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.sim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sim_flg);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.DtlTable.addTable(p.Dtl_itm_grp_p_PPanel.ItmGrpTable);
		p.columnDtl_io_typ.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.io_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_typ);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBC.MSBCP0180.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
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
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
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
	 * [Cnd_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomPtn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
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
		else if (ap == Btn_open_MSBCP0050) doBtn_open_MSBCP0050(info);
		else if (ap == Btn_open_MSBCP0130) doBtn_open_MSBCP0130(info);
		else if (ap == Btn_open_MSBCP0160) doBtn_open_MSBCP0160(info);
		else if (ap == Btn_open_MSBCP0170) doBtn_open_MSBCP0170(info);
		else if (ap == Btn_open_MABSP0770) doBtn_open_MABSP0770(info);
		else if (ap == Btn_open_MSBCP1160) doBtn_open_MSBCP1160(info);
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
	 * [Btn]パネルの[open_MSBCP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0130(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0160(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0170]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0170(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0770]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0770(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP1160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1160(MCEventInfo info);

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
		if (vc == Cnd_gr_prcd_flg) return doCnd_gr_prcd_flg_VC(info);
		if (vc == Cnd_gr_sts_opn_grp_flg) return doCnd_gr_sts_opn_grp_flg_VC(info);
		if (vc == Cnd_gr_sts_ordsav_grp_flg) return doCnd_gr_sts_ordsav_grp_flg_VC(info);
		if (vc == Cnd_gr_sts_fix_grp_flg) return doCnd_gr_sts_fix_grp_flg_VC(info);
		if (vc == Cnd_gr_sts_schd_grp_flg) return doCnd_gr_sts_schd_grp_flg_VC(info);
		if (vc == Cnd_gr_sts_ord_grp_flg) return doCnd_gr_sts_ord_grp_flg_VC(info);
		if (vc == Cnd_gr_act_flg) return doCnd_gr_act_flg_VC(info);
		if (vc == Cnd_gi_prcd_flg) return doCnd_gi_prcd_flg_VC(info);
		if (vc == Cnd_gi_sts_opn_grp_flg) return doCnd_gi_sts_opn_grp_flg_VC(info);
		if (vc == Cnd_gi_sts_ordsav_grp_flg) return doCnd_gi_sts_ordsav_grp_flg_VC(info);
		if (vc == Cnd_gi_sts_fix_grp_flg) return doCnd_gi_sts_fix_grp_flg_VC(info);
		if (vc == Cnd_gi_sts_schd_grp_flg) return doCnd_gi_sts_schd_grp_flg_VC(info);
		if (vc == Cnd_gi_sts_ord_grp_flg) return doCnd_gi_sts_ord_grp_flg_VC(info);
		if (vc == Cnd_gi_act_flg) return doCnd_gi_act_flg_VC(info);
		if (vc == Cnd_dt_fr) return doCnd_dt_fr_VC(info);
		if (vc == Cnd_dt_to) return doCnd_dt_to_VC(info);
		if (vc == Cnd_missing_flg) return doCnd_missing_flg_VC(info);
		if (vc == Cnd_sim_mrp_no) return doCnd_sim_mrp_no_VC(info);
		if (vc == Cnd_sim_flg) return doCnd_sim_flg_VC(info);
		if (vc == Cnd_purc_dt_fr) return doCnd_purc_dt_fr_VC(info);
		if (vc == Cnd_purc_dt_to) return doCnd_purc_dt_to_VC(info);
		if (vc == Cnd_tgt_ver_flg) return doCnd_tgt_ver_flg_VC(info);
		if (vc == Cnd_non_cmpl_ver_flg) return doCnd_non_cmpl_ver_flg_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_master_dt) return doCnd_master_dt_VC(info);
		if (vc == Cnd_alloc_gi_flg) return doCnd_alloc_gi_flg_VC(info);
		if (vc == Cnd_disp_typ_Group) return doCnd_disp_typ_VC(info);
		if (vc == Cnd_key_flg) return doCnd_key_flg_VC(info);
		if (vc == columnDtl_ver_no) return doDtl_ver_no_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_site_nm) return doDtl_site_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_lg_grp_cd) return doDtl_lg_grp_cd_VC(info);
		if (vc == columnDtl_lg_grp_nm) return doDtl_lg_grp_nm_VC(info);
		if (vc == columnDtl_alloc_grp_cd) return doDtl_alloc_grp_cd_VC(info);
		if (vc == columnDtl_alloc_grp_nm) return doDtl_alloc_grp_nm_VC(info);
		if (vc == columnDtl_loc_grp_cd) return doDtl_loc_grp_cd_VC(info);
		if (vc == columnDtl_loc_grp_nm) return doDtl_loc_grp_nm_VC(info);
		if (vc == columnDtl_dt) return doDtl_dt_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_io_schd_typ) return doDtl_io_schd_typ_VC(info);
		if (vc == columnDtl_io_schd_typ_nm) return doDtl_io_schd_typ_nm_VC(info);
		if (vc == columnDtl_io_schd_sts_typ) return doDtl_io_schd_sts_typ_VC(info);
		if (vc == columnDtl_io_schd_sts_typ_nm) return doDtl_io_schd_sts_typ_nm_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_trd_ptn_typ_nm) return doDtl_trd_ptn_typ_nm_VC(info);
		if (vc == columnDtl_trn_typ) return doDtl_trn_typ_VC(info);
		if (vc == columnDtl_trn_typ_nm) return doDtl_trn_typ_nm_VC(info);
		if (vc == columnDtl_io_act_typ) return doDtl_io_act_typ_VC(info);
		if (vc == columnDtl_io_act_typ_nm) return doDtl_io_act_typ_nm_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_oper_inst_no) return doDtl_oper_inst_no_VC(info);
		if (vc == columnDtl_par_lot_no) return doDtl_par_lot_no_VC(info);
		if (vc == columnDtl_par_sublot_no) return doDtl_par_sublot_no_VC(info);
		if (vc == columnDtl_par_itm_ord_no) return doDtl_par_itm_ord_no_VC(info);
		if (vc == columnDtl_par_oper_ord_no) return doDtl_par_oper_ord_no_VC(info);
		if (vc == columnDtl_par_dt_fr) return doDtl_par_dt_fr_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_mfg_act_no) return doDtl_mfg_act_no_VC(info);
		if (vc == columnDtl_oper_act_no) return doDtl_oper_act_no_VC(info);
		if (vc == columnDtl_str_ln_cd) return doDtl_str_ln_cd_VC(info);
		if (vc == columnDtl_str_ln_nm) return doDtl_str_ln_nm_VC(info);
		if (vc == columnDtl_str_ln_cd_none_flg) return doDtl_str_ln_cd_none_flg_VC(info);
		if (vc == columnDtl_prcd_flg) return doDtl_prcd_flg_VC(info);
		if (vc == columnDtl_sim_flg) return doDtl_sim_flg_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_io_typ) return doDtl_io_typ_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
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
	 * [Cnd]パネルの[gr_prcd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_prcd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_opn_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_ordsav_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_fix_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_schd_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_sts_ord_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_prcd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_prcd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_opn_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_ordsav_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_fix_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_schd_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_sts_ord_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[missing_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_missing_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[tgt_ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_cmpl_ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_cmpl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_gi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_dt_fr_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prcd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prcd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_gr_prcd_flg) doCnd_gr_prcd_flg_NC(info);
		else if (nc == Cnd_gr_sts_opn_grp_flg) doCnd_gr_sts_opn_grp_flg_NC(info);
		else if (nc == Cnd_gr_sts_ordsav_grp_flg) doCnd_gr_sts_ordsav_grp_flg_NC(info);
		else if (nc == Cnd_gr_sts_fix_grp_flg) doCnd_gr_sts_fix_grp_flg_NC(info);
		else if (nc == Cnd_gr_sts_schd_grp_flg) doCnd_gr_sts_schd_grp_flg_NC(info);
		else if (nc == Cnd_gr_sts_ord_grp_flg) doCnd_gr_sts_ord_grp_flg_NC(info);
		else if (nc == Cnd_gr_act_flg) doCnd_gr_act_flg_NC(info);
		else if (nc == Cnd_gi_prcd_flg) doCnd_gi_prcd_flg_NC(info);
		else if (nc == Cnd_gi_sts_opn_grp_flg) doCnd_gi_sts_opn_grp_flg_NC(info);
		else if (nc == Cnd_gi_sts_ordsav_grp_flg) doCnd_gi_sts_ordsav_grp_flg_NC(info);
		else if (nc == Cnd_gi_sts_fix_grp_flg) doCnd_gi_sts_fix_grp_flg_NC(info);
		else if (nc == Cnd_gi_sts_schd_grp_flg) doCnd_gi_sts_schd_grp_flg_NC(info);
		else if (nc == Cnd_gi_sts_ord_grp_flg) doCnd_gi_sts_ord_grp_flg_NC(info);
		else if (nc == Cnd_gi_act_flg) doCnd_gi_act_flg_NC(info);
		else if (nc == Cnd_dt_fr) doCnd_dt_fr_NC(info);
		else if (nc == Cnd_dt_to) doCnd_dt_to_NC(info);
		else if (nc == Cnd_missing_flg) doCnd_missing_flg_NC(info);
		else if (nc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NC(info);
		else if (nc == Cnd_sim_flg) doCnd_sim_flg_NC(info);
		else if (nc == Cnd_purc_dt_fr) doCnd_purc_dt_fr_NC(info);
		else if (nc == Cnd_purc_dt_to) doCnd_purc_dt_to_NC(info);
		else if (nc == Cnd_tgt_ver_flg) doCnd_tgt_ver_flg_NC(info);
		else if (nc == Cnd_non_cmpl_ver_flg) doCnd_non_cmpl_ver_flg_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_master_dt) doCnd_master_dt_NC(info);
		else if (nc == Cnd_alloc_gi_flg) doCnd_alloc_gi_flg_NC(info);
		else if (nc == Cnd_disp_typ_Group) doCnd_disp_typ_NC(info);
		else if (nc == Cnd_key_flg) doCnd_key_flg_NC(info);
		else if (nc == columnDtl_ver_no) doDtl_ver_no_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_site_nm) doDtl_site_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NC(info);
		else if (nc == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NC(info);
		else if (nc == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NC(info);
		else if (nc == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NC(info);
		else if (nc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NC(info);
		else if (nc == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NC(info);
		else if (nc == columnDtl_dt) doDtl_dt_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_io_schd_typ) doDtl_io_schd_typ_NC(info);
		else if (nc == columnDtl_io_schd_typ_nm) doDtl_io_schd_typ_nm_NC(info);
		else if (nc == columnDtl_io_schd_sts_typ) doDtl_io_schd_sts_typ_NC(info);
		else if (nc == columnDtl_io_schd_sts_typ_nm) doDtl_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_NC(info);
		else if (nc == columnDtl_trn_typ) doDtl_trn_typ_NC(info);
		else if (nc == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_NC(info);
		else if (nc == columnDtl_io_act_typ) doDtl_io_act_typ_NC(info);
		else if (nc == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_oper_inst_no) doDtl_oper_inst_no_NC(info);
		else if (nc == columnDtl_par_lot_no) doDtl_par_lot_no_NC(info);
		else if (nc == columnDtl_par_sublot_no) doDtl_par_sublot_no_NC(info);
		else if (nc == columnDtl_par_itm_ord_no) doDtl_par_itm_ord_no_NC(info);
		else if (nc == columnDtl_par_oper_ord_no) doDtl_par_oper_ord_no_NC(info);
		else if (nc == columnDtl_par_dt_fr) doDtl_par_dt_fr_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_mfg_act_no) doDtl_mfg_act_no_NC(info);
		else if (nc == columnDtl_oper_act_no) doDtl_oper_act_no_NC(info);
		else if (nc == columnDtl_str_ln_cd) doDtl_str_ln_cd_NC(info);
		else if (nc == columnDtl_str_ln_nm) doDtl_str_ln_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
		else if (nc == columnDtl_prcd_flg) doDtl_prcd_flg_NC(info);
		else if (nc == columnDtl_sim_flg) doDtl_sim_flg_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_io_typ) doDtl_io_typ_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
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
	 * [Cnd]パネルの[gr_prcd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_prcd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_opn_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ordsav_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_fix_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_schd_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ord_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_prcd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_prcd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_opn_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ordsav_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_fix_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_schd_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ord_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[missing_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_missing_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[tgt_ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_cmpl_ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_cmpl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_gi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prcd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prcd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_gr_prcd_flg) doCnd_gr_prcd_flg_NE(info);
		else if (ne == Cnd_gr_sts_opn_grp_flg) doCnd_gr_sts_opn_grp_flg_NE(info);
		else if (ne == Cnd_gr_sts_ordsav_grp_flg) doCnd_gr_sts_ordsav_grp_flg_NE(info);
		else if (ne == Cnd_gr_sts_fix_grp_flg) doCnd_gr_sts_fix_grp_flg_NE(info);
		else if (ne == Cnd_gr_sts_schd_grp_flg) doCnd_gr_sts_schd_grp_flg_NE(info);
		else if (ne == Cnd_gr_sts_ord_grp_flg) doCnd_gr_sts_ord_grp_flg_NE(info);
		else if (ne == Cnd_gr_act_flg) doCnd_gr_act_flg_NE(info);
		else if (ne == Cnd_gi_prcd_flg) doCnd_gi_prcd_flg_NE(info);
		else if (ne == Cnd_gi_sts_opn_grp_flg) doCnd_gi_sts_opn_grp_flg_NE(info);
		else if (ne == Cnd_gi_sts_ordsav_grp_flg) doCnd_gi_sts_ordsav_grp_flg_NE(info);
		else if (ne == Cnd_gi_sts_fix_grp_flg) doCnd_gi_sts_fix_grp_flg_NE(info);
		else if (ne == Cnd_gi_sts_schd_grp_flg) doCnd_gi_sts_schd_grp_flg_NE(info);
		else if (ne == Cnd_gi_sts_ord_grp_flg) doCnd_gi_sts_ord_grp_flg_NE(info);
		else if (ne == Cnd_gi_act_flg) doCnd_gi_act_flg_NE(info);
		else if (ne == Cnd_dt_fr) doCnd_dt_fr_NE(info);
		else if (ne == Cnd_dt_to) doCnd_dt_to_NE(info);
		else if (ne == Cnd_missing_flg) doCnd_missing_flg_NE(info);
		else if (ne == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NE(info);
		else if (ne == Cnd_sim_flg) doCnd_sim_flg_NE(info);
		else if (ne == Cnd_purc_dt_fr) doCnd_purc_dt_fr_NE(info);
		else if (ne == Cnd_purc_dt_to) doCnd_purc_dt_to_NE(info);
		else if (ne == Cnd_tgt_ver_flg) doCnd_tgt_ver_flg_NE(info);
		else if (ne == Cnd_non_cmpl_ver_flg) doCnd_non_cmpl_ver_flg_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_master_dt) doCnd_master_dt_NE(info);
		else if (ne == Cnd_alloc_gi_flg) doCnd_alloc_gi_flg_NE(info);
		else if (ne == Cnd_disp_typ_Group) doCnd_disp_typ_NE(info);
		else if (ne == Cnd_key_flg) doCnd_key_flg_NE(info);
		else if (ne == columnDtl_ver_no) doDtl_ver_no_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_site_nm) doDtl_site_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NE(info);
		else if (ne == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NE(info);
		else if (ne == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NE(info);
		else if (ne == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NE(info);
		else if (ne == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NE(info);
		else if (ne == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NE(info);
		else if (ne == columnDtl_dt) doDtl_dt_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_io_schd_typ) doDtl_io_schd_typ_NE(info);
		else if (ne == columnDtl_io_schd_typ_nm) doDtl_io_schd_typ_nm_NE(info);
		else if (ne == columnDtl_io_schd_sts_typ) doDtl_io_schd_sts_typ_NE(info);
		else if (ne == columnDtl_io_schd_sts_typ_nm) doDtl_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_NE(info);
		else if (ne == columnDtl_trn_typ) doDtl_trn_typ_NE(info);
		else if (ne == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_NE(info);
		else if (ne == columnDtl_io_act_typ) doDtl_io_act_typ_NE(info);
		else if (ne == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_oper_inst_no) doDtl_oper_inst_no_NE(info);
		else if (ne == columnDtl_par_lot_no) doDtl_par_lot_no_NE(info);
		else if (ne == columnDtl_par_sublot_no) doDtl_par_sublot_no_NE(info);
		else if (ne == columnDtl_par_itm_ord_no) doDtl_par_itm_ord_no_NE(info);
		else if (ne == columnDtl_par_oper_ord_no) doDtl_par_oper_ord_no_NE(info);
		else if (ne == columnDtl_par_dt_fr) doDtl_par_dt_fr_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_mfg_act_no) doDtl_mfg_act_no_NE(info);
		else if (ne == columnDtl_oper_act_no) doDtl_oper_act_no_NE(info);
		else if (ne == columnDtl_str_ln_cd) doDtl_str_ln_cd_NE(info);
		else if (ne == columnDtl_str_ln_nm) doDtl_str_ln_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NE(info);
		else if (ne == columnDtl_prcd_flg) doDtl_prcd_flg_NE(info);
		else if (ne == columnDtl_sim_flg) doDtl_sim_flg_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_io_typ) doDtl_io_typ_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
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
	 * [Cnd]パネルの[gr_prcd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_prcd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_opn_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ordsav_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_fix_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_schd_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ord_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_prcd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_prcd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_opn_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ordsav_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_fix_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_schd_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ord_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[missing_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_missing_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[tgt_ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_cmpl_ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_cmpl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_gi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prcd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prcd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_gr_prcd_flg) doCnd_gr_prcd_flg_NX(info);
		else if (nx == Cnd_gr_sts_opn_grp_flg) doCnd_gr_sts_opn_grp_flg_NX(info);
		else if (nx == Cnd_gr_sts_ordsav_grp_flg) doCnd_gr_sts_ordsav_grp_flg_NX(info);
		else if (nx == Cnd_gr_sts_fix_grp_flg) doCnd_gr_sts_fix_grp_flg_NX(info);
		else if (nx == Cnd_gr_sts_schd_grp_flg) doCnd_gr_sts_schd_grp_flg_NX(info);
		else if (nx == Cnd_gr_sts_ord_grp_flg) doCnd_gr_sts_ord_grp_flg_NX(info);
		else if (nx == Cnd_gr_act_flg) doCnd_gr_act_flg_NX(info);
		else if (nx == Cnd_gi_prcd_flg) doCnd_gi_prcd_flg_NX(info);
		else if (nx == Cnd_gi_sts_opn_grp_flg) doCnd_gi_sts_opn_grp_flg_NX(info);
		else if (nx == Cnd_gi_sts_ordsav_grp_flg) doCnd_gi_sts_ordsav_grp_flg_NX(info);
		else if (nx == Cnd_gi_sts_fix_grp_flg) doCnd_gi_sts_fix_grp_flg_NX(info);
		else if (nx == Cnd_gi_sts_schd_grp_flg) doCnd_gi_sts_schd_grp_flg_NX(info);
		else if (nx == Cnd_gi_sts_ord_grp_flg) doCnd_gi_sts_ord_grp_flg_NX(info);
		else if (nx == Cnd_gi_act_flg) doCnd_gi_act_flg_NX(info);
		else if (nx == Cnd_dt_fr) doCnd_dt_fr_NX(info);
		else if (nx == Cnd_dt_to) doCnd_dt_to_NX(info);
		else if (nx == Cnd_missing_flg) doCnd_missing_flg_NX(info);
		else if (nx == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NX(info);
		else if (nx == Cnd_sim_flg) doCnd_sim_flg_NX(info);
		else if (nx == Cnd_purc_dt_fr) doCnd_purc_dt_fr_NX(info);
		else if (nx == Cnd_purc_dt_to) doCnd_purc_dt_to_NX(info);
		else if (nx == Cnd_tgt_ver_flg) doCnd_tgt_ver_flg_NX(info);
		else if (nx == Cnd_non_cmpl_ver_flg) doCnd_non_cmpl_ver_flg_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_master_dt) doCnd_master_dt_NX(info);
		else if (nx == Cnd_alloc_gi_flg) doCnd_alloc_gi_flg_NX(info);
		else if (nx == Cnd_disp_typ_Group) doCnd_disp_typ_NX(info);
		else if (nx == Cnd_key_flg) doCnd_key_flg_NX(info);
		else if (nx == columnDtl_ver_no) doDtl_ver_no_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_site_nm) doDtl_site_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NX(info);
		else if (nx == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NX(info);
		else if (nx == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NX(info);
		else if (nx == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NX(info);
		else if (nx == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NX(info);
		else if (nx == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NX(info);
		else if (nx == columnDtl_dt) doDtl_dt_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_io_schd_typ) doDtl_io_schd_typ_NX(info);
		else if (nx == columnDtl_io_schd_typ_nm) doDtl_io_schd_typ_nm_NX(info);
		else if (nx == columnDtl_io_schd_sts_typ) doDtl_io_schd_sts_typ_NX(info);
		else if (nx == columnDtl_io_schd_sts_typ_nm) doDtl_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_NX(info);
		else if (nx == columnDtl_trn_typ) doDtl_trn_typ_NX(info);
		else if (nx == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_NX(info);
		else if (nx == columnDtl_io_act_typ) doDtl_io_act_typ_NX(info);
		else if (nx == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_oper_inst_no) doDtl_oper_inst_no_NX(info);
		else if (nx == columnDtl_par_lot_no) doDtl_par_lot_no_NX(info);
		else if (nx == columnDtl_par_sublot_no) doDtl_par_sublot_no_NX(info);
		else if (nx == columnDtl_par_itm_ord_no) doDtl_par_itm_ord_no_NX(info);
		else if (nx == columnDtl_par_oper_ord_no) doDtl_par_oper_ord_no_NX(info);
		else if (nx == columnDtl_par_dt_fr) doDtl_par_dt_fr_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_mfg_act_no) doDtl_mfg_act_no_NX(info);
		else if (nx == columnDtl_oper_act_no) doDtl_oper_act_no_NX(info);
		else if (nx == columnDtl_str_ln_cd) doDtl_str_ln_cd_NX(info);
		else if (nx == columnDtl_str_ln_nm) doDtl_str_ln_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NX(info);
		else if (nx == columnDtl_prcd_flg) doDtl_prcd_flg_NX(info);
		else if (nx == columnDtl_sim_flg) doDtl_sim_flg_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_io_typ) doDtl_io_typ_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
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
	 * [Cnd]パネルの[gr_prcd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_prcd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_opn_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_opn_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ordsav_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ordsav_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_fix_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_fix_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_schd_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_schd_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_sts_ord_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_sts_ord_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_prcd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_prcd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_opn_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_opn_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ordsav_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ordsav_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_fix_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_fix_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_schd_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_schd_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_sts_ord_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_sts_ord_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[missing_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_missing_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[tgt_ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_cmpl_ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_cmpl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_gi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prcd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prcd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dt_fr) doCnd_dt_fr_LC(info);
		else if (lc == Cnd_dt_to) doCnd_dt_to_LC(info);
		else if (lc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_LC(info);
		else if (lc == Cnd_purc_dt_fr) doCnd_purc_dt_fr_LC(info);
		else if (lc == Cnd_purc_dt_to) doCnd_purc_dt_to_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Cnd_master_dt) doCnd_master_dt_LC(info);
		else if (lc == columnDtl_ver_no) doDtl_ver_no_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_site_nm) doDtl_site_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_LC(info);
		else if (lc == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_LC(info);
		else if (lc == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_LC(info);
		else if (lc == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_LC(info);
		else if (lc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_LC(info);
		else if (lc == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_LC(info);
		else if (lc == columnDtl_dt) doDtl_dt_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_io_schd_typ) doDtl_io_schd_typ_LC(info);
		else if (lc == columnDtl_io_schd_typ_nm) doDtl_io_schd_typ_nm_LC(info);
		else if (lc == columnDtl_io_schd_sts_typ) doDtl_io_schd_sts_typ_LC(info);
		else if (lc == columnDtl_io_schd_sts_typ_nm) doDtl_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_LC(info);
		else if (lc == columnDtl_trn_typ) doDtl_trn_typ_LC(info);
		else if (lc == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_LC(info);
		else if (lc == columnDtl_io_act_typ) doDtl_io_act_typ_LC(info);
		else if (lc == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_oper_inst_no) doDtl_oper_inst_no_LC(info);
		else if (lc == columnDtl_par_lot_no) doDtl_par_lot_no_LC(info);
		else if (lc == columnDtl_par_sublot_no) doDtl_par_sublot_no_LC(info);
		else if (lc == columnDtl_par_itm_ord_no) doDtl_par_itm_ord_no_LC(info);
		else if (lc == columnDtl_par_oper_ord_no) doDtl_par_oper_ord_no_LC(info);
		else if (lc == columnDtl_par_dt_fr) doDtl_par_dt_fr_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_mfg_act_no) doDtl_mfg_act_no_LC(info);
		else if (lc == columnDtl_oper_act_no) doDtl_oper_act_no_LC(info);
		else if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		else if (lc == columnDtl_str_ln_nm) doDtl_str_ln_nm_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_io_typ) doDtl_io_typ_LC(info);
	}

	/**
	 * [Cnd]パネルの[dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_typ]の作成メソッド
	 */
	public MCList getCnd_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0180.Srch01")) {
			return new MS_MSBCL0180_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0180.Srch02")) {
			return new MS_MSBCL0180_Srch02Bridge();
		}
		if (id.equals("MS.MSBCL0180.Srch03")) {
			return new MS_MSBCL0180_Srch03Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0180_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0180_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0180_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0180_Srch01Bridge() {
			p_MS_MSBCL0180_Srch01 = new MCParam(PDef.MS_MSBCL0180_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0180_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class));
			param.addDownBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());

			p_MS_MSBCL0180_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0180_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0180_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0180_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0180_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0180.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0180.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0180.DtlR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0180.DtlR>)down(0);
		}
		protected mcframe.clientMSBC.MSBCP0180.CndR down1() {
			return (mcframe.clientMSBC.MSBCP0180.CndR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0180_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class));
			p_MS_MSBCL0180_Srch01.addDownBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());
		}
		protected MCParam param() {
			return p_MS_MSBCL0180_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0180.DtlR>)p_MS_MSBCL0180_Srch01.getContainerParam().getDownBlock(0));
			setCndR((mcframe.clientMSBC.MSBCP0180.CndR)p_MS_MSBCL0180_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getCndR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCndR());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0180_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0180_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0180_Srch02;

		/** コンストラクタ */
		protected MS_MSBCL0180_Srch02Bridge() {
			p_MS_MSBCL0180_Srch02 = new MCParam(PDef.MS_MSBCL0180_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0180_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class));
			param.addDownBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());

			p_MS_MSBCL0180_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0180_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0180_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0180_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0180_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0180.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0180.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0180.DtlR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0180.DtlR>)down(0);
		}
		protected mcframe.clientMSBC.MSBCP0180.CndR down1() {
			return (mcframe.clientMSBC.MSBCP0180.CndR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0180_Srch02.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class));
			p_MS_MSBCL0180_Srch02.addDownBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());
		}
		protected MCParam param() {
			return p_MS_MSBCL0180_Srch02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0180.DtlR>)p_MS_MSBCL0180_Srch02.getContainerParam().getDownBlock(0));
			setCndR((mcframe.clientMSBC.MSBCP0180.CndR)p_MS_MSBCL0180_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getCndR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCndR());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0180_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0180_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0180_Srch03;

		/** コンストラクタ */
		protected MS_MSBCL0180_Srch03Bridge() {
			p_MS_MSBCL0180_Srch03 = new MCParam(PDef.MS_MSBCL0180_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0180_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class));
			param.addDownBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());

			p_MS_MSBCL0180_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0180_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0180_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0180_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0180_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0180.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0180.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0180.DtlR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0180.DtlR>)down(0);
		}
		protected mcframe.clientMSBC.MSBCP0180.CndR down1() {
			return (mcframe.clientMSBC.MSBCP0180.CndR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0180_Srch03.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0180.DtlR.class));
			p_MS_MSBCL0180_Srch03.addDownBlock(mcframe.clientMSBC.MSBCP0180.CndR.create());
		}
		protected MCParam param() {
			return p_MS_MSBCL0180_Srch03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0180.DtlR>)p_MS_MSBCL0180_Srch03.getContainerParam().getDownBlock(0));
			setCndR((mcframe.clientMSBC.MSBCP0180.CndR)p_MS_MSBCL0180_Srch03.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getCndR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCndR());
			return result;
		}
	}
}