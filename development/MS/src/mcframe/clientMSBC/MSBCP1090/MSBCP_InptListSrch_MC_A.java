package mcframe.clientMSBC.MSBCP1090;

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
import mcframe.clientMSBC.MSBCP1090.MSBCP_InptListSrch_MC.MS_MSBCL1090_Srch01Caller;

/**
 * 画面"MSBCP_InptListSrch"パネルクラスです。<p>
 *
 * 投入予定・投入実績の一覧照会画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_InptListSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP1090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SrchMode1]ブロック関連のField定義
	public MCPanel SrchMode1Panel = null;
	public MCTitledBorder SrchMode1TitledBorder = null;
	// [SrchMode1]ブロックの項目のField定義
	// [SrchMode2]ブロック関連のField定義
	public MCPanel SrchMode2Panel = null;
	public MCTitledBorder SrchMode2TitledBorder = null;
	// [SrchMode2]ブロックの項目のField定義
	// [OperSts]ブロック関連のField定義
	public MCPanel OperStsPanel = null;
	public MCTitledBorder OperStsTitledBorder = null;
	// [OperSts]ブロックの項目のField定義
	// [InptSts]ブロック関連のField定義
	public MCPanel InptStsPanel = null;
	public MCTitledBorder InptStsTitledBorder = null;
	// [InptSts]ブロックの項目のField定義
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
	 * SCHD,Schedule,SCHD;ACT,Result,ACT SCHD,予定,SCHD;ACT,実績,ACT.<p>
	 *
	 */
	public MCButtonGroup Cnd_srch_mode1_Group = null;
	public MCRadioButton Cnd_srch_mode1_SCHD = null;
	public MCRadioButton Cnd_srch_mode1_ACT = null;
	/**
	 * INPT,Input,INPT;LOSS,Loss,LOSS INPT,投入,INPT;LOSS,ロス,LOSS.<p>
	 *
	 */
	public MCButtonGroup Cnd_srch_mode2_Group = null;
	public MCRadioButton Cnd_srch_mode2_INPT = null;
	public MCRadioButton Cnd_srch_mode2_LOSS = null;
	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_sav_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_ord_flg = null;
	/**
	 * In process 着手中.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_stt_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_cmpl_flg = null;
	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_sav_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_ord_flg = null;
	/**
	 * In process 着手中.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_stt_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_cmpl_flg = null;
	/**
	 * No scheduled 予定無し.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_no_schd_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_inpt_schd_dt_p_PPanel;
	public MCDateField Cnd_inpt_schd_dt_fr;	// [Cnd]の[inpt_schd_dt_p.ymd_fr]を[Cnd_inpt_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_inpt_schd_hm_fr;	// [Cnd]の[inpt_schd_dt_p.hm_fr]を[Cnd_inpt_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_inpt_schd_dt_to;	// [Cnd]の[inpt_schd_dt_p.ymd_to]を[Cnd_inpt_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_inpt_schd_hm_to;	// [Cnd]の[inpt_schd_dt_p.hm_to]を[Cnd_inpt_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_inpt_act_dt_p_PPanel;
	public MCDateField Cnd_inpt_act_dt_fr;	// [Cnd]の[inpt_act_dt_p.ymd_fr]を[Cnd_inpt_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_inpt_act_hm_fr;	// [Cnd]の[inpt_act_dt_p.hm_fr]を[Cnd_inpt_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_inpt_act_dt_to;	// [Cnd]の[inpt_act_dt_p.ymd_to]を[Cnd_inpt_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_inpt_act_hm_to;	// [Cnd]の[inpt_act_dt_p.hm_to]を[Cnd_inpt_act_hm_to]としてエイリアス定義。
	public MCLabel Cnd_inpt_ac_dt_fr_Label = null;
	/**
	 * Input recording date FROM 投入計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_inpt_ac_dt_fr = null;
	public MCLabel Cnd_inpt_ac_dt_to_Label = null;
	/**
	 * Input recording date TO 投入計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_inpt_ac_dt_to = null;
	public MCLabel Cnd_bkf_typ_Label = null;
	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_bkf_typ = null;
	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public MCTextField Cnd_bkf_typ_nm = null;
	public MCLabel Cnd_pr_rate_fr_Label = null;
	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumberField Cnd_pr_rate_fr = null;
	public MCLabel Cnd_pr_rate_to_Label = null;
	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumberField Cnd_pr_rate_to = null;
	/**
	 * Consider loss in progress 進捗率にロスを加味する.<p>
	 *
	 */
	public MCCheckBox Cnd_pr_rate_inc_loss_flg = null;
	/**
	 * Unallocated only 未引当のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_not_alloc_srch_flg = null;
	/**
	 * Child item for yield calculation only 収率計算用子品目のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_yield_calc_flg = null;
	public MCLabel Cnd_mfg_loc_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_site_nm = null;
	public MCLabel Cnd_mfg_loc_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_wg_nm = null;
	public MCLabel Cnd_mfg_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_grp_nm = null;
	public MCLabel Cnd_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_nm = null;
	public MCLabel Cnd_mfg_str_ln_cd_Label = null;
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_str_ln_nm = null;
	public MCLabel Cnd_inpt_loc_cd_Label = null;
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_inpt_loc_cd = null;
	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public MCTextField Cnd_inpt_loc_nm = null;
	public MCLabel Cnd_inpt_str_ln_cd_Label = null;
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_inpt_str_ln_cd = null;
	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_inpt_str_ln_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_oper_cd_Label = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCTextField Cnd_oper_nm = null;
	public MCLabel Cnd_oper_loc_cd_Label = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_oper_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCTextField Cnd_oper_loc_nm = null;
	public MCLabel Cnd_oper_str_ln_cd_Label = null;
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_str_ln_cd = null;
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_oper_str_ln_nm = null;
	public MCLabel Cnd_mfg_mtd_typ_Label = null;
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_mtd_typ = null;
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_mtd_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_chd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_chd_itm_typ;	// [Cnd]の[chd_itm_typ_p.itm_typ]を[Cnd_chd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_typ_nm;	// [Cnd]の[chd_itm_typ_p.itm_typ_nm]を[Cnd_chd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_typ_d_cd;	// [Cnd]の[chd_itm_typ_p.itm_typ_d_cd]を[Cnd_chd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_typ_d_nm;	// [Cnd]の[chd_itm_typ_p.itm_typ_d_nm]を[Cnd_chd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_inpt_ctl_typ_Label = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_inpt_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCTextField Cnd_inpt_ctl_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_chd_itm_p_PPanel;
	public MCTextField Cnd_chd_itm_cd;	// [Cnd]の[chd_itm_p.itm_cd]を[Cnd_chd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub1;	// [Cnd]の[chd_itm_p.itm_sub1]を[Cnd_chd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub2;	// [Cnd]の[chd_itm_p.itm_sub2]を[Cnd_chd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub3;	// [Cnd]の[chd_itm_p.itm_sub3]を[Cnd_chd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_nm;	// [Cnd]の[chd_itm_p.itm_nm]を[Cnd_chd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_chd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_chd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_sublot_no = null;
	public MCLabel Cnd_loss_rsn_cd_Label = null;
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loss_rsn_cd = null;
	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public MCTextField Cnd_loss_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_par_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_par_itm_typ;	// [Cnd]の[par_itm_typ_p.itm_typ]を[Cnd_par_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_nm]を[Cnd_par_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_typ_d_cd;	// [Cnd]の[par_itm_typ_p.itm_typ_d_cd]を[Cnd_par_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_d_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_d_nm]を[Cnd_par_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_mfg_inst_no_Label = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_no = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_par_sno_p_PPanel;
	public MCTextField Cnd_par_sno1;	// [Cnd]の[par_sno_p.sno1]を[Cnd_par_sno1]としてエイリアス定義。
	public MCTextField Cnd_par_sno2;	// [Cnd]の[par_sno_p.sno2]を[Cnd_par_sno2]としてエイリアス定義。
	public MCTextField Cnd_par_sno3;	// [Cnd]の[par_sno_p.sno3]を[Cnd_par_sno3]としてエイリアス定義。
	public MCTextField Cnd_par_sno4;	// [Cnd]の[par_sno_p.sno4]を[Cnd_par_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[par_sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[par_sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_inpt_rsn_cd_Label = null;
	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_inpt_rsn_cd = null;
	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public MCTextField Cnd_inpt_rsn_nm = null;
	public MCLabel Cnd_oper_usr_cd_Label = null;
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_oper_usr_cd = null;
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public MCTextField Cnd_oper_usr_nm = null;
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	public MCLabel Cnd_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_d_no = null;
	public MCLabel Cnd_oper_inst_no_Label = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_inst_no = null;
	public MCLabel Cnd_mfg_act_no_Label = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_no = null;
	public MCLabel Cnd_oper_act_no_Label = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_no = null;
	public MCLabel Cnd_inpt_schd_no_Label = null;
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_no = null;
	public MCLabel Cnd_inpt_act_no_Label = null;
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_no = null;
	public MCLabel Cnd_loss_act_no_Label = null;
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_loss_act_no = null;
	public MCLabel Cnd_mes_id_Label = null;
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public MCTextField Cnd_mes_id = null;
	public MCLabel Cnd_data_no_Label = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumberField Cnd_data_no = null;
	public MCLabel Cnd_ext_inpt_act_no_Label = null;
	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_inpt_act_no = null;
	public MCLabel Cnd_inpt_schd_inst_rpt_rmrks_Label = null;
	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_inst_rpt_rmrks = null;
	public MCLabel Cnd_inpt_schd_intr_rmrks_Label = null;
	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_intr_rmrks = null;
	public MCLabel Cnd_inpt_schd_sub_char1_Label = null;
	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_sub_char1 = null;
	public MCLabel Cnd_inpt_schd_sub_char2_Label = null;
	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_sub_char2 = null;
	public MCLabel Cnd_inpt_schd_sub_char3_Label = null;
	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_sub_char3 = null;
	public MCLabel Cnd_inpt_act_rpt_rmrks_Label = null;
	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_rpt_rmrks = null;
	public MCLabel Cnd_inpt_act_intr_rmrks_Label = null;
	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_intr_rmrks = null;
	public MCLabel Cnd_inpt_act_trd_rmrks_Label = null;
	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_trd_rmrks = null;
	public MCLabel Cnd_inpt_act_sub_char1_Label = null;
	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_sub_char1 = null;
	public MCLabel Cnd_inpt_act_sub_char2_Label = null;
	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_sub_char2 = null;
	public MCLabel Cnd_inpt_act_sub_char3_Label = null;
	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public MCTextField Cnd_inpt_act_sub_char3 = null;
	public MCLabel Cnd_mfg_act_rpt_rmrks_Label = null;
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_rpt_rmrks = null;
	public MCLabel Cnd_mfg_act_intr_rmrks_Label = null;
	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_intr_rmrks = null;
	public MCLabel Cnd_mfg_act_sub_char1_Label = null;
	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_sub_char1 = null;
	public MCLabel Cnd_mfg_act_sub_char2_Label = null;
	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_sub_char2 = null;
	public MCLabel Cnd_mfg_act_sub_char3_Label = null;
	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_sub_char3 = null;
	public MCLabel Cnd_oper_act_intr_rmrks_Label = null;
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_intr_rmrks = null;
	public MCLabel Cnd_oper_act_rpt_rmrks_Label = null;
	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_rpt_rmrks = null;
	public MCLabel Cnd_oper_act_sub_char1_Label = null;
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_sub_char1 = null;
	public MCLabel Cnd_oper_act_sub_char2_Label = null;
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_sub_char2 = null;
	public MCLabel Cnd_oper_act_sub_char3_Label = null;
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_sub_char3 = null;
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
	// [ChdItmGrp]ブロック関連のField定義
	public MCPanel ChdItmGrpPanel = null;
	// [ChdItmGrp]ブロックの項目のField定義
	// [ParItmGrp]ブロック関連のField定義
	public MCPanel ParItmGrpPanel = null;
	// [ParItmGrp]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBC.MSBCP1090.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Mfg. status (Input) 製造状況区分（投入）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_mfg_sts_typ = null;
	/**
	 * Mfg. status name (Input) 製造状況区分名（投入）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_mfg_sts_typ_nm = null;
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_mtd_typ = null;
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_mtd_typ_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_chd_itm_p_PPanel;
	public MCColumnConfig columnRslt_chd_itm_cd;// [Rslt]の[chd_itm_p.itm_cd]を[columnRslt_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub1;// [Rslt]の[chd_itm_p.itm_sub1]を[columnRslt_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub2;// [Rslt]の[chd_itm_p.itm_sub2]を[columnRslt_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub3;// [Rslt]の[chd_itm_p.itm_sub3]を[columnRslt_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_nm;// [Rslt]の[chd_itm_p.itm_nm]を[columnRslt_chd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inpt_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_inpt_qty;// [Rslt]の[inpt_qty_p.qty]を[columnRslt_base_unit_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_loss_qty_p_PPanel;
	public MCColumnConfig columnRslt_loss_qty;// [Rslt]の[loss_qty_p.qty]を[columnRslt_loss_qty]としてエイリアス定義。
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_rsn_cd = null;
	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sum_loss_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_loss_qty;// [Rslt]の[sum_loss_qty_p.qty]を[columnRslt_base_unit_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sum_fxd_loss_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_fxd_loss_qty;// [Rslt]の[sum_fxd_loss_qty_p.qty]を[columnRslt_base_unit_fxd_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inpt_rem_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_inpt_rem_qty;// [Rslt]の[inpt_rem_qty_p.qty]を[columnRslt_base_unit_inpt_rem_qty]としてエイリアス定義。
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	/**
	 * Cancel remaining orders started 着手打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_abort_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_inpt_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_schd_inpt_qty;// [Rslt]の[schd_inpt_qty_p.qty]を[columnRslt_base_unit_schd_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_schd_rqmt_qty;// [Rslt]の[schd_rqmt_qty_p.qty]を[columnRslt_base_unit_schd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_fxd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_schd_fxd_rqmt_qty;// [Rslt]の[schd_fxd_rqmt_qty_p.qty]を[columnRslt_base_unit_schd_fxd_rqmt_qty]としてエイリアス定義。
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
	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_rate = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_act_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_act_sublot_no]としてエイリアス定義。
	/**
	 * Lot No. (Order) ロットＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_lot_no = null;
	/**
	 * Sublot No. (Order) サブロットＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_act_tm_p_PPanel;
	public MCColumnConfig columnRslt_act_dt;// [Rslt]の[act_tm_p.ymd]を[columnRslt_act_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_hm;// [Rslt]の[act_tm_p.hm]を[columnRslt_act_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_ac_dt;// [Rslt]の[ac_dt_p.ac_dt]を[columnRslt_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_schd_dt;// [Rslt]の[schd_tm_p.ymd]を[columnRslt_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_schd_hm;// [Rslt]の[schd_tm_p.hm]を[columnRslt_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_nm = null;
	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_rsn_cd = null;
	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_rsn_nm = null;
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_loc_cd = null;
	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_inpt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_inpt_str_ln_cd;// [Rslt]の[inpt_str_ln_p.str_ln_cd]を[columnRslt_inpt_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_inpt_str_ln_nm;// [Rslt]の[inpt_str_ln_p.str_ln_nm]を[columnRslt_inpt_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_inpt_str_ln_cd_none_flg;// [Rslt]の[inpt_str_ln_p.str_ln_cd_none_flg]を[columnRslt_inpt_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_cd_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_cd_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_cd_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_inpt_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_inpt_qty;// [Rslt]の[cont_inpt_qty_p.cont_qty]を[columnRslt_cont_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_loss_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_loss_qty;// [Rslt]の[cont_loss_qty_p.cont_qty]を[columnRslt_cont_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_fxd_loss_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_fxd_loss_qty;// [Rslt]の[cont_fxd_loss_qty_p.cont_qty]を[columnRslt_cont_fxd_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_schd_inpt_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_schd_inpt_qty;// [Rslt]の[cont_schd_inpt_qty_p.cont_qty]を[columnRslt_cont_schd_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_schd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_schd_rqmt_qty;// [Rslt]の[cont_schd_rqmt_qty_p.cont_qty]を[columnRslt_cont_schd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_schd_fxd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_schd_fxd_rqmt_qty;// [Rslt]の[cont_schd_fxd_rqmt_qty_p.cont_qty]を[columnRslt_cont_schd_fxd_rqmt_qty]としてエイリアス定義。
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_typ_nm = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_nm = null;
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_seq = null;
	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_fix_flg = null;
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_typ = null;
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_typ_nm = null;
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_no = null;
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_no = null;
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_act_no = null;
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mes_id = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_nm = null;
	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_inpt_act_no = null;
	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_par_itm_p_PPanel;
	public MCColumnConfig columnRslt_par_itm_cd;// [Rslt]の[par_itm_p.itm_cd]を[columnRslt_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub1;// [Rslt]の[par_itm_p.itm_sub1]を[columnRslt_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub2;// [Rslt]の[par_itm_p.itm_sub2]を[columnRslt_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub3;// [Rslt]の[par_itm_p.itm_sub3]を[columnRslt_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_nm;// [Rslt]の[par_itm_p.itm_nm]を[columnRslt_par_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_st_act_p_PPanel;
	public MCColumnConfig columnRslt_st_act_dt;// [Rslt]の[st_act_p.ymd]を[columnRslt_st_act_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_st_act_hm;// [Rslt]の[st_act_p.hm]を[columnRslt_st_act_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_st_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_st_ac_dt;// [Rslt]の[st_ac_dt_p.ac_dt]を[columnRslt_st_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_end_act_p_PPanel;
	public MCColumnConfig columnRslt_end_act_dt;// [Rslt]の[end_act_p.ymd]を[columnRslt_end_act_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_end_act_hm;// [Rslt]の[end_act_p.hm]を[columnRslt_end_act_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_end_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_end_ac_dt;// [Rslt]の[end_ac_dt_p.ac_dt]を[columnRslt_end_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_mfg_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_mfg_inst_qty;// [Rslt]の[base_unit_mfg_inst_qty_p.qty]を[columnRslt_base_unit_mfg_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_yield_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_yield_schd_qty;// [Rslt]の[base_unit_yield_schd_qty_p.qty]を[columnRslt_base_unit_yield_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_st_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_st_act_qty;// [Rslt]の[base_unit_st_act_qty_p.qty]を[columnRslt_base_unit_st_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_yield_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_yield_qty;// [Rslt]の[base_unit_yield_qty_p.qty]を[columnRslt_base_unit_yield_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_dfct_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_dfct_qty;// [Rslt]の[base_unit_dfct_qty_p.qty]を[columnRslt_base_unit_dfct_qty]としてエイリアス定義。
	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_base_unit_cd = null;
	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_base_unit_dec_place = null;
	/**
	 * Parent lot No. (Output) 親ロットＮＯ（出来高）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_act_lot_no = null;
	/**
	 * Parent sublot No. (Output) 親サブロットＮＯ（出来高）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_act_sublot_no = null;
	/**
	 * Parent lot No. (Order) 親ロットＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_inst_lot_no = null;
	/**
	 * Parent sublot No. (Order) 親サブロットＮＯ（指図）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_inst_sublot_no = null;
	/**
	 * Mfg. status (Operation) 製造状況区分（工程）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_mfg_sts_typ = null;
	/**
	 * Mfg. status name (Operation) 製造状況区分名（工程）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_mfg_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_unit_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_unit_act_qty;// [Rslt]の[oper_unit_act_qty_p.qty]を[columnRslt_oper_unit_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_unit_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_unit_schd_qty;// [Rslt]の[oper_unit_schd_qty_p.qty]を[columnRslt_oper_unit_schd_qty]としてエイリアス定義。
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_cd = null;
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_nm = null;
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_dec_place = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_par_sno_p_PPanel;
	public MCColumnConfig columnRslt_par_sno1;// [Rslt]の[par_sno_p.sno1]を[columnRslt_par_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_sno2;// [Rslt]の[par_sno_p.sno2]を[columnRslt_par_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_sno3;// [Rslt]の[par_sno_p.sno3]を[columnRslt_par_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_sno4;// [Rslt]の[par_sno_p.sno4]を[columnRslt_par_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[par_sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[par_sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_ctl_typ_nm = null;
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_main_itm_flg = null;
	/**
	 * Child item for yield calculation 収率計算用子品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_calc_flg = null;
	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bkf_upd_flg = null;
	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mix_flg = null;
	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mix_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_inst_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_inpt_schd_ver_no;// [Rslt]の[inst_ver_no_p.ver_no]を[columnRslt_inpt_schd_ver_no]としてエイリアス定義。
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ_nm = null;
	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bkf_typ = null;
	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bkf_typ_nm = null;
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ctl_typ = null;
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ctl_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_acxfr_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_acxfr_act_qty;// [Rslt]の[acxfr_act_qty_p.qty]を[columnRslt_acxfr_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_acxfr_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_acxfr_act_qty;// [Rslt]の[cont_acxfr_act_qty_p.cont_qty]を[columnRslt_cont_acxfr_act_qty]としてエイリアス定義。
	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_rsn_cd = null;
	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_rsn_nm = null;
	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_bd_dpt_cd = null;
	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_bd_dpt_nm = null;
	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_intr_rmrks = null;
	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_inst_rpt_rmrks = null;
	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_sub_char1 = null;
	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_sub_char2 = null;
	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_sub_char3 = null;
	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_intr_rmrks = null;
	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_rpt_rmrks = null;
	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_trd_rmrks = null;
	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_sub_char1 = null;
	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_sub_char2 = null;
	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_act_sub_char3 = null;
	/**
	 * Loss result internal remarks ロス実績内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_act_intr_rmrks = null;
	/**
	 * Loss result transaction remarks ロス実績取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_act_trd_rmrks = null;
	/**
	 * Loss result spare 1 ロス実績予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_act_sub_char1 = null;
	/**
	 * Loss result spare 2 ロス実績予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_act_sub_char2 = null;
	/**
	 * Loss result spare 3 ロス実績予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loss_act_sub_char3 = null;
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_rpt_rmrks = null;
	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_intr_rmrks = null;
	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_sub_char1 = null;
	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_sub_char2 = null;
	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_sub_char3 = null;
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_intr_rmrks = null;
	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_rpt_rmrks = null;
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_sub_char1 = null;
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_sub_char2 = null;
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_sub_char3 = null;
	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_yield = null;
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_lower_yield = null;
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_std_yield = null;
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_upper_yield = null;
	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_yield = null;
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_lower_yield = null;
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_std_yield = null;
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_upper_yield = null;
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_nm = null;
	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_cd_none_flg = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_loc_nm = null;
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_str_ln_cd = null;
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_str_ln_nm = null;
	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_str_ln_cd_none_flg = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_grp_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_nm = null;
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ptn = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_no = null;
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_div_seq = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_d_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_no = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_no = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_no = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_seq = null;
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_disp_seq = null;
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_usr_cd = null;
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_usr_nm = null;
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_d_nm = null;
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ = null;
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ_nm = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ_d_cd = null;
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ_d_nm = null;
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
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_chd_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_chd_itm_grp_cd1;// [Rslt]の[chd_itm_grp_p.itm_grp_cd1]を[columnRslt_chd_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm1;// [Rslt]の[chd_itm_grp_p.itm_grp_nm1]を[columnRslt_chd_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd2;// [Rslt]の[chd_itm_grp_p.itm_grp_cd2]を[columnRslt_chd_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm2;// [Rslt]の[chd_itm_grp_p.itm_grp_nm2]を[columnRslt_chd_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd3;// [Rslt]の[chd_itm_grp_p.itm_grp_cd3]を[columnRslt_chd_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm3;// [Rslt]の[chd_itm_grp_p.itm_grp_nm3]を[columnRslt_chd_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd4;// [Rslt]の[chd_itm_grp_p.itm_grp_cd4]を[columnRslt_chd_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm4;// [Rslt]の[chd_itm_grp_p.itm_grp_nm4]を[columnRslt_chd_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd5;// [Rslt]の[chd_itm_grp_p.itm_grp_cd5]を[columnRslt_chd_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm5;// [Rslt]の[chd_itm_grp_p.itm_grp_nm5]を[columnRslt_chd_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd6;// [Rslt]の[chd_itm_grp_p.itm_grp_cd6]を[columnRslt_chd_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm6;// [Rslt]の[chd_itm_grp_p.itm_grp_nm6]を[columnRslt_chd_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd7;// [Rslt]の[chd_itm_grp_p.itm_grp_cd7]を[columnRslt_chd_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm7;// [Rslt]の[chd_itm_grp_p.itm_grp_nm7]を[columnRslt_chd_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd8;// [Rslt]の[chd_itm_grp_p.itm_grp_cd8]を[columnRslt_chd_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm8;// [Rslt]の[chd_itm_grp_p.itm_grp_nm8]を[columnRslt_chd_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd9;// [Rslt]の[chd_itm_grp_p.itm_grp_cd9]を[columnRslt_chd_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm9;// [Rslt]の[chd_itm_grp_p.itm_grp_nm9]を[columnRslt_chd_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_cd10;// [Rslt]の[chd_itm_grp_p.itm_grp_cd10]を[columnRslt_chd_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_grp_nm10;// [Rslt]の[chd_itm_grp_p.itm_grp_nm10]を[columnRslt_chd_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_par_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_par_itm_grp_cd1;// [Rslt]の[par_itm_grp_p.itm_grp_cd1]を[columnRslt_par_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm1;// [Rslt]の[par_itm_grp_p.itm_grp_nm1]を[columnRslt_par_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd2;// [Rslt]の[par_itm_grp_p.itm_grp_cd2]を[columnRslt_par_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm2;// [Rslt]の[par_itm_grp_p.itm_grp_nm2]を[columnRslt_par_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd3;// [Rslt]の[par_itm_grp_p.itm_grp_cd3]を[columnRslt_par_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm3;// [Rslt]の[par_itm_grp_p.itm_grp_nm3]を[columnRslt_par_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd4;// [Rslt]の[par_itm_grp_p.itm_grp_cd4]を[columnRslt_par_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm4;// [Rslt]の[par_itm_grp_p.itm_grp_nm4]を[columnRslt_par_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd5;// [Rslt]の[par_itm_grp_p.itm_grp_cd5]を[columnRslt_par_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm5;// [Rslt]の[par_itm_grp_p.itm_grp_nm5]を[columnRslt_par_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd6;// [Rslt]の[par_itm_grp_p.itm_grp_cd6]を[columnRslt_par_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm6;// [Rslt]の[par_itm_grp_p.itm_grp_nm6]を[columnRslt_par_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd7;// [Rslt]の[par_itm_grp_p.itm_grp_cd7]を[columnRslt_par_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm7;// [Rslt]の[par_itm_grp_p.itm_grp_nm7]を[columnRslt_par_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd8;// [Rslt]の[par_itm_grp_p.itm_grp_cd8]を[columnRslt_par_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm8;// [Rslt]の[par_itm_grp_p.itm_grp_nm8]を[columnRslt_par_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd9;// [Rslt]の[par_itm_grp_p.itm_grp_cd9]を[columnRslt_par_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm9;// [Rslt]の[par_itm_grp_p.itm_grp_nm9]を[columnRslt_par_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_cd10;// [Rslt]の[par_itm_grp_p.itm_grp_cd10]を[columnRslt_par_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_grp_nm10;// [Rslt]の[par_itm_grp_p.itm_grp_nm10]を[columnRslt_par_itm_grp_nm10]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Mfg. order entry 製造指図登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1010 = null;
	/**
	 * Mfg. result entry 製造実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1100 = null;
	/** [SRCH_SCHD]モードを表す定数 */
	public static final String SRCH_SCHD = "SRCH_SCHD";
	/** [SRCH_ACT_INPT]モードを表す定数 */
	public static final String SRCH_ACT_INPT = "SRCH_ACT_INPT";
	/** [SRCH_ACT_LOSS]モードを表す定数 */
	public static final String SRCH_ACT_LOSS = "SRCH_ACT_LOSS";
	/** [REF_SCHD]モードを表す定数 */
	public static final String REF_SCHD = "REF_SCHD";
	/** [REF_ACT_INPT]モードを表す定数 */
	public static final String REF_ACT_INPT = "REF_ACT_INPT";
	/** [REF_ACT_LOSS]モードを表す定数 */
	public static final String REF_ACT_LOSS = "REF_ACT_LOSS";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SCHD, SRCH_ACT_INPT, SRCH_ACT_LOSS, REF_SCHD, REF_ACT_INPT, REF_ACT_LOSS};
	
	/** [MS_MSBCL1090_Srch01]のCallerの作成 */
	protected MSBCP_InptListSrch_MC.MS_MSBCL1090_Srch01Caller createMS_MSBCL1090_Srch01() {
		MSBCP_InptListSrch_MC.MS_MSBCL1090_Srch01Caller<MSBCP_InptListSrch, MS_MSBCL1090_Srch01Bridge>
		caller = ((MSBCP_InptListSrch_MC)this).new MS_MSBCL1090_Srch01Caller<MSBCP_InptListSrch, MS_MSBCL1090_Srch01Bridge>(
					(MSBCP_InptListSrch)this, new MS_MSBCL1090_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL1090_Srch01]の呼び出し */
	protected void callMS_MSBCL1090_Srch01() {
		MCCaller caller = createMS_MSBCL1090_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP1090.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP1090.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP1090.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1090.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1090.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP1090.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP1090.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1090.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP1090.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP1090.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1090.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP1090.RsltR.class);
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
		ret.add(SrchMode1Panel);
		ret.add(SrchMode2Panel);
		ret.add(OperStsPanel);
		ret.add(InptStsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(ChdItmGrpPanel);
		ret.add(ParItmGrpPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_InptListSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_InptListSrch_MC_A(String name) {
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
		MSBCP_InptListSrch_MC.jbCreateSrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateSrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateOperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateInptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateTop((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateFold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateTab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateTab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateTab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateCnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateCtrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateRPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateRslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbCreateBtn((MSBCP_InptListSrch)this);
	}

	/**
	 * [SrchMode1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode1(MSBCP_InptListSrch p) {
	}

	/**
	 * [SrchMode2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode2(MSBCP_InptListSrch p) {
	}

	/**
	 * [OperSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOperSts(MSBCP_InptListSrch p) {
	}

	/**
	 * [InptSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInptSts(MSBCP_InptListSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_InptListSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_InptListSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_InptListSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_InptListSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBCP_InptListSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_InptListSrch p) {
		p.Cnd_inpt_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().inpt_schd_dt_p());
		p.Cnd_inpt_schd_dt_p_PPanel.setName("Cnd.inpt_schd_dt_p");
		p.Cnd_inpt_schd_dt_fr = p.Cnd_inpt_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_inpt_schd_dt_fr.addAliasName("Cnd.inpt_schd_dt_fr", p);
		p.Cnd_inpt_schd_hm_fr = p.Cnd_inpt_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_inpt_schd_hm_fr.addAliasName("Cnd.inpt_schd_hm_fr", p);
		p.Cnd_inpt_schd_dt_to = p.Cnd_inpt_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_inpt_schd_dt_to.addAliasName("Cnd.inpt_schd_dt_to", p);
		p.Cnd_inpt_schd_hm_to = p.Cnd_inpt_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_inpt_schd_hm_to.addAliasName("Cnd.inpt_schd_hm_to", p);
		p.Cnd_inpt_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().inpt_act_dt_p());
		p.Cnd_inpt_act_dt_p_PPanel.setName("Cnd.inpt_act_dt_p");
		p.Cnd_inpt_act_dt_fr = p.Cnd_inpt_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_inpt_act_dt_fr.addAliasName("Cnd.inpt_act_dt_fr", p);
		p.Cnd_inpt_act_hm_fr = p.Cnd_inpt_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_inpt_act_hm_fr.addAliasName("Cnd.inpt_act_hm_fr", p);
		p.Cnd_inpt_act_dt_to = p.Cnd_inpt_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_inpt_act_dt_to.addAliasName("Cnd.inpt_act_dt_to", p);
		p.Cnd_inpt_act_hm_to = p.Cnd_inpt_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_inpt_act_hm_to.addAliasName("Cnd.inpt_act_hm_to", p);
		p.Cnd_chd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().chd_itm_typ_p());
		p.Cnd_chd_itm_typ_p_PPanel.setName("Cnd.chd_itm_typ_p");
		p.Cnd_chd_itm_typ = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_chd_itm_typ.addAliasName("Cnd.chd_itm_typ", p);
		p.Cnd_chd_itm_typ_nm = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_chd_itm_typ_nm.addAliasName("Cnd.chd_itm_typ_nm", p);
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
		p.Cnd_par_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().par_itm_typ_p());
		p.Cnd_par_itm_typ_p_PPanel.setName("Cnd.par_itm_typ_p");
		p.Cnd_par_itm_typ = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_par_itm_typ.addAliasName("Cnd.par_itm_typ", p);
		p.Cnd_par_itm_typ_nm = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_par_itm_typ_nm.addAliasName("Cnd.par_itm_typ_nm", p);
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
		p.Cnd_par_sno_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().par_sno_p());
		p.Cnd_par_sno_p_PPanel.setName("Cnd.par_sno_p");
		p.Cnd_par_sno1 = p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_par_sno1.addAliasName("Cnd.par_sno1", p);
		p.Cnd_par_sno2 = p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_par_sno2.addAliasName("Cnd.par_sno2", p);
		p.Cnd_par_sno3 = p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_par_sno3.addAliasName("Cnd.par_sno3", p);
		p.Cnd_par_sno4 = p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_par_sno4.addAliasName("Cnd.par_sno4", p);
		p.Cnd_wrk_no = p.Cnd_par_sno_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_par_sno_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
	 * [ChdItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateChdItmGrp(MSBCP_InptListSrch p) {
	}

	/**
	 * [ParItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateParItmGrp(MSBCP_InptListSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_InptListSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_InptListSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_InptListSrch p) {
		p.Rslt_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$chd_itm_p);
		p.Rslt_chd_itm_p_PPanel.setName("Rslt.chd_itm_p");
		p.columnRslt_chd_itm_cd = p.Rslt_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_chd_itm_cd.addAliasName("Rslt.chd_itm_cd", p);
		p.columnRslt_chd_itm_sub1 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_chd_itm_sub1.addAliasName("Rslt.chd_itm_sub1", p);
		p.columnRslt_chd_itm_sub2 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_chd_itm_sub2.addAliasName("Rslt.chd_itm_sub2", p);
		p.columnRslt_chd_itm_sub3 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_chd_itm_sub3.addAliasName("Rslt.chd_itm_sub3", p);
		p.columnRslt_chd_itm_nm = p.Rslt_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_chd_itm_nm.addAliasName("Rslt.chd_itm_nm", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_inpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$inpt_qty_p);
		p.Rslt_inpt_qty_p_PPanel.setName("Rslt.inpt_qty_p");
		p.columnRslt_base_unit_inpt_qty = p.Rslt_inpt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_inpt_qty.addAliasName("Rslt.base_unit_inpt_qty", p);
		p.Rslt_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$loss_qty_p);
		p.Rslt_loss_qty_p_PPanel.setName("Rslt.loss_qty_p");
		p.columnRslt_loss_qty = p.Rslt_loss_qty_p_PPanel.columnQty_qty;
		p.columnRslt_loss_qty.addAliasName("Rslt.loss_qty", p);
		p.Rslt_sum_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$sum_loss_qty_p);
		p.Rslt_sum_loss_qty_p_PPanel.setName("Rslt.sum_loss_qty_p");
		p.columnRslt_base_unit_loss_qty = p.Rslt_sum_loss_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_loss_qty.addAliasName("Rslt.base_unit_loss_qty", p);
		p.Rslt_sum_fxd_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$sum_fxd_loss_qty_p);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.setName("Rslt.sum_fxd_loss_qty_p");
		p.columnRslt_base_unit_fxd_loss_qty = p.Rslt_sum_fxd_loss_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_fxd_loss_qty.addAliasName("Rslt.base_unit_fxd_loss_qty", p);
		p.Rslt_inpt_rem_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$inpt_rem_qty_p);
		p.Rslt_inpt_rem_qty_p_PPanel.setName("Rslt.inpt_rem_qty_p");
		p.columnRslt_base_unit_inpt_rem_qty = p.Rslt_inpt_rem_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_inpt_rem_qty.addAliasName("Rslt.base_unit_inpt_rem_qty", p);
		p.Rslt_schd_inpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$schd_inpt_qty_p);
		p.Rslt_schd_inpt_qty_p_PPanel.setName("Rslt.schd_inpt_qty_p");
		p.columnRslt_base_unit_schd_inpt_qty = p.Rslt_schd_inpt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_schd_inpt_qty.addAliasName("Rslt.base_unit_schd_inpt_qty", p);
		p.Rslt_schd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$schd_rqmt_qty_p);
		p.Rslt_schd_rqmt_qty_p_PPanel.setName("Rslt.schd_rqmt_qty_p");
		p.columnRslt_base_unit_schd_rqmt_qty = p.Rslt_schd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_schd_rqmt_qty.addAliasName("Rslt.base_unit_schd_rqmt_qty", p);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$schd_fxd_rqmt_qty_p);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.setName("Rslt.schd_fxd_rqmt_qty_p");
		p.columnRslt_base_unit_schd_fxd_rqmt_qty = p.Rslt_schd_fxd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_schd_fxd_rqmt_qty.addAliasName("Rslt.base_unit_schd_fxd_rqmt_qty", p);
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_act_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_act_lot_no.addAliasName("Rslt.act_lot_no", p);
		p.columnRslt_act_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_act_sublot_no.addAliasName("Rslt.act_sublot_no", p);
		p.Rslt_act_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$act_tm_p);
		p.Rslt_act_tm_p_PPanel.setName("Rslt.act_tm_p");
		p.columnRslt_act_dt = p.Rslt_act_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_act_dt.addAliasName("Rslt.act_dt", p);
		p.columnRslt_act_hm = p.Rslt_act_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_act_hm.addAliasName("Rslt.act_hm", p);
		p.Rslt_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$ac_dt_p);
		p.Rslt_ac_dt_p_PPanel.setName("Rslt.ac_dt_p");
		p.columnRslt_ac_dt = p.Rslt_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_ac_dt.addAliasName("Rslt.ac_dt", p);
		p.Rslt_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$schd_tm_p);
		p.Rslt_schd_tm_p_PPanel.setName("Rslt.schd_tm_p");
		p.columnRslt_schd_dt = p.Rslt_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_schd_dt.addAliasName("Rslt.schd_dt", p);
		p.columnRslt_schd_hm = p.Rslt_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_schd_hm.addAliasName("Rslt.schd_hm", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.Rslt_inpt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$inpt_str_ln_p);
		p.Rslt_inpt_str_ln_p_PPanel.setName("Rslt.inpt_str_ln_p");
		p.columnRslt_inpt_str_ln_cd = p.Rslt_inpt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_inpt_str_ln_cd.addAliasName("Rslt.inpt_str_ln_cd", p);
		p.columnRslt_inpt_str_ln_nm = p.Rslt_inpt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_inpt_str_ln_nm.addAliasName("Rslt.inpt_str_ln_nm", p);
		p.columnRslt_inpt_str_ln_cd_none_flg = p.Rslt_inpt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_inpt_str_ln_cd_none_flg.addAliasName("Rslt.inpt_str_ln_cd_none_flg", p);
		p.Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$act_cont_fctr_p);
		p.Rslt_act_cont_fctr_p_PPanel.setName("Rslt.act_cont_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_cont_fctr_unit_cd_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_fctr_unit_cd_p);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.setName("Rslt.cont_fctr_unit_cd_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_cd_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_cd_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_cont_inpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_inpt_qty_p);
		p.Rslt_cont_inpt_qty_p_PPanel.setName("Rslt.cont_inpt_qty_p");
		p.columnRslt_cont_inpt_qty = p.Rslt_cont_inpt_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_inpt_qty.addAliasName("Rslt.cont_inpt_qty", p);
		p.Rslt_cont_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_loss_qty_p);
		p.Rslt_cont_loss_qty_p_PPanel.setName("Rslt.cont_loss_qty_p");
		p.columnRslt_cont_loss_qty = p.Rslt_cont_loss_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_loss_qty.addAliasName("Rslt.cont_loss_qty", p);
		p.Rslt_cont_fxd_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_fxd_loss_qty_p);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.setName("Rslt.cont_fxd_loss_qty_p");
		p.columnRslt_cont_fxd_loss_qty = p.Rslt_cont_fxd_loss_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_fxd_loss_qty.addAliasName("Rslt.cont_fxd_loss_qty", p);
		p.Rslt_cont_schd_inpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_schd_inpt_qty_p);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.setName("Rslt.cont_schd_inpt_qty_p");
		p.columnRslt_cont_schd_inpt_qty = p.Rslt_cont_schd_inpt_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_schd_inpt_qty.addAliasName("Rslt.cont_schd_inpt_qty", p);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_schd_rqmt_qty_p);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.setName("Rslt.cont_schd_rqmt_qty_p");
		p.columnRslt_cont_schd_rqmt_qty = p.Rslt_cont_schd_rqmt_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_schd_rqmt_qty.addAliasName("Rslt.cont_schd_rqmt_qty", p);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_schd_fxd_rqmt_qty_p);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.setName("Rslt.cont_schd_fxd_rqmt_qty_p");
		p.columnRslt_cont_schd_fxd_rqmt_qty = p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_schd_fxd_rqmt_qty.addAliasName("Rslt.cont_schd_fxd_rqmt_qty", p);
		p.Rslt_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$par_itm_p);
		p.Rslt_par_itm_p_PPanel.setName("Rslt.par_itm_p");
		p.columnRslt_par_itm_cd = p.Rslt_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_par_itm_cd.addAliasName("Rslt.par_itm_cd", p);
		p.columnRslt_par_itm_sub1 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_par_itm_sub1.addAliasName("Rslt.par_itm_sub1", p);
		p.columnRslt_par_itm_sub2 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_par_itm_sub2.addAliasName("Rslt.par_itm_sub2", p);
		p.columnRslt_par_itm_sub3 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_par_itm_sub3.addAliasName("Rslt.par_itm_sub3", p);
		p.columnRslt_par_itm_nm = p.Rslt_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_par_itm_nm.addAliasName("Rslt.par_itm_nm", p);
		p.Rslt_st_act_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$st_act_p);
		p.Rslt_st_act_p_PPanel.setName("Rslt.st_act_p");
		p.columnRslt_st_act_dt = p.Rslt_st_act_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_st_act_dt.addAliasName("Rslt.st_act_dt", p);
		p.columnRslt_st_act_hm = p.Rslt_st_act_p_PPanel.columnYmdHm_hm;
		p.columnRslt_st_act_hm.addAliasName("Rslt.st_act_hm", p);
		p.Rslt_st_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$st_ac_dt_p);
		p.Rslt_st_ac_dt_p_PPanel.setName("Rslt.st_ac_dt_p");
		p.columnRslt_st_ac_dt = p.Rslt_st_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_st_ac_dt.addAliasName("Rslt.st_ac_dt", p);
		p.Rslt_end_act_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$end_act_p);
		p.Rslt_end_act_p_PPanel.setName("Rslt.end_act_p");
		p.columnRslt_end_act_dt = p.Rslt_end_act_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_end_act_dt.addAliasName("Rslt.end_act_dt", p);
		p.columnRslt_end_act_hm = p.Rslt_end_act_p_PPanel.columnYmdHm_hm;
		p.columnRslt_end_act_hm.addAliasName("Rslt.end_act_hm", p);
		p.Rslt_end_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$end_ac_dt_p);
		p.Rslt_end_ac_dt_p_PPanel.setName("Rslt.end_ac_dt_p");
		p.columnRslt_end_ac_dt = p.Rslt_end_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_end_ac_dt.addAliasName("Rslt.end_ac_dt", p);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$base_unit_mfg_inst_qty_p);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.setName("Rslt.base_unit_mfg_inst_qty_p");
		p.columnRslt_base_unit_mfg_inst_qty = p.Rslt_base_unit_mfg_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_mfg_inst_qty.addAliasName("Rslt.base_unit_mfg_inst_qty", p);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$base_unit_yield_schd_qty_p);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.setName("Rslt.base_unit_yield_schd_qty_p");
		p.columnRslt_base_unit_yield_schd_qty = p.Rslt_base_unit_yield_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_yield_schd_qty.addAliasName("Rslt.base_unit_yield_schd_qty", p);
		p.Rslt_base_unit_st_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$base_unit_st_act_qty_p);
		p.Rslt_base_unit_st_act_qty_p_PPanel.setName("Rslt.base_unit_st_act_qty_p");
		p.columnRslt_base_unit_st_act_qty = p.Rslt_base_unit_st_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_st_act_qty.addAliasName("Rslt.base_unit_st_act_qty", p);
		p.Rslt_base_unit_yield_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$base_unit_yield_qty_p);
		p.Rslt_base_unit_yield_qty_p_PPanel.setName("Rslt.base_unit_yield_qty_p");
		p.columnRslt_base_unit_yield_qty = p.Rslt_base_unit_yield_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_yield_qty.addAliasName("Rslt.base_unit_yield_qty", p);
		p.Rslt_base_unit_dfct_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$base_unit_dfct_qty_p);
		p.Rslt_base_unit_dfct_qty_p_PPanel.setName("Rslt.base_unit_dfct_qty_p");
		p.columnRslt_base_unit_dfct_qty = p.Rslt_base_unit_dfct_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_dfct_qty.addAliasName("Rslt.base_unit_dfct_qty", p);
		p.Rslt_oper_unit_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$oper_unit_act_qty_p);
		p.Rslt_oper_unit_act_qty_p_PPanel.setName("Rslt.oper_unit_act_qty_p");
		p.columnRslt_oper_unit_act_qty = p.Rslt_oper_unit_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_act_qty.addAliasName("Rslt.oper_unit_act_qty", p);
		p.Rslt_oper_unit_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$oper_unit_schd_qty_p);
		p.Rslt_oper_unit_schd_qty_p_PPanel.setName("Rslt.oper_unit_schd_qty_p");
		p.columnRslt_oper_unit_schd_qty = p.Rslt_oper_unit_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_schd_qty.addAliasName("Rslt.oper_unit_schd_qty", p);
		p.Rslt_par_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$par_sno_p);
		p.Rslt_par_sno_p_PPanel.setName("Rslt.par_sno_p");
		p.columnRslt_par_sno1 = p.Rslt_par_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_par_sno1.addAliasName("Rslt.par_sno1", p);
		p.columnRslt_par_sno2 = p.Rslt_par_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_par_sno2.addAliasName("Rslt.par_sno2", p);
		p.columnRslt_par_sno3 = p.Rslt_par_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_par_sno3.addAliasName("Rslt.par_sno3", p);
		p.columnRslt_par_sno4 = p.Rslt_par_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_par_sno4.addAliasName("Rslt.par_sno4", p);
		p.columnRslt_wrk_no = p.Rslt_par_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_par_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_inst_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$inst_ver_no_p);
		p.Rslt_inst_ver_no_p_PPanel.setName("Rslt.inst_ver_no_p");
		p.columnRslt_inpt_schd_ver_no = p.Rslt_inst_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_inpt_schd_ver_no.addAliasName("Rslt.inpt_schd_ver_no", p);
		p.Rslt_acxfr_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$acxfr_act_qty_p);
		p.Rslt_acxfr_act_qty_p_PPanel.setName("Rslt.acxfr_act_qty_p");
		p.columnRslt_acxfr_act_qty = p.Rslt_acxfr_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_acxfr_act_qty.addAliasName("Rslt.acxfr_act_qty", p);
		p.Rslt_cont_acxfr_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$cont_acxfr_act_qty_p);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.setName("Rslt.cont_acxfr_act_qty_p");
		p.columnRslt_cont_acxfr_act_qty = p.Rslt_cont_acxfr_act_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_acxfr_act_qty.addAliasName("Rslt.cont_acxfr_act_qty", p);
		p.Rslt_chd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$chd_itm_grp_p);
		p.Rslt_chd_itm_grp_p_PPanel.setName("Rslt.chd_itm_grp_p");
		p.columnRslt_chd_itm_grp_cd1 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_chd_itm_grp_cd1.addAliasName("Rslt.chd_itm_grp_cd1", p);
		p.columnRslt_chd_itm_grp_nm1 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_chd_itm_grp_nm1.addAliasName("Rslt.chd_itm_grp_nm1", p);
		p.columnRslt_chd_itm_grp_cd2 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_chd_itm_grp_cd2.addAliasName("Rslt.chd_itm_grp_cd2", p);
		p.columnRslt_chd_itm_grp_nm2 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_chd_itm_grp_nm2.addAliasName("Rslt.chd_itm_grp_nm2", p);
		p.columnRslt_chd_itm_grp_cd3 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_chd_itm_grp_cd3.addAliasName("Rslt.chd_itm_grp_cd3", p);
		p.columnRslt_chd_itm_grp_nm3 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_chd_itm_grp_nm3.addAliasName("Rslt.chd_itm_grp_nm3", p);
		p.columnRslt_chd_itm_grp_cd4 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_chd_itm_grp_cd4.addAliasName("Rslt.chd_itm_grp_cd4", p);
		p.columnRslt_chd_itm_grp_nm4 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_chd_itm_grp_nm4.addAliasName("Rslt.chd_itm_grp_nm4", p);
		p.columnRslt_chd_itm_grp_cd5 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_chd_itm_grp_cd5.addAliasName("Rslt.chd_itm_grp_cd5", p);
		p.columnRslt_chd_itm_grp_nm5 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_chd_itm_grp_nm5.addAliasName("Rslt.chd_itm_grp_nm5", p);
		p.columnRslt_chd_itm_grp_cd6 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_chd_itm_grp_cd6.addAliasName("Rslt.chd_itm_grp_cd6", p);
		p.columnRslt_chd_itm_grp_nm6 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_chd_itm_grp_nm6.addAliasName("Rslt.chd_itm_grp_nm6", p);
		p.columnRslt_chd_itm_grp_cd7 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_chd_itm_grp_cd7.addAliasName("Rslt.chd_itm_grp_cd7", p);
		p.columnRslt_chd_itm_grp_nm7 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_chd_itm_grp_nm7.addAliasName("Rslt.chd_itm_grp_nm7", p);
		p.columnRslt_chd_itm_grp_cd8 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_chd_itm_grp_cd8.addAliasName("Rslt.chd_itm_grp_cd8", p);
		p.columnRslt_chd_itm_grp_nm8 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_chd_itm_grp_nm8.addAliasName("Rslt.chd_itm_grp_nm8", p);
		p.columnRslt_chd_itm_grp_cd9 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_chd_itm_grp_cd9.addAliasName("Rslt.chd_itm_grp_cd9", p);
		p.columnRslt_chd_itm_grp_nm9 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_chd_itm_grp_nm9.addAliasName("Rslt.chd_itm_grp_nm9", p);
		p.columnRslt_chd_itm_grp_cd10 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_chd_itm_grp_cd10.addAliasName("Rslt.chd_itm_grp_cd10", p);
		p.columnRslt_chd_itm_grp_nm10 = p.Rslt_chd_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_chd_itm_grp_nm10.addAliasName("Rslt.chd_itm_grp_nm10", p);
		p.Rslt_par_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP1090.RsltR.$par_itm_grp_p);
		p.Rslt_par_itm_grp_p_PPanel.setName("Rslt.par_itm_grp_p");
		p.columnRslt_par_itm_grp_cd1 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_par_itm_grp_cd1.addAliasName("Rslt.par_itm_grp_cd1", p);
		p.columnRslt_par_itm_grp_nm1 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_par_itm_grp_nm1.addAliasName("Rslt.par_itm_grp_nm1", p);
		p.columnRslt_par_itm_grp_cd2 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_par_itm_grp_cd2.addAliasName("Rslt.par_itm_grp_cd2", p);
		p.columnRslt_par_itm_grp_nm2 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_par_itm_grp_nm2.addAliasName("Rslt.par_itm_grp_nm2", p);
		p.columnRslt_par_itm_grp_cd3 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_par_itm_grp_cd3.addAliasName("Rslt.par_itm_grp_cd3", p);
		p.columnRslt_par_itm_grp_nm3 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_par_itm_grp_nm3.addAliasName("Rslt.par_itm_grp_nm3", p);
		p.columnRslt_par_itm_grp_cd4 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_par_itm_grp_cd4.addAliasName("Rslt.par_itm_grp_cd4", p);
		p.columnRslt_par_itm_grp_nm4 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_par_itm_grp_nm4.addAliasName("Rslt.par_itm_grp_nm4", p);
		p.columnRslt_par_itm_grp_cd5 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_par_itm_grp_cd5.addAliasName("Rslt.par_itm_grp_cd5", p);
		p.columnRslt_par_itm_grp_nm5 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_par_itm_grp_nm5.addAliasName("Rslt.par_itm_grp_nm5", p);
		p.columnRslt_par_itm_grp_cd6 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_par_itm_grp_cd6.addAliasName("Rslt.par_itm_grp_cd6", p);
		p.columnRslt_par_itm_grp_nm6 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_par_itm_grp_nm6.addAliasName("Rslt.par_itm_grp_nm6", p);
		p.columnRslt_par_itm_grp_cd7 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_par_itm_grp_cd7.addAliasName("Rslt.par_itm_grp_cd7", p);
		p.columnRslt_par_itm_grp_nm7 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_par_itm_grp_nm7.addAliasName("Rslt.par_itm_grp_nm7", p);
		p.columnRslt_par_itm_grp_cd8 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_par_itm_grp_cd8.addAliasName("Rslt.par_itm_grp_cd8", p);
		p.columnRslt_par_itm_grp_nm8 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_par_itm_grp_nm8.addAliasName("Rslt.par_itm_grp_nm8", p);
		p.columnRslt_par_itm_grp_cd9 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_par_itm_grp_cd9.addAliasName("Rslt.par_itm_grp_cd9", p);
		p.columnRslt_par_itm_grp_nm9 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_par_itm_grp_nm9.addAliasName("Rslt.par_itm_grp_nm9", p);
		p.columnRslt_par_itm_grp_cd10 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_par_itm_grp_cd10.addAliasName("Rslt.par_itm_grp_cd10", p);
		p.columnRslt_par_itm_grp_nm10 = p.Rslt_par_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_par_itm_grp_nm10.addAliasName("Rslt.par_itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_InptListSrch p) {
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

	
	/** [Cnd_bkf_typ_ListPutter]の定義 */
	private MCListPutter Cnd_bkf_typ_p = null;

	/**
	 * [Cnd_bkf_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bkf_typ_ListPutter() {
		if (Cnd_bkf_typ_p == null) {
			Cnd_bkf_typ_p = createCnd_bkf_typ_ListPutter(Cnd_bkf_typ, "bkf_typ", "bkf_typ_nm");

		}
		return Cnd_bkf_typ_p;
	}
	
	
	/** [Cnd_mfg_loc_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_site_cd_p = null;

	/**
	 * [Cnd_mfg_loc_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_site_cd_ListPutter() {
		if (Cnd_mfg_loc_site_cd_p == null) {
			Cnd_mfg_loc_site_cd_p = createCnd_mfg_loc_site_cd_ListPutter(Cnd_mfg_loc_site_cd, "mfg_loc_site_cd", "mfg_loc_site_nm");

		}
		return Cnd_mfg_loc_site_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_site_nm_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_site_nm_p = null;

	/**
	 * [Cnd_mfg_loc_site_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_site_nm_ListPutter() {
		if (Cnd_mfg_loc_site_nm_p == null) {
			Cnd_mfg_loc_site_nm_p = createCnd_mfg_loc_site_nm_ListPutter(Cnd_mfg_loc_site_nm, "mfg_loc_site_nm");

		}
		return Cnd_mfg_loc_site_nm_p;
	}
	
	
	/** [Cnd_mfg_loc_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_wg_cd_p = null;

	/**
	 * [Cnd_mfg_loc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_wg_cd_ListPutter() {
		if (Cnd_mfg_loc_wg_cd_p == null) {
			Cnd_mfg_loc_wg_cd_p = createCnd_mfg_loc_wg_cd_ListPutter(Cnd_mfg_loc_wg_cd, "mfg_loc_wg_cd", "mfg_loc_wg_nm");

		}
		return Cnd_mfg_loc_wg_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_grp_cd_p = null;

	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_grp_cd_ListPutter() {
		if (Cnd_mfg_loc_grp_cd_p == null) {
			Cnd_mfg_loc_grp_cd_p = createCnd_mfg_loc_grp_cd_ListPutter(Cnd_mfg_loc_grp_cd, "mfg_loc_grp_cd", "mfg_loc_grp_nm");

		}
		return Cnd_mfg_loc_grp_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_cd_p = null;

	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_cd_ListPutter() {
		if (Cnd_mfg_loc_cd_p == null) {
			Cnd_mfg_loc_cd_p = createCnd_mfg_loc_cd_ListPutter(Cnd_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Cnd_mfg_loc_cd_p;
	}
	
	
	/** [Cnd_mfg_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_str_ln_cd_p = null;

	/**
	 * [Cnd_mfg_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_str_ln_cd_ListPutter() {
		if (Cnd_mfg_str_ln_cd_p == null) {
			Cnd_mfg_str_ln_cd_p = createCnd_mfg_str_ln_cd_ListPutter(Cnd_mfg_str_ln_cd, "mfg_str_ln_cd", "mfg_str_ln_nm");

		}
		return Cnd_mfg_str_ln_cd_p;
	}
	
	
	/** [Cnd_inpt_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inpt_loc_cd_p = null;

	/**
	 * [Cnd_inpt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inpt_loc_cd_ListPutter() {
		if (Cnd_inpt_loc_cd_p == null) {
			Cnd_inpt_loc_cd_p = createCnd_inpt_loc_cd_ListPutter(Cnd_inpt_loc_cd, "inpt_loc_cd", "inpt_loc_nm");

		}
		return Cnd_inpt_loc_cd_p;
	}
	
	
	/** [Cnd_inpt_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inpt_str_ln_cd_p = null;

	/**
	 * [Cnd_inpt_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inpt_str_ln_cd_ListPutter() {
		if (Cnd_inpt_str_ln_cd_p == null) {
			Cnd_inpt_str_ln_cd_p = createCnd_inpt_str_ln_cd_ListPutter(Cnd_inpt_str_ln_cd, "inpt_str_ln_cd", "inpt_str_ln_nm");

		}
		return Cnd_inpt_str_ln_cd_p;
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
	
	
	/** [Cnd_oper_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_cd_p = null;

	/**
	 * [Cnd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_cd_ListPutter() {
		if (Cnd_oper_cd_p == null) {
			Cnd_oper_cd_p = createCnd_oper_cd_ListPutter(Cnd_oper_cd, "oper_cd", "oper_nm");

		}
		return Cnd_oper_cd_p;
	}
	
	
	/** [Cnd_oper_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_loc_cd_p = null;

	/**
	 * [Cnd_oper_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_loc_cd_ListPutter() {
		if (Cnd_oper_loc_cd_p == null) {
			Cnd_oper_loc_cd_p = createCnd_oper_loc_cd_ListPutter(Cnd_oper_loc_cd, "oper_loc_cd", "oper_loc_nm");

		}
		return Cnd_oper_loc_cd_p;
	}
	
	
	/** [Cnd_oper_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_str_ln_cd_p = null;

	/**
	 * [Cnd_oper_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_str_ln_cd_ListPutter() {
		if (Cnd_oper_str_ln_cd_p == null) {
			Cnd_oper_str_ln_cd_p = createCnd_oper_str_ln_cd_ListPutter(Cnd_oper_str_ln_cd, "oper_str_ln_cd", "oper_str_ln_nm");

		}
		return Cnd_oper_str_ln_cd_p;
	}
	
	
	/** [Cnd_mfg_mtd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_mtd_typ_p = null;

	/**
	 * [Cnd_mfg_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_mtd_typ_ListPutter() {
		if (Cnd_mfg_mtd_typ_p == null) {
			Cnd_mfg_mtd_typ_p = createCnd_mfg_mtd_typ_ListPutter(Cnd_mfg_mtd_typ, "mfg_mtd_typ", "mfg_mtd_typ_nm");

		}
		return Cnd_mfg_mtd_typ_p;
	}
	
	
	/** [Cnd_inpt_ctl_typ_ListPutter]の定義 */
	private MCListPutter Cnd_inpt_ctl_typ_p = null;

	/**
	 * [Cnd_inpt_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inpt_ctl_typ_ListPutter() {
		if (Cnd_inpt_ctl_typ_p == null) {
			Cnd_inpt_ctl_typ_p = createCnd_inpt_ctl_typ_ListPutter(Cnd_inpt_ctl_typ, "inpt_ctl_typ", "inpt_ctl_typ_nm");

		}
		return Cnd_inpt_ctl_typ_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_cd_p = createCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_cd, "chd_itm_cd", "chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub1, "chd_itm_sub1", "chd_itm_nm","chd_itm_sub2","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub2, "chd_itm_sub2", "chd_itm_nm","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub3, "chd_itm_sub3", "chd_itm_nm");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_chd_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_chd_lot_no_p = null;

	/**
	 * [Cnd_chd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_lot_no_ListPutter() {
		if (Cnd_chd_lot_no_p == null) {
			Cnd_chd_lot_no_p = createCnd_chd_lot_no_ListPutter(Cnd_chd_lot_no, "chd_lot_no");

		}
		return Cnd_chd_lot_no_p;
	}
	
	
	/** [Cnd_chd_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_chd_sublot_no_p = null;

	/**
	 * [Cnd_chd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_sublot_no_ListPutter() {
		if (Cnd_chd_sublot_no_p == null) {
			Cnd_chd_sublot_no_p = createCnd_chd_sublot_no_ListPutter(Cnd_chd_sublot_no, "chd_sublot_no");

		}
		return Cnd_chd_sublot_no_p;
	}
	
	
	/** [Cnd_loss_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loss_rsn_cd_p = null;

	/**
	 * [Cnd_loss_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loss_rsn_cd_ListPutter() {
		if (Cnd_loss_rsn_cd_p == null) {
			Cnd_loss_rsn_cd_p = createCnd_loss_rsn_cd_ListPutter(Cnd_loss_rsn_cd, "loss_rsn_cd", "loss_rsn_nm");

		}
		return Cnd_loss_rsn_cd_p;
	}
	
	
	/** [Cnd_loss_rsn_nm_ListPutter]の定義 */
	private MCListPutter Cnd_loss_rsn_nm_p = null;

	/**
	 * [Cnd_loss_rsn_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loss_rsn_nm_ListPutter() {
		if (Cnd_loss_rsn_nm_p == null) {
			Cnd_loss_rsn_nm_p = createCnd_loss_rsn_nm_ListPutter(Cnd_loss_rsn_nm, "loss_rsn_nm");

		}
		return Cnd_loss_rsn_nm_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_cd_p = createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_inpt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inpt_rsn_cd_p = null;

	/**
	 * [Cnd_inpt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inpt_rsn_cd_ListPutter() {
		if (Cnd_inpt_rsn_cd_p == null) {
			Cnd_inpt_rsn_cd_p = createCnd_inpt_rsn_cd_ListPutter(Cnd_inpt_rsn_cd, "inpt_rsn_cd", "inpt_rsn_nm");

		}
		return Cnd_inpt_rsn_cd_p;
	}
	
	
	/** [Cnd_inpt_rsn_nm_ListPutter]の定義 */
	private MCListPutter Cnd_inpt_rsn_nm_p = null;

	/**
	 * [Cnd_inpt_rsn_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inpt_rsn_nm_ListPutter() {
		if (Cnd_inpt_rsn_nm_p == null) {
			Cnd_inpt_rsn_nm_p = createCnd_inpt_rsn_nm_ListPutter(Cnd_inpt_rsn_nm, "inpt_rsn_nm");

		}
		return Cnd_inpt_rsn_nm_p;
	}
	
	
	/** [Cnd_oper_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_usr_cd_p = null;

	/**
	 * [Cnd_oper_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_usr_cd_ListPutter() {
		if (Cnd_oper_usr_cd_p == null) {
			Cnd_oper_usr_cd_p = createCnd_oper_usr_cd_ListPutter(Cnd_oper_usr_cd, "oper_usr_cd", "oper_usr_nm");

		}
		return Cnd_oper_usr_cd_p;
	}
	
	
	/** [Rslt_gd_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gd_cd_p = null;

	/**
	 * [Rslt_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gd_cd_ListPutter() {
		if (Rslt_gd_cd_p == null) {
			Rslt_gd_cd_p = createRslt_gd_cd_ListPutter(columnRslt_gd_cd, "gd_cd");

		}
		return Rslt_gd_cd_p;
	}
	
	
	/** [Rslt_inpt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_inpt_rsn_cd_p = null;

	/**
	 * [Rslt_inpt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_inpt_rsn_cd_ListPutter() {
		if (Rslt_inpt_rsn_cd_p == null) {
			Rslt_inpt_rsn_cd_p = createRslt_inpt_rsn_cd_ListPutter(columnRslt_inpt_rsn_cd, "inpt_rsn_cd");

		}
		return Rslt_inpt_rsn_cd_p;
	}
	
	
	/** [Rslt_inpt_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_inpt_loc_cd_p = null;

	/**
	 * [Rslt_inpt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_inpt_loc_cd_ListPutter() {
		if (Rslt_inpt_loc_cd_p == null) {
			Rslt_inpt_loc_cd_p = createRslt_inpt_loc_cd_ListPutter(columnRslt_inpt_loc_cd, "inpt_loc_cd");

		}
		return Rslt_inpt_loc_cd_p;
	}
	
	
	/** [Rslt_stk_mng_typ_ListPutter]の定義 */
	private MCListPutter Rslt_stk_mng_typ_p = null;

	/**
	 * [Rslt_stk_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_mng_typ_ListPutter() {
		if (Rslt_stk_mng_typ_p == null) {
			Rslt_stk_mng_typ_p = createRslt_stk_mng_typ_ListPutter(columnRslt_stk_mng_typ, "stk_mng_typ");

		}
		return Rslt_stk_mng_typ_p;
	}
	
	
	/** [Rslt_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Rslt_stk_id_typ_p = null;

	/**
	 * [Rslt_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_id_typ_ListPutter() {
		if (Rslt_stk_id_typ_p == null) {
			Rslt_stk_id_typ_p = createRslt_stk_id_typ_ListPutter(columnRslt_stk_id_typ, "stk_id_typ");

		}
		return Rslt_stk_id_typ_p;
	}
	
	
	/** [Rslt_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_stk_bp_cd_p = null;

	/**
	 * [Rslt_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_bp_cd_ListPutter() {
		if (Rslt_stk_bp_cd_p == null) {
			Rslt_stk_bp_cd_p = createRslt_stk_bp_cd_ListPutter(columnRslt_stk_bp_cd, "stk_bp_cd");

		}
		return Rslt_stk_bp_cd_p;
	}
	
	
	/** [Rslt_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_stk_arrv_bp_cd_p = null;

	/**
	 * [Rslt_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_arrv_bp_cd_ListPutter() {
		if (Rslt_stk_arrv_bp_cd_p == null) {
			Rslt_stk_arrv_bp_cd_p = createRslt_stk_arrv_bp_cd_ListPutter(columnRslt_stk_arrv_bp_cd, "stk_arrv_bp_cd");

		}
		return Rslt_stk_arrv_bp_cd_p;
	}
	
	
	/** [Rslt_acxfr_act_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_acxfr_act_rsn_cd_p = null;

	/**
	 * [Rslt_acxfr_act_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_acxfr_act_rsn_cd_ListPutter() {
		if (Rslt_acxfr_act_rsn_cd_p == null) {
			Rslt_acxfr_act_rsn_cd_p = createRslt_acxfr_act_rsn_cd_ListPutter(columnRslt_acxfr_act_rsn_cd, "acxfr_act_rsn_cd");

		}
		return Rslt_acxfr_act_rsn_cd_p;
	}
	
	
	/** [Rslt_acxfr_act_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_acxfr_act_bd_dpt_cd_p = null;

	/**
	 * [Rslt_acxfr_act_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_acxfr_act_bd_dpt_cd_ListPutter() {
		if (Rslt_acxfr_act_bd_dpt_cd_p == null) {
			Rslt_acxfr_act_bd_dpt_cd_p = createRslt_acxfr_act_bd_dpt_cd_ListPutter(columnRslt_acxfr_act_bd_dpt_cd, "acxfr_act_bd_dpt_cd");

		}
		return Rslt_acxfr_act_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_InptListSrch create(){
		MSBCP_InptListSrch p = new MSBCP_InptListSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_InptListSrch create(String name){
		MSBCP_InptListSrch p = new MSBCP_InptListSrch(name);
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
		MSBCP_InptListSrch_MC.jbfInitSrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitSrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitOperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitInptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitTop((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitFold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitTab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitTab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitTab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitCnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitCtrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitRPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitRslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbfInitBtn((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitSrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitSrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitOperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitInptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitTop((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitFold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitTab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitTab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitTab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitCnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitCtrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitRPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitRslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.jbInitBtn((MSBCP_InptListSrch)this);
	}

	/**
	 * [SrchMode1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode1(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.SrchMode1Panel = p.beansFactory.createPanel("SrchMode1");
		p.SrchMode1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode2(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.SrchMode2Panel = p.beansFactory.createPanel("SrchMode2");
		p.SrchMode2TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OperSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOperSts(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.OperStsPanel = p.beansFactory.createPanel("OperSts");
		p.OperStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [InptSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInptSts(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.InptStsPanel = p.beansFactory.createPanel("InptSts");
		p.InptStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_InptListSrch p) {
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
	protected static void jbfInitTab1(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_srch_mode1_Group = p.beansFactory.createButtonGroup("Cnd.srch_mode1");
		p.Cnd_srch_mode1_SCHD = p.beansFactory.createRadioButton("Cnd.srch_mode1_SCHD");
		p.Cnd_srch_mode1_ACT = p.beansFactory.createRadioButton("Cnd.srch_mode1_ACT");
		p.Cnd_srch_mode2_Group = p.beansFactory.createButtonGroup("Cnd.srch_mode2");
		p.Cnd_srch_mode2_INPT = p.beansFactory.createRadioButton("Cnd.srch_mode2_INPT");
		p.Cnd_srch_mode2_LOSS = p.beansFactory.createRadioButton("Cnd.srch_mode2_LOSS");
		p.Cnd_oper_sav_flg = p.beansFactory.createCheckBox("Cnd.oper_sav_flg");
		p.Cnd_oper_ord_flg = p.beansFactory.createCheckBox("Cnd.oper_ord_flg");
		p.Cnd_oper_stt_flg = p.beansFactory.createCheckBox("Cnd.oper_stt_flg");
		p.Cnd_oper_cmpl_flg = p.beansFactory.createCheckBox("Cnd.oper_cmpl_flg");
		p.Cnd_inpt_sav_flg = p.beansFactory.createCheckBox("Cnd.inpt_sav_flg");
		p.Cnd_inpt_ord_flg = p.beansFactory.createCheckBox("Cnd.inpt_ord_flg");
		p.Cnd_inpt_stt_flg = p.beansFactory.createCheckBox("Cnd.inpt_stt_flg");
		p.Cnd_inpt_cmpl_flg = p.beansFactory.createCheckBox("Cnd.inpt_cmpl_flg");
		p.Cnd_inpt_no_schd_flg = p.beansFactory.createCheckBox("Cnd.inpt_no_schd_flg");
		p.Cnd_inpt_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.inpt_ac_dt_fr_Label");
		p.Cnd_inpt_ac_dt_fr = p.beansFactory.createDateField("Cnd.inpt_ac_dt_fr");
		p.Cnd_inpt_ac_dt_fr.setLabel(p.Cnd_inpt_ac_dt_fr_Label);
		p.Cnd_inpt_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.inpt_ac_dt_to_Label");
		p.Cnd_inpt_ac_dt_to = p.beansFactory.createDateField("Cnd.inpt_ac_dt_to");
		p.Cnd_inpt_ac_dt_to.setLabel(p.Cnd_inpt_ac_dt_to_Label);
		p.Cnd_bkf_typ_Label = p.beansFactory.createLabel("Cnd.bkf_typ_Label");
		p.Cnd_bkf_typ = p.beansFactory.createTextComboBox("Cnd.bkf_typ");
		p.Cnd_bkf_typ.setLabel(p.Cnd_bkf_typ_Label);
		p.Cnd_bkf_typ_nm = p.beansFactory.createTextField("Cnd.bkf_typ_nm");
		p.Cnd_pr_rate_fr_Label = p.beansFactory.createLabel("Cnd.pr_rate_fr_Label");
		p.Cnd_pr_rate_fr = p.beansFactory.createNumberField("Cnd.pr_rate_fr");
		p.Cnd_pr_rate_fr.setLabel(p.Cnd_pr_rate_fr_Label);
		p.Cnd_pr_rate_to_Label = p.beansFactory.createLabel("Cnd.pr_rate_to_Label");
		p.Cnd_pr_rate_to = p.beansFactory.createNumberField("Cnd.pr_rate_to");
		p.Cnd_pr_rate_to.setLabel(p.Cnd_pr_rate_to_Label);
		p.Cnd_pr_rate_inc_loss_flg = p.beansFactory.createCheckBox("Cnd.pr_rate_inc_loss_flg");
		p.Cnd_not_alloc_srch_flg = p.beansFactory.createCheckBox("Cnd.not_alloc_srch_flg");
		p.Cnd_yield_calc_flg = p.beansFactory.createCheckBox("Cnd.yield_calc_flg");
		p.Cnd_mfg_loc_site_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_site_cd_Label");
		p.Cnd_mfg_loc_site_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_site_cd");
		p.Cnd_mfg_loc_site_cd.setLabel(p.Cnd_mfg_loc_site_cd_Label);
		p.Cnd_mfg_loc_site_nm = p.beansFactory.createTextField("Cnd.mfg_loc_site_nm");
		p.Cnd_mfg_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_wg_cd_Label");
		p.Cnd_mfg_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_wg_cd");
		p.Cnd_mfg_loc_wg_cd.setLabel(p.Cnd_mfg_loc_wg_cd_Label);
		p.Cnd_mfg_loc_wg_nm = p.beansFactory.createTextField("Cnd.mfg_loc_wg_nm");
		p.Cnd_mfg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_grp_cd_Label");
		p.Cnd_mfg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_grp_cd");
		p.Cnd_mfg_loc_grp_cd.setLabel(p.Cnd_mfg_loc_grp_cd_Label);
		p.Cnd_mfg_loc_grp_nm = p.beansFactory.createTextField("Cnd.mfg_loc_grp_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_mfg_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.mfg_str_ln_cd_Label");
		p.Cnd_mfg_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.mfg_str_ln_cd");
		p.Cnd_mfg_str_ln_cd.setLabel(p.Cnd_mfg_str_ln_cd_Label);
		p.Cnd_mfg_str_ln_nm = p.beansFactory.createTextField("Cnd.mfg_str_ln_nm");
		p.Cnd_inpt_loc_cd_Label = p.beansFactory.createLabel("Cnd.inpt_loc_cd_Label");
		p.Cnd_inpt_loc_cd = p.beansFactory.createTextField("Cnd.inpt_loc_cd");
		p.Cnd_inpt_loc_cd.setLabel(p.Cnd_inpt_loc_cd_Label);
		p.Cnd_inpt_loc_nm = p.beansFactory.createTextField("Cnd.inpt_loc_nm");
		p.Cnd_inpt_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.inpt_str_ln_cd_Label");
		p.Cnd_inpt_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.inpt_str_ln_cd");
		p.Cnd_inpt_str_ln_cd.setLabel(p.Cnd_inpt_str_ln_cd_Label);
		p.Cnd_inpt_str_ln_nm = p.beansFactory.createTextField("Cnd.inpt_str_ln_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_oper_loc_cd_Label = p.beansFactory.createLabel("Cnd.oper_loc_cd_Label");
		p.Cnd_oper_loc_cd = p.beansFactory.createTextField("Cnd.oper_loc_cd");
		p.Cnd_oper_loc_cd.setLabel(p.Cnd_oper_loc_cd_Label);
		p.Cnd_oper_loc_nm = p.beansFactory.createTextField("Cnd.oper_loc_nm");
		p.Cnd_oper_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.oper_str_ln_cd_Label");
		p.Cnd_oper_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.oper_str_ln_cd");
		p.Cnd_oper_str_ln_cd.setLabel(p.Cnd_oper_str_ln_cd_Label);
		p.Cnd_oper_str_ln_nm = p.beansFactory.createTextField("Cnd.oper_str_ln_nm");
		p.Cnd_mfg_mtd_typ_Label = p.beansFactory.createLabel("Cnd.mfg_mtd_typ_Label");
		p.Cnd_mfg_mtd_typ = p.beansFactory.createTextComboBox("Cnd.mfg_mtd_typ");
		p.Cnd_mfg_mtd_typ.setLabel(p.Cnd_mfg_mtd_typ_Label);
		p.Cnd_mfg_mtd_typ_nm = p.beansFactory.createTextField("Cnd.mfg_mtd_typ_nm");
		p.Cnd_inpt_ctl_typ_Label = p.beansFactory.createLabel("Cnd.inpt_ctl_typ_Label");
		p.Cnd_inpt_ctl_typ = p.beansFactory.createTextComboBox("Cnd.inpt_ctl_typ");
		p.Cnd_inpt_ctl_typ.setLabel(p.Cnd_inpt_ctl_typ_Label);
		p.Cnd_inpt_ctl_typ_nm = p.beansFactory.createTextField("Cnd.inpt_ctl_typ_nm");
		p.Cnd_chd_lot_no_Label = p.beansFactory.createLabel("Cnd.chd_lot_no_Label");
		p.Cnd_chd_lot_no = p.beansFactory.createTextField("Cnd.chd_lot_no");
		p.Cnd_chd_lot_no.setLabel(p.Cnd_chd_lot_no_Label);
		p.Cnd_chd_sublot_no = p.beansFactory.createTextComboBox("Cnd.chd_sublot_no");
		p.Cnd_loss_rsn_cd_Label = p.beansFactory.createLabel("Cnd.loss_rsn_cd_Label");
		p.Cnd_loss_rsn_cd = p.beansFactory.createTextComboBox("Cnd.loss_rsn_cd");
		p.Cnd_loss_rsn_cd.setLabel(p.Cnd_loss_rsn_cd_Label);
		p.Cnd_loss_rsn_nm = p.beansFactory.createTextField("Cnd.loss_rsn_nm");
		p.Cnd_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.mfg_inst_no_Label");
		p.Cnd_mfg_inst_no = p.beansFactory.createTextField("Cnd.mfg_inst_no");
		p.Cnd_mfg_inst_no.setLabel(p.Cnd_mfg_inst_no_Label);
		p.Cnd_inpt_rsn_cd_Label = p.beansFactory.createLabel("Cnd.inpt_rsn_cd_Label");
		p.Cnd_inpt_rsn_cd = p.beansFactory.createTextComboBox("Cnd.inpt_rsn_cd");
		p.Cnd_inpt_rsn_cd.setLabel(p.Cnd_inpt_rsn_cd_Label);
		p.Cnd_inpt_rsn_nm = p.beansFactory.createTextField("Cnd.inpt_rsn_nm");
		p.Cnd_oper_usr_cd_Label = p.beansFactory.createLabel("Cnd.oper_usr_cd_Label");
		p.Cnd_oper_usr_cd = p.beansFactory.createTextField("Cnd.oper_usr_cd");
		p.Cnd_oper_usr_cd.setLabel(p.Cnd_oper_usr_cd_Label);
		p.Cnd_oper_usr_nm = p.beansFactory.createTextField("Cnd.oper_usr_nm");
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_oper_inst_no_Label = p.beansFactory.createLabel("Cnd.oper_inst_no_Label");
		p.Cnd_oper_inst_no = p.beansFactory.createTextField("Cnd.oper_inst_no");
		p.Cnd_oper_inst_no.setLabel(p.Cnd_oper_inst_no_Label);
		p.Cnd_mfg_act_no_Label = p.beansFactory.createLabel("Cnd.mfg_act_no_Label");
		p.Cnd_mfg_act_no = p.beansFactory.createTextField("Cnd.mfg_act_no");
		p.Cnd_mfg_act_no.setLabel(p.Cnd_mfg_act_no_Label);
		p.Cnd_oper_act_no_Label = p.beansFactory.createLabel("Cnd.oper_act_no_Label");
		p.Cnd_oper_act_no = p.beansFactory.createTextField("Cnd.oper_act_no");
		p.Cnd_oper_act_no.setLabel(p.Cnd_oper_act_no_Label);
		p.Cnd_inpt_schd_no_Label = p.beansFactory.createLabel("Cnd.inpt_schd_no_Label");
		p.Cnd_inpt_schd_no = p.beansFactory.createTextField("Cnd.inpt_schd_no");
		p.Cnd_inpt_schd_no.setLabel(p.Cnd_inpt_schd_no_Label);
		p.Cnd_inpt_act_no_Label = p.beansFactory.createLabel("Cnd.inpt_act_no_Label");
		p.Cnd_inpt_act_no = p.beansFactory.createTextField("Cnd.inpt_act_no");
		p.Cnd_inpt_act_no.setLabel(p.Cnd_inpt_act_no_Label);
		p.Cnd_loss_act_no_Label = p.beansFactory.createLabel("Cnd.loss_act_no_Label");
		p.Cnd_loss_act_no = p.beansFactory.createTextField("Cnd.loss_act_no");
		p.Cnd_loss_act_no.setLabel(p.Cnd_loss_act_no_Label);
		p.Cnd_mes_id_Label = p.beansFactory.createLabel("Cnd.mes_id_Label");
		p.Cnd_mes_id = p.beansFactory.createTextField("Cnd.mes_id");
		p.Cnd_mes_id.setLabel(p.Cnd_mes_id_Label);
		p.Cnd_data_no_Label = p.beansFactory.createLabel("Cnd.data_no_Label");
		p.Cnd_data_no = p.beansFactory.createNumberField("Cnd.data_no");
		p.Cnd_data_no.setLabel(p.Cnd_data_no_Label);
		p.Cnd_ext_inpt_act_no_Label = p.beansFactory.createLabel("Cnd.ext_inpt_act_no_Label");
		p.Cnd_ext_inpt_act_no = p.beansFactory.createTextField("Cnd.ext_inpt_act_no");
		p.Cnd_ext_inpt_act_no.setLabel(p.Cnd_ext_inpt_act_no_Label);
		p.Cnd_inpt_schd_inst_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.inpt_schd_inst_rpt_rmrks_Label");
		p.Cnd_inpt_schd_inst_rpt_rmrks = p.beansFactory.createTextField("Cnd.inpt_schd_inst_rpt_rmrks");
		p.Cnd_inpt_schd_inst_rpt_rmrks.setLabel(p.Cnd_inpt_schd_inst_rpt_rmrks_Label);
		p.Cnd_inpt_schd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.inpt_schd_intr_rmrks_Label");
		p.Cnd_inpt_schd_intr_rmrks = p.beansFactory.createTextField("Cnd.inpt_schd_intr_rmrks");
		p.Cnd_inpt_schd_intr_rmrks.setLabel(p.Cnd_inpt_schd_intr_rmrks_Label);
		p.Cnd_inpt_schd_sub_char1_Label = p.beansFactory.createLabel("Cnd.inpt_schd_sub_char1_Label");
		p.Cnd_inpt_schd_sub_char1 = p.beansFactory.createTextField("Cnd.inpt_schd_sub_char1");
		p.Cnd_inpt_schd_sub_char1.setLabel(p.Cnd_inpt_schd_sub_char1_Label);
		p.Cnd_inpt_schd_sub_char2_Label = p.beansFactory.createLabel("Cnd.inpt_schd_sub_char2_Label");
		p.Cnd_inpt_schd_sub_char2 = p.beansFactory.createTextField("Cnd.inpt_schd_sub_char2");
		p.Cnd_inpt_schd_sub_char2.setLabel(p.Cnd_inpt_schd_sub_char2_Label);
		p.Cnd_inpt_schd_sub_char3_Label = p.beansFactory.createLabel("Cnd.inpt_schd_sub_char3_Label");
		p.Cnd_inpt_schd_sub_char3 = p.beansFactory.createTextField("Cnd.inpt_schd_sub_char3");
		p.Cnd_inpt_schd_sub_char3.setLabel(p.Cnd_inpt_schd_sub_char3_Label);
		p.Cnd_inpt_act_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.inpt_act_rpt_rmrks_Label");
		p.Cnd_inpt_act_rpt_rmrks = p.beansFactory.createTextField("Cnd.inpt_act_rpt_rmrks");
		p.Cnd_inpt_act_rpt_rmrks.setLabel(p.Cnd_inpt_act_rpt_rmrks_Label);
		p.Cnd_inpt_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.inpt_act_intr_rmrks_Label");
		p.Cnd_inpt_act_intr_rmrks = p.beansFactory.createTextField("Cnd.inpt_act_intr_rmrks");
		p.Cnd_inpt_act_intr_rmrks.setLabel(p.Cnd_inpt_act_intr_rmrks_Label);
		p.Cnd_inpt_act_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.inpt_act_trd_rmrks_Label");
		p.Cnd_inpt_act_trd_rmrks = p.beansFactory.createTextField("Cnd.inpt_act_trd_rmrks");
		p.Cnd_inpt_act_trd_rmrks.setLabel(p.Cnd_inpt_act_trd_rmrks_Label);
		p.Cnd_inpt_act_sub_char1_Label = p.beansFactory.createLabel("Cnd.inpt_act_sub_char1_Label");
		p.Cnd_inpt_act_sub_char1 = p.beansFactory.createTextField("Cnd.inpt_act_sub_char1");
		p.Cnd_inpt_act_sub_char1.setLabel(p.Cnd_inpt_act_sub_char1_Label);
		p.Cnd_inpt_act_sub_char2_Label = p.beansFactory.createLabel("Cnd.inpt_act_sub_char2_Label");
		p.Cnd_inpt_act_sub_char2 = p.beansFactory.createTextField("Cnd.inpt_act_sub_char2");
		p.Cnd_inpt_act_sub_char2.setLabel(p.Cnd_inpt_act_sub_char2_Label);
		p.Cnd_inpt_act_sub_char3_Label = p.beansFactory.createLabel("Cnd.inpt_act_sub_char3_Label");
		p.Cnd_inpt_act_sub_char3 = p.beansFactory.createTextField("Cnd.inpt_act_sub_char3");
		p.Cnd_inpt_act_sub_char3.setLabel(p.Cnd_inpt_act_sub_char3_Label);
		p.Cnd_mfg_act_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.mfg_act_rpt_rmrks_Label");
		p.Cnd_mfg_act_rpt_rmrks = p.beansFactory.createTextField("Cnd.mfg_act_rpt_rmrks");
		p.Cnd_mfg_act_rpt_rmrks.setLabel(p.Cnd_mfg_act_rpt_rmrks_Label);
		p.Cnd_mfg_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.mfg_act_intr_rmrks_Label");
		p.Cnd_mfg_act_intr_rmrks = p.beansFactory.createTextField("Cnd.mfg_act_intr_rmrks");
		p.Cnd_mfg_act_intr_rmrks.setLabel(p.Cnd_mfg_act_intr_rmrks_Label);
		p.Cnd_mfg_act_sub_char1_Label = p.beansFactory.createLabel("Cnd.mfg_act_sub_char1_Label");
		p.Cnd_mfg_act_sub_char1 = p.beansFactory.createTextField("Cnd.mfg_act_sub_char1");
		p.Cnd_mfg_act_sub_char1.setLabel(p.Cnd_mfg_act_sub_char1_Label);
		p.Cnd_mfg_act_sub_char2_Label = p.beansFactory.createLabel("Cnd.mfg_act_sub_char2_Label");
		p.Cnd_mfg_act_sub_char2 = p.beansFactory.createTextField("Cnd.mfg_act_sub_char2");
		p.Cnd_mfg_act_sub_char2.setLabel(p.Cnd_mfg_act_sub_char2_Label);
		p.Cnd_mfg_act_sub_char3_Label = p.beansFactory.createLabel("Cnd.mfg_act_sub_char3_Label");
		p.Cnd_mfg_act_sub_char3 = p.beansFactory.createTextField("Cnd.mfg_act_sub_char3");
		p.Cnd_mfg_act_sub_char3.setLabel(p.Cnd_mfg_act_sub_char3_Label);
		p.Cnd_oper_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.oper_act_intr_rmrks_Label");
		p.Cnd_oper_act_intr_rmrks = p.beansFactory.createTextField("Cnd.oper_act_intr_rmrks");
		p.Cnd_oper_act_intr_rmrks.setLabel(p.Cnd_oper_act_intr_rmrks_Label);
		p.Cnd_oper_act_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.oper_act_rpt_rmrks_Label");
		p.Cnd_oper_act_rpt_rmrks = p.beansFactory.createTextField("Cnd.oper_act_rpt_rmrks");
		p.Cnd_oper_act_rpt_rmrks.setLabel(p.Cnd_oper_act_rpt_rmrks_Label);
		p.Cnd_oper_act_sub_char1_Label = p.beansFactory.createLabel("Cnd.oper_act_sub_char1_Label");
		p.Cnd_oper_act_sub_char1 = p.beansFactory.createTextField("Cnd.oper_act_sub_char1");
		p.Cnd_oper_act_sub_char1.setLabel(p.Cnd_oper_act_sub_char1_Label);
		p.Cnd_oper_act_sub_char2_Label = p.beansFactory.createLabel("Cnd.oper_act_sub_char2_Label");
		p.Cnd_oper_act_sub_char2 = p.beansFactory.createTextField("Cnd.oper_act_sub_char2");
		p.Cnd_oper_act_sub_char2.setLabel(p.Cnd_oper_act_sub_char2_Label);
		p.Cnd_oper_act_sub_char3_Label = p.beansFactory.createLabel("Cnd.oper_act_sub_char3_Label");
		p.Cnd_oper_act_sub_char3 = p.beansFactory.createTextField("Cnd.oper_act_sub_char3");
		p.Cnd_oper_act_sub_char3.setLabel(p.Cnd_oper_act_sub_char3_Label);
	}

	/**
	 * [ChdItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitChdItmGrp(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.ChdItmGrpPanel = p.beansFactory.createPanel("ChdItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [ParItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitParItmGrp(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.ParItmGrpPanel = p.beansFactory.createPanel("ParItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_inpt_mfg_sts_typ = p.beansFactory.createTableColumn("Rslt.inpt_mfg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_inpt_mfg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.inpt_mfg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_mtd_typ = p.beansFactory.createTableColumn("Rslt.mfg_mtd_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_loss_rsn_cd = p.beansFactory.createTableColumn("Rslt.loss_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_loss_rsn_nm = p.beansFactory.createTableColumn("Rslt.loss_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_schd_abort_flg = p.beansFactory.createTableColumn("Rslt.schd_abort_flg", MCColumnType.CHECK);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_pr_rate = p.beansFactory.createTableColumn("Rslt.pr_rate", MCColumnType.NUMBER);
		p.columnRslt_inst_lot_no = p.beansFactory.createTableColumn("Rslt.inst_lot_no", MCColumnType.TEXT);
		p.columnRslt_inst_sublot_no = p.beansFactory.createTableColumn("Rslt.inst_sublot_no", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_inpt_rsn_cd = p.beansFactory.createTableColumn("Rslt.inpt_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_inpt_rsn_nm = p.beansFactory.createTableColumn("Rslt.inpt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_inpt_loc_cd = p.beansFactory.createTableColumn("Rslt.inpt_loc_cd", MCColumnType.TEXT);
		p.columnRslt_inpt_loc_nm = p.beansFactory.createTableColumn("Rslt.inpt_loc_nm", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_prov_typ = p.beansFactory.createTableColumn("Rslt.prov_typ", MCColumnType.TEXT);
		p.columnRslt_prov_typ_nm = p.beansFactory.createTableColumn("Rslt.prov_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alt_grp_cd = p.beansFactory.createTableColumn("Rslt.alt_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alt_grp_nm = p.beansFactory.createTableColumn("Rslt.alt_grp_nm", MCColumnType.TEXT);
		p.columnRslt_alt_grp_seq = p.beansFactory.createTableColumn("Rslt.alt_grp_seq", MCColumnType.NUMBER);
		p.columnRslt_alt_itm_fix_flg = p.beansFactory.createTableColumn("Rslt.alt_itm_fix_flg", MCColumnType.CHECK);
		p.columnRslt_alt_itm_typ = p.beansFactory.createTableColumn("Rslt.alt_itm_typ", MCColumnType.TEXT);
		p.columnRslt_alt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.alt_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_no = p.beansFactory.createTableColumn("Rslt.inpt_schd_no", MCColumnType.TEXT);
		p.columnRslt_inpt_act_no = p.beansFactory.createTableColumn("Rslt.inpt_act_no", MCColumnType.TEXT);
		p.columnRslt_loss_act_no = p.beansFactory.createTableColumn("Rslt.loss_act_no", MCColumnType.TEXT);
		p.columnRslt_mes_id = p.beansFactory.createTableColumn("Rslt.mes_id", MCColumnType.TEXT);
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.NUMBER);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_inpt_act_no = p.beansFactory.createTableColumn("Rslt.ext_inpt_act_no", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_par_base_unit_cd = p.beansFactory.createTableColumn("Rslt.par_base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_par_base_unit_nm = p.beansFactory.createTableColumn("Rslt.par_base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_par_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.par_base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_par_act_lot_no = p.beansFactory.createTableColumn("Rslt.par_act_lot_no", MCColumnType.TEXT);
		p.columnRslt_par_act_sublot_no = p.beansFactory.createTableColumn("Rslt.par_act_sublot_no", MCColumnType.TEXT);
		p.columnRslt_par_inst_lot_no = p.beansFactory.createTableColumn("Rslt.par_inst_lot_no", MCColumnType.TEXT);
		p.columnRslt_par_inst_sublot_no = p.beansFactory.createTableColumn("Rslt.par_inst_sublot_no", MCColumnType.TEXT);
		p.columnRslt_oper_mfg_sts_typ = p.beansFactory.createTableColumn("Rslt.oper_mfg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_oper_mfg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.oper_mfg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_oper_unit_cd = p.beansFactory.createTableColumn("Rslt.oper_unit_cd", MCColumnType.TEXT);
		p.columnRslt_oper_unit_nm = p.beansFactory.createTableColumn("Rslt.oper_unit_nm", MCColumnType.TEXT);
		p.columnRslt_oper_unit_dec_place = p.beansFactory.createTableColumn("Rslt.oper_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_inpt_ctl_typ = p.beansFactory.createTableColumn("Rslt.inpt_ctl_typ", MCColumnType.TEXT);
		p.columnRslt_inpt_ctl_typ_nm = p.beansFactory.createTableColumn("Rslt.inpt_ctl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_main_itm_flg = p.beansFactory.createTableColumn("Rslt.main_itm_flg", MCColumnType.CHECK);
		p.columnRslt_yield_calc_flg = p.beansFactory.createTableColumn("Rslt.yield_calc_flg", MCColumnType.CHECK);
		p.columnRslt_bkf_upd_flg = p.beansFactory.createTableColumn("Rslt.bkf_upd_flg", MCColumnType.CHECK);
		p.columnRslt_lot_mix_flg = p.beansFactory.createTableColumn("Rslt.lot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_sublot_mix_flg = p.beansFactory.createTableColumn("Rslt.sublot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_stk_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_bkf_typ = p.beansFactory.createTableColumn("Rslt.bkf_typ", MCColumnType.TEXT);
		p.columnRslt_bkf_typ_nm = p.beansFactory.createTableColumn("Rslt.bkf_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_ctl_typ = p.beansFactory.createTableColumn("Rslt.alloc_ctl_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_ctl_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_ctl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_acxfr_act_rsn_cd = p.beansFactory.createTableColumn("Rslt.acxfr_act_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_acxfr_act_rsn_nm = p.beansFactory.createTableColumn("Rslt.acxfr_act_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_acxfr_act_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.acxfr_act_bd_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_acxfr_act_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.acxfr_act_bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_intr_rmrks = p.beansFactory.createTableColumn("Rslt.inpt_schd_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_inst_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.inpt_schd_inst_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_sub_char1 = p.beansFactory.createTableColumn("Rslt.inpt_schd_sub_char1", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_sub_char2 = p.beansFactory.createTableColumn("Rslt.inpt_schd_sub_char2", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_sub_char3 = p.beansFactory.createTableColumn("Rslt.inpt_schd_sub_char3", MCColumnType.TEXT);
		p.columnRslt_inpt_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.inpt_act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_inpt_act_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.inpt_act_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_inpt_act_trd_rmrks = p.beansFactory.createTableColumn("Rslt.inpt_act_trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_inpt_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.inpt_act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_inpt_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.inpt_act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_inpt_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.inpt_act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_loss_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.loss_act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_loss_act_trd_rmrks = p.beansFactory.createTableColumn("Rslt.loss_act_trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_loss_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.loss_act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_loss_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.loss_act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_loss_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.loss_act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_mfg_act_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.mfg_act_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_mfg_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.mfg_act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_mfg_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.mfg_act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_mfg_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.mfg_act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_mfg_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.mfg_act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_oper_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.oper_act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_oper_act_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.oper_act_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_oper_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.oper_act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_oper_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.oper_act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_oper_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.oper_act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_itm_yield = p.beansFactory.createTableColumn("Rslt.itm_yield", MCColumnType.NUMBER);
		p.columnRslt_itm_lower_yield = p.beansFactory.createTableColumn("Rslt.itm_lower_yield", MCColumnType.NUMBER);
		p.columnRslt_itm_std_yield = p.beansFactory.createTableColumn("Rslt.itm_std_yield", MCColumnType.NUMBER);
		p.columnRslt_itm_upper_yield = p.beansFactory.createTableColumn("Rslt.itm_upper_yield", MCColumnType.NUMBER);
		p.columnRslt_oper_yield = p.beansFactory.createTableColumn("Rslt.oper_yield", MCColumnType.NUMBER);
		p.columnRslt_oper_lower_yield = p.beansFactory.createTableColumn("Rslt.oper_lower_yield", MCColumnType.NUMBER);
		p.columnRslt_oper_std_yield = p.beansFactory.createTableColumn("Rslt.oper_std_yield", MCColumnType.NUMBER);
		p.columnRslt_oper_upper_yield = p.beansFactory.createTableColumn("Rslt.oper_upper_yield", MCColumnType.NUMBER);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_cd = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_nm = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_oper_loc_cd = p.beansFactory.createTableColumn("Rslt.oper_loc_cd", MCColumnType.TEXT);
		p.columnRslt_oper_loc_nm = p.beansFactory.createTableColumn("Rslt.oper_loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_str_ln_cd = p.beansFactory.createTableColumn("Rslt.oper_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_oper_str_ln_nm = p.beansFactory.createTableColumn("Rslt.oper_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_oper_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.oper_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_oper_ptn = p.beansFactory.createTableColumn("Rslt.oper_ptn", MCColumnType.TEXT);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_div_seq = p.beansFactory.createTableColumn("Rslt.div_seq", MCColumnType.NUMBER);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_mfg_act_no = p.beansFactory.createTableColumn("Rslt.mfg_act_no", MCColumnType.TEXT);
		p.columnRslt_oper_inst_no = p.beansFactory.createTableColumn("Rslt.oper_inst_no", MCColumnType.TEXT);
		p.columnRslt_oper_act_no = p.beansFactory.createTableColumn("Rslt.oper_act_no", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_oper_disp_seq = p.beansFactory.createTableColumn("Rslt.oper_disp_seq", MCColumnType.NUMBER);
		p.columnRslt_oper_usr_cd = p.beansFactory.createTableColumn("Rslt.oper_usr_cd", MCColumnType.TEXT);
		p.columnRslt_oper_usr_nm = p.beansFactory.createTableColumn("Rslt.oper_usr_nm", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ = p.beansFactory.createTableColumn("Rslt.chd_itm_typ", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ = p.beansFactory.createTableColumn("Rslt.par_itm_typ", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.par_itm_typ_d_nm", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1010 = p.beansFactory.createButton("Btn.open_MSBCP1010", "open");
		p.Btn_open_MSBCP1100 = p.beansFactory.createButton("Btn.open_MSBCP1100", "open");
	}

	/**
	 * [SrchMode1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode1(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.SrchMode1Panel.setBorder(p.SrchMode1TitledBorder);
		p.add(p.SrchMode1Panel);
		p.setLastBeans(p.SrchMode1Panel);
		p.SrchMode1Panel.setNextBeans(p.SrchMode2Panel);
		p.SrchMode1Panel.setValueCheck(false);
		p.SrchMode1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchMode1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode2(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.SrchMode2Panel.setBorder(p.SrchMode2TitledBorder);
		p.add(p.SrchMode2Panel);
		p.SrchMode2Panel.setNextBeans(p.OperStsPanel);
		p.SrchMode2Panel.setValueCheck(false);
		p.SrchMode2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchMode2Panel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [OperSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOperSts(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.OperStsPanel.setBorder(p.OperStsTitledBorder);
		p.add(p.OperStsPanel);
		p.OperStsPanel.setNextBeans(p.InptStsPanel);
		p.OperStsPanel.setValueCheck(false);
		p.OperStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OperStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [InptSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInptSts(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.InptStsPanel.setBorder(p.InptStsTitledBorder);
		p.add(p.InptStsPanel);
		p.InptStsPanel.setNextBeans(p.TopPanel);
		p.InptStsPanel.setValueCheck(false);
		p.InptStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InptStsPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_InptListSrch p) {
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
	protected static void jbInitFold(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab3Panel);
		p.FoldTab.add(p.Tab3Panel, "Fold.tab3");
		p.Tab3Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab3Panel);
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
	protected static void jbInitTab2(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ParItmGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.ParItmGrpPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab2Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.ChdItmGrpPanel, null);
		p.Tab3Panel.setLastBeans(p.ChdItmGrpPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.SrchMode1Panel.setLastBeans(p.Cnd_srch_mode1_Group);
		p.Cnd_srch_mode1_Group.setFirstBeans(p.Cnd_srch_mode1_SCHD);
		p.Cnd_srch_mode1_SCHD.setActionCommand("SCHD");
		p.Cnd_srch_mode1_Group.add(p.Cnd_srch_mode1_SCHD);
		p.SrchMode1Panel.add(p.Cnd_srch_mode1_SCHD);
		p.Cnd_srch_mode1_SCHD.setNextBeans(p.Cnd_srch_mode1_ACT);
		p.Cnd_srch_mode1_ACT.setActionCommand("ACT");
		p.Cnd_srch_mode1_Group.add(p.Cnd_srch_mode1_ACT);
		p.SrchMode1Panel.add(p.Cnd_srch_mode1_ACT);
		p.Cnd_srch_mode1_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.srch_mode1_META);
		p.SrchMode2Panel.setLastBeans(p.Cnd_srch_mode2_Group);
		p.Cnd_srch_mode2_Group.setFirstBeans(p.Cnd_srch_mode2_INPT);
		p.Cnd_srch_mode2_INPT.setActionCommand("INPT");
		p.Cnd_srch_mode2_Group.add(p.Cnd_srch_mode2_INPT);
		p.SrchMode2Panel.add(p.Cnd_srch_mode2_INPT);
		p.Cnd_srch_mode2_INPT.setNextBeans(p.Cnd_srch_mode2_LOSS);
		p.Cnd_srch_mode2_LOSS.setActionCommand("LOSS");
		p.Cnd_srch_mode2_Group.add(p.Cnd_srch_mode2_LOSS);
		p.SrchMode2Panel.add(p.Cnd_srch_mode2_LOSS);
		p.Cnd_srch_mode2_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.srch_mode2_META);
		p.OperStsPanel.add(p.Cnd_oper_sav_flg);
		p.OperStsPanel.setLastBeans(p.Cnd_oper_sav_flg);
		p.Cnd_oper_sav_flg.setNextBeans(p.Cnd_oper_ord_flg);
		p.Cnd_oper_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_sav_flg_META);
		p.OperStsPanel.add(p.Cnd_oper_ord_flg);
		p.Cnd_oper_ord_flg.setNextBeans(p.Cnd_oper_stt_flg);
		p.Cnd_oper_ord_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_ord_flg_META);
		p.OperStsPanel.add(p.Cnd_oper_stt_flg);
		p.Cnd_oper_stt_flg.setNextBeans(p.Cnd_oper_cmpl_flg);
		p.Cnd_oper_stt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_stt_flg_META);
		p.OperStsPanel.add(p.Cnd_oper_cmpl_flg);
		p.Cnd_oper_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_cmpl_flg_META);
		p.InptStsPanel.add(p.Cnd_inpt_sav_flg);
		p.InptStsPanel.setLastBeans(p.Cnd_inpt_sav_flg);
		p.Cnd_inpt_sav_flg.setNextBeans(p.Cnd_inpt_ord_flg);
		p.Cnd_inpt_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_sav_flg_META);
		p.InptStsPanel.add(p.Cnd_inpt_ord_flg);
		p.Cnd_inpt_ord_flg.setNextBeans(p.Cnd_inpt_stt_flg);
		p.Cnd_inpt_ord_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_ord_flg_META);
		p.InptStsPanel.add(p.Cnd_inpt_stt_flg);
		p.Cnd_inpt_stt_flg.setNextBeans(p.Cnd_inpt_cmpl_flg);
		p.Cnd_inpt_stt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_stt_flg_META);
		p.InptStsPanel.add(p.Cnd_inpt_cmpl_flg);
		p.Cnd_inpt_cmpl_flg.setNextBeans(p.Cnd_inpt_no_schd_flg);
		p.Cnd_inpt_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_cmpl_flg_META);
		p.InptStsPanel.add(p.Cnd_inpt_no_schd_flg);
		p.Cnd_inpt_no_schd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_no_schd_flg_META);
		p.CndPanel.add(p.Cnd_inpt_schd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_inpt_schd_dt_p_PPanel);
		p.Cnd_inpt_schd_dt_p_PPanel.setNextBeans(p.Cnd_inpt_act_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_inpt_act_dt_p_PPanel);
		p.Cnd_inpt_act_dt_p_PPanel.setNextBeans(p.Cnd_inpt_ac_dt_fr);
		p.CndPanel.add(p.Cnd_inpt_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_inpt_ac_dt_fr);
		p.Cnd_inpt_ac_dt_fr.setNextBeans(p.Cnd_inpt_ac_dt_to);
		p.Cnd_inpt_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_ac_dt_fr_META);
		p.Cnd_inpt_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inpt_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_inpt_ac_dt_to);
		p.Cnd_inpt_ac_dt_to.setNextBeans(p.Cnd_bkf_typ);
		p.Cnd_inpt_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_ac_dt_to_META);
		p.Cnd_inpt_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_bkf_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bkf_typ, true);
		p.Cnd_bkf_typ.setLinkBeans(p.Cnd_bkf_typ_nm);
		p.CndPanel.add(p.Cnd_bkf_typ_Label);
		p.CndPanel.add(p.Cnd_bkf_typ);
		p.Cnd_bkf_typ.setNextBeans(p.Cnd_bkf_typ_nm);
		p.Cnd_bkf_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.bkf_typ_META);
		p.CndPanel.add(p.Cnd_bkf_typ_nm);
		p.Cnd_bkf_typ_nm.setNextBeans(p.Cnd_pr_rate_fr);
		p.Cnd_bkf_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.bkf_typ_nm_META);
		p.CndPanel.add(p.Cnd_pr_rate_fr_Label);
		p.CndPanel.add(p.Cnd_pr_rate_fr);
		p.Cnd_pr_rate_fr.setNextBeans(p.Cnd_pr_rate_to);
		p.Cnd_pr_rate_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.pr_rate_fr_META);
		p.CndPanel.add(p.Cnd_pr_rate_to_Label);
		p.CndPanel.add(p.Cnd_pr_rate_to);
		p.Cnd_pr_rate_to.setNextBeans(p.Cnd_pr_rate_inc_loss_flg);
		p.Cnd_pr_rate_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.pr_rate_to_META);
		p.CndPanel.add(p.Cnd_pr_rate_inc_loss_flg);
		p.Cnd_pr_rate_inc_loss_flg.setNextBeans(p.Cnd_not_alloc_srch_flg);
		p.Cnd_pr_rate_inc_loss_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.pr_rate_inc_loss_flg_META);
		p.CndPanel.add(p.Cnd_not_alloc_srch_flg);
		p.Cnd_not_alloc_srch_flg.setNextBeans(p.Cnd_yield_calc_flg);
		p.Cnd_not_alloc_srch_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.not_alloc_srch_flg_META);
		p.CndPanel.add(p.Cnd_yield_calc_flg);
		p.Cnd_yield_calc_flg.setNextBeans(p.Cnd_mfg_loc_site_cd);
		p.Cnd_yield_calc_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.yield_calc_flg_META);
		p.Cnd_mfg_loc_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_site_cd, true);
		p.Cnd_mfg_loc_site_cd.setLinkBeans(p.Cnd_mfg_loc_site_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_site_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_site_cd);
		p.Cnd_mfg_loc_site_cd.setNextBeans(p.Cnd_mfg_loc_site_nm);
		p.Cnd_mfg_loc_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_site_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_site_nm);
		p.Cnd_mfg_loc_site_nm.setNextBeans(p.Cnd_mfg_loc_wg_cd);
		p.Cnd_mfg_loc_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_site_nm_META);
		p.Cnd_mfg_loc_site_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_site_nm, true);
		p.Cnd_mfg_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_wg_cd, true);
		p.Cnd_mfg_loc_wg_cd.setLinkBeans(p.Cnd_mfg_loc_wg_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_wg_cd);
		p.Cnd_mfg_loc_wg_cd.setNextBeans(p.Cnd_mfg_loc_wg_nm);
		p.Cnd_mfg_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_wg_nm);
		p.Cnd_mfg_loc_wg_nm.setNextBeans(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_mfg_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_wg_nm, true);
		p.Cnd_mfg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_grp_cd, true);
		p.Cnd_mfg_loc_grp_cd.setLinkBeans(p.Cnd_mfg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_mfg_loc_grp_cd.setNextBeans(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_mfg_str_ln_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.Cnd_mfg_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_str_ln_cd, true);
		p.Cnd_mfg_str_ln_cd.setLinkBeans(p.Cnd_mfg_str_ln_nm);
		p.CndPanel.add(p.Cnd_mfg_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_str_ln_cd);
		p.Cnd_mfg_str_ln_cd.setNextBeans(p.Cnd_mfg_str_ln_nm);
		p.Cnd_mfg_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_mfg_str_ln_nm);
		p.Cnd_mfg_str_ln_nm.setNextBeans(p.Cnd_inpt_loc_cd);
		p.Cnd_mfg_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_inpt_loc_cd_Label);
		p.CndPanel.add(p.Cnd_inpt_loc_cd);
		p.Cnd_inpt_loc_cd.setNextBeans(p.Cnd_inpt_loc_nm);
		p.Cnd_inpt_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_loc_cd_META);
		p.Cnd_inpt_loc_cd.addLinkBeans(p.Cnd_inpt_loc_nm);
		p.Cnd_inpt_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_loc_cd, true);
		p.CndPanel.add(p.Cnd_inpt_loc_nm);
		p.Cnd_inpt_loc_nm.setNextBeans(p.Cnd_inpt_str_ln_cd);
		p.Cnd_inpt_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_inpt_loc_nm, true);
		p.Cnd_inpt_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_str_ln_cd, true);
		p.Cnd_inpt_str_ln_cd.setLinkBeans(p.Cnd_inpt_str_ln_nm);
		p.CndPanel.add(p.Cnd_inpt_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_inpt_str_ln_cd);
		p.Cnd_inpt_str_ln_cd.setNextBeans(p.Cnd_inpt_str_ln_nm);
		p.Cnd_inpt_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_inpt_str_ln_nm);
		p.Cnd_inpt_str_ln_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_inpt_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_inpt_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_oper_loc_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_oper_loc_cd_Label);
		p.CndPanel.add(p.Cnd_oper_loc_cd);
		p.Cnd_oper_loc_cd.setNextBeans(p.Cnd_oper_loc_nm);
		p.Cnd_oper_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_loc_cd_META);
		p.Cnd_oper_loc_cd.addLinkBeans(p.Cnd_oper_loc_nm);
		p.Cnd_oper_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_loc_cd, true);
		p.CndPanel.add(p.Cnd_oper_loc_nm);
		p.Cnd_oper_loc_nm.setNextBeans(p.Cnd_oper_str_ln_cd);
		p.Cnd_oper_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_loc_nm, true);
		p.Cnd_oper_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_str_ln_cd, true);
		p.Cnd_oper_str_ln_cd.setLinkBeans(p.Cnd_oper_str_ln_nm);
		p.CndPanel.add(p.Cnd_oper_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_oper_str_ln_cd);
		p.Cnd_oper_str_ln_cd.setNextBeans(p.Cnd_oper_str_ln_nm);
		p.Cnd_oper_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_oper_str_ln_nm);
		p.Cnd_oper_str_ln_nm.setNextBeans(p.Cnd_mfg_mtd_typ);
		p.Cnd_oper_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_str_ln_nm, true);
		p.Cnd_mfg_mtd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_mtd_typ, true);
		p.Cnd_mfg_mtd_typ.setLinkBeans(p.Cnd_mfg_mtd_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_mtd_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_mtd_typ);
		p.Cnd_mfg_mtd_typ.setNextBeans(p.Cnd_mfg_mtd_typ_nm);
		p.Cnd_mfg_mtd_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_mtd_typ_META);
		p.CndPanel.add(p.Cnd_mfg_mtd_typ_nm);
		p.Cnd_mfg_mtd_typ_nm.setNextBeans(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_mfg_mtd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_mtd_typ_nm_META);
		p.CndPanel.add(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_chd_itm_typ_p_PPanel.setNextBeans(p.Cnd_inpt_ctl_typ);
		p.Cnd_inpt_ctl_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_ctl_typ, true);
		p.Cnd_inpt_ctl_typ.setLinkBeans(p.Cnd_inpt_ctl_typ_nm);
		p.CndPanel.add(p.Cnd_inpt_ctl_typ_Label);
		p.CndPanel.add(p.Cnd_inpt_ctl_typ);
		p.Cnd_inpt_ctl_typ.setNextBeans(p.Cnd_inpt_ctl_typ_nm);
		p.Cnd_inpt_ctl_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_ctl_typ_META);
		p.CndPanel.add(p.Cnd_inpt_ctl_typ_nm);
		p.Cnd_inpt_ctl_typ_nm.setNextBeans(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_inpt_ctl_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_ctl_typ_nm_META);
		p.CndPanel.add(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_chd_itm_p_PPanel.setNextBeans(p.Cnd_chd_lot_no);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub1,p.Cnd_chd_itm_sub2,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub2,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_chd_itm_nm);
		p.setPluralValueEnable(p.Cnd_chd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_chd_lot_no_Label);
		p.CndPanel.add(p.Cnd_chd_lot_no);
		p.Cnd_chd_lot_no.setNextBeans(p.Cnd_chd_sublot_no);
		p.Cnd_chd_lot_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.chd_lot_no_META);
		p.Cnd_chd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_lot_no, true);
		p.Cnd_chd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_sublot_no, true);
		p.CndPanel.add(p.Cnd_chd_sublot_no);
		p.Cnd_chd_sublot_no.setNextBeans(p.Cnd_loss_rsn_cd);
		p.Cnd_chd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.chd_sublot_no_META);
		p.Cnd_loss_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loss_rsn_cd, true);
		p.Cnd_loss_rsn_cd.setLinkBeans(p.Cnd_loss_rsn_nm);
		p.CndPanel.add(p.Cnd_loss_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_loss_rsn_cd);
		p.Cnd_loss_rsn_cd.setNextBeans(p.Cnd_loss_rsn_nm);
		p.Cnd_loss_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.loss_rsn_cd_META);
		p.CndPanel.add(p.Cnd_loss_rsn_nm);
		p.Cnd_loss_rsn_nm.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_loss_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.loss_rsn_nm_META);
		p.Cnd_loss_rsn_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loss_rsn_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_mfg_inst_no);
		p.CndPanel.add(p.Cnd_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_no);
		p.Cnd_mfg_inst_no.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.Cnd_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_par_sno_p_PPanel);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_par_sno_p_PPanel);
		p.Cnd_par_sno_p_PPanel.setNextBeans(p.Cnd_inpt_rsn_cd);
		p.setPluralValueEnable(p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_par_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_par_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_par_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_inpt_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_rsn_cd, true);
		p.Cnd_inpt_rsn_cd.setLinkBeans(p.Cnd_inpt_rsn_nm);
		p.CndPanel.add(p.Cnd_inpt_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_inpt_rsn_cd);
		p.Cnd_inpt_rsn_cd.setNextBeans(p.Cnd_inpt_rsn_nm);
		p.Cnd_inpt_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_rsn_cd_META);
		p.CndPanel.add(p.Cnd_inpt_rsn_nm);
		p.Cnd_inpt_rsn_nm.setNextBeans(p.Cnd_oper_usr_cd);
		p.Cnd_inpt_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_rsn_nm_META);
		p.Cnd_inpt_rsn_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_rsn_nm, true);
		p.CndPanel.add(p.Cnd_oper_usr_cd_Label);
		p.CndPanel.add(p.Cnd_oper_usr_cd);
		p.Cnd_oper_usr_cd.setNextBeans(p.Cnd_oper_usr_nm);
		p.Cnd_oper_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_usr_cd_META);
		p.Cnd_oper_usr_cd.addLinkBeans(p.Cnd_oper_usr_nm);
		p.Cnd_oper_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_usr_cd, true);
		p.CndPanel.add(p.Cnd_oper_usr_nm);
		p.Cnd_oper_usr_nm.setNextBeans(p.Cnd_itm_ord_no);
		p.Cnd_oper_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_usr_nm, true);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_itm_ord_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_oper_inst_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_oper_inst_no_Label);
		p.CndPanel.add(p.Cnd_oper_inst_no);
		p.Cnd_oper_inst_no.setNextBeans(p.Cnd_mfg_act_no);
		p.Cnd_oper_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_inst_no_META);
		p.setPluralValueEnable(p.Cnd_oper_inst_no, true);
		p.CndPanel.add(p.Cnd_mfg_act_no_Label);
		p.CndPanel.add(p.Cnd_mfg_act_no);
		p.Cnd_mfg_act_no.setNextBeans(p.Cnd_oper_act_no);
		p.Cnd_mfg_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_act_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_no, true);
		p.CndPanel.add(p.Cnd_oper_act_no_Label);
		p.CndPanel.add(p.Cnd_oper_act_no);
		p.Cnd_oper_act_no.setNextBeans(p.Cnd_inpt_schd_no);
		p.Cnd_oper_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_act_no_META);
		p.setPluralValueEnable(p.Cnd_oper_act_no, true);
		p.CndPanel.add(p.Cnd_inpt_schd_no_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_no);
		p.Cnd_inpt_schd_no.setNextBeans(p.Cnd_inpt_act_no);
		p.Cnd_inpt_schd_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_schd_no_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_no, true);
		p.CndPanel.add(p.Cnd_inpt_act_no_Label);
		p.CndPanel.add(p.Cnd_inpt_act_no);
		p.Cnd_inpt_act_no.setNextBeans(p.Cnd_loss_act_no);
		p.Cnd_inpt_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_no_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_no, true);
		p.CndPanel.add(p.Cnd_loss_act_no_Label);
		p.CndPanel.add(p.Cnd_loss_act_no);
		p.Cnd_loss_act_no.setNextBeans(p.Cnd_mes_id);
		p.Cnd_loss_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.loss_act_no_META);
		p.setPluralValueEnable(p.Cnd_loss_act_no, true);
		p.CndPanel.add(p.Cnd_mes_id_Label);
		p.CndPanel.add(p.Cnd_mes_id);
		p.Cnd_mes_id.setNextBeans(p.Cnd_data_no);
		p.Cnd_mes_id.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mes_id_META);
		p.setPluralValueEnable(p.Cnd_mes_id, true);
		p.CndPanel.add(p.Cnd_data_no_Label);
		p.CndPanel.add(p.Cnd_data_no);
		p.Cnd_data_no.setNextBeans(p.Cnd_ext_inpt_act_no);
		p.Cnd_data_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.data_no_META);
		p.CndPanel.add(p.Cnd_ext_inpt_act_no_Label);
		p.CndPanel.add(p.Cnd_ext_inpt_act_no);
		p.Cnd_ext_inpt_act_no.setNextBeans(p.Cnd_inpt_schd_inst_rpt_rmrks);
		p.Cnd_ext_inpt_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.ext_inpt_act_no_META);
		p.setPluralValueEnable(p.Cnd_ext_inpt_act_no, true);
		p.CndPanel.add(p.Cnd_inpt_schd_inst_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_inst_rpt_rmrks);
		p.Cnd_inpt_schd_inst_rpt_rmrks.setNextBeans(p.Cnd_inpt_schd_intr_rmrks);
		p.Cnd_inpt_schd_inst_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_schd_inst_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_inst_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_inpt_schd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_intr_rmrks);
		p.Cnd_inpt_schd_intr_rmrks.setNextBeans(p.Cnd_inpt_schd_sub_char1);
		p.Cnd_inpt_schd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_schd_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_inpt_schd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_sub_char1);
		p.Cnd_inpt_schd_sub_char1.setNextBeans(p.Cnd_inpt_schd_sub_char2);
		p.Cnd_inpt_schd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_schd_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_sub_char1, true);
		p.CndPanel.add(p.Cnd_inpt_schd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_sub_char2);
		p.Cnd_inpt_schd_sub_char2.setNextBeans(p.Cnd_inpt_schd_sub_char3);
		p.Cnd_inpt_schd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_schd_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_sub_char2, true);
		p.CndPanel.add(p.Cnd_inpt_schd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_sub_char3);
		p.Cnd_inpt_schd_sub_char3.setNextBeans(p.Cnd_inpt_act_rpt_rmrks);
		p.Cnd_inpt_schd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_schd_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_sub_char3, true);
		p.CndPanel.add(p.Cnd_inpt_act_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_inpt_act_rpt_rmrks);
		p.Cnd_inpt_act_rpt_rmrks.setNextBeans(p.Cnd_inpt_act_intr_rmrks);
		p.Cnd_inpt_act_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_inpt_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_inpt_act_intr_rmrks);
		p.Cnd_inpt_act_intr_rmrks.setNextBeans(p.Cnd_inpt_act_trd_rmrks);
		p.Cnd_inpt_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_inpt_act_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_inpt_act_trd_rmrks);
		p.Cnd_inpt_act_trd_rmrks.setNextBeans(p.Cnd_inpt_act_sub_char1);
		p.Cnd_inpt_act_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_inpt_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_inpt_act_sub_char1);
		p.Cnd_inpt_act_sub_char1.setNextBeans(p.Cnd_inpt_act_sub_char2);
		p.Cnd_inpt_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_sub_char1, true);
		p.CndPanel.add(p.Cnd_inpt_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_inpt_act_sub_char2);
		p.Cnd_inpt_act_sub_char2.setNextBeans(p.Cnd_inpt_act_sub_char3);
		p.Cnd_inpt_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_sub_char2, true);
		p.CndPanel.add(p.Cnd_inpt_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_inpt_act_sub_char3);
		p.Cnd_inpt_act_sub_char3.setNextBeans(p.Cnd_mfg_act_rpt_rmrks);
		p.Cnd_inpt_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.inpt_act_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_inpt_act_sub_char3, true);
		p.CndPanel.add(p.Cnd_mfg_act_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_mfg_act_rpt_rmrks);
		p.Cnd_mfg_act_rpt_rmrks.setNextBeans(p.Cnd_mfg_act_intr_rmrks);
		p.Cnd_mfg_act_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_act_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_mfg_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_mfg_act_intr_rmrks);
		p.Cnd_mfg_act_intr_rmrks.setNextBeans(p.Cnd_mfg_act_sub_char1);
		p.Cnd_mfg_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_act_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_mfg_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_mfg_act_sub_char1);
		p.Cnd_mfg_act_sub_char1.setNextBeans(p.Cnd_mfg_act_sub_char2);
		p.Cnd_mfg_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_act_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_sub_char1, true);
		p.CndPanel.add(p.Cnd_mfg_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_mfg_act_sub_char2);
		p.Cnd_mfg_act_sub_char2.setNextBeans(p.Cnd_mfg_act_sub_char3);
		p.Cnd_mfg_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_act_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_sub_char2, true);
		p.CndPanel.add(p.Cnd_mfg_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_mfg_act_sub_char3);
		p.Cnd_mfg_act_sub_char3.setNextBeans(p.Cnd_oper_act_intr_rmrks);
		p.Cnd_mfg_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.mfg_act_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_sub_char3, true);
		p.CndPanel.add(p.Cnd_oper_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_oper_act_intr_rmrks);
		p.Cnd_oper_act_intr_rmrks.setNextBeans(p.Cnd_oper_act_rpt_rmrks);
		p.Cnd_oper_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_act_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_oper_act_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_oper_act_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_oper_act_rpt_rmrks);
		p.Cnd_oper_act_rpt_rmrks.setNextBeans(p.Cnd_oper_act_sub_char1);
		p.Cnd_oper_act_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_act_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_oper_act_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_oper_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_oper_act_sub_char1);
		p.Cnd_oper_act_sub_char1.setNextBeans(p.Cnd_oper_act_sub_char2);
		p.Cnd_oper_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_act_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_oper_act_sub_char1, true);
		p.CndPanel.add(p.Cnd_oper_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_oper_act_sub_char2);
		p.Cnd_oper_act_sub_char2.setNextBeans(p.Cnd_oper_act_sub_char3);
		p.Cnd_oper_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_act_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_oper_act_sub_char2, true);
		p.CndPanel.add(p.Cnd_oper_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_oper_act_sub_char3);
		p.Cnd_oper_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1090.CndR.oper_act_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_oper_act_sub_char3, true);
		p.ChdItmGrpPanel.add(p.Cnd_chd_itm_grp_p_PPanel);
		p.ChdItmGrpPanel.setLastBeans(p.Cnd_chd_itm_grp_p_PPanel);
		p.ParItmGrpPanel.add(p.Cnd_par_itm_grp_p_PPanel);
		p.ParItmGrpPanel.setLastBeans(p.Cnd_par_itm_grp_p_PPanel);
	}

	/**
	 * [ChdItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitChdItmGrp(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.ChdItmGrpPanel.setValueCheck(false);
		p.ChdItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ChdItmGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ParItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitParItmGrp(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.ParItmGrpPanel.setValueCheck(false);
		p.ParItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ParItmGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_InptListSrch p) {
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
	protected static void jbInitRPnl(MSBCP_InptListSrch p) {
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
	protected static void jbInitRslt(MSBCP_InptListSrch p) {
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
	protected static void jbInitBtn(MSBCP_InptListSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP1010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP1010);
		p.Btn_open_MSBCP1010.setNextBeans(p.Btn_open_MSBCP1100);
		p.Btn_open_MSBCP1100.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP1100);
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
		MSBCP_InptListSrch_MC.mcInitSrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitSrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitOperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitInptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitTop((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitFold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitTab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitTab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitTab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitCnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitCtrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitRPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitRslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.mcInitBtn((MSBCP_InptListSrch)this);

		// [SRCH_SCHD]ステータスのモードの設定
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_SrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_SrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_OperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_InptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Top((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Fold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Tab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Tab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Tab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Cnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_ChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_ParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Ctrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_RPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Rslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__SCHD_Btn((MSBCP_InptListSrch)this);

		// [SRCH_ACT_INPT]ステータスのモードの設定
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_SrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_SrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_OperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_InptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Top((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Fold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Tab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Tab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Tab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Cnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_ChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_ParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Ctrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_RPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Rslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__INPT_Btn((MSBCP_InptListSrch)this);

		// [SRCH_ACT_LOSS]ステータスのモードの設定
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_SrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_SrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_OperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_InptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Top((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Fold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Tab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Tab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Tab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Cnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_ChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_ParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Ctrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_RPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Rslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitSRCH__ACT__LOSS_Btn((MSBCP_InptListSrch)this);

		// [REF_SCHD]ステータスのモードの設定
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_SrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_SrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_OperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_InptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Top((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Fold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Tab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Tab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Tab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Cnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_ChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_ParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Ctrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_RPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Rslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__SCHD_Btn((MSBCP_InptListSrch)this);

		// [REF_ACT_INPT]ステータスのモードの設定
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_SrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_SrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_OperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_InptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Top((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Fold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Tab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Tab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Tab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Cnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_ChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_ParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Ctrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_RPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Rslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__INPT_Btn((MSBCP_InptListSrch)this);

		// [REF_ACT_LOSS]ステータスのモードの設定
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_SrchMode1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_SrchMode2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_OperSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_InptSts((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Top((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Fold((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Tab1((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Tab2((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Tab3((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Cnd((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_ChdItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_ParItmGrp((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Ctrl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_RPnl((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Rslt((MSBCP_InptListSrch)this);
		MSBCP_InptListSrch_MC.statusInitREF__ACT__LOSS_Btn((MSBCP_InptListSrch)this);

	}

	/**
	 *  [SrchMode1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode1(MSBCP_InptListSrch p) {
	}

	/**
	 *  [SrchMode2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode2(MSBCP_InptListSrch p) {
	}

	/**
	 *  [OperSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOperSts(MSBCP_InptListSrch p) {
	}

	/**
	 *  [InptSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInptSts(MSBCP_InptListSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_InptListSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_InptListSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_InptListSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_InptListSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBCP_InptListSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_InptListSrch p) {
		p.Cnd_srch_mode1_Group.addAllListener(p);
		p.Cnd_srch_mode1_SCHD.addAllListener(p);
		p.Cnd_srch_mode1_ACT.addAllListener(p);
		p.Cnd_srch_mode2_Group.addAllListener(p);
		p.Cnd_srch_mode2_INPT.addAllListener(p);
		p.Cnd_srch_mode2_LOSS.addAllListener(p);
		p.Cnd_oper_sav_flg.addAllListener(p);
		p.Cnd_oper_ord_flg.addAllListener(p);
		p.Cnd_oper_stt_flg.addAllListener(p);
		p.Cnd_oper_cmpl_flg.addAllListener(p);
		p.Cnd_inpt_sav_flg.addAllListener(p);
		p.Cnd_inpt_ord_flg.addAllListener(p);
		p.Cnd_inpt_stt_flg.addAllListener(p);
		p.Cnd_inpt_cmpl_flg.addAllListener(p);
		p.Cnd_inpt_no_schd_flg.addAllListener(p);
		p.Cnd_inpt_ac_dt_fr.setListListener(p);
		p.Cnd_inpt_ac_dt_fr.addAllListener(p);
		p.Cnd_inpt_ac_dt_to.setListListener(p);
		p.Cnd_inpt_ac_dt_to.addAllListener(p);
		p.Cnd_bkf_typ.setListListener(p);
		p.Cnd_bkf_typ.addAllListener(p);
		p.Cnd_bkf_typ_nm.setListListener(p);
		p.Cnd_bkf_typ_nm.addAllListener(p);
		p.Cnd_pr_rate_fr.setListListener(p);
		p.Cnd_pr_rate_fr.addAllListener(p);
		p.Cnd_pr_rate_to.setListListener(p);
		p.Cnd_pr_rate_to.addAllListener(p);
		p.Cnd_pr_rate_inc_loss_flg.addAllListener(p);
		p.Cnd_not_alloc_srch_flg.addAllListener(p);
		p.Cnd_yield_calc_flg.addAllListener(p);
		p.Cnd_mfg_loc_site_cd.setListListener(p);
		p.Cnd_mfg_loc_site_cd.addAllListener(p);
		p.Cnd_mfg_loc_site_nm.setListListener(p);
		p.Cnd_mfg_loc_site_nm.addAllListener(p);
		p.Cnd_mfg_loc_wg_cd.setListListener(p);
		p.Cnd_mfg_loc_wg_cd.addAllListener(p);
		p.Cnd_mfg_loc_wg_nm.setListListener(p);
		p.Cnd_mfg_loc_wg_nm.addAllListener(p);
		p.Cnd_mfg_loc_grp_cd.setListListener(p);
		p.Cnd_mfg_loc_grp_cd.addAllListener(p);
		p.Cnd_mfg_loc_grp_nm.setListListener(p);
		p.Cnd_mfg_loc_grp_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_mfg_str_ln_cd.setListListener(p);
		p.Cnd_mfg_str_ln_cd.addAllListener(p);
		p.Cnd_mfg_str_ln_nm.setListListener(p);
		p.Cnd_mfg_str_ln_nm.addAllListener(p);
		p.Cnd_inpt_loc_cd.setListListener(p);
		p.Cnd_inpt_loc_cd.addAllListener(p);
		p.Cnd_inpt_loc_nm.setListListener(p);
		p.Cnd_inpt_loc_nm.addAllListener(p);
		p.Cnd_inpt_str_ln_cd.setListListener(p);
		p.Cnd_inpt_str_ln_cd.addAllListener(p);
		p.Cnd_inpt_str_ln_nm.setListListener(p);
		p.Cnd_inpt_str_ln_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_oper_loc_cd.setListListener(p);
		p.Cnd_oper_loc_cd.addAllListener(p);
		p.Cnd_oper_loc_nm.setListListener(p);
		p.Cnd_oper_loc_nm.addAllListener(p);
		p.Cnd_oper_str_ln_cd.setListListener(p);
		p.Cnd_oper_str_ln_cd.addAllListener(p);
		p.Cnd_oper_str_ln_nm.setListListener(p);
		p.Cnd_oper_str_ln_nm.addAllListener(p);
		p.Cnd_mfg_mtd_typ.setListListener(p);
		p.Cnd_mfg_mtd_typ.addAllListener(p);
		p.Cnd_mfg_mtd_typ_nm.setListListener(p);
		p.Cnd_mfg_mtd_typ_nm.addAllListener(p);
		p.Cnd_inpt_ctl_typ.setListListener(p);
		p.Cnd_inpt_ctl_typ.addAllListener(p);
		p.Cnd_inpt_ctl_typ_nm.setListListener(p);
		p.Cnd_inpt_ctl_typ_nm.addAllListener(p);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_lot_no.setListListener(p);
		p.Cnd_chd_lot_no.addAllListener(p);
		p.Cnd_chd_sublot_no.setListListener(p);
		p.Cnd_chd_sublot_no.addAllListener(p);
		p.Cnd_loss_rsn_cd.setListListener(p);
		p.Cnd_loss_rsn_cd.addAllListener(p);
		p.Cnd_loss_rsn_nm.setListListener(p);
		p.Cnd_loss_rsn_nm.addAllListener(p);
		p.Cnd_mfg_inst_no.setListListener(p);
		p.Cnd_mfg_inst_no.addAllListener(p);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_inpt_rsn_cd.setListListener(p);
		p.Cnd_inpt_rsn_cd.addAllListener(p);
		p.Cnd_inpt_rsn_nm.setListListener(p);
		p.Cnd_inpt_rsn_nm.addAllListener(p);
		p.Cnd_oper_usr_cd.setListListener(p);
		p.Cnd_oper_usr_cd.addAllListener(p);
		p.Cnd_oper_usr_nm.setListListener(p);
		p.Cnd_oper_usr_nm.addAllListener(p);
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_oper_inst_no.setListListener(p);
		p.Cnd_oper_inst_no.addAllListener(p);
		p.Cnd_mfg_act_no.setListListener(p);
		p.Cnd_mfg_act_no.addAllListener(p);
		p.Cnd_oper_act_no.setListListener(p);
		p.Cnd_oper_act_no.addAllListener(p);
		p.Cnd_inpt_schd_no.setListListener(p);
		p.Cnd_inpt_schd_no.addAllListener(p);
		p.Cnd_inpt_act_no.setListListener(p);
		p.Cnd_inpt_act_no.addAllListener(p);
		p.Cnd_loss_act_no.setListListener(p);
		p.Cnd_loss_act_no.addAllListener(p);
		p.Cnd_mes_id.setListListener(p);
		p.Cnd_mes_id.addAllListener(p);
		p.Cnd_data_no.setListListener(p);
		p.Cnd_data_no.addAllListener(p);
		p.Cnd_ext_inpt_act_no.setListListener(p);
		p.Cnd_ext_inpt_act_no.addAllListener(p);
		p.Cnd_inpt_schd_inst_rpt_rmrks.setListListener(p);
		p.Cnd_inpt_schd_inst_rpt_rmrks.addAllListener(p);
		p.Cnd_inpt_schd_intr_rmrks.setListListener(p);
		p.Cnd_inpt_schd_intr_rmrks.addAllListener(p);
		p.Cnd_inpt_schd_sub_char1.setListListener(p);
		p.Cnd_inpt_schd_sub_char1.addAllListener(p);
		p.Cnd_inpt_schd_sub_char2.setListListener(p);
		p.Cnd_inpt_schd_sub_char2.addAllListener(p);
		p.Cnd_inpt_schd_sub_char3.setListListener(p);
		p.Cnd_inpt_schd_sub_char3.addAllListener(p);
		p.Cnd_inpt_act_rpt_rmrks.setListListener(p);
		p.Cnd_inpt_act_rpt_rmrks.addAllListener(p);
		p.Cnd_inpt_act_intr_rmrks.setListListener(p);
		p.Cnd_inpt_act_intr_rmrks.addAllListener(p);
		p.Cnd_inpt_act_trd_rmrks.setListListener(p);
		p.Cnd_inpt_act_trd_rmrks.addAllListener(p);
		p.Cnd_inpt_act_sub_char1.setListListener(p);
		p.Cnd_inpt_act_sub_char1.addAllListener(p);
		p.Cnd_inpt_act_sub_char2.setListListener(p);
		p.Cnd_inpt_act_sub_char2.addAllListener(p);
		p.Cnd_inpt_act_sub_char3.setListListener(p);
		p.Cnd_inpt_act_sub_char3.addAllListener(p);
		p.Cnd_mfg_act_rpt_rmrks.setListListener(p);
		p.Cnd_mfg_act_rpt_rmrks.addAllListener(p);
		p.Cnd_mfg_act_intr_rmrks.setListListener(p);
		p.Cnd_mfg_act_intr_rmrks.addAllListener(p);
		p.Cnd_mfg_act_sub_char1.setListListener(p);
		p.Cnd_mfg_act_sub_char1.addAllListener(p);
		p.Cnd_mfg_act_sub_char2.setListListener(p);
		p.Cnd_mfg_act_sub_char2.addAllListener(p);
		p.Cnd_mfg_act_sub_char3.setListListener(p);
		p.Cnd_mfg_act_sub_char3.addAllListener(p);
		p.Cnd_oper_act_intr_rmrks.setListListener(p);
		p.Cnd_oper_act_intr_rmrks.addAllListener(p);
		p.Cnd_oper_act_rpt_rmrks.setListListener(p);
		p.Cnd_oper_act_rpt_rmrks.addAllListener(p);
		p.Cnd_oper_act_sub_char1.setListListener(p);
		p.Cnd_oper_act_sub_char1.addAllListener(p);
		p.Cnd_oper_act_sub_char2.setListListener(p);
		p.Cnd_oper_act_sub_char2.addAllListener(p);
		p.Cnd_oper_act_sub_char3.setListListener(p);
		p.Cnd_oper_act_sub_char3.addAllListener(p);
	}

	/**
	 *  [ChdItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitChdItmGrp(MSBCP_InptListSrch p) {
	}

	/**
	 *  [ParItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitParItmGrp(MSBCP_InptListSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_InptListSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_InptListSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_InptListSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_inpt_mfg_sts_typ.addAllListener(p);
		p.columnRslt_inpt_mfg_sts_typ.setListListener(p);
		p.columnRslt_inpt_mfg_sts_typ_nm.addAllListener(p);
		p.columnRslt_inpt_mfg_sts_typ_nm.setListListener(p);
		p.columnRslt_mfg_mtd_typ.addAllListener(p);
		p.columnRslt_mfg_mtd_typ.setListListener(p);
		p.columnRslt_mfg_mtd_typ_nm.addAllListener(p);
		p.columnRslt_mfg_mtd_typ_nm.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_loss_rsn_cd.addAllListener(p);
		p.columnRslt_loss_rsn_cd.setListListener(p);
		p.columnRslt_loss_rsn_nm.addAllListener(p);
		p.columnRslt_loss_rsn_nm.setListListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_schd_abort_flg.addAllListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_pr_rate.addAllListener(p);
		p.columnRslt_pr_rate.setListListener(p);
		p.columnRslt_inst_lot_no.addAllListener(p);
		p.columnRslt_inst_lot_no.setListListener(p);
		p.columnRslt_inst_sublot_no.addAllListener(p);
		p.columnRslt_inst_sublot_no.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_inpt_rsn_cd.addAllListener(p);
		p.columnRslt_inpt_rsn_cd.setListListener(p);
		p.columnRslt_inpt_rsn_nm.addAllListener(p);
		p.columnRslt_inpt_rsn_nm.setListListener(p);
		p.columnRslt_inpt_loc_cd.addAllListener(p);
		p.columnRslt_inpt_loc_cd.setListListener(p);
		p.columnRslt_inpt_loc_nm.addAllListener(p);
		p.columnRslt_inpt_loc_nm.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_prov_typ.addAllListener(p);
		p.columnRslt_prov_typ.setListListener(p);
		p.columnRslt_prov_typ_nm.addAllListener(p);
		p.columnRslt_prov_typ_nm.setListListener(p);
		p.columnRslt_alt_grp_cd.addAllListener(p);
		p.columnRslt_alt_grp_cd.setListListener(p);
		p.columnRslt_alt_grp_nm.addAllListener(p);
		p.columnRslt_alt_grp_nm.setListListener(p);
		p.columnRslt_alt_grp_seq.addAllListener(p);
		p.columnRslt_alt_grp_seq.setListListener(p);
		p.columnRslt_alt_itm_fix_flg.addAllListener(p);
		p.columnRslt_alt_itm_typ.addAllListener(p);
		p.columnRslt_alt_itm_typ.setListListener(p);
		p.columnRslt_alt_itm_typ_nm.addAllListener(p);
		p.columnRslt_alt_itm_typ_nm.setListListener(p);
		p.columnRslt_inpt_schd_no.addAllListener(p);
		p.columnRslt_inpt_schd_no.setListListener(p);
		p.columnRslt_inpt_act_no.addAllListener(p);
		p.columnRslt_inpt_act_no.setListListener(p);
		p.columnRslt_loss_act_no.addAllListener(p);
		p.columnRslt_loss_act_no.setListListener(p);
		p.columnRslt_mes_id.addAllListener(p);
		p.columnRslt_mes_id.setListListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_inpt_act_no.addAllListener(p);
		p.columnRslt_ext_inpt_act_no.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_par_base_unit_cd.addAllListener(p);
		p.columnRslt_par_base_unit_cd.setListListener(p);
		p.columnRslt_par_base_unit_nm.addAllListener(p);
		p.columnRslt_par_base_unit_nm.setListListener(p);
		p.columnRslt_par_base_unit_dec_place.addAllListener(p);
		p.columnRslt_par_base_unit_dec_place.setListListener(p);
		p.columnRslt_par_act_lot_no.addAllListener(p);
		p.columnRslt_par_act_lot_no.setListListener(p);
		p.columnRslt_par_act_sublot_no.addAllListener(p);
		p.columnRslt_par_act_sublot_no.setListListener(p);
		p.columnRslt_par_inst_lot_no.addAllListener(p);
		p.columnRslt_par_inst_lot_no.setListListener(p);
		p.columnRslt_par_inst_sublot_no.addAllListener(p);
		p.columnRslt_par_inst_sublot_no.setListListener(p);
		p.columnRslt_oper_mfg_sts_typ.addAllListener(p);
		p.columnRslt_oper_mfg_sts_typ.setListListener(p);
		p.columnRslt_oper_mfg_sts_typ_nm.addAllListener(p);
		p.columnRslt_oper_mfg_sts_typ_nm.setListListener(p);
		p.columnRslt_oper_unit_cd.addAllListener(p);
		p.columnRslt_oper_unit_cd.setListListener(p);
		p.columnRslt_oper_unit_nm.addAllListener(p);
		p.columnRslt_oper_unit_nm.setListListener(p);
		p.columnRslt_oper_unit_dec_place.addAllListener(p);
		p.columnRslt_oper_unit_dec_place.setListListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_inpt_ctl_typ.addAllListener(p);
		p.columnRslt_inpt_ctl_typ.setListListener(p);
		p.columnRslt_inpt_ctl_typ_nm.addAllListener(p);
		p.columnRslt_inpt_ctl_typ_nm.setListListener(p);
		p.columnRslt_main_itm_flg.addAllListener(p);
		p.columnRslt_yield_calc_flg.addAllListener(p);
		p.columnRslt_bkf_upd_flg.addAllListener(p);
		p.columnRslt_lot_mix_flg.addAllListener(p);
		p.columnRslt_sublot_mix_flg.addAllListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_stk_mng_typ_nm.addAllListener(p);
		p.columnRslt_stk_mng_typ_nm.setListListener(p);
		p.columnRslt_bkf_typ.addAllListener(p);
		p.columnRslt_bkf_typ.setListListener(p);
		p.columnRslt_bkf_typ_nm.addAllListener(p);
		p.columnRslt_bkf_typ_nm.setListListener(p);
		p.columnRslt_alloc_ctl_typ.addAllListener(p);
		p.columnRslt_alloc_ctl_typ.setListListener(p);
		p.columnRslt_alloc_ctl_typ_nm.addAllListener(p);
		p.columnRslt_alloc_ctl_typ_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_acxfr_act_rsn_cd.addAllListener(p);
		p.columnRslt_acxfr_act_rsn_cd.setListListener(p);
		p.columnRslt_acxfr_act_rsn_nm.addAllListener(p);
		p.columnRslt_acxfr_act_rsn_nm.setListListener(p);
		p.columnRslt_acxfr_act_bd_dpt_cd.addAllListener(p);
		p.columnRslt_acxfr_act_bd_dpt_cd.setListListener(p);
		p.columnRslt_acxfr_act_bd_dpt_nm.addAllListener(p);
		p.columnRslt_acxfr_act_bd_dpt_nm.setListListener(p);
		p.columnRslt_inpt_schd_intr_rmrks.addAllListener(p);
		p.columnRslt_inpt_schd_intr_rmrks.setListListener(p);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.addAllListener(p);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.setListListener(p);
		p.columnRslt_inpt_schd_sub_char1.addAllListener(p);
		p.columnRslt_inpt_schd_sub_char1.setListListener(p);
		p.columnRslt_inpt_schd_sub_char2.addAllListener(p);
		p.columnRslt_inpt_schd_sub_char2.setListListener(p);
		p.columnRslt_inpt_schd_sub_char3.addAllListener(p);
		p.columnRslt_inpt_schd_sub_char3.setListListener(p);
		p.columnRslt_inpt_act_intr_rmrks.addAllListener(p);
		p.columnRslt_inpt_act_intr_rmrks.setListListener(p);
		p.columnRslt_inpt_act_rpt_rmrks.addAllListener(p);
		p.columnRslt_inpt_act_rpt_rmrks.setListListener(p);
		p.columnRslt_inpt_act_trd_rmrks.addAllListener(p);
		p.columnRslt_inpt_act_trd_rmrks.setListListener(p);
		p.columnRslt_inpt_act_sub_char1.addAllListener(p);
		p.columnRslt_inpt_act_sub_char1.setListListener(p);
		p.columnRslt_inpt_act_sub_char2.addAllListener(p);
		p.columnRslt_inpt_act_sub_char2.setListListener(p);
		p.columnRslt_inpt_act_sub_char3.addAllListener(p);
		p.columnRslt_inpt_act_sub_char3.setListListener(p);
		p.columnRslt_loss_act_intr_rmrks.addAllListener(p);
		p.columnRslt_loss_act_intr_rmrks.setListListener(p);
		p.columnRslt_loss_act_trd_rmrks.addAllListener(p);
		p.columnRslt_loss_act_trd_rmrks.setListListener(p);
		p.columnRslt_loss_act_sub_char1.addAllListener(p);
		p.columnRslt_loss_act_sub_char1.setListListener(p);
		p.columnRslt_loss_act_sub_char2.addAllListener(p);
		p.columnRslt_loss_act_sub_char2.setListListener(p);
		p.columnRslt_loss_act_sub_char3.addAllListener(p);
		p.columnRslt_loss_act_sub_char3.setListListener(p);
		p.columnRslt_mfg_act_rpt_rmrks.addAllListener(p);
		p.columnRslt_mfg_act_rpt_rmrks.setListListener(p);
		p.columnRslt_mfg_act_intr_rmrks.addAllListener(p);
		p.columnRslt_mfg_act_intr_rmrks.setListListener(p);
		p.columnRslt_mfg_act_sub_char1.addAllListener(p);
		p.columnRslt_mfg_act_sub_char1.setListListener(p);
		p.columnRslt_mfg_act_sub_char2.addAllListener(p);
		p.columnRslt_mfg_act_sub_char2.setListListener(p);
		p.columnRslt_mfg_act_sub_char3.addAllListener(p);
		p.columnRslt_mfg_act_sub_char3.setListListener(p);
		p.columnRslt_oper_act_intr_rmrks.addAllListener(p);
		p.columnRslt_oper_act_intr_rmrks.setListListener(p);
		p.columnRslt_oper_act_rpt_rmrks.addAllListener(p);
		p.columnRslt_oper_act_rpt_rmrks.setListListener(p);
		p.columnRslt_oper_act_sub_char1.addAllListener(p);
		p.columnRslt_oper_act_sub_char1.setListListener(p);
		p.columnRslt_oper_act_sub_char2.addAllListener(p);
		p.columnRslt_oper_act_sub_char2.setListListener(p);
		p.columnRslt_oper_act_sub_char3.addAllListener(p);
		p.columnRslt_oper_act_sub_char3.setListListener(p);
		p.columnRslt_itm_yield.addAllListener(p);
		p.columnRslt_itm_yield.setListListener(p);
		p.columnRslt_itm_lower_yield.addAllListener(p);
		p.columnRslt_itm_lower_yield.setListListener(p);
		p.columnRslt_itm_std_yield.addAllListener(p);
		p.columnRslt_itm_std_yield.setListListener(p);
		p.columnRslt_itm_upper_yield.addAllListener(p);
		p.columnRslt_itm_upper_yield.setListListener(p);
		p.columnRslt_oper_yield.addAllListener(p);
		p.columnRslt_oper_yield.setListListener(p);
		p.columnRslt_oper_lower_yield.addAllListener(p);
		p.columnRslt_oper_lower_yield.setListListener(p);
		p.columnRslt_oper_std_yield.addAllListener(p);
		p.columnRslt_oper_std_yield.setListListener(p);
		p.columnRslt_oper_upper_yield.addAllListener(p);
		p.columnRslt_oper_upper_yield.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_mfg_str_ln_cd.addAllListener(p);
		p.columnRslt_mfg_str_ln_cd.setListListener(p);
		p.columnRslt_mfg_str_ln_nm.addAllListener(p);
		p.columnRslt_mfg_str_ln_nm.setListListener(p);
		p.columnRslt_mfg_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_oper_loc_cd.addAllListener(p);
		p.columnRslt_oper_loc_cd.setListListener(p);
		p.columnRslt_oper_loc_nm.addAllListener(p);
		p.columnRslt_oper_loc_nm.setListListener(p);
		p.columnRslt_oper_str_ln_cd.addAllListener(p);
		p.columnRslt_oper_str_ln_cd.setListListener(p);
		p.columnRslt_oper_str_ln_nm.addAllListener(p);
		p.columnRslt_oper_str_ln_nm.setListListener(p);
		p.columnRslt_oper_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_mfg_loc_grp_cd.addAllListener(p);
		p.columnRslt_mfg_loc_grp_cd.setListListener(p);
		p.columnRslt_mfg_loc_grp_nm.addAllListener(p);
		p.columnRslt_mfg_loc_grp_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_oper_ptn.addAllListener(p);
		p.columnRslt_oper_ptn.setListListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_div_seq.addAllListener(p);
		p.columnRslt_div_seq.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_mfg_act_no.addAllListener(p);
		p.columnRslt_mfg_act_no.setListListener(p);
		p.columnRslt_oper_inst_no.addAllListener(p);
		p.columnRslt_oper_inst_no.setListListener(p);
		p.columnRslt_oper_act_no.addAllListener(p);
		p.columnRslt_oper_act_no.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_oper_disp_seq.addAllListener(p);
		p.columnRslt_oper_disp_seq.setListListener(p);
		p.columnRslt_oper_usr_cd.addAllListener(p);
		p.columnRslt_oper_usr_cd.setListListener(p);
		p.columnRslt_oper_usr_nm.addAllListener(p);
		p.columnRslt_oper_usr_nm.setListListener(p);
		p.columnRslt_chd_itm_typ.addAllListener(p);
		p.columnRslt_chd_itm_typ.setListListener(p);
		p.columnRslt_chd_itm_typ_nm.addAllListener(p);
		p.columnRslt_chd_itm_typ_nm.setListListener(p);
		p.columnRslt_chd_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_chd_itm_typ_d_cd.setListListener(p);
		p.columnRslt_chd_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_chd_itm_typ_d_nm.setListListener(p);
		p.columnRslt_par_itm_typ.addAllListener(p);
		p.columnRslt_par_itm_typ.setListListener(p);
		p.columnRslt_par_itm_typ_nm.addAllListener(p);
		p.columnRslt_par_itm_typ_nm.setListListener(p);
		p.columnRslt_par_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_par_itm_typ_d_cd.setListListener(p);
		p.columnRslt_par_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_par_itm_typ_d_nm.setListListener(p);
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
	protected static void mcInitBtn(MSBCP_InptListSrch p) {
		p.Btn_open_MSBCP1010.addAllListener(p);
		p.Btn_open_MSBCP1010.setAPMethodName("doBtn_open_MSBCP1010");
		p.Btn_open_MSBCP1100.addAllListener(p);
		p.Btn_open_MSBCP1100.setAPMethodName("doBtn_open_MSBCP1100");
	}

	/**
	 * [SRCH_SCHD]ステータスの[SrchMode1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_SrchMode1(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[SrchMode2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_SrchMode2(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_OperSts(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[InptSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_InptSts(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Top(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Fold(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab1(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab2(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab3(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Cnd(MSBCP_InptListSrch p){
		p.Cnd_srch_mode1_Group.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_srch_mode2_Group.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_sav_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_ord_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_stt_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_sav_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_ord_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_stt_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_cmpl_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_no_schd_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_schd_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_act_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_inpt_ac_dt_fr.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_ac_dt_to.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_bkf_typ.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_bkf_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_inc_loss_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_not_alloc_srch_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_yield_calc_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_loc_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_loc_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_lot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_chd_sublot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loss_rsn_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loss_rsn_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_sno_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_inpt_rsn_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_rsn_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_schd_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_loss_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mes_id.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_data_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_ext_inpt_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_schd_inst_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char1.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char2.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char3.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_act_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[ChdItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ChdItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[ParItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ParItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Ctrl(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_RPnl(MSBCP_InptListSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Rslt(MSBCP_InptListSrch p){
		p.columnRslt_inpt_mfg_sts_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_mfg_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inpt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_loss_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_loss_rsn_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_rsn_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_sum_loss_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inpt_rem_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_abort_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_schd_inpt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_rqmt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_lot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inst_sublot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_act_tm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_schd_tm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_inpt_str_ln_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_inpt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_loss_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_fix_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mes_id.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_data_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_inpt_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_st_act_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_ac_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_end_act_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_ac_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_st_act_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_base_unit_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_par_act_lot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_act_sublot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_inst_lot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_inst_sublot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_main_itm_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_yield_calc_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bkf_upd_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lot_mix_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_mix_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_inst_ver_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_acxfr_act_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.columnRslt_acxfr_act_rsn_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_rsn_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_bd_dpt_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_bd_dpt_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_schd_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_rpt_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_yield.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_yield.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_po_d_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_chd_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_par_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Btn(MSBCP_InptListSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[SrchMode1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_SrchMode1(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[SrchMode2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_SrchMode2(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_OperSts(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[InptSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_InptSts(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Top(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Fold(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Tab1(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Tab2(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Tab3(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Cnd(MSBCP_InptListSrch p){
		p.Cnd_srch_mode1_Group.putMode(p, SRCH_ACT_INPT, MCMode.REQUIRED);
		p.Cnd_srch_mode2_Group.putMode(p, SRCH_ACT_INPT, MCMode.REQUIRED);
		p.Cnd_oper_sav_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_sav_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_inpt_ord_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_inpt_stt_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_cmpl_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_no_schd_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_dt_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_act_dt_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_ac_dt_fr.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_ac_dt_to.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_bkf_typ.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_bkf_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_inc_loss_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_not_alloc_srch_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_yield_calc_flg.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_loc_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_loc_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_lot_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_chd_sublot_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_loss_rsn_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_loss_rsn_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_sno_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_inpt_rsn_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_rsn_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_loss_act_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_mes_id.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Cnd_data_no.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Cnd_ext_inpt_act_no.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_inst_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_trd_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[ChdItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_ChdItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[ParItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_ParItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Ctrl(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_RPnl(MSBCP_InptListSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Rslt(MSBCP_InptListSrch p){
		p.columnRslt_inpt_mfg_sts_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_mfg_sts_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inpt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_loss_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_loss_rsn_cd.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_rsn_nm.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_sum_loss_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inpt_rem_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_schd_abort_flg.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_schd_inpt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_inst_lot_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inst_sublot_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_act_tm_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_schd_tm_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_inpt_str_ln_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_inpt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_loss_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_fix_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_loss_act_no.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_mes_id.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_data_no.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ext_inpt_act_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_st_act_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_ac_dt_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_end_act_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_ac_dt_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_st_act_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_base_unit_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_dec_place.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_par_act_lot_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_act_sublot_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_inst_lot_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_inst_sublot_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_main_itm_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_yield_calc_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bkf_upd_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_lot_mix_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_sublot_mix_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_inst_ver_no_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_acxfr_act_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_trd_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_loss_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_trd_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_intr_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_rpt_rmrks.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char1.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char2.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char3.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_chd_itm_grp_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_par_itm_grp_p_PPanel.putStatus(SRCH_ACT_INPT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__INPT_Btn(MSBCP_InptListSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_ACT_INPT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[SrchMode1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_SrchMode1(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[SrchMode2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_SrchMode2(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_OperSts(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[InptSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_InptSts(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Top(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Fold(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Tab1(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Tab2(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Tab3(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Cnd(MSBCP_InptListSrch p){
		p.Cnd_srch_mode1_Group.putMode(p, SRCH_ACT_LOSS, MCMode.REQUIRED);
		p.Cnd_srch_mode2_Group.putMode(p, SRCH_ACT_LOSS, MCMode.REQUIRED);
		p.Cnd_oper_sav_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_sav_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_inpt_ord_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_inpt_stt_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_cmpl_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_no_schd_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_dt_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_act_dt_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_ac_dt_fr.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_ac_dt_to.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_bkf_typ.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_bkf_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_pr_rate_inc_loss_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_not_alloc_srch_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_yield_calc_flg.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_loc_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_loc_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_lot_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_chd_sublot_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_loss_rsn_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_loss_rsn_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_sno_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_inpt_rsn_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_rsn_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_loss_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mes_id.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.Cnd_data_no.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.Cnd_ext_inpt_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_inst_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_trd_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[ChdItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_ChdItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[ParItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_ParItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Ctrl(MSBCP_InptListSrch p){

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_RPnl(MSBCP_InptListSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Rslt(MSBCP_InptListSrch p){
		p.columnRslt_inpt_mfg_sts_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_mfg_sts_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inpt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_loss_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_loss_rsn_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_rsn_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_sum_loss_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inpt_rem_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_schd_abort_flg.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_schd_inpt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_inst_lot_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inst_sublot_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_act_tm_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_schd_tm_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_inpt_str_ln_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_inpt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_loss_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_fix_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mes_id.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_data_no.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ext_inpt_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_st_act_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_ac_dt_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_end_act_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_ac_dt_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_st_act_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_base_unit_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_dec_place.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_par_act_lot_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_act_sublot_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_inst_lot_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_inst_sublot_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_main_itm_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_yield_calc_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bkf_upd_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_lot_mix_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_sublot_mix_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_inst_ver_no_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_acxfr_act_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_trd_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_trd_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_intr_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_rpt_rmrks.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char1.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char2.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char3.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_chd_itm_grp_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_par_itm_grp_p_PPanel.putStatus(SRCH_ACT_LOSS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_LOSS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LOSS_Btn(MSBCP_InptListSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_ACT_LOSS, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[SrchMode1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_SrchMode1(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[SrchMode2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_SrchMode2(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_OperSts(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[InptSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_InptSts(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Top(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Fold(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab1(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab2(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab3(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Cnd(MSBCP_InptListSrch p){
		p.Cnd_srch_mode1_Group.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_srch_mode2_Group.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_sav_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_ord_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_stt_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_sav_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_ord_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_stt_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_cmpl_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_no_schd_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_schd_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_act_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_inpt_ac_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_ac_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bkf_typ.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bkf_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_pr_rate_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_inc_loss_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_not_alloc_srch_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_yield_calc_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_loc_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_loc_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_lot_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_chd_sublot_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loss_rsn_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loss_rsn_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_sno_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_inpt_rsn_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_rsn_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_schd_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_loss_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mes_id.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Cnd_data_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Cnd_ext_inpt_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_schd_inst_rpt_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_intr_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char1.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char2.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char3.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inpt_act_rpt_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_trd_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_inpt_act_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_rpt_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_rpt_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_oper_act_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[ChdItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ChdItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[ParItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ParItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Ctrl(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_RPnl(MSBCP_InptListSrch p){
		p.RPnl_dwnld.putMode(p, REF_SCHD, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Rslt(MSBCP_InptListSrch p){
		p.columnRslt_inpt_mfg_sts_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_mfg_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inpt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_loss_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_loss_rsn_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_rsn_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_sum_loss_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inpt_rem_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_abort_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_schd_inpt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_rqmt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_lot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inst_sublot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_act_tm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_schd_tm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_inpt_str_ln_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_inpt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_loss_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_fix_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mes_id.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_data_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_inpt_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_st_act_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_end_act_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_st_act_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_base_unit_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_par_act_lot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_act_sublot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_inst_lot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_inst_sublot_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_main_itm_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_yield_calc_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bkf_upd_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lot_mix_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_mix_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_inst_ver_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_acxfr_act_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.columnRslt_acxfr_act_rsn_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_rsn_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_bd_dpt_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_bd_dpt_nm.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_schd_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_rpt_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_trd_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_sub_char1.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_sub_char2.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inpt_act_sub_char3.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_trd_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char1.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char2.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char3.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_rpt_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_sub_char1.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_sub_char2.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_sub_char3.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_rpt_rmrks.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_sub_char1.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_sub_char2.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_act_sub_char3.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_yield.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_lower_yield.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_yield.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_lower_yield.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_po_d_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_oper_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_chd_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_par_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);

	}

	/**
	 * [REF_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Btn(MSBCP_InptListSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_SCHD, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_INPT]ステータスの[SrchMode1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_SrchMode1(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[SrchMode2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_SrchMode2(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_OperSts(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[InptSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_InptSts(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Top(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Fold(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Tab1(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Tab2(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Tab3(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Cnd(MSBCP_InptListSrch p){
		p.Cnd_srch_mode1_Group.putMode(p, REF_ACT_INPT, MCMode.REQUIRED);
		p.Cnd_srch_mode2_Group.putMode(p, REF_ACT_INPT, MCMode.REQUIRED);
		p.Cnd_oper_sav_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_sav_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_inpt_ord_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_inpt_stt_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_cmpl_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_no_schd_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_dt_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_act_dt_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_ac_dt_fr.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_ac_dt_to.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_bkf_typ.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_bkf_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_fr.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_inc_loss_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_not_alloc_srch_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_yield_calc_flg.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_loc_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_loc_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_lot_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_chd_sublot_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_loss_rsn_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_loss_rsn_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_sno_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_inpt_rsn_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_rsn_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_loss_act_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Cnd_mes_id.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Cnd_data_no.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Cnd_ext_inpt_act_no.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_inst_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char1.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char2.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char3.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_trd_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_INPT]ステータスの[ChdItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_ChdItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[ParItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_ParItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Ctrl(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_INPT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_RPnl(MSBCP_InptListSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_INPT, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Rslt(MSBCP_InptListSrch p){
		p.columnRslt_inpt_mfg_sts_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_mfg_sts_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inpt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_loss_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_loss_rsn_cd.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_rsn_nm.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_sum_loss_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inpt_rem_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_schd_abort_flg.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_schd_inpt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_rqmt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_inst_lot_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inst_sublot_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_act_tm_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_schd_tm_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_inpt_str_ln_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_inpt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_loss_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_fix_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_loss_act_no.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_mes_id.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_data_no.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ext_inpt_act_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_st_act_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_ac_dt_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_end_act_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_ac_dt_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_st_act_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_base_unit_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_dec_place.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_par_act_lot_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_act_sublot_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_inst_lot_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_inst_sublot_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_main_itm_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_yield_calc_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bkf_upd_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_lot_mix_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_sublot_mix_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_inst_ver_no_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_acxfr_act_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char1.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char2.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char3.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_trd_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_loss_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_trd_rmrks.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_loss_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_intr_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_rpt_rmrks.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char1.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char2.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char3.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_INPT, MCMode.READ_ONLY);
		p.Rslt_chd_itm_grp_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_par_itm_grp_p_PPanel.putStatus(REF_ACT_INPT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);

	}

	/**
	 * [REF_ACT_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__INPT_Btn(MSBCP_InptListSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_ACT_INPT, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_ACT_INPT, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[SrchMode1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_SrchMode1(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[SrchMode2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_SrchMode2(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_OperSts(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[InptSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_InptSts(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Top(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Fold(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Tab1(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Tab2(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Tab3(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Cnd(MSBCP_InptListSrch p){
		p.Cnd_srch_mode1_Group.putMode(p, REF_ACT_LOSS, MCMode.REQUIRED);
		p.Cnd_srch_mode2_Group.putMode(p, REF_ACT_LOSS, MCMode.REQUIRED);
		p.Cnd_oper_sav_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_sav_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_inpt_ord_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_inpt_stt_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_cmpl_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_no_schd_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_dt_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_act_dt_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inpt_ac_dt_fr.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_ac_dt_to.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_bkf_typ.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_bkf_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_pr_rate_fr.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_pr_rate_inc_loss_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_not_alloc_srch_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_yield_calc_flg.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_loc_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_loc_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_str_ln_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_lot_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_chd_sublot_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_loss_rsn_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_loss_rsn_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_sno_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_inpt_rsn_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_rsn_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_loss_act_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mes_id.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.Cnd_data_no.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.Cnd_ext_inpt_act_no.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_inst_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_schd_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_trd_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_inpt_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_mfg_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_oper_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_par_itm_grp_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[ChdItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_ChdItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[ParItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_ParItmGrp(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Ctrl(MSBCP_InptListSrch p){

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_RPnl(MSBCP_InptListSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Rslt(MSBCP_InptListSrch p){
		p.columnRslt_inpt_mfg_sts_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_mfg_sts_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inpt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_loss_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_loss_rsn_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_rsn_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_sum_loss_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sum_fxd_loss_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inpt_rem_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_schd_abort_flg.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_schd_inpt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_rqmt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_fxd_rqmt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_inst_lot_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inst_sublot_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_act_tm_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_schd_tm_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_rsn_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_loc_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_inpt_str_ln_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_cd_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_inpt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_loss_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fxd_loss_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_inpt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_rqmt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_fix_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mes_id.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_data_no.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ext_inpt_act_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_st_act_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_ac_dt_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_end_act_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_ac_dt_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_base_unit_mfg_inst_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_schd_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_st_act_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_base_unit_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_base_unit_dec_place.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.columnRslt_par_act_lot_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_act_sublot_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_inst_lot_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_inst_sublot_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_ACT_LOSS, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_main_itm_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_yield_calc_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bkf_upd_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_lot_mix_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_sublot_mix_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_inst_ver_no_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bkf_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_acxfr_act_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_cont_acxfr_act_qty_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rsn_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_bd_dpt_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_trd_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_inpt_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_trd_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_loss_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_intr_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_rpt_rmrks.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char1.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char2.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_sub_char3.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_oper_usr_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_LOSS, MCMode.READ_ONLY);
		p.Rslt_chd_itm_grp_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_par_itm_grp_p_PPanel.putStatus(REF_ACT_LOSS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);

	}

	/**
	 * [REF_ACT_LOSS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LOSS_Btn(MSBCP_InptListSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_ACT_LOSS, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_SCHD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_InptListSrch_MC.setTableConfigRslt((MSBCP_InptListSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_InptListSrch p) {
		p.columnRslt_inpt_mfg_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_mfg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_mfg_sts_typ);
		p.columnRslt_inpt_mfg_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_mfg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_mfg_sts_typ_nm);
		p.columnRslt_mfg_mtd_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_mtd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_mtd_typ);
		p.columnRslt_mfg_mtd_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_mtd_typ_nm);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.RsltTable.addTable(p.Rslt_chd_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.RsltTable.addTable(p.Rslt_inpt_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_loss_qty_p_PPanel.QtyTable);
		p.columnRslt_loss_rsn_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_rsn_cd);
		p.columnRslt_loss_rsn_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_rsn_nm);
		p.RsltTable.addTable(p.Rslt_sum_loss_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sum_fxd_loss_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_inpt_rem_qty_p_PPanel.QtyTable);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.columnRslt_schd_abort_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.schd_abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_abort_flg);
		p.RsltTable.addTable(p.Rslt_schd_inpt_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_schd_rqmt_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_schd_fxd_rqmt_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_pr_rate.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.pr_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_rate);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.columnRslt_inst_lot_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inst_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_lot_no);
		p.columnRslt_inst_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inst_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_sublot_no);
		p.RsltTable.addTable(p.Rslt_act_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoTable);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_inpt_rsn_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_rsn_cd);
		p.columnRslt_inpt_rsn_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_rsn_nm);
		p.columnRslt_inpt_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_loc_cd_META);
		p.columnRslt_inpt_loc_cd.setListType(MCListType.STRICT);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_loc_cd);
		p.columnRslt_inpt_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_loc_nm);
		p.RsltTable.addTable(p.Rslt_inpt_str_ln_p_PPanel.StrLnTable);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.RsltTable.addTable(p.Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_cd_p_PPanel.ContFctrUnitTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_cont_inpt_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_loss_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_fxd_loss_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_schd_inpt_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_schd_rqmt_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.ContQtyTable);
		p.columnRslt_prov_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.prov_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_typ);
		p.columnRslt_prov_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.prov_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_typ_nm);
		p.columnRslt_alt_grp_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alt_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_cd);
		p.columnRslt_alt_grp_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alt_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_nm);
		p.columnRslt_alt_grp_seq.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alt_grp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_seq);
		p.columnRslt_alt_itm_fix_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alt_itm_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_fix_flg);
		p.columnRslt_alt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alt_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_typ);
		p.columnRslt_alt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alt_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_typ_nm);
		p.columnRslt_inpt_schd_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_no);
		p.columnRslt_inpt_act_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_no);
		p.columnRslt_loss_act_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_act_no);
		p.columnRslt_mes_id.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mes_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mes_id);
		p.columnRslt_data_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_inpt_act_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ext_inpt_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_inpt_act_no);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.RsltTable.addTable(p.Rslt_par_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_st_act_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_st_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_end_act_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_end_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_base_unit_mfg_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_yield_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_st_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_yield_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_dfct_qty_p_PPanel.QtyTable);
		p.columnRslt_par_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_base_unit_cd);
		p.columnRslt_par_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_base_unit_nm);
		p.columnRslt_par_base_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_base_unit_dec_place);
		p.columnRslt_par_act_lot_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_act_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_act_lot_no);
		p.columnRslt_par_act_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_act_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_act_sublot_no);
		p.columnRslt_par_inst_lot_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_inst_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_inst_lot_no);
		p.columnRslt_par_inst_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_inst_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_inst_sublot_no);
		p.columnRslt_oper_mfg_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_mfg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_mfg_sts_typ);
		p.columnRslt_oper_mfg_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_mfg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_mfg_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_oper_unit_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_oper_unit_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_oper_unit_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_cd);
		p.columnRslt_oper_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_nm);
		p.columnRslt_oper_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_par_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_inpt_ctl_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_ctl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_ctl_typ);
		p.columnRslt_inpt_ctl_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_ctl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_ctl_typ_nm);
		p.columnRslt_main_itm_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.main_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_main_itm_flg);
		p.columnRslt_yield_calc_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.yield_calc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_calc_flg);
		p.columnRslt_bkf_upd_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.bkf_upd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bkf_upd_flg);
		p.columnRslt_lot_mix_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.lot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mix_flg);
		p.columnRslt_sublot_mix_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.sublot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mix_flg);
		p.RsltTable.addTable(p.Rslt_inst_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_stk_mng_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ_nm);
		p.columnRslt_bkf_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.bkf_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bkf_typ);
		p.columnRslt_bkf_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.bkf_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bkf_typ_nm);
		p.columnRslt_alloc_ctl_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alloc_ctl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ctl_typ);
		p.columnRslt_alloc_ctl_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.alloc_ctl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ctl_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_bp_cd_META);
		p.columnRslt_stk_bp_cd.setListType(MCListType.STRICT);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_arrv_bp_cd_META);
		p.columnRslt_stk_arrv_bp_cd.setListType(MCListType.STRICT);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.RsltTable.addTable(p.Rslt_acxfr_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_cont_acxfr_act_qty_p_PPanel.ContQtyTable);
		p.columnRslt_acxfr_act_rsn_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.acxfr_act_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_rsn_cd);
		p.columnRslt_acxfr_act_rsn_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.acxfr_act_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_rsn_nm);
		p.columnRslt_acxfr_act_bd_dpt_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.acxfr_act_bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_bd_dpt_cd);
		p.columnRslt_acxfr_act_bd_dpt_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.acxfr_act_bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_bd_dpt_nm);
		p.columnRslt_inpt_schd_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_schd_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_intr_rmrks);
		p.columnRslt_inpt_schd_inst_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_schd_inst_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_inst_rpt_rmrks);
		p.columnRslt_inpt_schd_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_schd_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_sub_char1);
		p.columnRslt_inpt_schd_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_schd_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_sub_char2);
		p.columnRslt_inpt_schd_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_schd_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_sub_char3);
		p.columnRslt_inpt_act_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_intr_rmrks);
		p.columnRslt_inpt_act_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_rpt_rmrks);
		p.columnRslt_inpt_act_trd_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_trd_rmrks);
		p.columnRslt_inpt_act_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_sub_char1);
		p.columnRslt_inpt_act_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_sub_char2);
		p.columnRslt_inpt_act_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.inpt_act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_act_sub_char3);
		p.columnRslt_loss_act_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_act_intr_rmrks);
		p.columnRslt_loss_act_trd_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_act_trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_act_trd_rmrks);
		p.columnRslt_loss_act_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_act_sub_char1);
		p.columnRslt_loss_act_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_act_sub_char2);
		p.columnRslt_loss_act_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.loss_act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loss_act_sub_char3);
		p.columnRslt_mfg_act_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_act_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_rpt_rmrks);
		p.columnRslt_mfg_act_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_intr_rmrks);
		p.columnRslt_mfg_act_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_sub_char1);
		p.columnRslt_mfg_act_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_sub_char2);
		p.columnRslt_mfg_act_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_sub_char3);
		p.columnRslt_oper_act_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_intr_rmrks);
		p.columnRslt_oper_act_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_act_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_rpt_rmrks);
		p.columnRslt_oper_act_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_sub_char1);
		p.columnRslt_oper_act_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_sub_char2);
		p.columnRslt_oper_act_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_sub_char3);
		p.columnRslt_itm_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.itm_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_yield);
		p.columnRslt_itm_lower_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.itm_lower_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_lower_yield);
		p.columnRslt_itm_std_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.itm_std_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_std_yield);
		p.columnRslt_itm_upper_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.itm_upper_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_upper_yield);
		p.columnRslt_oper_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_yield);
		p.columnRslt_oper_lower_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_lower_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_lower_yield);
		p.columnRslt_oper_std_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_std_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_std_yield);
		p.columnRslt_oper_upper_yield.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_upper_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_upper_yield);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_mfg_str_ln_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_cd);
		p.columnRslt_mfg_str_ln_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_nm);
		p.columnRslt_mfg_str_ln_cd_none_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_cd_none_flg);
		p.columnRslt_oper_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_loc_cd);
		p.columnRslt_oper_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_loc_nm);
		p.columnRslt_oper_str_ln_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_str_ln_cd);
		p.columnRslt_oper_str_ln_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_str_ln_nm);
		p.columnRslt_oper_str_ln_cd_none_flg.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_str_ln_cd_none_flg);
		p.columnRslt_mfg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_grp_cd);
		p.columnRslt_mfg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_grp_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_oper_ptn.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ptn);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_div_seq.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.div_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_seq);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_mfg_act_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.mfg_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_no);
		p.columnRslt_oper_inst_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_no);
		p.columnRslt_oper_act_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_no);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.columnRslt_oper_disp_seq.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_disp_seq);
		p.columnRslt_oper_usr_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_usr_cd);
		p.columnRslt_oper_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.oper_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_usr_nm);
		p.columnRslt_chd_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.chd_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ);
		p.columnRslt_chd_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.chd_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_nm);
		p.columnRslt_chd_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.chd_itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_d_cd);
		p.columnRslt_chd_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.chd_itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_d_nm);
		p.columnRslt_par_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ);
		p.columnRslt_par_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ_nm);
		p.columnRslt_par_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ_d_cd);
		p.columnRslt_par_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.par_itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ_d_nm);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP1090.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.RsltTable.addTable(p.Rslt_chd_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_par_itm_grp_p_PPanel.ItmGrpTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bkf_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bkf_typ.getListConfig().setPutter(getCnd_bkf_typ_ListPutter());
		Cnd_mfg_loc_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_site_cd.getListConfig().setPutter(getCnd_mfg_loc_site_cd_ListPutter());
		Cnd_mfg_loc_site_nm.getListConfig().setPutter(getCnd_mfg_loc_site_nm_ListPutter());
		Cnd_mfg_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_wg_cd.getListConfig().setPutter(getCnd_mfg_loc_wg_cd_ListPutter());
		Cnd_mfg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_grp_cd.getListConfig().setPutter(getCnd_mfg_loc_grp_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_mfg_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_str_ln_cd.getListConfig().setPutter(getCnd_mfg_str_ln_cd_ListPutter());
		Cnd_inpt_loc_cd.getListConfig().setPutter(getCnd_inpt_loc_cd_ListPutter());
		Cnd_inpt_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_inpt_str_ln_cd.getListConfig().setPutter(getCnd_inpt_str_ln_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_oper_loc_cd.getListConfig().setPutter(getCnd_oper_loc_cd_ListPutter());
		Cnd_oper_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_str_ln_cd.getListConfig().setPutter(getCnd_oper_str_ln_cd_ListPutter());
		Cnd_mfg_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_mtd_typ.getListConfig().setPutter(getCnd_mfg_mtd_typ_ListPutter());
		Cnd_inpt_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_inpt_ctl_typ.getListConfig().setPutter(getCnd_inpt_ctl_typ_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_chd_lot_no.getListConfig().setPutter(getCnd_chd_lot_no_ListPutter());
		Cnd_chd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_sublot_no.getListConfig().setPutter(getCnd_chd_sublot_no_ListPutter());
		Cnd_loss_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loss_rsn_cd.getListConfig().setPutter(getCnd_loss_rsn_cd_ListPutter());
		Cnd_loss_rsn_nm.getListConfig().setPutter(getCnd_loss_rsn_nm_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_inpt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_inpt_rsn_cd.getListConfig().setPutter(getCnd_inpt_rsn_cd_ListPutter());
		Cnd_inpt_rsn_nm.getListConfig().setPutter(getCnd_inpt_rsn_nm_ListPutter());
		Cnd_oper_usr_cd.getListConfig().setPutter(getCnd_oper_usr_cd_ListPutter());
		columnRslt_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gd_cd.getListConfig().setPutter(getRslt_gd_cd_ListPutter());
		columnRslt_inpt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_inpt_rsn_cd.getListConfig().setPutter(getRslt_inpt_rsn_cd_ListPutter());
		columnRslt_inpt_loc_cd.getListConfig().setPutter(getRslt_inpt_loc_cd_ListPutter());
		columnRslt_stk_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_stk_mng_typ.getListConfig().setPutter(getRslt_stk_mng_typ_ListPutter());
		columnRslt_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_stk_id_typ.getListConfig().setPutter(getRslt_stk_id_typ_ListPutter());
		columnRslt_stk_bp_cd.getListConfig().setPutter(getRslt_stk_bp_cd_ListPutter());
		columnRslt_stk_arrv_bp_cd.getListConfig().setPutter(getRslt_stk_arrv_bp_cd_ListPutter());
		columnRslt_acxfr_act_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_acxfr_act_rsn_cd.getListConfig().setPutter(getRslt_acxfr_act_rsn_cd_ListPutter());
		columnRslt_acxfr_act_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_acxfr_act_bd_dpt_cd.getListConfig().setPutter(getRslt_acxfr_act_bd_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SCHDStatus() {
		status = SRCH_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_INPTStatus() {
		status = SRCH_ACT_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_LOSS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_LOSSStatus() {
		status = SRCH_ACT_LOSS;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHDStatus() {
		status = REF_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_INPTStatus() {
		status = REF_ACT_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_LOSS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_LOSSStatus() {
		status = REF_ACT_LOSS;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SCHD.equals(status)) {
			setSRCH_SCHDStatus();
		}
		else if (SRCH_ACT_INPT.equals(status)) {
			setSRCH_ACT_INPTStatus();
		}
		else if (SRCH_ACT_LOSS.equals(status)) {
			setSRCH_ACT_LOSSStatus();
		}
		else if (REF_SCHD.equals(status)) {
			setREF_SCHDStatus();
		}
		else if (REF_ACT_INPT.equals(status)) {
			setREF_ACT_INPTStatus();
		}
		else if (REF_ACT_LOSS.equals(status)) {
			setREF_ACT_LOSSStatus();
		}
	}

	/**
	 * [Cnd_bkf_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bkf_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BkfTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_site_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_site_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_inpt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inpt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_inpt_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inpt_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
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
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgMtdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_inpt_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inpt_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptCtlTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_chd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_loss_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loss_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossBizRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_loss_rsn_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loss_rsn_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_inpt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inpt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptBizRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_inpt_rsn_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inpt_rsn_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Rslt_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_inpt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_inpt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_inpt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_inpt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_acxfr_act_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_acxfr_act_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_acxfr_act_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_acxfr_act_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_bkf_typ) return getCnd_bkf_typ(row, info);
		if(combo == Cnd_mfg_loc_site_cd) return getCnd_mfg_loc_site_cd(row, info);
		if(combo == Cnd_mfg_loc_site_nm) return getCnd_mfg_loc_site_nm(row, info);
		if(combo == Cnd_mfg_loc_wg_cd) return getCnd_mfg_loc_wg_cd(row, info);
		if(combo == Cnd_mfg_loc_grp_cd) return getCnd_mfg_loc_grp_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_mfg_str_ln_cd) return getCnd_mfg_str_ln_cd(row, info);
		if(combo == Cnd_inpt_loc_cd) return getCnd_inpt_loc_cd(row, info);
		if(combo == Cnd_inpt_str_ln_cd) return getCnd_inpt_str_ln_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_oper_loc_cd) return getCnd_oper_loc_cd(row, info);
		if(combo == Cnd_oper_str_ln_cd) return getCnd_oper_str_ln_cd(row, info);
		if(combo == Cnd_mfg_mtd_typ) return getCnd_mfg_mtd_typ(row, info);
		if(combo == Cnd_inpt_ctl_typ) return getCnd_inpt_ctl_typ(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_cd) return getCnd_chd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub1) return getCnd_chd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub2) return getCnd_chd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub3) return getCnd_chd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_chd_lot_no) return getCnd_chd_lot_no(row, info);
		if(combo == Cnd_chd_sublot_no) return getCnd_chd_sublot_no(row, info);
		if(combo == Cnd_loss_rsn_cd) return getCnd_loss_rsn_cd(row, info);
		if(combo == Cnd_loss_rsn_nm) return getCnd_loss_rsn_nm(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_inpt_rsn_cd) return getCnd_inpt_rsn_cd(row, info);
		if(combo == Cnd_inpt_rsn_nm) return getCnd_inpt_rsn_nm(row, info);
		if(combo == Cnd_oper_usr_cd) return getCnd_oper_usr_cd(row, info);
		if(combo == columnRslt_gd_cd) return getRslt_gd_cd(row, info);
		if(combo == columnRslt_inpt_rsn_cd) return getRslt_inpt_rsn_cd(row, info);
		if(combo == columnRslt_inpt_loc_cd) return getRslt_inpt_loc_cd(row, info);
		if(combo == columnRslt_stk_mng_typ) return getRslt_stk_mng_typ(row, info);
		if(combo == columnRslt_stk_id_typ) return getRslt_stk_id_typ(row, info);
		if(combo == columnRslt_stk_bp_cd) return getRslt_stk_bp_cd(row, info);
		if(combo == columnRslt_stk_arrv_bp_cd) return getRslt_stk_arrv_bp_cd(row, info);
		if(combo == columnRslt_acxfr_act_rsn_cd) return getRslt_acxfr_act_rsn_cd(row, info);
		if(combo == columnRslt_acxfr_act_bd_dpt_cd) return getRslt_acxfr_act_bd_dpt_cd(row, info);
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
		else if (ap == Btn_open_MSBCP1010) doBtn_open_MSBCP1010(info);
		else if (ap == Btn_open_MSBCP1100) doBtn_open_MSBCP1100(info);
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
	 * [Btn]パネルの[open_MSBCP1010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP1100]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1100(MCEventInfo info);

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
		if (vc == Cnd_srch_mode1_Group) return doCnd_srch_mode1_VC(info);
		if (vc == Cnd_srch_mode2_Group) return doCnd_srch_mode2_VC(info);
		if (vc == Cnd_oper_sav_flg) return doCnd_oper_sav_flg_VC(info);
		if (vc == Cnd_oper_ord_flg) return doCnd_oper_ord_flg_VC(info);
		if (vc == Cnd_oper_stt_flg) return doCnd_oper_stt_flg_VC(info);
		if (vc == Cnd_oper_cmpl_flg) return doCnd_oper_cmpl_flg_VC(info);
		if (vc == Cnd_inpt_sav_flg) return doCnd_inpt_sav_flg_VC(info);
		if (vc == Cnd_inpt_ord_flg) return doCnd_inpt_ord_flg_VC(info);
		if (vc == Cnd_inpt_stt_flg) return doCnd_inpt_stt_flg_VC(info);
		if (vc == Cnd_inpt_cmpl_flg) return doCnd_inpt_cmpl_flg_VC(info);
		if (vc == Cnd_inpt_no_schd_flg) return doCnd_inpt_no_schd_flg_VC(info);
		if (vc == Cnd_inpt_ac_dt_fr) return doCnd_inpt_ac_dt_fr_VC(info);
		if (vc == Cnd_inpt_ac_dt_to) return doCnd_inpt_ac_dt_to_VC(info);
		if (vc == Cnd_bkf_typ) return doCnd_bkf_typ_VC(info);
		if (vc == Cnd_bkf_typ_nm) return doCnd_bkf_typ_nm_VC(info);
		if (vc == Cnd_pr_rate_fr) return doCnd_pr_rate_fr_VC(info);
		if (vc == Cnd_pr_rate_to) return doCnd_pr_rate_to_VC(info);
		if (vc == Cnd_pr_rate_inc_loss_flg) return doCnd_pr_rate_inc_loss_flg_VC(info);
		if (vc == Cnd_not_alloc_srch_flg) return doCnd_not_alloc_srch_flg_VC(info);
		if (vc == Cnd_yield_calc_flg) return doCnd_yield_calc_flg_VC(info);
		if (vc == Cnd_mfg_loc_site_cd) return doCnd_mfg_loc_site_cd_VC(info);
		if (vc == Cnd_mfg_loc_site_nm) return doCnd_mfg_loc_site_nm_VC(info);
		if (vc == Cnd_mfg_loc_wg_cd) return doCnd_mfg_loc_wg_cd_VC(info);
		if (vc == Cnd_mfg_loc_wg_nm) return doCnd_mfg_loc_wg_nm_VC(info);
		if (vc == Cnd_mfg_loc_grp_cd) return doCnd_mfg_loc_grp_cd_VC(info);
		if (vc == Cnd_mfg_loc_grp_nm) return doCnd_mfg_loc_grp_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_mfg_str_ln_cd) return doCnd_mfg_str_ln_cd_VC(info);
		if (vc == Cnd_mfg_str_ln_nm) return doCnd_mfg_str_ln_nm_VC(info);
		if (vc == Cnd_inpt_loc_cd) return doCnd_inpt_loc_cd_VC(info);
		if (vc == Cnd_inpt_loc_nm) return doCnd_inpt_loc_nm_VC(info);
		if (vc == Cnd_inpt_str_ln_cd) return doCnd_inpt_str_ln_cd_VC(info);
		if (vc == Cnd_inpt_str_ln_nm) return doCnd_inpt_str_ln_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_oper_loc_cd) return doCnd_oper_loc_cd_VC(info);
		if (vc == Cnd_oper_loc_nm) return doCnd_oper_loc_nm_VC(info);
		if (vc == Cnd_oper_str_ln_cd) return doCnd_oper_str_ln_cd_VC(info);
		if (vc == Cnd_oper_str_ln_nm) return doCnd_oper_str_ln_nm_VC(info);
		if (vc == Cnd_mfg_mtd_typ) return doCnd_mfg_mtd_typ_VC(info);
		if (vc == Cnd_mfg_mtd_typ_nm) return doCnd_mfg_mtd_typ_nm_VC(info);
		if (vc == Cnd_inpt_ctl_typ) return doCnd_inpt_ctl_typ_VC(info);
		if (vc == Cnd_inpt_ctl_typ_nm) return doCnd_inpt_ctl_typ_nm_VC(info);
		if (vc == Cnd_chd_lot_no) return doCnd_chd_lot_no_VC(info);
		if (vc == Cnd_chd_sublot_no) return doCnd_chd_sublot_no_VC(info);
		if (vc == Cnd_loss_rsn_cd) return doCnd_loss_rsn_cd_VC(info);
		if (vc == Cnd_loss_rsn_nm) return doCnd_loss_rsn_nm_VC(info);
		if (vc == Cnd_mfg_inst_no) return doCnd_mfg_inst_no_VC(info);
		if (vc == Cnd_inpt_rsn_cd) return doCnd_inpt_rsn_cd_VC(info);
		if (vc == Cnd_inpt_rsn_nm) return doCnd_inpt_rsn_nm_VC(info);
		if (vc == Cnd_oper_usr_cd) return doCnd_oper_usr_cd_VC(info);
		if (vc == Cnd_oper_usr_nm) return doCnd_oper_usr_nm_VC(info);
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_oper_inst_no) return doCnd_oper_inst_no_VC(info);
		if (vc == Cnd_mfg_act_no) return doCnd_mfg_act_no_VC(info);
		if (vc == Cnd_oper_act_no) return doCnd_oper_act_no_VC(info);
		if (vc == Cnd_inpt_schd_no) return doCnd_inpt_schd_no_VC(info);
		if (vc == Cnd_inpt_act_no) return doCnd_inpt_act_no_VC(info);
		if (vc == Cnd_loss_act_no) return doCnd_loss_act_no_VC(info);
		if (vc == Cnd_mes_id) return doCnd_mes_id_VC(info);
		if (vc == Cnd_data_no) return doCnd_data_no_VC(info);
		if (vc == Cnd_ext_inpt_act_no) return doCnd_ext_inpt_act_no_VC(info);
		if (vc == Cnd_inpt_schd_inst_rpt_rmrks) return doCnd_inpt_schd_inst_rpt_rmrks_VC(info);
		if (vc == Cnd_inpt_schd_intr_rmrks) return doCnd_inpt_schd_intr_rmrks_VC(info);
		if (vc == Cnd_inpt_schd_sub_char1) return doCnd_inpt_schd_sub_char1_VC(info);
		if (vc == Cnd_inpt_schd_sub_char2) return doCnd_inpt_schd_sub_char2_VC(info);
		if (vc == Cnd_inpt_schd_sub_char3) return doCnd_inpt_schd_sub_char3_VC(info);
		if (vc == Cnd_inpt_act_rpt_rmrks) return doCnd_inpt_act_rpt_rmrks_VC(info);
		if (vc == Cnd_inpt_act_intr_rmrks) return doCnd_inpt_act_intr_rmrks_VC(info);
		if (vc == Cnd_inpt_act_trd_rmrks) return doCnd_inpt_act_trd_rmrks_VC(info);
		if (vc == Cnd_inpt_act_sub_char1) return doCnd_inpt_act_sub_char1_VC(info);
		if (vc == Cnd_inpt_act_sub_char2) return doCnd_inpt_act_sub_char2_VC(info);
		if (vc == Cnd_inpt_act_sub_char3) return doCnd_inpt_act_sub_char3_VC(info);
		if (vc == Cnd_mfg_act_rpt_rmrks) return doCnd_mfg_act_rpt_rmrks_VC(info);
		if (vc == Cnd_mfg_act_intr_rmrks) return doCnd_mfg_act_intr_rmrks_VC(info);
		if (vc == Cnd_mfg_act_sub_char1) return doCnd_mfg_act_sub_char1_VC(info);
		if (vc == Cnd_mfg_act_sub_char2) return doCnd_mfg_act_sub_char2_VC(info);
		if (vc == Cnd_mfg_act_sub_char3) return doCnd_mfg_act_sub_char3_VC(info);
		if (vc == Cnd_oper_act_intr_rmrks) return doCnd_oper_act_intr_rmrks_VC(info);
		if (vc == Cnd_oper_act_rpt_rmrks) return doCnd_oper_act_rpt_rmrks_VC(info);
		if (vc == Cnd_oper_act_sub_char1) return doCnd_oper_act_sub_char1_VC(info);
		if (vc == Cnd_oper_act_sub_char2) return doCnd_oper_act_sub_char2_VC(info);
		if (vc == Cnd_oper_act_sub_char3) return doCnd_oper_act_sub_char3_VC(info);
		if (vc == columnRslt_inpt_mfg_sts_typ) return doRslt_inpt_mfg_sts_typ_VC(info);
		if (vc == columnRslt_inpt_mfg_sts_typ_nm) return doRslt_inpt_mfg_sts_typ_nm_VC(info);
		if (vc == columnRslt_mfg_mtd_typ) return doRslt_mfg_mtd_typ_VC(info);
		if (vc == columnRslt_mfg_mtd_typ_nm) return doRslt_mfg_mtd_typ_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_loss_rsn_cd) return doRslt_loss_rsn_cd_VC(info);
		if (vc == columnRslt_loss_rsn_nm) return doRslt_loss_rsn_nm_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_schd_abort_flg) return doRslt_schd_abort_flg_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_pr_rate) return doRslt_pr_rate_VC(info);
		if (vc == columnRslt_inst_lot_no) return doRslt_inst_lot_no_VC(info);
		if (vc == columnRslt_inst_sublot_no) return doRslt_inst_sublot_no_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_inpt_rsn_cd) return doRslt_inpt_rsn_cd_VC(info);
		if (vc == columnRslt_inpt_rsn_nm) return doRslt_inpt_rsn_nm_VC(info);
		if (vc == columnRslt_inpt_loc_cd) return doRslt_inpt_loc_cd_VC(info);
		if (vc == columnRslt_inpt_loc_nm) return doRslt_inpt_loc_nm_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_prov_typ) return doRslt_prov_typ_VC(info);
		if (vc == columnRslt_prov_typ_nm) return doRslt_prov_typ_nm_VC(info);
		if (vc == columnRslt_alt_grp_cd) return doRslt_alt_grp_cd_VC(info);
		if (vc == columnRslt_alt_grp_nm) return doRslt_alt_grp_nm_VC(info);
		if (vc == columnRslt_alt_grp_seq) return doRslt_alt_grp_seq_VC(info);
		if (vc == columnRslt_alt_itm_fix_flg) return doRslt_alt_itm_fix_flg_VC(info);
		if (vc == columnRslt_alt_itm_typ) return doRslt_alt_itm_typ_VC(info);
		if (vc == columnRslt_alt_itm_typ_nm) return doRslt_alt_itm_typ_nm_VC(info);
		if (vc == columnRslt_inpt_schd_no) return doRslt_inpt_schd_no_VC(info);
		if (vc == columnRslt_inpt_act_no) return doRslt_inpt_act_no_VC(info);
		if (vc == columnRslt_loss_act_no) return doRslt_loss_act_no_VC(info);
		if (vc == columnRslt_mes_id) return doRslt_mes_id_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_inpt_act_no) return doRslt_ext_inpt_act_no_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_par_base_unit_cd) return doRslt_par_base_unit_cd_VC(info);
		if (vc == columnRslt_par_base_unit_nm) return doRslt_par_base_unit_nm_VC(info);
		if (vc == columnRslt_par_base_unit_dec_place) return doRslt_par_base_unit_dec_place_VC(info);
		if (vc == columnRslt_par_act_lot_no) return doRslt_par_act_lot_no_VC(info);
		if (vc == columnRslt_par_act_sublot_no) return doRslt_par_act_sublot_no_VC(info);
		if (vc == columnRslt_par_inst_lot_no) return doRslt_par_inst_lot_no_VC(info);
		if (vc == columnRslt_par_inst_sublot_no) return doRslt_par_inst_sublot_no_VC(info);
		if (vc == columnRslt_oper_mfg_sts_typ) return doRslt_oper_mfg_sts_typ_VC(info);
		if (vc == columnRslt_oper_mfg_sts_typ_nm) return doRslt_oper_mfg_sts_typ_nm_VC(info);
		if (vc == columnRslt_oper_unit_cd) return doRslt_oper_unit_cd_VC(info);
		if (vc == columnRslt_oper_unit_nm) return doRslt_oper_unit_nm_VC(info);
		if (vc == columnRslt_oper_unit_dec_place) return doRslt_oper_unit_dec_place_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_inpt_ctl_typ) return doRslt_inpt_ctl_typ_VC(info);
		if (vc == columnRslt_inpt_ctl_typ_nm) return doRslt_inpt_ctl_typ_nm_VC(info);
		if (vc == columnRslt_main_itm_flg) return doRslt_main_itm_flg_VC(info);
		if (vc == columnRslt_yield_calc_flg) return doRslt_yield_calc_flg_VC(info);
		if (vc == columnRslt_bkf_upd_flg) return doRslt_bkf_upd_flg_VC(info);
		if (vc == columnRslt_lot_mix_flg) return doRslt_lot_mix_flg_VC(info);
		if (vc == columnRslt_sublot_mix_flg) return doRslt_sublot_mix_flg_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_stk_mng_typ_nm) return doRslt_stk_mng_typ_nm_VC(info);
		if (vc == columnRslt_bkf_typ) return doRslt_bkf_typ_VC(info);
		if (vc == columnRslt_bkf_typ_nm) return doRslt_bkf_typ_nm_VC(info);
		if (vc == columnRslt_alloc_ctl_typ) return doRslt_alloc_ctl_typ_VC(info);
		if (vc == columnRslt_alloc_ctl_typ_nm) return doRslt_alloc_ctl_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_acxfr_act_rsn_cd) return doRslt_acxfr_act_rsn_cd_VC(info);
		if (vc == columnRslt_acxfr_act_rsn_nm) return doRslt_acxfr_act_rsn_nm_VC(info);
		if (vc == columnRslt_acxfr_act_bd_dpt_cd) return doRslt_acxfr_act_bd_dpt_cd_VC(info);
		if (vc == columnRslt_acxfr_act_bd_dpt_nm) return doRslt_acxfr_act_bd_dpt_nm_VC(info);
		if (vc == columnRslt_inpt_schd_intr_rmrks) return doRslt_inpt_schd_intr_rmrks_VC(info);
		if (vc == columnRslt_inpt_schd_inst_rpt_rmrks) return doRslt_inpt_schd_inst_rpt_rmrks_VC(info);
		if (vc == columnRslt_inpt_schd_sub_char1) return doRslt_inpt_schd_sub_char1_VC(info);
		if (vc == columnRslt_inpt_schd_sub_char2) return doRslt_inpt_schd_sub_char2_VC(info);
		if (vc == columnRslt_inpt_schd_sub_char3) return doRslt_inpt_schd_sub_char3_VC(info);
		if (vc == columnRslt_inpt_act_intr_rmrks) return doRslt_inpt_act_intr_rmrks_VC(info);
		if (vc == columnRslt_inpt_act_rpt_rmrks) return doRslt_inpt_act_rpt_rmrks_VC(info);
		if (vc == columnRslt_inpt_act_trd_rmrks) return doRslt_inpt_act_trd_rmrks_VC(info);
		if (vc == columnRslt_inpt_act_sub_char1) return doRslt_inpt_act_sub_char1_VC(info);
		if (vc == columnRslt_inpt_act_sub_char2) return doRslt_inpt_act_sub_char2_VC(info);
		if (vc == columnRslt_inpt_act_sub_char3) return doRslt_inpt_act_sub_char3_VC(info);
		if (vc == columnRslt_loss_act_intr_rmrks) return doRslt_loss_act_intr_rmrks_VC(info);
		if (vc == columnRslt_loss_act_trd_rmrks) return doRslt_loss_act_trd_rmrks_VC(info);
		if (vc == columnRslt_loss_act_sub_char1) return doRslt_loss_act_sub_char1_VC(info);
		if (vc == columnRslt_loss_act_sub_char2) return doRslt_loss_act_sub_char2_VC(info);
		if (vc == columnRslt_loss_act_sub_char3) return doRslt_loss_act_sub_char3_VC(info);
		if (vc == columnRslt_mfg_act_rpt_rmrks) return doRslt_mfg_act_rpt_rmrks_VC(info);
		if (vc == columnRslt_mfg_act_intr_rmrks) return doRslt_mfg_act_intr_rmrks_VC(info);
		if (vc == columnRslt_mfg_act_sub_char1) return doRslt_mfg_act_sub_char1_VC(info);
		if (vc == columnRslt_mfg_act_sub_char2) return doRslt_mfg_act_sub_char2_VC(info);
		if (vc == columnRslt_mfg_act_sub_char3) return doRslt_mfg_act_sub_char3_VC(info);
		if (vc == columnRslt_oper_act_intr_rmrks) return doRslt_oper_act_intr_rmrks_VC(info);
		if (vc == columnRslt_oper_act_rpt_rmrks) return doRslt_oper_act_rpt_rmrks_VC(info);
		if (vc == columnRslt_oper_act_sub_char1) return doRslt_oper_act_sub_char1_VC(info);
		if (vc == columnRslt_oper_act_sub_char2) return doRslt_oper_act_sub_char2_VC(info);
		if (vc == columnRslt_oper_act_sub_char3) return doRslt_oper_act_sub_char3_VC(info);
		if (vc == columnRslt_itm_yield) return doRslt_itm_yield_VC(info);
		if (vc == columnRslt_itm_lower_yield) return doRslt_itm_lower_yield_VC(info);
		if (vc == columnRslt_itm_std_yield) return doRslt_itm_std_yield_VC(info);
		if (vc == columnRslt_itm_upper_yield) return doRslt_itm_upper_yield_VC(info);
		if (vc == columnRslt_oper_yield) return doRslt_oper_yield_VC(info);
		if (vc == columnRslt_oper_lower_yield) return doRslt_oper_lower_yield_VC(info);
		if (vc == columnRslt_oper_std_yield) return doRslt_oper_std_yield_VC(info);
		if (vc == columnRslt_oper_upper_yield) return doRslt_oper_upper_yield_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_mfg_str_ln_cd) return doRslt_mfg_str_ln_cd_VC(info);
		if (vc == columnRslt_mfg_str_ln_nm) return doRslt_mfg_str_ln_nm_VC(info);
		if (vc == columnRslt_mfg_str_ln_cd_none_flg) return doRslt_mfg_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_oper_loc_cd) return doRslt_oper_loc_cd_VC(info);
		if (vc == columnRslt_oper_loc_nm) return doRslt_oper_loc_nm_VC(info);
		if (vc == columnRslt_oper_str_ln_cd) return doRslt_oper_str_ln_cd_VC(info);
		if (vc == columnRslt_oper_str_ln_nm) return doRslt_oper_str_ln_nm_VC(info);
		if (vc == columnRslt_oper_str_ln_cd_none_flg) return doRslt_oper_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_mfg_loc_grp_cd) return doRslt_mfg_loc_grp_cd_VC(info);
		if (vc == columnRslt_mfg_loc_grp_nm) return doRslt_mfg_loc_grp_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_oper_ptn) return doRslt_oper_ptn_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_div_seq) return doRslt_div_seq_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_mfg_act_no) return doRslt_mfg_act_no_VC(info);
		if (vc == columnRslt_oper_inst_no) return doRslt_oper_inst_no_VC(info);
		if (vc == columnRslt_oper_act_no) return doRslt_oper_act_no_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_oper_disp_seq) return doRslt_oper_disp_seq_VC(info);
		if (vc == columnRslt_oper_usr_cd) return doRslt_oper_usr_cd_VC(info);
		if (vc == columnRslt_oper_usr_nm) return doRslt_oper_usr_nm_VC(info);
		if (vc == columnRslt_chd_itm_typ) return doRslt_chd_itm_typ_VC(info);
		if (vc == columnRslt_chd_itm_typ_nm) return doRslt_chd_itm_typ_nm_VC(info);
		if (vc == columnRslt_chd_itm_typ_d_cd) return doRslt_chd_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_chd_itm_typ_d_nm) return doRslt_chd_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_par_itm_typ) return doRslt_par_itm_typ_VC(info);
		if (vc == columnRslt_par_itm_typ_nm) return doRslt_par_itm_typ_nm_VC(info);
		if (vc == columnRslt_par_itm_typ_d_cd) return doRslt_par_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_par_itm_typ_d_nm) return doRslt_par_itm_typ_d_nm_VC(info);
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
	 * [Cnd]パネルの[srch_mode1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_mode1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_mode2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_mode2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_ord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_stt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_stt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_stt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_no_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_no_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bkf_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bkf_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bkf_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bkf_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pr_rate_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pr_rate_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pr_rate_inc_loss_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pr_rate_inc_loss_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_alloc_srch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_alloc_srch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loss_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loss_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loss_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loss_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_ord_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loss_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loss_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mes_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mes_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_inpt_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_inpt_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_schd_inst_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_inst_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_mfg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_mfg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_abort_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mes_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mes_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_inpt_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_inpt_act_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[par_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_act_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_act_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_act_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_act_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_inst_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_inst_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_inst_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_inst_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_mfg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_mfg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[main_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_main_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bkf_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bkf_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bkf_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bkf_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bkf_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bkf_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_schd_inst_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_inst_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_act_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_act_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loss_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_upper_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_upper_yield_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[div_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_div_seq_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_d_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_srch_mode1_Group) doCnd_srch_mode1_NC(info);
		else if (nc == Cnd_srch_mode2_Group) doCnd_srch_mode2_NC(info);
		else if (nc == Cnd_oper_sav_flg) doCnd_oper_sav_flg_NC(info);
		else if (nc == Cnd_oper_ord_flg) doCnd_oper_ord_flg_NC(info);
		else if (nc == Cnd_oper_stt_flg) doCnd_oper_stt_flg_NC(info);
		else if (nc == Cnd_oper_cmpl_flg) doCnd_oper_cmpl_flg_NC(info);
		else if (nc == Cnd_inpt_sav_flg) doCnd_inpt_sav_flg_NC(info);
		else if (nc == Cnd_inpt_ord_flg) doCnd_inpt_ord_flg_NC(info);
		else if (nc == Cnd_inpt_stt_flg) doCnd_inpt_stt_flg_NC(info);
		else if (nc == Cnd_inpt_cmpl_flg) doCnd_inpt_cmpl_flg_NC(info);
		else if (nc == Cnd_inpt_no_schd_flg) doCnd_inpt_no_schd_flg_NC(info);
		else if (nc == Cnd_inpt_ac_dt_fr) doCnd_inpt_ac_dt_fr_NC(info);
		else if (nc == Cnd_inpt_ac_dt_to) doCnd_inpt_ac_dt_to_NC(info);
		else if (nc == Cnd_bkf_typ) doCnd_bkf_typ_NC(info);
		else if (nc == Cnd_bkf_typ_nm) doCnd_bkf_typ_nm_NC(info);
		else if (nc == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NC(info);
		else if (nc == Cnd_pr_rate_to) doCnd_pr_rate_to_NC(info);
		else if (nc == Cnd_pr_rate_inc_loss_flg) doCnd_pr_rate_inc_loss_flg_NC(info);
		else if (nc == Cnd_not_alloc_srch_flg) doCnd_not_alloc_srch_flg_NC(info);
		else if (nc == Cnd_yield_calc_flg) doCnd_yield_calc_flg_NC(info);
		else if (nc == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_NC(info);
		else if (nc == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_NC(info);
		else if (nc == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_NC(info);
		else if (nc == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_NC(info);
		else if (nc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NC(info);
		else if (nc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NC(info);
		else if (nc == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NC(info);
		else if (nc == Cnd_inpt_loc_cd) doCnd_inpt_loc_cd_NC(info);
		else if (nc == Cnd_inpt_loc_nm) doCnd_inpt_loc_nm_NC(info);
		else if (nc == Cnd_inpt_str_ln_cd) doCnd_inpt_str_ln_cd_NC(info);
		else if (nc == Cnd_inpt_str_ln_nm) doCnd_inpt_str_ln_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_oper_loc_cd) doCnd_oper_loc_cd_NC(info);
		else if (nc == Cnd_oper_loc_nm) doCnd_oper_loc_nm_NC(info);
		else if (nc == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_NC(info);
		else if (nc == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_NC(info);
		else if (nc == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_NC(info);
		else if (nc == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_NC(info);
		else if (nc == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_NC(info);
		else if (nc == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_NC(info);
		else if (nc == Cnd_chd_lot_no) doCnd_chd_lot_no_NC(info);
		else if (nc == Cnd_chd_sublot_no) doCnd_chd_sublot_no_NC(info);
		else if (nc == Cnd_loss_rsn_cd) doCnd_loss_rsn_cd_NC(info);
		else if (nc == Cnd_loss_rsn_nm) doCnd_loss_rsn_nm_NC(info);
		else if (nc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NC(info);
		else if (nc == Cnd_inpt_rsn_cd) doCnd_inpt_rsn_cd_NC(info);
		else if (nc == Cnd_inpt_rsn_nm) doCnd_inpt_rsn_nm_NC(info);
		else if (nc == Cnd_oper_usr_cd) doCnd_oper_usr_cd_NC(info);
		else if (nc == Cnd_oper_usr_nm) doCnd_oper_usr_nm_NC(info);
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_oper_inst_no) doCnd_oper_inst_no_NC(info);
		else if (nc == Cnd_mfg_act_no) doCnd_mfg_act_no_NC(info);
		else if (nc == Cnd_oper_act_no) doCnd_oper_act_no_NC(info);
		else if (nc == Cnd_inpt_schd_no) doCnd_inpt_schd_no_NC(info);
		else if (nc == Cnd_inpt_act_no) doCnd_inpt_act_no_NC(info);
		else if (nc == Cnd_loss_act_no) doCnd_loss_act_no_NC(info);
		else if (nc == Cnd_mes_id) doCnd_mes_id_NC(info);
		else if (nc == Cnd_data_no) doCnd_data_no_NC(info);
		else if (nc == Cnd_ext_inpt_act_no) doCnd_ext_inpt_act_no_NC(info);
		else if (nc == Cnd_inpt_schd_inst_rpt_rmrks) doCnd_inpt_schd_inst_rpt_rmrks_NC(info);
		else if (nc == Cnd_inpt_schd_intr_rmrks) doCnd_inpt_schd_intr_rmrks_NC(info);
		else if (nc == Cnd_inpt_schd_sub_char1) doCnd_inpt_schd_sub_char1_NC(info);
		else if (nc == Cnd_inpt_schd_sub_char2) doCnd_inpt_schd_sub_char2_NC(info);
		else if (nc == Cnd_inpt_schd_sub_char3) doCnd_inpt_schd_sub_char3_NC(info);
		else if (nc == Cnd_inpt_act_rpt_rmrks) doCnd_inpt_act_rpt_rmrks_NC(info);
		else if (nc == Cnd_inpt_act_intr_rmrks) doCnd_inpt_act_intr_rmrks_NC(info);
		else if (nc == Cnd_inpt_act_trd_rmrks) doCnd_inpt_act_trd_rmrks_NC(info);
		else if (nc == Cnd_inpt_act_sub_char1) doCnd_inpt_act_sub_char1_NC(info);
		else if (nc == Cnd_inpt_act_sub_char2) doCnd_inpt_act_sub_char2_NC(info);
		else if (nc == Cnd_inpt_act_sub_char3) doCnd_inpt_act_sub_char3_NC(info);
		else if (nc == Cnd_mfg_act_rpt_rmrks) doCnd_mfg_act_rpt_rmrks_NC(info);
		else if (nc == Cnd_mfg_act_intr_rmrks) doCnd_mfg_act_intr_rmrks_NC(info);
		else if (nc == Cnd_mfg_act_sub_char1) doCnd_mfg_act_sub_char1_NC(info);
		else if (nc == Cnd_mfg_act_sub_char2) doCnd_mfg_act_sub_char2_NC(info);
		else if (nc == Cnd_mfg_act_sub_char3) doCnd_mfg_act_sub_char3_NC(info);
		else if (nc == Cnd_oper_act_intr_rmrks) doCnd_oper_act_intr_rmrks_NC(info);
		else if (nc == Cnd_oper_act_rpt_rmrks) doCnd_oper_act_rpt_rmrks_NC(info);
		else if (nc == Cnd_oper_act_sub_char1) doCnd_oper_act_sub_char1_NC(info);
		else if (nc == Cnd_oper_act_sub_char2) doCnd_oper_act_sub_char2_NC(info);
		else if (nc == Cnd_oper_act_sub_char3) doCnd_oper_act_sub_char3_NC(info);
		else if (nc == columnRslt_inpt_mfg_sts_typ) doRslt_inpt_mfg_sts_typ_NC(info);
		else if (nc == columnRslt_inpt_mfg_sts_typ_nm) doRslt_inpt_mfg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_NC(info);
		else if (nc == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_loss_rsn_cd) doRslt_loss_rsn_cd_NC(info);
		else if (nc == columnRslt_loss_rsn_nm) doRslt_loss_rsn_nm_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_schd_abort_flg) doRslt_schd_abort_flg_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_pr_rate) doRslt_pr_rate_NC(info);
		else if (nc == columnRslt_inst_lot_no) doRslt_inst_lot_no_NC(info);
		else if (nc == columnRslt_inst_sublot_no) doRslt_inst_sublot_no_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_inpt_rsn_cd) doRslt_inpt_rsn_cd_NC(info);
		else if (nc == columnRslt_inpt_rsn_nm) doRslt_inpt_rsn_nm_NC(info);
		else if (nc == columnRslt_inpt_loc_cd) doRslt_inpt_loc_cd_NC(info);
		else if (nc == columnRslt_inpt_loc_nm) doRslt_inpt_loc_nm_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_prov_typ) doRslt_prov_typ_NC(info);
		else if (nc == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NC(info);
		else if (nc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NC(info);
		else if (nc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NC(info);
		else if (nc == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NC(info);
		else if (nc == columnRslt_alt_itm_fix_flg) doRslt_alt_itm_fix_flg_NC(info);
		else if (nc == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NC(info);
		else if (nc == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_NC(info);
		else if (nc == columnRslt_inpt_act_no) doRslt_inpt_act_no_NC(info);
		else if (nc == columnRslt_loss_act_no) doRslt_loss_act_no_NC(info);
		else if (nc == columnRslt_mes_id) doRslt_mes_id_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_inpt_act_no) doRslt_ext_inpt_act_no_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_par_base_unit_cd) doRslt_par_base_unit_cd_NC(info);
		else if (nc == columnRslt_par_base_unit_nm) doRslt_par_base_unit_nm_NC(info);
		else if (nc == columnRslt_par_base_unit_dec_place) doRslt_par_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_par_act_lot_no) doRslt_par_act_lot_no_NC(info);
		else if (nc == columnRslt_par_act_sublot_no) doRslt_par_act_sublot_no_NC(info);
		else if (nc == columnRslt_par_inst_lot_no) doRslt_par_inst_lot_no_NC(info);
		else if (nc == columnRslt_par_inst_sublot_no) doRslt_par_inst_sublot_no_NC(info);
		else if (nc == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_NC(info);
		else if (nc == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NC(info);
		else if (nc == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NC(info);
		else if (nc == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NC(info);
		else if (nc == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NC(info);
		else if (nc == columnRslt_main_itm_flg) doRslt_main_itm_flg_NC(info);
		else if (nc == columnRslt_yield_calc_flg) doRslt_yield_calc_flg_NC(info);
		else if (nc == columnRslt_bkf_upd_flg) doRslt_bkf_upd_flg_NC(info);
		else if (nc == columnRslt_lot_mix_flg) doRslt_lot_mix_flg_NC(info);
		else if (nc == columnRslt_sublot_mix_flg) doRslt_sublot_mix_flg_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NC(info);
		else if (nc == columnRslt_bkf_typ) doRslt_bkf_typ_NC(info);
		else if (nc == columnRslt_bkf_typ_nm) doRslt_bkf_typ_nm_NC(info);
		else if (nc == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NC(info);
		else if (nc == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_acxfr_act_rsn_cd) doRslt_acxfr_act_rsn_cd_NC(info);
		else if (nc == columnRslt_acxfr_act_rsn_nm) doRslt_acxfr_act_rsn_nm_NC(info);
		else if (nc == columnRslt_acxfr_act_bd_dpt_cd) doRslt_acxfr_act_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_acxfr_act_bd_dpt_nm) doRslt_acxfr_act_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_inpt_schd_intr_rmrks) doRslt_inpt_schd_intr_rmrks_NC(info);
		else if (nc == columnRslt_inpt_schd_inst_rpt_rmrks) doRslt_inpt_schd_inst_rpt_rmrks_NC(info);
		else if (nc == columnRslt_inpt_schd_sub_char1) doRslt_inpt_schd_sub_char1_NC(info);
		else if (nc == columnRslt_inpt_schd_sub_char2) doRslt_inpt_schd_sub_char2_NC(info);
		else if (nc == columnRslt_inpt_schd_sub_char3) doRslt_inpt_schd_sub_char3_NC(info);
		else if (nc == columnRslt_inpt_act_intr_rmrks) doRslt_inpt_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_inpt_act_rpt_rmrks) doRslt_inpt_act_rpt_rmrks_NC(info);
		else if (nc == columnRslt_inpt_act_trd_rmrks) doRslt_inpt_act_trd_rmrks_NC(info);
		else if (nc == columnRslt_inpt_act_sub_char1) doRslt_inpt_act_sub_char1_NC(info);
		else if (nc == columnRslt_inpt_act_sub_char2) doRslt_inpt_act_sub_char2_NC(info);
		else if (nc == columnRslt_inpt_act_sub_char3) doRslt_inpt_act_sub_char3_NC(info);
		else if (nc == columnRslt_loss_act_intr_rmrks) doRslt_loss_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_loss_act_trd_rmrks) doRslt_loss_act_trd_rmrks_NC(info);
		else if (nc == columnRslt_loss_act_sub_char1) doRslt_loss_act_sub_char1_NC(info);
		else if (nc == columnRslt_loss_act_sub_char2) doRslt_loss_act_sub_char2_NC(info);
		else if (nc == columnRslt_loss_act_sub_char3) doRslt_loss_act_sub_char3_NC(info);
		else if (nc == columnRslt_mfg_act_rpt_rmrks) doRslt_mfg_act_rpt_rmrks_NC(info);
		else if (nc == columnRslt_mfg_act_intr_rmrks) doRslt_mfg_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_mfg_act_sub_char1) doRslt_mfg_act_sub_char1_NC(info);
		else if (nc == columnRslt_mfg_act_sub_char2) doRslt_mfg_act_sub_char2_NC(info);
		else if (nc == columnRslt_mfg_act_sub_char3) doRslt_mfg_act_sub_char3_NC(info);
		else if (nc == columnRslt_oper_act_intr_rmrks) doRslt_oper_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_oper_act_rpt_rmrks) doRslt_oper_act_rpt_rmrks_NC(info);
		else if (nc == columnRslt_oper_act_sub_char1) doRslt_oper_act_sub_char1_NC(info);
		else if (nc == columnRslt_oper_act_sub_char2) doRslt_oper_act_sub_char2_NC(info);
		else if (nc == columnRslt_oper_act_sub_char3) doRslt_oper_act_sub_char3_NC(info);
		else if (nc == columnRslt_itm_yield) doRslt_itm_yield_NC(info);
		else if (nc == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_NC(info);
		else if (nc == columnRslt_itm_std_yield) doRslt_itm_std_yield_NC(info);
		else if (nc == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_NC(info);
		else if (nc == columnRslt_oper_yield) doRslt_oper_yield_NC(info);
		else if (nc == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_NC(info);
		else if (nc == columnRslt_oper_std_yield) doRslt_oper_std_yield_NC(info);
		else if (nc == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NC(info);
		else if (nc == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NC(info);
		else if (nc == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_NC(info);
		else if (nc == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_NC(info);
		else if (nc == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_NC(info);
		else if (nc == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_NC(info);
		else if (nc == columnRslt_oper_str_ln_cd_none_flg) doRslt_oper_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_oper_ptn) doRslt_oper_ptn_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_div_seq) doRslt_div_seq_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_mfg_act_no) doRslt_mfg_act_no_NC(info);
		else if (nc == columnRslt_oper_inst_no) doRslt_oper_inst_no_NC(info);
		else if (nc == columnRslt_oper_act_no) doRslt_oper_act_no_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_NC(info);
		else if (nc == columnRslt_oper_usr_cd) doRslt_oper_usr_cd_NC(info);
		else if (nc == columnRslt_oper_usr_nm) doRslt_oper_usr_nm_NC(info);
		else if (nc == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NC(info);
		else if (nc == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NC(info);
		else if (nc == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_par_itm_typ) doRslt_par_itm_typ_NC(info);
		else if (nc == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_NC(info);
		else if (nc == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_NC(info);
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
	 * [Cnd]パネルの[srch_mode1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_mode2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_stt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_stt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_stt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_no_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_no_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_inc_loss_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_inc_loss_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_srch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_srch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_inpt_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_inpt_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_inst_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_inst_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_abort_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_inpt_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_inpt_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[main_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_main_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_inst_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_inst_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_srch_mode1_Group) doCnd_srch_mode1_NE(info);
		else if (ne == Cnd_srch_mode2_Group) doCnd_srch_mode2_NE(info);
		else if (ne == Cnd_oper_sav_flg) doCnd_oper_sav_flg_NE(info);
		else if (ne == Cnd_oper_ord_flg) doCnd_oper_ord_flg_NE(info);
		else if (ne == Cnd_oper_stt_flg) doCnd_oper_stt_flg_NE(info);
		else if (ne == Cnd_oper_cmpl_flg) doCnd_oper_cmpl_flg_NE(info);
		else if (ne == Cnd_inpt_sav_flg) doCnd_inpt_sav_flg_NE(info);
		else if (ne == Cnd_inpt_ord_flg) doCnd_inpt_ord_flg_NE(info);
		else if (ne == Cnd_inpt_stt_flg) doCnd_inpt_stt_flg_NE(info);
		else if (ne == Cnd_inpt_cmpl_flg) doCnd_inpt_cmpl_flg_NE(info);
		else if (ne == Cnd_inpt_no_schd_flg) doCnd_inpt_no_schd_flg_NE(info);
		else if (ne == Cnd_inpt_ac_dt_fr) doCnd_inpt_ac_dt_fr_NE(info);
		else if (ne == Cnd_inpt_ac_dt_to) doCnd_inpt_ac_dt_to_NE(info);
		else if (ne == Cnd_bkf_typ) doCnd_bkf_typ_NE(info);
		else if (ne == Cnd_bkf_typ_nm) doCnd_bkf_typ_nm_NE(info);
		else if (ne == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NE(info);
		else if (ne == Cnd_pr_rate_to) doCnd_pr_rate_to_NE(info);
		else if (ne == Cnd_pr_rate_inc_loss_flg) doCnd_pr_rate_inc_loss_flg_NE(info);
		else if (ne == Cnd_not_alloc_srch_flg) doCnd_not_alloc_srch_flg_NE(info);
		else if (ne == Cnd_yield_calc_flg) doCnd_yield_calc_flg_NE(info);
		else if (ne == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_NE(info);
		else if (ne == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_NE(info);
		else if (ne == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_NE(info);
		else if (ne == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_NE(info);
		else if (ne == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NE(info);
		else if (ne == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NE(info);
		else if (ne == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NE(info);
		else if (ne == Cnd_inpt_loc_cd) doCnd_inpt_loc_cd_NE(info);
		else if (ne == Cnd_inpt_loc_nm) doCnd_inpt_loc_nm_NE(info);
		else if (ne == Cnd_inpt_str_ln_cd) doCnd_inpt_str_ln_cd_NE(info);
		else if (ne == Cnd_inpt_str_ln_nm) doCnd_inpt_str_ln_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_oper_loc_cd) doCnd_oper_loc_cd_NE(info);
		else if (ne == Cnd_oper_loc_nm) doCnd_oper_loc_nm_NE(info);
		else if (ne == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_NE(info);
		else if (ne == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_NE(info);
		else if (ne == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_NE(info);
		else if (ne == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_NE(info);
		else if (ne == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_NE(info);
		else if (ne == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_NE(info);
		else if (ne == Cnd_chd_lot_no) doCnd_chd_lot_no_NE(info);
		else if (ne == Cnd_chd_sublot_no) doCnd_chd_sublot_no_NE(info);
		else if (ne == Cnd_loss_rsn_cd) doCnd_loss_rsn_cd_NE(info);
		else if (ne == Cnd_loss_rsn_nm) doCnd_loss_rsn_nm_NE(info);
		else if (ne == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NE(info);
		else if (ne == Cnd_inpt_rsn_cd) doCnd_inpt_rsn_cd_NE(info);
		else if (ne == Cnd_inpt_rsn_nm) doCnd_inpt_rsn_nm_NE(info);
		else if (ne == Cnd_oper_usr_cd) doCnd_oper_usr_cd_NE(info);
		else if (ne == Cnd_oper_usr_nm) doCnd_oper_usr_nm_NE(info);
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_oper_inst_no) doCnd_oper_inst_no_NE(info);
		else if (ne == Cnd_mfg_act_no) doCnd_mfg_act_no_NE(info);
		else if (ne == Cnd_oper_act_no) doCnd_oper_act_no_NE(info);
		else if (ne == Cnd_inpt_schd_no) doCnd_inpt_schd_no_NE(info);
		else if (ne == Cnd_inpt_act_no) doCnd_inpt_act_no_NE(info);
		else if (ne == Cnd_loss_act_no) doCnd_loss_act_no_NE(info);
		else if (ne == Cnd_mes_id) doCnd_mes_id_NE(info);
		else if (ne == Cnd_data_no) doCnd_data_no_NE(info);
		else if (ne == Cnd_ext_inpt_act_no) doCnd_ext_inpt_act_no_NE(info);
		else if (ne == Cnd_inpt_schd_inst_rpt_rmrks) doCnd_inpt_schd_inst_rpt_rmrks_NE(info);
		else if (ne == Cnd_inpt_schd_intr_rmrks) doCnd_inpt_schd_intr_rmrks_NE(info);
		else if (ne == Cnd_inpt_schd_sub_char1) doCnd_inpt_schd_sub_char1_NE(info);
		else if (ne == Cnd_inpt_schd_sub_char2) doCnd_inpt_schd_sub_char2_NE(info);
		else if (ne == Cnd_inpt_schd_sub_char3) doCnd_inpt_schd_sub_char3_NE(info);
		else if (ne == Cnd_inpt_act_rpt_rmrks) doCnd_inpt_act_rpt_rmrks_NE(info);
		else if (ne == Cnd_inpt_act_intr_rmrks) doCnd_inpt_act_intr_rmrks_NE(info);
		else if (ne == Cnd_inpt_act_trd_rmrks) doCnd_inpt_act_trd_rmrks_NE(info);
		else if (ne == Cnd_inpt_act_sub_char1) doCnd_inpt_act_sub_char1_NE(info);
		else if (ne == Cnd_inpt_act_sub_char2) doCnd_inpt_act_sub_char2_NE(info);
		else if (ne == Cnd_inpt_act_sub_char3) doCnd_inpt_act_sub_char3_NE(info);
		else if (ne == Cnd_mfg_act_rpt_rmrks) doCnd_mfg_act_rpt_rmrks_NE(info);
		else if (ne == Cnd_mfg_act_intr_rmrks) doCnd_mfg_act_intr_rmrks_NE(info);
		else if (ne == Cnd_mfg_act_sub_char1) doCnd_mfg_act_sub_char1_NE(info);
		else if (ne == Cnd_mfg_act_sub_char2) doCnd_mfg_act_sub_char2_NE(info);
		else if (ne == Cnd_mfg_act_sub_char3) doCnd_mfg_act_sub_char3_NE(info);
		else if (ne == Cnd_oper_act_intr_rmrks) doCnd_oper_act_intr_rmrks_NE(info);
		else if (ne == Cnd_oper_act_rpt_rmrks) doCnd_oper_act_rpt_rmrks_NE(info);
		else if (ne == Cnd_oper_act_sub_char1) doCnd_oper_act_sub_char1_NE(info);
		else if (ne == Cnd_oper_act_sub_char2) doCnd_oper_act_sub_char2_NE(info);
		else if (ne == Cnd_oper_act_sub_char3) doCnd_oper_act_sub_char3_NE(info);
		else if (ne == columnRslt_inpt_mfg_sts_typ) doRslt_inpt_mfg_sts_typ_NE(info);
		else if (ne == columnRslt_inpt_mfg_sts_typ_nm) doRslt_inpt_mfg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_NE(info);
		else if (ne == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_loss_rsn_cd) doRslt_loss_rsn_cd_NE(info);
		else if (ne == columnRslt_loss_rsn_nm) doRslt_loss_rsn_nm_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_schd_abort_flg) doRslt_schd_abort_flg_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_pr_rate) doRslt_pr_rate_NE(info);
		else if (ne == columnRslt_inst_lot_no) doRslt_inst_lot_no_NE(info);
		else if (ne == columnRslt_inst_sublot_no) doRslt_inst_sublot_no_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_inpt_rsn_cd) doRslt_inpt_rsn_cd_NE(info);
		else if (ne == columnRslt_inpt_rsn_nm) doRslt_inpt_rsn_nm_NE(info);
		else if (ne == columnRslt_inpt_loc_cd) doRslt_inpt_loc_cd_NE(info);
		else if (ne == columnRslt_inpt_loc_nm) doRslt_inpt_loc_nm_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_prov_typ) doRslt_prov_typ_NE(info);
		else if (ne == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NE(info);
		else if (ne == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NE(info);
		else if (ne == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NE(info);
		else if (ne == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NE(info);
		else if (ne == columnRslt_alt_itm_fix_flg) doRslt_alt_itm_fix_flg_NE(info);
		else if (ne == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NE(info);
		else if (ne == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_NE(info);
		else if (ne == columnRslt_inpt_act_no) doRslt_inpt_act_no_NE(info);
		else if (ne == columnRslt_loss_act_no) doRslt_loss_act_no_NE(info);
		else if (ne == columnRslt_mes_id) doRslt_mes_id_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_inpt_act_no) doRslt_ext_inpt_act_no_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_par_base_unit_cd) doRslt_par_base_unit_cd_NE(info);
		else if (ne == columnRslt_par_base_unit_nm) doRslt_par_base_unit_nm_NE(info);
		else if (ne == columnRslt_par_base_unit_dec_place) doRslt_par_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_par_act_lot_no) doRslt_par_act_lot_no_NE(info);
		else if (ne == columnRslt_par_act_sublot_no) doRslt_par_act_sublot_no_NE(info);
		else if (ne == columnRslt_par_inst_lot_no) doRslt_par_inst_lot_no_NE(info);
		else if (ne == columnRslt_par_inst_sublot_no) doRslt_par_inst_sublot_no_NE(info);
		else if (ne == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_NE(info);
		else if (ne == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NE(info);
		else if (ne == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NE(info);
		else if (ne == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NE(info);
		else if (ne == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NE(info);
		else if (ne == columnRslt_main_itm_flg) doRslt_main_itm_flg_NE(info);
		else if (ne == columnRslt_yield_calc_flg) doRslt_yield_calc_flg_NE(info);
		else if (ne == columnRslt_bkf_upd_flg) doRslt_bkf_upd_flg_NE(info);
		else if (ne == columnRslt_lot_mix_flg) doRslt_lot_mix_flg_NE(info);
		else if (ne == columnRslt_sublot_mix_flg) doRslt_sublot_mix_flg_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NE(info);
		else if (ne == columnRslt_bkf_typ) doRslt_bkf_typ_NE(info);
		else if (ne == columnRslt_bkf_typ_nm) doRslt_bkf_typ_nm_NE(info);
		else if (ne == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NE(info);
		else if (ne == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_acxfr_act_rsn_cd) doRslt_acxfr_act_rsn_cd_NE(info);
		else if (ne == columnRslt_acxfr_act_rsn_nm) doRslt_acxfr_act_rsn_nm_NE(info);
		else if (ne == columnRslt_acxfr_act_bd_dpt_cd) doRslt_acxfr_act_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_acxfr_act_bd_dpt_nm) doRslt_acxfr_act_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_inpt_schd_intr_rmrks) doRslt_inpt_schd_intr_rmrks_NE(info);
		else if (ne == columnRslt_inpt_schd_inst_rpt_rmrks) doRslt_inpt_schd_inst_rpt_rmrks_NE(info);
		else if (ne == columnRslt_inpt_schd_sub_char1) doRslt_inpt_schd_sub_char1_NE(info);
		else if (ne == columnRslt_inpt_schd_sub_char2) doRslt_inpt_schd_sub_char2_NE(info);
		else if (ne == columnRslt_inpt_schd_sub_char3) doRslt_inpt_schd_sub_char3_NE(info);
		else if (ne == columnRslt_inpt_act_intr_rmrks) doRslt_inpt_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_inpt_act_rpt_rmrks) doRslt_inpt_act_rpt_rmrks_NE(info);
		else if (ne == columnRslt_inpt_act_trd_rmrks) doRslt_inpt_act_trd_rmrks_NE(info);
		else if (ne == columnRslt_inpt_act_sub_char1) doRslt_inpt_act_sub_char1_NE(info);
		else if (ne == columnRslt_inpt_act_sub_char2) doRslt_inpt_act_sub_char2_NE(info);
		else if (ne == columnRslt_inpt_act_sub_char3) doRslt_inpt_act_sub_char3_NE(info);
		else if (ne == columnRslt_loss_act_intr_rmrks) doRslt_loss_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_loss_act_trd_rmrks) doRslt_loss_act_trd_rmrks_NE(info);
		else if (ne == columnRslt_loss_act_sub_char1) doRslt_loss_act_sub_char1_NE(info);
		else if (ne == columnRslt_loss_act_sub_char2) doRslt_loss_act_sub_char2_NE(info);
		else if (ne == columnRslt_loss_act_sub_char3) doRslt_loss_act_sub_char3_NE(info);
		else if (ne == columnRslt_mfg_act_rpt_rmrks) doRslt_mfg_act_rpt_rmrks_NE(info);
		else if (ne == columnRslt_mfg_act_intr_rmrks) doRslt_mfg_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_mfg_act_sub_char1) doRslt_mfg_act_sub_char1_NE(info);
		else if (ne == columnRslt_mfg_act_sub_char2) doRslt_mfg_act_sub_char2_NE(info);
		else if (ne == columnRslt_mfg_act_sub_char3) doRslt_mfg_act_sub_char3_NE(info);
		else if (ne == columnRslt_oper_act_intr_rmrks) doRslt_oper_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_oper_act_rpt_rmrks) doRslt_oper_act_rpt_rmrks_NE(info);
		else if (ne == columnRslt_oper_act_sub_char1) doRslt_oper_act_sub_char1_NE(info);
		else if (ne == columnRslt_oper_act_sub_char2) doRslt_oper_act_sub_char2_NE(info);
		else if (ne == columnRslt_oper_act_sub_char3) doRslt_oper_act_sub_char3_NE(info);
		else if (ne == columnRslt_itm_yield) doRslt_itm_yield_NE(info);
		else if (ne == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_NE(info);
		else if (ne == columnRslt_itm_std_yield) doRslt_itm_std_yield_NE(info);
		else if (ne == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_NE(info);
		else if (ne == columnRslt_oper_yield) doRslt_oper_yield_NE(info);
		else if (ne == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_NE(info);
		else if (ne == columnRslt_oper_std_yield) doRslt_oper_std_yield_NE(info);
		else if (ne == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NE(info);
		else if (ne == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NE(info);
		else if (ne == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_NE(info);
		else if (ne == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_NE(info);
		else if (ne == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_NE(info);
		else if (ne == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_NE(info);
		else if (ne == columnRslt_oper_str_ln_cd_none_flg) doRslt_oper_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_oper_ptn) doRslt_oper_ptn_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_div_seq) doRslt_div_seq_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_mfg_act_no) doRslt_mfg_act_no_NE(info);
		else if (ne == columnRslt_oper_inst_no) doRslt_oper_inst_no_NE(info);
		else if (ne == columnRslt_oper_act_no) doRslt_oper_act_no_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_NE(info);
		else if (ne == columnRslt_oper_usr_cd) doRslt_oper_usr_cd_NE(info);
		else if (ne == columnRslt_oper_usr_nm) doRslt_oper_usr_nm_NE(info);
		else if (ne == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NE(info);
		else if (ne == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NE(info);
		else if (ne == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_par_itm_typ) doRslt_par_itm_typ_NE(info);
		else if (ne == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_NE(info);
		else if (ne == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_NE(info);
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
	 * [Cnd]パネルの[srch_mode1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_mode2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_stt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_stt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_stt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_no_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_no_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_inc_loss_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_inc_loss_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_srch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_srch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_inpt_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_inpt_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_inst_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_inst_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_abort_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_inpt_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_inpt_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[main_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_main_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_inst_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_inst_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_srch_mode1_Group) doCnd_srch_mode1_NX(info);
		else if (nx == Cnd_srch_mode2_Group) doCnd_srch_mode2_NX(info);
		else if (nx == Cnd_oper_sav_flg) doCnd_oper_sav_flg_NX(info);
		else if (nx == Cnd_oper_ord_flg) doCnd_oper_ord_flg_NX(info);
		else if (nx == Cnd_oper_stt_flg) doCnd_oper_stt_flg_NX(info);
		else if (nx == Cnd_oper_cmpl_flg) doCnd_oper_cmpl_flg_NX(info);
		else if (nx == Cnd_inpt_sav_flg) doCnd_inpt_sav_flg_NX(info);
		else if (nx == Cnd_inpt_ord_flg) doCnd_inpt_ord_flg_NX(info);
		else if (nx == Cnd_inpt_stt_flg) doCnd_inpt_stt_flg_NX(info);
		else if (nx == Cnd_inpt_cmpl_flg) doCnd_inpt_cmpl_flg_NX(info);
		else if (nx == Cnd_inpt_no_schd_flg) doCnd_inpt_no_schd_flg_NX(info);
		else if (nx == Cnd_inpt_ac_dt_fr) doCnd_inpt_ac_dt_fr_NX(info);
		else if (nx == Cnd_inpt_ac_dt_to) doCnd_inpt_ac_dt_to_NX(info);
		else if (nx == Cnd_bkf_typ) doCnd_bkf_typ_NX(info);
		else if (nx == Cnd_bkf_typ_nm) doCnd_bkf_typ_nm_NX(info);
		else if (nx == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NX(info);
		else if (nx == Cnd_pr_rate_to) doCnd_pr_rate_to_NX(info);
		else if (nx == Cnd_pr_rate_inc_loss_flg) doCnd_pr_rate_inc_loss_flg_NX(info);
		else if (nx == Cnd_not_alloc_srch_flg) doCnd_not_alloc_srch_flg_NX(info);
		else if (nx == Cnd_yield_calc_flg) doCnd_yield_calc_flg_NX(info);
		else if (nx == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_NX(info);
		else if (nx == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_NX(info);
		else if (nx == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_NX(info);
		else if (nx == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_NX(info);
		else if (nx == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NX(info);
		else if (nx == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NX(info);
		else if (nx == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NX(info);
		else if (nx == Cnd_inpt_loc_cd) doCnd_inpt_loc_cd_NX(info);
		else if (nx == Cnd_inpt_loc_nm) doCnd_inpt_loc_nm_NX(info);
		else if (nx == Cnd_inpt_str_ln_cd) doCnd_inpt_str_ln_cd_NX(info);
		else if (nx == Cnd_inpt_str_ln_nm) doCnd_inpt_str_ln_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_oper_loc_cd) doCnd_oper_loc_cd_NX(info);
		else if (nx == Cnd_oper_loc_nm) doCnd_oper_loc_nm_NX(info);
		else if (nx == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_NX(info);
		else if (nx == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_NX(info);
		else if (nx == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_NX(info);
		else if (nx == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_NX(info);
		else if (nx == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_NX(info);
		else if (nx == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_NX(info);
		else if (nx == Cnd_chd_lot_no) doCnd_chd_lot_no_NX(info);
		else if (nx == Cnd_chd_sublot_no) doCnd_chd_sublot_no_NX(info);
		else if (nx == Cnd_loss_rsn_cd) doCnd_loss_rsn_cd_NX(info);
		else if (nx == Cnd_loss_rsn_nm) doCnd_loss_rsn_nm_NX(info);
		else if (nx == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NX(info);
		else if (nx == Cnd_inpt_rsn_cd) doCnd_inpt_rsn_cd_NX(info);
		else if (nx == Cnd_inpt_rsn_nm) doCnd_inpt_rsn_nm_NX(info);
		else if (nx == Cnd_oper_usr_cd) doCnd_oper_usr_cd_NX(info);
		else if (nx == Cnd_oper_usr_nm) doCnd_oper_usr_nm_NX(info);
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_oper_inst_no) doCnd_oper_inst_no_NX(info);
		else if (nx == Cnd_mfg_act_no) doCnd_mfg_act_no_NX(info);
		else if (nx == Cnd_oper_act_no) doCnd_oper_act_no_NX(info);
		else if (nx == Cnd_inpt_schd_no) doCnd_inpt_schd_no_NX(info);
		else if (nx == Cnd_inpt_act_no) doCnd_inpt_act_no_NX(info);
		else if (nx == Cnd_loss_act_no) doCnd_loss_act_no_NX(info);
		else if (nx == Cnd_mes_id) doCnd_mes_id_NX(info);
		else if (nx == Cnd_data_no) doCnd_data_no_NX(info);
		else if (nx == Cnd_ext_inpt_act_no) doCnd_ext_inpt_act_no_NX(info);
		else if (nx == Cnd_inpt_schd_inst_rpt_rmrks) doCnd_inpt_schd_inst_rpt_rmrks_NX(info);
		else if (nx == Cnd_inpt_schd_intr_rmrks) doCnd_inpt_schd_intr_rmrks_NX(info);
		else if (nx == Cnd_inpt_schd_sub_char1) doCnd_inpt_schd_sub_char1_NX(info);
		else if (nx == Cnd_inpt_schd_sub_char2) doCnd_inpt_schd_sub_char2_NX(info);
		else if (nx == Cnd_inpt_schd_sub_char3) doCnd_inpt_schd_sub_char3_NX(info);
		else if (nx == Cnd_inpt_act_rpt_rmrks) doCnd_inpt_act_rpt_rmrks_NX(info);
		else if (nx == Cnd_inpt_act_intr_rmrks) doCnd_inpt_act_intr_rmrks_NX(info);
		else if (nx == Cnd_inpt_act_trd_rmrks) doCnd_inpt_act_trd_rmrks_NX(info);
		else if (nx == Cnd_inpt_act_sub_char1) doCnd_inpt_act_sub_char1_NX(info);
		else if (nx == Cnd_inpt_act_sub_char2) doCnd_inpt_act_sub_char2_NX(info);
		else if (nx == Cnd_inpt_act_sub_char3) doCnd_inpt_act_sub_char3_NX(info);
		else if (nx == Cnd_mfg_act_rpt_rmrks) doCnd_mfg_act_rpt_rmrks_NX(info);
		else if (nx == Cnd_mfg_act_intr_rmrks) doCnd_mfg_act_intr_rmrks_NX(info);
		else if (nx == Cnd_mfg_act_sub_char1) doCnd_mfg_act_sub_char1_NX(info);
		else if (nx == Cnd_mfg_act_sub_char2) doCnd_mfg_act_sub_char2_NX(info);
		else if (nx == Cnd_mfg_act_sub_char3) doCnd_mfg_act_sub_char3_NX(info);
		else if (nx == Cnd_oper_act_intr_rmrks) doCnd_oper_act_intr_rmrks_NX(info);
		else if (nx == Cnd_oper_act_rpt_rmrks) doCnd_oper_act_rpt_rmrks_NX(info);
		else if (nx == Cnd_oper_act_sub_char1) doCnd_oper_act_sub_char1_NX(info);
		else if (nx == Cnd_oper_act_sub_char2) doCnd_oper_act_sub_char2_NX(info);
		else if (nx == Cnd_oper_act_sub_char3) doCnd_oper_act_sub_char3_NX(info);
		else if (nx == columnRslt_inpt_mfg_sts_typ) doRslt_inpt_mfg_sts_typ_NX(info);
		else if (nx == columnRslt_inpt_mfg_sts_typ_nm) doRslt_inpt_mfg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_NX(info);
		else if (nx == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_loss_rsn_cd) doRslt_loss_rsn_cd_NX(info);
		else if (nx == columnRslt_loss_rsn_nm) doRslt_loss_rsn_nm_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_schd_abort_flg) doRslt_schd_abort_flg_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_pr_rate) doRslt_pr_rate_NX(info);
		else if (nx == columnRslt_inst_lot_no) doRslt_inst_lot_no_NX(info);
		else if (nx == columnRslt_inst_sublot_no) doRslt_inst_sublot_no_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_inpt_rsn_cd) doRslt_inpt_rsn_cd_NX(info);
		else if (nx == columnRslt_inpt_rsn_nm) doRslt_inpt_rsn_nm_NX(info);
		else if (nx == columnRslt_inpt_loc_cd) doRslt_inpt_loc_cd_NX(info);
		else if (nx == columnRslt_inpt_loc_nm) doRslt_inpt_loc_nm_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_prov_typ) doRslt_prov_typ_NX(info);
		else if (nx == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NX(info);
		else if (nx == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NX(info);
		else if (nx == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NX(info);
		else if (nx == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NX(info);
		else if (nx == columnRslt_alt_itm_fix_flg) doRslt_alt_itm_fix_flg_NX(info);
		else if (nx == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NX(info);
		else if (nx == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_NX(info);
		else if (nx == columnRslt_inpt_act_no) doRslt_inpt_act_no_NX(info);
		else if (nx == columnRslt_loss_act_no) doRslt_loss_act_no_NX(info);
		else if (nx == columnRslt_mes_id) doRslt_mes_id_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_inpt_act_no) doRslt_ext_inpt_act_no_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_par_base_unit_cd) doRslt_par_base_unit_cd_NX(info);
		else if (nx == columnRslt_par_base_unit_nm) doRslt_par_base_unit_nm_NX(info);
		else if (nx == columnRslt_par_base_unit_dec_place) doRslt_par_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_par_act_lot_no) doRslt_par_act_lot_no_NX(info);
		else if (nx == columnRslt_par_act_sublot_no) doRslt_par_act_sublot_no_NX(info);
		else if (nx == columnRslt_par_inst_lot_no) doRslt_par_inst_lot_no_NX(info);
		else if (nx == columnRslt_par_inst_sublot_no) doRslt_par_inst_sublot_no_NX(info);
		else if (nx == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_NX(info);
		else if (nx == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NX(info);
		else if (nx == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NX(info);
		else if (nx == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NX(info);
		else if (nx == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NX(info);
		else if (nx == columnRslt_main_itm_flg) doRslt_main_itm_flg_NX(info);
		else if (nx == columnRslt_yield_calc_flg) doRslt_yield_calc_flg_NX(info);
		else if (nx == columnRslt_bkf_upd_flg) doRslt_bkf_upd_flg_NX(info);
		else if (nx == columnRslt_lot_mix_flg) doRslt_lot_mix_flg_NX(info);
		else if (nx == columnRslt_sublot_mix_flg) doRslt_sublot_mix_flg_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NX(info);
		else if (nx == columnRslt_bkf_typ) doRslt_bkf_typ_NX(info);
		else if (nx == columnRslt_bkf_typ_nm) doRslt_bkf_typ_nm_NX(info);
		else if (nx == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NX(info);
		else if (nx == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_acxfr_act_rsn_cd) doRslt_acxfr_act_rsn_cd_NX(info);
		else if (nx == columnRslt_acxfr_act_rsn_nm) doRslt_acxfr_act_rsn_nm_NX(info);
		else if (nx == columnRslt_acxfr_act_bd_dpt_cd) doRslt_acxfr_act_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_acxfr_act_bd_dpt_nm) doRslt_acxfr_act_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_inpt_schd_intr_rmrks) doRslt_inpt_schd_intr_rmrks_NX(info);
		else if (nx == columnRslt_inpt_schd_inst_rpt_rmrks) doRslt_inpt_schd_inst_rpt_rmrks_NX(info);
		else if (nx == columnRslt_inpt_schd_sub_char1) doRslt_inpt_schd_sub_char1_NX(info);
		else if (nx == columnRslt_inpt_schd_sub_char2) doRslt_inpt_schd_sub_char2_NX(info);
		else if (nx == columnRslt_inpt_schd_sub_char3) doRslt_inpt_schd_sub_char3_NX(info);
		else if (nx == columnRslt_inpt_act_intr_rmrks) doRslt_inpt_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_inpt_act_rpt_rmrks) doRslt_inpt_act_rpt_rmrks_NX(info);
		else if (nx == columnRslt_inpt_act_trd_rmrks) doRslt_inpt_act_trd_rmrks_NX(info);
		else if (nx == columnRslt_inpt_act_sub_char1) doRslt_inpt_act_sub_char1_NX(info);
		else if (nx == columnRslt_inpt_act_sub_char2) doRslt_inpt_act_sub_char2_NX(info);
		else if (nx == columnRslt_inpt_act_sub_char3) doRslt_inpt_act_sub_char3_NX(info);
		else if (nx == columnRslt_loss_act_intr_rmrks) doRslt_loss_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_loss_act_trd_rmrks) doRslt_loss_act_trd_rmrks_NX(info);
		else if (nx == columnRslt_loss_act_sub_char1) doRslt_loss_act_sub_char1_NX(info);
		else if (nx == columnRslt_loss_act_sub_char2) doRslt_loss_act_sub_char2_NX(info);
		else if (nx == columnRslt_loss_act_sub_char3) doRslt_loss_act_sub_char3_NX(info);
		else if (nx == columnRslt_mfg_act_rpt_rmrks) doRslt_mfg_act_rpt_rmrks_NX(info);
		else if (nx == columnRslt_mfg_act_intr_rmrks) doRslt_mfg_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_mfg_act_sub_char1) doRslt_mfg_act_sub_char1_NX(info);
		else if (nx == columnRslt_mfg_act_sub_char2) doRslt_mfg_act_sub_char2_NX(info);
		else if (nx == columnRslt_mfg_act_sub_char3) doRslt_mfg_act_sub_char3_NX(info);
		else if (nx == columnRslt_oper_act_intr_rmrks) doRslt_oper_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_oper_act_rpt_rmrks) doRslt_oper_act_rpt_rmrks_NX(info);
		else if (nx == columnRslt_oper_act_sub_char1) doRslt_oper_act_sub_char1_NX(info);
		else if (nx == columnRslt_oper_act_sub_char2) doRslt_oper_act_sub_char2_NX(info);
		else if (nx == columnRslt_oper_act_sub_char3) doRslt_oper_act_sub_char3_NX(info);
		else if (nx == columnRslt_itm_yield) doRslt_itm_yield_NX(info);
		else if (nx == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_NX(info);
		else if (nx == columnRslt_itm_std_yield) doRslt_itm_std_yield_NX(info);
		else if (nx == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_NX(info);
		else if (nx == columnRslt_oper_yield) doRslt_oper_yield_NX(info);
		else if (nx == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_NX(info);
		else if (nx == columnRslt_oper_std_yield) doRslt_oper_std_yield_NX(info);
		else if (nx == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NX(info);
		else if (nx == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NX(info);
		else if (nx == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_NX(info);
		else if (nx == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_NX(info);
		else if (nx == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_NX(info);
		else if (nx == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_NX(info);
		else if (nx == columnRslt_oper_str_ln_cd_none_flg) doRslt_oper_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_oper_ptn) doRslt_oper_ptn_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_div_seq) doRslt_div_seq_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_mfg_act_no) doRslt_mfg_act_no_NX(info);
		else if (nx == columnRslt_oper_inst_no) doRslt_oper_inst_no_NX(info);
		else if (nx == columnRslt_oper_act_no) doRslt_oper_act_no_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_NX(info);
		else if (nx == columnRslt_oper_usr_cd) doRslt_oper_usr_cd_NX(info);
		else if (nx == columnRslt_oper_usr_nm) doRslt_oper_usr_nm_NX(info);
		else if (nx == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NX(info);
		else if (nx == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NX(info);
		else if (nx == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_par_itm_typ) doRslt_par_itm_typ_NX(info);
		else if (nx == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_NX(info);
		else if (nx == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_NX(info);
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
	 * [Cnd]パネルの[srch_mode1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_mode2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_stt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_stt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_stt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_no_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_no_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_inc_loss_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_inc_loss_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_alloc_srch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_srch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_inpt_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_inpt_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_inst_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_inst_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_abort_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_inpt_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_inpt_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[main_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_main_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_inst_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_inst_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_NX(MCEventInfo info){
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
		if (lc == Cnd_inpt_ac_dt_fr) doCnd_inpt_ac_dt_fr_LC(info);
		else if (lc == Cnd_inpt_ac_dt_to) doCnd_inpt_ac_dt_to_LC(info);
		else if (lc == Cnd_bkf_typ) doCnd_bkf_typ_LC(info);
		else if (lc == Cnd_bkf_typ_nm) doCnd_bkf_typ_nm_LC(info);
		else if (lc == Cnd_pr_rate_fr) doCnd_pr_rate_fr_LC(info);
		else if (lc == Cnd_pr_rate_to) doCnd_pr_rate_to_LC(info);
		else if (lc == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_LC(info);
		else if (lc == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_LC(info);
		else if (lc == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_LC(info);
		else if (lc == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_LC(info);
		else if (lc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_LC(info);
		else if (lc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_LC(info);
		else if (lc == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_LC(info);
		else if (lc == Cnd_inpt_loc_cd) doCnd_inpt_loc_cd_LC(info);
		else if (lc == Cnd_inpt_loc_nm) doCnd_inpt_loc_nm_LC(info);
		else if (lc == Cnd_inpt_str_ln_cd) doCnd_inpt_str_ln_cd_LC(info);
		else if (lc == Cnd_inpt_str_ln_nm) doCnd_inpt_str_ln_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_oper_loc_cd) doCnd_oper_loc_cd_LC(info);
		else if (lc == Cnd_oper_loc_nm) doCnd_oper_loc_nm_LC(info);
		else if (lc == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_LC(info);
		else if (lc == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_LC(info);
		else if (lc == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_LC(info);
		else if (lc == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_LC(info);
		else if (lc == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_LC(info);
		else if (lc == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_LC(info);
		else if (lc == Cnd_chd_lot_no) doCnd_chd_lot_no_LC(info);
		else if (lc == Cnd_chd_sublot_no) doCnd_chd_sublot_no_LC(info);
		else if (lc == Cnd_loss_rsn_cd) doCnd_loss_rsn_cd_LC(info);
		else if (lc == Cnd_loss_rsn_nm) doCnd_loss_rsn_nm_LC(info);
		else if (lc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_LC(info);
		else if (lc == Cnd_inpt_rsn_cd) doCnd_inpt_rsn_cd_LC(info);
		else if (lc == Cnd_inpt_rsn_nm) doCnd_inpt_rsn_nm_LC(info);
		else if (lc == Cnd_oper_usr_cd) doCnd_oper_usr_cd_LC(info);
		else if (lc == Cnd_oper_usr_nm) doCnd_oper_usr_nm_LC(info);
		else if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_oper_inst_no) doCnd_oper_inst_no_LC(info);
		else if (lc == Cnd_mfg_act_no) doCnd_mfg_act_no_LC(info);
		else if (lc == Cnd_oper_act_no) doCnd_oper_act_no_LC(info);
		else if (lc == Cnd_inpt_schd_no) doCnd_inpt_schd_no_LC(info);
		else if (lc == Cnd_inpt_act_no) doCnd_inpt_act_no_LC(info);
		else if (lc == Cnd_loss_act_no) doCnd_loss_act_no_LC(info);
		else if (lc == Cnd_mes_id) doCnd_mes_id_LC(info);
		else if (lc == Cnd_data_no) doCnd_data_no_LC(info);
		else if (lc == Cnd_ext_inpt_act_no) doCnd_ext_inpt_act_no_LC(info);
		else if (lc == Cnd_inpt_schd_inst_rpt_rmrks) doCnd_inpt_schd_inst_rpt_rmrks_LC(info);
		else if (lc == Cnd_inpt_schd_intr_rmrks) doCnd_inpt_schd_intr_rmrks_LC(info);
		else if (lc == Cnd_inpt_schd_sub_char1) doCnd_inpt_schd_sub_char1_LC(info);
		else if (lc == Cnd_inpt_schd_sub_char2) doCnd_inpt_schd_sub_char2_LC(info);
		else if (lc == Cnd_inpt_schd_sub_char3) doCnd_inpt_schd_sub_char3_LC(info);
		else if (lc == Cnd_inpt_act_rpt_rmrks) doCnd_inpt_act_rpt_rmrks_LC(info);
		else if (lc == Cnd_inpt_act_intr_rmrks) doCnd_inpt_act_intr_rmrks_LC(info);
		else if (lc == Cnd_inpt_act_trd_rmrks) doCnd_inpt_act_trd_rmrks_LC(info);
		else if (lc == Cnd_inpt_act_sub_char1) doCnd_inpt_act_sub_char1_LC(info);
		else if (lc == Cnd_inpt_act_sub_char2) doCnd_inpt_act_sub_char2_LC(info);
		else if (lc == Cnd_inpt_act_sub_char3) doCnd_inpt_act_sub_char3_LC(info);
		else if (lc == Cnd_mfg_act_rpt_rmrks) doCnd_mfg_act_rpt_rmrks_LC(info);
		else if (lc == Cnd_mfg_act_intr_rmrks) doCnd_mfg_act_intr_rmrks_LC(info);
		else if (lc == Cnd_mfg_act_sub_char1) doCnd_mfg_act_sub_char1_LC(info);
		else if (lc == Cnd_mfg_act_sub_char2) doCnd_mfg_act_sub_char2_LC(info);
		else if (lc == Cnd_mfg_act_sub_char3) doCnd_mfg_act_sub_char3_LC(info);
		else if (lc == Cnd_oper_act_intr_rmrks) doCnd_oper_act_intr_rmrks_LC(info);
		else if (lc == Cnd_oper_act_rpt_rmrks) doCnd_oper_act_rpt_rmrks_LC(info);
		else if (lc == Cnd_oper_act_sub_char1) doCnd_oper_act_sub_char1_LC(info);
		else if (lc == Cnd_oper_act_sub_char2) doCnd_oper_act_sub_char2_LC(info);
		else if (lc == Cnd_oper_act_sub_char3) doCnd_oper_act_sub_char3_LC(info);
		else if (lc == columnRslt_inpt_mfg_sts_typ) doRslt_inpt_mfg_sts_typ_LC(info);
		else if (lc == columnRslt_inpt_mfg_sts_typ_nm) doRslt_inpt_mfg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_LC(info);
		else if (lc == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_loss_rsn_cd) doRslt_loss_rsn_cd_LC(info);
		else if (lc == columnRslt_loss_rsn_nm) doRslt_loss_rsn_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_pr_rate) doRslt_pr_rate_LC(info);
		else if (lc == columnRslt_inst_lot_no) doRslt_inst_lot_no_LC(info);
		else if (lc == columnRslt_inst_sublot_no) doRslt_inst_sublot_no_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_inpt_rsn_cd) doRslt_inpt_rsn_cd_LC(info);
		else if (lc == columnRslt_inpt_rsn_nm) doRslt_inpt_rsn_nm_LC(info);
		else if (lc == columnRslt_inpt_loc_cd) doRslt_inpt_loc_cd_LC(info);
		else if (lc == columnRslt_inpt_loc_nm) doRslt_inpt_loc_nm_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_prov_typ) doRslt_prov_typ_LC(info);
		else if (lc == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_LC(info);
		else if (lc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_LC(info);
		else if (lc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_LC(info);
		else if (lc == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_LC(info);
		else if (lc == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_LC(info);
		else if (lc == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_LC(info);
		else if (lc == columnRslt_inpt_act_no) doRslt_inpt_act_no_LC(info);
		else if (lc == columnRslt_loss_act_no) doRslt_loss_act_no_LC(info);
		else if (lc == columnRslt_mes_id) doRslt_mes_id_LC(info);
		else if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_inpt_act_no) doRslt_ext_inpt_act_no_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_par_base_unit_cd) doRslt_par_base_unit_cd_LC(info);
		else if (lc == columnRslt_par_base_unit_nm) doRslt_par_base_unit_nm_LC(info);
		else if (lc == columnRslt_par_base_unit_dec_place) doRslt_par_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_par_act_lot_no) doRslt_par_act_lot_no_LC(info);
		else if (lc == columnRslt_par_act_sublot_no) doRslt_par_act_sublot_no_LC(info);
		else if (lc == columnRslt_par_inst_lot_no) doRslt_par_inst_lot_no_LC(info);
		else if (lc == columnRslt_par_inst_sublot_no) doRslt_par_inst_sublot_no_LC(info);
		else if (lc == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_LC(info);
		else if (lc == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_LC(info);
		else if (lc == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_LC(info);
		else if (lc == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_LC(info);
		else if (lc == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_LC(info);
		else if (lc == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_LC(info);
		else if (lc == columnRslt_bkf_typ) doRslt_bkf_typ_LC(info);
		else if (lc == columnRslt_bkf_typ_nm) doRslt_bkf_typ_nm_LC(info);
		else if (lc == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_LC(info);
		else if (lc == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_acxfr_act_rsn_cd) doRslt_acxfr_act_rsn_cd_LC(info);
		else if (lc == columnRslt_acxfr_act_rsn_nm) doRslt_acxfr_act_rsn_nm_LC(info);
		else if (lc == columnRslt_acxfr_act_bd_dpt_cd) doRslt_acxfr_act_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_acxfr_act_bd_dpt_nm) doRslt_acxfr_act_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_inpt_schd_intr_rmrks) doRslt_inpt_schd_intr_rmrks_LC(info);
		else if (lc == columnRslt_inpt_schd_inst_rpt_rmrks) doRslt_inpt_schd_inst_rpt_rmrks_LC(info);
		else if (lc == columnRslt_inpt_schd_sub_char1) doRslt_inpt_schd_sub_char1_LC(info);
		else if (lc == columnRslt_inpt_schd_sub_char2) doRslt_inpt_schd_sub_char2_LC(info);
		else if (lc == columnRslt_inpt_schd_sub_char3) doRslt_inpt_schd_sub_char3_LC(info);
		else if (lc == columnRslt_inpt_act_intr_rmrks) doRslt_inpt_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_inpt_act_rpt_rmrks) doRslt_inpt_act_rpt_rmrks_LC(info);
		else if (lc == columnRslt_inpt_act_trd_rmrks) doRslt_inpt_act_trd_rmrks_LC(info);
		else if (lc == columnRslt_inpt_act_sub_char1) doRslt_inpt_act_sub_char1_LC(info);
		else if (lc == columnRslt_inpt_act_sub_char2) doRslt_inpt_act_sub_char2_LC(info);
		else if (lc == columnRslt_inpt_act_sub_char3) doRslt_inpt_act_sub_char3_LC(info);
		else if (lc == columnRslt_loss_act_intr_rmrks) doRslt_loss_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_loss_act_trd_rmrks) doRslt_loss_act_trd_rmrks_LC(info);
		else if (lc == columnRslt_loss_act_sub_char1) doRslt_loss_act_sub_char1_LC(info);
		else if (lc == columnRslt_loss_act_sub_char2) doRslt_loss_act_sub_char2_LC(info);
		else if (lc == columnRslt_loss_act_sub_char3) doRslt_loss_act_sub_char3_LC(info);
		else if (lc == columnRslt_mfg_act_rpt_rmrks) doRslt_mfg_act_rpt_rmrks_LC(info);
		else if (lc == columnRslt_mfg_act_intr_rmrks) doRslt_mfg_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_mfg_act_sub_char1) doRslt_mfg_act_sub_char1_LC(info);
		else if (lc == columnRslt_mfg_act_sub_char2) doRslt_mfg_act_sub_char2_LC(info);
		else if (lc == columnRslt_mfg_act_sub_char3) doRslt_mfg_act_sub_char3_LC(info);
		else if (lc == columnRslt_oper_act_intr_rmrks) doRslt_oper_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_oper_act_rpt_rmrks) doRslt_oper_act_rpt_rmrks_LC(info);
		else if (lc == columnRslt_oper_act_sub_char1) doRslt_oper_act_sub_char1_LC(info);
		else if (lc == columnRslt_oper_act_sub_char2) doRslt_oper_act_sub_char2_LC(info);
		else if (lc == columnRslt_oper_act_sub_char3) doRslt_oper_act_sub_char3_LC(info);
		else if (lc == columnRslt_itm_yield) doRslt_itm_yield_LC(info);
		else if (lc == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_LC(info);
		else if (lc == columnRslt_itm_std_yield) doRslt_itm_std_yield_LC(info);
		else if (lc == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_LC(info);
		else if (lc == columnRslt_oper_yield) doRslt_oper_yield_LC(info);
		else if (lc == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_LC(info);
		else if (lc == columnRslt_oper_std_yield) doRslt_oper_std_yield_LC(info);
		else if (lc == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_LC(info);
		else if (lc == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_LC(info);
		else if (lc == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_LC(info);
		else if (lc == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_LC(info);
		else if (lc == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_LC(info);
		else if (lc == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_oper_ptn) doRslt_oper_ptn_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_div_seq) doRslt_div_seq_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_mfg_act_no) doRslt_mfg_act_no_LC(info);
		else if (lc == columnRslt_oper_inst_no) doRslt_oper_inst_no_LC(info);
		else if (lc == columnRslt_oper_act_no) doRslt_oper_act_no_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_LC(info);
		else if (lc == columnRslt_oper_usr_cd) doRslt_oper_usr_cd_LC(info);
		else if (lc == columnRslt_oper_usr_nm) doRslt_oper_usr_nm_LC(info);
		else if (lc == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_LC(info);
		else if (lc == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_LC(info);
		else if (lc == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_par_itm_typ) doRslt_par_itm_typ_LC(info);
		else if (lc == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_LC(info);
		else if (lc == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_LC(info);
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
	 * [Cnd]パネルの[inpt_ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bkf_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bkf_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loss_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loss_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_inpt_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_inpt_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_inst_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_inst_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_mfg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_mfg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_rsn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_inpt_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_inpt_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_act_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_act_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bkf_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bkf_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_inst_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_inst_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loss_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loss_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bkf_typ]の作成メソッド
	 */
	public MCList getCnd_bkf_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBkfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_site_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_site_nm]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_site_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_loc_cd]の作成メソッド
	 */
	public MCList getCnd_inpt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_inpt_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_loc_cd]の作成メソッド
	 */
	public MCList getCnd_oper_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_oper_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_mtd_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_ctl_typ]の作成メソッド
	 */
	public MCList getCnd_inpt_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_lot_no]の作成メソッド
	 */
	public MCList getCnd_chd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_sublot_no]の作成メソッド
	 */
	public MCList getCnd_chd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loss_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_loss_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loss_rsn_nm]の作成メソッド
	 */
	public MCList getCnd_loss_rsn_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_inpt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_rsn_nm]の作成メソッド
	 */
	public MCList getCnd_inpt_rsn_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_usr_cd]の作成メソッド
	 */
	public MCList getCnd_oper_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gd_cd]の作成メソッド
	 */
	public MCList getRslt_gd_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_inpt_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_inpt_rsn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_inpt_loc_cd]の作成メソッド
	 */
	public MCList getRslt_inpt_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_stk_mng_typ]の作成メソッド
	 */
	public MCList getRslt_stk_mng_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_stk_id_typ]の作成メソッド
	 */
	public MCList getRslt_stk_id_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_stk_bp_cd]の作成メソッド
	 */
	public MCList getRslt_stk_bp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getRslt_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_acxfr_act_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_acxfr_act_rsn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_acxfr_act_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_acxfr_act_bd_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL1090.Srch01")) {
			return new MS_MSBCL1090_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL1090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1090_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1090_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL1090_Srch01Bridge() {
			p_MS_MSBCL1090_Srch01 = new MCParam(PDef.MS_MSBCL1090_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1090_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP1090.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1090.RsltR.class));

			p_MS_MSBCL1090_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1090_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1090_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1090_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1090_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP1090.CndR up0() {
			return (mcframe.clientMSBC.MSBCP1090.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1090.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1090.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1090_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1090.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1090_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1090.RsltR>)p_MS_MSBCL1090_Srch01.getContainerParam().getDownBlock(0));
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