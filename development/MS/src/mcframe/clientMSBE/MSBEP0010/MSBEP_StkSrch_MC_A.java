package mcframe.clientMSBE.MSBEP0010;

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
import mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch_MC.MS_MSBEL0010_Srch01Caller;

/**
 * 画面"MSBEP_StkSrch"パネルクラスです。<p>
 *
 * 現時点在庫あるいは引当可能数量を照会する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_StkSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0010";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * STK,Display inventory,1;LOC_ALLOC,Display location allocation,2;GRS_ALLOC,Display gross allocation,3;PRNT,Issue identification tag,4 STK,在庫表示,1;LOC_ALLOC,場所引当表示,2;GRS_ALLOC,総量引当表示,3;PRNT,現品票発行,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_STK = null;
	public MCRadioButton Cnd_ope_LOC_ALLOC = null;
	public MCRadioButton Cnd_ope_GRS_ALLOC = null;
	public MCRadioButton Cnd_ope_PRNT = null;
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
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
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
	/**
	 * Exclude delivery destination/receiving point inventory 納品先・配送先在庫を除く.<p>
	 *
	 */
	public MCCheckBox Cnd_only_int_flg = null;
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
	public MCLabel Cnd_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_lot_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_vld_dt_fr_Label = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_fr = null;
	public MCLabel Cnd_vld_dt_to_Label = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_to = null;
	public MCLabel Cnd_lmt_dt_fr_Label = null;
	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_lmt_dt_fr = null;
	public MCLabel Cnd_lmt_dt_to_Label = null;
	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_lmt_dt_to = null;
	public MCLabel Cnd_ignore_margin_days_Label = null;
	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public MCNumberField Cnd_ignore_margin_days = null;
	/**
	 * Without expiration only 期限未設定のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_unreg_lmt_flg = null;
	/**
	 * Inventory qty. : positive only 在庫数量：正数のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_positive_stk_qty_flg = null;
	/**
	 * Inventory qty. : negative only 在庫数量：負数のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_negative_stk_qty_flg = null;
	/**
	 * Allocatable qty.: positive only 引当可能数量：正数のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_positive_alloc_qty_flg = null;
	/**
	 * Allocatable qty.: negative only 引当可能数量：負数のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_negative_alloc_qty_flg = null;
	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_alloc_wait_flg = null;
	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public MCCheckBox Cnd_abnormal_alloc_flg = null;
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
	public MCLabel Cnd_fix_no_typ_Label = null;
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCTextField Cnd_fix_no_typ_nm = null;
	public MCLabel Cnd_fix_no_Label = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_fix_no = null;
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
	public MCLabel Cnd_first_gr_dt_fr_Label = null;
	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_fr = null;
	public MCLabel Cnd_first_gr_dt_to_Label = null;
	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_to = null;
	public MCLabel Cnd_stk_sub_char1_Label = null;
	/**
	 * Spare 1 (Inventory) 予備１（在庫）.<p>
	 *
	 */
	public MCTextField Cnd_stk_sub_char1 = null;
	public MCLabel Cnd_stk_sub_char2_Label = null;
	/**
	 * Spare 2 (Inventory) 予備２（在庫）.<p>
	 *
	 */
	public MCTextField Cnd_stk_sub_char2 = null;
	public MCLabel Cnd_stk_sub_char3_Label = null;
	/**
	 * Spare 3 (Inventory) 予備３（在庫）.<p>
	 *
	 */
	public MCTextField Cnd_stk_sub_char3 = null;
	public MCLabel Cnd_lot_rmrks_Label = null;
	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public MCTextField Cnd_lot_rmrks = null;
	public MCLabel Cnd_lot_sub_char1_Label = null;
	/**
	 * Spare 1 (Lot) 予備１（ロット）.<p>
	 *
	 */
	public MCTextField Cnd_lot_sub_char1 = null;
	public MCLabel Cnd_lot_sub_char2_Label = null;
	/**
	 * Spare 2 (Lot) 予備２（ロット）.<p>
	 *
	 */
	public MCTextField Cnd_lot_sub_char2 = null;
	public MCLabel Cnd_lot_sub_char3_Label = null;
	/**
	 * Spare 3 (Lot) 予備３（ロット）.<p>
	 *
	 */
	public MCTextField Cnd_lot_sub_char3 = null;
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
	 * Dept. 部門.<p>
	 *
	 */
	public MCCheckBox Cnd_dpt_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Location 場所.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_flg = null;
	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public MCCheckBox Cnd_str_ln_flg = null;
	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_arrv_bp_flg = null;
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public MCCheckBox Cnd_site_flg = null;
	/**
	 * Distribution group 物流グループ.<p>
	 *
	 */
	public MCCheckBox Cnd_lg_grp_flg = null;
	/**
	 * Gross allocation location group 総量引当場所グループ.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_grp_flg = null;
	/**
	 * Mfg. location group 製造場所グループ.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_grp_flg = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_lot_flg = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_sublot_flg = null;
	public mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H Cnd_sno_flg_p_PPanel;
	public MCCheckBox Cnd_sno1_flg;	// [Cnd]の[sno_flg_p.sno1_flg]を[Cnd_sno1_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno2_flg;	// [Cnd]の[sno_flg_p.sno2_flg]を[Cnd_sno2_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno3_flg;	// [Cnd]の[sno_flg_p.sno3_flg]を[Cnd_sno3_flg]としてエイリアス定義。
	public MCCheckBox Cnd_sno4_flg;	// [Cnd]の[sno_flg_p.sno4_flg]を[Cnd_sno4_flg]としてエイリアス定義。
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_no_typ_flg = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_no_flg = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_lot_flg = null;
	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public MCCheckBox Cnd_pack_unit_flg = null;
	/**
	 * Grading 格付.<p>
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Disp]ブロック関連のField定義
	public MCPanel DispPanel = null;
	// [Disp]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBE.MSBEP0010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
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
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_pack_unit_qty;// [Rslt]の[pack_unit_qty_p.qty]を[columnRslt_pack_unit_qty]としてエイリアス定義。
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
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_stk_qty_p_PPanel;
	public MCColumnConfig columnRslt_stk_qty;// [Rslt]の[stk_qty_p.qty]を[columnRslt_stk_qty]としてエイリアス定義。
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
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_gr_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_gr_schd_qty;// [Rslt]の[gr_schd_qty_p.qty]を[columnRslt_gr_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_alloc_qty_p_PPanel;
	public MCColumnConfig columnRslt_alloc_qty;// [Rslt]の[alloc_qty_p.qty]を[columnRslt_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_wait_qty_p_PPanel;
	public MCColumnConfig columnRslt_wait_qty;// [Rslt]の[wait_qty_p.qty]を[columnRslt_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnRslt_alloc_avl_qty;// [Rslt]の[alloc_avl_qty_p.qty]を[columnRslt_alloc_avl_qty]としてエイリアス定義。
	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_unit_cd = null;
	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_unit_nm = null;
	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_unit_dec_place = null;
	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abnormal_alloc_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_std_unit_cost_amt_p_PPanel;
	public MCColumnConfig columnRslt_std_unit_cost;// [Rslt]の[std_unit_cost_amt_p.amt]を[columnRslt_std_unit_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_stk_amt_p_PPanel;
	public MCColumnConfig columnRslt_stk_amt;// [Rslt]の[stk_amt_p.amt]を[columnRslt_stk_amt]としてエイリアス定義。
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_amt_dec_place = null;
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_amt_rnd_typ = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_act_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_qty;// [Rslt]の[act_cont_qty_p.cont_qty]を[columnRslt_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_std_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_qty;// [Rslt]の[std_cont_qty_p.cont_qty]を[columnRslt_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_prmt_insp_flg = null;
	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_quality_typ = null;
	/**
	 * Conforming type name (Lot) 良品区分名（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_quality_typ_nm = null;
	/**
	 * Inventory inspection type (Lot) 在庫検査区分（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_stk_insp_typ = null;
	/**
	 * Inventory inspection type name (Lot) 在庫検査区分名（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_stk_insp_typ_nm = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ_nm = null;
	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ_nm = null;
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_first_gr_dt = null;
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unreg_lmt_flg = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ_nm = null;
	/**
	 * Spare 1 (Inventory) 予備１（在庫）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_sub_char1 = null;
	/**
	 * Spare 2 (Inventory) 予備２（在庫）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_sub_char2 = null;
	/**
	 * Spare 3 (Inventory) 予備３（在庫）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_sub_char3 = null;
	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_rmrks = null;
	/**
	 * Spare 1 (Lot) 予備１（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char1 = null;
	/**
	 * Spare 2 (Lot) 予備２（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char2 = null;
	/**
	 * Spare 3 (Lot) 予備３（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char3 = null;
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
	 * Monthly inventory GR/GI details 月次在庫受払詳細照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0030 = null;
	/**
	 * GR/GI result 受払実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0080 = null;
	/**
	 * Inventory allocation status list 在庫引当状況照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0040 = null;
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0110 = null;
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
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [STK]モードを表す定数 */
	public static final String STK = "STK";
	/** [LOC_ALLOC]モードを表す定数 */
	public static final String LOC_ALLOC = "LOC_ALLOC";
	/** [GRS_ALLOC]モードを表す定数 */
	public static final String GRS_ALLOC = "GRS_ALLOC";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{STK, LOC_ALLOC, GRS_ALLOC, PRNT};
	
	/** [MS_MSBEL0010_Srch01]のCallerの作成 */
	protected MSBEP_StkSrch_MC.MS_MSBEL0010_Srch01Caller createMS_MSBEL0010_Srch01() {
		MSBEP_StkSrch_MC.MS_MSBEL0010_Srch01Caller<MSBEP_StkSrch, MS_MSBEL0010_Srch01Bridge>
		caller = ((MSBEP_StkSrch_MC)this).new MS_MSBEL0010_Srch01Caller<MSBEP_StkSrch, MS_MSBEL0010_Srch01Bridge>(
					(MSBEP_StkSrch)this, new MS_MSBEL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0010_Srch01]の呼び出し */
	protected void callMS_MSBEL0010_Srch01() {
		MCCaller caller = createMS_MSBEL0010_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0010.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP0010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP0010.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP0010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0010.RsltR.class);
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
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(DispPanel);
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
	public MSBEP_StkSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_StkSrch_MC_A(String name) {
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
		MSBEP_StkSrch_MC.jbCreateScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateTop((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateFold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateTab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateTab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateTab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateCnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateCnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateDisp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateCtrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateRPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateRslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateBtn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbCreateEastBtn((MSBEP_StkSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_StkSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_StkSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_StkSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_StkSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_StkSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_StkSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_StkSrch p) {
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
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBEP_StkSrch p) {
	}

	/**
	 * [Disp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDisp(MSBEP_StkSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_StkSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_StkSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_StkSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$itm_p);
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
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_str_ln_cd.addAliasName("Rslt.str_ln_cd", p);
		p.columnRslt_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_str_ln_nm.addAliasName("Rslt.str_ln_nm", p);
		p.columnRslt_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_str_ln_cd_none_flg.addAliasName("Rslt.str_ln_cd_none_flg", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$sno_wrk_no_p);
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
		p.Rslt_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$pack_unit_qty_p);
		p.Rslt_pack_unit_qty_p_PPanel.setName("Rslt.pack_unit_qty_p");
		p.columnRslt_pack_unit_qty = p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pack_unit_qty.addAliasName("Rslt.pack_unit_qty", p);
		p.Rslt_stk_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$stk_qty_p);
		p.Rslt_stk_qty_p_PPanel.setName("Rslt.stk_qty_p");
		p.columnRslt_stk_qty = p.Rslt_stk_qty_p_PPanel.columnQty_qty;
		p.columnRslt_stk_qty.addAliasName("Rslt.stk_qty", p);
		p.Rslt_gr_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$gr_schd_qty_p);
		p.Rslt_gr_schd_qty_p_PPanel.setName("Rslt.gr_schd_qty_p");
		p.columnRslt_gr_schd_qty = p.Rslt_gr_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_gr_schd_qty.addAliasName("Rslt.gr_schd_qty", p);
		p.Rslt_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$alloc_qty_p);
		p.Rslt_alloc_qty_p_PPanel.setName("Rslt.alloc_qty_p");
		p.columnRslt_alloc_qty = p.Rslt_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRslt_alloc_qty.addAliasName("Rslt.alloc_qty", p);
		p.Rslt_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$wait_qty_p);
		p.Rslt_wait_qty_p_PPanel.setName("Rslt.wait_qty_p");
		p.columnRslt_wait_qty = p.Rslt_wait_qty_p_PPanel.columnQty_qty;
		p.columnRslt_wait_qty.addAliasName("Rslt.wait_qty", p);
		p.Rslt_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$alloc_avl_qty_p);
		p.Rslt_alloc_avl_qty_p_PPanel.setName("Rslt.alloc_avl_qty_p");
		p.columnRslt_alloc_avl_qty = p.Rslt_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnRslt_alloc_avl_qty.addAliasName("Rslt.alloc_avl_qty", p);
		p.Rslt_std_unit_cost_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$std_unit_cost_amt_p);
		p.Rslt_std_unit_cost_amt_p_PPanel.setName("Rslt.std_unit_cost_amt_p");
		p.columnRslt_std_unit_cost = p.Rslt_std_unit_cost_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_std_unit_cost.addAliasName("Rslt.std_unit_cost", p);
		p.Rslt_stk_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$stk_amt_p);
		p.Rslt_stk_amt_p_PPanel.setName("Rslt.stk_amt_p");
		p.columnRslt_stk_amt = p.Rslt_stk_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_stk_amt.addAliasName("Rslt.stk_amt", p);
		p.Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$act_cont_fctr_p);
		p.Rslt_act_cont_fctr_p_PPanel.setName("Rslt.act_cont_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$act_cont_qty_p);
		p.Rslt_act_cont_qty_p_PPanel.setName("Rslt.act_cont_qty_p");
		p.columnRslt_act_cont_qty = p.Rslt_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_act_cont_qty.addAliasName("Rslt.act_cont_qty", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$std_cont_qty_p);
		p.Rslt_std_cont_qty_p_PPanel.setName("Rslt.std_cont_qty_p");
		p.columnRslt_std_cont_qty = p.Rslt_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_std_cont_qty.addAliasName("Rslt.std_cont_qty", p);
		p.Rslt_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$cont_fctr_unit_p);
		p.Rslt_cont_fctr_unit_p_PPanel.setName("Rslt.cont_fctr_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP0010.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBEP_StkSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_StkSrch p) {
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
	
	
	/** [Cnd_bp_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_bp_lot_no_p = null;

	/**
	 * [Cnd_bp_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_lot_no_ListPutter() {
		if (Cnd_bp_lot_no_p == null) {
			Cnd_bp_lot_no_p = createCnd_bp_lot_no_ListPutter(Cnd_bp_lot_no, "bp_lot_no");

		}
		return Cnd_bp_lot_no_p;
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
	
	
	/** [Cnd_fix_no_typ_ListPutter]の定義 */
	private MCListPutter Cnd_fix_no_typ_p = null;

	/**
	 * [Cnd_fix_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_fix_no_typ_ListPutter() {
		if (Cnd_fix_no_typ_p == null) {
			Cnd_fix_no_typ_p = createCnd_fix_no_typ_ListPutter(Cnd_fix_no_typ, "fix_no_typ", "fix_no_typ_nm");

		}
		return Cnd_fix_no_typ_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkSrch create(){
		MSBEP_StkSrch p = new MSBEP_StkSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkSrch create(String name){
		MSBEP_StkSrch p = new MSBEP_StkSrch(name);
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
		MSBEP_StkSrch_MC.jbfInitScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitTop((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitFold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitTab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitTab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitTab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitCnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitCnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitDisp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitCtrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitRPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitRslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitBtn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbfInitEastBtn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitTop((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitFold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitTab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitTab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitTab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitCnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitCnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitDisp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitCtrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitRPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitRslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitBtn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.jbInitEastBtn((MSBEP_StkSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_StkSrch p) {
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
	protected static void jbfInitTab1(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_STK = p.beansFactory.createRadioButton("Cnd.ope_STK");
		p.Cnd_ope_LOC_ALLOC = p.beansFactory.createRadioButton("Cnd.ope_LOC_ALLOC");
		p.Cnd_ope_GRS_ALLOC = p.beansFactory.createRadioButton("Cnd.ope_GRS_ALLOC");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
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
		p.Cnd_only_int_flg = p.beansFactory.createCheckBox("Cnd.only_int_flg");
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
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_bp_lot_no_Label = p.beansFactory.createLabel("Cnd.bp_lot_no_Label");
		p.Cnd_bp_lot_no = p.beansFactory.createTextField("Cnd.bp_lot_no");
		p.Cnd_bp_lot_no.setLabel(p.Cnd_bp_lot_no_Label);
		p.Cnd_vld_dt_fr_Label = p.beansFactory.createLabel("Cnd.vld_dt_fr_Label");
		p.Cnd_vld_dt_fr = p.beansFactory.createDateField("Cnd.vld_dt_fr");
		p.Cnd_vld_dt_fr.setLabel(p.Cnd_vld_dt_fr_Label);
		p.Cnd_vld_dt_to_Label = p.beansFactory.createLabel("Cnd.vld_dt_to_Label");
		p.Cnd_vld_dt_to = p.beansFactory.createDateField("Cnd.vld_dt_to");
		p.Cnd_vld_dt_to.setLabel(p.Cnd_vld_dt_to_Label);
		p.Cnd_lmt_dt_fr_Label = p.beansFactory.createLabel("Cnd.lmt_dt_fr_Label");
		p.Cnd_lmt_dt_fr = p.beansFactory.createDateField("Cnd.lmt_dt_fr");
		p.Cnd_lmt_dt_fr.setLabel(p.Cnd_lmt_dt_fr_Label);
		p.Cnd_lmt_dt_to_Label = p.beansFactory.createLabel("Cnd.lmt_dt_to_Label");
		p.Cnd_lmt_dt_to = p.beansFactory.createDateField("Cnd.lmt_dt_to");
		p.Cnd_lmt_dt_to.setLabel(p.Cnd_lmt_dt_to_Label);
		p.Cnd_ignore_margin_days_Label = p.beansFactory.createLabel("Cnd.ignore_margin_days_Label");
		p.Cnd_ignore_margin_days = p.beansFactory.createNumberField("Cnd.ignore_margin_days");
		p.Cnd_ignore_margin_days.setLabel(p.Cnd_ignore_margin_days_Label);
		p.Cnd_unreg_lmt_flg = p.beansFactory.createCheckBox("Cnd.unreg_lmt_flg");
		p.Cnd_positive_stk_qty_flg = p.beansFactory.createCheckBox("Cnd.positive_stk_qty_flg");
		p.Cnd_negative_stk_qty_flg = p.beansFactory.createCheckBox("Cnd.negative_stk_qty_flg");
		p.Cnd_positive_alloc_qty_flg = p.beansFactory.createCheckBox("Cnd.positive_alloc_qty_flg");
		p.Cnd_negative_alloc_qty_flg = p.beansFactory.createCheckBox("Cnd.negative_alloc_qty_flg");
		p.Cnd_except_alloc_wait_flg = p.beansFactory.createCheckBox("Cnd.except_alloc_wait_flg");
		p.Cnd_abnormal_alloc_flg = p.beansFactory.createCheckBox("Cnd.abnormal_alloc_flg");
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
		p.Cnd_stk_insp_typ_Label = p.beansFactory.createLabel("Cnd.stk_insp_typ_Label");
		p.Cnd_stk_insp_typ = p.beansFactory.createTextComboBox("Cnd.stk_insp_typ");
		p.Cnd_stk_insp_typ.setLabel(p.Cnd_stk_insp_typ_Label);
		p.Cnd_stk_insp_typ_nm = p.beansFactory.createTextField("Cnd.stk_insp_typ_nm");
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_stk_id_typ_Label = p.beansFactory.createLabel("Cnd.stk_id_typ_Label");
		p.Cnd_stk_id_typ = p.beansFactory.createTextComboBox("Cnd.stk_id_typ");
		p.Cnd_stk_id_typ.setLabel(p.Cnd_stk_id_typ_Label);
		p.Cnd_stk_id_typ_nm = p.beansFactory.createTextField("Cnd.stk_id_typ_nm");
		p.Cnd_stk_bp_cd_Label = p.beansFactory.createLabel("Cnd.stk_bp_cd_Label");
		p.Cnd_stk_bp_cd = p.beansFactory.createTextField("Cnd.stk_bp_cd");
		p.Cnd_stk_bp_cd.setLabel(p.Cnd_stk_bp_cd_Label);
		p.Cnd_stk_bp_nm = p.beansFactory.createTextField("Cnd.stk_bp_nm");
		p.Cnd_fix_no_typ_Label = p.beansFactory.createLabel("Cnd.fix_no_typ_Label");
		p.Cnd_fix_no_typ = p.beansFactory.createTextComboBox("Cnd.fix_no_typ");
		p.Cnd_fix_no_typ.setLabel(p.Cnd_fix_no_typ_Label);
		p.Cnd_fix_no_typ_nm = p.beansFactory.createTextField("Cnd.fix_no_typ_nm");
		p.Cnd_fix_no_Label = p.beansFactory.createLabel("Cnd.fix_no_Label");
		p.Cnd_fix_no = p.beansFactory.createTextField("Cnd.fix_no");
		p.Cnd_fix_no.setLabel(p.Cnd_fix_no_Label);
		p.Cnd_pack_unit_cd_Label = p.beansFactory.createLabel("Cnd.pack_unit_cd_Label");
		p.Cnd_pack_unit_cd = p.beansFactory.createTextComboBox("Cnd.pack_unit_cd");
		p.Cnd_pack_unit_cd.setLabel(p.Cnd_pack_unit_cd_Label);
		p.Cnd_pack_unit_nm = p.beansFactory.createTextField("Cnd.pack_unit_nm");
		p.Cnd_first_gr_dt_fr_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_fr_Label");
		p.Cnd_first_gr_dt_fr = p.beansFactory.createDateField("Cnd.first_gr_dt_fr");
		p.Cnd_first_gr_dt_fr.setLabel(p.Cnd_first_gr_dt_fr_Label);
		p.Cnd_first_gr_dt_to_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_to_Label");
		p.Cnd_first_gr_dt_to = p.beansFactory.createDateField("Cnd.first_gr_dt_to");
		p.Cnd_first_gr_dt_to.setLabel(p.Cnd_first_gr_dt_to_Label);
		p.Cnd_stk_sub_char1_Label = p.beansFactory.createLabel("Cnd.stk_sub_char1_Label");
		p.Cnd_stk_sub_char1 = p.beansFactory.createTextField("Cnd.stk_sub_char1");
		p.Cnd_stk_sub_char1.setLabel(p.Cnd_stk_sub_char1_Label);
		p.Cnd_stk_sub_char2_Label = p.beansFactory.createLabel("Cnd.stk_sub_char2_Label");
		p.Cnd_stk_sub_char2 = p.beansFactory.createTextField("Cnd.stk_sub_char2");
		p.Cnd_stk_sub_char2.setLabel(p.Cnd_stk_sub_char2_Label);
		p.Cnd_stk_sub_char3_Label = p.beansFactory.createLabel("Cnd.stk_sub_char3_Label");
		p.Cnd_stk_sub_char3 = p.beansFactory.createTextField("Cnd.stk_sub_char3");
		p.Cnd_stk_sub_char3.setLabel(p.Cnd_stk_sub_char3_Label);
		p.Cnd_lot_rmrks_Label = p.beansFactory.createLabel("Cnd.lot_rmrks_Label");
		p.Cnd_lot_rmrks = p.beansFactory.createTextField("Cnd.lot_rmrks");
		p.Cnd_lot_rmrks.setLabel(p.Cnd_lot_rmrks_Label);
		p.Cnd_lot_sub_char1_Label = p.beansFactory.createLabel("Cnd.lot_sub_char1_Label");
		p.Cnd_lot_sub_char1 = p.beansFactory.createTextField("Cnd.lot_sub_char1");
		p.Cnd_lot_sub_char1.setLabel(p.Cnd_lot_sub_char1_Label);
		p.Cnd_lot_sub_char2_Label = p.beansFactory.createLabel("Cnd.lot_sub_char2_Label");
		p.Cnd_lot_sub_char2 = p.beansFactory.createTextField("Cnd.lot_sub_char2");
		p.Cnd_lot_sub_char2.setLabel(p.Cnd_lot_sub_char2_Label);
		p.Cnd_lot_sub_char3_Label = p.beansFactory.createLabel("Cnd.lot_sub_char3_Label");
		p.Cnd_lot_sub_char3 = p.beansFactory.createTextField("Cnd.lot_sub_char3");
		p.Cnd_lot_sub_char3.setLabel(p.Cnd_lot_sub_char3_Label);
		p.Cnd_dpt_flg = p.beansFactory.createCheckBox("Cnd.dpt_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_str_ln_flg = p.beansFactory.createCheckBox("Cnd.str_ln_flg");
		p.Cnd_stk_arrv_bp_flg = p.beansFactory.createCheckBox("Cnd.stk_arrv_bp_flg");
		p.Cnd_site_flg = p.beansFactory.createCheckBox("Cnd.site_flg");
		p.Cnd_lg_grp_flg = p.beansFactory.createCheckBox("Cnd.lg_grp_flg");
		p.Cnd_alloc_grp_flg = p.beansFactory.createCheckBox("Cnd.alloc_grp_flg");
		p.Cnd_loc_grp_flg = p.beansFactory.createCheckBox("Cnd.loc_grp_flg");
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_fix_no_typ_flg = p.beansFactory.createCheckBox("Cnd.fix_no_typ_flg");
		p.Cnd_fix_no_flg = p.beansFactory.createCheckBox("Cnd.fix_no_flg");
		p.Cnd_bp_lot_flg = p.beansFactory.createCheckBox("Cnd.bp_lot_flg");
		p.Cnd_pack_unit_flg = p.beansFactory.createCheckBox("Cnd.pack_unit_flg");
		p.Cnd_gd_flg = p.beansFactory.createCheckBox("Cnd.gd_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDisp(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.DispPanel = p.beansFactory.createPanel("Disp");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_cd = p.beansFactory.createTableColumn("Rslt.alloc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_nm = p.beansFactory.createTableColumn("Rslt.alloc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ = p.beansFactory.createTableColumn("Rslt.in_xfr_typ", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ_nm = p.beansFactory.createTableColumn("Rslt.in_xfr_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT);
		p.columnRslt_asst_typ_nm = p.beansFactory.createTableColumn("Rslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_fix_no_typ = p.beansFactory.createTableColumn("Rslt.fix_no_typ", MCColumnType.TEXT);
		p.columnRslt_fix_no_typ_nm = p.beansFactory.createTableColumn("Rslt.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnRslt_fix_no = p.beansFactory.createTableColumn("Rslt.fix_no", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pack_unit_dec_place = p.beansFactory.createTableColumn("Rslt.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_unit_cd = p.beansFactory.createTableColumn("Rslt.alloc_unit_cd", MCColumnType.TEXT);
		p.columnRslt_alloc_unit_nm = p.beansFactory.createTableColumn("Rslt.alloc_unit_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_unit_dec_place = p.beansFactory.createTableColumn("Rslt.alloc_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_abnormal_alloc_flg = p.beansFactory.createTableColumn("Rslt.abnormal_alloc_flg", MCColumnType.CHECK);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_stk_amt_dec_place = p.beansFactory.createTableColumn("Rslt.stk_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_stk_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.stk_amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_in_prmt_insp_flg = p.beansFactory.createTableColumn("Rslt.in_prmt_insp_flg", MCColumnType.CHECK);
		p.columnRslt_lot_quality_typ = p.beansFactory.createTableColumn("Rslt.lot_quality_typ", MCColumnType.TEXT);
		p.columnRslt_lot_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.lot_quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_lot_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.lot_stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_lot_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.lot_stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_first_gr_dt = p.beansFactory.createTableColumn("Rslt.first_gr_dt", MCColumnType.DATE);
		p.columnRslt_unreg_lmt_flg = p.beansFactory.createTableColumn("Rslt.unreg_lmt_flg", MCColumnType.CHECK);
		p.columnRslt_vld_dt = p.beansFactory.createTableColumn("Rslt.vld_dt", MCColumnType.DATE);
		p.columnRslt_lmt_dt = p.beansFactory.createTableColumn("Rslt.lmt_dt", MCColumnType.DATE);
		p.columnRslt_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_sub_char1 = p.beansFactory.createTableColumn("Rslt.stk_sub_char1", MCColumnType.TEXT);
		p.columnRslt_stk_sub_char2 = p.beansFactory.createTableColumn("Rslt.stk_sub_char2", MCColumnType.TEXT);
		p.columnRslt_stk_sub_char3 = p.beansFactory.createTableColumn("Rslt.stk_sub_char3", MCColumnType.TEXT);
		p.columnRslt_lot_rmrks = p.beansFactory.createTableColumn("Rslt.lot_rmrks", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char1 = p.beansFactory.createTableColumn("Rslt.lot_sub_char1", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char2 = p.beansFactory.createTableColumn("Rslt.lot_sub_char2", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char3 = p.beansFactory.createTableColumn("Rslt.lot_sub_char3", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0030 = p.beansFactory.createButton("Btn.open_MSBEP0030", "open");
		p.Btn_open_MSBEP0080 = p.beansFactory.createButton("Btn.open_MSBEP0080", "open");
		p.Btn_open_MSBEP0040 = p.beansFactory.createButton("Btn.open_MSBEP0040", "open");
		p.Btn_open_MSBEP0110 = p.beansFactory.createButton("Btn.open_MSBEP0110", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_StkSrch p) {
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
	protected static void jbInitTop(MSBEP_StkSrch p) {
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
	protected static void jbInitFold(MSBEP_StkSrch p) {
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
	protected static void jbInitTab1(MSBEP_StkSrch p) {
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
	protected static void jbInitTab2(MSBEP_StkSrch p) {
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
	protected static void jbInitTab3(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DispPanel, null);
		p.Tab3Panel.setLastBeans(p.DispPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_STK);
		p.Cnd_ope_STK.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_STK);
		p.ScreenOpePanel.add(p.Cnd_ope_STK);
		p.Cnd_ope_STK.setNextBeans(p.Cnd_ope_LOC_ALLOC);
		p.Cnd_ope_LOC_ALLOC.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_LOC_ALLOC);
		p.ScreenOpePanel.add(p.Cnd_ope_LOC_ALLOC);
		p.Cnd_ope_LOC_ALLOC.setNextBeans(p.Cnd_ope_GRS_ALLOC);
		p.Cnd_ope_GRS_ALLOC.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_GRS_ALLOC);
		p.ScreenOpePanel.add(p.Cnd_ope_GRS_ALLOC);
		p.Cnd_ope_GRS_ALLOC.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.ope_META);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.CndPanel.setLastBeans(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_stk_arrv_bp_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_stk_arrv_bp_cd_Label);
		p.CndPanel.add(p.Cnd_stk_arrv_bp_cd);
		p.Cnd_stk_arrv_bp_cd.setNextBeans(p.Cnd_stk_arrv_bp_nm);
		p.Cnd_stk_arrv_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_arrv_bp_cd_META);
		p.Cnd_stk_arrv_bp_cd.addLinkBeans(p.Cnd_stk_arrv_bp_nm);
		p.Cnd_stk_arrv_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_arrv_bp_cd, true);
		p.CndPanel.add(p.Cnd_stk_arrv_bp_nm);
		p.Cnd_stk_arrv_bp_nm.setNextBeans(p.Cnd_only_int_flg);
		p.Cnd_stk_arrv_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_arrv_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_arrv_bp_nm, true);
		p.CndPanel.add(p.Cnd_only_int_flg);
		p.Cnd_only_int_flg.setNextBeans(p.Cnd_site_cd);
		p.Cnd_only_int_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.only_int_flg_META);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
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
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_bp_lot_no);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_bp_lot_no_Label);
		p.CndPanel.add(p.Cnd_bp_lot_no);
		p.Cnd_bp_lot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_bp_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.bp_lot_no_META);
		p.Cnd_bp_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_lot_no, true);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_vld_dt_fr);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_vld_dt_fr_Label);
		p.CndPanel.add(p.Cnd_vld_dt_fr);
		p.Cnd_vld_dt_fr.setNextBeans(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.vld_dt_fr_META);
		p.Cnd_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_vld_dt_to_Label);
		p.CndPanel.add(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_to.setNextBeans(p.Cnd_lmt_dt_fr);
		p.Cnd_vld_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.vld_dt_to_META);
		p.Cnd_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lmt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_lmt_dt_fr);
		p.Cnd_lmt_dt_fr.setNextBeans(p.Cnd_lmt_dt_to);
		p.Cnd_lmt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lmt_dt_fr_META);
		p.Cnd_lmt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lmt_dt_to_Label);
		p.CndPanel.add(p.Cnd_lmt_dt_to);
		p.Cnd_lmt_dt_to.setNextBeans(p.Cnd_ignore_margin_days);
		p.Cnd_lmt_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lmt_dt_to_META);
		p.Cnd_lmt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ignore_margin_days_Label);
		p.CndPanel.add(p.Cnd_ignore_margin_days);
		p.Cnd_ignore_margin_days.setNextBeans(p.Cnd_unreg_lmt_flg);
		p.Cnd_ignore_margin_days.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.ignore_margin_days_META);
		p.CndPanel.add(p.Cnd_unreg_lmt_flg);
		p.Cnd_unreg_lmt_flg.setNextBeans(p.Cnd_positive_stk_qty_flg);
		p.Cnd_unreg_lmt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.unreg_lmt_flg_META);
		p.CndPanel.add(p.Cnd_positive_stk_qty_flg);
		p.Cnd_positive_stk_qty_flg.setNextBeans(p.Cnd_negative_stk_qty_flg);
		p.Cnd_positive_stk_qty_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.positive_stk_qty_flg_META);
		p.CndPanel.add(p.Cnd_negative_stk_qty_flg);
		p.Cnd_negative_stk_qty_flg.setNextBeans(p.Cnd_positive_alloc_qty_flg);
		p.Cnd_negative_stk_qty_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.negative_stk_qty_flg_META);
		p.CndPanel.add(p.Cnd_positive_alloc_qty_flg);
		p.Cnd_positive_alloc_qty_flg.setNextBeans(p.Cnd_negative_alloc_qty_flg);
		p.Cnd_positive_alloc_qty_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.positive_alloc_qty_flg_META);
		p.CndPanel.add(p.Cnd_negative_alloc_qty_flg);
		p.Cnd_negative_alloc_qty_flg.setNextBeans(p.Cnd_except_alloc_wait_flg);
		p.Cnd_negative_alloc_qty_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.negative_alloc_qty_flg_META);
		p.CndPanel.add(p.Cnd_except_alloc_wait_flg);
		p.Cnd_except_alloc_wait_flg.setNextBeans(p.Cnd_abnormal_alloc_flg);
		p.Cnd_except_alloc_wait_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.except_alloc_wait_flg_META);
		p.CndPanel.add(p.Cnd_abnormal_alloc_flg);
		p.Cnd_abnormal_alloc_flg.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_abnormal_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.abnormal_alloc_flg_META);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_in_xfr_typ);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.Cnd_in_xfr_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_xfr_typ, true);
		p.Cnd_in_xfr_typ.setLinkBeans(p.Cnd_in_xfr_typ_nm);
		p.CndPanel.add(p.Cnd_in_xfr_typ_Label);
		p.CndPanel.add(p.Cnd_in_xfr_typ);
		p.Cnd_in_xfr_typ.setNextBeans(p.Cnd_in_xfr_typ_nm);
		p.Cnd_in_xfr_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.in_xfr_typ_META);
		p.CndPanel.add(p.Cnd_in_xfr_typ_nm);
		p.Cnd_in_xfr_typ_nm.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_in_xfr_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.in_xfr_typ_nm_META);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.CndPanel.add(p.Cnd_quality_typ_Label);
		p.CndPanel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.quality_typ_META);
		p.CndPanel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_stk_insp_typ);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.quality_typ_nm_META);
		p.Cnd_stk_insp_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_insp_typ, true);
		p.Cnd_stk_insp_typ.setLinkBeans(p.Cnd_stk_insp_typ_nm);
		p.CndPanel.add(p.Cnd_stk_insp_typ_Label);
		p.CndPanel.add(p.Cnd_stk_insp_typ);
		p.Cnd_stk_insp_typ.setNextBeans(p.Cnd_stk_insp_typ_nm);
		p.Cnd_stk_insp_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_insp_typ_META);
		p.CndPanel.add(p.Cnd_stk_insp_typ_nm);
		p.Cnd_stk_insp_typ_nm.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_stk_insp_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_insp_typ_nm_META);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_stk_id_typ);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.asst_typ_nm_META);
		p.Cnd_stk_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_id_typ, true);
		p.Cnd_stk_id_typ.setLinkBeans(p.Cnd_stk_id_typ_nm);
		p.CndPanel.add(p.Cnd_stk_id_typ_Label);
		p.CndPanel.add(p.Cnd_stk_id_typ);
		p.Cnd_stk_id_typ.setNextBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_id_typ_META);
		p.CndPanel.add(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ_nm.setNextBeans(p.Cnd_stk_bp_cd);
		p.Cnd_stk_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_stk_bp_cd_Label);
		p.CndPanel.add(p.Cnd_stk_bp_cd);
		p.Cnd_stk_bp_cd.setNextBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_bp_cd_META);
		p.Cnd_stk_bp_cd.addLinkBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_bp_cd, true);
		p.CndPanel.add(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_nm.setNextBeans(p.Cnd_fix_no_typ);
		p.Cnd_stk_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_bp_nm, true);
		p.Cnd_fix_no_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_fix_no_typ, true);
		p.Cnd_fix_no_typ.setLinkBeans(p.Cnd_fix_no_typ_nm);
		p.CndPanel.add(p.Cnd_fix_no_typ_Label);
		p.CndPanel.add(p.Cnd_fix_no_typ);
		p.Cnd_fix_no_typ.setNextBeans(p.Cnd_fix_no_typ_nm);
		p.Cnd_fix_no_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.fix_no_typ_META);
		p.CndPanel.add(p.Cnd_fix_no_typ_nm);
		p.Cnd_fix_no_typ_nm.setNextBeans(p.Cnd_fix_no);
		p.Cnd_fix_no_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.fix_no_typ_nm_META);
		p.CndPanel.add(p.Cnd_fix_no_Label);
		p.CndPanel.add(p.Cnd_fix_no);
		p.Cnd_fix_no.setNextBeans(p.Cnd_pack_unit_cd);
		p.Cnd_fix_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.fix_no_META);
		p.setPluralValueEnable(p.Cnd_fix_no, true);
		p.Cnd_pack_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pack_unit_cd, true);
		p.Cnd_pack_unit_cd.setLinkBeans(p.Cnd_pack_unit_nm);
		p.CndPanel.add(p.Cnd_pack_unit_cd_Label);
		p.CndPanel.add(p.Cnd_pack_unit_cd);
		p.Cnd_pack_unit_cd.setNextBeans(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.pack_unit_cd_META);
		p.CndPanel.add(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_nm.setNextBeans(p.Cnd_first_gr_dt_fr);
		p.Cnd_pack_unit_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.pack_unit_nm_META);
		p.setPluralValueEnable(p.Cnd_pack_unit_nm, true);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr);
		p.Cnd_first_gr_dt_fr.setNextBeans(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.first_gr_dt_fr_META);
		p.Cnd_first_gr_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_first_gr_dt_to_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_to.setNextBeans(p.Cnd_stk_sub_char1);
		p.Cnd_first_gr_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.first_gr_dt_to_META);
		p.Cnd_first_gr_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_stk_sub_char1_Label);
		p.CndPanel.add(p.Cnd_stk_sub_char1);
		p.Cnd_stk_sub_char1.setNextBeans(p.Cnd_stk_sub_char2);
		p.Cnd_stk_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_stk_sub_char1, true);
		p.CndPanel.add(p.Cnd_stk_sub_char2_Label);
		p.CndPanel.add(p.Cnd_stk_sub_char2);
		p.Cnd_stk_sub_char2.setNextBeans(p.Cnd_stk_sub_char3);
		p.Cnd_stk_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_stk_sub_char2, true);
		p.CndPanel.add(p.Cnd_stk_sub_char3_Label);
		p.CndPanel.add(p.Cnd_stk_sub_char3);
		p.Cnd_stk_sub_char3.setNextBeans(p.Cnd_lot_rmrks);
		p.Cnd_stk_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_stk_sub_char3, true);
		p.CndPanel.add(p.Cnd_lot_rmrks_Label);
		p.CndPanel.add(p.Cnd_lot_rmrks);
		p.Cnd_lot_rmrks.setNextBeans(p.Cnd_lot_sub_char1);
		p.Cnd_lot_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lot_rmrks_META);
		p.setPluralValueEnable(p.Cnd_lot_rmrks, true);
		p.CndPanel.add(p.Cnd_lot_sub_char1_Label);
		p.CndPanel.add(p.Cnd_lot_sub_char1);
		p.Cnd_lot_sub_char1.setNextBeans(p.Cnd_lot_sub_char2);
		p.Cnd_lot_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lot_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_lot_sub_char1, true);
		p.CndPanel.add(p.Cnd_lot_sub_char2_Label);
		p.CndPanel.add(p.Cnd_lot_sub_char2);
		p.Cnd_lot_sub_char2.setNextBeans(p.Cnd_lot_sub_char3);
		p.Cnd_lot_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lot_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_lot_sub_char2, true);
		p.CndPanel.add(p.Cnd_lot_sub_char3_Label);
		p.CndPanel.add(p.Cnd_lot_sub_char3);
		p.Cnd_lot_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lot_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_lot_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.DispPanel.add(p.Cnd_dpt_flg);
		p.DispPanel.setLastBeans(p.Cnd_dpt_flg);
		p.Cnd_dpt_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_dpt_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.dpt_flg_META);
		p.DispPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.wg_flg_META);
		p.DispPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_str_ln_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.loc_flg_META);
		p.DispPanel.add(p.Cnd_str_ln_flg);
		p.Cnd_str_ln_flg.setNextBeans(p.Cnd_stk_arrv_bp_flg);
		p.Cnd_str_ln_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.str_ln_flg_META);
		p.DispPanel.add(p.Cnd_stk_arrv_bp_flg);
		p.Cnd_stk_arrv_bp_flg.setNextBeans(p.Cnd_site_flg);
		p.Cnd_stk_arrv_bp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.stk_arrv_bp_flg_META);
		p.DispPanel.add(p.Cnd_site_flg);
		p.Cnd_site_flg.setNextBeans(p.Cnd_lg_grp_flg);
		p.Cnd_site_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.site_flg_META);
		p.DispPanel.add(p.Cnd_lg_grp_flg);
		p.Cnd_lg_grp_flg.setNextBeans(p.Cnd_alloc_grp_flg);
		p.Cnd_lg_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lg_grp_flg_META);
		p.DispPanel.add(p.Cnd_alloc_grp_flg);
		p.Cnd_alloc_grp_flg.setNextBeans(p.Cnd_loc_grp_flg);
		p.Cnd_alloc_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.alloc_grp_flg_META);
		p.DispPanel.add(p.Cnd_loc_grp_flg);
		p.Cnd_loc_grp_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_loc_grp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.loc_grp_flg_META);
		p.DispPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.lot_flg_META);
		p.DispPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno_flg_p_PPanel);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.sublot_flg_META);
		p.DispPanel.add(p.Cnd_sno_flg_p_PPanel);
		p.Cnd_sno_flg_p_PPanel.setNextBeans(p.Cnd_fix_no_typ_flg);
		p.DispPanel.add(p.Cnd_fix_no_typ_flg);
		p.Cnd_fix_no_typ_flg.setNextBeans(p.Cnd_fix_no_flg);
		p.Cnd_fix_no_typ_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.fix_no_typ_flg_META);
		p.DispPanel.add(p.Cnd_fix_no_flg);
		p.Cnd_fix_no_flg.setNextBeans(p.Cnd_bp_lot_flg);
		p.Cnd_fix_no_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.fix_no_flg_META);
		p.DispPanel.add(p.Cnd_bp_lot_flg);
		p.Cnd_bp_lot_flg.setNextBeans(p.Cnd_pack_unit_flg);
		p.Cnd_bp_lot_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.bp_lot_flg_META);
		p.DispPanel.add(p.Cnd_pack_unit_flg);
		p.Cnd_pack_unit_flg.setNextBeans(p.Cnd_gd_flg);
		p.Cnd_pack_unit_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.pack_unit_flg_META);
		p.DispPanel.add(p.Cnd_gd_flg);
		p.Cnd_gd_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_gd_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0010.CndR.gd_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F15);
		p.DispPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.DispPanel.add(p.Cnd_deselect_all);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDisp(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.DispPanel.setValueCheck(false);
		p.DispPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_StkSrch p) {
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
	protected static void jbInitRPnl(MSBEP_StkSrch p) {
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
	protected static void jbInitRslt(MSBEP_StkSrch p) {
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
	protected static void jbInitBtn(MSBEP_StkSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0030);
		p.Btn_open_MSBEP0030.setNextBeans(p.Btn_open_MSBEP0080);
		p.Btn_open_MSBEP0080.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0080);
		p.Btn_open_MSBEP0080.setNextBeans(p.Btn_open_MSBEP0040);
		p.Btn_open_MSBEP0040.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBEP0040);
		p.Btn_open_MSBEP0040.setNextBeans(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setIcon("PRINT");
		p.Btn_open_MSBEP0110.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_StkSrch p) {
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
		MSBEP_StkSrch_MC.mcInitScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitTop((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitFold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitTab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitTab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitTab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitCnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitCnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitDisp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitCtrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitRPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitRslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitBtn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.mcInitEastBtn((MSBEP_StkSrch)this);

		// [STK]ステータスのモードの設定
		MSBEP_StkSrch_MC.statusInitSTK_ScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Top((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Fold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Tab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Tab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Tab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Cnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Cnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Disp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Ctrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_RPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Rslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_Btn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitSTK_EastBtn((MSBEP_StkSrch)this);

		// [LOC_ALLOC]ステータスのモードの設定
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_ScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Top((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Fold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Tab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Tab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Tab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Cnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Cnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Disp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Ctrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_RPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Rslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_Btn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitLOC__ALLOC_EastBtn((MSBEP_StkSrch)this);

		// [GRS_ALLOC]ステータスのモードの設定
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_ScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Top((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Fold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Tab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Tab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Tab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Cnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Cnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Disp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Ctrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_RPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Rslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_Btn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitGRS__ALLOC_EastBtn((MSBEP_StkSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBEP_StkSrch_MC.statusInitPRNT_ScreenOpe((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Top((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Fold((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Tab1((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Tab2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Tab3((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Cnd((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Cnd2((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Disp((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Ctrl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_RPnl((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Rslt((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_Btn((MSBEP_StkSrch)this);
		MSBEP_StkSrch_MC.statusInitPRNT_EastBtn((MSBEP_StkSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_StkSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_StkSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_StkSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_StkSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_StkSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_StkSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_StkSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_STK.addAllListener(p);
		p.Cnd_ope_LOC_ALLOC.addAllListener(p);
		p.Cnd_ope_GRS_ALLOC.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
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
		p.Cnd_only_int_flg.addAllListener(p);
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
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_bp_lot_no.setListListener(p);
		p.Cnd_bp_lot_no.addAllListener(p);
		p.Cnd_vld_dt_fr.setListListener(p);
		p.Cnd_vld_dt_fr.addAllListener(p);
		p.Cnd_vld_dt_to.setListListener(p);
		p.Cnd_vld_dt_to.addAllListener(p);
		p.Cnd_lmt_dt_fr.setListListener(p);
		p.Cnd_lmt_dt_fr.addAllListener(p);
		p.Cnd_lmt_dt_to.setListListener(p);
		p.Cnd_lmt_dt_to.addAllListener(p);
		p.Cnd_ignore_margin_days.setListListener(p);
		p.Cnd_ignore_margin_days.addAllListener(p);
		p.Cnd_unreg_lmt_flg.addAllListener(p);
		p.Cnd_positive_stk_qty_flg.addAllListener(p);
		p.Cnd_negative_stk_qty_flg.addAllListener(p);
		p.Cnd_positive_alloc_qty_flg.addAllListener(p);
		p.Cnd_negative_alloc_qty_flg.addAllListener(p);
		p.Cnd_except_alloc_wait_flg.addAllListener(p);
		p.Cnd_abnormal_alloc_flg.addAllListener(p);
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
		p.Cnd_stk_insp_typ.setListListener(p);
		p.Cnd_stk_insp_typ.addAllListener(p);
		p.Cnd_stk_insp_typ_nm.setListListener(p);
		p.Cnd_stk_insp_typ_nm.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_stk_id_typ.setListListener(p);
		p.Cnd_stk_id_typ.addAllListener(p);
		p.Cnd_stk_id_typ_nm.setListListener(p);
		p.Cnd_stk_id_typ_nm.addAllListener(p);
		p.Cnd_stk_bp_cd.setListListener(p);
		p.Cnd_stk_bp_cd.addAllListener(p);
		p.Cnd_stk_bp_nm.setListListener(p);
		p.Cnd_stk_bp_nm.addAllListener(p);
		p.Cnd_fix_no_typ.setListListener(p);
		p.Cnd_fix_no_typ.addAllListener(p);
		p.Cnd_fix_no_typ_nm.setListListener(p);
		p.Cnd_fix_no_typ_nm.addAllListener(p);
		p.Cnd_fix_no.setListListener(p);
		p.Cnd_fix_no.addAllListener(p);
		p.Cnd_pack_unit_cd.setListListener(p);
		p.Cnd_pack_unit_cd.addAllListener(p);
		p.Cnd_pack_unit_nm.setListListener(p);
		p.Cnd_pack_unit_nm.addAllListener(p);
		p.Cnd_first_gr_dt_fr.setListListener(p);
		p.Cnd_first_gr_dt_fr.addAllListener(p);
		p.Cnd_first_gr_dt_to.setListListener(p);
		p.Cnd_first_gr_dt_to.addAllListener(p);
		p.Cnd_stk_sub_char1.setListListener(p);
		p.Cnd_stk_sub_char1.addAllListener(p);
		p.Cnd_stk_sub_char2.setListListener(p);
		p.Cnd_stk_sub_char2.addAllListener(p);
		p.Cnd_stk_sub_char3.setListListener(p);
		p.Cnd_stk_sub_char3.addAllListener(p);
		p.Cnd_lot_rmrks.setListListener(p);
		p.Cnd_lot_rmrks.addAllListener(p);
		p.Cnd_lot_sub_char1.setListListener(p);
		p.Cnd_lot_sub_char1.addAllListener(p);
		p.Cnd_lot_sub_char2.setListListener(p);
		p.Cnd_lot_sub_char2.addAllListener(p);
		p.Cnd_lot_sub_char3.setListListener(p);
		p.Cnd_lot_sub_char3.addAllListener(p);
		p.Cnd_dpt_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_str_ln_flg.addAllListener(p);
		p.Cnd_stk_arrv_bp_flg.addAllListener(p);
		p.Cnd_site_flg.addAllListener(p);
		p.Cnd_lg_grp_flg.addAllListener(p);
		p.Cnd_alloc_grp_flg.addAllListener(p);
		p.Cnd_loc_grp_flg.addAllListener(p);
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_fix_no_typ_flg.addAllListener(p);
		p.Cnd_fix_no_flg.addAllListener(p);
		p.Cnd_bp_lot_flg.addAllListener(p);
		p.Cnd_pack_unit_flg.addAllListener(p);
		p.Cnd_gd_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBEP_StkSrch p) {
	}

	/**
	 *  [Disp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDisp(MSBEP_StkSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_StkSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_StkSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_StkSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_bp_lot_no.addAllListener(p);
		p.columnRslt_bp_lot_no.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_alloc_grp_cd.addAllListener(p);
		p.columnRslt_alloc_grp_cd.setListListener(p);
		p.columnRslt_alloc_grp_nm.addAllListener(p);
		p.columnRslt_alloc_grp_nm.setListListener(p);
		p.columnRslt_loc_grp_cd.addAllListener(p);
		p.columnRslt_loc_grp_cd.setListListener(p);
		p.columnRslt_loc_grp_nm.addAllListener(p);
		p.columnRslt_loc_grp_nm.setListListener(p);
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
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_asst_typ.addAllListener(p);
		p.columnRslt_asst_typ.setListListener(p);
		p.columnRslt_asst_typ_nm.addAllListener(p);
		p.columnRslt_asst_typ_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_fix_no_typ.addAllListener(p);
		p.columnRslt_fix_no_typ.setListListener(p);
		p.columnRslt_fix_no_typ_nm.addAllListener(p);
		p.columnRslt_fix_no_typ_nm.setListListener(p);
		p.columnRslt_fix_no.addAllListener(p);
		p.columnRslt_fix_no.setListListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_pack_unit_dec_place.addAllListener(p);
		p.columnRslt_pack_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_alloc_unit_cd.addAllListener(p);
		p.columnRslt_alloc_unit_cd.setListListener(p);
		p.columnRslt_alloc_unit_nm.addAllListener(p);
		p.columnRslt_alloc_unit_nm.setListListener(p);
		p.columnRslt_alloc_unit_dec_place.addAllListener(p);
		p.columnRslt_alloc_unit_dec_place.setListListener(p);
		p.columnRslt_abnormal_alloc_flg.addAllListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_stk_amt_dec_place.addAllListener(p);
		p.columnRslt_stk_amt_dec_place.setListListener(p);
		p.columnRslt_stk_amt_rnd_typ.addAllListener(p);
		p.columnRslt_stk_amt_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_in_prmt_insp_flg.addAllListener(p);
		p.columnRslt_lot_quality_typ.addAllListener(p);
		p.columnRslt_lot_quality_typ.setListListener(p);
		p.columnRslt_lot_quality_typ_nm.addAllListener(p);
		p.columnRslt_lot_quality_typ_nm.setListListener(p);
		p.columnRslt_lot_stk_insp_typ.addAllListener(p);
		p.columnRslt_lot_stk_insp_typ.setListListener(p);
		p.columnRslt_lot_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_lot_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_first_gr_dt.addAllListener(p);
		p.columnRslt_first_gr_dt.setListListener(p);
		p.columnRslt_unreg_lmt_flg.addAllListener(p);
		p.columnRslt_vld_dt.addAllListener(p);
		p.columnRslt_vld_dt.setListListener(p);
		p.columnRslt_lmt_dt.addAllListener(p);
		p.columnRslt_lmt_dt.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.setListListener(p);
		p.columnRslt_stk_sub_char1.addAllListener(p);
		p.columnRslt_stk_sub_char1.setListListener(p);
		p.columnRslt_stk_sub_char2.addAllListener(p);
		p.columnRslt_stk_sub_char2.setListListener(p);
		p.columnRslt_stk_sub_char3.addAllListener(p);
		p.columnRslt_stk_sub_char3.setListListener(p);
		p.columnRslt_lot_rmrks.addAllListener(p);
		p.columnRslt_lot_rmrks.setListListener(p);
		p.columnRslt_lot_sub_char1.addAllListener(p);
		p.columnRslt_lot_sub_char1.setListListener(p);
		p.columnRslt_lot_sub_char2.addAllListener(p);
		p.columnRslt_lot_sub_char2.setListListener(p);
		p.columnRslt_lot_sub_char3.addAllListener(p);
		p.columnRslt_lot_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBEP_StkSrch p) {
		p.Btn_open_MSBEP0030.addAllListener(p);
		p.Btn_open_MSBEP0030.setAPMethodName("doBtn_open_MSBEP0030");
		p.Btn_open_MSBEP0080.addAllListener(p);
		p.Btn_open_MSBEP0080.setAPMethodName("doBtn_open_MSBEP0080");
		p.Btn_open_MSBEP0040.addAllListener(p);
		p.Btn_open_MSBEP0040.setAPMethodName("doBtn_open_MSBEP0040");
		p.Btn_open_MSBEP0110.addAllListener(p);
		p.Btn_open_MSBEP0110.setAPMethodName("doBtn_open_MSBEP0110");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_StkSrch p) {
	}

	/**
	 * [STK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSTK_ScreenOpe(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Top(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Fold(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Tab1(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Tab2(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Tab3(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Cnd(MSBEP_StkSrch p){
		p.Cnd_ope_Group.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_only_int_flg.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(STK, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_vld_dt_fr.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_ignore_margin_days.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_unreg_lmt_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_positive_stk_qty_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_negative_stk_qty_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_positive_alloc_qty_flg.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_negative_alloc_qty_flg.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_except_alloc_wait_flg.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_abnormal_alloc_flg.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_in_xfr_typ.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_in_xfr_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_insp_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_fix_no_typ.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_fix_no_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Cnd_fix_no.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_pack_unit_cd.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_sub_char1.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_sub_char2.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_stk_sub_char3.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lot_sub_char1.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lot_sub_char2.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_lot_sub_char3.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dpt_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_stk_arrv_bp_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_lg_grp_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_alloc_grp_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_loc_grp_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_sno_flg_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_fix_no_typ_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_fix_no_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_bp_lot_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_pack_unit_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_gd_flg.putMode(p, STK, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, STK, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, STK, MCMode.ENABLE);

	}

	/**
	 * [STK]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Cnd2(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Disp(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Ctrl(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSTK_RPnl(MSBEP_StkSrch p){

	}

	/**
	 * [STK]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Rslt(MSBEP_StkSrch p){
		p.columnRslt_check.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Rslt_str_ln_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(STK, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, STK, MCMode.INVISIBLE);
		p.Rslt_stk_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, STK, MCMode.INVISIBLE);
		p.Rslt_gr_schd_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_wait_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_alloc_avl_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_alloc_unit_cd.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_alloc_unit_nm.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_alloc_unit_dec_place.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_abnormal_alloc_flg.putMode(p, STK, MCMode.INVISIBLE);
		p.Rslt_std_unit_cost_amt_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_stk_amt_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_amt_dec_place.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_stk_amt_rnd_typ.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, STK, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, STK, MCMode.INVISIBLE);
		p.columnRslt_in_prmt_insp_flg.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_stk_insp_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_stk_insp_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char1.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char2.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char3.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(STK, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, STK, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, STK, MCMode.READ_ONLY);

	}

	/**
	 * [STK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSTK_Btn(MSBEP_StkSrch p){
		p.Btn_open_MSBEP0030.putMode(p, STK, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, STK, MCMode.DISABLE);
		p.Btn_open_MSBEP0040.putMode(p, STK, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, STK, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, STK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, STK, MCMode.DISABLE);

	}

	/**
	 * [STK]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSTK_EastBtn(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_ScreenOpe(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Top(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Fold(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Tab1(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Tab2(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Tab3(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Cnd(MSBEP_StkSrch p){
		p.Cnd_ope_Group.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_only_int_flg.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_vld_dt_fr.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_ignore_margin_days.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_positive_stk_qty_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_negative_stk_qty_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_positive_alloc_qty_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_negative_alloc_qty_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_except_alloc_wait_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_abnormal_alloc_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gd_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_in_xfr_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_in_xfr_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_fix_no_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_fix_no_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_fix_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_sub_char1.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_sub_char2.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_sub_char3.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_sub_char1.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_sub_char2.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_sub_char3.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dpt_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_stk_arrv_bp_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_lg_grp_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_grp_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_loc_grp_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_sno_flg_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_fix_no_typ_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_fix_no_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_bp_lot_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_pack_unit_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_gd_flg.putMode(p, LOC_ALLOC, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, LOC_ALLOC, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, LOC_ALLOC, MCMode.ENABLE);

	}

	/**
	 * [LOC_ALLOC]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Cnd2(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Disp(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Ctrl(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_RPnl(MSBEP_StkSrch p){

	}

	/**
	 * [LOC_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Rslt(MSBEP_StkSrch p){
		p.columnRslt_check.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Rslt_str_ln_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.Rslt_stk_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.Rslt_gr_schd_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_wait_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_avl_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_unit_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_unit_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_unit_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_abnormal_alloc_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Rslt_std_unit_cost_amt_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_stk_amt_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_amt_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_amt_rnd_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_in_prmt_insp_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_stk_insp_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_stk_insp_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char1.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_sub_char2.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_sub_char3.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_rmrks.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, LOC_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(LOC_ALLOC, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, LOC_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [LOC_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_Btn(MSBEP_StkSrch p){
		p.Btn_open_MSBEP0030.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0040.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, LOC_ALLOC, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, LOC_ALLOC, MCMode.DISABLE);

	}

	/**
	 * [LOC_ALLOC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitLOC__ALLOC_EastBtn(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_ScreenOpe(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Top(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Fold(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Tab1(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Tab2(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Tab3(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Cnd(MSBEP_StkSrch p){
		p.Cnd_ope_Group.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_only_int_flg.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_vld_dt_fr.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_ignore_margin_days.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_positive_stk_qty_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_negative_stk_qty_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_positive_alloc_qty_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_negative_alloc_qty_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_except_alloc_wait_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_abnormal_alloc_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gd_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_in_xfr_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_in_xfr_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_fix_no_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_fix_no_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_fix_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_sub_char1.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_sub_char2.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_stk_sub_char3.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_sub_char1.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_sub_char2.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_lot_sub_char3.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dpt_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_stk_arrv_bp_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_lg_grp_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_grp_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_loc_grp_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_sno_flg_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.REQUIRED);
		p.Cnd_fix_no_typ_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_fix_no_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_bp_lot_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_pack_unit_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_gd_flg.putMode(p, GRS_ALLOC, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, GRS_ALLOC, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, GRS_ALLOC, MCMode.ENABLE);

	}

	/**
	 * [GRS_ALLOC]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Cnd2(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Disp(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Ctrl(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_RPnl(MSBEP_StkSrch p){

	}

	/**
	 * [GRS_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Rslt(MSBEP_StkSrch p){
		p.columnRslt_check.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_bp_lot_no.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_loc_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.Rslt_stk_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.Rslt_gr_schd_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_wait_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_avl_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_unit_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_unit_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_unit_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_abnormal_alloc_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Rslt_std_unit_cost_amt_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_stk_amt_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_cur_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_amt_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_amt_rnd_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_in_prmt_insp_flg.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_quality_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_stk_insp_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_stk_insp_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_first_gr_dt.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_unreg_lmt_flg.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_vld_dt.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_sub_char1.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_sub_char2.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_sub_char3.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_rmrks.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_sub_char1.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_sub_char2.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_sub_char3.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, GRS_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(GRS_ALLOC, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, GRS_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [GRS_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_Btn(MSBEP_StkSrch p){
		p.Btn_open_MSBEP0030.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0040.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, GRS_ALLOC, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, GRS_ALLOC, MCMode.DISABLE);

	}

	/**
	 * [GRS_ALLOC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitGRS__ALLOC_EastBtn(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBEP_StkSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_arrv_bp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_only_int_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_vld_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ignore_margin_days.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_unreg_lmt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_positive_stk_qty_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_negative_stk_qty_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_positive_alloc_qty_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_negative_alloc_qty_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_except_alloc_wait_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_abnormal_alloc_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_in_xfr_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_in_xfr_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_quality_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stk_insp_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_insp_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_fix_no_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_fix_no_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_fix_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pack_unit_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_stk_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lot_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lot_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_lot_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_dpt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_stk_arrv_bp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_site_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_lg_grp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_alloc_grp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_grp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_lot_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sublot_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_flg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0440.MAUBP_SnoFlg_H.READ_ONLY);
		p.Cnd_fix_no_typ_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_fix_no_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_bp_lot_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pack_unit_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_gd_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_select_all.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_deselect_all.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Disp(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBEP_StkSrch p){

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBEP_StkSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_str_ln_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_stk_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_gr_schd_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_wait_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_alloc_avl_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_alloc_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_alloc_unit_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_abnormal_alloc_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_std_unit_cost_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_stk_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_amt_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_in_prmt_insp_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_quality_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_stk_insp_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_stk_insp_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_stk_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBEP_StkSrch p){
		p.Btn_open_MSBEP0030.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP0040.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBEP_StkSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return STK;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_StkSrch_MC.setTableConfigRslt((MSBEP_StkSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_StkSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.columnRslt_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.alloc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_cd);
		p.columnRslt_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.alloc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_nm);
		p.columnRslt_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_cd);
		p.columnRslt_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_in_xfr_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.in_xfr_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ);
		p.columnRslt_in_xfr_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.in_xfr_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.asst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_asst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.asst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_fix_no_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.fix_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ);
		p.columnRslt_fix_no_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.fix_no_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ_nm);
		p.columnRslt_fix_no.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.fix_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.RsltTable.addTable(p.Rslt_pack_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.pack_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.columnRslt_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.pack_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_stk_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_gr_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_alloc_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_wait_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_alloc_avl_qty_p_PPanel.QtyTable);
		p.columnRslt_alloc_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.alloc_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_unit_cd);
		p.columnRslt_alloc_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.alloc_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_unit_nm);
		p.columnRslt_alloc_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.alloc_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_unit_dec_place);
		p.columnRslt_abnormal_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.abnormal_alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abnormal_alloc_flg);
		p.RsltTable.addTable(p.Rslt_std_unit_cost_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_stk_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_stk_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_amt_dec_place);
		p.columnRslt_stk_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_amt_rnd_typ);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.RsltTable.addTable(p.Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_act_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_std_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_in_prmt_insp_flg.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.in_prmt_insp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_prmt_insp_flg);
		p.columnRslt_lot_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_quality_typ);
		p.columnRslt_lot_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_quality_typ_nm);
		p.columnRslt_lot_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_stk_insp_typ);
		p.columnRslt_lot_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_stk_insp_typ_nm);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.mfg_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_plnt_aprv_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.plnt_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ);
		p.columnRslt_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.plnt_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ_nm);
		p.columnRslt_first_gr_dt.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.first_gr_dt_META);
		p.columnRslt_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_first_gr_dt);
		p.columnRslt_unreg_lmt_flg.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.unreg_lmt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unreg_lmt_flg);
		p.columnRslt_vld_dt.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.vld_dt_META);
		p.columnRslt_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt);
		p.columnRslt_lmt_dt.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lmt_dt_META);
		p.columnRslt_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt);
		p.columnRslt_mrkt_judg_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.mrkt_judg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ);
		p.columnRslt_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.mrkt_judg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ_nm);
		p.columnRslt_stk_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_sub_char1);
		p.columnRslt_stk_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_sub_char2);
		p.columnRslt_stk_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.stk_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_sub_char3);
		p.columnRslt_lot_rmrks.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_rmrks);
		p.columnRslt_lot_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char1);
		p.columnRslt_lot_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char2);
		p.columnRslt_lot_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.lot_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP0010.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
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
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
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
		Cnd_bp_lot_no.getListConfig().setPutter(getCnd_bp_lot_no_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_in_xfr_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_xfr_typ.getListConfig().setPutter(getCnd_in_xfr_typ_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_stk_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_insp_typ.getListConfig().setPutter(getCnd_stk_insp_typ_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
		Cnd_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_id_typ.getListConfig().setPutter(getCnd_stk_id_typ_ListPutter());
		Cnd_stk_bp_cd.getListConfig().setPutter(getCnd_stk_bp_cd_ListPutter());
		Cnd_fix_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_fix_no_typ.getListConfig().setPutter(getCnd_fix_no_typ_ListPutter());
		Cnd_pack_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pack_unit_cd.getListConfig().setPutter(getCnd_pack_unit_cd_ListPutter());
	}

	/**
	 * この画面を[STK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSTKStatus() {
		status = STK;
		setAllStatus(status);
	}

	/**
	 * この画面を[LOC_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setLOC_ALLOCStatus() {
		status = LOC_ALLOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[GRS_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setGRS_ALLOCStatus() {
		status = GRS_ALLOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNTStatus() {
		status = PRNT;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (STK.equals(status)) {
			setSTKStatus();
		}
		else if (LOC_ALLOC.equals(status)) {
			setLOC_ALLOCStatus();
		}
		else if (GRS_ALLOC.equals(status)) {
			setGRS_ALLOCStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
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
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_bp_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [Cnd_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkInspTyp");
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
	 * [Cnd_fix_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_fix_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.FixNoTyp");
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
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_bp_lot_no) return getCnd_bp_lot_no(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_in_xfr_typ) return getCnd_in_xfr_typ(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_stk_insp_typ) return getCnd_stk_insp_typ(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_stk_id_typ) return getCnd_stk_id_typ(row, info);
		if(combo == Cnd_stk_bp_cd) return getCnd_stk_bp_cd(row, info);
		if(combo == Cnd_fix_no_typ) return getCnd_fix_no_typ(row, info);
		if(combo == Cnd_pack_unit_cd) return getCnd_pack_unit_cd(row, info);
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
		else if (ap == Btn_open_MSBEP0030) doBtn_open_MSBEP0030(info);
		else if (ap == Btn_open_MSBEP0080) doBtn_open_MSBEP0080(info);
		else if (ap == Btn_open_MSBEP0040) doBtn_open_MSBEP0040(info);
		else if (ap == Btn_open_MSBEP0110) doBtn_open_MSBEP0110(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
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
	 * [Btn]パネルの[open_MSBEP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0110(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_stk_arrv_bp_cd) return doCnd_stk_arrv_bp_cd_VC(info);
		if (vc == Cnd_stk_arrv_bp_nm) return doCnd_stk_arrv_bp_nm_VC(info);
		if (vc == Cnd_only_int_flg) return doCnd_only_int_flg_VC(info);
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
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_bp_lot_no) return doCnd_bp_lot_no_VC(info);
		if (vc == Cnd_vld_dt_fr) return doCnd_vld_dt_fr_VC(info);
		if (vc == Cnd_vld_dt_to) return doCnd_vld_dt_to_VC(info);
		if (vc == Cnd_lmt_dt_fr) return doCnd_lmt_dt_fr_VC(info);
		if (vc == Cnd_lmt_dt_to) return doCnd_lmt_dt_to_VC(info);
		if (vc == Cnd_ignore_margin_days) return doCnd_ignore_margin_days_VC(info);
		if (vc == Cnd_unreg_lmt_flg) return doCnd_unreg_lmt_flg_VC(info);
		if (vc == Cnd_positive_stk_qty_flg) return doCnd_positive_stk_qty_flg_VC(info);
		if (vc == Cnd_negative_stk_qty_flg) return doCnd_negative_stk_qty_flg_VC(info);
		if (vc == Cnd_positive_alloc_qty_flg) return doCnd_positive_alloc_qty_flg_VC(info);
		if (vc == Cnd_negative_alloc_qty_flg) return doCnd_negative_alloc_qty_flg_VC(info);
		if (vc == Cnd_except_alloc_wait_flg) return doCnd_except_alloc_wait_flg_VC(info);
		if (vc == Cnd_abnormal_alloc_flg) return doCnd_abnormal_alloc_flg_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_in_xfr_typ) return doCnd_in_xfr_typ_VC(info);
		if (vc == Cnd_in_xfr_typ_nm) return doCnd_in_xfr_typ_nm_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_stk_insp_typ) return doCnd_stk_insp_typ_VC(info);
		if (vc == Cnd_stk_insp_typ_nm) return doCnd_stk_insp_typ_nm_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_stk_id_typ) return doCnd_stk_id_typ_VC(info);
		if (vc == Cnd_stk_id_typ_nm) return doCnd_stk_id_typ_nm_VC(info);
		if (vc == Cnd_stk_bp_cd) return doCnd_stk_bp_cd_VC(info);
		if (vc == Cnd_stk_bp_nm) return doCnd_stk_bp_nm_VC(info);
		if (vc == Cnd_fix_no_typ) return doCnd_fix_no_typ_VC(info);
		if (vc == Cnd_fix_no_typ_nm) return doCnd_fix_no_typ_nm_VC(info);
		if (vc == Cnd_fix_no) return doCnd_fix_no_VC(info);
		if (vc == Cnd_pack_unit_cd) return doCnd_pack_unit_cd_VC(info);
		if (vc == Cnd_pack_unit_nm) return doCnd_pack_unit_nm_VC(info);
		if (vc == Cnd_first_gr_dt_fr) return doCnd_first_gr_dt_fr_VC(info);
		if (vc == Cnd_first_gr_dt_to) return doCnd_first_gr_dt_to_VC(info);
		if (vc == Cnd_stk_sub_char1) return doCnd_stk_sub_char1_VC(info);
		if (vc == Cnd_stk_sub_char2) return doCnd_stk_sub_char2_VC(info);
		if (vc == Cnd_stk_sub_char3) return doCnd_stk_sub_char3_VC(info);
		if (vc == Cnd_lot_rmrks) return doCnd_lot_rmrks_VC(info);
		if (vc == Cnd_lot_sub_char1) return doCnd_lot_sub_char1_VC(info);
		if (vc == Cnd_lot_sub_char2) return doCnd_lot_sub_char2_VC(info);
		if (vc == Cnd_lot_sub_char3) return doCnd_lot_sub_char3_VC(info);
		if (vc == Cnd_dpt_flg) return doCnd_dpt_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_str_ln_flg) return doCnd_str_ln_flg_VC(info);
		if (vc == Cnd_stk_arrv_bp_flg) return doCnd_stk_arrv_bp_flg_VC(info);
		if (vc == Cnd_site_flg) return doCnd_site_flg_VC(info);
		if (vc == Cnd_lg_grp_flg) return doCnd_lg_grp_flg_VC(info);
		if (vc == Cnd_alloc_grp_flg) return doCnd_alloc_grp_flg_VC(info);
		if (vc == Cnd_loc_grp_flg) return doCnd_loc_grp_flg_VC(info);
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_fix_no_typ_flg) return doCnd_fix_no_typ_flg_VC(info);
		if (vc == Cnd_fix_no_flg) return doCnd_fix_no_flg_VC(info);
		if (vc == Cnd_bp_lot_flg) return doCnd_bp_lot_flg_VC(info);
		if (vc == Cnd_pack_unit_flg) return doCnd_pack_unit_flg_VC(info);
		if (vc == Cnd_gd_flg) return doCnd_gd_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_alloc_grp_cd) return doRslt_alloc_grp_cd_VC(info);
		if (vc == columnRslt_alloc_grp_nm) return doRslt_alloc_grp_nm_VC(info);
		if (vc == columnRslt_loc_grp_cd) return doRslt_loc_grp_cd_VC(info);
		if (vc == columnRslt_loc_grp_nm) return doRslt_loc_grp_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_in_xfr_typ) return doRslt_in_xfr_typ_VC(info);
		if (vc == columnRslt_in_xfr_typ_nm) return doRslt_in_xfr_typ_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_fix_no_typ) return doRslt_fix_no_typ_VC(info);
		if (vc == columnRslt_fix_no_typ_nm) return doRslt_fix_no_typ_nm_VC(info);
		if (vc == columnRslt_fix_no) return doRslt_fix_no_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_pack_unit_dec_place) return doRslt_pack_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_alloc_unit_cd) return doRslt_alloc_unit_cd_VC(info);
		if (vc == columnRslt_alloc_unit_nm) return doRslt_alloc_unit_nm_VC(info);
		if (vc == columnRslt_alloc_unit_dec_place) return doRslt_alloc_unit_dec_place_VC(info);
		if (vc == columnRslt_abnormal_alloc_flg) return doRslt_abnormal_alloc_flg_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_stk_amt_dec_place) return doRslt_stk_amt_dec_place_VC(info);
		if (vc == columnRslt_stk_amt_rnd_typ) return doRslt_stk_amt_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_in_prmt_insp_flg) return doRslt_in_prmt_insp_flg_VC(info);
		if (vc == columnRslt_lot_quality_typ) return doRslt_lot_quality_typ_VC(info);
		if (vc == columnRslt_lot_quality_typ_nm) return doRslt_lot_quality_typ_nm_VC(info);
		if (vc == columnRslt_lot_stk_insp_typ) return doRslt_lot_stk_insp_typ_VC(info);
		if (vc == columnRslt_lot_stk_insp_typ_nm) return doRslt_lot_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ) return doRslt_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ_nm) return doRslt_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_first_gr_dt) return doRslt_first_gr_dt_VC(info);
		if (vc == columnRslt_unreg_lmt_flg) return doRslt_unreg_lmt_flg_VC(info);
		if (vc == columnRslt_vld_dt) return doRslt_vld_dt_VC(info);
		if (vc == columnRslt_lmt_dt) return doRslt_lmt_dt_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ) return doRslt_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ_nm) return doRslt_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRslt_stk_sub_char1) return doRslt_stk_sub_char1_VC(info);
		if (vc == columnRslt_stk_sub_char2) return doRslt_stk_sub_char2_VC(info);
		if (vc == columnRslt_stk_sub_char3) return doRslt_stk_sub_char3_VC(info);
		if (vc == columnRslt_lot_rmrks) return doRslt_lot_rmrks_VC(info);
		if (vc == columnRslt_lot_sub_char1) return doRslt_lot_sub_char1_VC(info);
		if (vc == columnRslt_lot_sub_char2) return doRslt_lot_sub_char2_VC(info);
		if (vc == columnRslt_lot_sub_char3) return doRslt_lot_sub_char3_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[only_int_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_only_int_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lmt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lmt_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ignore_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ignore_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[positive_stk_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_positive_stk_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[negative_stk_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_negative_stk_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[positive_alloc_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_positive_alloc_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[negative_alloc_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_negative_alloc_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_except_alloc_wait_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[abnormal_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_abnormal_alloc_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_arrv_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_arrv_bp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_no_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_lot_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[abnormal_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abnormal_alloc_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_amt_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_prmt_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_prmt_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char3_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_NC(info);
		else if (nc == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_NC(info);
		else if (nc == Cnd_only_int_flg) doCnd_only_int_flg_NC(info);
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
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_bp_lot_no) doCnd_bp_lot_no_NC(info);
		else if (nc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NC(info);
		else if (nc == Cnd_vld_dt_to) doCnd_vld_dt_to_NC(info);
		else if (nc == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NC(info);
		else if (nc == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NC(info);
		else if (nc == Cnd_ignore_margin_days) doCnd_ignore_margin_days_NC(info);
		else if (nc == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NC(info);
		else if (nc == Cnd_positive_stk_qty_flg) doCnd_positive_stk_qty_flg_NC(info);
		else if (nc == Cnd_negative_stk_qty_flg) doCnd_negative_stk_qty_flg_NC(info);
		else if (nc == Cnd_positive_alloc_qty_flg) doCnd_positive_alloc_qty_flg_NC(info);
		else if (nc == Cnd_negative_alloc_qty_flg) doCnd_negative_alloc_qty_flg_NC(info);
		else if (nc == Cnd_except_alloc_wait_flg) doCnd_except_alloc_wait_flg_NC(info);
		else if (nc == Cnd_abnormal_alloc_flg) doCnd_abnormal_alloc_flg_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_in_xfr_typ) doCnd_in_xfr_typ_NC(info);
		else if (nc == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NC(info);
		else if (nc == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_stk_id_typ) doCnd_stk_id_typ_NC(info);
		else if (nc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NC(info);
		else if (nc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NC(info);
		else if (nc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NC(info);
		else if (nc == Cnd_fix_no_typ) doCnd_fix_no_typ_NC(info);
		else if (nc == Cnd_fix_no_typ_nm) doCnd_fix_no_typ_nm_NC(info);
		else if (nc == Cnd_fix_no) doCnd_fix_no_NC(info);
		else if (nc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NC(info);
		else if (nc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NC(info);
		else if (nc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NC(info);
		else if (nc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NC(info);
		else if (nc == Cnd_stk_sub_char1) doCnd_stk_sub_char1_NC(info);
		else if (nc == Cnd_stk_sub_char2) doCnd_stk_sub_char2_NC(info);
		else if (nc == Cnd_stk_sub_char3) doCnd_stk_sub_char3_NC(info);
		else if (nc == Cnd_lot_rmrks) doCnd_lot_rmrks_NC(info);
		else if (nc == Cnd_lot_sub_char1) doCnd_lot_sub_char1_NC(info);
		else if (nc == Cnd_lot_sub_char2) doCnd_lot_sub_char2_NC(info);
		else if (nc == Cnd_lot_sub_char3) doCnd_lot_sub_char3_NC(info);
		else if (nc == Cnd_dpt_flg) doCnd_dpt_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_str_ln_flg) doCnd_str_ln_flg_NC(info);
		else if (nc == Cnd_stk_arrv_bp_flg) doCnd_stk_arrv_bp_flg_NC(info);
		else if (nc == Cnd_site_flg) doCnd_site_flg_NC(info);
		else if (nc == Cnd_lg_grp_flg) doCnd_lg_grp_flg_NC(info);
		else if (nc == Cnd_alloc_grp_flg) doCnd_alloc_grp_flg_NC(info);
		else if (nc == Cnd_loc_grp_flg) doCnd_loc_grp_flg_NC(info);
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_fix_no_typ_flg) doCnd_fix_no_typ_flg_NC(info);
		else if (nc == Cnd_fix_no_flg) doCnd_fix_no_flg_NC(info);
		else if (nc == Cnd_bp_lot_flg) doCnd_bp_lot_flg_NC(info);
		else if (nc == Cnd_pack_unit_flg) doCnd_pack_unit_flg_NC(info);
		else if (nc == Cnd_gd_flg) doCnd_gd_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NC(info);
		else if (nc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NC(info);
		else if (nc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NC(info);
		else if (nc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NC(info);
		else if (nc == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_fix_no_typ) doRslt_fix_no_typ_NC(info);
		else if (nc == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NC(info);
		else if (nc == columnRslt_fix_no) doRslt_fix_no_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_alloc_unit_cd) doRslt_alloc_unit_cd_NC(info);
		else if (nc == columnRslt_alloc_unit_nm) doRslt_alloc_unit_nm_NC(info);
		else if (nc == columnRslt_alloc_unit_dec_place) doRslt_alloc_unit_dec_place_NC(info);
		else if (nc == columnRslt_abnormal_alloc_flg) doRslt_abnormal_alloc_flg_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_stk_amt_dec_place) doRslt_stk_amt_dec_place_NC(info);
		else if (nc == columnRslt_stk_amt_rnd_typ) doRslt_stk_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_in_prmt_insp_flg) doRslt_in_prmt_insp_flg_NC(info);
		else if (nc == columnRslt_lot_quality_typ) doRslt_lot_quality_typ_NC(info);
		else if (nc == columnRslt_lot_quality_typ_nm) doRslt_lot_quality_typ_nm_NC(info);
		else if (nc == columnRslt_lot_stk_insp_typ) doRslt_lot_stk_insp_typ_NC(info);
		else if (nc == columnRslt_lot_stk_insp_typ_nm) doRslt_lot_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_first_gr_dt) doRslt_first_gr_dt_NC(info);
		else if (nc == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NC(info);
		else if (nc == columnRslt_vld_dt) doRslt_vld_dt_NC(info);
		else if (nc == columnRslt_lmt_dt) doRslt_lmt_dt_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_stk_sub_char1) doRslt_stk_sub_char1_NC(info);
		else if (nc == columnRslt_stk_sub_char2) doRslt_stk_sub_char2_NC(info);
		else if (nc == columnRslt_stk_sub_char3) doRslt_stk_sub_char3_NC(info);
		else if (nc == columnRslt_lot_rmrks) doRslt_lot_rmrks_NC(info);
		else if (nc == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_NC(info);
		else if (nc == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_NC(info);
		else if (nc == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[only_int_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_only_int_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ignore_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ignore_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[positive_stk_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_positive_stk_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[negative_stk_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_negative_stk_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[positive_alloc_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_positive_alloc_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[negative_alloc_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_negative_alloc_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_alloc_wait_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abnormal_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abnormal_alloc_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_arrv_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abnormal_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abnormal_alloc_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_prmt_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_NE(info);
		else if (ne == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_NE(info);
		else if (ne == Cnd_only_int_flg) doCnd_only_int_flg_NE(info);
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
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_bp_lot_no) doCnd_bp_lot_no_NE(info);
		else if (ne == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NE(info);
		else if (ne == Cnd_vld_dt_to) doCnd_vld_dt_to_NE(info);
		else if (ne == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NE(info);
		else if (ne == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NE(info);
		else if (ne == Cnd_ignore_margin_days) doCnd_ignore_margin_days_NE(info);
		else if (ne == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NE(info);
		else if (ne == Cnd_positive_stk_qty_flg) doCnd_positive_stk_qty_flg_NE(info);
		else if (ne == Cnd_negative_stk_qty_flg) doCnd_negative_stk_qty_flg_NE(info);
		else if (ne == Cnd_positive_alloc_qty_flg) doCnd_positive_alloc_qty_flg_NE(info);
		else if (ne == Cnd_negative_alloc_qty_flg) doCnd_negative_alloc_qty_flg_NE(info);
		else if (ne == Cnd_except_alloc_wait_flg) doCnd_except_alloc_wait_flg_NE(info);
		else if (ne == Cnd_abnormal_alloc_flg) doCnd_abnormal_alloc_flg_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_in_xfr_typ) doCnd_in_xfr_typ_NE(info);
		else if (ne == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NE(info);
		else if (ne == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_stk_id_typ) doCnd_stk_id_typ_NE(info);
		else if (ne == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NE(info);
		else if (ne == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NE(info);
		else if (ne == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NE(info);
		else if (ne == Cnd_fix_no_typ) doCnd_fix_no_typ_NE(info);
		else if (ne == Cnd_fix_no_typ_nm) doCnd_fix_no_typ_nm_NE(info);
		else if (ne == Cnd_fix_no) doCnd_fix_no_NE(info);
		else if (ne == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NE(info);
		else if (ne == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NE(info);
		else if (ne == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NE(info);
		else if (ne == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NE(info);
		else if (ne == Cnd_stk_sub_char1) doCnd_stk_sub_char1_NE(info);
		else if (ne == Cnd_stk_sub_char2) doCnd_stk_sub_char2_NE(info);
		else if (ne == Cnd_stk_sub_char3) doCnd_stk_sub_char3_NE(info);
		else if (ne == Cnd_lot_rmrks) doCnd_lot_rmrks_NE(info);
		else if (ne == Cnd_lot_sub_char1) doCnd_lot_sub_char1_NE(info);
		else if (ne == Cnd_lot_sub_char2) doCnd_lot_sub_char2_NE(info);
		else if (ne == Cnd_lot_sub_char3) doCnd_lot_sub_char3_NE(info);
		else if (ne == Cnd_dpt_flg) doCnd_dpt_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_str_ln_flg) doCnd_str_ln_flg_NE(info);
		else if (ne == Cnd_stk_arrv_bp_flg) doCnd_stk_arrv_bp_flg_NE(info);
		else if (ne == Cnd_site_flg) doCnd_site_flg_NE(info);
		else if (ne == Cnd_lg_grp_flg) doCnd_lg_grp_flg_NE(info);
		else if (ne == Cnd_alloc_grp_flg) doCnd_alloc_grp_flg_NE(info);
		else if (ne == Cnd_loc_grp_flg) doCnd_loc_grp_flg_NE(info);
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_fix_no_typ_flg) doCnd_fix_no_typ_flg_NE(info);
		else if (ne == Cnd_fix_no_flg) doCnd_fix_no_flg_NE(info);
		else if (ne == Cnd_bp_lot_flg) doCnd_bp_lot_flg_NE(info);
		else if (ne == Cnd_pack_unit_flg) doCnd_pack_unit_flg_NE(info);
		else if (ne == Cnd_gd_flg) doCnd_gd_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NE(info);
		else if (ne == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NE(info);
		else if (ne == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NE(info);
		else if (ne == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NE(info);
		else if (ne == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_fix_no_typ) doRslt_fix_no_typ_NE(info);
		else if (ne == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NE(info);
		else if (ne == columnRslt_fix_no) doRslt_fix_no_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_alloc_unit_cd) doRslt_alloc_unit_cd_NE(info);
		else if (ne == columnRslt_alloc_unit_nm) doRslt_alloc_unit_nm_NE(info);
		else if (ne == columnRslt_alloc_unit_dec_place) doRslt_alloc_unit_dec_place_NE(info);
		else if (ne == columnRslt_abnormal_alloc_flg) doRslt_abnormal_alloc_flg_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_stk_amt_dec_place) doRslt_stk_amt_dec_place_NE(info);
		else if (ne == columnRslt_stk_amt_rnd_typ) doRslt_stk_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_in_prmt_insp_flg) doRslt_in_prmt_insp_flg_NE(info);
		else if (ne == columnRslt_lot_quality_typ) doRslt_lot_quality_typ_NE(info);
		else if (ne == columnRslt_lot_quality_typ_nm) doRslt_lot_quality_typ_nm_NE(info);
		else if (ne == columnRslt_lot_stk_insp_typ) doRslt_lot_stk_insp_typ_NE(info);
		else if (ne == columnRslt_lot_stk_insp_typ_nm) doRslt_lot_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_first_gr_dt) doRslt_first_gr_dt_NE(info);
		else if (ne == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NE(info);
		else if (ne == columnRslt_vld_dt) doRslt_vld_dt_NE(info);
		else if (ne == columnRslt_lmt_dt) doRslt_lmt_dt_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_stk_sub_char1) doRslt_stk_sub_char1_NE(info);
		else if (ne == columnRslt_stk_sub_char2) doRslt_stk_sub_char2_NE(info);
		else if (ne == columnRslt_stk_sub_char3) doRslt_stk_sub_char3_NE(info);
		else if (ne == columnRslt_lot_rmrks) doRslt_lot_rmrks_NE(info);
		else if (ne == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_NE(info);
		else if (ne == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_NE(info);
		else if (ne == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[only_int_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_only_int_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ignore_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ignore_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[positive_stk_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_positive_stk_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[negative_stk_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_negative_stk_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[positive_alloc_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_positive_alloc_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[negative_alloc_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_negative_alloc_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_alloc_wait_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abnormal_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abnormal_alloc_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_arrv_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abnormal_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abnormal_alloc_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_prmt_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_stk_arrv_bp_cd) doCnd_stk_arrv_bp_cd_NX(info);
		else if (nx == Cnd_stk_arrv_bp_nm) doCnd_stk_arrv_bp_nm_NX(info);
		else if (nx == Cnd_only_int_flg) doCnd_only_int_flg_NX(info);
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
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_bp_lot_no) doCnd_bp_lot_no_NX(info);
		else if (nx == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NX(info);
		else if (nx == Cnd_vld_dt_to) doCnd_vld_dt_to_NX(info);
		else if (nx == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NX(info);
		else if (nx == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NX(info);
		else if (nx == Cnd_ignore_margin_days) doCnd_ignore_margin_days_NX(info);
		else if (nx == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NX(info);
		else if (nx == Cnd_positive_stk_qty_flg) doCnd_positive_stk_qty_flg_NX(info);
		else if (nx == Cnd_negative_stk_qty_flg) doCnd_negative_stk_qty_flg_NX(info);
		else if (nx == Cnd_positive_alloc_qty_flg) doCnd_positive_alloc_qty_flg_NX(info);
		else if (nx == Cnd_negative_alloc_qty_flg) doCnd_negative_alloc_qty_flg_NX(info);
		else if (nx == Cnd_except_alloc_wait_flg) doCnd_except_alloc_wait_flg_NX(info);
		else if (nx == Cnd_abnormal_alloc_flg) doCnd_abnormal_alloc_flg_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_in_xfr_typ) doCnd_in_xfr_typ_NX(info);
		else if (nx == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_stk_insp_typ) doCnd_stk_insp_typ_NX(info);
		else if (nx == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_stk_id_typ) doCnd_stk_id_typ_NX(info);
		else if (nx == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NX(info);
		else if (nx == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NX(info);
		else if (nx == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NX(info);
		else if (nx == Cnd_fix_no_typ) doCnd_fix_no_typ_NX(info);
		else if (nx == Cnd_fix_no_typ_nm) doCnd_fix_no_typ_nm_NX(info);
		else if (nx == Cnd_fix_no) doCnd_fix_no_NX(info);
		else if (nx == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NX(info);
		else if (nx == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NX(info);
		else if (nx == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NX(info);
		else if (nx == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NX(info);
		else if (nx == Cnd_stk_sub_char1) doCnd_stk_sub_char1_NX(info);
		else if (nx == Cnd_stk_sub_char2) doCnd_stk_sub_char2_NX(info);
		else if (nx == Cnd_stk_sub_char3) doCnd_stk_sub_char3_NX(info);
		else if (nx == Cnd_lot_rmrks) doCnd_lot_rmrks_NX(info);
		else if (nx == Cnd_lot_sub_char1) doCnd_lot_sub_char1_NX(info);
		else if (nx == Cnd_lot_sub_char2) doCnd_lot_sub_char2_NX(info);
		else if (nx == Cnd_lot_sub_char3) doCnd_lot_sub_char3_NX(info);
		else if (nx == Cnd_dpt_flg) doCnd_dpt_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_str_ln_flg) doCnd_str_ln_flg_NX(info);
		else if (nx == Cnd_stk_arrv_bp_flg) doCnd_stk_arrv_bp_flg_NX(info);
		else if (nx == Cnd_site_flg) doCnd_site_flg_NX(info);
		else if (nx == Cnd_lg_grp_flg) doCnd_lg_grp_flg_NX(info);
		else if (nx == Cnd_alloc_grp_flg) doCnd_alloc_grp_flg_NX(info);
		else if (nx == Cnd_loc_grp_flg) doCnd_loc_grp_flg_NX(info);
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_fix_no_typ_flg) doCnd_fix_no_typ_flg_NX(info);
		else if (nx == Cnd_fix_no_flg) doCnd_fix_no_flg_NX(info);
		else if (nx == Cnd_bp_lot_flg) doCnd_bp_lot_flg_NX(info);
		else if (nx == Cnd_pack_unit_flg) doCnd_pack_unit_flg_NX(info);
		else if (nx == Cnd_gd_flg) doCnd_gd_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NX(info);
		else if (nx == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NX(info);
		else if (nx == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NX(info);
		else if (nx == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NX(info);
		else if (nx == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_fix_no_typ) doRslt_fix_no_typ_NX(info);
		else if (nx == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NX(info);
		else if (nx == columnRslt_fix_no) doRslt_fix_no_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_alloc_unit_cd) doRslt_alloc_unit_cd_NX(info);
		else if (nx == columnRslt_alloc_unit_nm) doRslt_alloc_unit_nm_NX(info);
		else if (nx == columnRslt_alloc_unit_dec_place) doRslt_alloc_unit_dec_place_NX(info);
		else if (nx == columnRslt_abnormal_alloc_flg) doRslt_abnormal_alloc_flg_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_stk_amt_dec_place) doRslt_stk_amt_dec_place_NX(info);
		else if (nx == columnRslt_stk_amt_rnd_typ) doRslt_stk_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_in_prmt_insp_flg) doRslt_in_prmt_insp_flg_NX(info);
		else if (nx == columnRslt_lot_quality_typ) doRslt_lot_quality_typ_NX(info);
		else if (nx == columnRslt_lot_quality_typ_nm) doRslt_lot_quality_typ_nm_NX(info);
		else if (nx == columnRslt_lot_stk_insp_typ) doRslt_lot_stk_insp_typ_NX(info);
		else if (nx == columnRslt_lot_stk_insp_typ_nm) doRslt_lot_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_first_gr_dt) doRslt_first_gr_dt_NX(info);
		else if (nx == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NX(info);
		else if (nx == columnRslt_vld_dt) doRslt_vld_dt_NX(info);
		else if (nx == columnRslt_lmt_dt) doRslt_lmt_dt_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_stk_sub_char1) doRslt_stk_sub_char1_NX(info);
		else if (nx == columnRslt_stk_sub_char2) doRslt_stk_sub_char2_NX(info);
		else if (nx == columnRslt_stk_sub_char3) doRslt_stk_sub_char3_NX(info);
		else if (nx == columnRslt_lot_rmrks) doRslt_lot_rmrks_NX(info);
		else if (nx == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_NX(info);
		else if (nx == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_NX(info);
		else if (nx == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[only_int_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_only_int_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ignore_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ignore_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[positive_stk_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_positive_stk_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[negative_stk_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_negative_stk_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[positive_alloc_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_positive_alloc_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[negative_alloc_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_negative_alloc_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[except_alloc_wait_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_alloc_wait_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abnormal_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abnormal_alloc_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_arrv_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_arrv_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abnormal_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abnormal_alloc_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_prmt_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_prmt_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_NX(MCEventInfo info){
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
		if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
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
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_bp_lot_no) doCnd_bp_lot_no_LC(info);
		else if (lc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_LC(info);
		else if (lc == Cnd_vld_dt_to) doCnd_vld_dt_to_LC(info);
		else if (lc == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_LC(info);
		else if (lc == Cnd_lmt_dt_to) doCnd_lmt_dt_to_LC(info);
		else if (lc == Cnd_ignore_margin_days) doCnd_ignore_margin_days_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_in_xfr_typ) doCnd_in_xfr_typ_LC(info);
		else if (lc == Cnd_in_xfr_typ_nm) doCnd_in_xfr_typ_nm_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_stk_insp_typ) doCnd_stk_insp_typ_LC(info);
		else if (lc == Cnd_stk_insp_typ_nm) doCnd_stk_insp_typ_nm_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_stk_id_typ) doCnd_stk_id_typ_LC(info);
		else if (lc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_LC(info);
		else if (lc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_LC(info);
		else if (lc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_LC(info);
		else if (lc == Cnd_fix_no_typ) doCnd_fix_no_typ_LC(info);
		else if (lc == Cnd_fix_no_typ_nm) doCnd_fix_no_typ_nm_LC(info);
		else if (lc == Cnd_fix_no) doCnd_fix_no_LC(info);
		else if (lc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_LC(info);
		else if (lc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_LC(info);
		else if (lc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_LC(info);
		else if (lc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_LC(info);
		else if (lc == Cnd_stk_sub_char1) doCnd_stk_sub_char1_LC(info);
		else if (lc == Cnd_stk_sub_char2) doCnd_stk_sub_char2_LC(info);
		else if (lc == Cnd_stk_sub_char3) doCnd_stk_sub_char3_LC(info);
		else if (lc == Cnd_lot_rmrks) doCnd_lot_rmrks_LC(info);
		else if (lc == Cnd_lot_sub_char1) doCnd_lot_sub_char1_LC(info);
		else if (lc == Cnd_lot_sub_char2) doCnd_lot_sub_char2_LC(info);
		else if (lc == Cnd_lot_sub_char3) doCnd_lot_sub_char3_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_LC(info);
		else if (lc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_LC(info);
		else if (lc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_LC(info);
		else if (lc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_LC(info);
		else if (lc == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_fix_no_typ) doRslt_fix_no_typ_LC(info);
		else if (lc == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_LC(info);
		else if (lc == columnRslt_fix_no) doRslt_fix_no_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_alloc_unit_cd) doRslt_alloc_unit_cd_LC(info);
		else if (lc == columnRslt_alloc_unit_nm) doRslt_alloc_unit_nm_LC(info);
		else if (lc == columnRslt_alloc_unit_dec_place) doRslt_alloc_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_stk_amt_dec_place) doRslt_stk_amt_dec_place_LC(info);
		else if (lc == columnRslt_stk_amt_rnd_typ) doRslt_stk_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_lot_quality_typ) doRslt_lot_quality_typ_LC(info);
		else if (lc == columnRslt_lot_quality_typ_nm) doRslt_lot_quality_typ_nm_LC(info);
		else if (lc == columnRslt_lot_stk_insp_typ) doRslt_lot_stk_insp_typ_LC(info);
		else if (lc == columnRslt_lot_stk_insp_typ_nm) doRslt_lot_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_first_gr_dt) doRslt_first_gr_dt_LC(info);
		else if (lc == columnRslt_vld_dt) doRslt_vld_dt_LC(info);
		else if (lc == columnRslt_lmt_dt) doRslt_lmt_dt_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_stk_sub_char1) doRslt_stk_sub_char1_LC(info);
		else if (lc == columnRslt_stk_sub_char2) doRslt_stk_sub_char2_LC(info);
		else if (lc == columnRslt_stk_sub_char3) doRslt_stk_sub_char3_LC(info);
		else if (lc == columnRslt_lot_rmrks) doRslt_lot_rmrks_LC(info);
		else if (lc == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_LC(info);
		else if (lc == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_LC(info);
		else if (lc == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_LC(info);
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
	 * [Cnd]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ignore_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ignore_margin_days_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_unit_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bp_lot_no]の作成メソッド
	 */
	public MCList getCnd_bp_lot_no(MCRow row, MCEventInfo info){
		return null;
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
	 * コンボ／リストのリスト[Cnd_stk_insp_typ]の作成メソッド
	 */
	public MCList getCnd_stk_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
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
	 * コンボ／リストのリスト[Cnd_fix_no_typ]の作成メソッド
	 */
	public MCList getCnd_fix_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getFixNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pack_unit_cd]の作成メソッド
	 */
	public MCList getCnd_pack_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0010.Srch01")) {
			return new MS_MSBEL0010_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0010_Srch01Bridge() {
			p_MS_MSBEL0010_Srch01 = new MCParam(PDef.MS_MSBEL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0010.RsltR.class));

			p_MS_MSBEL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0010.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0010_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP0010.RsltR>)p_MS_MSBEL0010_Srch01.getContainerParam().getDownBlock(0));
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