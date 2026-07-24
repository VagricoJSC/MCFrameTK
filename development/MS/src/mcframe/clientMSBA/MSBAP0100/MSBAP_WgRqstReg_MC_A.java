package mcframe.clientMSBA.MSBAP0100;

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
import mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg_MC.MS_MSBAL0100_Srch01Caller;
import mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg_MC.MS_MSBAL0100_Imp01Caller;
import mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg_MC.MS_MSBAL0100_Upd01Caller;
import mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg_MC.MS_MSBAL0100_Del01Caller;

/**
 * 画面"MSBAP_WgRqstReg"パネルクラスです。<p>
 *
 * ＷＧ間依頼情報を一覧で登録する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAP_WgRqstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBAP0100";

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
	// [RqstTyp]ブロック関連のField定義
	public MCPanel RqstTypPanel = null;
	public MCTitledBorder RqstTypTitledBorder = null;
	// [RqstTyp]ブロックの項目のField定義
	// [RqstSts]ブロック関連のField定義
	public MCPanel RqstStsPanel = null;
	public MCTitledBorder RqstStsTitledBorder = null;
	// [RqstSts]ブロックの項目のField定義
	// [SloRqst]ブロック関連のField定義
	public MCPanel SloRqstPanel = null;
	public MCTitledBorder SloRqstTitledBorder = null;
	// [SloRqst]ブロックの項目のField定義
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
	 * UPD,Create/Modify,UPD;DEL,Cancel,DEL;REF,View,REF UPD,登録・訂正する,UPD;DEL,取り消す,DEL;REF,参照する,REF.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Transport 移送.<p>
	 *
	 */
	public MCCheckBox Cnd_xfr_rqst_flg = null;
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_rqst_flg = null;
	/**
	 * Shipping 出荷.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_rqst_flg = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_rqst_sts_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_sts_flg = null;
	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public MCCheckBox Cnd_part_inst_sts_flg = null;
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_sts_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_sts_flg = null;
	/**
	 * Exist あり.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_rqst_flg = null;
	/**
	 * None なし.<p>
	 *
	 */
	public MCCheckBox Cnd_un_slo_rqst_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_gr_rqst_dt_p_PPanel;
	public MCDateField Cnd_gr_rqst_dt_fr;	// [Cnd]の[gr_rqst_dt_p.ymd_fr]を[Cnd_gr_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gr_rqst_hm_fr;	// [Cnd]の[gr_rqst_dt_p.hm_fr]を[Cnd_gr_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gr_rqst_dt_to;	// [Cnd]の[gr_rqst_dt_p.ymd_to]を[Cnd_gr_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gr_rqst_hm_to;	// [Cnd]の[gr_rqst_dt_p.hm_to]を[Cnd_gr_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_gi_rqst_dt_p_PPanel;
	public MCDateField Cnd_gi_rqst_dt_fr;	// [Cnd]の[gi_rqst_dt_p.ymd_fr]を[Cnd_gi_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_rqst_hm_fr;	// [Cnd]の[gi_rqst_dt_p.hm_fr]を[Cnd_gi_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_rqst_dt_to;	// [Cnd]の[gi_rqst_dt_p.ymd_to]を[Cnd_gi_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gi_rqst_hm_to;	// [Cnd]の[gi_rqst_dt_p.hm_to]を[Cnd_gi_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_gr_schd_dt_p_PPanel;
	public MCDateField Cnd_gr_schd_dt_fr;	// [Cnd]の[gr_schd_dt_p.ymd_fr]を[Cnd_gr_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gr_schd_hm_fr;	// [Cnd]の[gr_schd_dt_p.hm_fr]を[Cnd_gr_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gr_schd_dt_to;	// [Cnd]の[gr_schd_dt_p.ymd_to]を[Cnd_gr_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gr_schd_hm_to;	// [Cnd]の[gr_schd_dt_p.hm_to]を[Cnd_gr_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_gi_schd_dt_p_PPanel;
	public MCDateField Cnd_gi_schd_dt_fr;	// [Cnd]の[gi_schd_dt_p.ymd_fr]を[Cnd_gi_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_schd_hm_fr;	// [Cnd]の[gi_schd_dt_p.hm_fr]を[Cnd_gi_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_schd_dt_to;	// [Cnd]の[gi_schd_dt_p.ymd_to]を[Cnd_gi_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gi_schd_hm_to;	// [Cnd]の[gi_schd_dt_p.hm_to]を[Cnd_gi_schd_hm_to]としてエイリアス定義。
	public MCLabel Cnd_rqst_dt_fr_Label = null;
	/**
	 * Request date FROM 依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rqst_dt_fr = null;
	public MCLabel Cnd_rqst_dt_to_Label = null;
	/**
	 * Request date TO 依頼日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rqst_dt_to = null;
	public MCLabel Cnd_re_rqst_dt_fr_Label = null;
	/**
	 * Readjustment request date FROM 再調整依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_re_rqst_dt_fr = null;
	public MCLabel Cnd_re_rqst_dt_to_Label = null;
	/**
	 * Readjustment request date TO 再調整依頼日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_re_rqst_dt_to = null;
	public MCLabel Cnd_wg_rqst_ntc_day_typ_Label = null;
	/**
	 * Inventory request from other WG notification date type ＷＧ間依頼通知日区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_rqst_ntc_day_typ = null;
	/**
	 * Inventory request from other WG notification date type name ＷＧ間依頼通知日区分名.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_ntc_day_typ_nm = null;
	public MCLabel Cnd_srch_dt_fr_Label = null;
	/**
	 * Search date FROM 検索日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_srch_dt_fr = null;
	public MCLabel Cnd_srch_dt_to_Label = null;
	/**
	 * Search date TO 検索日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_srch_dt_to = null;
	public MCLabel Cnd_rqst_fr_wg_cd_Label = null;
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_fr_wg_cd = null;
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_wg_nm = null;
	public MCLabel Cnd_rqst_to_wg_cd_Label = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_to_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_wg_nm = null;
	public MCLabel Cnd_gr_loc_cd_Label = null;
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_nm = null;
	public MCLabel Cnd_gr_site_cd_Label = null;
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_site_cd = null;
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_gr_site_nm = null;
	public MCLabel Cnd_gr_loc_wg_cd_Label = null;
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_loc_wg_cd = null;
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_wg_nm = null;
	public MCLabel Cnd_gr_lg_grp_cd_Label = null;
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_lg_grp_cd = null;
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_gr_lg_grp_nm = null;
	public MCLabel Cnd_gr_loc_grp_cd_Label = null;
	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_loc_grp_cd = null;
	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_grp_nm = null;
	public MCLabel Cnd_gr_str_ln_cd_Label = null;
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_str_ln_cd = null;
	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_gr_str_ln_nm = null;
	public MCLabel Cnd_rqst_to_loc_cd_Label = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_loc_nm = null;
	public MCLabel Cnd_rqst_to_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_to_site_cd = null;
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_site_nm = null;
	public MCLabel Cnd_rqst_to_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_to_lg_grp_cd = null;
	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_lg_grp_nm = null;
	public MCLabel Cnd_rqst_to_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_to_loc_grp_cd = null;
	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_loc_grp_nm = null;
	public MCLabel Cnd_rqst_to_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_to_str_ln_cd = null;
	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_to_str_ln_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
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
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sublot_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_rqst_fr_usr_cd_Label = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_usr_nm = null;
	public MCLabel Cnd_rqst_fr_dpt_cd_Label = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_dpt_nm = null;
	public MCLabel Cnd_wg_rqst_src_typ_Label = null;
	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_rqst_src_typ = null;
	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_src_typ_nm = null;
	public MCLabel Cnd_wg_rqst_src_no_Label = null;
	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_src_no = null;
	public MCLabel Cnd_wg_rqst_no_Label = null;
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_no = null;
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
	/**
	 * Readjustment request only 再調整依頼のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_re_rqst_flg = null;
	/**
	 * Replied split only 回答分割のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_div_flg = null;
	/**
	 * Only replied qty. shortage 回答数不足のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_shrtg_flg = null;
	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public MCCheckBox Cnd_due_delay_flg = null;
	/**
	 * Reply unchecked only 回答未確認のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_uncn_flg = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	public MCLabel Cnd_wg_rqst_cnt_rmrks_Label = null;
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_cnt_rmrks = null;
	public MCLabel Cnd_wg_re_rqst_cnt_rmrks_Label = null;
	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_wg_re_rqst_cnt_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_sppl_grp_p_PPanel;
	public MCLabel Cnd_sppl_grp_lab1;	// [Cnd]の[sppl_grp_p.bp_grp_lab1]を[Cnd_sppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg1;	// [Cnd]の[sppl_grp_p.bp_grp_flg1]を[Cnd_sppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd1;	// [Cnd]の[sppl_grp_p.bp_grp_cd1]を[Cnd_sppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm1;	// [Cnd]の[sppl_grp_p.bp_grp_nm1]を[Cnd_sppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab2;	// [Cnd]の[sppl_grp_p.bp_grp_lab2]を[Cnd_sppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg2;	// [Cnd]の[sppl_grp_p.bp_grp_flg2]を[Cnd_sppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd2;	// [Cnd]の[sppl_grp_p.bp_grp_cd2]を[Cnd_sppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm2;	// [Cnd]の[sppl_grp_p.bp_grp_nm2]を[Cnd_sppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab3;	// [Cnd]の[sppl_grp_p.bp_grp_lab3]を[Cnd_sppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg3;	// [Cnd]の[sppl_grp_p.bp_grp_flg3]を[Cnd_sppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd3;	// [Cnd]の[sppl_grp_p.bp_grp_cd3]を[Cnd_sppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm3;	// [Cnd]の[sppl_grp_p.bp_grp_nm3]を[Cnd_sppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab4;	// [Cnd]の[sppl_grp_p.bp_grp_lab4]を[Cnd_sppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg4;	// [Cnd]の[sppl_grp_p.bp_grp_flg4]を[Cnd_sppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd4;	// [Cnd]の[sppl_grp_p.bp_grp_cd4]を[Cnd_sppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm4;	// [Cnd]の[sppl_grp_p.bp_grp_nm4]を[Cnd_sppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab5;	// [Cnd]の[sppl_grp_p.bp_grp_lab5]を[Cnd_sppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg5;	// [Cnd]の[sppl_grp_p.bp_grp_flg5]を[Cnd_sppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd5;	// [Cnd]の[sppl_grp_p.bp_grp_cd5]を[Cnd_sppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm5;	// [Cnd]の[sppl_grp_p.bp_grp_nm5]を[Cnd_sppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab6;	// [Cnd]の[sppl_grp_p.bp_grp_lab6]を[Cnd_sppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg6;	// [Cnd]の[sppl_grp_p.bp_grp_flg6]を[Cnd_sppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd6;	// [Cnd]の[sppl_grp_p.bp_grp_cd6]を[Cnd_sppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm6;	// [Cnd]の[sppl_grp_p.bp_grp_nm6]を[Cnd_sppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab7;	// [Cnd]の[sppl_grp_p.bp_grp_lab7]を[Cnd_sppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg7;	// [Cnd]の[sppl_grp_p.bp_grp_flg7]を[Cnd_sppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd7;	// [Cnd]の[sppl_grp_p.bp_grp_cd7]を[Cnd_sppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm7;	// [Cnd]の[sppl_grp_p.bp_grp_nm7]を[Cnd_sppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab8;	// [Cnd]の[sppl_grp_p.bp_grp_lab8]を[Cnd_sppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg8;	// [Cnd]の[sppl_grp_p.bp_grp_flg8]を[Cnd_sppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd8;	// [Cnd]の[sppl_grp_p.bp_grp_cd8]を[Cnd_sppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm8;	// [Cnd]の[sppl_grp_p.bp_grp_nm8]を[Cnd_sppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab9;	// [Cnd]の[sppl_grp_p.bp_grp_lab9]を[Cnd_sppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg9;	// [Cnd]の[sppl_grp_p.bp_grp_flg9]を[Cnd_sppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd9;	// [Cnd]の[sppl_grp_p.bp_grp_cd9]を[Cnd_sppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm9;	// [Cnd]の[sppl_grp_p.bp_grp_nm9]を[Cnd_sppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab10;	// [Cnd]の[sppl_grp_p.bp_grp_lab10]を[Cnd_sppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg10;	// [Cnd]の[sppl_grp_p.bp_grp_flg10]を[Cnd_sppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd10;	// [Cnd]の[sppl_grp_p.bp_grp_cd10]を[Cnd_sppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm10;	// [Cnd]の[sppl_grp_p.bp_grp_nm10]を[Cnd_sppl_grp_nm10]としてエイリアス定義。
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_rqst_dt_Label = null;
	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDateField BulkSet_rqst_dt = null;
	public MCLabel BulkSet_rqst_fr_wg_cd_Label = null;
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox BulkSet_rqst_fr_wg_cd = null;
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public MCTextField BulkSet_rqst_fr_wg_nm = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_rqst_fr_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_rqst_fr_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_rqst_fr_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_rqst_fr_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_rqst_fr_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_rqst_fr_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_rqst_fr_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_rqst_fr_dpt_nm]としてエイリアス定義。
	// [Rslt1Panel]ブロック関連のField定義
	public MCPanel Rslt1PanelPanel = null;
	// [Rslt1Panel]ブロックの項目のField定義
	// [Rslt1]ブロック関連のField定義
	public MCPanel Rslt1Panel = null;
	public MCTitledBorder Rslt1TitledBorder = null;
	public MCScrollPane Rslt1ScrollPane = null;
	public MCTable2<mcframe.clientMSBA.MSBAP0100.Rslt1R> Rslt1Table = null;
	// [Rslt1]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_check = null;
	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_prms_uncn_flg = null;
	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_re_rqst_flg = null;
	/**
	 * Notification 通知.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_prms_ntc_flg = null;
	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_prms_dt = null;
	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_re_prms_ntc_flg = null;
	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_re_prms_dt = null;
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_no = null;
	/**
	 * Last inventory request No. from other WG 前回ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_last_wg_rqst_no = null;
	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_typ = null;
	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_typ_nm = null;
	/**
	 * Request status type 依頼状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_sts_typ = null;
	/**
	 * Request status type name 依頼状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_sts_typ_nm = null;
	/**
	 * Request source type 依頼元区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_src_typ = null;
	/**
	 * Request source type name 依頼元区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_src_typ_nm = null;
	/**
	 * Request source identification No. 依頼元識別ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_src_no = null;
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_fr_wg_cd = null;
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_fr_wg_nm = null;
	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_dt = null;
	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_re_rqst_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt1_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt1_rqst_fr_usr_cd;// [Rslt1]の[usr_dpt_p.usr_cd]を[columnRslt1_rqst_fr_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_rqst_fr_usr_nm;// [Rslt1]の[usr_dpt_p.usr_nm]を[columnRslt1_rqst_fr_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_rqst_fr_dpt_cd;// [Rslt1]の[usr_dpt_p.dpt_cd]を[columnRslt1_rqst_fr_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_rqst_fr_dpt_nm;// [Rslt1]の[usr_dpt_p.dpt_nm]を[columnRslt1_rqst_fr_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt1_itm_p_PPanel;
	public MCColumnConfig columnRslt1_itm_cd;// [Rslt1]の[itm_p.itm_cd]を[columnRslt1_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_sub1;// [Rslt1]の[itm_p.itm_sub1]を[columnRslt1_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_sub2;// [Rslt1]の[itm_p.itm_sub2]を[columnRslt1_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_sub3;// [Rslt1]の[itm_p.itm_sub3]を[columnRslt1_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_itm_nm;// [Rslt1]の[itm_p.itm_nm]を[columnRslt1_itm_nm]としてエイリアス定義。
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_iv_itm_nm = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sublot_mng_typ = null;
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sundry_itm_flg = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_asset_mng_typ_nm = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dscnt_itm_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt1_dlv_p_PPanel;
	public MCColumnConfig columnRslt1_dlv_cd;// [Rslt1]の[dlv_p.bp_cd]を[columnRslt1_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_nm;// [Rslt1]の[dlv_p.bp_nm]を[columnRslt1_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_sundry_flg;// [Rslt1]の[dlv_p.dlv_sundry_flg]を[columnRslt1_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_pri_prnt_flg;// [Rslt1]の[dlv_p.pri_prnt_flg]を[columnRslt1_dlv_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_show_dtl;// [Rslt1]の[dlv_p.show_dtl]を[columnRslt1_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_lg_grp_cd;// [Rslt1]の[dlv_p.lg_grp_cd]を[columnRslt1_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_lg_grp_nm;// [Rslt1]の[dlv_p.lg_grp_nm]を[columnRslt1_dlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_cntry_cd;// [Rslt1]の[dlv_p.cntry_cd]を[columnRslt1_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_cntry_nm;// [Rslt1]の[dlv_p.cntry_nm]を[columnRslt1_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_zip_cd;// [Rslt1]の[dlv_p.zip_cd]を[columnRslt1_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_addr1;// [Rslt1]の[dlv_p.addr1]を[columnRslt1_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_addr2;// [Rslt1]の[dlv_p.addr2]を[columnRslt1_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_addr3;// [Rslt1]の[dlv_p.addr3]を[columnRslt1_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_addr4;// [Rslt1]の[dlv_p.addr4]を[columnRslt1_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_tel;// [Rslt1]の[dlv_p.tel]を[columnRslt1_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_fax;// [Rslt1]の[dlv_p.fax]を[columnRslt1_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_cntct_dpt;// [Rslt1]の[dlv_p.dlv_cntct_dpt]を[columnRslt1_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt1_dlv_cntct_psn;// [Rslt1]の[dlv_p.dlv_cntct_psn]を[columnRslt1_dlv_cntct_psn]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt1_tdlv_p_PPanel;
	public MCColumnConfig columnRslt1_tdlv_cd;// [Rslt1]の[tdlv_p.bp_cd]を[columnRslt1_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_nm;// [Rslt1]の[tdlv_p.bp_nm]を[columnRslt1_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_sundry_flg;// [Rslt1]の[tdlv_p.dlv_sundry_flg]を[columnRslt1_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_pri_prnt_flg;// [Rslt1]の[tdlv_p.pri_prnt_flg]を[columnRslt1_tdlv_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_show_dtl;// [Rslt1]の[tdlv_p.show_dtl]を[columnRslt1_tdlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_lg_grp_cd;// [Rslt1]の[tdlv_p.lg_grp_cd]を[columnRslt1_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_lg_grp_nm;// [Rslt1]の[tdlv_p.lg_grp_nm]を[columnRslt1_tdlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_cntry_cd;// [Rslt1]の[tdlv_p.cntry_cd]を[columnRslt1_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_cntry_nm;// [Rslt1]の[tdlv_p.cntry_nm]を[columnRslt1_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_zip_cd;// [Rslt1]の[tdlv_p.zip_cd]を[columnRslt1_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_addr1;// [Rslt1]の[tdlv_p.addr1]を[columnRslt1_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_addr2;// [Rslt1]の[tdlv_p.addr2]を[columnRslt1_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_addr3;// [Rslt1]の[tdlv_p.addr3]を[columnRslt1_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_addr4;// [Rslt1]の[tdlv_p.addr4]を[columnRslt1_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_tel;// [Rslt1]の[tdlv_p.tel]を[columnRslt1_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_fax;// [Rslt1]の[tdlv_p.fax]を[columnRslt1_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_cntct_dpt;// [Rslt1]の[tdlv_p.dlv_cntct_dpt]を[columnRslt1_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt1_tdlv_cntct_psn;// [Rslt1]の[tdlv_p.dlv_cntct_psn]を[columnRslt1_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_loc_nm = null;
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt1_gr_str_ln_p_PPanel;
	public MCColumnConfig columnRslt1_gr_str_ln_cd;// [Rslt1]の[gr_str_ln_p.str_ln_cd]を[columnRslt1_gr_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_gr_str_ln_nm;// [Rslt1]の[gr_str_ln_p.str_ln_nm]を[columnRslt1_gr_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_gr_str_ln_cd_none_flg;// [Rslt1]の[gr_str_ln_p.str_ln_cd_none_flg]を[columnRslt1_gr_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_loc_grp_cd = null;
	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_loc_grp_nm = null;
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_lg_grp_cd = null;
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_lg_grp_nm = null;
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_loc_wg_cd = null;
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_loc_wg_nm = null;
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_site_cd = null;
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gr_site_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt1_gr_rqst_dt_p_PPanel;
	public MCColumnConfig columnRslt1_gr_rqst_dt;// [Rslt1]の[gr_rqst_dt_p.ymd]を[columnRslt1_gr_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt1_gr_rqst_hm;// [Rslt1]の[gr_rqst_dt_p.hm]を[columnRslt1_gr_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt1_gi_rqst_dt_p_PPanel;
	public MCColumnConfig columnRslt1_gi_rqst_dt;// [Rslt1]の[gi_rqst_dt_p.ymd]を[columnRslt1_gi_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt1_gi_rqst_hm;// [Rslt1]の[gi_rqst_dt_p.hm]を[columnRslt1_gi_rqst_hm]としてエイリアス定義。
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_loc_nm = null;
	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt1_rqst_to_str_ln_p_PPanel;
	public MCColumnConfig columnRslt1_rqst_to_str_ln_cd;// [Rslt1]の[rqst_to_str_ln_p.str_ln_cd]を[columnRslt1_rqst_to_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_rqst_to_str_ln_nm;// [Rslt1]の[rqst_to_str_ln_p.str_ln_nm]を[columnRslt1_rqst_to_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_rqst_to_str_ln_cd_none_flg;// [Rslt1]の[rqst_to_str_ln_p.str_ln_cd_none_flg]を[columnRslt1_rqst_to_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_loc_grp_cd = null;
	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_loc_grp_nm = null;
	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_lg_grp_cd = null;
	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_lg_grp_nm = null;
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_site_cd = null;
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_site_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bom_ptn = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sppl_nm = null;
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_sppl_iv_flg = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_prnt_lcl_cd = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_maker_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_to_wg_nm = null;
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_purc_rsn_nm = null;
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_xpns_purc_flg = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_nm = null;
	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_ptn_typ = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_unit_rnd_typ = null;
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt1_trd_unit_qty;// [Rslt1]の[trd_unit_qty_p.qty]を[columnRslt1_trd_unit_qty]としてエイリアス定義。
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
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt1_base_unit_qty;// [Rslt1]の[base_unit_qty_p.qty]を[columnRslt1_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_not_cmpl_qty_p_PPanel;
	public MCColumnConfig columnRslt1_not_cmpl_qty;// [Rslt1]の[not_cmpl_qty_p.qty]を[columnRslt1_not_cmpl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt1_cmpl_qty_p_PPanel;
	public MCColumnConfig columnRslt1_cmpl_qty;// [Rslt1]の[cmpl_qty_p.qty]を[columnRslt1_cmpl_qty]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt1_lot_no_p_PPanel;
	public MCColumnConfig columnRslt1_crt_lot_flg;// [Rslt1]の[lot_no_p.crt_lot_flg]を[columnRslt1_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_lot_no;// [Rslt1]の[lot_no_p.lot_no]を[columnRslt1_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sublot_no;// [Rslt1]の[lot_no_p.sublot_no]を[columnRslt1_sublot_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt1_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt1_sno1_null_flg;// [Rslt1]の[sno_wrk_no_p.sno1_null_flg]を[columnRslt1_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno1;// [Rslt1]の[sno_wrk_no_p.sno1]を[columnRslt1_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno2_null_flg;// [Rslt1]の[sno_wrk_no_p.sno2_null_flg]を[columnRslt1_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno2;// [Rslt1]の[sno_wrk_no_p.sno2]を[columnRslt1_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno3_null_flg;// [Rslt1]の[sno_wrk_no_p.sno3_null_flg]を[columnRslt1_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno3;// [Rslt1]の[sno_wrk_no_p.sno3]を[columnRslt1_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno4_null_flg;// [Rslt1]の[sno_wrk_no_p.sno4_null_flg]を[columnRslt1_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sno4;// [Rslt1]の[sno_wrk_no_p.sno4]を[columnRslt1_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_wrk_no;// [Rslt1]の[sno_wrk_no_p.wrk_no]を[columnRslt1_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_wrk_nm;// [Rslt1]の[sno_wrk_no_p.wrk_nm]を[columnRslt1_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt1_ver_no_p_PPanel;
	public MCColumnConfig columnRslt1_ver_no;// [Rslt1]の[ver_no_p.ver_no]を[columnRslt1_ver_no]としてエイリアス定義。
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_gd_nm = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_vld_dt_fr = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_vld_dt_to = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Rslt1_bditm_p_PPanel;
	public MCColumnConfig columnRslt1_bd_dpt_cd;// [Rslt1]の[bditm_p.bd_dpt_cd]を[columnRslt1_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_dpt_nm;// [Rslt1]の[bditm_p.bd_dpt_nm]を[columnRslt1_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_itm_cd;// [Rslt1]の[bditm_p.bd_itm_cd]を[columnRslt1_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_itm_sub1;// [Rslt1]の[bditm_p.bd_itm_sub1]を[columnRslt1_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_itm_sub2;// [Rslt1]の[bditm_p.bd_itm_sub2]を[columnRslt1_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_itm_sub3;// [Rslt1]の[bditm_p.bd_itm_sub3]を[columnRslt1_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_itm_nm;// [Rslt1]の[bditm_p.bd_itm_nm]を[columnRslt1_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_lot_mng_typ = null;
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_sublot_mng_typ = null;
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_lot_no_typ = null;
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_sublot_no_typ = null;
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_sno1_mng_typ = null;
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_sno2_mng_typ = null;
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_sno3_mng_typ = null;
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_bd_sno4_mng_typ = null;
	public MCColumnConfig columnRslt1_bd_lot_no;// [Rslt1]の[bditm_p.bd_lot_no]を[columnRslt1_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_sublot_no;// [Rslt1]の[bditm_p.bd_sublot_no]を[columnRslt1_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_sno1;// [Rslt1]の[bditm_p.bd_sno1]を[columnRslt1_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_sno2;// [Rslt1]の[bditm_p.bd_sno2]を[columnRslt1_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_sno3;// [Rslt1]の[bditm_p.bd_sno3]を[columnRslt1_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_sno4;// [Rslt1]の[bditm_p.bd_sno4]を[columnRslt1_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_bp_cd;// [Rslt1]の[bditm_p.bd_bp_cd]を[columnRslt1_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_bp_nm;// [Rslt1]の[bditm_p.bd_bp_nm]を[columnRslt1_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_loc_cd;// [Rslt1]の[bditm_p.bd_loc_cd]を[columnRslt1_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_loc_nm;// [Rslt1]の[bditm_p.bd_loc_nm]を[columnRslt1_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_ctg_cd;// [Rslt1]の[bditm_p.bd_ctg_cd]を[columnRslt1_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_ctg_nm;// [Rslt1]の[bditm_p.bd_ctg_nm]を[columnRslt1_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_oper_cd;// [Rslt1]の[bditm_p.bd_oper_cd]を[columnRslt1_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_oper_nm;// [Rslt1]の[bditm_p.bd_oper_nm]を[columnRslt1_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_iv_no;// [Rslt1]の[bditm_p.bd_iv_no]を[columnRslt1_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_slo_no;// [Rslt1]の[bditm_p.bd_slo_no]を[columnRslt1_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnRslt1_bd_po_no;// [Rslt1]の[bditm_p.bd_po_no]を[columnRslt1_bd_po_no]としてエイリアス定義。
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
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_itm_ord_no = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_io_schd_pr_no = null;
	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_crrct_flg = null;
	/**
	 * Delivery order received 納入指示受領.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_dlv_inst_rcpt_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_can_flg = null;
	/**
	 * Edit configuration 構成変更.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_comp_cng_flg = null;
	/**
	 * Specification change 仕様変更.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_spec_cng_flg = null;
	/**
	 * Date edited by request source 依頼元訂正日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_crrct_dt = null;
	/**
	 * Request source cancellation date 依頼元取消日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_rqst_can_dt = null;
	/**
	 * Reply cancelled date 回答通知取消日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_prms_can_dt = null;
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_inst_dt = null;
	/**
	 * Order cancellation date 指図取消日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_inst_can_dt = null;
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_act_dt = null;
	/**
	 * Result cancel date 実績取消日.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_act_can_dt = null;
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_cnt_rmrks = null;
	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_re_rqst_cnt_rmrks = null;
	/**
	 * Request source internal remarks 依頼元内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt1_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt1_rtn_sts_typ;// [Rslt1]の[rts_msg_p.rtn_sts_typ]を[columnRslt1_rtn_sts_typ]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt1_sppl_grp_p_PPanel;
	public MCColumnConfig columnRslt1_sppl_grp_cd1;// [Rslt1]の[sppl_grp_p.bp_grp_cd1]を[columnRslt1_sppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm1;// [Rslt1]の[sppl_grp_p.bp_grp_nm1]を[columnRslt1_sppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd2;// [Rslt1]の[sppl_grp_p.bp_grp_cd2]を[columnRslt1_sppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm2;// [Rslt1]の[sppl_grp_p.bp_grp_nm2]を[columnRslt1_sppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd3;// [Rslt1]の[sppl_grp_p.bp_grp_cd3]を[columnRslt1_sppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm3;// [Rslt1]の[sppl_grp_p.bp_grp_nm3]を[columnRslt1_sppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd4;// [Rslt1]の[sppl_grp_p.bp_grp_cd4]を[columnRslt1_sppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm4;// [Rslt1]の[sppl_grp_p.bp_grp_nm4]を[columnRslt1_sppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd5;// [Rslt1]の[sppl_grp_p.bp_grp_cd5]を[columnRslt1_sppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm5;// [Rslt1]の[sppl_grp_p.bp_grp_nm5]を[columnRslt1_sppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd6;// [Rslt1]の[sppl_grp_p.bp_grp_cd6]を[columnRslt1_sppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm6;// [Rslt1]の[sppl_grp_p.bp_grp_nm6]を[columnRslt1_sppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd7;// [Rslt1]の[sppl_grp_p.bp_grp_cd7]を[columnRslt1_sppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm7;// [Rslt1]の[sppl_grp_p.bp_grp_nm7]を[columnRslt1_sppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd8;// [Rslt1]の[sppl_grp_p.bp_grp_cd8]を[columnRslt1_sppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm8;// [Rslt1]の[sppl_grp_p.bp_grp_nm8]を[columnRslt1_sppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd9;// [Rslt1]の[sppl_grp_p.bp_grp_cd9]を[columnRslt1_sppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm9;// [Rslt1]の[sppl_grp_p.bp_grp_nm9]を[columnRslt1_sppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_cd10;// [Rslt1]の[sppl_grp_p.bp_grp_cd10]を[columnRslt1_sppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt1_sppl_grp_nm10;// [Rslt1]の[sppl_grp_p.bp_grp_nm10]を[columnRslt1_sppl_grp_nm10]としてエイリアス定義。
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
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt1_wg_rqst_upd_cntr = null;
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
	// [Rslt1Btn]ブロック関連のField定義
	public MCPanel Rslt1BtnPanel = null;
	// [Rslt1Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Rslt1Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Rslt1Btn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Rslt1Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Rslt1Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Rslt1Btn_rcopy = null;
	// [Rslt2]ブロック関連のField定義
	public MCPanel Rslt2Panel = null;
	public MCTitledBorder Rslt2TitledBorder = null;
	public MCScrollPane Rslt2ScrollPane = null;
	public MCTable2<mcframe.clientMSBA.MSBAP0100.Rslt2R> Rslt2Table = null;
	// [Rslt2]ブロックの項目のField定義
	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_wg_rqst_prms_no = null;
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_wg_rqst_no = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_can_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fix_flg = null;
	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_fix_dt = null;
	/**
	 * Replied GR date 回答入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gr_schd_dt = null;
	/**
	 * Replied GR time 回答入庫時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gr_schd_hm = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_trd_unit_dec_place = null;
	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_prms_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt2_prms_trd_unit_qty;// [Rslt2]の[prms_trd_unit_qty_p.qty]を[columnRslt2_prms_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_prms_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt2_prms_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt2_prms_base_unit_qty;// [Rslt2]の[prms_base_unit_qty_p.qty]を[columnRslt2_prms_base_unit_qty]としてエイリアス定義。
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_lg_grp_cd = null;
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_lg_grp_nm = null;
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_loc_nm = null;
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_str_ln_cd = null;
	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_str_ln_nm = null;
	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_str_ln_cd_none_flg = null;
	/**
	 * Replied GI date 回答出庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_schd_dt = null;
	/**
	 * Replied GI time 回答出庫時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_gi_schd_hm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_bom_ptn = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_maker_nm = null;
	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_wg_rqst_prms_rmrks = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt2_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
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

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH_DEL, DEL, SRCH, REF};
	
	/** [MS_MSBAL0100_Srch01]のCallerの作成 */
	protected MSBAP_WgRqstReg_MC.MS_MSBAL0100_Srch01Caller createMS_MSBAL0100_Srch01() {
		MSBAP_WgRqstReg_MC.MS_MSBAL0100_Srch01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Srch01Bridge>
		caller = ((MSBAP_WgRqstReg_MC)this).new MS_MSBAL0100_Srch01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Srch01Bridge>(
					(MSBAP_WgRqstReg)this, new MS_MSBAL0100_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBAL0100_Srch01]の呼び出し */
	protected void callMS_MSBAL0100_Srch01() {
		MCCaller caller = createMS_MSBAL0100_Srch01();
		caller.exec();
	}
	/** [MS_MSBAL0100_Imp01]のCallerの作成 */
	protected MSBAP_WgRqstReg_MC.MS_MSBAL0100_Imp01Caller createMS_MSBAL0100_Imp01() {
		MSBAP_WgRqstReg_MC.MS_MSBAL0100_Imp01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Imp01Bridge>
		caller = ((MSBAP_WgRqstReg_MC)this).new MS_MSBAL0100_Imp01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Imp01Bridge>(
					(MSBAP_WgRqstReg)this, new MS_MSBAL0100_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBAL0100_Imp01]の呼び出し */
	protected void callMS_MSBAL0100_Imp01() {
		MCCaller caller = createMS_MSBAL0100_Imp01();
		caller.exec();
	}
	/** [MS_MSBAL0100_Upd01]のCallerの作成 */
	protected MSBAP_WgRqstReg_MC.MS_MSBAL0100_Upd01Caller createMS_MSBAL0100_Upd01() {
		MSBAP_WgRqstReg_MC.MS_MSBAL0100_Upd01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Upd01Bridge>
		caller = ((MSBAP_WgRqstReg_MC)this).new MS_MSBAL0100_Upd01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Upd01Bridge>(
					(MSBAP_WgRqstReg)this, new MS_MSBAL0100_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBAL0100_Upd01]の呼び出し */
	protected void callMS_MSBAL0100_Upd01() {
		MCCaller caller = createMS_MSBAL0100_Upd01();
		caller.exec();
	}
	/** [MS_MSBAL0100_Del01]のCallerの作成 */
	protected MSBAP_WgRqstReg_MC.MS_MSBAL0100_Del01Caller createMS_MSBAL0100_Del01() {
		MSBAP_WgRqstReg_MC.MS_MSBAL0100_Del01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Del01Bridge>
		caller = ((MSBAP_WgRqstReg_MC)this).new MS_MSBAL0100_Del01Caller<MSBAP_WgRqstReg, MS_MSBAL0100_Del01Bridge>(
					(MSBAP_WgRqstReg)this, new MS_MSBAL0100_Del01Bridge());
		return caller;
	}
	/** [MS_MSBAL0100_Del01]の呼び出し */
	protected void callMS_MSBAL0100_Del01() {
		MCCaller caller = createMS_MSBAL0100_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBA.MSBAP0100.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBA.MSBAP0100.BulkSetR aBulkSetR;
	/** [Rslt1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> aRslt1L;
	/** [Rslt2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R> aRslt2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBA.MSBAP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBA.MSBAP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBA.MSBAP0100.CndR createCndR() {
		return mcframe.clientMSBA.MSBAP0100.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBA.MSBAP0100.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBA.MSBAP0100.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBA.MSBAP0100.BulkSetR createBulkSetR() {
		return mcframe.clientMSBA.MSBAP0100.BulkSetR.create();
	}

	/**
	 * コピーによってaRslt1Lを設定します。
	 *
	 * aRslt1Lのインスタンスは変更されません。
	 *
	 * @param dataset Rslt1L
	 */
	public void setRslt1L(MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> aList) {
		if (getRslt1L() != aList) {
			getRslt1L().setAll(aList);
		}
	}

	/**
	 * [Rslt1]ブロックのコンテナaRslt1Lを返します。
	 *
	 * @return Rslt1L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> getRslt1L() {
		return aRslt1L;
	}

	/**
	 * aRslt1Rを作成します。
	 *
	 * @return Rslt1R
	 */
	public mcframe.clientMSBA.MSBAP0100.Rslt1R createRslt1R() {
		return mcframe.clientMSBA.MSBAP0100.Rslt1R.create();
	}

	/**
	 * aRslt1Lを作成します。
	 *
	 * @return Rslt1L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> createRslt1L() {
		return MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class);
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
	public void setRslt2L(MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R> aList) {
		if (getRslt2L() != aList) {
			getRslt2L().setAll(aList);
		}
	}

	/**
	 * [Rslt2]ブロックのコンテナaRslt2Lを返します。
	 *
	 * @return Rslt2L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R> getRslt2L() {
		return aRslt2L;
	}

	/**
	 * aRslt2Rを作成します。
	 *
	 * @return Rslt2R
	 */
	public mcframe.clientMSBA.MSBAP0100.Rslt2R createRslt2R() {
		return mcframe.clientMSBA.MSBAP0100.Rslt2R.create();
	}

	/**
	 * aRslt2Lを作成します。
	 *
	 * @return Rslt2L
	 */
	public MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R> createRslt2L() {
		return MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt2R.class);
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
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(RqstTypPanel);
		ret.add(RqstStsPanel);
		ret.add(SloRqstPanel);
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
		ret.add(BulkSetPanel);
		ret.add(Rslt1PanelPanel);
		ret.add(Rslt1Panel);
		ret.add(Rslt1BtnPanel);
		ret.add(Rslt2Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_WgRqstReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRslt1L = createRslt1L();
		aRslt2L = createRslt2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBAP_WgRqstReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
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
		MSBAP_WgRqstReg_MC.jbCreateScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateSloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateTop((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateFold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateTab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateTab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateTab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateTab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateCnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateCnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateCnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateCnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateCtrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateBulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateRslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateBtn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbCreateEastBtn((MSBAP_WgRqstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBAP_WgRqstReg p) {
	}

	/**
	 * [RqstTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqstTyp(MSBAP_WgRqstReg p) {
	}

	/**
	 * [RqstSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqstSts(MSBAP_WgRqstReg p) {
	}

	/**
	 * [SloRqst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSloRqst(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBAP_WgRqstReg p) {
		p.Cnd_gr_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().gr_rqst_dt_p());
		p.Cnd_gr_rqst_dt_p_PPanel.setName("Cnd.gr_rqst_dt_p");
		p.Cnd_gr_rqst_dt_fr = p.Cnd_gr_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gr_rqst_dt_fr.addAliasName("Cnd.gr_rqst_dt_fr", p);
		p.Cnd_gr_rqst_hm_fr = p.Cnd_gr_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gr_rqst_hm_fr.addAliasName("Cnd.gr_rqst_hm_fr", p);
		p.Cnd_gr_rqst_dt_to = p.Cnd_gr_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gr_rqst_dt_to.addAliasName("Cnd.gr_rqst_dt_to", p);
		p.Cnd_gr_rqst_hm_to = p.Cnd_gr_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_gr_rqst_hm_to.addAliasName("Cnd.gr_rqst_hm_to", p);
		p.Cnd_gi_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().gi_rqst_dt_p());
		p.Cnd_gi_rqst_dt_p_PPanel.setName("Cnd.gi_rqst_dt_p");
		p.Cnd_gi_rqst_dt_fr = p.Cnd_gi_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gi_rqst_dt_fr.addAliasName("Cnd.gi_rqst_dt_fr", p);
		p.Cnd_gi_rqst_hm_fr = p.Cnd_gi_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gi_rqst_hm_fr.addAliasName("Cnd.gi_rqst_hm_fr", p);
		p.Cnd_gi_rqst_dt_to = p.Cnd_gi_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gi_rqst_dt_to.addAliasName("Cnd.gi_rqst_dt_to", p);
		p.Cnd_gi_rqst_hm_to = p.Cnd_gi_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_gi_rqst_hm_to.addAliasName("Cnd.gi_rqst_hm_to", p);
		p.Cnd_gr_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().gr_schd_dt_p());
		p.Cnd_gr_schd_dt_p_PPanel.setName("Cnd.gr_schd_dt_p");
		p.Cnd_gr_schd_dt_fr = p.Cnd_gr_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gr_schd_dt_fr.addAliasName("Cnd.gr_schd_dt_fr", p);
		p.Cnd_gr_schd_hm_fr = p.Cnd_gr_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gr_schd_hm_fr.addAliasName("Cnd.gr_schd_hm_fr", p);
		p.Cnd_gr_schd_dt_to = p.Cnd_gr_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gr_schd_dt_to.addAliasName("Cnd.gr_schd_dt_to", p);
		p.Cnd_gr_schd_hm_to = p.Cnd_gr_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_gr_schd_hm_to.addAliasName("Cnd.gr_schd_hm_to", p);
		p.Cnd_gi_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().gi_schd_dt_p());
		p.Cnd_gi_schd_dt_p_PPanel.setName("Cnd.gi_schd_dt_p");
		p.Cnd_gi_schd_dt_fr = p.Cnd_gi_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gi_schd_dt_fr.addAliasName("Cnd.gi_schd_dt_fr", p);
		p.Cnd_gi_schd_hm_fr = p.Cnd_gi_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gi_schd_hm_fr.addAliasName("Cnd.gi_schd_hm_fr", p);
		p.Cnd_gi_schd_dt_to = p.Cnd_gi_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gi_schd_dt_to.addAliasName("Cnd.gi_schd_dt_to", p);
		p.Cnd_gi_schd_hm_to = p.Cnd_gi_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
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
		p.Cnd_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().sppl_grp_p());
		p.Cnd_sppl_grp_p_PPanel.setName("Cnd.sppl_grp_p");
		p.Cnd_sppl_grp_lab1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_sppl_grp_lab1.addAliasName("Cnd.sppl_grp_lab1", p);
		p.Cnd_sppl_grp_flg1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_sppl_grp_flg1.addAliasName("Cnd.sppl_grp_flg1", p);
		p.Cnd_sppl_grp_cd1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_sppl_grp_cd1.addAliasName("Cnd.sppl_grp_cd1", p);
		p.Cnd_sppl_grp_nm1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_sppl_grp_nm1.addAliasName("Cnd.sppl_grp_nm1", p);
		p.Cnd_sppl_grp_lab2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_sppl_grp_lab2.addAliasName("Cnd.sppl_grp_lab2", p);
		p.Cnd_sppl_grp_flg2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_sppl_grp_flg2.addAliasName("Cnd.sppl_grp_flg2", p);
		p.Cnd_sppl_grp_cd2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_sppl_grp_cd2.addAliasName("Cnd.sppl_grp_cd2", p);
		p.Cnd_sppl_grp_nm2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_sppl_grp_nm2.addAliasName("Cnd.sppl_grp_nm2", p);
		p.Cnd_sppl_grp_lab3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_sppl_grp_lab3.addAliasName("Cnd.sppl_grp_lab3", p);
		p.Cnd_sppl_grp_flg3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_sppl_grp_flg3.addAliasName("Cnd.sppl_grp_flg3", p);
		p.Cnd_sppl_grp_cd3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_sppl_grp_cd3.addAliasName("Cnd.sppl_grp_cd3", p);
		p.Cnd_sppl_grp_nm3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_sppl_grp_nm3.addAliasName("Cnd.sppl_grp_nm3", p);
		p.Cnd_sppl_grp_lab4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_sppl_grp_lab4.addAliasName("Cnd.sppl_grp_lab4", p);
		p.Cnd_sppl_grp_flg4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_sppl_grp_flg4.addAliasName("Cnd.sppl_grp_flg4", p);
		p.Cnd_sppl_grp_cd4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_sppl_grp_cd4.addAliasName("Cnd.sppl_grp_cd4", p);
		p.Cnd_sppl_grp_nm4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_sppl_grp_nm4.addAliasName("Cnd.sppl_grp_nm4", p);
		p.Cnd_sppl_grp_lab5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_sppl_grp_lab5.addAliasName("Cnd.sppl_grp_lab5", p);
		p.Cnd_sppl_grp_flg5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_sppl_grp_flg5.addAliasName("Cnd.sppl_grp_flg5", p);
		p.Cnd_sppl_grp_cd5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_sppl_grp_cd5.addAliasName("Cnd.sppl_grp_cd5", p);
		p.Cnd_sppl_grp_nm5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_sppl_grp_nm5.addAliasName("Cnd.sppl_grp_nm5", p);
		p.Cnd_sppl_grp_lab6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_sppl_grp_lab6.addAliasName("Cnd.sppl_grp_lab6", p);
		p.Cnd_sppl_grp_flg6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_sppl_grp_flg6.addAliasName("Cnd.sppl_grp_flg6", p);
		p.Cnd_sppl_grp_cd6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_sppl_grp_cd6.addAliasName("Cnd.sppl_grp_cd6", p);
		p.Cnd_sppl_grp_nm6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_sppl_grp_nm6.addAliasName("Cnd.sppl_grp_nm6", p);
		p.Cnd_sppl_grp_lab7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_sppl_grp_lab7.addAliasName("Cnd.sppl_grp_lab7", p);
		p.Cnd_sppl_grp_flg7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_sppl_grp_flg7.addAliasName("Cnd.sppl_grp_flg7", p);
		p.Cnd_sppl_grp_cd7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_sppl_grp_cd7.addAliasName("Cnd.sppl_grp_cd7", p);
		p.Cnd_sppl_grp_nm7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_sppl_grp_nm7.addAliasName("Cnd.sppl_grp_nm7", p);
		p.Cnd_sppl_grp_lab8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_sppl_grp_lab8.addAliasName("Cnd.sppl_grp_lab8", p);
		p.Cnd_sppl_grp_flg8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_sppl_grp_flg8.addAliasName("Cnd.sppl_grp_flg8", p);
		p.Cnd_sppl_grp_cd8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_sppl_grp_cd8.addAliasName("Cnd.sppl_grp_cd8", p);
		p.Cnd_sppl_grp_nm8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_sppl_grp_nm8.addAliasName("Cnd.sppl_grp_nm8", p);
		p.Cnd_sppl_grp_lab9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_sppl_grp_lab9.addAliasName("Cnd.sppl_grp_lab9", p);
		p.Cnd_sppl_grp_flg9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_sppl_grp_flg9.addAliasName("Cnd.sppl_grp_flg9", p);
		p.Cnd_sppl_grp_cd9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_sppl_grp_cd9.addAliasName("Cnd.sppl_grp_cd9", p);
		p.Cnd_sppl_grp_nm9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_sppl_grp_nm9.addAliasName("Cnd.sppl_grp_nm9", p);
		p.Cnd_sppl_grp_lab10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_sppl_grp_lab10.addAliasName("Cnd.sppl_grp_lab10", p);
		p.Cnd_sppl_grp_flg10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_sppl_grp_flg10.addAliasName("Cnd.sppl_grp_flg10", p);
		p.Cnd_sppl_grp_cd10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_sppl_grp_cd10.addAliasName("Cnd.sppl_grp_cd10", p);
		p.Cnd_sppl_grp_nm10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_sppl_grp_nm10.addAliasName("Cnd.sppl_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBAP_WgRqstReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBAP_WgRqstReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBAP_WgRqstReg p) {
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_rqst_fr_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_rqst_fr_usr_cd.addAliasName("BulkSet.rqst_fr_usr_cd", p);
		p.BulkSet_rqst_fr_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_rqst_fr_usr_nm.addAliasName("BulkSet.rqst_fr_usr_nm", p);
		p.BulkSet_rqst_fr_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_rqst_fr_dpt_cd.addAliasName("BulkSet.rqst_fr_dpt_cd", p);
		p.BulkSet_rqst_fr_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_rqst_fr_dpt_nm.addAliasName("BulkSet.rqst_fr_dpt_nm", p);
	}

	/**
	 * [Rslt1Panel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt1Panel(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Rslt1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt1(MSBAP_WgRqstReg p) {
		p.Rslt1_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$usr_dpt_p);
		p.Rslt1_usr_dpt_p_PPanel.setName("Rslt1.usr_dpt_p");
		p.columnRslt1_rqst_fr_usr_cd = p.Rslt1_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt1_rqst_fr_usr_cd.addAliasName("Rslt1.rqst_fr_usr_cd", p);
		p.columnRslt1_rqst_fr_usr_nm = p.Rslt1_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt1_rqst_fr_usr_nm.addAliasName("Rslt1.rqst_fr_usr_nm", p);
		p.columnRslt1_rqst_fr_dpt_cd = p.Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt1_rqst_fr_dpt_cd.addAliasName("Rslt1.rqst_fr_dpt_cd", p);
		p.columnRslt1_rqst_fr_dpt_nm = p.Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt1_rqst_fr_dpt_nm.addAliasName("Rslt1.rqst_fr_dpt_nm", p);
		p.Rslt1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$itm_p);
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
		p.Rslt1_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$dlv_p);
		p.Rslt1_dlv_p_PPanel.setName("Rslt1.dlv_p");
		p.columnRslt1_dlv_cd = p.Rslt1_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt1_dlv_cd.addAliasName("Rslt1.dlv_cd", p);
		p.columnRslt1_dlv_nm = p.Rslt1_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt1_dlv_nm.addAliasName("Rslt1.dlv_nm", p);
		p.columnRslt1_dlv_sundry_flg = p.Rslt1_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt1_dlv_sundry_flg.addAliasName("Rslt1.dlv_sundry_flg", p);
		p.columnRslt1_dlv_pri_prnt_flg = p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt1_dlv_pri_prnt_flg.addAliasName("Rslt1.dlv_pri_prnt_flg", p);
		p.columnRslt1_dlv_show_dtl = p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt1_dlv_show_dtl.addAliasName("Rslt1.dlv_show_dtl", p);
		p.columnRslt1_dlv_lg_grp_cd = p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt1_dlv_lg_grp_cd.addAliasName("Rslt1.dlv_lg_grp_cd", p);
		p.columnRslt1_dlv_lg_grp_nm = p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt1_dlv_lg_grp_nm.addAliasName("Rslt1.dlv_lg_grp_nm", p);
		p.columnRslt1_dlv_cntry_cd = p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt1_dlv_cntry_cd.addAliasName("Rslt1.dlv_cntry_cd", p);
		p.columnRslt1_dlv_cntry_nm = p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt1_dlv_cntry_nm.addAliasName("Rslt1.dlv_cntry_nm", p);
		p.columnRslt1_dlv_zip_cd = p.Rslt1_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnRslt1_dlv_zip_cd.addAliasName("Rslt1.dlv_zip_cd", p);
		p.columnRslt1_dlv_addr1 = p.Rslt1_dlv_p_PPanel.columnDlv_addr1;
		p.columnRslt1_dlv_addr1.addAliasName("Rslt1.dlv_addr1", p);
		p.columnRslt1_dlv_addr2 = p.Rslt1_dlv_p_PPanel.columnDlv_addr2;
		p.columnRslt1_dlv_addr2.addAliasName("Rslt1.dlv_addr2", p);
		p.columnRslt1_dlv_addr3 = p.Rslt1_dlv_p_PPanel.columnDlv_addr3;
		p.columnRslt1_dlv_addr3.addAliasName("Rslt1.dlv_addr3", p);
		p.columnRslt1_dlv_addr4 = p.Rslt1_dlv_p_PPanel.columnDlv_addr4;
		p.columnRslt1_dlv_addr4.addAliasName("Rslt1.dlv_addr4", p);
		p.columnRslt1_dlv_tel = p.Rslt1_dlv_p_PPanel.columnDlv_tel;
		p.columnRslt1_dlv_tel.addAliasName("Rslt1.dlv_tel", p);
		p.columnRslt1_dlv_fax = p.Rslt1_dlv_p_PPanel.columnDlv_fax;
		p.columnRslt1_dlv_fax.addAliasName("Rslt1.dlv_fax", p);
		p.columnRslt1_dlv_cntct_dpt = p.Rslt1_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt1_dlv_cntct_dpt.addAliasName("Rslt1.dlv_cntct_dpt", p);
		p.columnRslt1_dlv_cntct_psn = p.Rslt1_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt1_dlv_cntct_psn.addAliasName("Rslt1.dlv_cntct_psn", p);
		p.Rslt1_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$tdlv_p);
		p.Rslt1_tdlv_p_PPanel.setName("Rslt1.tdlv_p");
		p.columnRslt1_tdlv_cd = p.Rslt1_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt1_tdlv_cd.addAliasName("Rslt1.tdlv_cd", p);
		p.columnRslt1_tdlv_nm = p.Rslt1_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt1_tdlv_nm.addAliasName("Rslt1.tdlv_nm", p);
		p.columnRslt1_tdlv_sundry_flg = p.Rslt1_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt1_tdlv_sundry_flg.addAliasName("Rslt1.tdlv_sundry_flg", p);
		p.columnRslt1_tdlv_pri_prnt_flg = p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt1_tdlv_pri_prnt_flg.addAliasName("Rslt1.tdlv_pri_prnt_flg", p);
		p.columnRslt1_tdlv_show_dtl = p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt1_tdlv_show_dtl.addAliasName("Rslt1.tdlv_show_dtl", p);
		p.columnRslt1_tdlv_lg_grp_cd = p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt1_tdlv_lg_grp_cd.addAliasName("Rslt1.tdlv_lg_grp_cd", p);
		p.columnRslt1_tdlv_lg_grp_nm = p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt1_tdlv_lg_grp_nm.addAliasName("Rslt1.tdlv_lg_grp_nm", p);
		p.columnRslt1_tdlv_cntry_cd = p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt1_tdlv_cntry_cd.addAliasName("Rslt1.tdlv_cntry_cd", p);
		p.columnRslt1_tdlv_cntry_nm = p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt1_tdlv_cntry_nm.addAliasName("Rslt1.tdlv_cntry_nm", p);
		p.columnRslt1_tdlv_zip_cd = p.Rslt1_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnRslt1_tdlv_zip_cd.addAliasName("Rslt1.tdlv_zip_cd", p);
		p.columnRslt1_tdlv_addr1 = p.Rslt1_tdlv_p_PPanel.columnDlv_addr1;
		p.columnRslt1_tdlv_addr1.addAliasName("Rslt1.tdlv_addr1", p);
		p.columnRslt1_tdlv_addr2 = p.Rslt1_tdlv_p_PPanel.columnDlv_addr2;
		p.columnRslt1_tdlv_addr2.addAliasName("Rslt1.tdlv_addr2", p);
		p.columnRslt1_tdlv_addr3 = p.Rslt1_tdlv_p_PPanel.columnDlv_addr3;
		p.columnRslt1_tdlv_addr3.addAliasName("Rslt1.tdlv_addr3", p);
		p.columnRslt1_tdlv_addr4 = p.Rslt1_tdlv_p_PPanel.columnDlv_addr4;
		p.columnRslt1_tdlv_addr4.addAliasName("Rslt1.tdlv_addr4", p);
		p.columnRslt1_tdlv_tel = p.Rslt1_tdlv_p_PPanel.columnDlv_tel;
		p.columnRslt1_tdlv_tel.addAliasName("Rslt1.tdlv_tel", p);
		p.columnRslt1_tdlv_fax = p.Rslt1_tdlv_p_PPanel.columnDlv_fax;
		p.columnRslt1_tdlv_fax.addAliasName("Rslt1.tdlv_fax", p);
		p.columnRslt1_tdlv_cntct_dpt = p.Rslt1_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt1_tdlv_cntct_dpt.addAliasName("Rslt1.tdlv_cntct_dpt", p);
		p.columnRslt1_tdlv_cntct_psn = p.Rslt1_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt1_tdlv_cntct_psn.addAliasName("Rslt1.tdlv_cntct_psn", p);
		p.Rslt1_gr_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$gr_str_ln_p);
		p.Rslt1_gr_str_ln_p_PPanel.setName("Rslt1.gr_str_ln_p");
		p.columnRslt1_gr_str_ln_cd = p.Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt1_gr_str_ln_cd.addAliasName("Rslt1.gr_str_ln_cd", p);
		p.columnRslt1_gr_str_ln_nm = p.Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt1_gr_str_ln_nm.addAliasName("Rslt1.gr_str_ln_nm", p);
		p.columnRslt1_gr_str_ln_cd_none_flg = p.Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt1_gr_str_ln_cd_none_flg.addAliasName("Rslt1.gr_str_ln_cd_none_flg", p);
		p.Rslt1_gr_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$gr_rqst_dt_p);
		p.Rslt1_gr_rqst_dt_p_PPanel.setName("Rslt1.gr_rqst_dt_p");
		p.columnRslt1_gr_rqst_dt = p.Rslt1_gr_rqst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt1_gr_rqst_dt.addAliasName("Rslt1.gr_rqst_dt", p);
		p.columnRslt1_gr_rqst_hm = p.Rslt1_gr_rqst_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt1_gr_rqst_hm.addAliasName("Rslt1.gr_rqst_hm", p);
		p.Rslt1_gi_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$gi_rqst_dt_p);
		p.Rslt1_gi_rqst_dt_p_PPanel.setName("Rslt1.gi_rqst_dt_p");
		p.columnRslt1_gi_rqst_dt = p.Rslt1_gi_rqst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt1_gi_rqst_dt.addAliasName("Rslt1.gi_rqst_dt", p);
		p.columnRslt1_gi_rqst_hm = p.Rslt1_gi_rqst_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt1_gi_rqst_hm.addAliasName("Rslt1.gi_rqst_hm", p);
		p.Rslt1_rqst_to_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$rqst_to_str_ln_p);
		p.Rslt1_rqst_to_str_ln_p_PPanel.setName("Rslt1.rqst_to_str_ln_p");
		p.columnRslt1_rqst_to_str_ln_cd = p.Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt1_rqst_to_str_ln_cd.addAliasName("Rslt1.rqst_to_str_ln_cd", p);
		p.columnRslt1_rqst_to_str_ln_nm = p.Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt1_rqst_to_str_ln_nm.addAliasName("Rslt1.rqst_to_str_ln_nm", p);
		p.columnRslt1_rqst_to_str_ln_cd_none_flg = p.Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt1_rqst_to_str_ln_cd_none_flg.addAliasName("Rslt1.rqst_to_str_ln_cd_none_flg", p);
		p.Rslt1_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$trd_unit_qty_p);
		p.Rslt1_trd_unit_qty_p_PPanel.setName("Rslt1.trd_unit_qty_p");
		p.columnRslt1_trd_unit_qty = p.Rslt1_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_trd_unit_qty.addAliasName("Rslt1.trd_unit_qty", p);
		p.Rslt1_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$base_unit_qty_p);
		p.Rslt1_base_unit_qty_p_PPanel.setName("Rslt1.base_unit_qty_p");
		p.columnRslt1_base_unit_qty = p.Rslt1_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_base_unit_qty.addAliasName("Rslt1.base_unit_qty", p);
		p.Rslt1_not_cmpl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$not_cmpl_qty_p);
		p.Rslt1_not_cmpl_qty_p_PPanel.setName("Rslt1.not_cmpl_qty_p");
		p.columnRslt1_not_cmpl_qty = p.Rslt1_not_cmpl_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_not_cmpl_qty.addAliasName("Rslt1.not_cmpl_qty", p);
		p.Rslt1_cmpl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$cmpl_qty_p);
		p.Rslt1_cmpl_qty_p_PPanel.setName("Rslt1.cmpl_qty_p");
		p.columnRslt1_cmpl_qty = p.Rslt1_cmpl_qty_p_PPanel.columnQty_qty;
		p.columnRslt1_cmpl_qty.addAliasName("Rslt1.cmpl_qty", p);
		p.Rslt1_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$lot_no_p);
		p.Rslt1_lot_no_p_PPanel.setName("Rslt1.lot_no_p");
		p.columnRslt1_crt_lot_flg = p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt1_crt_lot_flg.addAliasName("Rslt1.crt_lot_flg", p);
		p.columnRslt1_lot_no = p.Rslt1_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt1_lot_no.addAliasName("Rslt1.lot_no", p);
		p.columnRslt1_sublot_no = p.Rslt1_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt1_sublot_no.addAliasName("Rslt1.sublot_no", p);
		p.Rslt1_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$sno_wrk_no_p);
		p.Rslt1_sno_wrk_no_p_PPanel.setName("Rslt1.sno_wrk_no_p");
		p.columnRslt1_sno1_null_flg = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnRslt1_sno1_null_flg.addAliasName("Rslt1.sno1_null_flg", p);
		p.columnRslt1_sno1 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt1_sno1.addAliasName("Rslt1.sno1", p);
		p.columnRslt1_sno2_null_flg = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnRslt1_sno2_null_flg.addAliasName("Rslt1.sno2_null_flg", p);
		p.columnRslt1_sno2 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt1_sno2.addAliasName("Rslt1.sno2", p);
		p.columnRslt1_sno3_null_flg = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnRslt1_sno3_null_flg.addAliasName("Rslt1.sno3_null_flg", p);
		p.columnRslt1_sno3 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt1_sno3.addAliasName("Rslt1.sno3", p);
		p.columnRslt1_sno4_null_flg = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnRslt1_sno4_null_flg.addAliasName("Rslt1.sno4_null_flg", p);
		p.columnRslt1_sno4 = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt1_sno4.addAliasName("Rslt1.sno4", p);
		p.columnRslt1_wrk_no = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt1_wrk_no.addAliasName("Rslt1.wrk_no", p);
		p.columnRslt1_wrk_nm = p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt1_wrk_nm.addAliasName("Rslt1.wrk_nm", p);
		p.Rslt1_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$ver_no_p);
		p.Rslt1_ver_no_p_PPanel.setName("Rslt1.ver_no_p");
		p.columnRslt1_ver_no = p.Rslt1_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt1_ver_no.addAliasName("Rslt1.ver_no", p);
		p.Rslt1_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$bditm_p);
		p.Rslt1_bditm_p_PPanel.setName("Rslt1.bditm_p");
		p.columnRslt1_bd_dpt_cd = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnRslt1_bd_dpt_cd.addAliasName("Rslt1.bd_dpt_cd", p);
		p.columnRslt1_bd_dpt_nm = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnRslt1_bd_dpt_nm.addAliasName("Rslt1.bd_dpt_nm", p);
		p.columnRslt1_bd_itm_cd = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnRslt1_bd_itm_cd.addAliasName("Rslt1.bd_itm_cd", p);
		p.columnRslt1_bd_itm_sub1 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnRslt1_bd_itm_sub1.addAliasName("Rslt1.bd_itm_sub1", p);
		p.columnRslt1_bd_itm_sub2 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnRslt1_bd_itm_sub2.addAliasName("Rslt1.bd_itm_sub2", p);
		p.columnRslt1_bd_itm_sub3 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnRslt1_bd_itm_sub3.addAliasName("Rslt1.bd_itm_sub3", p);
		p.columnRslt1_bd_itm_nm = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnRslt1_bd_itm_nm.addAliasName("Rslt1.bd_itm_nm", p);
		p.columnRslt1_bd_lot_no = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnRslt1_bd_lot_no.addAliasName("Rslt1.bd_lot_no", p);
		p.columnRslt1_bd_sublot_no = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnRslt1_bd_sublot_no.addAliasName("Rslt1.bd_sublot_no", p);
		p.columnRslt1_bd_sno1 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnRslt1_bd_sno1.addAliasName("Rslt1.bd_sno1", p);
		p.columnRslt1_bd_sno2 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnRslt1_bd_sno2.addAliasName("Rslt1.bd_sno2", p);
		p.columnRslt1_bd_sno3 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnRslt1_bd_sno3.addAliasName("Rslt1.bd_sno3", p);
		p.columnRslt1_bd_sno4 = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnRslt1_bd_sno4.addAliasName("Rslt1.bd_sno4", p);
		p.columnRslt1_bd_bp_cd = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnRslt1_bd_bp_cd.addAliasName("Rslt1.bd_bp_cd", p);
		p.columnRslt1_bd_bp_nm = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnRslt1_bd_bp_nm.addAliasName("Rslt1.bd_bp_nm", p);
		p.columnRslt1_bd_loc_cd = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnRslt1_bd_loc_cd.addAliasName("Rslt1.bd_loc_cd", p);
		p.columnRslt1_bd_loc_nm = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnRslt1_bd_loc_nm.addAliasName("Rslt1.bd_loc_nm", p);
		p.columnRslt1_bd_ctg_cd = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnRslt1_bd_ctg_cd.addAliasName("Rslt1.bd_ctg_cd", p);
		p.columnRslt1_bd_ctg_nm = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnRslt1_bd_ctg_nm.addAliasName("Rslt1.bd_ctg_nm", p);
		p.columnRslt1_bd_oper_cd = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnRslt1_bd_oper_cd.addAliasName("Rslt1.bd_oper_cd", p);
		p.columnRslt1_bd_oper_nm = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnRslt1_bd_oper_nm.addAliasName("Rslt1.bd_oper_nm", p);
		p.columnRslt1_bd_iv_no = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnRslt1_bd_iv_no.addAliasName("Rslt1.bd_iv_no", p);
		p.columnRslt1_bd_slo_no = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnRslt1_bd_slo_no.addAliasName("Rslt1.bd_slo_no", p);
		p.columnRslt1_bd_po_no = p.Rslt1_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnRslt1_bd_po_no.addAliasName("Rslt1.bd_po_no", p);
		p.Rslt1_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$rts_msg_p);
		p.Rslt1_rts_msg_p_PPanel.setName("Rslt1.rts_msg_p");
		p.columnRslt1_rtn_sts_typ = p.Rslt1_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt1_rtn_sts_typ.addAliasName("Rslt1.rtn_sts_typ", p);
		p.Rslt1_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$itm_grp_p);
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
		p.Rslt1_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$dlv_grp_p);
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
		p.Rslt1_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.$sppl_grp_p);
		p.Rslt1_sppl_grp_p_PPanel.setName("Rslt1.sppl_grp_p");
		p.columnRslt1_sppl_grp_cd1 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt1_sppl_grp_cd1.addAliasName("Rslt1.sppl_grp_cd1", p);
		p.columnRslt1_sppl_grp_nm1 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt1_sppl_grp_nm1.addAliasName("Rslt1.sppl_grp_nm1", p);
		p.columnRslt1_sppl_grp_cd2 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt1_sppl_grp_cd2.addAliasName("Rslt1.sppl_grp_cd2", p);
		p.columnRslt1_sppl_grp_nm2 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt1_sppl_grp_nm2.addAliasName("Rslt1.sppl_grp_nm2", p);
		p.columnRslt1_sppl_grp_cd3 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt1_sppl_grp_cd3.addAliasName("Rslt1.sppl_grp_cd3", p);
		p.columnRslt1_sppl_grp_nm3 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt1_sppl_grp_nm3.addAliasName("Rslt1.sppl_grp_nm3", p);
		p.columnRslt1_sppl_grp_cd4 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt1_sppl_grp_cd4.addAliasName("Rslt1.sppl_grp_cd4", p);
		p.columnRslt1_sppl_grp_nm4 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt1_sppl_grp_nm4.addAliasName("Rslt1.sppl_grp_nm4", p);
		p.columnRslt1_sppl_grp_cd5 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt1_sppl_grp_cd5.addAliasName("Rslt1.sppl_grp_cd5", p);
		p.columnRslt1_sppl_grp_nm5 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt1_sppl_grp_nm5.addAliasName("Rslt1.sppl_grp_nm5", p);
		p.columnRslt1_sppl_grp_cd6 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt1_sppl_grp_cd6.addAliasName("Rslt1.sppl_grp_cd6", p);
		p.columnRslt1_sppl_grp_nm6 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt1_sppl_grp_nm6.addAliasName("Rslt1.sppl_grp_nm6", p);
		p.columnRslt1_sppl_grp_cd7 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt1_sppl_grp_cd7.addAliasName("Rslt1.sppl_grp_cd7", p);
		p.columnRslt1_sppl_grp_nm7 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt1_sppl_grp_nm7.addAliasName("Rslt1.sppl_grp_nm7", p);
		p.columnRslt1_sppl_grp_cd8 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt1_sppl_grp_cd8.addAliasName("Rslt1.sppl_grp_cd8", p);
		p.columnRslt1_sppl_grp_nm8 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt1_sppl_grp_nm8.addAliasName("Rslt1.sppl_grp_nm8", p);
		p.columnRslt1_sppl_grp_cd9 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt1_sppl_grp_cd9.addAliasName("Rslt1.sppl_grp_cd9", p);
		p.columnRslt1_sppl_grp_nm9 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt1_sppl_grp_nm9.addAliasName("Rslt1.sppl_grp_nm9", p);
		p.columnRslt1_sppl_grp_cd10 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt1_sppl_grp_cd10.addAliasName("Rslt1.sppl_grp_cd10", p);
		p.columnRslt1_sppl_grp_nm10 = p.Rslt1_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt1_sppl_grp_nm10.addAliasName("Rslt1.sppl_grp_nm10", p);
	}

	/**
	 * [Rslt1Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt1Btn(MSBAP_WgRqstReg p) {
	}

	/**
	 * [Rslt2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt2(MSBAP_WgRqstReg p) {
		p.Rslt2_prms_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0100.Rslt2R.$prms_trd_unit_qty_p);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.setName("Rslt2.prms_trd_unit_qty_p");
		p.columnRslt2_prms_trd_unit_qty = p.Rslt2_prms_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_prms_trd_unit_qty.addAliasName("Rslt2.prms_trd_unit_qty", p);
		p.Rslt2_prms_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBA.MSBAP0100.Rslt2R.$prms_base_unit_qty_p);
		p.Rslt2_prms_base_unit_qty_p_PPanel.setName("Rslt2.prms_base_unit_qty_p");
		p.columnRslt2_prms_base_unit_qty = p.Rslt2_prms_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt2_prms_base_unit_qty.addAliasName("Rslt2.prms_base_unit_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBAP_WgRqstReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBAP_WgRqstReg p) {
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

	
	/** [Cnd_wg_rqst_ntc_day_typ_ListPutter]の定義 */
	private MCListPutter Cnd_wg_rqst_ntc_day_typ_p = null;

	/**
	 * [Cnd_wg_rqst_ntc_day_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_rqst_ntc_day_typ_ListPutter() {
		if (Cnd_wg_rqst_ntc_day_typ_p == null) {
			Cnd_wg_rqst_ntc_day_typ_p = createCnd_wg_rqst_ntc_day_typ_ListPutter(Cnd_wg_rqst_ntc_day_typ, "wg_rqst_ntc_day_typ", "wg_rqst_ntc_day_typ_nm");

		}
		return Cnd_wg_rqst_ntc_day_typ_p;
	}
	
	
	/** [Cnd_rqst_fr_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_fr_wg_cd_p = null;

	/**
	 * [Cnd_rqst_fr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_fr_wg_cd_ListPutter() {
		if (Cnd_rqst_fr_wg_cd_p == null) {
			Cnd_rqst_fr_wg_cd_p = createCnd_rqst_fr_wg_cd_ListPutter(Cnd_rqst_fr_wg_cd, "rqst_fr_wg_cd", "rqst_fr_wg_nm");

		}
		return Cnd_rqst_fr_wg_cd_p;
	}
	
	
	/** [Cnd_rqst_to_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_to_wg_cd_p = null;

	/**
	 * [Cnd_rqst_to_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_to_wg_cd_ListPutter() {
		if (Cnd_rqst_to_wg_cd_p == null) {
			Cnd_rqst_to_wg_cd_p = createCnd_rqst_to_wg_cd_ListPutter(Cnd_rqst_to_wg_cd, "rqst_to_wg_cd", "rqst_to_wg_nm");

		}
		return Cnd_rqst_to_wg_cd_p;
	}
	
	
	/** [Cnd_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_loc_cd_p = null;

	/**
	 * [Cnd_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_loc_cd_ListPutter() {
		if (Cnd_gr_loc_cd_p == null) {
			Cnd_gr_loc_cd_p = createCnd_gr_loc_cd_ListPutter(Cnd_gr_loc_cd, "gr_loc_cd", "gr_loc_nm");

		}
		return Cnd_gr_loc_cd_p;
	}
	
	
	/** [Cnd_gr_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_site_cd_p = null;

	/**
	 * [Cnd_gr_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_site_cd_ListPutter() {
		if (Cnd_gr_site_cd_p == null) {
			Cnd_gr_site_cd_p = createCnd_gr_site_cd_ListPutter(Cnd_gr_site_cd, "gr_site_cd", "gr_site_nm");

		}
		return Cnd_gr_site_cd_p;
	}
	
	
	/** [Cnd_gr_loc_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_loc_wg_cd_p = null;

	/**
	 * [Cnd_gr_loc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_loc_wg_cd_ListPutter() {
		if (Cnd_gr_loc_wg_cd_p == null) {
			Cnd_gr_loc_wg_cd_p = createCnd_gr_loc_wg_cd_ListPutter(Cnd_gr_loc_wg_cd, "gr_loc_wg_cd", "gr_loc_wg_nm");

		}
		return Cnd_gr_loc_wg_cd_p;
	}
	
	
	/** [Cnd_gr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_lg_grp_cd_p = null;

	/**
	 * [Cnd_gr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_lg_grp_cd_ListPutter() {
		if (Cnd_gr_lg_grp_cd_p == null) {
			Cnd_gr_lg_grp_cd_p = createCnd_gr_lg_grp_cd_ListPutter(Cnd_gr_lg_grp_cd, "gr_lg_grp_cd", "gr_lg_grp_nm");

		}
		return Cnd_gr_lg_grp_cd_p;
	}
	
	
	/** [Cnd_gr_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_loc_grp_cd_p = null;

	/**
	 * [Cnd_gr_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_loc_grp_cd_ListPutter() {
		if (Cnd_gr_loc_grp_cd_p == null) {
			Cnd_gr_loc_grp_cd_p = createCnd_gr_loc_grp_cd_ListPutter(Cnd_gr_loc_grp_cd, "gr_loc_grp_cd", "gr_loc_grp_nm");

		}
		return Cnd_gr_loc_grp_cd_p;
	}
	
	
	/** [Cnd_gr_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_str_ln_cd_p = null;

	/**
	 * [Cnd_gr_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_str_ln_cd_ListPutter() {
		if (Cnd_gr_str_ln_cd_p == null) {
			Cnd_gr_str_ln_cd_p = createCnd_gr_str_ln_cd_ListPutter(Cnd_gr_str_ln_cd, "gr_str_ln_cd", "gr_str_ln_nm");

		}
		return Cnd_gr_str_ln_cd_p;
	}
	
	
	/** [Cnd_rqst_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_to_loc_cd_p = null;

	/**
	 * [Cnd_rqst_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_to_loc_cd_ListPutter() {
		if (Cnd_rqst_to_loc_cd_p == null) {
			Cnd_rqst_to_loc_cd_p = createCnd_rqst_to_loc_cd_ListPutter(Cnd_rqst_to_loc_cd, "rqst_to_loc_cd", "rqst_to_loc_nm");

		}
		return Cnd_rqst_to_loc_cd_p;
	}
	
	
	/** [Cnd_rqst_to_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_to_site_cd_p = null;

	/**
	 * [Cnd_rqst_to_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_to_site_cd_ListPutter() {
		if (Cnd_rqst_to_site_cd_p == null) {
			Cnd_rqst_to_site_cd_p = createCnd_rqst_to_site_cd_ListPutter(Cnd_rqst_to_site_cd, "rqst_to_site_cd", "rqst_to_site_nm");

		}
		return Cnd_rqst_to_site_cd_p;
	}
	
	
	/** [Cnd_rqst_to_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_to_lg_grp_cd_p = null;

	/**
	 * [Cnd_rqst_to_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_to_lg_grp_cd_ListPutter() {
		if (Cnd_rqst_to_lg_grp_cd_p == null) {
			Cnd_rqst_to_lg_grp_cd_p = createCnd_rqst_to_lg_grp_cd_ListPutter(Cnd_rqst_to_lg_grp_cd, "rqst_to_lg_grp_cd", "rqst_to_lg_grp_nm");

		}
		return Cnd_rqst_to_lg_grp_cd_p;
	}
	
	
	/** [Cnd_rqst_to_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_to_loc_grp_cd_p = null;

	/**
	 * [Cnd_rqst_to_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_to_loc_grp_cd_ListPutter() {
		if (Cnd_rqst_to_loc_grp_cd_p == null) {
			Cnd_rqst_to_loc_grp_cd_p = createCnd_rqst_to_loc_grp_cd_ListPutter(Cnd_rqst_to_loc_grp_cd, "rqst_to_loc_grp_cd", "rqst_to_loc_grp_nm");

		}
		return Cnd_rqst_to_loc_grp_cd_p;
	}
	
	
	/** [Cnd_rqst_to_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_to_str_ln_cd_p = null;

	/**
	 * [Cnd_rqst_to_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_to_str_ln_cd_ListPutter() {
		if (Cnd_rqst_to_str_ln_cd_p == null) {
			Cnd_rqst_to_str_ln_cd_p = createCnd_rqst_to_str_ln_cd_ListPutter(Cnd_rqst_to_str_ln_cd, "rqst_to_str_ln_cd", "rqst_to_str_ln_nm");

		}
		return Cnd_rqst_to_str_ln_cd_p;
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
	
	
	/** [Cnd_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_lot_no_p = null;

	/**
	 * [Cnd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_no_ListPutter() {
		if (Cnd_lot_no_p == null) {
			Cnd_lot_no_p = createCnd_lot_no_ListPutter(Cnd_lot_no, "lot_no");

		}
		return Cnd_lot_no_p;
	}
	
	
	/** [Cnd_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_sublot_no_p = null;

	/**
	 * [Cnd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sublot_no_ListPutter() {
		if (Cnd_sublot_no_p == null) {
			Cnd_sublot_no_p = createCnd_sublot_no_ListPutter(Cnd_sublot_no, "sublot_no");

		}
		return Cnd_sublot_no_p;
	}
	
	
	/** [Cnd_rqst_fr_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_fr_usr_cd_p = null;

	/**
	 * [Cnd_rqst_fr_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_fr_usr_cd_ListPutter() {
		if (Cnd_rqst_fr_usr_cd_p == null) {
			Cnd_rqst_fr_usr_cd_p = createCnd_rqst_fr_usr_cd_ListPutter(Cnd_rqst_fr_usr_cd, "rqst_fr_usr_cd", "rqst_fr_usr_nm");

		}
		return Cnd_rqst_fr_usr_cd_p;
	}
	
	
	/** [Cnd_rqst_fr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_fr_dpt_cd_p = null;

	/**
	 * [Cnd_rqst_fr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_fr_dpt_cd_ListPutter() {
		if (Cnd_rqst_fr_dpt_cd_p == null) {
			Cnd_rqst_fr_dpt_cd_p = createCnd_rqst_fr_dpt_cd_ListPutter(Cnd_rqst_fr_dpt_cd, "rqst_fr_dpt_cd", "rqst_fr_dpt_nm");

		}
		return Cnd_rqst_fr_dpt_cd_p;
	}
	
	
	/** [Cnd_wg_rqst_src_typ_ListPutter]の定義 */
	private MCListPutter Cnd_wg_rqst_src_typ_p = null;

	/**
	 * [Cnd_wg_rqst_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_rqst_src_typ_ListPutter() {
		if (Cnd_wg_rqst_src_typ_p == null) {
			Cnd_wg_rqst_src_typ_p = createCnd_wg_rqst_src_typ_ListPutter(Cnd_wg_rqst_src_typ, "wg_rqst_src_typ", "wg_rqst_src_typ_nm");

		}
		return Cnd_wg_rqst_src_typ_p;
	}
	
	
	/** [BulkSet_rqst_fr_wg_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_rqst_fr_wg_cd_p = null;

	/**
	 * [BulkSet_rqst_fr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_rqst_fr_wg_cd_ListPutter() {
		if (BulkSet_rqst_fr_wg_cd_p == null) {
			BulkSet_rqst_fr_wg_cd_p = createBulkSet_rqst_fr_wg_cd_ListPutter(BulkSet_rqst_fr_wg_cd, "rqst_fr_wg_cd", "rqst_fr_wg_nm");

		}
		return BulkSet_rqst_fr_wg_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "rqst_fr_dpt_cd", "rqst_fr_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt1_wg_rqst_no_ListPutter]の定義 */
	private MCListPutter Rslt1_wg_rqst_no_p = null;

	/**
	 * [Rslt1_wg_rqst_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_wg_rqst_no_ListPutter() {
		if (Rslt1_wg_rqst_no_p == null) {
			Rslt1_wg_rqst_no_p = createRslt1_wg_rqst_no_ListPutter(columnRslt1_wg_rqst_no, "wg_rqst_no");

		}
		return Rslt1_wg_rqst_no_p;
	}
	
	
	/** [Rslt1_last_wg_rqst_no_ListPutter]の定義 */
	private MCListPutter Rslt1_last_wg_rqst_no_p = null;

	/**
	 * [Rslt1_last_wg_rqst_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_last_wg_rqst_no_ListPutter() {
		if (Rslt1_last_wg_rqst_no_p == null) {
			Rslt1_last_wg_rqst_no_p = createRslt1_last_wg_rqst_no_ListPutter(columnRslt1_last_wg_rqst_no, "last_wg_rqst_no");

		}
		return Rslt1_last_wg_rqst_no_p;
	}
	
	
	/** [Rslt1_wg_rqst_typ_ListPutter]の定義 */
	private MCListPutter Rslt1_wg_rqst_typ_p = null;

	/**
	 * [Rslt1_wg_rqst_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_wg_rqst_typ_ListPutter() {
		if (Rslt1_wg_rqst_typ_p == null) {
			Rslt1_wg_rqst_typ_p = createRslt1_wg_rqst_typ_ListPutter(columnRslt1_wg_rqst_typ, "wg_rqst_typ", "wg_rqst_typ_nm");

		}
		return Rslt1_wg_rqst_typ_p;
	}
	
	
	/** [Rslt1_rqst_fr_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_rqst_fr_wg_cd_p = null;

	/**
	 * [Rslt1_rqst_fr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_rqst_fr_wg_cd_ListPutter() {
		if (Rslt1_rqst_fr_wg_cd_p == null) {
			Rslt1_rqst_fr_wg_cd_p = createRslt1_rqst_fr_wg_cd_ListPutter(columnRslt1_rqst_fr_wg_cd, "rqst_fr_wg_cd", "rqst_fr_wg_nm");

		}
		return Rslt1_rqst_fr_wg_cd_p;
	}
	
	
	/** [Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "rqst_fr_dpt_cd", "rqst_fr_dpt_nm");
		}
		return Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt1_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt1_itm_p_PPanel_columnItm_itm_cd_p = createRslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt1_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","asset_mng_typ","ver_flg","sundry_itm_flg","dscnt_itm_flg");
		}
		return Rslt1_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Rslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt1_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Rslt1_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Rslt1_itm_p_PPanel_columnItm_itm_sub1_p = createRslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt1_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","asset_mng_typ","ver_flg","sundry_itm_flg","dscnt_itm_flg");
		}
		return Rslt1_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Rslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt1_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Rslt1_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Rslt1_itm_p_PPanel_columnItm_itm_sub2_p = createRslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt1_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","asset_mng_typ","ver_flg","sundry_itm_flg","dscnt_itm_flg");
		}
		return Rslt1_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Rslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt1_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Rslt1_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Rslt1_itm_p_PPanel_columnItm_itm_sub3_p = createRslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt1_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","asset_mng_typ","ver_flg","sundry_itm_flg","dscnt_itm_flg");
		}
		return Rslt1_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt1_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Rslt1_asset_mng_typ_p = null;

	/**
	 * [Rslt1_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_asset_mng_typ_ListPutter() {
		if (Rslt1_asset_mng_typ_p == null) {
			Rslt1_asset_mng_typ_p = createRslt1_asset_mng_typ_ListPutter(columnRslt1_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Rslt1_asset_mng_typ_p;
	}
	
	
	/** [Rslt1_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_gr_loc_cd_p = null;

	/**
	 * [Rslt1_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_gr_loc_cd_ListPutter() {
		if (Rslt1_gr_loc_cd_p == null) {
			Rslt1_gr_loc_cd_p = createRslt1_gr_loc_cd_ListPutter(columnRslt1_gr_loc_cd, "gr_loc_cd", "gr_loc_nm","gr_loc_wg_cd","gr_loc_wg_nm","gr_site_cd","gr_site_nm","gr_lg_grp_cd","gr_lg_grp_nm","gr_loc_grp_cd","gr_loc_grp_nm","gr_str_ln_tgt_flg","gr_str_ln_cd","gr_str_ln_cd_none_flg");

		}
		return Rslt1_gr_loc_cd_p;
	}
	
	
	/** [Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd, "gr_str_ln_cd", "gr_str_ln_nm");
		}
		return Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Rslt1_rqst_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_rqst_to_loc_cd_p = null;

	/**
	 * [Rslt1_rqst_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_rqst_to_loc_cd_ListPutter() {
		if (Rslt1_rqst_to_loc_cd_p == null) {
			Rslt1_rqst_to_loc_cd_p = createRslt1_rqst_to_loc_cd_ListPutter(columnRslt1_rqst_to_loc_cd, "rqst_to_loc_cd", "rqst_to_loc_nm","rqst_to_wg_cd","rqst_to_wg_nm","rqst_to_str_ln_tgt_flg","rqst_to_loc_grp_cd","rqst_to_loc_grp_nm","rqst_to_lg_grp_cd","rqst_to_lg_grp_nm","rqst_to_site_cd","rqst_to_site_nm");

		}
		return Rslt1_rqst_to_loc_cd_p;
	}
	
	
	/** [Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd, "rqst_to_str_ln_cd", "rqst_to_str_ln_nm");
		}
		return Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Rslt1_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_mfg_loc_cd_p = null;

	/**
	 * [Rslt1_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_mfg_loc_cd_ListPutter() {
		if (Rslt1_mfg_loc_cd_p == null) {
			Rslt1_mfg_loc_cd_p = createRslt1_mfg_loc_cd_ListPutter(columnRslt1_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","sppl_cd","maker_cd");

		}
		return Rslt1_mfg_loc_cd_p;
	}
	
	
	/** [Rslt1_bom_ptn_ListPutter]の定義 */
	private MCListPutter Rslt1_bom_ptn_p = null;

	/**
	 * [Rslt1_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bom_ptn_ListPutter() {
		if (Rslt1_bom_ptn_p == null) {
			Rslt1_bom_ptn_p = createRslt1_bom_ptn_ListPutter(columnRslt1_bom_ptn, "bom_ptn", "rqst_to_wg_cd","rqst_to_wg_nm");

		}
		return Rslt1_bom_ptn_p;
	}
	
	
	/** [Rslt1_sppl_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_sppl_cd_p = null;

	/**
	 * [Rslt1_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_sppl_cd_ListPutter() {
		if (Rslt1_sppl_cd_p == null) {
			Rslt1_sppl_cd_p = createRslt1_sppl_cd_ListPutter(columnRslt1_sppl_cd, "sppl_cd", "sppl_nm","sppl_iv_flg","prnt_lcl_cd","rqst_to_wg_cd","rqst_to_wg_nm");

		}
		return Rslt1_sppl_cd_p;
	}
	
	
	/** [Rslt1_maker_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_maker_cd_p = null;

	/**
	 * [Rslt1_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_maker_cd_ListPutter() {
		if (Rslt1_maker_cd_p == null) {
			Rslt1_maker_cd_p = createRslt1_maker_cd_ListPutter(columnRslt1_maker_cd, "maker_cd", "maker_nm","rqst_to_wg_cd","rqst_to_wg_nm");

		}
		return Rslt1_maker_cd_p;
	}
	
	
	/** [Rslt1_rqst_to_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_rqst_to_wg_cd_p = null;

	/**
	 * [Rslt1_rqst_to_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_rqst_to_wg_cd_ListPutter() {
		if (Rslt1_rqst_to_wg_cd_p == null) {
			Rslt1_rqst_to_wg_cd_p = createRslt1_rqst_to_wg_cd_ListPutter(columnRslt1_rqst_to_wg_cd, "rqst_to_wg_cd", "rqst_to_wg_nm");

		}
		return Rslt1_rqst_to_wg_cd_p;
	}
	
	
	/** [Rslt1_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_purc_rsn_cd_p = null;

	/**
	 * [Rslt1_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_purc_rsn_cd_ListPutter() {
		if (Rslt1_purc_rsn_cd_p == null) {
			Rslt1_purc_rsn_cd_p = createRslt1_purc_rsn_cd_ListPutter(columnRslt1_purc_rsn_cd, "purc_rsn_cd", "purc_rsn_nm","xpns_purc_flg");

		}
		return Rslt1_purc_rsn_cd_p;
	}
	
	
	/** [Rslt1_trd_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_trd_cd_p = null;

	/**
	 * [Rslt1_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_trd_cd_ListPutter() {
		if (Rslt1_trd_cd_p == null) {
			Rslt1_trd_cd_p = createRslt1_trd_cd_ListPutter(columnRslt1_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Rslt1_trd_cd_p;
	}
	
	
	/** [Rslt1_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_trd_unit_cd_p = null;

	/**
	 * [Rslt1_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_trd_unit_cd_ListPutter() {
		if (Rslt1_trd_unit_cd_p == null) {
			Rslt1_trd_unit_cd_p = createRslt1_trd_unit_cd_ListPutter(columnRslt1_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Rslt1_trd_unit_cd_p;
	}
	
	
	/** [Rslt1_gd_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_gd_cd_p = null;

	/**
	 * [Rslt1_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_gd_cd_ListPutter() {
		if (Rslt1_gd_cd_p == null) {
			Rslt1_gd_cd_p = createRslt1_gd_cd_ListPutter(columnRslt1_gd_cd, "gd_cd", "gd_nm");

		}
		return Rslt1_gd_cd_p;
	}
	
	
	/** [Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = null;

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter() {
		if (Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p == null) {
			Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = createRslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");
		}
		return Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p;
	}
	
	
	/** [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = null;

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter() {
		if (Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p == null) {
			Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_sub1","bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p;
	}
	
	
	/** [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = null;

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter() {
		if (Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p == null) {
			Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p;
	}
	
	
	/** [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = null;

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter() {
		if (Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p == null) {
			Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p;
	}
	
	
	/** [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = null;

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter() {
		if (Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p == null) {
			Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p;
	}
	
	
	/** [Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_p = null;

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter() {
		if (Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_p == null) {
			Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_p = createRslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter(Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd, "bd_bp_cd", "bd_bp_nm");
		}
		return Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_p;
	}
	
	
	/** [Rslt1_slo_no_ListPutter]の定義 */
	private MCListPutter Rslt1_slo_no_p = null;

	/**
	 * [Rslt1_slo_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_slo_no_ListPutter() {
		if (Rslt1_slo_no_p == null) {
			Rslt1_slo_no_p = createRslt1_slo_no_ListPutter(columnRslt1_slo_no, "slo_no");

		}
		return Rslt1_slo_no_p;
	}
	
	
	/** [Rslt1_slo_d_no_ListPutter]の定義 */
	private MCListPutter Rslt1_slo_d_no_p = null;

	/**
	 * [Rslt1_slo_d_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt1_slo_d_no_ListPutter() {
		if (Rslt1_slo_d_no_p == null) {
			Rslt1_slo_d_no_p = createRslt1_slo_d_no_ListPutter(columnRslt1_slo_d_no, "slo_d_no");

		}
		return Rslt1_slo_d_no_p;
	}
	
	
	/** [Rslt2_wg_rqst_prms_no_ListPutter]の定義 */
	private MCListPutter Rslt2_wg_rqst_prms_no_p = null;

	/**
	 * [Rslt2_wg_rqst_prms_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_wg_rqst_prms_no_ListPutter() {
		if (Rslt2_wg_rqst_prms_no_p == null) {
			Rslt2_wg_rqst_prms_no_p = createRslt2_wg_rqst_prms_no_ListPutter(columnRslt2_wg_rqst_prms_no, "wg_rqst_prms_no");

		}
		return Rslt2_wg_rqst_prms_no_p;
	}
	
	
	/** [Rslt2_wg_rqst_no_ListPutter]の定義 */
	private MCListPutter Rslt2_wg_rqst_no_p = null;

	/**
	 * [Rslt2_wg_rqst_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_wg_rqst_no_ListPutter() {
		if (Rslt2_wg_rqst_no_p == null) {
			Rslt2_wg_rqst_no_p = createRslt2_wg_rqst_no_ListPutter(columnRslt2_wg_rqst_no, "wg_rqst_no");

		}
		return Rslt2_wg_rqst_no_p;
	}
	
	
	/** [Rslt2_prms_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_prms_trd_unit_cd_p = null;

	/**
	 * [Rslt2_prms_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_prms_trd_unit_cd_ListPutter() {
		if (Rslt2_prms_trd_unit_cd_p == null) {
			Rslt2_prms_trd_unit_cd_p = createRslt2_prms_trd_unit_cd_ListPutter(columnRslt2_prms_trd_unit_cd, "prms_trd_unit_cd");

		}
		return Rslt2_prms_trd_unit_cd_p;
	}
	
	
	/** [Rslt2_prms_base_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt2_prms_base_unit_cd_p = null;

	/**
	 * [Rslt2_prms_base_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt2_prms_base_unit_cd_ListPutter() {
		if (Rslt2_prms_base_unit_cd_p == null) {
			Rslt2_prms_base_unit_cd_p = createRslt2_prms_base_unit_cd_ListPutter(columnRslt2_prms_base_unit_cd, "prms_base_unit_cd");

		}
		return Rslt2_prms_base_unit_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBAP_WgRqstReg create(){
		MSBAP_WgRqstReg p = new MSBAP_WgRqstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBAP_WgRqstReg create(String name){
		MSBAP_WgRqstReg p = new MSBAP_WgRqstReg(name);
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
		MSBAP_WgRqstReg_MC.jbfInitScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitSloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitTop((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitFold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitTab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitTab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitTab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitTab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitCnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitCnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitCnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitCnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitCtrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitBulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitRslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitBtn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbfInitEastBtn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitSloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitTop((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitFold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitTab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitTab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitTab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitTab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitCnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitCnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitCnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitCnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitCtrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitBulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitRslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitBtn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.jbInitEastBtn((MSBAP_WgRqstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RqstTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqstTyp(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.RqstTypPanel = p.beansFactory.createPanel("RqstTyp");
		p.RqstTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RqstSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqstSts(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.RqstStsPanel = p.beansFactory.createPanel("RqstSts");
		p.RqstStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SloRqst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSloRqst(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.SloRqstPanel = p.beansFactory.createPanel("SloRqst");
		p.SloRqstTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBAP_WgRqstReg p) {
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
	protected static void jbfInitTab1(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_xfr_rqst_flg = p.beansFactory.createCheckBox("Cnd.xfr_rqst_flg");
		p.Cnd_purc_rqst_flg = p.beansFactory.createCheckBox("Cnd.purc_rqst_flg");
		p.Cnd_ship_rqst_flg = p.beansFactory.createCheckBox("Cnd.ship_rqst_flg");
		p.Cnd_rqst_sts_flg = p.beansFactory.createCheckBox("Cnd.rqst_sts_flg");
		p.Cnd_prms_sts_flg = p.beansFactory.createCheckBox("Cnd.prms_sts_flg");
		p.Cnd_part_inst_sts_flg = p.beansFactory.createCheckBox("Cnd.part_inst_sts_flg");
		p.Cnd_inst_sts_flg = p.beansFactory.createCheckBox("Cnd.inst_sts_flg");
		p.Cnd_cmpl_sts_flg = p.beansFactory.createCheckBox("Cnd.cmpl_sts_flg");
		p.Cnd_slo_rqst_flg = p.beansFactory.createCheckBox("Cnd.slo_rqst_flg");
		p.Cnd_un_slo_rqst_flg = p.beansFactory.createCheckBox("Cnd.un_slo_rqst_flg");
		p.Cnd_rqst_dt_fr_Label = p.beansFactory.createLabel("Cnd.rqst_dt_fr_Label");
		p.Cnd_rqst_dt_fr = p.beansFactory.createDateField("Cnd.rqst_dt_fr");
		p.Cnd_rqst_dt_fr.setLabel(p.Cnd_rqst_dt_fr_Label);
		p.Cnd_rqst_dt_to_Label = p.beansFactory.createLabel("Cnd.rqst_dt_to_Label");
		p.Cnd_rqst_dt_to = p.beansFactory.createDateField("Cnd.rqst_dt_to");
		p.Cnd_rqst_dt_to.setLabel(p.Cnd_rqst_dt_to_Label);
		p.Cnd_re_rqst_dt_fr_Label = p.beansFactory.createLabel("Cnd.re_rqst_dt_fr_Label");
		p.Cnd_re_rqst_dt_fr = p.beansFactory.createDateField("Cnd.re_rqst_dt_fr");
		p.Cnd_re_rqst_dt_fr.setLabel(p.Cnd_re_rqst_dt_fr_Label);
		p.Cnd_re_rqst_dt_to_Label = p.beansFactory.createLabel("Cnd.re_rqst_dt_to_Label");
		p.Cnd_re_rqst_dt_to = p.beansFactory.createDateField("Cnd.re_rqst_dt_to");
		p.Cnd_re_rqst_dt_to.setLabel(p.Cnd_re_rqst_dt_to_Label);
		p.Cnd_wg_rqst_ntc_day_typ_Label = p.beansFactory.createLabel("Cnd.wg_rqst_ntc_day_typ_Label");
		p.Cnd_wg_rqst_ntc_day_typ = p.beansFactory.createTextComboBox("Cnd.wg_rqst_ntc_day_typ");
		p.Cnd_wg_rqst_ntc_day_typ.setLabel(p.Cnd_wg_rqst_ntc_day_typ_Label);
		p.Cnd_wg_rqst_ntc_day_typ_nm = p.beansFactory.createTextField("Cnd.wg_rqst_ntc_day_typ_nm");
		p.Cnd_srch_dt_fr_Label = p.beansFactory.createLabel("Cnd.srch_dt_fr_Label");
		p.Cnd_srch_dt_fr = p.beansFactory.createDateField("Cnd.srch_dt_fr");
		p.Cnd_srch_dt_fr.setLabel(p.Cnd_srch_dt_fr_Label);
		p.Cnd_srch_dt_to_Label = p.beansFactory.createLabel("Cnd.srch_dt_to_Label");
		p.Cnd_srch_dt_to = p.beansFactory.createDateField("Cnd.srch_dt_to");
		p.Cnd_srch_dt_to.setLabel(p.Cnd_srch_dt_to_Label);
		p.Cnd_rqst_fr_wg_cd_Label = p.beansFactory.createLabel("Cnd.rqst_fr_wg_cd_Label");
		p.Cnd_rqst_fr_wg_cd = p.beansFactory.createTextComboBox("Cnd.rqst_fr_wg_cd");
		p.Cnd_rqst_fr_wg_cd.setLabel(p.Cnd_rqst_fr_wg_cd_Label);
		p.Cnd_rqst_fr_wg_nm = p.beansFactory.createTextField("Cnd.rqst_fr_wg_nm");
		p.Cnd_rqst_to_wg_cd_Label = p.beansFactory.createLabel("Cnd.rqst_to_wg_cd_Label");
		p.Cnd_rqst_to_wg_cd = p.beansFactory.createTextComboBox("Cnd.rqst_to_wg_cd");
		p.Cnd_rqst_to_wg_cd.setLabel(p.Cnd_rqst_to_wg_cd_Label);
		p.Cnd_rqst_to_wg_nm = p.beansFactory.createTextField("Cnd.rqst_to_wg_nm");
		p.Cnd_gr_loc_cd_Label = p.beansFactory.createLabel("Cnd.gr_loc_cd_Label");
		p.Cnd_gr_loc_cd = p.beansFactory.createTextField("Cnd.gr_loc_cd");
		p.Cnd_gr_loc_cd.setLabel(p.Cnd_gr_loc_cd_Label);
		p.Cnd_gr_loc_nm = p.beansFactory.createTextField("Cnd.gr_loc_nm");
		p.Cnd_gr_site_cd_Label = p.beansFactory.createLabel("Cnd.gr_site_cd_Label");
		p.Cnd_gr_site_cd = p.beansFactory.createTextComboBox("Cnd.gr_site_cd");
		p.Cnd_gr_site_cd.setLabel(p.Cnd_gr_site_cd_Label);
		p.Cnd_gr_site_nm = p.beansFactory.createTextField("Cnd.gr_site_nm");
		p.Cnd_gr_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.gr_loc_wg_cd_Label");
		p.Cnd_gr_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.gr_loc_wg_cd");
		p.Cnd_gr_loc_wg_cd.setLabel(p.Cnd_gr_loc_wg_cd_Label);
		p.Cnd_gr_loc_wg_nm = p.beansFactory.createTextField("Cnd.gr_loc_wg_nm");
		p.Cnd_gr_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.gr_lg_grp_cd_Label");
		p.Cnd_gr_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.gr_lg_grp_cd");
		p.Cnd_gr_lg_grp_cd.setLabel(p.Cnd_gr_lg_grp_cd_Label);
		p.Cnd_gr_lg_grp_nm = p.beansFactory.createTextField("Cnd.gr_lg_grp_nm");
		p.Cnd_gr_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.gr_loc_grp_cd_Label");
		p.Cnd_gr_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.gr_loc_grp_cd");
		p.Cnd_gr_loc_grp_cd.setLabel(p.Cnd_gr_loc_grp_cd_Label);
		p.Cnd_gr_loc_grp_nm = p.beansFactory.createTextField("Cnd.gr_loc_grp_nm");
		p.Cnd_gr_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.gr_str_ln_cd_Label");
		p.Cnd_gr_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.gr_str_ln_cd");
		p.Cnd_gr_str_ln_cd.setLabel(p.Cnd_gr_str_ln_cd_Label);
		p.Cnd_gr_str_ln_nm = p.beansFactory.createTextField("Cnd.gr_str_ln_nm");
		p.Cnd_rqst_to_loc_cd_Label = p.beansFactory.createLabel("Cnd.rqst_to_loc_cd_Label");
		p.Cnd_rqst_to_loc_cd = p.beansFactory.createTextField("Cnd.rqst_to_loc_cd");
		p.Cnd_rqst_to_loc_cd.setLabel(p.Cnd_rqst_to_loc_cd_Label);
		p.Cnd_rqst_to_loc_nm = p.beansFactory.createTextField("Cnd.rqst_to_loc_nm");
		p.Cnd_rqst_to_site_cd_Label = p.beansFactory.createLabel("Cnd.rqst_to_site_cd_Label");
		p.Cnd_rqst_to_site_cd = p.beansFactory.createTextComboBox("Cnd.rqst_to_site_cd");
		p.Cnd_rqst_to_site_cd.setLabel(p.Cnd_rqst_to_site_cd_Label);
		p.Cnd_rqst_to_site_nm = p.beansFactory.createTextField("Cnd.rqst_to_site_nm");
		p.Cnd_rqst_to_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.rqst_to_lg_grp_cd_Label");
		p.Cnd_rqst_to_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.rqst_to_lg_grp_cd");
		p.Cnd_rqst_to_lg_grp_cd.setLabel(p.Cnd_rqst_to_lg_grp_cd_Label);
		p.Cnd_rqst_to_lg_grp_nm = p.beansFactory.createTextField("Cnd.rqst_to_lg_grp_nm");
		p.Cnd_rqst_to_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.rqst_to_loc_grp_cd_Label");
		p.Cnd_rqst_to_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.rqst_to_loc_grp_cd");
		p.Cnd_rqst_to_loc_grp_cd.setLabel(p.Cnd_rqst_to_loc_grp_cd_Label);
		p.Cnd_rqst_to_loc_grp_nm = p.beansFactory.createTextField("Cnd.rqst_to_loc_grp_nm");
		p.Cnd_rqst_to_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.rqst_to_str_ln_cd_Label");
		p.Cnd_rqst_to_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.rqst_to_str_ln_cd");
		p.Cnd_rqst_to_str_ln_cd.setLabel(p.Cnd_rqst_to_str_ln_cd_Label);
		p.Cnd_rqst_to_str_ln_nm = p.beansFactory.createTextField("Cnd.rqst_to_str_ln_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextComboBox("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextComboBox("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_rqst_fr_usr_cd_Label = p.beansFactory.createLabel("Cnd.rqst_fr_usr_cd_Label");
		p.Cnd_rqst_fr_usr_cd = p.beansFactory.createTextField("Cnd.rqst_fr_usr_cd");
		p.Cnd_rqst_fr_usr_cd.setLabel(p.Cnd_rqst_fr_usr_cd_Label);
		p.Cnd_rqst_fr_usr_nm = p.beansFactory.createTextField("Cnd.rqst_fr_usr_nm");
		p.Cnd_rqst_fr_dpt_cd_Label = p.beansFactory.createLabel("Cnd.rqst_fr_dpt_cd_Label");
		p.Cnd_rqst_fr_dpt_cd = p.beansFactory.createTextField("Cnd.rqst_fr_dpt_cd");
		p.Cnd_rqst_fr_dpt_cd.setLabel(p.Cnd_rqst_fr_dpt_cd_Label);
		p.Cnd_rqst_fr_dpt_nm = p.beansFactory.createTextField("Cnd.rqst_fr_dpt_nm");
		p.Cnd_wg_rqst_src_typ_Label = p.beansFactory.createLabel("Cnd.wg_rqst_src_typ_Label");
		p.Cnd_wg_rqst_src_typ = p.beansFactory.createTextComboBox("Cnd.wg_rqst_src_typ");
		p.Cnd_wg_rqst_src_typ.setLabel(p.Cnd_wg_rqst_src_typ_Label);
		p.Cnd_wg_rqst_src_typ_nm = p.beansFactory.createTextField("Cnd.wg_rqst_src_typ_nm");
		p.Cnd_wg_rqst_src_no_Label = p.beansFactory.createLabel("Cnd.wg_rqst_src_no_Label");
		p.Cnd_wg_rqst_src_no = p.beansFactory.createTextField("Cnd.wg_rqst_src_no");
		p.Cnd_wg_rqst_src_no.setLabel(p.Cnd_wg_rqst_src_no_Label);
		p.Cnd_wg_rqst_no_Label = p.beansFactory.createLabel("Cnd.wg_rqst_no_Label");
		p.Cnd_wg_rqst_no = p.beansFactory.createTextField("Cnd.wg_rqst_no");
		p.Cnd_wg_rqst_no.setLabel(p.Cnd_wg_rqst_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_re_rqst_flg = p.beansFactory.createCheckBox("Cnd.re_rqst_flg");
		p.Cnd_prms_div_flg = p.beansFactory.createCheckBox("Cnd.prms_div_flg");
		p.Cnd_prms_shrtg_flg = p.beansFactory.createCheckBox("Cnd.prms_shrtg_flg");
		p.Cnd_due_delay_flg = p.beansFactory.createCheckBox("Cnd.due_delay_flg");
		p.Cnd_prms_uncn_flg = p.beansFactory.createCheckBox("Cnd.prms_uncn_flg");
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
		p.Cnd_wg_rqst_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.wg_rqst_cnt_rmrks_Label");
		p.Cnd_wg_rqst_cnt_rmrks = p.beansFactory.createTextField("Cnd.wg_rqst_cnt_rmrks");
		p.Cnd_wg_rqst_cnt_rmrks.setLabel(p.Cnd_wg_rqst_cnt_rmrks_Label);
		p.Cnd_wg_re_rqst_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.wg_re_rqst_cnt_rmrks_Label");
		p.Cnd_wg_re_rqst_cnt_rmrks = p.beansFactory.createTextField("Cnd.wg_re_rqst_cnt_rmrks");
		p.Cnd_wg_re_rqst_cnt_rmrks.setLabel(p.Cnd_wg_re_rqst_cnt_rmrks_Label);
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
	protected static void jbfInitCnd2(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_rqst_dt_Label = p.beansFactory.createLabel("BulkSet.rqst_dt_Label");
		p.BulkSet_rqst_dt = p.beansFactory.createDateField("BulkSet.rqst_dt");
		p.BulkSet_rqst_dt.setLabel(p.BulkSet_rqst_dt_Label);
		p.BulkSet_rqst_fr_wg_cd_Label = p.beansFactory.createLabel("BulkSet.rqst_fr_wg_cd_Label");
		p.BulkSet_rqst_fr_wg_cd = p.beansFactory.createTextComboBox("BulkSet.rqst_fr_wg_cd");
		p.BulkSet_rqst_fr_wg_cd.setLabel(p.BulkSet_rqst_fr_wg_cd_Label);
		p.BulkSet_rqst_fr_wg_nm = p.beansFactory.createTextField("BulkSet.rqst_fr_wg_nm");
	}

	/**
	 * [Rslt1Panel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt1Panel(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt1PanelPanel = p.beansFactory.createPanel("Rslt1Panel");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt1(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt1Panel = p.beansFactory.createPanel("Rslt1");
		p.Rslt1TitledBorder = p.beansFactory.createTitledBorder();
		p.Rslt1ScrollPane = p.beansFactory.createScrollPane("Rslt1.scroll");
		p.createRslt1Table();
		// ブロックの項目の初期化
		p.columnRslt1_check = p.beansFactory.createTableColumn("Rslt1.check", MCColumnType.CHECK);
		p.columnRslt1_prms_uncn_flg = p.beansFactory.createTableColumn("Rslt1.prms_uncn_flg", MCColumnType.CHECK);
		p.columnRslt1_re_rqst_flg = p.beansFactory.createTableColumn("Rslt1.re_rqst_flg", MCColumnType.CHECK);
		p.columnRslt1_prms_ntc_flg = p.beansFactory.createTableColumn("Rslt1.prms_ntc_flg", MCColumnType.CHECK);
		p.columnRslt1_prms_dt = p.beansFactory.createTableColumn("Rslt1.prms_dt", MCColumnType.DATE);
		p.columnRslt1_re_prms_ntc_flg = p.beansFactory.createTableColumn("Rslt1.re_prms_ntc_flg", MCColumnType.CHECK);
		p.columnRslt1_re_prms_dt = p.beansFactory.createTableColumn("Rslt1.re_prms_dt", MCColumnType.DATE);
		p.columnRslt1_wg_rqst_no = p.beansFactory.createTableColumn("Rslt1.wg_rqst_no", MCColumnType.TEXT);
		p.columnRslt1_last_wg_rqst_no = p.beansFactory.createTableColumn("Rslt1.last_wg_rqst_no", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_typ = p.beansFactory.createTableColumn("Rslt1.wg_rqst_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt1_wg_rqst_typ_nm = p.beansFactory.createTableColumn("Rslt1.wg_rqst_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_sts_typ = p.beansFactory.createTableColumn("Rslt1.wg_rqst_sts_typ", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_sts_typ_nm = p.beansFactory.createTableColumn("Rslt1.wg_rqst_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_src_typ = p.beansFactory.createTableColumn("Rslt1.wg_rqst_src_typ", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_src_typ_nm = p.beansFactory.createTableColumn("Rslt1.wg_rqst_src_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_src_no = p.beansFactory.createTableColumn("Rslt1.wg_rqst_src_no", MCColumnType.TEXT);
		p.columnRslt1_rqst_fr_wg_cd = p.beansFactory.createTableColumn("Rslt1.rqst_fr_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_rqst_fr_wg_nm = p.beansFactory.createTableColumn("Rslt1.rqst_fr_wg_nm", MCColumnType.TEXT);
		p.columnRslt1_rqst_dt = p.beansFactory.createTableColumn("Rslt1.rqst_dt", MCColumnType.DATE);
		p.columnRslt1_re_rqst_dt = p.beansFactory.createTableColumn("Rslt1.re_rqst_dt", MCColumnType.DATE);
		p.columnRslt1_iv_itm_nm = p.beansFactory.createTableColumn("Rslt1.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt1_lot_mng_typ = p.beansFactory.createTableColumn("Rslt1.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt1.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt1.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt1.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt1_asset_mng_typ = p.beansFactory.createTableColumn("Rslt1.asset_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt1_asset_mng_typ_nm = p.beansFactory.createTableColumn("Rslt1.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt1_dscnt_itm_flg = p.beansFactory.createTableColumn("Rslt1.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnRslt1_ver_flg = p.beansFactory.createTableColumn("Rslt1.ver_flg", MCColumnType.CHECK);
		p.columnRslt1_gr_loc_cd = p.beansFactory.createTableColumn("Rslt1.gr_loc_cd", MCColumnType.TEXT);
		p.columnRslt1_gr_loc_nm = p.beansFactory.createTableColumn("Rslt1.gr_loc_nm", MCColumnType.TEXT);
		p.columnRslt1_gr_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt1.gr_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt1_gr_loc_grp_cd = p.beansFactory.createTableColumn("Rslt1.gr_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt1_gr_loc_grp_nm = p.beansFactory.createTableColumn("Rslt1.gr_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt1_gr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt1.gr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt1_gr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt1.gr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt1_gr_loc_wg_cd = p.beansFactory.createTableColumn("Rslt1.gr_loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt1_gr_loc_wg_nm = p.beansFactory.createTableColumn("Rslt1.gr_loc_wg_nm", MCColumnType.TEXT);
		p.columnRslt1_gr_site_cd = p.beansFactory.createTableColumn("Rslt1.gr_site_cd", MCColumnType.TEXT);
		p.columnRslt1_gr_site_nm = p.beansFactory.createTableColumn("Rslt1.gr_site_nm", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_loc_cd = p.beansFactory.createTableColumn("Rslt1.rqst_to_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_rqst_to_loc_nm = p.beansFactory.createTableColumn("Rslt1.rqst_to_loc_nm", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt1.rqst_to_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt1_rqst_to_loc_grp_cd = p.beansFactory.createTableColumn("Rslt1.rqst_to_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_loc_grp_nm = p.beansFactory.createTableColumn("Rslt1.rqst_to_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_lg_grp_cd = p.beansFactory.createTableColumn("Rslt1.rqst_to_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_lg_grp_nm = p.beansFactory.createTableColumn("Rslt1.rqst_to_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_site_cd = p.beansFactory.createTableColumn("Rslt1.rqst_to_site_cd", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_site_nm = p.beansFactory.createTableColumn("Rslt1.rqst_to_site_nm", MCColumnType.TEXT);
		p.columnRslt1_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt1.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt1.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt1_bom_ptn = p.beansFactory.createTableColumn("Rslt1.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnRslt1_sppl_cd = p.beansFactory.createTableColumn("Rslt1.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_sppl_nm = p.beansFactory.createTableColumn("Rslt1.sppl_nm", MCColumnType.TEXT);
		p.columnRslt1_sppl_iv_flg = p.beansFactory.createTableColumn("Rslt1.sppl_iv_flg", MCColumnType.CHECK);
		p.columnRslt1_prnt_lcl_cd = p.beansFactory.createTableColumn("Rslt1.prnt_lcl_cd", MCColumnType.TEXT);
		p.columnRslt1_maker_cd = p.beansFactory.createTableColumn("Rslt1.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_maker_nm = p.beansFactory.createTableColumn("Rslt1.maker_nm", MCColumnType.TEXT);
		p.columnRslt1_rqst_to_wg_cd = p.beansFactory.createTableColumn("Rslt1.rqst_to_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_rqst_to_wg_nm = p.beansFactory.createTableColumn("Rslt1.rqst_to_wg_nm", MCColumnType.TEXT);
		p.columnRslt1_purc_rsn_cd = p.beansFactory.createTableColumn("Rslt1.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_purc_rsn_nm = p.beansFactory.createTableColumn("Rslt1.purc_rsn_nm", MCColumnType.TEXT);
		p.columnRslt1_xpns_purc_flg = p.beansFactory.createTableColumn("Rslt1.xpns_purc_flg", MCColumnType.CHECK);
		p.columnRslt1_trd_cd = p.beansFactory.createTableColumn("Rslt1.trd_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_trd_nm = p.beansFactory.createTableColumn("Rslt1.trd_nm", MCColumnType.TEXT);
		p.columnRslt1_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt1.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt1_trd_unit_cd = p.beansFactory.createTableColumn("Rslt1.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_trd_unit_nm = p.beansFactory.createTableColumn("Rslt1.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt1_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt1.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt1_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt1.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt1_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt1.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt1_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt1.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt1_base_unit_cd = p.beansFactory.createTableColumn("Rslt1.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt1_base_unit_nm = p.beansFactory.createTableColumn("Rslt1.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt1_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt1.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt1_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt1.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt1_gd_cd = p.beansFactory.createTableColumn("Rslt1.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt1_gd_nm = p.beansFactory.createTableColumn("Rslt1.gd_nm", MCColumnType.TEXT);
		p.columnRslt1_vld_dt_fr = p.beansFactory.createTableColumn("Rslt1.vld_dt_fr", MCColumnType.DATE);
		p.columnRslt1_vld_dt_to = p.beansFactory.createTableColumn("Rslt1.vld_dt_to", MCColumnType.DATE);
		p.columnRslt1_bd_lot_mng_typ = p.beansFactory.createTableColumn("Rslt1.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt1.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_lot_no_typ = p.beansFactory.createTableColumn("Rslt1.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_sublot_no_typ = p.beansFactory.createTableColumn("Rslt1.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt1.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt1.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt1.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt1.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt1_slo_no = p.beansFactory.createTableColumn("Rslt1.slo_no", MCColumnType.TEXT);
		p.columnRslt1_slo_d_no = p.beansFactory.createTableColumn("Rslt1.slo_d_no", MCColumnType.TEXT);
		p.columnRslt1_itm_ord_no = p.beansFactory.createTableColumn("Rslt1.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt1_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt1.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt1_rqst_crrct_flg = p.beansFactory.createTableColumn("Rslt1.rqst_crrct_flg", MCColumnType.CHECK);
		p.columnRslt1_dlv_inst_rcpt_flg = p.beansFactory.createTableColumn("Rslt1.dlv_inst_rcpt_flg", MCColumnType.CHECK);
		p.columnRslt1_can_flg = p.beansFactory.createTableColumn("Rslt1.can_flg", MCColumnType.CHECK);
		p.columnRslt1_comp_cng_flg = p.beansFactory.createTableColumn("Rslt1.comp_cng_flg", MCColumnType.CHECK);
		p.columnRslt1_spec_cng_flg = p.beansFactory.createTableColumn("Rslt1.spec_cng_flg", MCColumnType.CHECK);
		p.columnRslt1_rqst_crrct_dt = p.beansFactory.createTableColumn("Rslt1.rqst_crrct_dt", MCColumnType.DATE);
		p.columnRslt1_rqst_can_dt = p.beansFactory.createTableColumn("Rslt1.rqst_can_dt", MCColumnType.DATE);
		p.columnRslt1_prms_can_dt = p.beansFactory.createTableColumn("Rslt1.prms_can_dt", MCColumnType.DATE);
		p.columnRslt1_inst_dt = p.beansFactory.createTableColumn("Rslt1.inst_dt", MCColumnType.DATE);
		p.columnRslt1_inst_can_dt = p.beansFactory.createTableColumn("Rslt1.inst_can_dt", MCColumnType.DATE);
		p.columnRslt1_act_dt = p.beansFactory.createTableColumn("Rslt1.act_dt", MCColumnType.DATE);
		p.columnRslt1_act_can_dt = p.beansFactory.createTableColumn("Rslt1.act_can_dt", MCColumnType.DATE);
		p.columnRslt1_wg_rqst_cnt_rmrks = p.beansFactory.createTableColumn("Rslt1.wg_rqst_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt1_wg_re_rqst_cnt_rmrks = p.beansFactory.createTableColumn("Rslt1.wg_re_rqst_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt1_wg_rqst_intr_rmrks = p.beansFactory.createTableColumn("Rslt1.wg_rqst_intr_rmrks", MCColumnType.TEXT);
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
		p.columnRslt1_wg_rqst_upd_cntr = p.beansFactory.createTableColumn("Rslt1.wg_rqst_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt1_upd_usr_id = p.beansFactory.createTableColumn("Rslt1.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt1_upd_usr_nm = p.beansFactory.createTableColumn("Rslt1.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt1_upd_func_id = p.beansFactory.createTableColumn("Rslt1.upd_func_id", MCColumnType.TEXT);
		p.columnRslt1_upd_func_nm = p.beansFactory.createTableColumn("Rslt1.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt1_upd_ts = p.beansFactory.createTableColumn("Rslt1.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt1_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt1.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Rslt1Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt1Btn(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt1BtnPanel = p.beansFactory.createPanel("Rslt1Btn");
		// ブロックの項目の初期化
		p.Rslt1Btn_select_all = p.beansFactory.createButton("Rslt1Btn.select_all", "no_border");
		p.Rslt1Btn_deselect_all = p.beansFactory.createButton("Rslt1Btn.deselect_all", "no_border");
		p.Rslt1Btn_radd = p.beansFactory.createButton("Rslt1Btn.radd", "no_border");
		p.Rslt1Btn_rdel = p.beansFactory.createButton("Rslt1Btn.rdel", "no_border");
		p.Rslt1Btn_rcopy = p.beansFactory.createButton("Rslt1Btn.rcopy", "no_border");
	}

	/**
	 * [Rslt2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt2(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt2Panel = p.beansFactory.createPanel("Rslt2");
		p.Rslt2TitledBorder = p.beansFactory.createTitledBorder();
		p.Rslt2ScrollPane = p.beansFactory.createScrollPane("Rslt2.scroll");
		p.createRslt2Table();
		// ブロックの項目の初期化
		p.columnRslt2_wg_rqst_prms_no = p.beansFactory.createTableColumn("Rslt2.wg_rqst_prms_no", MCColumnType.TEXT);
		p.columnRslt2_wg_rqst_no = p.beansFactory.createTableColumn("Rslt2.wg_rqst_no", MCColumnType.TEXT);
		p.columnRslt2_can_flg = p.beansFactory.createTableColumn("Rslt2.can_flg", MCColumnType.CHECK);
		p.columnRslt2_fix_flg = p.beansFactory.createTableColumn("Rslt2.fix_flg", MCColumnType.CHECK);
		p.columnRslt2_fix_dt = p.beansFactory.createTableColumn("Rslt2.fix_dt", MCColumnType.DATE);
		p.columnRslt2_gr_schd_dt = p.beansFactory.createTableColumn("Rslt2.gr_schd_dt", MCColumnType.DATE);
		p.columnRslt2_gr_schd_hm = p.beansFactory.createTableColumn("Rslt2.gr_schd_hm", MCColumnType.DATE);
		p.columnRslt2_prms_trd_unit_cd = p.beansFactory.createTableColumn("Rslt2.prms_trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_prms_trd_unit_nm = p.beansFactory.createTableColumn("Rslt2.prms_trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt2_prms_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt2.prms_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt2_prms_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt2.prms_trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt2_prms_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt2.prms_trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt2_prms_base_unit_cd = p.beansFactory.createTableColumn("Rslt2.prms_base_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt2_prms_base_unit_nm = p.beansFactory.createTableColumn("Rslt2.prms_base_unit_nm", MCColumnType.TEXT);
		p.columnRslt2_prms_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt2.prms_base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt2_prms_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt2.prms_base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt2_gi_lg_grp_cd = p.beansFactory.createTableColumn("Rslt2.gi_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt2_gi_lg_grp_nm = p.beansFactory.createTableColumn("Rslt2.gi_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt2_gi_loc_cd = p.beansFactory.createTableColumn("Rslt2.gi_loc_cd", MCColumnType.TEXT);
		p.columnRslt2_gi_loc_nm = p.beansFactory.createTableColumn("Rslt2.gi_loc_nm", MCColumnType.TEXT);
		p.columnRslt2_gi_str_ln_cd = p.beansFactory.createTableColumn("Rslt2.gi_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt2_gi_str_ln_nm = p.beansFactory.createTableColumn("Rslt2.gi_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt2_gi_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt2.gi_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt2_gi_schd_dt = p.beansFactory.createTableColumn("Rslt2.gi_schd_dt", MCColumnType.DATE);
		p.columnRslt2_gi_schd_hm = p.beansFactory.createTableColumn("Rslt2.gi_schd_hm", MCColumnType.DATE);
		p.columnRslt2_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt2.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt2_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt2.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt2_bom_ptn = p.beansFactory.createTableColumn("Rslt2.bom_ptn", MCColumnType.TEXT);
		p.columnRslt2_sppl_cd = p.beansFactory.createTableColumn("Rslt2.sppl_cd", MCColumnType.TEXT);
		p.columnRslt2_sppl_nm = p.beansFactory.createTableColumn("Rslt2.sppl_nm", MCColumnType.TEXT);
		p.columnRslt2_maker_cd = p.beansFactory.createTableColumn("Rslt2.maker_cd", MCColumnType.TEXT);
		p.columnRslt2_maker_nm = p.beansFactory.createTableColumn("Rslt2.maker_nm", MCColumnType.TEXT);
		p.columnRslt2_wg_rqst_prms_rmrks = p.beansFactory.createTableColumn("Rslt2.wg_rqst_prms_rmrks", MCColumnType.TEXT);
		p.columnRslt2_ins_usr_id = p.beansFactory.createTableColumn("Rslt2.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt2_ins_usr_nm = p.beansFactory.createTableColumn("Rslt2.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt2_ins_func_id = p.beansFactory.createTableColumn("Rslt2.ins_func_id", MCColumnType.TEXT);
		p.columnRslt2_ins_func_nm = p.beansFactory.createTableColumn("Rslt2.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt2_ins_ts = p.beansFactory.createTableColumn("Rslt2.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt2_upd_usr_id = p.beansFactory.createTableColumn("Rslt2.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt2_upd_usr_nm = p.beansFactory.createTableColumn("Rslt2.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt2_upd_func_id = p.beansFactory.createTableColumn("Rslt2.upd_func_id", MCColumnType.TEXT);
		p.columnRslt2_upd_func_nm = p.beansFactory.createTableColumn("Rslt2.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt2_upd_ts = p.beansFactory.createTableColumn("Rslt2.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt2_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt2.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RqstTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RqstTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqstTyp(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.RqstTypPanel.setBorder(p.RqstTypTitledBorder);
		p.add(p.RqstTypPanel);
		p.RqstTypPanel.setNextBeans(p.RqstStsPanel);
		p.RqstTypPanel.setValueCheck(false);
		p.RqstTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RqstTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [RqstSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqstSts(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.RqstStsPanel.setBorder(p.RqstStsTitledBorder);
		p.add(p.RqstStsPanel);
		p.RqstStsPanel.setNextBeans(p.SloRqstPanel);
		p.RqstStsPanel.setValueCheck(false);
		p.RqstStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RqstStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SloRqst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSloRqst(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.SloRqstPanel.setBorder(p.SloRqstTitledBorder);
		p.add(p.SloRqstPanel);
		p.SloRqstPanel.setNextBeans(p.TopPanel);
		p.SloRqstPanel.setValueCheck(false);
		p.SloRqstPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SloRqstPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
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
	protected static void jbInitFold(MSBAP_WgRqstReg p) {
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
	protected static void jbInitTab1(MSBAP_WgRqstReg p) {
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
	protected static void jbInitTab2(MSBAP_WgRqstReg p) {
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
	protected static void jbInitTab3(MSBAP_WgRqstReg p) {
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
	protected static void jbInitTab4(MSBAP_WgRqstReg p) {
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
	protected static void jbInitCnd(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("UPD");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("DEL");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.ope_META);
		p.RqstTypPanel.add(p.Cnd_xfr_rqst_flg);
		p.RqstTypPanel.setLastBeans(p.Cnd_xfr_rqst_flg);
		p.Cnd_xfr_rqst_flg.setNextBeans(p.Cnd_purc_rqst_flg);
		p.Cnd_xfr_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.xfr_rqst_flg_META);
		p.RqstTypPanel.add(p.Cnd_purc_rqst_flg);
		p.Cnd_purc_rqst_flg.setNextBeans(p.Cnd_ship_rqst_flg);
		p.Cnd_purc_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.purc_rqst_flg_META);
		p.RqstTypPanel.add(p.Cnd_ship_rqst_flg);
		p.Cnd_ship_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.ship_rqst_flg_META);
		p.RqstStsPanel.add(p.Cnd_rqst_sts_flg);
		p.RqstStsPanel.setLastBeans(p.Cnd_rqst_sts_flg);
		p.Cnd_rqst_sts_flg.setNextBeans(p.Cnd_prms_sts_flg);
		p.Cnd_rqst_sts_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_sts_flg_META);
		p.RqstStsPanel.add(p.Cnd_prms_sts_flg);
		p.Cnd_prms_sts_flg.setNextBeans(p.Cnd_part_inst_sts_flg);
		p.Cnd_prms_sts_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.prms_sts_flg_META);
		p.RqstStsPanel.add(p.Cnd_part_inst_sts_flg);
		p.Cnd_part_inst_sts_flg.setNextBeans(p.Cnd_inst_sts_flg);
		p.Cnd_part_inst_sts_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.part_inst_sts_flg_META);
		p.RqstStsPanel.add(p.Cnd_inst_sts_flg);
		p.Cnd_inst_sts_flg.setNextBeans(p.Cnd_cmpl_sts_flg);
		p.Cnd_inst_sts_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.inst_sts_flg_META);
		p.RqstStsPanel.add(p.Cnd_cmpl_sts_flg);
		p.Cnd_cmpl_sts_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.cmpl_sts_flg_META);
		p.SloRqstPanel.add(p.Cnd_slo_rqst_flg);
		p.SloRqstPanel.setLastBeans(p.Cnd_slo_rqst_flg);
		p.Cnd_slo_rqst_flg.setNextBeans(p.Cnd_un_slo_rqst_flg);
		p.Cnd_slo_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.slo_rqst_flg_META);
		p.SloRqstPanel.add(p.Cnd_un_slo_rqst_flg);
		p.Cnd_un_slo_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.un_slo_rqst_flg_META);
		p.CndPanel.add(p.Cnd_gr_rqst_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_gr_rqst_dt_p_PPanel);
		p.Cnd_gr_rqst_dt_p_PPanel.setNextBeans(p.Cnd_gi_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_gi_rqst_dt_p_PPanel);
		p.Cnd_gi_rqst_dt_p_PPanel.setNextBeans(p.Cnd_gr_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_gr_schd_dt_p_PPanel);
		p.Cnd_gr_schd_dt_p_PPanel.setNextBeans(p.Cnd_gi_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_gi_schd_dt_p_PPanel);
		p.Cnd_gi_schd_dt_p_PPanel.setNextBeans(p.Cnd_rqst_dt_fr);
		p.CndPanel.add(p.Cnd_rqst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rqst_dt_fr);
		p.Cnd_rqst_dt_fr.setNextBeans(p.Cnd_rqst_dt_to);
		p.Cnd_rqst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_dt_fr_META);
		p.Cnd_rqst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rqst_dt_to_Label);
		p.CndPanel.add(p.Cnd_rqst_dt_to);
		p.Cnd_rqst_dt_to.setNextBeans(p.Cnd_re_rqst_dt_fr);
		p.Cnd_rqst_dt_to.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_dt_to_META);
		p.Cnd_rqst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_re_rqst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_re_rqst_dt_fr);
		p.Cnd_re_rqst_dt_fr.setNextBeans(p.Cnd_re_rqst_dt_to);
		p.Cnd_re_rqst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.re_rqst_dt_fr_META);
		p.Cnd_re_rqst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_re_rqst_dt_to_Label);
		p.CndPanel.add(p.Cnd_re_rqst_dt_to);
		p.Cnd_re_rqst_dt_to.setNextBeans(p.Cnd_wg_rqst_ntc_day_typ);
		p.Cnd_re_rqst_dt_to.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.re_rqst_dt_to_META);
		p.Cnd_re_rqst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_wg_rqst_ntc_day_typ.setListType(MCListType.STRICT);
		p.Cnd_wg_rqst_ntc_day_typ.setLinkBeans(p.Cnd_wg_rqst_ntc_day_typ_nm);
		p.CndPanel.add(p.Cnd_wg_rqst_ntc_day_typ_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_ntc_day_typ);
		p.Cnd_wg_rqst_ntc_day_typ.setNextBeans(p.Cnd_wg_rqst_ntc_day_typ_nm);
		p.Cnd_wg_rqst_ntc_day_typ.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_ntc_day_typ_META);
		p.CndPanel.add(p.Cnd_wg_rqst_ntc_day_typ_nm);
		p.Cnd_wg_rqst_ntc_day_typ_nm.setNextBeans(p.Cnd_srch_dt_fr);
		p.Cnd_wg_rqst_ntc_day_typ_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_ntc_day_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_ntc_day_typ_nm, true);
		p.CndPanel.add(p.Cnd_srch_dt_fr_Label);
		p.CndPanel.add(p.Cnd_srch_dt_fr);
		p.Cnd_srch_dt_fr.setNextBeans(p.Cnd_srch_dt_to);
		p.Cnd_srch_dt_fr.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.srch_dt_fr_META);
		p.Cnd_srch_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_srch_dt_to_Label);
		p.CndPanel.add(p.Cnd_srch_dt_to);
		p.Cnd_srch_dt_to.setNextBeans(p.Cnd_rqst_fr_wg_cd);
		p.Cnd_srch_dt_to.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.srch_dt_to_META);
		p.Cnd_srch_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_rqst_fr_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_fr_wg_cd, true);
		p.Cnd_rqst_fr_wg_cd.setLinkBeans(p.Cnd_rqst_fr_wg_nm);
		p.CndPanel.add(p.Cnd_rqst_fr_wg_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_fr_wg_cd);
		p.Cnd_rqst_fr_wg_cd.setNextBeans(p.Cnd_rqst_fr_wg_nm);
		p.Cnd_rqst_fr_wg_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_fr_wg_cd_META);
		p.CndPanel.add(p.Cnd_rqst_fr_wg_nm);
		p.Cnd_rqst_fr_wg_nm.setNextBeans(p.Cnd_rqst_to_wg_cd);
		p.Cnd_rqst_fr_wg_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_fr_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_fr_wg_nm, true);
		p.Cnd_rqst_to_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_to_wg_cd, true);
		p.Cnd_rqst_to_wg_cd.setLinkBeans(p.Cnd_rqst_to_wg_nm);
		p.CndPanel.add(p.Cnd_rqst_to_wg_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_to_wg_cd);
		p.Cnd_rqst_to_wg_cd.setNextBeans(p.Cnd_rqst_to_wg_nm);
		p.Cnd_rqst_to_wg_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_wg_cd_META);
		p.CndPanel.add(p.Cnd_rqst_to_wg_nm);
		p.Cnd_rqst_to_wg_nm.setNextBeans(p.Cnd_gr_loc_cd);
		p.Cnd_rqst_to_wg_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_to_wg_nm, true);
		p.CndPanel.add(p.Cnd_gr_loc_cd_Label);
		p.CndPanel.add(p.Cnd_gr_loc_cd);
		p.Cnd_gr_loc_cd.setNextBeans(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_loc_cd_META);
		p.Cnd_gr_loc_cd.addLinkBeans(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_loc_cd, true);
		p.CndPanel.add(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_nm.setNextBeans(p.Cnd_gr_site_cd);
		p.Cnd_gr_loc_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_loc_nm, true);
		p.Cnd_gr_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_site_cd, true);
		p.Cnd_gr_site_cd.setLinkBeans(p.Cnd_gr_site_nm);
		p.CndPanel.add(p.Cnd_gr_site_cd_Label);
		p.CndPanel.add(p.Cnd_gr_site_cd);
		p.Cnd_gr_site_cd.setNextBeans(p.Cnd_gr_site_nm);
		p.Cnd_gr_site_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_site_cd_META);
		p.CndPanel.add(p.Cnd_gr_site_nm);
		p.Cnd_gr_site_nm.setNextBeans(p.Cnd_gr_loc_wg_cd);
		p.Cnd_gr_site_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_site_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_site_nm, true);
		p.Cnd_gr_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_loc_wg_cd, true);
		p.Cnd_gr_loc_wg_cd.setLinkBeans(p.Cnd_gr_loc_wg_nm);
		p.CndPanel.add(p.Cnd_gr_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_gr_loc_wg_cd);
		p.Cnd_gr_loc_wg_cd.setNextBeans(p.Cnd_gr_loc_wg_nm);
		p.Cnd_gr_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_gr_loc_wg_nm);
		p.Cnd_gr_loc_wg_nm.setNextBeans(p.Cnd_gr_lg_grp_cd);
		p.Cnd_gr_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_loc_wg_nm, true);
		p.Cnd_gr_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_lg_grp_cd, true);
		p.Cnd_gr_lg_grp_cd.setLinkBeans(p.Cnd_gr_lg_grp_nm);
		p.CndPanel.add(p.Cnd_gr_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_gr_lg_grp_cd);
		p.Cnd_gr_lg_grp_cd.setNextBeans(p.Cnd_gr_lg_grp_nm);
		p.Cnd_gr_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_gr_lg_grp_nm);
		p.Cnd_gr_lg_grp_nm.setNextBeans(p.Cnd_gr_loc_grp_cd);
		p.Cnd_gr_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_lg_grp_nm, true);
		p.Cnd_gr_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_loc_grp_cd, true);
		p.Cnd_gr_loc_grp_cd.setLinkBeans(p.Cnd_gr_loc_grp_nm);
		p.CndPanel.add(p.Cnd_gr_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_gr_loc_grp_cd);
		p.Cnd_gr_loc_grp_cd.setNextBeans(p.Cnd_gr_loc_grp_nm);
		p.Cnd_gr_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_gr_loc_grp_nm);
		p.Cnd_gr_loc_grp_nm.setNextBeans(p.Cnd_gr_str_ln_cd);
		p.Cnd_gr_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_loc_grp_nm, true);
		p.Cnd_gr_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_str_ln_cd, true);
		p.Cnd_gr_str_ln_cd.setLinkBeans(p.Cnd_gr_str_ln_nm);
		p.CndPanel.add(p.Cnd_gr_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_gr_str_ln_cd);
		p.Cnd_gr_str_ln_cd.setNextBeans(p.Cnd_gr_str_ln_nm);
		p.Cnd_gr_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_gr_str_ln_nm);
		p.Cnd_gr_str_ln_nm.setNextBeans(p.Cnd_rqst_to_loc_cd);
		p.Cnd_gr_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.gr_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_rqst_to_loc_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_to_loc_cd);
		p.Cnd_rqst_to_loc_cd.setNextBeans(p.Cnd_rqst_to_loc_nm);
		p.Cnd_rqst_to_loc_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_loc_cd_META);
		p.Cnd_rqst_to_loc_cd.addLinkBeans(p.Cnd_rqst_to_loc_nm);
		p.Cnd_rqst_to_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_to_loc_cd, true);
		p.CndPanel.add(p.Cnd_rqst_to_loc_nm);
		p.Cnd_rqst_to_loc_nm.setNextBeans(p.Cnd_rqst_to_site_cd);
		p.Cnd_rqst_to_loc_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_to_loc_nm, true);
		p.Cnd_rqst_to_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_to_site_cd, true);
		p.Cnd_rqst_to_site_cd.setLinkBeans(p.Cnd_rqst_to_site_nm);
		p.CndPanel.add(p.Cnd_rqst_to_site_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_to_site_cd);
		p.Cnd_rqst_to_site_cd.setNextBeans(p.Cnd_rqst_to_site_nm);
		p.Cnd_rqst_to_site_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_site_cd_META);
		p.CndPanel.add(p.Cnd_rqst_to_site_nm);
		p.Cnd_rqst_to_site_nm.setNextBeans(p.Cnd_rqst_to_lg_grp_cd);
		p.Cnd_rqst_to_site_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_site_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_to_site_nm, true);
		p.Cnd_rqst_to_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_to_lg_grp_cd, true);
		p.Cnd_rqst_to_lg_grp_cd.setLinkBeans(p.Cnd_rqst_to_lg_grp_nm);
		p.CndPanel.add(p.Cnd_rqst_to_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_to_lg_grp_cd);
		p.Cnd_rqst_to_lg_grp_cd.setNextBeans(p.Cnd_rqst_to_lg_grp_nm);
		p.Cnd_rqst_to_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_rqst_to_lg_grp_nm);
		p.Cnd_rqst_to_lg_grp_nm.setNextBeans(p.Cnd_rqst_to_loc_grp_cd);
		p.Cnd_rqst_to_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_to_lg_grp_nm, true);
		p.Cnd_rqst_to_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_to_loc_grp_cd, true);
		p.Cnd_rqst_to_loc_grp_cd.setLinkBeans(p.Cnd_rqst_to_loc_grp_nm);
		p.CndPanel.add(p.Cnd_rqst_to_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_to_loc_grp_cd);
		p.Cnd_rqst_to_loc_grp_cd.setNextBeans(p.Cnd_rqst_to_loc_grp_nm);
		p.Cnd_rqst_to_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_rqst_to_loc_grp_nm);
		p.Cnd_rqst_to_loc_grp_nm.setNextBeans(p.Cnd_rqst_to_str_ln_cd);
		p.Cnd_rqst_to_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_to_loc_grp_nm, true);
		p.Cnd_rqst_to_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_to_str_ln_cd, true);
		p.Cnd_rqst_to_str_ln_cd.setLinkBeans(p.Cnd_rqst_to_str_ln_nm);
		p.CndPanel.add(p.Cnd_rqst_to_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_to_str_ln_cd);
		p.Cnd_rqst_to_str_ln_cd.setNextBeans(p.Cnd_rqst_to_str_ln_nm);
		p.Cnd_rqst_to_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_rqst_to_str_ln_nm);
		p.Cnd_rqst_to_str_ln_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_rqst_to_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_to_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_to_str_ln_nm, true);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.Cnd_sppl_cd.setLinkBeans(p.Cnd_sppl_nm);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.sppl_cd_META);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.Cnd_dlv_cd.setLinkBeans(p.Cnd_dlv_nm);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.dlv_cd_META);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
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
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_rqst_fr_usr_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_rqst_fr_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_fr_usr_cd);
		p.Cnd_rqst_fr_usr_cd.setNextBeans(p.Cnd_rqst_fr_usr_nm);
		p.Cnd_rqst_fr_usr_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_fr_usr_cd_META);
		p.Cnd_rqst_fr_usr_cd.addLinkBeans(p.Cnd_rqst_fr_usr_nm);
		p.Cnd_rqst_fr_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_fr_usr_cd, true);
		p.CndPanel.add(p.Cnd_rqst_fr_usr_nm);
		p.Cnd_rqst_fr_usr_nm.setNextBeans(p.Cnd_rqst_fr_dpt_cd);
		p.Cnd_rqst_fr_usr_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_fr_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_fr_usr_nm, true);
		p.CndPanel.add(p.Cnd_rqst_fr_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_fr_dpt_cd);
		p.Cnd_rqst_fr_dpt_cd.setNextBeans(p.Cnd_rqst_fr_dpt_nm);
		p.Cnd_rqst_fr_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_fr_dpt_cd_META);
		p.Cnd_rqst_fr_dpt_cd.addLinkBeans(p.Cnd_rqst_fr_dpt_nm);
		p.Cnd_rqst_fr_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_fr_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rqst_fr_dpt_nm);
		p.Cnd_rqst_fr_dpt_nm.setNextBeans(p.Cnd_wg_rqst_src_typ);
		p.Cnd_rqst_fr_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.rqst_fr_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_fr_dpt_nm, true);
		p.Cnd_wg_rqst_src_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_rqst_src_typ, true);
		p.Cnd_wg_rqst_src_typ.setLinkBeans(p.Cnd_wg_rqst_src_typ_nm);
		p.CndPanel.add(p.Cnd_wg_rqst_src_typ_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_src_typ);
		p.Cnd_wg_rqst_src_typ.setNextBeans(p.Cnd_wg_rqst_src_typ_nm);
		p.Cnd_wg_rqst_src_typ.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_src_typ_META);
		p.CndPanel.add(p.Cnd_wg_rqst_src_typ_nm);
		p.Cnd_wg_rqst_src_typ_nm.setNextBeans(p.Cnd_wg_rqst_src_no);
		p.Cnd_wg_rqst_src_typ_nm.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_src_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_src_typ_nm, true);
		p.CndPanel.add(p.Cnd_wg_rqst_src_no_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_src_no);
		p.Cnd_wg_rqst_src_no.setNextBeans(p.Cnd_wg_rqst_no);
		p.Cnd_wg_rqst_src_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_src_no_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_src_no, true);
		p.CndPanel.add(p.Cnd_wg_rqst_no_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_no);
		p.Cnd_wg_rqst_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_wg_rqst_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_no_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_re_rqst_flg);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_re_rqst_flg);
		p.Cnd_re_rqst_flg.setNextBeans(p.Cnd_prms_div_flg);
		p.Cnd_re_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.re_rqst_flg_META);
		p.CndPanel.add(p.Cnd_prms_div_flg);
		p.Cnd_prms_div_flg.setNextBeans(p.Cnd_prms_shrtg_flg);
		p.Cnd_prms_div_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.prms_div_flg_META);
		p.CndPanel.add(p.Cnd_prms_shrtg_flg);
		p.Cnd_prms_shrtg_flg.setNextBeans(p.Cnd_due_delay_flg);
		p.Cnd_prms_shrtg_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.prms_shrtg_flg_META);
		p.CndPanel.add(p.Cnd_due_delay_flg);
		p.Cnd_due_delay_flg.setNextBeans(p.Cnd_prms_uncn_flg);
		p.Cnd_due_delay_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.due_delay_flg_META);
		p.CndPanel.add(p.Cnd_prms_uncn_flg);
		p.Cnd_prms_uncn_flg.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_prms_uncn_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.prms_uncn_flg_META);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setNextBeans(p.Cnd_wg_rqst_cnt_rmrks);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.inc_can_flg_META);
		p.CndPanel.add(p.Cnd_wg_rqst_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_cnt_rmrks);
		p.Cnd_wg_rqst_cnt_rmrks.setNextBeans(p.Cnd_wg_re_rqst_cnt_rmrks);
		p.Cnd_wg_rqst_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_rqst_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_wg_re_rqst_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_wg_re_rqst_cnt_rmrks);
		p.Cnd_wg_re_rqst_cnt_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_wg_re_rqst_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.wg_re_rqst_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_wg_re_rqst_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBA.MSBAP0100.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.Cnd3Panel.add(p.Cnd_dlv_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.Cnd4Panel.add(p.Cnd_sppl_grp_p_PPanel);
		p.Cnd4Panel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBAP_WgRqstReg p) {
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
	protected static void jbInitRPnl(MSBAP_WgRqstReg p) {
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
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.Rslt1PanelPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_rqst_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_rqst_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_rqst_dt);
		p.BulkSet_rqst_dt.setNextBeans(p.BulkSet_rqst_fr_wg_cd);
		p.BulkSet_rqst_dt.setRow(p.getBulkSetR(), mcframe.clientMSBA.MSBAP0100.BulkSetR.rqst_dt_META);
		p.BulkSet_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_rqst_fr_wg_cd.setListType(MCListType.STRICT);
		p.BulkSet_rqst_fr_wg_cd.setLinkBeans(p.BulkSet_rqst_fr_wg_nm);
		p.BulkSetPanel.add(p.BulkSet_rqst_fr_wg_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_rqst_fr_wg_cd);
		p.BulkSet_rqst_fr_wg_cd.setNextBeans(p.BulkSet_rqst_fr_wg_nm);
		p.BulkSet_rqst_fr_wg_cd.setRow(p.getBulkSetR(), mcframe.clientMSBA.MSBAP0100.BulkSetR.rqst_fr_wg_cd_META);
		p.BulkSetPanel.add(p.BulkSet_rqst_fr_wg_nm);
		p.BulkSet_rqst_fr_wg_nm.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_rqst_fr_wg_nm.setRow(p.getBulkSetR(), mcframe.clientMSBA.MSBAP0100.BulkSetR.rqst_fr_wg_nm_META);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_rqst_fr_dpt_nm);
	}

	/**
	 * [Rslt1Panel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt1Panel(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.add(p.Rslt1PanelPanel);
		p.Rslt1PanelPanel.setNextBeans(p.Rslt2Panel);
		p.Rslt1PanelPanel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.Rslt1PanelPanel.add(p.Rslt1Panel, null);
		p.Rslt1PanelPanel.setLastBeans(p.Rslt1Panel);
		p.Rslt1Panel.setNextBeans(p.Rslt1BtnPanel);
		p.Rslt1PanelPanel.add(p.Rslt1BtnPanel, null);
	}

	/**
	 * [Rslt1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt1(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt1Panel.setBorder(p.Rslt1TitledBorder);
		p.Rslt1Panel.add(p.Rslt1ScrollPane);
		p.Rslt1Panel.setLastBeans(p.Rslt1Table);
		p.Rslt1ScrollPane.setViewportView(p.Rslt1Table);
		p.Rslt1Table.setList(p.getRslt1L());
		p.Rslt1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt1Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt1Btn(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt1BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Rslt1Btn_select_all.setIcon("SELECT_ALL");
		p.Rslt1Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Rslt1BtnPanel.add(p.Rslt1Btn_select_all);
		p.Rslt1BtnPanel.setLastBeans(p.Rslt1Btn_select_all);
		p.Rslt1Btn_select_all.setNextBeans(p.Rslt1Btn_deselect_all);
		p.Rslt1Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Rslt1Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Rslt1BtnPanel.add(p.Rslt1Btn_deselect_all);
		p.Rslt1Btn_deselect_all.setNextBeans(p.Rslt1Btn_radd);
		p.Rslt1Btn_radd.setIcon("INSERT_RECORD");
		p.Rslt1Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Rslt1BtnPanel.add(p.Rslt1Btn_radd);
		p.Rslt1Btn_radd.setNextBeans(p.Rslt1Btn_rdel);
		p.Rslt1Btn_rdel.setIcon("DELETE_RECORD");
		p.Rslt1Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Rslt1BtnPanel.add(p.Rslt1Btn_rdel);
		p.Rslt1Btn_rdel.setNextBeans(p.Rslt1Btn_rcopy);
		p.Rslt1Btn_rcopy.setIcon("COPY_RECORD");
		p.Rslt1Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Rslt1BtnPanel.add(p.Rslt1Btn_rcopy);
	}

	/**
	 * [Rslt2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt2(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.Rslt2Panel.setBorder(p.Rslt2TitledBorder);
		p.add(p.Rslt2Panel);
		p.Rslt2Panel.setNextBeans(p.BtnPanel);
		p.Rslt2Panel.add(p.Rslt2ScrollPane);
		p.Rslt2Panel.setLastBeans(p.Rslt2Table);
		p.Rslt2ScrollPane.setViewportView(p.Rslt2Table);
		p.Rslt2Table.setList(p.getRslt2L());
		p.Rslt2Table.setStatusColumnVisible(false);
		p.Rslt2Panel.setLayoutPosition("CBCBCTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBAP_WgRqstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBAP_WgRqstReg p) {
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
		MSBAP_WgRqstReg_MC.mcInitScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitSloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitTop((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitFold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitTab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitTab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitTab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitTab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitCnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitCnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitCnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitCnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitCtrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitBulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitRslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitBtn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.mcInitEastBtn((MSBAP_WgRqstReg)this);

		// [UPD]ステータスのモードの設定
		MSBAP_WgRqstReg_MC.statusInitUPD_ScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_RqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_RqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_SloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Top((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Fold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Tab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Tab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Tab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Tab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Cnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Cnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Cnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Cnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Ctrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_RPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_BulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Rslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Rslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Rslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Rslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitUPD_EastBtn((MSBAP_WgRqstReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBAP_WgRqstReg_MC.statusInitFIX__U_ScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_RqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_RqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_SloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Top((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Fold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Tab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Tab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Tab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Tab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Cnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Cnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Cnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Cnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Ctrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_RPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_BulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Rslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Rslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Rslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Rslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitFIX__U_EastBtn((MSBAP_WgRqstReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_RqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_RqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_SloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Top((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Fold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Tab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Tab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Tab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Tab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Cnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Cnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Cnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Cnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Ctrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_RPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_BulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Rslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Rslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Rslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Rslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH__DEL_EastBtn((MSBAP_WgRqstReg)this);

		// [DEL]ステータスのモードの設定
		MSBAP_WgRqstReg_MC.statusInitDEL_ScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_RqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_RqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_SloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Top((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Fold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Tab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Tab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Tab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Tab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Cnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Cnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Cnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Cnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Ctrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_RPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_BulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Rslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Rslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Rslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Rslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitDEL_EastBtn((MSBAP_WgRqstReg)this);

		// [SRCH]ステータスのモードの設定
		MSBAP_WgRqstReg_MC.statusInitSRCH_ScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_RqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_RqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_SloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Top((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Fold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Tab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Tab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Tab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Tab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Cnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Cnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Cnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Cnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Ctrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_RPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_BulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Rslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Rslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Rslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Rslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitSRCH_EastBtn((MSBAP_WgRqstReg)this);

		// [REF]ステータスのモードの設定
		MSBAP_WgRqstReg_MC.statusInitREF_ScreenOpe((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_RqstTyp((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_RqstSts((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_SloRqst((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Top((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Fold((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Tab1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Tab2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Tab3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Tab4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Cnd((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Cnd2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Cnd3((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Cnd4((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Ctrl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_RPnl((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_BulkSet((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Rslt1Panel((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Rslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Rslt1Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Rslt2((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_Btn((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.statusInitREF_EastBtn((MSBAP_WgRqstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [RqstTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqstTyp(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [RqstSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqstSts(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [SloRqst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSloRqst(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBAP_WgRqstReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBAP_WgRqstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_xfr_rqst_flg.addAllListener(p);
		p.Cnd_purc_rqst_flg.addAllListener(p);
		p.Cnd_ship_rqst_flg.addAllListener(p);
		p.Cnd_rqst_sts_flg.addAllListener(p);
		p.Cnd_prms_sts_flg.addAllListener(p);
		p.Cnd_part_inst_sts_flg.addAllListener(p);
		p.Cnd_inst_sts_flg.addAllListener(p);
		p.Cnd_cmpl_sts_flg.addAllListener(p);
		p.Cnd_slo_rqst_flg.addAllListener(p);
		p.Cnd_un_slo_rqst_flg.addAllListener(p);
		p.Cnd_rqst_dt_fr.setListListener(p);
		p.Cnd_rqst_dt_fr.addAllListener(p);
		p.Cnd_rqst_dt_to.setListListener(p);
		p.Cnd_rqst_dt_to.addAllListener(p);
		p.Cnd_re_rqst_dt_fr.setListListener(p);
		p.Cnd_re_rqst_dt_fr.addAllListener(p);
		p.Cnd_re_rqst_dt_to.setListListener(p);
		p.Cnd_re_rqst_dt_to.addAllListener(p);
		p.Cnd_wg_rqst_ntc_day_typ.setListListener(p);
		p.Cnd_wg_rqst_ntc_day_typ.addAllListener(p);
		p.Cnd_wg_rqst_ntc_day_typ_nm.setListListener(p);
		p.Cnd_wg_rqst_ntc_day_typ_nm.addAllListener(p);
		p.Cnd_srch_dt_fr.setListListener(p);
		p.Cnd_srch_dt_fr.addAllListener(p);
		p.Cnd_srch_dt_to.setListListener(p);
		p.Cnd_srch_dt_to.addAllListener(p);
		p.Cnd_rqst_fr_wg_cd.setListListener(p);
		p.Cnd_rqst_fr_wg_cd.addAllListener(p);
		p.Cnd_rqst_fr_wg_nm.setListListener(p);
		p.Cnd_rqst_fr_wg_nm.addAllListener(p);
		p.Cnd_rqst_to_wg_cd.setListListener(p);
		p.Cnd_rqst_to_wg_cd.addAllListener(p);
		p.Cnd_rqst_to_wg_nm.setListListener(p);
		p.Cnd_rqst_to_wg_nm.addAllListener(p);
		p.Cnd_gr_loc_cd.setListListener(p);
		p.Cnd_gr_loc_cd.addAllListener(p);
		p.Cnd_gr_loc_nm.setListListener(p);
		p.Cnd_gr_loc_nm.addAllListener(p);
		p.Cnd_gr_site_cd.setListListener(p);
		p.Cnd_gr_site_cd.addAllListener(p);
		p.Cnd_gr_site_nm.setListListener(p);
		p.Cnd_gr_site_nm.addAllListener(p);
		p.Cnd_gr_loc_wg_cd.setListListener(p);
		p.Cnd_gr_loc_wg_cd.addAllListener(p);
		p.Cnd_gr_loc_wg_nm.setListListener(p);
		p.Cnd_gr_loc_wg_nm.addAllListener(p);
		p.Cnd_gr_lg_grp_cd.setListListener(p);
		p.Cnd_gr_lg_grp_cd.addAllListener(p);
		p.Cnd_gr_lg_grp_nm.setListListener(p);
		p.Cnd_gr_lg_grp_nm.addAllListener(p);
		p.Cnd_gr_loc_grp_cd.setListListener(p);
		p.Cnd_gr_loc_grp_cd.addAllListener(p);
		p.Cnd_gr_loc_grp_nm.setListListener(p);
		p.Cnd_gr_loc_grp_nm.addAllListener(p);
		p.Cnd_gr_str_ln_cd.setListListener(p);
		p.Cnd_gr_str_ln_cd.addAllListener(p);
		p.Cnd_gr_str_ln_nm.setListListener(p);
		p.Cnd_gr_str_ln_nm.addAllListener(p);
		p.Cnd_rqst_to_loc_cd.setListListener(p);
		p.Cnd_rqst_to_loc_cd.addAllListener(p);
		p.Cnd_rqst_to_loc_nm.setListListener(p);
		p.Cnd_rqst_to_loc_nm.addAllListener(p);
		p.Cnd_rqst_to_site_cd.setListListener(p);
		p.Cnd_rqst_to_site_cd.addAllListener(p);
		p.Cnd_rqst_to_site_nm.setListListener(p);
		p.Cnd_rqst_to_site_nm.addAllListener(p);
		p.Cnd_rqst_to_lg_grp_cd.setListListener(p);
		p.Cnd_rqst_to_lg_grp_cd.addAllListener(p);
		p.Cnd_rqst_to_lg_grp_nm.setListListener(p);
		p.Cnd_rqst_to_lg_grp_nm.addAllListener(p);
		p.Cnd_rqst_to_loc_grp_cd.setListListener(p);
		p.Cnd_rqst_to_loc_grp_cd.addAllListener(p);
		p.Cnd_rqst_to_loc_grp_nm.setListListener(p);
		p.Cnd_rqst_to_loc_grp_nm.addAllListener(p);
		p.Cnd_rqst_to_str_ln_cd.setListListener(p);
		p.Cnd_rqst_to_str_ln_cd.addAllListener(p);
		p.Cnd_rqst_to_str_ln_nm.setListListener(p);
		p.Cnd_rqst_to_str_ln_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_rqst_fr_usr_cd.setListListener(p);
		p.Cnd_rqst_fr_usr_cd.addAllListener(p);
		p.Cnd_rqst_fr_usr_nm.setListListener(p);
		p.Cnd_rqst_fr_usr_nm.addAllListener(p);
		p.Cnd_rqst_fr_dpt_cd.setListListener(p);
		p.Cnd_rqst_fr_dpt_cd.addAllListener(p);
		p.Cnd_rqst_fr_dpt_nm.setListListener(p);
		p.Cnd_rqst_fr_dpt_nm.addAllListener(p);
		p.Cnd_wg_rqst_src_typ.setListListener(p);
		p.Cnd_wg_rqst_src_typ.addAllListener(p);
		p.Cnd_wg_rqst_src_typ_nm.setListListener(p);
		p.Cnd_wg_rqst_src_typ_nm.addAllListener(p);
		p.Cnd_wg_rqst_src_no.setListListener(p);
		p.Cnd_wg_rqst_src_no.addAllListener(p);
		p.Cnd_wg_rqst_no.setListListener(p);
		p.Cnd_wg_rqst_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_re_rqst_flg.addAllListener(p);
		p.Cnd_prms_div_flg.addAllListener(p);
		p.Cnd_prms_shrtg_flg.addAllListener(p);
		p.Cnd_due_delay_flg.addAllListener(p);
		p.Cnd_prms_uncn_flg.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
		p.Cnd_wg_rqst_cnt_rmrks.setListListener(p);
		p.Cnd_wg_rqst_cnt_rmrks.addAllListener(p);
		p.Cnd_wg_re_rqst_cnt_rmrks.setListListener(p);
		p.Cnd_wg_re_rqst_cnt_rmrks.addAllListener(p);
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
	protected static void mcInitCnd2(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBAP_WgRqstReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBAP_WgRqstReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBAP_WgRqstReg p) {
		p.BulkSet_rqst_dt.setListListener(p);
		p.BulkSet_rqst_dt.addAllListener(p);
		p.BulkSet_rqst_fr_wg_cd.setListListener(p);
		p.BulkSet_rqst_fr_wg_cd.addAllListener(p);
		p.BulkSet_rqst_fr_wg_nm.setListListener(p);
		p.BulkSet_rqst_fr_wg_nm.addAllListener(p);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Rslt1Panel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt1Panel(MSBAP_WgRqstReg p) {
	}

	/**
	 *  [Rslt1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt1(MSBAP_WgRqstReg p) {
		p.Rslt1Table.addAllListener(p);
		p.columnRslt1_check.addAllListener(p);
		p.columnRslt1_prms_uncn_flg.addAllListener(p);
		p.columnRslt1_re_rqst_flg.addAllListener(p);
		p.columnRslt1_prms_ntc_flg.addAllListener(p);
		p.columnRslt1_prms_dt.addAllListener(p);
		p.columnRslt1_prms_dt.setListListener(p);
		p.columnRslt1_re_prms_ntc_flg.addAllListener(p);
		p.columnRslt1_re_prms_dt.addAllListener(p);
		p.columnRslt1_re_prms_dt.setListListener(p);
		p.columnRslt1_wg_rqst_no.addAllListener(p);
		p.columnRslt1_wg_rqst_no.setListListener(p);
		p.columnRslt1_last_wg_rqst_no.addAllListener(p);
		p.columnRslt1_last_wg_rqst_no.setListListener(p);
		p.columnRslt1_wg_rqst_typ.addAllListener(p);
		p.columnRslt1_wg_rqst_typ.setListListener(p);
		p.columnRslt1_wg_rqst_typ_nm.addAllListener(p);
		p.columnRslt1_wg_rqst_typ_nm.setListListener(p);
		p.columnRslt1_wg_rqst_sts_typ.addAllListener(p);
		p.columnRslt1_wg_rqst_sts_typ.setListListener(p);
		p.columnRslt1_wg_rqst_sts_typ_nm.addAllListener(p);
		p.columnRslt1_wg_rqst_sts_typ_nm.setListListener(p);
		p.columnRslt1_wg_rqst_src_typ.addAllListener(p);
		p.columnRslt1_wg_rqst_src_typ.setListListener(p);
		p.columnRslt1_wg_rqst_src_typ_nm.addAllListener(p);
		p.columnRslt1_wg_rqst_src_typ_nm.setListListener(p);
		p.columnRslt1_wg_rqst_src_no.addAllListener(p);
		p.columnRslt1_wg_rqst_src_no.setListListener(p);
		p.columnRslt1_rqst_fr_wg_cd.addAllListener(p);
		p.columnRslt1_rqst_fr_wg_cd.setListListener(p);
		p.columnRslt1_rqst_fr_wg_nm.addAllListener(p);
		p.columnRslt1_rqst_fr_wg_nm.setListListener(p);
		p.columnRslt1_rqst_dt.addAllListener(p);
		p.columnRslt1_rqst_dt.setListListener(p);
		p.columnRslt1_re_rqst_dt.addAllListener(p);
		p.columnRslt1_re_rqst_dt.setListListener(p);
		p.Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt1_iv_itm_nm.addAllListener(p);
		p.columnRslt1_iv_itm_nm.setListListener(p);
		p.columnRslt1_lot_mng_typ.addAllListener(p);
		p.columnRslt1_lot_mng_typ.setListListener(p);
		p.columnRslt1_sublot_mng_typ.addAllListener(p);
		p.columnRslt1_sublot_mng_typ.setListListener(p);
		p.columnRslt1_sno1_mng_typ.addAllListener(p);
		p.columnRslt1_sno1_mng_typ.setListListener(p);
		p.columnRslt1_sno2_mng_typ.addAllListener(p);
		p.columnRslt1_sno2_mng_typ.setListListener(p);
		p.columnRslt1_sno3_mng_typ.addAllListener(p);
		p.columnRslt1_sno3_mng_typ.setListListener(p);
		p.columnRslt1_sno4_mng_typ.addAllListener(p);
		p.columnRslt1_sno4_mng_typ.setListListener(p);
		p.columnRslt1_sundry_itm_flg.addAllListener(p);
		p.columnRslt1_asset_mng_typ.addAllListener(p);
		p.columnRslt1_asset_mng_typ.setListListener(p);
		p.columnRslt1_asset_mng_typ_nm.addAllListener(p);
		p.columnRslt1_asset_mng_typ_nm.setListListener(p);
		p.columnRslt1_dscnt_itm_flg.addAllListener(p);
		p.columnRslt1_ver_flg.addAllListener(p);
		p.columnRslt1_gr_loc_cd.addAllListener(p);
		p.columnRslt1_gr_loc_cd.setListListener(p);
		p.columnRslt1_gr_loc_nm.addAllListener(p);
		p.columnRslt1_gr_loc_nm.setListListener(p);
		p.columnRslt1_gr_str_ln_tgt_flg.addAllListener(p);
		p.Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt1_gr_loc_grp_cd.addAllListener(p);
		p.columnRslt1_gr_loc_grp_cd.setListListener(p);
		p.columnRslt1_gr_loc_grp_nm.addAllListener(p);
		p.columnRslt1_gr_loc_grp_nm.setListListener(p);
		p.columnRslt1_gr_lg_grp_cd.addAllListener(p);
		p.columnRslt1_gr_lg_grp_cd.setListListener(p);
		p.columnRslt1_gr_lg_grp_nm.addAllListener(p);
		p.columnRslt1_gr_lg_grp_nm.setListListener(p);
		p.columnRslt1_gr_loc_wg_cd.addAllListener(p);
		p.columnRslt1_gr_loc_wg_cd.setListListener(p);
		p.columnRslt1_gr_loc_wg_nm.addAllListener(p);
		p.columnRslt1_gr_loc_wg_nm.setListListener(p);
		p.columnRslt1_gr_site_cd.addAllListener(p);
		p.columnRslt1_gr_site_cd.setListListener(p);
		p.columnRslt1_gr_site_nm.addAllListener(p);
		p.columnRslt1_gr_site_nm.setListListener(p);
		p.columnRslt1_rqst_to_loc_cd.addAllListener(p);
		p.columnRslt1_rqst_to_loc_cd.setListListener(p);
		p.columnRslt1_rqst_to_loc_nm.addAllListener(p);
		p.columnRslt1_rqst_to_loc_nm.setListListener(p);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.addAllListener(p);
		p.Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt1_rqst_to_loc_grp_cd.addAllListener(p);
		p.columnRslt1_rqst_to_loc_grp_cd.setListListener(p);
		p.columnRslt1_rqst_to_loc_grp_nm.addAllListener(p);
		p.columnRslt1_rqst_to_loc_grp_nm.setListListener(p);
		p.columnRslt1_rqst_to_lg_grp_cd.addAllListener(p);
		p.columnRslt1_rqst_to_lg_grp_cd.setListListener(p);
		p.columnRslt1_rqst_to_lg_grp_nm.addAllListener(p);
		p.columnRslt1_rqst_to_lg_grp_nm.setListListener(p);
		p.columnRslt1_rqst_to_site_cd.addAllListener(p);
		p.columnRslt1_rqst_to_site_cd.setListListener(p);
		p.columnRslt1_rqst_to_site_nm.addAllListener(p);
		p.columnRslt1_rqst_to_site_nm.setListListener(p);
		p.columnRslt1_mfg_loc_cd.addAllListener(p);
		p.columnRslt1_mfg_loc_cd.setListListener(p);
		p.columnRslt1_mfg_loc_nm.addAllListener(p);
		p.columnRslt1_mfg_loc_nm.setListListener(p);
		p.columnRslt1_bom_ptn.addAllListener(p);
		p.columnRslt1_bom_ptn.setListListener(p);
		p.columnRslt1_sppl_cd.addAllListener(p);
		p.columnRslt1_sppl_cd.setListListener(p);
		p.columnRslt1_sppl_nm.addAllListener(p);
		p.columnRslt1_sppl_nm.setListListener(p);
		p.columnRslt1_sppl_iv_flg.addAllListener(p);
		p.columnRslt1_prnt_lcl_cd.addAllListener(p);
		p.columnRslt1_prnt_lcl_cd.setListListener(p);
		p.columnRslt1_maker_cd.addAllListener(p);
		p.columnRslt1_maker_cd.setListListener(p);
		p.columnRslt1_maker_nm.addAllListener(p);
		p.columnRslt1_maker_nm.setListListener(p);
		p.columnRslt1_rqst_to_wg_cd.addAllListener(p);
		p.columnRslt1_rqst_to_wg_cd.setListListener(p);
		p.columnRslt1_rqst_to_wg_nm.addAllListener(p);
		p.columnRslt1_rqst_to_wg_nm.setListListener(p);
		p.columnRslt1_purc_rsn_cd.addAllListener(p);
		p.columnRslt1_purc_rsn_cd.setListListener(p);
		p.columnRslt1_purc_rsn_nm.addAllListener(p);
		p.columnRslt1_purc_rsn_nm.setListListener(p);
		p.columnRslt1_xpns_purc_flg.addAllListener(p);
		p.columnRslt1_trd_cd.addAllListener(p);
		p.columnRslt1_trd_cd.setListListener(p);
		p.columnRslt1_trd_nm.addAllListener(p);
		p.columnRslt1_trd_nm.setListListener(p);
		p.columnRslt1_trd_ptn_typ.addAllListener(p);
		p.columnRslt1_trd_ptn_typ.setListListener(p);
		p.columnRslt1_trd_unit_cd.addAllListener(p);
		p.columnRslt1_trd_unit_cd.setListListener(p);
		p.columnRslt1_trd_unit_nm.addAllListener(p);
		p.columnRslt1_trd_unit_nm.setListListener(p);
		p.columnRslt1_trd_unit_dec_place.addAllListener(p);
		p.columnRslt1_trd_unit_dec_place.setListListener(p);
		p.columnRslt1_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt1_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt1_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt1_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt1_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt1_trd_unit_conv_qty.setListListener(p);
		p.columnRslt1_base_unit_cd.addAllListener(p);
		p.columnRslt1_base_unit_cd.setListListener(p);
		p.columnRslt1_base_unit_nm.addAllListener(p);
		p.columnRslt1_base_unit_nm.setListListener(p);
		p.columnRslt1_base_unit_dec_place.addAllListener(p);
		p.columnRslt1_base_unit_dec_place.setListListener(p);
		p.columnRslt1_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt1_base_unit_rnd_typ.setListListener(p);
		p.Rslt1_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt1_gd_cd.addAllListener(p);
		p.columnRslt1_gd_cd.setListListener(p);
		p.columnRslt1_gd_nm.addAllListener(p);
		p.columnRslt1_gd_nm.setListListener(p);
		p.columnRslt1_vld_dt_fr.addAllListener(p);
		p.columnRslt1_vld_dt_fr.setListListener(p);
		p.columnRslt1_vld_dt_to.addAllListener(p);
		p.columnRslt1_vld_dt_to.setListListener(p);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt1_bd_lot_mng_typ.addAllListener(p);
		p.columnRslt1_bd_lot_mng_typ.setListListener(p);
		p.columnRslt1_bd_sublot_mng_typ.addAllListener(p);
		p.columnRslt1_bd_sublot_mng_typ.setListListener(p);
		p.columnRslt1_bd_lot_no_typ.addAllListener(p);
		p.columnRslt1_bd_lot_no_typ.setListListener(p);
		p.columnRslt1_bd_sublot_no_typ.addAllListener(p);
		p.columnRslt1_bd_sublot_no_typ.setListListener(p);
		p.columnRslt1_bd_sno1_mng_typ.addAllListener(p);
		p.columnRslt1_bd_sno1_mng_typ.setListListener(p);
		p.columnRslt1_bd_sno2_mng_typ.addAllListener(p);
		p.columnRslt1_bd_sno2_mng_typ.setListListener(p);
		p.columnRslt1_bd_sno3_mng_typ.addAllListener(p);
		p.columnRslt1_bd_sno3_mng_typ.setListListener(p);
		p.columnRslt1_bd_sno4_mng_typ.addAllListener(p);
		p.columnRslt1_bd_sno4_mng_typ.setListListener(p);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt1_slo_no.addAllListener(p);
		p.columnRslt1_slo_no.setListListener(p);
		p.columnRslt1_slo_d_no.addAllListener(p);
		p.columnRslt1_slo_d_no.setListListener(p);
		p.columnRslt1_itm_ord_no.addAllListener(p);
		p.columnRslt1_itm_ord_no.setListListener(p);
		p.columnRslt1_io_schd_pr_no.addAllListener(p);
		p.columnRslt1_io_schd_pr_no.setListListener(p);
		p.columnRslt1_rqst_crrct_flg.addAllListener(p);
		p.columnRslt1_dlv_inst_rcpt_flg.addAllListener(p);
		p.columnRslt1_can_flg.addAllListener(p);
		p.columnRslt1_comp_cng_flg.addAllListener(p);
		p.columnRslt1_spec_cng_flg.addAllListener(p);
		p.columnRslt1_rqst_crrct_dt.addAllListener(p);
		p.columnRslt1_rqst_crrct_dt.setListListener(p);
		p.columnRslt1_rqst_can_dt.addAllListener(p);
		p.columnRslt1_rqst_can_dt.setListListener(p);
		p.columnRslt1_prms_can_dt.addAllListener(p);
		p.columnRslt1_prms_can_dt.setListListener(p);
		p.columnRslt1_inst_dt.addAllListener(p);
		p.columnRslt1_inst_dt.setListListener(p);
		p.columnRslt1_inst_can_dt.addAllListener(p);
		p.columnRslt1_inst_can_dt.setListListener(p);
		p.columnRslt1_act_dt.addAllListener(p);
		p.columnRslt1_act_dt.setListListener(p);
		p.columnRslt1_act_can_dt.addAllListener(p);
		p.columnRslt1_act_can_dt.setListListener(p);
		p.columnRslt1_wg_rqst_cnt_rmrks.addAllListener(p);
		p.columnRslt1_wg_rqst_cnt_rmrks.setListListener(p);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.addAllListener(p);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.setListListener(p);
		p.columnRslt1_wg_rqst_intr_rmrks.addAllListener(p);
		p.columnRslt1_wg_rqst_intr_rmrks.setListListener(p);
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
		p.columnRslt1_wg_rqst_upd_cntr.addAllListener(p);
		p.columnRslt1_wg_rqst_upd_cntr.setListListener(p);
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
	 *  [Rslt1Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt1Btn(MSBAP_WgRqstReg p) {
		p.Rslt1Btn_select_all.addAllListener(p);
		p.Rslt1Btn_select_all.setAPMethodName("doRslt1Btn_select_all");
		p.Rslt1Btn_deselect_all.addAllListener(p);
		p.Rslt1Btn_deselect_all.setAPMethodName("doRslt1Btn_deselect_all");
		p.Rslt1Btn_radd.addAllListener(p);
		p.Rslt1Btn_radd.setAPMethodName("doRslt1Btn_radd");
		p.Rslt1Btn_rdel.addAllListener(p);
		p.Rslt1Btn_rdel.setAPMethodName("doRslt1Btn_rdel");
		p.Rslt1Btn_rcopy.addAllListener(p);
		p.Rslt1Btn_rcopy.setAPMethodName("doRslt1Btn_rcopy");
	}

	/**
	 *  [Rslt2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt2(MSBAP_WgRqstReg p) {
		p.Rslt2Table.addAllListener(p);
		p.columnRslt2_wg_rqst_prms_no.addAllListener(p);
		p.columnRslt2_wg_rqst_prms_no.setListListener(p);
		p.columnRslt2_wg_rqst_no.addAllListener(p);
		p.columnRslt2_wg_rqst_no.setListListener(p);
		p.columnRslt2_can_flg.addAllListener(p);
		p.columnRslt2_fix_flg.addAllListener(p);
		p.columnRslt2_fix_dt.addAllListener(p);
		p.columnRslt2_fix_dt.setListListener(p);
		p.columnRslt2_gr_schd_dt.addAllListener(p);
		p.columnRslt2_gr_schd_dt.setListListener(p);
		p.columnRslt2_gr_schd_hm.addAllListener(p);
		p.columnRslt2_gr_schd_hm.setListListener(p);
		p.columnRslt2_prms_trd_unit_cd.addAllListener(p);
		p.columnRslt2_prms_trd_unit_cd.setListListener(p);
		p.columnRslt2_prms_trd_unit_nm.addAllListener(p);
		p.columnRslt2_prms_trd_unit_nm.setListListener(p);
		p.columnRslt2_prms_trd_unit_dec_place.addAllListener(p);
		p.columnRslt2_prms_trd_unit_dec_place.setListListener(p);
		p.columnRslt2_prms_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt2_prms_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt2_prms_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt2_prms_trd_unit_conv_qty.setListListener(p);
		p.columnRslt2_prms_base_unit_cd.addAllListener(p);
		p.columnRslt2_prms_base_unit_cd.setListListener(p);
		p.columnRslt2_prms_base_unit_nm.addAllListener(p);
		p.columnRslt2_prms_base_unit_nm.setListListener(p);
		p.columnRslt2_prms_base_unit_dec_place.addAllListener(p);
		p.columnRslt2_prms_base_unit_dec_place.setListListener(p);
		p.columnRslt2_prms_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt2_prms_base_unit_rnd_typ.setListListener(p);
		p.columnRslt2_gi_lg_grp_cd.addAllListener(p);
		p.columnRslt2_gi_lg_grp_cd.setListListener(p);
		p.columnRslt2_gi_lg_grp_nm.addAllListener(p);
		p.columnRslt2_gi_lg_grp_nm.setListListener(p);
		p.columnRslt2_gi_loc_cd.addAllListener(p);
		p.columnRslt2_gi_loc_cd.setListListener(p);
		p.columnRslt2_gi_loc_nm.addAllListener(p);
		p.columnRslt2_gi_loc_nm.setListListener(p);
		p.columnRslt2_gi_str_ln_cd.addAllListener(p);
		p.columnRslt2_gi_str_ln_cd.setListListener(p);
		p.columnRslt2_gi_str_ln_nm.addAllListener(p);
		p.columnRslt2_gi_str_ln_nm.setListListener(p);
		p.columnRslt2_gi_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt2_gi_schd_dt.addAllListener(p);
		p.columnRslt2_gi_schd_dt.setListListener(p);
		p.columnRslt2_gi_schd_hm.addAllListener(p);
		p.columnRslt2_gi_schd_hm.setListListener(p);
		p.columnRslt2_mfg_loc_cd.addAllListener(p);
		p.columnRslt2_mfg_loc_cd.setListListener(p);
		p.columnRslt2_mfg_loc_nm.addAllListener(p);
		p.columnRslt2_mfg_loc_nm.setListListener(p);
		p.columnRslt2_bom_ptn.addAllListener(p);
		p.columnRslt2_bom_ptn.setListListener(p);
		p.columnRslt2_sppl_cd.addAllListener(p);
		p.columnRslt2_sppl_cd.setListListener(p);
		p.columnRslt2_sppl_nm.addAllListener(p);
		p.columnRslt2_sppl_nm.setListListener(p);
		p.columnRslt2_maker_cd.addAllListener(p);
		p.columnRslt2_maker_cd.setListListener(p);
		p.columnRslt2_maker_nm.addAllListener(p);
		p.columnRslt2_maker_nm.setListListener(p);
		p.columnRslt2_wg_rqst_prms_rmrks.addAllListener(p);
		p.columnRslt2_wg_rqst_prms_rmrks.setListListener(p);
		p.columnRslt2_ins_usr_id.addAllListener(p);
		p.columnRslt2_ins_usr_id.setListListener(p);
		p.columnRslt2_ins_usr_nm.addAllListener(p);
		p.columnRslt2_ins_usr_nm.setListListener(p);
		p.columnRslt2_ins_func_id.addAllListener(p);
		p.columnRslt2_ins_func_id.setListListener(p);
		p.columnRslt2_ins_func_nm.addAllListener(p);
		p.columnRslt2_ins_func_nm.setListListener(p);
		p.columnRslt2_ins_ts.addAllListener(p);
		p.columnRslt2_ins_ts.setListListener(p);
		p.columnRslt2_upd_usr_id.addAllListener(p);
		p.columnRslt2_upd_usr_id.setListListener(p);
		p.columnRslt2_upd_usr_nm.addAllListener(p);
		p.columnRslt2_upd_usr_nm.setListListener(p);
		p.columnRslt2_upd_func_id.addAllListener(p);
		p.columnRslt2_upd_func_id.setListListener(p);
		p.columnRslt2_upd_func_nm.addAllListener(p);
		p.columnRslt2_upd_func_nm.setListListener(p);
		p.columnRslt2_upd_ts.addAllListener(p);
		p.columnRslt2_upd_ts.setListListener(p);
		p.columnRslt2_upd_srv_req_no.addAllListener(p);
		p.columnRslt2_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBAP_WgRqstReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBAP_WgRqstReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[RqstTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RqstTyp(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[RqstSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RqstSts(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[SloRqst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SloRqst(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBAP_WgRqstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_xfr_rqst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_rqst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rqst_sts_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_sts_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_part_inst_sts_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inst_sts_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_cmpl_sts_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_slo_rqst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_un_slo_rqst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_gr_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_fr_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_re_rqst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_div_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_shrtg_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_due_delay_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prms_uncn_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_re_rqst_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd4(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBAP_WgRqstReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBAP_WgRqstReg p){
		p.BulkSet_rqst_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rqst_fr_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rqst_fr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt1Panel(MSBAP_WgRqstReg p){

	}

	/**
	 * [UPD]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt1(MSBAP_WgRqstReg p){
		p.columnRslt1_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_prms_uncn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_re_rqst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_prms_ntc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_prms_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_ntc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_last_wg_rqst_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_wg_rqst_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_wg_rqst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_rqst_fr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_re_rqst_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Rslt1_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt1_iv_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_gr_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_gr_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_gr_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnRslt1_gr_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt1_gr_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt1_gi_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.columnRslt1_rqst_to_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_rqst_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_rqst_to_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnRslt1_rqst_to_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_sppl_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_rqst_to_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_purc_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt1_trd_unit_qty_p_PPanel.columnQty_qty.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt1_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_not_cmpl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_cmpl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt1_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.ENABLE);
		p.columnRslt1_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt1_bditm_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.columnRslt1_bd_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_io_schd_pr_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_crrct_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_dlv_inst_rcpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_comp_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_spec_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_rqst_crrct_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_rqst_can_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_prms_can_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_inst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_inst_can_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_act_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_act_can_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_wg_rqst_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt1_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt1_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_sppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt1_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Rslt1Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt1Btn(MSBAP_WgRqstReg p){
		p.Rslt1Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt1Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt2(MSBAP_WgRqstReg p){
		p.columnRslt2_wg_rqst_prms_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt2_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_fix_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_prms_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt2_prms_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt2_prms_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_gi_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd_none_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_prms_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt2_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBAP_WgRqstReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[RqstTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RqstTyp(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[RqstSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RqstSts(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[SloRqst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SloRqst(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBAP_WgRqstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_xfr_rqst_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_purc_rqst_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rqst_sts_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prms_sts_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_part_inst_sts_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inst_sts_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_cmpl_sts_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_slo_rqst_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_un_slo_rqst_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_gr_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_fr_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_fr_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_re_rqst_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prms_div_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prms_shrtg_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_due_delay_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prms_uncn_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_re_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd4(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBAP_WgRqstReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBAP_WgRqstReg p){
		p.BulkSet_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt1Panel(MSBAP_WgRqstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt1(MSBAP_WgRqstReg p){
		p.columnRslt1_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_prms_uncn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_prms_ntc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_prms_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_ntc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_last_wg_rqst_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_wg_rqst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_gr_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_gr_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_gr_loc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_gr_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt1_gi_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_rqst_to_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_sppl_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_xpns_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_not_cmpl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_cmpl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt1_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt1_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_bditm_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt1_bd_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_io_schd_pr_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_crrct_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_dlv_inst_rcpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_comp_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_spec_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_rqst_crrct_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_rqst_can_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_prms_can_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_inst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_inst_can_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_act_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_act_can_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt1_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_sppl_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt1_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt1Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt1Btn(MSBAP_WgRqstReg p){
		p.Rslt1Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Rslt1Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Rslt1Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Rslt1Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Rslt1Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt2(MSBAP_WgRqstReg p){
		p.columnRslt2_wg_rqst_prms_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt2_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_fix_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_prms_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt2_prms_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt2_prms_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_gi_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd_none_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_prms_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt2_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBAP_WgRqstReg p){
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RqstTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RqstTyp(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RqstSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RqstSts(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SloRqst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SloRqst(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBAP_WgRqstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_xfr_rqst_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_rqst_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_rqst_sts_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prms_sts_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_part_inst_sts_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inst_sts_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_cmpl_sts_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_slo_rqst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_un_slo_rqst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_gr_rqst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_rqst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_srch_dt_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_srch_dt_to.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_re_rqst_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prms_div_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prms_shrtg_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_due_delay_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_prms_uncn_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_re_rqst_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd3(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd4(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBAP_WgRqstReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBAP_WgRqstReg p){
		p.BulkSet_rqst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt1Panel(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt1(MSBAP_WgRqstReg p){
		p.columnRslt1_check.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.columnRslt1_prms_uncn_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_prms_ntc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_prms_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_ntc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_last_wg_rqst_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_wg_rqst_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_sundry_itm_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_dscnt_itm_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_ver_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_gr_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_gr_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_gr_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_gr_rqst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt1_gi_rqst_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_rqst_to_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_sppl_iv_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_prnt_lcl_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_maker_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_maker_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_ptn_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_not_cmpl_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_cmpl_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt1_lot_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt1_gd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_gd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_to.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_bditm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt1_bd_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_lot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_ord_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_io_schd_pr_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_crrct_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_dlv_inst_rcpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_comp_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_spec_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_rqst_crrct_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_can_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_prms_can_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_inst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_inst_can_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_act_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_act_can_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt1_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_sppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt1_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt1Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt1Btn(MSBAP_WgRqstReg p){
		p.Rslt1Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Rslt1Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Rslt1Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Rslt1Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Rslt1Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt2(MSBAP_WgRqstReg p){
		p.columnRslt2_wg_rqst_prms_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt2_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_fix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_fix_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_hm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_prms_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt2_prms_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt2_prms_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_gi_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd_none_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_hm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_maker_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_maker_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_prms_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBAP_WgRqstReg p){
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[RqstTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RqstTyp(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[RqstSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RqstSts(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[SloRqst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SloRqst(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBAP_WgRqstReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_xfr_rqst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_rqst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rqst_sts_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prms_sts_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_part_inst_sts_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inst_sts_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_cmpl_sts_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_slo_rqst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_un_slo_rqst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_gr_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_fr_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_re_rqst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prms_div_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prms_shrtg_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_due_delay_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prms_uncn_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_re_rqst_cnt_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd3(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd4(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBAP_WgRqstReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBAP_WgRqstReg p){
		p.BulkSet_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt1Panel(MSBAP_WgRqstReg p){

	}

	/**
	 * [DEL]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt1(MSBAP_WgRqstReg p){
		p.columnRslt1_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt1_prms_uncn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_prms_ntc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_prms_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_ntc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_last_wg_rqst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_wg_rqst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_gr_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_gr_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_gr_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_gr_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt1_gi_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_rqst_to_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_sppl_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_not_cmpl_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_cmpl_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt1_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt1_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_bditm_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt1_bd_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_ord_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_io_schd_pr_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_crrct_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_dlv_inst_rcpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_comp_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_spec_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_rqst_crrct_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_rqst_can_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_prms_can_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_inst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_inst_can_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_act_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_act_can_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt1_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt1_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_sppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt1_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt1Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt1Btn(MSBAP_WgRqstReg p){
		p.Rslt1Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Rslt1Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Rslt1Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Rslt1Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Rslt1Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt2(MSBAP_WgRqstReg p){
		p.columnRslt2_wg_rqst_prms_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt2_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_fix_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_hm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_prms_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt2_prms_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt2_prms_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_gi_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd_none_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_hm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_prms_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt2_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBAP_WgRqstReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[RqstTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RqstTyp(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[RqstSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RqstSts(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[SloRqst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SloRqst(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBAP_WgRqstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_xfr_rqst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_rqst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_sts_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prms_sts_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_part_inst_sts_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inst_sts_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cmpl_sts_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_rqst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_un_slo_rqst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_dt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_dt_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_fr_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_re_rqst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prms_div_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prms_shrtg_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_due_delay_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prms_uncn_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_re_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd4(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBAP_WgRqstReg p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBAP_WgRqstReg p){
		p.BulkSet_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt1Panel(MSBAP_WgRqstReg p){

	}

	/**
	 * [SRCH]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt1(MSBAP_WgRqstReg p){
		p.columnRslt1_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_prms_uncn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_prms_ntc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_prms_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_ntc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_last_wg_rqst_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_wg_rqst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH, MCMode.ENABLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH, MCMode.ENABLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_gr_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_gr_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_gr_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_gr_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt1_gi_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_rqst_to_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_sppl_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_xpns_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_not_cmpl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_cmpl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt1_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt1_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_bditm_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt1_bd_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_io_schd_pr_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_crrct_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_dlv_inst_rcpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_comp_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_spec_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_rqst_crrct_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_rqst_can_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_prms_can_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_inst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_inst_can_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_act_can_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt1_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt1_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_sppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt1Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt1Btn(MSBAP_WgRqstReg p){
		p.Rslt1Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Rslt1Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Rslt1Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Rslt1Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Rslt1Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt2(MSBAP_WgRqstReg p){
		p.columnRslt2_wg_rqst_prms_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt2_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_fix_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_prms_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt2_prms_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt2_prms_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_gi_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_prms_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt2_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBAP_WgRqstReg p){
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[RqstTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_RqstTyp(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[RqstSts]ブロックのモードの設定
	 */
	protected static void statusInitREF_RqstSts(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[SloRqst]ブロックのモードの設定
	 */
	protected static void statusInitREF_SloRqst(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBAP_WgRqstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_xfr_rqst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_rqst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_sts_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prms_sts_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_part_inst_sts_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_sts_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cmpl_sts_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_rqst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_un_slo_rqst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gi_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_re_rqst_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_ntc_day_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_to_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_fr_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_re_rqst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prms_div_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prms_shrtg_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_due_delay_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prms_uncn_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_re_rqst_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd4(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBAP_WgRqstReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBAP_WgRqstReg p){
		p.BulkSet_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt1Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt1Panel(MSBAP_WgRqstReg p){

	}

	/**
	 * [REF]ステータスの[Rslt1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt1(MSBAP_WgRqstReg p){
		p.columnRslt1_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_prms_uncn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_prms_ntc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_prms_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_ntc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_re_prms_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_last_wg_rqst_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_wg_rqst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_src_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_fr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_re_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Rslt1_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt1_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_dlv_p_PPanel.columnDlv_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt1_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_gr_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_gr_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_gr_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gr_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_gr_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt1_gi_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_rqst_to_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_sppl_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_to_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt1_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_not_cmpl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt1_cmpl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt1_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt1_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_vld_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_bditm_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt1_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_io_schd_pr_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_crrct_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_dlv_inst_rcpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_comp_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_spec_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_rqst_crrct_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_rqst_can_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_prms_can_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_inst_can_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_act_can_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt1_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt1_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt1_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt1_sppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt1_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_wg_rqst_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt1_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt1_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt1Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt1Btn(MSBAP_WgRqstReg p){
		p.Rslt1Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Rslt1Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Rslt1Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Rslt1Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Rslt1Btn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt2(MSBAP_WgRqstReg p){
		p.columnRslt2_wg_rqst_prms_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt2_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_fix_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gr_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_prms_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt2_prms_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt2_prms_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_prms_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_prms_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt2_prms_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt2_prms_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt2_gi_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_gi_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_wg_rqst_prms_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBAP_WgRqstReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBAP_WgRqstReg p){

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
		MSBAP_WgRqstReg_MC.setTableConfigRslt1((MSBAP_WgRqstReg)this);
		MSBAP_WgRqstReg_MC.setTableConfigRslt2((MSBAP_WgRqstReg)this);
	}

	/**
	 * [Rslt1]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt1(MSBAP_WgRqstReg p) {
		p.columnRslt1_check.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.check_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_check);
		p.columnRslt1_prms_uncn_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.prms_uncn_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_prms_uncn_flg);
		p.columnRslt1_re_rqst_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.re_rqst_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_re_rqst_flg);
		p.columnRslt1_prms_ntc_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.prms_ntc_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_prms_ntc_flg);
		p.columnRslt1_prms_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.prms_dt_META);
		p.columnRslt1_prms_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_prms_dt);
		p.columnRslt1_re_prms_ntc_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.re_prms_ntc_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_re_prms_ntc_flg);
		p.columnRslt1_re_prms_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.re_prms_dt_META);
		p.columnRslt1_re_prms_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_re_prms_dt);
		p.columnRslt1_wg_rqst_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_no);
		p.columnRslt1_last_wg_rqst_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.last_wg_rqst_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_last_wg_rqst_no);
		p.columnRslt1_wg_rqst_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_typ_META);
		p.columnRslt1_wg_rqst_typ.addLinkBeans(p.columnRslt1_wg_rqst_typ_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_typ);
		p.columnRslt1_wg_rqst_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_typ_nm);
		p.columnRslt1_wg_rqst_sts_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_sts_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_sts_typ);
		p.columnRslt1_wg_rqst_sts_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_sts_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_sts_typ_nm);
		p.columnRslt1_wg_rqst_src_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_src_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_src_typ);
		p.columnRslt1_wg_rqst_src_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_src_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_src_typ_nm);
		p.columnRslt1_wg_rqst_src_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_src_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_src_no);
		p.columnRslt1_rqst_fr_wg_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_fr_wg_cd_META);
		p.columnRslt1_rqst_fr_wg_cd.addLinkBeans(p.columnRslt1_rqst_fr_wg_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_fr_wg_cd);
		p.columnRslt1_rqst_fr_wg_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_fr_wg_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_fr_wg_nm);
		p.columnRslt1_rqst_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_dt_META);
		p.columnRslt1_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_dt);
		p.columnRslt1_re_rqst_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.re_rqst_dt_META);
		p.columnRslt1_re_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_re_rqst_dt);
		p.Rslt1Table.addTable(p.Rslt1_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt1_rqst_fr_dpt_nm);
		p.Rslt1Table.addTable(p.Rslt1_itm_p_PPanel.ItmTable);
		p.Rslt1_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt1_itm_nm, p.columnRslt1_itm_sub1, p.columnRslt1_itm_sub2, p.columnRslt1_itm_sub3, p.columnRslt1_lot_mng_typ, p.columnRslt1_sublot_mng_typ, p.columnRslt1_sno1_mng_typ, p.columnRslt1_sno2_mng_typ, p.columnRslt1_sno3_mng_typ, p.columnRslt1_sno4_mng_typ, p.columnRslt1_base_unit_cd, p.columnRslt1_base_unit_nm, p.columnRslt1_base_unit_dec_place, p.columnRslt1_base_unit_rnd_typ, p.columnRslt1_asset_mng_typ, p.columnRslt1_ver_flg, p.columnRslt1_sundry_itm_flg, p.columnRslt1_dscnt_itm_flg);
		p.Rslt1_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt1_itm_nm, p.columnRslt1_itm_sub2, p.columnRslt1_itm_sub3, p.columnRslt1_lot_mng_typ, p.columnRslt1_sublot_mng_typ, p.columnRslt1_sno1_mng_typ, p.columnRslt1_sno2_mng_typ, p.columnRslt1_sno3_mng_typ, p.columnRslt1_sno4_mng_typ, p.columnRslt1_base_unit_cd, p.columnRslt1_base_unit_nm, p.columnRslt1_base_unit_dec_place, p.columnRslt1_base_unit_rnd_typ, p.columnRslt1_asset_mng_typ, p.columnRslt1_ver_flg, p.columnRslt1_sundry_itm_flg, p.columnRslt1_dscnt_itm_flg);
		p.Rslt1_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt1_itm_nm, p.columnRslt1_itm_sub3, p.columnRslt1_lot_mng_typ, p.columnRslt1_sublot_mng_typ, p.columnRslt1_sno1_mng_typ, p.columnRslt1_sno2_mng_typ, p.columnRslt1_sno3_mng_typ, p.columnRslt1_sno4_mng_typ, p.columnRslt1_base_unit_cd, p.columnRslt1_base_unit_nm, p.columnRslt1_base_unit_dec_place, p.columnRslt1_base_unit_rnd_typ, p.columnRslt1_asset_mng_typ, p.columnRslt1_ver_flg, p.columnRslt1_sundry_itm_flg, p.columnRslt1_dscnt_itm_flg);
		p.Rslt1_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt1_itm_nm, p.columnRslt1_lot_mng_typ, p.columnRslt1_sublot_mng_typ, p.columnRslt1_sno1_mng_typ, p.columnRslt1_sno2_mng_typ, p.columnRslt1_sno3_mng_typ, p.columnRslt1_sno4_mng_typ, p.columnRslt1_base_unit_cd, p.columnRslt1_base_unit_nm, p.columnRslt1_base_unit_dec_place, p.columnRslt1_base_unit_rnd_typ, p.columnRslt1_asset_mng_typ, p.columnRslt1_ver_flg, p.columnRslt1_sundry_itm_flg, p.columnRslt1_dscnt_itm_flg);
		p.columnRslt1_iv_itm_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.iv_itm_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_iv_itm_nm);
		p.columnRslt1_lot_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.lot_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_lot_mng_typ);
		p.columnRslt1_sublot_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sublot_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sublot_mng_typ);
		p.columnRslt1_sno1_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sno1_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno1_mng_typ);
		p.columnRslt1_sno2_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sno2_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno2_mng_typ);
		p.columnRslt1_sno3_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sno3_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno3_mng_typ);
		p.columnRslt1_sno4_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sno4_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sno4_mng_typ);
		p.columnRslt1_sundry_itm_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sundry_itm_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sundry_itm_flg);
		p.columnRslt1_asset_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.asset_mng_typ_META);
		p.columnRslt1_asset_mng_typ.addLinkBeans(p.columnRslt1_asset_mng_typ_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_asset_mng_typ);
		p.columnRslt1_asset_mng_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.asset_mng_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_asset_mng_typ_nm);
		p.columnRslt1_dscnt_itm_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.dscnt_itm_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dscnt_itm_flg);
		p.columnRslt1_ver_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.ver_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ver_flg);
		p.Rslt1Table.addTable(p.Rslt1_dlv_p_PPanel.DlvTable);
		p.Rslt1Table.addTable(p.Rslt1_tdlv_p_PPanel.DlvTable);
		p.columnRslt1_gr_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_loc_cd_META);
		p.columnRslt1_gr_loc_cd.setListType(MCListType.STRICT);
		p.columnRslt1_gr_loc_cd.addLinkBeans(p.columnRslt1_gr_loc_nm,p.columnRslt1_gr_loc_wg_cd,p.columnRslt1_gr_loc_wg_nm,p.columnRslt1_gr_site_cd,p.columnRslt1_gr_site_nm,p.columnRslt1_gr_lg_grp_cd,p.columnRslt1_gr_lg_grp_nm,p.columnRslt1_gr_loc_grp_cd,p.columnRslt1_gr_loc_grp_nm,p.columnRslt1_gr_str_ln_tgt_flg,p.columnRslt1_gr_str_ln_cd,p.columnRslt1_gr_str_ln_cd_none_flg);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_loc_cd);
		p.columnRslt1_gr_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_loc_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_loc_nm);
		p.columnRslt1_gr_str_ln_tgt_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_str_ln_tgt_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_str_ln_tgt_flg);
		p.Rslt1Table.addTable(p.Rslt1_gr_str_ln_p_PPanel.StrLnTable);
		p.Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt1_gr_str_ln_nm);
		p.columnRslt1_gr_loc_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_loc_grp_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_loc_grp_cd);
		p.columnRslt1_gr_loc_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_loc_grp_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_loc_grp_nm);
		p.columnRslt1_gr_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_lg_grp_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_lg_grp_cd);
		p.columnRslt1_gr_lg_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_lg_grp_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_lg_grp_nm);
		p.columnRslt1_gr_loc_wg_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_loc_wg_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_loc_wg_cd);
		p.columnRslt1_gr_loc_wg_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_loc_wg_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_loc_wg_nm);
		p.columnRslt1_gr_site_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_site_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_site_cd);
		p.columnRslt1_gr_site_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gr_site_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gr_site_nm);
		p.Rslt1Table.addTable(p.Rslt1_gr_rqst_dt_p_PPanel.YmdHmTable);
		p.Rslt1Table.addTable(p.Rslt1_gi_rqst_dt_p_PPanel.YmdHmTable);
		p.columnRslt1_rqst_to_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_loc_cd_META);
		p.columnRslt1_rqst_to_loc_cd.addLinkBeans(p.columnRslt1_rqst_to_loc_nm,p.columnRslt1_rqst_to_wg_cd,p.columnRslt1_rqst_to_wg_nm,p.columnRslt1_rqst_to_str_ln_tgt_flg,p.columnRslt1_rqst_to_loc_grp_cd,p.columnRslt1_rqst_to_loc_grp_nm,p.columnRslt1_rqst_to_lg_grp_cd,p.columnRslt1_rqst_to_lg_grp_nm,p.columnRslt1_rqst_to_site_cd,p.columnRslt1_rqst_to_site_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_loc_cd);
		p.columnRslt1_rqst_to_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_loc_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_loc_nm);
		p.columnRslt1_rqst_to_str_ln_tgt_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_str_ln_tgt_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_str_ln_tgt_flg);
		p.Rslt1Table.addTable(p.Rslt1_rqst_to_str_ln_p_PPanel.StrLnTable);
		p.Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt1_rqst_to_str_ln_nm);
		p.columnRslt1_rqst_to_loc_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_loc_grp_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_loc_grp_cd);
		p.columnRslt1_rqst_to_loc_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_loc_grp_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_loc_grp_nm);
		p.columnRslt1_rqst_to_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_lg_grp_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_lg_grp_cd);
		p.columnRslt1_rqst_to_lg_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_lg_grp_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_lg_grp_nm);
		p.columnRslt1_rqst_to_site_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_site_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_site_cd);
		p.columnRslt1_rqst_to_site_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_site_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_site_nm);
		p.columnRslt1_mfg_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.mfg_loc_cd_META);
		p.columnRslt1_mfg_loc_cd.addLinkBeans(p.columnRslt1_mfg_loc_nm,p.columnRslt1_sppl_cd,p.columnRslt1_maker_cd);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_mfg_loc_cd);
		p.columnRslt1_mfg_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.mfg_loc_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_mfg_loc_nm);
		p.columnRslt1_bom_ptn.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bom_ptn_META);
		p.columnRslt1_bom_ptn.addLinkBeans(p.columnRslt1_rqst_to_wg_cd,p.columnRslt1_rqst_to_wg_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bom_ptn);
		p.columnRslt1_sppl_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sppl_cd_META);
		p.columnRslt1_sppl_cd.addLinkBeans(p.columnRslt1_sppl_nm,p.columnRslt1_sppl_iv_flg,p.columnRslt1_prnt_lcl_cd,p.columnRslt1_rqst_to_wg_cd,p.columnRslt1_rqst_to_wg_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sppl_cd);
		p.columnRslt1_sppl_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sppl_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sppl_nm);
		p.columnRslt1_sppl_iv_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sppl_iv_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sppl_iv_flg);
		p.columnRslt1_prnt_lcl_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.prnt_lcl_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_prnt_lcl_cd);
		p.columnRslt1_maker_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.maker_cd_META);
		p.columnRslt1_maker_cd.addLinkBeans(p.columnRslt1_maker_nm,p.columnRslt1_rqst_to_wg_cd,p.columnRslt1_rqst_to_wg_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_maker_cd);
		p.columnRslt1_maker_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.maker_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_maker_nm);
		p.columnRslt1_rqst_to_wg_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_wg_cd_META);
		p.columnRslt1_rqst_to_wg_cd.addLinkBeans(p.columnRslt1_rqst_to_wg_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_wg_cd);
		p.columnRslt1_rqst_to_wg_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_to_wg_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_to_wg_nm);
		p.columnRslt1_purc_rsn_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.purc_rsn_cd_META);
		p.columnRslt1_purc_rsn_cd.addLinkBeans(p.columnRslt1_purc_rsn_nm,p.columnRslt1_xpns_purc_flg);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_purc_rsn_cd);
		p.columnRslt1_purc_rsn_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.purc_rsn_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_purc_rsn_nm);
		p.columnRslt1_xpns_purc_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.xpns_purc_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_xpns_purc_flg);
		p.columnRslt1_trd_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_cd_META);
		p.columnRslt1_trd_cd.addLinkBeans(p.columnRslt1_trd_nm,p.columnRslt1_trd_ptn_typ);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_cd);
		p.columnRslt1_trd_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_nm);
		p.columnRslt1_trd_ptn_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_ptn_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_ptn_typ);
		p.columnRslt1_trd_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_unit_cd_META);
		p.columnRslt1_trd_unit_cd.addLinkBeans(p.columnRslt1_trd_unit_nm,p.columnRslt1_trd_unit_dec_place,p.columnRslt1_trd_unit_conv_base_qty,p.columnRslt1_trd_unit_conv_qty,p.columnRslt1_trd_unit_rnd_typ);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_unit_cd);
		p.columnRslt1_trd_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_unit_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_unit_nm);
		p.columnRslt1_trd_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_unit_dec_place_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_unit_dec_place);
		p.columnRslt1_trd_unit_rnd_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_unit_rnd_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_unit_rnd_typ);
		p.columnRslt1_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_unit_conv_base_qty_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_unit_conv_base_qty);
		p.columnRslt1_trd_unit_conv_qty.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.trd_unit_conv_qty_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_trd_unit_conv_qty);
		p.Rslt1Table.addTable(p.Rslt1_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt1_base_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.base_unit_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_cd);
		p.columnRslt1_base_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.base_unit_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_nm);
		p.columnRslt1_base_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.base_unit_dec_place_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_dec_place);
		p.columnRslt1_base_unit_rnd_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.base_unit_rnd_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_base_unit_rnd_typ);
		p.Rslt1Table.addTable(p.Rslt1_base_unit_qty_p_PPanel.QtyTable);
		p.Rslt1Table.addTable(p.Rslt1_not_cmpl_qty_p_PPanel.QtyTable);
		p.Rslt1Table.addTable(p.Rslt1_cmpl_qty_p_PPanel.QtyTable);
		p.Rslt1Table.addTable(p.Rslt1_lot_no_p_PPanel.LotNoTable);
		p.Rslt1Table.addTable(p.Rslt1_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.Rslt1Table.addTable(p.Rslt1_ver_no_p_PPanel.VerNoTable);
		p.columnRslt1_gd_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gd_cd_META);
		p.columnRslt1_gd_cd.addLinkBeans(p.columnRslt1_gd_nm);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gd_cd);
		p.columnRslt1_gd_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.gd_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_gd_nm);
		p.columnRslt1_vld_dt_fr.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.vld_dt_fr_META);
		p.columnRslt1_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_vld_dt_fr);
		p.columnRslt1_vld_dt_to.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.vld_dt_to_META);
		p.columnRslt1_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_vld_dt_to);
		p.Rslt1Table.addTable(p.Rslt1_bditm_p_PPanel.BdItemTable);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnRslt1_bd_dpt_nm);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnRslt1_bd_itm_sub1, p.columnRslt1_bd_itm_sub2, p.columnRslt1_bd_itm_sub3, p.columnRslt1_bd_itm_nm, p.columnRslt1_bd_lot_mng_typ, p.columnRslt1_bd_lot_no_typ, p.columnRslt1_bd_sublot_mng_typ, p.columnRslt1_bd_sublot_no_typ, p.columnRslt1_bd_sno1_mng_typ, p.columnRslt1_bd_sno2_mng_typ, p.columnRslt1_bd_sno3_mng_typ, p.columnRslt1_bd_sno4_mng_typ);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnRslt1_bd_itm_sub2, p.columnRslt1_bd_itm_sub3, p.columnRslt1_bd_itm_nm, p.columnRslt1_bd_lot_mng_typ, p.columnRslt1_bd_lot_no_typ, p.columnRslt1_bd_sublot_mng_typ, p.columnRslt1_bd_sublot_no_typ, p.columnRslt1_bd_sno1_mng_typ, p.columnRslt1_bd_sno2_mng_typ, p.columnRslt1_bd_sno3_mng_typ, p.columnRslt1_bd_sno4_mng_typ);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnRslt1_bd_itm_sub3, p.columnRslt1_bd_itm_nm, p.columnRslt1_bd_lot_mng_typ, p.columnRslt1_bd_lot_no_typ, p.columnRslt1_bd_sublot_mng_typ, p.columnRslt1_bd_sublot_no_typ, p.columnRslt1_bd_sno1_mng_typ, p.columnRslt1_bd_sno2_mng_typ, p.columnRslt1_bd_sno3_mng_typ, p.columnRslt1_bd_sno4_mng_typ);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnRslt1_bd_itm_nm, p.columnRslt1_bd_lot_mng_typ, p.columnRslt1_bd_lot_no_typ, p.columnRslt1_bd_sublot_mng_typ, p.columnRslt1_bd_sublot_no_typ, p.columnRslt1_bd_sno1_mng_typ, p.columnRslt1_bd_sno2_mng_typ, p.columnRslt1_bd_sno3_mng_typ, p.columnRslt1_bd_sno4_mng_typ);
		p.columnRslt1_bd_lot_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_lot_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_lot_mng_typ);
		p.columnRslt1_bd_sublot_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_sublot_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_sublot_mng_typ);
		p.columnRslt1_bd_lot_no_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_lot_no_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_lot_no_typ);
		p.columnRslt1_bd_sublot_no_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_sublot_no_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_sublot_no_typ);
		p.columnRslt1_bd_sno1_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_sno1_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_sno1_mng_typ);
		p.columnRslt1_bd_sno2_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_sno2_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_sno2_mng_typ);
		p.columnRslt1_bd_sno3_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_sno3_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_sno3_mng_typ);
		p.columnRslt1_bd_sno4_mng_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.bd_sno4_mng_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_bd_sno4_mng_typ);
		p.Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.setLinkBeans(p.columnRslt1_bd_bp_nm);
		p.columnRslt1_slo_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.slo_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_slo_no);
		p.columnRslt1_slo_d_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.slo_d_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_slo_d_no);
		p.columnRslt1_itm_ord_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.itm_ord_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_ord_no);
		p.columnRslt1_io_schd_pr_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.io_schd_pr_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_io_schd_pr_no);
		p.columnRslt1_rqst_crrct_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_crrct_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_crrct_flg);
		p.columnRslt1_dlv_inst_rcpt_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.dlv_inst_rcpt_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_dlv_inst_rcpt_flg);
		p.columnRslt1_can_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.can_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_can_flg);
		p.columnRslt1_comp_cng_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.comp_cng_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_comp_cng_flg);
		p.columnRslt1_spec_cng_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.spec_cng_flg_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_spec_cng_flg);
		p.columnRslt1_rqst_crrct_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_crrct_dt_META);
		p.columnRslt1_rqst_crrct_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_crrct_dt);
		p.columnRslt1_rqst_can_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.rqst_can_dt_META);
		p.columnRslt1_rqst_can_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_rqst_can_dt);
		p.columnRslt1_prms_can_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.prms_can_dt_META);
		p.columnRslt1_prms_can_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_prms_can_dt);
		p.columnRslt1_inst_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.inst_dt_META);
		p.columnRslt1_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_inst_dt);
		p.columnRslt1_inst_can_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.inst_can_dt_META);
		p.columnRslt1_inst_can_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_inst_can_dt);
		p.columnRslt1_act_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.act_dt_META);
		p.columnRslt1_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_act_dt);
		p.columnRslt1_act_can_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.act_can_dt_META);
		p.columnRslt1_act_can_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_act_can_dt);
		p.columnRslt1_wg_rqst_cnt_rmrks.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_cnt_rmrks_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_cnt_rmrks);
		p.columnRslt1_wg_re_rqst_cnt_rmrks.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_re_rqst_cnt_rmrks_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_re_rqst_cnt_rmrks);
		p.columnRslt1_wg_rqst_intr_rmrks.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_intr_rmrks_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_intr_rmrks);
		p.columnRslt1_sub_char1.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sub_char1_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sub_char1);
		p.columnRslt1_sub_char2.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sub_char2_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sub_char2);
		p.columnRslt1_sub_char3.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.sub_char3_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_sub_char3);
		p.columnRslt1_itm_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.itm_typ_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ);
		p.columnRslt1_itm_typ_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.itm_typ_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ_nm);
		p.columnRslt1_itm_typ_d_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.itm_typ_d_cd_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ_d_cd);
		p.columnRslt1_itm_typ_d_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.itm_typ_d_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_itm_typ_d_nm);
		p.Rslt1Table.addTable(p.Rslt1_rts_msg_p_PPanel.RtnMsgTable);
		p.Rslt1Table.addTable(p.Rslt1_itm_grp_p_PPanel.ItmGrpTable);
		p.Rslt1Table.addTable(p.Rslt1_dlv_grp_p_PPanel.BpGrpTable);
		p.Rslt1Table.addTable(p.Rslt1_sppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt1_ins_usr_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.ins_usr_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_usr_id);
		p.columnRslt1_ins_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.ins_usr_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_usr_nm);
		p.columnRslt1_ins_func_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.ins_func_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_func_id);
		p.columnRslt1_ins_func_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.ins_func_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_func_nm);
		p.columnRslt1_ins_ts.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.ins_ts_META);
		p.columnRslt1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_ins_ts);
		p.columnRslt1_wg_rqst_upd_cntr.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.wg_rqst_upd_cntr_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_wg_rqst_upd_cntr);
		p.columnRslt1_upd_usr_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.upd_usr_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_usr_id);
		p.columnRslt1_upd_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.upd_usr_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_usr_nm);
		p.columnRslt1_upd_func_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.upd_func_id_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_func_id);
		p.columnRslt1_upd_func_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.upd_func_nm_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_func_nm);
		p.columnRslt1_upd_ts.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.upd_ts_META);
		p.columnRslt1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_ts);
		p.columnRslt1_upd_srv_req_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt1R.upd_srv_req_no_META);
		p.Rslt1Table.addColumnConfig(p.columnRslt1_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.Rslt1Table.setUnscrollColumn(p.columnRslt1_check);
	}

	/**
	 * [Rslt2]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt2(MSBAP_WgRqstReg p) {
		p.columnRslt2_wg_rqst_prms_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.wg_rqst_prms_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_wg_rqst_prms_no);
		p.columnRslt2_wg_rqst_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.wg_rqst_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_wg_rqst_no);
		p.columnRslt2_can_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.can_flg_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_can_flg);
		p.columnRslt2_fix_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.fix_flg_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fix_flg);
		p.columnRslt2_fix_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.fix_dt_META);
		p.columnRslt2_fix_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_fix_dt);
		p.columnRslt2_gr_schd_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gr_schd_dt_META);
		p.columnRslt2_gr_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gr_schd_dt);
		p.columnRslt2_gr_schd_hm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gr_schd_hm_META);
		p.columnRslt2_gr_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gr_schd_hm);
		p.columnRslt2_prms_trd_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_trd_unit_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_trd_unit_cd);
		p.columnRslt2_prms_trd_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_trd_unit_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_trd_unit_nm);
		p.columnRslt2_prms_trd_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_trd_unit_dec_place_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_trd_unit_dec_place);
		p.columnRslt2_prms_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_trd_unit_conv_base_qty_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_trd_unit_conv_base_qty);
		p.columnRslt2_prms_trd_unit_conv_qty.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_trd_unit_conv_qty_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_trd_unit_conv_qty);
		p.Rslt2Table.addTable(p.Rslt2_prms_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt2_prms_base_unit_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_base_unit_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_base_unit_cd);
		p.columnRslt2_prms_base_unit_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_base_unit_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_base_unit_nm);
		p.columnRslt2_prms_base_unit_dec_place.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_base_unit_dec_place_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_base_unit_dec_place);
		p.columnRslt2_prms_base_unit_rnd_typ.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.prms_base_unit_rnd_typ_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_prms_base_unit_rnd_typ);
		p.Rslt2Table.addTable(p.Rslt2_prms_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt2_gi_lg_grp_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_lg_grp_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_lg_grp_cd);
		p.columnRslt2_gi_lg_grp_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_lg_grp_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_lg_grp_nm);
		p.columnRslt2_gi_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_loc_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_loc_cd);
		p.columnRslt2_gi_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_loc_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_loc_nm);
		p.columnRslt2_gi_str_ln_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_str_ln_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_str_ln_cd);
		p.columnRslt2_gi_str_ln_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_str_ln_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_str_ln_nm);
		p.columnRslt2_gi_str_ln_cd_none_flg.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_str_ln_cd_none_flg_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_str_ln_cd_none_flg);
		p.columnRslt2_gi_schd_dt.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_schd_dt_META);
		p.columnRslt2_gi_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_schd_dt);
		p.columnRslt2_gi_schd_hm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.gi_schd_hm_META);
		p.columnRslt2_gi_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_gi_schd_hm);
		p.columnRslt2_mfg_loc_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.mfg_loc_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_mfg_loc_cd);
		p.columnRslt2_mfg_loc_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.mfg_loc_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_mfg_loc_nm);
		p.columnRslt2_bom_ptn.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.bom_ptn_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_bom_ptn);
		p.columnRslt2_sppl_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.sppl_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_sppl_cd);
		p.columnRslt2_sppl_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.sppl_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_sppl_nm);
		p.columnRslt2_maker_cd.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.maker_cd_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_maker_cd);
		p.columnRslt2_maker_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.maker_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_maker_nm);
		p.columnRslt2_wg_rqst_prms_rmrks.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.wg_rqst_prms_rmrks_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_wg_rqst_prms_rmrks);
		p.columnRslt2_ins_usr_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.ins_usr_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_ins_usr_id);
		p.columnRslt2_ins_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.ins_usr_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_ins_usr_nm);
		p.columnRslt2_ins_func_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.ins_func_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_ins_func_id);
		p.columnRslt2_ins_func_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.ins_func_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_ins_func_nm);
		p.columnRslt2_ins_ts.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.ins_ts_META);
		p.columnRslt2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_ins_ts);
		p.columnRslt2_upd_usr_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.upd_usr_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_upd_usr_id);
		p.columnRslt2_upd_usr_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.upd_usr_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_upd_usr_nm);
		p.columnRslt2_upd_func_id.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.upd_func_id_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_upd_func_id);
		p.columnRslt2_upd_func_nm.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.upd_func_nm_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_upd_func_nm);
		p.columnRslt2_upd_ts.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.upd_ts_META);
		p.columnRslt2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_upd_ts);
		p.columnRslt2_upd_srv_req_no.setMeta(mcframe.clientMSBA.MSBAP0100.Rslt2R.upd_srv_req_no_META);
		p.Rslt2Table.addColumnConfig(p.columnRslt2_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_rqst_ntc_day_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_rqst_ntc_day_typ.getListConfig().setPutter(getCnd_wg_rqst_ntc_day_typ_ListPutter());
		Cnd_rqst_fr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_fr_wg_cd.getListConfig().setPutter(getCnd_rqst_fr_wg_cd_ListPutter());
		Cnd_rqst_to_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_to_wg_cd.getListConfig().setPutter(getCnd_rqst_to_wg_cd_ListPutter());
		Cnd_gr_loc_cd.getListConfig().setPutter(getCnd_gr_loc_cd_ListPutter());
		Cnd_gr_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_site_cd.getListConfig().setPutter(getCnd_gr_site_cd_ListPutter());
		Cnd_gr_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_loc_wg_cd.getListConfig().setPutter(getCnd_gr_loc_wg_cd_ListPutter());
		Cnd_gr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_lg_grp_cd.getListConfig().setPutter(getCnd_gr_lg_grp_cd_ListPutter());
		Cnd_gr_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_loc_grp_cd.getListConfig().setPutter(getCnd_gr_loc_grp_cd_ListPutter());
		Cnd_gr_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_str_ln_cd.getListConfig().setPutter(getCnd_gr_str_ln_cd_ListPutter());
		Cnd_rqst_to_loc_cd.getListConfig().setPutter(getCnd_rqst_to_loc_cd_ListPutter());
		Cnd_rqst_to_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_to_site_cd.getListConfig().setPutter(getCnd_rqst_to_site_cd_ListPutter());
		Cnd_rqst_to_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_to_lg_grp_cd.getListConfig().setPutter(getCnd_rqst_to_lg_grp_cd_ListPutter());
		Cnd_rqst_to_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_to_loc_grp_cd.getListConfig().setPutter(getCnd_rqst_to_loc_grp_cd_ListPutter());
		Cnd_rqst_to_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_to_str_ln_cd.getListConfig().setPutter(getCnd_rqst_to_str_ln_cd_ListPutter());
		Cnd_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_rqst_fr_usr_cd.getListConfig().setPutter(getCnd_rqst_fr_usr_cd_ListPutter());
		Cnd_rqst_fr_dpt_cd.getListConfig().setPutter(getCnd_rqst_fr_dpt_cd_ListPutter());
		Cnd_wg_rqst_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_rqst_src_typ.getListConfig().setPutter(getCnd_wg_rqst_src_typ_ListPutter());
		BulkSet_rqst_fr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_rqst_fr_wg_cd.getListConfig().setPutter(getBulkSet_rqst_fr_wg_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnRslt1_wg_rqst_no.getListConfig().setPutter(getRslt1_wg_rqst_no_ListPutter());
		columnRslt1_last_wg_rqst_no.getListConfig().setPutter(getRslt1_last_wg_rqst_no_ListPutter());
		columnRslt1_wg_rqst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_wg_rqst_typ.getListConfig().setPutter(getRslt1_wg_rqst_typ_ListPutter());
		columnRslt1_rqst_fr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_rqst_fr_wg_cd.getListConfig().setPutter(getRslt1_rqst_fr_wg_cd_ListPutter());
		Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		Rslt1_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt1_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt1_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt1_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt1_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_asset_mng_typ.getListConfig().setPutter(getRslt1_asset_mng_typ_ListPutter());
		columnRslt1_gr_loc_cd.getListConfig().setPutter(getRslt1_gr_loc_cd_ListPutter());
		Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnRslt1_rqst_to_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_rqst_to_loc_cd.getListConfig().setPutter(getRslt1_rqst_to_loc_cd_ListPutter());
		Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnRslt1_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_mfg_loc_cd.getListConfig().setPutter(getRslt1_mfg_loc_cd_ListPutter());
		columnRslt1_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_bom_ptn.getListConfig().setPutter(getRslt1_bom_ptn_ListPutter());
		columnRslt1_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_sppl_cd.getListConfig().setPutter(getRslt1_sppl_cd_ListPutter());
		columnRslt1_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_maker_cd.getListConfig().setPutter(getRslt1_maker_cd_ListPutter());
		columnRslt1_rqst_to_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_rqst_to_wg_cd.getListConfig().setPutter(getRslt1_rqst_to_wg_cd_ListPutter());
		columnRslt1_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_purc_rsn_cd.getListConfig().setPutter(getRslt1_purc_rsn_cd_ListPutter());
		columnRslt1_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_trd_cd.getListConfig().setPutter(getRslt1_trd_cd_ListPutter());
		columnRslt1_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_trd_unit_cd.getListConfig().setPutter(getRslt1_trd_unit_cd_ListPutter());
		columnRslt1_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt1_gd_cd.getListConfig().setPutter(getRslt1_gd_cd_ListPutter());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().setPutter(getRslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_cd.getListConfig().setPutter(getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.getListConfig().setPutter(getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.getListConfig().setPutter(getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.getListConfig().setPutter(getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter());
		Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd.getListConfig().setPutter(getRslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter());
		columnRslt1_slo_no.getListConfig().setPutter(getRslt1_slo_no_ListPutter());
		columnRslt1_slo_d_no.getListConfig().setPutter(getRslt1_slo_d_no_ListPutter());
		columnRslt2_wg_rqst_prms_no.getListConfig().setPutter(getRslt2_wg_rqst_prms_no_ListPutter());
		columnRslt2_wg_rqst_no.getListConfig().setPutter(getRslt2_wg_rqst_no_ListPutter());
		columnRslt2_prms_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_prms_trd_unit_cd.getListConfig().setPutter(getRslt2_prms_trd_unit_cd_ListPutter());
		columnRslt2_prms_base_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt2_prms_base_unit_cd.getListConfig().setPutter(getRslt2_prms_base_unit_cd_ListPutter());
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
	 * [Cnd_wg_rqst_ntc_day_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_rqst_ntc_day_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.WgRqstNtcDayTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_fr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_fr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_to_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_to_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_to_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_to_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_to_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_to_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_to_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_to_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_to_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_to_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_fr_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_fr_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_fr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_fr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_rqst_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_rqst_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.WgRqstSrcTyp");
		return lp;
	}
	 
	/**
	 * [BulkSet_rqst_fr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_rqst_fr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt1_wg_rqst_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_wg_rqst_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_last_wg_rqst_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_last_wg_rqst_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_wg_rqst_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_wg_rqst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.WgRqstTyp");
		return lp;
	}
	 
	/**
	 * [Rslt1_rqst_fr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_rqst_fr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt1_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Rslt1_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Rslt1_rqst_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_rqst_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Rslt1_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Rslt1_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
		return lp;
	}
	 
	/**
	 * [Rslt1_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Rslt1_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Rslt1_rqst_to_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_rqst_to_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBizRsn");
		return lp;
	}
	 
	/**
	 * [Rslt1_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Rslt1_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Rslt1_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}

	/**
	 * [Rslt1_slo_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_slo_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt1_slo_d_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt1_slo_d_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_wg_rqst_prms_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_wg_rqst_prms_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_wg_rqst_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_wg_rqst_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_prms_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_prms_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt2_prms_base_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt2_prms_base_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_wg_rqst_ntc_day_typ) return getCnd_wg_rqst_ntc_day_typ(row, info);
		if(combo == Cnd_rqst_fr_wg_cd) return getCnd_rqst_fr_wg_cd(row, info);
		if(combo == Cnd_rqst_to_wg_cd) return getCnd_rqst_to_wg_cd(row, info);
		if(combo == Cnd_gr_loc_cd) return getCnd_gr_loc_cd(row, info);
		if(combo == Cnd_gr_site_cd) return getCnd_gr_site_cd(row, info);
		if(combo == Cnd_gr_loc_wg_cd) return getCnd_gr_loc_wg_cd(row, info);
		if(combo == Cnd_gr_lg_grp_cd) return getCnd_gr_lg_grp_cd(row, info);
		if(combo == Cnd_gr_loc_grp_cd) return getCnd_gr_loc_grp_cd(row, info);
		if(combo == Cnd_gr_str_ln_cd) return getCnd_gr_str_ln_cd(row, info);
		if(combo == Cnd_rqst_to_loc_cd) return getCnd_rqst_to_loc_cd(row, info);
		if(combo == Cnd_rqst_to_site_cd) return getCnd_rqst_to_site_cd(row, info);
		if(combo == Cnd_rqst_to_lg_grp_cd) return getCnd_rqst_to_lg_grp_cd(row, info);
		if(combo == Cnd_rqst_to_loc_grp_cd) return getCnd_rqst_to_loc_grp_cd(row, info);
		if(combo == Cnd_rqst_to_str_ln_cd) return getCnd_rqst_to_str_ln_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_rqst_fr_usr_cd) return getCnd_rqst_fr_usr_cd(row, info);
		if(combo == Cnd_rqst_fr_dpt_cd) return getCnd_rqst_fr_dpt_cd(row, info);
		if(combo == Cnd_wg_rqst_src_typ) return getCnd_wg_rqst_src_typ(row, info);
		if(combo == BulkSet_rqst_fr_wg_cd) return getBulkSet_rqst_fr_wg_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnRslt1_wg_rqst_no) return getRslt1_wg_rqst_no(row, info);
		if(combo == columnRslt1_last_wg_rqst_no) return getRslt1_last_wg_rqst_no(row, info);
		if(combo == columnRslt1_wg_rqst_typ) return getRslt1_wg_rqst_typ(row, info);
		if(combo == columnRslt1_rqst_fr_wg_cd) return getRslt1_rqst_fr_wg_cd(row, info);
		if(combo == Rslt1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == Rslt1_itm_p_PPanel.columnItm_itm_cd) return getRslt1_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt1_itm_p_PPanel.columnItm_itm_sub1) return getRslt1_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt1_itm_p_PPanel.columnItm_itm_sub2) return getRslt1_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt1_itm_p_PPanel.columnItm_itm_sub3) return getRslt1_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt1_asset_mng_typ) return getRslt1_asset_mng_typ(row, info);
		if(combo == columnRslt1_gr_loc_cd) return getRslt1_gr_loc_cd(row, info);
		if(combo == Rslt1_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnRslt1_rqst_to_loc_cd) return getRslt1_rqst_to_loc_cd(row, info);
		if(combo == Rslt1_rqst_to_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnRslt1_mfg_loc_cd) return getRslt1_mfg_loc_cd(row, info);
		if(combo == columnRslt1_bom_ptn) return getRslt1_bom_ptn(row, info);
		if(combo == columnRslt1_sppl_cd) return getRslt1_sppl_cd(row, info);
		if(combo == columnRslt1_maker_cd) return getRslt1_maker_cd(row, info);
		if(combo == columnRslt1_rqst_to_wg_cd) return getRslt1_rqst_to_wg_cd(row, info);
		if(combo == columnRslt1_purc_rsn_cd) return getRslt1_purc_rsn_cd(row, info);
		if(combo == columnRslt1_trd_cd) return getRslt1_trd_cd(row, info);
		if(combo == columnRslt1_trd_unit_cd) return getRslt1_trd_unit_cd(row, info);
		if(combo == Rslt1_ver_no_p_PPanel.columnVerNo_ver_no) return getRslt1_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnRslt1_gd_cd) return getRslt1_gd_cd(row, info);
		if(combo == Rslt1_bditm_p_PPanel.columnBdItem_bd_dpt_cd) return getRslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd(row, info);
		if(combo == Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_cd) return getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd(row, info);
		if(combo == Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub1) return getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1(row, info);
		if(combo == Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub2) return getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2(row, info);
		if(combo == Rslt1_bditm_p_PPanel.columnBdItem_bd_itm_sub3) return getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3(row, info);
		if(combo == Rslt1_bditm_p_PPanel.columnBdItem_bd_bp_cd) return getRslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd(row, info);
		if(combo == columnRslt1_slo_no) return getRslt1_slo_no(row, info);
		if(combo == columnRslt1_slo_d_no) return getRslt1_slo_d_no(row, info);
		if(combo == columnRslt2_wg_rqst_prms_no) return getRslt2_wg_rqst_prms_no(row, info);
		if(combo == columnRslt2_wg_rqst_no) return getRslt2_wg_rqst_no(row, info);
		if(combo == columnRslt2_prms_trd_unit_cd) return getRslt2_prms_trd_unit_cd(row, info);
		if(combo == columnRslt2_prms_base_unit_cd) return getRslt2_prms_base_unit_cd(row, info);
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
		else if (ap == Rslt1Btn_select_all) doRslt1Btn_select_all(info);
		else if (ap == Rslt1Btn_deselect_all) doRslt1Btn_deselect_all(info);
		else if (ap == Rslt1Btn_radd) doRslt1Btn_radd(info);
		else if (ap == Rslt1Btn_rdel) doRslt1Btn_rdel(info);
		else if (ap == Rslt1Btn_rcopy) doRslt1Btn_rcopy(info);
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
	 * [Rslt1Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt1Btn_select_all(MCEventInfo info);

	/**
	 * [Rslt1Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt1Btn_deselect_all(MCEventInfo info);

	/**
	 * [Rslt1Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt1Btn_radd(MCEventInfo info);

	/**
	 * [Rslt1Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt1Btn_rdel(MCEventInfo info);

	/**
	 * [Rslt1Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt1Btn_rcopy(MCEventInfo info);

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
		if (vc == Rslt1Table) return doRslt1_VC(info);
		if (vc == Rslt2Table) return doRslt2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_xfr_rqst_flg) return doCnd_xfr_rqst_flg_VC(info);
		if (vc == Cnd_purc_rqst_flg) return doCnd_purc_rqst_flg_VC(info);
		if (vc == Cnd_ship_rqst_flg) return doCnd_ship_rqst_flg_VC(info);
		if (vc == Cnd_rqst_sts_flg) return doCnd_rqst_sts_flg_VC(info);
		if (vc == Cnd_prms_sts_flg) return doCnd_prms_sts_flg_VC(info);
		if (vc == Cnd_part_inst_sts_flg) return doCnd_part_inst_sts_flg_VC(info);
		if (vc == Cnd_inst_sts_flg) return doCnd_inst_sts_flg_VC(info);
		if (vc == Cnd_cmpl_sts_flg) return doCnd_cmpl_sts_flg_VC(info);
		if (vc == Cnd_slo_rqst_flg) return doCnd_slo_rqst_flg_VC(info);
		if (vc == Cnd_un_slo_rqst_flg) return doCnd_un_slo_rqst_flg_VC(info);
		if (vc == Cnd_rqst_dt_fr) return doCnd_rqst_dt_fr_VC(info);
		if (vc == Cnd_rqst_dt_to) return doCnd_rqst_dt_to_VC(info);
		if (vc == Cnd_re_rqst_dt_fr) return doCnd_re_rqst_dt_fr_VC(info);
		if (vc == Cnd_re_rqst_dt_to) return doCnd_re_rqst_dt_to_VC(info);
		if (vc == Cnd_wg_rqst_ntc_day_typ) return doCnd_wg_rqst_ntc_day_typ_VC(info);
		if (vc == Cnd_wg_rqst_ntc_day_typ_nm) return doCnd_wg_rqst_ntc_day_typ_nm_VC(info);
		if (vc == Cnd_srch_dt_fr) return doCnd_srch_dt_fr_VC(info);
		if (vc == Cnd_srch_dt_to) return doCnd_srch_dt_to_VC(info);
		if (vc == Cnd_rqst_fr_wg_cd) return doCnd_rqst_fr_wg_cd_VC(info);
		if (vc == Cnd_rqst_fr_wg_nm) return doCnd_rqst_fr_wg_nm_VC(info);
		if (vc == Cnd_rqst_to_wg_cd) return doCnd_rqst_to_wg_cd_VC(info);
		if (vc == Cnd_rqst_to_wg_nm) return doCnd_rqst_to_wg_nm_VC(info);
		if (vc == Cnd_gr_loc_cd) return doCnd_gr_loc_cd_VC(info);
		if (vc == Cnd_gr_loc_nm) return doCnd_gr_loc_nm_VC(info);
		if (vc == Cnd_gr_site_cd) return doCnd_gr_site_cd_VC(info);
		if (vc == Cnd_gr_site_nm) return doCnd_gr_site_nm_VC(info);
		if (vc == Cnd_gr_loc_wg_cd) return doCnd_gr_loc_wg_cd_VC(info);
		if (vc == Cnd_gr_loc_wg_nm) return doCnd_gr_loc_wg_nm_VC(info);
		if (vc == Cnd_gr_lg_grp_cd) return doCnd_gr_lg_grp_cd_VC(info);
		if (vc == Cnd_gr_lg_grp_nm) return doCnd_gr_lg_grp_nm_VC(info);
		if (vc == Cnd_gr_loc_grp_cd) return doCnd_gr_loc_grp_cd_VC(info);
		if (vc == Cnd_gr_loc_grp_nm) return doCnd_gr_loc_grp_nm_VC(info);
		if (vc == Cnd_gr_str_ln_cd) return doCnd_gr_str_ln_cd_VC(info);
		if (vc == Cnd_gr_str_ln_nm) return doCnd_gr_str_ln_nm_VC(info);
		if (vc == Cnd_rqst_to_loc_cd) return doCnd_rqst_to_loc_cd_VC(info);
		if (vc == Cnd_rqst_to_loc_nm) return doCnd_rqst_to_loc_nm_VC(info);
		if (vc == Cnd_rqst_to_site_cd) return doCnd_rqst_to_site_cd_VC(info);
		if (vc == Cnd_rqst_to_site_nm) return doCnd_rqst_to_site_nm_VC(info);
		if (vc == Cnd_rqst_to_lg_grp_cd) return doCnd_rqst_to_lg_grp_cd_VC(info);
		if (vc == Cnd_rqst_to_lg_grp_nm) return doCnd_rqst_to_lg_grp_nm_VC(info);
		if (vc == Cnd_rqst_to_loc_grp_cd) return doCnd_rqst_to_loc_grp_cd_VC(info);
		if (vc == Cnd_rqst_to_loc_grp_nm) return doCnd_rqst_to_loc_grp_nm_VC(info);
		if (vc == Cnd_rqst_to_str_ln_cd) return doCnd_rqst_to_str_ln_cd_VC(info);
		if (vc == Cnd_rqst_to_str_ln_nm) return doCnd_rqst_to_str_ln_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_rqst_fr_usr_cd) return doCnd_rqst_fr_usr_cd_VC(info);
		if (vc == Cnd_rqst_fr_usr_nm) return doCnd_rqst_fr_usr_nm_VC(info);
		if (vc == Cnd_rqst_fr_dpt_cd) return doCnd_rqst_fr_dpt_cd_VC(info);
		if (vc == Cnd_rqst_fr_dpt_nm) return doCnd_rqst_fr_dpt_nm_VC(info);
		if (vc == Cnd_wg_rqst_src_typ) return doCnd_wg_rqst_src_typ_VC(info);
		if (vc == Cnd_wg_rqst_src_typ_nm) return doCnd_wg_rqst_src_typ_nm_VC(info);
		if (vc == Cnd_wg_rqst_src_no) return doCnd_wg_rqst_src_no_VC(info);
		if (vc == Cnd_wg_rqst_no) return doCnd_wg_rqst_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_re_rqst_flg) return doCnd_re_rqst_flg_VC(info);
		if (vc == Cnd_prms_div_flg) return doCnd_prms_div_flg_VC(info);
		if (vc == Cnd_prms_shrtg_flg) return doCnd_prms_shrtg_flg_VC(info);
		if (vc == Cnd_due_delay_flg) return doCnd_due_delay_flg_VC(info);
		if (vc == Cnd_prms_uncn_flg) return doCnd_prms_uncn_flg_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == Cnd_wg_rqst_cnt_rmrks) return doCnd_wg_rqst_cnt_rmrks_VC(info);
		if (vc == Cnd_wg_re_rqst_cnt_rmrks) return doCnd_wg_re_rqst_cnt_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == BulkSet_rqst_dt) return doBulkSet_rqst_dt_VC(info);
		if (vc == BulkSet_rqst_fr_wg_cd) return doBulkSet_rqst_fr_wg_cd_VC(info);
		if (vc == BulkSet_rqst_fr_wg_nm) return doBulkSet_rqst_fr_wg_nm_VC(info);
		if (vc == columnRslt1_check) return doRslt1_check_VC(info);
		if (vc == columnRslt1_prms_uncn_flg) return doRslt1_prms_uncn_flg_VC(info);
		if (vc == columnRslt1_re_rqst_flg) return doRslt1_re_rqst_flg_VC(info);
		if (vc == columnRslt1_prms_ntc_flg) return doRslt1_prms_ntc_flg_VC(info);
		if (vc == columnRslt1_prms_dt) return doRslt1_prms_dt_VC(info);
		if (vc == columnRslt1_re_prms_ntc_flg) return doRslt1_re_prms_ntc_flg_VC(info);
		if (vc == columnRslt1_re_prms_dt) return doRslt1_re_prms_dt_VC(info);
		if (vc == columnRslt1_wg_rqst_no) return doRslt1_wg_rqst_no_VC(info);
		if (vc == columnRslt1_last_wg_rqst_no) return doRslt1_last_wg_rqst_no_VC(info);
		if (vc == columnRslt1_wg_rqst_typ) return doRslt1_wg_rqst_typ_VC(info);
		if (vc == columnRslt1_wg_rqst_typ_nm) return doRslt1_wg_rqst_typ_nm_VC(info);
		if (vc == columnRslt1_wg_rqst_sts_typ) return doRslt1_wg_rqst_sts_typ_VC(info);
		if (vc == columnRslt1_wg_rqst_sts_typ_nm) return doRslt1_wg_rqst_sts_typ_nm_VC(info);
		if (vc == columnRslt1_wg_rqst_src_typ) return doRslt1_wg_rqst_src_typ_VC(info);
		if (vc == columnRslt1_wg_rqst_src_typ_nm) return doRslt1_wg_rqst_src_typ_nm_VC(info);
		if (vc == columnRslt1_wg_rqst_src_no) return doRslt1_wg_rqst_src_no_VC(info);
		if (vc == columnRslt1_rqst_fr_wg_cd) return doRslt1_rqst_fr_wg_cd_VC(info);
		if (vc == columnRslt1_rqst_fr_wg_nm) return doRslt1_rqst_fr_wg_nm_VC(info);
		if (vc == columnRslt1_rqst_dt) return doRslt1_rqst_dt_VC(info);
		if (vc == columnRslt1_re_rqst_dt) return doRslt1_re_rqst_dt_VC(info);
		if (vc == columnRslt1_iv_itm_nm) return doRslt1_iv_itm_nm_VC(info);
		if (vc == columnRslt1_lot_mng_typ) return doRslt1_lot_mng_typ_VC(info);
		if (vc == columnRslt1_sublot_mng_typ) return doRslt1_sublot_mng_typ_VC(info);
		if (vc == columnRslt1_sno1_mng_typ) return doRslt1_sno1_mng_typ_VC(info);
		if (vc == columnRslt1_sno2_mng_typ) return doRslt1_sno2_mng_typ_VC(info);
		if (vc == columnRslt1_sno3_mng_typ) return doRslt1_sno3_mng_typ_VC(info);
		if (vc == columnRslt1_sno4_mng_typ) return doRslt1_sno4_mng_typ_VC(info);
		if (vc == columnRslt1_sundry_itm_flg) return doRslt1_sundry_itm_flg_VC(info);
		if (vc == columnRslt1_asset_mng_typ) return doRslt1_asset_mng_typ_VC(info);
		if (vc == columnRslt1_asset_mng_typ_nm) return doRslt1_asset_mng_typ_nm_VC(info);
		if (vc == columnRslt1_dscnt_itm_flg) return doRslt1_dscnt_itm_flg_VC(info);
		if (vc == columnRslt1_ver_flg) return doRslt1_ver_flg_VC(info);
		if (vc == columnRslt1_gr_loc_cd) return doRslt1_gr_loc_cd_VC(info);
		if (vc == columnRslt1_gr_loc_nm) return doRslt1_gr_loc_nm_VC(info);
		if (vc == columnRslt1_gr_str_ln_tgt_flg) return doRslt1_gr_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt1_gr_loc_grp_cd) return doRslt1_gr_loc_grp_cd_VC(info);
		if (vc == columnRslt1_gr_loc_grp_nm) return doRslt1_gr_loc_grp_nm_VC(info);
		if (vc == columnRslt1_gr_lg_grp_cd) return doRslt1_gr_lg_grp_cd_VC(info);
		if (vc == columnRslt1_gr_lg_grp_nm) return doRslt1_gr_lg_grp_nm_VC(info);
		if (vc == columnRslt1_gr_loc_wg_cd) return doRslt1_gr_loc_wg_cd_VC(info);
		if (vc == columnRslt1_gr_loc_wg_nm) return doRslt1_gr_loc_wg_nm_VC(info);
		if (vc == columnRslt1_gr_site_cd) return doRslt1_gr_site_cd_VC(info);
		if (vc == columnRslt1_gr_site_nm) return doRslt1_gr_site_nm_VC(info);
		if (vc == columnRslt1_rqst_to_loc_cd) return doRslt1_rqst_to_loc_cd_VC(info);
		if (vc == columnRslt1_rqst_to_loc_nm) return doRslt1_rqst_to_loc_nm_VC(info);
		if (vc == columnRslt1_rqst_to_str_ln_tgt_flg) return doRslt1_rqst_to_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt1_rqst_to_loc_grp_cd) return doRslt1_rqst_to_loc_grp_cd_VC(info);
		if (vc == columnRslt1_rqst_to_loc_grp_nm) return doRslt1_rqst_to_loc_grp_nm_VC(info);
		if (vc == columnRslt1_rqst_to_lg_grp_cd) return doRslt1_rqst_to_lg_grp_cd_VC(info);
		if (vc == columnRslt1_rqst_to_lg_grp_nm) return doRslt1_rqst_to_lg_grp_nm_VC(info);
		if (vc == columnRslt1_rqst_to_site_cd) return doRslt1_rqst_to_site_cd_VC(info);
		if (vc == columnRslt1_rqst_to_site_nm) return doRslt1_rqst_to_site_nm_VC(info);
		if (vc == columnRslt1_mfg_loc_cd) return doRslt1_mfg_loc_cd_VC(info);
		if (vc == columnRslt1_mfg_loc_nm) return doRslt1_mfg_loc_nm_VC(info);
		if (vc == columnRslt1_bom_ptn) return doRslt1_bom_ptn_VC(info);
		if (vc == columnRslt1_sppl_cd) return doRslt1_sppl_cd_VC(info);
		if (vc == columnRslt1_sppl_nm) return doRslt1_sppl_nm_VC(info);
		if (vc == columnRslt1_sppl_iv_flg) return doRslt1_sppl_iv_flg_VC(info);
		if (vc == columnRslt1_prnt_lcl_cd) return doRslt1_prnt_lcl_cd_VC(info);
		if (vc == columnRslt1_maker_cd) return doRslt1_maker_cd_VC(info);
		if (vc == columnRslt1_maker_nm) return doRslt1_maker_nm_VC(info);
		if (vc == columnRslt1_rqst_to_wg_cd) return doRslt1_rqst_to_wg_cd_VC(info);
		if (vc == columnRslt1_rqst_to_wg_nm) return doRslt1_rqst_to_wg_nm_VC(info);
		if (vc == columnRslt1_purc_rsn_cd) return doRslt1_purc_rsn_cd_VC(info);
		if (vc == columnRslt1_purc_rsn_nm) return doRslt1_purc_rsn_nm_VC(info);
		if (vc == columnRslt1_xpns_purc_flg) return doRslt1_xpns_purc_flg_VC(info);
		if (vc == columnRslt1_trd_cd) return doRslt1_trd_cd_VC(info);
		if (vc == columnRslt1_trd_nm) return doRslt1_trd_nm_VC(info);
		if (vc == columnRslt1_trd_ptn_typ) return doRslt1_trd_ptn_typ_VC(info);
		if (vc == columnRslt1_trd_unit_cd) return doRslt1_trd_unit_cd_VC(info);
		if (vc == columnRslt1_trd_unit_nm) return doRslt1_trd_unit_nm_VC(info);
		if (vc == columnRslt1_trd_unit_dec_place) return doRslt1_trd_unit_dec_place_VC(info);
		if (vc == columnRslt1_trd_unit_rnd_typ) return doRslt1_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt1_trd_unit_conv_base_qty) return doRslt1_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt1_trd_unit_conv_qty) return doRslt1_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt1_base_unit_cd) return doRslt1_base_unit_cd_VC(info);
		if (vc == columnRslt1_base_unit_nm) return doRslt1_base_unit_nm_VC(info);
		if (vc == columnRslt1_base_unit_dec_place) return doRslt1_base_unit_dec_place_VC(info);
		if (vc == columnRslt1_base_unit_rnd_typ) return doRslt1_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt1_gd_cd) return doRslt1_gd_cd_VC(info);
		if (vc == columnRslt1_gd_nm) return doRslt1_gd_nm_VC(info);
		if (vc == columnRslt1_vld_dt_fr) return doRslt1_vld_dt_fr_VC(info);
		if (vc == columnRslt1_vld_dt_to) return doRslt1_vld_dt_to_VC(info);
		if (vc == columnRslt1_bd_lot_mng_typ) return doRslt1_bd_lot_mng_typ_VC(info);
		if (vc == columnRslt1_bd_sublot_mng_typ) return doRslt1_bd_sublot_mng_typ_VC(info);
		if (vc == columnRslt1_bd_lot_no_typ) return doRslt1_bd_lot_no_typ_VC(info);
		if (vc == columnRslt1_bd_sublot_no_typ) return doRslt1_bd_sublot_no_typ_VC(info);
		if (vc == columnRslt1_bd_sno1_mng_typ) return doRslt1_bd_sno1_mng_typ_VC(info);
		if (vc == columnRslt1_bd_sno2_mng_typ) return doRslt1_bd_sno2_mng_typ_VC(info);
		if (vc == columnRslt1_bd_sno3_mng_typ) return doRslt1_bd_sno3_mng_typ_VC(info);
		if (vc == columnRslt1_bd_sno4_mng_typ) return doRslt1_bd_sno4_mng_typ_VC(info);
		if (vc == columnRslt1_slo_no) return doRslt1_slo_no_VC(info);
		if (vc == columnRslt1_slo_d_no) return doRslt1_slo_d_no_VC(info);
		if (vc == columnRslt1_itm_ord_no) return doRslt1_itm_ord_no_VC(info);
		if (vc == columnRslt1_io_schd_pr_no) return doRslt1_io_schd_pr_no_VC(info);
		if (vc == columnRslt1_rqst_crrct_flg) return doRslt1_rqst_crrct_flg_VC(info);
		if (vc == columnRslt1_dlv_inst_rcpt_flg) return doRslt1_dlv_inst_rcpt_flg_VC(info);
		if (vc == columnRslt1_can_flg) return doRslt1_can_flg_VC(info);
		if (vc == columnRslt1_comp_cng_flg) return doRslt1_comp_cng_flg_VC(info);
		if (vc == columnRslt1_spec_cng_flg) return doRslt1_spec_cng_flg_VC(info);
		if (vc == columnRslt1_rqst_crrct_dt) return doRslt1_rqst_crrct_dt_VC(info);
		if (vc == columnRslt1_rqst_can_dt) return doRslt1_rqst_can_dt_VC(info);
		if (vc == columnRslt1_prms_can_dt) return doRslt1_prms_can_dt_VC(info);
		if (vc == columnRslt1_inst_dt) return doRslt1_inst_dt_VC(info);
		if (vc == columnRslt1_inst_can_dt) return doRslt1_inst_can_dt_VC(info);
		if (vc == columnRslt1_act_dt) return doRslt1_act_dt_VC(info);
		if (vc == columnRslt1_act_can_dt) return doRslt1_act_can_dt_VC(info);
		if (vc == columnRslt1_wg_rqst_cnt_rmrks) return doRslt1_wg_rqst_cnt_rmrks_VC(info);
		if (vc == columnRslt1_wg_re_rqst_cnt_rmrks) return doRslt1_wg_re_rqst_cnt_rmrks_VC(info);
		if (vc == columnRslt1_wg_rqst_intr_rmrks) return doRslt1_wg_rqst_intr_rmrks_VC(info);
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
		if (vc == columnRslt1_wg_rqst_upd_cntr) return doRslt1_wg_rqst_upd_cntr_VC(info);
		if (vc == columnRslt1_upd_usr_id) return doRslt1_upd_usr_id_VC(info);
		if (vc == columnRslt1_upd_usr_nm) return doRslt1_upd_usr_nm_VC(info);
		if (vc == columnRslt1_upd_func_id) return doRslt1_upd_func_id_VC(info);
		if (vc == columnRslt1_upd_func_nm) return doRslt1_upd_func_nm_VC(info);
		if (vc == columnRslt1_upd_ts) return doRslt1_upd_ts_VC(info);
		if (vc == columnRslt1_upd_srv_req_no) return doRslt1_upd_srv_req_no_VC(info);
		if (vc == columnRslt2_wg_rqst_prms_no) return doRslt2_wg_rqst_prms_no_VC(info);
		if (vc == columnRslt2_wg_rqst_no) return doRslt2_wg_rqst_no_VC(info);
		if (vc == columnRslt2_can_flg) return doRslt2_can_flg_VC(info);
		if (vc == columnRslt2_fix_flg) return doRslt2_fix_flg_VC(info);
		if (vc == columnRslt2_fix_dt) return doRslt2_fix_dt_VC(info);
		if (vc == columnRslt2_gr_schd_dt) return doRslt2_gr_schd_dt_VC(info);
		if (vc == columnRslt2_gr_schd_hm) return doRslt2_gr_schd_hm_VC(info);
		if (vc == columnRslt2_prms_trd_unit_cd) return doRslt2_prms_trd_unit_cd_VC(info);
		if (vc == columnRslt2_prms_trd_unit_nm) return doRslt2_prms_trd_unit_nm_VC(info);
		if (vc == columnRslt2_prms_trd_unit_dec_place) return doRslt2_prms_trd_unit_dec_place_VC(info);
		if (vc == columnRslt2_prms_trd_unit_conv_base_qty) return doRslt2_prms_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt2_prms_trd_unit_conv_qty) return doRslt2_prms_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt2_prms_base_unit_cd) return doRslt2_prms_base_unit_cd_VC(info);
		if (vc == columnRslt2_prms_base_unit_nm) return doRslt2_prms_base_unit_nm_VC(info);
		if (vc == columnRslt2_prms_base_unit_dec_place) return doRslt2_prms_base_unit_dec_place_VC(info);
		if (vc == columnRslt2_prms_base_unit_rnd_typ) return doRslt2_prms_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt2_gi_lg_grp_cd) return doRslt2_gi_lg_grp_cd_VC(info);
		if (vc == columnRslt2_gi_lg_grp_nm) return doRslt2_gi_lg_grp_nm_VC(info);
		if (vc == columnRslt2_gi_loc_cd) return doRslt2_gi_loc_cd_VC(info);
		if (vc == columnRslt2_gi_loc_nm) return doRslt2_gi_loc_nm_VC(info);
		if (vc == columnRslt2_gi_str_ln_cd) return doRslt2_gi_str_ln_cd_VC(info);
		if (vc == columnRslt2_gi_str_ln_nm) return doRslt2_gi_str_ln_nm_VC(info);
		if (vc == columnRslt2_gi_str_ln_cd_none_flg) return doRslt2_gi_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt2_gi_schd_dt) return doRslt2_gi_schd_dt_VC(info);
		if (vc == columnRslt2_gi_schd_hm) return doRslt2_gi_schd_hm_VC(info);
		if (vc == columnRslt2_mfg_loc_cd) return doRslt2_mfg_loc_cd_VC(info);
		if (vc == columnRslt2_mfg_loc_nm) return doRslt2_mfg_loc_nm_VC(info);
		if (vc == columnRslt2_bom_ptn) return doRslt2_bom_ptn_VC(info);
		if (vc == columnRslt2_sppl_cd) return doRslt2_sppl_cd_VC(info);
		if (vc == columnRslt2_sppl_nm) return doRslt2_sppl_nm_VC(info);
		if (vc == columnRslt2_maker_cd) return doRslt2_maker_cd_VC(info);
		if (vc == columnRslt2_maker_nm) return doRslt2_maker_nm_VC(info);
		if (vc == columnRslt2_wg_rqst_prms_rmrks) return doRslt2_wg_rqst_prms_rmrks_VC(info);
		if (vc == columnRslt2_ins_usr_id) return doRslt2_ins_usr_id_VC(info);
		if (vc == columnRslt2_ins_usr_nm) return doRslt2_ins_usr_nm_VC(info);
		if (vc == columnRslt2_ins_func_id) return doRslt2_ins_func_id_VC(info);
		if (vc == columnRslt2_ins_func_nm) return doRslt2_ins_func_nm_VC(info);
		if (vc == columnRslt2_ins_ts) return doRslt2_ins_ts_VC(info);
		if (vc == columnRslt2_upd_usr_id) return doRslt2_upd_usr_id_VC(info);
		if (vc == columnRslt2_upd_usr_nm) return doRslt2_upd_usr_nm_VC(info);
		if (vc == columnRslt2_upd_func_id) return doRslt2_upd_func_id_VC(info);
		if (vc == columnRslt2_upd_func_nm) return doRslt2_upd_func_nm_VC(info);
		if (vc == columnRslt2_upd_ts) return doRslt2_upd_ts_VC(info);
		if (vc == columnRslt2_upd_srv_req_no) return doRslt2_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[xfr_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_sts_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_sts_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_sts_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_sts_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_inst_sts_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_inst_sts_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_sts_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_sts_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_sts_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_sts_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[un_slo_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_un_slo_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_re_rqst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_re_rqst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_ntc_day_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_ntc_day_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_to_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[re_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_re_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_div_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_shrtg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_shrtg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[due_delay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_due_delay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_uncn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_uncn_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_re_rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_re_rqst_cnt_rmrks_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rqst_fr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rqst_fr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[prms_uncn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_prms_uncn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[re_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_re_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[prms_ntc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_prms_ntc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[prms_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_prms_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[re_prms_ntc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_re_prms_ntc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[re_prms_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_re_prms_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[last_wg_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_last_wg_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_fr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_fr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[re_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_re_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sublot_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt1]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gr_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gr_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[sppl_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_sppl_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_to_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_trd_unit_conv_qty_VC(MCEventInfo info){
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
	 * [Rslt1]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[bd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_bd_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt1]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_crrct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[dlv_inst_rcpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_dlv_inst_rcpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[comp_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_comp_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[spec_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_spec_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_crrct_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[rqst_can_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_rqst_can_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[prms_can_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_prms_can_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[inst_can_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_inst_can_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[act_can_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_act_can_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_re_rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_re_rqst_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt1]パネルの[wg_rqst_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt1_wg_rqst_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt2]パネルの[wg_rqst_prms_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_wg_rqst_prms_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_wg_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[fix_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_fix_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gr_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gr_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gr_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gr_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_prms_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[gi_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_gi_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_prms_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_wg_rqst_prms_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt2_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_xfr_rqst_flg) doCnd_xfr_rqst_flg_NC(info);
		else if (nc == Cnd_purc_rqst_flg) doCnd_purc_rqst_flg_NC(info);
		else if (nc == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NC(info);
		else if (nc == Cnd_rqst_sts_flg) doCnd_rqst_sts_flg_NC(info);
		else if (nc == Cnd_prms_sts_flg) doCnd_prms_sts_flg_NC(info);
		else if (nc == Cnd_part_inst_sts_flg) doCnd_part_inst_sts_flg_NC(info);
		else if (nc == Cnd_inst_sts_flg) doCnd_inst_sts_flg_NC(info);
		else if (nc == Cnd_cmpl_sts_flg) doCnd_cmpl_sts_flg_NC(info);
		else if (nc == Cnd_slo_rqst_flg) doCnd_slo_rqst_flg_NC(info);
		else if (nc == Cnd_un_slo_rqst_flg) doCnd_un_slo_rqst_flg_NC(info);
		else if (nc == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_NC(info);
		else if (nc == Cnd_rqst_dt_to) doCnd_rqst_dt_to_NC(info);
		else if (nc == Cnd_re_rqst_dt_fr) doCnd_re_rqst_dt_fr_NC(info);
		else if (nc == Cnd_re_rqst_dt_to) doCnd_re_rqst_dt_to_NC(info);
		else if (nc == Cnd_wg_rqst_ntc_day_typ) doCnd_wg_rqst_ntc_day_typ_NC(info);
		else if (nc == Cnd_wg_rqst_ntc_day_typ_nm) doCnd_wg_rqst_ntc_day_typ_nm_NC(info);
		else if (nc == Cnd_srch_dt_fr) doCnd_srch_dt_fr_NC(info);
		else if (nc == Cnd_srch_dt_to) doCnd_srch_dt_to_NC(info);
		else if (nc == Cnd_rqst_fr_wg_cd) doCnd_rqst_fr_wg_cd_NC(info);
		else if (nc == Cnd_rqst_fr_wg_nm) doCnd_rqst_fr_wg_nm_NC(info);
		else if (nc == Cnd_rqst_to_wg_cd) doCnd_rqst_to_wg_cd_NC(info);
		else if (nc == Cnd_rqst_to_wg_nm) doCnd_rqst_to_wg_nm_NC(info);
		else if (nc == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NC(info);
		else if (nc == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NC(info);
		else if (nc == Cnd_gr_site_cd) doCnd_gr_site_cd_NC(info);
		else if (nc == Cnd_gr_site_nm) doCnd_gr_site_nm_NC(info);
		else if (nc == Cnd_gr_loc_wg_cd) doCnd_gr_loc_wg_cd_NC(info);
		else if (nc == Cnd_gr_loc_wg_nm) doCnd_gr_loc_wg_nm_NC(info);
		else if (nc == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_NC(info);
		else if (nc == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_NC(info);
		else if (nc == Cnd_gr_loc_grp_cd) doCnd_gr_loc_grp_cd_NC(info);
		else if (nc == Cnd_gr_loc_grp_nm) doCnd_gr_loc_grp_nm_NC(info);
		else if (nc == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_NC(info);
		else if (nc == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_NC(info);
		else if (nc == Cnd_rqst_to_loc_cd) doCnd_rqst_to_loc_cd_NC(info);
		else if (nc == Cnd_rqst_to_loc_nm) doCnd_rqst_to_loc_nm_NC(info);
		else if (nc == Cnd_rqst_to_site_cd) doCnd_rqst_to_site_cd_NC(info);
		else if (nc == Cnd_rqst_to_site_nm) doCnd_rqst_to_site_nm_NC(info);
		else if (nc == Cnd_rqst_to_lg_grp_cd) doCnd_rqst_to_lg_grp_cd_NC(info);
		else if (nc == Cnd_rqst_to_lg_grp_nm) doCnd_rqst_to_lg_grp_nm_NC(info);
		else if (nc == Cnd_rqst_to_loc_grp_cd) doCnd_rqst_to_loc_grp_cd_NC(info);
		else if (nc == Cnd_rqst_to_loc_grp_nm) doCnd_rqst_to_loc_grp_nm_NC(info);
		else if (nc == Cnd_rqst_to_str_ln_cd) doCnd_rqst_to_str_ln_cd_NC(info);
		else if (nc == Cnd_rqst_to_str_ln_nm) doCnd_rqst_to_str_ln_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_NC(info);
		else if (nc == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_NC(info);
		else if (nc == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_NC(info);
		else if (nc == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_NC(info);
		else if (nc == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_NC(info);
		else if (nc == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_NC(info);
		else if (nc == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_NC(info);
		else if (nc == Cnd_wg_rqst_no) doCnd_wg_rqst_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_re_rqst_flg) doCnd_re_rqst_flg_NC(info);
		else if (nc == Cnd_prms_div_flg) doCnd_prms_div_flg_NC(info);
		else if (nc == Cnd_prms_shrtg_flg) doCnd_prms_shrtg_flg_NC(info);
		else if (nc == Cnd_due_delay_flg) doCnd_due_delay_flg_NC(info);
		else if (nc == Cnd_prms_uncn_flg) doCnd_prms_uncn_flg_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_NC(info);
		else if (nc == Cnd_wg_re_rqst_cnt_rmrks) doCnd_wg_re_rqst_cnt_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == BulkSet_rqst_dt) doBulkSet_rqst_dt_NC(info);
		else if (nc == BulkSet_rqst_fr_wg_cd) doBulkSet_rqst_fr_wg_cd_NC(info);
		else if (nc == BulkSet_rqst_fr_wg_nm) doBulkSet_rqst_fr_wg_nm_NC(info);
		else if (nc == columnRslt1_check) doRslt1_check_NC(info);
		else if (nc == columnRslt1_prms_uncn_flg) doRslt1_prms_uncn_flg_NC(info);
		else if (nc == columnRslt1_re_rqst_flg) doRslt1_re_rqst_flg_NC(info);
		else if (nc == columnRslt1_prms_ntc_flg) doRslt1_prms_ntc_flg_NC(info);
		else if (nc == columnRslt1_prms_dt) doRslt1_prms_dt_NC(info);
		else if (nc == columnRslt1_re_prms_ntc_flg) doRslt1_re_prms_ntc_flg_NC(info);
		else if (nc == columnRslt1_re_prms_dt) doRslt1_re_prms_dt_NC(info);
		else if (nc == columnRslt1_wg_rqst_no) doRslt1_wg_rqst_no_NC(info);
		else if (nc == columnRslt1_last_wg_rqst_no) doRslt1_last_wg_rqst_no_NC(info);
		else if (nc == columnRslt1_wg_rqst_typ) doRslt1_wg_rqst_typ_NC(info);
		else if (nc == columnRslt1_wg_rqst_typ_nm) doRslt1_wg_rqst_typ_nm_NC(info);
		else if (nc == columnRslt1_wg_rqst_sts_typ) doRslt1_wg_rqst_sts_typ_NC(info);
		else if (nc == columnRslt1_wg_rqst_sts_typ_nm) doRslt1_wg_rqst_sts_typ_nm_NC(info);
		else if (nc == columnRslt1_wg_rqst_src_typ) doRslt1_wg_rqst_src_typ_NC(info);
		else if (nc == columnRslt1_wg_rqst_src_typ_nm) doRslt1_wg_rqst_src_typ_nm_NC(info);
		else if (nc == columnRslt1_wg_rqst_src_no) doRslt1_wg_rqst_src_no_NC(info);
		else if (nc == columnRslt1_rqst_fr_wg_cd) doRslt1_rqst_fr_wg_cd_NC(info);
		else if (nc == columnRslt1_rqst_fr_wg_nm) doRslt1_rqst_fr_wg_nm_NC(info);
		else if (nc == columnRslt1_rqst_dt) doRslt1_rqst_dt_NC(info);
		else if (nc == columnRslt1_re_rqst_dt) doRslt1_re_rqst_dt_NC(info);
		else if (nc == columnRslt1_iv_itm_nm) doRslt1_iv_itm_nm_NC(info);
		else if (nc == columnRslt1_lot_mng_typ) doRslt1_lot_mng_typ_NC(info);
		else if (nc == columnRslt1_sublot_mng_typ) doRslt1_sublot_mng_typ_NC(info);
		else if (nc == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_NC(info);
		else if (nc == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_NC(info);
		else if (nc == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_NC(info);
		else if (nc == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_NC(info);
		else if (nc == columnRslt1_sundry_itm_flg) doRslt1_sundry_itm_flg_NC(info);
		else if (nc == columnRslt1_asset_mng_typ) doRslt1_asset_mng_typ_NC(info);
		else if (nc == columnRslt1_asset_mng_typ_nm) doRslt1_asset_mng_typ_nm_NC(info);
		else if (nc == columnRslt1_dscnt_itm_flg) doRslt1_dscnt_itm_flg_NC(info);
		else if (nc == columnRslt1_ver_flg) doRslt1_ver_flg_NC(info);
		else if (nc == columnRslt1_gr_loc_cd) doRslt1_gr_loc_cd_NC(info);
		else if (nc == columnRslt1_gr_loc_nm) doRslt1_gr_loc_nm_NC(info);
		else if (nc == columnRslt1_gr_str_ln_tgt_flg) doRslt1_gr_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt1_gr_loc_grp_cd) doRslt1_gr_loc_grp_cd_NC(info);
		else if (nc == columnRslt1_gr_loc_grp_nm) doRslt1_gr_loc_grp_nm_NC(info);
		else if (nc == columnRslt1_gr_lg_grp_cd) doRslt1_gr_lg_grp_cd_NC(info);
		else if (nc == columnRslt1_gr_lg_grp_nm) doRslt1_gr_lg_grp_nm_NC(info);
		else if (nc == columnRslt1_gr_loc_wg_cd) doRslt1_gr_loc_wg_cd_NC(info);
		else if (nc == columnRslt1_gr_loc_wg_nm) doRslt1_gr_loc_wg_nm_NC(info);
		else if (nc == columnRslt1_gr_site_cd) doRslt1_gr_site_cd_NC(info);
		else if (nc == columnRslt1_gr_site_nm) doRslt1_gr_site_nm_NC(info);
		else if (nc == columnRslt1_rqst_to_loc_cd) doRslt1_rqst_to_loc_cd_NC(info);
		else if (nc == columnRslt1_rqst_to_loc_nm) doRslt1_rqst_to_loc_nm_NC(info);
		else if (nc == columnRslt1_rqst_to_str_ln_tgt_flg) doRslt1_rqst_to_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt1_rqst_to_loc_grp_cd) doRslt1_rqst_to_loc_grp_cd_NC(info);
		else if (nc == columnRslt1_rqst_to_loc_grp_nm) doRslt1_rqst_to_loc_grp_nm_NC(info);
		else if (nc == columnRslt1_rqst_to_lg_grp_cd) doRslt1_rqst_to_lg_grp_cd_NC(info);
		else if (nc == columnRslt1_rqst_to_lg_grp_nm) doRslt1_rqst_to_lg_grp_nm_NC(info);
		else if (nc == columnRslt1_rqst_to_site_cd) doRslt1_rqst_to_site_cd_NC(info);
		else if (nc == columnRslt1_rqst_to_site_nm) doRslt1_rqst_to_site_nm_NC(info);
		else if (nc == columnRslt1_mfg_loc_cd) doRslt1_mfg_loc_cd_NC(info);
		else if (nc == columnRslt1_mfg_loc_nm) doRslt1_mfg_loc_nm_NC(info);
		else if (nc == columnRslt1_bom_ptn) doRslt1_bom_ptn_NC(info);
		else if (nc == columnRslt1_sppl_cd) doRslt1_sppl_cd_NC(info);
		else if (nc == columnRslt1_sppl_nm) doRslt1_sppl_nm_NC(info);
		else if (nc == columnRslt1_sppl_iv_flg) doRslt1_sppl_iv_flg_NC(info);
		else if (nc == columnRslt1_prnt_lcl_cd) doRslt1_prnt_lcl_cd_NC(info);
		else if (nc == columnRslt1_maker_cd) doRslt1_maker_cd_NC(info);
		else if (nc == columnRslt1_maker_nm) doRslt1_maker_nm_NC(info);
		else if (nc == columnRslt1_rqst_to_wg_cd) doRslt1_rqst_to_wg_cd_NC(info);
		else if (nc == columnRslt1_rqst_to_wg_nm) doRslt1_rqst_to_wg_nm_NC(info);
		else if (nc == columnRslt1_purc_rsn_cd) doRslt1_purc_rsn_cd_NC(info);
		else if (nc == columnRslt1_purc_rsn_nm) doRslt1_purc_rsn_nm_NC(info);
		else if (nc == columnRslt1_xpns_purc_flg) doRslt1_xpns_purc_flg_NC(info);
		else if (nc == columnRslt1_trd_cd) doRslt1_trd_cd_NC(info);
		else if (nc == columnRslt1_trd_nm) doRslt1_trd_nm_NC(info);
		else if (nc == columnRslt1_trd_ptn_typ) doRslt1_trd_ptn_typ_NC(info);
		else if (nc == columnRslt1_trd_unit_cd) doRslt1_trd_unit_cd_NC(info);
		else if (nc == columnRslt1_trd_unit_nm) doRslt1_trd_unit_nm_NC(info);
		else if (nc == columnRslt1_trd_unit_dec_place) doRslt1_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt1_trd_unit_rnd_typ) doRslt1_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt1_trd_unit_conv_base_qty) doRslt1_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt1_trd_unit_conv_qty) doRslt1_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_NC(info);
		else if (nc == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_NC(info);
		else if (nc == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_NC(info);
		else if (nc == columnRslt1_base_unit_rnd_typ) doRslt1_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt1_gd_cd) doRslt1_gd_cd_NC(info);
		else if (nc == columnRslt1_gd_nm) doRslt1_gd_nm_NC(info);
		else if (nc == columnRslt1_vld_dt_fr) doRslt1_vld_dt_fr_NC(info);
		else if (nc == columnRslt1_vld_dt_to) doRslt1_vld_dt_to_NC(info);
		else if (nc == columnRslt1_bd_lot_mng_typ) doRslt1_bd_lot_mng_typ_NC(info);
		else if (nc == columnRslt1_bd_sublot_mng_typ) doRslt1_bd_sublot_mng_typ_NC(info);
		else if (nc == columnRslt1_bd_lot_no_typ) doRslt1_bd_lot_no_typ_NC(info);
		else if (nc == columnRslt1_bd_sublot_no_typ) doRslt1_bd_sublot_no_typ_NC(info);
		else if (nc == columnRslt1_bd_sno1_mng_typ) doRslt1_bd_sno1_mng_typ_NC(info);
		else if (nc == columnRslt1_bd_sno2_mng_typ) doRslt1_bd_sno2_mng_typ_NC(info);
		else if (nc == columnRslt1_bd_sno3_mng_typ) doRslt1_bd_sno3_mng_typ_NC(info);
		else if (nc == columnRslt1_bd_sno4_mng_typ) doRslt1_bd_sno4_mng_typ_NC(info);
		else if (nc == columnRslt1_slo_no) doRslt1_slo_no_NC(info);
		else if (nc == columnRslt1_slo_d_no) doRslt1_slo_d_no_NC(info);
		else if (nc == columnRslt1_itm_ord_no) doRslt1_itm_ord_no_NC(info);
		else if (nc == columnRslt1_io_schd_pr_no) doRslt1_io_schd_pr_no_NC(info);
		else if (nc == columnRslt1_rqst_crrct_flg) doRslt1_rqst_crrct_flg_NC(info);
		else if (nc == columnRslt1_dlv_inst_rcpt_flg) doRslt1_dlv_inst_rcpt_flg_NC(info);
		else if (nc == columnRslt1_can_flg) doRslt1_can_flg_NC(info);
		else if (nc == columnRslt1_comp_cng_flg) doRslt1_comp_cng_flg_NC(info);
		else if (nc == columnRslt1_spec_cng_flg) doRslt1_spec_cng_flg_NC(info);
		else if (nc == columnRslt1_rqst_crrct_dt) doRslt1_rqst_crrct_dt_NC(info);
		else if (nc == columnRslt1_rqst_can_dt) doRslt1_rqst_can_dt_NC(info);
		else if (nc == columnRslt1_prms_can_dt) doRslt1_prms_can_dt_NC(info);
		else if (nc == columnRslt1_inst_dt) doRslt1_inst_dt_NC(info);
		else if (nc == columnRslt1_inst_can_dt) doRslt1_inst_can_dt_NC(info);
		else if (nc == columnRslt1_act_dt) doRslt1_act_dt_NC(info);
		else if (nc == columnRslt1_act_can_dt) doRslt1_act_can_dt_NC(info);
		else if (nc == columnRslt1_wg_rqst_cnt_rmrks) doRslt1_wg_rqst_cnt_rmrks_NC(info);
		else if (nc == columnRslt1_wg_re_rqst_cnt_rmrks) doRslt1_wg_re_rqst_cnt_rmrks_NC(info);
		else if (nc == columnRslt1_wg_rqst_intr_rmrks) doRslt1_wg_rqst_intr_rmrks_NC(info);
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
		else if (nc == columnRslt1_wg_rqst_upd_cntr) doRslt1_wg_rqst_upd_cntr_NC(info);
		else if (nc == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_NC(info);
		else if (nc == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_NC(info);
		else if (nc == columnRslt1_upd_func_id) doRslt1_upd_func_id_NC(info);
		else if (nc == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_NC(info);
		else if (nc == columnRslt1_upd_ts) doRslt1_upd_ts_NC(info);
		else if (nc == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_NC(info);
		else if (nc == columnRslt2_wg_rqst_prms_no) doRslt2_wg_rqst_prms_no_NC(info);
		else if (nc == columnRslt2_wg_rqst_no) doRslt2_wg_rqst_no_NC(info);
		else if (nc == columnRslt2_can_flg) doRslt2_can_flg_NC(info);
		else if (nc == columnRslt2_fix_flg) doRslt2_fix_flg_NC(info);
		else if (nc == columnRslt2_fix_dt) doRslt2_fix_dt_NC(info);
		else if (nc == columnRslt2_gr_schd_dt) doRslt2_gr_schd_dt_NC(info);
		else if (nc == columnRslt2_gr_schd_hm) doRslt2_gr_schd_hm_NC(info);
		else if (nc == columnRslt2_prms_trd_unit_cd) doRslt2_prms_trd_unit_cd_NC(info);
		else if (nc == columnRslt2_prms_trd_unit_nm) doRslt2_prms_trd_unit_nm_NC(info);
		else if (nc == columnRslt2_prms_trd_unit_dec_place) doRslt2_prms_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt2_prms_trd_unit_conv_base_qty) doRslt2_prms_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt2_prms_trd_unit_conv_qty) doRslt2_prms_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt2_prms_base_unit_cd) doRslt2_prms_base_unit_cd_NC(info);
		else if (nc == columnRslt2_prms_base_unit_nm) doRslt2_prms_base_unit_nm_NC(info);
		else if (nc == columnRslt2_prms_base_unit_dec_place) doRslt2_prms_base_unit_dec_place_NC(info);
		else if (nc == columnRslt2_prms_base_unit_rnd_typ) doRslt2_prms_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt2_gi_lg_grp_cd) doRslt2_gi_lg_grp_cd_NC(info);
		else if (nc == columnRslt2_gi_lg_grp_nm) doRslt2_gi_lg_grp_nm_NC(info);
		else if (nc == columnRslt2_gi_loc_cd) doRslt2_gi_loc_cd_NC(info);
		else if (nc == columnRslt2_gi_loc_nm) doRslt2_gi_loc_nm_NC(info);
		else if (nc == columnRslt2_gi_str_ln_cd) doRslt2_gi_str_ln_cd_NC(info);
		else if (nc == columnRslt2_gi_str_ln_nm) doRslt2_gi_str_ln_nm_NC(info);
		else if (nc == columnRslt2_gi_str_ln_cd_none_flg) doRslt2_gi_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt2_gi_schd_dt) doRslt2_gi_schd_dt_NC(info);
		else if (nc == columnRslt2_gi_schd_hm) doRslt2_gi_schd_hm_NC(info);
		else if (nc == columnRslt2_mfg_loc_cd) doRslt2_mfg_loc_cd_NC(info);
		else if (nc == columnRslt2_mfg_loc_nm) doRslt2_mfg_loc_nm_NC(info);
		else if (nc == columnRslt2_bom_ptn) doRslt2_bom_ptn_NC(info);
		else if (nc == columnRslt2_sppl_cd) doRslt2_sppl_cd_NC(info);
		else if (nc == columnRslt2_sppl_nm) doRslt2_sppl_nm_NC(info);
		else if (nc == columnRslt2_maker_cd) doRslt2_maker_cd_NC(info);
		else if (nc == columnRslt2_maker_nm) doRslt2_maker_nm_NC(info);
		else if (nc == columnRslt2_wg_rqst_prms_rmrks) doRslt2_wg_rqst_prms_rmrks_NC(info);
		else if (nc == columnRslt2_ins_usr_id) doRslt2_ins_usr_id_NC(info);
		else if (nc == columnRslt2_ins_usr_nm) doRslt2_ins_usr_nm_NC(info);
		else if (nc == columnRslt2_ins_func_id) doRslt2_ins_func_id_NC(info);
		else if (nc == columnRslt2_ins_func_nm) doRslt2_ins_func_nm_NC(info);
		else if (nc == columnRslt2_ins_ts) doRslt2_ins_ts_NC(info);
		else if (nc == columnRslt2_upd_usr_id) doRslt2_upd_usr_id_NC(info);
		else if (nc == columnRslt2_upd_usr_nm) doRslt2_upd_usr_nm_NC(info);
		else if (nc == columnRslt2_upd_func_id) doRslt2_upd_func_id_NC(info);
		else if (nc == columnRslt2_upd_func_nm) doRslt2_upd_func_nm_NC(info);
		else if (nc == columnRslt2_upd_ts) doRslt2_upd_ts_NC(info);
		else if (nc == columnRslt2_upd_srv_req_no) doRslt2_upd_srv_req_no_NC(info);
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
	 * [Cnd]パネルの[xfr_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_sts_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_sts_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_sts_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_sts_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_sts_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_sts_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sts_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sts_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_sts_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_sts_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[un_slo_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_un_slo_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[re_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_div_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_shrtg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_shrtg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_delay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_delay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_uncn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_uncn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_re_rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_re_rqst_cnt_rmrks_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_uncn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_uncn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_ntc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_ntc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_ntc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_ntc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[last_wg_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_last_wg_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sublot_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt1]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_qty_NC(MCEventInfo info){
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
	 * [Rslt1]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno4_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt1]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_inst_rcpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_inst_rcpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[comp_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_comp_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spec_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spec_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_can_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_can_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_can_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_can_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_can_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_can_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_can_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_can_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_re_rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_re_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt1]パネルの[wg_rqst_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt2]パネルの[wg_rqst_prms_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_prms_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_xfr_rqst_flg) doCnd_xfr_rqst_flg_NE(info);
		else if (ne == Cnd_purc_rqst_flg) doCnd_purc_rqst_flg_NE(info);
		else if (ne == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NE(info);
		else if (ne == Cnd_rqst_sts_flg) doCnd_rqst_sts_flg_NE(info);
		else if (ne == Cnd_prms_sts_flg) doCnd_prms_sts_flg_NE(info);
		else if (ne == Cnd_part_inst_sts_flg) doCnd_part_inst_sts_flg_NE(info);
		else if (ne == Cnd_inst_sts_flg) doCnd_inst_sts_flg_NE(info);
		else if (ne == Cnd_cmpl_sts_flg) doCnd_cmpl_sts_flg_NE(info);
		else if (ne == Cnd_slo_rqst_flg) doCnd_slo_rqst_flg_NE(info);
		else if (ne == Cnd_un_slo_rqst_flg) doCnd_un_slo_rqst_flg_NE(info);
		else if (ne == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_NE(info);
		else if (ne == Cnd_rqst_dt_to) doCnd_rqst_dt_to_NE(info);
		else if (ne == Cnd_re_rqst_dt_fr) doCnd_re_rqst_dt_fr_NE(info);
		else if (ne == Cnd_re_rqst_dt_to) doCnd_re_rqst_dt_to_NE(info);
		else if (ne == Cnd_wg_rqst_ntc_day_typ) doCnd_wg_rqst_ntc_day_typ_NE(info);
		else if (ne == Cnd_wg_rqst_ntc_day_typ_nm) doCnd_wg_rqst_ntc_day_typ_nm_NE(info);
		else if (ne == Cnd_srch_dt_fr) doCnd_srch_dt_fr_NE(info);
		else if (ne == Cnd_srch_dt_to) doCnd_srch_dt_to_NE(info);
		else if (ne == Cnd_rqst_fr_wg_cd) doCnd_rqst_fr_wg_cd_NE(info);
		else if (ne == Cnd_rqst_fr_wg_nm) doCnd_rqst_fr_wg_nm_NE(info);
		else if (ne == Cnd_rqst_to_wg_cd) doCnd_rqst_to_wg_cd_NE(info);
		else if (ne == Cnd_rqst_to_wg_nm) doCnd_rqst_to_wg_nm_NE(info);
		else if (ne == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NE(info);
		else if (ne == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NE(info);
		else if (ne == Cnd_gr_site_cd) doCnd_gr_site_cd_NE(info);
		else if (ne == Cnd_gr_site_nm) doCnd_gr_site_nm_NE(info);
		else if (ne == Cnd_gr_loc_wg_cd) doCnd_gr_loc_wg_cd_NE(info);
		else if (ne == Cnd_gr_loc_wg_nm) doCnd_gr_loc_wg_nm_NE(info);
		else if (ne == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_NE(info);
		else if (ne == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_NE(info);
		else if (ne == Cnd_gr_loc_grp_cd) doCnd_gr_loc_grp_cd_NE(info);
		else if (ne == Cnd_gr_loc_grp_nm) doCnd_gr_loc_grp_nm_NE(info);
		else if (ne == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_NE(info);
		else if (ne == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_NE(info);
		else if (ne == Cnd_rqst_to_loc_cd) doCnd_rqst_to_loc_cd_NE(info);
		else if (ne == Cnd_rqst_to_loc_nm) doCnd_rqst_to_loc_nm_NE(info);
		else if (ne == Cnd_rqst_to_site_cd) doCnd_rqst_to_site_cd_NE(info);
		else if (ne == Cnd_rqst_to_site_nm) doCnd_rqst_to_site_nm_NE(info);
		else if (ne == Cnd_rqst_to_lg_grp_cd) doCnd_rqst_to_lg_grp_cd_NE(info);
		else if (ne == Cnd_rqst_to_lg_grp_nm) doCnd_rqst_to_lg_grp_nm_NE(info);
		else if (ne == Cnd_rqst_to_loc_grp_cd) doCnd_rqst_to_loc_grp_cd_NE(info);
		else if (ne == Cnd_rqst_to_loc_grp_nm) doCnd_rqst_to_loc_grp_nm_NE(info);
		else if (ne == Cnd_rqst_to_str_ln_cd) doCnd_rqst_to_str_ln_cd_NE(info);
		else if (ne == Cnd_rqst_to_str_ln_nm) doCnd_rqst_to_str_ln_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_NE(info);
		else if (ne == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_NE(info);
		else if (ne == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_NE(info);
		else if (ne == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_NE(info);
		else if (ne == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_NE(info);
		else if (ne == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_NE(info);
		else if (ne == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_NE(info);
		else if (ne == Cnd_wg_rqst_no) doCnd_wg_rqst_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_re_rqst_flg) doCnd_re_rqst_flg_NE(info);
		else if (ne == Cnd_prms_div_flg) doCnd_prms_div_flg_NE(info);
		else if (ne == Cnd_prms_shrtg_flg) doCnd_prms_shrtg_flg_NE(info);
		else if (ne == Cnd_due_delay_flg) doCnd_due_delay_flg_NE(info);
		else if (ne == Cnd_prms_uncn_flg) doCnd_prms_uncn_flg_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_NE(info);
		else if (ne == Cnd_wg_re_rqst_cnt_rmrks) doCnd_wg_re_rqst_cnt_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == BulkSet_rqst_dt) doBulkSet_rqst_dt_NE(info);
		else if (ne == BulkSet_rqst_fr_wg_cd) doBulkSet_rqst_fr_wg_cd_NE(info);
		else if (ne == BulkSet_rqst_fr_wg_nm) doBulkSet_rqst_fr_wg_nm_NE(info);
		else if (ne == columnRslt1_check) doRslt1_check_NE(info);
		else if (ne == columnRslt1_prms_uncn_flg) doRslt1_prms_uncn_flg_NE(info);
		else if (ne == columnRslt1_re_rqst_flg) doRslt1_re_rqst_flg_NE(info);
		else if (ne == columnRslt1_prms_ntc_flg) doRslt1_prms_ntc_flg_NE(info);
		else if (ne == columnRslt1_prms_dt) doRslt1_prms_dt_NE(info);
		else if (ne == columnRslt1_re_prms_ntc_flg) doRslt1_re_prms_ntc_flg_NE(info);
		else if (ne == columnRslt1_re_prms_dt) doRslt1_re_prms_dt_NE(info);
		else if (ne == columnRslt1_wg_rqst_no) doRslt1_wg_rqst_no_NE(info);
		else if (ne == columnRslt1_last_wg_rqst_no) doRslt1_last_wg_rqst_no_NE(info);
		else if (ne == columnRslt1_wg_rqst_typ) doRslt1_wg_rqst_typ_NE(info);
		else if (ne == columnRslt1_wg_rqst_typ_nm) doRslt1_wg_rqst_typ_nm_NE(info);
		else if (ne == columnRslt1_wg_rqst_sts_typ) doRslt1_wg_rqst_sts_typ_NE(info);
		else if (ne == columnRslt1_wg_rqst_sts_typ_nm) doRslt1_wg_rqst_sts_typ_nm_NE(info);
		else if (ne == columnRslt1_wg_rqst_src_typ) doRslt1_wg_rqst_src_typ_NE(info);
		else if (ne == columnRslt1_wg_rqst_src_typ_nm) doRslt1_wg_rqst_src_typ_nm_NE(info);
		else if (ne == columnRslt1_wg_rqst_src_no) doRslt1_wg_rqst_src_no_NE(info);
		else if (ne == columnRslt1_rqst_fr_wg_cd) doRslt1_rqst_fr_wg_cd_NE(info);
		else if (ne == columnRslt1_rqst_fr_wg_nm) doRslt1_rqst_fr_wg_nm_NE(info);
		else if (ne == columnRslt1_rqst_dt) doRslt1_rqst_dt_NE(info);
		else if (ne == columnRslt1_re_rqst_dt) doRslt1_re_rqst_dt_NE(info);
		else if (ne == columnRslt1_iv_itm_nm) doRslt1_iv_itm_nm_NE(info);
		else if (ne == columnRslt1_lot_mng_typ) doRslt1_lot_mng_typ_NE(info);
		else if (ne == columnRslt1_sublot_mng_typ) doRslt1_sublot_mng_typ_NE(info);
		else if (ne == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_NE(info);
		else if (ne == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_NE(info);
		else if (ne == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_NE(info);
		else if (ne == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_NE(info);
		else if (ne == columnRslt1_sundry_itm_flg) doRslt1_sundry_itm_flg_NE(info);
		else if (ne == columnRslt1_asset_mng_typ) doRslt1_asset_mng_typ_NE(info);
		else if (ne == columnRslt1_asset_mng_typ_nm) doRslt1_asset_mng_typ_nm_NE(info);
		else if (ne == columnRslt1_dscnt_itm_flg) doRslt1_dscnt_itm_flg_NE(info);
		else if (ne == columnRslt1_ver_flg) doRslt1_ver_flg_NE(info);
		else if (ne == columnRslt1_gr_loc_cd) doRslt1_gr_loc_cd_NE(info);
		else if (ne == columnRslt1_gr_loc_nm) doRslt1_gr_loc_nm_NE(info);
		else if (ne == columnRslt1_gr_str_ln_tgt_flg) doRslt1_gr_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt1_gr_loc_grp_cd) doRslt1_gr_loc_grp_cd_NE(info);
		else if (ne == columnRslt1_gr_loc_grp_nm) doRslt1_gr_loc_grp_nm_NE(info);
		else if (ne == columnRslt1_gr_lg_grp_cd) doRslt1_gr_lg_grp_cd_NE(info);
		else if (ne == columnRslt1_gr_lg_grp_nm) doRslt1_gr_lg_grp_nm_NE(info);
		else if (ne == columnRslt1_gr_loc_wg_cd) doRslt1_gr_loc_wg_cd_NE(info);
		else if (ne == columnRslt1_gr_loc_wg_nm) doRslt1_gr_loc_wg_nm_NE(info);
		else if (ne == columnRslt1_gr_site_cd) doRslt1_gr_site_cd_NE(info);
		else if (ne == columnRslt1_gr_site_nm) doRslt1_gr_site_nm_NE(info);
		else if (ne == columnRslt1_rqst_to_loc_cd) doRslt1_rqst_to_loc_cd_NE(info);
		else if (ne == columnRslt1_rqst_to_loc_nm) doRslt1_rqst_to_loc_nm_NE(info);
		else if (ne == columnRslt1_rqst_to_str_ln_tgt_flg) doRslt1_rqst_to_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt1_rqst_to_loc_grp_cd) doRslt1_rqst_to_loc_grp_cd_NE(info);
		else if (ne == columnRslt1_rqst_to_loc_grp_nm) doRslt1_rqst_to_loc_grp_nm_NE(info);
		else if (ne == columnRslt1_rqst_to_lg_grp_cd) doRslt1_rqst_to_lg_grp_cd_NE(info);
		else if (ne == columnRslt1_rqst_to_lg_grp_nm) doRslt1_rqst_to_lg_grp_nm_NE(info);
		else if (ne == columnRslt1_rqst_to_site_cd) doRslt1_rqst_to_site_cd_NE(info);
		else if (ne == columnRslt1_rqst_to_site_nm) doRslt1_rqst_to_site_nm_NE(info);
		else if (ne == columnRslt1_mfg_loc_cd) doRslt1_mfg_loc_cd_NE(info);
		else if (ne == columnRslt1_mfg_loc_nm) doRslt1_mfg_loc_nm_NE(info);
		else if (ne == columnRslt1_bom_ptn) doRslt1_bom_ptn_NE(info);
		else if (ne == columnRslt1_sppl_cd) doRslt1_sppl_cd_NE(info);
		else if (ne == columnRslt1_sppl_nm) doRslt1_sppl_nm_NE(info);
		else if (ne == columnRslt1_sppl_iv_flg) doRslt1_sppl_iv_flg_NE(info);
		else if (ne == columnRslt1_prnt_lcl_cd) doRslt1_prnt_lcl_cd_NE(info);
		else if (ne == columnRslt1_maker_cd) doRslt1_maker_cd_NE(info);
		else if (ne == columnRslt1_maker_nm) doRslt1_maker_nm_NE(info);
		else if (ne == columnRslt1_rqst_to_wg_cd) doRslt1_rqst_to_wg_cd_NE(info);
		else if (ne == columnRslt1_rqst_to_wg_nm) doRslt1_rqst_to_wg_nm_NE(info);
		else if (ne == columnRslt1_purc_rsn_cd) doRslt1_purc_rsn_cd_NE(info);
		else if (ne == columnRslt1_purc_rsn_nm) doRslt1_purc_rsn_nm_NE(info);
		else if (ne == columnRslt1_xpns_purc_flg) doRslt1_xpns_purc_flg_NE(info);
		else if (ne == columnRslt1_trd_cd) doRslt1_trd_cd_NE(info);
		else if (ne == columnRslt1_trd_nm) doRslt1_trd_nm_NE(info);
		else if (ne == columnRslt1_trd_ptn_typ) doRslt1_trd_ptn_typ_NE(info);
		else if (ne == columnRslt1_trd_unit_cd) doRslt1_trd_unit_cd_NE(info);
		else if (ne == columnRslt1_trd_unit_nm) doRslt1_trd_unit_nm_NE(info);
		else if (ne == columnRslt1_trd_unit_dec_place) doRslt1_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt1_trd_unit_rnd_typ) doRslt1_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt1_trd_unit_conv_base_qty) doRslt1_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt1_trd_unit_conv_qty) doRslt1_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_NE(info);
		else if (ne == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_NE(info);
		else if (ne == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_NE(info);
		else if (ne == columnRslt1_base_unit_rnd_typ) doRslt1_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt1_gd_cd) doRslt1_gd_cd_NE(info);
		else if (ne == columnRslt1_gd_nm) doRslt1_gd_nm_NE(info);
		else if (ne == columnRslt1_vld_dt_fr) doRslt1_vld_dt_fr_NE(info);
		else if (ne == columnRslt1_vld_dt_to) doRslt1_vld_dt_to_NE(info);
		else if (ne == columnRslt1_bd_lot_mng_typ) doRslt1_bd_lot_mng_typ_NE(info);
		else if (ne == columnRslt1_bd_sublot_mng_typ) doRslt1_bd_sublot_mng_typ_NE(info);
		else if (ne == columnRslt1_bd_lot_no_typ) doRslt1_bd_lot_no_typ_NE(info);
		else if (ne == columnRslt1_bd_sublot_no_typ) doRslt1_bd_sublot_no_typ_NE(info);
		else if (ne == columnRslt1_bd_sno1_mng_typ) doRslt1_bd_sno1_mng_typ_NE(info);
		else if (ne == columnRslt1_bd_sno2_mng_typ) doRslt1_bd_sno2_mng_typ_NE(info);
		else if (ne == columnRslt1_bd_sno3_mng_typ) doRslt1_bd_sno3_mng_typ_NE(info);
		else if (ne == columnRslt1_bd_sno4_mng_typ) doRslt1_bd_sno4_mng_typ_NE(info);
		else if (ne == columnRslt1_slo_no) doRslt1_slo_no_NE(info);
		else if (ne == columnRslt1_slo_d_no) doRslt1_slo_d_no_NE(info);
		else if (ne == columnRslt1_itm_ord_no) doRslt1_itm_ord_no_NE(info);
		else if (ne == columnRslt1_io_schd_pr_no) doRslt1_io_schd_pr_no_NE(info);
		else if (ne == columnRslt1_rqst_crrct_flg) doRslt1_rqst_crrct_flg_NE(info);
		else if (ne == columnRslt1_dlv_inst_rcpt_flg) doRslt1_dlv_inst_rcpt_flg_NE(info);
		else if (ne == columnRslt1_can_flg) doRslt1_can_flg_NE(info);
		else if (ne == columnRslt1_comp_cng_flg) doRslt1_comp_cng_flg_NE(info);
		else if (ne == columnRslt1_spec_cng_flg) doRslt1_spec_cng_flg_NE(info);
		else if (ne == columnRslt1_rqst_crrct_dt) doRslt1_rqst_crrct_dt_NE(info);
		else if (ne == columnRslt1_rqst_can_dt) doRslt1_rqst_can_dt_NE(info);
		else if (ne == columnRslt1_prms_can_dt) doRslt1_prms_can_dt_NE(info);
		else if (ne == columnRslt1_inst_dt) doRslt1_inst_dt_NE(info);
		else if (ne == columnRslt1_inst_can_dt) doRslt1_inst_can_dt_NE(info);
		else if (ne == columnRslt1_act_dt) doRslt1_act_dt_NE(info);
		else if (ne == columnRslt1_act_can_dt) doRslt1_act_can_dt_NE(info);
		else if (ne == columnRslt1_wg_rqst_cnt_rmrks) doRslt1_wg_rqst_cnt_rmrks_NE(info);
		else if (ne == columnRslt1_wg_re_rqst_cnt_rmrks) doRslt1_wg_re_rqst_cnt_rmrks_NE(info);
		else if (ne == columnRslt1_wg_rqst_intr_rmrks) doRslt1_wg_rqst_intr_rmrks_NE(info);
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
		else if (ne == columnRslt1_wg_rqst_upd_cntr) doRslt1_wg_rqst_upd_cntr_NE(info);
		else if (ne == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_NE(info);
		else if (ne == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_NE(info);
		else if (ne == columnRslt1_upd_func_id) doRslt1_upd_func_id_NE(info);
		else if (ne == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_NE(info);
		else if (ne == columnRslt1_upd_ts) doRslt1_upd_ts_NE(info);
		else if (ne == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_NE(info);
		else if (ne == columnRslt2_wg_rqst_prms_no) doRslt2_wg_rqst_prms_no_NE(info);
		else if (ne == columnRslt2_wg_rqst_no) doRslt2_wg_rqst_no_NE(info);
		else if (ne == columnRslt2_can_flg) doRslt2_can_flg_NE(info);
		else if (ne == columnRslt2_fix_flg) doRslt2_fix_flg_NE(info);
		else if (ne == columnRslt2_fix_dt) doRslt2_fix_dt_NE(info);
		else if (ne == columnRslt2_gr_schd_dt) doRslt2_gr_schd_dt_NE(info);
		else if (ne == columnRslt2_gr_schd_hm) doRslt2_gr_schd_hm_NE(info);
		else if (ne == columnRslt2_prms_trd_unit_cd) doRslt2_prms_trd_unit_cd_NE(info);
		else if (ne == columnRslt2_prms_trd_unit_nm) doRslt2_prms_trd_unit_nm_NE(info);
		else if (ne == columnRslt2_prms_trd_unit_dec_place) doRslt2_prms_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt2_prms_trd_unit_conv_base_qty) doRslt2_prms_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt2_prms_trd_unit_conv_qty) doRslt2_prms_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt2_prms_base_unit_cd) doRslt2_prms_base_unit_cd_NE(info);
		else if (ne == columnRslt2_prms_base_unit_nm) doRslt2_prms_base_unit_nm_NE(info);
		else if (ne == columnRslt2_prms_base_unit_dec_place) doRslt2_prms_base_unit_dec_place_NE(info);
		else if (ne == columnRslt2_prms_base_unit_rnd_typ) doRslt2_prms_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt2_gi_lg_grp_cd) doRslt2_gi_lg_grp_cd_NE(info);
		else if (ne == columnRslt2_gi_lg_grp_nm) doRslt2_gi_lg_grp_nm_NE(info);
		else if (ne == columnRslt2_gi_loc_cd) doRslt2_gi_loc_cd_NE(info);
		else if (ne == columnRslt2_gi_loc_nm) doRslt2_gi_loc_nm_NE(info);
		else if (ne == columnRslt2_gi_str_ln_cd) doRslt2_gi_str_ln_cd_NE(info);
		else if (ne == columnRslt2_gi_str_ln_nm) doRslt2_gi_str_ln_nm_NE(info);
		else if (ne == columnRslt2_gi_str_ln_cd_none_flg) doRslt2_gi_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt2_gi_schd_dt) doRslt2_gi_schd_dt_NE(info);
		else if (ne == columnRslt2_gi_schd_hm) doRslt2_gi_schd_hm_NE(info);
		else if (ne == columnRslt2_mfg_loc_cd) doRslt2_mfg_loc_cd_NE(info);
		else if (ne == columnRslt2_mfg_loc_nm) doRslt2_mfg_loc_nm_NE(info);
		else if (ne == columnRslt2_bom_ptn) doRslt2_bom_ptn_NE(info);
		else if (ne == columnRslt2_sppl_cd) doRslt2_sppl_cd_NE(info);
		else if (ne == columnRslt2_sppl_nm) doRslt2_sppl_nm_NE(info);
		else if (ne == columnRslt2_maker_cd) doRslt2_maker_cd_NE(info);
		else if (ne == columnRslt2_maker_nm) doRslt2_maker_nm_NE(info);
		else if (ne == columnRslt2_wg_rqst_prms_rmrks) doRslt2_wg_rqst_prms_rmrks_NE(info);
		else if (ne == columnRslt2_ins_usr_id) doRslt2_ins_usr_id_NE(info);
		else if (ne == columnRslt2_ins_usr_nm) doRslt2_ins_usr_nm_NE(info);
		else if (ne == columnRslt2_ins_func_id) doRslt2_ins_func_id_NE(info);
		else if (ne == columnRslt2_ins_func_nm) doRslt2_ins_func_nm_NE(info);
		else if (ne == columnRslt2_ins_ts) doRslt2_ins_ts_NE(info);
		else if (ne == columnRslt2_upd_usr_id) doRslt2_upd_usr_id_NE(info);
		else if (ne == columnRslt2_upd_usr_nm) doRslt2_upd_usr_nm_NE(info);
		else if (ne == columnRslt2_upd_func_id) doRslt2_upd_func_id_NE(info);
		else if (ne == columnRslt2_upd_func_nm) doRslt2_upd_func_nm_NE(info);
		else if (ne == columnRslt2_upd_ts) doRslt2_upd_ts_NE(info);
		else if (ne == columnRslt2_upd_srv_req_no) doRslt2_upd_srv_req_no_NE(info);
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
	 * [Cnd]パネルの[xfr_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_sts_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_sts_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_sts_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_sts_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_sts_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_sts_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sts_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sts_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_sts_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_sts_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[un_slo_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_un_slo_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[re_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_div_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_shrtg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_shrtg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_delay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_delay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_uncn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_uncn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_re_rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_re_rqst_cnt_rmrks_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_uncn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_uncn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_ntc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_ntc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_ntc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_ntc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[last_wg_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_last_wg_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sublot_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt1]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_qty_NE(MCEventInfo info){
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
	 * [Rslt1]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno4_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt1]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_inst_rcpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_inst_rcpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[comp_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_comp_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spec_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spec_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_can_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_can_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_can_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_can_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_can_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_can_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_can_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_can_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_re_rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_re_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt1]パネルの[wg_rqst_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt2]パネルの[wg_rqst_prms_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_prms_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_xfr_rqst_flg) doCnd_xfr_rqst_flg_NX(info);
		else if (nx == Cnd_purc_rqst_flg) doCnd_purc_rqst_flg_NX(info);
		else if (nx == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NX(info);
		else if (nx == Cnd_rqst_sts_flg) doCnd_rqst_sts_flg_NX(info);
		else if (nx == Cnd_prms_sts_flg) doCnd_prms_sts_flg_NX(info);
		else if (nx == Cnd_part_inst_sts_flg) doCnd_part_inst_sts_flg_NX(info);
		else if (nx == Cnd_inst_sts_flg) doCnd_inst_sts_flg_NX(info);
		else if (nx == Cnd_cmpl_sts_flg) doCnd_cmpl_sts_flg_NX(info);
		else if (nx == Cnd_slo_rqst_flg) doCnd_slo_rqst_flg_NX(info);
		else if (nx == Cnd_un_slo_rqst_flg) doCnd_un_slo_rqst_flg_NX(info);
		else if (nx == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_NX(info);
		else if (nx == Cnd_rqst_dt_to) doCnd_rqst_dt_to_NX(info);
		else if (nx == Cnd_re_rqst_dt_fr) doCnd_re_rqst_dt_fr_NX(info);
		else if (nx == Cnd_re_rqst_dt_to) doCnd_re_rqst_dt_to_NX(info);
		else if (nx == Cnd_wg_rqst_ntc_day_typ) doCnd_wg_rqst_ntc_day_typ_NX(info);
		else if (nx == Cnd_wg_rqst_ntc_day_typ_nm) doCnd_wg_rqst_ntc_day_typ_nm_NX(info);
		else if (nx == Cnd_srch_dt_fr) doCnd_srch_dt_fr_NX(info);
		else if (nx == Cnd_srch_dt_to) doCnd_srch_dt_to_NX(info);
		else if (nx == Cnd_rqst_fr_wg_cd) doCnd_rqst_fr_wg_cd_NX(info);
		else if (nx == Cnd_rqst_fr_wg_nm) doCnd_rqst_fr_wg_nm_NX(info);
		else if (nx == Cnd_rqst_to_wg_cd) doCnd_rqst_to_wg_cd_NX(info);
		else if (nx == Cnd_rqst_to_wg_nm) doCnd_rqst_to_wg_nm_NX(info);
		else if (nx == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NX(info);
		else if (nx == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NX(info);
		else if (nx == Cnd_gr_site_cd) doCnd_gr_site_cd_NX(info);
		else if (nx == Cnd_gr_site_nm) doCnd_gr_site_nm_NX(info);
		else if (nx == Cnd_gr_loc_wg_cd) doCnd_gr_loc_wg_cd_NX(info);
		else if (nx == Cnd_gr_loc_wg_nm) doCnd_gr_loc_wg_nm_NX(info);
		else if (nx == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_NX(info);
		else if (nx == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_NX(info);
		else if (nx == Cnd_gr_loc_grp_cd) doCnd_gr_loc_grp_cd_NX(info);
		else if (nx == Cnd_gr_loc_grp_nm) doCnd_gr_loc_grp_nm_NX(info);
		else if (nx == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_NX(info);
		else if (nx == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_NX(info);
		else if (nx == Cnd_rqst_to_loc_cd) doCnd_rqst_to_loc_cd_NX(info);
		else if (nx == Cnd_rqst_to_loc_nm) doCnd_rqst_to_loc_nm_NX(info);
		else if (nx == Cnd_rqst_to_site_cd) doCnd_rqst_to_site_cd_NX(info);
		else if (nx == Cnd_rqst_to_site_nm) doCnd_rqst_to_site_nm_NX(info);
		else if (nx == Cnd_rqst_to_lg_grp_cd) doCnd_rqst_to_lg_grp_cd_NX(info);
		else if (nx == Cnd_rqst_to_lg_grp_nm) doCnd_rqst_to_lg_grp_nm_NX(info);
		else if (nx == Cnd_rqst_to_loc_grp_cd) doCnd_rqst_to_loc_grp_cd_NX(info);
		else if (nx == Cnd_rqst_to_loc_grp_nm) doCnd_rqst_to_loc_grp_nm_NX(info);
		else if (nx == Cnd_rqst_to_str_ln_cd) doCnd_rqst_to_str_ln_cd_NX(info);
		else if (nx == Cnd_rqst_to_str_ln_nm) doCnd_rqst_to_str_ln_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_NX(info);
		else if (nx == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_NX(info);
		else if (nx == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_NX(info);
		else if (nx == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_NX(info);
		else if (nx == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_NX(info);
		else if (nx == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_NX(info);
		else if (nx == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_NX(info);
		else if (nx == Cnd_wg_rqst_no) doCnd_wg_rqst_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_re_rqst_flg) doCnd_re_rqst_flg_NX(info);
		else if (nx == Cnd_prms_div_flg) doCnd_prms_div_flg_NX(info);
		else if (nx == Cnd_prms_shrtg_flg) doCnd_prms_shrtg_flg_NX(info);
		else if (nx == Cnd_due_delay_flg) doCnd_due_delay_flg_NX(info);
		else if (nx == Cnd_prms_uncn_flg) doCnd_prms_uncn_flg_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_NX(info);
		else if (nx == Cnd_wg_re_rqst_cnt_rmrks) doCnd_wg_re_rqst_cnt_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == BulkSet_rqst_dt) doBulkSet_rqst_dt_NX(info);
		else if (nx == BulkSet_rqst_fr_wg_cd) doBulkSet_rqst_fr_wg_cd_NX(info);
		else if (nx == BulkSet_rqst_fr_wg_nm) doBulkSet_rqst_fr_wg_nm_NX(info);
		else if (nx == columnRslt1_check) doRslt1_check_NX(info);
		else if (nx == columnRslt1_prms_uncn_flg) doRslt1_prms_uncn_flg_NX(info);
		else if (nx == columnRslt1_re_rqst_flg) doRslt1_re_rqst_flg_NX(info);
		else if (nx == columnRslt1_prms_ntc_flg) doRslt1_prms_ntc_flg_NX(info);
		else if (nx == columnRslt1_prms_dt) doRslt1_prms_dt_NX(info);
		else if (nx == columnRslt1_re_prms_ntc_flg) doRslt1_re_prms_ntc_flg_NX(info);
		else if (nx == columnRslt1_re_prms_dt) doRslt1_re_prms_dt_NX(info);
		else if (nx == columnRslt1_wg_rqst_no) doRslt1_wg_rqst_no_NX(info);
		else if (nx == columnRslt1_last_wg_rqst_no) doRslt1_last_wg_rqst_no_NX(info);
		else if (nx == columnRslt1_wg_rqst_typ) doRslt1_wg_rqst_typ_NX(info);
		else if (nx == columnRslt1_wg_rqst_typ_nm) doRslt1_wg_rqst_typ_nm_NX(info);
		else if (nx == columnRslt1_wg_rqst_sts_typ) doRslt1_wg_rqst_sts_typ_NX(info);
		else if (nx == columnRslt1_wg_rqst_sts_typ_nm) doRslt1_wg_rqst_sts_typ_nm_NX(info);
		else if (nx == columnRslt1_wg_rqst_src_typ) doRslt1_wg_rqst_src_typ_NX(info);
		else if (nx == columnRslt1_wg_rqst_src_typ_nm) doRslt1_wg_rqst_src_typ_nm_NX(info);
		else if (nx == columnRslt1_wg_rqst_src_no) doRslt1_wg_rqst_src_no_NX(info);
		else if (nx == columnRslt1_rqst_fr_wg_cd) doRslt1_rqst_fr_wg_cd_NX(info);
		else if (nx == columnRslt1_rqst_fr_wg_nm) doRslt1_rqst_fr_wg_nm_NX(info);
		else if (nx == columnRslt1_rqst_dt) doRslt1_rqst_dt_NX(info);
		else if (nx == columnRslt1_re_rqst_dt) doRslt1_re_rqst_dt_NX(info);
		else if (nx == columnRslt1_iv_itm_nm) doRslt1_iv_itm_nm_NX(info);
		else if (nx == columnRslt1_lot_mng_typ) doRslt1_lot_mng_typ_NX(info);
		else if (nx == columnRslt1_sublot_mng_typ) doRslt1_sublot_mng_typ_NX(info);
		else if (nx == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_NX(info);
		else if (nx == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_NX(info);
		else if (nx == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_NX(info);
		else if (nx == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_NX(info);
		else if (nx == columnRslt1_sundry_itm_flg) doRslt1_sundry_itm_flg_NX(info);
		else if (nx == columnRslt1_asset_mng_typ) doRslt1_asset_mng_typ_NX(info);
		else if (nx == columnRslt1_asset_mng_typ_nm) doRslt1_asset_mng_typ_nm_NX(info);
		else if (nx == columnRslt1_dscnt_itm_flg) doRslt1_dscnt_itm_flg_NX(info);
		else if (nx == columnRslt1_ver_flg) doRslt1_ver_flg_NX(info);
		else if (nx == columnRslt1_gr_loc_cd) doRslt1_gr_loc_cd_NX(info);
		else if (nx == columnRslt1_gr_loc_nm) doRslt1_gr_loc_nm_NX(info);
		else if (nx == columnRslt1_gr_str_ln_tgt_flg) doRslt1_gr_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt1_gr_loc_grp_cd) doRslt1_gr_loc_grp_cd_NX(info);
		else if (nx == columnRslt1_gr_loc_grp_nm) doRslt1_gr_loc_grp_nm_NX(info);
		else if (nx == columnRslt1_gr_lg_grp_cd) doRslt1_gr_lg_grp_cd_NX(info);
		else if (nx == columnRslt1_gr_lg_grp_nm) doRslt1_gr_lg_grp_nm_NX(info);
		else if (nx == columnRslt1_gr_loc_wg_cd) doRslt1_gr_loc_wg_cd_NX(info);
		else if (nx == columnRslt1_gr_loc_wg_nm) doRslt1_gr_loc_wg_nm_NX(info);
		else if (nx == columnRslt1_gr_site_cd) doRslt1_gr_site_cd_NX(info);
		else if (nx == columnRslt1_gr_site_nm) doRslt1_gr_site_nm_NX(info);
		else if (nx == columnRslt1_rqst_to_loc_cd) doRslt1_rqst_to_loc_cd_NX(info);
		else if (nx == columnRslt1_rqst_to_loc_nm) doRslt1_rqst_to_loc_nm_NX(info);
		else if (nx == columnRslt1_rqst_to_str_ln_tgt_flg) doRslt1_rqst_to_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt1_rqst_to_loc_grp_cd) doRslt1_rqst_to_loc_grp_cd_NX(info);
		else if (nx == columnRslt1_rqst_to_loc_grp_nm) doRslt1_rqst_to_loc_grp_nm_NX(info);
		else if (nx == columnRslt1_rqst_to_lg_grp_cd) doRslt1_rqst_to_lg_grp_cd_NX(info);
		else if (nx == columnRslt1_rqst_to_lg_grp_nm) doRslt1_rqst_to_lg_grp_nm_NX(info);
		else if (nx == columnRslt1_rqst_to_site_cd) doRslt1_rqst_to_site_cd_NX(info);
		else if (nx == columnRslt1_rqst_to_site_nm) doRslt1_rqst_to_site_nm_NX(info);
		else if (nx == columnRslt1_mfg_loc_cd) doRslt1_mfg_loc_cd_NX(info);
		else if (nx == columnRslt1_mfg_loc_nm) doRslt1_mfg_loc_nm_NX(info);
		else if (nx == columnRslt1_bom_ptn) doRslt1_bom_ptn_NX(info);
		else if (nx == columnRslt1_sppl_cd) doRslt1_sppl_cd_NX(info);
		else if (nx == columnRslt1_sppl_nm) doRslt1_sppl_nm_NX(info);
		else if (nx == columnRslt1_sppl_iv_flg) doRslt1_sppl_iv_flg_NX(info);
		else if (nx == columnRslt1_prnt_lcl_cd) doRslt1_prnt_lcl_cd_NX(info);
		else if (nx == columnRslt1_maker_cd) doRslt1_maker_cd_NX(info);
		else if (nx == columnRslt1_maker_nm) doRslt1_maker_nm_NX(info);
		else if (nx == columnRslt1_rqst_to_wg_cd) doRslt1_rqst_to_wg_cd_NX(info);
		else if (nx == columnRslt1_rqst_to_wg_nm) doRslt1_rqst_to_wg_nm_NX(info);
		else if (nx == columnRslt1_purc_rsn_cd) doRslt1_purc_rsn_cd_NX(info);
		else if (nx == columnRslt1_purc_rsn_nm) doRslt1_purc_rsn_nm_NX(info);
		else if (nx == columnRslt1_xpns_purc_flg) doRslt1_xpns_purc_flg_NX(info);
		else if (nx == columnRslt1_trd_cd) doRslt1_trd_cd_NX(info);
		else if (nx == columnRslt1_trd_nm) doRslt1_trd_nm_NX(info);
		else if (nx == columnRslt1_trd_ptn_typ) doRslt1_trd_ptn_typ_NX(info);
		else if (nx == columnRslt1_trd_unit_cd) doRslt1_trd_unit_cd_NX(info);
		else if (nx == columnRslt1_trd_unit_nm) doRslt1_trd_unit_nm_NX(info);
		else if (nx == columnRslt1_trd_unit_dec_place) doRslt1_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt1_trd_unit_rnd_typ) doRslt1_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt1_trd_unit_conv_base_qty) doRslt1_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt1_trd_unit_conv_qty) doRslt1_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_NX(info);
		else if (nx == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_NX(info);
		else if (nx == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_NX(info);
		else if (nx == columnRslt1_base_unit_rnd_typ) doRslt1_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt1_gd_cd) doRslt1_gd_cd_NX(info);
		else if (nx == columnRslt1_gd_nm) doRslt1_gd_nm_NX(info);
		else if (nx == columnRslt1_vld_dt_fr) doRslt1_vld_dt_fr_NX(info);
		else if (nx == columnRslt1_vld_dt_to) doRslt1_vld_dt_to_NX(info);
		else if (nx == columnRslt1_bd_lot_mng_typ) doRslt1_bd_lot_mng_typ_NX(info);
		else if (nx == columnRslt1_bd_sublot_mng_typ) doRslt1_bd_sublot_mng_typ_NX(info);
		else if (nx == columnRslt1_bd_lot_no_typ) doRslt1_bd_lot_no_typ_NX(info);
		else if (nx == columnRslt1_bd_sublot_no_typ) doRslt1_bd_sublot_no_typ_NX(info);
		else if (nx == columnRslt1_bd_sno1_mng_typ) doRslt1_bd_sno1_mng_typ_NX(info);
		else if (nx == columnRslt1_bd_sno2_mng_typ) doRslt1_bd_sno2_mng_typ_NX(info);
		else if (nx == columnRslt1_bd_sno3_mng_typ) doRslt1_bd_sno3_mng_typ_NX(info);
		else if (nx == columnRslt1_bd_sno4_mng_typ) doRslt1_bd_sno4_mng_typ_NX(info);
		else if (nx == columnRslt1_slo_no) doRslt1_slo_no_NX(info);
		else if (nx == columnRslt1_slo_d_no) doRslt1_slo_d_no_NX(info);
		else if (nx == columnRslt1_itm_ord_no) doRslt1_itm_ord_no_NX(info);
		else if (nx == columnRslt1_io_schd_pr_no) doRslt1_io_schd_pr_no_NX(info);
		else if (nx == columnRslt1_rqst_crrct_flg) doRslt1_rqst_crrct_flg_NX(info);
		else if (nx == columnRslt1_dlv_inst_rcpt_flg) doRslt1_dlv_inst_rcpt_flg_NX(info);
		else if (nx == columnRslt1_can_flg) doRslt1_can_flg_NX(info);
		else if (nx == columnRslt1_comp_cng_flg) doRslt1_comp_cng_flg_NX(info);
		else if (nx == columnRslt1_spec_cng_flg) doRslt1_spec_cng_flg_NX(info);
		else if (nx == columnRslt1_rqst_crrct_dt) doRslt1_rqst_crrct_dt_NX(info);
		else if (nx == columnRslt1_rqst_can_dt) doRslt1_rqst_can_dt_NX(info);
		else if (nx == columnRslt1_prms_can_dt) doRslt1_prms_can_dt_NX(info);
		else if (nx == columnRslt1_inst_dt) doRslt1_inst_dt_NX(info);
		else if (nx == columnRslt1_inst_can_dt) doRslt1_inst_can_dt_NX(info);
		else if (nx == columnRslt1_act_dt) doRslt1_act_dt_NX(info);
		else if (nx == columnRslt1_act_can_dt) doRslt1_act_can_dt_NX(info);
		else if (nx == columnRslt1_wg_rqst_cnt_rmrks) doRslt1_wg_rqst_cnt_rmrks_NX(info);
		else if (nx == columnRslt1_wg_re_rqst_cnt_rmrks) doRslt1_wg_re_rqst_cnt_rmrks_NX(info);
		else if (nx == columnRslt1_wg_rqst_intr_rmrks) doRslt1_wg_rqst_intr_rmrks_NX(info);
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
		else if (nx == columnRslt1_wg_rqst_upd_cntr) doRslt1_wg_rqst_upd_cntr_NX(info);
		else if (nx == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_NX(info);
		else if (nx == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_NX(info);
		else if (nx == columnRslt1_upd_func_id) doRslt1_upd_func_id_NX(info);
		else if (nx == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_NX(info);
		else if (nx == columnRslt1_upd_ts) doRslt1_upd_ts_NX(info);
		else if (nx == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_NX(info);
		else if (nx == columnRslt2_wg_rqst_prms_no) doRslt2_wg_rqst_prms_no_NX(info);
		else if (nx == columnRslt2_wg_rqst_no) doRslt2_wg_rqst_no_NX(info);
		else if (nx == columnRslt2_can_flg) doRslt2_can_flg_NX(info);
		else if (nx == columnRslt2_fix_flg) doRslt2_fix_flg_NX(info);
		else if (nx == columnRslt2_fix_dt) doRslt2_fix_dt_NX(info);
		else if (nx == columnRslt2_gr_schd_dt) doRslt2_gr_schd_dt_NX(info);
		else if (nx == columnRslt2_gr_schd_hm) doRslt2_gr_schd_hm_NX(info);
		else if (nx == columnRslt2_prms_trd_unit_cd) doRslt2_prms_trd_unit_cd_NX(info);
		else if (nx == columnRslt2_prms_trd_unit_nm) doRslt2_prms_trd_unit_nm_NX(info);
		else if (nx == columnRslt2_prms_trd_unit_dec_place) doRslt2_prms_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt2_prms_trd_unit_conv_base_qty) doRslt2_prms_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt2_prms_trd_unit_conv_qty) doRslt2_prms_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt2_prms_base_unit_cd) doRslt2_prms_base_unit_cd_NX(info);
		else if (nx == columnRslt2_prms_base_unit_nm) doRslt2_prms_base_unit_nm_NX(info);
		else if (nx == columnRslt2_prms_base_unit_dec_place) doRslt2_prms_base_unit_dec_place_NX(info);
		else if (nx == columnRslt2_prms_base_unit_rnd_typ) doRslt2_prms_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt2_gi_lg_grp_cd) doRslt2_gi_lg_grp_cd_NX(info);
		else if (nx == columnRslt2_gi_lg_grp_nm) doRslt2_gi_lg_grp_nm_NX(info);
		else if (nx == columnRslt2_gi_loc_cd) doRslt2_gi_loc_cd_NX(info);
		else if (nx == columnRslt2_gi_loc_nm) doRslt2_gi_loc_nm_NX(info);
		else if (nx == columnRslt2_gi_str_ln_cd) doRslt2_gi_str_ln_cd_NX(info);
		else if (nx == columnRslt2_gi_str_ln_nm) doRslt2_gi_str_ln_nm_NX(info);
		else if (nx == columnRslt2_gi_str_ln_cd_none_flg) doRslt2_gi_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt2_gi_schd_dt) doRslt2_gi_schd_dt_NX(info);
		else if (nx == columnRslt2_gi_schd_hm) doRslt2_gi_schd_hm_NX(info);
		else if (nx == columnRslt2_mfg_loc_cd) doRslt2_mfg_loc_cd_NX(info);
		else if (nx == columnRslt2_mfg_loc_nm) doRslt2_mfg_loc_nm_NX(info);
		else if (nx == columnRslt2_bom_ptn) doRslt2_bom_ptn_NX(info);
		else if (nx == columnRslt2_sppl_cd) doRslt2_sppl_cd_NX(info);
		else if (nx == columnRslt2_sppl_nm) doRslt2_sppl_nm_NX(info);
		else if (nx == columnRslt2_maker_cd) doRslt2_maker_cd_NX(info);
		else if (nx == columnRslt2_maker_nm) doRslt2_maker_nm_NX(info);
		else if (nx == columnRslt2_wg_rqst_prms_rmrks) doRslt2_wg_rqst_prms_rmrks_NX(info);
		else if (nx == columnRslt2_ins_usr_id) doRslt2_ins_usr_id_NX(info);
		else if (nx == columnRslt2_ins_usr_nm) doRslt2_ins_usr_nm_NX(info);
		else if (nx == columnRslt2_ins_func_id) doRslt2_ins_func_id_NX(info);
		else if (nx == columnRslt2_ins_func_nm) doRslt2_ins_func_nm_NX(info);
		else if (nx == columnRslt2_ins_ts) doRslt2_ins_ts_NX(info);
		else if (nx == columnRslt2_upd_usr_id) doRslt2_upd_usr_id_NX(info);
		else if (nx == columnRslt2_upd_usr_nm) doRslt2_upd_usr_nm_NX(info);
		else if (nx == columnRslt2_upd_func_id) doRslt2_upd_func_id_NX(info);
		else if (nx == columnRslt2_upd_func_nm) doRslt2_upd_func_nm_NX(info);
		else if (nx == columnRslt2_upd_ts) doRslt2_upd_ts_NX(info);
		else if (nx == columnRslt2_upd_srv_req_no) doRslt2_upd_srv_req_no_NX(info);
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
	 * [Cnd]パネルの[xfr_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_sts_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_sts_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_sts_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_sts_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_sts_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_sts_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sts_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sts_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_sts_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_sts_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[un_slo_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_un_slo_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[re_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_div_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_shrtg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_shrtg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_delay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_delay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_uncn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_uncn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_re_rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_re_rqst_cnt_rmrks_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_uncn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_uncn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_ntc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_ntc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_ntc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_ntc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[last_wg_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_last_wg_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sublot_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt1]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_qty_NX(MCEventInfo info){
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
	 * [Rslt1]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno4_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt1]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[dlv_inst_rcpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_dlv_inst_rcpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[comp_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_comp_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[spec_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_spec_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_can_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_can_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_can_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_can_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_can_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_can_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_can_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_can_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_re_rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_re_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt1]パネルの[wg_rqst_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt2]パネルの[wg_rqst_prms_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_prms_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_LC(info);
		else if (lc == Cnd_rqst_dt_to) doCnd_rqst_dt_to_LC(info);
		else if (lc == Cnd_re_rqst_dt_fr) doCnd_re_rqst_dt_fr_LC(info);
		else if (lc == Cnd_re_rqst_dt_to) doCnd_re_rqst_dt_to_LC(info);
		else if (lc == Cnd_wg_rqst_ntc_day_typ) doCnd_wg_rqst_ntc_day_typ_LC(info);
		else if (lc == Cnd_wg_rqst_ntc_day_typ_nm) doCnd_wg_rqst_ntc_day_typ_nm_LC(info);
		else if (lc == Cnd_srch_dt_fr) doCnd_srch_dt_fr_LC(info);
		else if (lc == Cnd_srch_dt_to) doCnd_srch_dt_to_LC(info);
		else if (lc == Cnd_rqst_fr_wg_cd) doCnd_rqst_fr_wg_cd_LC(info);
		else if (lc == Cnd_rqst_fr_wg_nm) doCnd_rqst_fr_wg_nm_LC(info);
		else if (lc == Cnd_rqst_to_wg_cd) doCnd_rqst_to_wg_cd_LC(info);
		else if (lc == Cnd_rqst_to_wg_nm) doCnd_rqst_to_wg_nm_LC(info);
		else if (lc == Cnd_gr_loc_cd) doCnd_gr_loc_cd_LC(info);
		else if (lc == Cnd_gr_loc_nm) doCnd_gr_loc_nm_LC(info);
		else if (lc == Cnd_gr_site_cd) doCnd_gr_site_cd_LC(info);
		else if (lc == Cnd_gr_site_nm) doCnd_gr_site_nm_LC(info);
		else if (lc == Cnd_gr_loc_wg_cd) doCnd_gr_loc_wg_cd_LC(info);
		else if (lc == Cnd_gr_loc_wg_nm) doCnd_gr_loc_wg_nm_LC(info);
		else if (lc == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_LC(info);
		else if (lc == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_LC(info);
		else if (lc == Cnd_gr_loc_grp_cd) doCnd_gr_loc_grp_cd_LC(info);
		else if (lc == Cnd_gr_loc_grp_nm) doCnd_gr_loc_grp_nm_LC(info);
		else if (lc == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_LC(info);
		else if (lc == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_LC(info);
		else if (lc == Cnd_rqst_to_loc_cd) doCnd_rqst_to_loc_cd_LC(info);
		else if (lc == Cnd_rqst_to_loc_nm) doCnd_rqst_to_loc_nm_LC(info);
		else if (lc == Cnd_rqst_to_site_cd) doCnd_rqst_to_site_cd_LC(info);
		else if (lc == Cnd_rqst_to_site_nm) doCnd_rqst_to_site_nm_LC(info);
		else if (lc == Cnd_rqst_to_lg_grp_cd) doCnd_rqst_to_lg_grp_cd_LC(info);
		else if (lc == Cnd_rqst_to_lg_grp_nm) doCnd_rqst_to_lg_grp_nm_LC(info);
		else if (lc == Cnd_rqst_to_loc_grp_cd) doCnd_rqst_to_loc_grp_cd_LC(info);
		else if (lc == Cnd_rqst_to_loc_grp_nm) doCnd_rqst_to_loc_grp_nm_LC(info);
		else if (lc == Cnd_rqst_to_str_ln_cd) doCnd_rqst_to_str_ln_cd_LC(info);
		else if (lc == Cnd_rqst_to_str_ln_nm) doCnd_rqst_to_str_ln_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_LC(info);
		else if (lc == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_LC(info);
		else if (lc == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_LC(info);
		else if (lc == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_LC(info);
		else if (lc == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_LC(info);
		else if (lc == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_LC(info);
		else if (lc == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_LC(info);
		else if (lc == Cnd_wg_rqst_no) doCnd_wg_rqst_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_LC(info);
		else if (lc == Cnd_wg_re_rqst_cnt_rmrks) doCnd_wg_re_rqst_cnt_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_rqst_dt) doBulkSet_rqst_dt_LC(info);
		else if (lc == BulkSet_rqst_fr_wg_cd) doBulkSet_rqst_fr_wg_cd_LC(info);
		else if (lc == BulkSet_rqst_fr_wg_nm) doBulkSet_rqst_fr_wg_nm_LC(info);
		else if (lc == columnRslt1_prms_dt) doRslt1_prms_dt_LC(info);
		else if (lc == columnRslt1_re_prms_dt) doRslt1_re_prms_dt_LC(info);
		else if (lc == columnRslt1_wg_rqst_no) doRslt1_wg_rqst_no_LC(info);
		else if (lc == columnRslt1_last_wg_rqst_no) doRslt1_last_wg_rqst_no_LC(info);
		else if (lc == columnRslt1_wg_rqst_typ) doRslt1_wg_rqst_typ_LC(info);
		else if (lc == columnRslt1_wg_rqst_typ_nm) doRslt1_wg_rqst_typ_nm_LC(info);
		else if (lc == columnRslt1_wg_rqst_sts_typ) doRslt1_wg_rqst_sts_typ_LC(info);
		else if (lc == columnRslt1_wg_rqst_sts_typ_nm) doRslt1_wg_rqst_sts_typ_nm_LC(info);
		else if (lc == columnRslt1_wg_rqst_src_typ) doRslt1_wg_rqst_src_typ_LC(info);
		else if (lc == columnRslt1_wg_rqst_src_typ_nm) doRslt1_wg_rqst_src_typ_nm_LC(info);
		else if (lc == columnRslt1_wg_rqst_src_no) doRslt1_wg_rqst_src_no_LC(info);
		else if (lc == columnRslt1_rqst_fr_wg_cd) doRslt1_rqst_fr_wg_cd_LC(info);
		else if (lc == columnRslt1_rqst_fr_wg_nm) doRslt1_rqst_fr_wg_nm_LC(info);
		else if (lc == columnRslt1_rqst_dt) doRslt1_rqst_dt_LC(info);
		else if (lc == columnRslt1_re_rqst_dt) doRslt1_re_rqst_dt_LC(info);
		else if (lc == columnRslt1_iv_itm_nm) doRslt1_iv_itm_nm_LC(info);
		else if (lc == columnRslt1_lot_mng_typ) doRslt1_lot_mng_typ_LC(info);
		else if (lc == columnRslt1_sublot_mng_typ) doRslt1_sublot_mng_typ_LC(info);
		else if (lc == columnRslt1_sno1_mng_typ) doRslt1_sno1_mng_typ_LC(info);
		else if (lc == columnRslt1_sno2_mng_typ) doRslt1_sno2_mng_typ_LC(info);
		else if (lc == columnRslt1_sno3_mng_typ) doRslt1_sno3_mng_typ_LC(info);
		else if (lc == columnRslt1_sno4_mng_typ) doRslt1_sno4_mng_typ_LC(info);
		else if (lc == columnRslt1_asset_mng_typ) doRslt1_asset_mng_typ_LC(info);
		else if (lc == columnRslt1_asset_mng_typ_nm) doRslt1_asset_mng_typ_nm_LC(info);
		else if (lc == columnRslt1_gr_loc_cd) doRslt1_gr_loc_cd_LC(info);
		else if (lc == columnRslt1_gr_loc_nm) doRslt1_gr_loc_nm_LC(info);
		else if (lc == columnRslt1_gr_loc_grp_cd) doRslt1_gr_loc_grp_cd_LC(info);
		else if (lc == columnRslt1_gr_loc_grp_nm) doRslt1_gr_loc_grp_nm_LC(info);
		else if (lc == columnRslt1_gr_lg_grp_cd) doRslt1_gr_lg_grp_cd_LC(info);
		else if (lc == columnRslt1_gr_lg_grp_nm) doRslt1_gr_lg_grp_nm_LC(info);
		else if (lc == columnRslt1_gr_loc_wg_cd) doRslt1_gr_loc_wg_cd_LC(info);
		else if (lc == columnRslt1_gr_loc_wg_nm) doRslt1_gr_loc_wg_nm_LC(info);
		else if (lc == columnRslt1_gr_site_cd) doRslt1_gr_site_cd_LC(info);
		else if (lc == columnRslt1_gr_site_nm) doRslt1_gr_site_nm_LC(info);
		else if (lc == columnRslt1_rqst_to_loc_cd) doRslt1_rqst_to_loc_cd_LC(info);
		else if (lc == columnRslt1_rqst_to_loc_nm) doRslt1_rqst_to_loc_nm_LC(info);
		else if (lc == columnRslt1_rqst_to_loc_grp_cd) doRslt1_rqst_to_loc_grp_cd_LC(info);
		else if (lc == columnRslt1_rqst_to_loc_grp_nm) doRslt1_rqst_to_loc_grp_nm_LC(info);
		else if (lc == columnRslt1_rqst_to_lg_grp_cd) doRslt1_rqst_to_lg_grp_cd_LC(info);
		else if (lc == columnRslt1_rqst_to_lg_grp_nm) doRslt1_rqst_to_lg_grp_nm_LC(info);
		else if (lc == columnRslt1_rqst_to_site_cd) doRslt1_rqst_to_site_cd_LC(info);
		else if (lc == columnRslt1_rqst_to_site_nm) doRslt1_rqst_to_site_nm_LC(info);
		else if (lc == columnRslt1_mfg_loc_cd) doRslt1_mfg_loc_cd_LC(info);
		else if (lc == columnRslt1_mfg_loc_nm) doRslt1_mfg_loc_nm_LC(info);
		else if (lc == columnRslt1_bom_ptn) doRslt1_bom_ptn_LC(info);
		else if (lc == columnRslt1_sppl_cd) doRslt1_sppl_cd_LC(info);
		else if (lc == columnRslt1_sppl_nm) doRslt1_sppl_nm_LC(info);
		else if (lc == columnRslt1_prnt_lcl_cd) doRslt1_prnt_lcl_cd_LC(info);
		else if (lc == columnRslt1_maker_cd) doRslt1_maker_cd_LC(info);
		else if (lc == columnRslt1_maker_nm) doRslt1_maker_nm_LC(info);
		else if (lc == columnRslt1_rqst_to_wg_cd) doRslt1_rqst_to_wg_cd_LC(info);
		else if (lc == columnRslt1_rqst_to_wg_nm) doRslt1_rqst_to_wg_nm_LC(info);
		else if (lc == columnRslt1_purc_rsn_cd) doRslt1_purc_rsn_cd_LC(info);
		else if (lc == columnRslt1_purc_rsn_nm) doRslt1_purc_rsn_nm_LC(info);
		else if (lc == columnRslt1_trd_cd) doRslt1_trd_cd_LC(info);
		else if (lc == columnRslt1_trd_nm) doRslt1_trd_nm_LC(info);
		else if (lc == columnRslt1_trd_ptn_typ) doRslt1_trd_ptn_typ_LC(info);
		else if (lc == columnRslt1_trd_unit_cd) doRslt1_trd_unit_cd_LC(info);
		else if (lc == columnRslt1_trd_unit_nm) doRslt1_trd_unit_nm_LC(info);
		else if (lc == columnRslt1_trd_unit_dec_place) doRslt1_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt1_trd_unit_rnd_typ) doRslt1_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt1_trd_unit_conv_base_qty) doRslt1_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt1_trd_unit_conv_qty) doRslt1_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt1_base_unit_cd) doRslt1_base_unit_cd_LC(info);
		else if (lc == columnRslt1_base_unit_nm) doRslt1_base_unit_nm_LC(info);
		else if (lc == columnRslt1_base_unit_dec_place) doRslt1_base_unit_dec_place_LC(info);
		else if (lc == columnRslt1_base_unit_rnd_typ) doRslt1_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt1_gd_cd) doRslt1_gd_cd_LC(info);
		else if (lc == columnRslt1_gd_nm) doRslt1_gd_nm_LC(info);
		else if (lc == columnRslt1_vld_dt_fr) doRslt1_vld_dt_fr_LC(info);
		else if (lc == columnRslt1_vld_dt_to) doRslt1_vld_dt_to_LC(info);
		else if (lc == columnRslt1_bd_lot_mng_typ) doRslt1_bd_lot_mng_typ_LC(info);
		else if (lc == columnRslt1_bd_sublot_mng_typ) doRslt1_bd_sublot_mng_typ_LC(info);
		else if (lc == columnRslt1_bd_lot_no_typ) doRslt1_bd_lot_no_typ_LC(info);
		else if (lc == columnRslt1_bd_sublot_no_typ) doRslt1_bd_sublot_no_typ_LC(info);
		else if (lc == columnRslt1_bd_sno1_mng_typ) doRslt1_bd_sno1_mng_typ_LC(info);
		else if (lc == columnRslt1_bd_sno2_mng_typ) doRslt1_bd_sno2_mng_typ_LC(info);
		else if (lc == columnRslt1_bd_sno3_mng_typ) doRslt1_bd_sno3_mng_typ_LC(info);
		else if (lc == columnRslt1_bd_sno4_mng_typ) doRslt1_bd_sno4_mng_typ_LC(info);
		else if (lc == columnRslt1_slo_no) doRslt1_slo_no_LC(info);
		else if (lc == columnRslt1_slo_d_no) doRslt1_slo_d_no_LC(info);
		else if (lc == columnRslt1_itm_ord_no) doRslt1_itm_ord_no_LC(info);
		else if (lc == columnRslt1_io_schd_pr_no) doRslt1_io_schd_pr_no_LC(info);
		else if (lc == columnRslt1_rqst_crrct_dt) doRslt1_rqst_crrct_dt_LC(info);
		else if (lc == columnRslt1_rqst_can_dt) doRslt1_rqst_can_dt_LC(info);
		else if (lc == columnRslt1_prms_can_dt) doRslt1_prms_can_dt_LC(info);
		else if (lc == columnRslt1_inst_dt) doRslt1_inst_dt_LC(info);
		else if (lc == columnRslt1_inst_can_dt) doRslt1_inst_can_dt_LC(info);
		else if (lc == columnRslt1_act_dt) doRslt1_act_dt_LC(info);
		else if (lc == columnRslt1_act_can_dt) doRslt1_act_can_dt_LC(info);
		else if (lc == columnRslt1_wg_rqst_cnt_rmrks) doRslt1_wg_rqst_cnt_rmrks_LC(info);
		else if (lc == columnRslt1_wg_re_rqst_cnt_rmrks) doRslt1_wg_re_rqst_cnt_rmrks_LC(info);
		else if (lc == columnRslt1_wg_rqst_intr_rmrks) doRslt1_wg_rqst_intr_rmrks_LC(info);
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
		else if (lc == columnRslt1_wg_rqst_upd_cntr) doRslt1_wg_rqst_upd_cntr_LC(info);
		else if (lc == columnRslt1_upd_usr_id) doRslt1_upd_usr_id_LC(info);
		else if (lc == columnRslt1_upd_usr_nm) doRslt1_upd_usr_nm_LC(info);
		else if (lc == columnRslt1_upd_func_id) doRslt1_upd_func_id_LC(info);
		else if (lc == columnRslt1_upd_func_nm) doRslt1_upd_func_nm_LC(info);
		else if (lc == columnRslt1_upd_ts) doRslt1_upd_ts_LC(info);
		else if (lc == columnRslt1_upd_srv_req_no) doRslt1_upd_srv_req_no_LC(info);
		else if (lc == columnRslt2_wg_rqst_prms_no) doRslt2_wg_rqst_prms_no_LC(info);
		else if (lc == columnRslt2_wg_rqst_no) doRslt2_wg_rqst_no_LC(info);
		else if (lc == columnRslt2_fix_dt) doRslt2_fix_dt_LC(info);
		else if (lc == columnRslt2_gr_schd_dt) doRslt2_gr_schd_dt_LC(info);
		else if (lc == columnRslt2_gr_schd_hm) doRslt2_gr_schd_hm_LC(info);
		else if (lc == columnRslt2_prms_trd_unit_cd) doRslt2_prms_trd_unit_cd_LC(info);
		else if (lc == columnRslt2_prms_trd_unit_nm) doRslt2_prms_trd_unit_nm_LC(info);
		else if (lc == columnRslt2_prms_trd_unit_dec_place) doRslt2_prms_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt2_prms_trd_unit_conv_base_qty) doRslt2_prms_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt2_prms_trd_unit_conv_qty) doRslt2_prms_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt2_prms_base_unit_cd) doRslt2_prms_base_unit_cd_LC(info);
		else if (lc == columnRslt2_prms_base_unit_nm) doRslt2_prms_base_unit_nm_LC(info);
		else if (lc == columnRslt2_prms_base_unit_dec_place) doRslt2_prms_base_unit_dec_place_LC(info);
		else if (lc == columnRslt2_prms_base_unit_rnd_typ) doRslt2_prms_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt2_gi_lg_grp_cd) doRslt2_gi_lg_grp_cd_LC(info);
		else if (lc == columnRslt2_gi_lg_grp_nm) doRslt2_gi_lg_grp_nm_LC(info);
		else if (lc == columnRslt2_gi_loc_cd) doRslt2_gi_loc_cd_LC(info);
		else if (lc == columnRslt2_gi_loc_nm) doRslt2_gi_loc_nm_LC(info);
		else if (lc == columnRslt2_gi_str_ln_cd) doRslt2_gi_str_ln_cd_LC(info);
		else if (lc == columnRslt2_gi_str_ln_nm) doRslt2_gi_str_ln_nm_LC(info);
		else if (lc == columnRslt2_gi_schd_dt) doRslt2_gi_schd_dt_LC(info);
		else if (lc == columnRslt2_gi_schd_hm) doRslt2_gi_schd_hm_LC(info);
		else if (lc == columnRslt2_mfg_loc_cd) doRslt2_mfg_loc_cd_LC(info);
		else if (lc == columnRslt2_mfg_loc_nm) doRslt2_mfg_loc_nm_LC(info);
		else if (lc == columnRslt2_bom_ptn) doRslt2_bom_ptn_LC(info);
		else if (lc == columnRslt2_sppl_cd) doRslt2_sppl_cd_LC(info);
		else if (lc == columnRslt2_sppl_nm) doRslt2_sppl_nm_LC(info);
		else if (lc == columnRslt2_maker_cd) doRslt2_maker_cd_LC(info);
		else if (lc == columnRslt2_maker_nm) doRslt2_maker_nm_LC(info);
		else if (lc == columnRslt2_wg_rqst_prms_rmrks) doRslt2_wg_rqst_prms_rmrks_LC(info);
		else if (lc == columnRslt2_ins_usr_id) doRslt2_ins_usr_id_LC(info);
		else if (lc == columnRslt2_ins_usr_nm) doRslt2_ins_usr_nm_LC(info);
		else if (lc == columnRslt2_ins_func_id) doRslt2_ins_func_id_LC(info);
		else if (lc == columnRslt2_ins_func_nm) doRslt2_ins_func_nm_LC(info);
		else if (lc == columnRslt2_ins_ts) doRslt2_ins_ts_LC(info);
		else if (lc == columnRslt2_upd_usr_id) doRslt2_upd_usr_id_LC(info);
		else if (lc == columnRslt2_upd_usr_nm) doRslt2_upd_usr_nm_LC(info);
		else if (lc == columnRslt2_upd_func_id) doRslt2_upd_func_id_LC(info);
		else if (lc == columnRslt2_upd_func_nm) doRslt2_upd_func_nm_LC(info);
		else if (lc == columnRslt2_upd_ts) doRslt2_upd_ts_LC(info);
		else if (lc == columnRslt2_upd_srv_req_no) doRslt2_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[re_rqst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_re_rqst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_ntc_day_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_ntc_day_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_to_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_to_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_re_rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_re_rqst_cnt_rmrks_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_fr_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_fr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_prms_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_prms_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[last_wg_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_last_wg_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_fr_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_fr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[re_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_re_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sublot_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt1]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gr_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gr_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_to_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_to_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_trd_unit_conv_qty_LC(MCEventInfo info){
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
	 * [Rslt1]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[bd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_bd_sno4_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt1]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_crrct_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_crrct_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[rqst_can_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_rqst_can_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[prms_can_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_prms_can_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[inst_can_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_inst_can_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[act_can_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_act_can_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_re_rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_re_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt1]パネルの[wg_rqst_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt1]パネルの[wg_rqst_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt1_wg_rqst_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt2]パネルの[wg_rqst_prms_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[fix_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_fix_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gr_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gr_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[prms_base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_prms_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[gi_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_gi_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[wg_rqst_prms_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_wg_rqst_prms_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_rqst_ntc_day_typ]の作成メソッド
	 */
	public MCList getCnd_wg_rqst_ntc_day_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getWgRqstNtcDayTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_fr_wg_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_fr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_to_wg_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_to_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_loc_cd]の作成メソッド
	 */
	public MCList getCnd_gr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_site_cd]の作成メソッド
	 */
	public MCList getCnd_gr_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_gr_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_gr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_gr_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_gr_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_to_loc_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_to_site_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_to_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_to_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_to_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_to_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_to_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_to_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_to_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_lot_no]の作成メソッド
	 */
	public MCList getCnd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sublot_no]の作成メソッド
	 */
	public MCList getCnd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_fr_usr_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_fr_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_fr_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_fr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_rqst_src_typ]の作成メソッド
	 */
	public MCList getCnd_wg_rqst_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getWgRqstSrcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_rqst_fr_wg_cd]の作成メソッド
	 */
	public MCList getBulkSet_rqst_fr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_wg_rqst_no]の作成メソッド
	 */
	public MCList getRslt1_wg_rqst_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_last_wg_rqst_no]の作成メソッド
	 */
	public MCList getRslt1_last_wg_rqst_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_wg_rqst_typ]の作成メソッド
	 */
	public MCList getRslt1_wg_rqst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getWgRqstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_rqst_fr_wg_cd]の作成メソッド
	 */
	public MCList getRslt1_rqst_fr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRslt1_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt1_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt1_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt1_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_asset_mng_typ]の作成メソッド
	 */
	public MCList getRslt1_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_gr_loc_cd]の作成メソッド
	 */
	public MCList getRslt1_gr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt1_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_rqst_to_loc_cd]の作成メソッド
	 */
	public MCList getRslt1_rqst_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt1_rqst_to_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_mfg_loc_cd]の作成メソッド
	 */
	public MCList getRslt1_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_bom_ptn]の作成メソッド
	 */
	public MCList getRslt1_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_sppl_cd]の作成メソッド
	 */
	public MCList getRslt1_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_maker_cd]の作成メソッド
	 */
	public MCList getRslt1_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_rqst_to_wg_cd]の作成メソッド
	 */
	public MCList getRslt1_rqst_to_wg_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_purc_rsn_cd]の作成メソッド
	 */
	public MCList getRslt1_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_trd_cd]の作成メソッド
	 */
	public MCList getRslt1_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt1_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getRslt1_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_gd_cd]の作成メソッド
	 */
	public MCList getRslt1_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRslt1_bditm_p_PPanel_columnBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getRslt1_bditm_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd]の作成メソッド
	 */
	public MCList getRslt1_bditm_p_PPanel_columnBdItem_bd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_slo_no]の作成メソッド
	 */
	public MCList getRslt1_slo_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt1_slo_d_no]の作成メソッド
	 */
	public MCList getRslt1_slo_d_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_wg_rqst_prms_no]の作成メソッド
	 */
	public MCList getRslt2_wg_rqst_prms_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_wg_rqst_no]の作成メソッド
	 */
	public MCList getRslt2_wg_rqst_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_prms_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt2_prms_trd_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt2_prms_base_unit_cd]の作成メソッド
	 */
	public MCList getRslt2_prms_base_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBAL0100.Srch01")) {
			return new MS_MSBAL0100_Srch01Bridge();
		}
		if (id.equals("MS.MSBAL0100.Imp01")) {
			return new MS_MSBAL0100_Imp01Bridge();
		}
		if (id.equals("MS.MSBAL0100.Upd01")) {
			return new MS_MSBAL0100_Upd01Bridge();
		}
		if (id.equals("MS.MSBAL0100.Del01")) {
			return new MS_MSBAL0100_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBAL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0100_Srch01;

		/** コンストラクタ */
		protected MS_MSBAL0100_Srch01Bridge() {
			p_MS_MSBAL0100_Srch01 = new MCParam(PDef.MS_MSBAL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBA.MSBAP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt2R.class));

			p_MS_MSBAL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBA.MSBAP0100.CndR up0() {
			return (mcframe.clientMSBA.MSBAP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)down(0);
		}
		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R> down1() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
			p_MS_MSBAL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0100_Srch01;
		}

		protected void show() {
			setRslt1L((MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)p_MS_MSBAL0100_Srch01.getContainerParam().getDownBlock(0));
			setRslt2L((MCList<mcframe.clientMSBA.MSBAP0100.Rslt2R>)p_MS_MSBAL0100_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBAL0100_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0100_Imp01;

		/** コンストラクタ */
		protected MS_MSBAL0100_Imp01Bridge() {
			p_MS_MSBAL0100_Imp01 = new MCParam(PDef.MS_MSBAL0100_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0100_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));

			p_MS_MSBAL0100_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0100_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0100_Imp01.addUpBlock(getRslt1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0100_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0100_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0100_Imp01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0100_Imp01;
		}

		protected void show() {
			setRslt1L((MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)p_MS_MSBAL0100_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRslt1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			return result;
		}
	}
	/**
	 * [MS_MSBAL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0100_Upd01;

		/** コンストラクタ */
		protected MS_MSBAL0100_Upd01Bridge() {
			p_MS_MSBAL0100_Upd01 = new MCParam(PDef.MS_MSBAL0100_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0100_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));

			p_MS_MSBAL0100_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0100_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0100_Upd01.addUpBlock(getRslt1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0100_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0100_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0100_Upd01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0100_Upd01;
		}

		protected void show() {
			setRslt1L((MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)p_MS_MSBAL0100_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRslt1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			return result;
		}
	}
	/**
	 * [MS_MSBAL0100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBAL0100_Del01;

		/** コンストラクタ */
		protected MS_MSBAL0100_Del01Bridge() {
			p_MS_MSBAL0100_Del01 = new MCParam(PDef.MS_MSBAL0100_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBAL0100_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));

			p_MS_MSBAL0100_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBAL0100_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBAL0100_Del01.addUpBlock(getRslt1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBAL0100_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBAL0100_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> up0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)up(0);
		}

		protected MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R> down0() {
			return (MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBAL0100_Del01.addDownBlock(MCList.create(mcframe.clientMSBA.MSBAP0100.Rslt1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBAL0100_Del01;
		}

		protected void show() {
			setRslt1L((MCList<mcframe.clientMSBA.MSBAP0100.Rslt1R>)p_MS_MSBAL0100_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRslt1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRslt1L());
			return result;
		}
	}
}