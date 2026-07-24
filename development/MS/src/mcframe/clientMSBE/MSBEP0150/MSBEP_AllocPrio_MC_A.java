package mcframe.clientMSBE.MSBEP0150;

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
import mcframe.clientMSBE.MSBEP0150.MSBEP_AllocPrio_MC.MS_MSBEL0150_Srch01Caller;
import mcframe.clientMSBE.MSBEP0150.MSBEP_AllocPrio_MC.MS_MSBEL0150_Upd01Caller;
import mcframe.clientMSBE.MSBEP0150.MSBEP_AllocPrio_MC.MS_MSBEL0150_Sprt01Caller;

/**
 * 画面"MSBEP_AllocPrio"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_AllocPrio_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0150";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * CHNG,Change,0;REF,View,1 CHNG,変更する,0;REF,参照する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_CHNG = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Alloc]ブロック関連のField定義
	public MCPanel AllocPanel = null;
	// [Alloc]ブロックの項目のField定義
	// [AllocDtl]ブロック関連のField定義
	public MCPanel AllocDtlPanel = null;
	public MCTitledBorder AllocDtlTitledBorder = null;
	public MCScrollPane AllocDtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0150.AllocDtlR> AllocDtlTable = null;
	// [AllocDtl]ブロックの項目のField定義
	/**
	 * Late delivery 納期遅延.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_prms_delay_flg = null;
	/**
	 * GR split 入庫分割.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_split_flg = null;
	/**
	 * Original order 元順.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_pre_alloc_prio = null;
	/**
	 * Allocation sequence No. 引当順ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_alloc_prio = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D AllocDtl_itm_p_PPanel;
	public MCColumnConfig columnAllocDtl_itm_cd;// [AllocDtl]の[itm_p.itm_cd]を[columnAllocDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_itm_sub1;// [AllocDtl]の[itm_p.itm_sub1]を[columnAllocDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_itm_sub2;// [AllocDtl]の[itm_p.itm_sub2]を[columnAllocDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_itm_sub3;// [AllocDtl]の[itm_p.itm_sub3]を[columnAllocDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_itm_nm;// [AllocDtl]の[itm_p.itm_nm]を[columnAllocDtl_itm_nm]としてエイリアス定義。
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_trd_ptn_typ = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_slo_d_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_xfr_schd_no = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_iv_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_ship_schd_no = null;
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_alloc_typ = null;
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_alloc_typ_nm = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_pr_sts_typ_nm = null;
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_ship_schd_dt = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_ship_schd_hm = null;
	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_prms_dlv_dt = null;
	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_prms_dlv_hm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_cst_nm = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_cst_po_no = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_dlv_id_typ_nm = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_dlv_id_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D AllocDtl_sno_p_PPanel;
	public MCColumnConfig columnAllocDtl_sno1_null_flg;// [AllocDtl]の[sno_p.sno1_null_flg]を[columnAllocDtl_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno1;// [AllocDtl]の[sno_p.sno1]を[columnAllocDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno2_null_flg;// [AllocDtl]の[sno_p.sno2_null_flg]を[columnAllocDtl_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno2;// [AllocDtl]の[sno_p.sno2]を[columnAllocDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno3_null_flg;// [AllocDtl]の[sno_p.sno3_null_flg]を[columnAllocDtl_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno3;// [AllocDtl]の[sno_p.sno3]を[columnAllocDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno4_null_flg;// [AllocDtl]の[sno_p.sno4_null_flg]を[columnAllocDtl_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocDtl_sno4;// [AllocDtl]の[sno_p.sno4]を[columnAllocDtl_sno4]としてエイリアス定義。
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_loc_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_rqst_dpt_nm = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_base_unit_qty;// [AllocDtl]の[base_unit_qty_p.qty]を[columnAllocDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_alloc_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_alloc_qty;// [AllocDtl]の[alloc_qty_p.qty]を[columnAllocDtl_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_wait_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_wait_qty;// [AllocDtl]の[wait_qty_p.qty]を[columnAllocDtl_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_cml_wait_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_cml_wait_qty;// [AllocDtl]の[cml_wait_qty_p.qty]を[columnAllocDtl_cml_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_alloc_avl_qty;// [AllocDtl]の[alloc_avl_qty_p.qty]を[columnAllocDtl_alloc_avl_qty]としてエイリアス定義。
	/**
	 * GI available date 出庫可能日.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_avl_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_not_alloc_avail_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_not_alloc_avail_qty;// [AllocDtl]の[not_alloc_avail_qty_p.qty]を[columnAllocDtl_not_alloc_avail_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocDtl_cml_not_alloc_avail_qty_p_PPanel;
	public MCColumnConfig columnAllocDtl_cml_not_alloc_avail_qty;// [AllocDtl]の[cml_not_alloc_avail_qty_p.qty]を[columnAllocDtl_cml_not_alloc_avail_qty]としてエイリアス定義。
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_intr_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnAllocDtl_intr_d_rmrks = null;
	// [AllocBtn]ブロック関連のField定義
	public MCPanel AllocBtnPanel = null;
	// [AllocBtn]ブロックの項目のField定義
	// [AllocEx]ブロック関連のField定義
	public MCPanel AllocExPanel = null;
	// [AllocEx]ブロックの項目のField定義
	// [AllocExDtl]ブロック関連のField定義
	public MCPanel AllocExDtlPanel = null;
	public MCTitledBorder AllocExDtlTitledBorder = null;
	public MCScrollPane AllocExDtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0150.AllocDtlR> AllocExDtlTable = null;
	// [AllocExDtl]ブロックの項目のField定義
	/**
	 * Late delivery 納期遅延.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_prms_delay_flg = null;
	/**
	 * GR split 入庫分割.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_split_flg = null;
	/**
	 * Original order 元順.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_pre_alloc_prio = null;
	/**
	 * Allocation sequence No. 引当順ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_alloc_prio = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D AllocExDtl_itm_p_PPanel;
	public MCColumnConfig columnAllocExDtl_itm_cd;// [AllocExDtl]の[itm_p.itm_cd]を[columnAllocExDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_itm_sub1;// [AllocExDtl]の[itm_p.itm_sub1]を[columnAllocExDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_itm_sub2;// [AllocExDtl]の[itm_p.itm_sub2]を[columnAllocExDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_itm_sub3;// [AllocExDtl]の[itm_p.itm_sub3]を[columnAllocExDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_itm_nm;// [AllocExDtl]の[itm_p.itm_nm]を[columnAllocExDtl_itm_nm]としてエイリアス定義。
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_trd_ptn_typ = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_slo_d_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_xfr_schd_no = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_iv_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_ship_schd_no = null;
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_alloc_typ = null;
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_alloc_typ_nm = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_pr_sts_typ_nm = null;
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_ship_schd_dt = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_ship_schd_hm = null;
	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_prms_dlv_dt = null;
	/**
	 * Replied delivery time 回答納入時刻.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_prms_dlv_hm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_cst_nm = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_cst_po_no = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_dlv_id_typ_nm = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_dlv_id_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D AllocExDtl_sno_p_PPanel;
	public MCColumnConfig columnAllocExDtl_sno1_null_flg;// [AllocExDtl]の[sno_p.sno1_null_flg]を[columnAllocExDtl_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno1;// [AllocExDtl]の[sno_p.sno1]を[columnAllocExDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno2_null_flg;// [AllocExDtl]の[sno_p.sno2_null_flg]を[columnAllocExDtl_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno2;// [AllocExDtl]の[sno_p.sno2]を[columnAllocExDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno3_null_flg;// [AllocExDtl]の[sno_p.sno3_null_flg]を[columnAllocExDtl_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno3;// [AllocExDtl]の[sno_p.sno3]を[columnAllocExDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno4_null_flg;// [AllocExDtl]の[sno_p.sno4_null_flg]を[columnAllocExDtl_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnAllocExDtl_sno4;// [AllocExDtl]の[sno_p.sno4]を[columnAllocExDtl_sno4]としてエイリアス定義。
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_loc_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_rqst_dpt_nm = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_base_unit_qty;// [AllocExDtl]の[base_unit_qty_p.qty]を[columnAllocExDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_alloc_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_alloc_qty;// [AllocExDtl]の[alloc_qty_p.qty]を[columnAllocExDtl_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_wait_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_wait_qty;// [AllocExDtl]の[wait_qty_p.qty]を[columnAllocExDtl_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_cml_wait_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_cml_wait_qty;// [AllocExDtl]の[cml_wait_qty_p.qty]を[columnAllocExDtl_cml_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_alloc_avl_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_alloc_avl_qty;// [AllocExDtl]の[alloc_avl_qty_p.qty]を[columnAllocExDtl_alloc_avl_qty]としてエイリアス定義。
	/**
	 * GI available date 出庫可能日.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_avl_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_not_alloc_avail_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_not_alloc_avail_qty;// [AllocExDtl]の[not_alloc_avail_qty_p.qty]を[columnAllocExDtl_not_alloc_avail_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D AllocExDtl_cml_not_alloc_avail_qty_p_PPanel;
	public MCColumnConfig columnAllocExDtl_cml_not_alloc_avail_qty;// [AllocExDtl]の[cml_not_alloc_avail_qty_p.qty]を[columnAllocExDtl_cml_not_alloc_avail_qty]としてエイリアス定義。
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_intr_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnAllocExDtl_intr_d_rmrks = null;
	// [AllocExBtn]ブロック関連のField定義
	public MCPanel AllocExBtnPanel = null;
	// [AllocExBtn]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
	/**
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210_EX = null;
	/**
	 * Movement/transport schedule entry 移動・移送予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1000 = null;
	/**
	 * Movement/transport schedule entry 移動・移送予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1000_EX = null;
	/**
	 * Acquire allocatable qty. 引当可能数量取得.<p>
	 *
	 */
	public MCButton Btn_sprt = null;
	/**
	 * Move to top row 最上行へ移動.<p>
	 *
	 */
	public MCButton Btn_move_top = null;
	/**
	 * Move one row up 一つ上の行に移動.<p>
	 *
	 */
	public MCButton Btn_move_up = null;
	/**
	 * Move one row down 一つ下の行に移動.<p>
	 *
	 */
	public MCButton Btn_move_down = null;
	/**
	 * Move to bottom row 最下行へ移動.<p>
	 *
	 */
	public MCButton Btn_move_bottom = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH, REF};
	
	/** [MS_MSBEL0150_Srch01]のCallerの作成 */
	protected MSBEP_AllocPrio_MC.MS_MSBEL0150_Srch01Caller createMS_MSBEL0150_Srch01() {
		MSBEP_AllocPrio_MC.MS_MSBEL0150_Srch01Caller<MSBEP_AllocPrio, MS_MSBEL0150_Srch01Bridge>
		caller = ((MSBEP_AllocPrio_MC)this).new MS_MSBEL0150_Srch01Caller<MSBEP_AllocPrio, MS_MSBEL0150_Srch01Bridge>(
					(MSBEP_AllocPrio)this, new MS_MSBEL0150_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0150_Srch01]の呼び出し */
	protected void callMS_MSBEL0150_Srch01() {
		MCCaller caller = createMS_MSBEL0150_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL0150_Upd01]のCallerの作成 */
	protected MSBEP_AllocPrio_MC.MS_MSBEL0150_Upd01Caller createMS_MSBEL0150_Upd01() {
		MSBEP_AllocPrio_MC.MS_MSBEL0150_Upd01Caller<MSBEP_AllocPrio, MS_MSBEL0150_Upd01Bridge>
		caller = ((MSBEP_AllocPrio_MC)this).new MS_MSBEL0150_Upd01Caller<MSBEP_AllocPrio, MS_MSBEL0150_Upd01Bridge>(
					(MSBEP_AllocPrio)this, new MS_MSBEL0150_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL0150_Upd01]の呼び出し */
	protected void callMS_MSBEL0150_Upd01() {
		MCCaller caller = createMS_MSBEL0150_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL0150_Sprt01]のCallerの作成 */
	protected MSBEP_AllocPrio_MC.MS_MSBEL0150_Sprt01Caller createMS_MSBEL0150_Sprt01() {
		MSBEP_AllocPrio_MC.MS_MSBEL0150_Sprt01Caller<MSBEP_AllocPrio, MS_MSBEL0150_Sprt01Bridge>
		caller = ((MSBEP_AllocPrio_MC)this).new MS_MSBEL0150_Sprt01Caller<MSBEP_AllocPrio, MS_MSBEL0150_Sprt01Bridge>(
					(MSBEP_AllocPrio)this, new MS_MSBEL0150_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL0150_Sprt01]の呼び出し */
	protected void callMS_MSBEL0150_Sprt01() {
		MCCaller caller = createMS_MSBEL0150_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0150.CndR aCndR;
	/** [AllocDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> aAllocDtlL;
	/** [AllocExDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> aAllocExDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0150.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0150.CndR.create();
	}

	/**
	 * コピーによってaAllocDtlLを設定します。
	 *
	 * aAllocDtlLのインスタンスは変更されません。
	 *
	 * @param dataset AllocDtlL
	 */
	public void setAllocDtlL(MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> aList) {
		if (getAllocDtlL() != aList) {
			getAllocDtlL().setAll(aList);
		}
	}

	/**
	 * [AllocDtl]ブロックのコンテナaAllocDtlLを返します。
	 *
	 * @return AllocDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> getAllocDtlL() {
		return aAllocDtlL;
	}

	/**
	 * aAllocDtlRを作成します。
	 *
	 * @return AllocDtlR
	 */
	public mcframe.clientMSBE.MSBEP0150.AllocDtlR createAllocDtlR() {
		return mcframe.clientMSBE.MSBEP0150.AllocDtlR.create();
	}

	/**
	 * aAllocDtlLを作成します。
	 *
	 * @return AllocDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> createAllocDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class);
	}

	/**
	 * AllocDtlTableを初期化します。
	 */
	protected void createAllocDtlTable(){
		if(AllocDtlTable == null){
			AllocDtlTable = beansFactory.createTable2("AllocDtl.table");
		}
	}

	/**
	 * コピーによってaAllocExDtlLを設定します。
	 *
	 * aAllocExDtlLのインスタンスは変更されません。
	 *
	 * @param dataset AllocExDtlL
	 */
	public void setAllocExDtlL(MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> aList) {
		if (getAllocExDtlL() != aList) {
			getAllocExDtlL().setAll(aList);
		}
	}

	/**
	 * [AllocExDtl]ブロックのコンテナaAllocExDtlLを返します。
	 *
	 * @return AllocExDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> getAllocExDtlL() {
		return aAllocExDtlL;
	}

	/**
	 * aAllocExDtlRを作成します。
	 *
	 * @return AllocExDtlR
	 */
	public mcframe.clientMSBE.MSBEP0150.AllocDtlR createAllocExDtlR() {
		return mcframe.clientMSBE.MSBEP0150.AllocDtlR.create();
	}

	/**
	 * aAllocExDtlLを作成します。
	 *
	 * @return AllocExDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> createAllocExDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class);
	}

	/**
	 * AllocExDtlTableを初期化します。
	 */
	protected void createAllocExDtlTable(){
		if(AllocExDtlTable == null){
			AllocExDtlTable = beansFactory.createTable2("AllocExDtl.table");
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
		if(!MCCollectionUtil.contains(ret, getAllocDtlL())) ret.add(getAllocDtlL());
		if(!MCCollectionUtil.contains(ret, getAllocExDtlL())) ret.add(getAllocExDtlL());
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
		if(aCnt == getAllocDtlL()) return "AllocDtl";
		if(aCnt == getAllocExDtlL()) return "AllocExDtl";
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
		if(bId.equals("AllocDtl")) return getAllocDtlL();
		if(bId.equals("AllocExDtl")) return getAllocExDtlL();
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
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(AllocPanel);
		ret.add(AllocDtlPanel);
		ret.add(AllocBtnPanel);
		ret.add(AllocExPanel);
		ret.add(AllocExDtlPanel);
		ret.add(AllocExBtnPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AllocPrio_MC_A() {
		aCndR = createCndR();
		aAllocDtlL = createAllocDtlL();
		aAllocExDtlL = createAllocExDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_AllocPrio_MC_A(String name) {
		aCndR = createCndR();
		aAllocDtlL = createAllocDtlL();
		createAllocDtlTable();
		AllocDtlTable.setRowName(name);
		aAllocExDtlL = createAllocExDtlL();
		createAllocExDtlTable();
		AllocExDtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_AllocPrio_MC.jbCreateScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateTop((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateFold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateCnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateCtrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateAlloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateAllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateAllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateAllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateAllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateAllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbCreateBtn((MSBEP_AllocPrio)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_AllocPrio p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_AllocPrio p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_AllocPrio p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_AllocPrio p) {
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_AllocPrio p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Alloc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAlloc(MSBEP_AllocPrio p) {
	}

	/**
	 * [AllocDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocDtl(MSBEP_AllocPrio p) {
		p.AllocDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$itm_p);
		p.AllocDtl_itm_p_PPanel.setName("AllocDtl.itm_p");
		p.columnAllocDtl_itm_cd = p.AllocDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnAllocDtl_itm_cd.addAliasName("AllocDtl.itm_cd", p);
		p.columnAllocDtl_itm_sub1 = p.AllocDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnAllocDtl_itm_sub1.addAliasName("AllocDtl.itm_sub1", p);
		p.columnAllocDtl_itm_sub2 = p.AllocDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnAllocDtl_itm_sub2.addAliasName("AllocDtl.itm_sub2", p);
		p.columnAllocDtl_itm_sub3 = p.AllocDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnAllocDtl_itm_sub3.addAliasName("AllocDtl.itm_sub3", p);
		p.columnAllocDtl_itm_nm = p.AllocDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnAllocDtl_itm_nm.addAliasName("AllocDtl.itm_nm", p);
		p.AllocDtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$sno_p);
		p.AllocDtl_sno_p_PPanel.setName("AllocDtl.sno_p");
		p.columnAllocDtl_sno1_null_flg = p.AllocDtl_sno_p_PPanel.columnSno_sno1_null_flg;
		p.columnAllocDtl_sno1_null_flg.addAliasName("AllocDtl.sno1_null_flg", p);
		p.columnAllocDtl_sno1 = p.AllocDtl_sno_p_PPanel.columnSno_sno1;
		p.columnAllocDtl_sno1.addAliasName("AllocDtl.sno1", p);
		p.columnAllocDtl_sno2_null_flg = p.AllocDtl_sno_p_PPanel.columnSno_sno2_null_flg;
		p.columnAllocDtl_sno2_null_flg.addAliasName("AllocDtl.sno2_null_flg", p);
		p.columnAllocDtl_sno2 = p.AllocDtl_sno_p_PPanel.columnSno_sno2;
		p.columnAllocDtl_sno2.addAliasName("AllocDtl.sno2", p);
		p.columnAllocDtl_sno3_null_flg = p.AllocDtl_sno_p_PPanel.columnSno_sno3_null_flg;
		p.columnAllocDtl_sno3_null_flg.addAliasName("AllocDtl.sno3_null_flg", p);
		p.columnAllocDtl_sno3 = p.AllocDtl_sno_p_PPanel.columnSno_sno3;
		p.columnAllocDtl_sno3.addAliasName("AllocDtl.sno3", p);
		p.columnAllocDtl_sno4_null_flg = p.AllocDtl_sno_p_PPanel.columnSno_sno4_null_flg;
		p.columnAllocDtl_sno4_null_flg.addAliasName("AllocDtl.sno4_null_flg", p);
		p.columnAllocDtl_sno4 = p.AllocDtl_sno_p_PPanel.columnSno_sno4;
		p.columnAllocDtl_sno4.addAliasName("AllocDtl.sno4", p);
		p.AllocDtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$base_unit_qty_p);
		p.AllocDtl_base_unit_qty_p_PPanel.setName("AllocDtl.base_unit_qty_p");
		p.columnAllocDtl_base_unit_qty = p.AllocDtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_base_unit_qty.addAliasName("AllocDtl.base_unit_qty", p);
		p.AllocDtl_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$alloc_qty_p);
		p.AllocDtl_alloc_qty_p_PPanel.setName("AllocDtl.alloc_qty_p");
		p.columnAllocDtl_alloc_qty = p.AllocDtl_alloc_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_alloc_qty.addAliasName("AllocDtl.alloc_qty", p);
		p.AllocDtl_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$wait_qty_p);
		p.AllocDtl_wait_qty_p_PPanel.setName("AllocDtl.wait_qty_p");
		p.columnAllocDtl_wait_qty = p.AllocDtl_wait_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_wait_qty.addAliasName("AllocDtl.wait_qty", p);
		p.AllocDtl_cml_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$cml_wait_qty_p);
		p.AllocDtl_cml_wait_qty_p_PPanel.setName("AllocDtl.cml_wait_qty_p");
		p.columnAllocDtl_cml_wait_qty = p.AllocDtl_cml_wait_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_cml_wait_qty.addAliasName("AllocDtl.cml_wait_qty", p);
		p.AllocDtl_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$alloc_avl_qty_p);
		p.AllocDtl_alloc_avl_qty_p_PPanel.setName("AllocDtl.alloc_avl_qty_p");
		p.columnAllocDtl_alloc_avl_qty = p.AllocDtl_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_alloc_avl_qty.addAliasName("AllocDtl.alloc_avl_qty", p);
		p.AllocDtl_not_alloc_avail_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$not_alloc_avail_qty_p);
		p.AllocDtl_not_alloc_avail_qty_p_PPanel.setName("AllocDtl.not_alloc_avail_qty_p");
		p.columnAllocDtl_not_alloc_avail_qty = p.AllocDtl_not_alloc_avail_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_not_alloc_avail_qty.addAliasName("AllocDtl.not_alloc_avail_qty", p);
		p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$cml_not_alloc_avail_qty_p);
		p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.setName("AllocDtl.cml_not_alloc_avail_qty_p");
		p.columnAllocDtl_cml_not_alloc_avail_qty = p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.columnQty_qty;
		p.columnAllocDtl_cml_not_alloc_avail_qty.addAliasName("AllocDtl.cml_not_alloc_avail_qty", p);
	}

	/**
	 * [AllocBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocBtn(MSBEP_AllocPrio p) {
	}

	/**
	 * [AllocEx]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocEx(MSBEP_AllocPrio p) {
	}

	/**
	 * [AllocExDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocExDtl(MSBEP_AllocPrio p) {
		p.AllocExDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$itm_p);
		p.AllocExDtl_itm_p_PPanel.setName("AllocExDtl.itm_p");
		p.columnAllocExDtl_itm_cd = p.AllocExDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnAllocExDtl_itm_cd.addAliasName("AllocExDtl.itm_cd", p);
		p.columnAllocExDtl_itm_sub1 = p.AllocExDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnAllocExDtl_itm_sub1.addAliasName("AllocExDtl.itm_sub1", p);
		p.columnAllocExDtl_itm_sub2 = p.AllocExDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnAllocExDtl_itm_sub2.addAliasName("AllocExDtl.itm_sub2", p);
		p.columnAllocExDtl_itm_sub3 = p.AllocExDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnAllocExDtl_itm_sub3.addAliasName("AllocExDtl.itm_sub3", p);
		p.columnAllocExDtl_itm_nm = p.AllocExDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnAllocExDtl_itm_nm.addAliasName("AllocExDtl.itm_nm", p);
		p.AllocExDtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$sno_p);
		p.AllocExDtl_sno_p_PPanel.setName("AllocExDtl.sno_p");
		p.columnAllocExDtl_sno1_null_flg = p.AllocExDtl_sno_p_PPanel.columnSno_sno1_null_flg;
		p.columnAllocExDtl_sno1_null_flg.addAliasName("AllocExDtl.sno1_null_flg", p);
		p.columnAllocExDtl_sno1 = p.AllocExDtl_sno_p_PPanel.columnSno_sno1;
		p.columnAllocExDtl_sno1.addAliasName("AllocExDtl.sno1", p);
		p.columnAllocExDtl_sno2_null_flg = p.AllocExDtl_sno_p_PPanel.columnSno_sno2_null_flg;
		p.columnAllocExDtl_sno2_null_flg.addAliasName("AllocExDtl.sno2_null_flg", p);
		p.columnAllocExDtl_sno2 = p.AllocExDtl_sno_p_PPanel.columnSno_sno2;
		p.columnAllocExDtl_sno2.addAliasName("AllocExDtl.sno2", p);
		p.columnAllocExDtl_sno3_null_flg = p.AllocExDtl_sno_p_PPanel.columnSno_sno3_null_flg;
		p.columnAllocExDtl_sno3_null_flg.addAliasName("AllocExDtl.sno3_null_flg", p);
		p.columnAllocExDtl_sno3 = p.AllocExDtl_sno_p_PPanel.columnSno_sno3;
		p.columnAllocExDtl_sno3.addAliasName("AllocExDtl.sno3", p);
		p.columnAllocExDtl_sno4_null_flg = p.AllocExDtl_sno_p_PPanel.columnSno_sno4_null_flg;
		p.columnAllocExDtl_sno4_null_flg.addAliasName("AllocExDtl.sno4_null_flg", p);
		p.columnAllocExDtl_sno4 = p.AllocExDtl_sno_p_PPanel.columnSno_sno4;
		p.columnAllocExDtl_sno4.addAliasName("AllocExDtl.sno4", p);
		p.AllocExDtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$base_unit_qty_p);
		p.AllocExDtl_base_unit_qty_p_PPanel.setName("AllocExDtl.base_unit_qty_p");
		p.columnAllocExDtl_base_unit_qty = p.AllocExDtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_base_unit_qty.addAliasName("AllocExDtl.base_unit_qty", p);
		p.AllocExDtl_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$alloc_qty_p);
		p.AllocExDtl_alloc_qty_p_PPanel.setName("AllocExDtl.alloc_qty_p");
		p.columnAllocExDtl_alloc_qty = p.AllocExDtl_alloc_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_alloc_qty.addAliasName("AllocExDtl.alloc_qty", p);
		p.AllocExDtl_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$wait_qty_p);
		p.AllocExDtl_wait_qty_p_PPanel.setName("AllocExDtl.wait_qty_p");
		p.columnAllocExDtl_wait_qty = p.AllocExDtl_wait_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_wait_qty.addAliasName("AllocExDtl.wait_qty", p);
		p.AllocExDtl_cml_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$cml_wait_qty_p);
		p.AllocExDtl_cml_wait_qty_p_PPanel.setName("AllocExDtl.cml_wait_qty_p");
		p.columnAllocExDtl_cml_wait_qty = p.AllocExDtl_cml_wait_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_cml_wait_qty.addAliasName("AllocExDtl.cml_wait_qty", p);
		p.AllocExDtl_alloc_avl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$alloc_avl_qty_p);
		p.AllocExDtl_alloc_avl_qty_p_PPanel.setName("AllocExDtl.alloc_avl_qty_p");
		p.columnAllocExDtl_alloc_avl_qty = p.AllocExDtl_alloc_avl_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_alloc_avl_qty.addAliasName("AllocExDtl.alloc_avl_qty", p);
		p.AllocExDtl_not_alloc_avail_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$not_alloc_avail_qty_p);
		p.AllocExDtl_not_alloc_avail_qty_p_PPanel.setName("AllocExDtl.not_alloc_avail_qty_p");
		p.columnAllocExDtl_not_alloc_avail_qty = p.AllocExDtl_not_alloc_avail_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_not_alloc_avail_qty.addAliasName("AllocExDtl.not_alloc_avail_qty", p);
		p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.$cml_not_alloc_avail_qty_p);
		p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.setName("AllocExDtl.cml_not_alloc_avail_qty_p");
		p.columnAllocExDtl_cml_not_alloc_avail_qty = p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.columnQty_qty;
		p.columnAllocExDtl_cml_not_alloc_avail_qty.addAliasName("AllocExDtl.cml_not_alloc_avail_qty", p);
	}

	/**
	 * [AllocExBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocExBtn(MSBEP_AllocPrio p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_AllocPrio p) {
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AllocPrio create(){
		MSBEP_AllocPrio p = new MSBEP_AllocPrio();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AllocPrio create(String name){
		MSBEP_AllocPrio p = new MSBEP_AllocPrio(name);
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
		MSBEP_AllocPrio_MC.jbfInitScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitTop((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitFold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitCnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitCtrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitAlloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitAllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitAllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitAllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitAllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitAllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbfInitBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitTop((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitFold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitCnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitCtrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitAlloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitAllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitAllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitAllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitAllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitAllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.jbInitBtn((MSBEP_AllocPrio)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_CHNG = p.beansFactory.createRadioButton("Cnd.ope_CHNG");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Alloc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAlloc(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocPanel = p.beansFactory.createPanel("Alloc");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocDtl(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocDtlPanel = p.beansFactory.createPanel("AllocDtl");
		p.AllocDtlTitledBorder = p.beansFactory.createTitledBorder();
		p.AllocDtlScrollPane = p.beansFactory.createScrollPane("AllocDtl.scroll");
		p.createAllocDtlTable();
		// ブロックの項目の初期化
		p.columnAllocDtl_prms_delay_flg = p.beansFactory.createTableColumn("AllocDtl.prms_delay_flg", MCColumnType.CHECK);
		p.columnAllocDtl_split_flg = p.beansFactory.createTableColumn("AllocDtl.split_flg", MCColumnType.CHECK);
		p.columnAllocDtl_pre_alloc_prio = p.beansFactory.createTableColumn("AllocDtl.pre_alloc_prio", MCColumnType.TEXT);
		p.columnAllocDtl_alloc_prio = p.beansFactory.createTableColumn("AllocDtl.alloc_prio", MCColumnType.TEXT);
		p.columnAllocDtl_trd_cd = p.beansFactory.createTableColumn("AllocDtl.trd_cd", MCColumnType.TEXT);
		p.columnAllocDtl_trd_nm = p.beansFactory.createTableColumn("AllocDtl.trd_nm", MCColumnType.TEXT);
		p.columnAllocDtl_trd_ptn_typ = p.beansFactory.createTableColumn("AllocDtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnAllocDtl_slo_no = p.beansFactory.createTableColumn("AllocDtl.slo_no", MCColumnType.TEXT);
		p.columnAllocDtl_slo_d_no = p.beansFactory.createTableColumn("AllocDtl.slo_d_no", MCColumnType.TEXT);
		p.columnAllocDtl_xfr_schd_no = p.beansFactory.createTableColumn("AllocDtl.xfr_schd_no", MCColumnType.TEXT);
		p.columnAllocDtl_iv_no = p.beansFactory.createTableColumn("AllocDtl.iv_no", MCColumnType.TEXT);
		p.columnAllocDtl_ship_schd_no = p.beansFactory.createTableColumn("AllocDtl.ship_schd_no", MCColumnType.TEXT);
		p.columnAllocDtl_alloc_typ = p.beansFactory.createTableColumn("AllocDtl.alloc_typ", MCColumnType.TEXT);
		p.columnAllocDtl_alloc_typ_nm = p.beansFactory.createTableColumn("AllocDtl.alloc_typ_nm", MCColumnType.TEXT);
		p.columnAllocDtl_pr_sts_typ = p.beansFactory.createTableColumn("AllocDtl.pr_sts_typ", MCColumnType.TEXT);
		p.columnAllocDtl_pr_sts_typ_nm = p.beansFactory.createTableColumn("AllocDtl.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnAllocDtl_ship_schd_dt = p.beansFactory.createTableColumn("AllocDtl.ship_schd_dt", MCColumnType.DATE);
		p.columnAllocDtl_ship_schd_hm = p.beansFactory.createTableColumn("AllocDtl.ship_schd_hm", MCColumnType.DATE);
		p.columnAllocDtl_prms_dlv_dt = p.beansFactory.createTableColumn("AllocDtl.prms_dlv_dt", MCColumnType.DATE);
		p.columnAllocDtl_prms_dlv_hm = p.beansFactory.createTableColumn("AllocDtl.prms_dlv_hm", MCColumnType.DATE);
		p.columnAllocDtl_cst_cd = p.beansFactory.createTableColumn("AllocDtl.cst_cd", MCColumnType.TEXT);
		p.columnAllocDtl_cst_nm = p.beansFactory.createTableColumn("AllocDtl.cst_nm", MCColumnType.TEXT);
		p.columnAllocDtl_cst_po_no = p.beansFactory.createTableColumn("AllocDtl.cst_po_no", MCColumnType.TEXT);
		p.columnAllocDtl_dlv_id_typ = p.beansFactory.createTableColumn("AllocDtl.dlv_id_typ", MCColumnType.TEXT);
		p.columnAllocDtl_dlv_id_typ_nm = p.beansFactory.createTableColumn("AllocDtl.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnAllocDtl_dlv_id_cd = p.beansFactory.createTableColumn("AllocDtl.dlv_id_cd", MCColumnType.TEXT);
		p.columnAllocDtl_dlv_id_nm = p.beansFactory.createTableColumn("AllocDtl.dlv_id_nm", MCColumnType.TEXT);
		p.columnAllocDtl_loc_cd = p.beansFactory.createTableColumn("AllocDtl.loc_cd", MCColumnType.TEXT);
		p.columnAllocDtl_loc_nm = p.beansFactory.createTableColumn("AllocDtl.loc_nm", MCColumnType.TEXT);
		p.columnAllocDtl_rqst_dpt_cd = p.beansFactory.createTableColumn("AllocDtl.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnAllocDtl_rqst_dpt_nm = p.beansFactory.createTableColumn("AllocDtl.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnAllocDtl_base_unit_cd = p.beansFactory.createTableColumn("AllocDtl.base_unit_cd", MCColumnType.TEXT);
		p.columnAllocDtl_base_unit_nm = p.beansFactory.createTableColumn("AllocDtl.base_unit_nm", MCColumnType.TEXT);
		p.columnAllocDtl_base_unit_dec_place = p.beansFactory.createTableColumn("AllocDtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnAllocDtl_avl_schd_dt = p.beansFactory.createTableColumn("AllocDtl.avl_schd_dt", MCColumnType.DATE);
		p.columnAllocDtl_intr_rmrks = p.beansFactory.createTableColumn("AllocDtl.intr_rmrks", MCColumnType.TEXT);
		p.columnAllocDtl_intr_d_rmrks = p.beansFactory.createTableColumn("AllocDtl.intr_d_rmrks", MCColumnType.TEXT);
	}

	/**
	 * [AllocBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocBtn(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocBtnPanel = p.beansFactory.createPanel("AllocBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocEx]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocEx(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocExPanel = p.beansFactory.createPanel("AllocEx");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocExDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocExDtl(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocExDtlPanel = p.beansFactory.createPanel("AllocExDtl");
		p.AllocExDtlTitledBorder = p.beansFactory.createTitledBorder();
		p.AllocExDtlScrollPane = p.beansFactory.createScrollPane("AllocExDtl.scroll");
		p.createAllocExDtlTable();
		// ブロックの項目の初期化
		p.columnAllocExDtl_prms_delay_flg = p.beansFactory.createTableColumn("AllocExDtl.prms_delay_flg", MCColumnType.CHECK);
		p.columnAllocExDtl_split_flg = p.beansFactory.createTableColumn("AllocExDtl.split_flg", MCColumnType.CHECK);
		p.columnAllocExDtl_pre_alloc_prio = p.beansFactory.createTableColumn("AllocExDtl.pre_alloc_prio", MCColumnType.TEXT);
		p.columnAllocExDtl_alloc_prio = p.beansFactory.createTableColumn("AllocExDtl.alloc_prio", MCColumnType.TEXT);
		p.columnAllocExDtl_trd_cd = p.beansFactory.createTableColumn("AllocExDtl.trd_cd", MCColumnType.TEXT);
		p.columnAllocExDtl_trd_nm = p.beansFactory.createTableColumn("AllocExDtl.trd_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_trd_ptn_typ = p.beansFactory.createTableColumn("AllocExDtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnAllocExDtl_slo_no = p.beansFactory.createTableColumn("AllocExDtl.slo_no", MCColumnType.TEXT);
		p.columnAllocExDtl_slo_d_no = p.beansFactory.createTableColumn("AllocExDtl.slo_d_no", MCColumnType.TEXT);
		p.columnAllocExDtl_xfr_schd_no = p.beansFactory.createTableColumn("AllocExDtl.xfr_schd_no", MCColumnType.TEXT);
		p.columnAllocExDtl_iv_no = p.beansFactory.createTableColumn("AllocExDtl.iv_no", MCColumnType.TEXT);
		p.columnAllocExDtl_ship_schd_no = p.beansFactory.createTableColumn("AllocExDtl.ship_schd_no", MCColumnType.TEXT);
		p.columnAllocExDtl_alloc_typ = p.beansFactory.createTableColumn("AllocExDtl.alloc_typ", MCColumnType.TEXT);
		p.columnAllocExDtl_alloc_typ_nm = p.beansFactory.createTableColumn("AllocExDtl.alloc_typ_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_pr_sts_typ = p.beansFactory.createTableColumn("AllocExDtl.pr_sts_typ", MCColumnType.TEXT);
		p.columnAllocExDtl_pr_sts_typ_nm = p.beansFactory.createTableColumn("AllocExDtl.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_ship_schd_dt = p.beansFactory.createTableColumn("AllocExDtl.ship_schd_dt", MCColumnType.DATE);
		p.columnAllocExDtl_ship_schd_hm = p.beansFactory.createTableColumn("AllocExDtl.ship_schd_hm", MCColumnType.DATE);
		p.columnAllocExDtl_prms_dlv_dt = p.beansFactory.createTableColumn("AllocExDtl.prms_dlv_dt", MCColumnType.DATE);
		p.columnAllocExDtl_prms_dlv_hm = p.beansFactory.createTableColumn("AllocExDtl.prms_dlv_hm", MCColumnType.DATE);
		p.columnAllocExDtl_cst_cd = p.beansFactory.createTableColumn("AllocExDtl.cst_cd", MCColumnType.TEXT);
		p.columnAllocExDtl_cst_nm = p.beansFactory.createTableColumn("AllocExDtl.cst_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_cst_po_no = p.beansFactory.createTableColumn("AllocExDtl.cst_po_no", MCColumnType.TEXT);
		p.columnAllocExDtl_dlv_id_typ = p.beansFactory.createTableColumn("AllocExDtl.dlv_id_typ", MCColumnType.TEXT);
		p.columnAllocExDtl_dlv_id_typ_nm = p.beansFactory.createTableColumn("AllocExDtl.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_dlv_id_cd = p.beansFactory.createTableColumn("AllocExDtl.dlv_id_cd", MCColumnType.TEXT);
		p.columnAllocExDtl_dlv_id_nm = p.beansFactory.createTableColumn("AllocExDtl.dlv_id_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_loc_cd = p.beansFactory.createTableColumn("AllocExDtl.loc_cd", MCColumnType.TEXT);
		p.columnAllocExDtl_loc_nm = p.beansFactory.createTableColumn("AllocExDtl.loc_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_rqst_dpt_cd = p.beansFactory.createTableColumn("AllocExDtl.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnAllocExDtl_rqst_dpt_nm = p.beansFactory.createTableColumn("AllocExDtl.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_base_unit_cd = p.beansFactory.createTableColumn("AllocExDtl.base_unit_cd", MCColumnType.TEXT);
		p.columnAllocExDtl_base_unit_nm = p.beansFactory.createTableColumn("AllocExDtl.base_unit_nm", MCColumnType.TEXT);
		p.columnAllocExDtl_base_unit_dec_place = p.beansFactory.createTableColumn("AllocExDtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnAllocExDtl_avl_schd_dt = p.beansFactory.createTableColumn("AllocExDtl.avl_schd_dt", MCColumnType.DATE);
		p.columnAllocExDtl_intr_rmrks = p.beansFactory.createTableColumn("AllocExDtl.intr_rmrks", MCColumnType.TEXT);
		p.columnAllocExDtl_intr_d_rmrks = p.beansFactory.createTableColumn("AllocExDtl.intr_d_rmrks", MCColumnType.TEXT);
	}

	/**
	 * [AllocExBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocExBtn(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocExBtnPanel = p.beansFactory.createPanel("AllocExBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
		p.Btn_open_MSBBP1210_EX = p.beansFactory.createButton("Btn.open_MSBBP1210_EX", "open");
		p.Btn_open_MSBEP1000 = p.beansFactory.createButton("Btn.open_MSBEP1000", "open");
		p.Btn_open_MSBEP1000_EX = p.beansFactory.createButton("Btn.open_MSBEP1000_EX", "open");
		p.Btn_sprt = p.beansFactory.createButton("Btn.sprt", "calc");
		p.Btn_move_top = p.beansFactory.createButton("Btn.move_top", "no_border");
		p.Btn_move_up = p.beansFactory.createButton("Btn.move_up", "no_border");
		p.Btn_move_down = p.beansFactory.createButton("Btn.move_down", "no_border");
		p.Btn_move_bottom = p.beansFactory.createButton("Btn.move_bottom", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_AllocPrio p) {
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
	protected static void jbInitTop(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.AllocPanel);
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
	protected static void jbInitFold(MSBEP_AllocPrio p) {
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
	protected static void jbInitCnd(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_CHNG);
		p.Cnd_ope_CHNG.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_CHNG);
		p.ScreenOpePanel.add(p.Cnd_ope_CHNG);
		p.Cnd_ope_CHNG.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0150.CndR.ope_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0150.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0150.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.STRICT);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0150.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0150.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, false);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, false);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, false);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, false);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Alloc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAlloc(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.add(p.AllocPanel);
		p.AllocPanel.setNextBeans(p.AllocExPanel);
		p.AllocPanel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.AllocPanel.add(p.AllocDtlPanel, null);
		p.AllocPanel.setLastBeans(p.AllocDtlPanel);
		p.AllocDtlPanel.setNextBeans(p.AllocBtnPanel);
		p.AllocPanel.add(p.AllocBtnPanel, null);
	}

	/**
	 * [AllocDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocDtl(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocDtlPanel.setBorder(p.AllocDtlTitledBorder);
		p.AllocDtlPanel.add(p.AllocDtlScrollPane);
		p.AllocDtlPanel.setLastBeans(p.AllocDtlTable);
		p.AllocDtlScrollPane.setViewportView(p.AllocDtlTable);
		p.AllocDtlTable.setList(p.getAllocDtlL());
		p.AllocDtlTable.setStatusColumnVisible(false);
		p.AllocDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocBtn(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocEx]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocEx(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.add(p.AllocExPanel);
		p.AllocExPanel.setNextBeans(p.BtnPanel);
		p.AllocExPanel.setLayoutPosition("CBCBC+");
		// ブロックの項目の初期化
		p.AllocExPanel.add(p.AllocExDtlPanel, null);
		p.AllocExPanel.setLastBeans(p.AllocExDtlPanel);
		p.AllocExDtlPanel.setNextBeans(p.AllocExBtnPanel);
		p.AllocExPanel.add(p.AllocExBtnPanel, null);
	}

	/**
	 * [AllocExDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocExDtl(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocExDtlPanel.setBorder(p.AllocExDtlTitledBorder);
		p.AllocExDtlPanel.add(p.AllocExDtlScrollPane);
		p.AllocExDtlPanel.setLastBeans(p.AllocExDtlTable);
		p.AllocExDtlScrollPane.setViewportView(p.AllocExDtlTable);
		p.AllocExDtlTable.setList(p.getAllocExDtlL());
		p.AllocExDtlTable.setStatusColumnVisible(false);
		p.AllocExDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocExBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocExBtn(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.AllocExBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_AllocPrio p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F3);
		p.AllocBtnPanel.setLastBeans(p.Btn_open_MSBBP1210);
		p.AllocBtnPanel.add(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setNextBeans(p.Btn_open_MSBEP1000);
		p.Btn_open_MSBBP1210_EX.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBBP1210_EX);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1210_EX);
		p.Btn_open_MSBBP1210_EX.setNextBeans(p.Btn_open_MSBEP1000_EX);
		p.Btn_open_MSBEP1000.setFunctionKey(MCFunctionKey.F4);
		p.AllocBtnPanel.add(p.Btn_open_MSBEP1000);
		p.Btn_open_MSBEP1000.setNextBeans(p.Btn_sprt);
		p.Btn_open_MSBEP1000_EX.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBEP1000_EX);
		p.Btn_sprt.setFunctionKey(MCFunctionKey.F5);
		p.AllocBtnPanel.add(p.Btn_sprt);
		p.Btn_sprt.setNextBeans(p.Btn_move_top);
		p.Btn_move_top.setIcon("MOVE_TOP");
		p.Btn_move_top.setFunctionKey(MCFunctionKey.F18);
		p.AllocBtnPanel.add(p.Btn_move_top);
		p.Btn_move_top.setNextBeans(p.Btn_move_up);
		p.Btn_move_up.setIcon("MOVE_UP");
		p.Btn_move_up.setFunctionKey(MCFunctionKey.F19);
		p.AllocBtnPanel.add(p.Btn_move_up);
		p.Btn_move_up.setNextBeans(p.Btn_move_down);
		p.Btn_move_down.setIcon("MOVE_DOWN");
		p.Btn_move_down.setFunctionKey(MCFunctionKey.F20);
		p.AllocBtnPanel.add(p.Btn_move_down);
		p.Btn_move_down.setNextBeans(p.Btn_move_bottom);
		p.Btn_move_bottom.setIcon("MOVE_BOTTOM");
		p.Btn_move_bottom.setFunctionKey(MCFunctionKey.F21);
		p.AllocBtnPanel.add(p.Btn_move_bottom);
		p.Btn_move_bottom.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.AllocBtnPanel.add(p.Btn_upd);
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
		MSBEP_AllocPrio_MC.mcInitScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitTop((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitFold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitCnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitCtrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitAlloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitAllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitAllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitAllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitAllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitAllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.mcInitBtn((MSBEP_AllocPrio)this);

		// [UPD]ステータスのモードの設定
		MSBEP_AllocPrio_MC.statusInitUPD_ScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_Top((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_Fold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_Cnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_Ctrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_Alloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_AllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_AllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_AllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_AllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_AllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitUPD_Btn((MSBEP_AllocPrio)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_AllocPrio_MC.statusInitFIX__U_ScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_Top((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_Fold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_Cnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_Ctrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_Alloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_AllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_AllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_AllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_AllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_AllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitFIX__U_Btn((MSBEP_AllocPrio)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_AllocPrio_MC.statusInitSRCH_ScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_Top((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_Fold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_Cnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_Ctrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_Alloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_AllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_AllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_AllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_AllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_AllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitSRCH_Btn((MSBEP_AllocPrio)this);

		// [REF]ステータスのモードの設定
		MSBEP_AllocPrio_MC.statusInitREF_ScreenOpe((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_Top((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_Fold((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_Cnd((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_Ctrl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_Alloc((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_AllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_AllocBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_AllocEx((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_AllocExDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_AllocExBtn((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.statusInitREF_Btn((MSBEP_AllocPrio)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_AllocPrio p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_AllocPrio p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_AllocPrio p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_AllocPrio p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_CHNG.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_AllocPrio p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Alloc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAlloc(MSBEP_AllocPrio p) {
	}

	/**
	 *  [AllocDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocDtl(MSBEP_AllocPrio p) {
		p.AllocDtlTable.addAllListener(p);
		p.columnAllocDtl_prms_delay_flg.addAllListener(p);
		p.columnAllocDtl_split_flg.addAllListener(p);
		p.columnAllocDtl_pre_alloc_prio.addAllListener(p);
		p.columnAllocDtl_pre_alloc_prio.setListListener(p);
		p.columnAllocDtl_alloc_prio.addAllListener(p);
		p.columnAllocDtl_alloc_prio.setListListener(p);
		p.columnAllocDtl_trd_cd.addAllListener(p);
		p.columnAllocDtl_trd_cd.setListListener(p);
		p.columnAllocDtl_trd_nm.addAllListener(p);
		p.columnAllocDtl_trd_nm.setListListener(p);
		p.columnAllocDtl_trd_ptn_typ.addAllListener(p);
		p.columnAllocDtl_trd_ptn_typ.setListListener(p);
		p.columnAllocDtl_slo_no.addAllListener(p);
		p.columnAllocDtl_slo_no.setListListener(p);
		p.columnAllocDtl_slo_d_no.addAllListener(p);
		p.columnAllocDtl_slo_d_no.setListListener(p);
		p.columnAllocDtl_xfr_schd_no.addAllListener(p);
		p.columnAllocDtl_xfr_schd_no.setListListener(p);
		p.columnAllocDtl_iv_no.addAllListener(p);
		p.columnAllocDtl_iv_no.setListListener(p);
		p.columnAllocDtl_ship_schd_no.addAllListener(p);
		p.columnAllocDtl_ship_schd_no.setListListener(p);
		p.columnAllocDtl_alloc_typ.addAllListener(p);
		p.columnAllocDtl_alloc_typ.setListListener(p);
		p.columnAllocDtl_alloc_typ_nm.addAllListener(p);
		p.columnAllocDtl_alloc_typ_nm.setListListener(p);
		p.columnAllocDtl_pr_sts_typ.addAllListener(p);
		p.columnAllocDtl_pr_sts_typ.setListListener(p);
		p.columnAllocDtl_pr_sts_typ_nm.addAllListener(p);
		p.columnAllocDtl_pr_sts_typ_nm.setListListener(p);
		p.columnAllocDtl_ship_schd_dt.addAllListener(p);
		p.columnAllocDtl_ship_schd_dt.setListListener(p);
		p.columnAllocDtl_ship_schd_hm.addAllListener(p);
		p.columnAllocDtl_ship_schd_hm.setListListener(p);
		p.columnAllocDtl_prms_dlv_dt.addAllListener(p);
		p.columnAllocDtl_prms_dlv_dt.setListListener(p);
		p.columnAllocDtl_prms_dlv_hm.addAllListener(p);
		p.columnAllocDtl_prms_dlv_hm.setListListener(p);
		p.columnAllocDtl_cst_cd.addAllListener(p);
		p.columnAllocDtl_cst_cd.setListListener(p);
		p.columnAllocDtl_cst_nm.addAllListener(p);
		p.columnAllocDtl_cst_nm.setListListener(p);
		p.columnAllocDtl_cst_po_no.addAllListener(p);
		p.columnAllocDtl_cst_po_no.setListListener(p);
		p.columnAllocDtl_dlv_id_typ.addAllListener(p);
		p.columnAllocDtl_dlv_id_typ.setListListener(p);
		p.columnAllocDtl_dlv_id_typ_nm.addAllListener(p);
		p.columnAllocDtl_dlv_id_typ_nm.setListListener(p);
		p.columnAllocDtl_dlv_id_cd.addAllListener(p);
		p.columnAllocDtl_dlv_id_cd.setListListener(p);
		p.columnAllocDtl_dlv_id_nm.addAllListener(p);
		p.columnAllocDtl_dlv_id_nm.setListListener(p);
		p.columnAllocDtl_loc_cd.addAllListener(p);
		p.columnAllocDtl_loc_cd.setListListener(p);
		p.columnAllocDtl_loc_nm.addAllListener(p);
		p.columnAllocDtl_loc_nm.setListListener(p);
		p.columnAllocDtl_rqst_dpt_cd.addAllListener(p);
		p.columnAllocDtl_rqst_dpt_cd.setListListener(p);
		p.columnAllocDtl_rqst_dpt_nm.addAllListener(p);
		p.columnAllocDtl_rqst_dpt_nm.setListListener(p);
		p.columnAllocDtl_base_unit_cd.addAllListener(p);
		p.columnAllocDtl_base_unit_cd.setListListener(p);
		p.columnAllocDtl_base_unit_nm.addAllListener(p);
		p.columnAllocDtl_base_unit_nm.setListListener(p);
		p.columnAllocDtl_base_unit_dec_place.addAllListener(p);
		p.columnAllocDtl_base_unit_dec_place.setListListener(p);
		p.columnAllocDtl_avl_schd_dt.addAllListener(p);
		p.columnAllocDtl_avl_schd_dt.setListListener(p);
		p.columnAllocDtl_intr_rmrks.addAllListener(p);
		p.columnAllocDtl_intr_rmrks.setListListener(p);
		p.columnAllocDtl_intr_d_rmrks.addAllListener(p);
		p.columnAllocDtl_intr_d_rmrks.setListListener(p);
	}

	/**
	 *  [AllocBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocBtn(MSBEP_AllocPrio p) {
	}

	/**
	 *  [AllocEx]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocEx(MSBEP_AllocPrio p) {
	}

	/**
	 *  [AllocExDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocExDtl(MSBEP_AllocPrio p) {
		p.AllocExDtlTable.addAllListener(p);
		p.columnAllocExDtl_prms_delay_flg.addAllListener(p);
		p.columnAllocExDtl_split_flg.addAllListener(p);
		p.columnAllocExDtl_pre_alloc_prio.addAllListener(p);
		p.columnAllocExDtl_pre_alloc_prio.setListListener(p);
		p.columnAllocExDtl_alloc_prio.addAllListener(p);
		p.columnAllocExDtl_alloc_prio.setListListener(p);
		p.columnAllocExDtl_trd_cd.addAllListener(p);
		p.columnAllocExDtl_trd_cd.setListListener(p);
		p.columnAllocExDtl_trd_nm.addAllListener(p);
		p.columnAllocExDtl_trd_nm.setListListener(p);
		p.columnAllocExDtl_trd_ptn_typ.addAllListener(p);
		p.columnAllocExDtl_trd_ptn_typ.setListListener(p);
		p.columnAllocExDtl_slo_no.addAllListener(p);
		p.columnAllocExDtl_slo_no.setListListener(p);
		p.columnAllocExDtl_slo_d_no.addAllListener(p);
		p.columnAllocExDtl_slo_d_no.setListListener(p);
		p.columnAllocExDtl_xfr_schd_no.addAllListener(p);
		p.columnAllocExDtl_xfr_schd_no.setListListener(p);
		p.columnAllocExDtl_iv_no.addAllListener(p);
		p.columnAllocExDtl_iv_no.setListListener(p);
		p.columnAllocExDtl_ship_schd_no.addAllListener(p);
		p.columnAllocExDtl_ship_schd_no.setListListener(p);
		p.columnAllocExDtl_alloc_typ.addAllListener(p);
		p.columnAllocExDtl_alloc_typ.setListListener(p);
		p.columnAllocExDtl_alloc_typ_nm.addAllListener(p);
		p.columnAllocExDtl_alloc_typ_nm.setListListener(p);
		p.columnAllocExDtl_pr_sts_typ.addAllListener(p);
		p.columnAllocExDtl_pr_sts_typ.setListListener(p);
		p.columnAllocExDtl_pr_sts_typ_nm.addAllListener(p);
		p.columnAllocExDtl_pr_sts_typ_nm.setListListener(p);
		p.columnAllocExDtl_ship_schd_dt.addAllListener(p);
		p.columnAllocExDtl_ship_schd_dt.setListListener(p);
		p.columnAllocExDtl_ship_schd_hm.addAllListener(p);
		p.columnAllocExDtl_ship_schd_hm.setListListener(p);
		p.columnAllocExDtl_prms_dlv_dt.addAllListener(p);
		p.columnAllocExDtl_prms_dlv_dt.setListListener(p);
		p.columnAllocExDtl_prms_dlv_hm.addAllListener(p);
		p.columnAllocExDtl_prms_dlv_hm.setListListener(p);
		p.columnAllocExDtl_cst_cd.addAllListener(p);
		p.columnAllocExDtl_cst_cd.setListListener(p);
		p.columnAllocExDtl_cst_nm.addAllListener(p);
		p.columnAllocExDtl_cst_nm.setListListener(p);
		p.columnAllocExDtl_cst_po_no.addAllListener(p);
		p.columnAllocExDtl_cst_po_no.setListListener(p);
		p.columnAllocExDtl_dlv_id_typ.addAllListener(p);
		p.columnAllocExDtl_dlv_id_typ.setListListener(p);
		p.columnAllocExDtl_dlv_id_typ_nm.addAllListener(p);
		p.columnAllocExDtl_dlv_id_typ_nm.setListListener(p);
		p.columnAllocExDtl_dlv_id_cd.addAllListener(p);
		p.columnAllocExDtl_dlv_id_cd.setListListener(p);
		p.columnAllocExDtl_dlv_id_nm.addAllListener(p);
		p.columnAllocExDtl_dlv_id_nm.setListListener(p);
		p.columnAllocExDtl_loc_cd.addAllListener(p);
		p.columnAllocExDtl_loc_cd.setListListener(p);
		p.columnAllocExDtl_loc_nm.addAllListener(p);
		p.columnAllocExDtl_loc_nm.setListListener(p);
		p.columnAllocExDtl_rqst_dpt_cd.addAllListener(p);
		p.columnAllocExDtl_rqst_dpt_cd.setListListener(p);
		p.columnAllocExDtl_rqst_dpt_nm.addAllListener(p);
		p.columnAllocExDtl_rqst_dpt_nm.setListListener(p);
		p.columnAllocExDtl_base_unit_cd.addAllListener(p);
		p.columnAllocExDtl_base_unit_cd.setListListener(p);
		p.columnAllocExDtl_base_unit_nm.addAllListener(p);
		p.columnAllocExDtl_base_unit_nm.setListListener(p);
		p.columnAllocExDtl_base_unit_dec_place.addAllListener(p);
		p.columnAllocExDtl_base_unit_dec_place.setListListener(p);
		p.columnAllocExDtl_avl_schd_dt.addAllListener(p);
		p.columnAllocExDtl_avl_schd_dt.setListListener(p);
		p.columnAllocExDtl_intr_rmrks.addAllListener(p);
		p.columnAllocExDtl_intr_rmrks.setListListener(p);
		p.columnAllocExDtl_intr_d_rmrks.addAllListener(p);
		p.columnAllocExDtl_intr_d_rmrks.setListListener(p);
	}

	/**
	 *  [AllocExBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocExBtn(MSBEP_AllocPrio p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_AllocPrio p) {
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
		p.Btn_open_MSBBP1210_EX.addAllListener(p);
		p.Btn_open_MSBBP1210_EX.setAPMethodName("doBtn_open_MSBBP1210_EX");
		p.Btn_open_MSBEP1000.addAllListener(p);
		p.Btn_open_MSBEP1000.setAPMethodName("doBtn_open_MSBEP1000");
		p.Btn_open_MSBEP1000_EX.addAllListener(p);
		p.Btn_open_MSBEP1000_EX.setAPMethodName("doBtn_open_MSBEP1000_EX");
		p.Btn_sprt.addAllListener(p);
		p.Btn_sprt.setAPMethodName("doBtn_sprt");
		p.Btn_move_top.addAllListener(p);
		p.Btn_move_top.setAPMethodName("doBtn_move_top");
		p.Btn_move_up.addAllListener(p);
		p.Btn_move_up.setAPMethodName("doBtn_move_up");
		p.Btn_move_down.addAllListener(p);
		p.Btn_move_down.setAPMethodName("doBtn_move_down");
		p.Btn_move_bottom.addAllListener(p);
		p.Btn_move_bottom.setAPMethodName("doBtn_move_bottom");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_AllocPrio p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[Alloc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Alloc(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[AllocDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocDtl(MSBEP_AllocPrio p){
		p.columnAllocDtl_prms_delay_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_split_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_pre_alloc_prio.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_prio.putMode(p, UPD, MCMode.READ_ONLY);
		p.AllocDtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocDtl_alloc_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocDtl_ship_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.AllocDtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocDtl_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.AllocDtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_avl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_avl_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.AllocDtl_not_alloc_avail_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocDtl_intr_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[AllocBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[AllocEx]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocEx(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[AllocExDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocExDtl(MSBEP_AllocPrio p){
		p.columnAllocExDtl_prms_delay_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocExDtl_split_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocExDtl_pre_alloc_prio.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocExDtl_alloc_prio.putMode(p, UPD, MCMode.INVISIBLE);
		p.AllocExDtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocExDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAllocExDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.AllocExDtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocExDtl_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.AllocExDtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_alloc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_cml_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_alloc_avl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_avl_schd_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.AllocExDtl_not_alloc_avail_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAllocExDtl_intr_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[AllocExBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocExBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_AllocPrio p){
		p.Btn_open_MSBBP1210.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1210_EX.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1000_EX.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_move_top.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_move_up.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_move_down.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_move_bottom.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_AllocPrio p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[Alloc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Alloc(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[AllocDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocDtl(MSBEP_AllocPrio p){
		p.columnAllocDtl_prms_delay_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_split_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_pre_alloc_prio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_prio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.AllocDtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocDtl_alloc_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocDtl_ship_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.AllocDtl_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocDtl_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.AllocDtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_avl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_avl_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.AllocDtl_not_alloc_avail_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[AllocBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[AllocEx]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocEx(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[AllocExDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocExDtl(MSBEP_AllocPrio p){
		p.columnAllocExDtl_prms_delay_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocExDtl_split_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocExDtl_pre_alloc_prio.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocExDtl_alloc_prio.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.AllocExDtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocExDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnAllocExDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.AllocExDtl_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocExDtl_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.AllocExDtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_alloc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_cml_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_alloc_avl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_avl_schd_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.AllocExDtl_not_alloc_avail_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnAllocExDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[AllocExBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocExBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_AllocPrio p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBBP1210_EX.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBEP1000_EX.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_AllocPrio p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[Alloc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Alloc(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[AllocDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocDtl(MSBEP_AllocPrio p){
		p.columnAllocDtl_prms_delay_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_split_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_pre_alloc_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.AllocDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocDtl_alloc_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocDtl_ship_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.AllocDtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.AllocDtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_avl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_avl_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.AllocDtl_not_alloc_avail_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[AllocBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[AllocEx]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocEx(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[AllocExDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocExDtl(MSBEP_AllocPrio p){
		p.columnAllocExDtl_prms_delay_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocExDtl_split_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocExDtl_pre_alloc_prio.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocExDtl_alloc_prio.putMode(p, SRCH, MCMode.INVISIBLE);
		p.AllocExDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocExDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnAllocExDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.AllocExDtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocExDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.AllocExDtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_alloc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_cml_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_alloc_avl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_avl_schd_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.AllocExDtl_not_alloc_avail_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnAllocExDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[AllocExBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocExBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_AllocPrio p){
		p.Btn_open_MSBBP1210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBBP1210_EX.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP1000_EX.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_AllocPrio p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[Alloc]ブロックのモードの設定
	 */
	protected static void statusInitREF_Alloc(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[AllocDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocDtl(MSBEP_AllocPrio p){
		p.columnAllocDtl_prms_delay_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_split_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_pre_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.AllocDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_alloc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocDtl_alloc_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocDtl_pr_sts_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocDtl_ship_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_ship_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_prms_dlv_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.AllocDtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_rqst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.AllocDtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_alloc_avl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_avl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.AllocDtl_not_alloc_avail_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnAllocDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[AllocBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[AllocEx]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocEx(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[AllocExDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocExDtl(MSBEP_AllocPrio p){
		p.columnAllocExDtl_prms_delay_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocExDtl_split_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocExDtl_pre_alloc_prio.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocExDtl_alloc_prio.putMode(p, REF, MCMode.INVISIBLE);
		p.AllocExDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnAllocExDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAllocExDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_alloc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_pr_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_ship_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_prms_dlv_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.AllocExDtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnAllocExDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_rqst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.AllocExDtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_alloc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.AllocExDtl_cml_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_alloc_avl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_avl_schd_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.AllocExDtl_not_alloc_avail_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnAllocExDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAllocExDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[AllocExBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_AllocExBtn(MSBEP_AllocPrio p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_AllocPrio p){
		p.Btn_open_MSBBP1210.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBBP1210_EX.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBEP1000_EX.putMode(p, REF, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

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
		MSBEP_AllocPrio_MC.setTableConfigAllocDtl((MSBEP_AllocPrio)this);
		MSBEP_AllocPrio_MC.setTableConfigAllocExDtl((MSBEP_AllocPrio)this);
	}

	/**
	 * [AllocDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigAllocDtl(MSBEP_AllocPrio p) {
		p.columnAllocDtl_prms_delay_flg.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.prms_delay_flg_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_prms_delay_flg);
		p.columnAllocDtl_split_flg.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.split_flg_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_split_flg);
		p.columnAllocDtl_pre_alloc_prio.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.pre_alloc_prio_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_pre_alloc_prio);
		p.columnAllocDtl_alloc_prio.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.alloc_prio_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_alloc_prio);
		p.AllocDtlTable.addTable(p.AllocDtl_itm_p_PPanel.ItmTable);
		p.columnAllocDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.trd_cd_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_trd_cd);
		p.columnAllocDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.trd_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_trd_nm);
		p.columnAllocDtl_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.trd_ptn_typ_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_trd_ptn_typ);
		p.columnAllocDtl_slo_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.slo_no_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_slo_no);
		p.columnAllocDtl_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.slo_d_no_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_slo_d_no);
		p.columnAllocDtl_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.xfr_schd_no_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_xfr_schd_no);
		p.columnAllocDtl_iv_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.iv_no_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_iv_no);
		p.columnAllocDtl_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.ship_schd_no_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_ship_schd_no);
		p.columnAllocDtl_alloc_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.alloc_typ_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_alloc_typ);
		p.columnAllocDtl_alloc_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.alloc_typ_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_alloc_typ_nm);
		p.columnAllocDtl_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.pr_sts_typ_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_pr_sts_typ);
		p.columnAllocDtl_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.pr_sts_typ_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_pr_sts_typ_nm);
		p.columnAllocDtl_ship_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.ship_schd_dt_META);
		p.columnAllocDtl_ship_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_ship_schd_dt);
		p.columnAllocDtl_ship_schd_hm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.ship_schd_hm_META);
		p.columnAllocDtl_ship_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_ship_schd_hm);
		p.columnAllocDtl_prms_dlv_dt.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.prms_dlv_dt_META);
		p.columnAllocDtl_prms_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_prms_dlv_dt);
		p.columnAllocDtl_prms_dlv_hm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.prms_dlv_hm_META);
		p.columnAllocDtl_prms_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_prms_dlv_hm);
		p.columnAllocDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.cst_cd_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_cst_cd);
		p.columnAllocDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.cst_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_cst_nm);
		p.columnAllocDtl_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.cst_po_no_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_cst_po_no);
		p.columnAllocDtl_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_typ_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_dlv_id_typ);
		p.columnAllocDtl_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_typ_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_dlv_id_typ_nm);
		p.columnAllocDtl_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_cd_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_dlv_id_cd);
		p.columnAllocDtl_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_dlv_id_nm);
		p.AllocDtlTable.addTable(p.AllocDtl_sno_p_PPanel.SnoTable);
		p.columnAllocDtl_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.loc_cd_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_loc_cd);
		p.columnAllocDtl_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.loc_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_loc_nm);
		p.columnAllocDtl_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.rqst_dpt_cd_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_rqst_dpt_cd);
		p.columnAllocDtl_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.rqst_dpt_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_rqst_dpt_nm);
		p.columnAllocDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.base_unit_cd_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_base_unit_cd);
		p.columnAllocDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.base_unit_nm_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_base_unit_nm);
		p.columnAllocDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.base_unit_dec_place_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_base_unit_dec_place);
		p.AllocDtlTable.addTable(p.AllocDtl_base_unit_qty_p_PPanel.QtyTable);
		p.AllocDtlTable.addTable(p.AllocDtl_alloc_qty_p_PPanel.QtyTable);
		p.AllocDtlTable.addTable(p.AllocDtl_wait_qty_p_PPanel.QtyTable);
		p.AllocDtlTable.addTable(p.AllocDtl_cml_wait_qty_p_PPanel.QtyTable);
		p.AllocDtlTable.addTable(p.AllocDtl_alloc_avl_qty_p_PPanel.QtyTable);
		p.columnAllocDtl_avl_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.avl_schd_dt_META);
		p.columnAllocDtl_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_avl_schd_dt);
		p.AllocDtlTable.addTable(p.AllocDtl_not_alloc_avail_qty_p_PPanel.QtyTable);
		p.AllocDtlTable.addTable(p.AllocDtl_cml_not_alloc_avail_qty_p_PPanel.QtyTable);
		p.columnAllocDtl_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.intr_rmrks_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_intr_rmrks);
		p.columnAllocDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.intr_d_rmrks_META);
		p.AllocDtlTable.addColumnConfig(p.columnAllocDtl_intr_d_rmrks);
	}

	/**
	 * [AllocExDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigAllocExDtl(MSBEP_AllocPrio p) {
		p.columnAllocExDtl_prms_delay_flg.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.prms_delay_flg_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_prms_delay_flg);
		p.columnAllocExDtl_split_flg.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.split_flg_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_split_flg);
		p.columnAllocExDtl_pre_alloc_prio.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.pre_alloc_prio_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_pre_alloc_prio);
		p.columnAllocExDtl_alloc_prio.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.alloc_prio_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_alloc_prio);
		p.AllocExDtlTable.addTable(p.AllocExDtl_itm_p_PPanel.ItmTable);
		p.columnAllocExDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.trd_cd_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_trd_cd);
		p.columnAllocExDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.trd_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_trd_nm);
		p.columnAllocExDtl_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.trd_ptn_typ_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_trd_ptn_typ);
		p.columnAllocExDtl_slo_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.slo_no_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_slo_no);
		p.columnAllocExDtl_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.slo_d_no_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_slo_d_no);
		p.columnAllocExDtl_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.xfr_schd_no_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_xfr_schd_no);
		p.columnAllocExDtl_iv_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.iv_no_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_iv_no);
		p.columnAllocExDtl_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.ship_schd_no_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_ship_schd_no);
		p.columnAllocExDtl_alloc_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.alloc_typ_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_alloc_typ);
		p.columnAllocExDtl_alloc_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.alloc_typ_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_alloc_typ_nm);
		p.columnAllocExDtl_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.pr_sts_typ_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_pr_sts_typ);
		p.columnAllocExDtl_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.pr_sts_typ_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_pr_sts_typ_nm);
		p.columnAllocExDtl_ship_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.ship_schd_dt_META);
		p.columnAllocExDtl_ship_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_ship_schd_dt);
		p.columnAllocExDtl_ship_schd_hm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.ship_schd_hm_META);
		p.columnAllocExDtl_ship_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_ship_schd_hm);
		p.columnAllocExDtl_prms_dlv_dt.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.prms_dlv_dt_META);
		p.columnAllocExDtl_prms_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_prms_dlv_dt);
		p.columnAllocExDtl_prms_dlv_hm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.prms_dlv_hm_META);
		p.columnAllocExDtl_prms_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_prms_dlv_hm);
		p.columnAllocExDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.cst_cd_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_cst_cd);
		p.columnAllocExDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.cst_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_cst_nm);
		p.columnAllocExDtl_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.cst_po_no_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_cst_po_no);
		p.columnAllocExDtl_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_typ_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_dlv_id_typ);
		p.columnAllocExDtl_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_typ_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_dlv_id_typ_nm);
		p.columnAllocExDtl_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_cd_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_dlv_id_cd);
		p.columnAllocExDtl_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.dlv_id_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_dlv_id_nm);
		p.AllocExDtlTable.addTable(p.AllocExDtl_sno_p_PPanel.SnoTable);
		p.columnAllocExDtl_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.loc_cd_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_loc_cd);
		p.columnAllocExDtl_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.loc_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_loc_nm);
		p.columnAllocExDtl_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.rqst_dpt_cd_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_rqst_dpt_cd);
		p.columnAllocExDtl_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.rqst_dpt_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_rqst_dpt_nm);
		p.columnAllocExDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.base_unit_cd_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_base_unit_cd);
		p.columnAllocExDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.base_unit_nm_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_base_unit_nm);
		p.columnAllocExDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.base_unit_dec_place_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_base_unit_dec_place);
		p.AllocExDtlTable.addTable(p.AllocExDtl_base_unit_qty_p_PPanel.QtyTable);
		p.AllocExDtlTable.addTable(p.AllocExDtl_alloc_qty_p_PPanel.QtyTable);
		p.AllocExDtlTable.addTable(p.AllocExDtl_wait_qty_p_PPanel.QtyTable);
		p.AllocExDtlTable.addTable(p.AllocExDtl_cml_wait_qty_p_PPanel.QtyTable);
		p.AllocExDtlTable.addTable(p.AllocExDtl_alloc_avl_qty_p_PPanel.QtyTable);
		p.columnAllocExDtl_avl_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.avl_schd_dt_META);
		p.columnAllocExDtl_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_avl_schd_dt);
		p.AllocExDtlTable.addTable(p.AllocExDtl_not_alloc_avail_qty_p_PPanel.QtyTable);
		p.AllocExDtlTable.addTable(p.AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.QtyTable);
		p.columnAllocExDtl_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.intr_rmrks_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_intr_rmrks);
		p.columnAllocExDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP0150.AllocDtlR.intr_d_rmrks_META);
		p.AllocExDtlTable.addColumnConfig(p.columnAllocExDtl_intr_d_rmrks);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
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
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
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
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
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
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
		else if (ap == Btn_open_MSBBP1210_EX) doBtn_open_MSBBP1210_EX(info);
		else if (ap == Btn_open_MSBEP1000) doBtn_open_MSBEP1000(info);
		else if (ap == Btn_open_MSBEP1000_EX) doBtn_open_MSBEP1000_EX(info);
		else if (ap == Btn_sprt) doBtn_sprt(info);
		else if (ap == Btn_move_top) doBtn_move_top(info);
		else if (ap == Btn_move_up) doBtn_move_up(info);
		else if (ap == Btn_move_down) doBtn_move_down(info);
		else if (ap == Btn_move_bottom) doBtn_move_bottom(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1210_EX]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210_EX(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1000]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1000(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1000_EX]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1000_EX(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_top]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_top(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_up]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_up(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_down]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_down(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_bottom]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_bottom(MCEventInfo info);

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
		if (vc == AllocDtlTable) return doAllocDtl_VC(info);
		if (vc == AllocExDtlTable) return doAllocExDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == columnAllocDtl_prms_delay_flg) return doAllocDtl_prms_delay_flg_VC(info);
		if (vc == columnAllocDtl_split_flg) return doAllocDtl_split_flg_VC(info);
		if (vc == columnAllocDtl_pre_alloc_prio) return doAllocDtl_pre_alloc_prio_VC(info);
		if (vc == columnAllocDtl_alloc_prio) return doAllocDtl_alloc_prio_VC(info);
		if (vc == columnAllocDtl_trd_cd) return doAllocDtl_trd_cd_VC(info);
		if (vc == columnAllocDtl_trd_nm) return doAllocDtl_trd_nm_VC(info);
		if (vc == columnAllocDtl_trd_ptn_typ) return doAllocDtl_trd_ptn_typ_VC(info);
		if (vc == columnAllocDtl_slo_no) return doAllocDtl_slo_no_VC(info);
		if (vc == columnAllocDtl_slo_d_no) return doAllocDtl_slo_d_no_VC(info);
		if (vc == columnAllocDtl_xfr_schd_no) return doAllocDtl_xfr_schd_no_VC(info);
		if (vc == columnAllocDtl_iv_no) return doAllocDtl_iv_no_VC(info);
		if (vc == columnAllocDtl_ship_schd_no) return doAllocDtl_ship_schd_no_VC(info);
		if (vc == columnAllocDtl_alloc_typ) return doAllocDtl_alloc_typ_VC(info);
		if (vc == columnAllocDtl_alloc_typ_nm) return doAllocDtl_alloc_typ_nm_VC(info);
		if (vc == columnAllocDtl_pr_sts_typ) return doAllocDtl_pr_sts_typ_VC(info);
		if (vc == columnAllocDtl_pr_sts_typ_nm) return doAllocDtl_pr_sts_typ_nm_VC(info);
		if (vc == columnAllocDtl_ship_schd_dt) return doAllocDtl_ship_schd_dt_VC(info);
		if (vc == columnAllocDtl_ship_schd_hm) return doAllocDtl_ship_schd_hm_VC(info);
		if (vc == columnAllocDtl_prms_dlv_dt) return doAllocDtl_prms_dlv_dt_VC(info);
		if (vc == columnAllocDtl_prms_dlv_hm) return doAllocDtl_prms_dlv_hm_VC(info);
		if (vc == columnAllocDtl_cst_cd) return doAllocDtl_cst_cd_VC(info);
		if (vc == columnAllocDtl_cst_nm) return doAllocDtl_cst_nm_VC(info);
		if (vc == columnAllocDtl_cst_po_no) return doAllocDtl_cst_po_no_VC(info);
		if (vc == columnAllocDtl_dlv_id_typ) return doAllocDtl_dlv_id_typ_VC(info);
		if (vc == columnAllocDtl_dlv_id_typ_nm) return doAllocDtl_dlv_id_typ_nm_VC(info);
		if (vc == columnAllocDtl_dlv_id_cd) return doAllocDtl_dlv_id_cd_VC(info);
		if (vc == columnAllocDtl_dlv_id_nm) return doAllocDtl_dlv_id_nm_VC(info);
		if (vc == columnAllocDtl_loc_cd) return doAllocDtl_loc_cd_VC(info);
		if (vc == columnAllocDtl_loc_nm) return doAllocDtl_loc_nm_VC(info);
		if (vc == columnAllocDtl_rqst_dpt_cd) return doAllocDtl_rqst_dpt_cd_VC(info);
		if (vc == columnAllocDtl_rqst_dpt_nm) return doAllocDtl_rqst_dpt_nm_VC(info);
		if (vc == columnAllocDtl_base_unit_cd) return doAllocDtl_base_unit_cd_VC(info);
		if (vc == columnAllocDtl_base_unit_nm) return doAllocDtl_base_unit_nm_VC(info);
		if (vc == columnAllocDtl_base_unit_dec_place) return doAllocDtl_base_unit_dec_place_VC(info);
		if (vc == columnAllocDtl_avl_schd_dt) return doAllocDtl_avl_schd_dt_VC(info);
		if (vc == columnAllocDtl_intr_rmrks) return doAllocDtl_intr_rmrks_VC(info);
		if (vc == columnAllocDtl_intr_d_rmrks) return doAllocDtl_intr_d_rmrks_VC(info);
		if (vc == columnAllocExDtl_prms_delay_flg) return doAllocExDtl_prms_delay_flg_VC(info);
		if (vc == columnAllocExDtl_split_flg) return doAllocExDtl_split_flg_VC(info);
		if (vc == columnAllocExDtl_pre_alloc_prio) return doAllocExDtl_pre_alloc_prio_VC(info);
		if (vc == columnAllocExDtl_alloc_prio) return doAllocExDtl_alloc_prio_VC(info);
		if (vc == columnAllocExDtl_trd_cd) return doAllocExDtl_trd_cd_VC(info);
		if (vc == columnAllocExDtl_trd_nm) return doAllocExDtl_trd_nm_VC(info);
		if (vc == columnAllocExDtl_trd_ptn_typ) return doAllocExDtl_trd_ptn_typ_VC(info);
		if (vc == columnAllocExDtl_slo_no) return doAllocExDtl_slo_no_VC(info);
		if (vc == columnAllocExDtl_slo_d_no) return doAllocExDtl_slo_d_no_VC(info);
		if (vc == columnAllocExDtl_xfr_schd_no) return doAllocExDtl_xfr_schd_no_VC(info);
		if (vc == columnAllocExDtl_iv_no) return doAllocExDtl_iv_no_VC(info);
		if (vc == columnAllocExDtl_ship_schd_no) return doAllocExDtl_ship_schd_no_VC(info);
		if (vc == columnAllocExDtl_alloc_typ) return doAllocExDtl_alloc_typ_VC(info);
		if (vc == columnAllocExDtl_alloc_typ_nm) return doAllocExDtl_alloc_typ_nm_VC(info);
		if (vc == columnAllocExDtl_pr_sts_typ) return doAllocExDtl_pr_sts_typ_VC(info);
		if (vc == columnAllocExDtl_pr_sts_typ_nm) return doAllocExDtl_pr_sts_typ_nm_VC(info);
		if (vc == columnAllocExDtl_ship_schd_dt) return doAllocExDtl_ship_schd_dt_VC(info);
		if (vc == columnAllocExDtl_ship_schd_hm) return doAllocExDtl_ship_schd_hm_VC(info);
		if (vc == columnAllocExDtl_prms_dlv_dt) return doAllocExDtl_prms_dlv_dt_VC(info);
		if (vc == columnAllocExDtl_prms_dlv_hm) return doAllocExDtl_prms_dlv_hm_VC(info);
		if (vc == columnAllocExDtl_cst_cd) return doAllocExDtl_cst_cd_VC(info);
		if (vc == columnAllocExDtl_cst_nm) return doAllocExDtl_cst_nm_VC(info);
		if (vc == columnAllocExDtl_cst_po_no) return doAllocExDtl_cst_po_no_VC(info);
		if (vc == columnAllocExDtl_dlv_id_typ) return doAllocExDtl_dlv_id_typ_VC(info);
		if (vc == columnAllocExDtl_dlv_id_typ_nm) return doAllocExDtl_dlv_id_typ_nm_VC(info);
		if (vc == columnAllocExDtl_dlv_id_cd) return doAllocExDtl_dlv_id_cd_VC(info);
		if (vc == columnAllocExDtl_dlv_id_nm) return doAllocExDtl_dlv_id_nm_VC(info);
		if (vc == columnAllocExDtl_loc_cd) return doAllocExDtl_loc_cd_VC(info);
		if (vc == columnAllocExDtl_loc_nm) return doAllocExDtl_loc_nm_VC(info);
		if (vc == columnAllocExDtl_rqst_dpt_cd) return doAllocExDtl_rqst_dpt_cd_VC(info);
		if (vc == columnAllocExDtl_rqst_dpt_nm) return doAllocExDtl_rqst_dpt_nm_VC(info);
		if (vc == columnAllocExDtl_base_unit_cd) return doAllocExDtl_base_unit_cd_VC(info);
		if (vc == columnAllocExDtl_base_unit_nm) return doAllocExDtl_base_unit_nm_VC(info);
		if (vc == columnAllocExDtl_base_unit_dec_place) return doAllocExDtl_base_unit_dec_place_VC(info);
		if (vc == columnAllocExDtl_avl_schd_dt) return doAllocExDtl_avl_schd_dt_VC(info);
		if (vc == columnAllocExDtl_intr_rmrks) return doAllocExDtl_intr_rmrks_VC(info);
		if (vc == columnAllocExDtl_intr_d_rmrks) return doAllocExDtl_intr_d_rmrks_VC(info);
		return true;
	}

	/**
	 * [AllocDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_VC(MCEventInfo info){
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
	 * [AllocDtl]パネルの[prms_delay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_prms_delay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[split_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_split_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[pre_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_pre_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_alloc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_alloc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_ship_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_ship_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_prms_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_prms_dlv_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_rqst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[avl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_avl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocDtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[prms_delay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_prms_delay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[split_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_split_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[pre_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_pre_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_alloc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_alloc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_ship_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_ship_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_prms_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_prms_dlv_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_rqst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[avl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_avl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AllocExDtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAllocExDtl_intr_d_rmrks_VC(MCEventInfo info){
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
		if (nc == AllocDtlTable) doAllocDtl_NC(info);
		else if (nc == AllocExDtlTable) doAllocExDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == columnAllocDtl_prms_delay_flg) doAllocDtl_prms_delay_flg_NC(info);
		else if (nc == columnAllocDtl_split_flg) doAllocDtl_split_flg_NC(info);
		else if (nc == columnAllocDtl_pre_alloc_prio) doAllocDtl_pre_alloc_prio_NC(info);
		else if (nc == columnAllocDtl_alloc_prio) doAllocDtl_alloc_prio_NC(info);
		else if (nc == columnAllocDtl_trd_cd) doAllocDtl_trd_cd_NC(info);
		else if (nc == columnAllocDtl_trd_nm) doAllocDtl_trd_nm_NC(info);
		else if (nc == columnAllocDtl_trd_ptn_typ) doAllocDtl_trd_ptn_typ_NC(info);
		else if (nc == columnAllocDtl_slo_no) doAllocDtl_slo_no_NC(info);
		else if (nc == columnAllocDtl_slo_d_no) doAllocDtl_slo_d_no_NC(info);
		else if (nc == columnAllocDtl_xfr_schd_no) doAllocDtl_xfr_schd_no_NC(info);
		else if (nc == columnAllocDtl_iv_no) doAllocDtl_iv_no_NC(info);
		else if (nc == columnAllocDtl_ship_schd_no) doAllocDtl_ship_schd_no_NC(info);
		else if (nc == columnAllocDtl_alloc_typ) doAllocDtl_alloc_typ_NC(info);
		else if (nc == columnAllocDtl_alloc_typ_nm) doAllocDtl_alloc_typ_nm_NC(info);
		else if (nc == columnAllocDtl_pr_sts_typ) doAllocDtl_pr_sts_typ_NC(info);
		else if (nc == columnAllocDtl_pr_sts_typ_nm) doAllocDtl_pr_sts_typ_nm_NC(info);
		else if (nc == columnAllocDtl_ship_schd_dt) doAllocDtl_ship_schd_dt_NC(info);
		else if (nc == columnAllocDtl_ship_schd_hm) doAllocDtl_ship_schd_hm_NC(info);
		else if (nc == columnAllocDtl_prms_dlv_dt) doAllocDtl_prms_dlv_dt_NC(info);
		else if (nc == columnAllocDtl_prms_dlv_hm) doAllocDtl_prms_dlv_hm_NC(info);
		else if (nc == columnAllocDtl_cst_cd) doAllocDtl_cst_cd_NC(info);
		else if (nc == columnAllocDtl_cst_nm) doAllocDtl_cst_nm_NC(info);
		else if (nc == columnAllocDtl_cst_po_no) doAllocDtl_cst_po_no_NC(info);
		else if (nc == columnAllocDtl_dlv_id_typ) doAllocDtl_dlv_id_typ_NC(info);
		else if (nc == columnAllocDtl_dlv_id_typ_nm) doAllocDtl_dlv_id_typ_nm_NC(info);
		else if (nc == columnAllocDtl_dlv_id_cd) doAllocDtl_dlv_id_cd_NC(info);
		else if (nc == columnAllocDtl_dlv_id_nm) doAllocDtl_dlv_id_nm_NC(info);
		else if (nc == columnAllocDtl_loc_cd) doAllocDtl_loc_cd_NC(info);
		else if (nc == columnAllocDtl_loc_nm) doAllocDtl_loc_nm_NC(info);
		else if (nc == columnAllocDtl_rqst_dpt_cd) doAllocDtl_rqst_dpt_cd_NC(info);
		else if (nc == columnAllocDtl_rqst_dpt_nm) doAllocDtl_rqst_dpt_nm_NC(info);
		else if (nc == columnAllocDtl_base_unit_cd) doAllocDtl_base_unit_cd_NC(info);
		else if (nc == columnAllocDtl_base_unit_nm) doAllocDtl_base_unit_nm_NC(info);
		else if (nc == columnAllocDtl_base_unit_dec_place) doAllocDtl_base_unit_dec_place_NC(info);
		else if (nc == columnAllocDtl_avl_schd_dt) doAllocDtl_avl_schd_dt_NC(info);
		else if (nc == columnAllocDtl_intr_rmrks) doAllocDtl_intr_rmrks_NC(info);
		else if (nc == columnAllocDtl_intr_d_rmrks) doAllocDtl_intr_d_rmrks_NC(info);
		else if (nc == columnAllocExDtl_prms_delay_flg) doAllocExDtl_prms_delay_flg_NC(info);
		else if (nc == columnAllocExDtl_split_flg) doAllocExDtl_split_flg_NC(info);
		else if (nc == columnAllocExDtl_pre_alloc_prio) doAllocExDtl_pre_alloc_prio_NC(info);
		else if (nc == columnAllocExDtl_alloc_prio) doAllocExDtl_alloc_prio_NC(info);
		else if (nc == columnAllocExDtl_trd_cd) doAllocExDtl_trd_cd_NC(info);
		else if (nc == columnAllocExDtl_trd_nm) doAllocExDtl_trd_nm_NC(info);
		else if (nc == columnAllocExDtl_trd_ptn_typ) doAllocExDtl_trd_ptn_typ_NC(info);
		else if (nc == columnAllocExDtl_slo_no) doAllocExDtl_slo_no_NC(info);
		else if (nc == columnAllocExDtl_slo_d_no) doAllocExDtl_slo_d_no_NC(info);
		else if (nc == columnAllocExDtl_xfr_schd_no) doAllocExDtl_xfr_schd_no_NC(info);
		else if (nc == columnAllocExDtl_iv_no) doAllocExDtl_iv_no_NC(info);
		else if (nc == columnAllocExDtl_ship_schd_no) doAllocExDtl_ship_schd_no_NC(info);
		else if (nc == columnAllocExDtl_alloc_typ) doAllocExDtl_alloc_typ_NC(info);
		else if (nc == columnAllocExDtl_alloc_typ_nm) doAllocExDtl_alloc_typ_nm_NC(info);
		else if (nc == columnAllocExDtl_pr_sts_typ) doAllocExDtl_pr_sts_typ_NC(info);
		else if (nc == columnAllocExDtl_pr_sts_typ_nm) doAllocExDtl_pr_sts_typ_nm_NC(info);
		else if (nc == columnAllocExDtl_ship_schd_dt) doAllocExDtl_ship_schd_dt_NC(info);
		else if (nc == columnAllocExDtl_ship_schd_hm) doAllocExDtl_ship_schd_hm_NC(info);
		else if (nc == columnAllocExDtl_prms_dlv_dt) doAllocExDtl_prms_dlv_dt_NC(info);
		else if (nc == columnAllocExDtl_prms_dlv_hm) doAllocExDtl_prms_dlv_hm_NC(info);
		else if (nc == columnAllocExDtl_cst_cd) doAllocExDtl_cst_cd_NC(info);
		else if (nc == columnAllocExDtl_cst_nm) doAllocExDtl_cst_nm_NC(info);
		else if (nc == columnAllocExDtl_cst_po_no) doAllocExDtl_cst_po_no_NC(info);
		else if (nc == columnAllocExDtl_dlv_id_typ) doAllocExDtl_dlv_id_typ_NC(info);
		else if (nc == columnAllocExDtl_dlv_id_typ_nm) doAllocExDtl_dlv_id_typ_nm_NC(info);
		else if (nc == columnAllocExDtl_dlv_id_cd) doAllocExDtl_dlv_id_cd_NC(info);
		else if (nc == columnAllocExDtl_dlv_id_nm) doAllocExDtl_dlv_id_nm_NC(info);
		else if (nc == columnAllocExDtl_loc_cd) doAllocExDtl_loc_cd_NC(info);
		else if (nc == columnAllocExDtl_loc_nm) doAllocExDtl_loc_nm_NC(info);
		else if (nc == columnAllocExDtl_rqst_dpt_cd) doAllocExDtl_rqst_dpt_cd_NC(info);
		else if (nc == columnAllocExDtl_rqst_dpt_nm) doAllocExDtl_rqst_dpt_nm_NC(info);
		else if (nc == columnAllocExDtl_base_unit_cd) doAllocExDtl_base_unit_cd_NC(info);
		else if (nc == columnAllocExDtl_base_unit_nm) doAllocExDtl_base_unit_nm_NC(info);
		else if (nc == columnAllocExDtl_base_unit_dec_place) doAllocExDtl_base_unit_dec_place_NC(info);
		else if (nc == columnAllocExDtl_avl_schd_dt) doAllocExDtl_avl_schd_dt_NC(info);
		else if (nc == columnAllocExDtl_intr_rmrks) doAllocExDtl_intr_rmrks_NC(info);
		else if (nc == columnAllocExDtl_intr_d_rmrks) doAllocExDtl_intr_d_rmrks_NC(info);
	}

	/**
	 * [AllocDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [AllocDtl]パネルの[prms_delay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_delay_flg_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[split_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_split_flg_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pre_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pre_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_hm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_avl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_delay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_delay_flg_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[split_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_split_flg_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pre_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pre_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_hm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_avl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == AllocDtlTable) doAllocDtl_NE(info);
		else if (ne == AllocExDtlTable) doAllocExDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == columnAllocDtl_prms_delay_flg) doAllocDtl_prms_delay_flg_NE(info);
		else if (ne == columnAllocDtl_split_flg) doAllocDtl_split_flg_NE(info);
		else if (ne == columnAllocDtl_pre_alloc_prio) doAllocDtl_pre_alloc_prio_NE(info);
		else if (ne == columnAllocDtl_alloc_prio) doAllocDtl_alloc_prio_NE(info);
		else if (ne == columnAllocDtl_trd_cd) doAllocDtl_trd_cd_NE(info);
		else if (ne == columnAllocDtl_trd_nm) doAllocDtl_trd_nm_NE(info);
		else if (ne == columnAllocDtl_trd_ptn_typ) doAllocDtl_trd_ptn_typ_NE(info);
		else if (ne == columnAllocDtl_slo_no) doAllocDtl_slo_no_NE(info);
		else if (ne == columnAllocDtl_slo_d_no) doAllocDtl_slo_d_no_NE(info);
		else if (ne == columnAllocDtl_xfr_schd_no) doAllocDtl_xfr_schd_no_NE(info);
		else if (ne == columnAllocDtl_iv_no) doAllocDtl_iv_no_NE(info);
		else if (ne == columnAllocDtl_ship_schd_no) doAllocDtl_ship_schd_no_NE(info);
		else if (ne == columnAllocDtl_alloc_typ) doAllocDtl_alloc_typ_NE(info);
		else if (ne == columnAllocDtl_alloc_typ_nm) doAllocDtl_alloc_typ_nm_NE(info);
		else if (ne == columnAllocDtl_pr_sts_typ) doAllocDtl_pr_sts_typ_NE(info);
		else if (ne == columnAllocDtl_pr_sts_typ_nm) doAllocDtl_pr_sts_typ_nm_NE(info);
		else if (ne == columnAllocDtl_ship_schd_dt) doAllocDtl_ship_schd_dt_NE(info);
		else if (ne == columnAllocDtl_ship_schd_hm) doAllocDtl_ship_schd_hm_NE(info);
		else if (ne == columnAllocDtl_prms_dlv_dt) doAllocDtl_prms_dlv_dt_NE(info);
		else if (ne == columnAllocDtl_prms_dlv_hm) doAllocDtl_prms_dlv_hm_NE(info);
		else if (ne == columnAllocDtl_cst_cd) doAllocDtl_cst_cd_NE(info);
		else if (ne == columnAllocDtl_cst_nm) doAllocDtl_cst_nm_NE(info);
		else if (ne == columnAllocDtl_cst_po_no) doAllocDtl_cst_po_no_NE(info);
		else if (ne == columnAllocDtl_dlv_id_typ) doAllocDtl_dlv_id_typ_NE(info);
		else if (ne == columnAllocDtl_dlv_id_typ_nm) doAllocDtl_dlv_id_typ_nm_NE(info);
		else if (ne == columnAllocDtl_dlv_id_cd) doAllocDtl_dlv_id_cd_NE(info);
		else if (ne == columnAllocDtl_dlv_id_nm) doAllocDtl_dlv_id_nm_NE(info);
		else if (ne == columnAllocDtl_loc_cd) doAllocDtl_loc_cd_NE(info);
		else if (ne == columnAllocDtl_loc_nm) doAllocDtl_loc_nm_NE(info);
		else if (ne == columnAllocDtl_rqst_dpt_cd) doAllocDtl_rqst_dpt_cd_NE(info);
		else if (ne == columnAllocDtl_rqst_dpt_nm) doAllocDtl_rqst_dpt_nm_NE(info);
		else if (ne == columnAllocDtl_base_unit_cd) doAllocDtl_base_unit_cd_NE(info);
		else if (ne == columnAllocDtl_base_unit_nm) doAllocDtl_base_unit_nm_NE(info);
		else if (ne == columnAllocDtl_base_unit_dec_place) doAllocDtl_base_unit_dec_place_NE(info);
		else if (ne == columnAllocDtl_avl_schd_dt) doAllocDtl_avl_schd_dt_NE(info);
		else if (ne == columnAllocDtl_intr_rmrks) doAllocDtl_intr_rmrks_NE(info);
		else if (ne == columnAllocDtl_intr_d_rmrks) doAllocDtl_intr_d_rmrks_NE(info);
		else if (ne == columnAllocExDtl_prms_delay_flg) doAllocExDtl_prms_delay_flg_NE(info);
		else if (ne == columnAllocExDtl_split_flg) doAllocExDtl_split_flg_NE(info);
		else if (ne == columnAllocExDtl_pre_alloc_prio) doAllocExDtl_pre_alloc_prio_NE(info);
		else if (ne == columnAllocExDtl_alloc_prio) doAllocExDtl_alloc_prio_NE(info);
		else if (ne == columnAllocExDtl_trd_cd) doAllocExDtl_trd_cd_NE(info);
		else if (ne == columnAllocExDtl_trd_nm) doAllocExDtl_trd_nm_NE(info);
		else if (ne == columnAllocExDtl_trd_ptn_typ) doAllocExDtl_trd_ptn_typ_NE(info);
		else if (ne == columnAllocExDtl_slo_no) doAllocExDtl_slo_no_NE(info);
		else if (ne == columnAllocExDtl_slo_d_no) doAllocExDtl_slo_d_no_NE(info);
		else if (ne == columnAllocExDtl_xfr_schd_no) doAllocExDtl_xfr_schd_no_NE(info);
		else if (ne == columnAllocExDtl_iv_no) doAllocExDtl_iv_no_NE(info);
		else if (ne == columnAllocExDtl_ship_schd_no) doAllocExDtl_ship_schd_no_NE(info);
		else if (ne == columnAllocExDtl_alloc_typ) doAllocExDtl_alloc_typ_NE(info);
		else if (ne == columnAllocExDtl_alloc_typ_nm) doAllocExDtl_alloc_typ_nm_NE(info);
		else if (ne == columnAllocExDtl_pr_sts_typ) doAllocExDtl_pr_sts_typ_NE(info);
		else if (ne == columnAllocExDtl_pr_sts_typ_nm) doAllocExDtl_pr_sts_typ_nm_NE(info);
		else if (ne == columnAllocExDtl_ship_schd_dt) doAllocExDtl_ship_schd_dt_NE(info);
		else if (ne == columnAllocExDtl_ship_schd_hm) doAllocExDtl_ship_schd_hm_NE(info);
		else if (ne == columnAllocExDtl_prms_dlv_dt) doAllocExDtl_prms_dlv_dt_NE(info);
		else if (ne == columnAllocExDtl_prms_dlv_hm) doAllocExDtl_prms_dlv_hm_NE(info);
		else if (ne == columnAllocExDtl_cst_cd) doAllocExDtl_cst_cd_NE(info);
		else if (ne == columnAllocExDtl_cst_nm) doAllocExDtl_cst_nm_NE(info);
		else if (ne == columnAllocExDtl_cst_po_no) doAllocExDtl_cst_po_no_NE(info);
		else if (ne == columnAllocExDtl_dlv_id_typ) doAllocExDtl_dlv_id_typ_NE(info);
		else if (ne == columnAllocExDtl_dlv_id_typ_nm) doAllocExDtl_dlv_id_typ_nm_NE(info);
		else if (ne == columnAllocExDtl_dlv_id_cd) doAllocExDtl_dlv_id_cd_NE(info);
		else if (ne == columnAllocExDtl_dlv_id_nm) doAllocExDtl_dlv_id_nm_NE(info);
		else if (ne == columnAllocExDtl_loc_cd) doAllocExDtl_loc_cd_NE(info);
		else if (ne == columnAllocExDtl_loc_nm) doAllocExDtl_loc_nm_NE(info);
		else if (ne == columnAllocExDtl_rqst_dpt_cd) doAllocExDtl_rqst_dpt_cd_NE(info);
		else if (ne == columnAllocExDtl_rqst_dpt_nm) doAllocExDtl_rqst_dpt_nm_NE(info);
		else if (ne == columnAllocExDtl_base_unit_cd) doAllocExDtl_base_unit_cd_NE(info);
		else if (ne == columnAllocExDtl_base_unit_nm) doAllocExDtl_base_unit_nm_NE(info);
		else if (ne == columnAllocExDtl_base_unit_dec_place) doAllocExDtl_base_unit_dec_place_NE(info);
		else if (ne == columnAllocExDtl_avl_schd_dt) doAllocExDtl_avl_schd_dt_NE(info);
		else if (ne == columnAllocExDtl_intr_rmrks) doAllocExDtl_intr_rmrks_NE(info);
		else if (ne == columnAllocExDtl_intr_d_rmrks) doAllocExDtl_intr_d_rmrks_NE(info);
	}

	/**
	 * [AllocDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [AllocDtl]パネルの[prms_delay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_delay_flg_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[split_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_split_flg_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pre_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pre_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_hm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_avl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_delay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_delay_flg_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[split_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_split_flg_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pre_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pre_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_hm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_avl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == AllocDtlTable) doAllocDtl_NX(info);
		else if (nx == AllocExDtlTable) doAllocExDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == columnAllocDtl_prms_delay_flg) doAllocDtl_prms_delay_flg_NX(info);
		else if (nx == columnAllocDtl_split_flg) doAllocDtl_split_flg_NX(info);
		else if (nx == columnAllocDtl_pre_alloc_prio) doAllocDtl_pre_alloc_prio_NX(info);
		else if (nx == columnAllocDtl_alloc_prio) doAllocDtl_alloc_prio_NX(info);
		else if (nx == columnAllocDtl_trd_cd) doAllocDtl_trd_cd_NX(info);
		else if (nx == columnAllocDtl_trd_nm) doAllocDtl_trd_nm_NX(info);
		else if (nx == columnAllocDtl_trd_ptn_typ) doAllocDtl_trd_ptn_typ_NX(info);
		else if (nx == columnAllocDtl_slo_no) doAllocDtl_slo_no_NX(info);
		else if (nx == columnAllocDtl_slo_d_no) doAllocDtl_slo_d_no_NX(info);
		else if (nx == columnAllocDtl_xfr_schd_no) doAllocDtl_xfr_schd_no_NX(info);
		else if (nx == columnAllocDtl_iv_no) doAllocDtl_iv_no_NX(info);
		else if (nx == columnAllocDtl_ship_schd_no) doAllocDtl_ship_schd_no_NX(info);
		else if (nx == columnAllocDtl_alloc_typ) doAllocDtl_alloc_typ_NX(info);
		else if (nx == columnAllocDtl_alloc_typ_nm) doAllocDtl_alloc_typ_nm_NX(info);
		else if (nx == columnAllocDtl_pr_sts_typ) doAllocDtl_pr_sts_typ_NX(info);
		else if (nx == columnAllocDtl_pr_sts_typ_nm) doAllocDtl_pr_sts_typ_nm_NX(info);
		else if (nx == columnAllocDtl_ship_schd_dt) doAllocDtl_ship_schd_dt_NX(info);
		else if (nx == columnAllocDtl_ship_schd_hm) doAllocDtl_ship_schd_hm_NX(info);
		else if (nx == columnAllocDtl_prms_dlv_dt) doAllocDtl_prms_dlv_dt_NX(info);
		else if (nx == columnAllocDtl_prms_dlv_hm) doAllocDtl_prms_dlv_hm_NX(info);
		else if (nx == columnAllocDtl_cst_cd) doAllocDtl_cst_cd_NX(info);
		else if (nx == columnAllocDtl_cst_nm) doAllocDtl_cst_nm_NX(info);
		else if (nx == columnAllocDtl_cst_po_no) doAllocDtl_cst_po_no_NX(info);
		else if (nx == columnAllocDtl_dlv_id_typ) doAllocDtl_dlv_id_typ_NX(info);
		else if (nx == columnAllocDtl_dlv_id_typ_nm) doAllocDtl_dlv_id_typ_nm_NX(info);
		else if (nx == columnAllocDtl_dlv_id_cd) doAllocDtl_dlv_id_cd_NX(info);
		else if (nx == columnAllocDtl_dlv_id_nm) doAllocDtl_dlv_id_nm_NX(info);
		else if (nx == columnAllocDtl_loc_cd) doAllocDtl_loc_cd_NX(info);
		else if (nx == columnAllocDtl_loc_nm) doAllocDtl_loc_nm_NX(info);
		else if (nx == columnAllocDtl_rqst_dpt_cd) doAllocDtl_rqst_dpt_cd_NX(info);
		else if (nx == columnAllocDtl_rqst_dpt_nm) doAllocDtl_rqst_dpt_nm_NX(info);
		else if (nx == columnAllocDtl_base_unit_cd) doAllocDtl_base_unit_cd_NX(info);
		else if (nx == columnAllocDtl_base_unit_nm) doAllocDtl_base_unit_nm_NX(info);
		else if (nx == columnAllocDtl_base_unit_dec_place) doAllocDtl_base_unit_dec_place_NX(info);
		else if (nx == columnAllocDtl_avl_schd_dt) doAllocDtl_avl_schd_dt_NX(info);
		else if (nx == columnAllocDtl_intr_rmrks) doAllocDtl_intr_rmrks_NX(info);
		else if (nx == columnAllocDtl_intr_d_rmrks) doAllocDtl_intr_d_rmrks_NX(info);
		else if (nx == columnAllocExDtl_prms_delay_flg) doAllocExDtl_prms_delay_flg_NX(info);
		else if (nx == columnAllocExDtl_split_flg) doAllocExDtl_split_flg_NX(info);
		else if (nx == columnAllocExDtl_pre_alloc_prio) doAllocExDtl_pre_alloc_prio_NX(info);
		else if (nx == columnAllocExDtl_alloc_prio) doAllocExDtl_alloc_prio_NX(info);
		else if (nx == columnAllocExDtl_trd_cd) doAllocExDtl_trd_cd_NX(info);
		else if (nx == columnAllocExDtl_trd_nm) doAllocExDtl_trd_nm_NX(info);
		else if (nx == columnAllocExDtl_trd_ptn_typ) doAllocExDtl_trd_ptn_typ_NX(info);
		else if (nx == columnAllocExDtl_slo_no) doAllocExDtl_slo_no_NX(info);
		else if (nx == columnAllocExDtl_slo_d_no) doAllocExDtl_slo_d_no_NX(info);
		else if (nx == columnAllocExDtl_xfr_schd_no) doAllocExDtl_xfr_schd_no_NX(info);
		else if (nx == columnAllocExDtl_iv_no) doAllocExDtl_iv_no_NX(info);
		else if (nx == columnAllocExDtl_ship_schd_no) doAllocExDtl_ship_schd_no_NX(info);
		else if (nx == columnAllocExDtl_alloc_typ) doAllocExDtl_alloc_typ_NX(info);
		else if (nx == columnAllocExDtl_alloc_typ_nm) doAllocExDtl_alloc_typ_nm_NX(info);
		else if (nx == columnAllocExDtl_pr_sts_typ) doAllocExDtl_pr_sts_typ_NX(info);
		else if (nx == columnAllocExDtl_pr_sts_typ_nm) doAllocExDtl_pr_sts_typ_nm_NX(info);
		else if (nx == columnAllocExDtl_ship_schd_dt) doAllocExDtl_ship_schd_dt_NX(info);
		else if (nx == columnAllocExDtl_ship_schd_hm) doAllocExDtl_ship_schd_hm_NX(info);
		else if (nx == columnAllocExDtl_prms_dlv_dt) doAllocExDtl_prms_dlv_dt_NX(info);
		else if (nx == columnAllocExDtl_prms_dlv_hm) doAllocExDtl_prms_dlv_hm_NX(info);
		else if (nx == columnAllocExDtl_cst_cd) doAllocExDtl_cst_cd_NX(info);
		else if (nx == columnAllocExDtl_cst_nm) doAllocExDtl_cst_nm_NX(info);
		else if (nx == columnAllocExDtl_cst_po_no) doAllocExDtl_cst_po_no_NX(info);
		else if (nx == columnAllocExDtl_dlv_id_typ) doAllocExDtl_dlv_id_typ_NX(info);
		else if (nx == columnAllocExDtl_dlv_id_typ_nm) doAllocExDtl_dlv_id_typ_nm_NX(info);
		else if (nx == columnAllocExDtl_dlv_id_cd) doAllocExDtl_dlv_id_cd_NX(info);
		else if (nx == columnAllocExDtl_dlv_id_nm) doAllocExDtl_dlv_id_nm_NX(info);
		else if (nx == columnAllocExDtl_loc_cd) doAllocExDtl_loc_cd_NX(info);
		else if (nx == columnAllocExDtl_loc_nm) doAllocExDtl_loc_nm_NX(info);
		else if (nx == columnAllocExDtl_rqst_dpt_cd) doAllocExDtl_rqst_dpt_cd_NX(info);
		else if (nx == columnAllocExDtl_rqst_dpt_nm) doAllocExDtl_rqst_dpt_nm_NX(info);
		else if (nx == columnAllocExDtl_base_unit_cd) doAllocExDtl_base_unit_cd_NX(info);
		else if (nx == columnAllocExDtl_base_unit_nm) doAllocExDtl_base_unit_nm_NX(info);
		else if (nx == columnAllocExDtl_base_unit_dec_place) doAllocExDtl_base_unit_dec_place_NX(info);
		else if (nx == columnAllocExDtl_avl_schd_dt) doAllocExDtl_avl_schd_dt_NX(info);
		else if (nx == columnAllocExDtl_intr_rmrks) doAllocExDtl_intr_rmrks_NX(info);
		else if (nx == columnAllocExDtl_intr_d_rmrks) doAllocExDtl_intr_d_rmrks_NX(info);
	}

	/**
	 * [AllocDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [AllocDtl]パネルの[prms_delay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_delay_flg_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[split_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_split_flg_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pre_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pre_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_hm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_avl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_delay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_delay_flg_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[split_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_split_flg_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pre_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pre_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_hm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_avl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == columnAllocDtl_pre_alloc_prio) doAllocDtl_pre_alloc_prio_LC(info);
		else if (lc == columnAllocDtl_alloc_prio) doAllocDtl_alloc_prio_LC(info);
		else if (lc == columnAllocDtl_trd_cd) doAllocDtl_trd_cd_LC(info);
		else if (lc == columnAllocDtl_trd_nm) doAllocDtl_trd_nm_LC(info);
		else if (lc == columnAllocDtl_trd_ptn_typ) doAllocDtl_trd_ptn_typ_LC(info);
		else if (lc == columnAllocDtl_slo_no) doAllocDtl_slo_no_LC(info);
		else if (lc == columnAllocDtl_slo_d_no) doAllocDtl_slo_d_no_LC(info);
		else if (lc == columnAllocDtl_xfr_schd_no) doAllocDtl_xfr_schd_no_LC(info);
		else if (lc == columnAllocDtl_iv_no) doAllocDtl_iv_no_LC(info);
		else if (lc == columnAllocDtl_ship_schd_no) doAllocDtl_ship_schd_no_LC(info);
		else if (lc == columnAllocDtl_alloc_typ) doAllocDtl_alloc_typ_LC(info);
		else if (lc == columnAllocDtl_alloc_typ_nm) doAllocDtl_alloc_typ_nm_LC(info);
		else if (lc == columnAllocDtl_pr_sts_typ) doAllocDtl_pr_sts_typ_LC(info);
		else if (lc == columnAllocDtl_pr_sts_typ_nm) doAllocDtl_pr_sts_typ_nm_LC(info);
		else if (lc == columnAllocDtl_ship_schd_dt) doAllocDtl_ship_schd_dt_LC(info);
		else if (lc == columnAllocDtl_ship_schd_hm) doAllocDtl_ship_schd_hm_LC(info);
		else if (lc == columnAllocDtl_prms_dlv_dt) doAllocDtl_prms_dlv_dt_LC(info);
		else if (lc == columnAllocDtl_prms_dlv_hm) doAllocDtl_prms_dlv_hm_LC(info);
		else if (lc == columnAllocDtl_cst_cd) doAllocDtl_cst_cd_LC(info);
		else if (lc == columnAllocDtl_cst_nm) doAllocDtl_cst_nm_LC(info);
		else if (lc == columnAllocDtl_cst_po_no) doAllocDtl_cst_po_no_LC(info);
		else if (lc == columnAllocDtl_dlv_id_typ) doAllocDtl_dlv_id_typ_LC(info);
		else if (lc == columnAllocDtl_dlv_id_typ_nm) doAllocDtl_dlv_id_typ_nm_LC(info);
		else if (lc == columnAllocDtl_dlv_id_cd) doAllocDtl_dlv_id_cd_LC(info);
		else if (lc == columnAllocDtl_dlv_id_nm) doAllocDtl_dlv_id_nm_LC(info);
		else if (lc == columnAllocDtl_loc_cd) doAllocDtl_loc_cd_LC(info);
		else if (lc == columnAllocDtl_loc_nm) doAllocDtl_loc_nm_LC(info);
		else if (lc == columnAllocDtl_rqst_dpt_cd) doAllocDtl_rqst_dpt_cd_LC(info);
		else if (lc == columnAllocDtl_rqst_dpt_nm) doAllocDtl_rqst_dpt_nm_LC(info);
		else if (lc == columnAllocDtl_base_unit_cd) doAllocDtl_base_unit_cd_LC(info);
		else if (lc == columnAllocDtl_base_unit_nm) doAllocDtl_base_unit_nm_LC(info);
		else if (lc == columnAllocDtl_base_unit_dec_place) doAllocDtl_base_unit_dec_place_LC(info);
		else if (lc == columnAllocDtl_avl_schd_dt) doAllocDtl_avl_schd_dt_LC(info);
		else if (lc == columnAllocDtl_intr_rmrks) doAllocDtl_intr_rmrks_LC(info);
		else if (lc == columnAllocDtl_intr_d_rmrks) doAllocDtl_intr_d_rmrks_LC(info);
		else if (lc == columnAllocExDtl_pre_alloc_prio) doAllocExDtl_pre_alloc_prio_LC(info);
		else if (lc == columnAllocExDtl_alloc_prio) doAllocExDtl_alloc_prio_LC(info);
		else if (lc == columnAllocExDtl_trd_cd) doAllocExDtl_trd_cd_LC(info);
		else if (lc == columnAllocExDtl_trd_nm) doAllocExDtl_trd_nm_LC(info);
		else if (lc == columnAllocExDtl_trd_ptn_typ) doAllocExDtl_trd_ptn_typ_LC(info);
		else if (lc == columnAllocExDtl_slo_no) doAllocExDtl_slo_no_LC(info);
		else if (lc == columnAllocExDtl_slo_d_no) doAllocExDtl_slo_d_no_LC(info);
		else if (lc == columnAllocExDtl_xfr_schd_no) doAllocExDtl_xfr_schd_no_LC(info);
		else if (lc == columnAllocExDtl_iv_no) doAllocExDtl_iv_no_LC(info);
		else if (lc == columnAllocExDtl_ship_schd_no) doAllocExDtl_ship_schd_no_LC(info);
		else if (lc == columnAllocExDtl_alloc_typ) doAllocExDtl_alloc_typ_LC(info);
		else if (lc == columnAllocExDtl_alloc_typ_nm) doAllocExDtl_alloc_typ_nm_LC(info);
		else if (lc == columnAllocExDtl_pr_sts_typ) doAllocExDtl_pr_sts_typ_LC(info);
		else if (lc == columnAllocExDtl_pr_sts_typ_nm) doAllocExDtl_pr_sts_typ_nm_LC(info);
		else if (lc == columnAllocExDtl_ship_schd_dt) doAllocExDtl_ship_schd_dt_LC(info);
		else if (lc == columnAllocExDtl_ship_schd_hm) doAllocExDtl_ship_schd_hm_LC(info);
		else if (lc == columnAllocExDtl_prms_dlv_dt) doAllocExDtl_prms_dlv_dt_LC(info);
		else if (lc == columnAllocExDtl_prms_dlv_hm) doAllocExDtl_prms_dlv_hm_LC(info);
		else if (lc == columnAllocExDtl_cst_cd) doAllocExDtl_cst_cd_LC(info);
		else if (lc == columnAllocExDtl_cst_nm) doAllocExDtl_cst_nm_LC(info);
		else if (lc == columnAllocExDtl_cst_po_no) doAllocExDtl_cst_po_no_LC(info);
		else if (lc == columnAllocExDtl_dlv_id_typ) doAllocExDtl_dlv_id_typ_LC(info);
		else if (lc == columnAllocExDtl_dlv_id_typ_nm) doAllocExDtl_dlv_id_typ_nm_LC(info);
		else if (lc == columnAllocExDtl_dlv_id_cd) doAllocExDtl_dlv_id_cd_LC(info);
		else if (lc == columnAllocExDtl_dlv_id_nm) doAllocExDtl_dlv_id_nm_LC(info);
		else if (lc == columnAllocExDtl_loc_cd) doAllocExDtl_loc_cd_LC(info);
		else if (lc == columnAllocExDtl_loc_nm) doAllocExDtl_loc_nm_LC(info);
		else if (lc == columnAllocExDtl_rqst_dpt_cd) doAllocExDtl_rqst_dpt_cd_LC(info);
		else if (lc == columnAllocExDtl_rqst_dpt_nm) doAllocExDtl_rqst_dpt_nm_LC(info);
		else if (lc == columnAllocExDtl_base_unit_cd) doAllocExDtl_base_unit_cd_LC(info);
		else if (lc == columnAllocExDtl_base_unit_nm) doAllocExDtl_base_unit_nm_LC(info);
		else if (lc == columnAllocExDtl_base_unit_dec_place) doAllocExDtl_base_unit_dec_place_LC(info);
		else if (lc == columnAllocExDtl_avl_schd_dt) doAllocExDtl_avl_schd_dt_LC(info);
		else if (lc == columnAllocExDtl_intr_rmrks) doAllocExDtl_intr_rmrks_LC(info);
		else if (lc == columnAllocExDtl_intr_d_rmrks) doAllocExDtl_intr_d_rmrks_LC(info);
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
	 * [AllocDtl]パネルの[pre_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pre_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[alloc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_alloc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[ship_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_ship_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[prms_dlv_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_prms_dlv_hm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_rqst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_avl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [AllocDtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pre_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pre_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[alloc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_alloc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[ship_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_ship_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[prms_dlv_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_prms_dlv_hm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_rqst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_avl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [AllocExDtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAllocExDtl_intr_d_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0150.Srch01")) {
			return new MS_MSBEL0150_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL0150.Upd01")) {
			return new MS_MSBEL0150_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL0150.Sprt01")) {
			return new MS_MSBEL0150_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0150_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0150_Srch01Bridge() {
			p_MS_MSBEL0150_Srch01 = new MCParam(PDef.MS_MSBEL0150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));

			p_MS_MSBEL0150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0150.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0150.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));
			p_MS_MSBEL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0150_Srch01;
		}

		protected void show() {
			setAllocDtlL((MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)p_MS_MSBEL0150_Srch01.getContainerParam().getDownBlock(0));
			setAllocExDtlL((MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)p_MS_MSBEL0150_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getAllocDtlL().clear();
			getAllocExDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getAllocDtlL());
			result.add(getAllocExDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL0150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0150_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0150_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL0150_Upd01Bridge() {
			p_MS_MSBEL0150_Upd01 = new MCParam(PDef.MS_MSBEL0150_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0150_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));
			// Down

			p_MS_MSBEL0150_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0150_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0150_Upd01.addUpBlock(getAllocDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0150_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0150_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL0150_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getAllocDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL0150_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0150_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0150_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL0150_Sprt01Bridge() {
			p_MS_MSBEL0150_Sprt01 = new MCParam(PDef.MS_MSBEL0150_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0150_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));

			p_MS_MSBEL0150_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0150_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0150_Sprt01.addUpBlock(getAllocDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0150_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0150_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0150_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0150.AllocDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0150_Sprt01;
		}

		protected void show() {
			setAllocDtlL((MCList<mcframe.clientMSBE.MSBEP0150.AllocDtlR>)p_MS_MSBEL0150_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getAllocDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getAllocDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getAllocDtlL());
			return result;
		}
	}
}