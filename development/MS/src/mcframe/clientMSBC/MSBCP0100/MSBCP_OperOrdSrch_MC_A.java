package mcframe.clientMSBC.MSBCP0100;

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
import mcframe.clientMSBC.MSBCP0100.MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Srch01Caller;
import mcframe.clientMSBC.MSBCP0100.MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Upd01Caller;
import mcframe.clientMSBC.MSBCP0100.MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Imp01Caller;

/**
 * 画面"MSBCP_OperOrdSrch"パネルクラスです。<p>
 *
 * 工程オーダを照会・訂正する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_OperOrdSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0100";

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
	// [OperOrdSts]ブロック関連のField定義
	public MCPanel OperOrdStsPanel = null;
	public MCTitledBorder OperOrdStsTitledBorder = null;
	// [OperOrdSts]ブロックの項目のField定義
	// [OrdRcv]ブロック関連のField定義
	public MCPanel OrdRcvPanel = null;
	public MCTitledBorder OrdRcvTitledBorder = null;
	// [OrdRcv]ブロックの項目のField定義
	// [OrdSnd]ブロック関連のField定義
	public MCPanel OrdSndPanel = null;
	public MCTitledBorder OrdSndTitledBorder = null;
	// [OrdSnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Modify;REF,View;IMP,File input UPD,訂正する;REF,参照する;IMP,ファイル入力.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_IMP = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Save 保存.<p>
	 *
	 */
	public MCCheckBox Cnd_sav_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	/**
	 * Partially ordered 一部指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_part_inst_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_flg = null;
	/**
	 * Order to be imported オーダ受信対象.<p>
	 *
	 */
	public MCCheckBox Cnd_ord_rcv_tgt_flg = null;
	/**
	 * Order not to be imported オーダ受信対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ord_rcv_tgt_flg = null;
	/**
	 * Order to be exported オーダ送信対象.<p>
	 *
	 */
	public MCCheckBox Cnd_ord_snd_tgt_flg = null;
	/**
	 * Order not to be exported オーダ送信対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ord_snd_tgt_flg = null;
	public MCLabel Cnd_mfg_st_schd_dt_fr_Label = null;
	/**
	 * Scheduled item start date FROM 品目着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_st_schd_dt_fr = null;
	public MCLabel Cnd_mfg_st_schd_dt_to_Label = null;
	/**
	 * Scheduled item start date TO 品目着手予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_st_schd_dt_to = null;
	public MCLabel Cnd_mfg_end_schd_dt_fr_Label = null;
	/**
	 * Scheduled item end date FROM 品目終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_end_schd_dt_fr = null;
	public MCLabel Cnd_mfg_end_schd_dt_to_Label = null;
	/**
	 * Scheduled item end date TO 品目終了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_end_schd_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_stSchd_p_PPanel;
	public MCDateField Cnd_st_schd_dt_fr;	// [Cnd]の[stSchd_p.ymd_fr]を[Cnd_st_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_schd_hm_fr;	// [Cnd]の[stSchd_p.hm_fr]を[Cnd_st_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_st_schd_dt_to;	// [Cnd]の[stSchd_p.ymd_to]を[Cnd_st_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_st_schd_hm_to;	// [Cnd]の[stSchd_p.hm_to]を[Cnd_st_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_endSchd_p_PPanel;
	public MCDateField Cnd_end_schd_dt_fr;	// [Cnd]の[endSchd_p.ymd_fr]を[Cnd_end_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_schd_hm_fr;	// [Cnd]の[endSchd_p.hm_fr]を[Cnd_end_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_end_schd_dt_to;	// [Cnd]の[endSchd_p.ymd_to]を[Cnd_end_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_schd_hm_to;	// [Cnd]の[endSchd_p.hm_to]を[Cnd_end_schd_hm_to]としてエイリアス定義。
	/**
	 * Scheduled GI date and time search 出庫予定日時検索.<p>
	 *
	 */
	public MCCheckBox Cnd_gi_schd_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_giSchd_p_PPanel;
	public MCDateField Cnd_gi_schd_dt_fr;	// [Cnd]の[giSchd_p.ymd_fr]を[Cnd_gi_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_schd_hm_fr;	// [Cnd]の[giSchd_p.hm_fr]を[Cnd_gi_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_schd_dt_to;	// [Cnd]の[giSchd_p.ymd_to]を[Cnd_gi_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gi_schd_hm_to;	// [Cnd]の[giSchd_p.hm_to]を[Cnd_gi_schd_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_mfg_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_site_nm = null;
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
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_oper_ptn_Label = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCTextField Cnd_oper_ptn = null;
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
	public MCLabel Cnd_oper_seq_Label = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumberField Cnd_oper_seq = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_oper_rsrc_Label = null;
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public MCTextField Cnd_oper_rsrc = null;
	public MCLabel Cnd_oper_ord_no_Label = null;
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_ord_no = null;
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	public MCLabel Cnd_rmrks_Label = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Cnd_rmrks = null;
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
	public MCLabel Cnd_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_cd = null;
	public MCLabel Cnd_ext_sys_nm_Label = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_nm = null;
	public MCLabel Cnd_ext_itm_ord_no_Label = null;
	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_itm_ord_no = null;
	public MCLabel Cnd_ext_oper_ord_no_Label = null;
	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_oper_ord_no = null;
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
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
	// [Disp]ブロック関連のField定義
	public MCPanel DispPanel = null;
	// [Disp]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0100.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ord_no = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_sts_typ = null;
	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_sts_typ_nm = null;
	/**
	 * Operation status 工程状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ord_sts_typ = null;
	/**
	 * Operation status name 工程状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ord_sts_typ_nm = null;
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ptn = null;
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
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_seq = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_gi_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_gi_schd_dt;// [Rslt]の[gi_schd_tm_p.ymd]を[columnRslt_gi_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_gi_schd_hm;// [Rslt]の[gi_schd_tm_p.hm]を[columnRslt_gi_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_st_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_st_schd_dt;// [Rslt]の[st_schd_tm_p.ymd]を[columnRslt_st_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_st_schd_hm;// [Rslt]の[st_schd_tm_p.hm]を[columnRslt_st_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_end_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_end_schd_dt;// [Rslt]の[end_schd_tm_p.ymd]を[columnRslt_end_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_end_schd_hm;// [Rslt]の[end_schd_tm_p.hm]を[columnRslt_end_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_schd_qty;// [Rslt]の[oper_schd_qty_p.qty]を[columnRslt_oper_schd_qty]としてエイリアス定義。
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
	public MCColumnConfig columnRslt_base_dec_place = null;
	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_conv_rnd_typ = null;
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_dec_place = null;
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_std_qty = null;
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_conv_qty = null;
	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_conv_rnd_typ = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_inst_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_inst_schd_qty;// [Rslt]の[oper_inst_schd_qty_p.qty]を[columnRslt_oper_inst_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_act_qty;// [Rslt]の[oper_act_qty_p.qty]を[columnRslt_oper_act_qty]としてエイリアス定義。
	/**
	 * Scheduled item start date 品目着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_st_schd_dt = null;
	/**
	 * Scheduled item end date 品目終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_end_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_inst_st_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_inst_st_schd_dt;// [Rslt]の[inst_st_schd_tm_p.ymd]を[columnRslt_inst_st_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_inst_st_schd_hm;// [Rslt]の[inst_st_schd_tm_p.hm]を[columnRslt_inst_st_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_act_st_tm_p_PPanel;
	public MCColumnConfig columnRslt_act_st_dt;// [Rslt]の[act_st_tm_p.ymd]を[columnRslt_act_st_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_st_hm;// [Rslt]の[act_st_tm_p.hm]を[columnRslt_act_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_inst_end_schd_tm_p_PPanel;
	public MCColumnConfig columnRslt_inst_end_schd_dt;// [Rslt]の[inst_end_schd_tm_p.ymd]を[columnRslt_inst_end_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_inst_end_schd_hm;// [Rslt]の[inst_end_schd_tm_p.hm]を[columnRslt_inst_end_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_act_end_tm_p_PPanel;
	public MCColumnConfig columnRslt_act_end_dt;// [Rslt]の[act_end_tm_p.ymd]を[columnRslt_act_end_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_act_end_hm;// [Rslt]の[act_end_tm_p.hm]を[columnRslt_act_end_hm]としてエイリアス定義。
	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_site_cd = null;
	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_site_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_nm = null;
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
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	 * Operation resources 工程資源.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_rsrc = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks = null;
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
	 * Order import オーダ受信.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_rcv_flg = null;
	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_snd_flg = null;
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
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_itm_ord_no = null;
	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_for_scheduler_frozen_flg = null;
	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_oper_ord_no = null;
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public MCColumnConfig columnRslt_scheduler_frozen_flg = null;
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
	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_order_upd_cntr = null;
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rtn_sts_typ = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Item progress 品目進捗.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0080 = null;
	/**
	 * Operation progress 工程進捗.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0090 = null;
	/**
	 * Order implosion オーダ逆展開.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0060 = null;
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
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [IMP]モードを表す定数 */
	public static final String IMP = "IMP";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, REF, IMP, INS, FIX_I};
	
	/** [MS_MSBCL0100_Srch01]のCallerの作成 */
	protected MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Srch01Caller createMS_MSBCL0100_Srch01() {
		MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Srch01Caller<MSBCP_OperOrdSrch, MS_MSBCL0100_Srch01Bridge>
		caller = ((MSBCP_OperOrdSrch_MC)this).new MS_MSBCL0100_Srch01Caller<MSBCP_OperOrdSrch, MS_MSBCL0100_Srch01Bridge>(
					(MSBCP_OperOrdSrch)this, new MS_MSBCL0100_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0100_Srch01]の呼び出し */
	protected void callMS_MSBCL0100_Srch01() {
		MCCaller caller = createMS_MSBCL0100_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0100_Upd01]のCallerの作成 */
	protected MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Upd01Caller createMS_MSBCL0100_Upd01() {
		MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Upd01Caller<MSBCP_OperOrdSrch, MS_MSBCL0100_Upd01Bridge>
		caller = ((MSBCP_OperOrdSrch_MC)this).new MS_MSBCL0100_Upd01Caller<MSBCP_OperOrdSrch, MS_MSBCL0100_Upd01Bridge>(
					(MSBCP_OperOrdSrch)this, new MS_MSBCL0100_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0100_Upd01]の呼び出し */
	protected void callMS_MSBCL0100_Upd01() {
		MCCaller caller = createMS_MSBCL0100_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL0100_Imp01]のCallerの作成 */
	protected MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Imp01Caller createMS_MSBCL0100_Imp01() {
		MSBCP_OperOrdSrch_MC.MS_MSBCL0100_Imp01Caller<MSBCP_OperOrdSrch, MS_MSBCL0100_Imp01Bridge>
		caller = ((MSBCP_OperOrdSrch_MC)this).new MS_MSBCL0100_Imp01Caller<MSBCP_OperOrdSrch, MS_MSBCL0100_Imp01Bridge>(
					(MSBCP_OperOrdSrch)this, new MS_MSBCL0100_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBCL0100_Imp01]の呼び出し */
	protected void callMS_MSBCL0100_Imp01() {
		MCCaller caller = createMS_MSBCL0100_Imp01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0100.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0100.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0100.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0100.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0100.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0100.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0100.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0100.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0100.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class);
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
		ret.add(OperOrdStsPanel);
		ret.add(OrdRcvPanel);
		ret.add(OrdSndPanel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(DispPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OperOrdSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_OperOrdSrch_MC_A(String name) {
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
		MSBCP_OperOrdSrch_MC.jbCreateScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateTop((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateFold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateTab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateTab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateOperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateOrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateOrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateCnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateCnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateCtrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateRPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateDisp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateRslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbCreateBtn((MSBCP_OperOrdSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [OperOrdSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOperOrdSts(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [OrdRcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrdRcv(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [OrdSnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrdSnd(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_OperOrdSrch p) {
		p.Cnd_stSchd_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().stSchd_p());
		p.Cnd_stSchd_p_PPanel.setName("Cnd.stSchd_p");
		p.Cnd_st_schd_dt_fr = p.Cnd_stSchd_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_st_schd_dt_fr.addAliasName("Cnd.st_schd_dt_fr", p);
		p.Cnd_st_schd_hm_fr = p.Cnd_stSchd_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_st_schd_hm_fr.addAliasName("Cnd.st_schd_hm_fr", p);
		p.Cnd_st_schd_dt_to = p.Cnd_stSchd_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_st_schd_dt_to.addAliasName("Cnd.st_schd_dt_to", p);
		p.Cnd_st_schd_hm_to = p.Cnd_stSchd_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_st_schd_hm_to.addAliasName("Cnd.st_schd_hm_to", p);
		p.Cnd_endSchd_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().endSchd_p());
		p.Cnd_endSchd_p_PPanel.setName("Cnd.endSchd_p");
		p.Cnd_end_schd_dt_fr = p.Cnd_endSchd_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_end_schd_dt_fr.addAliasName("Cnd.end_schd_dt_fr", p);
		p.Cnd_end_schd_hm_fr = p.Cnd_endSchd_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_end_schd_hm_fr.addAliasName("Cnd.end_schd_hm_fr", p);
		p.Cnd_end_schd_dt_to = p.Cnd_endSchd_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_end_schd_dt_to.addAliasName("Cnd.end_schd_dt_to", p);
		p.Cnd_end_schd_hm_to = p.Cnd_endSchd_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_end_schd_hm_to.addAliasName("Cnd.end_schd_hm_to", p);
		p.Cnd_giSchd_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().giSchd_p());
		p.Cnd_giSchd_p_PPanel.setName("Cnd.giSchd_p");
		p.Cnd_gi_schd_dt_fr = p.Cnd_giSchd_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gi_schd_dt_fr.addAliasName("Cnd.gi_schd_dt_fr", p);
		p.Cnd_gi_schd_hm_fr = p.Cnd_giSchd_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gi_schd_hm_fr.addAliasName("Cnd.gi_schd_hm_fr", p);
		p.Cnd_gi_schd_dt_to = p.Cnd_giSchd_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gi_schd_dt_to.addAliasName("Cnd.gi_schd_dt_to", p);
		p.Cnd_gi_schd_hm_to = p.Cnd_giSchd_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_gi_schd_hm_to.addAliasName("Cnd.gi_schd_hm_to", p);
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
		p.Cnd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_wrk_no_p());
		p.Cnd_sno_wrk_no_p_PPanel.setName("Cnd.sno_wrk_no_p");
		p.Cnd_sno1 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
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
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_OperOrdSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Disp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDisp(MSBCP_OperOrdSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_OperOrdSrch p) {
		p.Rslt_gi_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$gi_schd_tm_p);
		p.Rslt_gi_schd_tm_p_PPanel.setName("Rslt.gi_schd_tm_p");
		p.columnRslt_gi_schd_dt = p.Rslt_gi_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_gi_schd_dt.addAliasName("Rslt.gi_schd_dt", p);
		p.columnRslt_gi_schd_hm = p.Rslt_gi_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_gi_schd_hm.addAliasName("Rslt.gi_schd_hm", p);
		p.Rslt_st_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$st_schd_tm_p);
		p.Rslt_st_schd_tm_p_PPanel.setName("Rslt.st_schd_tm_p");
		p.columnRslt_st_schd_dt = p.Rslt_st_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_st_schd_dt.addAliasName("Rslt.st_schd_dt", p);
		p.columnRslt_st_schd_hm = p.Rslt_st_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_st_schd_hm.addAliasName("Rslt.st_schd_hm", p);
		p.Rslt_end_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$end_schd_tm_p);
		p.Rslt_end_schd_tm_p_PPanel.setName("Rslt.end_schd_tm_p");
		p.columnRslt_end_schd_dt = p.Rslt_end_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_end_schd_dt.addAliasName("Rslt.end_schd_dt", p);
		p.columnRslt_end_schd_hm = p.Rslt_end_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_end_schd_hm.addAliasName("Rslt.end_schd_hm", p);
		p.Rslt_oper_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$oper_schd_qty_p);
		p.Rslt_oper_schd_qty_p_PPanel.setName("Rslt.oper_schd_qty_p");
		p.columnRslt_oper_schd_qty = p.Rslt_oper_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_schd_qty.addAliasName("Rslt.oper_schd_qty", p);
		p.Rslt_oper_unit_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$oper_unit_schd_qty_p);
		p.Rslt_oper_unit_schd_qty_p_PPanel.setName("Rslt.oper_unit_schd_qty_p");
		p.columnRslt_oper_unit_schd_qty = p.Rslt_oper_unit_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_schd_qty.addAliasName("Rslt.oper_unit_schd_qty", p);
		p.Rslt_oper_inst_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$oper_inst_schd_qty_p);
		p.Rslt_oper_inst_schd_qty_p_PPanel.setName("Rslt.oper_inst_schd_qty_p");
		p.columnRslt_oper_inst_schd_qty = p.Rslt_oper_inst_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_inst_schd_qty.addAliasName("Rslt.oper_inst_schd_qty", p);
		p.Rslt_oper_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$oper_act_qty_p);
		p.Rslt_oper_act_qty_p_PPanel.setName("Rslt.oper_act_qty_p");
		p.columnRslt_oper_act_qty = p.Rslt_oper_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_act_qty.addAliasName("Rslt.oper_act_qty", p);
		p.Rslt_inst_st_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$inst_st_schd_tm_p);
		p.Rslt_inst_st_schd_tm_p_PPanel.setName("Rslt.inst_st_schd_tm_p");
		p.columnRslt_inst_st_schd_dt = p.Rslt_inst_st_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_inst_st_schd_dt.addAliasName("Rslt.inst_st_schd_dt", p);
		p.columnRslt_inst_st_schd_hm = p.Rslt_inst_st_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_inst_st_schd_hm.addAliasName("Rslt.inst_st_schd_hm", p);
		p.Rslt_act_st_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$act_st_tm_p);
		p.Rslt_act_st_tm_p_PPanel.setName("Rslt.act_st_tm_p");
		p.columnRslt_act_st_dt = p.Rslt_act_st_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_act_st_dt.addAliasName("Rslt.act_st_dt", p);
		p.columnRslt_act_st_hm = p.Rslt_act_st_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_act_st_hm.addAliasName("Rslt.act_st_hm", p);
		p.Rslt_inst_end_schd_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$inst_end_schd_tm_p);
		p.Rslt_inst_end_schd_tm_p_PPanel.setName("Rslt.inst_end_schd_tm_p");
		p.columnRslt_inst_end_schd_dt = p.Rslt_inst_end_schd_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_inst_end_schd_dt.addAliasName("Rslt.inst_end_schd_dt", p);
		p.columnRslt_inst_end_schd_hm = p.Rslt_inst_end_schd_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_inst_end_schd_hm.addAliasName("Rslt.inst_end_schd_hm", p);
		p.Rslt_act_end_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$act_end_tm_p);
		p.Rslt_act_end_tm_p_PPanel.setName("Rslt.act_end_tm_p");
		p.columnRslt_act_end_dt = p.Rslt_act_end_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_act_end_dt.addAliasName("Rslt.act_end_dt", p);
		p.columnRslt_act_end_hm = p.Rslt_act_end_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_act_end_hm.addAliasName("Rslt.act_end_hm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$itm_p);
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
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$sno_wrk_no_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0100.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBCP_OperOrdSrch p) {
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
	
	
	/** [Cnd_mfg_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_site_cd_p = null;

	/**
	 * [Cnd_mfg_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_site_cd_ListPutter() {
		if (Cnd_mfg_site_cd_p == null) {
			Cnd_mfg_site_cd_p = createCnd_mfg_site_cd_ListPutter(Cnd_mfg_site_cd, "mfg_site_cd", "mfg_site_nm");

		}
		return Cnd_mfg_site_cd_p;
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
	
	
	/** [Rslt_itm_ord_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_itm_ord_sts_typ_p = null;

	/**
	 * [Rslt_itm_ord_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_ord_sts_typ_ListPutter() {
		if (Rslt_itm_ord_sts_typ_p == null) {
			Rslt_itm_ord_sts_typ_p = createRslt_itm_ord_sts_typ_ListPutter(columnRslt_itm_ord_sts_typ, "itm_ord_sts_typ");

		}
		return Rslt_itm_ord_sts_typ_p;
	}
	
	
	/** [Rslt_oper_ord_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_oper_ord_sts_typ_p = null;

	/**
	 * [Rslt_oper_ord_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_oper_ord_sts_typ_ListPutter() {
		if (Rslt_oper_ord_sts_typ_p == null) {
			Rslt_oper_ord_sts_typ_p = createRslt_oper_ord_sts_typ_ListPutter(columnRslt_oper_ord_sts_typ, "oper_ord_sts_typ", "oper_ord_sts_typ_nm");

		}
		return Rslt_oper_ord_sts_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OperOrdSrch create(){
		MSBCP_OperOrdSrch p = new MSBCP_OperOrdSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OperOrdSrch create(String name){
		MSBCP_OperOrdSrch p = new MSBCP_OperOrdSrch(name);
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
		MSBCP_OperOrdSrch_MC.jbfInitScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitTop((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitFold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitTab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitTab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitOperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitOrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitOrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitCnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitCnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitCtrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitRPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitDisp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitRslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbfInitBtn((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitTop((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitFold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitTab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitTab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitOperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitOrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitOrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitCnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitCnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitCtrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitRPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitDisp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitRslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.jbInitBtn((MSBCP_OperOrdSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_OperOrdSrch p) {
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
	protected static void jbfInitTab1(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [OperOrdSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOperOrdSts(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.OperOrdStsPanel = p.beansFactory.createPanel("OperOrdSts");
		p.OperOrdStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OrdRcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrdRcv(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.OrdRcvPanel = p.beansFactory.createPanel("OrdRcv");
		p.OrdRcvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OrdSnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrdSnd(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.OrdSndPanel = p.beansFactory.createPanel("OrdSnd");
		p.OrdSndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_IMP = p.beansFactory.createRadioButton("Cnd.ope_IMP");
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_sav_flg = p.beansFactory.createCheckBox("Cnd.sav_flg");
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_part_inst_flg = p.beansFactory.createCheckBox("Cnd.part_inst_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_ord_rcv_tgt_flg = p.beansFactory.createCheckBox("Cnd.ord_rcv_tgt_flg");
		p.Cnd_not_ord_rcv_tgt_flg = p.beansFactory.createCheckBox("Cnd.not_ord_rcv_tgt_flg");
		p.Cnd_ord_snd_tgt_flg = p.beansFactory.createCheckBox("Cnd.ord_snd_tgt_flg");
		p.Cnd_not_ord_snd_tgt_flg = p.beansFactory.createCheckBox("Cnd.not_ord_snd_tgt_flg");
		p.Cnd_mfg_st_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.mfg_st_schd_dt_fr_Label");
		p.Cnd_mfg_st_schd_dt_fr = p.beansFactory.createDateField("Cnd.mfg_st_schd_dt_fr");
		p.Cnd_mfg_st_schd_dt_fr.setLabel(p.Cnd_mfg_st_schd_dt_fr_Label);
		p.Cnd_mfg_st_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.mfg_st_schd_dt_to_Label");
		p.Cnd_mfg_st_schd_dt_to = p.beansFactory.createDateField("Cnd.mfg_st_schd_dt_to");
		p.Cnd_mfg_st_schd_dt_to.setLabel(p.Cnd_mfg_st_schd_dt_to_Label);
		p.Cnd_mfg_end_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.mfg_end_schd_dt_fr_Label");
		p.Cnd_mfg_end_schd_dt_fr = p.beansFactory.createDateField("Cnd.mfg_end_schd_dt_fr");
		p.Cnd_mfg_end_schd_dt_fr.setLabel(p.Cnd_mfg_end_schd_dt_fr_Label);
		p.Cnd_mfg_end_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.mfg_end_schd_dt_to_Label");
		p.Cnd_mfg_end_schd_dt_to = p.beansFactory.createDateField("Cnd.mfg_end_schd_dt_to");
		p.Cnd_mfg_end_schd_dt_to.setLabel(p.Cnd_mfg_end_schd_dt_to_Label);
		p.Cnd_gi_schd_flg = p.beansFactory.createCheckBox("Cnd.gi_schd_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_mfg_site_cd_Label = p.beansFactory.createLabel("Cnd.mfg_site_cd_Label");
		p.Cnd_mfg_site_cd = p.beansFactory.createTextComboBox("Cnd.mfg_site_cd");
		p.Cnd_mfg_site_cd.setLabel(p.Cnd_mfg_site_cd_Label);
		p.Cnd_mfg_site_nm = p.beansFactory.createTextField("Cnd.mfg_site_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_oper_ptn_Label = p.beansFactory.createLabel("Cnd.oper_ptn_Label");
		p.Cnd_oper_ptn = p.beansFactory.createTextField("Cnd.oper_ptn");
		p.Cnd_oper_ptn.setLabel(p.Cnd_oper_ptn_Label);
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_oper_seq_Label = p.beansFactory.createLabel("Cnd.oper_seq_Label");
		p.Cnd_oper_seq = p.beansFactory.createNumberField("Cnd.oper_seq");
		p.Cnd_oper_seq.setLabel(p.Cnd_oper_seq_Label);
		p.Cnd_oper_rsrc_Label = p.beansFactory.createLabel("Cnd.oper_rsrc_Label");
		p.Cnd_oper_rsrc = p.beansFactory.createTextField("Cnd.oper_rsrc");
		p.Cnd_oper_rsrc.setLabel(p.Cnd_oper_rsrc_Label);
		p.Cnd_oper_ord_no_Label = p.beansFactory.createLabel("Cnd.oper_ord_no_Label");
		p.Cnd_oper_ord_no = p.beansFactory.createTextField("Cnd.oper_ord_no");
		p.Cnd_oper_ord_no.setLabel(p.Cnd_oper_ord_no_Label);
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_rmrks_Label = p.beansFactory.createLabel("Cnd.rmrks_Label");
		p.Cnd_rmrks = p.beansFactory.createTextField("Cnd.rmrks");
		p.Cnd_rmrks.setLabel(p.Cnd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextField("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm_Label = p.beansFactory.createLabel("Cnd.ext_sys_nm_Label");
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_ext_sys_nm.setLabel(p.Cnd_ext_sys_nm_Label);
		p.Cnd_ext_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.ext_itm_ord_no_Label");
		p.Cnd_ext_itm_ord_no = p.beansFactory.createTextField("Cnd.ext_itm_ord_no");
		p.Cnd_ext_itm_ord_no.setLabel(p.Cnd_ext_itm_ord_no_Label);
		p.Cnd_ext_oper_ord_no_Label = p.beansFactory.createLabel("Cnd.ext_oper_ord_no_Label");
		p.Cnd_ext_oper_ord_no = p.beansFactory.createTextField("Cnd.ext_oper_ord_no");
		p.Cnd_ext_oper_ord_no.setLabel(p.Cnd_ext_oper_ord_no_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDisp(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.DispPanel = p.beansFactory.createPanel("Disp");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_oper_ord_no = p.beansFactory.createTableColumn("Rslt.oper_ord_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_ord_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_oper_ord_sts_typ = p.beansFactory.createTableColumn("Rslt.oper_ord_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_ord_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.oper_ord_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_oper_ptn = p.beansFactory.createTableColumn("Rslt.oper_ptn", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_dec_place = p.beansFactory.createTableColumn("Rslt.base_dec_place", MCColumnType.NUMBER);
		p.columnRslt_oper_unit_conv_rnd_typ = p.beansFactory.createTableColumn("Rslt.oper_unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_oper_unit_dec_place = p.beansFactory.createTableColumn("Rslt.oper_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_oper_std_qty = p.beansFactory.createTableColumn("Rslt.oper_std_qty", MCColumnType.NUMBER);
		p.columnRslt_oper_conv_qty = p.beansFactory.createTableColumn("Rslt.oper_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_unit_conv_rnd_typ = p.beansFactory.createTableColumn("Rslt.unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_oper_unit_cd = p.beansFactory.createTableColumn("Rslt.oper_unit_cd", MCColumnType.TEXT);
		p.columnRslt_oper_unit_nm = p.beansFactory.createTableColumn("Rslt.oper_unit_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_st_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_mfg_end_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_mfg_site_cd = p.beansFactory.createTableColumn("Rslt.mfg_site_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_site_nm = p.beansFactory.createTableColumn("Rslt.mfg_site_nm", MCColumnType.TEXT);
		p.columnRslt_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_oper_rsrc = p.beansFactory.createTableColumn("Rslt.oper_rsrc", MCColumnType.TEXT);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ord_rcv_flg = p.beansFactory.createTableColumn("Rslt.ord_rcv_flg", MCColumnType.CHECK);
		p.columnRslt_ord_snd_flg = p.beansFactory.createTableColumn("Rslt.ord_snd_flg", MCColumnType.CHECK);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_itm_ord_no = p.beansFactory.createTableColumn("Rslt.ext_itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_for_scheduler_frozen_flg = p.beansFactory.createTableColumn("Rslt.for_scheduler_frozen_flg", MCColumnType.CHECK);
		p.columnRslt_ext_oper_ord_no = p.beansFactory.createTableColumn("Rslt.ext_oper_ord_no", MCColumnType.TEXT);
		p.columnRslt_scheduler_frozen_flg = p.beansFactory.createTableColumn("Rslt.scheduler_frozen_flg", MCColumnType.CHECK);
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
		p.columnRslt_itm_order_upd_cntr = p.beansFactory.createTableColumn("Rslt.itm_order_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_rtn_sts_typ = p.beansFactory.createTableColumn("Rslt.rtn_sts_typ", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0080 = p.beansFactory.createButton("Btn.open_MSBCP0080", "open");
		p.Btn_open_MSBCP0090 = p.beansFactory.createButton("Btn.open_MSBCP0090", "open");
		p.Btn_open_MSBCP0060 = p.beansFactory.createButton("Btn.open_MSBCP0060", "open");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_OperOrdSrch p) {
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
	protected static void jbInitTop(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DispPanel);
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
	protected static void jbInitFold(MSBCP_OperOrdSrch p) {
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
	protected static void jbInitTab1(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.OperOrdStsPanel, null);
		p.Tab1Panel.setLastBeans(p.OperOrdStsPanel);
		p.OperOrdStsPanel.setNextBeans(p.OrdRcvPanel);
		p.Tab1Panel.add(p.OrdRcvPanel, null);
		p.OrdRcvPanel.setNextBeans(p.OrdSndPanel);
		p.Tab1Panel.add(p.OrdSndPanel, null);
		p.OrdSndPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [OperOrdSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOperOrdSts(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.OperOrdStsPanel.setBorder(p.OperOrdStsTitledBorder);
		p.OperOrdStsPanel.setValueCheck(false);
		p.OperOrdStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OperOrdStsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [OrdRcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrdRcv(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.OrdRcvPanel.setBorder(p.OrdRcvTitledBorder);
		p.OrdRcvPanel.setValueCheck(false);
		p.OrdRcvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OrdRcvPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [OrdSnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrdSnd(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.OrdSndPanel.setBorder(p.OrdSndTitledBorder);
		p.OrdSndPanel.setValueCheck(false);
		p.OrdSndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OrdSndPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_OperOrdSrch p) {
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
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_IMP);
		p.Cnd_ope_IMP.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_IMP);
		p.ScreenOpePanel.add(p.Cnd_ope_IMP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ope_META);
		p.OperOrdStsPanel.add(p.Cnd_opn_flg);
		p.OperOrdStsPanel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_sav_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.opn_flg_META);
		p.OperOrdStsPanel.add(p.Cnd_sav_flg);
		p.Cnd_sav_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.sav_flg_META);
		p.OperOrdStsPanel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_part_inst_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.fix_flg_META);
		p.OperOrdStsPanel.add(p.Cnd_part_inst_flg);
		p.Cnd_part_inst_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_part_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.part_inst_flg_META);
		p.OperOrdStsPanel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.inst_flg_META);
		p.OperOrdStsPanel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.cmpl_flg_META);
		p.OrdRcvPanel.add(p.Cnd_ord_rcv_tgt_flg);
		p.OrdRcvPanel.setLastBeans(p.Cnd_ord_rcv_tgt_flg);
		p.Cnd_ord_rcv_tgt_flg.setNextBeans(p.Cnd_not_ord_rcv_tgt_flg);
		p.Cnd_ord_rcv_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ord_rcv_tgt_flg_META);
		p.OrdRcvPanel.add(p.Cnd_not_ord_rcv_tgt_flg);
		p.Cnd_not_ord_rcv_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.not_ord_rcv_tgt_flg_META);
		p.OrdSndPanel.add(p.Cnd_ord_snd_tgt_flg);
		p.OrdSndPanel.setLastBeans(p.Cnd_ord_snd_tgt_flg);
		p.Cnd_ord_snd_tgt_flg.setNextBeans(p.Cnd_not_ord_snd_tgt_flg);
		p.Cnd_ord_snd_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ord_snd_tgt_flg_META);
		p.OrdSndPanel.add(p.Cnd_not_ord_snd_tgt_flg);
		p.Cnd_not_ord_snd_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.not_ord_snd_tgt_flg_META);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_mfg_st_schd_dt_fr);
		p.Cnd_mfg_st_schd_dt_fr.setNextBeans(p.Cnd_mfg_st_schd_dt_to);
		p.Cnd_mfg_st_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_st_schd_dt_fr_META);
		p.Cnd_mfg_st_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_to);
		p.Cnd_mfg_st_schd_dt_to.setNextBeans(p.Cnd_mfg_end_schd_dt_fr);
		p.Cnd_mfg_st_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_st_schd_dt_to_META);
		p.Cnd_mfg_st_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_fr);
		p.Cnd_mfg_end_schd_dt_fr.setNextBeans(p.Cnd_mfg_end_schd_dt_to);
		p.Cnd_mfg_end_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_end_schd_dt_fr_META);
		p.Cnd_mfg_end_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_to);
		p.Cnd_mfg_end_schd_dt_to.setNextBeans(p.Cnd_stSchd_p_PPanel);
		p.Cnd_mfg_end_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_end_schd_dt_to_META);
		p.Cnd_mfg_end_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_stSchd_p_PPanel);
		p.Cnd_stSchd_p_PPanel.setNextBeans(p.Cnd_endSchd_p_PPanel);
		p.CndPanel.add(p.Cnd_endSchd_p_PPanel);
		p.Cnd_endSchd_p_PPanel.setNextBeans(p.Cnd_gi_schd_flg);
		p.CndPanel.add(p.Cnd_gi_schd_flg);
		p.Cnd_gi_schd_flg.setNextBeans(p.Cnd_giSchd_p_PPanel);
		p.Cnd_gi_schd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.gi_schd_flg_META);
		p.CndPanel.add(p.Cnd_giSchd_p_PPanel);
		p.Cnd_giSchd_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mfg_site_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mfg_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_site_cd, true);
		p.Cnd_mfg_site_cd.setLinkBeans(p.Cnd_mfg_site_nm);
		p.CndPanel.add(p.Cnd_mfg_site_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_site_cd);
		p.Cnd_mfg_site_cd.setNextBeans(p.Cnd_mfg_site_nm);
		p.Cnd_mfg_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_site_cd_META);
		p.CndPanel.add(p.Cnd_mfg_site_nm);
		p.Cnd_mfg_site_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_site_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_site_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_oper_ptn);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.CndPanel.add(p.Cnd_oper_ptn_Label);
		p.CndPanel.add(p.Cnd_oper_ptn);
		p.Cnd_oper_ptn.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_oper_ptn.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.oper_ptn_META);
		p.setPluralValueEnable(p.Cnd_oper_ptn, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_oper_seq);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_oper_seq_Label);
		p.CndPanel.add(p.Cnd_oper_seq);
		p.Cnd_oper_seq.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_oper_seq.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.oper_seq_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_oper_rsrc);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_oper_rsrc_Label);
		p.CndPanel.add(p.Cnd_oper_rsrc);
		p.Cnd_oper_rsrc.setNextBeans(p.Cnd_oper_ord_no);
		p.Cnd_oper_rsrc.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.oper_rsrc_META);
		p.setPluralValueEnable(p.Cnd_oper_rsrc, true);
		p.CndPanel.add(p.Cnd_oper_ord_no_Label);
		p.CndPanel.add(p.Cnd_oper_ord_no);
		p.Cnd_oper_ord_no.setNextBeans(p.Cnd_itm_ord_no);
		p.Cnd_oper_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.oper_ord_no_META);
		p.setPluralValueEnable(p.Cnd_oper_ord_no, true);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_rmrks);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_itm_ord_no, true);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_ext_sys_cd);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_ext_sys_cd_Label);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ext_sys_cd_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_cd, true);
		p.CndPanel.add(p.Cnd_ext_sys_nm_Label);
		p.CndPanel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_ext_itm_ord_no);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ext_sys_nm_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_nm, true);
		p.CndPanel.add(p.Cnd_ext_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_ext_itm_ord_no);
		p.Cnd_ext_itm_ord_no.setNextBeans(p.Cnd_ext_oper_ord_no);
		p.Cnd_ext_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ext_itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_ext_itm_ord_no, true);
		p.CndPanel.add(p.Cnd_ext_oper_ord_no_Label);
		p.CndPanel.add(p.Cnd_ext_oper_ord_no);
		p.Cnd_ext_oper_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0100.CndR.ext_oper_ord_no_META);
		p.setPluralValueEnable(p.Cnd_ext_oper_ord_no, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_OperOrdSrch p) {
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
	protected static void jbInitRPnl(MSBCP_OperOrdSrch p) {
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
	 * [Disp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDisp(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.add(p.DispPanel);
		p.DispPanel.setNextBeans(p.RsltPanel);
		p.DispPanel.setValueCheck(false);
		p.DispPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_OperOrdSrch p) {
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
	protected static void jbInitBtn(MSBCP_OperOrdSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0080.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP0080);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setNextBeans(p.Btn_open_MSBCP0090);
		p.Btn_open_MSBCP0090.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP0090);
		p.Btn_open_MSBCP0090.setNextBeans(p.Btn_open_MSBCP0060);
		p.Btn_open_MSBCP0060.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBCP0060);
		p.Btn_open_MSBCP0060.setNextBeans(p.Btn_rdel);
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
		MSBCP_OperOrdSrch_MC.mcInitScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitTop((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitFold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitTab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitTab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitOperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitOrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitOrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitCnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitCnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitCtrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitRPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitDisp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitRslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.mcInitBtn((MSBCP_OperOrdSrch)this);

		// [UPD]ステータスのモードの設定
		MSBCP_OperOrdSrch_MC.statusInitUPD_ScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Top((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Fold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Tab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Tab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_OperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_OrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_OrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Cnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Cnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Ctrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_RPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Disp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Rslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitUPD_Btn((MSBCP_OperOrdSrch)this);

		// [FIX_U]ステータスのモードの設定
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_ScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Top((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Fold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Tab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Tab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_OperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_OrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_OrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Cnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Cnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Ctrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_RPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Disp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Rslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__U_Btn((MSBCP_OperOrdSrch)this);

		// [REF]ステータスのモードの設定
		MSBCP_OperOrdSrch_MC.statusInitREF_ScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Top((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Fold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Tab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Tab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_OperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_OrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_OrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Cnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Cnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Ctrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_RPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Disp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Rslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitREF_Btn((MSBCP_OperOrdSrch)this);

		// [IMP]ステータスのモードの設定
		MSBCP_OperOrdSrch_MC.statusInitIMP_ScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Top((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Fold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Tab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Tab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_OperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_OrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_OrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Cnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Cnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Ctrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_RPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Disp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Rslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitIMP_Btn((MSBCP_OperOrdSrch)this);

		// [INS]ステータスのモードの設定
		MSBCP_OperOrdSrch_MC.statusInitINS_ScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Top((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Fold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Tab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Tab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_OperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_OrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_OrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Cnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Cnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Ctrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_RPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Disp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Rslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitINS_Btn((MSBCP_OperOrdSrch)this);

		// [FIX_I]ステータスのモードの設定
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_ScreenOpe((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Top((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Fold((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Tab1((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Tab2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_OperOrdSts((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_OrdRcv((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_OrdSnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Cnd((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Cnd2((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Ctrl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_RPnl((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Disp((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Rslt((MSBCP_OperOrdSrch)this);
		MSBCP_OperOrdSrch_MC.statusInitFIX__I_Btn((MSBCP_OperOrdSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_OperOrdSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [OperOrdSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOperOrdSts(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [OrdRcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrdRcv(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [OrdSnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrdSnd(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_OperOrdSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_IMP.addAllListener(p);
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_sav_flg.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_part_inst_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_ord_rcv_tgt_flg.addAllListener(p);
		p.Cnd_not_ord_rcv_tgt_flg.addAllListener(p);
		p.Cnd_ord_snd_tgt_flg.addAllListener(p);
		p.Cnd_not_ord_snd_tgt_flg.addAllListener(p);
		p.Cnd_mfg_st_schd_dt_fr.setListListener(p);
		p.Cnd_mfg_st_schd_dt_fr.addAllListener(p);
		p.Cnd_mfg_st_schd_dt_to.setListListener(p);
		p.Cnd_mfg_st_schd_dt_to.addAllListener(p);
		p.Cnd_mfg_end_schd_dt_fr.setListListener(p);
		p.Cnd_mfg_end_schd_dt_fr.addAllListener(p);
		p.Cnd_mfg_end_schd_dt_to.setListListener(p);
		p.Cnd_mfg_end_schd_dt_to.addAllListener(p);
		p.Cnd_gi_schd_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_mfg_site_cd.setListListener(p);
		p.Cnd_mfg_site_cd.addAllListener(p);
		p.Cnd_mfg_site_nm.setListListener(p);
		p.Cnd_mfg_site_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_oper_ptn.setListListener(p);
		p.Cnd_oper_ptn.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_oper_seq.setListListener(p);
		p.Cnd_oper_seq.addAllListener(p);
		p.Cnd_oper_rsrc.setListListener(p);
		p.Cnd_oper_rsrc.addAllListener(p);
		p.Cnd_oper_ord_no.setListListener(p);
		p.Cnd_oper_ord_no.addAllListener(p);
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_ext_itm_ord_no.setListListener(p);
		p.Cnd_ext_itm_ord_no.addAllListener(p);
		p.Cnd_ext_oper_ord_no.setListListener(p);
		p.Cnd_ext_oper_ord_no.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_OperOrdSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_OperOrdSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Disp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDisp(MSBCP_OperOrdSrch p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_OperOrdSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_oper_ord_no.addAllListener(p);
		p.columnRslt_oper_ord_no.setListListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_itm_ord_sts_typ.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ.setListListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.setListListener(p);
		p.columnRslt_oper_ord_sts_typ.addAllListener(p);
		p.columnRslt_oper_ord_sts_typ.setListListener(p);
		p.columnRslt_oper_ord_sts_typ_nm.addAllListener(p);
		p.columnRslt_oper_ord_sts_typ_nm.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_oper_ptn.addAllListener(p);
		p.columnRslt_oper_ptn.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_dec_place.addAllListener(p);
		p.columnRslt_base_dec_place.setListListener(p);
		p.columnRslt_oper_unit_conv_rnd_typ.addAllListener(p);
		p.columnRslt_oper_unit_conv_rnd_typ.setListListener(p);
		p.columnRslt_oper_unit_dec_place.addAllListener(p);
		p.columnRslt_oper_unit_dec_place.setListListener(p);
		p.columnRslt_oper_std_qty.addAllListener(p);
		p.columnRslt_oper_std_qty.setListListener(p);
		p.columnRslt_oper_conv_qty.addAllListener(p);
		p.columnRslt_oper_conv_qty.setListListener(p);
		p.columnRslt_unit_conv_rnd_typ.addAllListener(p);
		p.columnRslt_unit_conv_rnd_typ.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_oper_unit_cd.addAllListener(p);
		p.columnRslt_oper_unit_cd.setListListener(p);
		p.columnRslt_oper_unit_nm.addAllListener(p);
		p.columnRslt_oper_unit_nm.setListListener(p);
		p.columnRslt_mfg_st_schd_dt.addAllListener(p);
		p.columnRslt_mfg_st_schd_dt.setListListener(p);
		p.columnRslt_mfg_end_schd_dt.addAllListener(p);
		p.columnRslt_mfg_end_schd_dt.setListListener(p);
		p.columnRslt_mfg_site_cd.addAllListener(p);
		p.columnRslt_mfg_site_cd.setListListener(p);
		p.columnRslt_mfg_site_nm.addAllListener(p);
		p.columnRslt_mfg_site_nm.setListListener(p);
		p.columnRslt_loc_grp_cd.addAllListener(p);
		p.columnRslt_loc_grp_cd.setListListener(p);
		p.columnRslt_loc_grp_nm.addAllListener(p);
		p.columnRslt_loc_grp_nm.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_oper_rsrc.addAllListener(p);
		p.columnRslt_oper_rsrc.setListListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ord_rcv_flg.addAllListener(p);
		p.columnRslt_ord_snd_flg.addAllListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_itm_ord_no.addAllListener(p);
		p.columnRslt_ext_itm_ord_no.setListListener(p);
		p.columnRslt_for_scheduler_frozen_flg.addAllListener(p);
		p.columnRslt_ext_oper_ord_no.addAllListener(p);
		p.columnRslt_ext_oper_ord_no.setListListener(p);
		p.columnRslt_scheduler_frozen_flg.addAllListener(p);
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
		p.columnRslt_itm_order_upd_cntr.addAllListener(p);
		p.columnRslt_itm_order_upd_cntr.setListListener(p);
		p.columnRslt_rtn_sts_typ.addAllListener(p);
		p.columnRslt_rtn_sts_typ.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_OperOrdSrch p) {
		p.Btn_open_MSBCP0080.addAllListener(p);
		p.Btn_open_MSBCP0080.setAPMethodName("doBtn_open_MSBCP0080");
		p.Btn_open_MSBCP0090.addAllListener(p);
		p.Btn_open_MSBCP0090.setAPMethodName("doBtn_open_MSBCP0090");
		p.Btn_open_MSBCP0060.addAllListener(p);
		p.Btn_open_MSBCP0060.setAPMethodName("doBtn_open_MSBCP0060");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[OperOrdSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_OperOrdSts(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_OrdRcv(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_OrdSnd(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBCP_OperOrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stSchd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_endSchd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_giSchd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_ptn.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_seq.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_oper_rsrc.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_oper_ord_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBCP_OperOrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Disp(MSBCP_OperOrdSrch p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBCP_OperOrdSrch p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_oper_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_oper_ord_sts_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_oper_ord_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_gi_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_end_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_oper_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_conv_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_oper_std_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_oper_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_unit_conv_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_oper_inst_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_inst_st_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_st_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_inst_end_schd_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_end_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_oper_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rtn_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_OperOrdSrch p){
		p.Btn_open_MSBCP0080.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[OperOrdSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_OperOrdSts(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_OrdRcv(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_OrdSnd(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBCP_OperOrdSrch p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stSchd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_endSchd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_giSchd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_ptn.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_seq.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_oper_rsrc.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_oper_ord_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBCP_OperOrdSrch p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Disp(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBCP_OperOrdSrch p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.REQUIRED);
		p.columnRslt_oper_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_oper_ord_sts_typ.putMode(p, FIX_U, MCMode.REQUIRED);
		p.columnRslt_oper_ord_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_gi_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_end_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_oper_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_conv_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_oper_std_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_oper_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_unit_conv_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_oper_inst_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_inst_st_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_st_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_inst_end_schd_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_end_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, FIX_U, MCMode.ENABLE);
		p.columnRslt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.columnRslt_ord_rcv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_oper_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rtn_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBCP_OperOrdSrch p){
		p.Btn_open_MSBCP0080.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[OperOrdSts]ブロックのモードの設定
	 */
	protected static void statusInitREF_OperOrdSts(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitREF_OrdRcv(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_OrdSnd(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_OperOrdSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stSchd_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_endSchd_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_giSchd_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_ptn.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_seq.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_oper_rsrc.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_oper_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBCP_OperOrdSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitREF_Disp(MSBCP_OperOrdSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBCP_OperOrdSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_ord_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_gi_schd_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_schd_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_schd_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_oper_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_conv_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_std_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_unit_conv_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_oper_inst_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_inst_st_schd_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_st_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_inst_end_schd_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_end_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_oper_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rtn_sts_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_OperOrdSrch p){
		p.Btn_open_MSBCP0080.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [IMP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitIMP_ScreenOpe(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Top(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Fold(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Tab1(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Tab2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[OperOrdSts]ブロックのモードの設定
	 */
	protected static void statusInitIMP_OperOrdSts(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitIMP_OrdRcv(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitIMP_OrdSnd(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Cnd(MSBCP_OperOrdSrch p){
		p.Cnd_ope_Group.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_stSchd_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_endSchd_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_flg.putMode(p, IMP, MCMode.REQUIRED);
		p.Cnd_giSchd_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_oper_ptn.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_oper_seq.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(IMP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_oper_rsrc.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_ext_oper_ord_no.putMode(p, IMP, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [IMP]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Cnd2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Ctrl(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitIMP_RPnl(MSBCP_OperOrdSrch p){
		p.RPnl_dwnld.putMode(p, IMP, MCMode.DISABLE);

	}

	/**
	 * [IMP]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Disp(MSBCP_OperOrdSrch p){

	}

	/**
	 * [IMP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Rslt(MSBCP_OperOrdSrch p){
		p.columnRslt_check.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_oper_ord_sts_typ.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_sts_typ_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, IMP, MCMode.READ_ONLY);
		p.Rslt_gi_schd_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_schd_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_schd_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_oper_schd_qty_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_conv_rnd_typ.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_oper_std_qty.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_oper_conv_qty.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_unit_conv_rnd_typ.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, IMP, MCMode.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.Rslt_oper_inst_schd_qty_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_act_qty_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, IMP, MCMode.READ_ONLY);
		p.Rslt_inst_st_schd_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_st_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_inst_end_schd_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_end_tm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(IMP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ext_oper_ord_no.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, IMP, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(IMP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, IMP, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, IMP, MCMode.INVISIBLE);
		p.columnRslt_rtn_sts_typ.putMode(p, IMP, MCMode.INVISIBLE);

	}

	/**
	 * [IMP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitIMP_Btn(MSBCP_OperOrdSrch p){
		p.Btn_open_MSBCP0080.putMode(p, IMP, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, IMP, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, IMP, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, IMP, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, IMP, MCMode.DISABLE);
		p.Btn_upd.putMode(p, IMP, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[OperOrdSts]ブロックのモードの設定
	 */
	protected static void statusInitINS_OperOrdSts(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitINS_OrdRcv(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_OrdSnd(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBCP_OperOrdSrch p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_stSchd_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_endSchd_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_giSchd_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_oper_ptn.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_oper_seq.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_oper_rsrc.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_oper_ord_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBCP_OperOrdSrch p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitINS_Disp(MSBCP_OperOrdSrch p){

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBCP_OperOrdSrch p){
		p.columnRslt_check.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_ord_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_gi_schd_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_schd_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_schd_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_oper_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_conv_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_std_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_unit_conv_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_oper_inst_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_act_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_inst_st_schd_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_st_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_inst_end_schd_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_end_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_oper_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_rtn_sts_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBCP_OperOrdSrch p){
		p.Btn_open_MSBCP0080.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Top(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab1(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[OperOrdSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_OperOrdSts(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_OrdRcv(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_OrdSnd(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBCP_OperOrdSrch p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_stSchd_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_endSchd_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_giSchd_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_oper_ptn.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_oper_seq.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_oper_rsrc.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_oper_ord_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd2(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ctrl(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RPnl(MSBCP_OperOrdSrch p){
		p.RPnl_dwnld.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Disp(MSBCP_OperOrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rslt(MSBCP_OperOrdSrch p){
		p.columnRslt_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_oper_ord_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_gi_schd_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_schd_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_schd_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_oper_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_conv_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_oper_std_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_oper_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_unit_conv_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_oper_inst_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_act_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_inst_st_schd_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_st_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_inst_end_schd_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_act_end_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_oper_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_rtn_sts_typ.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBCP_OperOrdSrch p){
		p.Btn_open_MSBCP0080.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);

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
		MSBCP_OperOrdSrch_MC.setTableConfigRslt((MSBCP_OperOrdSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_OperOrdSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_oper_ord_no.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ord_no);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_itm_ord_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_ord_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ);
		p.columnRslt_itm_ord_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_ord_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ_nm);
		p.columnRslt_oper_ord_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_ord_sts_typ_META);
		p.columnRslt_oper_ord_sts_typ.addLinkBeans(p.columnRslt_oper_ord_sts_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ord_sts_typ);
		p.columnRslt_oper_ord_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_ord_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ord_sts_typ_nm);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_oper_ptn.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ptn);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.RsltTable.addTable(p.Rslt_gi_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_st_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_end_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_oper_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_dec_place.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.base_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dec_place);
		p.columnRslt_oper_unit_conv_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_unit_conv_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_conv_rnd_typ);
		p.columnRslt_oper_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_dec_place);
		p.columnRslt_oper_std_qty.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_std_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_std_qty);
		p.columnRslt_oper_conv_qty.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_conv_qty);
		p.columnRslt_unit_conv_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.unit_conv_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_conv_rnd_typ);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.RsltTable.addTable(p.Rslt_oper_unit_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_oper_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_cd);
		p.columnRslt_oper_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_nm);
		p.RsltTable.addTable(p.Rslt_oper_inst_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_oper_act_qty_p_PPanel.QtyTable);
		p.columnRslt_mfg_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.mfg_st_schd_dt_META);
		p.columnRslt_mfg_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_st_schd_dt);
		p.columnRslt_mfg_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.mfg_end_schd_dt_META);
		p.columnRslt_mfg_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_end_schd_dt);
		p.RsltTable.addTable(p.Rslt_inst_st_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_act_st_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_inst_end_schd_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_act_end_tm_p_PPanel.YmdHmTable);
		p.columnRslt_mfg_site_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.mfg_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_site_cd);
		p.columnRslt_mfg_site_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.mfg_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_site_nm);
		p.columnRslt_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_cd);
		p.columnRslt_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_nm);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_oper_rsrc.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.oper_rsrc_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_rsrc);
		p.columnRslt_rmrks.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_ord_rcv_flg.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ord_rcv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_rcv_flg);
		p.columnRslt_ord_snd_flg.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ord_snd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_snd_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ext_itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_itm_ord_no);
		p.columnRslt_for_scheduler_frozen_flg.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.for_scheduler_frozen_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_for_scheduler_frozen_flg);
		p.columnRslt_ext_oper_ord_no.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ext_oper_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_oper_ord_no);
		p.columnRslt_scheduler_frozen_flg.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.scheduler_frozen_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_scheduler_frozen_flg);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_itm_order_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.itm_order_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_order_upd_cntr);
		p.columnRslt_rtn_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0100.RsltR.rtn_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rtn_sts_typ);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_mfg_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_site_cd.getListConfig().setPutter(getCnd_mfg_site_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		columnRslt_itm_ord_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_ord_sts_typ.getListConfig().setPutter(getRslt_itm_ord_sts_typ_ListPutter());
		columnRslt_oper_ord_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_ord_sts_typ.getListConfig().setPutter(getRslt_oper_ord_sts_typ_ListPutter());
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[IMP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setIMPStatus() {
		status = IMP;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (IMP.equals(status)) {
			setIMPStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
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
	 * [Cnd_mfg_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
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
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
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
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_ord_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_ord_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_oper_ord_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_oper_ord_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.OperOrdStsTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_mfg_site_cd) return getCnd_mfg_site_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == columnRslt_itm_ord_sts_typ) return getRslt_itm_ord_sts_typ(row, info);
		if(combo == columnRslt_oper_ord_sts_typ) return getRslt_oper_ord_sts_typ(row, info);
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
		else if (ap == Btn_open_MSBCP0080) doBtn_open_MSBCP0080(info);
		else if (ap == Btn_open_MSBCP0090) doBtn_open_MSBCP0090(info);
		else if (ap == Btn_open_MSBCP0060) doBtn_open_MSBCP0060(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
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
	 * [Btn]パネルの[open_MSBCP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0090(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0060(MCEventInfo info);

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
		if (vc == Cnd_opn_flg) return doCnd_opn_flg_VC(info);
		if (vc == Cnd_sav_flg) return doCnd_sav_flg_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_part_inst_flg) return doCnd_part_inst_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_ord_rcv_tgt_flg) return doCnd_ord_rcv_tgt_flg_VC(info);
		if (vc == Cnd_not_ord_rcv_tgt_flg) return doCnd_not_ord_rcv_tgt_flg_VC(info);
		if (vc == Cnd_ord_snd_tgt_flg) return doCnd_ord_snd_tgt_flg_VC(info);
		if (vc == Cnd_not_ord_snd_tgt_flg) return doCnd_not_ord_snd_tgt_flg_VC(info);
		if (vc == Cnd_mfg_st_schd_dt_fr) return doCnd_mfg_st_schd_dt_fr_VC(info);
		if (vc == Cnd_mfg_st_schd_dt_to) return doCnd_mfg_st_schd_dt_to_VC(info);
		if (vc == Cnd_mfg_end_schd_dt_fr) return doCnd_mfg_end_schd_dt_fr_VC(info);
		if (vc == Cnd_mfg_end_schd_dt_to) return doCnd_mfg_end_schd_dt_to_VC(info);
		if (vc == Cnd_gi_schd_flg) return doCnd_gi_schd_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_mfg_site_cd) return doCnd_mfg_site_cd_VC(info);
		if (vc == Cnd_mfg_site_nm) return doCnd_mfg_site_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_oper_ptn) return doCnd_oper_ptn_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_oper_seq) return doCnd_oper_seq_VC(info);
		if (vc == Cnd_oper_rsrc) return doCnd_oper_rsrc_VC(info);
		if (vc == Cnd_oper_ord_no) return doCnd_oper_ord_no_VC(info);
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_ext_itm_ord_no) return doCnd_ext_itm_ord_no_VC(info);
		if (vc == Cnd_ext_oper_ord_no) return doCnd_ext_oper_ord_no_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_oper_ord_no) return doRslt_oper_ord_no_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ) return doRslt_itm_ord_sts_typ_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ_nm) return doRslt_itm_ord_sts_typ_nm_VC(info);
		if (vc == columnRslt_oper_ord_sts_typ) return doRslt_oper_ord_sts_typ_VC(info);
		if (vc == columnRslt_oper_ord_sts_typ_nm) return doRslt_oper_ord_sts_typ_nm_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_oper_ptn) return doRslt_oper_ptn_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_dec_place) return doRslt_base_dec_place_VC(info);
		if (vc == columnRslt_oper_unit_conv_rnd_typ) return doRslt_oper_unit_conv_rnd_typ_VC(info);
		if (vc == columnRslt_oper_unit_dec_place) return doRslt_oper_unit_dec_place_VC(info);
		if (vc == columnRslt_oper_std_qty) return doRslt_oper_std_qty_VC(info);
		if (vc == columnRslt_oper_conv_qty) return doRslt_oper_conv_qty_VC(info);
		if (vc == columnRslt_unit_conv_rnd_typ) return doRslt_unit_conv_rnd_typ_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_oper_unit_cd) return doRslt_oper_unit_cd_VC(info);
		if (vc == columnRslt_oper_unit_nm) return doRslt_oper_unit_nm_VC(info);
		if (vc == columnRslt_mfg_st_schd_dt) return doRslt_mfg_st_schd_dt_VC(info);
		if (vc == columnRslt_mfg_end_schd_dt) return doRslt_mfg_end_schd_dt_VC(info);
		if (vc == columnRslt_mfg_site_cd) return doRslt_mfg_site_cd_VC(info);
		if (vc == columnRslt_mfg_site_nm) return doRslt_mfg_site_nm_VC(info);
		if (vc == columnRslt_loc_grp_cd) return doRslt_loc_grp_cd_VC(info);
		if (vc == columnRslt_loc_grp_nm) return doRslt_loc_grp_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_oper_rsrc) return doRslt_oper_rsrc_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ord_rcv_flg) return doRslt_ord_rcv_flg_VC(info);
		if (vc == columnRslt_ord_snd_flg) return doRslt_ord_snd_flg_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_itm_ord_no) return doRslt_ext_itm_ord_no_VC(info);
		if (vc == columnRslt_for_scheduler_frozen_flg) return doRslt_for_scheduler_frozen_flg_VC(info);
		if (vc == columnRslt_ext_oper_ord_no) return doRslt_ext_oper_ord_no_VC(info);
		if (vc == columnRslt_scheduler_frozen_flg) return doRslt_scheduler_frozen_flg_VC(info);
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
		if (vc == columnRslt_itm_order_upd_cntr) return doRslt_itm_order_upd_cntr_VC(info);
		if (vc == columnRslt_rtn_sts_typ) return doRslt_rtn_sts_typ_VC(info);
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
	 * [Cnd]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sav_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[part_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_rcv_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ord_rcv_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_snd_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ord_snd_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_st_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_st_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_end_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_end_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_schd_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_site_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_ptn_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_rsrc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_ord_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_oper_ord_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ord_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_ord_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ord_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ord_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ptn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_seq_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_conv_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_std_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_std_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_rsrc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_rsrc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ord_rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_snd_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_for_scheduler_frozen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_scheduler_frozen_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_order_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rtn_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rtn_sts_typ_VC(MCEventInfo info){
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
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_sav_flg) doCnd_sav_flg_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_part_inst_flg) doCnd_part_inst_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_ord_rcv_tgt_flg) doCnd_ord_rcv_tgt_flg_NC(info);
		else if (nc == Cnd_not_ord_rcv_tgt_flg) doCnd_not_ord_rcv_tgt_flg_NC(info);
		else if (nc == Cnd_ord_snd_tgt_flg) doCnd_ord_snd_tgt_flg_NC(info);
		else if (nc == Cnd_not_ord_snd_tgt_flg) doCnd_not_ord_snd_tgt_flg_NC(info);
		else if (nc == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_NC(info);
		else if (nc == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_NC(info);
		else if (nc == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_NC(info);
		else if (nc == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_NC(info);
		else if (nc == Cnd_gi_schd_flg) doCnd_gi_schd_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_mfg_site_cd) doCnd_mfg_site_cd_NC(info);
		else if (nc == Cnd_mfg_site_nm) doCnd_mfg_site_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_oper_ptn) doCnd_oper_ptn_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_oper_seq) doCnd_oper_seq_NC(info);
		else if (nc == Cnd_oper_rsrc) doCnd_oper_rsrc_NC(info);
		else if (nc == Cnd_oper_ord_no) doCnd_oper_ord_no_NC(info);
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_NC(info);
		else if (nc == Cnd_ext_oper_ord_no) doCnd_ext_oper_ord_no_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_oper_ord_no) doRslt_oper_ord_no_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NC(info);
		else if (nc == columnRslt_oper_ord_sts_typ) doRslt_oper_ord_sts_typ_NC(info);
		else if (nc == columnRslt_oper_ord_sts_typ_nm) doRslt_oper_ord_sts_typ_nm_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_oper_ptn) doRslt_oper_ptn_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_dec_place) doRslt_base_dec_place_NC(info);
		else if (nc == columnRslt_oper_unit_conv_rnd_typ) doRslt_oper_unit_conv_rnd_typ_NC(info);
		else if (nc == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NC(info);
		else if (nc == columnRslt_oper_std_qty) doRslt_oper_std_qty_NC(info);
		else if (nc == columnRslt_oper_conv_qty) doRslt_oper_conv_qty_NC(info);
		else if (nc == columnRslt_unit_conv_rnd_typ) doRslt_unit_conv_rnd_typ_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NC(info);
		else if (nc == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NC(info);
		else if (nc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NC(info);
		else if (nc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NC(info);
		else if (nc == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_NC(info);
		else if (nc == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_NC(info);
		else if (nc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NC(info);
		else if (nc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_oper_rsrc) doRslt_oper_rsrc_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ord_rcv_flg) doRslt_ord_rcv_flg_NC(info);
		else if (nc == columnRslt_ord_snd_flg) doRslt_ord_snd_flg_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_NC(info);
		else if (nc == columnRslt_for_scheduler_frozen_flg) doRslt_for_scheduler_frozen_flg_NC(info);
		else if (nc == columnRslt_ext_oper_ord_no) doRslt_ext_oper_ord_no_NC(info);
		else if (nc == columnRslt_scheduler_frozen_flg) doRslt_scheduler_frozen_flg_NC(info);
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
		else if (nc == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_NC(info);
		else if (nc == columnRslt_rtn_sts_typ) doRslt_rtn_sts_typ_NC(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_rcv_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_rcv_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_snd_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_snd_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ptn_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_rsrc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ord_rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_snd_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_scheduler_frozen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_scheduler_frozen_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rtn_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rtn_sts_typ_NC(MCEventInfo info){
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
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_sav_flg) doCnd_sav_flg_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_part_inst_flg) doCnd_part_inst_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_ord_rcv_tgt_flg) doCnd_ord_rcv_tgt_flg_NE(info);
		else if (ne == Cnd_not_ord_rcv_tgt_flg) doCnd_not_ord_rcv_tgt_flg_NE(info);
		else if (ne == Cnd_ord_snd_tgt_flg) doCnd_ord_snd_tgt_flg_NE(info);
		else if (ne == Cnd_not_ord_snd_tgt_flg) doCnd_not_ord_snd_tgt_flg_NE(info);
		else if (ne == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_NE(info);
		else if (ne == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_NE(info);
		else if (ne == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_NE(info);
		else if (ne == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_NE(info);
		else if (ne == Cnd_gi_schd_flg) doCnd_gi_schd_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_mfg_site_cd) doCnd_mfg_site_cd_NE(info);
		else if (ne == Cnd_mfg_site_nm) doCnd_mfg_site_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_oper_ptn) doCnd_oper_ptn_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_oper_seq) doCnd_oper_seq_NE(info);
		else if (ne == Cnd_oper_rsrc) doCnd_oper_rsrc_NE(info);
		else if (ne == Cnd_oper_ord_no) doCnd_oper_ord_no_NE(info);
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_NE(info);
		else if (ne == Cnd_ext_oper_ord_no) doCnd_ext_oper_ord_no_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_oper_ord_no) doRslt_oper_ord_no_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NE(info);
		else if (ne == columnRslt_oper_ord_sts_typ) doRslt_oper_ord_sts_typ_NE(info);
		else if (ne == columnRslt_oper_ord_sts_typ_nm) doRslt_oper_ord_sts_typ_nm_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_oper_ptn) doRslt_oper_ptn_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_dec_place) doRslt_base_dec_place_NE(info);
		else if (ne == columnRslt_oper_unit_conv_rnd_typ) doRslt_oper_unit_conv_rnd_typ_NE(info);
		else if (ne == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NE(info);
		else if (ne == columnRslt_oper_std_qty) doRslt_oper_std_qty_NE(info);
		else if (ne == columnRslt_oper_conv_qty) doRslt_oper_conv_qty_NE(info);
		else if (ne == columnRslt_unit_conv_rnd_typ) doRslt_unit_conv_rnd_typ_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NE(info);
		else if (ne == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NE(info);
		else if (ne == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NE(info);
		else if (ne == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NE(info);
		else if (ne == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_NE(info);
		else if (ne == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_NE(info);
		else if (ne == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NE(info);
		else if (ne == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_oper_rsrc) doRslt_oper_rsrc_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ord_rcv_flg) doRslt_ord_rcv_flg_NE(info);
		else if (ne == columnRslt_ord_snd_flg) doRslt_ord_snd_flg_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_NE(info);
		else if (ne == columnRslt_for_scheduler_frozen_flg) doRslt_for_scheduler_frozen_flg_NE(info);
		else if (ne == columnRslt_ext_oper_ord_no) doRslt_ext_oper_ord_no_NE(info);
		else if (ne == columnRslt_scheduler_frozen_flg) doRslt_scheduler_frozen_flg_NE(info);
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
		else if (ne == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_NE(info);
		else if (ne == columnRslt_rtn_sts_typ) doRslt_rtn_sts_typ_NE(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_rcv_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_rcv_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_snd_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_snd_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ptn_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_rsrc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ord_rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_snd_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_scheduler_frozen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_scheduler_frozen_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rtn_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rtn_sts_typ_NE(MCEventInfo info){
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
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_sav_flg) doCnd_sav_flg_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_part_inst_flg) doCnd_part_inst_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_ord_rcv_tgt_flg) doCnd_ord_rcv_tgt_flg_NX(info);
		else if (nx == Cnd_not_ord_rcv_tgt_flg) doCnd_not_ord_rcv_tgt_flg_NX(info);
		else if (nx == Cnd_ord_snd_tgt_flg) doCnd_ord_snd_tgt_flg_NX(info);
		else if (nx == Cnd_not_ord_snd_tgt_flg) doCnd_not_ord_snd_tgt_flg_NX(info);
		else if (nx == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_NX(info);
		else if (nx == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_NX(info);
		else if (nx == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_NX(info);
		else if (nx == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_NX(info);
		else if (nx == Cnd_gi_schd_flg) doCnd_gi_schd_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_mfg_site_cd) doCnd_mfg_site_cd_NX(info);
		else if (nx == Cnd_mfg_site_nm) doCnd_mfg_site_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_oper_ptn) doCnd_oper_ptn_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_oper_seq) doCnd_oper_seq_NX(info);
		else if (nx == Cnd_oper_rsrc) doCnd_oper_rsrc_NX(info);
		else if (nx == Cnd_oper_ord_no) doCnd_oper_ord_no_NX(info);
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_NX(info);
		else if (nx == Cnd_ext_oper_ord_no) doCnd_ext_oper_ord_no_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_oper_ord_no) doRslt_oper_ord_no_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NX(info);
		else if (nx == columnRslt_oper_ord_sts_typ) doRslt_oper_ord_sts_typ_NX(info);
		else if (nx == columnRslt_oper_ord_sts_typ_nm) doRslt_oper_ord_sts_typ_nm_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_oper_ptn) doRslt_oper_ptn_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_dec_place) doRslt_base_dec_place_NX(info);
		else if (nx == columnRslt_oper_unit_conv_rnd_typ) doRslt_oper_unit_conv_rnd_typ_NX(info);
		else if (nx == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NX(info);
		else if (nx == columnRslt_oper_std_qty) doRslt_oper_std_qty_NX(info);
		else if (nx == columnRslt_oper_conv_qty) doRslt_oper_conv_qty_NX(info);
		else if (nx == columnRslt_unit_conv_rnd_typ) doRslt_unit_conv_rnd_typ_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NX(info);
		else if (nx == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NX(info);
		else if (nx == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NX(info);
		else if (nx == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NX(info);
		else if (nx == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_NX(info);
		else if (nx == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_NX(info);
		else if (nx == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NX(info);
		else if (nx == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_oper_rsrc) doRslt_oper_rsrc_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ord_rcv_flg) doRslt_ord_rcv_flg_NX(info);
		else if (nx == columnRslt_ord_snd_flg) doRslt_ord_snd_flg_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_NX(info);
		else if (nx == columnRslt_for_scheduler_frozen_flg) doRslt_for_scheduler_frozen_flg_NX(info);
		else if (nx == columnRslt_ext_oper_ord_no) doRslt_ext_oper_ord_no_NX(info);
		else if (nx == columnRslt_scheduler_frozen_flg) doRslt_scheduler_frozen_flg_NX(info);
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
		else if (nx == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_NX(info);
		else if (nx == columnRslt_rtn_sts_typ) doRslt_rtn_sts_typ_NX(info);
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
	 * [Cnd]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_rcv_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_rcv_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_snd_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_snd_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ptn_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_rsrc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ord_rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_snd_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_scheduler_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_scheduler_frozen_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rtn_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rtn_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_LC(info);
		else if (lc == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_LC(info);
		else if (lc == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_LC(info);
		else if (lc == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_mfg_site_cd) doCnd_mfg_site_cd_LC(info);
		else if (lc == Cnd_mfg_site_nm) doCnd_mfg_site_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_oper_ptn) doCnd_oper_ptn_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_oper_seq) doCnd_oper_seq_LC(info);
		else if (lc == Cnd_oper_rsrc) doCnd_oper_rsrc_LC(info);
		else if (lc == Cnd_oper_ord_no) doCnd_oper_ord_no_LC(info);
		else if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_LC(info);
		else if (lc == Cnd_ext_oper_ord_no) doCnd_ext_oper_ord_no_LC(info);
		else if (lc == columnRslt_oper_ord_no) doRslt_oper_ord_no_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_LC(info);
		else if (lc == columnRslt_oper_ord_sts_typ) doRslt_oper_ord_sts_typ_LC(info);
		else if (lc == columnRslt_oper_ord_sts_typ_nm) doRslt_oper_ord_sts_typ_nm_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_oper_ptn) doRslt_oper_ptn_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_dec_place) doRslt_base_dec_place_LC(info);
		else if (lc == columnRslt_oper_unit_conv_rnd_typ) doRslt_oper_unit_conv_rnd_typ_LC(info);
		else if (lc == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_LC(info);
		else if (lc == columnRslt_oper_std_qty) doRslt_oper_std_qty_LC(info);
		else if (lc == columnRslt_oper_conv_qty) doRslt_oper_conv_qty_LC(info);
		else if (lc == columnRslt_unit_conv_rnd_typ) doRslt_unit_conv_rnd_typ_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_LC(info);
		else if (lc == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_LC(info);
		else if (lc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_LC(info);
		else if (lc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_LC(info);
		else if (lc == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_LC(info);
		else if (lc == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_LC(info);
		else if (lc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_LC(info);
		else if (lc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_oper_rsrc) doRslt_oper_rsrc_LC(info);
		else if (lc == columnRslt_rmrks) doRslt_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_LC(info);
		else if (lc == columnRslt_ext_oper_ord_no) doRslt_ext_oper_ord_no_LC(info);
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
		else if (lc == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_LC(info);
		else if (lc == columnRslt_rtn_sts_typ) doRslt_rtn_sts_typ_LC(info);
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ptn_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_rsrc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_oper_ord_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rtn_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rtn_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_site_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_itm_ord_sts_typ]の作成メソッド
	 */
	public MCList getRslt_itm_ord_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_ord_sts_typ]の作成メソッド
	 */
	public MCList getRslt_oper_ord_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getOperOrdStsTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0100.Srch01")) {
			return new MS_MSBCL0100_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0100.Upd01")) {
			return new MS_MSBCL0100_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL0100.Imp01")) {
			return new MS_MSBCL0100_Imp01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0100_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0100_Srch01Bridge() {
			p_MS_MSBCL0100_Srch01 = new MCParam(PDef.MS_MSBCL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));

			p_MS_MSBCL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0100.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0100_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)p_MS_MSBCL0100_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0100_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0100_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0100_Upd01Bridge() {
			p_MS_MSBCL0100_Upd01 = new MCParam(PDef.MS_MSBCL0100_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0100_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));

			p_MS_MSBCL0100_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0100_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0100_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0100_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0100_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0100_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0100_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)p_MS_MSBCL0100_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0100_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0100_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0100_Imp01;

		/** コンストラクタ */
		protected MS_MSBCL0100_Imp01Bridge() {
			p_MS_MSBCL0100_Imp01 = new MCParam(PDef.MS_MSBCL0100_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0100_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));

			p_MS_MSBCL0100_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0100_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0100_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0100_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0100_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0100_Imp01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0100_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0100.RsltR>)p_MS_MSBCL0100_Imp01.getContainerParam().getDownBlock(0));
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
}