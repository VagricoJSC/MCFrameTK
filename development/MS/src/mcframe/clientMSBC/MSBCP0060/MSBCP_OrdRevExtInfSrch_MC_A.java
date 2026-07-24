package mcframe.clientMSBC.MSBCP0060;

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
import mcframe.clientMSBC.MSBCP0060.MSBCP_OrdRevExtInfSrch_MC.MS_MSBCL0060_Srch01Caller;

/**
 * 画面"MSBCP_OrdRevExtInfSrch"パネルクラスです。<p>
 *
 * 所要量計算によって算出された引当予定を元にオーダの関連を逆展開して照会する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_OrdRevExtInfSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0060";

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
	 * ORD,Item order,0;STK,Inventory,1 ORD,品目オーダ,0;STK,在庫,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_ORD = null;
	public MCRadioButton Cnd_ope_STK = null;
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	public MCLabel Cnd_strg_loc_cd_Label = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H Cnd_lot_no_p_PPanel;
	public MCTextField Cnd_lot_no;	// [Cnd]の[lot_no_p.lot_no]を[Cnd_lot_no]としてエイリアス定義。
	public MCTextComboBox Cnd_sublot_no;	// [Cnd]の[lot_no_p.sublot_no]を[Cnd_sublot_no]としてエイリアス定義。
	public MCLabel Cnd_max_hrrchy_Label = null;
	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public MCNumberField Cnd_max_hrrchy = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCTextField Cnd_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCTextField Cnd_sublot_mng_typ = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Explode all 全展開する.<p>
	 *
	 */
	public MCButton RPnl_srch_all = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMSBC.MSBCP0060.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Rslt_hrrchy_p_PPanel;
	public MCColumnConfig columnRslt_extno;// [Rslt]の[hrrchy_p.extno]を[columnRslt_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_extno;// [Rslt]の[hrrchy_p.par_extno]を[columnRslt_par_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_loop_flg;// [Rslt]の[hrrchy_p.loop_flg]を[columnRslt_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_leaf_str;// [Rslt]の[hrrchy_p.leaf_str]を[columnRslt_leaf_str]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * Data データ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_ext_dat_typ_nm = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_ext_dat_no = null;
	/**
	 * Storage location/delivery destination cd. 格納場所／納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_dlv_cd = null;
	/**
	 * Storage location name/delivery destination name 格納場所名／納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_dlv_nm = null;
	/**
	 * Transaction location/BP cd. 取引場所／取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_loc_bp_cd = null;
	/**
	 * Transaction location name/BP name 取引場所名／取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_loc_bp_nm = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_alloc_qty_p_PPanel;
	public MCColumnConfig columnRslt_schd_alloc_qty;// [Rslt]の[schd_alloc_qty_p.qty]を[columnRslt_schd_alloc_qty]としてエイリアス定義。
	/**
	 * Scheduled storage date 格納予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_schd_dt = null;
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_avl_schd_dt = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_no = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_nm = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ = null;
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ_nm = null;
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
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_fix_flg = null;
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_blk_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_inst_qty;// [Rslt]の[inst_qty_p.qty]を[columnRslt_inst_qty]としてエイリアス定義。
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
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ptn = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_yield_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_yield_schd_qty;// [Rslt]の[yield_schd_qty_p.qty]を[columnRslt_yield_schd_qty]としてエイリアス定義。
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_st_schd_dt = null;
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_end_schd_dt = null;
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_nm = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_schd_dt = null;
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accpt_schd_dt = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_nm = null;
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_schd_dt = null;
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_st_schd_dt = null;
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_end_schd_dt = null;
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
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_no = null;
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
	 * GR/GI schedule status 受払予定状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type name 受払予定状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_pack_unit_qty;// [Rslt]の[pack_unit_qty_p.qty]を[columnRslt_pack_unit_qty]としてエイリアス定義。
	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_loc_cd = null;
	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_loc_nm = null;
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
	 * Remarks 備考.<p>
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
	public MCColumnGroup cgRslt_rqmt = null;
	public MCColumnGroup cgRslt_ord = null;
	public MCColumnGroup cgRslt_mfg = null;
	public MCColumnGroup cgRslt_purc = null;
	public MCColumnGroup cgRslt_xfr = null;
	public MCColumnGroup cgRslt_insp = null;
	public MCColumnGroup cgRslt_slo = null;
	public MCColumnGroup cgRslt_io_schd_stk = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Order explosion オーダ展開情報照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0070 = null;
	/**
	 * Inventory forecasting list 在庫推移照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0060 = null;
	/**
	 * Item order progress 品目オーダ進捗一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0080 = null;
	/**
	 * Sales order list 受注一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1220 = null;
	/** [SRCH_ORD]モードを表す定数 */
	public static final String SRCH_ORD = "SRCH_ORD";
	/** [SRCH_STK]モードを表す定数 */
	public static final String SRCH_STK = "SRCH_STK";
	/** [REF_ORD]モードを表す定数 */
	public static final String REF_ORD = "REF_ORD";
	/** [REF_STK]モードを表す定数 */
	public static final String REF_STK = "REF_STK";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_ORD, SRCH_STK, REF_ORD, REF_STK};
	
	/** [MS_MSBCL0060_Srch01]のCallerの作成 */
	protected MSBCP_OrdRevExtInfSrch_MC.MS_MSBCL0060_Srch01Caller createMS_MSBCL0060_Srch01() {
		MSBCP_OrdRevExtInfSrch_MC.MS_MSBCL0060_Srch01Caller<MSBCP_OrdRevExtInfSrch, MS_MSBCL0060_Srch01Bridge>
		caller = ((MSBCP_OrdRevExtInfSrch_MC)this).new MS_MSBCL0060_Srch01Caller<MSBCP_OrdRevExtInfSrch, MS_MSBCL0060_Srch01Bridge>(
					(MSBCP_OrdRevExtInfSrch)this, new MS_MSBCL0060_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0060_Srch01]の呼び出し */
	protected void callMS_MSBCL0060_Srch01() {
		MCCaller caller = createMS_MSBCL0060_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0060.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0060.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0060.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0060.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0060.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0060.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0060.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0060.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0060.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0060.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createColumnGroupTable("Rslt.table");
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
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OrdRevExtInfSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_OrdRevExtInfSrch_MC_A(String name) {
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
		MSBCP_OrdRevExtInfSrch_MC.jbCreateScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateTop((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateFold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateCnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateCtrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateRPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateRslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbCreateBtn((MSBCP_OrdRevExtInfSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_OrdRevExtInfSrch p) {
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
		p.Cnd_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.create(p.getCndR().lot_no_p());
		p.Cnd_lot_no_p_PPanel.setName("Cnd.lot_no_p");
		p.Cnd_lot_no = p.Cnd_lot_no_p_PPanel.LotNo_lot_no;
		p.Cnd_lot_no.addAliasName("Cnd.lot_no", p);
		p.Cnd_sublot_no = p.Cnd_lot_no_p_PPanel.LotNo_sublot_no;
		p.Cnd_sublot_no.addAliasName("Cnd.sublot_no", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_OrdRevExtInfSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_OrdRevExtInfSrch p) {
		p.Rslt_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$hrrchy_p);
		p.Rslt_hrrchy_p_PPanel.setName("Rslt.hrrchy_p");
		p.columnRslt_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_extno;
		p.columnRslt_extno.addAliasName("Rslt.extno", p);
		p.columnRslt_par_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnRslt_par_extno.addAliasName("Rslt.par_extno", p);
		p.columnRslt_loop_flg = p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnRslt_loop_flg.addAliasName("Rslt.loop_flg", p);
		p.columnRslt_leaf_str = p.Rslt_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnRslt_leaf_str.addAliasName("Rslt.leaf_str", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$itm_p);
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
		p.Rslt_schd_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$schd_alloc_qty_p);
		p.Rslt_schd_alloc_qty_p_PPanel.setName("Rslt.schd_alloc_qty_p");
		p.columnRslt_schd_alloc_qty = p.Rslt_schd_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRslt_schd_alloc_qty.addAliasName("Rslt.schd_alloc_qty", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$sno_wrk_no_p);
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
		p.Rslt_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$inst_qty_p);
		p.Rslt_inst_qty_p_PPanel.setName("Rslt.inst_qty_p");
		p.columnRslt_inst_qty = p.Rslt_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_inst_qty.addAliasName("Rslt.inst_qty", p);
		p.Rslt_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$yield_schd_qty_p);
		p.Rslt_yield_schd_qty_p_PPanel.setName("Rslt.yield_schd_qty_p");
		p.columnRslt_yield_schd_qty = p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_yield_schd_qty.addAliasName("Rslt.yield_schd_qty", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0060.RsltR.$pack_unit_qty_p);
		p.Rslt_pack_unit_qty_p_PPanel.setName("Rslt.pack_unit_qty_p");
		p.columnRslt_pack_unit_qty = p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pack_unit_qty.addAliasName("Rslt.pack_unit_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_OrdRevExtInfSrch p) {
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

	
	/** [Cnd_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_cd_p = null;

	/**
	 * [Cnd_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_cd_ListPutter() {
		if (Cnd_strg_loc_cd_p == null) {
			Cnd_strg_loc_cd_p = createCnd_strg_loc_cd_ListPutter(Cnd_strg_loc_cd, "strg_loc_cd", "strg_loc_nm");

		}
		return Cnd_strg_loc_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","sublot_mng_typ");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","lot_mng_typ","sublot_mng_typ");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","lot_mng_typ","sublot_mng_typ");
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
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","lot_mng_typ","sublot_mng_typ");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OrdRevExtInfSrch create(){
		MSBCP_OrdRevExtInfSrch p = new MSBCP_OrdRevExtInfSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OrdRevExtInfSrch create(String name){
		MSBCP_OrdRevExtInfSrch p = new MSBCP_OrdRevExtInfSrch(name);
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
		MSBCP_OrdRevExtInfSrch_MC.jbfInitScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitTop((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitFold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitCnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitCtrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitRPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitRslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbfInitBtn((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitTop((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitFold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitCnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitCtrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitRPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitRslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.jbInitBtn((MSBCP_OrdRevExtInfSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_ORD = p.beansFactory.createRadioButton("Cnd.ope_ORD");
		p.Cnd_ope_STK = p.beansFactory.createRadioButton("Cnd.ope_STK");
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_strg_loc_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_cd_Label");
		p.Cnd_strg_loc_cd = p.beansFactory.createTextField("Cnd.strg_loc_cd");
		p.Cnd_strg_loc_cd.setLabel(p.Cnd_strg_loc_cd_Label);
		p.Cnd_strg_loc_nm = p.beansFactory.createTextField("Cnd.strg_loc_nm");
		p.Cnd_max_hrrchy_Label = p.beansFactory.createLabel("Cnd.max_hrrchy_Label");
		p.Cnd_max_hrrchy = p.beansFactory.createNumberField("Cnd.max_hrrchy");
		p.Cnd_max_hrrchy.setLabel(p.Cnd_max_hrrchy_Label);
		p.Cnd_lot_mng_typ = p.beansFactory.createTextField("Cnd.lot_mng_typ");
		p.Cnd_sublot_mng_typ = p.beansFactory.createTextField("Cnd.sublot_mng_typ");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_all = p.beansFactory.createButton("RPnl.srch_all", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_ord_ext_dat_typ_nm = p.beansFactory.createTableColumn("Rslt.ord_ext_dat_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ord_ext_dat_no = p.beansFactory.createTableColumn("Rslt.ord_ext_dat_no", MCColumnType.TEXT);
		p.columnRslt_strg_dlv_cd = p.beansFactory.createTableColumn("Rslt.strg_dlv_cd", MCColumnType.TEXT);
		p.columnRslt_strg_dlv_nm = p.beansFactory.createTableColumn("Rslt.strg_dlv_nm", MCColumnType.TEXT);
		p.columnRslt_trd_loc_bp_cd = p.beansFactory.createTableColumn("Rslt.trd_loc_bp_cd", MCColumnType.TEXT);
		p.columnRslt_trd_loc_bp_nm = p.beansFactory.createTableColumn("Rslt.trd_loc_bp_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_dec_place = p.beansFactory.createTableColumn("Rslt.base_dec_place", MCColumnType.NUMBER);
		p.columnRslt_strg_schd_dt = p.beansFactory.createTableColumn("Rslt.strg_schd_dt", MCColumnType.DATE);
		p.columnRslt_avl_schd_dt = p.beansFactory.createTableColumn("Rslt.avl_schd_dt", MCColumnType.DATE);
		p.columnRslt_rqmt_no = p.beansFactory.createTableColumn("Rslt.rqmt_no", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_not_fix_flg = p.beansFactory.createTableColumn("Rslt.not_fix_flg", MCColumnType.CHECK);
		p.columnRslt_blk_flg = p.beansFactory.createTableColumn("Rslt.blk_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_ptn = p.beansFactory.createTableColumn("Rslt.oper_ptn", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_mfg_st_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_mfg_end_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_po_schd_dt = p.beansFactory.createTableColumn("Rslt.po_schd_dt", MCColumnType.DATE);
		p.columnRslt_accpt_schd_dt = p.beansFactory.createTableColumn("Rslt.accpt_schd_dt", MCColumnType.DATE);
		p.columnRslt_rqst_loc_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_cd = p.beansFactory.createTableColumn("Rslt.rqst_wg_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_nm = p.beansFactory.createTableColumn("Rslt.rqst_wg_nm", MCColumnType.TEXT);
		p.columnRslt_gi_schd_dt = p.beansFactory.createTableColumn("Rslt.gi_schd_dt", MCColumnType.DATE);
		p.columnRslt_insp_st_schd_dt = p.beansFactory.createTableColumn("Rslt.insp_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_insp_end_schd_dt = p.beansFactory.createTableColumn("Rslt.insp_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_nm = p.beansFactory.createTableColumn("Rslt.dlv_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_no = p.beansFactory.createTableColumn("Rslt.io_schd_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_typ = p.beansFactory.createTableColumn("Rslt.io_schd_typ", MCColumnType.TEXT);
		p.columnRslt_io_schd_typ_nm = p.beansFactory.createTableColumn("Rslt.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_sts_typ = p.beansFactory.createTableColumn("Rslt.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRslt_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pack_dec_place = p.beansFactory.createTableColumn("Rslt.pack_dec_place", MCColumnType.NUMBER);
		p.columnRslt_stk_loc_cd = p.beansFactory.createTableColumn("Rslt.stk_loc_cd", MCColumnType.TEXT);
		p.columnRslt_stk_loc_nm = p.beansFactory.createTableColumn("Rslt.stk_loc_nm", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ = p.beansFactory.createTableColumn("Rslt.in_xfr_typ", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ_nm = p.beansFactory.createTableColumn("Rslt.in_xfr_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.cgRslt_rqmt = p.beansFactory.createColumnGroup("Rslt.rqmt");
		p.cgRslt_ord = p.beansFactory.createColumnGroup("Rslt.ord");
		p.cgRslt_mfg = p.beansFactory.createColumnGroup("Rslt.mfg");
		p.cgRslt_purc = p.beansFactory.createColumnGroup("Rslt.purc");
		p.cgRslt_xfr = p.beansFactory.createColumnGroup("Rslt.xfr");
		p.cgRslt_insp = p.beansFactory.createColumnGroup("Rslt.insp");
		p.cgRslt_slo = p.beansFactory.createColumnGroup("Rslt.slo");
		p.cgRslt_io_schd_stk = p.beansFactory.createColumnGroup("Rslt.io_schd_stk");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0070 = p.beansFactory.createButton("Btn.open_MSBCP0070", "open");
		p.Btn_open_MSBEP0060 = p.beansFactory.createButton("Btn.open_MSBEP0060", "open");
		p.Btn_open_MSBCP0080 = p.beansFactory.createButton("Btn.open_MSBCP0080", "open");
		p.Btn_open_MSBBP1220 = p.beansFactory.createButton("Btn.open_MSBBP1220", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_OrdRevExtInfSrch p) {
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
	protected static void jbInitFold(MSBCP_OrdRevExtInfSrch p) {
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
	protected static void jbInitCnd(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_ORD);
		p.Cnd_ope_ORD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_ORD);
		p.ScreenOpePanel.add(p.Cnd_ope_ORD);
		p.Cnd_ope_ORD.setNextBeans(p.Cnd_ope_STK);
		p.Cnd_ope_STK.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_STK);
		p.ScreenOpePanel.add(p.Cnd_ope_STK);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.ope_META);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.CndPanel.setLastBeans(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.itm_ord_no_META);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.strg_loc_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_lot_mng_typ,p.Cnd_sublot_mng_typ);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_lot_mng_typ,p.Cnd_sublot_mng_typ);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3,p.Cnd_lot_mng_typ,p.Cnd_sublot_mng_typ);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm,p.Cnd_lot_mng_typ,p.Cnd_sublot_mng_typ);
		p.CndPanel.add(p.Cnd_lot_no_p_PPanel);
		p.Cnd_lot_no_p_PPanel.setNextBeans(p.Cnd_max_hrrchy);
		p.CndPanel.add(p.Cnd_max_hrrchy_Label);
		p.CndPanel.add(p.Cnd_max_hrrchy);
		p.Cnd_max_hrrchy.setNextBeans(p.Cnd_lot_mng_typ);
		p.Cnd_max_hrrchy.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.max_hrrchy_META);
		p.CndPanel.add(p.Cnd_lot_mng_typ);
		p.Cnd_lot_mng_typ.setNextBeans(p.Cnd_sublot_mng_typ);
		p.Cnd_lot_mng_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.lot_mng_typ_META);
		p.CndPanel.add(p.Cnd_sublot_mng_typ);
		p.Cnd_sublot_mng_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0060.CndR.sublot_mng_typ_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_OrdRevExtInfSrch p) {
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
	protected static void jbInitRPnl(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_all.setIcon("SEARCH");
		p.RPnl_srch_all.setFunctionKey(MCFunctionKey.F13);
		p.RPnlPanel.add(p.RPnl_srch_all);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_all);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_OrdRevExtInfSrch p) {
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
	protected static void jbInitBtn(MSBCP_OrdRevExtInfSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0070.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP0070);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP0070);
		p.Btn_open_MSBCP0070.setNextBeans(p.Btn_open_MSBEP0060);
		p.Btn_open_MSBEP0060.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0060);
		p.Btn_open_MSBEP0060.setNextBeans(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setNextBeans(p.Btn_open_MSBBP1220);
		p.Btn_open_MSBBP1220.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBBP1220);
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
		MSBCP_OrdRevExtInfSrch_MC.mcInitScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitTop((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitFold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitCnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitCtrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitRPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitRslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.mcInitBtn((MSBCP_OrdRevExtInfSrch)this);

		// [SRCH_ORD]ステータスのモードの設定
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_ScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_Top((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_Fold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_Cnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_Ctrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_RPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_Rslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__ORD_Btn((MSBCP_OrdRevExtInfSrch)this);

		// [SRCH_STK]ステータスのモードの設定
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_ScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_Top((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_Fold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_Cnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_Ctrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_RPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_Rslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitSRCH__STK_Btn((MSBCP_OrdRevExtInfSrch)this);

		// [REF_ORD]ステータスのモードの設定
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_ScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_Top((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_Fold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_Cnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_Ctrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_RPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_Rslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__ORD_Btn((MSBCP_OrdRevExtInfSrch)this);

		// [REF_STK]ステータスのモードの設定
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_ScreenOpe((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_Top((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_Fold((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_Cnd((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_Ctrl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_RPnl((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_Rslt((MSBCP_OrdRevExtInfSrch)this);
		MSBCP_OrdRevExtInfSrch_MC.statusInitREF__STK_Btn((MSBCP_OrdRevExtInfSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_OrdRevExtInfSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_OrdRevExtInfSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_ORD.addAllListener(p);
		p.Cnd_ope_STK.addAllListener(p);
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_strg_loc_cd.setListListener(p);
		p.Cnd_strg_loc_cd.addAllListener(p);
		p.Cnd_strg_loc_nm.setListListener(p);
		p.Cnd_strg_loc_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_max_hrrchy.setListListener(p);
		p.Cnd_max_hrrchy.addAllListener(p);
		p.Cnd_lot_mng_typ.setListListener(p);
		p.Cnd_lot_mng_typ.addAllListener(p);
		p.Cnd_sublot_mng_typ.setListListener(p);
		p.Cnd_sublot_mng_typ.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_OrdRevExtInfSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_OrdRevExtInfSrch p) {
		p.RPnl_srch_all.addAllListener(p);
		p.RPnl_srch_all.setAPMethodName("doRPnl_srch_all");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_OrdRevExtInfSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_ord_ext_dat_typ_nm.addAllListener(p);
		p.columnRslt_ord_ext_dat_typ_nm.setListListener(p);
		p.columnRslt_ord_ext_dat_no.addAllListener(p);
		p.columnRslt_ord_ext_dat_no.setListListener(p);
		p.columnRslt_strg_dlv_cd.addAllListener(p);
		p.columnRslt_strg_dlv_cd.setListListener(p);
		p.columnRslt_strg_dlv_nm.addAllListener(p);
		p.columnRslt_strg_dlv_nm.setListListener(p);
		p.columnRslt_trd_loc_bp_cd.addAllListener(p);
		p.columnRslt_trd_loc_bp_cd.setListListener(p);
		p.columnRslt_trd_loc_bp_nm.addAllListener(p);
		p.columnRslt_trd_loc_bp_nm.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_dec_place.addAllListener(p);
		p.columnRslt_base_dec_place.setListListener(p);
		p.columnRslt_strg_schd_dt.addAllListener(p);
		p.columnRslt_strg_schd_dt.setListListener(p);
		p.columnRslt_avl_schd_dt.addAllListener(p);
		p.columnRslt_avl_schd_dt.setListListener(p);
		p.columnRslt_rqmt_no.addAllListener(p);
		p.columnRslt_rqmt_no.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_itm_ord_typ.addAllListener(p);
		p.columnRslt_itm_ord_typ.setListListener(p);
		p.columnRslt_itm_ord_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_typ_nm.setListListener(p);
		p.columnRslt_itm_ord_sts_typ.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ.setListListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.setListListener(p);
		p.columnRslt_not_fix_flg.addAllListener(p);
		p.columnRslt_blk_flg.addAllListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_oper_ptn.addAllListener(p);
		p.columnRslt_oper_ptn.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_mfg_st_schd_dt.addAllListener(p);
		p.columnRslt_mfg_st_schd_dt.setListListener(p);
		p.columnRslt_mfg_end_schd_dt.addAllListener(p);
		p.columnRslt_mfg_end_schd_dt.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_po_schd_dt.addAllListener(p);
		p.columnRslt_po_schd_dt.setListListener(p);
		p.columnRslt_accpt_schd_dt.addAllListener(p);
		p.columnRslt_accpt_schd_dt.setListListener(p);
		p.columnRslt_rqst_loc_cd.addAllListener(p);
		p.columnRslt_rqst_loc_cd.setListListener(p);
		p.columnRslt_rqst_loc_nm.addAllListener(p);
		p.columnRslt_rqst_loc_nm.setListListener(p);
		p.columnRslt_rqst_wg_cd.addAllListener(p);
		p.columnRslt_rqst_wg_cd.setListListener(p);
		p.columnRslt_rqst_wg_nm.addAllListener(p);
		p.columnRslt_rqst_wg_nm.setListListener(p);
		p.columnRslt_gi_schd_dt.addAllListener(p);
		p.columnRslt_gi_schd_dt.setListListener(p);
		p.columnRslt_insp_st_schd_dt.addAllListener(p);
		p.columnRslt_insp_st_schd_dt.setListListener(p);
		p.columnRslt_insp_end_schd_dt.addAllListener(p);
		p.columnRslt_insp_end_schd_dt.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dlv_nm.addAllListener(p);
		p.columnRslt_dlv_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_io_schd_no.addAllListener(p);
		p.columnRslt_io_schd_no.setListListener(p);
		p.columnRslt_io_schd_typ.addAllListener(p);
		p.columnRslt_io_schd_typ.setListListener(p);
		p.columnRslt_io_schd_typ_nm.addAllListener(p);
		p.columnRslt_io_schd_typ_nm.setListListener(p);
		p.columnRslt_io_schd_sts_typ.addAllListener(p);
		p.columnRslt_io_schd_sts_typ.setListListener(p);
		p.columnRslt_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRslt_io_schd_sts_typ_nm.setListListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_pack_dec_place.addAllListener(p);
		p.columnRslt_pack_dec_place.setListListener(p);
		p.columnRslt_stk_loc_cd.addAllListener(p);
		p.columnRslt_stk_loc_cd.setListListener(p);
		p.columnRslt_stk_loc_nm.addAllListener(p);
		p.columnRslt_stk_loc_nm.setListListener(p);
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
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_OrdRevExtInfSrch p) {
		p.Btn_open_MSBCP0070.addAllListener(p);
		p.Btn_open_MSBCP0070.setAPMethodName("doBtn_open_MSBCP0070");
		p.Btn_open_MSBEP0060.addAllListener(p);
		p.Btn_open_MSBEP0060.setAPMethodName("doBtn_open_MSBEP0060");
		p.Btn_open_MSBCP0080.addAllListener(p);
		p.Btn_open_MSBCP0080.setAPMethodName("doBtn_open_MSBCP0080");
		p.Btn_open_MSBBP1220.addAllListener(p);
		p.Btn_open_MSBBP1220.setAPMethodName("doBtn_open_MSBBP1220");
	}

	/**
	 * [SRCH_ORD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_ScreenOpe(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_ORD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_Top(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_ORD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_Fold(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_ORD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_Cnd(MSBCP_OrdRevExtInfSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ORD, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, SRCH_ORD, MCMode.REQUIRED);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_lot_no_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Cnd_max_hrrchy.putMode(p, SRCH_ORD, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, SRCH_ORD, MCMode.INVISIBLE);
		p.Cnd_sublot_mng_typ.putMode(p, SRCH_ORD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ORD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_Ctrl(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_ORD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_RPnl(MSBCP_OrdRevExtInfSrch p){
		p.RPnl_srch_all.putMode(p, SRCH_ORD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ORD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_Rslt(MSBCP_OrdRevExtInfSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, SRCH_ORD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH_ORD, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, SRCH_ORD, MCMode.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_blk_flg.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, SRCH_ORD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(SRCH_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_ORD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_ORD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ORD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ORD_Btn(MSBCP_OrdRevExtInfSrch p){
		p.Btn_open_MSBCP0070.putMode(p, SRCH_ORD, MCMode.DISABLE);
		p.Btn_open_MSBEP0060.putMode(p, SRCH_ORD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_ORD, MCMode.DISABLE);
		p.Btn_open_MSBBP1220.putMode(p, SRCH_ORD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_STK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_ScreenOpe(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_STK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_Top(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_STK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_Fold(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_STK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_Cnd(MSBCP_OrdRevExtInfSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_STK, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_STK, MCMode.REQUIRED);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_STK, MCMode.ENABLE);
		p.Cnd_lot_no_p_PPanel.putStatus(SRCH_STK, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.REQUIRED);
		p.Cnd_max_hrrchy.putMode(p, SRCH_STK, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, SRCH_STK, MCMode.INVISIBLE);
		p.Cnd_sublot_mng_typ.putMode(p, SRCH_STK, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_STK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_Ctrl(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [SRCH_STK]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_RPnl(MSBCP_OrdRevExtInfSrch p){
		p.RPnl_srch_all.putMode(p, SRCH_STK, MCMode.ENABLE);

	}

	/**
	 * [SRCH_STK]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_Rslt(MSBCP_OrdRevExtInfSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, SRCH_STK, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH_STK, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, SRCH_STK, MCMode.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_STK, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_blk_flg.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, SRCH_STK, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(SRCH_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_STK, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_STK, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_STK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STK_Btn(MSBCP_OrdRevExtInfSrch p){
		p.Btn_open_MSBCP0070.putMode(p, SRCH_STK, MCMode.DISABLE);
		p.Btn_open_MSBEP0060.putMode(p, SRCH_STK, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_STK, MCMode.DISABLE);
		p.Btn_open_MSBBP1220.putMode(p, SRCH_STK, MCMode.DISABLE);

	}

	/**
	 * [REF_ORD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_ScreenOpe(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_ORD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_Top(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_ORD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_Fold(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_ORD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_Cnd(MSBCP_OrdRevExtInfSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ORD, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, REF_ORD, MCMode.REQUIRED);
		p.Cnd_strg_loc_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Cnd_strg_loc_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_lot_no_p_PPanel.putStatus(REF_ORD, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Cnd_max_hrrchy.putMode(p, REF_ORD, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, REF_ORD, MCMode.INVISIBLE);
		p.Cnd_sublot_mng_typ.putMode(p, REF_ORD, MCMode.INVISIBLE);

	}

	/**
	 * [REF_ORD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_Ctrl(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_ORD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_RPnl(MSBCP_OrdRevExtInfSrch p){
		p.RPnl_srch_all.putMode(p, REF_ORD, MCMode.ENABLE);

	}

	/**
	 * [REF_ORD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_Rslt(MSBCP_OrdRevExtInfSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, REF_ORD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF_ORD, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, REF_ORD, MCMode.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.columnQty_qty.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_ORD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_blk_flg.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.columnQty_qty.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_insp_st_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, REF_ORD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(REF_ORD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_ORD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_ORD, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ORD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ORD_Btn(MSBCP_OrdRevExtInfSrch p){
		p.Btn_open_MSBCP0070.putMode(p, REF_ORD, MCMode.ENABLE);
		p.Btn_open_MSBEP0060.putMode(p, REF_ORD, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, REF_ORD, MCMode.ENABLE);
		p.Btn_open_MSBBP1220.putMode(p, REF_ORD, MCMode.ENABLE);

	}

	/**
	 * [REF_STK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_ScreenOpe(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_STK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_Top(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_STK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_Fold(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_STK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_Cnd(MSBCP_OrdRevExtInfSrch p){
		p.Cnd_ope_Group.putMode(p, REF_STK, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Cnd_strg_loc_cd.putMode(p, REF_STK, MCMode.REQUIRED);
		p.Cnd_strg_loc_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF_STK, MCMode.ENABLE);
		p.Cnd_lot_no_p_PPanel.putStatus(REF_STK, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.REQUIRED);
		p.Cnd_max_hrrchy.putMode(p, REF_STK, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, REF_STK, MCMode.INVISIBLE);
		p.Cnd_sublot_mng_typ.putMode(p, REF_STK, MCMode.INVISIBLE);

	}

	/**
	 * [REF_STK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_Ctrl(MSBCP_OrdRevExtInfSrch p){

	}

	/**
	 * [REF_STK]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_RPnl(MSBCP_OrdRevExtInfSrch p){
		p.RPnl_srch_all.putMode(p, REF_STK, MCMode.ENABLE);

	}

	/**
	 * [REF_STK]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_Rslt(MSBCP_OrdRevExtInfSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, REF_STK, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF_STK, MCMode.INVISIBLE);
		p.columnRslt_trd_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_ord_ext_dat_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_dlv_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_trd_loc_bp_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, REF_STK, MCMode.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.columnQty_qty.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_STK, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_blk_flg.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.columnQty_qty.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_insp_st_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, REF_STK, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(REF_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_loc_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_STK, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_STK, MCMode.READ_ONLY);

	}

	/**
	 * [REF_STK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__STK_Btn(MSBCP_OrdRevExtInfSrch p){
		p.Btn_open_MSBCP0070.putMode(p, REF_STK, MCMode.ENABLE);
		p.Btn_open_MSBEP0060.putMode(p, REF_STK, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, REF_STK, MCMode.ENABLE);
		p.Btn_open_MSBBP1220.putMode(p, REF_STK, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_ORD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_OrdRevExtInfSrch_MC.setTableConfigRslt((MSBCP_OrdRevExtInfSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_OrdRevExtInfSrch p) {
		p.RsltTable.addTable(p.Rslt_hrrchy_p_PPanel.HrrchyTable);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_ord_ext_dat_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.ord_ext_dat_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_ext_dat_typ_nm);
		p.columnRslt_ord_ext_dat_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.ord_ext_dat_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_ext_dat_no);
		p.columnRslt_strg_dlv_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.strg_dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_dlv_cd);
		p.columnRslt_strg_dlv_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.strg_dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_dlv_nm);
		p.columnRslt_trd_loc_bp_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.trd_loc_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_loc_bp_cd);
		p.columnRslt_trd_loc_bp_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.trd_loc_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_loc_bp_nm);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_dec_place.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.base_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dec_place);
		p.RsltTable.addTable(p.Rslt_schd_alloc_qty_p_PPanel.QtyTable);
		p.columnRslt_strg_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.strg_schd_dt_META);
		p.columnRslt_strg_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_schd_dt);
		p.columnRslt_avl_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.avl_schd_dt_META);
		p.columnRslt_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_avl_schd_dt);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.rqmt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_no);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_itm_ord_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.itm_ord_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ);
		p.columnRslt_itm_ord_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.itm_ord_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ_nm);
		p.columnRslt_itm_ord_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.itm_ord_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ);
		p.columnRslt_itm_ord_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.itm_ord_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ_nm);
		p.columnRslt_not_fix_flg.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.not_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_fix_flg);
		p.columnRslt_blk_flg.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.blk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_blk_flg);
		p.RsltTable.addTable(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_oper_ptn.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.oper_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ptn);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.RsltTable.addTable(p.Rslt_yield_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_mfg_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.mfg_st_schd_dt_META);
		p.columnRslt_mfg_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_st_schd_dt);
		p.columnRslt_mfg_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.mfg_end_schd_dt_META);
		p.columnRslt_mfg_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_end_schd_dt);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_po_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.po_schd_dt_META);
		p.columnRslt_po_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_po_schd_dt);
		p.columnRslt_accpt_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.accpt_schd_dt_META);
		p.columnRslt_accpt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_accpt_schd_dt);
		p.columnRslt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.rqst_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_cd);
		p.columnRslt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.rqst_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_nm);
		p.columnRslt_rqst_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.rqst_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_cd);
		p.columnRslt_rqst_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.rqst_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_nm);
		p.columnRslt_gi_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.gi_schd_dt_META);
		p.columnRslt_gi_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_schd_dt);
		p.columnRslt_insp_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.insp_st_schd_dt_META);
		p.columnRslt_insp_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_st_schd_dt);
		p.columnRslt_insp_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.insp_end_schd_dt_META);
		p.columnRslt_insp_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_end_schd_dt);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dlv_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_io_schd_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.io_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_no);
		p.columnRslt_io_schd_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.io_schd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_typ);
		p.columnRslt_io_schd_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.io_schd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_typ_nm);
		p.columnRslt_io_schd_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.io_schd_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sts_typ);
		p.columnRslt_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.io_schd_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sts_typ_nm);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.pack_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.columnRslt_pack_dec_place.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.pack_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_dec_place);
		p.RsltTable.addTable(p.Rslt_pack_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_stk_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.stk_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_loc_cd);
		p.columnRslt_stk_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.stk_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_loc_nm);
		p.columnRslt_in_xfr_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.in_xfr_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ);
		p.columnRslt_in_xfr_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.in_xfr_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0060.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addColumnGroup(p.Rslt_hrrchy_p_PPanel.HrrchyTable);
		p.RsltTable.addColumnGroup(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addColumnGroup(p.Rslt_schd_alloc_qty_p_PPanel.QtyTable);
		p.RsltTable.addColumnGroup(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.cgRslt_rqmt.add(p.columnRslt_rqmt_no);
		p.cgRslt_rqmt.add(p.columnRslt_strg_loc_cd);
		p.cgRslt_rqmt.add(p.columnRslt_strg_loc_nm);
		p.RsltTable.addColumnGroup(p.cgRslt_rqmt);
		p.cgRslt_ord.add(p.columnRslt_itm_ord_no);
		p.cgRslt_ord.add(p.columnRslt_itm_ord_typ);
		p.cgRslt_ord.add(p.columnRslt_itm_ord_typ_nm);
		p.cgRslt_ord.add(p.columnRslt_itm_ord_sts_typ);
		p.cgRslt_ord.add(p.columnRslt_itm_ord_sts_typ_nm);
		p.cgRslt_ord.add(p.columnRslt_not_fix_flg);
		p.cgRslt_ord.add(p.columnRslt_blk_flg);
		p.cgRslt_ord.add(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addColumnGroup(p.cgRslt_ord);
		p.cgRslt_mfg.add(p.columnRslt_mfg_loc_cd);
		p.cgRslt_mfg.add(p.columnRslt_mfg_loc_nm);
		p.cgRslt_mfg.add(p.columnRslt_oper_ptn);
		p.cgRslt_mfg.add(p.columnRslt_bom_ptn);
		p.cgRslt_mfg.add(p.Rslt_yield_schd_qty_p_PPanel.QtyTable);
		p.cgRslt_mfg.add(p.columnRslt_mfg_st_schd_dt);
		p.cgRslt_mfg.add(p.columnRslt_mfg_end_schd_dt);
		p.RsltTable.addColumnGroup(p.cgRslt_mfg);
		p.cgRslt_purc.add(p.columnRslt_sppl_cd);
		p.cgRslt_purc.add(p.columnRslt_sppl_nm);
		p.cgRslt_purc.add(p.columnRslt_maker_cd);
		p.cgRslt_purc.add(p.columnRslt_maker_nm);
		p.cgRslt_purc.add(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.cgRslt_purc.add(p.columnRslt_po_schd_dt);
		p.cgRslt_purc.add(p.columnRslt_accpt_schd_dt);
		p.RsltTable.addColumnGroup(p.cgRslt_purc);
		p.cgRslt_xfr.add(p.columnRslt_rqst_loc_cd);
		p.cgRslt_xfr.add(p.columnRslt_rqst_loc_nm);
		p.cgRslt_xfr.add(p.columnRslt_rqst_wg_cd);
		p.cgRslt_xfr.add(p.columnRslt_rqst_wg_nm);
		p.cgRslt_xfr.add(p.columnRslt_gi_schd_dt);
		p.RsltTable.addColumnGroup(p.cgRslt_xfr);
		p.cgRslt_insp.add(p.columnRslt_insp_st_schd_dt);
		p.cgRslt_insp.add(p.columnRslt_insp_end_schd_dt);
		p.RsltTable.addColumnGroup(p.cgRslt_insp);
		p.cgRslt_slo.add(p.columnRslt_slo_no);
		p.cgRslt_slo.add(p.columnRslt_slo_d_no);
		p.cgRslt_slo.add(p.columnRslt_dlv_cd);
		p.cgRslt_slo.add(p.columnRslt_dlv_nm);
		p.cgRslt_slo.add(p.columnRslt_cst_cd);
		p.cgRslt_slo.add(p.columnRslt_cst_nm);
		p.RsltTable.addColumnGroup(p.cgRslt_slo);
		p.cgRslt_io_schd_stk.add(p.columnRslt_io_schd_no);
		p.cgRslt_io_schd_stk.add(p.columnRslt_io_schd_typ);
		p.cgRslt_io_schd_stk.add(p.columnRslt_io_schd_typ_nm);
		p.cgRslt_io_schd_stk.add(p.columnRslt_io_schd_sts_typ);
		p.cgRslt_io_schd_stk.add(p.columnRslt_io_schd_sts_typ_nm);
		p.cgRslt_io_schd_stk.add(p.columnRslt_io_schd_pr_no);
		p.cgRslt_io_schd_stk.add(p.columnRslt_lot_no);
		p.cgRslt_io_schd_stk.add(p.columnRslt_sublot_no);
		p.cgRslt_io_schd_stk.add(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.cgRslt_io_schd_stk.add(p.columnRslt_pack_unit_cd);
		p.cgRslt_io_schd_stk.add(p.columnRslt_pack_unit_nm);
		p.cgRslt_io_schd_stk.add(p.columnRslt_pack_dec_place);
		p.cgRslt_io_schd_stk.add(p.Rslt_pack_unit_qty_p_PPanel.QtyTable);
		p.cgRslt_io_schd_stk.add(p.columnRslt_stk_loc_cd);
		p.cgRslt_io_schd_stk.add(p.columnRslt_stk_loc_nm);
		p.cgRslt_io_schd_stk.add(p.columnRslt_in_xfr_typ);
		p.cgRslt_io_schd_stk.add(p.columnRslt_in_xfr_typ_nm);
		p.cgRslt_io_schd_stk.add(p.columnRslt_quality_typ);
		p.cgRslt_io_schd_stk.add(p.columnRslt_quality_typ_nm);
		p.cgRslt_io_schd_stk.add(p.columnRslt_stk_insp_typ);
		p.cgRslt_io_schd_stk.add(p.columnRslt_stk_insp_typ_nm);
		p.RsltTable.addColumnGroup(p.cgRslt_io_schd_stk);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[SRCH_ORD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ORDStatus() {
		status = SRCH_ORD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_STK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_STKStatus() {
		status = SRCH_STK;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ORD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ORDStatus() {
		status = REF_ORD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_STK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_STKStatus() {
		status = REF_STK;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_ORD.equals(status)) {
			setSRCH_ORDStatus();
		}
		else if (SRCH_STK.equals(status)) {
			setSRCH_STKStatus();
		}
		else if (REF_ORD.equals(status)) {
			setREF_ORDStatus();
		}
		else if (REF_STK.equals(status)) {
			setREF_STKStatus();
		}
	}

	/**
	 * [Cnd_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
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
		else if (ap == RPnl_srch_all) doRPnl_srch_all(info);
		else if (ap == Btn_open_MSBCP0070) doBtn_open_MSBCP0070(info);
		else if (ap == Btn_open_MSBEP0060) doBtn_open_MSBEP0060(info);
		else if (ap == Btn_open_MSBCP0080) doBtn_open_MSBCP0080(info);
		else if (ap == Btn_open_MSBBP1220) doBtn_open_MSBBP1220(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0060(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1220]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1220(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_max_hrrchy) return doCnd_max_hrrchy_VC(info);
		if (vc == Cnd_lot_mng_typ) return doCnd_lot_mng_typ_VC(info);
		if (vc == Cnd_sublot_mng_typ) return doCnd_sublot_mng_typ_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_ord_ext_dat_typ_nm) return doRslt_ord_ext_dat_typ_nm_VC(info);
		if (vc == columnRslt_ord_ext_dat_no) return doRslt_ord_ext_dat_no_VC(info);
		if (vc == columnRslt_strg_dlv_cd) return doRslt_strg_dlv_cd_VC(info);
		if (vc == columnRslt_strg_dlv_nm) return doRslt_strg_dlv_nm_VC(info);
		if (vc == columnRslt_trd_loc_bp_cd) return doRslt_trd_loc_bp_cd_VC(info);
		if (vc == columnRslt_trd_loc_bp_nm) return doRslt_trd_loc_bp_nm_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_dec_place) return doRslt_base_dec_place_VC(info);
		if (vc == columnRslt_strg_schd_dt) return doRslt_strg_schd_dt_VC(info);
		if (vc == columnRslt_avl_schd_dt) return doRslt_avl_schd_dt_VC(info);
		if (vc == columnRslt_rqmt_no) return doRslt_rqmt_no_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_itm_ord_typ) return doRslt_itm_ord_typ_VC(info);
		if (vc == columnRslt_itm_ord_typ_nm) return doRslt_itm_ord_typ_nm_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ) return doRslt_itm_ord_sts_typ_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ_nm) return doRslt_itm_ord_sts_typ_nm_VC(info);
		if (vc == columnRslt_not_fix_flg) return doRslt_not_fix_flg_VC(info);
		if (vc == columnRslt_blk_flg) return doRslt_blk_flg_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_oper_ptn) return doRslt_oper_ptn_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_mfg_st_schd_dt) return doRslt_mfg_st_schd_dt_VC(info);
		if (vc == columnRslt_mfg_end_schd_dt) return doRslt_mfg_end_schd_dt_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_po_schd_dt) return doRslt_po_schd_dt_VC(info);
		if (vc == columnRslt_accpt_schd_dt) return doRslt_accpt_schd_dt_VC(info);
		if (vc == columnRslt_rqst_loc_cd) return doRslt_rqst_loc_cd_VC(info);
		if (vc == columnRslt_rqst_loc_nm) return doRslt_rqst_loc_nm_VC(info);
		if (vc == columnRslt_rqst_wg_cd) return doRslt_rqst_wg_cd_VC(info);
		if (vc == columnRslt_rqst_wg_nm) return doRslt_rqst_wg_nm_VC(info);
		if (vc == columnRslt_gi_schd_dt) return doRslt_gi_schd_dt_VC(info);
		if (vc == columnRslt_insp_st_schd_dt) return doRslt_insp_st_schd_dt_VC(info);
		if (vc == columnRslt_insp_end_schd_dt) return doRslt_insp_end_schd_dt_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dlv_nm) return doRslt_dlv_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_io_schd_no) return doRslt_io_schd_no_VC(info);
		if (vc == columnRslt_io_schd_typ) return doRslt_io_schd_typ_VC(info);
		if (vc == columnRslt_io_schd_typ_nm) return doRslt_io_schd_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_sts_typ) return doRslt_io_schd_sts_typ_VC(info);
		if (vc == columnRslt_io_schd_sts_typ_nm) return doRslt_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_pack_dec_place) return doRslt_pack_dec_place_VC(info);
		if (vc == columnRslt_stk_loc_cd) return doRslt_stk_loc_cd_VC(info);
		if (vc == columnRslt_stk_loc_nm) return doRslt_stk_loc_nm_VC(info);
		if (vc == columnRslt_in_xfr_typ) return doRslt_in_xfr_typ_VC(info);
		if (vc == columnRslt_in_xfr_typ_nm) return doRslt_in_xfr_typ_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
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
	 * [Cnd]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_max_hrrchy_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_ext_dat_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_ext_dat_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_loc_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_loc_bp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_ord_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[blk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_blk_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ptn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_end_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_loc_nm_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_max_hrrchy) doCnd_max_hrrchy_NC(info);
		else if (nc == Cnd_lot_mng_typ) doCnd_lot_mng_typ_NC(info);
		else if (nc == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_ord_ext_dat_typ_nm) doRslt_ord_ext_dat_typ_nm_NC(info);
		else if (nc == columnRslt_ord_ext_dat_no) doRslt_ord_ext_dat_no_NC(info);
		else if (nc == columnRslt_strg_dlv_cd) doRslt_strg_dlv_cd_NC(info);
		else if (nc == columnRslt_strg_dlv_nm) doRslt_strg_dlv_nm_NC(info);
		else if (nc == columnRslt_trd_loc_bp_cd) doRslt_trd_loc_bp_cd_NC(info);
		else if (nc == columnRslt_trd_loc_bp_nm) doRslt_trd_loc_bp_nm_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_dec_place) doRslt_base_dec_place_NC(info);
		else if (nc == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_NC(info);
		else if (nc == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NC(info);
		else if (nc == columnRslt_rqmt_no) doRslt_rqmt_no_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NC(info);
		else if (nc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NC(info);
		else if (nc == columnRslt_not_fix_flg) doRslt_not_fix_flg_NC(info);
		else if (nc == columnRslt_blk_flg) doRslt_blk_flg_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_oper_ptn) doRslt_oper_ptn_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NC(info);
		else if (nc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_po_schd_dt) doRslt_po_schd_dt_NC(info);
		else if (nc == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NC(info);
		else if (nc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NC(info);
		else if (nc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NC(info);
		else if (nc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NC(info);
		else if (nc == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_NC(info);
		else if (nc == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_NC(info);
		else if (nc == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dlv_nm) doRslt_dlv_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_io_schd_no) doRslt_io_schd_no_NC(info);
		else if (nc == columnRslt_io_schd_typ) doRslt_io_schd_typ_NC(info);
		else if (nc == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NC(info);
		else if (nc == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_pack_dec_place) doRslt_pack_dec_place_NC(info);
		else if (nc == columnRslt_stk_loc_cd) doRslt_stk_loc_cd_NC(info);
		else if (nc == columnRslt_stk_loc_nm) doRslt_stk_loc_nm_NC(info);
		else if (nc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NC(info);
		else if (nc == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
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
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[blk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_blk_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_nm_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_max_hrrchy) doCnd_max_hrrchy_NE(info);
		else if (ne == Cnd_lot_mng_typ) doCnd_lot_mng_typ_NE(info);
		else if (ne == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_ord_ext_dat_typ_nm) doRslt_ord_ext_dat_typ_nm_NE(info);
		else if (ne == columnRslt_ord_ext_dat_no) doRslt_ord_ext_dat_no_NE(info);
		else if (ne == columnRslt_strg_dlv_cd) doRslt_strg_dlv_cd_NE(info);
		else if (ne == columnRslt_strg_dlv_nm) doRslt_strg_dlv_nm_NE(info);
		else if (ne == columnRslt_trd_loc_bp_cd) doRslt_trd_loc_bp_cd_NE(info);
		else if (ne == columnRslt_trd_loc_bp_nm) doRslt_trd_loc_bp_nm_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_dec_place) doRslt_base_dec_place_NE(info);
		else if (ne == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_NE(info);
		else if (ne == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NE(info);
		else if (ne == columnRslt_rqmt_no) doRslt_rqmt_no_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NE(info);
		else if (ne == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NE(info);
		else if (ne == columnRslt_not_fix_flg) doRslt_not_fix_flg_NE(info);
		else if (ne == columnRslt_blk_flg) doRslt_blk_flg_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_oper_ptn) doRslt_oper_ptn_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NE(info);
		else if (ne == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_po_schd_dt) doRslt_po_schd_dt_NE(info);
		else if (ne == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NE(info);
		else if (ne == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NE(info);
		else if (ne == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NE(info);
		else if (ne == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NE(info);
		else if (ne == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_NE(info);
		else if (ne == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_NE(info);
		else if (ne == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dlv_nm) doRslt_dlv_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_io_schd_no) doRslt_io_schd_no_NE(info);
		else if (ne == columnRslt_io_schd_typ) doRslt_io_schd_typ_NE(info);
		else if (ne == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NE(info);
		else if (ne == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_pack_dec_place) doRslt_pack_dec_place_NE(info);
		else if (ne == columnRslt_stk_loc_cd) doRslt_stk_loc_cd_NE(info);
		else if (ne == columnRslt_stk_loc_nm) doRslt_stk_loc_nm_NE(info);
		else if (ne == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NE(info);
		else if (ne == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
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
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[blk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_blk_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_nm_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_max_hrrchy) doCnd_max_hrrchy_NX(info);
		else if (nx == Cnd_lot_mng_typ) doCnd_lot_mng_typ_NX(info);
		else if (nx == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_ord_ext_dat_typ_nm) doRslt_ord_ext_dat_typ_nm_NX(info);
		else if (nx == columnRslt_ord_ext_dat_no) doRslt_ord_ext_dat_no_NX(info);
		else if (nx == columnRslt_strg_dlv_cd) doRslt_strg_dlv_cd_NX(info);
		else if (nx == columnRslt_strg_dlv_nm) doRslt_strg_dlv_nm_NX(info);
		else if (nx == columnRslt_trd_loc_bp_cd) doRslt_trd_loc_bp_cd_NX(info);
		else if (nx == columnRslt_trd_loc_bp_nm) doRslt_trd_loc_bp_nm_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_dec_place) doRslt_base_dec_place_NX(info);
		else if (nx == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_NX(info);
		else if (nx == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NX(info);
		else if (nx == columnRslt_rqmt_no) doRslt_rqmt_no_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NX(info);
		else if (nx == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NX(info);
		else if (nx == columnRslt_not_fix_flg) doRslt_not_fix_flg_NX(info);
		else if (nx == columnRslt_blk_flg) doRslt_blk_flg_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_oper_ptn) doRslt_oper_ptn_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NX(info);
		else if (nx == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_po_schd_dt) doRslt_po_schd_dt_NX(info);
		else if (nx == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NX(info);
		else if (nx == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NX(info);
		else if (nx == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NX(info);
		else if (nx == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NX(info);
		else if (nx == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_NX(info);
		else if (nx == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_NX(info);
		else if (nx == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dlv_nm) doRslt_dlv_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_io_schd_no) doRslt_io_schd_no_NX(info);
		else if (nx == columnRslt_io_schd_typ) doRslt_io_schd_typ_NX(info);
		else if (nx == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NX(info);
		else if (nx == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_pack_dec_place) doRslt_pack_dec_place_NX(info);
		else if (nx == columnRslt_stk_loc_cd) doRslt_stk_loc_cd_NX(info);
		else if (nx == columnRslt_stk_loc_nm) doRslt_stk_loc_nm_NX(info);
		else if (nx == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NX(info);
		else if (nx == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
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
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[blk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_blk_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_nm_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == Cnd_max_hrrchy) doCnd_max_hrrchy_LC(info);
		else if (lc == Cnd_lot_mng_typ) doCnd_lot_mng_typ_LC(info);
		else if (lc == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_ord_ext_dat_typ_nm) doRslt_ord_ext_dat_typ_nm_LC(info);
		else if (lc == columnRslt_ord_ext_dat_no) doRslt_ord_ext_dat_no_LC(info);
		else if (lc == columnRslt_strg_dlv_cd) doRslt_strg_dlv_cd_LC(info);
		else if (lc == columnRslt_strg_dlv_nm) doRslt_strg_dlv_nm_LC(info);
		else if (lc == columnRslt_trd_loc_bp_cd) doRslt_trd_loc_bp_cd_LC(info);
		else if (lc == columnRslt_trd_loc_bp_nm) doRslt_trd_loc_bp_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_dec_place) doRslt_base_dec_place_LC(info);
		else if (lc == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_LC(info);
		else if (lc == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_LC(info);
		else if (lc == columnRslt_rqmt_no) doRslt_rqmt_no_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_LC(info);
		else if (lc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_oper_ptn) doRslt_oper_ptn_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_LC(info);
		else if (lc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_po_schd_dt) doRslt_po_schd_dt_LC(info);
		else if (lc == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_LC(info);
		else if (lc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_LC(info);
		else if (lc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_LC(info);
		else if (lc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_LC(info);
		else if (lc == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_LC(info);
		else if (lc == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_LC(info);
		else if (lc == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dlv_nm) doRslt_dlv_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_io_schd_no) doRslt_io_schd_no_LC(info);
		else if (lc == columnRslt_io_schd_typ) doRslt_io_schd_typ_LC(info);
		else if (lc == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_LC(info);
		else if (lc == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_pack_dec_place) doRslt_pack_dec_place_LC(info);
		else if (lc == columnRslt_stk_loc_cd) doRslt_stk_loc_cd_LC(info);
		else if (lc == columnRslt_stk_loc_nm) doRslt_stk_loc_nm_LC(info);
		else if (lc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_LC(info);
		else if (lc == columnRslt_in_xfr_typ_nm) doRslt_in_xfr_typ_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_ext_dat_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_ext_dat_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_loc_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_loc_bp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_loc_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_strg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0060.Srch01")) {
			return new MS_MSBCL0060_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0060_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0060_Srch01Bridge() {
			p_MS_MSBCL0060_Srch01 = new MCParam(PDef.MS_MSBCL0060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0060.RsltR.class));

			p_MS_MSBCL0060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0060.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0060.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0060.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0060.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0060_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0060.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0060_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0060.RsltR>)p_MS_MSBCL0060_Srch01.getContainerParam().getDownBlock(0));
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