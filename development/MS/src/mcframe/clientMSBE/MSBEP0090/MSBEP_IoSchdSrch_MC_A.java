package mcframe.clientMSBE.MSBEP0090;

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
import mcframe.clientMSBE.MSBEP0090.MSBEP_IoSchdSrch_MC.MS_MSBEL0090_Srch01Caller;

/**
 * 画面"MSBEP_IoSchdSrch"パネルクラスです。<p>
 *
 * 指定された期間の入出庫の予定を受払予定として照会する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_IoSchdSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
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
	public MCLabel Cnd_schd_dt_fr_Label = null;
	/**
	 * Scheduled date FROM 予定日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_schd_dt_fr = null;
	public MCLabel Cnd_schd_dt_to_Label = null;
	/**
	 * Scheduled date TO 予定日付ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_schd_dt_to = null;
	public MCLabel Cnd_accpt_schd_dt_fr_Label = null;
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_schd_dt_fr = null;
	public MCLabel Cnd_accpt_schd_dt_to_Label = null;
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_schd_dt_to = null;
	public MCLabel Cnd_avl_schd_dt_fr_Label = null;
	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_avl_schd_dt_fr = null;
	public MCLabel Cnd_avl_schd_dt_to_Label = null;
	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_avl_schd_dt_to = null;
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
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
	public MCLabel Cnd_stk_arrv_bp_cd_Label = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCTextField Cnd_stk_arrv_bp_nm = null;
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
	/**
	 * Do not allow 不可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno1_null_ng_flg = null;
	/**
	 * Allowed 可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno1_null_ok_flg = null;
	/**
	 * Do not allow 不可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno2_null_ng_flg = null;
	/**
	 * Allowed 可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno2_null_ok_flg = null;
	/**
	 * Do not allow 不可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno3_null_ng_flg = null;
	/**
	 * Allowed 可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno3_null_ok_flg = null;
	/**
	 * Do not allow 不可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno4_null_ng_flg = null;
	/**
	 * Allowed 可.<p>
	 *
	 */
	public MCCheckBox Cnd_sno4_null_ok_flg = null;
	public MCLabel Cnd_pack_unit_cd_Label = null;
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCTextField Cnd_pack_unit_nm = null;
	public MCLabel Cnd_alt_grp_cd_Label = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCTextField Cnd_alt_grp_nm = null;
	public MCLabel Cnd_oper_inst_no_Label = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_inst_no = null;
	public MCLabel Cnd_oper_ord_no_Label = null;
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_ord_no = null;
	public MCLabel Cnd_alt_itm_typ_Label = null;
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_alt_itm_typ = null;
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public MCTextField Cnd_alt_itm_typ_nm = null;
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
	public MCLabel Cnd_in_xfr_typ_Label = null;
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_xfr_typ = null;
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public MCTextField Cnd_in_xfr_typ_nm = null;
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
	public MCLabel Cnd_asst_typ_Label = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCTextField Cnd_asst_typ_nm = null;
	public MCLabel Cnd_stk_insp_typ_Label = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_insp_typ_nm = null;
	public MCLabel Cnd_stk_id_typ_Label = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_id_typ_nm = null;
	public MCLabel Cnd_stk_bp_cd_Label = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCTextField Cnd_stk_bp_nm = null;
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
	public MCLabel Cnd_io_schd_typ_Label = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_typ_nm = null;
	public MCLabel Cnd_io_typ_Label = null;
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_typ = null;
	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public MCTextField Cnd_io_typ_nm = null;
	public MCLabel Cnd_io_schd_sts_typ_Label = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sts_typ_nm = null;
	public MCLabel Cnd_alloc_scope_typ_Label = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_scope_typ = null;
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_scope_typ_nm = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_non_alloc_tgt_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_is_alloc_tgt_flg = null;
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public MCCheckBox Cnd_yet_allocate_flg = null;
	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public MCCheckBox Cnd_allocated_flg = null;
	/**
	 * Other pending 保留以外.<p>
	 *
	 */
	public MCCheckBox Cnd_non_alloc_wait_flg = null;
	/**
	 * Pending 保留.<p>
	 *
	 */
	public MCCheckBox Cnd_is_alloc_wait_flg = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_p_PPanel;
	public MCDateField Cnd_vld_dt;	// [Cnd]の[dt_p.dt]を[Cnd_vld_dt]としてエイリアス定義。
	public MCDateField Cnd_vld_dt_fr_fr;	// [Cnd]の[dt_p.st_dt_fr]を[Cnd_vld_dt_fr_fr]としてエイリアス定義。
	public MCDateField Cnd_vld_dt_fr_to;	// [Cnd]の[dt_p.st_dt_to]を[Cnd_vld_dt_fr_to]としてエイリアス定義。
	public MCDateField Cnd_vld_dt_to_fr;	// [Cnd]の[dt_p.end_dt_fr]を[Cnd_vld_dt_to_fr]としてエイリアス定義。
	public MCDateField Cnd_vld_dt_to_to;	// [Cnd]の[dt_p.end_dt_to]を[Cnd_vld_dt_to_to]としてエイリアス定義。
	public MCLabel Cnd_io_schd_no_Label = null;
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_no = null;
	public MCLabel Cnd_io_schd_sub_typ1_Label = null;
	/**
	 * GR/GI schedule spare type 1 受払予定予備区分１.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_schd_sub_typ1 = null;
	/**
	 * GR/GI schedule spare type name 1 受払予定予備区分名１.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_typ_nm1 = null;
	public MCLabel Cnd_io_schd_sub_no1_Label = null;
	/**
	 * GR/GI schedule spare No. 1 受払予定予備ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_no1 = null;
	public MCLabel Cnd_io_schd_sub_typ2_Label = null;
	/**
	 * GR/GI schedule spare type 2 受払予定予備区分２.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_schd_sub_typ2 = null;
	/**
	 * GR/GI schedule spare type name 2 受払予定予備区分名２.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_typ_nm2 = null;
	public MCLabel Cnd_io_schd_sub_no2_Label = null;
	/**
	 * GR/GI schedule spare No. 2 受払予定予備ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_no2 = null;
	public MCLabel Cnd_io_schd_sub_typ3_Label = null;
	/**
	 * GR/GI schedule spare type 3 受払予定予備区分３.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_schd_sub_typ3 = null;
	/**
	 * GR/GI schedule spare type name 3 受払予定予備区分名３.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_typ_nm3 = null;
	public MCLabel Cnd_io_schd_sub_no3_Label = null;
	/**
	 * GR/GI schedule spare No. 3 受払予定予備ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_no3 = null;
	public MCLabel Cnd_io_schd_sub_typ4_Label = null;
	/**
	 * GR/GI schedule spare type 4 受払予定予備区分４.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_schd_sub_typ4 = null;
	/**
	 * GR/GI schedule spare type name 4 受払予定予備区分名４.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_typ_nm4 = null;
	public MCLabel Cnd_io_schd_sub_no4_Label = null;
	/**
	 * GR/GI schedule spare No. 4 受払予定予備ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_sub_no4 = null;
	public MCLabel Cnd_io_schd_pr_no_Label = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_io_schd_pr_no = null;
	public MCLabel Cnd_slip_schd_no_Label = null;
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slip_schd_no = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	public MCLabel Cnd_sub_char4_Label = null;
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public MCTextField Cnd_sub_char4 = null;
	public MCLabel Cnd_sub_char5_Label = null;
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public MCTextField Cnd_sub_char5 = null;
	public MCLabel Cnd_sub_dt1_Label = null;
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDateField Cnd_sub_dt1 = null;
	public MCLabel Cnd_sub_dt2_Label = null;
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDateField Cnd_sub_dt2 = null;
	public MCLabel Cnd_sub_dt3_Label = null;
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDateField Cnd_sub_dt3 = null;
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
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_slip_schd_no_flg = null;
	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public MCCheckBox Cnd_schd_dt_flg = null;
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCCheckBox Cnd_accpt_schd_dt_flg = null;
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCCheckBox Cnd_avl_schd_dt_flg = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_flg = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_str_ln_flg = null;
	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_arrv_flg = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_site_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_lg_grp_flg = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_grp_flg = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_grp_flg = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_sppl_flg = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_lot_no_flg = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_sublot_no_flg = null;
	public mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H Cnd_sno_flg_p_PPanel;
	public MCCheckBox Cnd_sno1_flg;	// [Cnd]の[sno_flg_p.sno1_flg]を[Cnd_sno1_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno2_flg;	// [Cnd]の[sno_flg_p.sno2_flg]を[Cnd_sno2_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno3_flg;	// [Cnd]の[sno_flg_p.sno3_flg]を[Cnd_sno3_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno4_flg;	// [Cnd]の[sno_flg_p.sno4_flg]を[Cnd_sno4_flg]としてエイリアス定義。
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public MCCheckBox Cnd_pack_flg = null;
	/**
	 * Alternative 代替.<p>
	 *
	 */
	public MCCheckBox Cnd_alt_grp_flg = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_gd_flg = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_deselect_all = null;
	// [Sno1Null]ブロック関連のField定義
	public MCPanel Sno1NullPanel = null;
	public MCTitledBorder Sno1NullTitledBorder = null;
	// [Sno1Null]ブロックの項目のField定義
	// [Sno2Null]ブロック関連のField定義
	public MCPanel Sno2NullPanel = null;
	public MCTitledBorder Sno2NullTitledBorder = null;
	// [Sno2Null]ブロックの項目のField定義
	// [Sno3Null]ブロック関連のField定義
	public MCPanel Sno3NullPanel = null;
	public MCTitledBorder Sno3NullTitledBorder = null;
	// [Sno3Null]ブロックの項目のField定義
	// [Sno4Null]ブロック関連のField定義
	public MCPanel Sno4NullPanel = null;
	public MCTitledBorder Sno4NullTitledBorder = null;
	// [Sno4Null]ブロックの項目のField定義
	// [Cnd_2]ブロック関連のField定義
	public MCPanel Cnd_2Panel = null;
	// [Cnd_2]ブロックの項目のField定義
	// [AllocTgt]ブロック関連のField定義
	public MCPanel AllocTgtPanel = null;
	public MCTitledBorder AllocTgtTitledBorder = null;
	// [AllocTgt]ブロックの項目のField定義
	// [Alloc]ブロック関連のField定義
	public MCPanel AllocPanel = null;
	public MCTitledBorder AllocTitledBorder = null;
	// [Alloc]ブロックの項目のField定義
	// [AllocWait]ブロック関連のField定義
	public MCPanel AllocWaitPanel = null;
	public MCTitledBorder AllocWaitTitledBorder = null;
	// [AllocWait]ブロックの項目のField定義
	// [Cnd_3]ブロック関連のField定義
	public MCPanel Cnd_3Panel = null;
	// [Cnd_3]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [DispCnd]ブロック関連のField定義
	public MCPanel DispCndPanel = null;
	// [DispCnd]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBE.MSBEP0090.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_schd_no = null;
	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_dt = null;
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accpt_schd_dt = null;
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_avl_schd_dt = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_str_ln_cd;// [Rslt]の[str_ln_p.str_ln_cd]を[columnRslt_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_nm;// [Rslt]の[str_ln_p.str_ln_nm]を[columnRslt_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_cd_none_flg;// [Rslt]の[str_ln_p.str_ln_cd_none_flg]を[columnRslt_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_nm = null;
	/**
	 * GI source location distribution group cd. 出庫元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_lg_grp_cd = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_grp_nm = null;
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_sublot_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1_null_flg;// [Rslt]の[sno_p.sno1_null_flg]を[columnRslt_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2_null_flg;// [Rslt]の[sno_p.sno2_null_flg]を[columnRslt_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3_null_flg;// [Rslt]の[sno_p.sno3_null_flg]を[columnRslt_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4_null_flg;// [Rslt]の[sno_p.sno4_null_flg]を[columnRslt_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_typ = null;
	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_typ_nm = null;
	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_i_pack_unit_qty = null;
	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_o_pack_unit_qty = null;
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_nm = null;
	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_i_base_unit_qty = null;
	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_o_base_unit_qty = null;
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
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_no = null;
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ord_no = null;
	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_qty = null;
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
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_ratio = null;
	/**
	 * Alternative item allocation order of priority 代替品目引当優先順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_alloc_prio = null;
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
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_xfr_typ = null;
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_xfr_typ_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asst_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ_nm = null;
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
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * To allocate 引当対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_tgt_flg = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_scope_typ = null;
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_scope_typ_nm = null;
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_wait_flg = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt_fr = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt_to = null;
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
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_no = null;
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_seq = null;
	/**
	 * GR/GI schedule spare type 1 受払予定予備区分１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ1 = null;
	/**
	 * GR/GI schedule spare type name 1 受払予定予備区分名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm1 = null;
	/**
	 * GR/GI schedule spare No. 1 受払予定予備ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no1 = null;
	/**
	 * GR/GI schedule spare sequence No. 1 受払予定予備連番１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_seq1 = null;
	/**
	 * GR/GI schedule spare type 2 受払予定予備区分２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ2 = null;
	/**
	 * GR/GI schedule spare type name 2 受払予定予備区分名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm2 = null;
	/**
	 * GR/GI schedule spare No. 2 受払予定予備ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no2 = null;
	/**
	 * GR/GI schedule spare sequence No. 2 受払予定予備連番２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_seq2 = null;
	/**
	 * GR/GI schedule spare type 3 受払予定予備区分３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ3 = null;
	/**
	 * GR/GI schedule spare type name 3 受払予定予備区分名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm3 = null;
	/**
	 * GR/GI schedule spare No. 3 受払予定予備ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no3 = null;
	/**
	 * GR/GI schedule spare sequence No. 3 受払予定予備連番３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_seq3 = null;
	/**
	 * GR/GI schedule spare type 4 受払予定予備区分４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ4 = null;
	/**
	 * GR/GI schedule spare type name 4 受払予定予備区分名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm4 = null;
	/**
	 * GR/GI schedule spare No. 4 受払予定予備ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no4 = null;
	/**
	 * GR/GI schedule spare sequence No. 4 受払予定予備連番４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_seq4 = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char4 = null;
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char5 = null;
	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num1 = null;
	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num2 = null;
	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num3 = null;
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt1 = null;
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt2 = null;
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt3 = null;
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
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
	/**
	 * Inventory allocation status list 在庫引当状況照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0040 = null;
	/** [INI]モードを表す定数 */
	public static final String INI = "INI";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INI, REF};
	
	/** [MS_MSBEL0090_Srch01]のCallerの作成 */
	protected MSBEP_IoSchdSrch_MC.MS_MSBEL0090_Srch01Caller createMS_MSBEL0090_Srch01() {
		MSBEP_IoSchdSrch_MC.MS_MSBEL0090_Srch01Caller<MSBEP_IoSchdSrch, MS_MSBEL0090_Srch01Bridge>
		caller = ((MSBEP_IoSchdSrch_MC)this).new MS_MSBEL0090_Srch01Caller<MSBEP_IoSchdSrch, MS_MSBEL0090_Srch01Bridge>(
					(MSBEP_IoSchdSrch)this, new MS_MSBEL0090_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0090_Srch01]の呼び出し */
	protected void callMS_MSBEL0090_Srch01() {
		MCCaller caller = createMS_MSBEL0090_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0090.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0090.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0090.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0090.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0090.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0090.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP0090.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0090.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP0090.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP0090.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0090.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0090.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Sno1NullPanel);
		ret.add(Sno2NullPanel);
		ret.add(Sno3NullPanel);
		ret.add(Sno4NullPanel);
		ret.add(Cnd_2Panel);
		ret.add(AllocTgtPanel);
		ret.add(AllocPanel);
		ret.add(AllocWaitPanel);
		ret.add(Cnd_3Panel);
		ret.add(ItmCndPanel);
		ret.add(DispCndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoSchdSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_IoSchdSrch_MC_A(String name) {
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
		MSBEP_IoSchdSrch_MC.jbCreateTop((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateFold((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateTab1((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateTab2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateTab3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateSno1Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateSno2Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateSno3Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateSno4Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateCnd_2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateAllocTgt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateAlloc((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateAllocWait((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateCnd_3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateItmCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateDispCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateCtrl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateRPnl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateRslt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbCreateBtn((MSBEP_IoSchdSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_IoSchdSrch p) {
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
		p.Cnd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt_p());
		p.Cnd_dt_p_PPanel.setName("Cnd.dt_p");
		p.Cnd_vld_dt = p.Cnd_dt_p_PPanel.StEndDt_dt;
		p.Cnd_vld_dt.addAliasName("Cnd.vld_dt", p);
		p.Cnd_vld_dt_fr_fr = p.Cnd_dt_p_PPanel.StEndDt_st_dt_fr;
		p.Cnd_vld_dt_fr_fr.addAliasName("Cnd.vld_dt_fr_fr", p);
		p.Cnd_vld_dt_fr_to = p.Cnd_dt_p_PPanel.StEndDt_st_dt_to;
		p.Cnd_vld_dt_fr_to.addAliasName("Cnd.vld_dt_fr_to", p);
		p.Cnd_vld_dt_to_fr = p.Cnd_dt_p_PPanel.StEndDt_end_dt_fr;
		p.Cnd_vld_dt_to_fr.addAliasName("Cnd.vld_dt_to_fr", p);
		p.Cnd_vld_dt_to_to = p.Cnd_dt_p_PPanel.StEndDt_end_dt_to;
		p.Cnd_vld_dt_to_to.addAliasName("Cnd.vld_dt_to_to", p);
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
	 * [Sno1Null]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSno1Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Sno2Null]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSno2Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Sno3Null]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSno3Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Sno4Null]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSno4Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Cnd_2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd_2(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [AllocTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocTgt(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Alloc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAlloc(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [AllocWait]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocWait(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Cnd_3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd_3(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [DispCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispCnd(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_IoSchdSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_IoSchdSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_IoSchdSrch p) {
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0090.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_str_ln_cd.addAliasName("Rslt.str_ln_cd", p);
		p.columnRslt_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_str_ln_nm.addAliasName("Rslt.str_ln_nm", p);
		p.columnRslt_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_str_ln_cd_none_flg.addAliasName("Rslt.str_ln_cd_none_flg", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0090.RsltR.$itm_p);
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
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP0090.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0090.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnRslt_sno1_null_flg.addAliasName("Rslt.sno1_null_flg", p);
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnRslt_sno2_null_flg.addAliasName("Rslt.sno2_null_flg", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnRslt_sno3_null_flg.addAliasName("Rslt.sno3_null_flg", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnRslt_sno4_null_flg.addAliasName("Rslt.sno4_null_flg", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0090.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP0090.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBEP_IoSchdSrch p) {
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
	
	
	/** [Cnd_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_str_ln_cd_p = null;

	/**
	 * [Cnd_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_str_ln_cd_ListPutter() {
		if (Cnd_str_ln_cd_p == null) {
			Cnd_str_ln_cd_p = createCnd_str_ln_cd_ListPutter(Cnd_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return Cnd_str_ln_cd_p;
	}
	
	
	/** [Cnd_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_stk_arrv_bp_cd_p = null;

	/**
	 * [Cnd_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_arrv_bp_cd_ListPutter() {
		if (Cnd_stk_arrv_bp_cd_p == null) {
			Cnd_stk_arrv_bp_cd_p = createCnd_stk_arrv_bp_cd_ListPutter(Cnd_stk_arrv_bp_cd, "stk_arrv_bp_cd", "stk_arrv_bp_nm");

		}
		return Cnd_stk_arrv_bp_cd_p;
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
	
	
	/** [Cnd_pack_unit_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pack_unit_cd_p = null;

	/**
	 * [Cnd_pack_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pack_unit_cd_ListPutter() {
		if (Cnd_pack_unit_cd_p == null) {
			Cnd_pack_unit_cd_p = createCnd_pack_unit_cd_ListPutter(Cnd_pack_unit_cd, "pack_unit_cd", "pack_unit_nm");

		}
		return Cnd_pack_unit_cd_p;
	}
	
	
	/** [Cnd_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alt_grp_cd_p = null;

	/**
	 * [Cnd_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alt_grp_cd_ListPutter() {
		if (Cnd_alt_grp_cd_p == null) {
			Cnd_alt_grp_cd_p = createCnd_alt_grp_cd_ListPutter(Cnd_alt_grp_cd, "alt_grp_cd", "alt_grp_nm");

		}
		return Cnd_alt_grp_cd_p;
	}
	
	
	/** [Cnd_alt_itm_typ_ListPutter]の定義 */
	private MCListPutter Cnd_alt_itm_typ_p = null;

	/**
	 * [Cnd_alt_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alt_itm_typ_ListPutter() {
		if (Cnd_alt_itm_typ_p == null) {
			Cnd_alt_itm_typ_p = createCnd_alt_itm_typ_ListPutter(Cnd_alt_itm_typ, "alt_itm_typ", "alt_itm_typ_nm");

		}
		return Cnd_alt_itm_typ_p;
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
	
	
	/** [Cnd_in_xfr_typ_ListPutter]の定義 */
	private MCListPutter Cnd_in_xfr_typ_p = null;

	/**
	 * [Cnd_in_xfr_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_xfr_typ_ListPutter() {
		if (Cnd_in_xfr_typ_p == null) {
			Cnd_in_xfr_typ_p = createCnd_in_xfr_typ_ListPutter(Cnd_in_xfr_typ, "in_xfr_typ", "in_xfr_typ_nm");

		}
		return Cnd_in_xfr_typ_p;
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
	
	
	/** [Cnd_asst_typ_ListPutter]の定義 */
	private MCListPutter Cnd_asst_typ_p = null;

	/**
	 * [Cnd_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asst_typ_ListPutter() {
		if (Cnd_asst_typ_p == null) {
			Cnd_asst_typ_p = createCnd_asst_typ_ListPutter(Cnd_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Cnd_asst_typ_p;
	}
	
	
	/** [Cnd_stk_insp_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_insp_typ_p = null;

	/**
	 * [Cnd_stk_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_insp_typ_ListPutter() {
		if (Cnd_stk_insp_typ_p == null) {
			Cnd_stk_insp_typ_p = createCnd_stk_insp_typ_ListPutter(Cnd_stk_insp_typ, "stk_insp_typ", "stk_insp_typ_nm");

		}
		return Cnd_stk_insp_typ_p;
	}
	
	
	/** [Cnd_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_id_typ_p = null;

	/**
	 * [Cnd_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_id_typ_ListPutter() {
		if (Cnd_stk_id_typ_p == null) {
			Cnd_stk_id_typ_p = createCnd_stk_id_typ_ListPutter(Cnd_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Cnd_stk_id_typ_p;
	}
	
	
	/** [Cnd_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_stk_bp_cd_p = null;

	/**
	 * [Cnd_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_bp_cd_ListPutter() {
		if (Cnd_stk_bp_cd_p == null) {
			Cnd_stk_bp_cd_p = createCnd_stk_bp_cd_ListPutter(Cnd_stk_bp_cd, "stk_bp_cd", "stk_bp_nm");

		}
		return Cnd_stk_bp_cd_p;
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
	
	
	/** [Cnd_io_schd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_io_schd_typ_p = null;

	/**
	 * [Cnd_io_schd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_schd_typ_ListPutter() {
		if (Cnd_io_schd_typ_p == null) {
			Cnd_io_schd_typ_p = createCnd_io_schd_typ_ListPutter(Cnd_io_schd_typ, "io_schd_typ", "io_schd_typ_nm");

		}
		return Cnd_io_schd_typ_p;
	}
	
	
	/** [Cnd_io_typ_ListPutter]の定義 */
	private MCListPutter Cnd_io_typ_p = null;

	/**
	 * [Cnd_io_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_typ_ListPutter() {
		if (Cnd_io_typ_p == null) {
			Cnd_io_typ_p = createCnd_io_typ_ListPutter(Cnd_io_typ, "io_typ", "io_typ_nm");

		}
		return Cnd_io_typ_p;
	}
	
	
	/** [Cnd_io_schd_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_io_schd_sts_typ_p = null;

	/**
	 * [Cnd_io_schd_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_schd_sts_typ_ListPutter() {
		if (Cnd_io_schd_sts_typ_p == null) {
			Cnd_io_schd_sts_typ_p = createCnd_io_schd_sts_typ_ListPutter(Cnd_io_schd_sts_typ, "io_schd_sts_typ", "io_schd_sts_typ_nm");

		}
		return Cnd_io_schd_sts_typ_p;
	}
	
	
	/** [Cnd_alloc_scope_typ_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_scope_typ_p = null;

	/**
	 * [Cnd_alloc_scope_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_scope_typ_ListPutter() {
		if (Cnd_alloc_scope_typ_p == null) {
			Cnd_alloc_scope_typ_p = createCnd_alloc_scope_typ_ListPutter(Cnd_alloc_scope_typ, "alloc_scope_typ", "alloc_scope_typ_nm");

		}
		return Cnd_alloc_scope_typ_p;
	}
	
	
	/** [Cnd_io_schd_sub_typ1_ListPutter]の定義 */
	private MCListPutter Cnd_io_schd_sub_typ1_p = null;

	/**
	 * [Cnd_io_schd_sub_typ1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_schd_sub_typ1_ListPutter() {
		if (Cnd_io_schd_sub_typ1_p == null) {
			Cnd_io_schd_sub_typ1_p = createCnd_io_schd_sub_typ1_ListPutter(Cnd_io_schd_sub_typ1, "io_schd_sub_typ1", "io_schd_sub_typ_nm1");

		}
		return Cnd_io_schd_sub_typ1_p;
	}
	
	
	/** [Cnd_io_schd_sub_typ2_ListPutter]の定義 */
	private MCListPutter Cnd_io_schd_sub_typ2_p = null;

	/**
	 * [Cnd_io_schd_sub_typ2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_schd_sub_typ2_ListPutter() {
		if (Cnd_io_schd_sub_typ2_p == null) {
			Cnd_io_schd_sub_typ2_p = createCnd_io_schd_sub_typ2_ListPutter(Cnd_io_schd_sub_typ2, "io_schd_sub_typ2", "io_schd_sub_typ_nm2");

		}
		return Cnd_io_schd_sub_typ2_p;
	}
	
	
	/** [Cnd_io_schd_sub_typ3_ListPutter]の定義 */
	private MCListPutter Cnd_io_schd_sub_typ3_p = null;

	/**
	 * [Cnd_io_schd_sub_typ3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_schd_sub_typ3_ListPutter() {
		if (Cnd_io_schd_sub_typ3_p == null) {
			Cnd_io_schd_sub_typ3_p = createCnd_io_schd_sub_typ3_ListPutter(Cnd_io_schd_sub_typ3, "io_schd_sub_typ3", "io_schd_sub_typ_nm3");

		}
		return Cnd_io_schd_sub_typ3_p;
	}
	
	
	/** [Cnd_io_schd_sub_typ4_ListPutter]の定義 */
	private MCListPutter Cnd_io_schd_sub_typ4_p = null;

	/**
	 * [Cnd_io_schd_sub_typ4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_schd_sub_typ4_ListPutter() {
		if (Cnd_io_schd_sub_typ4_p == null) {
			Cnd_io_schd_sub_typ4_p = createCnd_io_schd_sub_typ4_ListPutter(Cnd_io_schd_sub_typ4, "io_schd_sub_typ4", "io_schd_sub_typ_nm4");

		}
		return Cnd_io_schd_sub_typ4_p;
	}
	
	
	/** [Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IoSchdSrch create(){
		MSBEP_IoSchdSrch p = new MSBEP_IoSchdSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IoSchdSrch create(String name){
		MSBEP_IoSchdSrch p = new MSBEP_IoSchdSrch(name);
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
		MSBEP_IoSchdSrch_MC.jbfInitTop((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitFold((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitTab1((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitTab2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitTab3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitSno1Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitSno2Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitSno3Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitSno4Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitCnd_2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitAllocTgt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitAlloc((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitAllocWait((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitCnd_3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitItmCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitDispCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitCtrl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitRPnl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitRslt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbfInitBtn((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitTop((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitFold((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitTab1((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitTab2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitTab3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitSno1Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitSno2Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitSno3Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitSno4Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitCnd_2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitAllocTgt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitAlloc((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitAllocWait((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitCnd_3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitItmCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitDispCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitCtrl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitRPnl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitRslt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.jbInitBtn((MSBEP_IoSchdSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_IoSchdSrch p) {
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
	protected static void jbfInitTab1(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.schd_dt_fr_Label");
		p.Cnd_schd_dt_fr = p.beansFactory.createDateField("Cnd.schd_dt_fr");
		p.Cnd_schd_dt_fr.setLabel(p.Cnd_schd_dt_fr_Label);
		p.Cnd_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.schd_dt_to_Label");
		p.Cnd_schd_dt_to = p.beansFactory.createDateField("Cnd.schd_dt_to");
		p.Cnd_schd_dt_to.setLabel(p.Cnd_schd_dt_to_Label);
		p.Cnd_accpt_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.accpt_schd_dt_fr_Label");
		p.Cnd_accpt_schd_dt_fr = p.beansFactory.createDateField("Cnd.accpt_schd_dt_fr");
		p.Cnd_accpt_schd_dt_fr.setLabel(p.Cnd_accpt_schd_dt_fr_Label);
		p.Cnd_accpt_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.accpt_schd_dt_to_Label");
		p.Cnd_accpt_schd_dt_to = p.beansFactory.createDateField("Cnd.accpt_schd_dt_to");
		p.Cnd_accpt_schd_dt_to.setLabel(p.Cnd_accpt_schd_dt_to_Label);
		p.Cnd_avl_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.avl_schd_dt_fr_Label");
		p.Cnd_avl_schd_dt_fr = p.beansFactory.createDateField("Cnd.avl_schd_dt_fr");
		p.Cnd_avl_schd_dt_fr.setLabel(p.Cnd_avl_schd_dt_fr_Label);
		p.Cnd_avl_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.avl_schd_dt_to_Label");
		p.Cnd_avl_schd_dt_to = p.beansFactory.createDateField("Cnd.avl_schd_dt_to");
		p.Cnd_avl_schd_dt_to.setLabel(p.Cnd_avl_schd_dt_to_Label);
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_stk_arrv_bp_cd_Label = p.beansFactory.createLabel("Cnd.stk_arrv_bp_cd_Label");
		p.Cnd_stk_arrv_bp_cd = p.beansFactory.createTextField("Cnd.stk_arrv_bp_cd");
		p.Cnd_stk_arrv_bp_cd.setLabel(p.Cnd_stk_arrv_bp_cd_Label);
		p.Cnd_stk_arrv_bp_nm = p.beansFactory.createTextField("Cnd.stk_arrv_bp_nm");
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
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextComboBox("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_sno1_null_ng_flg = p.beansFactory.createCheckBox("Cnd.sno1_null_ng_flg");
		p.Cnd_sno1_null_ok_flg = p.beansFactory.createCheckBox("Cnd.sno1_null_ok_flg");
		p.Cnd_sno2_null_ng_flg = p.beansFactory.createCheckBox("Cnd.sno2_null_ng_flg");
		p.Cnd_sno2_null_ok_flg = p.beansFactory.createCheckBox("Cnd.sno2_null_ok_flg");
		p.Cnd_sno3_null_ng_flg = p.beansFactory.createCheckBox("Cnd.sno3_null_ng_flg");
		p.Cnd_sno3_null_ok_flg = p.beansFactory.createCheckBox("Cnd.sno3_null_ok_flg");
		p.Cnd_sno4_null_ng_flg = p.beansFactory.createCheckBox("Cnd.sno4_null_ng_flg");
		p.Cnd_sno4_null_ok_flg = p.beansFactory.createCheckBox("Cnd.sno4_null_ok_flg");
		p.Cnd_pack_unit_cd_Label = p.beansFactory.createLabel("Cnd.pack_unit_cd_Label");
		p.Cnd_pack_unit_cd = p.beansFactory.createTextComboBox("Cnd.pack_unit_cd");
		p.Cnd_pack_unit_cd.setLabel(p.Cnd_pack_unit_cd_Label);
		p.Cnd_pack_unit_nm = p.beansFactory.createTextField("Cnd.pack_unit_nm");
		p.Cnd_alt_grp_cd_Label = p.beansFactory.createLabel("Cnd.alt_grp_cd_Label");
		p.Cnd_alt_grp_cd = p.beansFactory.createTextComboBox("Cnd.alt_grp_cd");
		p.Cnd_alt_grp_cd.setLabel(p.Cnd_alt_grp_cd_Label);
		p.Cnd_alt_grp_nm = p.beansFactory.createTextField("Cnd.alt_grp_nm");
		p.Cnd_oper_inst_no_Label = p.beansFactory.createLabel("Cnd.oper_inst_no_Label");
		p.Cnd_oper_inst_no = p.beansFactory.createTextField("Cnd.oper_inst_no");
		p.Cnd_oper_inst_no.setLabel(p.Cnd_oper_inst_no_Label);
		p.Cnd_oper_ord_no_Label = p.beansFactory.createLabel("Cnd.oper_ord_no_Label");
		p.Cnd_oper_ord_no = p.beansFactory.createTextField("Cnd.oper_ord_no");
		p.Cnd_oper_ord_no.setLabel(p.Cnd_oper_ord_no_Label);
		p.Cnd_alt_itm_typ_Label = p.beansFactory.createLabel("Cnd.alt_itm_typ_Label");
		p.Cnd_alt_itm_typ = p.beansFactory.createTextComboBox("Cnd.alt_itm_typ");
		p.Cnd_alt_itm_typ.setLabel(p.Cnd_alt_itm_typ_Label);
		p.Cnd_alt_itm_typ_nm = p.beansFactory.createTextField("Cnd.alt_itm_typ_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_in_xfr_typ_Label = p.beansFactory.createLabel("Cnd.in_xfr_typ_Label");
		p.Cnd_in_xfr_typ = p.beansFactory.createTextComboBox("Cnd.in_xfr_typ");
		p.Cnd_in_xfr_typ.setLabel(p.Cnd_in_xfr_typ_Label);
		p.Cnd_in_xfr_typ_nm = p.beansFactory.createTextField("Cnd.in_xfr_typ_nm");
		p.Cnd_quality_typ_Label = p.beansFactory.createLabel("Cnd.quality_typ_Label");
		p.Cnd_quality_typ = p.beansFactory.createTextComboBox("Cnd.quality_typ");
		p.Cnd_quality_typ.setLabel(p.Cnd_quality_typ_Label);
		p.Cnd_quality_typ_nm = p.beansFactory.createTextField("Cnd.quality_typ_nm");
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_stk_insp_typ_Label = p.beansFactory.createLabel("Cnd.stk_insp_typ_Label");
		p.Cnd_stk_insp_typ = p.beansFactory.createTextComboBox("Cnd.stk_insp_typ");
		p.Cnd_stk_insp_typ.setLabel(p.Cnd_stk_insp_typ_Label);
		p.Cnd_stk_insp_typ_nm = p.beansFactory.createTextField("Cnd.stk_insp_typ_nm");
		p.Cnd_stk_id_typ_Label = p.beansFactory.createLabel("Cnd.stk_id_typ_Label");
		p.Cnd_stk_id_typ = p.beansFactory.createTextComboBox("Cnd.stk_id_typ");
		p.Cnd_stk_id_typ.setLabel(p.Cnd_stk_id_typ_Label);
		p.Cnd_stk_id_typ_nm = p.beansFactory.createTextField("Cnd.stk_id_typ_nm");
		p.Cnd_stk_bp_cd_Label = p.beansFactory.createLabel("Cnd.stk_bp_cd_Label");
		p.Cnd_stk_bp_cd = p.beansFactory.createTextField("Cnd.stk_bp_cd");
		p.Cnd_stk_bp_cd.setLabel(p.Cnd_stk_bp_cd_Label);
		p.Cnd_stk_bp_nm = p.beansFactory.createTextField("Cnd.stk_bp_nm");
		p.Cnd_inpt_ctl_typ_Label = p.beansFactory.createLabel("Cnd.inpt_ctl_typ_Label");
		p.Cnd_inpt_ctl_typ = p.beansFactory.createTextComboBox("Cnd.inpt_ctl_typ");
		p.Cnd_inpt_ctl_typ.setLabel(p.Cnd_inpt_ctl_typ_Label);
		p.Cnd_inpt_ctl_typ_nm = p.beansFactory.createTextField("Cnd.inpt_ctl_typ_nm");
		p.Cnd_io_schd_typ_Label = p.beansFactory.createLabel("Cnd.io_schd_typ_Label");
		p.Cnd_io_schd_typ = p.beansFactory.createTextComboBox("Cnd.io_schd_typ");
		p.Cnd_io_schd_typ.setLabel(p.Cnd_io_schd_typ_Label);
		p.Cnd_io_schd_typ_nm = p.beansFactory.createTextField("Cnd.io_schd_typ_nm");
		p.Cnd_io_typ_Label = p.beansFactory.createLabel("Cnd.io_typ_Label");
		p.Cnd_io_typ = p.beansFactory.createTextComboBox("Cnd.io_typ");
		p.Cnd_io_typ.setLabel(p.Cnd_io_typ_Label);
		p.Cnd_io_typ_nm = p.beansFactory.createTextField("Cnd.io_typ_nm");
		p.Cnd_io_schd_sts_typ_Label = p.beansFactory.createLabel("Cnd.io_schd_sts_typ_Label");
		p.Cnd_io_schd_sts_typ = p.beansFactory.createTextComboBox("Cnd.io_schd_sts_typ");
		p.Cnd_io_schd_sts_typ.setLabel(p.Cnd_io_schd_sts_typ_Label);
		p.Cnd_io_schd_sts_typ_nm = p.beansFactory.createTextField("Cnd.io_schd_sts_typ_nm");
		p.Cnd_alloc_scope_typ_Label = p.beansFactory.createLabel("Cnd.alloc_scope_typ_Label");
		p.Cnd_alloc_scope_typ = p.beansFactory.createTextComboBox("Cnd.alloc_scope_typ");
		p.Cnd_alloc_scope_typ.setLabel(p.Cnd_alloc_scope_typ_Label);
		p.Cnd_alloc_scope_typ_nm = p.beansFactory.createTextField("Cnd.alloc_scope_typ_nm");
		p.Cnd_non_alloc_tgt_flg = p.beansFactory.createCheckBox("Cnd.non_alloc_tgt_flg");
		p.Cnd_is_alloc_tgt_flg = p.beansFactory.createCheckBox("Cnd.is_alloc_tgt_flg");
		p.Cnd_yet_allocate_flg = p.beansFactory.createCheckBox("Cnd.yet_allocate_flg");
		p.Cnd_allocated_flg = p.beansFactory.createCheckBox("Cnd.allocated_flg");
		p.Cnd_non_alloc_wait_flg = p.beansFactory.createCheckBox("Cnd.non_alloc_wait_flg");
		p.Cnd_is_alloc_wait_flg = p.beansFactory.createCheckBox("Cnd.is_alloc_wait_flg");
		p.Cnd_io_schd_no_Label = p.beansFactory.createLabel("Cnd.io_schd_no_Label");
		p.Cnd_io_schd_no = p.beansFactory.createTextField("Cnd.io_schd_no");
		p.Cnd_io_schd_no.setLabel(p.Cnd_io_schd_no_Label);
		p.Cnd_io_schd_sub_typ1_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_typ1_Label");
		p.Cnd_io_schd_sub_typ1 = p.beansFactory.createTextComboBox("Cnd.io_schd_sub_typ1");
		p.Cnd_io_schd_sub_typ1.setLabel(p.Cnd_io_schd_sub_typ1_Label);
		p.Cnd_io_schd_sub_typ_nm1 = p.beansFactory.createTextField("Cnd.io_schd_sub_typ_nm1");
		p.Cnd_io_schd_sub_no1_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_no1_Label");
		p.Cnd_io_schd_sub_no1 = p.beansFactory.createTextField("Cnd.io_schd_sub_no1");
		p.Cnd_io_schd_sub_no1.setLabel(p.Cnd_io_schd_sub_no1_Label);
		p.Cnd_io_schd_sub_typ2_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_typ2_Label");
		p.Cnd_io_schd_sub_typ2 = p.beansFactory.createTextComboBox("Cnd.io_schd_sub_typ2");
		p.Cnd_io_schd_sub_typ2.setLabel(p.Cnd_io_schd_sub_typ2_Label);
		p.Cnd_io_schd_sub_typ_nm2 = p.beansFactory.createTextField("Cnd.io_schd_sub_typ_nm2");
		p.Cnd_io_schd_sub_no2_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_no2_Label");
		p.Cnd_io_schd_sub_no2 = p.beansFactory.createTextField("Cnd.io_schd_sub_no2");
		p.Cnd_io_schd_sub_no2.setLabel(p.Cnd_io_schd_sub_no2_Label);
		p.Cnd_io_schd_sub_typ3_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_typ3_Label");
		p.Cnd_io_schd_sub_typ3 = p.beansFactory.createTextComboBox("Cnd.io_schd_sub_typ3");
		p.Cnd_io_schd_sub_typ3.setLabel(p.Cnd_io_schd_sub_typ3_Label);
		p.Cnd_io_schd_sub_typ_nm3 = p.beansFactory.createTextField("Cnd.io_schd_sub_typ_nm3");
		p.Cnd_io_schd_sub_no3_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_no3_Label");
		p.Cnd_io_schd_sub_no3 = p.beansFactory.createTextField("Cnd.io_schd_sub_no3");
		p.Cnd_io_schd_sub_no3.setLabel(p.Cnd_io_schd_sub_no3_Label);
		p.Cnd_io_schd_sub_typ4_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_typ4_Label");
		p.Cnd_io_schd_sub_typ4 = p.beansFactory.createTextComboBox("Cnd.io_schd_sub_typ4");
		p.Cnd_io_schd_sub_typ4.setLabel(p.Cnd_io_schd_sub_typ4_Label);
		p.Cnd_io_schd_sub_typ_nm4 = p.beansFactory.createTextField("Cnd.io_schd_sub_typ_nm4");
		p.Cnd_io_schd_sub_no4_Label = p.beansFactory.createLabel("Cnd.io_schd_sub_no4_Label");
		p.Cnd_io_schd_sub_no4 = p.beansFactory.createTextField("Cnd.io_schd_sub_no4");
		p.Cnd_io_schd_sub_no4.setLabel(p.Cnd_io_schd_sub_no4_Label);
		p.Cnd_io_schd_pr_no_Label = p.beansFactory.createLabel("Cnd.io_schd_pr_no_Label");
		p.Cnd_io_schd_pr_no = p.beansFactory.createTextField("Cnd.io_schd_pr_no");
		p.Cnd_io_schd_pr_no.setLabel(p.Cnd_io_schd_pr_no_Label);
		p.Cnd_slip_schd_no_Label = p.beansFactory.createLabel("Cnd.slip_schd_no_Label");
		p.Cnd_slip_schd_no = p.beansFactory.createTextField("Cnd.slip_schd_no");
		p.Cnd_slip_schd_no.setLabel(p.Cnd_slip_schd_no_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_sub_char4_Label = p.beansFactory.createLabel("Cnd.sub_char4_Label");
		p.Cnd_sub_char4 = p.beansFactory.createTextField("Cnd.sub_char4");
		p.Cnd_sub_char4.setLabel(p.Cnd_sub_char4_Label);
		p.Cnd_sub_char5_Label = p.beansFactory.createLabel("Cnd.sub_char5_Label");
		p.Cnd_sub_char5 = p.beansFactory.createTextField("Cnd.sub_char5");
		p.Cnd_sub_char5.setLabel(p.Cnd_sub_char5_Label);
		p.Cnd_sub_dt1_Label = p.beansFactory.createLabel("Cnd.sub_dt1_Label");
		p.Cnd_sub_dt1 = p.beansFactory.createDateField("Cnd.sub_dt1");
		p.Cnd_sub_dt1.setLabel(p.Cnd_sub_dt1_Label);
		p.Cnd_sub_dt2_Label = p.beansFactory.createLabel("Cnd.sub_dt2_Label");
		p.Cnd_sub_dt2 = p.beansFactory.createDateField("Cnd.sub_dt2");
		p.Cnd_sub_dt2.setLabel(p.Cnd_sub_dt2_Label);
		p.Cnd_sub_dt3_Label = p.beansFactory.createLabel("Cnd.sub_dt3_Label");
		p.Cnd_sub_dt3 = p.beansFactory.createDateField("Cnd.sub_dt3");
		p.Cnd_sub_dt3.setLabel(p.Cnd_sub_dt3_Label);
		p.Cnd_slip_schd_no_flg = p.beansFactory.createCheckBox("Cnd.slip_schd_no_flg");
		p.Cnd_schd_dt_flg = p.beansFactory.createCheckBox("Cnd.schd_dt_flg");
		p.Cnd_accpt_schd_dt_flg = p.beansFactory.createCheckBox("Cnd.accpt_schd_dt_flg");
		p.Cnd_avl_schd_dt_flg = p.beansFactory.createCheckBox("Cnd.avl_schd_dt_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_str_ln_flg = p.beansFactory.createCheckBox("Cnd.str_ln_flg");
		p.Cnd_stk_arrv_flg = p.beansFactory.createCheckBox("Cnd.stk_arrv_flg");
		p.Cnd_site_flg = p.beansFactory.createCheckBox("Cnd.site_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_lg_grp_flg = p.beansFactory.createCheckBox("Cnd.lg_grp_flg");
		p.Cnd_alloc_grp_flg = p.beansFactory.createCheckBox("Cnd.alloc_grp_flg");
		p.Cnd_loc_grp_flg = p.beansFactory.createCheckBox("Cnd.loc_grp_flg");
		p.Cnd_sppl_flg = p.beansFactory.createCheckBox("Cnd.sppl_flg");
		p.Cnd_lot_no_flg = p.beansFactory.createCheckBox("Cnd.lot_no_flg");
		p.Cnd_sublot_no_flg = p.beansFactory.createCheckBox("Cnd.sublot_no_flg");
		p.Cnd_pack_flg = p.beansFactory.createCheckBox("Cnd.pack_flg");
		p.Cnd_alt_grp_flg = p.beansFactory.createCheckBox("Cnd.alt_grp_flg");
		p.Cnd_gd_flg = p.beansFactory.createCheckBox("Cnd.gd_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Sno1Null]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSno1Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno1NullPanel = p.beansFactory.createPanel("Sno1Null");
		p.Sno1NullTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sno2Null]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSno2Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno2NullPanel = p.beansFactory.createPanel("Sno2Null");
		p.Sno2NullTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sno3Null]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSno3Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno3NullPanel = p.beansFactory.createPanel("Sno3Null");
		p.Sno3NullTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sno4Null]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSno4Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno4NullPanel = p.beansFactory.createPanel("Sno4Null");
		p.Sno4NullTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd_2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd_2(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Cnd_2Panel = p.beansFactory.createPanel("Cnd_2");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocTgt(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.AllocTgtPanel = p.beansFactory.createPanel("AllocTgt");
		p.AllocTgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Alloc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAlloc(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.AllocPanel = p.beansFactory.createPanel("Alloc");
		p.AllocTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [AllocWait]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocWait(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.AllocWaitPanel = p.beansFactory.createPanel("AllocWait");
		p.AllocWaitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd_3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd_3(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Cnd_3Panel = p.beansFactory.createPanel("Cnd_3");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [DispCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispCnd(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.DispCndPanel = p.beansFactory.createPanel("DispCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_slip_schd_no = p.beansFactory.createTableColumn("Rslt.slip_schd_no", MCColumnType.TEXT);
		p.columnRslt_schd_dt = p.beansFactory.createTableColumn("Rslt.schd_dt", MCColumnType.DATE);
		p.columnRslt_accpt_schd_dt = p.beansFactory.createTableColumn("Rslt.accpt_schd_dt", MCColumnType.DATE);
		p.columnRslt_avl_schd_dt = p.beansFactory.createTableColumn("Rslt.avl_schd_dt", MCColumnType.DATE);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_gi_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.gi_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_cd = p.beansFactory.createTableColumn("Rslt.alloc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_nm = p.beansFactory.createTableColumn("Rslt.alloc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_typ = p.beansFactory.createTableColumn("Rslt.io_schd_typ", MCColumnType.TEXT);
		p.columnRslt_io_schd_typ_nm = p.beansFactory.createTableColumn("Rslt.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_sts_typ = p.beansFactory.createTableColumn("Rslt.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRslt_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_typ = p.beansFactory.createTableColumn("Rslt.io_typ", MCColumnType.TEXT);
		p.columnRslt_io_typ_nm = p.beansFactory.createTableColumn("Rslt.io_typ_nm", MCColumnType.TEXT);
		p.columnRslt_i_pack_unit_qty = p.beansFactory.createTableColumn("Rslt.i_pack_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_o_pack_unit_qty = p.beansFactory.createTableColumn("Rslt.o_pack_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_i_base_unit_qty = p.beansFactory.createTableColumn("Rslt.i_base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_o_base_unit_qty = p.beansFactory.createTableColumn("Rslt.o_base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_alt_grp_cd = p.beansFactory.createTableColumn("Rslt.alt_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alt_grp_nm = p.beansFactory.createTableColumn("Rslt.alt_grp_nm", MCColumnType.TEXT);
		p.columnRslt_alt_grp_seq = p.beansFactory.createTableColumn("Rslt.alt_grp_seq", MCColumnType.NUMBER);
		p.columnRslt_oper_inst_no = p.beansFactory.createTableColumn("Rslt.oper_inst_no", MCColumnType.TEXT);
		p.columnRslt_oper_ord_no = p.beansFactory.createTableColumn("Rslt.oper_ord_no", MCColumnType.TEXT);
		p.columnRslt_alt_qty = p.beansFactory.createTableColumn("Rslt.alt_qty", MCColumnType.NUMBER);
		p.columnRslt_alt_itm_typ = p.beansFactory.createTableColumn("Rslt.alt_itm_typ", MCColumnType.TEXT);
		p.columnRslt_alt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.alt_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alt_itm_ratio = p.beansFactory.createTableColumn("Rslt.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnRslt_alt_alloc_prio = p.beansFactory.createTableColumn("Rslt.alt_alloc_prio", MCColumnType.NUMBER);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ = p.beansFactory.createTableColumn("Rslt.in_xfr_typ", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ_nm = p.beansFactory.createTableColumn("Rslt.in_xfr_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT);
		p.columnRslt_asst_typ_nm = p.beansFactory.createTableColumn("Rslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_tgt_flg = p.beansFactory.createTableColumn("Rslt.alloc_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_alloc_scope_typ = p.beansFactory.createTableColumn("Rslt.alloc_scope_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_scope_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_scope_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_alloc_wait_flg = p.beansFactory.createTableColumn("Rslt.alloc_wait_flg", MCColumnType.CHECK);
		p.columnRslt_vld_dt_fr = p.beansFactory.createTableColumn("Rslt.vld_dt_fr", MCColumnType.DATE);
		p.columnRslt_vld_dt_to = p.beansFactory.createTableColumn("Rslt.vld_dt_to", MCColumnType.DATE);
		p.columnRslt_inpt_ctl_typ = p.beansFactory.createTableColumn("Rslt.inpt_ctl_typ", MCColumnType.TEXT);
		p.columnRslt_inpt_ctl_typ_nm = p.beansFactory.createTableColumn("Rslt.inpt_ctl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_no = p.beansFactory.createTableColumn("Rslt.io_schd_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_seq = p.beansFactory.createTableColumn("Rslt.io_schd_seq", MCColumnType.NUMBER);
		p.columnRslt_io_schd_sub_typ1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ1", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm1", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no1", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_seq1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_seq1", MCColumnType.NUMBER);
		p.columnRslt_io_schd_sub_typ2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ2", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm2", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no2", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_seq2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_seq2", MCColumnType.NUMBER);
		p.columnRslt_io_schd_sub_typ3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ3", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm3", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no3", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_seq3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_seq3", MCColumnType.NUMBER);
		p.columnRslt_io_schd_sub_typ4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ4", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm4", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no4", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_seq4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_seq4", MCColumnType.NUMBER);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_sub_char4 = p.beansFactory.createTableColumn("Rslt.sub_char4", MCColumnType.TEXT);
		p.columnRslt_sub_char5 = p.beansFactory.createTableColumn("Rslt.sub_char5", MCColumnType.TEXT);
		p.columnRslt_sub_num1 = p.beansFactory.createTableColumn("Rslt.sub_num1", MCColumnType.NUMBER);
		p.columnRslt_sub_num2 = p.beansFactory.createTableColumn("Rslt.sub_num2", MCColumnType.NUMBER);
		p.columnRslt_sub_num3 = p.beansFactory.createTableColumn("Rslt.sub_num3", MCColumnType.NUMBER);
		p.columnRslt_sub_dt1 = p.beansFactory.createTableColumn("Rslt.sub_dt1", MCColumnType.DATE);
		p.columnRslt_sub_dt2 = p.beansFactory.createTableColumn("Rslt.sub_dt2", MCColumnType.DATE);
		p.columnRslt_sub_dt3 = p.beansFactory.createTableColumn("Rslt.sub_dt3", MCColumnType.DATE);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_open_MSBEP0040 = p.beansFactory.createButton("Btn.open_MSBEP0040", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
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
	protected static void jbInitFold(MSBEP_IoSchdSrch p) {
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
	protected static void jbInitTab1(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.Sno1NullPanel);
		p.Tab1Panel.add(p.Sno1NullPanel, null);
		p.Sno1NullPanel.setNextBeans(p.Sno2NullPanel);
		p.Tab1Panel.add(p.Sno2NullPanel, null);
		p.Sno2NullPanel.setNextBeans(p.Sno3NullPanel);
		p.Tab1Panel.add(p.Sno3NullPanel, null);
		p.Sno3NullPanel.setNextBeans(p.Sno4NullPanel);
		p.Tab1Panel.add(p.Sno4NullPanel, null);
		p.Sno4NullPanel.setNextBeans(p.Cnd_2Panel);
		p.Tab1Panel.add(p.Cnd_2Panel, null);
		p.Cnd_2Panel.setNextBeans(p.AllocTgtPanel);
		p.Tab1Panel.add(p.AllocTgtPanel, null);
		p.AllocTgtPanel.setNextBeans(p.AllocPanel);
		p.Tab1Panel.add(p.AllocPanel, null);
		p.AllocPanel.setNextBeans(p.AllocWaitPanel);
		p.Tab1Panel.add(p.AllocWaitPanel, null);
		p.AllocWaitPanel.setNextBeans(p.Cnd_3Panel);
		p.Tab1Panel.add(p.Cnd_3Panel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_IoSchdSrch p) {
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
	protected static void jbInitTab3(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DispCndPanel, null);
		p.Tab3Panel.setLastBeans(p.DispCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_schd_dt_fr);
		p.Cnd_schd_dt_fr.setNextBeans(p.Cnd_schd_dt_to);
		p.Cnd_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.schd_dt_fr_META);
		p.Cnd_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_schd_dt_to);
		p.Cnd_schd_dt_to.setNextBeans(p.Cnd_accpt_schd_dt_fr);
		p.Cnd_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.schd_dt_to_META);
		p.Cnd_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_fr);
		p.Cnd_accpt_schd_dt_fr.setNextBeans(p.Cnd_accpt_schd_dt_to);
		p.Cnd_accpt_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.accpt_schd_dt_fr_META);
		p.Cnd_accpt_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_to);
		p.Cnd_accpt_schd_dt_to.setNextBeans(p.Cnd_avl_schd_dt_fr);
		p.Cnd_accpt_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.accpt_schd_dt_to_META);
		p.Cnd_accpt_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_avl_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_avl_schd_dt_fr);
		p.Cnd_avl_schd_dt_fr.setNextBeans(p.Cnd_avl_schd_dt_to);
		p.Cnd_avl_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.avl_schd_dt_fr_META);
		p.Cnd_avl_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_avl_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_avl_schd_dt_to);
		p.Cnd_avl_schd_dt_to.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_avl_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.avl_schd_dt_to_META);
		p.Cnd_avl_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_stk_arrv_bp_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_stk_arrv_bp_cd_Label);
		p.CndPanel.add(p.Cnd_stk_arrv_bp_cd);
		p.Cnd_stk_arrv_bp_cd.setNextBeans(p.Cnd_stk_arrv_bp_nm);
		p.Cnd_stk_arrv_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_arrv_bp_cd_META);
		p.Cnd_stk_arrv_bp_cd.addLinkBeans(p.Cnd_stk_arrv_bp_nm);
		p.Cnd_stk_arrv_bp_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_stk_arrv_bp_nm);
		p.Cnd_stk_arrv_bp_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_stk_arrv_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_arrv_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_arrv_bp_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.Cnd_sppl_cd.setLinkBeans(p.Cnd_sppl_nm);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sppl_cd_META);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
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
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Sno1NullPanel.add(p.Cnd_sno1_null_ng_flg);
		p.Sno1NullPanel.setLastBeans(p.Cnd_sno1_null_ng_flg);
		p.Cnd_sno1_null_ng_flg.setNextBeans(p.Cnd_sno1_null_ok_flg);
		p.Cnd_sno1_null_ng_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno1_null_ng_flg_META);
		p.Sno1NullPanel.add(p.Cnd_sno1_null_ok_flg);
		p.Cnd_sno1_null_ok_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno1_null_ok_flg_META);
		p.Sno2NullPanel.add(p.Cnd_sno2_null_ng_flg);
		p.Sno2NullPanel.setLastBeans(p.Cnd_sno2_null_ng_flg);
		p.Cnd_sno2_null_ng_flg.setNextBeans(p.Cnd_sno2_null_ok_flg);
		p.Cnd_sno2_null_ng_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno2_null_ng_flg_META);
		p.Sno2NullPanel.add(p.Cnd_sno2_null_ok_flg);
		p.Cnd_sno2_null_ok_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno2_null_ok_flg_META);
		p.Sno3NullPanel.add(p.Cnd_sno3_null_ng_flg);
		p.Sno3NullPanel.setLastBeans(p.Cnd_sno3_null_ng_flg);
		p.Cnd_sno3_null_ng_flg.setNextBeans(p.Cnd_sno3_null_ok_flg);
		p.Cnd_sno3_null_ng_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno3_null_ng_flg_META);
		p.Sno3NullPanel.add(p.Cnd_sno3_null_ok_flg);
		p.Cnd_sno3_null_ok_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno3_null_ok_flg_META);
		p.Sno4NullPanel.add(p.Cnd_sno4_null_ng_flg);
		p.Sno4NullPanel.setLastBeans(p.Cnd_sno4_null_ng_flg);
		p.Cnd_sno4_null_ng_flg.setNextBeans(p.Cnd_sno4_null_ok_flg);
		p.Cnd_sno4_null_ng_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno4_null_ng_flg_META);
		p.Sno4NullPanel.add(p.Cnd_sno4_null_ok_flg);
		p.Cnd_sno4_null_ok_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sno4_null_ok_flg_META);
		p.Cnd_pack_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pack_unit_cd, true);
		p.Cnd_pack_unit_cd.setLinkBeans(p.Cnd_pack_unit_nm);
		p.Cnd_2Panel.add(p.Cnd_pack_unit_cd_Label);
		p.Cnd_2Panel.add(p.Cnd_pack_unit_cd);
		p.Cnd_2Panel.setLastBeans(p.Cnd_pack_unit_cd);
		p.Cnd_pack_unit_cd.setNextBeans(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.pack_unit_cd_META);
		p.Cnd_2Panel.add(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_nm.setNextBeans(p.Cnd_alt_grp_cd);
		p.Cnd_pack_unit_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.pack_unit_nm_META);
		p.setPluralValueEnable(p.Cnd_pack_unit_nm, true);
		p.Cnd_alt_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alt_grp_cd, true);
		p.Cnd_alt_grp_cd.setLinkBeans(p.Cnd_alt_grp_nm);
		p.Cnd_2Panel.add(p.Cnd_alt_grp_cd_Label);
		p.Cnd_2Panel.add(p.Cnd_alt_grp_cd);
		p.Cnd_alt_grp_cd.setNextBeans(p.Cnd_alt_grp_nm);
		p.Cnd_alt_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alt_grp_cd_META);
		p.Cnd_2Panel.add(p.Cnd_alt_grp_nm);
		p.Cnd_alt_grp_nm.setNextBeans(p.Cnd_oper_inst_no);
		p.Cnd_alt_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alt_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alt_grp_nm, true);
		p.Cnd_2Panel.add(p.Cnd_oper_inst_no_Label);
		p.Cnd_2Panel.add(p.Cnd_oper_inst_no);
		p.Cnd_oper_inst_no.setNextBeans(p.Cnd_oper_ord_no);
		p.Cnd_oper_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.oper_inst_no_META);
		p.setPluralValueEnable(p.Cnd_oper_inst_no, true);
		p.Cnd_2Panel.add(p.Cnd_oper_ord_no_Label);
		p.Cnd_2Panel.add(p.Cnd_oper_ord_no);
		p.Cnd_oper_ord_no.setNextBeans(p.Cnd_alt_itm_typ);
		p.Cnd_oper_ord_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.oper_ord_no_META);
		p.setPluralValueEnable(p.Cnd_oper_ord_no, true);
		p.Cnd_alt_itm_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alt_itm_typ, true);
		p.Cnd_alt_itm_typ.setLinkBeans(p.Cnd_alt_itm_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_alt_itm_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_alt_itm_typ);
		p.Cnd_alt_itm_typ.setNextBeans(p.Cnd_alt_itm_typ_nm);
		p.Cnd_alt_itm_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alt_itm_typ_META);
		p.Cnd_2Panel.add(p.Cnd_alt_itm_typ_nm);
		p.Cnd_alt_itm_typ_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_alt_itm_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alt_itm_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_alt_itm_typ_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.Cnd_2Panel.add(p.Cnd_gd_cd_Label);
		p.Cnd_2Panel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.gd_cd_META);
		p.Cnd_2Panel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_in_xfr_typ);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.Cnd_in_xfr_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_xfr_typ, true);
		p.Cnd_in_xfr_typ.setLinkBeans(p.Cnd_in_xfr_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_in_xfr_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_in_xfr_typ);
		p.Cnd_in_xfr_typ.setNextBeans(p.Cnd_in_xfr_typ_nm);
		p.Cnd_in_xfr_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.in_xfr_typ_META);
		p.Cnd_2Panel.add(p.Cnd_in_xfr_typ_nm);
		p.Cnd_in_xfr_typ_nm.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_in_xfr_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.in_xfr_typ_nm_META);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_quality_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.quality_typ_META);
		p.Cnd_2Panel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.quality_typ_nm_META);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_asst_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.asst_typ_META);
		p.Cnd_2Panel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_stk_insp_typ);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.asst_typ_nm_META);
		p.Cnd_stk_insp_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_insp_typ, true);
		p.Cnd_stk_insp_typ.setLinkBeans(p.Cnd_stk_insp_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_stk_insp_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_stk_insp_typ);
		p.Cnd_stk_insp_typ.setNextBeans(p.Cnd_stk_insp_typ_nm);
		p.Cnd_stk_insp_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_insp_typ_META);
		p.Cnd_2Panel.add(p.Cnd_stk_insp_typ_nm);
		p.Cnd_stk_insp_typ_nm.setNextBeans(p.Cnd_stk_id_typ);
		p.Cnd_stk_insp_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_insp_typ_nm_META);
		p.Cnd_stk_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_id_typ, true);
		p.Cnd_stk_id_typ.setLinkBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_stk_id_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_stk_id_typ);
		p.Cnd_stk_id_typ.setNextBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_id_typ_META);
		p.Cnd_2Panel.add(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ_nm.setNextBeans(p.Cnd_stk_bp_cd);
		p.Cnd_stk_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_id_typ_nm_META);
		p.Cnd_2Panel.add(p.Cnd_stk_bp_cd_Label);
		p.Cnd_2Panel.add(p.Cnd_stk_bp_cd);
		p.Cnd_stk_bp_cd.setNextBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_bp_cd_META);
		p.Cnd_stk_bp_cd.addLinkBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_bp_cd, true);
		p.Cnd_2Panel.add(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_nm.setNextBeans(p.Cnd_inpt_ctl_typ);
		p.Cnd_stk_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_bp_nm, true);
		p.Cnd_inpt_ctl_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_ctl_typ, true);
		p.Cnd_inpt_ctl_typ.setLinkBeans(p.Cnd_inpt_ctl_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_inpt_ctl_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_inpt_ctl_typ);
		p.Cnd_inpt_ctl_typ.setNextBeans(p.Cnd_inpt_ctl_typ_nm);
		p.Cnd_inpt_ctl_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.inpt_ctl_typ_META);
		p.Cnd_2Panel.add(p.Cnd_inpt_ctl_typ_nm);
		p.Cnd_inpt_ctl_typ_nm.setNextBeans(p.Cnd_io_schd_typ);
		p.Cnd_inpt_ctl_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.inpt_ctl_typ_nm_META);
		p.Cnd_io_schd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_schd_typ, true);
		p.Cnd_io_schd_typ.setLinkBeans(p.Cnd_io_schd_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_io_schd_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_io_schd_typ);
		p.Cnd_io_schd_typ.setNextBeans(p.Cnd_io_schd_typ_nm);
		p.Cnd_io_schd_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_typ_META);
		p.Cnd_2Panel.add(p.Cnd_io_schd_typ_nm);
		p.Cnd_io_schd_typ_nm.setNextBeans(p.Cnd_io_typ);
		p.Cnd_io_schd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_typ_nm_META);
		p.Cnd_io_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_typ, true);
		p.Cnd_io_typ.setLinkBeans(p.Cnd_io_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_io_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_io_typ);
		p.Cnd_io_typ.setNextBeans(p.Cnd_io_typ_nm);
		p.Cnd_io_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_typ_META);
		p.Cnd_2Panel.add(p.Cnd_io_typ_nm);
		p.Cnd_io_typ_nm.setNextBeans(p.Cnd_io_schd_sts_typ);
		p.Cnd_io_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_typ_nm_META);
		p.Cnd_io_schd_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_schd_sts_typ, true);
		p.Cnd_io_schd_sts_typ.setLinkBeans(p.Cnd_io_schd_sts_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_io_schd_sts_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_io_schd_sts_typ);
		p.Cnd_io_schd_sts_typ.setNextBeans(p.Cnd_io_schd_sts_typ_nm);
		p.Cnd_io_schd_sts_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sts_typ_META);
		p.Cnd_2Panel.add(p.Cnd_io_schd_sts_typ_nm);
		p.Cnd_io_schd_sts_typ_nm.setNextBeans(p.Cnd_alloc_scope_typ);
		p.Cnd_io_schd_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sts_typ_nm_META);
		p.Cnd_alloc_scope_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_scope_typ, true);
		p.Cnd_alloc_scope_typ.setLinkBeans(p.Cnd_alloc_scope_typ_nm);
		p.Cnd_2Panel.add(p.Cnd_alloc_scope_typ_Label);
		p.Cnd_2Panel.add(p.Cnd_alloc_scope_typ);
		p.Cnd_alloc_scope_typ.setNextBeans(p.Cnd_alloc_scope_typ_nm);
		p.Cnd_alloc_scope_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alloc_scope_typ_META);
		p.Cnd_2Panel.add(p.Cnd_alloc_scope_typ_nm);
		p.Cnd_alloc_scope_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alloc_scope_typ_nm_META);
		p.AllocTgtPanel.add(p.Cnd_non_alloc_tgt_flg);
		p.AllocTgtPanel.setLastBeans(p.Cnd_non_alloc_tgt_flg);
		p.Cnd_non_alloc_tgt_flg.setNextBeans(p.Cnd_is_alloc_tgt_flg);
		p.Cnd_non_alloc_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.non_alloc_tgt_flg_META);
		p.AllocTgtPanel.add(p.Cnd_is_alloc_tgt_flg);
		p.Cnd_is_alloc_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.is_alloc_tgt_flg_META);
		p.AllocPanel.add(p.Cnd_yet_allocate_flg);
		p.AllocPanel.setLastBeans(p.Cnd_yet_allocate_flg);
		p.Cnd_yet_allocate_flg.setNextBeans(p.Cnd_allocated_flg);
		p.Cnd_yet_allocate_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.yet_allocate_flg_META);
		p.AllocPanel.add(p.Cnd_allocated_flg);
		p.Cnd_allocated_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.allocated_flg_META);
		p.AllocWaitPanel.add(p.Cnd_non_alloc_wait_flg);
		p.AllocWaitPanel.setLastBeans(p.Cnd_non_alloc_wait_flg);
		p.Cnd_non_alloc_wait_flg.setNextBeans(p.Cnd_is_alloc_wait_flg);
		p.Cnd_non_alloc_wait_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.non_alloc_wait_flg_META);
		p.AllocWaitPanel.add(p.Cnd_is_alloc_wait_flg);
		p.Cnd_is_alloc_wait_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.is_alloc_wait_flg_META);
		p.Cnd_3Panel.add(p.Cnd_dt_p_PPanel);
		p.Cnd_3Panel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_io_schd_no);
		p.Cnd_3Panel.add(p.Cnd_io_schd_no_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_no);
		p.Cnd_io_schd_no.setNextBeans(p.Cnd_io_schd_sub_typ1);
		p.Cnd_io_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_no_META);
		p.setPluralValueEnable(p.Cnd_io_schd_no, true);
		p.Cnd_io_schd_sub_typ1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_typ1, true);
		p.Cnd_io_schd_sub_typ1.setLinkBeans(p.Cnd_io_schd_sub_typ_nm1);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ1_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ1);
		p.Cnd_io_schd_sub_typ1.setNextBeans(p.Cnd_io_schd_sub_typ_nm1);
		p.Cnd_io_schd_sub_typ1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ1_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ_nm1);
		p.Cnd_io_schd_sub_typ_nm1.setNextBeans(p.Cnd_io_schd_sub_no1);
		p.Cnd_io_schd_sub_typ_nm1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ_nm1_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no1_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no1);
		p.Cnd_io_schd_sub_no1.setNextBeans(p.Cnd_io_schd_sub_typ2);
		p.Cnd_io_schd_sub_no1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_no1_META);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_no1, true);
		p.Cnd_io_schd_sub_typ2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_typ2, true);
		p.Cnd_io_schd_sub_typ2.setLinkBeans(p.Cnd_io_schd_sub_typ_nm2);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ2_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ2);
		p.Cnd_io_schd_sub_typ2.setNextBeans(p.Cnd_io_schd_sub_typ_nm2);
		p.Cnd_io_schd_sub_typ2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ2_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ_nm2);
		p.Cnd_io_schd_sub_typ_nm2.setNextBeans(p.Cnd_io_schd_sub_no2);
		p.Cnd_io_schd_sub_typ_nm2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ_nm2_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no2_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no2);
		p.Cnd_io_schd_sub_no2.setNextBeans(p.Cnd_io_schd_sub_typ3);
		p.Cnd_io_schd_sub_no2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_no2_META);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_no2, true);
		p.Cnd_io_schd_sub_typ3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_typ3, true);
		p.Cnd_io_schd_sub_typ3.setLinkBeans(p.Cnd_io_schd_sub_typ_nm3);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ3_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ3);
		p.Cnd_io_schd_sub_typ3.setNextBeans(p.Cnd_io_schd_sub_typ_nm3);
		p.Cnd_io_schd_sub_typ3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ3_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ_nm3);
		p.Cnd_io_schd_sub_typ_nm3.setNextBeans(p.Cnd_io_schd_sub_no3);
		p.Cnd_io_schd_sub_typ_nm3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ_nm3_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no3_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no3);
		p.Cnd_io_schd_sub_no3.setNextBeans(p.Cnd_io_schd_sub_typ4);
		p.Cnd_io_schd_sub_no3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_no3_META);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_no3, true);
		p.Cnd_io_schd_sub_typ4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_typ4, true);
		p.Cnd_io_schd_sub_typ4.setLinkBeans(p.Cnd_io_schd_sub_typ_nm4);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ4_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ4);
		p.Cnd_io_schd_sub_typ4.setNextBeans(p.Cnd_io_schd_sub_typ_nm4);
		p.Cnd_io_schd_sub_typ4.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ4_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_typ_nm4);
		p.Cnd_io_schd_sub_typ_nm4.setNextBeans(p.Cnd_io_schd_sub_no4);
		p.Cnd_io_schd_sub_typ_nm4.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_typ_nm4_META);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no4_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_sub_no4);
		p.Cnd_io_schd_sub_no4.setNextBeans(p.Cnd_io_schd_pr_no);
		p.Cnd_io_schd_sub_no4.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_sub_no4_META);
		p.setPluralValueEnable(p.Cnd_io_schd_sub_no4, true);
		p.Cnd_3Panel.add(p.Cnd_io_schd_pr_no_Label);
		p.Cnd_3Panel.add(p.Cnd_io_schd_pr_no);
		p.Cnd_io_schd_pr_no.setNextBeans(p.Cnd_slip_schd_no);
		p.Cnd_io_schd_pr_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.io_schd_pr_no_META);
		p.setPluralValueEnable(p.Cnd_io_schd_pr_no, true);
		p.Cnd_3Panel.add(p.Cnd_slip_schd_no_Label);
		p.Cnd_3Panel.add(p.Cnd_slip_schd_no);
		p.Cnd_slip_schd_no.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_slip_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.slip_schd_no_META);
		p.setPluralValueEnable(p.Cnd_slip_schd_no, true);
		p.Cnd_3Panel.add(p.Cnd_sub_char1_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.Cnd_3Panel.add(p.Cnd_sub_char2_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.Cnd_3Panel.add(p.Cnd_sub_char3_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_sub_char4);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd_3Panel.add(p.Cnd_sub_char4_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_char4);
		p.Cnd_sub_char4.setNextBeans(p.Cnd_sub_char5);
		p.Cnd_sub_char4.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_char4_META);
		p.setPluralValueEnable(p.Cnd_sub_char4, true);
		p.Cnd_3Panel.add(p.Cnd_sub_char5_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_char5);
		p.Cnd_sub_char5.setNextBeans(p.Cnd_sub_dt1);
		p.Cnd_sub_char5.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_char5_META);
		p.setPluralValueEnable(p.Cnd_sub_char5, true);
		p.Cnd_3Panel.add(p.Cnd_sub_dt1_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_dt1);
		p.Cnd_sub_dt1.setNextBeans(p.Cnd_sub_dt2);
		p.Cnd_sub_dt1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_dt1_META);
		p.Cnd_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_3Panel.add(p.Cnd_sub_dt2_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_dt2);
		p.Cnd_sub_dt2.setNextBeans(p.Cnd_sub_dt3);
		p.Cnd_sub_dt2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_dt2_META);
		p.Cnd_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_3Panel.add(p.Cnd_sub_dt3_Label);
		p.Cnd_3Panel.add(p.Cnd_sub_dt3);
		p.Cnd_sub_dt3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sub_dt3_META);
		p.Cnd_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.DispCndPanel.add(p.Cnd_slip_schd_no_flg);
		p.DispCndPanel.setLastBeans(p.Cnd_slip_schd_no_flg);
		p.Cnd_slip_schd_no_flg.setNextBeans(p.Cnd_schd_dt_flg);
		p.Cnd_slip_schd_no_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.slip_schd_no_flg_META);
		p.DispCndPanel.add(p.Cnd_schd_dt_flg);
		p.Cnd_schd_dt_flg.setNextBeans(p.Cnd_accpt_schd_dt_flg);
		p.Cnd_schd_dt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.schd_dt_flg_META);
		p.DispCndPanel.add(p.Cnd_accpt_schd_dt_flg);
		p.Cnd_accpt_schd_dt_flg.setNextBeans(p.Cnd_avl_schd_dt_flg);
		p.Cnd_accpt_schd_dt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.accpt_schd_dt_flg_META);
		p.DispCndPanel.add(p.Cnd_avl_schd_dt_flg);
		p.Cnd_avl_schd_dt_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_avl_schd_dt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.avl_schd_dt_flg_META);
		p.DispCndPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_str_ln_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.loc_flg_META);
		p.DispCndPanel.add(p.Cnd_str_ln_flg);
		p.Cnd_str_ln_flg.setNextBeans(p.Cnd_stk_arrv_flg);
		p.Cnd_str_ln_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.str_ln_flg_META);
		p.DispCndPanel.add(p.Cnd_stk_arrv_flg);
		p.Cnd_stk_arrv_flg.setNextBeans(p.Cnd_site_flg);
		p.Cnd_stk_arrv_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.stk_arrv_flg_META);
		p.DispCndPanel.add(p.Cnd_site_flg);
		p.Cnd_site_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_site_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.site_flg_META);
		p.DispCndPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_lg_grp_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.wg_flg_META);
		p.DispCndPanel.add(p.Cnd_lg_grp_flg);
		p.Cnd_lg_grp_flg.setNextBeans(p.Cnd_alloc_grp_flg);
		p.Cnd_lg_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.lg_grp_flg_META);
		p.DispCndPanel.add(p.Cnd_alloc_grp_flg);
		p.Cnd_alloc_grp_flg.setNextBeans(p.Cnd_loc_grp_flg);
		p.Cnd_alloc_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alloc_grp_flg_META);
		p.DispCndPanel.add(p.Cnd_loc_grp_flg);
		p.Cnd_loc_grp_flg.setNextBeans(p.Cnd_sppl_flg);
		p.Cnd_loc_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.loc_grp_flg_META);
		p.DispCndPanel.add(p.Cnd_sppl_flg);
		p.Cnd_sppl_flg.setNextBeans(p.Cnd_lot_no_flg);
		p.Cnd_sppl_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sppl_flg_META);
		p.DispCndPanel.add(p.Cnd_lot_no_flg);
		p.Cnd_lot_no_flg.setNextBeans(p.Cnd_sublot_no_flg);
		p.Cnd_lot_no_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.lot_no_flg_META);
		p.DispCndPanel.add(p.Cnd_sublot_no_flg);
		p.Cnd_sublot_no_flg.setNextBeans(p.Cnd_sno_flg_p_PPanel);
		p.Cnd_sublot_no_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.sublot_no_flg_META);
		p.DispCndPanel.add(p.Cnd_sno_flg_p_PPanel);
		p.Cnd_sno_flg_p_PPanel.setNextBeans(p.Cnd_pack_flg);
		p.DispCndPanel.add(p.Cnd_pack_flg);
		p.Cnd_pack_flg.setNextBeans(p.Cnd_alt_grp_flg);
		p.Cnd_pack_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.pack_flg_META);
		p.DispCndPanel.add(p.Cnd_alt_grp_flg);
		p.Cnd_alt_grp_flg.setNextBeans(p.Cnd_gd_flg);
		p.Cnd_alt_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.alt_grp_flg_META);
		p.DispCndPanel.add(p.Cnd_gd_flg);
		p.Cnd_gd_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_gd_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0090.CndR.gd_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DispCndPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DispCndPanel.add(p.Cnd_deselect_all);
	}

	/**
	 * [Sno1Null]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSno1Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno1NullPanel.setBorder(p.Sno1NullTitledBorder);
		p.Sno1NullPanel.setValueCheck(false);
		p.Sno1NullPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Sno1NullPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Sno2Null]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSno2Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno2NullPanel.setBorder(p.Sno2NullTitledBorder);
		p.Sno2NullPanel.setValueCheck(false);
		p.Sno2NullPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Sno2NullPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Sno3Null]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSno3Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno3NullPanel.setBorder(p.Sno3NullTitledBorder);
		p.Sno3NullPanel.setValueCheck(false);
		p.Sno3NullPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Sno3NullPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Sno4Null]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSno4Null(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Sno4NullPanel.setBorder(p.Sno4NullTitledBorder);
		p.Sno4NullPanel.setValueCheck(false);
		p.Sno4NullPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Sno4NullPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd_2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd_2(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Cnd_2Panel.setValueCheck(false);
		p.Cnd_2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd_2Panel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocTgt(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.AllocTgtPanel.setBorder(p.AllocTgtTitledBorder);
		p.AllocTgtPanel.setValueCheck(false);
		p.AllocTgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AllocTgtPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Alloc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAlloc(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.AllocPanel.setBorder(p.AllocTitledBorder);
		p.AllocPanel.setValueCheck(false);
		p.AllocPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AllocPanel.setLayoutPosition("SWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocWait]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocWait(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.AllocWaitPanel.setBorder(p.AllocWaitTitledBorder);
		p.AllocWaitPanel.setValueCheck(false);
		p.AllocWaitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AllocWaitPanel.setLayoutPosition("SWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd_3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd_3(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.Cnd_3Panel.setValueCheck(false);
		p.Cnd_3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd_3Panel.setLayoutPosition("SS");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DispCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispCnd(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.DispCndPanel.setValueCheck(false);
		p.DispCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_IoSchdSrch p) {
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
	protected static void jbInitRPnl(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_IoSchdSrch p) {
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
	protected static void jbInitBtn(MSBEP_IoSchdSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_open_MSBEP0040);
		p.Btn_open_MSBEP0040.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0040);
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
		MSBEP_IoSchdSrch_MC.mcInitTop((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitFold((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitTab1((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitTab2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitTab3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitSno1Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitSno2Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitSno3Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitSno4Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitCnd_2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitAllocTgt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitAlloc((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitAllocWait((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitCnd_3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitItmCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitDispCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitCtrl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitRPnl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitRslt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.mcInitBtn((MSBEP_IoSchdSrch)this);

		// [INI]ステータスのモードの設定
		MSBEP_IoSchdSrch_MC.statusInitINI_Top((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Fold((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Tab1((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Tab2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Tab3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Cnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Sno1Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Sno2Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Sno3Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Sno4Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Cnd__2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_AllocTgt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Alloc((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_AllocWait((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Cnd__3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_ItmCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_DispCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Ctrl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_RPnl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Rslt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitINI_Btn((MSBEP_IoSchdSrch)this);

		// [REF]ステータスのモードの設定
		MSBEP_IoSchdSrch_MC.statusInitREF_Top((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Fold((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Tab1((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Tab2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Tab3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Cnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Sno1Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Sno2Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Sno3Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Sno4Null((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Cnd__2((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_AllocTgt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Alloc((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_AllocWait((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Cnd__3((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_ItmCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_DispCnd((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Ctrl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_RPnl((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Rslt((MSBEP_IoSchdSrch)this);
		MSBEP_IoSchdSrch_MC.statusInitREF_Btn((MSBEP_IoSchdSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_IoSchdSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_IoSchdSrch p) {
		p.Cnd_schd_dt_fr.setListListener(p);
		p.Cnd_schd_dt_fr.addAllListener(p);
		p.Cnd_schd_dt_to.setListListener(p);
		p.Cnd_schd_dt_to.addAllListener(p);
		p.Cnd_accpt_schd_dt_fr.setListListener(p);
		p.Cnd_accpt_schd_dt_fr.addAllListener(p);
		p.Cnd_accpt_schd_dt_to.setListListener(p);
		p.Cnd_accpt_schd_dt_to.addAllListener(p);
		p.Cnd_avl_schd_dt_fr.setListListener(p);
		p.Cnd_avl_schd_dt_fr.addAllListener(p);
		p.Cnd_avl_schd_dt_to.setListListener(p);
		p.Cnd_avl_schd_dt_to.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_stk_arrv_bp_cd.setListListener(p);
		p.Cnd_stk_arrv_bp_cd.addAllListener(p);
		p.Cnd_stk_arrv_bp_nm.setListListener(p);
		p.Cnd_stk_arrv_bp_nm.addAllListener(p);
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
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_sno1_null_ng_flg.addAllListener(p);
		p.Cnd_sno1_null_ok_flg.addAllListener(p);
		p.Cnd_sno2_null_ng_flg.addAllListener(p);
		p.Cnd_sno2_null_ok_flg.addAllListener(p);
		p.Cnd_sno3_null_ng_flg.addAllListener(p);
		p.Cnd_sno3_null_ok_flg.addAllListener(p);
		p.Cnd_sno4_null_ng_flg.addAllListener(p);
		p.Cnd_sno4_null_ok_flg.addAllListener(p);
		p.Cnd_pack_unit_cd.setListListener(p);
		p.Cnd_pack_unit_cd.addAllListener(p);
		p.Cnd_pack_unit_nm.setListListener(p);
		p.Cnd_pack_unit_nm.addAllListener(p);
		p.Cnd_alt_grp_cd.setListListener(p);
		p.Cnd_alt_grp_cd.addAllListener(p);
		p.Cnd_alt_grp_nm.setListListener(p);
		p.Cnd_alt_grp_nm.addAllListener(p);
		p.Cnd_oper_inst_no.setListListener(p);
		p.Cnd_oper_inst_no.addAllListener(p);
		p.Cnd_oper_ord_no.setListListener(p);
		p.Cnd_oper_ord_no.addAllListener(p);
		p.Cnd_alt_itm_typ.setListListener(p);
		p.Cnd_alt_itm_typ.addAllListener(p);
		p.Cnd_alt_itm_typ_nm.setListListener(p);
		p.Cnd_alt_itm_typ_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_in_xfr_typ.setListListener(p);
		p.Cnd_in_xfr_typ.addAllListener(p);
		p.Cnd_in_xfr_typ_nm.setListListener(p);
		p.Cnd_in_xfr_typ_nm.addAllListener(p);
		p.Cnd_quality_typ.setListListener(p);
		p.Cnd_quality_typ.addAllListener(p);
		p.Cnd_quality_typ_nm.setListListener(p);
		p.Cnd_quality_typ_nm.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_stk_insp_typ.setListListener(p);
		p.Cnd_stk_insp_typ.addAllListener(p);
		p.Cnd_stk_insp_typ_nm.setListListener(p);
		p.Cnd_stk_insp_typ_nm.addAllListener(p);
		p.Cnd_stk_id_typ.setListListener(p);
		p.Cnd_stk_id_typ.addAllListener(p);
		p.Cnd_stk_id_typ_nm.setListListener(p);
		p.Cnd_stk_id_typ_nm.addAllListener(p);
		p.Cnd_stk_bp_cd.setListListener(p);
		p.Cnd_stk_bp_cd.addAllListener(p);
		p.Cnd_stk_bp_nm.setListListener(p);
		p.Cnd_stk_bp_nm.addAllListener(p);
		p.Cnd_inpt_ctl_typ.setListListener(p);
		p.Cnd_inpt_ctl_typ.addAllListener(p);
		p.Cnd_inpt_ctl_typ_nm.setListListener(p);
		p.Cnd_inpt_ctl_typ_nm.addAllListener(p);
		p.Cnd_io_schd_typ.setListListener(p);
		p.Cnd_io_schd_typ.addAllListener(p);
		p.Cnd_io_schd_typ_nm.setListListener(p);
		p.Cnd_io_schd_typ_nm.addAllListener(p);
		p.Cnd_io_typ.setListListener(p);
		p.Cnd_io_typ.addAllListener(p);
		p.Cnd_io_typ_nm.setListListener(p);
		p.Cnd_io_typ_nm.addAllListener(p);
		p.Cnd_io_schd_sts_typ.setListListener(p);
		p.Cnd_io_schd_sts_typ.addAllListener(p);
		p.Cnd_io_schd_sts_typ_nm.setListListener(p);
		p.Cnd_io_schd_sts_typ_nm.addAllListener(p);
		p.Cnd_alloc_scope_typ.setListListener(p);
		p.Cnd_alloc_scope_typ.addAllListener(p);
		p.Cnd_alloc_scope_typ_nm.setListListener(p);
		p.Cnd_alloc_scope_typ_nm.addAllListener(p);
		p.Cnd_non_alloc_tgt_flg.addAllListener(p);
		p.Cnd_is_alloc_tgt_flg.addAllListener(p);
		p.Cnd_yet_allocate_flg.addAllListener(p);
		p.Cnd_allocated_flg.addAllListener(p);
		p.Cnd_non_alloc_wait_flg.addAllListener(p);
		p.Cnd_is_alloc_wait_flg.addAllListener(p);
		p.Cnd_io_schd_no.setListListener(p);
		p.Cnd_io_schd_no.addAllListener(p);
		p.Cnd_io_schd_sub_typ1.setListListener(p);
		p.Cnd_io_schd_sub_typ1.addAllListener(p);
		p.Cnd_io_schd_sub_typ_nm1.setListListener(p);
		p.Cnd_io_schd_sub_typ_nm1.addAllListener(p);
		p.Cnd_io_schd_sub_no1.setListListener(p);
		p.Cnd_io_schd_sub_no1.addAllListener(p);
		p.Cnd_io_schd_sub_typ2.setListListener(p);
		p.Cnd_io_schd_sub_typ2.addAllListener(p);
		p.Cnd_io_schd_sub_typ_nm2.setListListener(p);
		p.Cnd_io_schd_sub_typ_nm2.addAllListener(p);
		p.Cnd_io_schd_sub_no2.setListListener(p);
		p.Cnd_io_schd_sub_no2.addAllListener(p);
		p.Cnd_io_schd_sub_typ3.setListListener(p);
		p.Cnd_io_schd_sub_typ3.addAllListener(p);
		p.Cnd_io_schd_sub_typ_nm3.setListListener(p);
		p.Cnd_io_schd_sub_typ_nm3.addAllListener(p);
		p.Cnd_io_schd_sub_no3.setListListener(p);
		p.Cnd_io_schd_sub_no3.addAllListener(p);
		p.Cnd_io_schd_sub_typ4.setListListener(p);
		p.Cnd_io_schd_sub_typ4.addAllListener(p);
		p.Cnd_io_schd_sub_typ_nm4.setListListener(p);
		p.Cnd_io_schd_sub_typ_nm4.addAllListener(p);
		p.Cnd_io_schd_sub_no4.setListListener(p);
		p.Cnd_io_schd_sub_no4.addAllListener(p);
		p.Cnd_io_schd_pr_no.setListListener(p);
		p.Cnd_io_schd_pr_no.addAllListener(p);
		p.Cnd_slip_schd_no.setListListener(p);
		p.Cnd_slip_schd_no.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_sub_char4.setListListener(p);
		p.Cnd_sub_char4.addAllListener(p);
		p.Cnd_sub_char5.setListListener(p);
		p.Cnd_sub_char5.addAllListener(p);
		p.Cnd_sub_dt1.setListListener(p);
		p.Cnd_sub_dt1.addAllListener(p);
		p.Cnd_sub_dt2.setListListener(p);
		p.Cnd_sub_dt2.addAllListener(p);
		p.Cnd_sub_dt3.setListListener(p);
		p.Cnd_sub_dt3.addAllListener(p);
		p.Cnd_slip_schd_no_flg.addAllListener(p);
		p.Cnd_schd_dt_flg.addAllListener(p);
		p.Cnd_accpt_schd_dt_flg.addAllListener(p);
		p.Cnd_avl_schd_dt_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_str_ln_flg.addAllListener(p);
		p.Cnd_stk_arrv_flg.addAllListener(p);
		p.Cnd_site_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_lg_grp_flg.addAllListener(p);
		p.Cnd_alloc_grp_flg.addAllListener(p);
		p.Cnd_loc_grp_flg.addAllListener(p);
		p.Cnd_sppl_flg.addAllListener(p);
		p.Cnd_lot_no_flg.addAllListener(p);
		p.Cnd_sublot_no_flg.addAllListener(p);
		p.Cnd_pack_flg.addAllListener(p);
		p.Cnd_alt_grp_flg.addAllListener(p);
		p.Cnd_gd_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Sno1Null]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSno1Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Sno2Null]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSno2Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Sno3Null]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSno3Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Sno4Null]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSno4Null(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Cnd_2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd_2(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [AllocTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocTgt(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Alloc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAlloc(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [AllocWait]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocWait(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Cnd_3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd_3(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [DispCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispCnd(MSBEP_IoSchdSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_IoSchdSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_IoSchdSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_IoSchdSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_slip_schd_no.addAllListener(p);
		p.columnRslt_slip_schd_no.setListListener(p);
		p.columnRslt_schd_dt.addAllListener(p);
		p.columnRslt_schd_dt.setListListener(p);
		p.columnRslt_accpt_schd_dt.addAllListener(p);
		p.columnRslt_accpt_schd_dt.setListListener(p);
		p.columnRslt_avl_schd_dt.addAllListener(p);
		p.columnRslt_avl_schd_dt.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_gi_lg_grp_cd.addAllListener(p);
		p.columnRslt_gi_lg_grp_cd.setListListener(p);
		p.columnRslt_alloc_grp_cd.addAllListener(p);
		p.columnRslt_alloc_grp_cd.setListListener(p);
		p.columnRslt_alloc_grp_nm.addAllListener(p);
		p.columnRslt_alloc_grp_nm.setListListener(p);
		p.columnRslt_loc_grp_cd.addAllListener(p);
		p.columnRslt_loc_grp_cd.setListListener(p);
		p.columnRslt_loc_grp_nm.addAllListener(p);
		p.columnRslt_loc_grp_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_io_schd_typ.addAllListener(p);
		p.columnRslt_io_schd_typ.setListListener(p);
		p.columnRslt_io_schd_typ_nm.addAllListener(p);
		p.columnRslt_io_schd_typ_nm.setListListener(p);
		p.columnRslt_io_schd_sts_typ.addAllListener(p);
		p.columnRslt_io_schd_sts_typ.setListListener(p);
		p.columnRslt_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRslt_io_schd_sts_typ_nm.setListListener(p);
		p.columnRslt_io_typ.addAllListener(p);
		p.columnRslt_io_typ.setListListener(p);
		p.columnRslt_io_typ_nm.addAllListener(p);
		p.columnRslt_io_typ_nm.setListListener(p);
		p.columnRslt_i_pack_unit_qty.addAllListener(p);
		p.columnRslt_i_pack_unit_qty.setListListener(p);
		p.columnRslt_o_pack_unit_qty.addAllListener(p);
		p.columnRslt_o_pack_unit_qty.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_i_base_unit_qty.addAllListener(p);
		p.columnRslt_i_base_unit_qty.setListListener(p);
		p.columnRslt_o_base_unit_qty.addAllListener(p);
		p.columnRslt_o_base_unit_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_alt_grp_cd.addAllListener(p);
		p.columnRslt_alt_grp_cd.setListListener(p);
		p.columnRslt_alt_grp_nm.addAllListener(p);
		p.columnRslt_alt_grp_nm.setListListener(p);
		p.columnRslt_alt_grp_seq.addAllListener(p);
		p.columnRslt_alt_grp_seq.setListListener(p);
		p.columnRslt_oper_inst_no.addAllListener(p);
		p.columnRslt_oper_inst_no.setListListener(p);
		p.columnRslt_oper_ord_no.addAllListener(p);
		p.columnRslt_oper_ord_no.setListListener(p);
		p.columnRslt_alt_qty.addAllListener(p);
		p.columnRslt_alt_qty.setListListener(p);
		p.columnRslt_alt_itm_typ.addAllListener(p);
		p.columnRslt_alt_itm_typ.setListListener(p);
		p.columnRslt_alt_itm_typ_nm.addAllListener(p);
		p.columnRslt_alt_itm_typ_nm.setListListener(p);
		p.columnRslt_alt_itm_ratio.addAllListener(p);
		p.columnRslt_alt_itm_ratio.setListListener(p);
		p.columnRslt_alt_alloc_prio.addAllListener(p);
		p.columnRslt_alt_alloc_prio.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_in_xfr_typ.addAllListener(p);
		p.columnRslt_in_xfr_typ.setListListener(p);
		p.columnRslt_in_xfr_typ_nm.addAllListener(p);
		p.columnRslt_in_xfr_typ_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_asst_typ.addAllListener(p);
		p.columnRslt_asst_typ.setListListener(p);
		p.columnRslt_asst_typ_nm.addAllListener(p);
		p.columnRslt_asst_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_alloc_tgt_flg.addAllListener(p);
		p.columnRslt_alloc_scope_typ.addAllListener(p);
		p.columnRslt_alloc_scope_typ.setListListener(p);
		p.columnRslt_alloc_scope_typ_nm.addAllListener(p);
		p.columnRslt_alloc_scope_typ_nm.setListListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_alloc_wait_flg.addAllListener(p);
		p.columnRslt_vld_dt_fr.addAllListener(p);
		p.columnRslt_vld_dt_fr.setListListener(p);
		p.columnRslt_vld_dt_to.addAllListener(p);
		p.columnRslt_vld_dt_to.setListListener(p);
		p.columnRslt_inpt_ctl_typ.addAllListener(p);
		p.columnRslt_inpt_ctl_typ.setListListener(p);
		p.columnRslt_inpt_ctl_typ_nm.addAllListener(p);
		p.columnRslt_inpt_ctl_typ_nm.setListListener(p);
		p.columnRslt_io_schd_no.addAllListener(p);
		p.columnRslt_io_schd_no.setListListener(p);
		p.columnRslt_io_schd_seq.addAllListener(p);
		p.columnRslt_io_schd_seq.setListListener(p);
		p.columnRslt_io_schd_sub_typ1.addAllListener(p);
		p.columnRslt_io_schd_sub_typ1.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm1.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm1.setListListener(p);
		p.columnRslt_io_schd_sub_no1.addAllListener(p);
		p.columnRslt_io_schd_sub_no1.setListListener(p);
		p.columnRslt_io_schd_sub_seq1.addAllListener(p);
		p.columnRslt_io_schd_sub_seq1.setListListener(p);
		p.columnRslt_io_schd_sub_typ2.addAllListener(p);
		p.columnRslt_io_schd_sub_typ2.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm2.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm2.setListListener(p);
		p.columnRslt_io_schd_sub_no2.addAllListener(p);
		p.columnRslt_io_schd_sub_no2.setListListener(p);
		p.columnRslt_io_schd_sub_seq2.addAllListener(p);
		p.columnRslt_io_schd_sub_seq2.setListListener(p);
		p.columnRslt_io_schd_sub_typ3.addAllListener(p);
		p.columnRslt_io_schd_sub_typ3.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm3.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm3.setListListener(p);
		p.columnRslt_io_schd_sub_no3.addAllListener(p);
		p.columnRslt_io_schd_sub_no3.setListListener(p);
		p.columnRslt_io_schd_sub_seq3.addAllListener(p);
		p.columnRslt_io_schd_sub_seq3.setListListener(p);
		p.columnRslt_io_schd_sub_typ4.addAllListener(p);
		p.columnRslt_io_schd_sub_typ4.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm4.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm4.setListListener(p);
		p.columnRslt_io_schd_sub_no4.addAllListener(p);
		p.columnRslt_io_schd_sub_no4.setListListener(p);
		p.columnRslt_io_schd_sub_seq4.addAllListener(p);
		p.columnRslt_io_schd_sub_seq4.setListListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_sub_char4.addAllListener(p);
		p.columnRslt_sub_char4.setListListener(p);
		p.columnRslt_sub_char5.addAllListener(p);
		p.columnRslt_sub_char5.setListListener(p);
		p.columnRslt_sub_num1.addAllListener(p);
		p.columnRslt_sub_num1.setListListener(p);
		p.columnRslt_sub_num2.addAllListener(p);
		p.columnRslt_sub_num2.setListListener(p);
		p.columnRslt_sub_num3.addAllListener(p);
		p.columnRslt_sub_num3.setListListener(p);
		p.columnRslt_sub_dt1.addAllListener(p);
		p.columnRslt_sub_dt1.setListListener(p);
		p.columnRslt_sub_dt2.addAllListener(p);
		p.columnRslt_sub_dt2.setListListener(p);
		p.columnRslt_sub_dt3.addAllListener(p);
		p.columnRslt_sub_dt3.setListListener(p);
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
	protected static void mcInitBtn(MSBEP_IoSchdSrch p) {
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_open_MSBEP0040.addAllListener(p);
		p.Btn_open_MSBEP0040.setAPMethodName("doBtn_open_MSBEP0040");
	}

	/**
	 * [INI]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINI_Top(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINI_Fold(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINI_Tab1(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINI_Tab2(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINI_Tab3(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINI_Cnd(MSBEP_IoSchdSrch p){
		p.Cnd_schd_dt_fr.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(INI, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno1_null_ng_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno1_null_ok_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno2_null_ng_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno2_null_ok_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno3_null_ng_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno3_null_ok_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno4_null_ng_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno4_null_ok_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_pack_unit_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alt_grp_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alt_grp_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alt_itm_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alt_itm_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_in_xfr_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_in_xfr_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_insp_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_schd_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_schd_sts_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sts_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_alloc_scope_typ.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alloc_scope_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_non_alloc_tgt_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_is_alloc_tgt_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_yet_allocate_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_allocated_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_non_alloc_wait_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_is_alloc_wait_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_dt_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_io_schd_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ1.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm1.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no1.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ2.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm2.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no2.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ3.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm3.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no3.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ4.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm4.putMode(p, INI, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no4.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_io_schd_pr_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_slip_schd_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char4.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char5.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_dt1.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_dt2.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_dt3.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_slip_schd_no_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_schd_dt_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_str_ln_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_arrv_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_site_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_lg_grp_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alloc_grp_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_grp_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_lot_no_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sublot_no_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno_flg_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_pack_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_alt_grp_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_gd_flg.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_select_all.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, INI, MCMode.ENABLE);

	}

	/**
	 * [INI]ステータスの[Sno1Null]ブロックのモードの設定
	 */
	protected static void statusInitINI_Sno1Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Sno2Null]ブロックのモードの設定
	 */
	protected static void statusInitINI_Sno2Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Sno3Null]ブロックのモードの設定
	 */
	protected static void statusInitINI_Sno3Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Sno4Null]ブロックのモードの設定
	 */
	protected static void statusInitINI_Sno4Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Cnd_2]ブロックのモードの設定
	 */
	protected static void statusInitINI_Cnd__2(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[AllocTgt]ブロックのモードの設定
	 */
	protected static void statusInitINI_AllocTgt(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Alloc]ブロックのモードの設定
	 */
	protected static void statusInitINI_Alloc(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[AllocWait]ブロックのモードの設定
	 */
	protected static void statusInitINI_AllocWait(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Cnd_3]ブロックのモードの設定
	 */
	protected static void statusInitINI_Cnd__3(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitINI_ItmCnd(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[DispCnd]ブロックのモードの設定
	 */
	protected static void statusInitINI_DispCnd(MSBEP_IoSchdSrch p){

	}

	/**
	 * [INI]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINI_Ctrl(MSBEP_IoSchdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(INI, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [INI]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINI_RPnl(MSBEP_IoSchdSrch p){
		p.RPnl_dwnld.putMode(p, INI, MCMode.ENABLE);

	}

	/**
	 * [INI]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINI_Rslt(MSBEP_IoSchdSrch p){
		p.columnRslt_slip_schd_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_str_ln_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_alloc_grp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(INI, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INI, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(INI, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_i_pack_unit_qty.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_o_pack_unit_qty.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_i_base_unit_qty.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_o_base_unit_qty.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_qty.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alt_alloc_prio.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alloc_tgt_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alloc_scope_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alloc_scope_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_alloc_wait_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq4.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INI, MCMode.READ_ONLY);

	}

	/**
	 * [INI]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINI_Btn(MSBEP_IoSchdSrch p){
		p.Btn_open_dtl.putMode(p, INI, MCMode.DISABLE);
		p.Btn_open_MSBEP0040.putMode(p, INI, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_IoSchdSrch p){
		p.Cnd_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_nm.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno1_null_ng_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1_null_ok_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2_null_ng_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2_null_ok_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3_null_ng_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3_null_ok_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4_null_ng_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4_null_ok_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pack_unit_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alt_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alt_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alt_itm_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_xfr_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_xfr_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inpt_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_schd_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_schd_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_alloc_scope_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_scope_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_non_alloc_tgt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_is_alloc_tgt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_yet_allocate_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_allocated_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_non_alloc_wait_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_is_alloc_wait_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_io_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_sub_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_io_schd_sub_no4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_schd_pr_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slip_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_dt1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_dt2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_dt3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_slip_schd_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_dt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_arrv_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_flg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_pack_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alt_grp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gd_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Sno1Null]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sno1Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Sno2Null]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sno2Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Sno3Null]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sno3Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Sno4Null]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sno4Null(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd_2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd__2(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[AllocTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocTgt(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Alloc]ブロックのモードの設定
	 */
	protected static void statusInitREF_Alloc(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[AllocWait]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocWait(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd_3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd__3(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmCnd(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[DispCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispCnd(MSBEP_IoSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_IoSchdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBEP_IoSchdSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_IoSchdSrch p){
		p.columnRslt_slip_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_i_pack_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_o_pack_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_i_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_o_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_scope_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_scope_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_wait_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inpt_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_seq4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_IoSchdSrch p){
		p.Btn_open_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBEP0040.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INI;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_IoSchdSrch_MC.setTableConfigRslt((MSBEP_IoSchdSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_IoSchdSrch p) {
		p.columnRslt_slip_schd_no.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.slip_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_schd_no);
		p.columnRslt_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.schd_dt_META);
		p.columnRslt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_dt);
		p.columnRslt_accpt_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.accpt_schd_dt_META);
		p.columnRslt_accpt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_accpt_schd_dt);
		p.columnRslt_avl_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.avl_schd_dt_META);
		p.columnRslt_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_avl_schd_dt);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt_str_ln_nm);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.columnRslt_gi_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.gi_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_lg_grp_cd);
		p.columnRslt_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_cd);
		p.columnRslt_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_nm);
		p.columnRslt_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_cd);
		p.columnRslt_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_io_schd_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_typ);
		p.columnRslt_io_schd_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_typ_nm);
		p.columnRslt_io_schd_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sts_typ);
		p.columnRslt_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sts_typ_nm);
		p.columnRslt_io_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_typ);
		p.columnRslt_io_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_typ_nm);
		p.columnRslt_i_pack_unit_qty.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.i_pack_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_i_pack_unit_qty);
		p.columnRslt_o_pack_unit_qty.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.o_pack_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_o_pack_unit_qty);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.pack_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.columnRslt_i_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.i_base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_i_base_unit_qty);
		p.columnRslt_o_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.o_base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_o_base_unit_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_alt_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_cd);
		p.columnRslt_alt_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_nm);
		p.columnRslt_alt_grp_seq.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_grp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_seq);
		p.columnRslt_oper_inst_no.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.oper_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_no);
		p.columnRslt_oper_ord_no.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.oper_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ord_no);
		p.columnRslt_alt_qty.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_qty);
		p.columnRslt_alt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_typ);
		p.columnRslt_alt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_typ_nm);
		p.columnRslt_alt_itm_ratio.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_itm_ratio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_ratio);
		p.columnRslt_alt_alloc_prio.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alt_alloc_prio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_alloc_prio);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_in_xfr_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.in_xfr_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ);
		p.columnRslt_in_xfr_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.in_xfr_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.asst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_asst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.asst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_alloc_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_tgt_flg);
		p.columnRslt_alloc_scope_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_scope_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_scope_typ);
		p.columnRslt_alloc_scope_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_scope_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_scope_typ_nm);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_alloc_wait_flg.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.alloc_wait_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_wait_flg);
		p.columnRslt_vld_dt_fr.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.vld_dt_fr_META);
		p.columnRslt_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt_fr);
		p.columnRslt_vld_dt_to.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.vld_dt_to_META);
		p.columnRslt_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt_to);
		p.columnRslt_inpt_ctl_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.inpt_ctl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_ctl_typ);
		p.columnRslt_inpt_ctl_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.inpt_ctl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_ctl_typ_nm);
		p.columnRslt_io_schd_no.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_no);
		p.columnRslt_io_schd_seq.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_seq);
		p.columnRslt_io_schd_sub_typ1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ1);
		p.columnRslt_io_schd_sub_typ_nm1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm1);
		p.columnRslt_io_schd_sub_no1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_no1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no1);
		p.columnRslt_io_schd_sub_seq1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_seq1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_seq1);
		p.columnRslt_io_schd_sub_typ2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ2);
		p.columnRslt_io_schd_sub_typ_nm2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm2);
		p.columnRslt_io_schd_sub_no2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_no2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no2);
		p.columnRslt_io_schd_sub_seq2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_seq2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_seq2);
		p.columnRslt_io_schd_sub_typ3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ3);
		p.columnRslt_io_schd_sub_typ_nm3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm3);
		p.columnRslt_io_schd_sub_no3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_no3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no3);
		p.columnRslt_io_schd_sub_seq3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_seq3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_seq3);
		p.columnRslt_io_schd_sub_typ4.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ4);
		p.columnRslt_io_schd_sub_typ_nm4.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_typ_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm4);
		p.columnRslt_io_schd_sub_no4.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_no4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no4);
		p.columnRslt_io_schd_sub_seq4.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_sub_seq4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_seq4);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_sub_char4.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char4);
		p.columnRslt_sub_char5.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char5);
		p.columnRslt_sub_num1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num1);
		p.columnRslt_sub_num2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num2);
		p.columnRslt_sub_num3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num3);
		p.columnRslt_sub_dt1.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_dt1_META);
		p.columnRslt_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt1);
		p.columnRslt_sub_dt2.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_dt2_META);
		p.columnRslt_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt2);
		p.columnRslt_sub_dt3.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.sub_dt3_META);
		p.columnRslt_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP0090.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_stk_arrv_bp_cd.getListConfig().setPutter(getCnd_stk_arrv_bp_cd_ListPutter());
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
		Cnd_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_pack_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pack_unit_cd.getListConfig().setPutter(getCnd_pack_unit_cd_ListPutter());
		Cnd_alt_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alt_grp_cd.getListConfig().setPutter(getCnd_alt_grp_cd_ListPutter());
		Cnd_alt_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alt_itm_typ.getListConfig().setPutter(getCnd_alt_itm_typ_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_in_xfr_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_xfr_typ.getListConfig().setPutter(getCnd_in_xfr_typ_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
		Cnd_stk_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_insp_typ.getListConfig().setPutter(getCnd_stk_insp_typ_ListPutter());
		Cnd_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_id_typ.getListConfig().setPutter(getCnd_stk_id_typ_ListPutter());
		Cnd_stk_bp_cd.getListConfig().setPutter(getCnd_stk_bp_cd_ListPutter());
		Cnd_inpt_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_inpt_ctl_typ.getListConfig().setPutter(getCnd_inpt_ctl_typ_ListPutter());
		Cnd_io_schd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_schd_typ.getListConfig().setPutter(getCnd_io_schd_typ_ListPutter());
		Cnd_io_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_typ.getListConfig().setPutter(getCnd_io_typ_ListPutter());
		Cnd_io_schd_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_schd_sts_typ.getListConfig().setPutter(getCnd_io_schd_sts_typ_ListPutter());
		Cnd_alloc_scope_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_scope_typ.getListConfig().setPutter(getCnd_alloc_scope_typ_ListPutter());
		Cnd_io_schd_sub_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_schd_sub_typ1.getListConfig().setPutter(getCnd_io_schd_sub_typ1_ListPutter());
		Cnd_io_schd_sub_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_schd_sub_typ2.getListConfig().setPutter(getCnd_io_schd_sub_typ2_ListPutter());
		Cnd_io_schd_sub_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_schd_sub_typ3.getListConfig().setPutter(getCnd_io_schd_sub_typ3_ListPutter());
		Cnd_io_schd_sub_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_schd_sub_typ4.getListConfig().setPutter(getCnd_io_schd_sub_typ4_ListPutter());
		Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
	}

	/**
	 * この画面を[INI]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINIStatus() {
		status = INI;
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
		if (INI.equals(status)) {
			setINIStatus();
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
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
		lp.setListLogicId("MA.MAUAP0010.LgWg");
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
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_pack_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pack_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Cnd_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_alt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltItmTyp");
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
	 * [Cnd_in_xfr_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_xfr_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InXfrTyp");
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
	 * [Cnd_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkInspTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_io_schd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_schd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoSchdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_io_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_io_schd_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_schd_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoSchdStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_alloc_scope_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_scope_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocScopeTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_io_schd_sub_typ1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_schd_sub_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoSchdSubTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_io_schd_sub_typ2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_schd_sub_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoSchdSubTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_io_schd_sub_typ3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_schd_sub_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoSchdSubTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_io_schd_sub_typ4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_schd_sub_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.IoSchdSubTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_stk_arrv_bp_cd) return getCnd_stk_arrv_bp_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_pack_unit_cd) return getCnd_pack_unit_cd(row, info);
		if(combo == Cnd_alt_grp_cd) return getCnd_alt_grp_cd(row, info);
		if(combo == Cnd_alt_itm_typ) return getCnd_alt_itm_typ(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_in_xfr_typ) return getCnd_in_xfr_typ(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_stk_insp_typ) return getCnd_stk_insp_typ(row, info);
		if(combo == Cnd_stk_id_typ) return getCnd_stk_id_typ(row, info);
		if(combo == Cnd_stk_bp_cd) return getCnd_stk_bp_cd(row, info);
		if(combo == Cnd_inpt_ctl_typ) return getCnd_inpt_ctl_typ(row, info);
		if(combo == Cnd_io_schd_typ) return getCnd_io_schd_typ(row, info);
		if(combo == Cnd_io_typ) return getCnd_io_typ(row, info);
		if(combo == Cnd_io_schd_sts_typ) return getCnd_io_schd_sts_typ(row, info);
		if(combo == Cnd_alloc_scope_typ) return getCnd_alloc_scope_typ(row, info);
		if(combo == Cnd_io_schd_sub_typ1) return getCnd_io_schd_sub_typ1(row, info);
		if(combo == Cnd_io_schd_sub_typ2) return getCnd_io_schd_sub_typ2(row, info);
		if(combo == Cnd_io_schd_sub_typ3) return getCnd_io_schd_sub_typ3(row, info);
		if(combo == Cnd_io_schd_sub_typ4) return getCnd_io_schd_sub_typ4(row, info);
		if(combo == Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_select_all) doCnd_select_all(info);
		else if (ap == Cnd_deselect_all) doCnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_open_MSBEP0040) doBtn_open_MSBEP0040(info);
	}

	/**
	 * [Cnd]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_deselect_all(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0040(MCEventInfo info);

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
		if (vc == Cnd_schd_dt_fr) return doCnd_schd_dt_fr_VC(info);
		if (vc == Cnd_schd_dt_to) return doCnd_schd_dt_to_VC(info);
		if (vc == Cnd_accpt_schd_dt_fr) return doCnd_accpt_schd_dt_fr_VC(info);
		if (vc == Cnd_accpt_schd_dt_to) return doCnd_accpt_schd_dt_to_VC(info);
		if (vc == Cnd_avl_schd_dt_fr) return doCnd_avl_schd_dt_fr_VC(info);
		if (vc == Cnd_avl_schd_dt_to) return doCnd_avl_schd_dt_to_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_stk_arrv_bp_cd) return doCnd_stk_arrv_bp_cd_VC(info);
		if (vc == Cnd_stk_arrv_bp_nm) return doCnd_stk_arrv_bp_nm_VC(info);
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
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1_null_ng_flg) return doCnd_sno1_null_ng_flg_VC(info);
		if (vc == Cnd_sno1_null_ok_flg) return doCnd_sno1_null_ok_flg_VC(info);
		if (vc == Cnd_sno2_null_ng_flg) return doCnd_sno2_null_ng_flg_VC(info);
		if (vc == Cnd_sno2_null_ok_flg) return doCnd_sno2_null_ok_flg_VC(info);
		if (vc == Cnd_sno3_null_ng_flg) return doCnd_sno3_null_ng_flg_VC(info);
		if (vc == Cnd_sno3_null_ok_flg) return doCnd_sno3_null_ok_flg_VC(info);
		if (vc == Cnd_sno4_null_ng_flg) return doCnd_sno4_null_ng_flg_VC(info);
		if (vc == Cnd_sno4_null_ok_flg) return doCnd_sno4_null_ok_flg_VC(info);
		if (vc == Cnd_pack_unit_cd) return doCnd_pack_unit_cd_VC(info);
		if (vc == Cnd_pack_unit_nm) return doCnd_pack_unit_nm_VC(info);
		if (vc == Cnd_alt_grp_cd) return doCnd_alt_grp_cd_VC(info);
		if (vc == Cnd_alt_grp_nm) return doCnd_alt_grp_nm_VC(info);
		if (vc == Cnd_oper_inst_no) return doCnd_oper_inst_no_VC(info);
		if (vc == Cnd_oper_ord_no) return doCnd_oper_ord_no_VC(info);
		if (vc == Cnd_alt_itm_typ) return doCnd_alt_itm_typ_VC(info);
		if (vc == Cnd_alt_itm_typ_nm) return doCnd_alt_itm_typ_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_in_xfr_typ) return doCnd_in_xfr_typ_VC(info);
		if (vc == Cnd_in_xfr_typ_nm) return doCnd_in_xfr_typ_nm_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_stk_insp_typ) return doCnd_stk_insp_typ_VC(info);
		if (vc == Cnd_stk_insp_typ_nm) return doCnd_stk_insp_typ_nm_VC(info);
		if (vc == Cnd_stk_id_typ) return doCnd_stk_id_typ_VC(info);
		if (vc == Cnd_stk_id_typ_nm) return doCnd_stk_id_typ_nm_VC(info);
		if (vc == Cnd_stk_bp_cd) return doCnd_stk_bp_cd_VC(info);
		if (vc == Cnd_stk_bp_nm) return doCnd_stk_bp_nm_VC(info);
		if (vc == Cnd_inpt_ctl_typ) return doCnd_inpt_ctl_typ_VC(info);
		if (vc == Cnd_inpt_ctl_typ_nm) return doCnd_inpt_ctl_typ_nm_VC(info);
		if (vc == Cnd_io_schd_typ) return doCnd_io_schd_typ_VC(info);
		if (vc == Cnd_io_schd_typ_nm) return doCnd_io_schd_typ_nm_VC(info);
		if (vc == Cnd_io_typ) return doCnd_io_typ_VC(info);
		if (vc == Cnd_io_typ_nm) return doCnd_io_typ_nm_VC(info);
		if (vc == Cnd_io_schd_sts_typ) return doCnd_io_schd_sts_typ_VC(info);
		if (vc == Cnd_io_schd_sts_typ_nm) return doCnd_io_schd_sts_typ_nm_VC(info);
		if (vc == Cnd_alloc_scope_typ) return doCnd_alloc_scope_typ_VC(info);
		if (vc == Cnd_alloc_scope_typ_nm) return doCnd_alloc_scope_typ_nm_VC(info);
		if (vc == Cnd_non_alloc_tgt_flg) return doCnd_non_alloc_tgt_flg_VC(info);
		if (vc == Cnd_is_alloc_tgt_flg) return doCnd_is_alloc_tgt_flg_VC(info);
		if (vc == Cnd_yet_allocate_flg) return doCnd_yet_allocate_flg_VC(info);
		if (vc == Cnd_allocated_flg) return doCnd_allocated_flg_VC(info);
		if (vc == Cnd_non_alloc_wait_flg) return doCnd_non_alloc_wait_flg_VC(info);
		if (vc == Cnd_is_alloc_wait_flg) return doCnd_is_alloc_wait_flg_VC(info);
		if (vc == Cnd_io_schd_no) return doCnd_io_schd_no_VC(info);
		if (vc == Cnd_io_schd_sub_typ1) return doCnd_io_schd_sub_typ1_VC(info);
		if (vc == Cnd_io_schd_sub_typ_nm1) return doCnd_io_schd_sub_typ_nm1_VC(info);
		if (vc == Cnd_io_schd_sub_no1) return doCnd_io_schd_sub_no1_VC(info);
		if (vc == Cnd_io_schd_sub_typ2) return doCnd_io_schd_sub_typ2_VC(info);
		if (vc == Cnd_io_schd_sub_typ_nm2) return doCnd_io_schd_sub_typ_nm2_VC(info);
		if (vc == Cnd_io_schd_sub_no2) return doCnd_io_schd_sub_no2_VC(info);
		if (vc == Cnd_io_schd_sub_typ3) return doCnd_io_schd_sub_typ3_VC(info);
		if (vc == Cnd_io_schd_sub_typ_nm3) return doCnd_io_schd_sub_typ_nm3_VC(info);
		if (vc == Cnd_io_schd_sub_no3) return doCnd_io_schd_sub_no3_VC(info);
		if (vc == Cnd_io_schd_sub_typ4) return doCnd_io_schd_sub_typ4_VC(info);
		if (vc == Cnd_io_schd_sub_typ_nm4) return doCnd_io_schd_sub_typ_nm4_VC(info);
		if (vc == Cnd_io_schd_sub_no4) return doCnd_io_schd_sub_no4_VC(info);
		if (vc == Cnd_io_schd_pr_no) return doCnd_io_schd_pr_no_VC(info);
		if (vc == Cnd_slip_schd_no) return doCnd_slip_schd_no_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_sub_char4) return doCnd_sub_char4_VC(info);
		if (vc == Cnd_sub_char5) return doCnd_sub_char5_VC(info);
		if (vc == Cnd_sub_dt1) return doCnd_sub_dt1_VC(info);
		if (vc == Cnd_sub_dt2) return doCnd_sub_dt2_VC(info);
		if (vc == Cnd_sub_dt3) return doCnd_sub_dt3_VC(info);
		if (vc == Cnd_slip_schd_no_flg) return doCnd_slip_schd_no_flg_VC(info);
		if (vc == Cnd_schd_dt_flg) return doCnd_schd_dt_flg_VC(info);
		if (vc == Cnd_accpt_schd_dt_flg) return doCnd_accpt_schd_dt_flg_VC(info);
		if (vc == Cnd_avl_schd_dt_flg) return doCnd_avl_schd_dt_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_str_ln_flg) return doCnd_str_ln_flg_VC(info);
		if (vc == Cnd_stk_arrv_flg) return doCnd_stk_arrv_flg_VC(info);
		if (vc == Cnd_site_flg) return doCnd_site_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_lg_grp_flg) return doCnd_lg_grp_flg_VC(info);
		if (vc == Cnd_alloc_grp_flg) return doCnd_alloc_grp_flg_VC(info);
		if (vc == Cnd_loc_grp_flg) return doCnd_loc_grp_flg_VC(info);
		if (vc == Cnd_sppl_flg) return doCnd_sppl_flg_VC(info);
		if (vc == Cnd_lot_no_flg) return doCnd_lot_no_flg_VC(info);
		if (vc == Cnd_sublot_no_flg) return doCnd_sublot_no_flg_VC(info);
		if (vc == Cnd_pack_flg) return doCnd_pack_flg_VC(info);
		if (vc == Cnd_alt_grp_flg) return doCnd_alt_grp_flg_VC(info);
		if (vc == Cnd_gd_flg) return doCnd_gd_flg_VC(info);
		if (vc == columnRslt_slip_schd_no) return doRslt_slip_schd_no_VC(info);
		if (vc == columnRslt_schd_dt) return doRslt_schd_dt_VC(info);
		if (vc == columnRslt_accpt_schd_dt) return doRslt_accpt_schd_dt_VC(info);
		if (vc == columnRslt_avl_schd_dt) return doRslt_avl_schd_dt_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_gi_lg_grp_cd) return doRslt_gi_lg_grp_cd_VC(info);
		if (vc == columnRslt_alloc_grp_cd) return doRslt_alloc_grp_cd_VC(info);
		if (vc == columnRslt_alloc_grp_nm) return doRslt_alloc_grp_nm_VC(info);
		if (vc == columnRslt_loc_grp_cd) return doRslt_loc_grp_cd_VC(info);
		if (vc == columnRslt_loc_grp_nm) return doRslt_loc_grp_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_io_schd_typ) return doRslt_io_schd_typ_VC(info);
		if (vc == columnRslt_io_schd_typ_nm) return doRslt_io_schd_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_sts_typ) return doRslt_io_schd_sts_typ_VC(info);
		if (vc == columnRslt_io_schd_sts_typ_nm) return doRslt_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRslt_io_typ) return doRslt_io_typ_VC(info);
		if (vc == columnRslt_io_typ_nm) return doRslt_io_typ_nm_VC(info);
		if (vc == columnRslt_i_pack_unit_qty) return doRslt_i_pack_unit_qty_VC(info);
		if (vc == columnRslt_o_pack_unit_qty) return doRslt_o_pack_unit_qty_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_i_base_unit_qty) return doRslt_i_base_unit_qty_VC(info);
		if (vc == columnRslt_o_base_unit_qty) return doRslt_o_base_unit_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_alt_grp_cd) return doRslt_alt_grp_cd_VC(info);
		if (vc == columnRslt_alt_grp_nm) return doRslt_alt_grp_nm_VC(info);
		if (vc == columnRslt_alt_grp_seq) return doRslt_alt_grp_seq_VC(info);
		if (vc == columnRslt_oper_inst_no) return doRslt_oper_inst_no_VC(info);
		if (vc == columnRslt_oper_ord_no) return doRslt_oper_ord_no_VC(info);
		if (vc == columnRslt_alt_qty) return doRslt_alt_qty_VC(info);
		if (vc == columnRslt_alt_itm_typ) return doRslt_alt_itm_typ_VC(info);
		if (vc == columnRslt_alt_itm_typ_nm) return doRslt_alt_itm_typ_nm_VC(info);
		if (vc == columnRslt_alt_itm_ratio) return doRslt_alt_itm_ratio_VC(info);
		if (vc == columnRslt_alt_alloc_prio) return doRslt_alt_alloc_prio_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_in_xfr_typ) return doRslt_in_xfr_typ_VC(info);
		if (vc == columnRslt_in_xfr_typ_nm) return doRslt_in_xfr_typ_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_alloc_tgt_flg) return doRslt_alloc_tgt_flg_VC(info);
		if (vc == columnRslt_alloc_scope_typ) return doRslt_alloc_scope_typ_VC(info);
		if (vc == columnRslt_alloc_scope_typ_nm) return doRslt_alloc_scope_typ_nm_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_alloc_wait_flg) return doRslt_alloc_wait_flg_VC(info);
		if (vc == columnRslt_vld_dt_fr) return doRslt_vld_dt_fr_VC(info);
		if (vc == columnRslt_vld_dt_to) return doRslt_vld_dt_to_VC(info);
		if (vc == columnRslt_inpt_ctl_typ) return doRslt_inpt_ctl_typ_VC(info);
		if (vc == columnRslt_inpt_ctl_typ_nm) return doRslt_inpt_ctl_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_no) return doRslt_io_schd_no_VC(info);
		if (vc == columnRslt_io_schd_seq) return doRslt_io_schd_seq_VC(info);
		if (vc == columnRslt_io_schd_sub_typ1) return doRslt_io_schd_sub_typ1_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm1) return doRslt_io_schd_sub_typ_nm1_VC(info);
		if (vc == columnRslt_io_schd_sub_no1) return doRslt_io_schd_sub_no1_VC(info);
		if (vc == columnRslt_io_schd_sub_seq1) return doRslt_io_schd_sub_seq1_VC(info);
		if (vc == columnRslt_io_schd_sub_typ2) return doRslt_io_schd_sub_typ2_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm2) return doRslt_io_schd_sub_typ_nm2_VC(info);
		if (vc == columnRslt_io_schd_sub_no2) return doRslt_io_schd_sub_no2_VC(info);
		if (vc == columnRslt_io_schd_sub_seq2) return doRslt_io_schd_sub_seq2_VC(info);
		if (vc == columnRslt_io_schd_sub_typ3) return doRslt_io_schd_sub_typ3_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm3) return doRslt_io_schd_sub_typ_nm3_VC(info);
		if (vc == columnRslt_io_schd_sub_no3) return doRslt_io_schd_sub_no3_VC(info);
		if (vc == columnRslt_io_schd_sub_seq3) return doRslt_io_schd_sub_seq3_VC(info);
		if (vc == columnRslt_io_schd_sub_typ4) return doRslt_io_schd_sub_typ4_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm4) return doRslt_io_schd_sub_typ_nm4_VC(info);
		if (vc == columnRslt_io_schd_sub_no4) return doRslt_io_schd_sub_no4_VC(info);
		if (vc == columnRslt_io_schd_sub_seq4) return doRslt_io_schd_sub_seq4_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_sub_char4) return doRslt_sub_char4_VC(info);
		if (vc == columnRslt_sub_char5) return doRslt_sub_char5_VC(info);
		if (vc == columnRslt_sub_num1) return doRslt_sub_num1_VC(info);
		if (vc == columnRslt_sub_num2) return doRslt_sub_num2_VC(info);
		if (vc == columnRslt_sub_num3) return doRslt_sub_num3_VC(info);
		if (vc == columnRslt_sub_dt1) return doRslt_sub_dt1_VC(info);
		if (vc == columnRslt_sub_dt2) return doRslt_sub_dt2_VC(info);
		if (vc == columnRslt_sub_dt3) return doRslt_sub_dt3_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
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
	 * [Cnd]パネルの[schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_avl_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_avl_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_arrv_bp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_null_ng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_null_ng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1_null_ok_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_null_ok_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_null_ng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_null_ng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_null_ok_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_null_ok_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_null_ng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_null_ng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_null_ok_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_null_ok_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_null_ng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_null_ng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_null_ok_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_null_ok_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alt_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alt_itm_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_xfr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_xfr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_xfr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_xfr_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_scope_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_alloc_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_alloc_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[is_alloc_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_is_alloc_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yet_allocate_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yet_allocate_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[allocated_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_allocated_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_alloc_wait_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_alloc_wait_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[is_alloc_wait_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_is_alloc_wait_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_no3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_sub_no4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slip_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slip_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slip_schd_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slip_schd_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_avl_schd_dt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_arrv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_arrv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alt_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alt_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accpt_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_avl_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[i_pack_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_i_pack_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[o_pack_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_o_pack_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[i_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_i_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[o_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_o_base_unit_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_inst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alt_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_alloc_prio_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_xfr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_xfr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_xfr_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_scope_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_wait_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_wait_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_to_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_seq1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_seq2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_seq3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_seq4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt3_VC(MCEventInfo info){
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
		else if (nc == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NC(info);
		else if (nc == Cnd_schd_dt_to) doCnd_schd_dt_to_NC(info);
		else if (nc == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NC(info);
		else if (nc == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NC(info);
		else if (nc == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_NC(info);
		else if (nc == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_NC(info);
		else if (nc == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_NC(info);
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
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1_null_ng_flg) doCnd_sno1_null_ng_flg_NC(info);
		else if (nc == Cnd_sno1_null_ok_flg) doCnd_sno1_null_ok_flg_NC(info);
		else if (nc == Cnd_sno2_null_ng_flg) doCnd_sno2_null_ng_flg_NC(info);
		else if (nc == Cnd_sno2_null_ok_flg) doCnd_sno2_null_ok_flg_NC(info);
		else if (nc == Cnd_sno3_null_ng_flg) doCnd_sno3_null_ng_flg_NC(info);
		else if (nc == Cnd_sno3_null_ok_flg) doCnd_sno3_null_ok_flg_NC(info);
		else if (nc == Cnd_sno4_null_ng_flg) doCnd_sno4_null_ng_flg_NC(info);
		else if (nc == Cnd_sno4_null_ok_flg) doCnd_sno4_null_ok_flg_NC(info);
		else if (nc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NC(info);
		else if (nc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NC(info);
		else if (nc == Cnd_alt_grp_cd) doCnd_alt_grp_cd_NC(info);
		else if (nc == Cnd_alt_grp_nm) doCnd_alt_grp_nm_NC(info);
		else if (nc == Cnd_oper_inst_no) doCnd_oper_inst_no_NC(info);
		else if (nc == Cnd_oper_ord_no) doCnd_oper_ord_no_NC(info);
		else if (nc == Cnd_alt_itm_typ) doCnd_alt_itm_typ_NC(info);
		else if (nc == Cnd_alt_itm_typ_nm) doCnd_alt_itm_typ_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_in_xfr_typ) doCnd_in_xfr_typ_NC(info);
		else if (nc == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NC(info);
		else if (nc == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NC(info);
		else if (nc == Cnd_stk_id_typ) doCnd_stk_id_typ_NC(info);
		else if (nc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NC(info);
		else if (nc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NC(info);
		else if (nc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NC(info);
		else if (nc == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_NC(info);
		else if (nc == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_NC(info);
		else if (nc == Cnd_io_schd_typ) doCnd_io_schd_typ_NC(info);
		else if (nc == Cnd_io_schd_typ_nm) doCnd_io_schd_typ_nm_NC(info);
		else if (nc == Cnd_io_typ) doCnd_io_typ_NC(info);
		else if (nc == Cnd_io_typ_nm) doCnd_io_typ_nm_NC(info);
		else if (nc == Cnd_io_schd_sts_typ) doCnd_io_schd_sts_typ_NC(info);
		else if (nc == Cnd_io_schd_sts_typ_nm) doCnd_io_schd_sts_typ_nm_NC(info);
		else if (nc == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_NC(info);
		else if (nc == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_NC(info);
		else if (nc == Cnd_non_alloc_tgt_flg) doCnd_non_alloc_tgt_flg_NC(info);
		else if (nc == Cnd_is_alloc_tgt_flg) doCnd_is_alloc_tgt_flg_NC(info);
		else if (nc == Cnd_yet_allocate_flg) doCnd_yet_allocate_flg_NC(info);
		else if (nc == Cnd_allocated_flg) doCnd_allocated_flg_NC(info);
		else if (nc == Cnd_non_alloc_wait_flg) doCnd_non_alloc_wait_flg_NC(info);
		else if (nc == Cnd_is_alloc_wait_flg) doCnd_is_alloc_wait_flg_NC(info);
		else if (nc == Cnd_io_schd_no) doCnd_io_schd_no_NC(info);
		else if (nc == Cnd_io_schd_sub_typ1) doCnd_io_schd_sub_typ1_NC(info);
		else if (nc == Cnd_io_schd_sub_typ_nm1) doCnd_io_schd_sub_typ_nm1_NC(info);
		else if (nc == Cnd_io_schd_sub_no1) doCnd_io_schd_sub_no1_NC(info);
		else if (nc == Cnd_io_schd_sub_typ2) doCnd_io_schd_sub_typ2_NC(info);
		else if (nc == Cnd_io_schd_sub_typ_nm2) doCnd_io_schd_sub_typ_nm2_NC(info);
		else if (nc == Cnd_io_schd_sub_no2) doCnd_io_schd_sub_no2_NC(info);
		else if (nc == Cnd_io_schd_sub_typ3) doCnd_io_schd_sub_typ3_NC(info);
		else if (nc == Cnd_io_schd_sub_typ_nm3) doCnd_io_schd_sub_typ_nm3_NC(info);
		else if (nc == Cnd_io_schd_sub_no3) doCnd_io_schd_sub_no3_NC(info);
		else if (nc == Cnd_io_schd_sub_typ4) doCnd_io_schd_sub_typ4_NC(info);
		else if (nc == Cnd_io_schd_sub_typ_nm4) doCnd_io_schd_sub_typ_nm4_NC(info);
		else if (nc == Cnd_io_schd_sub_no4) doCnd_io_schd_sub_no4_NC(info);
		else if (nc == Cnd_io_schd_pr_no) doCnd_io_schd_pr_no_NC(info);
		else if (nc == Cnd_slip_schd_no) doCnd_slip_schd_no_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_sub_char4) doCnd_sub_char4_NC(info);
		else if (nc == Cnd_sub_char5) doCnd_sub_char5_NC(info);
		else if (nc == Cnd_sub_dt1) doCnd_sub_dt1_NC(info);
		else if (nc == Cnd_sub_dt2) doCnd_sub_dt2_NC(info);
		else if (nc == Cnd_sub_dt3) doCnd_sub_dt3_NC(info);
		else if (nc == Cnd_slip_schd_no_flg) doCnd_slip_schd_no_flg_NC(info);
		else if (nc == Cnd_schd_dt_flg) doCnd_schd_dt_flg_NC(info);
		else if (nc == Cnd_accpt_schd_dt_flg) doCnd_accpt_schd_dt_flg_NC(info);
		else if (nc == Cnd_avl_schd_dt_flg) doCnd_avl_schd_dt_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_str_ln_flg) doCnd_str_ln_flg_NC(info);
		else if (nc == Cnd_stk_arrv_flg) doCnd_stk_arrv_flg_NC(info);
		else if (nc == Cnd_site_flg) doCnd_site_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_lg_grp_flg) doCnd_lg_grp_flg_NC(info);
		else if (nc == Cnd_alloc_grp_flg) doCnd_alloc_grp_flg_NC(info);
		else if (nc == Cnd_loc_grp_flg) doCnd_loc_grp_flg_NC(info);
		else if (nc == Cnd_sppl_flg) doCnd_sppl_flg_NC(info);
		else if (nc == Cnd_lot_no_flg) doCnd_lot_no_flg_NC(info);
		else if (nc == Cnd_sublot_no_flg) doCnd_sublot_no_flg_NC(info);
		else if (nc == Cnd_pack_flg) doCnd_pack_flg_NC(info);
		else if (nc == Cnd_alt_grp_flg) doCnd_alt_grp_flg_NC(info);
		else if (nc == Cnd_gd_flg) doCnd_gd_flg_NC(info);
		else if (nc == columnRslt_slip_schd_no) doRslt_slip_schd_no_NC(info);
		else if (nc == columnRslt_schd_dt) doRslt_schd_dt_NC(info);
		else if (nc == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NC(info);
		else if (nc == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_NC(info);
		else if (nc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NC(info);
		else if (nc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NC(info);
		else if (nc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NC(info);
		else if (nc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_io_schd_typ) doRslt_io_schd_typ_NC(info);
		else if (nc == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NC(info);
		else if (nc == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRslt_io_typ) doRslt_io_typ_NC(info);
		else if (nc == columnRslt_io_typ_nm) doRslt_io_typ_nm_NC(info);
		else if (nc == columnRslt_i_pack_unit_qty) doRslt_i_pack_unit_qty_NC(info);
		else if (nc == columnRslt_o_pack_unit_qty) doRslt_o_pack_unit_qty_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_i_base_unit_qty) doRslt_i_base_unit_qty_NC(info);
		else if (nc == columnRslt_o_base_unit_qty) doRslt_o_base_unit_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NC(info);
		else if (nc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NC(info);
		else if (nc == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NC(info);
		else if (nc == columnRslt_oper_inst_no) doRslt_oper_inst_no_NC(info);
		else if (nc == columnRslt_oper_ord_no) doRslt_oper_ord_no_NC(info);
		else if (nc == columnRslt_alt_qty) doRslt_alt_qty_NC(info);
		else if (nc == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NC(info);
		else if (nc == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NC(info);
		else if (nc == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NC(info);
		else if (nc == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_alloc_tgt_flg) doRslt_alloc_tgt_flg_NC(info);
		else if (nc == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NC(info);
		else if (nc == columnRslt_alloc_scope_typ_nm) doRslt_alloc_scope_typ_nm_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_alloc_wait_flg) doRslt_alloc_wait_flg_NC(info);
		else if (nc == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NC(info);
		else if (nc == columnRslt_vld_dt_to) doRslt_vld_dt_to_NC(info);
		else if (nc == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NC(info);
		else if (nc == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_no) doRslt_io_schd_no_NC(info);
		else if (nc == columnRslt_io_schd_seq) doRslt_io_schd_seq_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_NC(info);
		else if (nc == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_NC(info);
		else if (nc == columnRslt_io_schd_sub_seq1) doRslt_io_schd_sub_seq1_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_NC(info);
		else if (nc == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_NC(info);
		else if (nc == columnRslt_io_schd_sub_seq2) doRslt_io_schd_sub_seq2_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_NC(info);
		else if (nc == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_NC(info);
		else if (nc == columnRslt_io_schd_sub_seq3) doRslt_io_schd_sub_seq3_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_NC(info);
		else if (nc == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_NC(info);
		else if (nc == columnRslt_io_schd_sub_seq4) doRslt_io_schd_sub_seq4_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_sub_char4) doRslt_sub_char4_NC(info);
		else if (nc == columnRslt_sub_char5) doRslt_sub_char5_NC(info);
		else if (nc == columnRslt_sub_num1) doRslt_sub_num1_NC(info);
		else if (nc == columnRslt_sub_num2) doRslt_sub_num2_NC(info);
		else if (nc == columnRslt_sub_num3) doRslt_sub_num3_NC(info);
		else if (nc == columnRslt_sub_dt1) doRslt_sub_dt1_NC(info);
		else if (nc == columnRslt_sub_dt2) doRslt_sub_dt2_NC(info);
		else if (nc == columnRslt_sub_dt3) doRslt_sub_dt3_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
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
	 * [Cnd]パネルの[schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_null_ng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_null_ng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_null_ok_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_null_ok_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_null_ng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_null_ng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_null_ok_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_null_ok_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_null_ng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_null_ng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_null_ok_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_null_ok_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_null_ng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_null_ng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_null_ok_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_null_ok_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_xfr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_xfr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_alloc_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_alloc_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[is_alloc_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_is_alloc_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yet_allocate_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yet_allocate_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[allocated_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_allocated_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_alloc_wait_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_alloc_wait_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[is_alloc_wait_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_is_alloc_wait_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_pack_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_pack_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_pack_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_pack_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_base_unit_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_xfr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_wait_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_wait_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NC(MCEventInfo info){
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
		else if (ne == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NE(info);
		else if (ne == Cnd_schd_dt_to) doCnd_schd_dt_to_NE(info);
		else if (ne == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NE(info);
		else if (ne == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NE(info);
		else if (ne == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_NE(info);
		else if (ne == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_NE(info);
		else if (ne == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_NE(info);
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
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1_null_ng_flg) doCnd_sno1_null_ng_flg_NE(info);
		else if (ne == Cnd_sno1_null_ok_flg) doCnd_sno1_null_ok_flg_NE(info);
		else if (ne == Cnd_sno2_null_ng_flg) doCnd_sno2_null_ng_flg_NE(info);
		else if (ne == Cnd_sno2_null_ok_flg) doCnd_sno2_null_ok_flg_NE(info);
		else if (ne == Cnd_sno3_null_ng_flg) doCnd_sno3_null_ng_flg_NE(info);
		else if (ne == Cnd_sno3_null_ok_flg) doCnd_sno3_null_ok_flg_NE(info);
		else if (ne == Cnd_sno4_null_ng_flg) doCnd_sno4_null_ng_flg_NE(info);
		else if (ne == Cnd_sno4_null_ok_flg) doCnd_sno4_null_ok_flg_NE(info);
		else if (ne == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NE(info);
		else if (ne == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NE(info);
		else if (ne == Cnd_alt_grp_cd) doCnd_alt_grp_cd_NE(info);
		else if (ne == Cnd_alt_grp_nm) doCnd_alt_grp_nm_NE(info);
		else if (ne == Cnd_oper_inst_no) doCnd_oper_inst_no_NE(info);
		else if (ne == Cnd_oper_ord_no) doCnd_oper_ord_no_NE(info);
		else if (ne == Cnd_alt_itm_typ) doCnd_alt_itm_typ_NE(info);
		else if (ne == Cnd_alt_itm_typ_nm) doCnd_alt_itm_typ_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_in_xfr_typ) doCnd_in_xfr_typ_NE(info);
		else if (ne == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NE(info);
		else if (ne == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NE(info);
		else if (ne == Cnd_stk_id_typ) doCnd_stk_id_typ_NE(info);
		else if (ne == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NE(info);
		else if (ne == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NE(info);
		else if (ne == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NE(info);
		else if (ne == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_NE(info);
		else if (ne == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_NE(info);
		else if (ne == Cnd_io_schd_typ) doCnd_io_schd_typ_NE(info);
		else if (ne == Cnd_io_schd_typ_nm) doCnd_io_schd_typ_nm_NE(info);
		else if (ne == Cnd_io_typ) doCnd_io_typ_NE(info);
		else if (ne == Cnd_io_typ_nm) doCnd_io_typ_nm_NE(info);
		else if (ne == Cnd_io_schd_sts_typ) doCnd_io_schd_sts_typ_NE(info);
		else if (ne == Cnd_io_schd_sts_typ_nm) doCnd_io_schd_sts_typ_nm_NE(info);
		else if (ne == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_NE(info);
		else if (ne == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_NE(info);
		else if (ne == Cnd_non_alloc_tgt_flg) doCnd_non_alloc_tgt_flg_NE(info);
		else if (ne == Cnd_is_alloc_tgt_flg) doCnd_is_alloc_tgt_flg_NE(info);
		else if (ne == Cnd_yet_allocate_flg) doCnd_yet_allocate_flg_NE(info);
		else if (ne == Cnd_allocated_flg) doCnd_allocated_flg_NE(info);
		else if (ne == Cnd_non_alloc_wait_flg) doCnd_non_alloc_wait_flg_NE(info);
		else if (ne == Cnd_is_alloc_wait_flg) doCnd_is_alloc_wait_flg_NE(info);
		else if (ne == Cnd_io_schd_no) doCnd_io_schd_no_NE(info);
		else if (ne == Cnd_io_schd_sub_typ1) doCnd_io_schd_sub_typ1_NE(info);
		else if (ne == Cnd_io_schd_sub_typ_nm1) doCnd_io_schd_sub_typ_nm1_NE(info);
		else if (ne == Cnd_io_schd_sub_no1) doCnd_io_schd_sub_no1_NE(info);
		else if (ne == Cnd_io_schd_sub_typ2) doCnd_io_schd_sub_typ2_NE(info);
		else if (ne == Cnd_io_schd_sub_typ_nm2) doCnd_io_schd_sub_typ_nm2_NE(info);
		else if (ne == Cnd_io_schd_sub_no2) doCnd_io_schd_sub_no2_NE(info);
		else if (ne == Cnd_io_schd_sub_typ3) doCnd_io_schd_sub_typ3_NE(info);
		else if (ne == Cnd_io_schd_sub_typ_nm3) doCnd_io_schd_sub_typ_nm3_NE(info);
		else if (ne == Cnd_io_schd_sub_no3) doCnd_io_schd_sub_no3_NE(info);
		else if (ne == Cnd_io_schd_sub_typ4) doCnd_io_schd_sub_typ4_NE(info);
		else if (ne == Cnd_io_schd_sub_typ_nm4) doCnd_io_schd_sub_typ_nm4_NE(info);
		else if (ne == Cnd_io_schd_sub_no4) doCnd_io_schd_sub_no4_NE(info);
		else if (ne == Cnd_io_schd_pr_no) doCnd_io_schd_pr_no_NE(info);
		else if (ne == Cnd_slip_schd_no) doCnd_slip_schd_no_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_sub_char4) doCnd_sub_char4_NE(info);
		else if (ne == Cnd_sub_char5) doCnd_sub_char5_NE(info);
		else if (ne == Cnd_sub_dt1) doCnd_sub_dt1_NE(info);
		else if (ne == Cnd_sub_dt2) doCnd_sub_dt2_NE(info);
		else if (ne == Cnd_sub_dt3) doCnd_sub_dt3_NE(info);
		else if (ne == Cnd_slip_schd_no_flg) doCnd_slip_schd_no_flg_NE(info);
		else if (ne == Cnd_schd_dt_flg) doCnd_schd_dt_flg_NE(info);
		else if (ne == Cnd_accpt_schd_dt_flg) doCnd_accpt_schd_dt_flg_NE(info);
		else if (ne == Cnd_avl_schd_dt_flg) doCnd_avl_schd_dt_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_str_ln_flg) doCnd_str_ln_flg_NE(info);
		else if (ne == Cnd_stk_arrv_flg) doCnd_stk_arrv_flg_NE(info);
		else if (ne == Cnd_site_flg) doCnd_site_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_lg_grp_flg) doCnd_lg_grp_flg_NE(info);
		else if (ne == Cnd_alloc_grp_flg) doCnd_alloc_grp_flg_NE(info);
		else if (ne == Cnd_loc_grp_flg) doCnd_loc_grp_flg_NE(info);
		else if (ne == Cnd_sppl_flg) doCnd_sppl_flg_NE(info);
		else if (ne == Cnd_lot_no_flg) doCnd_lot_no_flg_NE(info);
		else if (ne == Cnd_sublot_no_flg) doCnd_sublot_no_flg_NE(info);
		else if (ne == Cnd_pack_flg) doCnd_pack_flg_NE(info);
		else if (ne == Cnd_alt_grp_flg) doCnd_alt_grp_flg_NE(info);
		else if (ne == Cnd_gd_flg) doCnd_gd_flg_NE(info);
		else if (ne == columnRslt_slip_schd_no) doRslt_slip_schd_no_NE(info);
		else if (ne == columnRslt_schd_dt) doRslt_schd_dt_NE(info);
		else if (ne == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NE(info);
		else if (ne == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_NE(info);
		else if (ne == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NE(info);
		else if (ne == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NE(info);
		else if (ne == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NE(info);
		else if (ne == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_io_schd_typ) doRslt_io_schd_typ_NE(info);
		else if (ne == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NE(info);
		else if (ne == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRslt_io_typ) doRslt_io_typ_NE(info);
		else if (ne == columnRslt_io_typ_nm) doRslt_io_typ_nm_NE(info);
		else if (ne == columnRslt_i_pack_unit_qty) doRslt_i_pack_unit_qty_NE(info);
		else if (ne == columnRslt_o_pack_unit_qty) doRslt_o_pack_unit_qty_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_i_base_unit_qty) doRslt_i_base_unit_qty_NE(info);
		else if (ne == columnRslt_o_base_unit_qty) doRslt_o_base_unit_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NE(info);
		else if (ne == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NE(info);
		else if (ne == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NE(info);
		else if (ne == columnRslt_oper_inst_no) doRslt_oper_inst_no_NE(info);
		else if (ne == columnRslt_oper_ord_no) doRslt_oper_ord_no_NE(info);
		else if (ne == columnRslt_alt_qty) doRslt_alt_qty_NE(info);
		else if (ne == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NE(info);
		else if (ne == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NE(info);
		else if (ne == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NE(info);
		else if (ne == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_alloc_tgt_flg) doRslt_alloc_tgt_flg_NE(info);
		else if (ne == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NE(info);
		else if (ne == columnRslt_alloc_scope_typ_nm) doRslt_alloc_scope_typ_nm_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_alloc_wait_flg) doRslt_alloc_wait_flg_NE(info);
		else if (ne == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NE(info);
		else if (ne == columnRslt_vld_dt_to) doRslt_vld_dt_to_NE(info);
		else if (ne == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NE(info);
		else if (ne == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_no) doRslt_io_schd_no_NE(info);
		else if (ne == columnRslt_io_schd_seq) doRslt_io_schd_seq_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_NE(info);
		else if (ne == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_NE(info);
		else if (ne == columnRslt_io_schd_sub_seq1) doRslt_io_schd_sub_seq1_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_NE(info);
		else if (ne == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_NE(info);
		else if (ne == columnRslt_io_schd_sub_seq2) doRslt_io_schd_sub_seq2_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_NE(info);
		else if (ne == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_NE(info);
		else if (ne == columnRslt_io_schd_sub_seq3) doRslt_io_schd_sub_seq3_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_NE(info);
		else if (ne == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_NE(info);
		else if (ne == columnRslt_io_schd_sub_seq4) doRslt_io_schd_sub_seq4_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_sub_char4) doRslt_sub_char4_NE(info);
		else if (ne == columnRslt_sub_char5) doRslt_sub_char5_NE(info);
		else if (ne == columnRslt_sub_num1) doRslt_sub_num1_NE(info);
		else if (ne == columnRslt_sub_num2) doRslt_sub_num2_NE(info);
		else if (ne == columnRslt_sub_num3) doRslt_sub_num3_NE(info);
		else if (ne == columnRslt_sub_dt1) doRslt_sub_dt1_NE(info);
		else if (ne == columnRslt_sub_dt2) doRslt_sub_dt2_NE(info);
		else if (ne == columnRslt_sub_dt3) doRslt_sub_dt3_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
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
	 * [Cnd]パネルの[schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_null_ng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_null_ng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_null_ok_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_null_ok_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_null_ng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_null_ng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_null_ok_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_null_ok_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_null_ng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_null_ng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_null_ok_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_null_ok_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_null_ng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_null_ng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_null_ok_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_null_ok_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[in_xfr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_xfr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_alloc_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_alloc_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[is_alloc_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_is_alloc_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yet_allocate_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yet_allocate_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[allocated_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_allocated_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_alloc_wait_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_alloc_wait_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[is_alloc_wait_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_is_alloc_wait_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_pack_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_pack_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_pack_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_pack_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_base_unit_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_xfr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_wait_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_wait_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NE(MCEventInfo info){
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
		else if (nx == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NX(info);
		else if (nx == Cnd_schd_dt_to) doCnd_schd_dt_to_NX(info);
		else if (nx == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NX(info);
		else if (nx == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NX(info);
		else if (nx == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_NX(info);
		else if (nx == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_NX(info);
		else if (nx == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_NX(info);
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
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1_null_ng_flg) doCnd_sno1_null_ng_flg_NX(info);
		else if (nx == Cnd_sno1_null_ok_flg) doCnd_sno1_null_ok_flg_NX(info);
		else if (nx == Cnd_sno2_null_ng_flg) doCnd_sno2_null_ng_flg_NX(info);
		else if (nx == Cnd_sno2_null_ok_flg) doCnd_sno2_null_ok_flg_NX(info);
		else if (nx == Cnd_sno3_null_ng_flg) doCnd_sno3_null_ng_flg_NX(info);
		else if (nx == Cnd_sno3_null_ok_flg) doCnd_sno3_null_ok_flg_NX(info);
		else if (nx == Cnd_sno4_null_ng_flg) doCnd_sno4_null_ng_flg_NX(info);
		else if (nx == Cnd_sno4_null_ok_flg) doCnd_sno4_null_ok_flg_NX(info);
		else if (nx == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NX(info);
		else if (nx == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NX(info);
		else if (nx == Cnd_alt_grp_cd) doCnd_alt_grp_cd_NX(info);
		else if (nx == Cnd_alt_grp_nm) doCnd_alt_grp_nm_NX(info);
		else if (nx == Cnd_oper_inst_no) doCnd_oper_inst_no_NX(info);
		else if (nx == Cnd_oper_ord_no) doCnd_oper_ord_no_NX(info);
		else if (nx == Cnd_alt_itm_typ) doCnd_alt_itm_typ_NX(info);
		else if (nx == Cnd_alt_itm_typ_nm) doCnd_alt_itm_typ_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_in_xfr_typ) doCnd_in_xfr_typ_NX(info);
		else if (nx == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NX(info);
		else if (nx == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NX(info);
		else if (nx == Cnd_stk_id_typ) doCnd_stk_id_typ_NX(info);
		else if (nx == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NX(info);
		else if (nx == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NX(info);
		else if (nx == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NX(info);
		else if (nx == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_NX(info);
		else if (nx == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_NX(info);
		else if (nx == Cnd_io_schd_typ) doCnd_io_schd_typ_NX(info);
		else if (nx == Cnd_io_schd_typ_nm) doCnd_io_schd_typ_nm_NX(info);
		else if (nx == Cnd_io_typ) doCnd_io_typ_NX(info);
		else if (nx == Cnd_io_typ_nm) doCnd_io_typ_nm_NX(info);
		else if (nx == Cnd_io_schd_sts_typ) doCnd_io_schd_sts_typ_NX(info);
		else if (nx == Cnd_io_schd_sts_typ_nm) doCnd_io_schd_sts_typ_nm_NX(info);
		else if (nx == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_NX(info);
		else if (nx == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_NX(info);
		else if (nx == Cnd_non_alloc_tgt_flg) doCnd_non_alloc_tgt_flg_NX(info);
		else if (nx == Cnd_is_alloc_tgt_flg) doCnd_is_alloc_tgt_flg_NX(info);
		else if (nx == Cnd_yet_allocate_flg) doCnd_yet_allocate_flg_NX(info);
		else if (nx == Cnd_allocated_flg) doCnd_allocated_flg_NX(info);
		else if (nx == Cnd_non_alloc_wait_flg) doCnd_non_alloc_wait_flg_NX(info);
		else if (nx == Cnd_is_alloc_wait_flg) doCnd_is_alloc_wait_flg_NX(info);
		else if (nx == Cnd_io_schd_no) doCnd_io_schd_no_NX(info);
		else if (nx == Cnd_io_schd_sub_typ1) doCnd_io_schd_sub_typ1_NX(info);
		else if (nx == Cnd_io_schd_sub_typ_nm1) doCnd_io_schd_sub_typ_nm1_NX(info);
		else if (nx == Cnd_io_schd_sub_no1) doCnd_io_schd_sub_no1_NX(info);
		else if (nx == Cnd_io_schd_sub_typ2) doCnd_io_schd_sub_typ2_NX(info);
		else if (nx == Cnd_io_schd_sub_typ_nm2) doCnd_io_schd_sub_typ_nm2_NX(info);
		else if (nx == Cnd_io_schd_sub_no2) doCnd_io_schd_sub_no2_NX(info);
		else if (nx == Cnd_io_schd_sub_typ3) doCnd_io_schd_sub_typ3_NX(info);
		else if (nx == Cnd_io_schd_sub_typ_nm3) doCnd_io_schd_sub_typ_nm3_NX(info);
		else if (nx == Cnd_io_schd_sub_no3) doCnd_io_schd_sub_no3_NX(info);
		else if (nx == Cnd_io_schd_sub_typ4) doCnd_io_schd_sub_typ4_NX(info);
		else if (nx == Cnd_io_schd_sub_typ_nm4) doCnd_io_schd_sub_typ_nm4_NX(info);
		else if (nx == Cnd_io_schd_sub_no4) doCnd_io_schd_sub_no4_NX(info);
		else if (nx == Cnd_io_schd_pr_no) doCnd_io_schd_pr_no_NX(info);
		else if (nx == Cnd_slip_schd_no) doCnd_slip_schd_no_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_sub_char4) doCnd_sub_char4_NX(info);
		else if (nx == Cnd_sub_char5) doCnd_sub_char5_NX(info);
		else if (nx == Cnd_sub_dt1) doCnd_sub_dt1_NX(info);
		else if (nx == Cnd_sub_dt2) doCnd_sub_dt2_NX(info);
		else if (nx == Cnd_sub_dt3) doCnd_sub_dt3_NX(info);
		else if (nx == Cnd_slip_schd_no_flg) doCnd_slip_schd_no_flg_NX(info);
		else if (nx == Cnd_schd_dt_flg) doCnd_schd_dt_flg_NX(info);
		else if (nx == Cnd_accpt_schd_dt_flg) doCnd_accpt_schd_dt_flg_NX(info);
		else if (nx == Cnd_avl_schd_dt_flg) doCnd_avl_schd_dt_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_str_ln_flg) doCnd_str_ln_flg_NX(info);
		else if (nx == Cnd_stk_arrv_flg) doCnd_stk_arrv_flg_NX(info);
		else if (nx == Cnd_site_flg) doCnd_site_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_lg_grp_flg) doCnd_lg_grp_flg_NX(info);
		else if (nx == Cnd_alloc_grp_flg) doCnd_alloc_grp_flg_NX(info);
		else if (nx == Cnd_loc_grp_flg) doCnd_loc_grp_flg_NX(info);
		else if (nx == Cnd_sppl_flg) doCnd_sppl_flg_NX(info);
		else if (nx == Cnd_lot_no_flg) doCnd_lot_no_flg_NX(info);
		else if (nx == Cnd_sublot_no_flg) doCnd_sublot_no_flg_NX(info);
		else if (nx == Cnd_pack_flg) doCnd_pack_flg_NX(info);
		else if (nx == Cnd_alt_grp_flg) doCnd_alt_grp_flg_NX(info);
		else if (nx == Cnd_gd_flg) doCnd_gd_flg_NX(info);
		else if (nx == columnRslt_slip_schd_no) doRslt_slip_schd_no_NX(info);
		else if (nx == columnRslt_schd_dt) doRslt_schd_dt_NX(info);
		else if (nx == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NX(info);
		else if (nx == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_NX(info);
		else if (nx == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NX(info);
		else if (nx == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NX(info);
		else if (nx == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NX(info);
		else if (nx == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_io_schd_typ) doRslt_io_schd_typ_NX(info);
		else if (nx == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NX(info);
		else if (nx == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRslt_io_typ) doRslt_io_typ_NX(info);
		else if (nx == columnRslt_io_typ_nm) doRslt_io_typ_nm_NX(info);
		else if (nx == columnRslt_i_pack_unit_qty) doRslt_i_pack_unit_qty_NX(info);
		else if (nx == columnRslt_o_pack_unit_qty) doRslt_o_pack_unit_qty_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_i_base_unit_qty) doRslt_i_base_unit_qty_NX(info);
		else if (nx == columnRslt_o_base_unit_qty) doRslt_o_base_unit_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NX(info);
		else if (nx == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NX(info);
		else if (nx == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_NX(info);
		else if (nx == columnRslt_oper_inst_no) doRslt_oper_inst_no_NX(info);
		else if (nx == columnRslt_oper_ord_no) doRslt_oper_ord_no_NX(info);
		else if (nx == columnRslt_alt_qty) doRslt_alt_qty_NX(info);
		else if (nx == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_NX(info);
		else if (nx == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NX(info);
		else if (nx == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NX(info);
		else if (nx == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_alloc_tgt_flg) doRslt_alloc_tgt_flg_NX(info);
		else if (nx == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NX(info);
		else if (nx == columnRslt_alloc_scope_typ_nm) doRslt_alloc_scope_typ_nm_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_alloc_wait_flg) doRslt_alloc_wait_flg_NX(info);
		else if (nx == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NX(info);
		else if (nx == columnRslt_vld_dt_to) doRslt_vld_dt_to_NX(info);
		else if (nx == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_NX(info);
		else if (nx == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_no) doRslt_io_schd_no_NX(info);
		else if (nx == columnRslt_io_schd_seq) doRslt_io_schd_seq_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_NX(info);
		else if (nx == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_NX(info);
		else if (nx == columnRslt_io_schd_sub_seq1) doRslt_io_schd_sub_seq1_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_NX(info);
		else if (nx == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_NX(info);
		else if (nx == columnRslt_io_schd_sub_seq2) doRslt_io_schd_sub_seq2_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_NX(info);
		else if (nx == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_NX(info);
		else if (nx == columnRslt_io_schd_sub_seq3) doRslt_io_schd_sub_seq3_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_NX(info);
		else if (nx == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_NX(info);
		else if (nx == columnRslt_io_schd_sub_seq4) doRslt_io_schd_sub_seq4_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_sub_char4) doRslt_sub_char4_NX(info);
		else if (nx == columnRslt_sub_char5) doRslt_sub_char5_NX(info);
		else if (nx == columnRslt_sub_num1) doRslt_sub_num1_NX(info);
		else if (nx == columnRslt_sub_num2) doRslt_sub_num2_NX(info);
		else if (nx == columnRslt_sub_num3) doRslt_sub_num3_NX(info);
		else if (nx == columnRslt_sub_dt1) doRslt_sub_dt1_NX(info);
		else if (nx == columnRslt_sub_dt2) doRslt_sub_dt2_NX(info);
		else if (nx == columnRslt_sub_dt3) doRslt_sub_dt3_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
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
	 * [Cnd]パネルの[schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_null_ng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_null_ng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_null_ok_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_null_ok_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_null_ng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_null_ng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_null_ok_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_null_ok_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_null_ng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_null_ng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_null_ok_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_null_ok_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_null_ng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_null_ng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_null_ok_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_null_ok_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[in_xfr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_xfr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_alloc_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_alloc_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[is_alloc_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_is_alloc_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yet_allocate_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yet_allocate_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[allocated_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_allocated_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_alloc_wait_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_alloc_wait_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[is_alloc_wait_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_is_alloc_wait_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_pack_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_pack_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_pack_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_pack_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_base_unit_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_xfr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_wait_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_wait_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NX(MCEventInfo info){
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
		if (lc == Cnd_schd_dt_fr) doCnd_schd_dt_fr_LC(info);
		else if (lc == Cnd_schd_dt_to) doCnd_schd_dt_to_LC(info);
		else if (lc == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_LC(info);
		else if (lc == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_LC(info);
		else if (lc == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_LC(info);
		else if (lc == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_LC(info);
		else if (lc == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_LC(info);
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
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_LC(info);
		else if (lc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_LC(info);
		else if (lc == Cnd_alt_grp_cd) doCnd_alt_grp_cd_LC(info);
		else if (lc == Cnd_alt_grp_nm) doCnd_alt_grp_nm_LC(info);
		else if (lc == Cnd_oper_inst_no) doCnd_oper_inst_no_LC(info);
		else if (lc == Cnd_oper_ord_no) doCnd_oper_ord_no_LC(info);
		else if (lc == Cnd_alt_itm_typ) doCnd_alt_itm_typ_LC(info);
		else if (lc == Cnd_alt_itm_typ_nm) doCnd_alt_itm_typ_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_in_xfr_typ) doCnd_in_xfr_typ_LC(info);
		else if (lc == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_stk_insp_typ) doCnd_stk_insp_typ_LC(info);
		else if (lc == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_LC(info);
		else if (lc == Cnd_stk_id_typ) doCnd_stk_id_typ_LC(info);
		else if (lc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_LC(info);
		else if (lc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_LC(info);
		else if (lc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_LC(info);
		else if (lc == Cnd_inpt_ctl_typ) doCnd_inpt_ctl_typ_LC(info);
		else if (lc == Cnd_inpt_ctl_typ_nm) doCnd_inpt_ctl_typ_nm_LC(info);
		else if (lc == Cnd_io_schd_typ) doCnd_io_schd_typ_LC(info);
		else if (lc == Cnd_io_schd_typ_nm) doCnd_io_schd_typ_nm_LC(info);
		else if (lc == Cnd_io_typ) doCnd_io_typ_LC(info);
		else if (lc == Cnd_io_typ_nm) doCnd_io_typ_nm_LC(info);
		else if (lc == Cnd_io_schd_sts_typ) doCnd_io_schd_sts_typ_LC(info);
		else if (lc == Cnd_io_schd_sts_typ_nm) doCnd_io_schd_sts_typ_nm_LC(info);
		else if (lc == Cnd_alloc_scope_typ) doCnd_alloc_scope_typ_LC(info);
		else if (lc == Cnd_alloc_scope_typ_nm) doCnd_alloc_scope_typ_nm_LC(info);
		else if (lc == Cnd_io_schd_no) doCnd_io_schd_no_LC(info);
		else if (lc == Cnd_io_schd_sub_typ1) doCnd_io_schd_sub_typ1_LC(info);
		else if (lc == Cnd_io_schd_sub_typ_nm1) doCnd_io_schd_sub_typ_nm1_LC(info);
		else if (lc == Cnd_io_schd_sub_no1) doCnd_io_schd_sub_no1_LC(info);
		else if (lc == Cnd_io_schd_sub_typ2) doCnd_io_schd_sub_typ2_LC(info);
		else if (lc == Cnd_io_schd_sub_typ_nm2) doCnd_io_schd_sub_typ_nm2_LC(info);
		else if (lc == Cnd_io_schd_sub_no2) doCnd_io_schd_sub_no2_LC(info);
		else if (lc == Cnd_io_schd_sub_typ3) doCnd_io_schd_sub_typ3_LC(info);
		else if (lc == Cnd_io_schd_sub_typ_nm3) doCnd_io_schd_sub_typ_nm3_LC(info);
		else if (lc == Cnd_io_schd_sub_no3) doCnd_io_schd_sub_no3_LC(info);
		else if (lc == Cnd_io_schd_sub_typ4) doCnd_io_schd_sub_typ4_LC(info);
		else if (lc == Cnd_io_schd_sub_typ_nm4) doCnd_io_schd_sub_typ_nm4_LC(info);
		else if (lc == Cnd_io_schd_sub_no4) doCnd_io_schd_sub_no4_LC(info);
		else if (lc == Cnd_io_schd_pr_no) doCnd_io_schd_pr_no_LC(info);
		else if (lc == Cnd_slip_schd_no) doCnd_slip_schd_no_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_sub_char4) doCnd_sub_char4_LC(info);
		else if (lc == Cnd_sub_char5) doCnd_sub_char5_LC(info);
		else if (lc == Cnd_sub_dt1) doCnd_sub_dt1_LC(info);
		else if (lc == Cnd_sub_dt2) doCnd_sub_dt2_LC(info);
		else if (lc == Cnd_sub_dt3) doCnd_sub_dt3_LC(info);
		else if (lc == columnRslt_slip_schd_no) doRslt_slip_schd_no_LC(info);
		else if (lc == columnRslt_schd_dt) doRslt_schd_dt_LC(info);
		else if (lc == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_LC(info);
		else if (lc == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_LC(info);
		else if (lc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_LC(info);
		else if (lc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_LC(info);
		else if (lc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_LC(info);
		else if (lc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_io_schd_typ) doRslt_io_schd_typ_LC(info);
		else if (lc == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_LC(info);
		else if (lc == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRslt_io_typ) doRslt_io_typ_LC(info);
		else if (lc == columnRslt_io_typ_nm) doRslt_io_typ_nm_LC(info);
		else if (lc == columnRslt_i_pack_unit_qty) doRslt_i_pack_unit_qty_LC(info);
		else if (lc == columnRslt_o_pack_unit_qty) doRslt_o_pack_unit_qty_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_i_base_unit_qty) doRslt_i_base_unit_qty_LC(info);
		else if (lc == columnRslt_o_base_unit_qty) doRslt_o_base_unit_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_LC(info);
		else if (lc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_LC(info);
		else if (lc == columnRslt_alt_grp_seq) doRslt_alt_grp_seq_LC(info);
		else if (lc == columnRslt_oper_inst_no) doRslt_oper_inst_no_LC(info);
		else if (lc == columnRslt_oper_ord_no) doRslt_oper_ord_no_LC(info);
		else if (lc == columnRslt_alt_qty) doRslt_alt_qty_LC(info);
		else if (lc == columnRslt_alt_itm_typ) doRslt_alt_itm_typ_LC(info);
		else if (lc == columnRslt_alt_itm_typ_nm) doRslt_alt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_LC(info);
		else if (lc == columnRslt_alt_alloc_prio) doRslt_alt_alloc_prio_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_LC(info);
		else if (lc == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_LC(info);
		else if (lc == columnRslt_alloc_scope_typ_nm) doRslt_alloc_scope_typ_nm_LC(info);
		else if (lc == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_LC(info);
		else if (lc == columnRslt_vld_dt_to) doRslt_vld_dt_to_LC(info);
		else if (lc == columnRslt_inpt_ctl_typ) doRslt_inpt_ctl_typ_LC(info);
		else if (lc == columnRslt_inpt_ctl_typ_nm) doRslt_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_no) doRslt_io_schd_no_LC(info);
		else if (lc == columnRslt_io_schd_seq) doRslt_io_schd_seq_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_LC(info);
		else if (lc == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_LC(info);
		else if (lc == columnRslt_io_schd_sub_seq1) doRslt_io_schd_sub_seq1_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_LC(info);
		else if (lc == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_LC(info);
		else if (lc == columnRslt_io_schd_sub_seq2) doRslt_io_schd_sub_seq2_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_LC(info);
		else if (lc == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_LC(info);
		else if (lc == columnRslt_io_schd_sub_seq3) doRslt_io_schd_sub_seq3_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_LC(info);
		else if (lc == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_LC(info);
		else if (lc == columnRslt_io_schd_sub_seq4) doRslt_io_schd_sub_seq4_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_sub_char4) doRslt_sub_char4_LC(info);
		else if (lc == columnRslt_sub_char5) doRslt_sub_char5_LC(info);
		else if (lc == columnRslt_sub_num1) doRslt_sub_num1_LC(info);
		else if (lc == columnRslt_sub_num2) doRslt_sub_num2_LC(info);
		else if (lc == columnRslt_sub_num3) doRslt_sub_num3_LC(info);
		else if (lc == columnRslt_sub_dt1) doRslt_sub_dt1_LC(info);
		else if (lc == columnRslt_sub_dt2) doRslt_sub_dt2_LC(info);
		else if (lc == columnRslt_sub_dt3) doRslt_sub_dt3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
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
	 * [Cnd]パネルの[schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_itm_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_xfr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_xfr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_xfr_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_scope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_scope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_sub_no4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_sub_no4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slip_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slip_schd_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_pack_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_pack_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_pack_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_pack_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[i_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_i_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[o_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_o_base_unit_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_alloc_prio_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_xfr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_seq4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_seq4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getCnd_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Cnd_pack_unit_cd]の作成メソッド
	 */
	public MCList getCnd_pack_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alt_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alt_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alt_itm_typ]の作成メソッド
	 */
	public MCList getCnd_alt_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_xfr_typ]の作成メソッド
	 */
	public MCList getCnd_in_xfr_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInXfrTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_typ]の作成メソッド
	 */
	public MCList getCnd_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_insp_typ]の作成メソッド
	 */
	public MCList getCnd_stk_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_id_typ]の作成メソッド
	 */
	public MCList getCnd_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_bp_cd]の作成メソッド
	 */
	public MCList getCnd_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_ctl_typ]の作成メソッド
	 */
	public MCList getCnd_inpt_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_schd_typ]の作成メソッド
	 */
	public MCList getCnd_io_schd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoSchdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_typ]の作成メソッド
	 */
	public MCList getCnd_io_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_schd_sts_typ]の作成メソッド
	 */
	public MCList getCnd_io_schd_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoSchdStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_scope_typ]の作成メソッド
	 */
	public MCList getCnd_alloc_scope_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocScopeTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_schd_sub_typ1]の作成メソッド
	 */
	public MCList getCnd_io_schd_sub_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoSchdSubTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_schd_sub_typ2]の作成メソッド
	 */
	public MCList getCnd_io_schd_sub_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoSchdSubTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_schd_sub_typ3]の作成メソッド
	 */
	public MCList getCnd_io_schd_sub_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoSchdSubTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_schd_sub_typ4]の作成メソッド
	 */
	public MCList getCnd_io_schd_sub_typ4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getIoSchdSubTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0090.Srch01")) {
			return new MS_MSBEL0090_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0090_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0090_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0090_Srch01Bridge() {
			p_MS_MSBEL0090_Srch01 = new MCParam(PDef.MS_MSBEL0090_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0090_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0090.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0090.RsltR.class));

			p_MS_MSBEL0090_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0090_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0090_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0090_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0090_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0090.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0090.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0090.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0090.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0090_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0090.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0090_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP0090.RsltR>)p_MS_MSBEL0090_Srch01.getContainerParam().getDownBlock(0));
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