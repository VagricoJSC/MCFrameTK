package mcframe.clientMBBB.MBBBP0080;

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
import mcframe.clientMBBB.MBBBP0080.MBBBP_AcCostSrch_MC.MB_MBBBL0080_Srch01Caller;

/**
 * 画面"MBBBP_AcCostSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_AcCostSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBBP0080";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
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
	public MCLabel Cnd_ac_slip_typ_Label = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_slip_typ_nm = null;
	public MCLabel Cnd_ac_rsn_cd_Label = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCTextField Cnd_ac_rsn_nm = null;
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
	public MCTextField Cnd_sublot_no = null;
	public MCLabel Cnd_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_sno1 = null;
	public MCLabel Cnd_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_sno2 = null;
	public MCLabel Cnd_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_sno3 = null;
	public MCLabel Cnd_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_sno4 = null;
	public MCLabel Cnd_purc_dpt_cd_Label = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_nm = null;
	public MCLabel Cnd_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_nm = null;
	public MCLabel Cnd_sls_dpt_cd_Label = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_nm = null;
	public MCLabel Cnd_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_nm = null;
	public MCLabel Cnd_gi_dpt_cd_Label = null;
	/**
	 * GI dept. cd. 出庫部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gi_dpt_cd = null;
	/**
	 * GI dept. name 出庫部門名.<p>
	 *
	 */
	public MCTextField Cnd_gi_dpt_nm = null;
	public MCLabel Cnd_gr_dpt_cd_Label = null;
	/**
	 * GR dept. cd. 入庫部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_dpt_cd = null;
	/**
	 * GR dept. name 入庫部門名.<p>
	 *
	 */
	public MCTextField Cnd_gr_dpt_nm = null;
	public MCLabel Cnd_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBB.MBBBP0080.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
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
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_nm = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_no = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_typ_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_rsn_nm = null;
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
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_nm = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_nm = null;
	/**
	 * GI dept. cd. 出庫部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_dpt_cd = null;
	/**
	 * GI dept. name 出庫部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_dpt_nm = null;
	/**
	 * GR dept. cd. 入庫部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_dpt_cd = null;
	/**
	 * GR dept. name 入庫部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_dpt_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_nm = null;
	/**
	 * Spare dept. cd. 1 予備部門ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_cd1 = null;
	/**
	 * Spare dept. name 1 予備部門名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_nm1 = null;
	/**
	 * Spare dept. cd. 2 予備部門ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_cd2 = null;
	/**
	 * Spare dept. name 2 予備部門名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_nm2 = null;
	/**
	 * Spare dept. cd. 3 予備部門ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_cd3 = null;
	/**
	 * Spare dept. name 3 予備部門名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_nm3 = null;
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
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_nm = null;
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_itm_grp_cd = null;
	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_itm_grp_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4 = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_no = null;
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
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnRslt_repurc_obli_flg = null;
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_qty = null;
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
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt = null;
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
	 * Inventory storage destination cd. 在庫保管先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inv_com_cd = null;
	/**
	 * Inventory storage destination name 在庫保管先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inv_com_nm = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_area_nm = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_nm = null;
	/**
	 * Foreign transaction 国外取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Allocation source allocation account cd. 配賦元配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_alc_ac_cd = null;
	/**
	 * Allocation source allocation account name 配賦元配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_alc_ac_nm = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_nm = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_nm = null;
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_grp = null;
	/**
	 * Transfer accounting item classification cd. 振替先会計品目分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ac_itm_grp_cd = null;
	/**
	 * Transfer accounting item classification name 振替先会計品目分類名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ac_itm_grp_nm = null;
	/**
	 * Transfer Item journal cd. 振替先品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_itm_jnl_cd = null;
	/**
	 * Transfer item journal name 振替先品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_trd_itm_p_PPanel;
	public MCColumnConfig columnRslt_trd_itm_cd;// [Rslt]の[trd_itm_p.itm_cd]を[columnRslt_trd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_itm_sub1;// [Rslt]の[trd_itm_p.itm_sub1]を[columnRslt_trd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_itm_sub2;// [Rslt]の[trd_itm_p.itm_sub2]を[columnRslt_trd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_itm_sub3;// [Rslt]の[trd_itm_p.itm_sub3]を[columnRslt_trd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_itm_nm;// [Rslt]の[trd_itm_p.itm_nm]を[columnRslt_trd_itm_nm]としてエイリアス定義。
	/**
	 * Transfer lot No. 振替先ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_lot_no = null;
	/**
	 * Transfer sublot No. 振替先サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_sublot_no = null;
	/**
	 * Transfer SEIBAN No. 1 振替先手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_sno1 = null;
	/**
	 * Transfer SEIBAN No. 2 振替先手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_sno2 = null;
	/**
	 * Transfer SEIBAN No. 3 振替先手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_sno3 = null;
	/**
	 * Transfer SEIBAN No. 4 振替先手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_sno4 = null;
	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key1 = null;
	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key2 = null;
	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key3 = null;
	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key4 = null;
	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key5 = null;
	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key6 = null;
	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key7 = null;
	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key8 = null;
	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key9 = null;
	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key10 = null;
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
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char6 = null;
	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char7 = null;
	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char8 = null;
	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char9 = null;
	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char10 = null;
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
	 * Number of journalizing 仕訳実行回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_fin_cnt = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
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
	
	/** [MB_MBBBL0080_Srch01]のCallerの作成 */
	protected MBBBP_AcCostSrch_MC.MB_MBBBL0080_Srch01Caller createMB_MBBBL0080_Srch01() {
		MBBBP_AcCostSrch_MC.MB_MBBBL0080_Srch01Caller<MBBBP_AcCostSrch, MB_MBBBL0080_Srch01Bridge>
		caller = ((MBBBP_AcCostSrch_MC)this).new MB_MBBBL0080_Srch01Caller<MBBBP_AcCostSrch, MB_MBBBL0080_Srch01Bridge>(
					(MBBBP_AcCostSrch)this, new MB_MBBBL0080_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBBL0080_Srch01]の呼び出し */
	protected void callMB_MBBBL0080_Srch01() {
		MCCaller caller = createMB_MBBBL0080_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0080.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBB.MBBBP0080.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0080.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0080.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBB.MBBBP0080.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0080.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBB.MBBBP0080.RsltR createRsltR() {
		return mcframe.clientMBBB.MBBBP0080.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0080.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBB.MBBBP0080.RsltR.class);
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
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_AcCostSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBBP_AcCostSrch_MC_A(String name) {
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
		MBBBP_AcCostSrch_MC.jbCreateTop((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbCreateFold((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbCreateCnd((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbCreateCtrl((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbCreateRslt((MBBBP_AcCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBBP_AcCostSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBBP_AcCostSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_AcCostSrch p) {
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBBP_AcCostSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBBP_AcCostSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMBBB.MBBBP0080.RsltR.$itm_p);
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
		p.Rslt_trd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMBBB.MBBBP0080.RsltR.$trd_itm_p);
		p.Rslt_trd_itm_p_PPanel.setName("Rslt.trd_itm_p");
		p.columnRslt_trd_itm_cd = p.Rslt_trd_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_trd_itm_cd.addAliasName("Rslt.trd_itm_cd", p);
		p.columnRslt_trd_itm_sub1 = p.Rslt_trd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_trd_itm_sub1.addAliasName("Rslt.trd_itm_sub1", p);
		p.columnRslt_trd_itm_sub2 = p.Rslt_trd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_trd_itm_sub2.addAliasName("Rslt.trd_itm_sub2", p);
		p.columnRslt_trd_itm_sub3 = p.Rslt_trd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_trd_itm_sub3.addAliasName("Rslt.trd_itm_sub3", p);
		p.columnRslt_trd_itm_nm = p.Rslt_trd_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_trd_itm_nm.addAliasName("Rslt.trd_itm_nm", p);
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
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
	
	
	/** [Cnd_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_slip_typ_p = null;

	/**
	 * [Cnd_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_slip_typ_ListPutter() {
		if (Cnd_ac_slip_typ_p == null) {
			Cnd_ac_slip_typ_p = createCnd_ac_slip_typ_ListPutter(Cnd_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Cnd_ac_slip_typ_p;
	}
	
	
	/** [Cnd_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_rsn_cd_p = null;

	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_rsn_cd_ListPutter() {
		if (Cnd_ac_rsn_cd_p == null) {
			Cnd_ac_rsn_cd_p = createCnd_ac_rsn_cd_ListPutter(Cnd_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Cnd_ac_rsn_cd_p;
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
	
	
	/** [Cnd_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_dpt_cd_p = null;

	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_dpt_cd_ListPutter() {
		if (Cnd_ap_dpt_cd_p == null) {
			Cnd_ap_dpt_cd_p = createCnd_ap_dpt_cd_ListPutter(Cnd_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Cnd_ap_dpt_cd_p;
	}
	
	
	/** [Cnd_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_dpt_cd_p = null;

	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_dpt_cd_ListPutter() {
		if (Cnd_sls_dpt_cd_p == null) {
			Cnd_sls_dpt_cd_p = createCnd_sls_dpt_cd_ListPutter(Cnd_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Cnd_sls_dpt_cd_p;
	}
	
	
	/** [Cnd_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ar_dpt_cd_p = null;

	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_dpt_cd_ListPutter() {
		if (Cnd_ar_dpt_cd_p == null) {
			Cnd_ar_dpt_cd_p = createCnd_ar_dpt_cd_ListPutter(Cnd_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Cnd_ar_dpt_cd_p;
	}
	
	
	/** [Cnd_gi_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_dpt_cd_p = null;

	/**
	 * [Cnd_gi_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_dpt_cd_ListPutter() {
		if (Cnd_gi_dpt_cd_p == null) {
			Cnd_gi_dpt_cd_p = createCnd_gi_dpt_cd_ListPutter(Cnd_gi_dpt_cd, "gi_dpt_cd", "gi_dpt_nm");

		}
		return Cnd_gi_dpt_cd_p;
	}
	
	
	/** [Cnd_gr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_dpt_cd_p = null;

	/**
	 * [Cnd_gr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_dpt_cd_ListPutter() {
		if (Cnd_gr_dpt_cd_p == null) {
			Cnd_gr_dpt_cd_p = createCnd_gr_dpt_cd_ListPutter(Cnd_gr_dpt_cd, "gr_dpt_cd", "gr_dpt_nm");

		}
		return Cnd_gr_dpt_cd_p;
	}
	
	
	/** [Cnd_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bd_dpt_cd_p = null;

	/**
	 * [Cnd_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bd_dpt_cd_ListPutter() {
		if (Cnd_bd_dpt_cd_p == null) {
			Cnd_bd_dpt_cd_p = createCnd_bd_dpt_cd_ListPutter(Cnd_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Cnd_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_AcCostSrch create(){
		MBBBP_AcCostSrch p = new MBBBP_AcCostSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_AcCostSrch create(String name){
		MBBBP_AcCostSrch p = new MBBBP_AcCostSrch(name);
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
		MBBBP_AcCostSrch_MC.jbfInitTop((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbfInitFold((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbfInitCnd((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbfInitCtrl((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbfInitRslt((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbInitTop((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbInitFold((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbInitCnd((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbInitCtrl((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.jbInitRslt((MBBBP_AcCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_ac_rsn_cd_Label = p.beansFactory.createLabel("Cnd.ac_rsn_cd_Label");
		p.Cnd_ac_rsn_cd = p.beansFactory.createTextComboBox("Cnd.ac_rsn_cd");
		p.Cnd_ac_rsn_cd.setLabel(p.Cnd_ac_rsn_cd_Label);
		p.Cnd_ac_rsn_nm = p.beansFactory.createTextField("Cnd.ac_rsn_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextField("Cnd.sublot_no");
		p.Cnd_sno1_Label = p.beansFactory.createLabel("Cnd.sno1_Label");
		p.Cnd_sno1 = p.beansFactory.createTextField("Cnd.sno1");
		p.Cnd_sno1.setLabel(p.Cnd_sno1_Label);
		p.Cnd_sno2_Label = p.beansFactory.createLabel("Cnd.sno2_Label");
		p.Cnd_sno2 = p.beansFactory.createTextField("Cnd.sno2");
		p.Cnd_sno2.setLabel(p.Cnd_sno2_Label);
		p.Cnd_sno3_Label = p.beansFactory.createLabel("Cnd.sno3_Label");
		p.Cnd_sno3 = p.beansFactory.createTextField("Cnd.sno3");
		p.Cnd_sno3.setLabel(p.Cnd_sno3_Label);
		p.Cnd_sno4_Label = p.beansFactory.createLabel("Cnd.sno4_Label");
		p.Cnd_sno4 = p.beansFactory.createTextField("Cnd.sno4");
		p.Cnd_sno4.setLabel(p.Cnd_sno4_Label);
		p.Cnd_purc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.purc_dpt_cd_Label");
		p.Cnd_purc_dpt_cd = p.beansFactory.createTextComboBox("Cnd.purc_dpt_cd");
		p.Cnd_purc_dpt_cd.setLabel(p.Cnd_purc_dpt_cd_Label);
		p.Cnd_purc_dpt_nm = p.beansFactory.createTextField("Cnd.purc_dpt_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextComboBox("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextComboBox("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_ar_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ar_dpt_cd_Label");
		p.Cnd_ar_dpt_cd = p.beansFactory.createTextComboBox("Cnd.ar_dpt_cd");
		p.Cnd_ar_dpt_cd.setLabel(p.Cnd_ar_dpt_cd_Label);
		p.Cnd_ar_dpt_nm = p.beansFactory.createTextField("Cnd.ar_dpt_nm");
		p.Cnd_gi_dpt_cd_Label = p.beansFactory.createLabel("Cnd.gi_dpt_cd_Label");
		p.Cnd_gi_dpt_cd = p.beansFactory.createTextComboBox("Cnd.gi_dpt_cd");
		p.Cnd_gi_dpt_cd.setLabel(p.Cnd_gi_dpt_cd_Label);
		p.Cnd_gi_dpt_nm = p.beansFactory.createTextField("Cnd.gi_dpt_nm");
		p.Cnd_gr_dpt_cd_Label = p.beansFactory.createLabel("Cnd.gr_dpt_cd_Label");
		p.Cnd_gr_dpt_cd = p.beansFactory.createTextComboBox("Cnd.gr_dpt_cd");
		p.Cnd_gr_dpt_cd.setLabel(p.Cnd_gr_dpt_cd_Label);
		p.Cnd_gr_dpt_nm = p.beansFactory.createTextField("Cnd.gr_dpt_nm");
		p.Cnd_bd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bd_dpt_cd_Label");
		p.Cnd_bd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.bd_dpt_cd");
		p.Cnd_bd_dpt_cd.setLabel(p.Cnd_bd_dpt_cd_Label);
		p.Cnd_bd_dpt_nm = p.beansFactory.createTextField("Cnd.bd_dpt_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_calc_grp_cd = p.beansFactory.createTableColumn("Rslt.calc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_calc_grp_nm = p.beansFactory.createTableColumn("Rslt.calc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_calc_no = p.beansFactory.createTableColumn("Rslt.calc_no", MCColumnType.TEXT);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_ac_slip_typ = p.beansFactory.createTableColumn("Rslt.ac_slip_typ", MCColumnType.TEXT);
		p.columnRslt_ac_slip_typ_nm = p.beansFactory.createTableColumn("Rslt.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ac_rsn_cd = p.beansFactory.createTableColumn("Rslt.ac_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_ac_rsn_nm = p.beansFactory.createTableColumn("Rslt.ac_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_nm = p.beansFactory.createTableColumn("Rslt.ar_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_gi_dpt_cd = p.beansFactory.createTableColumn("Rslt.gi_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_gi_dpt_nm = p.beansFactory.createTableColumn("Rslt.gi_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_gr_dpt_cd = p.beansFactory.createTableColumn("Rslt.gr_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_gr_dpt_nm = p.beansFactory.createTableColumn("Rslt.gr_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_cd1 = p.beansFactory.createTableColumn("Rslt.sub_dpt_cd1", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_nm1 = p.beansFactory.createTableColumn("Rslt.sub_dpt_nm1", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_cd2 = p.beansFactory.createTableColumn("Rslt.sub_dpt_cd2", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_nm2 = p.beansFactory.createTableColumn("Rslt.sub_dpt_nm2", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_cd3 = p.beansFactory.createTableColumn("Rslt.sub_dpt_cd3", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_nm3 = p.beansFactory.createTableColumn("Rslt.sub_dpt_nm3", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_ac_itm_grp_cd = p.beansFactory.createTableColumn("Rslt.ac_itm_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ac_itm_grp_nm = p.beansFactory.createTableColumn("Rslt.ac_itm_grp_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sno1 = p.beansFactory.createTableColumn("Rslt.sno1", MCColumnType.TEXT);
		p.columnRslt_sno2 = p.beansFactory.createTableColumn("Rslt.sno2", MCColumnType.TEXT);
		p.columnRslt_sno3 = p.beansFactory.createTableColumn("Rslt.sno3", MCColumnType.TEXT);
		p.columnRslt_sno4 = p.beansFactory.createTableColumn("Rslt.sno4", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT);
		p.columnRslt_asst_typ_nm = p.beansFactory.createTableColumn("Rslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_repurc_obli_flg = p.beansFactory.createTableColumn("Rslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_qty = p.beansFactory.createTableColumn("Rslt.base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt = p.beansFactory.createTableColumn("Rslt.amt", MCColumnType.NUMBER);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_inv_com_cd = p.beansFactory.createTableColumn("Rslt.inv_com_cd", MCColumnType.TEXT);
		p.columnRslt_inv_com_nm = p.beansFactory.createTableColumn("Rslt.inv_com_nm", MCColumnType.TEXT);
		p.columnRslt_area_cd = p.beansFactory.createTableColumn("Rslt.area_cd", MCColumnType.TEXT);
		p.columnRslt_area_nm = p.beansFactory.createTableColumn("Rslt.area_nm", MCColumnType.TEXT);
		p.columnRslt_cntry_cd = p.beansFactory.createTableColumn("Rslt.cntry_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_nm = p.beansFactory.createTableColumn("Rslt.cntry_nm", MCColumnType.TEXT);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_src_alc_ac_cd = p.beansFactory.createTableColumn("Rslt.src_alc_ac_cd", MCColumnType.TEXT);
		p.columnRslt_src_alc_ac_nm = p.beansFactory.createTableColumn("Rslt.src_alc_ac_nm", MCColumnType.TEXT);
		p.columnRslt_alc_ac_cd = p.beansFactory.createTableColumn("Rslt.alc_ac_cd", MCColumnType.TEXT);
		p.columnRslt_alc_ac_nm = p.beansFactory.createTableColumn("Rslt.alc_ac_nm", MCColumnType.TEXT);
		p.columnRslt_expns_cd = p.beansFactory.createTableColumn("Rslt.expns_cd", MCColumnType.TEXT);
		p.columnRslt_expns_nm = p.beansFactory.createTableColumn("Rslt.expns_nm", MCColumnType.TEXT);
		p.columnRslt_trd_grp = p.beansFactory.createTableColumn("Rslt.trd_grp", MCColumnType.TEXT);
		p.columnRslt_trd_ac_itm_grp_cd = p.beansFactory.createTableColumn("Rslt.trd_ac_itm_grp_cd", MCColumnType.TEXT);
		p.columnRslt_trd_ac_itm_grp_nm = p.beansFactory.createTableColumn("Rslt.trd_ac_itm_grp_nm", MCColumnType.TEXT);
		p.columnRslt_trd_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.trd_itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_trd_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.trd_itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_trd_lot_no = p.beansFactory.createTableColumn("Rslt.trd_lot_no", MCColumnType.TEXT);
		p.columnRslt_trd_sublot_no = p.beansFactory.createTableColumn("Rslt.trd_sublot_no", MCColumnType.TEXT);
		p.columnRslt_trd_sno1 = p.beansFactory.createTableColumn("Rslt.trd_sno1", MCColumnType.TEXT);
		p.columnRslt_trd_sno2 = p.beansFactory.createTableColumn("Rslt.trd_sno2", MCColumnType.TEXT);
		p.columnRslt_trd_sno3 = p.beansFactory.createTableColumn("Rslt.trd_sno3", MCColumnType.TEXT);
		p.columnRslt_trd_sno4 = p.beansFactory.createTableColumn("Rslt.trd_sno4", MCColumnType.TEXT);
		p.columnRslt_jnl_key1 = p.beansFactory.createTableColumn("Rslt.jnl_key1", MCColumnType.TEXT);
		p.columnRslt_jnl_key2 = p.beansFactory.createTableColumn("Rslt.jnl_key2", MCColumnType.TEXT);
		p.columnRslt_jnl_key3 = p.beansFactory.createTableColumn("Rslt.jnl_key3", MCColumnType.TEXT);
		p.columnRslt_jnl_key4 = p.beansFactory.createTableColumn("Rslt.jnl_key4", MCColumnType.TEXT);
		p.columnRslt_jnl_key5 = p.beansFactory.createTableColumn("Rslt.jnl_key5", MCColumnType.TEXT);
		p.columnRslt_jnl_key6 = p.beansFactory.createTableColumn("Rslt.jnl_key6", MCColumnType.TEXT);
		p.columnRslt_jnl_key7 = p.beansFactory.createTableColumn("Rslt.jnl_key7", MCColumnType.TEXT);
		p.columnRslt_jnl_key8 = p.beansFactory.createTableColumn("Rslt.jnl_key8", MCColumnType.TEXT);
		p.columnRslt_jnl_key9 = p.beansFactory.createTableColumn("Rslt.jnl_key9", MCColumnType.TEXT);
		p.columnRslt_jnl_key10 = p.beansFactory.createTableColumn("Rslt.jnl_key10", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_sub_char4 = p.beansFactory.createTableColumn("Rslt.sub_char4", MCColumnType.TEXT);
		p.columnRslt_sub_char5 = p.beansFactory.createTableColumn("Rslt.sub_char5", MCColumnType.TEXT);
		p.columnRslt_sub_char6 = p.beansFactory.createTableColumn("Rslt.sub_char6", MCColumnType.TEXT);
		p.columnRslt_sub_char7 = p.beansFactory.createTableColumn("Rslt.sub_char7", MCColumnType.TEXT);
		p.columnRslt_sub_char8 = p.beansFactory.createTableColumn("Rslt.sub_char8", MCColumnType.TEXT);
		p.columnRslt_sub_char9 = p.beansFactory.createTableColumn("Rslt.sub_char9", MCColumnType.TEXT);
		p.columnRslt_sub_char10 = p.beansFactory.createTableColumn("Rslt.sub_char10", MCColumnType.TEXT);
		p.columnRslt_sub_num1 = p.beansFactory.createTableColumn("Rslt.sub_num1", MCColumnType.NUMBER);
		p.columnRslt_sub_num2 = p.beansFactory.createTableColumn("Rslt.sub_num2", MCColumnType.NUMBER);
		p.columnRslt_sub_num3 = p.beansFactory.createTableColumn("Rslt.sub_num3", MCColumnType.NUMBER);
		p.columnRslt_sub_dt1 = p.beansFactory.createTableColumn("Rslt.sub_dt1", MCColumnType.DATE);
		p.columnRslt_sub_dt2 = p.beansFactory.createTableColumn("Rslt.sub_dt2", MCColumnType.DATE);
		p.columnRslt_sub_dt3 = p.beansFactory.createTableColumn("Rslt.sub_dt3", MCColumnType.DATE);
		p.columnRslt_jnl_fin_cnt = p.beansFactory.createTableColumn("Rslt.jnl_fin_cnt", MCColumnType.NUMBER);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setValueCheck(false);
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_calc_grp_cd);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.calc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_grp_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ac_slip_typ);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ac_slip_typ_nm_META);
		p.Cnd_ac_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_rsn_cd, true);
		p.Cnd_ac_rsn_cd.setLinkBeans(p.Cnd_ac_rsn_nm);
		p.CndPanel.add(p.Cnd_ac_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_rsn_cd.setNextBeans(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ac_rsn_cd_META);
		p.CndPanel.add(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_ac_rsn_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ac_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_rsn_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_purc_dpt_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_cd, true);
		p.Cnd_purc_dpt_cd.setLinkBeans(p.Cnd_purc_dpt_nm);
		p.CndPanel.add(p.Cnd_purc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_dpt_cd.setNextBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.purc_dpt_cd_META);
		p.CndPanel.add(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.purc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_dpt_nm, true);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.Cnd_ap_dpt_cd.setLinkBeans(p.Cnd_ap_dpt_nm);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ap_dpt_cd_META);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.Cnd_sls_dpt_cd.setLinkBeans(p.Cnd_sls_dpt_nm);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sls_dpt_cd_META);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_ar_dpt_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_ar_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_dpt_cd, true);
		p.Cnd_ar_dpt_cd.setLinkBeans(p.Cnd_ar_dpt_nm);
		p.CndPanel.add(p.Cnd_ar_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ar_dpt_cd);
		p.Cnd_ar_dpt_cd.setNextBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ar_dpt_cd_META);
		p.CndPanel.add(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_nm.setNextBeans(p.Cnd_gi_dpt_cd);
		p.Cnd_ar_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.ar_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ar_dpt_nm, true);
		p.Cnd_gi_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_dpt_cd, true);
		p.Cnd_gi_dpt_cd.setLinkBeans(p.Cnd_gi_dpt_nm);
		p.CndPanel.add(p.Cnd_gi_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_gi_dpt_cd);
		p.Cnd_gi_dpt_cd.setNextBeans(p.Cnd_gi_dpt_nm);
		p.Cnd_gi_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.gi_dpt_cd_META);
		p.CndPanel.add(p.Cnd_gi_dpt_nm);
		p.Cnd_gi_dpt_nm.setNextBeans(p.Cnd_gr_dpt_cd);
		p.Cnd_gi_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.gi_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_dpt_nm, true);
		p.Cnd_gr_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_dpt_cd, true);
		p.Cnd_gr_dpt_cd.setLinkBeans(p.Cnd_gr_dpt_nm);
		p.CndPanel.add(p.Cnd_gr_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_gr_dpt_cd);
		p.Cnd_gr_dpt_cd.setNextBeans(p.Cnd_gr_dpt_nm);
		p.Cnd_gr_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.gr_dpt_cd_META);
		p.CndPanel.add(p.Cnd_gr_dpt_nm);
		p.Cnd_gr_dpt_nm.setNextBeans(p.Cnd_bd_dpt_cd);
		p.Cnd_gr_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.gr_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_dpt_nm, true);
		p.Cnd_bd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bd_dpt_cd, true);
		p.Cnd_bd_dpt_cd.setLinkBeans(p.Cnd_bd_dpt_nm);
		p.CndPanel.add(p.Cnd_bd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bd_dpt_cd);
		p.Cnd_bd_dpt_cd.setNextBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.bd_dpt_cd_META);
		p.CndPanel.add(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0080.CndR.bd_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bd_dpt_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBBP_AcCostSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
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
		MBBBP_AcCostSrch_MC.mcInitTop((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.mcInitFold((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.mcInitCnd((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.mcInitCtrl((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.mcInitRslt((MBBBP_AcCostSrch)this);

		// [SRCH]ステータスのモードの設定
		MBBBP_AcCostSrch_MC.statusInitSRCH_Top((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitSRCH_Fold((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitSRCH_Cnd((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitSRCH_Ctrl((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitSRCH_Rslt((MBBBP_AcCostSrch)this);

		// [REF]ステータスのモードの設定
		MBBBP_AcCostSrch_MC.statusInitREF_Top((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitREF_Fold((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitREF_Cnd((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitREF_Ctrl((MBBBP_AcCostSrch)this);
		MBBBP_AcCostSrch_MC.statusInitREF_Rslt((MBBBP_AcCostSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBBP_AcCostSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBBP_AcCostSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_AcCostSrch p) {
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_ac_rsn_cd.setListListener(p);
		p.Cnd_ac_rsn_cd.addAllListener(p);
		p.Cnd_ac_rsn_nm.setListListener(p);
		p.Cnd_ac_rsn_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_sno1.setListListener(p);
		p.Cnd_sno1.addAllListener(p);
		p.Cnd_sno2.setListListener(p);
		p.Cnd_sno2.addAllListener(p);
		p.Cnd_sno3.setListListener(p);
		p.Cnd_sno3.addAllListener(p);
		p.Cnd_sno4.setListListener(p);
		p.Cnd_sno4.addAllListener(p);
		p.Cnd_purc_dpt_cd.setListListener(p);
		p.Cnd_purc_dpt_cd.addAllListener(p);
		p.Cnd_purc_dpt_nm.setListListener(p);
		p.Cnd_purc_dpt_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_ar_dpt_cd.setListListener(p);
		p.Cnd_ar_dpt_cd.addAllListener(p);
		p.Cnd_ar_dpt_nm.setListListener(p);
		p.Cnd_ar_dpt_nm.addAllListener(p);
		p.Cnd_gi_dpt_cd.setListListener(p);
		p.Cnd_gi_dpt_cd.addAllListener(p);
		p.Cnd_gi_dpt_nm.setListListener(p);
		p.Cnd_gi_dpt_nm.addAllListener(p);
		p.Cnd_gr_dpt_cd.setListListener(p);
		p.Cnd_gr_dpt_cd.addAllListener(p);
		p.Cnd_gr_dpt_nm.setListListener(p);
		p.Cnd_gr_dpt_nm.addAllListener(p);
		p.Cnd_bd_dpt_cd.setListListener(p);
		p.Cnd_bd_dpt_cd.addAllListener(p);
		p.Cnd_bd_dpt_nm.setListListener(p);
		p.Cnd_bd_dpt_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBBP_AcCostSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBBP_AcCostSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_calc_grp_cd.addAllListener(p);
		p.columnRslt_calc_grp_cd.setListListener(p);
		p.columnRslt_calc_grp_nm.addAllListener(p);
		p.columnRslt_calc_grp_nm.setListListener(p);
		p.columnRslt_calc_no.addAllListener(p);
		p.columnRslt_calc_no.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_ac_slip_typ.addAllListener(p);
		p.columnRslt_ac_slip_typ.setListListener(p);
		p.columnRslt_ac_slip_typ_nm.addAllListener(p);
		p.columnRslt_ac_slip_typ_nm.setListListener(p);
		p.columnRslt_ac_rsn_cd.addAllListener(p);
		p.columnRslt_ac_rsn_cd.setListListener(p);
		p.columnRslt_ac_rsn_nm.addAllListener(p);
		p.columnRslt_ac_rsn_nm.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_nm.addAllListener(p);
		p.columnRslt_ar_dpt_nm.setListListener(p);
		p.columnRslt_gi_dpt_cd.addAllListener(p);
		p.columnRslt_gi_dpt_cd.setListListener(p);
		p.columnRslt_gi_dpt_nm.addAllListener(p);
		p.columnRslt_gi_dpt_nm.setListListener(p);
		p.columnRslt_gr_dpt_cd.addAllListener(p);
		p.columnRslt_gr_dpt_cd.setListListener(p);
		p.columnRslt_gr_dpt_nm.addAllListener(p);
		p.columnRslt_gr_dpt_nm.setListListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_sub_dpt_cd1.addAllListener(p);
		p.columnRslt_sub_dpt_cd1.setListListener(p);
		p.columnRslt_sub_dpt_nm1.addAllListener(p);
		p.columnRslt_sub_dpt_nm1.setListListener(p);
		p.columnRslt_sub_dpt_cd2.addAllListener(p);
		p.columnRslt_sub_dpt_cd2.setListListener(p);
		p.columnRslt_sub_dpt_nm2.addAllListener(p);
		p.columnRslt_sub_dpt_nm2.setListListener(p);
		p.columnRslt_sub_dpt_cd3.addAllListener(p);
		p.columnRslt_sub_dpt_cd3.setListListener(p);
		p.columnRslt_sub_dpt_nm3.addAllListener(p);
		p.columnRslt_sub_dpt_nm3.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_ac_itm_grp_cd.addAllListener(p);
		p.columnRslt_ac_itm_grp_cd.setListListener(p);
		p.columnRslt_ac_itm_grp_nm.addAllListener(p);
		p.columnRslt_ac_itm_grp_nm.setListListener(p);
		p.columnRslt_itm_jnl_cd.addAllListener(p);
		p.columnRslt_itm_jnl_cd.setListListener(p);
		p.columnRslt_itm_jnl_nm.addAllListener(p);
		p.columnRslt_itm_jnl_nm.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_sno1.addAllListener(p);
		p.columnRslt_sno1.setListListener(p);
		p.columnRslt_sno2.addAllListener(p);
		p.columnRslt_sno2.setListListener(p);
		p.columnRslt_sno3.addAllListener(p);
		p.columnRslt_sno3.setListListener(p);
		p.columnRslt_sno4.addAllListener(p);
		p.columnRslt_sno4.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_asst_typ.addAllListener(p);
		p.columnRslt_asst_typ.setListListener(p);
		p.columnRslt_asst_typ_nm.addAllListener(p);
		p.columnRslt_asst_typ_nm.setListListener(p);
		p.columnRslt_repurc_obli_flg.addAllListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_qty.addAllListener(p);
		p.columnRslt_base_unit_qty.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_amt.addAllListener(p);
		p.columnRslt_amt.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_inv_com_cd.addAllListener(p);
		p.columnRslt_inv_com_cd.setListListener(p);
		p.columnRslt_inv_com_nm.addAllListener(p);
		p.columnRslt_inv_com_nm.setListListener(p);
		p.columnRslt_area_cd.addAllListener(p);
		p.columnRslt_area_cd.setListListener(p);
		p.columnRslt_area_nm.addAllListener(p);
		p.columnRslt_area_nm.setListListener(p);
		p.columnRslt_cntry_cd.addAllListener(p);
		p.columnRslt_cntry_cd.setListListener(p);
		p.columnRslt_cntry_nm.addAllListener(p);
		p.columnRslt_cntry_nm.setListListener(p);
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_src_alc_ac_cd.addAllListener(p);
		p.columnRslt_src_alc_ac_cd.setListListener(p);
		p.columnRslt_src_alc_ac_nm.addAllListener(p);
		p.columnRslt_src_alc_ac_nm.setListListener(p);
		p.columnRslt_alc_ac_cd.addAllListener(p);
		p.columnRslt_alc_ac_cd.setListListener(p);
		p.columnRslt_alc_ac_nm.addAllListener(p);
		p.columnRslt_alc_ac_nm.setListListener(p);
		p.columnRslt_expns_cd.addAllListener(p);
		p.columnRslt_expns_cd.setListListener(p);
		p.columnRslt_expns_nm.addAllListener(p);
		p.columnRslt_expns_nm.setListListener(p);
		p.columnRslt_trd_grp.addAllListener(p);
		p.columnRslt_trd_grp.setListListener(p);
		p.columnRslt_trd_ac_itm_grp_cd.addAllListener(p);
		p.columnRslt_trd_ac_itm_grp_cd.setListListener(p);
		p.columnRslt_trd_ac_itm_grp_nm.addAllListener(p);
		p.columnRslt_trd_ac_itm_grp_nm.setListListener(p);
		p.columnRslt_trd_itm_jnl_cd.addAllListener(p);
		p.columnRslt_trd_itm_jnl_cd.setListListener(p);
		p.columnRslt_trd_itm_jnl_nm.addAllListener(p);
		p.columnRslt_trd_itm_jnl_nm.setListListener(p);
		p.columnRslt_trd_lot_no.addAllListener(p);
		p.columnRslt_trd_lot_no.setListListener(p);
		p.columnRslt_trd_sublot_no.addAllListener(p);
		p.columnRslt_trd_sublot_no.setListListener(p);
		p.columnRslt_trd_sno1.addAllListener(p);
		p.columnRslt_trd_sno1.setListListener(p);
		p.columnRslt_trd_sno2.addAllListener(p);
		p.columnRslt_trd_sno2.setListListener(p);
		p.columnRslt_trd_sno3.addAllListener(p);
		p.columnRslt_trd_sno3.setListListener(p);
		p.columnRslt_trd_sno4.addAllListener(p);
		p.columnRslt_trd_sno4.setListListener(p);
		p.columnRslt_jnl_key1.addAllListener(p);
		p.columnRslt_jnl_key1.setListListener(p);
		p.columnRslt_jnl_key2.addAllListener(p);
		p.columnRslt_jnl_key2.setListListener(p);
		p.columnRslt_jnl_key3.addAllListener(p);
		p.columnRslt_jnl_key3.setListListener(p);
		p.columnRslt_jnl_key4.addAllListener(p);
		p.columnRslt_jnl_key4.setListListener(p);
		p.columnRslt_jnl_key5.addAllListener(p);
		p.columnRslt_jnl_key5.setListListener(p);
		p.columnRslt_jnl_key6.addAllListener(p);
		p.columnRslt_jnl_key6.setListListener(p);
		p.columnRslt_jnl_key7.addAllListener(p);
		p.columnRslt_jnl_key7.setListListener(p);
		p.columnRslt_jnl_key8.addAllListener(p);
		p.columnRslt_jnl_key8.setListListener(p);
		p.columnRslt_jnl_key9.addAllListener(p);
		p.columnRslt_jnl_key9.setListListener(p);
		p.columnRslt_jnl_key10.addAllListener(p);
		p.columnRslt_jnl_key10.setListListener(p);
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
		p.columnRslt_sub_char6.addAllListener(p);
		p.columnRslt_sub_char6.setListListener(p);
		p.columnRslt_sub_char7.addAllListener(p);
		p.columnRslt_sub_char7.setListListener(p);
		p.columnRslt_sub_char8.addAllListener(p);
		p.columnRslt_sub_char8.setListListener(p);
		p.columnRslt_sub_char9.addAllListener(p);
		p.columnRslt_sub_char9.setListListener(p);
		p.columnRslt_sub_char10.addAllListener(p);
		p.columnRslt_sub_char10.setListListener(p);
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
		p.columnRslt_jnl_fin_cnt.addAllListener(p);
		p.columnRslt_jnl_fin_cnt.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBBP_AcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBBP_AcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBBP_AcCostSrch p){
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBBP_AcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBBP_AcCostSrch p){
		p.columnRslt_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_itm_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_itm_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inv_com_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inv_com_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_grp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_ac_itm_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_ac_itm_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_trd_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_fin_cnt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBBP_AcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBBP_AcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBBP_AcCostSrch p){
		p.Cnd_ac_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBBP_AcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBBP_AcCostSrch p){
		p.columnRslt_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inv_com_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inv_com_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ac_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ac_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_trd_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_fin_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

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
		MBBBP_AcCostSrch_MC.setTableConfigRslt((MBBBP_AcCostSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBBP_AcCostSrch p) {
		p.columnRslt_data_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_calc_grp_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.calc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_cd);
		p.columnRslt_calc_grp_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.calc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_nm);
		p.columnRslt_calc_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.calc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_no);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_ac_slip_typ.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_slip_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_typ);
		p.columnRslt_ac_slip_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_slip_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_typ_nm);
		p.columnRslt_ac_rsn_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_rsn_cd);
		p.columnRslt_ac_rsn_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_rsn_nm);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_ar_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ar_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_nm);
		p.columnRslt_gi_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.gi_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_dpt_cd);
		p.columnRslt_gi_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.gi_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_dpt_nm);
		p.columnRslt_gr_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.gr_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_dpt_cd);
		p.columnRslt_gr_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.gr_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_dpt_nm);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.columnRslt_sub_dpt_cd1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dpt_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_cd1);
		p.columnRslt_sub_dpt_nm1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dpt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_nm1);
		p.columnRslt_sub_dpt_cd2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dpt_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_cd2);
		p.columnRslt_sub_dpt_nm2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dpt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_nm2);
		p.columnRslt_sub_dpt_cd3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dpt_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_cd3);
		p.columnRslt_sub_dpt_nm3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dpt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_nm3);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_ac_itm_grp_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_itm_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_itm_grp_cd);
		p.columnRslt_ac_itm_grp_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ac_itm_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_itm_grp_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_lot_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_slo_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_wrk_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.asst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_asst_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.asst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ_nm);
		p.columnRslt_repurc_obli_flg.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.repurc_obli_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_repurc_obli_flg);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_qty.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_qty);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_amt.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_inv_com_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.inv_com_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inv_com_cd);
		p.columnRslt_inv_com_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.inv_com_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inv_com_nm);
		p.columnRslt_area_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.area_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_area_cd);
		p.columnRslt_area_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.area_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_area_nm);
		p.columnRslt_cntry_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_cd);
		p.columnRslt_cntry_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_nm);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_src_alc_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.src_alc_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_alc_ac_cd);
		p.columnRslt_src_alc_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.src_alc_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_alc_ac_nm);
		p.columnRslt_alc_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.alc_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_cd);
		p.columnRslt_alc_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.alc_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_nm);
		p.columnRslt_expns_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.expns_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_cd);
		p.columnRslt_expns_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.expns_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_nm);
		p.columnRslt_trd_grp.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_grp_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_grp);
		p.columnRslt_trd_ac_itm_grp_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_ac_itm_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ac_itm_grp_cd);
		p.columnRslt_trd_ac_itm_grp_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_ac_itm_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ac_itm_grp_nm);
		p.columnRslt_trd_itm_jnl_cd.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_itm_jnl_cd);
		p.columnRslt_trd_itm_jnl_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_itm_jnl_nm);
		p.RsltTable.addTable(p.Rslt_trd_itm_p_PPanel.ItmTable);
		p.columnRslt_trd_lot_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_lot_no);
		p.columnRslt_trd_sublot_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_sublot_no);
		p.columnRslt_trd_sno1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_sno1);
		p.columnRslt_trd_sno2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_sno2);
		p.columnRslt_trd_sno3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_sno3);
		p.columnRslt_trd_sno4.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.trd_sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_sno4);
		p.columnRslt_jnl_key1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key1);
		p.columnRslt_jnl_key2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key2);
		p.columnRslt_jnl_key3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key3);
		p.columnRslt_jnl_key4.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key4);
		p.columnRslt_jnl_key5.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key5);
		p.columnRslt_jnl_key6.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key6);
		p.columnRslt_jnl_key7.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key7);
		p.columnRslt_jnl_key8.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key8);
		p.columnRslt_jnl_key9.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key9);
		p.columnRslt_jnl_key10.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_key10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key10);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_sub_char4.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char4);
		p.columnRslt_sub_char5.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char5);
		p.columnRslt_sub_char6.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char6);
		p.columnRslt_sub_char7.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char7);
		p.columnRslt_sub_char8.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char8);
		p.columnRslt_sub_char9.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char9);
		p.columnRslt_sub_char10.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_char10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char10);
		p.columnRslt_sub_num1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num1);
		p.columnRslt_sub_num2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num2);
		p.columnRslt_sub_num3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num3);
		p.columnRslt_sub_dt1.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dt1_META);
		p.columnRslt_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt1);
		p.columnRslt_sub_dt2.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dt2_META);
		p.columnRslt_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt2);
		p.columnRslt_sub_dt3.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.sub_dt3_META);
		p.columnRslt_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt3);
		p.columnRslt_jnl_fin_cnt.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.jnl_fin_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_fin_cnt);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBB.MBBBP0080.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_rsn_cd.getListConfig().setPutter(getCnd_ac_rsn_cd_ListPutter());
		Cnd_purc_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_dpt_cd.getListConfig().setPutter(getCnd_purc_dpt_cd_ListPutter());
		Cnd_ap_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_sls_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
		Cnd_ar_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ar_dpt_cd.getListConfig().setPutter(getCnd_ar_dpt_cd_ListPutter());
		Cnd_gi_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gi_dpt_cd.getListConfig().setPutter(getCnd_gi_dpt_cd_ListPutter());
		Cnd_gr_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_dpt_cd.getListConfig().setPutter(getCnd_gr_dpt_cd_ListPutter());
		Cnd_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bd_dpt_cd.getListConfig().setPutter(getCnd_bd_dpt_cd_ListPutter());
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
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
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
	 * [Cnd_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_gi_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_ac_rsn_cd) return getCnd_ac_rsn_cd(row, info);
		if(combo == Cnd_purc_dpt_cd) return getCnd_purc_dpt_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_ar_dpt_cd) return getCnd_ar_dpt_cd(row, info);
		if(combo == Cnd_gi_dpt_cd) return getCnd_gi_dpt_cd(row, info);
		if(combo == Cnd_gr_dpt_cd) return getCnd_gr_dpt_cd(row, info);
		if(combo == Cnd_bd_dpt_cd) return getCnd_bd_dpt_cd(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_ac_rsn_cd) return doCnd_ac_rsn_cd_VC(info);
		if (vc == Cnd_ac_rsn_nm) return doCnd_ac_rsn_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_purc_dpt_cd) return doCnd_purc_dpt_cd_VC(info);
		if (vc == Cnd_purc_dpt_nm) return doCnd_purc_dpt_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_ar_dpt_cd) return doCnd_ar_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_nm) return doCnd_ar_dpt_nm_VC(info);
		if (vc == Cnd_gi_dpt_cd) return doCnd_gi_dpt_cd_VC(info);
		if (vc == Cnd_gi_dpt_nm) return doCnd_gi_dpt_nm_VC(info);
		if (vc == Cnd_gr_dpt_cd) return doCnd_gr_dpt_cd_VC(info);
		if (vc == Cnd_gr_dpt_nm) return doCnd_gr_dpt_nm_VC(info);
		if (vc == Cnd_bd_dpt_cd) return doCnd_bd_dpt_cd_VC(info);
		if (vc == Cnd_bd_dpt_nm) return doCnd_bd_dpt_nm_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_calc_grp_cd) return doRslt_calc_grp_cd_VC(info);
		if (vc == columnRslt_calc_grp_nm) return doRslt_calc_grp_nm_VC(info);
		if (vc == columnRslt_calc_no) return doRslt_calc_no_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_ac_slip_typ) return doRslt_ac_slip_typ_VC(info);
		if (vc == columnRslt_ac_slip_typ_nm) return doRslt_ac_slip_typ_nm_VC(info);
		if (vc == columnRslt_ac_rsn_cd) return doRslt_ac_rsn_cd_VC(info);
		if (vc == columnRslt_ac_rsn_nm) return doRslt_ac_rsn_nm_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_nm) return doRslt_ar_dpt_nm_VC(info);
		if (vc == columnRslt_gi_dpt_cd) return doRslt_gi_dpt_cd_VC(info);
		if (vc == columnRslt_gi_dpt_nm) return doRslt_gi_dpt_nm_VC(info);
		if (vc == columnRslt_gr_dpt_cd) return doRslt_gr_dpt_cd_VC(info);
		if (vc == columnRslt_gr_dpt_nm) return doRslt_gr_dpt_nm_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_sub_dpt_cd1) return doRslt_sub_dpt_cd1_VC(info);
		if (vc == columnRslt_sub_dpt_nm1) return doRslt_sub_dpt_nm1_VC(info);
		if (vc == columnRslt_sub_dpt_cd2) return doRslt_sub_dpt_cd2_VC(info);
		if (vc == columnRslt_sub_dpt_nm2) return doRslt_sub_dpt_nm2_VC(info);
		if (vc == columnRslt_sub_dpt_cd3) return doRslt_sub_dpt_cd3_VC(info);
		if (vc == columnRslt_sub_dpt_nm3) return doRslt_sub_dpt_nm3_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_ac_itm_grp_cd) return doRslt_ac_itm_grp_cd_VC(info);
		if (vc == columnRslt_ac_itm_grp_nm) return doRslt_ac_itm_grp_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sno1) return doRslt_sno1_VC(info);
		if (vc == columnRslt_sno2) return doRslt_sno2_VC(info);
		if (vc == columnRslt_sno3) return doRslt_sno3_VC(info);
		if (vc == columnRslt_sno4) return doRslt_sno4_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == columnRslt_repurc_obli_flg) return doRslt_repurc_obli_flg_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_qty) return doRslt_base_unit_qty_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_amt) return doRslt_amt_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_inv_com_cd) return doRslt_inv_com_cd_VC(info);
		if (vc == columnRslt_inv_com_nm) return doRslt_inv_com_nm_VC(info);
		if (vc == columnRslt_area_cd) return doRslt_area_cd_VC(info);
		if (vc == columnRslt_area_nm) return doRslt_area_nm_VC(info);
		if (vc == columnRslt_cntry_cd) return doRslt_cntry_cd_VC(info);
		if (vc == columnRslt_cntry_nm) return doRslt_cntry_nm_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_src_alc_ac_cd) return doRslt_src_alc_ac_cd_VC(info);
		if (vc == columnRslt_src_alc_ac_nm) return doRslt_src_alc_ac_nm_VC(info);
		if (vc == columnRslt_alc_ac_cd) return doRslt_alc_ac_cd_VC(info);
		if (vc == columnRslt_alc_ac_nm) return doRslt_alc_ac_nm_VC(info);
		if (vc == columnRslt_expns_cd) return doRslt_expns_cd_VC(info);
		if (vc == columnRslt_expns_nm) return doRslt_expns_nm_VC(info);
		if (vc == columnRslt_trd_grp) return doRslt_trd_grp_VC(info);
		if (vc == columnRslt_trd_ac_itm_grp_cd) return doRslt_trd_ac_itm_grp_cd_VC(info);
		if (vc == columnRslt_trd_ac_itm_grp_nm) return doRslt_trd_ac_itm_grp_nm_VC(info);
		if (vc == columnRslt_trd_itm_jnl_cd) return doRslt_trd_itm_jnl_cd_VC(info);
		if (vc == columnRslt_trd_itm_jnl_nm) return doRslt_trd_itm_jnl_nm_VC(info);
		if (vc == columnRslt_trd_lot_no) return doRslt_trd_lot_no_VC(info);
		if (vc == columnRslt_trd_sublot_no) return doRslt_trd_sublot_no_VC(info);
		if (vc == columnRslt_trd_sno1) return doRslt_trd_sno1_VC(info);
		if (vc == columnRslt_trd_sno2) return doRslt_trd_sno2_VC(info);
		if (vc == columnRslt_trd_sno3) return doRslt_trd_sno3_VC(info);
		if (vc == columnRslt_trd_sno4) return doRslt_trd_sno4_VC(info);
		if (vc == columnRslt_jnl_key1) return doRslt_jnl_key1_VC(info);
		if (vc == columnRslt_jnl_key2) return doRslt_jnl_key2_VC(info);
		if (vc == columnRslt_jnl_key3) return doRslt_jnl_key3_VC(info);
		if (vc == columnRslt_jnl_key4) return doRslt_jnl_key4_VC(info);
		if (vc == columnRslt_jnl_key5) return doRslt_jnl_key5_VC(info);
		if (vc == columnRslt_jnl_key6) return doRslt_jnl_key6_VC(info);
		if (vc == columnRslt_jnl_key7) return doRslt_jnl_key7_VC(info);
		if (vc == columnRslt_jnl_key8) return doRslt_jnl_key8_VC(info);
		if (vc == columnRslt_jnl_key9) return doRslt_jnl_key9_VC(info);
		if (vc == columnRslt_jnl_key10) return doRslt_jnl_key10_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_sub_char4) return doRslt_sub_char4_VC(info);
		if (vc == columnRslt_sub_char5) return doRslt_sub_char5_VC(info);
		if (vc == columnRslt_sub_char6) return doRslt_sub_char6_VC(info);
		if (vc == columnRslt_sub_char7) return doRslt_sub_char7_VC(info);
		if (vc == columnRslt_sub_char8) return doRslt_sub_char8_VC(info);
		if (vc == columnRslt_sub_char9) return doRslt_sub_char9_VC(info);
		if (vc == columnRslt_sub_char10) return doRslt_sub_char10_VC(info);
		if (vc == columnRslt_sub_num1) return doRslt_sub_num1_VC(info);
		if (vc == columnRslt_sub_num2) return doRslt_sub_num2_VC(info);
		if (vc == columnRslt_sub_num3) return doRslt_sub_num3_VC(info);
		if (vc == columnRslt_sub_dt1) return doRslt_sub_dt1_VC(info);
		if (vc == columnRslt_sub_dt2) return doRslt_sub_dt2_VC(info);
		if (vc == columnRslt_sub_dt3) return doRslt_sub_dt3_VC(info);
		if (vc == columnRslt_jnl_fin_cnt) return doRslt_jnl_fin_cnt_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_nm3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_repurc_obli_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_com_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inv_com_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inv_com_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inv_com_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ac_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ac_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key10_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char10_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_fin_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_fin_cnt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NC(info);
		else if (nc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NC(info);
		else if (nc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NC(info);
		else if (nc == Cnd_gi_dpt_cd) doCnd_gi_dpt_cd_NC(info);
		else if (nc == Cnd_gi_dpt_nm) doCnd_gi_dpt_nm_NC(info);
		else if (nc == Cnd_gr_dpt_cd) doCnd_gr_dpt_cd_NC(info);
		else if (nc == Cnd_gr_dpt_nm) doCnd_gr_dpt_nm_NC(info);
		else if (nc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NC(info);
		else if (nc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NC(info);
		else if (nc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NC(info);
		else if (nc == columnRslt_calc_no) doRslt_calc_no_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NC(info);
		else if (nc == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NC(info);
		else if (nc == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NC(info);
		else if (nc == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NC(info);
		else if (nc == columnRslt_gi_dpt_cd) doRslt_gi_dpt_cd_NC(info);
		else if (nc == columnRslt_gi_dpt_nm) doRslt_gi_dpt_nm_NC(info);
		else if (nc == columnRslt_gr_dpt_cd) doRslt_gr_dpt_cd_NC(info);
		else if (nc == columnRslt_gr_dpt_nm) doRslt_gr_dpt_nm_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_NC(info);
		else if (nc == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_NC(info);
		else if (nc == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_NC(info);
		else if (nc == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_NC(info);
		else if (nc == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_NC(info);
		else if (nc == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_ac_itm_grp_cd) doRslt_ac_itm_grp_cd_NC(info);
		else if (nc == columnRslt_ac_itm_grp_nm) doRslt_ac_itm_grp_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sno1) doRslt_sno1_NC(info);
		else if (nc == columnRslt_sno2) doRslt_sno2_NC(info);
		else if (nc == columnRslt_sno3) doRslt_sno3_NC(info);
		else if (nc == columnRslt_sno4) doRslt_sno4_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_qty) doRslt_base_unit_qty_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_amt) doRslt_amt_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_inv_com_cd) doRslt_inv_com_cd_NC(info);
		else if (nc == columnRslt_inv_com_nm) doRslt_inv_com_nm_NC(info);
		else if (nc == columnRslt_area_cd) doRslt_area_cd_NC(info);
		else if (nc == columnRslt_area_nm) doRslt_area_nm_NC(info);
		else if (nc == columnRslt_cntry_cd) doRslt_cntry_cd_NC(info);
		else if (nc == columnRslt_cntry_nm) doRslt_cntry_nm_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_src_alc_ac_cd) doRslt_src_alc_ac_cd_NC(info);
		else if (nc == columnRslt_src_alc_ac_nm) doRslt_src_alc_ac_nm_NC(info);
		else if (nc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NC(info);
		else if (nc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NC(info);
		else if (nc == columnRslt_expns_cd) doRslt_expns_cd_NC(info);
		else if (nc == columnRslt_expns_nm) doRslt_expns_nm_NC(info);
		else if (nc == columnRslt_trd_grp) doRslt_trd_grp_NC(info);
		else if (nc == columnRslt_trd_ac_itm_grp_cd) doRslt_trd_ac_itm_grp_cd_NC(info);
		else if (nc == columnRslt_trd_ac_itm_grp_nm) doRslt_trd_ac_itm_grp_nm_NC(info);
		else if (nc == columnRslt_trd_itm_jnl_cd) doRslt_trd_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_trd_itm_jnl_nm) doRslt_trd_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_trd_lot_no) doRslt_trd_lot_no_NC(info);
		else if (nc == columnRslt_trd_sublot_no) doRslt_trd_sublot_no_NC(info);
		else if (nc == columnRslt_trd_sno1) doRslt_trd_sno1_NC(info);
		else if (nc == columnRslt_trd_sno2) doRslt_trd_sno2_NC(info);
		else if (nc == columnRslt_trd_sno3) doRslt_trd_sno3_NC(info);
		else if (nc == columnRslt_trd_sno4) doRslt_trd_sno4_NC(info);
		else if (nc == columnRslt_jnl_key1) doRslt_jnl_key1_NC(info);
		else if (nc == columnRslt_jnl_key2) doRslt_jnl_key2_NC(info);
		else if (nc == columnRslt_jnl_key3) doRslt_jnl_key3_NC(info);
		else if (nc == columnRslt_jnl_key4) doRslt_jnl_key4_NC(info);
		else if (nc == columnRslt_jnl_key5) doRslt_jnl_key5_NC(info);
		else if (nc == columnRslt_jnl_key6) doRslt_jnl_key6_NC(info);
		else if (nc == columnRslt_jnl_key7) doRslt_jnl_key7_NC(info);
		else if (nc == columnRslt_jnl_key8) doRslt_jnl_key8_NC(info);
		else if (nc == columnRslt_jnl_key9) doRslt_jnl_key9_NC(info);
		else if (nc == columnRslt_jnl_key10) doRslt_jnl_key10_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_sub_char4) doRslt_sub_char4_NC(info);
		else if (nc == columnRslt_sub_char5) doRslt_sub_char5_NC(info);
		else if (nc == columnRslt_sub_char6) doRslt_sub_char6_NC(info);
		else if (nc == columnRslt_sub_char7) doRslt_sub_char7_NC(info);
		else if (nc == columnRslt_sub_char8) doRslt_sub_char8_NC(info);
		else if (nc == columnRslt_sub_char9) doRslt_sub_char9_NC(info);
		else if (nc == columnRslt_sub_char10) doRslt_sub_char10_NC(info);
		else if (nc == columnRslt_sub_num1) doRslt_sub_num1_NC(info);
		else if (nc == columnRslt_sub_num2) doRslt_sub_num2_NC(info);
		else if (nc == columnRslt_sub_num3) doRslt_sub_num3_NC(info);
		else if (nc == columnRslt_sub_dt1) doRslt_sub_dt1_NC(info);
		else if (nc == columnRslt_sub_dt2) doRslt_sub_dt2_NC(info);
		else if (nc == columnRslt_sub_dt3) doRslt_sub_dt3_NC(info);
		else if (nc == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_com_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_com_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_fin_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
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
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NE(info);
		else if (ne == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NE(info);
		else if (ne == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NE(info);
		else if (ne == Cnd_gi_dpt_cd) doCnd_gi_dpt_cd_NE(info);
		else if (ne == Cnd_gi_dpt_nm) doCnd_gi_dpt_nm_NE(info);
		else if (ne == Cnd_gr_dpt_cd) doCnd_gr_dpt_cd_NE(info);
		else if (ne == Cnd_gr_dpt_nm) doCnd_gr_dpt_nm_NE(info);
		else if (ne == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NE(info);
		else if (ne == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NE(info);
		else if (ne == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NE(info);
		else if (ne == columnRslt_calc_no) doRslt_calc_no_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NE(info);
		else if (ne == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NE(info);
		else if (ne == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NE(info);
		else if (ne == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NE(info);
		else if (ne == columnRslt_gi_dpt_cd) doRslt_gi_dpt_cd_NE(info);
		else if (ne == columnRslt_gi_dpt_nm) doRslt_gi_dpt_nm_NE(info);
		else if (ne == columnRslt_gr_dpt_cd) doRslt_gr_dpt_cd_NE(info);
		else if (ne == columnRslt_gr_dpt_nm) doRslt_gr_dpt_nm_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_NE(info);
		else if (ne == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_NE(info);
		else if (ne == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_NE(info);
		else if (ne == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_NE(info);
		else if (ne == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_NE(info);
		else if (ne == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_ac_itm_grp_cd) doRslt_ac_itm_grp_cd_NE(info);
		else if (ne == columnRslt_ac_itm_grp_nm) doRslt_ac_itm_grp_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sno1) doRslt_sno1_NE(info);
		else if (ne == columnRslt_sno2) doRslt_sno2_NE(info);
		else if (ne == columnRslt_sno3) doRslt_sno3_NE(info);
		else if (ne == columnRslt_sno4) doRslt_sno4_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_qty) doRslt_base_unit_qty_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_amt) doRslt_amt_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_inv_com_cd) doRslt_inv_com_cd_NE(info);
		else if (ne == columnRslt_inv_com_nm) doRslt_inv_com_nm_NE(info);
		else if (ne == columnRslt_area_cd) doRslt_area_cd_NE(info);
		else if (ne == columnRslt_area_nm) doRslt_area_nm_NE(info);
		else if (ne == columnRslt_cntry_cd) doRslt_cntry_cd_NE(info);
		else if (ne == columnRslt_cntry_nm) doRslt_cntry_nm_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_src_alc_ac_cd) doRslt_src_alc_ac_cd_NE(info);
		else if (ne == columnRslt_src_alc_ac_nm) doRslt_src_alc_ac_nm_NE(info);
		else if (ne == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NE(info);
		else if (ne == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NE(info);
		else if (ne == columnRslt_expns_cd) doRslt_expns_cd_NE(info);
		else if (ne == columnRslt_expns_nm) doRslt_expns_nm_NE(info);
		else if (ne == columnRslt_trd_grp) doRslt_trd_grp_NE(info);
		else if (ne == columnRslt_trd_ac_itm_grp_cd) doRslt_trd_ac_itm_grp_cd_NE(info);
		else if (ne == columnRslt_trd_ac_itm_grp_nm) doRslt_trd_ac_itm_grp_nm_NE(info);
		else if (ne == columnRslt_trd_itm_jnl_cd) doRslt_trd_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_trd_itm_jnl_nm) doRslt_trd_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_trd_lot_no) doRslt_trd_lot_no_NE(info);
		else if (ne == columnRslt_trd_sublot_no) doRslt_trd_sublot_no_NE(info);
		else if (ne == columnRslt_trd_sno1) doRslt_trd_sno1_NE(info);
		else if (ne == columnRslt_trd_sno2) doRslt_trd_sno2_NE(info);
		else if (ne == columnRslt_trd_sno3) doRslt_trd_sno3_NE(info);
		else if (ne == columnRslt_trd_sno4) doRslt_trd_sno4_NE(info);
		else if (ne == columnRslt_jnl_key1) doRslt_jnl_key1_NE(info);
		else if (ne == columnRslt_jnl_key2) doRslt_jnl_key2_NE(info);
		else if (ne == columnRslt_jnl_key3) doRslt_jnl_key3_NE(info);
		else if (ne == columnRslt_jnl_key4) doRslt_jnl_key4_NE(info);
		else if (ne == columnRslt_jnl_key5) doRslt_jnl_key5_NE(info);
		else if (ne == columnRslt_jnl_key6) doRslt_jnl_key6_NE(info);
		else if (ne == columnRslt_jnl_key7) doRslt_jnl_key7_NE(info);
		else if (ne == columnRslt_jnl_key8) doRslt_jnl_key8_NE(info);
		else if (ne == columnRslt_jnl_key9) doRslt_jnl_key9_NE(info);
		else if (ne == columnRslt_jnl_key10) doRslt_jnl_key10_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_sub_char4) doRslt_sub_char4_NE(info);
		else if (ne == columnRslt_sub_char5) doRslt_sub_char5_NE(info);
		else if (ne == columnRslt_sub_char6) doRslt_sub_char6_NE(info);
		else if (ne == columnRslt_sub_char7) doRslt_sub_char7_NE(info);
		else if (ne == columnRslt_sub_char8) doRslt_sub_char8_NE(info);
		else if (ne == columnRslt_sub_char9) doRslt_sub_char9_NE(info);
		else if (ne == columnRslt_sub_char10) doRslt_sub_char10_NE(info);
		else if (ne == columnRslt_sub_num1) doRslt_sub_num1_NE(info);
		else if (ne == columnRslt_sub_num2) doRslt_sub_num2_NE(info);
		else if (ne == columnRslt_sub_num3) doRslt_sub_num3_NE(info);
		else if (ne == columnRslt_sub_dt1) doRslt_sub_dt1_NE(info);
		else if (ne == columnRslt_sub_dt2) doRslt_sub_dt2_NE(info);
		else if (ne == columnRslt_sub_dt3) doRslt_sub_dt3_NE(info);
		else if (ne == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_com_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_com_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_fin_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
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
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NX(info);
		else if (nx == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NX(info);
		else if (nx == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NX(info);
		else if (nx == Cnd_gi_dpt_cd) doCnd_gi_dpt_cd_NX(info);
		else if (nx == Cnd_gi_dpt_nm) doCnd_gi_dpt_nm_NX(info);
		else if (nx == Cnd_gr_dpt_cd) doCnd_gr_dpt_cd_NX(info);
		else if (nx == Cnd_gr_dpt_nm) doCnd_gr_dpt_nm_NX(info);
		else if (nx == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NX(info);
		else if (nx == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NX(info);
		else if (nx == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NX(info);
		else if (nx == columnRslt_calc_no) doRslt_calc_no_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NX(info);
		else if (nx == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NX(info);
		else if (nx == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NX(info);
		else if (nx == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NX(info);
		else if (nx == columnRslt_gi_dpt_cd) doRslt_gi_dpt_cd_NX(info);
		else if (nx == columnRslt_gi_dpt_nm) doRslt_gi_dpt_nm_NX(info);
		else if (nx == columnRslt_gr_dpt_cd) doRslt_gr_dpt_cd_NX(info);
		else if (nx == columnRslt_gr_dpt_nm) doRslt_gr_dpt_nm_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_NX(info);
		else if (nx == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_NX(info);
		else if (nx == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_NX(info);
		else if (nx == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_NX(info);
		else if (nx == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_NX(info);
		else if (nx == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_ac_itm_grp_cd) doRslt_ac_itm_grp_cd_NX(info);
		else if (nx == columnRslt_ac_itm_grp_nm) doRslt_ac_itm_grp_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sno1) doRslt_sno1_NX(info);
		else if (nx == columnRslt_sno2) doRslt_sno2_NX(info);
		else if (nx == columnRslt_sno3) doRslt_sno3_NX(info);
		else if (nx == columnRslt_sno4) doRslt_sno4_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_qty) doRslt_base_unit_qty_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_amt) doRslt_amt_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_inv_com_cd) doRslt_inv_com_cd_NX(info);
		else if (nx == columnRslt_inv_com_nm) doRslt_inv_com_nm_NX(info);
		else if (nx == columnRslt_area_cd) doRslt_area_cd_NX(info);
		else if (nx == columnRslt_area_nm) doRslt_area_nm_NX(info);
		else if (nx == columnRslt_cntry_cd) doRslt_cntry_cd_NX(info);
		else if (nx == columnRslt_cntry_nm) doRslt_cntry_nm_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_src_alc_ac_cd) doRslt_src_alc_ac_cd_NX(info);
		else if (nx == columnRslt_src_alc_ac_nm) doRslt_src_alc_ac_nm_NX(info);
		else if (nx == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NX(info);
		else if (nx == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NX(info);
		else if (nx == columnRslt_expns_cd) doRslt_expns_cd_NX(info);
		else if (nx == columnRslt_expns_nm) doRslt_expns_nm_NX(info);
		else if (nx == columnRslt_trd_grp) doRslt_trd_grp_NX(info);
		else if (nx == columnRslt_trd_ac_itm_grp_cd) doRslt_trd_ac_itm_grp_cd_NX(info);
		else if (nx == columnRslt_trd_ac_itm_grp_nm) doRslt_trd_ac_itm_grp_nm_NX(info);
		else if (nx == columnRslt_trd_itm_jnl_cd) doRslt_trd_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_trd_itm_jnl_nm) doRslt_trd_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_trd_lot_no) doRslt_trd_lot_no_NX(info);
		else if (nx == columnRslt_trd_sublot_no) doRslt_trd_sublot_no_NX(info);
		else if (nx == columnRslt_trd_sno1) doRslt_trd_sno1_NX(info);
		else if (nx == columnRslt_trd_sno2) doRslt_trd_sno2_NX(info);
		else if (nx == columnRslt_trd_sno3) doRslt_trd_sno3_NX(info);
		else if (nx == columnRslt_trd_sno4) doRslt_trd_sno4_NX(info);
		else if (nx == columnRslt_jnl_key1) doRslt_jnl_key1_NX(info);
		else if (nx == columnRslt_jnl_key2) doRslt_jnl_key2_NX(info);
		else if (nx == columnRslt_jnl_key3) doRslt_jnl_key3_NX(info);
		else if (nx == columnRslt_jnl_key4) doRslt_jnl_key4_NX(info);
		else if (nx == columnRslt_jnl_key5) doRslt_jnl_key5_NX(info);
		else if (nx == columnRslt_jnl_key6) doRslt_jnl_key6_NX(info);
		else if (nx == columnRslt_jnl_key7) doRslt_jnl_key7_NX(info);
		else if (nx == columnRslt_jnl_key8) doRslt_jnl_key8_NX(info);
		else if (nx == columnRslt_jnl_key9) doRslt_jnl_key9_NX(info);
		else if (nx == columnRslt_jnl_key10) doRslt_jnl_key10_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_sub_char4) doRslt_sub_char4_NX(info);
		else if (nx == columnRslt_sub_char5) doRslt_sub_char5_NX(info);
		else if (nx == columnRslt_sub_char6) doRslt_sub_char6_NX(info);
		else if (nx == columnRslt_sub_char7) doRslt_sub_char7_NX(info);
		else if (nx == columnRslt_sub_char8) doRslt_sub_char8_NX(info);
		else if (nx == columnRslt_sub_char9) doRslt_sub_char9_NX(info);
		else if (nx == columnRslt_sub_char10) doRslt_sub_char10_NX(info);
		else if (nx == columnRslt_sub_num1) doRslt_sub_num1_NX(info);
		else if (nx == columnRslt_sub_num2) doRslt_sub_num2_NX(info);
		else if (nx == columnRslt_sub_num3) doRslt_sub_num3_NX(info);
		else if (nx == columnRslt_sub_dt1) doRslt_sub_dt1_NX(info);
		else if (nx == columnRslt_sub_dt2) doRslt_sub_dt2_NX(info);
		else if (nx == columnRslt_sub_dt3) doRslt_sub_dt3_NX(info);
		else if (nx == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_com_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_com_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_fin_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
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
		if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_LC(info);
		else if (lc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_LC(info);
		else if (lc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_LC(info);
		else if (lc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_LC(info);
		else if (lc == Cnd_gi_dpt_cd) doCnd_gi_dpt_cd_LC(info);
		else if (lc == Cnd_gi_dpt_nm) doCnd_gi_dpt_nm_LC(info);
		else if (lc == Cnd_gr_dpt_cd) doCnd_gr_dpt_cd_LC(info);
		else if (lc == Cnd_gr_dpt_nm) doCnd_gr_dpt_nm_LC(info);
		else if (lc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_LC(info);
		else if (lc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_LC(info);
		else if (lc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_LC(info);
		else if (lc == columnRslt_calc_no) doRslt_calc_no_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_LC(info);
		else if (lc == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_LC(info);
		else if (lc == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_LC(info);
		else if (lc == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_LC(info);
		else if (lc == columnRslt_gi_dpt_cd) doRslt_gi_dpt_cd_LC(info);
		else if (lc == columnRslt_gi_dpt_nm) doRslt_gi_dpt_nm_LC(info);
		else if (lc == columnRslt_gr_dpt_cd) doRslt_gr_dpt_cd_LC(info);
		else if (lc == columnRslt_gr_dpt_nm) doRslt_gr_dpt_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_LC(info);
		else if (lc == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_LC(info);
		else if (lc == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_LC(info);
		else if (lc == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_LC(info);
		else if (lc == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_LC(info);
		else if (lc == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_ac_itm_grp_cd) doRslt_ac_itm_grp_cd_LC(info);
		else if (lc == columnRslt_ac_itm_grp_nm) doRslt_ac_itm_grp_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sno1) doRslt_sno1_LC(info);
		else if (lc == columnRslt_sno2) doRslt_sno2_LC(info);
		else if (lc == columnRslt_sno3) doRslt_sno3_LC(info);
		else if (lc == columnRslt_sno4) doRslt_sno4_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_qty) doRslt_base_unit_qty_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_amt) doRslt_amt_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_inv_com_cd) doRslt_inv_com_cd_LC(info);
		else if (lc == columnRslt_inv_com_nm) doRslt_inv_com_nm_LC(info);
		else if (lc == columnRslt_area_cd) doRslt_area_cd_LC(info);
		else if (lc == columnRslt_area_nm) doRslt_area_nm_LC(info);
		else if (lc == columnRslt_cntry_cd) doRslt_cntry_cd_LC(info);
		else if (lc == columnRslt_cntry_nm) doRslt_cntry_nm_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_src_alc_ac_cd) doRslt_src_alc_ac_cd_LC(info);
		else if (lc == columnRslt_src_alc_ac_nm) doRslt_src_alc_ac_nm_LC(info);
		else if (lc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_LC(info);
		else if (lc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_LC(info);
		else if (lc == columnRslt_expns_cd) doRslt_expns_cd_LC(info);
		else if (lc == columnRslt_expns_nm) doRslt_expns_nm_LC(info);
		else if (lc == columnRslt_trd_grp) doRslt_trd_grp_LC(info);
		else if (lc == columnRslt_trd_ac_itm_grp_cd) doRslt_trd_ac_itm_grp_cd_LC(info);
		else if (lc == columnRslt_trd_ac_itm_grp_nm) doRslt_trd_ac_itm_grp_nm_LC(info);
		else if (lc == columnRslt_trd_itm_jnl_cd) doRslt_trd_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_trd_itm_jnl_nm) doRslt_trd_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_trd_lot_no) doRslt_trd_lot_no_LC(info);
		else if (lc == columnRslt_trd_sublot_no) doRslt_trd_sublot_no_LC(info);
		else if (lc == columnRslt_trd_sno1) doRslt_trd_sno1_LC(info);
		else if (lc == columnRslt_trd_sno2) doRslt_trd_sno2_LC(info);
		else if (lc == columnRslt_trd_sno3) doRslt_trd_sno3_LC(info);
		else if (lc == columnRslt_trd_sno4) doRslt_trd_sno4_LC(info);
		else if (lc == columnRslt_jnl_key1) doRslt_jnl_key1_LC(info);
		else if (lc == columnRslt_jnl_key2) doRslt_jnl_key2_LC(info);
		else if (lc == columnRslt_jnl_key3) doRslt_jnl_key3_LC(info);
		else if (lc == columnRslt_jnl_key4) doRslt_jnl_key4_LC(info);
		else if (lc == columnRslt_jnl_key5) doRslt_jnl_key5_LC(info);
		else if (lc == columnRslt_jnl_key6) doRslt_jnl_key6_LC(info);
		else if (lc == columnRslt_jnl_key7) doRslt_jnl_key7_LC(info);
		else if (lc == columnRslt_jnl_key8) doRslt_jnl_key8_LC(info);
		else if (lc == columnRslt_jnl_key9) doRslt_jnl_key9_LC(info);
		else if (lc == columnRslt_jnl_key10) doRslt_jnl_key10_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_sub_char4) doRslt_sub_char4_LC(info);
		else if (lc == columnRslt_sub_char5) doRslt_sub_char5_LC(info);
		else if (lc == columnRslt_sub_char6) doRslt_sub_char6_LC(info);
		else if (lc == columnRslt_sub_char7) doRslt_sub_char7_LC(info);
		else if (lc == columnRslt_sub_char8) doRslt_sub_char8_LC(info);
		else if (lc == columnRslt_sub_char9) doRslt_sub_char9_LC(info);
		else if (lc == columnRslt_sub_char10) doRslt_sub_char10_LC(info);
		else if (lc == columnRslt_sub_num1) doRslt_sub_num1_LC(info);
		else if (lc == columnRslt_sub_num2) doRslt_sub_num2_LC(info);
		else if (lc == columnRslt_sub_num3) doRslt_sub_num3_LC(info);
		else if (lc == columnRslt_sub_dt1) doRslt_sub_dt1_LC(info);
		else if (lc == columnRslt_sub_dt2) doRslt_sub_dt2_LC(info);
		else if (lc == columnRslt_sub_dt3) doRslt_sub_dt3_LC(info);
		else if (lc == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_com_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_com_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_com_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_grp_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ac_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ac_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sub_char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_fin_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_slip_typ]の作成メソッド
	 */
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_gi_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_gr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0080.Srch01")) {
			return new MB_MBBBL0080_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0080_Srch01;

		/** コンストラクタ */
		protected MB_MBBBL0080_Srch01Bridge() {
			p_MB_MBBBL0080_Srch01 = new MCParam(PDef.MB_MBBBL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0080.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0080.RsltR.class));

			p_MB_MBBBL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0080_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0080.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0080.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0080.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0080.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0080.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0080_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0080.RsltR>)p_MB_MBBBL0080_Srch01.getContainerParam().getDownBlock(0));
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